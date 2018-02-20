package com.avishaneu.scala.assignment.agent.checker

sealed abstract class CheckResult(message: String){
  def printResult(): Unit = {
    println(getResultMessage + (if (message != null) " (" + message + ")"))
  }
  def getResultMessage: String
}

case class Healthy(message: String = null) extends CheckResult(message){
  override def getResultMessage: String = "healthy"
}

case class Unhealthy(message: String = null) extends CheckResult(message){
  override def getResultMessage: String = "unhealthy"
}

