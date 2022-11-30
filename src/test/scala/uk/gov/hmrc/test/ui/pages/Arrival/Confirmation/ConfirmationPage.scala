package uk.gov.hmrc.test.ui.pages.Arrival.Confirmation

import uk.gov.hmrc.test.ui.pages.Page

object ConfirmationPage extends Page {

  override def title(args: String*): String = "Arrival notification sent"

  def selectNotificationLink(notificationLink: String): Unit =
    clickByPartialLinkText(notificationLink)

  def selectSignOutLink(signOutLink: String): Unit =
    clickByPartialLinkText(signOutLink)

}
