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

import org.scalatest.GivenWhenThen
import specsteps.CYAStepDefSteps.andIsubmitTheCheckYourAnswersPage
import specsteps.CancellationsStepDefSteps.thenIshouldbeontheAreYouSureYouWantToCancelThisDeclaration
import specsteps.CommonStepDefSteps.{andISignOut, andIrefreshThePage}
import specsteps.DepartureDeclarationsStepDefSteps.{andIclickOnTheXLinkForLRNXOnTheDepartureDeclarationsPage, givenIclickOnTheAmendErrorsButtonOnTheAmendDeclarationErrorsPage, givenIclickOnTheLinkOnThePrelodgedDeclarationErrorsPage, givenIclickOnTheLinkOnTheReviewPrelodgedDeclarationErrorsPage, thenIshouldBeonTheDeclarationErrorsPage, thenIshouldbeOnTheConfirmationNeededToCompletePrelodgedDeclarationPage, thenIshouldbeOnTheGoodsBeingRecoveredPage, thenIshouldbeOnTheGoodsNotReleasedPage, thenIshouldbeOnThePresentationNotificationCheckYourAnswersPage, thenIshouldbeOnTheReviewCancellationErrorsPage, thenIshouldbeOnTheReviewDeclarationErrorsPage, thenIshouldbeOnTheReviewPrelodgedDeclarationErrorsPage}
import specsteps.Departure_GuaranteeDetailsStepDefSteps.andIclickTheContinueButtonOnTheGuaranteeAddedForTIRDeclarationPage
import specsteps.DraftDepartureDeclarationsStepDefSteps.*
import specsteps.LoginStepDefSteps.andILoginWithIDX
import specsteps.ManageStepDefSteps.*
import specsteps.PreTaskListStepDefSteps.*
import specsteps.PresentationNotificationStepDefSteps.{andIclickTheContinueButtonOnThePresentationConfirmationNeededToCompletePrelodgedDeclarationPage, andIshouldBeOnTheMoreInformationNeededToCompletePrelodgedDeclarationPage}
import specsteps.TaskListStepDefSteps.*

class ManageTransitMovementsDeparturesP6Spec extends BaseSpec with GivenWhenThen {

  override def beforeEach(): Unit = {
    dropCollections()
    deleteCookies()
    Given("I login with ID 1234567890")
    andILoginWithIDX("1234567890")
  }

