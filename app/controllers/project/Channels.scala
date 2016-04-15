package controllers.project

import javax.inject.Inject

import controllers.BaseController
import controllers.project.routes.{Channels => self}
import models.project.{Channel, Project}
import ore.permission.EditChannels
import play.api.i18n.MessagesApi
import play.api.libs.ws.WSClient
import util.Forms
import views.{html => views}

/**
  * Controller for handling Channel related actions.
  */
class Channels @Inject()(override val messagesApi: MessagesApi, ws: WSClient) extends BaseController(ws) {

  private def ChannelEditAction(author: String, slug: String) = {
    AuthedProjectAction(author, slug) andThen ProjectPermissionAction(EditChannels)
  }

  /**
    * Displays a view of the specified Project's Channels.
    *
    * @param author Project owner
    * @param slug   Project slug
    * @return View of channels
    */
  def showList(author: String, slug: String) = {
    ChannelEditAction(author, slug) { implicit request =>
      val project = request.project
      Ok(views.projects.channels.list(project, project.channels.seq))
    }
  }

  /**
    * Creates a submitted channel for the specified Project.
    *
    * @param author Project owner
    * @param slug   Project slug
    * @return Redirect to view of channels
    */
  def create(author: String, slug: String) = {
    ChannelEditAction(author, slug) { implicit request =>
      val project = request.project
      val channels = project.channels.values
      if (channels.size > Project.MaxChannels) {
        // Maximum reached
        Redirect(self.showList(author, slug))
          .flashing("error" -> "A project may only have up to five channels.")
      } else {
        val form = Forms.ChannelEdit.bindFromRequest.get
        val channelName = form._1.trim
        if (!Channel.isValidName(channelName)) {
          Redirect(self.showList(author, slug))
            .flashing("error" -> "Channel names must be between 1 and 15 and be alphanumeric.")
        } else {
          // Find submitted color
          Channel.Colors.find(c => c.hex.equalsIgnoreCase(form._2)) match {
            case None => BadRequest("Invalid channel color.")
            case Some(color) => channels.find(c => c.color.equals(color)) match {
              case None => channels.find(c => c.name.equalsIgnoreCase(channelName)) match {
                case None =>
                  project.newChannel(channelName, color).get
                  Redirect(self.showList(author, slug))
                case Some(channel) =>
                  // Channel name taken
                  Redirect(self.showList(author, slug))
                    .flashing("error" -> "A channel with that name already exists.")
              }
              case Some(channel) =>
                // Channel color taken
                Redirect(self.showList(author, slug))
                  .flashing("error" -> "A channel with that color already exists.")
            }
          }
        }
      }
    }
  }

  /**
    * Submits changes to an existing channel.
    *
    * @param author      Project owner
    * @param slug        Project slug
    * @param channelName Channel name
    * @return View of channels
    */
  def edit(author: String, slug: String, channelName: String) = {
    ChannelEditAction(author, slug) { implicit request =>
      // Get all channels
      implicit val project = request.project
      val form = Forms.ChannelEdit.bindFromRequest.get
      val newName = form._1.trim
      if (!Channel.isValidName(newName)) {
        Redirect(self.showList(author, slug))
          .flashing("error" -> "Channel names must be between 1 and 15 and be alphanumeric.")
      } else {
        // Find submitted channel by old name
        val channels = request.project.channels.values
        channels.find(c => c.name.equals(channelName)) match {
          case None => NotFound("Channel not found.")
          case Some(channel) => Channel.Colors.find(c => c.hex.equalsIgnoreCase(form._2)) match {
            case None => BadRequest("Invalid channel color.")
            case Some(color) =>
              // Check if color is taken by different channel
              val colorChan = channels.find(c => c.color.equals(color))
              val colorTaken = colorChan.isDefined && !colorChan.get.equals(channel)

              // Check if name taken by different channel
              val nameChan = channels.find(c => c.name.equals(newName))
              val nameTaken = nameChan.isDefined && !nameChan.get.equals(channel)

              if (colorTaken) {
                Redirect(self.showList(author, slug))
                  .flashing("error" -> "A channel with that color already exists.")
              } else if (nameTaken) {
                Redirect(self.showList(author, slug))
                  .flashing("error" -> "A channel with that name already exists.")
              } else {
                // Change name if different
                if (!channelName.equals(newName)) {
                  channel.name = newName
                }

                // Change color if different
                if (!channel.color.equals(color)) {
                  channel.color = color
                }

                Redirect(self.showList(author, slug))
              }
          }
        }
      }
    }
  }

  /**
    * Irreversibly deletes the specified channel and all version associated
    * with it.
    *
    * @param author      Project owner
    * @param slug        Project slug
    * @param channelName Channel name
    * @return View of channels
    */
  def delete(author: String, slug: String, channelName: String) = {
    ChannelEditAction(author, slug) { implicit request =>
      val project = request.project
      val channels = project.channels.values
      if (channels.size == 1) {
        Redirect(self.showList(author, slug))
          .flashing("error" -> "You cannot delete your only channel.")
      } else {
        channels.find(c => c.name.equals(channelName)) match {
          case None => NotFound
          case Some(channel) =>
            if (channel.versions.nonEmpty && channels.count(c => c.versions.nonEmpty) == 1) {
              Redirect(self.showList(author, slug))
                .flashing("error" -> "You cannot delete your only non-empty channel.")
            } else {
              channel.delete(project).get
              Redirect(self.showList(author, slug))
            }
        }
      }
    }
  }

}
