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

package uk.gov.hmrc.test.ui.pages.Arrival.LocationOfGoodsType

import uk.gov.hmrc.test.ui.pages.RadioPage

object LocationOfGoodsTypePage extends RadioPage {

  override def title(args: String*): String = "Which type of location are the goods in?"

  override def select(answer: String): this.type = {
    answer match {
      case "Authorised place"    => clickById("value")
      case "Designated location" => clickById("value_1")
      case "Approved place"      => clickById("value_2")
      case "Other"               => clickById("value_3")
    }
    this
  }
}
