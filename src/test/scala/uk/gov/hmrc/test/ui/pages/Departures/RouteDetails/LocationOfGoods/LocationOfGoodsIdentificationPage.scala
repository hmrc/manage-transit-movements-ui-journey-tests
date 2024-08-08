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

package uk.gov.hmrc.test.ui.pages.Departures.RouteDetails.LocationOfGoods

import uk.gov.hmrc.test.ui.pages.RadioPage

object LocationOfGoodsIdentificationPage extends RadioPage {

  override def title(args: String*): String = "How do you want to identify the location of goods? - Departure declarations"

  override def select(answer: String): this.type = {
    val value = answer match {
      case "Customs office identifier" => "V"
      case "EORI number"               => "X"
      case "GPS coordinates"           => "W"
      case "UN/LOCODE"                 => "U"
      case "Address"                   => "Z"
      case "Postal code"               => "T"
    }
    clickRadioBtn(value)
    this
  }
}
