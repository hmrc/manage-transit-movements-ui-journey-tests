import uk.gov.hmrc.test.ui.cucumber.stepdefs.BaseStepDef
import uk.gov.hmrc.test.ui.pages.Departures.Confirmation.DepartureConfirmationPage

object DepartureConfirmationStepDefSteps {

  // ^(?:I )?click the (.+) link on the 'Departure declaration sent' page$
  def andIclickTheLinkOnTheDepartureDeclarationSentPage(link: String): Unit = {
    DepartureConfirmationPage
          .loadPage()
          .selectLink(link)
  }

  // ^(?:I )?(?:should )?be on the 'Departure declaration sent' page$
  def thenIshouldbeOnTheDepartureDeclarationSentPage(): Unit = {
    DepartureConfirmationPage
          .loadPage()
  }

}
