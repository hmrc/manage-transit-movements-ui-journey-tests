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

import convertedSpecs.BaseSpec
import org.scalatest.GivenWhenThen
import specsteps.CYAStepDefSteps.*
import specsteps.CommonStepDefSteps.*
import specsteps.DepartureConfirmationStepDefSteps.*
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
      And("I choose radio option (1) Comprehensive guarantee on the 'Which type of guarantee is it?' page")
      andIchooseRadioOptionXOnTheWhichTypeOfGuaranteeIsItPage("(1) Comprehensive guarantee")

      And("I enter 01GB1234567890120A123456 on the 'What is the Guarantee Reference Number?' page")
      andIenterOnTheWhatIsTheGuaranteeReferenceNumberPage("01GB1234567890120A123456")

      And("I select GBP on the What currency do you want to use for the liability? page")
      andIselectOnTheWhatCurrencyDoYouWantToUseForTheLiabilityPage("GBP")

      And("I enter 0 on the How much is the liability in pounds? page")
      andIenterOnTheHowMuchIsTheLiabilityInPoundsPage("0")

      And("I choose radio option No on the Do you want to use the default liability amount of 10000 euros? page")
      andIchooseRadioOptionXOnTheDoYouWantToUseTheDefaultLiabilityAmountOf10000EurosPage("No")

      And("I enter 120.99 on the How much is the liability in pounds? page")
      andIenterOnTheHowMuchIsTheLiabilityInPoundsPage("120.99")

      And("I enter AC01 on the 'What is the access code?' page")
      andIenterOnTheWhatIsTheAccessCodePage("AC01")

      And("I submit on the Check your answers section Guarantee details page")
      andIsubmitOnTheCheckYourAnswersSectionXPage("Guarantee details")

      And("I choose radio option Yes on the You have added 2 guarantee page")
      whenIchooseRadioOptionXOnTheYouHaveAddedXGuaranteesPage("Yes", "2")

      // Guarantee 3
      And(
        "I choose radio option (8) Guarantee not required – exempt public body on the 'Which type of guarantee is it?' page"
      )
      andIchooseRadioOptionXOnTheWhichTypeOfGuaranteeIsItPage("(8) Guarantee not required – exempt public body")

      And("I enter 01GB123456789012 on the 'What is the reference?' page")
      andIenterOnTheWhatIsTheReferencePage("01GB123456789012")

      And("I select GBP on the What currency do you want to use for the liability? page")
      andIselectOnTheWhatCurrencyDoYouWantToUseForTheLiabilityPage("GBP")

      And("I enter 0 on the How much is the liability in pounds? page")
      andIenterOnTheHowMuchIsTheLiabilityInPoundsPage("0")

      And("I choose radio option No on the Do you want to use the default liability amount of 10000 euros? page")
      andIchooseRadioOptionXOnTheDoYouWantToUseTheDefaultLiabilityAmountOf10000EurosPage("No")

      And("I enter 123 on the How much is the liability in pounds? page")
      andIenterOnTheHowMuchIsTheLiabilityInPoundsPage("123")

      And("I submit on the Check your answers section Guarantee details page")
      andIsubmitOnTheCheckYourAnswersSectionXPage("Guarantee details")

      And("I choose radio option Yes on the You have added 3 guarantee page")
      whenIchooseRadioOptionXOnTheYouHaveAddedXGuaranteesPage("Yes", "3")

      // Guarantee 4
      And("I choose radio option (3) Individual guarantee in cash on the 'Which type of guarantee is it?' page")
      andIchooseRadioOptionXOnTheWhichTypeOfGuaranteeIsItPage("(3) Individual guarantee in cash")

      And("I choose radio option Yes on the 'Do you want to add a reference for the guarantee?' page")
      andIchooseRadioOptionXOnTheDoYouWantToAddAReferenceForTheGuaranteePage("Yes")

      And("I enter 01GB123456789012 on the 'What is the reference for the guarantee?' page")
      andIenterOnTheWhatIsTheReferenceForTheGuaranteePage("01GB123456789012")

      And("I select GBP on the What currency do you want to use for the liability? page")
      andIselectOnTheWhatCurrencyDoYouWantToUseForTheLiabilityPage("GBP")

      And("I enter 0 on the How much is the liability in pounds? page")
      andIenterOnTheHowMuchIsTheLiabilityInPoundsPage("0")

      And("I choose radio option No on the Do you want to use the default liability amount of 10000 euros? page")
      andIchooseRadioOptionXOnTheDoYouWantToUseTheDefaultLiabilityAmountOf10000EurosPage("No")

      And("I enter 54.99 on the How much is the liability in pounds? page")
      andIenterOnTheHowMuchIsTheLiabilityInPoundsPage("54.99")

      And("I submit on the Check your answers section Guarantee details page")
      andIsubmitOnTheCheckYourAnswersSectionXPage("Guarantee details")

      And("I choose radio option Yes on the You have added 4 guarantee page")
      whenIchooseRadioOptionXOnTheYouHaveAddedXGuaranteesPage("Yes", "4")

      // Guarantee 5
      And(
        "I choose radio option (5) Guarantee waiver – secured for 500 euros or less on the 'Which type of guarantee is it?' page"
      )
      andIchooseRadioOptionXOnTheWhichTypeOfGuaranteeIsItPage("(5) Guarantee waiver – secured for 500 euros or less")

      And("I select GBP on the What currency do you want to use for the liability? page")
      andIselectOnTheWhatCurrencyDoYouWantToUseForTheLiabilityPage("GBP")

      And("I enter 54.99 on the How much is the liability in pounds? page")
      andIenterOnTheHowMuchIsTheLiabilityInPoundsPage("54.99")

      And("I submit on the Check your answers section Guarantee details page")
      andIsubmitOnTheCheckYourAnswersSectionXPage("Guarantee details")

      And("I choose radio option Yes on the You have added 5 guarantee page")
      whenIchooseRadioOptionXOnTheYouHaveAddedXGuaranteesPage("Yes", "5")

      // Guarantee 6

      And(
        "I choose radio option (4) Individual guarantee in the form of vouchers on the 'Which type of guarantee is it?' page"
      )
      andIchooseRadioOptionXOnTheWhichTypeOfGuaranteeIsItPage("(4) Individual guarantee in the form of vouchers")

      And("And I enter 01GB1234567890120A123456 on the 'What is the Guarantee Reference Number?' page")
      andIenterOnTheWhatIsTheGuaranteeReferenceNumberPage("01GB1234567890120A123456")

      And("I select GBP on the What currency do you want to use for the liability? page")
      andIselectOnTheWhatCurrencyDoYouWantToUseForTheLiabilityPage("GBP")

      And("I enter 200 on the How much is the liability in pounds? page")
      andIenterOnTheHowMuchIsTheLiabilityInPoundsPage("200")

      And("I enter AC01 on the 'What is the access code?' page")
      andIenterOnTheWhatIsTheAccessCodePage("AC01")

      And("I submit on the Check your answers section Guarantee details page")
      andIsubmitOnTheCheckYourAnswersSectionXPage("Guarantee details")

      And(" I click the Remove link on the 'You have added 6 guarantees' page")
      andIclickTheXLinkOnTheYouHaveAddedXGuaranteesPage("Remove", "6")

      And("I choose radio option Yes on the Are you sure you want to remove this guarantee? page")
      andIchooseRadioOptionXOnTheAreYouSureYouWantToRemoveThisGuaranteePage("Yes")

      And("I choose radio option No on the You have added 5 guarantee page")
      whenIchooseRadioOptionXOnTheYouHaveAddedXGuaranteesPage("No", "5")

      Then("I should be on the 'Declaration summary' page")
      thenIshouldbeOnTheDeclarationSummaryPage()

      And("I should see Completed status for guarantee details on the Declaration summary page")
      andIshouldSeeXStatusForOnTheDeclarationSummaryPage("Completed", "guarantee details")

      And("I sign out")
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
