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

import specpage.*
import uk.gov.hmrc.test.ui.utils.ApiHelper

object ManageStepDefSteps {

  // ^(?:I )?submit an (.+)$
  def givenIsubmitAFile(filename: String): Unit =
    ApiHelper.insertXML(filename)

  // ^(?:I )?should be on the 'Manage your transit movements' page$
  def thenIshouldBeOnTheManageYourTransitMovementsPage(): Unit =
    ManageTransitMovementsPage
      .loadPage()

  // ^(?:I )?click on the (.+) link on the 'Manage your transit movements' page$
  def givenIclickOnTheLinkOnTheManageYourTransitMovementsPage(link: String): Unit =
    ManageTransitMovementsPage
      .loadPage()
      .selectAction(link)

  // ^(?:I )?should be on the 'Goods under control - document requested' page$
  def thenIshouldBeOnTheGoodsUnderControlDocumentRequestedPage(): Unit =
    ManagedFEGoodsUnderControlDocumentsRequestedPage
      .loadPage()

  // ^(?:I )?should be on the 'Goods under control' page$
  def thenIshouldBeOnTheGoodsUnderControlPage(): Unit =
    ManagedFEGoodsUnderControlPage
      .loadPage()

  // ^(?:I )?should be on the 'Intention to control - complete pre-lodged declaration' page$
  def thenIshouldBeOnTheIntentionToControlCompletePrelodgedDeclarationPage(): Unit =
    ManagedFEPreLodgedGoodsUnderControlPage
      .loadPage()

  // ^(?:I )?should be on the 'For your security we signed you out' page$
  def thenIshouldBeOnTheForYourSecurityWeSignedYouOutPage(): Unit =
    ManagedFEForYourSecuritySignedOutPage
      .loadPage()

}
