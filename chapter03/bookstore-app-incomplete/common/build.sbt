name := "chapter3-bookstore-common-incomplete"

libraryDependencies ++= {
  val akkaV = "2.5.8"
  val slickV = "3.2.1"
  val nettyV = "0.8.4"
  Seq(
    "com.typesafe.akka"       %% "akka-actor"              % akkaV,
    "com.typesafe.akka"       %% "akka-testkit"            % akkaV,
    "com.typesafe.akka"       %% "akka-slf4j"              % akkaV,
    "ch.qos.logback"          % "logback-classic"          % "1.0.9",
    "com.typesafe.slick"      %% "slick"                   % slickV,
    "com.typesafe.slick"      %% "slick-hikaricp"          % slickV,
    "net.databinder"          %% "unfiltered-filter"       % nettyV,
    "net.databinder"          %% "unfiltered-netty"        % nettyV,
    "net.databinder"          %% "unfiltered-netty-server" % nettyV,
    "net.databinder"          %% "unfiltered-json4s"       % nettyV,
    "org.json4s"              %% "json4s-ext"              % "3.2.9",
    "org.postgresql"          % "postgresql"               % "42.1.4",
    "net.databinder.dispatch" %% "dispatch-core"           % "0.11.2"
  )
}
