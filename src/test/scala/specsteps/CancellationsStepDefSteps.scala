package specsteps

import specpage.ConfirmCancellationPage
import uk.gov.hmrc.test.ui.cucumber.stepdefs.BaseStepDef
import uk.gov.hmrc.test.ui.pages.Cancellations.*

object CancellationsStepDefSteps {

  // ^(?:I )?choose radio option (.*) on the 'Are you sure you want to cancel this declaration\?' page$
  def andIChooseRadioOptionXOnTheAreYouSureYouWantToCancelThisDeclarationPage(answer: String): Unit = {
    ConfirmCancellationPage
          .loadPage()
          .select(answer)
          .submitPage()
  }

  // ^(?:I )?enter (.*) on the 'Why do you want to cancel this declaration\?' page$
  def andIEnterXOnTheWhyDoYouWantToCancelThisDeclarationPage(answer: String): Unit = {
    CancellationReasonPage
          .loadPage()
          .fillInput(answer)
          .submitPage()
  }

  // ^(?:I )?click on the (.+) link on the 'Cancellation request sent' page$
  def givenIClickOnTheLinkOnTheCancellationRequestSentPage(declarationLink: String): Unit = {
    CancellationRequestSentPage
          .loadPage()
          .selectDepartureDeclarationLink(declarationLink)
  }

}
