name := "chapter4-bookstore-common-complete"

libraryDependencies ++= {
  val akkaVersion = "2.5.8"
  val slickVersion = "3.2.1"
  val hikariCPVersion = "2.7.4"
  val nettyV = "0.8.4"
  Seq(
    "com.typesafe.akka"       %% "akka-actor"                 % akkaVersion,
    "com.typesafe.akka"       %% "akka-slf4j"                 % akkaVersion,
    "ch.qos.logback"          % "logback-classic"             % "1.1.7",
    "com.typesafe.akka"       %% "akka-persistence-cassandra" % "0.59" excludeAll (ExclusionRule("io.netty")),
    "com.typesafe.akka"       %% "akka-persistence"           % akkaVersion excludeAll (ExclusionRule("io.netty")),
    "com.typesafe.slick"      %% "slick"                      % slickVersion,
    "com.typesafe.slick"      %% "slick-hikaricp"             % slickVersion exclude ("com.zaxxer", "HikariCP-java6"),
    "com.zaxxer"              % "HikariCP"                    % hikariCPVersion,
    "org.postgresql"          % "postgresql"                  % "9.4.1208.jre7",
    "ch.qos.logback"          % "logback-classic"             % "1.0.9",
    "net.databinder"          %% "unfiltered-filter"          % nettyV,
    "net.databinder"          %% "unfiltered-netty"           % nettyV,
    "net.databinder"          %% "unfiltered-netty-server"    % nettyV,
    "net.databinder"          %% "unfiltered-json4s"          % nettyV,
    "org.json4s"              %% "json4s-ext"                 % "3.2.9",
    "net.databinder.dispatch" %% "dispatch-core"              % "0.11.2",
    "com.google.protobuf"     % "protobuf-java"               % "2.5.0",
    "com.typesafe.akka"       %% "akka-testkit"               % akkaVersion % Test
  )
}
