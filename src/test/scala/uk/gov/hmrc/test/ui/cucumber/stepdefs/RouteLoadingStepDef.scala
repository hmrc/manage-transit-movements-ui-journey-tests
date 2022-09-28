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

package uk.gov.hmrc.test.ui.cucumber.stepdefs

import uk.gov.hmrc.test.ui.pages.RouteDetails.Loading._

class RouteLoadingStepDef extends BaseStepDef {

  And("""^(?:I )?choose radio option (.*) on the place of loading add un locode page$""") { (answer: String) =>
    PlaceOfLoadingAddUnLocodePage.loadPage
    PlaceOfLoadingAddUnLocodePage.selectPlaceOfLoadingAddUnLocode(answer)
    PlaceOfLoadingAddUnLocodePage.submitPage()
  }

  And("""^(?:I )?select (.+) on the place of loading un locode page$""") { (answer: String) =>
    PlaceOfLoadingUnLocodePage.loadPage
    PlaceOfLoadingUnLocodePage.selectValueFromDropDown(answer)
    PlaceOfLoadingUnLocodePage.submitPage()
  }

  And("""^(?:I )?choose radio option (.*) on the place of loading add extra information page$""") { (answer: String) =>
    PlaceOfLoadingAddExtraInformationPage.loadPage
    PlaceOfLoadingAddExtraInformationPage.selectPlaceOfLoadingAddExtraInformationTitle(answer)
    PlaceOfLoadingAddExtraInformationPage.submitPage()
  }

  And("""^(?:I )?select (.+) on the place of loading country page$""") { (answer: String) =>
    PlaceOfLoadingCountryPage.loadPage
    PlaceOfLoadingCountryPage.selectValueFromDropDown(answer)
    PlaceOfLoadingCountryPage.submitPage()
  }

  Then("""^(?:I )?(?:should )?have (.+) as loading location on the place of loading location page$""") {
    (answer: String) =>
      PlaceOfLoadingLocationPage.checkPlaceOfLoadingLocationTitle(answer)
  }

  And("""^(?:I )?enter (.+) on the place of loading location page$""") { (answer: String) =>
    PlaceOfLoadingLocationPage.enterPlaceOfLoadingLocation(answer)
    PlaceOfLoadingLocationPage.submitPage()
  }
}
