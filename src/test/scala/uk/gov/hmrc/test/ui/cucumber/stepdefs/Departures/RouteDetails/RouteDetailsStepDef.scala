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
import uk.gov.hmrc.test.ui.pages.Departures.AdditionalInformation.AddAnotherPageAdditionalInformation
import uk.gov.hmrc.test.ui.pages.Departures.RouteDetails.Routing._
import uk.gov.hmrc.test.ui.pages.Departures.RouteDetails.Transit.T2DeclarationPage

class RouteDetailsStepDef extends BaseStepDef {

  And(
    """^(?:I )?choose radio option (.*) on the 'Do you want to add a specific circumstance indicator\?' page$"""
  ) { (answer: String) =>
    AddSpecificCircumstanceIndicatorPage
      .loadPage()
      .select(answer)
      .submitPage()
  }

  And(
    """^(?:I )?choose radio option (.*) on the 'Which specific circumstance indicator do you want to add\?' page$"""
  ) { (answer: String) =>
    SpecificCircumstanceIndicatorPage
      .loadPage()
      .select(answer)
      .submitPage()
  }

  And("""^(?:I )?select (.+) on the 'What country is the office of destination in\?' page$""") { (answer: String) =>
    CountryOfDestinationPage
      .loadPage()
      .select(answer)
      .submitPage()
  }

  And("""^(?:I )?select (.+) on the 'Where in (.+) is the office of destination\?' page$""") {
    (answer: String, country: String) =>
      OfficeOfDestinationPage
        .loadPage(country)
        .select(answer)
        .submitPage()
  }

  And("""^(?:I )?choose radio option (.*) on the 'Are you using a binding itinerary\?' page$""") { (answer: String) =>
    BindingItineraryPage
      .loadPage()
      .select(answer)
      .submitPage()
  }

  And("""^(?:I )?select (.+) on the 'Which country do you want to add to the transit route\?' page$""") {
    (answer: String) =>
      TransitRouteCountryPage
        .loadPage()
        .select(answer)
        .submitPage()
  }

  Then(
    """^(?:I )?(?:should )?have (.+) countr(?:y |ies )added to the 'You have added (.+) countr(?:y |ies )to the transit route' page$"""
  ) { (numberOfCountries: String, numberOfCountriesInTitle: String) =>
    TransitRouteAddAnotherCountryPage
      .loadPage(numberOfCountries)
  }

  And("""^(?:I )?choose radio option (.*) on the 'You have added (.*) countr(?:y |ies )to the transit route' page$""") {
    (answer: String, numberOfCountriesInTitle: String) =>
      TransitRouteAddAnotherCountryPage
        .loadPage(numberOfCountriesInTitle)
        .select(answer)
        .submitPage()
  }

  And(
    """^(?:I )?choose to click on the (.*) link on the 'You have added (.*) countr(?:y |ies )to the transit route' page$"""
  ) { (sectionLink: String, numberOfCountriesInTitle: String) =>
    TransitRouteAddAnotherCountryPage
      .loadPage(numberOfCountriesInTitle)
      .clickByPartialLinkText(sectionLink)
  }

  And(
    """^(?:I )?choose radio option (.*) on the 'Are you sure you want to remove this country from the transit route\?' page$"""
  ) { (answer: String) =>
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

  And("""^(?:I )?choose radio option (.*) on the 'Does the transit include any T2 declarations\?' page$""") {
    (answer: String) =>
      T2DeclarationPage
        .loadPage()
        .select(answer)
        .submitPage()
  }

}
