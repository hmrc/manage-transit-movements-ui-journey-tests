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

package uk.gov.hmrc.test.ui.pages.Departures.Transport.InlandModeOfTransport

import uk.gov.hmrc.test.ui.pages.RadioPage

object TransportIdentificationPage extends RadioPage {

  override def title(args: String*): String = "Which identification do you want to use for this vehicle?"

  override def select(answer: String): this.type = {
    val vehicleIdentyCSSValue = answer match {

      case "IMO ship identification number"        => "10"
      case "Name of a sea-going vessel"            => "11"
      case "Wagon number"                          => "20"
      case "Train number"                          => "21"
      case "Registration number of a road vehicle" => "30"
      case "Registration number of a road trailer" => "31"
      case "IATA flight number"                    => "40"
      case "Registration number of an aircraft"    => "41"
      case "European"                              => "80"
      case "Name of an inland waterways vehicle"   => "81"
      case "Unknown"                               => "99"

    }
    clickRadioBtn(vehicleIdentyCSSValue)
    this
  }
}
