import uk.gov.hmrc.test.ui.cucumber.stepdefs.BaseStepDef
import uk.gov.hmrc.test.ui.pages.Cancellations.ConfirmCancellationPage
import uk.gov.hmrc.test.ui.pages.Manage.ManageDepartures.*

object DepartureDeclarationsStepDefSteps {

  // ^(?:I )?(?:should )?be on the 'Departure declarations' page$
  def then(?I)?(?should)?beOnThe'DepartureDeclarations'Page(): Unit = {
    DepartureDeclarationsPage
          .loadPage()
  }

  // ^(?:I )?click on the (.*) link for LRN (.*) on the 'Departure declarations' page
  def and(?I)?clickOnTheXLinkForLRNXOnThe'DepartureDeclarations'Page(linkText: String, lrn: String): Unit = {
    DepartureDeclarationsPage
            .loadPage()
            .selectDepartureAction(linkText, lrn)
  }

  // ^(?:I )?click on the (.+) link on the 'Departure declarations' page$
  def given(?I)?clickOnThe(.+)LinkOnThe'DepartureDeclarations'Page(link: String): Unit = {
    DepartureDeclarationsPage
          .loadPage()
          .selectAction(link)
  }

  // ^(?:I )?enter (.+) in the Search field on the 'Departure declarations' page$
  def and(?I)?enter(.+)InTheSearchFieldOnThe'DepartureDeclarations'Page(searchString: String): Unit = {
    DepartureDeclarationsPage
          .loadPage()
          .fillInput(searchString)
          .clickById("submit")
  }

  // ^(?:I )?should see the content (.*) on the 'Departure declarations' page$
  def and(?I)?shouldSeeTheContentXOnThe'DepartureDeclarations'Page(content: String): Unit = {
    DepartureDeclarationsPage
          .loadPage()
          .checkForContent(content)
  }

  // ^(?:I )?click on the (.+) link on the 'Declaration errors' page$
  def given(?I)?clickOnThe(.+)LinkOnThe'DeclarationErrors'Page(declarationLink: String): Unit = {
    DeclarationErrorsPage
          .loadPage()
          .selectDepartureDeclarationLink(declarationLink)
  }

  // ^(?:I )?click on the Amend errors button on the 'Amend declaration errors' page$
  def given(?I)?clickOnTheAmendErrorsButtonOnThe'AmendDeclarationErrors'Page(): Unit = {
    AmendDeclarationErrorsPage
          .loadPage()
          .submitPage()
  }

  // ^(?:I )?click on the Amend errors button on the 'Amend guarantee errors' page$
  def given(?I)?clickOnTheAmendErrorsButtonOnThe'AmendGuaranteeErrors'Page(): Unit = {
    AmendGuaranteeErrorsPage
          .loadPage()
          .submitPage()
  }

  // ^(?:I )?(?:should )?be on the 'Review declaration errors' page$
  def then(?I)?(?should)?beOnThe'ReviewDeclarationErrors'Page(): Unit = {
    ReviewDeclarationErrorsPage
          .loadPage()
  }

  // ^(?:I )?(?:should )?be on the 'Review cancellation errors' page$
  def then(?I)?(?should)?beOnThe'ReviewCancellationErrors'Page(): Unit = {
    ReviewCancellationErrorsPage
          .loadPage()
  }

  // ^(?:I )?(?:should )?be on the 'Are you sure you want to cancel this declaration\?' page$
  def then(?I)?(?should)?beOnThe'AreYouSureYouWantToCancelThisDeclaration\?'Page(): Unit = {
    ConfirmCancellationPage
          .loadPage()
  }

  // ^(?:I )?(?:should )?be on the 'Declaration errors' page$
  def then(?I)?(?should)?beOnThe'DeclarationErrors'Page(): Unit = {
    DeclarationNonFunctionalErrorsPage
          .loadPage()
  }

  // ^(?:I )?(?:should )?be on the 'Cancellation errors' page$
  def then(?I)?(?should)?beOnThe'CancellationErrors'Page(): Unit = {
    CancellationErrorsPage
          .loadPage()
  }

  // ^(?:I )?(?:should )?be on the 'Goods being recovered' page$
  def then(?I)?(?should)?beOnThe'GoodsBeingRecovered'Page(): Unit = {
    GoodsInRecoveryDetailsPage
          .loadPage()
  }

  // ^(?:I )?(?:should )?be on the 'Goods not released' page$
  def then(?I)?(?should)?beOnThe'GoodsNotReleased'Page(): Unit = {
    GoodsNotReleasedDetailsPage
          .loadPage()
  }

  // ^(?:I )?(?:should )?be on the 'Confirmation needed to complete pre-lodged declaration' page$
  def then(?I)?(?should)?beOnThe'ConfirmationNeededToCompletePre-lodgedDeclaration'Page(): Unit = {
    ConfirmationNeededToCompleteDeclarationPage
          .loadPage()
  }

  // ^(?:I )?(?:should )?be on the Presentation Notification 'Check your answers' page$
  def then(?I)?(?should)?beOnThePresentationNotification'CheckYourAnswers'Page(): Unit = {
    PreLodgeCYA
          .loadPage()
  }

  // ^(?:I )?(?:should )?be on the 'Prelodged declaration errors' page$
  def then(?I)?(?should)?beOnThe'PrelodgedDeclarationErrors'Page(): Unit = {
    PrelodgedDeclarationErrors
          .loadPage()
  }

  // ^(?:I )?(?:should )?be on the 'Review prelodged declaration errors' page$
  def then(?I)?(?should)?beOnThe'ReviewPrelodgedDeclarationErrors'Page(): Unit = {
    ReviewPrelodgedDeclarationErrors
          .loadPage()
  }

  // ^(?:I )?click on the (.+) link on the 'Review pre-lodged declaration errors' page$
  def given(?I)?clickOnThe(.+)LinkOnThe'ReviewPre-lodgedDeclarationErrors'Page(declarationLink: String): Unit = {
    ReviewPrelodgedDeclarationErrors
            .loadPage()
            .selectPrelodgeDepartureDeclarationLink(declarationLink)
  }

  // ^(?:I )?click on the (.+) link on the 'Prelodged declaration errors' page$
  def given(?I)?clickOnThe(.+)LinkOnThe'PrelodgedDeclarationErrors'Page(declarationLink: String): Unit = {
    PrelodgedDeclarationErrors
          .loadPage()
          .selectPrelodgeDepartureDeclarationLink(declarationLink)
  }

  // ^(?:I )?(?:should )?be on the 'This declaration is no longer available' page$
  def then(?I)?(?should)?beOnThe'ThisDeclarationIsNoLongerAvailable'Page(): Unit = {
    DeclarationNoLongerAvailablePage
          .loadPage()
  }

}
