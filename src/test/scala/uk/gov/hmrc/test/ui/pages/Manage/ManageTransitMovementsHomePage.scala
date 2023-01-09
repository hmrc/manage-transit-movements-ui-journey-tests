package uk.gov.hmrc.test.ui.pages.Manage

import uk.gov.hmrc.test.ui.conf.TestConfiguration
import uk.gov.hmrc.test.ui.pages.Page

object ManageTransitMovementsHomePage extends Page {

  override def title(args: String*): String = "Manage your transit movements"

  override def loadPage(args: String*): this.type = {
    val url: String = TestConfiguration.url("manage-transit-movements-frontend") + "/what-do-you-want-to-do"
    driver.navigate().to(url)
    super.loadPage(args: _*)
  }

  def selectAction(link: String): this.type = {
    link match {
      case "Make a departure declaration" => clickById("make-departure-declaration")
      case "Make an arrival notification" => clickById("make-arrival-notification")
      case "Check your guarantee balance" => clickById("check-guarantee-balance")
    }
    this
  }
}
