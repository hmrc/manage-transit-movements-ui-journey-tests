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

package uk.gov.hmrc.test.ui.cucumber.stepdefs.Departures.RouteDetails

import uk.gov.hmrc.test.ui.cucumber.stepdefs.BaseStepDef
import uk.gov.hmrc.test.ui.pages.Departures.RouteDetails.PlaceOfLoading._

class RouteDetailsPlaceOfLoadingStepDef extends BaseStepDef {

  And("""^(?:I )?choose radio option (.*) on the 'Do you want to add a UN LOCODE for the place of loading\?' page$""") {
    (answer: String) =>
      PlaceOfLoadingAddUnLocodePage
        .loadPage()
        .select(answer)
        .submitPage()
  }

  And("""^(?:I )?select (.+) on the 'What is the UN LOCODE for the place of loading\?' page$""") { (answer: String) =>
    PlaceOfLoadingUnLocodePage
      .loadPage()
      .select(answer)
      .submitPage()
  }

  And(
    """^(?:I )?choose radio option (.*) on the 'Do you want to add extra information for the place of loading\?' page$"""
  ) { (answer: String) =>
    PlaceOfLoadingAddExtraInformationPage
      .loadPage()
      .select(answer)
      .submitPage()
  }

  And("""^(?:I )?select (.+) on the 'In which country is the place of loading\?' page$""") { (answer: String) =>
    PlaceOfLoadingCountryPage
      .loadPage()
      .select(answer)
      .submitPage()
  }

  Then("""^(?:I )?(?:should )?have (.+) as loading location on the 'Where in (.*) is the place of loading' page$""") {
    (answer: String, countryInTitle: String) =>
      PlaceOfLoadingLocationPage
        .loadPage(answer)
  }

  And("""^(?:I )?enter (.+) on the 'Where in (.*) is the place of loading\?' page$""") {
    (answer: String, countryInTitle: String) =>
      PlaceOfLoadingLocationPage
        .loadPage(countryInTitle)
        .fillInput(answer)
        .submitPage()
  }
}
