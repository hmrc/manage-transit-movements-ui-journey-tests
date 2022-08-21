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

package uk.gov.hmrc.test.ui.pages.RouteDetails.Routing

import uk.gov.hmrc.test.ui.pages.BasePage

object TransitRouteAddAnotherCountryPage extends BasePage {

  def checkAddAnotherTransitRouteCountryTitle(numberOfCountry: String): Unit =
    numberOfCountry match {
      case "1" =>
        onPage(f"You have added 1 country to the transit route - Manage your transit movements - GOV.UK")
      case _   =>
        onPage(f"You have added $numberOfCountry countries to the transit route - Manage your transit movements - GOV.UK")
    }

  def selectAddAnotherTransitRouteCountry(answer: String): this.type = {
    answer match {
      case "Yes" => clickById("value");
      case "No"  => clickById("value-no");
    }
    this
  }


}