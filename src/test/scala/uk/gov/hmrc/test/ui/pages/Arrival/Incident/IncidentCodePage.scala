/*
 * Copyright 2022 HM Revenue & Customs
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

package uk.gov.hmrc.test.ui.pages.Arrival.Incident

import uk.gov.hmrc.test.ui.pages.YesNoPage

object IncidentCodePage extends YesNoPage {

  override def title(args: String*): String = "Which type of incident was it?"

  override def select(answer: String): this.type = {
    answer match {
      case "1 - The carrier" => clickById("value")
      case "2 - The seals" => clickById("value_1")
      case "3 - The goods" => clickById("value_2")
      case "4 - The goods were partially" => clickById("value_3")
      case "5 - The holder" => clickById("value_4")
      case "6 - The means" => clickById("value_5")
    }
    this
  }
}
