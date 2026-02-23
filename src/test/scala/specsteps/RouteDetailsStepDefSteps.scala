/*
 * Copyright 2026 HM Revenue & Customs
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

import uk.gov.hmrc.test.ui.cucumber.stepdefs.BaseStepDef
import uk.gov.hmrc.test.ui.pages.Departures.RouteDetails.Routing.*
import uk.gov.hmrc.test.ui.pages.Departures.RouteDetails.Transit.T2DeclarationPage

object RouteDetailsStepDefSteps {

  // ^(?:I )?choose radio option (.*) on the 'Do you want to add a specific circumstance indicator\?' page$
  def andIchooseRadioOptionXOnTheDoYouWantToAddASpecificCircumstanceIndicatorPage(answer: String): Unit =
    AddSpecificCircumstanceIndicatorPage
      .loadPage()
      .select(answer)
      .submitPage()

  // ^(?:I )?choose radio option (.*) on the 'Which specific circumstance indicator do you want to add\?' page$
  def andIchooseRadioOptionXOnTheWhichSpecificCircumstanceIndicatorDoYouWantToAddPage(answer: String): Unit =
    SpecificCircumstanceIndicatorPage
      .loadPage()
      .select(answer)
      .submitPage()

  // ^(?:I )?select (.+) on the 'What country is the office of destination in\?' page$
  def andIselectOnTheWhatCountryIsTheOfficeOfDestinationInPage(answer: String): Unit =
    CountryOfDestinationPage
      .loadPage()
      .select(answer)
      .submitPage()

  // ^(?:I )?select (.+) on the 'Where in (.+) is the office of destination\?' page$
  def andIselectOnTheWhereInIsTheOfficeOfDestinationPage(answer: String, country: String): Unit =
    OfficeOfDestinationPage
      .loadPage(country)
      .select(answer)
      .submitPage()

  // ^(?:I )?choose radio option (.*) on the 'Are you using a binding itinerary\?' page$
  def andIchooseRadioOptionXOnTheAreYouUsingABindingItineraryPage(answer: String): Unit =
    BindingItineraryPage
      .loadPage()
      .select(answer)
      .submitPage()

  // ^(?:I )?select (.+) on the 'Which country do you want to add to the transit route\?' page$
  def andIselectOnTheWhichCountryDoYouWantToAddToTheTransitRoutePage(answer: String): Unit =
    TransitRouteCountryPage
      .loadPage()
      .select(answer)
      .submitPage()

  // ^(?:I )?(?:should )?have (.+) countr(?:y |ies )added to the 'You have added (.+) countr(?:y |ies )to the transit route' page$
  def thenIshouldhaveCountriesAddedToTheYouHaveAddedXCountriestoTheTransitRoutePage(numberOfCountries: String): Unit =
    TransitRouteAddAnotherCountryPage
      .loadPage(numberOfCountries)

  // ^(?:I )?choose radio option (.*) on the 'You have added (.*) countr(?:y |ies )to the transit route' page$
  def andIchooseRadioOptionXOnTheYouHaveAddedXCountriestoTheTransitRoutePage(
    answer: String,
    numberOfCountriesInTitle: String
  ): Unit =
    TransitRouteAddAnotherCountryPage
      .loadPage(numberOfCountriesInTitle)
      .select(answer)
      .submitPage()

  // ^(?:I )?choose radio option (.*) on the 'Do you want to add a country to the transit route\?' page$
  def andIchooseRadioOptionXOnTheDoYouWantToAddACountryToTheTransitRoutePage(answer: String): Unit =
    TransitRouteAddCountryPage
      .loadPage()
      .select(answer)
      .submitPage()

  // ^(?:I )?choose to click on the (.*) link on the 'You have added (.*) countr(?:y |ies )to the transit route' page$
  def andIchooseToClickOnTheXLinkOnTheYouHaveAddedXCountriestoTheTransitRoutePage(
    sectionLink: String,
    numberOfCountriesInTitle: String
  ): Unit =
    TransitRouteAddAnotherCountryPage
      .loadPage(numberOfCountriesInTitle)
      .clickByPartialLinkText(sectionLink)

  // ^(?:I )?choose radio option (.*) on the 'Are you sure you want to remove this country from the transit route\?' page$
  def andIchooseRadioOptionXOnTheAreYouSureYouWantToRemoveThisCountryFromTheTransitRoutePage(answer: String): Unit =
    TransitRouteRemoveCountryPage
      .loadPage()
      .select(answer)
      .submitPage()

  // ^(?:I )?choose radio option (.*) on the transit route add country page$
  def andIchooseRadioOptionXOnTheTransitRouteAddCountryPage(answer: String): Unit =
    TransitRouteAddCountryPage
      .loadPage()
      .select(answer)
      .submitPage()

  // ^(?:I )?choose radio option (.*) on the 'Does the transit include any T2 declarations\?' page$
  def andIchooseRadioOptionXOnTheDoesTheTransitIncludeAnyT2DeclarationsPage(answer: String): Unit =
    T2DeclarationPage
      .loadPage()
      .select(answer)
      .submitPage()

}
