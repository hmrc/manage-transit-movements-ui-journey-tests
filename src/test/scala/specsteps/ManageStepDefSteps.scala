import uk.gov.hmrc.test.ui.cucumber.stepdefs.BaseStepDef
import uk.gov.hmrc.test.ui.pages.Manage.*
import uk.gov.hmrc.test.ui.utils.ApiHelper

object ManageStepDefSteps {

  // ^(?:I )?submit an (.+)$
  def givenIsubmitAFile(filename: String): Unit = {
    ApiHelper.insertXML(filename)
  }

  // ^(?:I )?should be on the 'Manage your transit movements' page$
  def thenIshouldBeOnTheManageYourTransitMovementsPage(): Unit = {
    ManageTransitMovementsPage
          .loadPage()
  }

  // ^(?:I )?click on the (.+) link on the 'Manage your transit movements' page$
  def givenIclickOnTheLinkOnTheManageYourTransitMovementsPage(link: String): Unit = {
    ManageTransitMovementsPage
          .loadPage()
          .selectAction(link)
  }

  // ^(?:I )?should be on the 'Goods under control - document requested' page$
  def thenIshouldBeOnTheGoodsUnderControlDocumentRequestedPage(): Unit = {
    ManagedFEGoodsUnderControlDocumentsRequestedPage
          .loadPage()
  }

  // ^(?:I )?should be on the 'Goods under control' page$
  def thenIshouldBeOnTheGoodsUnderControlPage(): Unit = {
    ManagedFEGoodsUnderControlPage
          .loadPage()
  }

  // ^(?:I )?should be on the 'Intention to control - complete pre-lodged declaration' page$
  def thenIshouldBeOnTheIntentionToControlCompletePrelodgedDeclarationPage(): Unit = {
    ManagedFEPreLodgedGoodsUnderControlPage
          .loadPage()
  }

  // ^(?:I )?should be on the 'For your security we signed you out' page$
  def thenIshouldBeOnTheForYourSecurityWeSignedYouOutPage(): Unit = {
    ManagedFEForYourSecuritySignedOutPage
          .loadPage()
  }

}
