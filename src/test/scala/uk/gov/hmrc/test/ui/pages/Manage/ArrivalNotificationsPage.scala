package uk.gov.hmrc.test.ui.pages.Manage

import uk.gov.hmrc.test.ui.pages.Page

object ArrivalNotificationsPage extends Page {

   override def title(args: String*): String = "Arrival notifications"

  def selectAction(link: String): this.type = {
    link match {
      case "Make an arrival notification" => clickById("make-arrival-notification")
    }
    this
  }

  def selectActionType(linkText: String, mrn: String): Unit = {
    val id = s"${linkText.replace (" ", "-")}-$mrn"
    clickById (id)
  }

}
