import uk.gov.hmrc.test.ui.cucumber.stepdefs.BaseStepDef
import uk.gov.hmrc.test.ui.pages.Departures.DeclarationSummary.DeclarationSummaryPage

object TaskListStepDefSteps {

  // ^(?:I )?(?:should )?be on the 'Declaration summary' page$
  def then(?I)?(?should)?beOnThe'DeclarationSummary'Page(): Unit = {
    DeclarationSummaryPage
          .loadPage()
  }

  // ^(?:I )?click the (.+) link on the 'Declaration summary' page$
  def then(?I)?clickThe(.+)LinkOnThe'DeclarationSummary'Page(answer: String): Unit = {
    DeclarationSummaryPage
          .loadPage()
          .selectDeclarationSection(answer)
  }

  // ^(?:I )?click on the (.+) link on the 'Declaration summary' page$
  def then(?I)?clickOnThe(.+)LinkOnThe'DeclarationSummary'Page(answer: String): Unit = {
    DeclarationSummaryPage
          .loadPage()
          .selectDeclarationSection(answer)
  }

  // ^(?:I )?should see (.*) status for (.+) on the 'Declaration summary' page$
  def and(?I)?shouldSeeXStatusFor(.+)OnThe'DeclarationSummary'Page(status: String, section: String): Unit = {
    DeclarationSummaryPage
            .checkStatus(section, status)
  }

  // ^(?:I )?click the (?:Confirm and resend|Confirm and send) button on the 'Declaration summary' page$
  def and(?I)?clickThe(?ConfirmAndResend|ConfirmAndSend)ButtonOnThe'DeclarationSummary'Page(): Unit = {
    DeclarationSummaryPage
          .loadPage()
          .submitPage()
  }

}
