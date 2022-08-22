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

package uk.gov.hmrc.test.ui.pages.RouteDetails.Transit

import uk.gov.hmrc.test.ui.pages.BasePage

object OfficeOfTransitPage extends BasePage {


  def checkOfficeOfTransitTitle(countryOffice: String): Unit =
    countryOffice match {
      case "France" =>
        onPage(f"Where in France is the office of transit? - Manage your transit movements - GOV.UK")
      case "United Kingdom" =>
        onPage(f"Where in United Kingdom is the office of transit? - Manage your transit movements - GOV.UK")
      case "Italy" =>
        onPage(f"Where in Italy is the office of transit? - Manage your transit movements - GOV.UK")
    }
}