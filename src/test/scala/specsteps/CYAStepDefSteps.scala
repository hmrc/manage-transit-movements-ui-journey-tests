import uk.gov.hmrc.test.ui.pages.CYAPage
import uk.gov.hmrc.test.ui.pages.Departures.PreTaskList.GenericCYAPage

object CYAStepDefSteps {

  // ^(?:I )?should be on the 'Check your answers' page$
  def andIshouldBeOnTheCheckYourAnswersPage(): Unit = {
    CYAPage
          .loadPage()
  }

  // ^(?:I )?submit the 'Check your answers' page$
  def andIsubmitTheCheckYourAnswersPage(): Unit = {
    GenericCYAPage
          .loadPage()
          .submitPage()
  }

  // ^(?:I )?submit on the Check your answers section (.*) page$
  def andIsubmitOnTheCheckYourAnswersSectionXPage(subheading: String): Unit = {
    CYAPage
          .loadPage(subheading)
          .submitPage()
  }

  // ^(?:I )?click the Change link for (.+) on the 'Check your answers' page$
  def andIclickTheChangeLinkForOnTheCheckYourAnswersPage(text: String): Unit = {
    CYAPage
          .clickLinkById(text)
  }

  // ^(?:I )?click the Change link for (.+) on the (?:Transport details|Unloading|Route details|Trader details|Documents|Item 1|Guarantee details) 'Check your answers' page$
  def andIclickTheChangeLinkForOnTheTransportDetailsUnloadingRouteDetailsTraderDetailsDocumentsItem1GuaranteeDetailsCheckYourAnswersPage(text: String): Unit = {
    CYAPage
          .clickChangeLink(text)
  }

}
