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
import DepartureDeclarationsStepDefSteps.*
import Departure_GuaranteeDetailsStepDefSteps.*
import DraftDepartureDeclarationsStepDefSteps.*
import ManageStepDefSteps.*
import PreTaskListStepDefSteps.*
import PresentationNotificationStepDefSteps.*
import TaskListStepDefSteps.*
import org.scalatest.GivenWhenThen
import org.scalatest.featurespec.AnyFeatureSpec
import org.scalatest.matchers.should.Matchers
import uk.gov.hmrc.test.ui.driver.Driver

class ManageTransitMovementsDeparturesSpec extends AnyFeatureSpec with GivenWhenThen with Matchers with Driver {

  Feature("Manage transit movements frontend tests for Departures") {

    Scenario("01 - Trader is able to make a departure declaration from home page") {
      When("I click on the Make a departure declaration link on the Manage your transit movements page")
      // Possible match (best=0.95)
      givenIclickOnTheLinkOnTheManageYourTransitMovementsPage("Make a departure declaration")

      Then("I should be on the What is the Local Reference Number? page")
      // ⚠️ No step-def match found for: I should be on the What is the Local Reference Number? page
      thenIshouldBeOnTheWhatIsTheLocalReferenceNumberPage()

      And("I sign out")
      // Possible match (best=1.00)
      andISignOut()

    }

    Scenario("02 - Trader is able to view a draft departure declaration and delete it") {
      When("I click on the Make a departure declaration link on the Manage your transit movements page")
      // Possible match (best=0.95)
      givenIclickOnTheLinkOnTheManageYourTransitMovementsPage("Make a departure declaration")

      Then("I enter 1234567890ABCDEFGHIJKL on the What is the Local Reference Number? page")
      // Possible match (best=0.79)
      thenIenterOnTheWhatIsTheLocalReferenceNumberPage("1234567890ABCDEFGHIJKL")
      // --- Other possible matches ---
      // andIenterOnTheWhatIsTheReferencePage() [0.78] (Departure_GuaranteeDetailsStepDefSteps.scala) pattern: (?:I )?enter (.+) on the 'What is the reference\?' page

      And("I choose radio option A on the Is this a standard or pre-lodged declaration? page")
      // Possible match (best=0.81)
      andIchooseRadioOptionXOnTheIsThisAStandardOrPrelodgedDeclarationPage("A")

      And("I select XI on the Where is the office of departure? page")
      // Possible match (best=0.85)
      andIselectOnTheWhereIsTheOfficeOfDeparturePage("XI")

      And("I choose radio option Normal on the Which type of procedure are you using? page")
      // Possible match (best=0.80)
      andIchooseRadioOptionXOnTheWhichTypeOfProcedureAreYouUsingPage("Normal")
      // --- Other possible matches ---
      // andIchooseRadioOptionXOnTheWhatTypeOfProcedureAreYouUsingPage() [0.76] (IdentificationStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'What type of procedure are you using\?' page

      And("I choose radio option TIR on the Which type of declaration do you want to create? page")
      // Possible match (best=0.81)
      andIchooseRadioOptionXOnTheWhichTypeOfDeclarationDoYouWantToCreatePage("TIR")

      And("I enter 1234567 on the What is the TIR carnet reference? page")
      // Possible match (best=0.79)
      andIenterOnTheWhatIsTheTIRCarnetReferencePage("1234567")
      // --- Other possible matches ---
      // andIenterOnTheWhatIsTheReferencePage() [0.78] (Departure_GuaranteeDetailsStepDefSteps.scala) pattern: (?:I )?enter (.+) on the 'What is the reference\?' page

      And(
        "I choose radio option Exit summary declaration (EXS) on the Which type of safety and security details do you want to add? page"
      )
      // Possible match (best=0.85)
      andIchooseRadioOptionXOnTheWhichTypeOfSafetyAndSecurityDetailsDoYouWantToAddPage("Exit summary declaration (EXS)")
      // --- Other possible matches ---
      // andIchooseRadioOptionXOnTheWhichTypeOfAuthorisationDoYouWantToAddPage() [0.81] (TransportAuthorisationsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Which type of authorisation do you want to add' page
      // andIchooseRadioOptionXOnTheWhichTypeOfDeclarationDoYouWantToCreatePage() [0.81] (PreTaskListStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Which type of declaration do you want to create\?' page
      // andIchooseRadioOptionXOnTheDoYouWantToAddTheTypeOfIdentificationPage() [0.81] (BorderMeansOfTransportStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add the type of identification\?' page
      // andIchooseRadioOptionXOnTheDoYouWantToAddAnAuthorisationPage() [0.80] (TransportAuthorisationsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add an authorisation' page
      // andIchooseRadioOptionXOnTheDoYouWantToAddASealPage() [0.80] (TransportEquipmentChargesStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a seal\?' page
      // andIChooseRadioOptionXOnTheDoYouWantToAddACarrierPage() [0.80] (CarrierDetailsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a carrier\?' page
      // andIchooseRadioOptionXOnTheDoYouWantToAddATimeOfArrivalInXPage() [0.79] (RouteDetailsTransitStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a time of arrival in (.*)\?' page
      // andIchooseRadioOptionXOnTheT2DeclarationPage() [0.78] (RouteDetailsTransitStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the t2 declaration page
      // andIchooseRadioOptionXOnTheDepartureMeansXPage() [0.77] (InlandModeOfTransportStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the departure means '(.*)' page
      // andIchooseRadioOptionXOnTheDoYouWantToAddALocationOfGoodsPage() [0.77] (RouteDetailsLocationOfGoodsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a location of goods\?' page
      // andIchooseRadioOptionXOnTheDoYouWantToAddAPlaceOfLoadingPage() [0.77] (RouteDetailsPlaceOfLoadingStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a place of loading\?' page
      // andIchooseRadioOptionXOnTheDoYouWantToAddAPlaceOfUnloadingPage() [0.77] (RouteDetailsPlaceOfUnloadingStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a place of unloading\?' page
      // andIchooseRadioOptionXOnTheRepresentativeDoYouWantToAddYourDetailsPage() [0.76] (TraderDetailsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the representative 'Do you want to add your details\?' page
      // andIchooseRadioOptionXOnTheDoYouWantToAddAnItemForHouseConsignmentXPage() [0.75] (UnloadingStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add an item for house consignment (.*)\?' page
      // andIchooseRadioOptionXOnTheWhichTypeOfLocationIsItPage() [0.75] (RouteDetailsLocationOfGoodsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Which type of location is it\?' page
      // andIchooseRadioOptionXOnTheWhichTypeOfGuaranteeIsItPage() [0.75] (Departure_GuaranteeDetailsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Which type of guarantee is it\?' page

      And("I submit the Check your answers page")
      // Possible match (best=1.00)
      andIsubmitTheCheckYourAnswersPage()

      And("I click the Add guarantee details link on the Declaration summary page")
      // Possible match (best=0.93)
      thenIclickTheLinkOnTheDeclarationSummaryPage("Add guarantee details")
      // --- Other possible matches ---
      // thenIclickOnTheLinkOnTheDeclarationSummaryPage() [0.79] (TaskListStepDefSteps.scala) pattern: (?:I )?click on the (.+) link on the 'Declaration summary' page

      Then("I click the Continue button on the Guarantee added for TIR declaration page")
      // Possible match (best=1.00)
      andIclickTheContinueButtonOnTheGuaranteeAddedForTIRDeclarationPage()

      And("I click on the Back to transit movements link on the Declaration summary page")
      // Possible match (best=0.94)
      thenIclickOnTheLinkOnTheDeclarationSummaryPage("Back to transit movements ")
      // --- Other possible matches ---
      // thenIclickTheLinkOnTheDeclarationSummaryPage() [0.78] (TaskListStepDefSteps.scala) pattern: (?:I )?click the (.+) link on the 'Declaration summary' page

      And("I click on the View draft departure declarations link on the Manage your transit movements page")
      // Possible match (best=0.95)
      givenIclickOnTheLinkOnTheManageYourTransitMovementsPage("View draft departure declarations")
      // --- Other possible matches ---
      // givenIclickOnTheLinkOnTheDraftDepartureDeclarationsPage() [0.79] (DraftDepartureDeclarationsStepDefSteps.scala) pattern: (?:I )?click on the (.+) link on the 'Draft departure declarations' page
      // givenIclickOnTheLinkOnTheDepartureDeclarationsPage() [0.79] (DepartureDeclarationsStepDefSteps.scala) pattern: (?:I )?click on the (.+) link on the 'Departure declarations' page

      And("I click on the Delete link on the Draft departure declarations page")
      // Possible match (best=0.94)
      givenIclickOnTheLinkOnTheDraftDepartureDeclarationsPage("Delete")
      // --- Other possible matches ---
      // givenIclickOnTheLinkOnTheDepartureDeclarationsPage() [0.79] (DepartureDeclarationsStepDefSteps.scala) pattern: (?:I )?click on the (.+) link on the 'Departure declarations' page

      And("I click radio option Yes on the Are you sure you want to delete this declaration? page")
      // Possible match (best=0.81)
      andIclickRadioOptionXOnTheAreYouSureYouWantToDeleteThisDeclarationPage("Yes")

      And("I sign out")
      // Possible match (best=1.00)
      andISignOut()

    }

    Scenario("03 - Trader is able to see a control decision notification IE060 with documents") {
      When("I submit an IE015 Departure Declaration")
      // Possible match (best=1.00)
      givenIsubmitAFile("IE015 Departure Declaration")

      Then("I submit an IE060 Control Decision Notification With Documents")
      // Possible match (best=1.00)
      givenIsubmitAFile("IE060 Control Decision Notification With Documents")

      And("I refresh the page")
      // Possible match (best=1.00)
      andIrefreshThePage()

      And("I click on the View departure declarations link on the Manage your transit movements page")
      // Possible match (best=0.95)
      givenIclickOnTheLinkOnTheManageYourTransitMovementsPage("View draft departure declarations")
      // --- Other possible matches ---
      // givenIclickOnTheLinkOnTheDepartureDeclarationsPage() [0.79] (DepartureDeclarationsStepDefSteps.scala) pattern: (?:I )?click on the (.+) link on the 'Departure declarations' page

      And("I click on the View details link for LRN 25GB000246TK0E6WJ1 on the Departure declarations page")
      // Possible match (best=0.90)
      andIclickOnTheXLinkForLRNXOnTheDepartureDeclarationsPage("View details", "25GB000246TK0E6WJ1")
      // --- Other possible matches ---
      // givenIclickOnTheLinkOnTheDepartureDeclarationsPage() [0.79] (DepartureDeclarationsStepDefSteps.scala) pattern: (?:I )?click on the (.+) link on the 'Departure declarations' page

      Then("I should be on the Goods under control - document requested page")
      // ⚠️ No step-def match found for: I should be on the Goods under control - document requested page
      thenIshouldBeOnTheGoodsUnderControlDocumentRequestedPage()

      And("I sign out")
      // Possible match (best=1.00)
      andISignOut()

    }

    Scenario("04 - Trader is able to see a control decision notification IE060 with no documents") {
      When("I submit an IE015 Departure Declaration")
      // Possible match (best=1.00)
      givenIsubmitAFile("IE015 Departure Declaration")

      Then("I submit an IE060 Control Decision Notification With No Documents")
      // Possible match (best=1.00)
      givenIsubmitAFile("IE060 Control Decision Notification With No Documents")

      And("I refresh the page")
      // Possible match (best=1.00)
      andIrefreshThePage()

      And("I click on the View departure declarations link on the Manage your transit movements page")
      // Possible match (best=0.95)
      givenIclickOnTheLinkOnTheManageYourTransitMovementsPage("View departure declarations")
      // --- Other possible matches ---
      // givenIclickOnTheLinkOnTheDepartureDeclarationsPage() [0.79] (DepartureDeclarationsStepDefSteps.scala) pattern: (?:I )?click on the (.+) link on the 'Departure declarations' page

      And("I click on the View details link for LRN 25GB000246TK0E6WJ1 on the Departure declarations page")
      // Possible match (best=0.90)
      andIclickOnTheXLinkForLRNXOnTheDepartureDeclarationsPage("View details", "25GB000246TK0E6WJ1")
      // --- Other possible matches ---
      // givenIclickOnTheLinkOnTheDepartureDeclarationsPage() [0.79] (DepartureDeclarationsStepDefSteps.scala) pattern: (?:I )?click on the (.+) link on the 'Departure declarations' page

      Then("I should be on the Goods under control page")
      // Possible match (best=1.00)
      thenIshouldBeOnTheGoodsUnderControlPage()

      And("I sign out")
      // Possible match (best=1.00)
      andISignOut()

    }

    Scenario("05 - Trader is able to review declaration errors for a departure declaration") {
      When("I submit an IE015 Departure Declaration")
      // Possible match (best=1.00)
      givenIsubmitAFile("IE015 Departure Declaration")

      Then("I submit an IE056 Rejection With No Amendable Errors")
      // Possible match (best=1.00)
      givenIsubmitAFile("IE056 Rejection With No Amendable Errors")

      And("I refresh the page")
      // Possible match (best=1.00)
      andIrefreshThePage()

      And("I click on the View departure declarations link on the Manage your transit movements page")
      // Possible match (best=0.95)
      givenIclickOnTheLinkOnTheManageYourTransitMovementsPage("View departure declarations")
      // --- Other possible matches ---
      // givenIclickOnTheLinkOnTheDepartureDeclarationsPage() [0.79] (DepartureDeclarationsStepDefSteps.scala) pattern: (?:I )?click on the (.+) link on the 'Departure declarations' page

      And("I click on the View errors link for LRN 25GB000246TK0E6WJ1 on the Departure declarations page")
      // Possible match (best=0.90)
      andIclickOnTheXLinkForLRNXOnTheDepartureDeclarationsPage("View errors", "25GB000246TK0E6WJ1")
      // --- Other possible matches ---
      // givenIclickOnTheLinkOnTheDepartureDeclarationsPage() [0.79] (DepartureDeclarationsStepDefSteps.scala) pattern: (?:I )?click on the (.+) link on the 'Departure declarations' page
      // givenIclickOnTheLinkOnTheDeclarationErrorsPage() [0.79] (DepartureDeclarationsStepDefSteps.scala) pattern: (?:I )?click on the (.+) link on the 'Declaration errors' page

      Then("I should be on the Review declaration errors page")
      // Possible match (best=1.00)
      thenIshouldbeOnTheReviewDeclarationErrorsPage()

      And("I sign out")
      // Possible match (best=1.00)
      andISignOut()

    }

    Scenario("06 - Trader is able to amend a declaration error for a departure declaration before MRN allocation") {
      When("I submit an IE015 Departure Declaration")
      // Possible match (best=1.00)
      givenIsubmitAFile("IE015 Departure Declaration")

      Then("I submit an IE056 Rejection With Amendable Errors")
      // Possible match (best=1.00)
      givenIsubmitAFile("IE056 Rejection With Amendable Errors")

      And("the user has submitted departureDeclaration.json for LRN 25GB000246TK0E6WJ1 and EORI number 1234567890")
      // Possible match (best=1.00)
      whenTheUserHasSubmittedFileForLRNAndEORINumber("departureDeclaration.json", "25GB000246TK0E6WJ1", "1234567890")

      And("I refresh the page")
      // Possible match (best=1.00)
      andIrefreshThePage()

      And("I click on the View departure declarations link on the Manage your transit movements page")
      // Possible match (best=0.95)
      givenIclickOnTheLinkOnTheManageYourTransitMovementsPage("View departure declarations")
      // --- Other possible matches ---
      // givenIclickOnTheLinkOnTheDepartureDeclarationsPage() [0.79] (DepartureDeclarationsStepDefSteps.scala) pattern: (?:I )?click on the (.+) link on the 'Departure declarations' page

      And("I click on the Amend declaration link for LRN 25GB000246TK0E6WJ1 on the Departure declarations page")
      // Possible match (best=0.90)
      andIclickOnTheXLinkForLRNXOnTheDepartureDeclarationsPage("Amend declaration", "25GB000246TK0E6WJ1")
      // --- Other possible matches ---
      // givenIclickOnTheLinkOnTheDepartureDeclarationsPage() [0.79] (DepartureDeclarationsStepDefSteps.scala) pattern: (?:I )?click on the (.+) link on the 'Departure declarations' page

      And("I click on the Amend errors button on the Amend declaration errors page")
      // Possible match (best=1.00)
      givenIclickOnTheAmendErrorsButtonOnTheAmendDeclarationErrorsPage()

      Then("I should be on the Declaration summary page")
      // Possible match (best=1.00)
      thenIshouldbeOnTheDeclarationSummaryPage()

      And("I sign out")
      // Possible match (best=1.00)
      andISignOut()

    }

    Scenario("07 - Trader is able to amend a declaration error for a departure declaration after MRN allocation") {
      When("I submit an IE015 Departure Declaration")
      // Possible match (best=1.00)
      givenIsubmitAFile("IE015 Departure Declaration")

      Then("I submit an IE028 MRN Allocated")
      // Possible match (best=1.00)
      givenIsubmitAFile("IE028 MRN Allocated")

      And("I submit an IE056 Rejection With Amendable Errors")
      // Possible match (best=1.00)
      givenIsubmitAFile("IE056 Rejection With Amendable Errors")

      And("the user has submitted departureDeclaration.json for LRN 25GB000246TK0E6WJ1 and EORI number 1234567890")
      // Possible match (best=1.00)
      whenTheUserHasSubmittedFileForLRNAndEORINumber("departureDeclaration.json", "25GB000246TK0E6WJ1", "1234567890")

      And("I refresh the page")
      // Possible match (best=1.00)
      andIrefreshThePage()

      And("I click on the View departure declarations link on the Manage your transit movements page")
      // Possible match (best=0.95)
      givenIclickOnTheLinkOnTheManageYourTransitMovementsPage("View departure declarations")
      // --- Other possible matches ---
      // givenIclickOnTheLinkOnTheDepartureDeclarationsPage() [0.79] (DepartureDeclarationsStepDefSteps.scala) pattern: (?:I )?click on the (.+) link on the 'Departure declarations' page

      And("I click on the Amend declaration link for LRN 25GB000246TK0E6WJ1 on the Departure declarations page")
      // Possible match (best=0.90)
      andIclickOnTheXLinkForLRNXOnTheDepartureDeclarationsPage("Amend declaration", "25GB000246TK0E6WJ1")
      // --- Other possible matches ---
      // givenIclickOnTheLinkOnTheDepartureDeclarationsPage() [0.79] (DepartureDeclarationsStepDefSteps.scala) pattern: (?:I )?click on the (.+) link on the 'Departure declarations' page

      And("I click on the Amend errors button on the Amend declaration errors page")
      // Possible match (best=1.00)
      givenIclickOnTheAmendErrorsButtonOnTheAmendDeclarationErrorsPage()

      Then("I should be on the What is the new Local Reference Number? page")
      // ⚠️ No step-def match found for: I should be on the What is the new Local Reference Number? page
      thenIshouldBeOnTheWhatIsTheLocalReferenceNumberPage()

      And("I sign out")
      // Possible match (best=1.00)
      andISignOut()

    }

    Scenario("08 - Trader is able to review errors for a amended departure declaration with no functional errors") {
      When("I submit an IE015 Departure Declaration")
      // Possible match (best=1.00)
      givenIsubmitAFile("IE015 Departure Declaration")

      Then("I submit an IE013 Declaration Amendment")
      // Possible match (best=1.00)
      givenIsubmitAFile("IE013 Declaration Amendment")

      And("I submit an IE056 Amendment Rejection With NO Amendable Errors")
      // Possible match (best=1.00)
      givenIsubmitAFile("IE056 Amendment Rejection With NO Amendable Errors")

      And("I refresh the page")
      // Possible match (best=1.00)
      andIrefreshThePage()

      And("I click on the View departure declarations link on the Manage your transit movements page")
      // Possible match (best=0.95)
      givenIclickOnTheLinkOnTheManageYourTransitMovementsPage("View departure declarations")
      // --- Other possible matches ---
      // givenIclickOnTheLinkOnTheDepartureDeclarationsPage() [0.79] (DepartureDeclarationsStepDefSteps.scala) pattern: (?:I )?click on the (.+) link on the 'Departure declarations' page

      And("I click on the View errors link for LRN 25GB000246TK0E6WJ1 on the Departure declarations page")
      // Possible match (best=0.90)
      andIclickOnTheXLinkForLRNXOnTheDepartureDeclarationsPage("View errors", "25GB000246TK0E6WJ1")
      // --- Other possible matches ---
      // givenIclickOnTheLinkOnTheDepartureDeclarationsPage() [0.79] (DepartureDeclarationsStepDefSteps.scala) pattern: (?:I )?click on the (.+) link on the 'Departure declarations' page
      // givenIclickOnTheLinkOnTheDeclarationErrorsPage() [0.79] (DepartureDeclarationsStepDefSteps.scala) pattern: (?:I )?click on the (.+) link on the 'Declaration errors' page

      Then("I should be on the Declaration errors page")
      // Possible match (best=1.00)
      thenIshouldbeOnTheDeclarationErrorsPage()

      And("I sign out")
      // Possible match (best=1.00)
      andISignOut()

    }

    Scenario("09 - Trader is able to review cancellation errors for a departure declaration") {
      When("I submit an IE015 Departure Declaration")
      // Possible match (best=1.00)
      givenIsubmitAFile("IE015 Departure Declaration")

      Then("I submit an IE014 Declaration Cancellation")
      // Possible match (best=1.00)
      givenIsubmitAFile("IE014 Declaration Cancellation")

      And("I submit an IE056 Cancellation Rejection With No Amendable Errors")
      // Possible match (best=1.00)
      givenIsubmitAFile("IE056 Cancellation Rejection With No Amendable Errors")

      And("I refresh the page")
      // Possible match (best=1.00)
      andIrefreshThePage()

      And("I click on the View departure declarations link on the Manage your transit movements page")
      // Possible match (best=0.95)
      givenIclickOnTheLinkOnTheManageYourTransitMovementsPage("View departure declarations")
      // --- Other possible matches ---
      // givenIclickOnTheLinkOnTheDepartureDeclarationsPage() [0.79] (DepartureDeclarationsStepDefSteps.scala) pattern: (?:I )?click on the (.+) link on the 'Departure declarations' page

      And("I click on the View errors link for LRN 25GB000246TK0E6WJ1 on the Departure declarations page")
      // Possible match (best=0.90)
      andIclickOnTheXLinkForLRNXOnTheDepartureDeclarationsPage("View errors", "25GB000246TK0E6WJ1")
      // --- Other possible matches ---
      // givenIclickOnTheLinkOnTheDepartureDeclarationsPage() [0.79] (DepartureDeclarationsStepDefSteps.scala) pattern: (?:I )?click on the (.+) link on the 'Departure declarations' page
      // givenIclickOnTheLinkOnTheDeclarationErrorsPage() [0.79] (DepartureDeclarationsStepDefSteps.scala) pattern: (?:I )?click on the (.+) link on the 'Declaration errors' page

      Then("I should be on the Review cancellation errors page")
      // Possible match (best=1.00)
      thenIshouldbeOnTheReviewCancellationErrorsPage()

      And("I sign out")
      // Possible match (best=1.00)
      andISignOut()

    }

    Scenario("10 Trader is able to cancel a departure declaration") {
      When("I submit an IE015 Departure Declaration")
      // Possible match (best=1.00)
      givenIsubmitAFile("IE015 Departure Declaration")

      Then("I submit an IE028 MRN Allocated")
      // Possible match (best=1.00)
      givenIsubmitAFile("IE028 MRN Allocated")

      Then("I refresh the page")
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

      And("I should be on the Are you sure you want to cancel this declaration? page")
      // ⚠️ No step-def match found for: I should be on the Are you sure you want to cancel this declaration? page
      thenIshouldbeOnTheAreYouSureYouWantToCancelThisDeclarationPage()

      And("I sign out")
      // Possible match (best=1.00)
      andISignOut()

    }

    Scenario("11 Trader is able to review IE035 message details for Goods being recovered") {
      When("I submit an IE015 Departure Declaration")
      // Possible match (best=1.00)
      givenIsubmitAFile("IE015 Departure Declaration")

      Then("I submit an IE035 Recovery Notification")
      // Possible match (best=1.00)
      givenIsubmitAFile("IE035 Recovery Notification")

      And("I refresh the page")
      // Possible match (best=1.00)
      andIrefreshThePage()

      And("I click on the View departure declarations link on the Manage your transit movements page")
      // Possible match (best=0.95)
      givenIclickOnTheLinkOnTheManageYourTransitMovementsPage("View departure declarations")
      // --- Other possible matches ---
      // givenIclickOnTheLinkOnTheDepartureDeclarationsPage() [0.79] (DepartureDeclarationsStepDefSteps.scala) pattern: (?:I )?click on the (.+) link on the 'Departure declarations' page

      And("I click on the View details link for LRN 25GB000246TK0E6WJ1 on the Departure declarations page")
      // Possible match (best=0.90)
      andIclickOnTheXLinkForLRNXOnTheDepartureDeclarationsPage("View details", "25GB000246TK0E6WJ1")
      // --- Other possible matches ---
      // givenIclickOnTheLinkOnTheDepartureDeclarationsPage() [0.79] (DepartureDeclarationsStepDefSteps.scala) pattern: (?:I )?click on the (.+) link on the 'Departure declarations' page

      Then("I should be on the Goods being recovered page")
      // Possible match (best=1.00)
      thenIshouldbeOnTheGoodsBeingRecoveredPage()

      And("I sign out")
      // Possible match (best=1.00)
      andISignOut()

    }

    Scenario("12 Trader is able to review IE051 message details for Goods not released") {
      When("I submit an IE015 Departure Declaration")
      // Possible match (best=1.00)
      givenIsubmitAFile("IE015 Departure Declaration")

      Then("I submit an IE051 No Release For Transit")
      // Possible match (best=1.00)
      givenIsubmitAFile("IE051 No Release For Transit")

      And("I refresh the page")
      // Possible match (best=1.00)
      andIrefreshThePage()

      And("I click on the View departure declarations link on the Manage your transit movements page")
      // Possible match (best=0.95)
      givenIclickOnTheLinkOnTheManageYourTransitMovementsPage("View departure declarations")
      // --- Other possible matches ---
      // givenIclickOnTheLinkOnTheDepartureDeclarationsPage() [0.79] (DepartureDeclarationsStepDefSteps.scala) pattern: (?:I )?click on the (.+) link on the 'Departure declarations' page

      And("I click on the View details link for LRN 25GB000246TK0E6WJ1 on the Departure declarations page")
      // Possible match (best=0.90)
      andIclickOnTheXLinkForLRNXOnTheDepartureDeclarationsPage("View details", "25GB000246TK0E6WJ1")
      // --- Other possible matches ---
      // givenIclickOnTheLinkOnTheDepartureDeclarationsPage() [0.79] (DepartureDeclarationsStepDefSteps.scala) pattern: (?:I )?click on the (.+) link on the 'Departure declarations' page

      Then("I should be on the Goods not released page")
      // Possible match (best=1.00)
      thenIshouldbeOnTheGoodsNotReleasedPage()

      And("I sign out")
      // Possible match (best=1.00)
      andISignOut()

    }

    Scenario("14 Trader completes a departure declaration that was previously pre-lodged") {
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

      And(
        "I click on the Complete pre lodged declaration link for LRN 25GB000246TK0E6WJ1 on the Departure declarations page"
      )
      // Possible match (best=0.90)
      andIclickOnTheXLinkForLRNXOnTheDepartureDeclarationsPage("Complete pre lodged declaration", "25GB000246TK0E6WJ1")
      // --- Other possible matches ---
      // givenIclickOnTheLinkOnTheDepartureDeclarationsPage() [0.79] (DepartureDeclarationsStepDefSteps.scala) pattern: (?:I )?click on the (.+) link on the 'Departure declarations' page

      Then("I should be on the More information needed to complete pre-lodged declaration page")
      // ⚠️ No step-def match found for: I should be on the More information needed to complete pre-lodged declaration page
      andIshouldBeOnTheMoreInformationNeededToCompletePrelodgedDeclarationPage()

    }

    Scenario("15 Trader completes a pre-lodge departure followed by an amendment and is able to complete a pre-lodge") {
      When("I submit an IE015 Simplified Prelodged Departure Declaration Full")
      // Possible match (best=1.00)
      givenIsubmitAFile("IE015 Simplified Prelodged Departure Declaration Full")

      Then("I submit an IE928 Positive Acknowledgment")
      // Possible match (best=1.00)
      givenIsubmitAFile("IE928 Positive Acknowledgment")

      When("I submit an IE013 Simplified Prelodged Departure Declaration Full")
      // Possible match (best=1.00)
      givenIsubmitAFile("IE013 Simplified Prelodged Departure Declaration Full")

      Then("I submit an IE004 Amendment Acceptance")
      // Possible match (best=1.00)
      givenIsubmitAFile("IE004 Amendment Acceptance")

      And("I refresh the page")
      // Possible match (best=1.00)
      andIrefreshThePage()

      And("I click on the View departure declarations link on the Manage your transit movements page")
      // Possible match (best=0.95)
      givenIclickOnTheLinkOnTheManageYourTransitMovementsPage("View departure declarations")
      // --- Other possible matches ---
      // givenIclickOnTheLinkOnTheDepartureDeclarationsPage() [0.79] (DepartureDeclarationsStepDefSteps.scala) pattern: (?:I )?click on the (.+) link on the 'Departure declarations' page

      And(
        "I click on the Complete pre lodged declaration link for LRN 25GB000246TK0E6WJ1 on the Departure declarations page"
      )
      // Possible match (best=0.90)
      andIclickOnTheXLinkForLRNXOnTheDepartureDeclarationsPage("Complete pre lodged declaration", "25GB000246TK0E6WJ1")
      // --- Other possible matches ---
      // givenIclickOnTheLinkOnTheDepartureDeclarationsPage() [0.79] (DepartureDeclarationsStepDefSteps.scala) pattern: (?:I )?click on the (.+) link on the 'Departure declarations' page

      Then("I should be on the More information needed to complete pre-lodged declaration page")
      // ⚠️ No step-def match found for: I should be on the More information needed to complete pre-lodged declaration page
      andIshouldBeOnTheMoreInformationNeededToCompletePrelodgedDeclarationPage()

    }

    Scenario(
      "16 Trader is sent to declaration completed page for a pre-lodge declaration where all details were completed initially"
    ) {
      When("I submit an IE015 Normal Prelodged Departure Declaration Complete")
      // Possible match (best=1.00)
      givenIsubmitAFile("IE015 Normal Prelodged Departure Declaration Complete")

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

      And(
        "I click on the Complete pre lodged declaration link for LRN 25GB000246TK0E6WJ1 on the Departure declarations page"
      )
      // Possible match (best=0.90)
      andIclickOnTheXLinkForLRNXOnTheDepartureDeclarationsPage("Complete pre lodged declaration", "25GB000246TK0E6WJ1")
      // --- Other possible matches ---
      // givenIclickOnTheLinkOnTheDepartureDeclarationsPage() [0.79] (DepartureDeclarationsStepDefSteps.scala) pattern: (?:I )?click on the (.+) link on the 'Departure declarations' page

      Then("I should be on the Confirmation needed to complete pre-lodged declaration page")
      // ⚠️ No step-def match found for: I should be on the Confirmation needed to complete pre-lodged declaration page
      thenIshouldbeOnTheConfirmationNeededToCompletePrelodgedDeclarationPage()

      And("I click the Continue button on the presentation Confirmation needed to complete pre-lodged declaration page")
      // ⚠️ No step-def match found for: I click the Continue button on the presentation Confirmation needed to complete pre-lodged declaration page
      andIclickTheContinueButtonOnThePresentationMoreInformationNeededToCompletePrelodgedDeclarationPage()

      Then("I should be on the Presentation Notification Check your answers page")
      // Possible match (best=1.00)
      thenIshouldbeOnThePresentationNotificationCheckYourAnswersPage()

    }

    Scenario("17 Trader is able to see a control decision notification IE060 for a pre-lodged declaration") {
      When("I submit an IE015 Normal Prelodged Departure Declaration Complete")
      // Possible match (best=1.00)
      givenIsubmitAFile("IE015 Normal Prelodged Departure Declaration Complete")

      Then("I submit an IE928 Positive Acknowledgment")
      // Possible match (best=1.00)
      givenIsubmitAFile("IE928 Positive Acknowledgment")

      Then("I submit an IE060 Control Decision Type 2")
      // Possible match (best=1.00)
      givenIsubmitAFile("IE060 Control Decision Type 2")

      And("I refresh the page")
      // Possible match (best=1.00)
      andIrefreshThePage()

      And("I click on the View departure declarations link on the Manage your transit movements page")
      // Possible match (best=0.95)
      givenIclickOnTheLinkOnTheManageYourTransitMovementsPage("View departure declarations")
      // --- Other possible matches ---
      // givenIclickOnTheLinkOnTheDepartureDeclarationsPage() [0.79] (DepartureDeclarationsStepDefSteps.scala) pattern: (?:I )?click on the (.+) link on the 'Departure declarations' page

      And("I click on the View details link for LRN 25GB000246TK0E6WJ1 on the Departure declarations page")
      // Possible match (best=0.90)
      andIclickOnTheXLinkForLRNXOnTheDepartureDeclarationsPage("View details", "25GB000246TK0E6WJ1")
      // --- Other possible matches ---
      // givenIclickOnTheLinkOnTheDepartureDeclarationsPage() [0.79] (DepartureDeclarationsStepDefSteps.scala) pattern: (?:I )?click on the (.+) link on the 'Departure declarations' page

      Then("I should be on the Intention to control - complete pre-lodged declaration page")
      // ⚠️ No step-def match found for: I should be on the Intention to control - complete pre-lodged declaration page
      thenIshouldBeOnTheIntentionToControlCompletePrelodgedDeclarationPage()

      And("I sign out")
      // Possible match (best=1.00)
      andISignOut()

    }

    Scenario("18 Trader is able to see a departure rejection WITH NO functional errors for a pre-lodged declaration") {
      When("I submit an IE015 Normal Prelodged Departure Declaration Complete")
      // Possible match (best=1.00)
      givenIsubmitAFile("IE015 Normal Prelodged Departure Declaration Complete")

      Then("I submit an IE928 Positive Acknowledgment")
      // Possible match (best=1.00)
      givenIsubmitAFile("IE928 Positive Acknowledgment")

      Then("I submit an IE170 Presentation Notification PreLodge")
      // Possible match (best=1.00)
      givenIsubmitAFile("IE170 Presentation Notification PreLodge")

      Then("I submit an IE056 Rejection Of IE170 No Errors")
      // Possible match (best=1.00)
      givenIsubmitAFile("IE056 Rejection Of IE170 No Errors")

      And("I refresh the page")
      // Possible match (best=1.00)
      andIrefreshThePage()

      And("I click on the View departure declarations link on the Manage your transit movements page")
      // Possible match (best=0.95)
      givenIclickOnTheLinkOnTheManageYourTransitMovementsPage("View departure declarations")
      // --- Other possible matches ---
      // givenIclickOnTheLinkOnTheDepartureDeclarationsPage() [0.79] (DepartureDeclarationsStepDefSteps.scala) pattern: (?:I )?click on the (.+) link on the 'Departure declarations' page

      And("I click on the View errors link for LRN 25GB000246TK0E6WJ1 on the Departure declarations page")
      // Possible match (best=0.90)
      andIclickOnTheXLinkForLRNXOnTheDepartureDeclarationsPage("View errors", "25GB000246TK0E6WJ1")
      // --- Other possible matches ---
      // givenIclickOnTheLinkOnTheDepartureDeclarationsPage() [0.79] (DepartureDeclarationsStepDefSteps.scala) pattern: (?:I )?click on the (.+) link on the 'Departure declarations' page
      // givenIclickOnTheLinkOnTheDeclarationErrorsPage() [0.79] (DepartureDeclarationsStepDefSteps.scala) pattern: (?:I )?click on the (.+) link on the 'Declaration errors' page

      And("I click on the Complete pre-lodged declaration link on the Prelodged declaration errors page")
      // Possible match (best=0.94)
      givenIclickOnTheLinkOnThePrelodgedDeclarationErrorsPage("Complete pre-lodged declaration")
      // --- Other possible matches ---
      // givenIclickOnTheLinkOnTheDeclarationErrorsPage() [0.79] (DepartureDeclarationsStepDefSteps.scala) pattern: (?:I )?click on the (.+) link on the 'Declaration errors' page
      // givenIclickOnTheLinkOnTheReviewPrelodgedDeclarationErrorsPage() [0.75] (DepartureDeclarationsStepDefSteps.scala) pattern: (?:I )?click on the (.+) link on the 'Review pre-lodged declaration errors' page

      Then("I should be on the Confirmation needed to complete pre-lodged declaration page")
      // ⚠️ No step-def match found for: I should be on the Confirmation needed to complete pre-lodged declaration page
      thenIshouldbeOnTheConfirmationNeededToCompletePrelodgedDeclarationPage()

      And("I sign out")
      // Possible match (best=1.00)
      andISignOut()

    }

    Scenario("19 Trader is able to see a departure rejection WITH functional errors for a pre-lodged declaration") {
      When("I submit an IE015 Normal Prelodged Departure Declaration Complete")
      // Possible match (best=1.00)
      givenIsubmitAFile("IE015 Normal Prelodged Departure Declaration Complete")

      Then("I submit an IE928 Positive Acknowledgment")
      // Possible match (best=1.00)
      givenIsubmitAFile("IE928 Positive Acknowledgment")

      Then("I submit an IE170 Presentation Notification PreLodge")
      // Possible match (best=1.00)
      givenIsubmitAFile("IE170 Presentation Notification PreLodge")

      Then("I submit an IE056 Rejection Of IE170 With Errors")
      // Possible match (best=1.00)
      givenIsubmitAFile("IE056 Rejection Of IE170 With Errors")

      And("I refresh the page")
      // Possible match (best=1.00)
      andIrefreshThePage()

      And("I click on the View departure declarations link on the Manage your transit movements page")
      // Possible match (best=0.95)
      givenIclickOnTheLinkOnTheManageYourTransitMovementsPage("View departure declarations")
      // --- Other possible matches ---
      // givenIclickOnTheLinkOnTheDepartureDeclarationsPage() [0.79] (DepartureDeclarationsStepDefSteps.scala) pattern: (?:I )?click on the (.+) link on the 'Departure declarations' page

      And("I click on the View errors link for LRN 25GB000246TK0E6WJ1 on the Departure declarations page")
      // Possible match (best=0.90)
      andIclickOnTheXLinkForLRNXOnTheDepartureDeclarationsPage("View errors ", "25GB000246TK0E6WJ1")
      // --- Other possible matches ---
      // givenIclickOnTheLinkOnTheDepartureDeclarationsPage() [0.79] (DepartureDeclarationsStepDefSteps.scala) pattern: (?:I )?click on the (.+) link on the 'Departure declarations' page
      // givenIclickOnTheLinkOnTheDeclarationErrorsPage() [0.79] (DepartureDeclarationsStepDefSteps.scala) pattern: (?:I )?click on the (.+) link on the 'Declaration errors' page

      And("I click on the Complete pre-lodged declaration link on the Review pre-lodged declaration errors page")
      // Possible match (best=0.80)
      givenIclickOnTheLinkOnTheReviewPrelodgedDeclarationErrorsPage("Complete pre-lodged declaration")
      // --- Other possible matches ---
      // givenIclickOnTheLinkOnTheDeclarationErrorsPage() [0.79] (DepartureDeclarationsStepDefSteps.scala) pattern: (?:I )?click on the (.+) link on the 'Declaration errors' page

      Then("I should be on the Confirmation needed to complete pre-lodged declaration page")
      // ⚠️ No step-def match found for: I should be on the Confirmation needed to complete pre-lodged declaration page
      thenIshouldbeOnTheConfirmationNeededToCompletePrelodgedDeclarationPage()

      And("I sign out")
      // Possible match (best=1.00)
      andISignOut()

    }
  }
}
