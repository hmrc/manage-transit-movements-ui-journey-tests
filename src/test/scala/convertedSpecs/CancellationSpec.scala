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

import CommonStepDefSteps.*
import DepartureDeclarationsStepDefSteps.*
import LoginStepDefSteps.andILoginWithIDX
import ManageStepDefSteps.*
import org.scalatest.GivenWhenThen
import org.scalatest.featurespec.AnyFeatureSpec
import specsteps.CancellationsStepDefSteps.*

class CancellationSpec extends AnyFeatureSpec with GivenWhenThen {

  Feature("Cancellation frontend journey test") {

    Scenario("01 Trader is able to cancel a standard departure declaration") {
      Given("I login with ID 1234567890")
      // Possible match (best=1.00)
      andILoginWithIDX("1234567890")

      When("I submit an IE015 Departure Declaration")
      // Possible match (best=1.00)
      givenIsubmitAFile("IE015 Departure Declaration")

      Then("I submit an IE928 Positive Acknowledgment")
      // Possible match (best=1.00)
      givenIsubmitAFile("IE928 Positive Acknowledgment")

      Then("I submit an IE028 MRN Allocated")
      // Possible match (best=1.00)
      givenIsubmitAFile("IE028 MRN Allocated")

      And("I refresh the page")
      // Possible match (best=1.00)
      andIrefreshThePage()

      And("I click on the View departure declarations link on the Manage your transit movements page")
      // Possible match (best=0.95)
      givenIclickOnTheLinkOnTheManageYourTransitMovementsPage("View departure declarations")
      // --- Other possible matches ---
      // givenIclickOnTheLinkOnTheDepartureDeclarationsPage() [0.79] (DepartureDeclarationsStepDefSteps.scala) pattern: (?:I )?click on the (.+) link on the 'Departure declarations' page

      And("I click on the Cancel declaration link for LRN 25GB000246TK0E6WJ1 on the Departure declarations page")
      // Possible match (best=0.90)
      andIclickOnTheXLinkForLRNXOnTheDepartureDeclarationsPage("Cancel declaration", "25GB000246TK0E6WJ1")
      // --- Other possible matches ---
      // givenIclickOnTheLinkOnTheDepartureDeclarationsPage() [0.79] (DepartureDeclarationsStepDefSteps.scala) pattern: (?:I )?click on the (.+) link on the 'Departure declarations' page

      And("I choose radio option Yes on the Are you sure you want to cancel this declaration? page")
      // Possible match (best=0.81)
      andIChooseRadioOptionXOnTheAreYouSureYouWantToCancelThisDeclarationPage("Yes")

      And("I enter a cancellation reason, with a comma on the Why do you want to cancel this declaration? page")
      // Possible match (best=0.80)
      andIEnterXOnTheWhyDoYouWantToCancelThisDeclarationPage("a cancellation reason,")

      And("I click on the Check the status of departure declarations link on the Cancellation request sent page")
      // Possible match (best=0.94)
      givenIClickOnTheLinkOnTheCancellationRequestSentPage("Check the status of departure declarations")
      // --- Other possible matches ---
      // givenIclickOnTheLinkOnTheDepartureDeclarationsPage() [0.79] (DepartureDeclarationsStepDefSteps.scala) pattern: (?:I )?click on the (.+) link on the 'Departure declarations' page

      And("I sign out")
      // Possible match (best=1.00)
      andISignOut()

    }

    Scenario("02 Trader is able to cancel a pre-lodged departure declaration") {
      Given("I login with ID 1234567890")
      // Possible match (best=1.00)
      andILoginWithIDX("1234567890")

      When("I submit an IE015 Prelodged Departure Declaration")
      // Possible match (best=1.00)
      givenIsubmitAFile("IE015 Prelodged Departure Declaration")

      Then("I submit an IE928 Positive Acknowledgment")
      // Possible match (best=1.00)
      givenIsubmitAFile("IE928 Positive Acknowledgment")

      And("I refresh the page")
      // Possible match (best=1.00)
      andIrefreshThePage()

      And("I click on the View departure declarations link on the Manage your transit movements page")
      // Possible match (best=0.95)
      givenIclickOnTheLinkOnTheManageYourTransitMovementsPage("View departure declarations")
      // --- Other possible matches ---
      // givenIclickOnTheLinkOnTheDepartureDeclarationsPage() [0.79] (DepartureDeclarationsStepDefSteps.scala) pattern: (?:I )?click on the (.+) link on the 'Departure declarations' page

      And("I click on the Cancel declaration link for LRN 25GB000246TK0E6WJ1 on the Departure declarations page")
      // Possible match (best=0.90)
      andIclickOnTheXLinkForLRNXOnTheDepartureDeclarationsPage("Cancel declaration", "25GB000246TK0E6WJ1")
      // --- Other possible matches ---
      // givenIclickOnTheLinkOnTheDepartureDeclarationsPage() [0.79] (DepartureDeclarationsStepDefSteps.scala) pattern: (?:I )?click on the (.+) link on the 'Departure declarations' page

      And("I choose radio option Yes on the Are you sure you want to cancel this declaration? page")
      // Possible match (best=0.81)
      andIChooseRadioOptionXOnTheAreYouSureYouWantToCancelThisDeclarationPage("Yes")

      And("I enter a cancellation reason, with a comma on the Why do you want to cancel this declaration? page")
      // Possible match (best=0.80)
      andIEnterXOnTheWhyDoYouWantToCancelThisDeclarationPage("a cancellation reason, with a comma")

      And("I click on the Check the status of departure declarations link on the Cancellation request sent page")
      // Possible match (best=0.94)
      givenIClickOnTheLinkOnTheCancellationRequestSentPage("Check the status of departure declarations")
      // --- Other possible matches ---
      // givenIclickOnTheLinkOnTheDepartureDeclarationsPage() [0.79] (DepartureDeclarationsStepDefSteps.scala) pattern: (?:I )?click on the (.+) link on the 'Departure declarations' page

      And("I sign out")
      // Possible match (best=1.00)
      andISignOut()

    }
  }
}
