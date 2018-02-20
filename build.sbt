name := "health-check-agent"

version := "1.0"

scalaVersion := "2.12.4"

mainClass in assembly := Some("com.avishaneu.scala.assignment.Application")
assemblyJarName in assembly := "agent.jar"

libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.4" % Test