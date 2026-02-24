/*
 * Copyright 2026 HM Revenue & Customs
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package specsteps

/*
 * Copyright 2026 HM Revenue & Customs
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import specpage.ConfirmCancellationPage
import specpage.*

object DepartureDeclarationsStepDefSteps {

  // ^(?:I )?(?:should )?be on the 'Departure declarations' page$
  def thenIshouldbeOnTheDepartureDeclarationsPage(): Unit =
    ManagedFEDepartureDeclarationsPage
      .loadPage()

  // ^(?:I )?click on the (.*) link for LRN (.*) on the 'Departure declarations' page
  def andIclickOnTheXLinkForLRNXOnTheDepartureDeclarationsPage(linkText: String, lrn: String): Unit =
    ManagedFEDepartureDeclarationsPage
      .loadPage()
      .selectDepartureAction(linkText, lrn)

  // ^(?:I )?click on the (.+) link on the 'Departure declarations' page$
  def givenIclickOnTheLinkOnTheDepartureDeclarationsPage(link: String): Unit =
    ManagedFEDepartureDeclarationsPage
      .loadPage()
      .selectAction(link)

  // ^(?:I )?enter (.+) in the Search field on the 'Departure declarations' page$
  def andIenterInTheSearchFieldOnTheDepartureDeclarationsPage(searchString: String): Unit =
    ManagedFEDepartureDeclarationsPage
      .loadPage()
      .fillInput(searchString)
      .clickById("submit")

  // ^(?:I )?should see the content (.*) on the 'Departure declarations' page$
  def andIshouldSeeTheContentXOnTheDepartureDeclarationsPage(content: String): Unit =
    ManagedFEDepartureDeclarationsPage
      .loadPage()
      .checkForContent(content)

  // ^(?:I )?click on the (.+) link on the 'Declaration errors' page$
  def givenIclickOnTheLinkOnTheDeclarationErrorsPage(declarationLink: String): Unit =
    ManagedFEDeclarationErrorsPage
      .loadPage()
      .selectDepartureDeclarationLink(declarationLink)

  // ^(?:I )?click on the Amend errors button on the 'Amend declaration errors' page$
  def givenIclickOnTheAmendErrorsButtonOnTheAmendDeclarationErrorsPage(): Unit =
    ManagedFEAmendDeclarationErrorsPage
      .loadPage()
      .submitPage()

  // ^(?:I )?click on the Amend errors button on the 'Amend guarantee errors' page$
  def givenIclickOnTheAmendErrorsButtonOnTheAmendGuaranteeErrorsPage(): Unit =
    ManagedFEAmendGuaranteeErrorsPage
      .loadPage()
      .submitPage()

  // ^(?:I )?(?:should )?be on the 'Review declaration errors' page$
  def thenIshouldbeOnTheReviewDeclarationErrorsPage(): Unit =
    ManagedFEReviewDeclarationErrorsPage
      .loadPage()

  // ^(?:I )?(?:should )?be on the 'Review cancellation errors' page$
  def thenIshouldbeOnTheReviewCancellationErrorsPage(): Unit =
    ManagedFEReviewCancellationErrorsPage
      .loadPage()

  // ^(?:I )?(?:should )?be on the 'Are you sure you want to cancel this declaration\?' page$
  def thenIshouldbeOnTheAreYouSureYouWantToCancelThisDeclarationPage(): Unit =
    ConfirmCancellationPage
      .loadPage()

  // ^(?:I )?(?:should )?be on the 'Declaration errors' page$
  def thenIshouldbeOnTheDeclarationErrorsPage(): Unit =
    ManagedFEDeclarationNonFunctionalErrorsPage
      .loadPage()

  // ^(?:I )?(?:should )?be on the 'Cancellation errors' page$
  def thenIshouldbeOnTheCancellationErrorsPage(): Unit =
    ManagedFECancellationErrorsPage
      .loadPage()

  // ^(?:I )?(?:should )?be on the 'Goods being recovered' page$
  def thenIshouldbeOnTheGoodsBeingRecoveredPage(): Unit =
    ManagedFEGoodsInRecoveryDetailsPage
      .loadPage()

  // ^(?:I )?(?:should )?be on the 'Goods not released' page$
  def thenIshouldbeOnTheGoodsNotReleasedPage(): Unit =
    ManagedFEGoodsNotReleasedDetailsPage
      .loadPage()

  // ^(?:I )?(?:should )?be on the 'Confirmation needed to complete pre-lodged declaration' page$
  def thenIshouldbeOnTheConfirmationNeededToCompletePrelodgedDeclarationPage(): Unit =
    ManagedFEConfirmationNeededToCompleteDeclarationPage
      .loadPage()

  // ^(?:I )?(?:should )?be on the Presentation Notification 'Check your answers' page$
  def thenIshouldbeOnThePresentationNotificationCheckYourAnswersPage(): Unit =
    ManagedFEPreLodgeCYA
      .loadPage()

  // ^(?:I )?(?:should )?be on the 'Prelodged declaration errors' page$
  def thenIshouldbeOnThePrelodgedDeclarationErrorsPage(): Unit =
    ManagedFEPrelodgedDeclarationErrors
      .loadPage()

  // ^(?:I )?(?:should )?be on the 'Review prelodged declaration errors' page$
  def thenIshouldbeOnTheReviewPrelodgedDeclarationErrorsPage(): Unit =
    ManagedFEReviewPrelodgedDeclarationErrors
      .loadPage()

  // ^(?:I )?click on the (.+) link on the 'Review pre-lodged declaration errors' page$
  def givenIclickOnTheLinkOnTheReviewPrelodgedDeclarationErrorsPage(declarationLink: String): Unit =
    ManagedFEReviewPrelodgedDeclarationErrors
      .loadPage()
      .selectPrelodgeDepartureDeclarationLink(declarationLink)

  // ^(?:I )?click on the (.+) link on the 'Prelodged declaration errors' page$
  def givenIclickOnTheLinkOnThePrelodgedDeclarationErrorsPage(declarationLink: String): Unit =
    ManagedFEPrelodgedDeclarationErrors
      .loadPage()
      .selectPrelodgeDepartureDeclarationLink(declarationLink)

  // ^(?:I )?(?:should )?be on the 'This declaration is no longer available' page$
  def thenIshouldbeOnTheThisDeclarationIsNoLongerAvailablePage(): Unit =
    ManagedFEDeclarationNoLongerAvailablePage
      .loadPage()

}
