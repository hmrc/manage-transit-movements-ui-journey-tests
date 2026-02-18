import uk.gov.hmrc.test.ui.cucumber.stepdefs.BaseStepDef
import uk.gov.hmrc.test.ui.pages.GetGuaranteeBalance.*

object GetGuaranteeBalanceStepDefSteps {

  // ^(?:I )?(?:should )?be on the 'What is the Guarantee Reference Number\?' page$
  def thenIshouldbeOnTheWhatIsTheGuaranteeReferenceNumberPage(): Unit = {
    GuaranteeRefNumberPage
          .loadPage()
  }

  // ^(?:I )?enter (.+) on the Get Balance 'What is the Guarantee Reference Number\?' page$
  def thenIenterOnTheGetBalanceWhatIsTheGuaranteeReferenceNumberPage(answer: String): Unit = {
    GetBalanceGuaranteeRefNumberPage
            .loadPage()
            .fillInput(answer)
            .submitPage()
  }

  // ^(?:I )?enter (.+) on the Get Balance 'What is the access code\?' page$
  def andIenterOnTheGetBalanceWhatIsTheAccessCodePage(answer: String): Unit = {
    GetBalanceGuaranteeAccessCodePage
          .loadPage()
          .fillInput(answer)
          .submitPage()
  }

  // ^(?:I )?submit on the Get Balance 'Check your answers' page$
  def andIsubmitOnTheGetBalanceCheckYourAnswersPage(): Unit = {
    GetBalanceCYAPage
          .loadPage()
          .submitPage()
  }

  // ^(?:I )?click the (.+) link on the 'The Guarantee Reference Number and access code do not match' page$
  def andIclickTheLinkOnTheTheGuaranteeReferenceNumberAndAccessCodeDoNotMatchPage(link: String): Unit = {
    GetBalanceDetailsDoNotMatchPage
            .loadPage()
            .selectAction(link)
  }

  // ^(?:I )?click the (.+) link on the 'We could not check your guarantee balance' page$
  def andIclickTheLinkOnTheWeCouldNotCheckYourGuaranteeBalancePage(link: String): Unit = {
    GetBalanceCantCheckBalancePage
          .loadPage()
          .selectAction(link)
  }

  // ^(?:I )?I click the change link for (.+) on the 'Check your answers' page$
  def andIClickTheChangeLinkForOnTheCheckYourAnswersPage(linkText: String): Unit = {
    GetBalanceCYAPage
          .loadPage()
          .clickLinkByIdTextSplit(linkText)
  }

  // ^(?:I )?(?:should )?see a confirmation of my balance on the 'Available balance' page$
  def thenIshouldseeAConfirmationOfMyBalanceOnTheAvailableBalancePage(): Unit = {
    GetBalanceAvailableBalanceConfirmationPage
          .loadPage()
  }

  // ^(?:I )?(?:should )?be on the 'We cannot get the balance for this type of guarantee' page$
  def thenIshouldbeOnTheWeCannotGetTheBalanceForThisTypeOfGuaranteePage(): Unit = {
    GetBalanceInvalidGuaranteePage
          .loadPage()
  }

}
