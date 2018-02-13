package com.avishaneu.scala.assignment.agent.checker


trait Checker {
  def check: Boolean
}

object Checker {
  val locationParamName = "--location"

  def getImplementation(name: String, params: Map[String, String]): Checker = name match {
      case "fileCheck" =>
        if (params.get(locationParamName).isEmpty)
          throw new IllegalArgumentException("FileCheck requires file location to be specified")
        new FileChecker(params(locationParamName))
      case "healthCheck" => new HealthChecker
      case _ => throw new IllegalArgumentException("No checker with name " + name + " found")
    }
}
