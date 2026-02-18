import uk.gov.hmrc.test.ui.cucumber.stepdefs.BaseStepDef
import uk.gov.hmrc.test.ui.pages.Departures.RouteDetails.Routing.*
import uk.gov.hmrc.test.ui.pages.Departures.RouteDetails.Transit.T2DeclarationPage

object RouteDetailsStepDefSteps {

  // ^(?:I )?choose radio option (.*) on the 'Do you want to add a specific circumstance indicator\?' page$
  def and(?I)?chooseRadioOptionXOnThe'DoYouWantToAddASpecificCircumstanceIndicator\?'Page(answer: String): Unit = {
    AddSpecificCircumstanceIndicatorPage
          .loadPage()
          .select(answer)
          .submitPage()
  }

  // ^(?:I )?choose radio option (.*) on the 'Which specific circumstance indicator do you want to add\?' page$
  def and(?I)?chooseRadioOptionXOnThe'WhichSpecificCircumstanceIndicatorDoYouWantToAdd\?'Page(answer: String): Unit = {
    SpecificCircumstanceIndicatorPage
          .loadPage()
          .select(answer)
          .submitPage()
  }

  // ^(?:I )?select (.+) on the 'What country is the office of destination in\?' page$
  def and(?I)?select(.+)OnThe'WhatCountryIsTheOfficeOfDestinationIn\?'Page(answer: String): Unit = {
    CountryOfDestinationPage
          .loadPage()
          .select(answer)
          .submitPage()
  }

  // ^(?:I )?select (.+) on the 'Where in (.+) is the office of destination\?' page$
  def and(?I)?select(.+)OnThe'WhereIn(.+)IsTheOfficeOfDestination\?'Page(answer: String, country: String): Unit = {
    OfficeOfDestinationPage
            .loadPage(country)
            .select(answer)
            .submitPage()
  }

  // ^(?:I )?choose radio option (.*) on the 'Are you using a binding itinerary\?' page$
  def and(?I)?chooseRadioOptionXOnThe'AreYouUsingABindingItinerary\?'Page(answer: String): Unit = {
    BindingItineraryPage
          .loadPage()
          .select(answer)
          .submitPage()
  }

  // ^(?:I )?select (.+) on the 'Which country do you want to add to the transit route\?' page$
  def and(?I)?select(.+)OnThe'WhichCountryDoYouWantToAddToTheTransitRoute\?'Page(answer: String): Unit = {
    TransitRouteCountryPage
            .loadPage()
            .select(answer)
            .submitPage()
  }

  // ^(?:I )?(?:should )?have (.+) countr(?:y |ies )added to the 'You have added (.+) countr(?:y |ies )to the transit route' page$
  def then(?I)?(?should)?have(.+)Countr(?y|ies)addedToThe'YouHaveAdded(.+)Countr(?y|ies)toTheTransitRoute'Page(numberOfCountries: String, _: String): Unit = {
    TransitRouteAddAnotherCountryPage
          .loadPage(numberOfCountries)
  }

  // ^(?:I )?choose radio option (.*) on the 'You have added (.*) countr(?:y |ies )to the transit route' page$
  def and(?I)?chooseRadioOptionXOnThe'YouHaveAddedXCountr(?y|ies)toTheTransitRoute'Page(answer: String, numberOfCountriesInTitle: String): Unit = {
    TransitRouteAddAnotherCountryPage
            .loadPage(numberOfCountriesInTitle)
            .select(answer)
            .submitPage()
  }

  // ^(?:I )?choose radio option (.*) on the 'Do you want to add a country to the transit route\?' page$
  def and(?I)?chooseRadioOptionXOnThe'DoYouWantToAddACountryToTheTransitRoute\?'Page(answer: String): Unit = {
    TransitRouteAddCountryPage
            .loadPage()
            .select(answer)
            .submitPage()
  }

  // ^(?:I )?choose to click on the (.*) link on the 'You have added (.*) countr(?:y |ies )to the transit route' page$
  def and(?I)?chooseToClickOnTheXLinkOnThe'YouHaveAddedXCountr(?y|ies)toTheTransitRoute'Page(sectionLink: String, numberOfCountriesInTitle: String): Unit = {
    TransitRouteAddAnotherCountryPage
          .loadPage(numberOfCountriesInTitle)
          .clickByPartialLinkText(sectionLink)
  }

  // ^(?:I )?choose radio option (.*) on the 'Are you sure you want to remove this country from the transit route\?' page$
  def and(?I)?chooseRadioOptionXOnThe'AreYouSureYouWantToRemoveThisCountryFromTheTransitRoute\?'Page(answer: String): Unit = {
    TransitRouteRemoveCountryPage
          .loadPage()
          .select(answer)
          .submitPage()
  }

  // ^(?:I )?choose radio option (.*) on the transit route add country page$
  def and(?I)?chooseRadioOptionXOnTheTransitRouteAddCountryPage(answer: String): Unit = {
    TransitRouteAddCountryPage
          .loadPage()
          .select(answer)
          .submitPage()
  }

  // ^(?:I )?choose radio option (.*) on the 'Does the transit include any T2 declarations\?' page$
  def and(?I)?chooseRadioOptionXOnThe'DoesTheTransitIncludeAnyT2Declarations\?'Page(answer: String): Unit = {
    T2DeclarationPage
            .loadPage()
            .select(answer)
            .submitPage()
  }

}
