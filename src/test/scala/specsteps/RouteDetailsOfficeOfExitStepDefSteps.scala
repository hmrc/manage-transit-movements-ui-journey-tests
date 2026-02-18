import uk.gov.hmrc.test.ui.cucumber.stepdefs.BaseStepDef
import uk.gov.hmrc.test.ui.pages.Departures.RouteDetails.Exit.*

object RouteDetailsOfficeOfExitStepDefSteps {

  // ^(?:I )?choose radio option (.*) on the 'Do you want to add a customs office of exit\?' page$
  def andIchooseRadioOptionXOnTheDoYouWantToAddACustomsOfficeOfExitPage(answer: String): Unit = {
    AddCustomsOfficeOfExitPage
            .loadPage()
            .select(answer)
            .submitPage()
  }

  // ^(?:I )?select (.+) on the 'In which country is the office of exit for transit\?' page$
  def andIselectOnTheInWhichCountryIsTheOfficeOfExitForTransitPage(answer: String): Unit = {
    OfficeOfExitCountryPage
            .loadPage()
            .select(answer)
            .submitPage()
  }

  // ^(?:I )?select (.+) on the 'Where in (.*) is the office of exit for transit\?' page$
  def andIselectOnTheWhereInXIsTheOfficeOfExitForTransitPage(answer: String, countryInTitle: String): Unit = {
    OfficeOfExitPage
            .loadPage(countryInTitle)
            .select(answer)
            .submitPage()
  }

  // ^(?:I )?choose to click on the (.*) link on the 'You have added (.*) offices? of exit for transit' page$
  def andIchooseToClickOnTheXLinkOnTheYouHaveAddedXOfficesOfExitForTransitPage(sectionLink: String, officesOfExitInTitle: String): Unit = {
    AddAnotherOfficeOfExitPage
          .loadPage(officesOfExitInTitle)
          .clickByPartialLinkText(sectionLink)
  }

  // ^(?:I )?choose radio option (.*) on the 'Are you sure you want to remove this office of exit for transit\?' page$
  def andIchooseRadioOptionXOnTheAreYouSureYouWantToRemoveThisOfficeOfExitForTransitPage(answer: String): Unit = {
    ConfirmRemoveOfficeOfExitPage
          .loadPage()
          .select(answer)
          .submitPage()
  }

  // ^(?:I )?choose radio option (.*) on the 'You have added (.) offices? of exit for transit' page$
  def andIchooseRadioOptionXOnTheYouHaveAddedOfficesOfExitForTransitPage(answer: String, officesInTitle: String): Unit = {
    AddAnotherOfficeOfExitPage
            .loadPage(officesInTitle)
            .select(answer)
            .submitPage()
  }

}
