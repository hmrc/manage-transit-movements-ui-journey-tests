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
import uk.gov.hmrc.test.ui.pages.RouteDetails._

class RouteDetailsStepDef extends BaseStepDef {

  And("""^(?:I )?select (.+) on the office of destination page$""") { (answer: String) =>
    OfficeOfDestinationPage.loadPage
    OfficeOfDestinationPage.selectAnOffice(answer)
    OfficeOfDestinationPage.submitPage()
  }

  And("""^(?:I )?choose radio option (.*) on the binding itinerary page$""") { (answer: String) =>
    BindingItineraryPage.loadPage
    BindingItineraryPage.selectBindingItinerary(answer)
    BindingItineraryPage.submitPage()
  }

  And("""^(?:I )?select (.+) on the transit route country page$""") { (answer: String) =>
    TransitRouteCountryPage.loadPage
    TransitRouteCountryPage.selectAnOffice(answer)
    TransitRouteCountryPage.submitPage()
  }

  Then("""^(?:I )?(?:should )?have (.+) country or countries to transit route added on the transit route add country page$""") { (answer: String) =>
    AddAnotherTransitRouteCountryPage.checkAddAnotherTransitRouteCountryTitle(answer)
  }

  And("""^(?:I )?choose radio option (.*) on the add another transit route country page$""") { (answer: String) =>
    AddAnotherTransitRouteCountryPage.selectAddAnotherTransitRouteCountry(answer)
    AddAnotherTransitRouteCountryPage.submitPage()
  }

  And("""^(?:I )?choose radio option (.*) on the transit route add country page$""") { (answer: String) =>
    TransitRouteAddCountryPage.loadPage
    TransitRouteAddCountryPage.selectTransitRouteAddCountry(answer)
    TransitRouteAddCountryPage.submitPage()
  }
}
