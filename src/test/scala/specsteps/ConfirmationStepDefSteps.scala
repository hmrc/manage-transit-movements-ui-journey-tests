import uk.gov.hmrc.test.ui.cucumber.stepdefs.BaseStepDef
import uk.gov.hmrc.test.ui.pages.Arrivals.Arrivals_ConfirmationPage

object ConfirmationStepDefSteps {

  // ^(?:I )?click the (.+) link on the Arrival notification sent page$
  def andIclickTheLinkOnTheArrivalNotificationSentPage(answer: String): Unit = {
    Arrivals_ConfirmationPage
          .loadPage()
          .selectNotificationLink(answer)
  }

  // ^(?:I )?(?:should )?be on the Arrival notification sent page$
  def thenIshouldbeOnTheArrivalNotificationSentPage(): Unit = {
    Arrivals_ConfirmationPage
          .loadPage()
  }

}
