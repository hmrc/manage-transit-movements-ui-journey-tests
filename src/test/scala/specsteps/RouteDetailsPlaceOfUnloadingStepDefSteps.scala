import uk.gov.hmrc.test.ui.cucumber.stepdefs.BaseStepDef
import uk.gov.hmrc.test.ui.pages.Departures.RouteDetails.PlaceOfUnloading.*

object RouteDetailsPlaceOfUnloadingStepDefSteps {

  // ^(?:I )?choose radio option (.*) on the 'Do you want to add a place of unloading\?' page$
  def and(?I)?chooseRadioOptionXOnThe'DoYouWantToAddAPlaceOfUnloading\?'Page(answer: String): Unit = {
    AddPlaceOfUnloadingPage
            .loadPage()
            .select(answer)
            .submitPage()
  }

  // ^(?:I )?choose radio option (.*) on the 'Do you want to add a UN LOCODE for the place of unloading\?' page$
  def and(?I)?chooseRadioOptionXOnThe'DoYouWantToAddAUNLOCODEForThePlaceOfUnloading\?'Page(answer: String): Unit = {
    PlaceOfUnloadingAddUnLocodePage
          .loadPage()
          .select(answer)
          .submitPage()
  }

  // ^(?:I )?enter (.+) on the 'What is the UN LOCODE for the place of unloading\?' page$
  def and(?I)?enter(.+)OnThe'WhatIsTheUNLOCODEForThePlaceOfUnloading\?'Page(answer: String): Unit = {
    PlaceOfUnloadingUnLocodePage
          .loadPage()
          .fillInput(answer)
          .submitPage()
  }

  // ^(?:I )?choose radio option (.*) on the 'Do you want to add extra information for the place of unloading\?' page$
  def and(?I)?chooseRadioOptionXOnThe'DoYouWantToAddExtraInformationForThePlaceOfUnloading\?'Page(answer: String): Unit = {
    PlaceOfUnloadingAddExtraInformationPage
          .loadPage()
          .select(answer)
          .submitPage()
  }

  // ^(?:I )?select (.+) on the 'Which country is the place of unloading in\?' page$
  def and(?I)?select(.+)OnThe'WhichCountryIsThePlaceOfUnloadingIn\?'Page(answer: String): Unit = {
    PlaceOfUnloadingCountryPage
          .loadPage()
          .select(answer)
          .submitPage()
  }

  // ^(?:I )?enter (.+) on the 'Where in (.*) is the place of unloading\?' page$
  def and(?I)?enter(.+)OnThe'WhereInXIsThePlaceOfUnloading\?'Page(answer: String, country: String): Unit = {
    PlaceOfUnloadingLocationPage
            .loadPage(country)
            .fillInput(answer)
            .submitPage()
  }

}
