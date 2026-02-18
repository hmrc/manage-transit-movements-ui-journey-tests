import uk.gov.hmrc.test.ui.cucumber.stepdefs.BaseStepDef
import uk.gov.hmrc.test.ui.pages.CYAPage
import uk.gov.hmrc.test.ui.pages.Departures.RouteDetails.Transit.*

object RouteDetailsTransitStepDefSteps {

  // ^(?:I )?choose radio option (.*) on the t2 declaration page$
  def andIchooseRadioOptionXOnTheT2DeclarationPage(answer: String): Unit = {
    T2DeclarationPage
          .loadPage()
          .select(answer)
          .submitPage()
  }

  // ^(?:I )?choose radio option (.*) on the add office of transit page$
  def andIchooseRadioOptionXOnTheAddOfficeOfTransitPage(answer: String): Unit = {
    AddOfficeOfTransitPage
          .loadPage()
          .select(answer)
          .submitPage()
  }

  // ^(?:I )?select (.+) on the 'Which country is the office of transit in\?' page$
  def andIselectOnTheWhichCountryIsTheOfficeOfTransitInPage(answer: String): Unit = {
    OfficeOfTransitCountryPage
          .loadPage()
          .select(answer)
          .submitPage()
  }

  // ^(?:I )?(?:should )?have (.+) as office of transit on the office of transit page$
  def thenIshouldhaveAsOfficeOfTransitOnTheOfficeOfTransitPage(numberOfOffices: String): Unit = {
    OfficeOfTransitPage
            .loadPage(numberOfOffices)
  }

  // ^(?:I )?select (.+) on the 'Where in (.*) is the office of transit\?' page$
  def andIselectOnTheWhereInXIsTheOfficeOfTransitPage(answer: String, countryInTitle: String): Unit = {
    OfficeOfTransitPage
            .loadPage(countryInTitle)
            .select(answer)
            .submitPage()
  }

  // ^(?:I )?choose radio option (.*) on the 'Do you want to add a time of arrival in (.*)\?' page$
  def andIchooseRadioOptionXOnTheDoYouWantToAddATimeOfArrivalInXPage(answer: String, officeInTitle: String): Unit = {
    OfficeOfTransitAddEtaPage
            .loadPage(officeInTitle)
            .select(answer)
            .submitPage()
  }

  // ^(?:I )?choose fill in the date and time on the 'When do you expect the transit to arrive in (.*), (.*)\?' page$
  def andIchooseFillInTheDateAndTimeOnTheWhenDoYouExpectTheTransitToArriveInXXPage(office: String, country: String): Unit = {
    OfficeOfTransitEtaPage
          .loadPage(office, country)
          .fillInputs()
          .submitPage()
  }

  // ^(?:I )?(?:should )?have (.+) offices? of transit added on the 'You have added (.*) offices? of transit' page$
  def thenIshouldhaveOfficesOfTransitAddedOnTheYouHaveAddedXOfficesOfTransitPage(numberOfOffices: String): Unit = {
    AddAnotherOfficeOfTransitPage
          .loadPage(numberOfOffices)
  }

  // ^(?:I )?choose radio option (.*) on the 'You have added (.*) offices? of transit' page$
  def andIchooseRadioOptionXOnTheYouHaveAddedXOfficesOfTransitPage(answer: String, numberOfCountriesInTitle: String): Unit = {
    AddAnotherOfficeOfTransitPage
            .loadPage(numberOfCountriesInTitle)
            .select(answer)
            .submitPage()
  }

  // ^(?:I )?choose to click on the (.*) link on the 'You have added (.*) offices? of transit' page$
  def andIchooseToClickOnTheXLinkOnTheYouHaveAddedXOfficesOfTransitPage(sectionLink: String, numberOfOfficeInTitle: String): Unit = {
    AddAnotherOfficeOfTransitPage
          .loadPage(numberOfOfficeInTitle)
          .clickByPartialLinkText(sectionLink)
  }

  // ^(?:I )?choose radio option (.*) on the 'Are you sure you want to remove this office of transit?\?' page$
  def andIchooseRadioOptionXOnTheAreYouSureYouWantToRemoveThisOfficeOfTransitPage(answer: String): Unit = {
    ConfirmRemoveOfficeOfTransitPage
          .loadPage()
          .select(answer)
          .submitPage()
  }

  // ^(?:I )?choose to click on (.*) link on the add another office of transit page$
  def andIchooseToClickOnXLinkOnTheAddAnotherOfficeOfTransitPage(sectionLink: String): Unit = {
    AddAnotherOfficeOfTransitPage
          .clickByPartialLinkText(sectionLink)
  }

  // ^(?:I )?choose radio option (.*) on the confirm remove office of transit page$
  def andIchooseRadioOptionXOnTheConfirmRemoveOfficeOfTransitPage(answer: String): Unit = {
    ConfirmRemoveOfficeOfTransitPage
          .loadPage()
          .select(answer)
          .submitPage()
  }

  // ^(?:I )?choose to click on (.*) link on the 'No offices of transit' page$
  def andIchooseToClickOnXLinkOnTheNoOfficesOfTransitPage(sectionLink: String): Unit = {
    NoTransitOfficesPage
          .loadPage()
          .clickByPartialLinkText(sectionLink)
  }

  // ^(?:I )?choose to click on (.*) link on the Check your answers section (.*) page$
  def andIchooseToClickOnXLinkOnTheCheckYourAnswersSectionXPage(sectionLink: String, subheading: String): Unit = {
    CYAPage
            .loadPage(subheading)
            .clickByPartialLinkText(sectionLink)
  }

}
