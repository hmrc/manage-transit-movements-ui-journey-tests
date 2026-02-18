import uk.gov.hmrc.test.ui.cucumber.stepdefs.BaseStepDef
import uk.gov.hmrc.test.ui.pages.Manage.ManageArrivals.*

object ArrivalNotificationsStepDefSteps {

  // ^(?:I )?(?:should )?be on the 'Arrival notifications' page$
  def thenIShouldBeOnTheArrivalNotificationsPage(): Unit = {
    ArrivalNotificationsPage
          .loadPage()
  }

  // ^(?:I )?click on the (.*) link for MRN (.*) on the 'Arrival notifications' page$
  def andIClickOnTheXLinkForMRNXOnTheArrivalNotificationsPage(linkText: String, mrn: String): Unit = {
    ArrivalNotificationsPage
            .loadPage()
            .selectArrivalAction(linkText, mrn)
  }

  // ^(?:I )?click on the Make unloading remarks on the 'Review unloading remarks errors' page$
  def andIClickOnTheMakeUnloadingRemarksOnTheReviewUnloadingRemarksErrorsPage(): Unit = {
    ReviewUnloadingRemarksErrorsPage
          .clickById("submit")
  }

  // ^(?:I )?click on the (.+) link on the 'Arrival notifications' page$
  def givenIClickOnTheLinkOnTheArrivalNotificationsPage(link: String): Unit = {
    ArrivalNotificationsPage
          .loadPage()
          .selectAction(link)
  }

  // ^(?:I )?enter (.+) in the Search field on the 'Arrival notifications' page$
  def andIEnterInTheSearchFieldOnTheArrivalNotificationsPage(searchString: String): Unit = {
    ArrivalNotificationsPage
          .loadPage()
          .fillInput(searchString)
          .clickById("submit")
  }

  // ^(?:I )?should see the content (.*) on the 'Arrival notifications' page$
  def andIShouldSeeTheContentXOnTheArrivalNotificationsPage(content: String): Unit = {
    ArrivalNotificationsPage
          .loadPage()
          .checkForContent(content)
  }

  // ^(?:I )?should be on the 'Review notification errors' page$
  def thenIShouldBeOnTheReviewNotificationErrorsPage(): Unit = {
    ReviewNotificationErrorsPage
          .loadPage()
  }

  // ^(?:I )?click on the Make another arrival notification link on the 'Review notification errors' page$
  def thenIclickOnTheMakeAnotherArrivalNotificationLinkOnTheReviewNotificationErrorsPage(): Unit = {
    ReviewNotificationErrorsPage
            .loadPage()
            .clickById("arrival-link")
  }

  // ^(?:I )?should be on the 'Notification errors' page$
  def thenIshouldBeOnTheNotificationErrorsPage(): Unit = {
    NotificationErrorsPage
          .loadPage()
  }

  // ^(?:I )?should be on the 'Review unloading remarks errors' page$
  def thenIshouldBeOnTheReviewUnloadingRemarksErrorsPage(): Unit = {
    ReviewUnloadingRemarksErrorsPage
          .loadPage()
  }

  // ^(?:I )?should be on the 'Unloading remarks errors' page$
  def thenIshouldBeOnTheUnloadingRemarksErrorsPage(): Unit = {
    UnloadingRemarksErrors
          .loadPage()
  }

  // ^(?:I )?(?:should )?be on the 'This arrival notification is no longer available' page$
  def thenIshouldbeOnTheThisArrivalNotificationIsNoLongerAvailablePage(): Unit = {
    ArrivalNotificationNotAvailablePage
          .loadPage()
  }

}
