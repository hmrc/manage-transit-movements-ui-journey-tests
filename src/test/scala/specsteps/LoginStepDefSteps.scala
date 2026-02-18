import uk.gov.hmrc.test.ui.pages.{AuthorityWizardPage, SessionPage}

object LoginStepDefSteps {

  var bearerToken: String = ""
  var sessionId: String   = ""
  var arrivalId: String   = ""
  var departureId: String = ""
  var lrn: String         = ""

  // ^I login with ID (.*)$
  def andILoginWithIDX(id: String): Unit = {
    AuthorityWizardPage
          .loadPage()
          .fillInputs(id)
          .submitPage()

        SessionPage
          .loadPage()
          .saveBearerToken()
          .saveSessionId()
          .navigate()
  }

}
