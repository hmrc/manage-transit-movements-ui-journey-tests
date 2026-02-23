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

import CYAStepDefSteps.*
import CommonStepDefSteps.*
import Departure_GuaranteeDetailsStepDefSteps.*
import GetGuaranteeBalanceStepDefSteps.*
import LoginStepDefSteps.*
import ManageStepDefSteps.*
import org.scalatest.GivenWhenThen
import org.scalatest.featurespec.AnyFeatureSpec
import org.scalatest.matchers.should.Matchers

class GetGuaranteeBalanceSpec extends AnyFeatureSpec with GivenWhenThen {

  Feature("Get Guarantee Balance frontend journey test") {

    Scenario("01 Trader is able to see their balance") {
      Given("I login with ID 1234567890")
      // Possible match (best=1.00)
      andILoginWithIDX("1234567890")

      And("I click on the Check your guarantee balance link on the Manage your transit movements page")
      // Possible match (best=0.95)
      givenIclickOnTheLinkOnTheManageYourTransitMovementsPage("")

      And("I enter 22GB1111111111113 on the Get Balance What is the Guarantee Reference Number? page")
      // Possible match (best=0.80)
      thenIenterOnTheGetBalanceWhatIsTheGuaranteeReferenceNumberPage("22GB1111111111113")
      // --- Other possible matches ---
      // andIenterOnTheWhatIsTheGuaranteeReferenceNumberPage() [0.79] (Departure_GuaranteeDetailsStepDefSteps.scala) pattern: (?:I )?enter (.+) on the 'What is the Guarantee Reference Number\?' page
      // andIenterOnTheWhatIsTheReferencePage() [0.78] (Departure_GuaranteeDetailsStepDefSteps.scala) pattern: (?:I )?enter (.+) on the 'What is the reference\?' page

      And("I enter x906 on the Get Balance What is the access code? page")
      // Possible match (best=0.85)
      andIenterOnTheWhatIsTheAccessCodePage("x906")
      // --- Other possible matches ---
      // andIenterOnTheGetBalanceWhatIsTheAccessCodePage() [0.85] (GetGuaranteeBalanceStepDefSteps.scala) pattern: (?:I )?enter (.+) on the Get Balance 'What is the access code\?' page
      // andIenterXOnTheWhatIsTheCommodityCodePage() [0.79] (ItemDetailsStepDefSteps.scala) pattern: (?:I )?enter (.*) on the 'What is the commodity code\?' page
      // andIenterOnTheWhatIsTheUCRPage() [0.78] (TransportDetailsStepDefSteps.scala) pattern: (?:I )?enter (.+) on the 'What is the UCR\?' page
      // andIenterOnTheWhatIsTheReferencePage() [0.78] (Departure_GuaranteeDetailsStepDefSteps.scala) pattern: (?:I )?enter (.+) on the 'What is the reference\?' page

      And("I submit on the Get Balance Check your answers page")
      // Possible match (best=1.00)
      andIsubmitOnTheGetBalanceCheckYourAnswersPage()

      And(
        "I click the Check your details and try again link on the The Guarantee Reference Number and access code do not match page"
      )
      // Possible match (best=0.96)
      andIclickTheLinkOnTheTheGuaranteeReferenceNumberAndAccessCodeDoNotMatchPage("Check your details and try again")

      And("I submit on the Get Balance Check your answers page")
      // Possible match (best=1.00)
      andIsubmitOnTheGetBalanceCheckYourAnswersPage()

      And(
        "I click the check your details are correct and try again link on the We could not check your guarantee balance page"
      )
      // Possible match (best=0.95)
      andIclickTheLinkOnTheWeCouldNotCheckYourGuaranteeBalancePage("check your details are correct and try again")

      And("I wait for 60 seconds")
      // Possible match (best=1.00)
      andIwaitForXSeconds(60)

      And("I click the change link for guarantee reference number on the Check your answers page")
      // Possible match (best=0.95)
      andIclickTheChangeLinkForOnTheCheckYourAnswersPage("change")
      // --- Other possible matches ---
      // andIClickTheChangeLinkForOnTheCheckYourAnswersPage() [0.80] (GetGuaranteeBalanceStepDefSteps.scala) pattern: (?:I )?I click the change link for (.+) on the 'Check your answers' page

      And("I enter 22GB1111111111112 on the Get Balance What is the Guarantee Reference Number? page")
      // Possible match (best=0.80)
      thenIenterOnTheGetBalanceWhatIsTheGuaranteeReferenceNumberPage("22GB1111111111112")
      // --- Other possible matches ---
      // andIenterOnTheWhatIsTheGuaranteeReferenceNumberPage() [0.79] (Departure_GuaranteeDetailsStepDefSteps.scala) pattern: (?:I )?enter (.+) on the 'What is the Guarantee Reference Number\?' page
      // andIenterOnTheWhatIsTheReferencePage() [0.78] (Departure_GuaranteeDetailsStepDefSteps.scala) pattern: (?:I )?enter (.+) on the 'What is the reference\?' page

      And("I click the change link for access code on the Check your answers page")
      // Possible match (best=0.95)
      andIclickTheChangeLinkForOnTheCheckYourAnswersPage("change")
      // --- Other possible matches ---
      // andIClickTheChangeLinkForOnTheCheckYourAnswersPage() [0.80] (GetGuaranteeBalanceStepDefSteps.scala) pattern: (?:I )?I click the change link for (.+) on the 'Check your answers' page

      And("I enter AB12 on the Get Balance What is the access code? page")
      // Possible match (best=0.80)
      andIenterOnTheGetBalanceWhatIsTheAccessCodePage("AB12")
      // --- Other possible matches ---
      // andIenterOnTheWhatIsTheAccessCodePage() [0.79] (Departure_GuaranteeDetailsStepDefSteps.scala) pattern: (?:I )?enter (.+) on the 'What is the access code\?' page

      And("I submit on the Get Balance Check your answers page")
      // Possible match (best=1.00)
      andIsubmitOnTheGetBalanceCheckYourAnswersPage()

      Then("I should see a confirmation of my balance on the Available balance page")
      // Possible match (best=1.00)
      thenIshouldseeAConfirmationOfMyBalanceOnTheAvailableBalancePage()

      And("I sign out")
      // Possible match (best=1.00)
      andISignOut()

    }

    Scenario("02 Invalid guarantee type") {
      Given("I login with ID 1234567890")
      // Possible match (best=1.00)
      andILoginWithIDX("1234567890")

      And("I click on the Check your guarantee balance link on the Manage your transit movements page")
      // Possible match (best=0.95)
      givenIclickOnTheLinkOnTheManageYourTransitMovementsPage("Check your guarantee balance")

      And("I enter 02GB1234567890120 on the Get Balance What is the Guarantee Reference Number? page")
      // Possible match (best=0.80)
      thenIenterOnTheGetBalanceWhatIsTheGuaranteeReferenceNumberPage("02GB1234567890120")
      // --- Other possible matches ---
      // andIenterOnTheWhatIsTheGuaranteeReferenceNumberPage() [0.79] (Departure_GuaranteeDetailsStepDefSteps.scala) pattern: (?:I )?enter (.+) on the 'What is the Guarantee Reference Number\?' page
      // andIenterOnTheWhatIsTheReferencePage() [0.78] (Departure_GuaranteeDetailsStepDefSteps.scala) pattern: (?:I )?enter (.+) on the 'What is the reference\?' page

      And("I enter AB12 on the Get Balance What is the access code? page")
      // Possible match (best=0.80)
      andIenterOnTheGetBalanceWhatIsTheAccessCodePage("AB12")
      // --- Other possible matches ---
      // andIenterOnTheWhatIsTheAccessCodePage() [0.79] (Departure_GuaranteeDetailsStepDefSteps.scala) pattern: (?:I )?enter (.+) on the 'What is the access code\?' page

      And("I submit on the Get Balance Check your answers page")
      // Possible match (best=1.00)
      andIsubmitOnTheGetBalanceCheckYourAnswersPage()

      Then("I should be on the We cannot get the balance for this type of guarantee page")
      // Possible match (best=1.00)
      thenIshouldbeOnTheWeCannotGetTheBalanceForThisTypeOfGuaranteePage()

      And("I sign out")
      // Possible match (best=1.00)
      andISignOut()

    }
  }
}
