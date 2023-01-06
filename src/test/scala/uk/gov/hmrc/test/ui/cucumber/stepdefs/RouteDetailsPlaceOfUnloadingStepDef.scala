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

package uk.gov.hmrc.test.ui.cucumber.stepdefs

import uk.gov.hmrc.test.ui.pages.RouteDetails.PlaceOfUnloading._

class RouteDetailsPlaceOfUnloadingStepDef extends BaseStepDef {

  And("""^(?:I )?choose radio option (.*) on the add place of unloading page$""") { (answer: String) =>
    AddPlaceOfUnloadingPage
      .loadPage()
      .select(answer)
      .submitPage()
  }

  And("""^(?:I )?choose radio option (.*) on the place of unloading add un locode page$""") { (answer: String) =>
    PlaceOfUnloadingAddUnLocodePage
      .loadPage()
      .select(answer)
      .submitPage()
  }

  And("""^(?:I )?select (.+) on the place of unloading un locode page$""") { (answer: String) =>
    PlaceOfUnloadingUnLocodePage
      .loadPage()
      .select(answer)
      .submitPage()
  }

  And("""^(?:I )?choose radio option (.*) on the place of unloading add extra information page$""") {
    (answer: String) =>
      PlaceOfUnloadingAddExtraInformationPage
        .loadPage()
        .select(answer)
        .submitPage()
  }

  And("""^(?:I )?select (.+) on the place of unloading country page$""") { (answer: String) =>
    PlaceOfUnloadingCountryPage
      .loadPage()
      .select(answer)
      .submitPage()
  }

  And("""^(?:I )?enter (.+) on the (.+) place of unloading location page$""") { (answer: String, country: String) =>
    PlaceOfUnloadingLocationPage
      .loadPage(country)
      .fillInput(answer)
      .submitPage()
  }
}
