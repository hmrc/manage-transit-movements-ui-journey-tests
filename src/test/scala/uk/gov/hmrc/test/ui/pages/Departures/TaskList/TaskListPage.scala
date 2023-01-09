package uk.gov.hmrc.test.ui.pages.Departures.TaskList

import org.openqa.selenium.By
import org.scalatest.compatible.Assertion
import uk.gov.hmrc.test.ui.pages.Page

object TaskListPage extends Page {

  override def title(args: String*): String = "Declaration summary"

  def selectDeclarationSection(sectionLink: String): Unit =
    clickByPartialLinkText(sectionLink)

  def checkTraderDetailsStatus(status: String): Assertion =
    checkStatus("trader-details", status)

  def checkRouteDetailsStatus(status: String): Assertion =
    checkStatus("route-details", status)

  private def checkStatus(section: String, status: String): Assertion = {
    val statusFieldText: String = driver.findElement(By.id(s"$section-status")).getText
    statusFieldText shouldBe status
  }
}
