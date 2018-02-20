package com.avishaneu.scala.assignment.agent.checker

import java.io.File

class FileChecker(val location: String) extends Checker {
  override def check: CheckResult = {
    if (new File(location).exists) {
      Healthy("File exists")
    } else {
      Unhealthy("File not found")
    }
  }
}
