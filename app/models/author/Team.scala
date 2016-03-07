package models.author

/**
  * Represents a collection of developers who work on a project.
  *
  * @param name    Name of team
  * @param members Developers on team
  */
case class Team(override val name: String, owner: Dev, members: List[Dev]) extends Author {

  def this(name: String, owner: Dev) = this(name, owner, List(owner))

}

/**
  * Team data-store
  */
object Team {

  // TODO: Replace with DB
  val teams = Set[Team](
    new Team("SpongePowered", Dev.get("Spongie").get)
  )

  /**
    * Returns the Team with the specified name.
    *
    * @param name Team name
    * @return Team if exists, None otherwise
    */
  def get(name: String): Option[Team] = teams.find(team => team.name.equals(name))

}
