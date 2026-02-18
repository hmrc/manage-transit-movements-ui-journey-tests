import uk.gov.hmrc.test.ui.cucumber.stepdefs.BaseStepDef
import uk.gov.hmrc.test.ui.pages.Departures.Transport.Authorisations.*

object TransportAuthorisationsStepDefSteps {

  // ^(?:I )?enter (.+) reference number on the 'What is the reference number for the (.+) authorisation\?' page$
  def andIenterReferenceNumberOnTheWhatIsTheReferenceNumberForTheAuthorisationPage(answer: String, authorisation: String): Unit = {
    AuthorisationRefNumberPage
          .loadPage(authorisation)
          .fillInput(answer)
          .submitPage()
  }

  // ^(?:I )?should have (.*) authorisations? on the 'You have added (.*) authorisations?' page$
  def thenIshouldHaveXAuthorisationsOnTheYouHaveAddedXAuthorisationsPage(numberOfAuthorisations: String): Unit = {
    AuthorisationAddAnotherPage
            .loadPage(numberOfAuthorisations)
  }

  // ^(?:I )?choose radio option (.*) on the 'You have added (.+) transport authorisations?' page$
  def whenIchooseRadioOptionXOnTheYouHaveAddedTransportAuthorisationsPage(answer: String, numberOfActors: String): Unit = {
    AuthorisationAddAnotherPage
            .loadPage(numberOfActors)
            .select(answer)
            .submitPage()
  }

  // ^(?:I )?choose radio option (.*) on the 'Which type of authorisation do you want to add' page$
  def andIchooseRadioOptionXOnTheWhichTypeOfAuthorisationDoYouWantToAddPage(answer: String): Unit = {
    AuthorisationTypePage
            .loadPage()
            .select(answer)
            .submitPage()
  }

  // ^(?:I )?choose to click on (.*) link on the 'You have added (.*) authorisations?' page$
  def whenIchooseToClickOnXLinkOnTheYouHaveAddedXAuthorisationsPage(sectionLink: String, numberOfAuthsInTitle: String): Unit = {
    AuthorisationAddAnotherPage
            .loadPage(numberOfAuthsInTitle)
            .clickByPartialLinkText(sectionLink)
  }

  // ^(?:I )?choose radio option (.*) for the 'Are you sure you want to remove this (.+) authorisation\?' page$
  def andIchooseRadioOptionXForTheAreYouSureYouWantToRemoveThisAuthorisationPage(answer: String, authorisationType: String): Unit = {
    RemoveAuthPage
          .loadPage(authorisationType)
          .select(answer)
          .submitPage()
  }

  // ^(?:I )?enter the date on the 'When do you expect the transit to arrive in (.*)\?' page$
  def andIenterTheDateOnTheWhenDoYouExpectTheTransitToArriveInXPage(officeOfDestination: String): Unit = {
    LimitDatePage
            .loadPage(officeOfDestination)
            .fillInputs()
            .submitPage()
  }

  // ^(?:I )?choose radio option (.*) on the 'Do you want to add an authorisation' page$
  def andIchooseRadioOptionXOnTheDoYouWantToAddAnAuthorisationPage(answer: String): Unit = {
    WantToAddAuthorisation
          .loadPage()
          .select(answer)
          .submitPage()
  }

  // ^(?:I )?choose radio option (.*) on the 'Do you want to add the arrival date at the office of destination' page$
  def andIchooseRadioOptionXOnTheDoYouWantToAddTheArrivalDateAtTheOfficeOfDestinationPage(answer: String): Unit = {
    WantToAddArrivalPage
          .loadPage()
          .select(answer)
          .submitPage()
  }

}
