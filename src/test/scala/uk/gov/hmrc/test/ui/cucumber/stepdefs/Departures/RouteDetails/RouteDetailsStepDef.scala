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
import uk.gov.hmrc.test.ui.pages.Departures.RouteDetails.Routing._

class RouteDetailsStepDef extends BaseStepDef {

  And("""^(?:I )?select (.+) on the country of destination page$""") { (answer: String) =>
    CountryOfDestinationPage
      .loadPage()
      .select(answer)
      .submitPage()
  }

  And("""^(?:I )?select (.+) on the departure office of destination page$""") { (answer: String) =>
    OfficeOfDestinationPage
      .loadPage()
      .select(answer)
      .submitPage()
  }

  And("""^(?:I )?choose radio option (.*) on the binding itinerary page$""") { (answer: String) =>
    BindingItineraryPage
      .loadPage()
      .select(answer)
      .submitPage()
  }

  And("""^(?:I )?select (.+) on the transit route country page$""") { (answer: String) =>
    TransitRouteCountryPage
      .loadPage()
      .select(answer)
      .submitPage()
  }

  Then("""^(?:I )?(?:should )?have (.+) countr(?:y |ies )added to the transit route add another country page$""") {
    (numberOfCountries: String) =>
      TransitRouteAddAnotherCountryPage
        .loadPage(numberOfCountries)
  }

  And("""^(?:I )?choose radio option (.*) on the transit route add another country page$""") { (answer: String) =>
    TransitRouteAddAnotherCountryPage
      .select(answer)
      .submitPage()
  }

  And("""^(?:I )?choose to click on (.*) link on the transit route add another country page$""") {
    (sectionLink: String) =>
      TransitRouteAddAnotherCountryPage
        .clickByPartialLinkText(sectionLink)
  }

  And("""^(?:I )?choose radio option (.*) on the transit route remove country page$""") { (answer: String) =>
    TransitRouteRemoveCountryPage
      .loadPage()
      .select(answer)
      .submitPage()
  }

  And("""^(?:I )?choose radio option (.*) on the transit route add country page$""") { (answer: String) =>
    TransitRouteAddCountryPage
      .loadPage()
      .select(answer)
      .submitPage()
  }
}
