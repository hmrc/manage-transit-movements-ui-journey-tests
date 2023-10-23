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

package uk.gov.hmrc.test.ui.pages.Arrivals.Incident

import uk.gov.hmrc.test.ui.pages.YesNoPage

object IncidentCodePage extends YesNoPage {

  override def title(args: String*): String = "Which type of incident was it?"

  override def select(answer: String): this.type = {
    val value = answer match {
      case "1 - The carrier"              => "1"
      case "2 - The seals"                => "2"
      case "3 - The goods"                => "3"
      case "4 - The goods were partially" => "4"
      case "5 - The holder"               => "5"
      case "6 - The means"                => "6"
    }
    clickRadioBtn(value)
    this
  }
}
