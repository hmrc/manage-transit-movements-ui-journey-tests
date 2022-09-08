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

object LocationOfGoodsAddress extends BasePage {

  val locationOfGoodsAddressTitle = "What is the address for the location of goods? - Manage your transit movements - GOV.UK"

  def loadPage: this.type = {
    onPage(locationOfGoodsAddressTitle)
    this
  }

  def enterLocationOfGoodsAddress: this.type = {
    fillInAddress("1 Old Lane", "Hull", "H1 0AA", "United Kingdom")
    submitPage()
    this
  }

}
