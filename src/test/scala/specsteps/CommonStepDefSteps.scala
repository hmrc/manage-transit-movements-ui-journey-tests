import uk.gov.hmrc.test.ui.pages.CommonPage

object CommonStepDefSteps {

  // ^(?:I )?wait for (.*) seconds$
  def andIwaitForXSeconds(t: Int): Unit = {
    CommonPage.wait(t)
  }

  // ^(?:I )?refresh the page$
  def andIrefreshThePage(): Unit = {
    CommonPage.refreshPage()
  }

  // ^I sign out$
  def andISignOut(): Unit = {
    CommonPage.clickLink("Sign out")
  }

}
