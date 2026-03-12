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

import specpage.*

object CancellationsStepDefSteps {

  def thenIshouldbeontheAreYouSureYouWantToCancelThisDeclaration(): Unit =
    ConfirmCancellationPage
      .loadPage()

  // ^(?:I )?choose radio option (.*) on the 'Are you sure you want to cancel this declaration\?' page$
  def andIChooseRadioOptionXOnTheAreYouSureYouWantToCancelThisDeclarationPage(answer: String): Unit =
    ConfirmCancellationPage
      .loadPage()
      .select(answer)
      .submitPage()

  // ^(?:I )?enter (.*) on the 'Why do you want to cancel this declaration\?' page$
  def andIEnterXOnTheWhyDoYouWantToCancelThisDeclarationPage(answer: String): Unit =
    CancellationReasonPage
      .loadPage()
      .fillInput(answer)
      .submitPage()

  // ^(?:I )?click on the (.+) link on the 'Cancellation request sent' page$
  def givenIClickOnTheLinkOnTheCancellationRequestSentPage(declarationLink: String): Unit =
    CancellationRequestSentPage
      .loadPage()
      .selectDepartureDeclarationLink(declarationLink)

}
