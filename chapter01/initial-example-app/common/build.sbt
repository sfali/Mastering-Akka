name := "initial-example-common"

 
libraryDependencies ++= {
  val akkaV = "2.5.8"
  val slickV = "3.2.1"
  Seq(
    "com.typesafe.akka" %% "akka-actor" % akkaV,
    "com.typesafe.akka" %% "akka-testkit" % akkaV,
    "com.typesafe.akka" %% "akka-slf4j" % akkaV,
    "ch.qos.logback" % "logback-classic" % "1.0.9",
    "com.typesafe.slick" %% "slick" % slickV,
    "com.typesafe.slick" %% "slick-hikaricp" % slickV,
    "net.databinder" %% "unfiltered-filter" % "0.8.4",
    "net.databinder" %% "unfiltered-netty" % "0.8.4",
    "net.databinder" %% "unfiltered-netty-server" % "0.8.4",
    "net.databinder" %% "unfiltered-json4s" % "0.8.4",
    "org.json4s" %% "json4s-ext" % "3.2.9",
    "org.postgresql" % "postgresql" % "42.1.4",
    "net.databinder.dispatch" %% "dispatch-core" % "0.11.2"
  )
}