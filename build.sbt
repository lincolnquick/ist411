ThisBuild / scalaVersion := "2.13.11"

ThisBuild / version := "1.0-SNAPSHOT"

lazy val root = (project in file("."))
  .enablePlugins(PlayJava)
  .settings(
    name := """mediconnect""",
    libraryDependencies ++= Seq(
      guice
    )
  )