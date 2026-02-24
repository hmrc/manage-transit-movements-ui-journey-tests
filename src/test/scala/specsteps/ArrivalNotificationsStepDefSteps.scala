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

object ArrivalNotificationsStepDefSteps {

  // ^(?:I )?(?:should )?be on the 'Arrival notifications' page$
  def thenIShouldBeOnTheArrivalNotificationsPage(): Unit =
    ManagedFEArrivalNotificationsPage
      .loadPage()

  // ^(?:I )?click on the (.*) link for MRN (.*) on the 'Arrival notifications' page$
  def andIClickOnTheXLinkForMRNXOnTheArrivalNotificationsPage(linkText: String, mrn: String): Unit =
    ManagedFEArrivalNotificationsPage
      .loadPage()
      .selectArrivalAction(linkText, mrn)

  // ^(?:I )?click on the Make unloading remarks on the 'Review unloading remarks errors' page$
  def andIClickOnTheMakeUnloadingRemarksOnTheReviewUnloadingRemarksErrorsPage(): Unit =
    ManagedFEReviewUnloadingRemarksErrorsPage
      .clickById("submit")

  // ^(?:I )?click on the (.+) link on the 'Arrival notifications' page$
  def givenIClickOnTheLinkOnTheArrivalNotificationsPage(link: String): Unit =
    ManagedFEArrivalNotificationsPage
      .loadPage()
      .selectAction(link)

  // ^(?:I )?enter (.+) in the Search field on the 'Arrival notifications' page$
  def andIEnterInTheSearchFieldOnTheArrivalNotificationsPage(searchString: String): Unit =
    ManagedFEArrivalNotificationsPage
      .loadPage()
      .fillInput(searchString)
      .clickById("submit")

  // ^(?:I )?should see the content (.*) on the 'Arrival notifications' page$
  def andIShouldSeeTheContentXOnTheArrivalNotificationsPage(content: String): Unit =
    ManagedFEArrivalNotificationsPage
      .loadPage()
      .checkForContent(content)

  // ^(?:I )?should be on the 'Review notification errors' page$
  def thenIShouldBeOnTheReviewNotificationErrorsPage(): Unit =
    ManagedFEReviewNotificationErrorsPage
      .loadPage()

  // ^(?:I )?click on the Make another arrival notification link on the 'Review notification errors' page$
  def thenIclickOnTheMakeAnotherArrivalNotificationLinkOnTheReviewNotificationErrorsPage(): Unit =
    ManagedFEReviewNotificationErrorsPage
      .loadPage()
      .clickById("arrival-link")

  // ^(?:I )?should be on the 'Notification errors' page$
  def thenIshouldBeOnTheNotificationErrorsPage(): Unit =
    ManagedFENotificationErrorsPage
      .loadPage()

  // ^(?:I )?should be on the 'Review unloading remarks errors' page$
  def thenIshouldBeOnTheReviewUnloadingRemarksErrorsPage(): Unit =
    ManagedFEReviewUnloadingRemarksErrorsPage
      .loadPage()

  // ^(?:I )?should be on the 'Unloading remarks errors' page$
  def thenIshouldBeOnTheUnloadingRemarksErrorsPage(): Unit =
    ManagedFEUnloadingRemarksErrors
      .loadPage()

  // ^(?:I )?(?:should )?be on the 'This arrival notification is no longer available' page$
  def thenIshouldbeOnTheThisArrivalNotificationIsNoLongerAvailablePage(): Unit =
    ManagedFEArrivalNotificationNotAvailablePage
      .loadPage()

}
