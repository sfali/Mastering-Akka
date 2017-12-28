name := "chapter3-bookstore-common-complete"

libraryDependencies ++= { 
    val akkaVersion = "2.5.8"
    val slickVersion = "3.2.1"
    val hikariCPVersion = "2.7.4"
    val nettyV = "0.8.4"
    Seq(
    "com.typesafe.akka" %% "akka-actor" % akkaVersion,
    "com.typesafe.akka" %% "akka-slf4j" % akkaVersion,
    "ch.qos.logback" % "logback-classic" % "1.1.3",
    "com.typesafe.slick" %% "slick" % slickVersion,
    "com.typesafe.slick" %% "slick-hikaricp" % slickVersion exclude("com.zaxxer", "HikariCP-java6"),
    "com.zaxxer" % "HikariCP" % hikariCPVersion,
    "net.databinder" %% "unfiltered-filter" % nettyV,
    "net.databinder" %% "unfiltered-netty" % nettyV,
    "net.databinder" %% "unfiltered-netty-server" % nettyV,
    "net.databinder" %% "unfiltered-json4s" % nettyV,
    "org.json4s" %% "json4s-ext" % "3.2.9",
    "org.postgresql" % "postgresql" % "42.1.4",
    "net.databinder.dispatch" %% "dispatch-core" % "0.11.2",
    "com.typesafe.akka" %% "akka-testkit" % akkaVersion % Test
  )
}