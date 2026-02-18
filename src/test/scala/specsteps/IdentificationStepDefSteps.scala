import uk.gov.hmrc.test.ui.cucumber.stepdefs.BaseStepDef
import uk.gov.hmrc.test.ui.pages.Arrivals.{Arrivals_AuthorisationsReferenceNumberPage, Arrivals_ConsigneeEoriTinPage, Arrivals_ErrorMovementReferenceNumberPage, Arrivals_MovementReferenceNumberPage, Arrivals_OfficeOfDestinationPage, Arrivals_ProcedureTypePage}
import uk.gov.hmrc.test.ui.pages.Arrivals.*

object IdentificationStepDefSteps {

  // ^(?:I )?choose radio option (.*) on the 'What type of procedure are you using\?' page$
  def andIchooseRadioOptionXOnTheWhatTypeOfProcedureAreYouUsingPage(answer: String): Unit = {
    Arrivals_ProcedureTypePage
            .loadPage()
            .select(answer)
            .submitPage()
  }

  // ^(?:I )?select (.+) on the arrival office of destination page$
  def andIselectOnTheArrivalOfficeOfDestinationPage(answer: String): Unit = {
    Arrivals_OfficeOfDestinationPage
          .loadPage()
          .select(answer)
          .submitPage()
  }

  // ^(?:I )?enter (.+) on the consignee eori tin page$
  def andIenterOnTheConsigneeEoriTinPage(answer: String): Unit = {
    Arrivals_ConsigneeEoriTinPage
          .loadPage()
          .fillInput(answer)
          .submitPage()
  }

  // ^(?:I )?enter (.+) on the Movement Reference Number page$
  def andIenterOnTheMovementReferenceNumberPage(answer: String): Unit = {
    Arrivals_MovementReferenceNumberPage
          .loadPage()
          .fillInput(answer)
          .submitPage()
  }

  // ^(?:I )?enter (.+) on the authorisations reference number page$
  def andIenterOnTheAuthorisationsReferenceNumberPage(answer: String): Unit = {
    Arrivals_AuthorisationsReferenceNumberPage
          .loadPage()
          .fillInput(answer)
          .submitPage()
  }

  // ^(?:I )?(?:should )?be on the What is the Movement Reference Number page$
  def thenIshouldbeOnTheWhatIsTheMovementReferenceNumberPage(): Unit = {
    Arrivals_MovementReferenceNumberPage
          .loadPage()
  }

  // ^(?:I )?(?:should )?see an error on the What is the Movement Reference Number page$
  def thenIshouldseeAnErrorOnTheWhatIsTheMovementReferenceNumberPage(): Unit = {
    Arrivals_ErrorMovementReferenceNumberPage
          .loadPage()
  }

}
