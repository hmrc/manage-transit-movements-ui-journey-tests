import uk.gov.hmrc.test.ui.cucumber.stepdefs.BaseStepDef
import uk.gov.hmrc.test.ui.pages.GetGuaranteeBalance.*

object GetGuaranteeBalanceStepDefSteps {

  // ^(?:I )?(?:should )?be on the 'What is the Guarantee Reference Number\?' page$
  def then(?I)?(?should)?beOnThe'WhatIsTheGuaranteeReferenceNumber\?'Page(): Unit = {
    GuaranteeRefNumberPage
          .loadPage()
  }

  // ^(?:I )?enter (.+) on the Get Balance 'What is the Guarantee Reference Number\?' page$
  def then(?I)?enter(.+)OnTheGetBalance'WhatIsTheGuaranteeReferenceNumber\?'Page(answer: String): Unit = {
    GetBalanceGuaranteeRefNumberPage
            .loadPage()
            .fillInput(answer)
            .submitPage()
  }

  // ^(?:I )?enter (.+) on the Get Balance 'What is the access code\?' page$
  def and(?I)?enter(.+)OnTheGetBalance'WhatIsTheAccessCode\?'Page(answer: String): Unit = {
    GetBalanceGuaranteeAccessCodePage
          .loadPage()
          .fillInput(answer)
          .submitPage()
  }

  // ^(?:I )?submit on the Get Balance 'Check your answers' page$
  def and(?I)?submitOnTheGetBalance'CheckYourAnswers'Page(): Unit = {
    GetBalanceCYAPage
          .loadPage()
          .submitPage()
  }

  // ^(?:I )?click the (.+) link on the 'The Guarantee Reference Number and access code do not match' page$
  def and(?I)?clickThe(.+)LinkOnThe'TheGuaranteeReferenceNumberAndAccessCodeDoNotMatch'Page(link: String): Unit = {
    GetBalanceDetailsDoNotMatchPage
            .loadPage()
            .selectAction(link)
  }

  // ^(?:I )?click the (.+) link on the 'We could not check your guarantee balance' page$
  def and(?I)?clickThe(.+)LinkOnThe'WeCouldNotCheckYourGuaranteeBalance'Page(link: String): Unit = {
    GetBalanceCantCheckBalancePage
          .loadPage()
          .selectAction(link)
  }

  // ^(?:I )?I click the change link for (.+) on the 'Check your answers' page$
  def and(?I)?IClickTheChangeLinkFor(.+)OnThe'CheckYourAnswers'Page(linkText: String): Unit = {
    GetBalanceCYAPage
          .loadPage()
          .clickLinkByIdTextSplit(linkText)
  }

  // ^(?:I )?(?:should )?see a confirmation of my balance on the 'Available balance' page$
  def then(?I)?(?should)?seeAConfirmationOfMyBalanceOnThe'AvailableBalance'Page(): Unit = {
    GetBalanceAvailableBalanceConfirmationPage
          .loadPage()
  }

  // ^(?:I )?(?:should )?be on the 'We cannot get the balance for this type of guarantee' page$
  def then(?I)?(?should)?beOnThe'WeCannotGetTheBalanceForThisTypeOfGuarantee'Page(): Unit = {
    GetBalanceInvalidGuaranteePage
          .loadPage()
  }

}
