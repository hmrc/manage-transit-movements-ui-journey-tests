package uk.gov.hmrc.test.ui.pages.Manage

import uk.gov.hmrc.test.ui.pages.StringPage

object DepartureDeclarationsPage extends StringPage {

   override def title(args: String*): String = "Departure declarations"

  def selectAction(link: String): this.type = {
    link match {
      case "Make a departure declaration"  => clickById("make-departure-declaration")
      case "Go to manage transit movements"  => clickById("go-to-manage-transit-movements")
      case "View all movements"  => clickById("go-to-view-all-movements")
    }
    this
  }

  def selectDepartureAction(linkText: String, lrn: String): Unit = {
    val id = s"${linkText.replace(" ", "-")}-$lrn"
    clickById(id)
  }

}
