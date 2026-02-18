import uk.gov.hmrc.test.ui.cucumber.stepdefs.BaseStepDef
import uk.gov.hmrc.test.ui.pages.Departures.RouteDetails.PlaceOfLoading.*

object RouteDetailsPlaceOfLoadingStepDefSteps {

  // ^(?:I )?choose radio option (.*) on the 'Do you want to add a UN LOCODE for the place of loading\?' page$
  def and(?I)?chooseRadioOptionXOnThe'DoYouWantToAddAUNLOCODEForThePlaceOfLoading\?'Page(answer: String): Unit = {
    PlaceOfLoadingAddUnLocodePage
            .loadPage()
            .select(answer)
            .submitPage()
  }

  // ^(?:I )?choose radio option (.*) on the 'Do you want to add a place of loading\?' page$
  def and(?I)?chooseRadioOptionXOnThe'DoYouWantToAddAPlaceOfLoading\?'Page(answer: String): Unit = {
    AddPlaceOfLoading
            .loadPage()
            .select(answer)
            .submitPage()
  }

  // ^(?:I )?enter (.+) on the 'What is the UN LOCODE for the place of loading\?' page$
  def and(?I)?enter(.+)OnThe'WhatIsTheUNLOCODEForThePlaceOfLoading\?'Page(answer: String): Unit = {
    PlaceOfLoadingUnLocodePage
          .loadPage()
          .fillInput(answer)
          .submitPage()
  }

  // ^(?:I )?choose radio option (.*) on the 'Do you want to add extra information for the place of loading\?' page$
  def and(?I)?chooseRadioOptionXOnThe'DoYouWantToAddExtraInformationForThePlaceOfLoading\?'Page(answer: String): Unit = {
    PlaceOfLoadingAddExtraInformationPage
          .loadPage()
          .select(answer)
          .submitPage()
  }

  // ^(?:I )?select (.+) on the 'In which country is the place of loading\?' page$
  def and(?I)?select(.+)OnThe'InWhichCountryIsThePlaceOfLoading\?'Page(answer: String): Unit = {
    PlaceOfLoadingCountryPage
          .loadPage()
          .select(answer)
          .submitPage()
  }

  // ^(?:I )?enter (.+) on the 'Where in (.*) is the place of loading\?' page$
  def and(?I)?enter(.+)OnThe'WhereInXIsThePlaceOfLoading\?'Page(answer: String, countryInTitle: String): Unit = {
    PlaceOfLoadingLocationPage
            .loadPage(countryInTitle)
            .fillInput(answer)
            .submitPage()
  }

}
