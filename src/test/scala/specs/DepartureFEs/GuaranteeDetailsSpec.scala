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

package specs.DepartureFEs

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

import specpage.CommonPages.CYAPage
import specpage.CommonPages.CommonPage
import specpage.Departures.Guarantee.AddAnotherGuaranteePage
import specpage.Departures.Guarantee.ConfirmRemoveGuaranteePage
import specpage.Departures.Guarantee.GuaranteeAccessCodePage
import specpage.Departures.Guarantee.GuaranteeBForTIRDeclarationPage
import specpage.Departures.Guarantee.GuaranteeDefaultLiabilityPage
import specpage.Departures.Guarantee.GuaranteeLiabilityAmountPage
import specpage.Departures.Guarantee.GuaranteeLiabilityCurrencyPage
import specpage.Departures.Guarantee.GuaranteeReferenceNumberPage
import specpage.Departures.Guarantee.GuaranteeTypePage
import specpage.Departures.Guarantee.OtherGuarantee3ReferencePage
import specpage.Departures.Guarantee.OtherGuarantee8ReferencePage
import specpage.Departures.Guarantee.WantToAddReferenceForGuaranteePage
import specs.BaseSpec
import org.scalatest.GivenWhenThen
import specsteps.DraftDepartureDeclarationsStepDefSteps.*
import specsteps.LoginStepDefSteps.*
import specsteps.PreTaskListStepDefSteps.*
import specsteps.ManageStepDefSteps.*
import specsteps.TaskListStepDefSteps.*

class GuaranteeDetailsSpec extends BaseSpec with GivenWhenThen {

  override def beforeEach(): Unit = {
    dropCollections()
    deleteCookies()
    Given("I login with ID 1234567890")
    andILoginWithIDX("1234567890")
  }

