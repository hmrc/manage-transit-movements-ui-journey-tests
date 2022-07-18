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

package uk.gov.hmrc.test.ui.pages.TraderDetails.Consignor

import uk.gov.hmrc.test.ui.pages.BasePage

object IsConsignorEoriKnownPage extends BasePage {
  val isConsignorEoriKnownTitle = "Do you know the consignor’s EORI number? - Manage your transit movements - GOV.UK"

  def loadPage: this.type = {
    onPage(isConsignorEoriKnownTitle)
    this
  }

  def enterDoYouKnowConsignorEori(answer: String): IsConsignorEoriKnownPage.type = {
    answer match {
      case "Yes" => clickById("value");
      case "No"  => clickById("value-no");
    }
    this
  }
}