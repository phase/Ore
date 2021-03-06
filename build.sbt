name := "ore"

version := "1.4.1"

lazy val `ore` = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.7"

libraryDependencies ++= Seq(cache, ws, filters, specs2 % Test)

unmanagedResourceDirectories in Test <+=  baseDirectory (_ /"target/web/public/test")

resolvers += "scalaz-bintray" at "https://dl.bintray.com/scalaz/releases"

routesGenerator := InjectedRoutesGenerator

// Additional dependencies
resolvers ++= Seq(
  "sponge" at "https://repo.spongepowered.org/maven"
)

libraryDependencies ++= Seq(
  "org.spongepowered"     %   "play-discourse"          %   "1.0.0-SNAPSHOT",
  "org.spongepowered"     %   "plugin-meta"             %   "0.4.1",
  "com.typesafe.play"     %%  "play-slick"              %   "2.0.2",
  "com.typesafe.play"     %%  "play-slick-evolutions"   %   "2.0.2",
  "org.postgresql"        %   "postgresql"              %   "9.4.1212.jre7",
  "com.github.tminglei"   %%  "slick-pg"                %   "0.12.0",
  "com.getsentry.raven"   %   "raven-logback"           %   "7.2.2",
  "org.bouncycastle"      %   "bcprov-jdk15on"          %   "1.56",
  "org.bouncycastle"      %   "bcpkix-jdk15on"          %   "1.56",
  "org.bouncycastle"      %   "bcpg-jdk15on"            %   "1.56",
  "javax.mail"            %   "mail"                    %   "1.4.7",
  "com.github.hazendaz"   %   "htmlcompressor"          %   "1.6.4",

  "com.vladsch.flexmark"  % "flexmark"                       %  "0.18.2",
  "com.vladsch.flexmark"  % "flexmark-ext-autolink"          %  "0.18.2",
  "com.vladsch.flexmark"  % "flexmark-ext-anchorlink"        %  "0.18.2",
  "com.vladsch.flexmark"  % "flexmark-ext-gfm-strikethrough" %  "0.18.2",
  "com.vladsch.flexmark"  % "flexmark-ext-gfm-tasklist"      %  "0.18.2",
  "com.vladsch.flexmark"  % "flexmark-ext-tables"            %  "0.18.2",
  "com.vladsch.flexmark"  % "flexmark-ext-typographic"       %  "0.18.2",

  "org.webjars"       % "jquery"       % "2.2.4",
  "org.webjars"       % "font-awesome" % "4.7.0",
  "org.webjars.bower" % "filesize"     % "3.2.1",
  "org.webjars.bower" % "sw-toolbox"   % "3.6.1"
)
