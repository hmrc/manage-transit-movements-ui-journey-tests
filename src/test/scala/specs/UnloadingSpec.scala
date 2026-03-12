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

import specsteps.ArrivalNotificationsStepDefSteps.{andIClickOnTheMakeUnloadingRemarksOnTheReviewUnloadingRemarksErrorsPage, andIClickOnTheXLinkForMRNXOnTheArrivalNotificationsPage, thenIShouldBeOnTheArrivalNotificationsPage, thenIshouldBeOnTheReviewUnloadingRemarksErrorsPage}
import specsteps.CYAStepDefSteps.*
import specsteps.CommonStepDefSteps.andISignOut
import specsteps.LoginStepDefSteps.*
import specsteps.ManageStepDefSteps.*
import specsteps.UnloadingStepDefSteps.*
import org.scalatest.GivenWhenThen

class UnloadingSpec extends BaseSpec with GivenWhenThen {

  Feature("Submit unloading remarks with seals") {

    Scenario("01 - Unloading remarks with revised procedure and seals replaced by customs") {
      Given("I login with ID 1234567890")
      andILoginWithIDX("1234567890")

      When("I submit an Phase6 IE007 Arrival Notification")
      givenIsubmitAFile("Phase6 IE007 Arrival Notification")

      And("I submit an IE043 Unloading Permission With Seals")
      givenIsubmitAFile("IE043 Unloading Permission With Seals")

      When("I click on the View arrival notifications link on the Manage your transit movements page")
      givenIclickOnTheLinkOnTheManageYourTransitMovementsPage("View arrival notifications")

      And("I click on the Make unloading remarks link for MRN 25GB000246TK0E6WJ1 on the Arrival notifications page")
      andIClickOnTheXLinkForMRNXOnTheArrivalNotificationsPage("Make unloading remarks", "25GB000246TK0E6WJ1")

      And("I choose radio option Yes on the Do you want to use the revised unloading procedure? page")
      andIchooseRadioOptionXOnTheDoYouWantToUseTheRevisedUnloadingProcedurePage("Yes")

      And("I choose radio option Yes on the Conditions for using the revised unloading procedure page")
      andIchooseRadioOptionXOnTheConditionsForUsingTheRevisedUnloadingProcedurePage("Yes")

      And("I choose radio option No on the Are the goods too large to fit into a container? page")
      andIchooseRadioOptionXOnTheAreTheGoodsTooLargeToFitIntoAContainerPage("No")

      Then("I click the Continue button on the Download the unloading permission page")
      andIclickTheContinueButtonOnTheDownloadTheUnloadingPermissionPage()

      And("I click the Continue button on the Take a photograph of the external seal before it is broken page")
      andIclickTheContinueButtonOnTheTakeAPhotographOfTheExternalSealBeforeItIsBrokenPage()

      And("I choose radio option No on the Has the external seal been replaced by a customs authority? page")
      andIchooseRadioOptionXOnTheHasTheExternalSealBeenReplacedByACustomsAuthorityPage("No")

      And("I enter Seal1 on the What is the identification number for the external seal? page")
      andIenterOnTheWhatIsTheIdentificationNumberForTheExternalSealPage("Seal1")

      And(
        "I click the Change link for Has the external seal been replaced by a customs authority? on the Unloading Check your answers page"
      )
      andIclickTheChangeLinkForOnTheTransportDetailsUnloadingRouteDetailsTraderDetailsDocumentsItem1GuaranteeDetailsCheckYourAnswersPage(
        "Has the external seal been replaced by a customs authority?"
      )

      And("I choose radio option Yes on the Has the external seal been replaced by a customs authority? page")
      andIchooseRadioOptionXOnTheHasTheExternalSealBeenReplacedByACustomsAuthorityPage("Yes")

      And("I enter NewSeal1 on the What is the identification number for the replacement external seal? page")
      andIenterOnTheWhatIsTheIdentificationNumberForTheReplacementExternalSealPage("NewSeal1")

      And("I submit the Check your answers page")
      andIsubmitTheCheckYourAnswersPage()

      And("I should be on the Unloading remarks sent page")
      thenIshouldbeOnTheUnloadingRemarksSentPage()

    }

    Scenario("02 - Unloading remarks with new agreement to old procedure and no discrepancies") {
      Given("I login with ID 1234567890")
      andILoginWithIDX("1234567890")

      When("I submit an Phase6 IE007 Arrival Notification")
      givenIsubmitAFile("Phase6 IE007 Arrival Notification")

      And("I submit an IE043 Unloading Permission With Seals")
      givenIsubmitAFile("IE043 Unloading Permission With Seals")

      When("I click on the View arrival notifications link on the Manage your transit movements page")
      givenIclickOnTheLinkOnTheManageYourTransitMovementsPage("View arrival notifications")

      And("I click on the Make unloading remarks link for MRN 25GB000246TK0E6WJ1 on the Arrival notifications page")
      andIClickOnTheXLinkForMRNXOnTheArrivalNotificationsPage("Make unloading remarks", "25GB000246TK0E6WJ1")

      And("I choose radio option Yes on the Do you want to use the revised unloading procedure? page")
      andIchooseRadioOptionXOnTheDoYouWantToUseTheRevisedUnloadingProcedurePage("Yes")

      And("I choose radio option Yes on the Conditions for using the revised unloading procedure page")
      andIchooseRadioOptionXOnTheConditionsForUsingTheRevisedUnloadingProcedurePage("Yes")

      And("I choose radio option Yes on the Are the goods too large to fit into a container? page")
      andIchooseRadioOptionXOnTheAreTheGoodsTooLargeToFitIntoAContainerPage("Yes")

      Then("I click the Continue button on the Check the goods and note any discrepancies page")
      andIclickTheContinueButtonOnTheCheckTheGoodsAndNoteAnyDiscrepanciesPage()

      And(
        "I choose radio option Yes on the Were there any discrepancies between the transit movement and unloading permission? page"
      )
      andIchooseRadioOptionXOnTheWereThereAnyDiscrepanciesBetweenTheTransitMovementAndUnloadingPermissionPage("Yes")

      Then("I click the Continue button on the You cannot use the revised unloading procedure page")
      andIclickTheContinueButtonOnTheYouCannotUseTheRevisedUnloadingProcedurePage()

      And("I choose radio option Yes on the Are all the seal identification numbers or marks readable? page")
      andIchooseRadioOptionXOnTheAreAllTheSealIdentificationNumbersOrMarksReadablePage("Yes")

      And("I choose radio option No on the Are any of the seals broken? page")
      andIchooseRadioOptionXOnTheAreAnyOfTheSealsBrokenPage("No")

      And(
        "I click the Continue button on the Enter the discrepancies between the transit movement and unloading permission page"
      )
      andIclickTheContinueButtonOnTheEnterTheDiscrepanciesBetweenTheTransitMovementAndUnloadingPermissionPage()

      And("I enter remarks on the Enter your comments page")
      andIenterXOnTheEnterYourCommentsPage("remarks")

      And("I choose radio option No on the Do you have anything else to report? page")
      andIchooseRadioOptionXOnTheDoYouHaveAnythingElseToReportPage("No")

      And("I submit the Check your answers page")
      andIsubmitTheCheckYourAnswersPage()

      And("I should be on the Unloading remarks sent page")
      thenIshouldbeOnTheUnloadingRemarksSentPage()

    }

    Scenario(
      "03 - Unloading remarks attempt to use revised procedure, with changes to summary answers & add/remove comment & adds new seals and changes the check seals section from CYA page"
    ) {
      Given("I login with ID 1234567890")
      andILoginWithIDX("1234567890")

      When("I submit an Phase6 IE007 Arrival Notification")
      givenIsubmitAFile("Phase6 IE007 Arrival Notification")

      And("I submit an IE043 Unloading Permission With Seals")
      givenIsubmitAFile("IE043 Unloading Permission With Seals")

      When("I click on the View arrival notifications link on the Manage your transit movements page")
      givenIclickOnTheLinkOnTheManageYourTransitMovementsPage("View arrival notifications")

      And("I click on the Make unloading remarks link for MRN 25GB000246TK0E6WJ1 on the Arrival notifications page")
      andIClickOnTheXLinkForMRNXOnTheArrivalNotificationsPage("Make unloading remarks", "25GB000246TK0E6WJ1")

      And("I choose radio option Yes on the Do you want to use the revised unloading procedure? page")
      andIchooseRadioOptionXOnTheDoYouWantToUseTheRevisedUnloadingProcedurePage("Yes")

      And("I choose radio option No on the Conditions for using the revised unloading procedure page")
      andIchooseRadioOptionXOnTheConditionsForUsingTheRevisedUnloadingProcedurePage("No")

      And("I click the Continue button on the You cannot use the revised unloading procedure page")
      andIclickTheContinueButtonOnTheYouCannotUseTheRevisedUnloadingProcedurePage()

      Then("I click the Continue button on the Unload the goods and note any discrepancies page")
      andIclickTheContinueButtonOnTheUnloadTheGoodsAndNoteAnyDiscrepanciesPage()

      And("I choose radio option fully on the Have you fully or partially unloaded the goods? page")
      andIchooseRadioOptionXOnTheHaveYouFullyOrPartiallyUnloadedTheGoodsPage("fully")

      And("I fill in the date on the When were the goods unloaded? page")
      andIfillInTheDateOnTheWhenWereTheGoodsUnloadedPage()

      And("I choose radio option Yes on the Are all the seal identification numbers or marks readable? page")
      andIchooseRadioOptionXOnTheAreAllTheSealIdentificationNumbersOrMarksReadablePage("Yes")

      And("I choose radio option No on the Are any of the seals broken? page")
      andIchooseRadioOptionXOnTheAreAnyOfTheSealsBrokenPage("No")

      And(
        "I choose radio option Yes on the Were there any discrepancies between the transit movement and unloading permission? page"
      )
      andIchooseRadioOptionXOnTheWereThereAnyDiscrepanciesBetweenTheTransitMovementAndUnloadingPermissionPage("Yes")

      And(
        "I click the More details link for house consignment 1 on the Enter the discrepancies between the transit movement and unloading permission page"
      )
      givenIclickTheMoreDetailsLinkForHouseConsignmentOnTheEnterTheDiscrepanciesBetweenTheTransitMovementAndUnloadingPermissionPage(
        "1"
      )

      And("I click the Back to summary button on the House consignment 1 page")
      givenIclickTheBackToSummaryButtonOnTheHouseConsignmentXPage("1")

      And(
        "I click the Continue button on the Enter the discrepancies between the transit movement and unloading permission page"
      )
      andIclickTheContinueButtonOnTheEnterTheDiscrepanciesBetweenTheTransitMovementAndUnloadingPermissionPage()

      And("I enter remarks on the Enter your comments page")
      andIenterXOnTheEnterYourCommentsPage("remarks")

      And("I choose radio option No on the Do you have anything else to report? page")
      andIchooseRadioOptionXOnTheDoYouHaveAnythingElseToReportPage("No")

      And("I submit the Check your answers page")
      andIsubmitTheCheckYourAnswersPage()

      And("I should be on the Unloading remarks sent page")
      thenIshouldbeOnTheUnloadingRemarksSentPage()

      And("I sign out")
      andISignOut()

    }

    Scenario("05 - Trader is able to view unloading remarks with rejections and resubmit") {
      Given("I login with ID 1234567890")
      andILoginWithIDX("1234567890")

      When("I submit an Phase6 IE007 Arrival Notification")
      givenIsubmitAFile("Phase6 IE007 Arrival Notification")

      And("I submit an IE043 Unloading Permission With Seals")
      givenIsubmitAFile("IE043 Unloading Permission With Seals")

      And("I submit an IE044 Unloading Remarks Notification With Seals")
      givenIsubmitAFile("IE044 Unloading Remarks Notification With Seals")

      And("I submit an IE057 Unloading Remarks Rejection")
      givenIsubmitAFile("IE057 Unloading Remarks Rejection")

      When("I click on the View arrival notifications link on the Manage your transit movements page")
      givenIclickOnTheLinkOnTheManageYourTransitMovementsPage("View arrival notifications")

      Then("I should be on the Arrival notifications page")
      thenIShouldBeOnTheArrivalNotificationsPage()

      And("I click on the View errors link for MRN 25GB000246TK0E6WJ1 on the Arrival notifications page")
      andIClickOnTheXLinkForMRNXOnTheArrivalNotificationsPage("View errors", "25GB000246TK0E6WJ1")

      Then("I should be on the Review unloading remarks errors page")
      thenIshouldBeOnTheReviewUnloadingRemarksErrorsPage()

      And("I click on the Make unloading remarks on the Review unloading remarks errors page")
      andIClickOnTheMakeUnloadingRemarksOnTheReviewUnloadingRemarksErrorsPage()

      And("I choose radio option Yes on the Do you want to use the revised unloading procedure? page")
      andIchooseRadioOptionXOnTheDoYouWantToUseTheRevisedUnloadingProcedurePage("Yes")

      And("I choose radio option Yes on the Conditions for using the revised unloading procedure page")
      andIchooseRadioOptionXOnTheConditionsForUsingTheRevisedUnloadingProcedurePage("Yes")

      And("I choose radio option Yes on the Are the goods too large to fit into a container? page")
      andIchooseRadioOptionXOnTheAreTheGoodsTooLargeToFitIntoAContainerPage("Yes")

      Then("I click the Continue button on the Check the goods and note any discrepancies page")
      andIclickTheContinueButtonOnTheCheckTheGoodsAndNoteAnyDiscrepanciesPage()

      And(
        "I choose radio option No on the Were there any discrepancies between the transit movement and unloading permission? page"
      )
      andIchooseRadioOptionXOnTheWereThereAnyDiscrepanciesBetweenTheTransitMovementAndUnloadingPermissionPage("No")

      And(
        "I click the Change link for Were there any discrepancies between the transit and unloading permission? on the Unloading Check your answers page"
      )
      andIclickTheChangeLinkForOnTheCheckYourAnswersPage(
        "Were there any discrepancies between the transit and unloading permission?"
      )

      And(
        "I choose radio option Yes on the Were there any discrepancies between the transit movement and unloading permission? page"
      )
      andIchooseRadioOptionXOnTheWereThereAnyDiscrepanciesBetweenTheTransitMovementAndUnloadingPermissionPage("Yes")

      Then("I click the Continue button on the You cannot use the revised unloading procedure page")
      andIclickTheContinueButtonOnTheYouCannotUseTheRevisedUnloadingProcedurePage()

      And("I choose radio option Yes on the Are all the seal identification numbers or marks readable? page")
      andIchooseRadioOptionXOnTheAreAllTheSealIdentificationNumbersOrMarksReadablePage("Yes")

      And("I choose radio option No on the Are any of the seals broken? page")
      andIchooseRadioOptionXOnTheAreAnyOfTheSealsBrokenPage("No")

      And(
        "I click the Continue button on the Enter the discrepancies between the transit movement and unloading permission page"
      )
      andIclickTheContinueButtonOnTheEnterTheDiscrepanciesBetweenTheTransitMovementAndUnloadingPermissionPage()

      And("I enter remarks on the Enter your comments page")
      andIenterXOnTheEnterYourCommentsPage("remarks")

      And("I choose radio option No on the Do you have anything else to report? page")
      andIchooseRadioOptionXOnTheDoYouHaveAnythingElseToReportPage("No")

      And("I submit the Check your answers page")
      andIsubmitTheCheckYourAnswersPage()

      And("I should be on the Unloading remarks sent page")
      thenIshouldbeOnTheUnloadingRemarksSentPage()

      And("I sign out")
      andISignOut()

    }

    Scenario("06 - E2E Navigation (Longest journey - Seals state 1)") {
      Given("I login with ID 1234567890")
      andILoginWithIDX("1234567890")

      When("I submit an Phase6 IE007 Arrival Notification")
      givenIsubmitAFile("Phase6 IE007 Arrival Notification")

      And("I submit an IE043 Unloading Permission With Seals")
      givenIsubmitAFile("IE043 Unloading Permission With Seals")

      When("I click on the View arrival notifications link on the Manage your transit movements page")
      givenIclickOnTheLinkOnTheManageYourTransitMovementsPage("View arrival notifications")

      And("I click on the Make unloading remarks link for MRN 25GB000246TK0E6WJ1 on the Arrival notifications page")
      andIClickOnTheXLinkForMRNXOnTheArrivalNotificationsPage("Make unloading remarks", "25GB000246TK0E6WJ1")

      And("I choose radio option No on the Do you want to use the revised unloading procedure? page")
      andIchooseRadioOptionXOnTheDoYouWantToUseTheRevisedUnloadingProcedurePage("No")

      Then("I click the Continue button on the Unload the goods and note any discrepancies page")
      andIclickTheContinueButtonOnTheUnloadTheGoodsAndNoteAnyDiscrepanciesPage()

      And("I choose radio option fully on the Have you fully or partially unloaded the goods? page")
      andIchooseRadioOptionXOnTheHaveYouFullyOrPartiallyUnloadedTheGoodsPage("fully")

      And("I fill in the date on the When were the goods unloaded? page")
      andIfillInTheDateOnTheWhenWereTheGoodsUnloadedPage()

      And("I choose radio option Yes on the Are all the seal identification numbers or marks readable? page")
      andIchooseRadioOptionXOnTheAreAllTheSealIdentificationNumbersOrMarksReadablePage("Yes")

      And("I choose radio option No on the Are any of the seals broken? page")
      andIchooseRadioOptionXOnTheAreAnyOfTheSealsBrokenPage("No")

      And(
        "I choose radio option No on the Were there any discrepancies between the transit movement and unloading permission? page"
      )
      andIchooseRadioOptionXOnTheWereThereAnyDiscrepanciesBetweenTheTransitMovementAndUnloadingPermissionPage("No")

      And("I choose radio option Yes on the Do you have anything else to report? page")
      andIchooseRadioOptionXOnTheDoYouHaveAnythingElseToReportPage("Yes")

      And("I enter example comment here on the What do you want to report? page")
      andIenterOnTheWhatDoYouWantToReportPage("example comment")

      And("I submit the Check your answers page")
      andIsubmitTheCheckYourAnswersPage()

      And("I should be on the Unloading remarks sent page")
      thenIshouldbeOnTheUnloadingRemarksSentPage()

      And("I sign out")
      andISignOut()

    }

    Scenario("07 - E2E Navigation (Seals - State 0)") {
      Given("I login with ID 1234567890")
      andILoginWithIDX("1234567890")

      When("I submit an Phase6 IE007 Arrival Notification")
      givenIsubmitAFile("Phase6 IE007 Arrival Notification")

      And("I submit an IE043 Unloading Permission With Seals")
      givenIsubmitAFile("IE043 Unloading Permission With Seals")

      When("I click on the View arrival notifications link on the Manage your transit movements page")
      givenIclickOnTheLinkOnTheManageYourTransitMovementsPage("View arrival notifications")

      And("I click on the Make unloading remarks link for MRN 25GB000246TK0E6WJ1 on the Arrival notifications page")
      andIClickOnTheXLinkForMRNXOnTheArrivalNotificationsPage("Make unloading remarks", "25GB000246TK0E6WJ1")

      And("I choose radio option No on the Do you want to use the revised unloading procedure? page")
      andIchooseRadioOptionXOnTheDoYouWantToUseTheRevisedUnloadingProcedurePage("No")

      Then("I click the Continue button on the Unload the goods and note any discrepancies page")
      andIclickTheContinueButtonOnTheUnloadTheGoodsAndNoteAnyDiscrepanciesPage()

      And("I choose radio option fully on the Have you fully or partially unloaded the goods? page")
      andIchooseRadioOptionXOnTheHaveYouFullyOrPartiallyUnloadedTheGoodsPage("fully")

      And("I fill in the date on the When were the goods unloaded? page")
      andIfillInTheDateOnTheWhenWereTheGoodsUnloadedPage()

      And("I choose radio option No on the Are all the seal identification numbers or marks readable? page")
      andIchooseRadioOptionXOnTheAreAllTheSealIdentificationNumbersOrMarksReadablePage("No")

      And("I choose radio option No on the Are any of the seals broken? page")
      andIchooseRadioOptionXOnTheAreAnyOfTheSealsBrokenPage("No")

      And(
        "I click the Continue button on the Enter the discrepancies between the transit movement and unloading permission page"
      )
      andIclickTheContinueButtonOnTheEnterTheDiscrepanciesBetweenTheTransitMovementAndUnloadingPermissionPage()

      And("I enter remarks on the Enter your comments page")
      andIenterXOnTheEnterYourCommentsPage("remarks")

      And("I choose radio option No on the Do you have anything else to report? page")
      andIchooseRadioOptionXOnTheDoYouHaveAnythingElseToReportPage("No")

      And("I submit the Check your answers page")
      andIsubmitTheCheckYourAnswersPage()

      And("I should be on the Unloading remarks sent page")
      thenIshouldbeOnTheUnloadingRemarksSentPage()

      And("I sign out")
      andISignOut()

    }

    Scenario("08 - E2E Navigation (Shortest journey)") {
      Given("I login with ID 1234567890")
      andILoginWithIDX("1234567890")

      When("I submit an Phase6 IE007 Arrival Notification")
      givenIsubmitAFile("Phase6 IE007 Arrival Notification")

      And("I submit an Phase6 IE043 Unloading Permission With No Seals")
      givenIsubmitAFile("Phase6 IE043 Unloading Permission With No Seals")

      When("I click on the View arrival notifications link on the Manage your transit movements page")
      givenIclickOnTheLinkOnTheManageYourTransitMovementsPage("View arrival notifications")

      And("I click on the Make unloading remarks link for MRN 25GB000246TK0E6WJ1 on the Arrival notifications page")
      andIClickOnTheXLinkForMRNXOnTheArrivalNotificationsPage("Make unloading remarks", "25GB000246TK0E6WJ1")

      And("I choose radio option No on the Do you want to use the revised unloading procedure? page")
      andIchooseRadioOptionXOnTheDoYouWantToUseTheRevisedUnloadingProcedurePage("No")

      Then("I click the Continue button on the Unload the goods and note any discrepancies page")
      andIclickTheContinueButtonOnTheUnloadTheGoodsAndNoteAnyDiscrepanciesPage()

      And("I choose radio option fully on the Have you fully or partially unloaded the goods? page")
      andIchooseRadioOptionXOnTheHaveYouFullyOrPartiallyUnloadedTheGoodsPage("fully")

      And("I fill in the date on the When were the goods unloaded? page")
      andIfillInTheDateOnTheWhenWereTheGoodsUnloadedPage()

      And(
        "I choose radio option No on the Were there any discrepancies between the transit movement and unloading permission? page"
      )
      andIchooseRadioOptionXOnTheWereThereAnyDiscrepanciesBetweenTheTransitMovementAndUnloadingPermissionPage("No")

      And("I choose radio option No on the Do you have anything else to report? page")
      andIchooseRadioOptionXOnTheDoYouHaveAnythingElseToReportPage("No")

      And("I submit the Check your answers page")
      andIsubmitTheCheckYourAnswersPage()

      And("I should be on the Unloading remarks sent page")
      thenIshouldbeOnTheUnloadingRemarksSentPage()

      And("I sign out")
      andISignOut()

    }
  }
}
