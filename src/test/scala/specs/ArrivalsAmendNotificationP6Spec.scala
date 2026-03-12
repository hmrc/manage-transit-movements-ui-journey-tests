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

package specs

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

import specsteps.ArrivalNotificationsStepDefSteps.{andIClickOnTheXLinkForMRNXOnTheArrivalNotificationsPage, thenIShouldBeOnTheArrivalNotificationsPage, thenIShouldBeOnTheReviewNotificationErrorsPage}
import specsteps.CYAStepDefSteps.andIsubmitOnTheCheckYourAnswersSectionXPage
import specsteps.CommonStepDefSteps.andISignOut
import specsteps.ConfirmationStepDefSteps.thenIshouldbeOnTheArrivalNotificationSentPage
import specsteps.IdentificationStepDefSteps.andIenterOnTheMovementReferenceNumberPage
import specsteps.LoginStepDefSteps.andILoginWithIDX
import specsteps.ManageStepDefSteps.{givenIclickOnTheLinkOnTheManageYourTransitMovementsPage, givenIsubmitAFile}
import specsteps.PreTaskListStepDefSteps.whenTheUserHasSubmittedFileForMRNAndEORINumber
import org.scalatest.GivenWhenThen
import specsteps.ArrivalNotificationsStepDefSteps

class ArrivalsAmendNotificationP6Spec extends BaseSpec with GivenWhenThen {

  Feature("End to end journey for amending an arrival notification - Final") {

    Scenario("01 - Arrival rejected. Resubmit.") {
      Given("I login with ID 1234567890")
      andILoginWithIDX("1234567890")
      When("I submit an Phase6 IE007 Arrival Notification")
      givenIsubmitAFile("Phase6 IE007 Arrival Notification")
      And("I submit an IE057 Arrival Notification Rejection")
      givenIsubmitAFile("IE057 Arrival Notification Rejection")
      And("the user has submitted arrivalNotification.json for MRN 25GB000246TK0E6WJ1 and EORI number 1234567890")
      whenTheUserHasSubmittedFileForMRNAndEORINumber("arrivalNotification.json", "25GB000246TK0E6WJ1", "1234567890")
      When("I click on the View arrival notifications link on the Manage your transit movements page")
      givenIclickOnTheLinkOnTheManageYourTransitMovementsPage("View arrival notifications")
      Then("I should be on the Arrival notifications page")
      thenIShouldBeOnTheArrivalNotificationsPage()
      And("I click on the View errors link for MRN 25GB000246TK0E6WJ1 on the Arrival notifications page")
      andIClickOnTheXLinkForMRNXOnTheArrivalNotificationsPage("View errors", "25GB000246TK0E6WJ1")
      Then("I should be on the Review notification errors page")
      thenIShouldBeOnTheReviewNotificationErrorsPage()
      And("I click on the Make another arrival notification link on the Review notification errors page")
      ArrivalNotificationsStepDefSteps
        .thenIclickOnTheMakeAnotherArrivalNotificationLinkOnTheReviewNotificationErrorsPage()
      And("I enter 25GB000246TK0E6WJ1 on the Movement Reference Number page")
      andIenterOnTheMovementReferenceNumberPage("25GB000246TK0E6WJ1")
      And("I submit on the Check your answers section Arrivals page")
      andIsubmitOnTheCheckYourAnswersSectionXPage("Arrivals")
      And("I should be on the Arrival notification sent page")
      thenIshouldbeOnTheArrivalNotificationSentPage()

      And("I sign out")
      andISignOut()

    }
  }
}
