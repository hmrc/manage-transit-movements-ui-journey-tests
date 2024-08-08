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

package uk.gov.hmrc.test.ui.pages.Departures.Transport.TransportEquipmentCharges

import uk.gov.hmrc.test.ui.pages.RadioPage

object MethodOfPaymentPage extends RadioPage {

  override def title(args: String*): String = "Which method of payment do you want to use for transport charges? - Departure declarations"

  override def select(answer: String): this.type = {
    val methodOfPayment = answer match {
      case "Cash"                        => "A"
      case "Credit card"                 => "B"
      case "Cheque"                      => "C"
      case "Electronic credit transfer"  => "H"
      case "Account holder with carrier" => "Y"
      case "Not pre-paid"                => "Z"
      case "Other"                       => "D"
    }
    clickRadioBtn(methodOfPayment)
    this
  }
}
