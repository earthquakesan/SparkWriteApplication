import Dependencies._

lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      organization := "org.ermilov",
      scalaVersion := "2.11.12",
      version      := "1.0.0-SNAPSHOT"
    )),
    name := "SparkWriteApplication",
    libraryDependencies += scalaTest % Test,
    libraryDependencies += spark,
    mainClass in assembly := Some("org.ermilov.SparkWriteApplication"),
    test in assembly := {}
  )

assemblyMergeStrategy in assembly := {
  case PathList("META-INF", xs @ _*) => MergeStrategy.discard
  case x => MergeStrategy.first
}
