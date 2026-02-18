import uk.gov.hmrc.test.ui.cucumber.stepdefs.BaseStepDef
import uk.gov.hmrc.test.ui.pages.Cancellations.ConfirmCancellationPage
import uk.gov.hmrc.test.ui.pages.Manage.ManageDepartures.*

object DepartureDeclarationsStepDefSteps {

  // ^(?:I )?(?:should )?be on the 'Departure declarations' page$
  def thenIshouldbeOnTheDepartureDeclarationsPage(): Unit = {
    DepartureDeclarationsPage
          .loadPage()
  }

  // ^(?:I )?click on the (.*) link for LRN (.*) on the 'Departure declarations' page
  def andIclickOnTheXLinkForLRNXOnTheDepartureDeclarationsPage(linkText: String, lrn: String): Unit = {
    DepartureDeclarationsPage
            .loadPage()
            .selectDepartureAction(linkText, lrn)
  }

  // ^(?:I )?click on the (.+) link on the 'Departure declarations' page$
  def givenIclickOnTheLinkOnTheDepartureDeclarationsPage(link: String): Unit = {
    DepartureDeclarationsPage
          .loadPage()
          .selectAction(link)
  }

  // ^(?:I )?enter (.+) in the Search field on the 'Departure declarations' page$
  def andIenterInTheSearchFieldOnTheDepartureDeclarationsPage(searchString: String): Unit = {
    DepartureDeclarationsPage
          .loadPage()
          .fillInput(searchString)
          .clickById("submit")
  }

  // ^(?:I )?should see the content (.*) on the 'Departure declarations' page$
  def andIshouldSeeTheContentXOnTheDepartureDeclarationsPage(content: String): Unit = {
    DepartureDeclarationsPage
          .loadPage()
          .checkForContent(content)
  }

  // ^(?:I )?click on the (.+) link on the 'Declaration errors' page$
  def givenIclickOnTheLinkOnTheDeclarationErrorsPage(declarationLink: String): Unit = {
    DeclarationErrorsPage
          .loadPage()
          .selectDepartureDeclarationLink(declarationLink)
  }

  // ^(?:I )?click on the Amend errors button on the 'Amend declaration errors' page$
  def givenIclickOnTheAmendErrorsButtonOnTheAmendDeclarationErrorsPage(): Unit = {
    AmendDeclarationErrorsPage
          .loadPage()
          .submitPage()
  }

  // ^(?:I )?click on the Amend errors button on the 'Amend guarantee errors' page$
  def givenIclickOnTheAmendErrorsButtonOnTheAmendGuaranteeErrorsPage(): Unit = {
    AmendGuaranteeErrorsPage
          .loadPage()
          .submitPage()
  }

  // ^(?:I )?(?:should )?be on the 'Review declaration errors' page$
  def thenIshouldbeOnTheReviewDeclarationErrorsPage(): Unit = {
    ReviewDeclarationErrorsPage
          .loadPage()
  }

  // ^(?:I )?(?:should )?be on the 'Review cancellation errors' page$
  def thenIshouldbeOnTheReviewCancellationErrorsPage(): Unit = {
    ReviewCancellationErrorsPage
          .loadPage()
  }

  // ^(?:I )?(?:should )?be on the 'Are you sure you want to cancel this declaration\?' page$
  def thenIshouldbeOnTheAreYouSureYouWantToCancelThisDeclarationPage(): Unit = {
    ConfirmCancellationPage
          .loadPage()
  }

  // ^(?:I )?(?:should )?be on the 'Declaration errors' page$
  def thenIshouldbeOnTheDeclarationErrorsPage(): Unit = {
    DeclarationNonFunctionalErrorsPage
          .loadPage()
  }

  // ^(?:I )?(?:should )?be on the 'Cancellation errors' page$
  def thenIshouldbeOnTheCancellationErrorsPage(): Unit = {
    CancellationErrorsPage
          .loadPage()
  }

  // ^(?:I )?(?:should )?be on the 'Goods being recovered' page$
  def thenIshouldbeOnTheGoodsBeingRecoveredPage(): Unit = {
    GoodsInRecoveryDetailsPage
          .loadPage()
  }

  // ^(?:I )?(?:should )?be on the 'Goods not released' page$
  def thenIshouldbeOnTheGoodsNotReleasedPage(): Unit = {
    GoodsNotReleasedDetailsPage
          .loadPage()
  }

  // ^(?:I )?(?:should )?be on the 'Confirmation needed to complete pre-lodged declaration' page$
  def thenIshouldbeOnTheConfirmationNeededToCompletePrelodgedDeclarationPage(): Unit = {
    ConfirmationNeededToCompleteDeclarationPage
          .loadPage()
  }

  // ^(?:I )?(?:should )?be on the Presentation Notification 'Check your answers' page$
  def thenIshouldbeOnThePresentationNotificationCheckYourAnswersPage(): Unit = {
    PreLodgeCYA
          .loadPage()
  }

  // ^(?:I )?(?:should )?be on the 'Prelodged declaration errors' page$
  def thenIshouldbeOnThePrelodgedDeclarationErrorsPage(): Unit = {
    PrelodgedDeclarationErrors
          .loadPage()
  }

  // ^(?:I )?(?:should )?be on the 'Review prelodged declaration errors' page$
  def thenIshouldbeOnTheReviewPrelodgedDeclarationErrorsPage(): Unit = {
    ReviewPrelodgedDeclarationErrors
          .loadPage()
  }

  // ^(?:I )?click on the (.+) link on the 'Review pre-lodged declaration errors' page$
  def givenIclickOnTheLinkOnTheReviewPrelodgedDeclarationErrorsPage(declarationLink: String): Unit = {
    ReviewPrelodgedDeclarationErrors
            .loadPage()
            .selectPrelodgeDepartureDeclarationLink(declarationLink)
  }

  // ^(?:I )?click on the (.+) link on the 'Prelodged declaration errors' page$
  def givenIclickOnTheLinkOnThePrelodgedDeclarationErrorsPage(declarationLink: String): Unit = {
    PrelodgedDeclarationErrors
          .loadPage()
          .selectPrelodgeDepartureDeclarationLink(declarationLink)
  }

  // ^(?:I )?(?:should )?be on the 'This declaration is no longer available' page$
  def thenIshouldbeOnTheThisDeclarationIsNoLongerAvailablePage(): Unit = {
    DeclarationNoLongerAvailablePage
          .loadPage()
  }

}
