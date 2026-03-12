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

import specsteps.CYAStepDefSteps.*
import specsteps.CommonStepDefSteps.*
import specsteps.GetGuaranteeBalanceStepDefSteps.*
import specsteps.LoginStepDefSteps.*
import specsteps.ManageStepDefSteps.*
import org.scalatest.GivenWhenThen

class GetGuaranteeBalanceSpec extends BaseSpec with GivenWhenThen {

  Feature("Get Guarantee Balance frontend journey test") {

    Scenario("01 Trader is able to see their balance") {
      Given("I login with ID 1234567890")
      andILoginWithIDX("1234567890")

      And("I click on the Check your guarantee balance link on the Manage your transit movements page")
      givenIclickOnTheLinkOnTheManageYourTransitMovementsPage("Check your guarantee balance")

      And("I enter 22GB1111111111113 on the Get Balance What is the Guarantee Reference Number? page")
      thenIenterOnTheGetBalanceWhatIsTheGuaranteeReferenceNumberPage("22GB1111111111113")

      And("I enter x906 on the Get Balance What is the access code? page")
      andIenterOnTheGetBalanceWhatIsTheAccessCodePage("x906")

      And("I submit on the Get Balance Check your answers page")
      andIsubmitOnTheGetBalanceCheckYourAnswersPage()

      And(
        "I click the Check your details and try again link on the The Guarantee Reference Number and access code do not match page"
      )
      andIclickTheLinkOnTheTheGuaranteeReferenceNumberAndAccessCodeDoNotMatchPage("Check your details and try again")

      And("I submit on the Get Balance Check your answers page")
      andIsubmitOnTheGetBalanceCheckYourAnswersPage()

      And(
        "I click the check your details are correct and try again link on the We could not check your guarantee balance page"
      )
      andIclickTheLinkOnTheWeCouldNotCheckYourGuaranteeBalancePage("check your details are correct and try again")

      And("I wait for 60 seconds")
      andIwaitForXSeconds(60)

      And("I click the change link for guarantee reference number on the Check your answers page")
      andIclickTheChangeLinkForOnTheCheckYourAnswersPage("guarantee reference number")

      And("I enter 22GB1111111111112 on the Get Balance What is the Guarantee Reference Number? page")
      thenIenterOnTheGetBalanceWhatIsTheGuaranteeReferenceNumberPage("22GB1111111111112")

      And("I click the change link for access code on the Check your answers page")
      andIclickTheChangeLinkForOnTheCheckYourAnswersPage("access code")

      And("I enter AB12 on the Get Balance What is the access code? page")
      andIenterOnTheGetBalanceWhatIsTheAccessCodePage("AB12")

      And("I submit on the Get Balance Check your answers page")
      andIsubmitOnTheGetBalanceCheckYourAnswersPage()

      Then("I should see a confirmation of my balance on the Available balance page")
      thenIshouldseeAConfirmationOfMyBalanceOnTheAvailableBalancePage()

      And("I sign out")
      andISignOut()

    }

    Scenario("02 Invalid guarantee type") {
      Given("I login with ID 1234567890")
      andILoginWithIDX("1234567890")

      And("I click on the Check your guarantee balance link on the Manage your transit movements page")
      givenIclickOnTheLinkOnTheManageYourTransitMovementsPage("Check your guarantee balance")

      And("I enter 02GB1234567890120 on the Get Balance What is the Guarantee Reference Number? page")
      thenIenterOnTheGetBalanceWhatIsTheGuaranteeReferenceNumberPage("02GB1234567890120")

      And("I enter AB12 on the Get Balance What is the access code? page")
      andIenterOnTheGetBalanceWhatIsTheAccessCodePage("AB12")

      And("I submit on the Get Balance Check your answers page")
      andIsubmitOnTheGetBalanceCheckYourAnswersPage()

      Then("I should be on the We cannot get the balance for this type of guarantee page")
      thenIshouldbeOnTheWeCannotGetTheBalanceForThisTypeOfGuaranteePage()

      And("I sign out")
      andISignOut()

    }
  }
}
