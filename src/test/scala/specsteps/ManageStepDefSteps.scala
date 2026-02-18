import uk.gov.hmrc.test.ui.cucumber.stepdefs.BaseStepDef
import uk.gov.hmrc.test.ui.pages.Manage.*
import uk.gov.hmrc.test.ui.pages.Manage.ManageDepartures.{ForYourSecuritySignedOutPage, GoodsUnderControlDocumentsRequestedPage, GoodsUnderControlPage, PreLodgedGoodsUnderControlPage}
import uk.gov.hmrc.test.ui.utils.ApiHelper

object ManageStepDefSteps {

  // ^(?:I )?submit an (.+)$
  def given(?I)?submitAn(.+)(filename: String): Unit = {
    ApiHelper.insertXML(filename)
  }

  // ^(?:I )?should be on the 'Manage your transit movements' page$
  def then(?I)?shouldBeOnThe'ManageYourTransitMovements'Page(): Unit = {
    ManageTransitMovementsPage
          .loadPage()
  }

  // ^(?:I )?click on the (.+) link on the 'Manage your transit movements' page$
  def given(?I)?clickOnThe(.+)LinkOnThe'ManageYourTransitMovements'Page(link: String): Unit = {
    ManageTransitMovementsPage
          .loadPage()
          .selectAction(link)
  }

  // ^(?:I )?should be on the 'Goods under control - document requested' page$
  def then(?I)?shouldBeOnThe'GoodsUnderControl-DocumentRequested'Page(): Unit = {
    GoodsUnderControlDocumentsRequestedPage
          .loadPage()
  }

  // ^(?:I )?should be on the 'Goods under control' page$
  def then(?I)?shouldBeOnThe'GoodsUnderControl'Page(): Unit = {
    GoodsUnderControlPage
          .loadPage()
  }

  // ^(?:I )?should be on the 'Intention to control - complete pre-lodged declaration' page$
  def then(?I)?shouldBeOnThe'IntentionToControl-CompletePre-lodgedDeclaration'Page(): Unit = {
    PreLodgedGoodsUnderControlPage
          .loadPage()
  }

  // ^(?:I )?should be on the 'For your security we signed you out' page$
  def then(?I)?shouldBeOnThe'ForYourSecurityWeSignedYouOut'Page(): Unit = {
    ForYourSecuritySignedOutPage
          .loadPage()
  }

}
