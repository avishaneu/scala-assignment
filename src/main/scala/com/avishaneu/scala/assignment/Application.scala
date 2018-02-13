package com.avishaneu.scala.assignment

import com.avishaneu.scala.assignment.agent.Agent

object Application extends App {
  val params = readNextParam(Map(), args.toList)
  new Agent(params).start()

  def readNextParam(parsed: Map[String, String], paramList: List[String]): Map[String, String] = {
    paramList match {
      case paramName :: paramValue :: paramsTail =>
        readNextParam(parsed ++ Map(paramName -> paramValue), paramsTail)
      case Nil => parsed
    }
  }
}