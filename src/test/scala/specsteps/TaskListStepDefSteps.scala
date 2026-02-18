import uk.gov.hmrc.test.ui.cucumber.stepdefs.BaseStepDef
import uk.gov.hmrc.test.ui.pages.Departures.DeclarationSummary.DeclarationSummaryPage

object TaskListStepDefSteps {

  // ^(?:I )?(?:should )?be on the 'Declaration summary' page$
  def thenIshouldbeOnTheDeclarationSummaryPage(): Unit = {
    DeclarationSummaryPage
          .loadPage()
  }

  // ^(?:I )?click the (.+) link on the 'Declaration summary' page$
  def thenIclickTheLinkOnTheDeclarationSummaryPage(answer: String): Unit = {
    DeclarationSummaryPage
          .loadPage()
          .selectDeclarationSection(answer)
  }

  // ^(?:I )?click on the (.+) link on the 'Declaration summary' page$
  def thenIclickOnTheLinkOnTheDeclarationSummaryPage(answer: String): Unit = {
    DeclarationSummaryPage
          .loadPage()
          .selectDeclarationSection(answer)
  }

  // ^(?:I )?should see (.*) status for (.+) on the 'Declaration summary' page$
  def andIshouldSeeXStatusForOnTheDeclarationSummaryPage(status: String, section: String): Unit = {
    DeclarationSummaryPage
            .checkStatus(section, status)
  }

  // ^(?:I )?click the (?:Confirm and resend|Confirm and send) button on the 'Declaration summary' page$
  def andIclickTheConfirmAndResendConfirmAndSendButtonOnTheDeclarationSummaryPage(): Unit = {
    DeclarationSummaryPage
          .loadPage()
          .submitPage()
  }

}
