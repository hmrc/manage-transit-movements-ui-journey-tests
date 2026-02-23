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

package uk.gov.hmrc.test.ui.pages.Departures.Items

import uk.gov.hmrc.test.ui.pages.RadioPage

object ItemTransportChargesPage extends RadioPage {

  override def title(args: String*): String = "Which method of payment do you want to use for transport charges?"

  override def select(answer: String): this.type = {
    val value = answer match {
      case "Payment in cash"             => "A"
      case "Payment by credit card"      => "B"
      case "Payment by cheque"           => "C"
      case "Electronic credit transfer"  => "H"
      case "Account holder with carrier" => "Y"
      case "Not pre-paid"                => "Z"
      case "Other"                       => "D"
    }
    clickRadioBtn(value)
    this
  }
}
