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
    answer match {
      case "Payment in cash"             => clickById("value")
      case "Payment by credit card"      => clickById("value_1")
      case "Payment by cheque"           => clickById("value_2")
      case "Electronic credit transfer"  => clickById("value_3")
      case "Account holder with carrier" => clickById("value_4")
      case "Not pre-paid"                => clickById("value_5")
      case "Other"                       => clickById("value_6")
    }
    this
  }
}
