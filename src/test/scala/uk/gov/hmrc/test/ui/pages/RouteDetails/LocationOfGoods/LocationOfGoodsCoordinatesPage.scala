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

package uk.gov.hmrc.test.ui.pages.RouteDetails.LocationOfGoods

import uk.gov.hmrc.test.ui.pages.BasePage

object LocationOfGoodsCoordinatesPage extends BasePage {

  val locationOfGoodsCoordinatesTitle = "What are the coordinates for the location of goods? - Manage your transit movements - GOV.UK"

  def loadPage: this.type = {
    onPage(locationOfGoodsCoordinatesTitle)
    this
  }

  def enterLocationOfGoodsCoordinates(latitudeNo: String, longitudeNo: String): Unit = {
    fillInputById("latitude", latitudeNo)
    fillInputById("longitude", longitudeNo)
  }
}
