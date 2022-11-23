package uk.gov.hmrc.test.ui.pages.Arrival.IncidentTransportMeans

import uk.gov.hmrc.test.ui.pages.RadioPage

object ReplacementTransportTypePage extends RadioPage {

  override def title(args: String*): String = "Which identification do you want to use for the replacement means of transport?"

  override def select(answer: String): this.type = {
    answer match {
      case "Name of a sea-going vessel" => clickById("value")
      case "IATA flight number" => clickById("value_1")
      case "Name of an inland waterways vehicle" => clickById("value_2")
      case "IMO ship identification number" => clickById("value_3")
      case "Wagon number" => clickById("value_4")
      case "Train number" => clickById("value_5")
      case "Registration number of a road vehicle" => clickById("value_6")
      case "Registration number of a road trailer" => clickById("value_7")
      case "Registration number of an aircraft" => clickById("value_8")
      case "European vessel identification number (ENI code)" => clickById("value_9")
      case "Unknown - this can only be used during the transitional period" => clickById("value_10")
    }
    this
  }
}
