name := "sbt-test"

version := "0.1"

scalaVersion := "2.13.2"

libraryDependencies += "org.typelevel" %% "cats-effect" % "2.1.2"

addCompilerPlugin("org.augustjune" %% "context-applied" % "0.1.3")