  Feature("Guarantee details journey") {

    Scenario("01 Great Britain office of departure Guarantee types A/1/8/3/5 and 4 with remove guarantee") {
      And("the user has submitted guaranteeDetailsGB.json for LRN 1234567890GDGB and EORI number 1234567890")
      whenTheUserHasSubmittedFileForLRNAndEORINumber("guaranteeDetailsGB.json", "1234567890GDGB", "1234567890")

      And("I refresh the page")
      CommonPage.refreshPage()

      And("I click on the View draft departure declarations link on the Manage your transit movements page")
      givenIclickOnTheLinkOnTheManageYourTransitMovementsPage("View draft departure declarations")

      And("I click on the link for LRN 1234567890GDGB on the 'Draft departure declarations' page")
      andIclickOnTheLinkForLRNXOnTheDraftDepartureDeclarationsPage("1234567890GDGB")

      Then("I should be on the Declaration summary page")
      thenIshouldbeOnTheDeclarationSummaryPage()

      And("I click the Add guarantee details link on the Declaration summary page")
      thenIclickTheLinkOnTheDeclarationSummaryPage("Add guarantee details")

      And("I choose radio option (A) Guarantee waiver by agreement on the Which type of guarantee is it? page")
      GuaranteeTypePage.selectGuaranteeType("(A) Guarantee waiver by agreement")

      And("I choose radio option Yes on the You have added 1 guarantee page")
      AddAnotherGuaranteePage.answerAddAnother("Yes", "1")

      // Guarantee 2
      And("I add a second guarantee type (1) Comprehensive guarantee")
      GuaranteeTypePage.selectGuaranteeType("(1) Comprehensive guarantee")
      GuaranteeReferenceNumberPage.enterGuaranteeReference("01GB1234567890120A123456")
      GuaranteeLiabilityCurrencyPage.selectLiabilityCurrency("GBP")
      GuaranteeLiabilityAmountPage.enterLiabilityAmount("0")
      GuaranteeDefaultLiabilityPage.answerUseDefaultLiability("No")
      GuaranteeLiabilityAmountPage.enterLiabilityAmount("120.99")
      GuaranteeAccessCodePage.enterAccessCode("AC01")
      CYAPage.submitAnswers("Guarantee details")
      AddAnotherGuaranteePage.answerAddAnother("Yes", "2")

      // Guarantee 3
      And("I add a third guarantee type (8) - Guarantee not required – exempt public body")
      GuaranteeTypePage.selectGuaranteeType("(8) Guarantee not required – exempt public body")
      OtherGuarantee8ReferencePage.enterReference("01GB123456789012")
      GuaranteeLiabilityCurrencyPage.selectLiabilityCurrency("GBP")
      GuaranteeLiabilityAmountPage.enterLiabilityAmount("0")
      GuaranteeDefaultLiabilityPage.answerUseDefaultLiability("No")
      GuaranteeLiabilityAmountPage.enterLiabilityAmount("123")
      CYAPage.submitAnswers("Guarantee details")
      AddAnotherGuaranteePage.answerAddAnother("Yes", "3")

      // Guarantee 4
      And("I add forth guarantee type (3) Individual guarantee in cash")
      GuaranteeTypePage.selectGuaranteeType("(3) Individual guarantee in cash")
      WantToAddReferenceForGuaranteePage.answerAddReference("Yes")
      OtherGuarantee3ReferencePage.enterReference("01GB123456789012")
      GuaranteeLiabilityCurrencyPage.selectLiabilityCurrency("GBP")
      GuaranteeLiabilityAmountPage.enterLiabilityAmount("0")
      GuaranteeDefaultLiabilityPage.answerUseDefaultLiability("No")
      GuaranteeLiabilityAmountPage.enterLiabilityAmount("54.99")
      CYAPage.submitAnswers("Guarantee details")
      AddAnotherGuaranteePage.answerAddAnother("Yes", "4")

      // Guarantee 5
      And("I add fifth guarantee type (5) Guarantee waiver – secured for 500 euros or less")
      GuaranteeTypePage.selectGuaranteeType("(5) Guarantee waiver – secured for 500 euros or less")
      GuaranteeLiabilityCurrencyPage.selectLiabilityCurrency("GBP")
      GuaranteeLiabilityAmountPage.enterLiabilityAmount("54.99")
      CYAPage.submitAnswers("Guarantee details")
      AddAnotherGuaranteePage.answerAddAnother("Yes", "5")

      // Guarantee 6

      And("I add sixth guarantee type (4) Individual guarantee in the form of vouchers and remove one")
      GuaranteeTypePage.selectGuaranteeType("(4) Individual guarantee in the form of vouchers")
      GuaranteeReferenceNumberPage.enterGuaranteeReference("01GB1234567890120A123456")
      GuaranteeLiabilityCurrencyPage.selectLiabilityCurrency("GBP")
      GuaranteeLiabilityAmountPage.enterLiabilityAmount("200")
      GuaranteeAccessCodePage.enterAccessCode("AC01")
      CYAPage.submitAnswers("Guarantee details")
      AddAnotherGuaranteePage.followLink("Remove", "6")
      ConfirmRemoveGuaranteePage.confirmRemoval("Yes")
      AddAnotherGuaranteePage.answerAddAnother("No", "5")
      thenIshouldbeOnTheDeclarationSummaryPage()
      andIshouldSeeXStatusForOnTheDeclarationSummaryPage("Completed", "guarantee details")
      CommonPage.signOut()

    }

    Scenario("02 Northern Ireland office of departure") {

      And("the user has submitted guaranteeDetailsXI.json for LRN 1234567890GDXI and EORI number 1234567890")
      whenTheUserHasSubmittedFileForLRNAndEORINumber("guaranteeDetailsXI.json", "1234567890GDXI", "1234567890")

      And("I refresh the page")
      CommonPage.refreshPage()

      And("I click on the View draft departure declarations link on the Manage your transit movements page")
      givenIclickOnTheLinkOnTheManageYourTransitMovementsPage("View draft departure declarations")

      And("I click on the link for LRN 1234567890GDXI on the 'Draft departure declarations' page")
      andIclickOnTheLinkForLRNXOnTheDraftDepartureDeclarationsPage("1234567890GDXI")

      Then("I should be on the Declaration summary page")
      thenIshouldbeOnTheDeclarationSummaryPage()

      And("I click the Add guarantee details link on the Declaration summary page")
      thenIclickTheLinkOnTheDeclarationSummaryPage("Add guarantee details")

      Then("I click the Continue button on the 'Guarantee added for TIR declaration' page")
      GuaranteeBForTIRDeclarationPage.continueToNextPage()

      Then("I should be on the 'Declaration summary' page")
      thenIshouldbeOnTheDeclarationSummaryPage()

      And("I should see Completed status for guarantee details on the Declaration summary page")
      andIshouldSeeXStatusForOnTheDeclarationSummaryPage("Completed", "guarantee details")

      And("I sign out")
      CommonPage.signOut()

    }
  }
}