  Feature("Manage transit movements frontend tests for Departures") {

    Scenario("01 - Trader is able to make a departure declaration from home page") {

      Given("I click on the Make a departure declaration link on the Manage your transit movements page")
      givenIclickOnTheLinkOnTheManageYourTransitMovementsPage("Make a departure declaration")

      Then("Then I should be on the 'What is the Local Reference Number?' page")
      thenIshouldBeOnTheWhatIsTheLocalReferenceNumberPage()

      And("I sign out")
      andISignOut()

    }

    Scenario("02 - Trader is able to view a draft departure declaration and delete it") {

      Given("I click on the Make a departure declaration link on the Manage your transit movements page")
      givenIclickOnTheLinkOnTheManageYourTransitMovementsPage("Make a departure declaration")

      And("I input a random LRN on the What is the Local Reference Number page")
      whenIInputARandomLRNOnTheWhatIsTheLocalReferenceNumberPage()

      And("I choose radio option A on the Is this a standard or pre-lodged declaration page")
      andIchooseRadioOptionXOnTheIsThisAStandardOrPrelodgedDeclarationPage("A")

      And("And I select XI on the 'Where is the office of departure?' page")
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

      // -------------------------Guarantee details-------------------------
      When("I click the Add guarantee details link on the Declaration summary page")
      thenIclickTheLinkOnTheDeclarationSummaryPage("Add guarantee details")

      Then("I click the Continue button on the 'Guarantee added for TIR declaration' page")
      andIclickTheContinueButtonOnTheGuaranteeAddedForTIRDeclarationPage()

      And("I click on the Back to transit movements link on the 'Declaration summary' page")
      thenIclickOnTheLinkOnTheDeclarationSummaryPage("Back to transit movements")

      And("I click on the View draft departure declarations link on the Manage your transit movements page")
      givenIclickOnTheLinkOnTheManageYourTransitMovementsPage("View draft departure declarations")

      And("I click on the Delete link on the 'Draft departure declarations' page")
      andIclickOnTheLinkForLRNXOnTheDraftDepartureDeclarationsPage("Delete")

      And("I click radio option Yes on the 'Are you sure you want to delete this declaration?' page")
      andIclickRadioOptionXOnTheAreYouSureYouWantToDeleteThisDeclarationPage("Yes")

      And("I sign out")
      andISignOut()

    }

    Scenario("03 - Trader is able to see a control decision notification IE060 with documents") {

      When("I submit an IE015 Departure Declaration")
      givenIsubmitAFile("IE015 Departure Declaration")

      Then("I submit an IE060 Control Decision Notification With Documents")
      givenIsubmitAFile("IE060 Control Decision Notification With Documents")

      And("I refresh the page")
      andIrefreshThePage()

      And("I click on the View departure declarations link on the 'Manage your transit movements' page")
      givenIclickOnTheLinkOnTheManageYourTransitMovementsPage("View departure declarations")

      And("I click on the View details link for LRN 25GB000246TK0E6WJ1 on the 'Departure declarations' page")
      andIclickOnTheXLinkForLRNXOnTheDepartureDeclarationsPage("View details", "25GB000246TK0E6WJ1")

      Then("I should be on the 'Goods under control - document requested' page")
      thenIshouldBeOnTheGoodsUnderControlDocumentRequestedPage()

      And("I sign out")
      andISignOut()

    }

    Scenario("04 - Trader is able to see a control decision notification IE060 with no documents") {

      When("I submit an IE015 Departure Declaration")
      givenIsubmitAFile("IE015 Departure Declaration")

      Then("I submit an IE060 Control Decision Notification With Documents")
      givenIsubmitAFile("IE060 Control Decision Notification With No Documents")

      And("I refresh the page")
      andIrefreshThePage()

      And("I click on the View departure declarations link on the 'Manage your transit movements' page")
      givenIclickOnTheLinkOnTheManageYourTransitMovementsPage("View departure declarations")

      And("I click on the View details link for LRN 25GB000246TK0E6WJ1 on the 'Departure declarations' page")
      andIclickOnTheXLinkForLRNXOnTheDepartureDeclarationsPage("View details", "25GB000246TK0E6WJ1")

      Then("I should be on the 'Goods under control' page")
      thenIshouldBeOnTheGoodsUnderControlPage()

      And("I sign out")
      andISignOut()
    }

    Scenario("05 - Trader is able to review declaration errors for a departure declaration") {
      When("I submit an IE015 Departure Declaration")
      givenIsubmitAFile("IE015 Departure Declaration")

      Then("I submit anIE056 Rejection With No Amendable Errors")
      givenIsubmitAFile("IE056 Rejection With No Amendable Errors")

      And("I refresh the page")
      andIrefreshThePage()

      And("I click on the View departure declarations link on the 'Manage your transit movements' page")
      givenIclickOnTheLinkOnTheManageYourTransitMovementsPage("View departure declarations")

      And("I click on the View errors link for LRN 25GB000246TK0E6WJ1 on the 'Departure declarations' page")
      andIclickOnTheXLinkForLRNXOnTheDepartureDeclarationsPage("View errors", "25GB000246TK0E6WJ1")

      Then("I should be on the 'Review declaration errors' page")
      thenIshouldbeOnTheReviewDeclarationErrorsPage()

      And("I sign out")
      andISignOut()
    }

    Scenario("06 - Trader is able to amend a declaration error for a departure declaration before MRN allocation") {
      When("I submit an IE015 Departure Declaration")
      givenIsubmitAFile("IE015 Departure Declaration")

      Then("I submit an IE056 Rejection With Amendable Errors")
      givenIsubmitAFile("IE056 Rejection With Amendable Errors")

      And("the user has submitted departureDeclaration.json for LRN 25GB000246TK0E6WJ1 and EORI number 1234567890")
      whenTheUserHasSubmittedFileForLRNAndEORINumber("departureDeclaration.json", "25GB000246TK0E6WJ1", "1234567890")

      And("I refresh the page")
      andIrefreshThePage()

      And("I click on the View departure declarations link on the 'Manage your transit movements' page")
      givenIclickOnTheLinkOnTheManageYourTransitMovementsPage("View departure declarations")

      And("I click on the Amend declaration link for LRN 25GB000246TK0E6WJ1 on the Departure declarations page")
      andIclickOnTheXLinkForLRNXOnTheDepartureDeclarationsPage("Amend declaration", "25GB000246TK0E6WJ1")

      And("I click on the Amend errors button on the Amend declaration errors page")
      givenIclickOnTheAmendErrorsButtonOnTheAmendDeclarationErrorsPage()

      Then("I should be on the Declaration summary page")
      thenIshouldbeOnTheDeclarationSummaryPage()

      And("I sign out")
      andISignOut()
    }

    Scenario("07 - Trader is able to amend a declaration error for a departure declaration after MRN allocation") {

      When("I submit an IE015 Departure Declaration")
      givenIsubmitAFile("IE015 Departure Declaration")

      And("I submit an IE028 MRN Allocated")
      givenIsubmitAFile("IE028 MRN Allocated")

      And("I submit an IE056 Rejection With Amendable Errors")
      givenIsubmitAFile("IE056 Rejection With Amendable Errors")

      And("the user has submitted departureDeclaration.json for LRN 25GB000246TK0E6WJ1 and EORI number 1234567890")
      whenTheUserHasSubmittedFileForLRNAndEORINumber("departureDeclaration.json", "25GB000246TK0E6WJ1", "1234567890")

      And("I refresh the page")
      andIrefreshThePage()

      And("I click on the View departure declarations link on the 'Manage your transit movements' page")
      givenIclickOnTheLinkOnTheManageYourTransitMovementsPage("View departure declarations")

      And("I click on the Amend declaration link for LRN 25GB000246TK0E6WJ1 on the Departure declarations page")
      andIclickOnTheXLinkForLRNXOnTheDepartureDeclarationsPage("Amend declaration", "25GB000246TK0E6WJ1")

      And("I click on the Amend errors button on the Amend declaration errors page")
      givenIclickOnTheAmendErrorsButtonOnTheAmendDeclarationErrorsPage()

      Then("I should be on the 'What is the new Local Reference Number?' page")
      thenIshouldBeOnTheWhatIsTheNewLocalReferenceNumberPage()

      And("I sign out")
      andISignOut()
    }

    Scenario("08 - Trader is able to review errors for a amended departure declaration with no functional errors") {

      When("I submit an IE015 Departure Declaration")
      givenIsubmitAFile("IE015 Departure Declaration")

      And("I submit an IE013 Declaration Amendment")
      givenIsubmitAFile("IE013 Declaration Amendment")

      And("I submit an IE056 Amendment Rejection With NO Amendable Errors")
      givenIsubmitAFile("IE056 Amendment Rejection With NO Amendable Errors")

      And("I refresh the page")
      andIrefreshThePage()

      And("I click on the View departure declarations link on the 'Manage your transit movements' page")
      givenIclickOnTheLinkOnTheManageYourTransitMovementsPage("View departure declarations")

      And("I click on the View errors link for LRN 25GB000246TK0E6WJ1 on the 'Departure declarations' page")
      andIclickOnTheXLinkForLRNXOnTheDepartureDeclarationsPage("View errors", "25GB000246TK0E6WJ1")

      Then("I should be on the 'Declaration errors' page")
      thenIshouldBeonTheDeclarationErrorsPage()

      And("I sign out")
      andISignOut()
    }

    Scenario("09 - Trader is able to review cancellation errors for a departure declaration") {

      When("I submit an IE015 Departure Declaration")
      givenIsubmitAFile("IE015 Departure Declaration")

      And("I submit an IE014 Declaration Cancellation")
      givenIsubmitAFile("IE014 Declaration Cancellation")

      And("I submit an IE056 Cancellation Rejection With No Amendable Errors")
      givenIsubmitAFile("IE056 Cancellation Rejection With No Amendable Errors")

      And("I refresh the page")
      andIrefreshThePage()

      And("I click on the View departure declarations link on the 'Manage your transit movements' page")
      givenIclickOnTheLinkOnTheManageYourTransitMovementsPage("View departure declarations")

      And("I click on the View errors link for LRN 25GB000246TK0E6WJ1 on the 'Departure declarations' page")
      andIclickOnTheXLinkForLRNXOnTheDepartureDeclarationsPage("View errors", "25GB000246TK0E6WJ1")

      Then("I should be on the 'Review cancellation errors' page")
      thenIshouldbeOnTheReviewCancellationErrorsPage()

      And("I sign out")
      andISignOut()
    }

    Scenario("10 Trader is able to cancel a departure declaration") {

      When("I submit an IE015 Departure Declaration")
      givenIsubmitAFile("IE015 Departure Declaration")

      And("I submit an IE028 MRN Allocated")
      givenIsubmitAFile("IE028 MRN Allocated")

      And("I refresh the page")
      andIrefreshThePage()

      And("I click on the View departure declarations link on the 'Manage your transit movements' page")
      givenIclickOnTheLinkOnTheManageYourTransitMovementsPage("View departure declarations")

      And("I click on the Cancel declaration link for LRN 25GB000246TK0E6WJ1 on the 'Departure declarations' page")
      andIclickOnTheXLinkForLRNXOnTheDepartureDeclarationsPage("Cancel declaration", "25GB000246TK0E6WJ1")

      Then("I should be on the 'Are you sure you want to cancel this declaration?' page")
      thenIshouldbeontheAreYouSureYouWantToCancelThisDeclaration()

      And("I sign out")
      andISignOut()
    }

    Scenario("11 Trader is able to review IE035 message details for Goods being recovered") {

      When("I submit an IE015 Departure Declaration")
      givenIsubmitAFile("IE015 Departure Declaration")

      And("I submit an IE035 Recovery Notification")
      givenIsubmitAFile("IE035 Recovery Notification")

      And("I refresh the page")
      andIrefreshThePage()

      And("I click on the View departure declarations link on the 'Manage your transit movements' page")
      givenIclickOnTheLinkOnTheManageYourTransitMovementsPage("View departure declarations")

      And("I click on the View details link for LRN 25GB000246TK0E6WJ1 on the 'Departure declarations' page")
      andIclickOnTheXLinkForLRNXOnTheDepartureDeclarationsPage("View details", "25GB000246TK0E6WJ1")

      Then("I should be on the 'Goods being recovered' page")
      thenIshouldbeOnTheGoodsBeingRecoveredPage()

      And("I sign out")
      andISignOut()
    }

    Scenario("12 Trader is able to review IE051 message details for Goods not released") {

      When("I submit an IE015 Departure Declaration")
      givenIsubmitAFile("IE015 Departure Declaration")

      And("I submit an IE051 No Release For Transit")
      givenIsubmitAFile("IE051 No Release For Transit")

      And("I refresh the page")
      andIrefreshThePage()

      And("I click on the View departure declarations link on the 'Manage your transit movements' page")
      givenIclickOnTheLinkOnTheManageYourTransitMovementsPage("View departure declarations")

      And("I click on the View details link for LRN 25GB000246TK0E6WJ1 on the 'Departure declarations' page")
      andIclickOnTheXLinkForLRNXOnTheDepartureDeclarationsPage("View details", "25GB000246TK0E6WJ1")

      Then("I should be on the 'Goods not released' page")
      thenIshouldbeOnTheGoodsNotReleasedPage()

      And("I sign out")
      andISignOut()
    }

    Scenario("14 Trader completes a departure declaration that was previously pre-lodged") {

      When("I submit an IE015 Prelodged Departure Declaration")
      givenIsubmitAFile("IE015 Prelodged Departure Declaration")

      And("I submit an IE928 Positive Acknowledgment")
      givenIsubmitAFile("IE928 Positive Acknowledgment")

      And("I refresh the page")
      andIrefreshThePage()

      And("I click on the View departure declarations link on the 'Manage your transit movements' page")
      givenIclickOnTheLinkOnTheManageYourTransitMovementsPage("View departure declarations")

      And(
        "I click on the Complete pre lodged declaration link for LRN 25GB000246TK0E6WJ1 on the 'Departure declarations' page"
      )
      andIclickOnTheXLinkForLRNXOnTheDepartureDeclarationsPage("Complete pre lodged declaration", "25GB000246TK0E6WJ1")

      Then("I should be on the 'More information needed to complete pre-lodged declaration' page")
      andIshouldBeOnTheMoreInformationNeededToCompletePrelodgedDeclarationPage()

      And("I sign out")
      andISignOut()
    }

    Scenario("15 Trader completes a pre-lodge departure followed by an amendment and is able to complete a pre-lodge") {

      When("I submit an IE015 Simplified Prelodged Departure Declaration Full")
      givenIsubmitAFile("IE015 Simplified Prelodged Departure Declaration Full")

      And("I submit an IE928 Positive Acknowledgment")
      givenIsubmitAFile("IE928 Positive Acknowledgment")

      And("I submit an IE013 Simplified Prelodged Departure Declaration Full")
      givenIsubmitAFile("IE013 Simplified Prelodged Departure Declaration Full")

      And("I submit an IE004 Amendment Acceptance")
      givenIsubmitAFile("IE004 Amendment Acceptance")

      And("I refresh the page")
      andIrefreshThePage()

      And("I click on the View departure declarations link on the 'Manage your transit movements' page")
      givenIclickOnTheLinkOnTheManageYourTransitMovementsPage("View departure declarations")

      And(
        "I click on the Complete pre lodged declaration link link for LRN 25GB000246TK0E6WJ1 on the 'Departure declarations' page"
      )
      andIclickOnTheXLinkForLRNXOnTheDepartureDeclarationsPage(
        "Complete pre lodged declaration",
        "25GB000246TK0E6WJ1"
      )

      Then("I should be on the 'More information needed to complete pre-lodged declaration' page")
      andIshouldBeOnTheMoreInformationNeededToCompletePrelodgedDeclarationPage()

      And("I sign out")
      andISignOut()
    }

    Scenario(
      "16 Trader is sent to declaration completed page for a pre-lodge declaration where all details were completed initially"
    ) {

      When("I submit an IE015 Normal Prelodged Departure Declaration Complete")
      givenIsubmitAFile("IE015 Normal Prelodged Departure Declaration Complete")

      And("I submit an IE928 Positive Acknowledgment")
      givenIsubmitAFile("IE928 Positive Acknowledgment")

      And("I refresh the page")
      andIrefreshThePage()

      And("I click on the View departure declarations link on the 'Manage your transit movements' page")
      givenIclickOnTheLinkOnTheManageYourTransitMovementsPage("View departure declarations")

      And(
        "I click on the Complete pre lodged declaration link for LRN 25GB000246TK0E6WJ1 on the 'Departure declarations' page"
      )
      andIclickOnTheXLinkForLRNXOnTheDepartureDeclarationsPage("Complete pre lodged declaration", "25GB000246TK0E6WJ1")

      And(
        "I click the Continue button on the presentation 'Confirmation needed to complete pre-lodged declaration' page"
      )
      andIclickTheContinueButtonOnThePresentationConfirmationNeededToCompletePrelodgedDeclarationPage()

      Then("Then I should be on the Presentation Notification 'Check your answers' page")
      thenIshouldbeOnThePresentationNotificationCheckYourAnswersPage()

      And("I sign out")
      andISignOut()
    }

    Scenario("17 Trader is able to see a control decision notification IE060 for a pre-lodged declaration") {

      When("I submit an IE015 Normal Prelodged Departure Declaration Complete")
      givenIsubmitAFile("IE015 Normal Prelodged Departure Declaration Complete")

      And("I submit an IE928 Positive Acknowledgment")
      givenIsubmitAFile("IE928 Positive Acknowledgment")

      And("I submit an IE060 Control Decision Type 2")
      givenIsubmitAFile("IE060 Control Decision Type 2")

      And("I refresh the page")
      andIrefreshThePage()

      And("I click on the View departure declarations link on the 'Manage your transit movements' page")
      givenIclickOnTheLinkOnTheManageYourTransitMovementsPage("View departure declarations")

      And("I click on the View details link for LRN 25GB000246TK0E6WJ1 on the 'Departure declarations' page")
      andIclickOnTheXLinkForLRNXOnTheDepartureDeclarationsPage("View details", "25GB000246TK0E6WJ1")

      Then("I should be on the 'Intention to control - complete pre-lodged declaration' page")
      thenIshouldBeOnTheIntentionToControlCompletePrelodgedDeclarationPage()

      And("I sign out")
      andISignOut()
    }

    Scenario("18 Trader is able to see a departure rejection WITH NO functional errors for a pre-lodged declaration") {

      When("I submit an IE015 Normal Prelodged Departure Declaration Complete")
      givenIsubmitAFile("IE015 Normal Prelodged Departure Declaration Complete")

      And("I submit an IE928 Positive Acknowledgment")
      givenIsubmitAFile("IE928 Positive Acknowledgment")

      And("I submit an IE170 Presentation Notification PreLodge")
      givenIsubmitAFile("IE170 Presentation Notification PreLodge")

      And("I submit an IE056 Rejection Of IE170 No Errors")
      givenIsubmitAFile("IE056 Rejection Of IE170 No Errors")

      And("I refresh the page")
      andIrefreshThePage()

      And("I click on the View departure declarations link on the 'Manage your transit movements' page")
      givenIclickOnTheLinkOnTheManageYourTransitMovementsPage("View departure declarations")

      And("I click on the View errors link for LRN 25GB000246TK0E6WJ1 on the 'Departure declarations' page")
      andIclickOnTheXLinkForLRNXOnTheDepartureDeclarationsPage("View errors", "25GB000246TK0E6WJ1")

      And("I click on the Complete pre-lodged declaration link on the 'Prelodged declaration errors' page")
      givenIclickOnTheLinkOnThePrelodgedDeclarationErrorsPage("Complete pre-lodged declaration")

      Then("I should be on the 'Confirmation needed to complete pre-lodged declaration' page")
      thenIshouldbeOnTheConfirmationNeededToCompletePrelodgedDeclarationPage()

      And("I sign out")
      andISignOut()
    }

    Scenario("19 Trader is able to see a departure rejection WITH functional errors for a pre-lodged declaration") {

      When("I submit an IE015 Normal Prelodged Departure Declaration Complete")
      givenIsubmitAFile("IE015 Normal Prelodged Departure Declaration Complete")

      And("I submit an IE928 Positive Acknowledgment")
      givenIsubmitAFile("IE928 Positive Acknowledgment")

      And("I submit an IE170 Presentation Notification PreLodge")
      givenIsubmitAFile("IE170 Presentation Notification PreLodge")

      And("I submit an IE056 Rejection Of IE170 With Errors")
      givenIsubmitAFile("IE056 Rejection Of IE170 With Errors")

      And("I refresh the page")
      andIrefreshThePage()

      And("I click on the View departure declarations link on the 'Manage your transit movements' page")
      givenIclickOnTheLinkOnTheManageYourTransitMovementsPage("View departure declarations")

      And("I click on the View errors link for LRN 25GB000246TK0E6WJ1 on the 'Departure declarations' page")
      andIclickOnTheXLinkForLRNXOnTheDepartureDeclarationsPage("View errors", "25GB000246TK0E6WJ1")

      And("And I click on the Complete pre-lodged declaration link on the 'Review pre-lodged declaration errors' page")
      givenIclickOnTheLinkOnTheReviewPrelodgedDeclarationErrorsPage("Complete pre-lodged declaration")

      Then("I should be on the 'Confirmation needed to complete pre-lodged declaration' page")
      thenIshouldbeOnTheConfirmationNeededToCompletePrelodgedDeclarationPage()

      And("I sign out")
      andISignOut()
    }
  }
}
