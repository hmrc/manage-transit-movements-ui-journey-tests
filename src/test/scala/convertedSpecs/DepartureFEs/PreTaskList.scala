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

package convertedSpecs.DepartureFEs

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

import org.scalatest.GivenWhenThen
import specsteps.LoginStepDefSteps.*
import specsteps.ManageStepDefSteps.*
import specsteps.PreTaskListStepDefSteps.*
import specsteps.CYAStepDefSteps.*
import specsteps.DepartureConfirmationStepDefSteps.*
import specsteps.TaskListStepDefSteps.*
import specsteps.CommonStepDefSteps.*
import convertedSpecs.BaseSpec

class PreTaskList extends BaseSpec with GivenWhenThen {

  override def beforeEach(): Unit = {
    dropCollections()
    deleteCookies()
    Given("I login with ID 1234567890")
    andILoginWithIDX("1234567890")
    When("I click on the Make a departure declaration link on the Manage your transit movements page")
    givenIclickOnTheLinkOnTheManageYourTransitMovementsPage("Make a departure declaration")
    And("I input a random LRN on the What is the Local Reference Number page")
    whenIInputARandomLRNOnTheWhatIsTheLocalReferenceNumberPage()
  }

  Feature("Pre task list journey") {

    Scenario("01 Great Britain office of departure (simplified)") {
      And("I choose radio option A on the Is this a standard or pre-lodged declaration page")
      andIchooseRadioOptionXOnTheIsThisAStandardOrPrelodgedDeclarationPage("A")
      
      And("I select GB on the Where is the office of departure page")
      andIselectOnTheWhereIsTheOfficeOfDeparturePage("GB")


      And("I choose radio option Simplified on the Which type of procedure are you using? page")
      andIchooseRadioOptionXOnTheWhichTypeOfProcedureAreYouUsingPage("Simplified")
      
      And("I choose radio option T2 on the Which type of declaration do you want to create? page")
      andIchooseRadioOptionXOnTheWhichTypeOfDeclarationDoYouWantToCreatePage("T2")
      
      And(
        "I choose radio option Exit summary declaration (EXS) on the Which type of safety and security details do you want to add? page"
      )
      andIchooseRadioOptionXOnTheWhichTypeOfSafetyAndSecurityDetailsDoYouWantToAddPage("Exit summary declaration (EXS)")

      And("I submit the Check your answers page")
      andIsubmitTheCheckYourAnswersPage()

      Then("I should be on the Declaration summary page")
      thenIshouldbeOnTheDeclarationSummaryPage()

      And("I sign out")
      andISignOut()
      
    }

    Scenario("02 Great Britain office of departure (normal)") {
      And("I choose radio option A on the Is this a standard or pre-lodged declaration page")
      andIchooseRadioOptionXOnTheIsThisAStandardOrPrelodgedDeclarationPage("A")

      And("I select GB on the Where is the office of departure page")
      andIselectOnTheWhereIsTheOfficeOfDeparturePage("GB")


      And("I choose radio option Normal on the Which type of procedure are you using? page")
      andIchooseRadioOptionXOnTheWhichTypeOfProcedureAreYouUsingPage("Normal")

      And("I choose radio option T1 on the Which type of declaration do you want to create? page")
      andIchooseRadioOptionXOnTheWhichTypeOfDeclarationDoYouWantToCreatePage("T1")

      And(
        "I choose radio option No security on the Which type of safety and security details do you want to add? page"
      )
      andIchooseRadioOptionXOnTheWhichTypeOfSafetyAndSecurityDetailsDoYouWantToAddPage("No security")

      And("I submit the Check your answers page")
      andIsubmitTheCheckYourAnswersPage()

      Then("I should be on the Declaration summary page")
      thenIshouldbeOnTheDeclarationSummaryPage()

      And("I sign out")
      andISignOut()
      
    }

    Scenario("03 Northern Ireland office of departure") {
      And("I choose radio option D on the Is this a standard or pre-lodged declaration page")
      andIchooseRadioOptionXOnTheIsThisAStandardOrPrelodgedDeclarationPage("D")

      And("I select XI on the Where is the office of departure page")
      andIselectOnTheWhereIsTheOfficeOfDeparturePage("XI")


      And("I choose radio option Normal on the Which type of procedure are you using? page")
      andIchooseRadioOptionXOnTheWhichTypeOfProcedureAreYouUsingPage("Normal")

      And("I choose radio option TIR on the Which type of declaration do you want to create? page")
      andIchooseRadioOptionXOnTheWhichTypeOfDeclarationDoYouWantToCreatePage("TIR")

      And("I enter 1234567 on the What is the TIR carnet reference? page")
      andIenterOnTheWhatIsTheTIRCarnetReferencePage("1234567")

      And(
        "I choose radio option Exit summary declaration (EXS) on the Which type of safety and security details do you want to add? page"
      )
      andIchooseRadioOptionXOnTheWhichTypeOfSafetyAndSecurityDetailsDoYouWantToAddPage("Exit summary declaration (EXS)")

      And("I submit the Check your answers page")
      andIsubmitTheCheckYourAnswersPage()

      Then("I should be on the Declaration summary page")
      thenIshouldbeOnTheDeclarationSummaryPage()

      And("I sign out")
      andISignOut()
    }
    
    
  }
}
