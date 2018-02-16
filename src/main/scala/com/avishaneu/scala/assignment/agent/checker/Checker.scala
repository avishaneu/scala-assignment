package com.avishaneu.scala.assignment.agent.checker

import com.avishaneu.scala.assignment.Config


trait Checker {
  def check: CheckResult
}

object Checker {
  def getImplementation(config: Config): Checker = {

    if (config.checkType.isEmpty)
      throw new IllegalArgumentException("Check type has to be specified")

    config.checkType.get match {
      case "fileCheck" =>
        if (config.location.isEmpty)
          throw new IllegalArgumentException("FileCheck requires file location to be specified")
        new FileChecker(config.location.get)
      case "healthCheck" => new HealthChecker
      case _ => throw new IllegalArgumentException("No checker with name " + config.checkType.get + " found")
    }
  }
}
