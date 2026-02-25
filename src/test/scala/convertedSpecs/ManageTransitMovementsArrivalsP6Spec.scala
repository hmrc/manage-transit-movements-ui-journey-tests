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

package convertedSpecs

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

import specsteps.ArrivalNotificationsStepDefSteps.*
import specsteps.CommonStepDefSteps.andISignOut
import specsteps.ManageStepDefSteps.*
import specsteps.UnloadingStepDefSteps.*
import specsteps.LoginStepDefSteps.andILoginWithIDX
import org.scalatest.GivenWhenThen

class ManageTransitMovementsArrivalsP6Spec extends BaseSpec with GivenWhenThen {

  Feature("Manage transit movements frontend tests for Arrivals") {

    Scenario("01 - Trader is able to view and make unloading remarks") {
      Given("I login with ID 1234567890")
      andILoginWithIDX("1234567890")

      When("I submit an Phase6 IE007 Arrival Notification")
      // Possible match (best=1.00)
      givenIsubmitAFile("Phase6 IE007 Arrival Notification")

      And("I submit an IE043 Unloading Permission With Seals")
      // Possible match (best=1.00)
      givenIsubmitAFile("IE043 Unloading Permission With Seals")

      When("I click on the View arrival notifications link on the Manage your transit movements page")
      // Possible match (best=0.95)
      givenIclickOnTheLinkOnTheManageYourTransitMovementsPage("View arrival notifications")
      // --- Other possible matches ---
      // givenIClickOnTheLinkOnTheArrivalNotificationsPage() [0.79] (ArrivalNotificationsStepDefSteps.scala) pattern: (?:I )?click on the (.+) link on the 'Arrival notifications' page

      And("I click on the Make unloading remarks link for MRN 25GB000246TK0E6WJ1 on the Arrival notifications page")
      // Possible match (best=0.90)
      andIClickOnTheXLinkForMRNXOnTheArrivalNotificationsPage("Make unloading remarks", "25GB000246TK0E6WJ1")
      // --- Other possible matches ---
      // givenIClickOnTheLinkOnTheArrivalNotificationsPage() [0.79] (ArrivalNotificationsStepDefSteps.scala) pattern: (?:I )?click on the (.+) link on the 'Arrival notifications' page

      Then("I should be on the Do you want to use the revised unloading procedure? page")
      // ⚠️ No step-def match found for: I should be on the Do you want to use the revised unloading procedure? page
      thenIshouldBeOnTheDoYouWantToUseTheRevisedUnloadingProcedurePage()

      And("I sign out")
      // Possible match (best=1.00)
      andISignOut()

    }

    Scenario("02 - Trader is able to view unloading remarks for all errors") {
      Given("I login with ID 1234567890")
      andILoginWithIDX("1234567890")

      When("I submit an Phase6 IE007 Arrival Notification")
      // Possible match (best=1.00)
      givenIsubmitAFile("Phase6 IE007 Arrival Notification")

      And("I submit an IE043 Unloading Permission With Seals")
      // Possible match (best=1.00)
      givenIsubmitAFile("IE043 Unloading Permission With Seals")

      And("I submit an IE044 Unloading Remarks Notification With Seals")
      // Possible match (best=1.00)
      givenIsubmitAFile("IE044 Unloading Remarks Notification With Seals")

      And("I submit an IE057 Unloading Remarks Rejection")
      // Possible match (best=1.00)
      givenIsubmitAFile("IE057 Unloading Remarks Rejection")

      When("I click on the View arrival notifications link on the Manage your transit movements page")
      // Possible match (best=0.95)
      givenIclickOnTheLinkOnTheManageYourTransitMovementsPage("View arrival notifications")
      // --- Other possible matches ---
      // givenIClickOnTheLinkOnTheArrivalNotificationsPage() [0.79] (ArrivalNotificationsStepDefSteps.scala) pattern: (?:I )?click on the (.+) link on the 'Arrival notifications' page

      Then("I should be on the Arrival notifications page")
      // Possible match (best=1.00)
      thenIShouldBeOnTheArrivalNotificationsPage()

      And("I click on the View errors link for MRN 25GB000246TK0E6WJ1 on the Arrival notifications page")
      // Possible match (best=0.90)
      andIClickOnTheXLinkForMRNXOnTheArrivalNotificationsPage("View errors", "25GB000246TK0E6WJ1")
      // --- Other possible matches ---
      // givenIClickOnTheLinkOnTheArrivalNotificationsPage() [0.79] (ArrivalNotificationsStepDefSteps.scala) pattern: (?:I )?click on the (.+) link on the 'Arrival notifications' page

      Then("I should be on the Review unloading remarks errors page")
      // Possible match (best=1.00)
      thenIshouldBeOnTheReviewUnloadingRemarksErrorsPage()

      And("I sign out")
      // Possible match (best=1.00)
      andISignOut()

    }

    Scenario("03 - Trader is able to view arrival notification rejections for all errors") {
      Given("I login with ID 1234567890")
      andILoginWithIDX("1234567890")

      When("I submit an Phase6 IE007 Arrival Notification")
      // Possible match (best=1.00)
      givenIsubmitAFile("Phase6 IE007 Arrival Notification")

      And("I submit an IE057 Arrival Notification Rejection")
      // Possible match (best=1.00)
      givenIsubmitAFile("IE057 Arrival Notification Rejection")

      When("I click on the View arrival notifications link on the Manage your transit movements page")
      // Possible match (best=0.95)
      givenIclickOnTheLinkOnTheManageYourTransitMovementsPage("View arrival notifications")
      // --- Other possible matches ---
      // givenIClickOnTheLinkOnTheArrivalNotificationsPage() [0.79] (ArrivalNotificationsStepDefSteps.scala) pattern: (?:I )?click on the (.+) link on the 'Arrival notifications' page

      Then("I should be on the Arrival notifications page")
      // Possible match (best=1.00)
      thenIShouldBeOnTheArrivalNotificationsPage()

      And("I click on the View errors link for MRN 25GB000246TK0E6WJ1 on the Arrival notifications page")
      // Possible match (best=0.90)
      andIClickOnTheXLinkForMRNXOnTheArrivalNotificationsPage("View errors", "25GB000246TK0E6WJ1")
      // --- Other possible matches ---
      // givenIClickOnTheLinkOnTheArrivalNotificationsPage() [0.79] (ArrivalNotificationsStepDefSteps.scala) pattern: (?:I )?click on the (.+) link on the 'Arrival notifications' page

      Then("I should be on the Review notification errors page")
      // Possible match (best=1.00)
      thenIShouldBeOnTheReviewNotificationErrorsPage()

      And("I sign out")
      // Possible match (best=1.00)
      andISignOut()

    }
  }
}
