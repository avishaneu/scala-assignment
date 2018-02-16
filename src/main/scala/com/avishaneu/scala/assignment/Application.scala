package com.avishaneu.scala.assignment

import com.avishaneu.scala.assignment.agent.Agent

object Application extends App {
  val config = new Config(readNextParam(Map(), args.toList))
  new Agent(config).start()

  def readNextParam(parsed: Map[String, String], paramList: List[String]): Map[String, String] = {
    paramList match {
      case paramName :: paramValue :: paramsTail =>
        readNextParam(parsed ++ Map(paramName -> paramValue), paramsTail)
      case Nil => parsed
    }
  }
}