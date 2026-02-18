import uk.gov.hmrc.test.ui.cucumber.stepdefs.BaseStepDef
import uk.gov.hmrc.test.ui.pages.Manage.ManageDepartures.{DeleteDraftDeclarationsPage, DraftDepartureDelcarationsPage}

object DraftDepartureDeclarationsStepDefSteps {

  // ^(?:I )?click on the link for LRN (.*) on the 'Draft departure declarations' page
  def andIclickOnTheLinkForLRNXOnTheDraftDepartureDeclarationsPage(link: String): Unit = {
    DraftDepartureDelcarationsPage
          .loadPage()
          .selectDraftDeclarationLink(link)
  }

  // ^(?:I )?click on the (.+) link on the 'Draft departure declarations' page$
  def givenIclickOnTheLinkOnTheDraftDepartureDeclarationsPage(link: String): Unit = {
    DraftDepartureDelcarationsPage
          .loadPage()
          .selectDraftDeclarationLink(link)
  }

  // ^(?:I )?click radio option (.*) on the 'Are you sure you want to delete this declaration\?' page$
  def andIclickRadioOptionXOnTheAreYouSureYouWantToDeleteThisDeclarationPage(answer: String): Unit = {
    DeleteDraftDeclarationsPage
            .loadPage()
            .select(answer)
            .submitPage()
  }

  // ^(?:I )?enter (.+) in the Search field on the 'Draft departure declarations' page$
  def andIenterInTheSearchFieldOnTheDraftDepartureDeclarationsPage(searchString: String): Unit = {
    DraftDepartureDelcarationsPage
            .loadPage()
            .fillInput(searchString)
            .clickById("submit")
  }

  // ^(?:I )?should see the content (.*) on the 'Draft departure declarations' page$
  def andIshouldSeeTheContentXOnTheDraftDepartureDeclarationsPage(content: String): Unit = {
    DraftDepartureDelcarationsPage
          .loadPage()
          .checkForContent(content)
  }

}
