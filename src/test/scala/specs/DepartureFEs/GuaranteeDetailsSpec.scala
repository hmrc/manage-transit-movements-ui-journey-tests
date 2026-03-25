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

import specs.BaseSpec
import org.scalatest.GivenWhenThen
import specsteps.CYAStepDefSteps.*
import specsteps.CommonStepDefSteps.*
import specsteps.DraftDepartureDeclarationsStepDefSteps.*
import specsteps.LoginStepDefSteps.*
import specsteps.PreTaskListStepDefSteps.*
import specsteps.ManageStepDefSteps.*
import specsteps.TaskListStepDefSteps.*
import specsteps.Departure_GuaranteeDetailsStepDefSteps.*

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
      andIrefreshThePage()

      And("I click on the View draft departure declarations link on the Manage your transit movements page")
      givenIclickOnTheLinkOnTheManageYourTransitMovementsPage("View draft departure declarations")

      And("I click on the link for LRN 1234567890GDGB on the 'Draft departure declarations' page")
      andIclickOnTheLinkForLRNXOnTheDraftDepartureDeclarationsPage("1234567890GDGB")

      Then("I should be on the Declaration summary page")
      thenIshouldbeOnTheDeclarationSummaryPage()

      And("I click the Add guarantee details link on the Declaration summary page")
      thenIclickTheLinkOnTheDeclarationSummaryPage("Add guarantee details")

      And("I choose radio option (A) Guarantee waiver by agreement on the Which type of guarantee is it? page")
      andIchooseRadioOptionXOnTheWhichTypeOfGuaranteeIsItPage("(A) Guarantee waiver by agreement")

      And("I choose radio option Yes on the You have added 1 guarantee page")
      whenIchooseRadioOptionXOnTheYouHaveAddedXGuaranteesPage("Yes", "1")

      // Guarantee 2
      And("I add a second guarantee type (1) Comprehensive guarantee")
      andIchooseRadioOptionXOnTheWhichTypeOfGuaranteeIsItPage("(1) Comprehensive guarantee")
      andIenterOnTheWhatIsTheGuaranteeReferenceNumberPage("01GB1234567890120A123456")
      andIselectOnTheWhatCurrencyDoYouWantToUseForTheLiabilityPage("GBP")
      andIenterOnTheHowMuchIsTheLiabilityInPoundsPage("0")
      andIchooseRadioOptionXOnTheDoYouWantToUseTheDefaultLiabilityAmountOf10000EurosPage("No")
      andIenterOnTheHowMuchIsTheLiabilityInPoundsPage("120.99")
      andIenterOnTheWhatIsTheAccessCodePage("AC01")
      andIsubmitOnTheCheckYourAnswersSectionXPage("Guarantee details")
      whenIchooseRadioOptionXOnTheYouHaveAddedXGuaranteesPage("Yes", "2")

      // Guarantee 3
      And("I add a third guarantee type (8) - Guarantee not required – exempt public body")
      andIchooseRadioOptionXOnTheWhichTypeOfGuaranteeIsItPage("(8) Guarantee not required – exempt public body")
      andIenterOnTheWhatIsTheReferencePage("01GB123456789012")
      andIselectOnTheWhatCurrencyDoYouWantToUseForTheLiabilityPage("GBP")
      andIenterOnTheHowMuchIsTheLiabilityInPoundsPage("0")
      andIchooseRadioOptionXOnTheDoYouWantToUseTheDefaultLiabilityAmountOf10000EurosPage("No")
      andIenterOnTheHowMuchIsTheLiabilityInPoundsPage("123")
      andIsubmitOnTheCheckYourAnswersSectionXPage("Guarantee details")
      whenIchooseRadioOptionXOnTheYouHaveAddedXGuaranteesPage("Yes", "3")

      // Guarantee 4
      And("I add forth guarantee type (3) Individual guarantee in cash")
      andIchooseRadioOptionXOnTheWhichTypeOfGuaranteeIsItPage("(3) Individual guarantee in cash")
      andIchooseRadioOptionXOnTheDoYouWantToAddAReferenceForTheGuaranteePage("Yes")
      andIenterOnTheWhatIsTheReferenceForTheGuaranteePage("01GB123456789012")
      andIselectOnTheWhatCurrencyDoYouWantToUseForTheLiabilityPage("GBP")
      andIenterOnTheHowMuchIsTheLiabilityInPoundsPage("0")
      andIchooseRadioOptionXOnTheDoYouWantToUseTheDefaultLiabilityAmountOf10000EurosPage("No")
      andIenterOnTheHowMuchIsTheLiabilityInPoundsPage("54.99")
      andIsubmitOnTheCheckYourAnswersSectionXPage("Guarantee details")
      whenIchooseRadioOptionXOnTheYouHaveAddedXGuaranteesPage("Yes", "4")

      // Guarantee 5
      And("I add fifth guarantee type (5) Guarantee waiver – secured for 500 euros or less")
      andIchooseRadioOptionXOnTheWhichTypeOfGuaranteeIsItPage("(5) Guarantee waiver – secured for 500 euros or less")
      andIselectOnTheWhatCurrencyDoYouWantToUseForTheLiabilityPage("GBP")
      andIenterOnTheHowMuchIsTheLiabilityInPoundsPage("54.99")
      andIsubmitOnTheCheckYourAnswersSectionXPage("Guarantee details")
      whenIchooseRadioOptionXOnTheYouHaveAddedXGuaranteesPage("Yes", "5")

      // Guarantee 6

      And("I add sixth guarantee type (4) Individual guarantee in the form of vouchers and remove one")
      andIchooseRadioOptionXOnTheWhichTypeOfGuaranteeIsItPage("(4) Individual guarantee in the form of vouchers")
      andIenterOnTheWhatIsTheGuaranteeReferenceNumberPage("01GB1234567890120A123456")
      andIselectOnTheWhatCurrencyDoYouWantToUseForTheLiabilityPage("GBP")
      andIenterOnTheHowMuchIsTheLiabilityInPoundsPage("200")
      andIenterOnTheWhatIsTheAccessCodePage("AC01")
      andIsubmitOnTheCheckYourAnswersSectionXPage("Guarantee details")
      andIclickTheXLinkOnTheYouHaveAddedXGuaranteesPage("Remove", "6")
      andIchooseRadioOptionXOnTheAreYouSureYouWantToRemoveThisGuaranteePage("Yes")
      whenIchooseRadioOptionXOnTheYouHaveAddedXGuaranteesPage("No", "5")
      thenIshouldbeOnTheDeclarationSummaryPage()
      andIshouldSeeXStatusForOnTheDeclarationSummaryPage("Completed", "guarantee details")
      andISignOut()

    }

    Scenario("02 Northern Ireland office of departure") {

      And("the user has submitted guaranteeDetailsXI.json for LRN 1234567890GDXI and EORI number 1234567890")
      whenTheUserHasSubmittedFileForLRNAndEORINumber("guaranteeDetailsXI.json", "1234567890GDXI", "1234567890")

      And("I refresh the page")
      andIrefreshThePage()

      And("I click on the View draft departure declarations link on the Manage your transit movements page")
      givenIclickOnTheLinkOnTheManageYourTransitMovementsPage("View draft departure declarations")

      And("I click on the link for LRN 1234567890GDXI on the 'Draft departure declarations' page")
      andIclickOnTheLinkForLRNXOnTheDraftDepartureDeclarationsPage("1234567890GDXI")

      Then("I should be on the Declaration summary page")
      thenIshouldbeOnTheDeclarationSummaryPage()

      And("I click the Add guarantee details link on the Declaration summary page")
      thenIclickTheLinkOnTheDeclarationSummaryPage("Add guarantee details")

      Then("I click the Continue button on the 'Guarantee added for TIR declaration' page")
      andIclickTheContinueButtonOnTheGuaranteeAddedForTIRDeclarationPage()

      Then("I should be on the 'Declaration summary' page")
      thenIshouldbeOnTheDeclarationSummaryPage()

      And("I should see Completed status for guarantee details on the Declaration summary page")
      andIshouldSeeXStatusForOnTheDeclarationSummaryPage("Completed", "guarantee details")

      And("I sign out")
      andISignOut()

    }
  }
}
