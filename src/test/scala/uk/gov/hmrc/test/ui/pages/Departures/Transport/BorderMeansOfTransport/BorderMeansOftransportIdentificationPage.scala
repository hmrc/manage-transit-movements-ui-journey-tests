/*
 * Copyright 2023 HM Revenue & Customs
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package uk.gov.hmrc.test.ui.pages.Departures.Transport.BorderMeansOfTransport

import uk.gov.hmrc.test.ui.pages.RadioPage

object BorderMeansOftransportIdentificationPage extends RadioPage {

  override def title(args: String*): String = "Which identification do you want to use for this vehicle?"

  override def select(answer: String): this.type = {
    val vehicleIdentyCSSValue = answer match {

      case "IMO ship identification number"        => "imoShipIdNumber"
      case "Name of a sea-going vessel"            => "seaGoingVessel"
      case "Train number"                          => "trainNumber"
      case "Registration number of the road vehicle" => "regNumberRoadVehicle"
      case "IATA flight number"                    => "iataFlightNumber"
      case "registration number of the aircraft"    => "regNumberAircraft"
      case "European"                              => "europeanVesselIdNumber"
      case "Name of an inland waterways vehicle"   => "inlandWaterwaysVehicle"

    }
    clickRadioBtn(vehicleIdentyCSSValue)
    this
  }
}