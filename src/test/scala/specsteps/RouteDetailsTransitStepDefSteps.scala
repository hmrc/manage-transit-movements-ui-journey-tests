import uk.gov.hmrc.test.ui.cucumber.stepdefs.BaseStepDef
import uk.gov.hmrc.test.ui.pages.CYAPage
import uk.gov.hmrc.test.ui.pages.Departures.RouteDetails.Transit.*

object RouteDetailsTransitStepDefSteps {

  // ^(?:I )?choose radio option (.*) on the t2 declaration page$
  def and(?I)?chooseRadioOptionXOnTheT2DeclarationPage(answer: String): Unit = {
    T2DeclarationPage
          .loadPage()
          .select(answer)
          .submitPage()
  }

  // ^(?:I )?choose radio option (.*) on the add office of transit page$
  def and(?I)?chooseRadioOptionXOnTheAddOfficeOfTransitPage(answer: String): Unit = {
    AddOfficeOfTransitPage
          .loadPage()
          .select(answer)
          .submitPage()
  }

  // ^(?:I )?select (.+) on the 'Which country is the office of transit in\?' page$
  def and(?I)?select(.+)OnThe'WhichCountryIsTheOfficeOfTransitIn\?'Page(answer: String): Unit = {
    OfficeOfTransitCountryPage
          .loadPage()
          .select(answer)
          .submitPage()
  }

  // ^(?:I )?(?:should )?have (.+) as office of transit on the office of transit page$
  def then(?I)?(?should)?have(.+)AsOfficeOfTransitOnTheOfficeOfTransitPage(numberOfOffices: String): Unit = {
    OfficeOfTransitPage
            .loadPage(numberOfOffices)
  }

  // ^(?:I )?select (.+) on the 'Where in (.*) is the office of transit\?' page$
  def and(?I)?select(.+)OnThe'WhereInXIsTheOfficeOfTransit\?'Page(answer: String, countryInTitle: String): Unit = {
    OfficeOfTransitPage
            .loadPage(countryInTitle)
            .select(answer)
            .submitPage()
  }

  // ^(?:I )?choose radio option (.*) on the 'Do you want to add a time of arrival in (.*)\?' page$
  def and(?I)?chooseRadioOptionXOnThe'DoYouWantToAddATimeOfArrivalInX\?'Page(answer: String, officeInTitle: String): Unit = {
    OfficeOfTransitAddEtaPage
            .loadPage(officeInTitle)
            .select(answer)
            .submitPage()
  }

  // ^(?:I )?choose fill in the date and time on the 'When do you expect the transit to arrive in (.*), (.*)\?' page$
  def and(?I)?chooseFillInTheDateAndTimeOnThe'WhenDoYouExpectTheTransitToArriveInX,X\?'Page(office: String, country: String): Unit = {
    OfficeOfTransitEtaPage
          .loadPage(office, country)
          .fillInputs()
          .submitPage()
  }

  // ^(?:I )?(?:should )?have (.+) offices? of transit added on the 'You have added (.*) offices? of transit' page$
  def then(?I)?(?should)?have(.+)Offices?OfTransitAddedOnThe'YouHaveAddedXOffices?OfTransit'Page(numberOfOffices: String, _: String): Unit = {
    AddAnotherOfficeOfTransitPage
          .loadPage(numberOfOffices)
  }

  // ^(?:I )?choose radio option (.*) on the 'You have added (.*) offices? of transit' page$
  def and(?I)?chooseRadioOptionXOnThe'YouHaveAddedXOffices?OfTransit'Page(answer: String, numberOfCountriesInTitle: String): Unit = {
    AddAnotherOfficeOfTransitPage
            .loadPage(numberOfCountriesInTitle)
            .select(answer)
            .submitPage()
  }

  // ^(?:I )?choose to click on the (.*) link on the 'You have added (.*) offices? of transit' page$
  def and(?I)?chooseToClickOnTheXLinkOnThe'YouHaveAddedXOffices?OfTransit'Page(sectionLink: String, numberOfOfficeInTitle: String): Unit = {
    AddAnotherOfficeOfTransitPage
          .loadPage(numberOfOfficeInTitle)
          .clickByPartialLinkText(sectionLink)
  }

  // ^(?:I )?choose radio option (.*) on the 'Are you sure you want to remove this office of transit?\?' page$
  def and(?I)?chooseRadioOptionXOnThe'AreYouSureYouWantToRemoveThisOfficeOfTransit?\?'Page(answer: String): Unit = {
    ConfirmRemoveOfficeOfTransitPage
          .loadPage()
          .select(answer)
          .submitPage()
  }

  // ^(?:I )?choose to click on (.*) link on the add another office of transit page$
  def and(?I)?chooseToClickOnXLinkOnTheAddAnotherOfficeOfTransitPage(sectionLink: String): Unit = {
    AddAnotherOfficeOfTransitPage
          .clickByPartialLinkText(sectionLink)
  }

  // ^(?:I )?choose radio option (.*) on the confirm remove office of transit page$
  def and(?I)?chooseRadioOptionXOnTheConfirmRemoveOfficeOfTransitPage(answer: String): Unit = {
    ConfirmRemoveOfficeOfTransitPage
          .loadPage()
          .select(answer)
          .submitPage()
  }

  // ^(?:I )?choose to click on (.*) link on the 'No offices of transit' page$
  def and(?I)?chooseToClickOnXLinkOnThe'NoOfficesOfTransit'Page(sectionLink: String): Unit = {
    NoTransitOfficesPage
          .loadPage()
          .clickByPartialLinkText(sectionLink)
  }

  // ^(?:I )?choose to click on (.*) link on the Check your answers section (.*) page$
  def and(?I)?chooseToClickOnXLinkOnTheCheckYourAnswersSectionXPage(sectionLink: String, subheading: String): Unit = {
    CYAPage
            .loadPage(subheading)
            .clickByPartialLinkText(sectionLink)
  }

}
