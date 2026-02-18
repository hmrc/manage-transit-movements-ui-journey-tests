import uk.gov.hmrc.test.ui.cucumber.stepdefs.BaseStepDef
import uk.gov.hmrc.test.ui.pages.Departures.RouteDetails.PlaceOfLoading.*

object RouteDetailsPlaceOfLoadingStepDefSteps {

  // ^(?:I )?choose radio option (.*) on the 'Do you want to add a UN LOCODE for the place of loading\?' page$
  def andIchooseRadioOptionXOnTheDoYouWantToAddAUNLOCODEForThePlaceOfLoadingPage(answer: String): Unit = {
    PlaceOfLoadingAddUnLocodePage
            .loadPage()
            .select(answer)
            .submitPage()
  }

  // ^(?:I )?choose radio option (.*) on the 'Do you want to add a place of loading\?' page$
  def andIchooseRadioOptionXOnTheDoYouWantToAddAPlaceOfLoadingPage(answer: String): Unit = {
    AddPlaceOfLoading
            .loadPage()
            .select(answer)
            .submitPage()
  }

  // ^(?:I )?enter (.+) on the 'What is the UN LOCODE for the place of loading\?' page$
  def andIenterOnTheWhatIsTheUNLOCODEForThePlaceOfLoadingPage(answer: String): Unit = {
    PlaceOfLoadingUnLocodePage
          .loadPage()
          .fillInput(answer)
          .submitPage()
  }

  // ^(?:I )?choose radio option (.*) on the 'Do you want to add extra information for the place of loading\?' page$
  def andIchooseRadioOptionXOnTheDoYouWantToAddExtraInformationForThePlaceOfLoadingPage(answer: String): Unit = {
    PlaceOfLoadingAddExtraInformationPage
          .loadPage()
          .select(answer)
          .submitPage()
  }

  // ^(?:I )?select (.+) on the 'In which country is the place of loading\?' page$
  def andIselectOnTheInWhichCountryIsThePlaceOfLoadingPage(answer: String): Unit = {
    PlaceOfLoadingCountryPage
          .loadPage()
          .select(answer)
          .submitPage()
  }

  // ^(?:I )?enter (.+) on the 'Where in (.*) is the place of loading\?' page$
  def andIenterOnTheWhereInXIsThePlaceOfLoadingPage(answer: String, countryInTitle: String): Unit = {
    PlaceOfLoadingLocationPage
            .loadPage(countryInTitle)
            .fillInput(answer)
            .submitPage()
  }

}
