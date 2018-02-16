package com.avishaneu.scala.assignment.agent

import com.avishaneu.scala.assignment.Config
import com.avishaneu.scala.assignment.agent.checker.Checker


class Agent(config: Config) {

  if (config.periodSeconds.isEmpty)
    throw new IllegalArgumentException("Frequency should be specified")
  private val periodSeconds = config.periodSeconds.get

  private val checker = Checker.getImplementation(config)


  def start(): Unit = while (true) {
    checker.check.printResult()
    Thread.sleep(periodSeconds * 1000)
  }
}