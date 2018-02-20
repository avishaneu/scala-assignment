package com.avishaneu.scala.assignment

class Config(params: Map[String, String]) {
  private val frequencyParamName = "--frequency"
  private val typeParamName = "--type"
  private val locationParamName = "--location"

  var periodSeconds: Option[Int] = Option.empty
  var checkType: Option[String] = Option.empty
  var location: Option[String] = Option.empty


  if (params.get(frequencyParamName).isDefined) {
    try {
      periodSeconds = Option.apply(params(frequencyParamName).toInt)
    } catch {
      case e: NumberFormatException => println("Unable to convert " + params(frequencyParamName) + " to int")
    }
  }

  if (params.get(typeParamName).isDefined) {
    checkType = Option.apply(params(typeParamName))
  }

  if (params.get(locationParamName).isDefined) {
    location = Option.apply(params(locationParamName))
  }
}
