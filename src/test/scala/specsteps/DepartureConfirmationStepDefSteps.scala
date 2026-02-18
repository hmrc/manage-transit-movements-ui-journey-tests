import uk.gov.hmrc.test.ui.cucumber.stepdefs.BaseStepDef
import uk.gov.hmrc.test.ui.pages.Departures.Confirmation.DepartureConfirmationPage

object DepartureConfirmationStepDefSteps {

  // ^(?:I )?click the (.+) link on the 'Departure declaration sent' page$
  def and(?I)?clickThe(.+)LinkOnThe'DepartureDeclarationSent'Page(link: String): Unit = {
    DepartureConfirmationPage
          .loadPage()
          .selectLink(link)
  }

  // ^(?:I )?(?:should )?be on the 'Departure declaration sent' page$
  def then(?I)?(?should)?beOnThe'DepartureDeclarationSent'Page(): Unit = {
    DepartureConfirmationPage
          .loadPage()
  }

}
