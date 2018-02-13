package com.avishaneu.scala.assignment.agent

import com.avishaneu.scala.assignment.agent.checker.Checker


class Agent(params: Map[String, String]) {

  val frequencyParamName = "--frequency"
  val typeParamName = "--type"

  if (params.get(frequencyParamName).isEmpty)
    throw new IllegalArgumentException("Parameter " + frequencyParamName + " has to be specified")
  private val periodSeconds = params(frequencyParamName).toInt

  if (params.get(typeParamName).isEmpty)
    throw new IllegalArgumentException("Parameter " + typeParamName + " has to be specified")
  private val checker = Checker.getImplementation(params(typeParamName), params)


  def start(): Unit = while (true) {
    if (checker.check) println("healthy")
    else println("unhealthy")
    Thread.sleep(periodSeconds * 1000)
  }
}