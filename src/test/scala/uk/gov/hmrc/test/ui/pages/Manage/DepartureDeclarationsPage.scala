package uk.gov.hmrc.test.ui.pages.Manage

import uk.gov.hmrc.test.ui.pages.Page

object DepartureDeclarationsPage extends Page {

   override def title(args: String*): String = "Departure declarations"

  def selectAction(link: String): this.type = {
    link match {
      case "View departure declarations"  => clickById("view-departure-declarations")
    }
    this
  }

  def selectActionType(linkText: String, lrn: String): Unit = {
    val id = s"${linkText.replace(" ", "-")}-$lrn"
    clickById(id)
  }

}
