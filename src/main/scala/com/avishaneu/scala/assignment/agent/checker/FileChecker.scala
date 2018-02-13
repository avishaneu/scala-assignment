package com.avishaneu.scala.assignment.agent.checker

import java.io.File

class FileChecker(val location:String) extends Checker {
  override def check: Boolean = new File(location).exists
}
