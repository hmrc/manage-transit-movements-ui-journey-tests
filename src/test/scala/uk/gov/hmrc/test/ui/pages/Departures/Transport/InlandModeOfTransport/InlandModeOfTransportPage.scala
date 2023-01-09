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

object InlandModeOfTransportPage extends RadioPage {

  override def title(args: String*): String = "Which inland mode of transport are you using?"

  override def select(answer: String): this.type = {
    val modeOfTransportCSSValue = answer match {
      case "Maritime"                 => "maritime"
      case "Rail"                     => "rail"
      case "Road"                     => "road"
      case "Air"                      => "air"
      case "Mail"                     => "mail"
      case "Fixed transport"          => "fixed"
      case "Inland waterway"          => "waterway"
      case "Unknown (own propulsion)" => "unknown"
    }
    clickRadioBtn(modeOfTransportCSSValue)
    this
  }
}
