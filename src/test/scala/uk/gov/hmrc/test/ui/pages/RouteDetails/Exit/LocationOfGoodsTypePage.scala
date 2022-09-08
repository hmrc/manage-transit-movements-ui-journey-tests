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

package uk.gov.hmrc.test.ui.pages.RouteDetails.Exit

import uk.gov.hmrc.test.ui.pages.BasePage
import uk.gov.hmrc.test.ui.pages.RouteDetails.Transit.AddOfficeOfTransitPage.{addOfficeOfTransitPageTitle, clickById, onPage}

object LocationOfGoodsTypePage extends BasePage {

  val locationOfGoodsTypeTitle = "Which type of location is it? - Manage your transit movements - GOV.UK"

  def loadPage: this.type = {
    onPage(locationOfGoodsTypeTitle)
    this
  }

  def selectLocationOfGoodsType(answer: String): this.type = {
    answer match {
      case "Designated location" => clickById("value");
      case "Authorised place - the authorised consignor’s approved premises" => clickById("value_1");
      case "Approved place - a designated location approved and controlled by the office of departure or destination" => clickById("value_2");
      case "Other" => clickById("value_3");
    }
    this
  }
}
