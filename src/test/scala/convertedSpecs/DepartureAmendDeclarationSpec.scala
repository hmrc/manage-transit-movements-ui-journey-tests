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

package convertedSpecs

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
import specsteps.DepartureConfirmationStepDefSteps.*
import specsteps.DepartureDeclarationsStepDefSteps.*
import specsteps.Departure_GuaranteeDetailsStepDefSteps.*
import specsteps.DocumentsStepDefSteps.*
import specsteps.ItemDetailsStepDefSteps.*
import specsteps.LoginStepDefSteps.*
import specsteps.ManageStepDefSteps.*
import specsteps.PreTaskListStepDefSteps.*
import specsteps.PreviousStepDefSteps.*
import specsteps.RouteDetailsLocationOfGoodsStepDefSteps.*
import specsteps.TaskListStepDefSteps.*
import specsteps.TraderDetailsStepDefSteps.*
import specsteps.TransportEquipmentChargesStepDefSteps.*
import org.scalatest.GivenWhenThen

class DepartureAmendDeclarationSpec extends BaseSpec with GivenWhenThen {

  Feature("End to end journey for amending a departure declaration - Post Transition") {

    Scenario("01 End to end journey for amending a departure declaration before MRN allocation") {
      Given("I login with ID 1234567890")
      // Possible match (best=1.00)
      andILoginWithIDX("1234567890")

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

      And("I should see Error status for trader details on the Declaration summary page")
      // Possible match (best=0.88)
      andIshouldSeeXStatusForOnTheDeclarationSummaryPage("Error", "trader details ")

      And("I should see Error status for route details on the Declaration summary page")
      // Possible match (best=0.88)
      andIshouldSeeXStatusForOnTheDeclarationSummaryPage("Error", "route details")

      And("I should see Error status for transport details on the Declaration summary page")
      // Possible match (best=0.88)
      andIshouldSeeXStatusForOnTheDeclarationSummaryPage("Error", "transport details")

      And("I should see Error status for documents on the Declaration summary page")
      // Possible match (best=0.88)
      andIshouldSeeXStatusForOnTheDeclarationSummaryPage("Error", "documents")

      And("I should see Error status for items on the Declaration summary page")
      // Possible match (best=0.88)
      andIshouldSeeXStatusForOnTheDeclarationSummaryPage("Error", "items")

      And("I should see Error status for guarantee details on the Declaration summary page")
      // Possible match (best=0.88)
      andIshouldSeeXStatusForOnTheDeclarationSummaryPage("Error", "guarantee details")

      And("I click on the Amend trader details link on the Declaration summary page")
      // Possible match (best=0.94)
      thenIclickOnTheLinkOnTheDeclarationSummaryPage("Amend trader details")
      // --- Other possible matches ---
      // thenIclickTheLinkOnTheDeclarationSummaryPage() [0.78] (TaskListStepDefSteps.scala) pattern: (?:I )?click the (.+) link on the 'Declaration summary' page

      And("I click the Change link for Do you want to add a contact? on the Trader details Check your answers page")
      // Possible match (best=0.80)
      andIclickTheChangeLinkForOnTheCheckYourAnswersPage("Change")

      And("I choose radio option No on the Do you want to add a contact for the transit holder? page")
      // Possible match (best=0.81)
      andIchooseRadioOptionXOnTheDoYouWantToAddAContactForTheTransitHolderPage("No")
      // --- Other possible matches ---
      // andIchooseRadioOptionXOnTheDoYouWantToAddAContactForTheConsignorPage() [0.77] (TraderDetailsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a contact for the consignor\?' page
      // andIchooseRadioOptionXOnThEDoYouWantToAddAContactForTheCarrierPage() [0.77] (CarrierDetailsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a contact for the carrier\?' page
      // andIchooseRadioOptionXOnTheDoYouWantToAddAnAuthorisationPage() [0.76] (TransportAuthorisationsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add an authorisation' page
      // andIchooseRadioOptionXOnTheDoYouWantToAddASealPage() [0.76] (TransportEquipmentChargesStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a seal\?' page
      // andIChooseRadioOptionXOnTheDoYouWantToAddACarrierPage() [0.76] (CarrierDetailsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a carrier\?' page

      And("I submit on the Check your answers section Trader details page")
      // Possible match (best=1.00)
      andIsubmitOnTheCheckYourAnswersSectionXPage("Trader details")

      And("I should see Amended status for trader details on the Declaration summary page")
      // Possible match (best=0.88)
      andIshouldSeeXStatusForOnTheDeclarationSummaryPage("Amended", "trader details")

      And("I click on the Amend route details link on the Declaration summary page")
      // Possible match (best=0.94)
      thenIclickOnTheLinkOnTheDeclarationSummaryPage("Amend route details")
      // --- Other possible matches ---
      // thenIclickTheLinkOnTheDeclarationSummaryPage() [0.78] (TaskListStepDefSteps.scala) pattern: (?:I )?click the (.+) link on the 'Declaration summary' page

      And(
        "I click the Change link for Do you want to add a contact for the location of goods? on the Route details Check your answers page"
      )
      // Possible match (best=0.80)
      andIclickTheChangeLinkForOnTheCheckYourAnswersPage("Change")

      And("I choose radio option No on the Do you want to add a contact for the location of goods? page")
      // Possible match (best=0.82)
      andIchooseRadioOptionXOnTheDoYouWantToAddAContactForTheLocationOfGoodsPage("No")
      // --- Other possible matches ---
      // andIchooseRadioOptionXOnTheDoYouWantToAddALocationOfGoodsPage() [0.81] (RouteDetailsLocationOfGoodsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a location of goods\?' page
      // andIchooseRadioOptionXOnThePresentationDoYouWantToAddAContactForTheLocationOfGoodsPage() [0.78] (PresentationNotificationStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the presentation 'Do you want to add a contact for the location of goods\?' page
      // andIchooseRadioOptionXOnTheDoYouWantToAddAContactForTheConsignorPage() [0.77] (TraderDetailsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a contact for the consignor\?' page
      // andIchooseRadioOptionXOnThEDoYouWantToAddAContactForTheCarrierPage() [0.77] (CarrierDetailsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a contact for the carrier\?' page
      // andIchooseRadioOptionXOnTheDoYouWantToAddAnAuthorisationPage() [0.76] (TransportAuthorisationsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add an authorisation' page
      // andIchooseRadioOptionXOnTheDoYouWantToAddASealPage() [0.76] (TransportEquipmentChargesStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a seal\?' page
      // andIChooseRadioOptionXOnTheDoYouWantToAddACarrierPage() [0.76] (CarrierDetailsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a carrier\?' page
      // andIchooseRadioOptionXOnTheDoYouWantToAddAnAdditionalIdentifierForTheLocationOfGoodsPage() [0.75] (RouteDetailsLocationOfGoodsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add an additional identifier for the location of goods\?' page
      // andIchooseRadioOptionXOnTheArrivalLocationOfGoodsAddContactPage() [0.75] (LocationOfGoodsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the arrival location of goods add contact page

      And("I submit on the Check your answers section Route details page")
      // Possible match (best=1.00)
      andIsubmitOnTheCheckYourAnswersSectionXPage("Route details")

      And("I should see Amended status for route details on the Declaration summary page")
      // Possible match (best=0.88)
      andIshouldSeeXStatusForOnTheDeclarationSummaryPage("Amended", "route details")

      And("I click on the Amend transport details link on the Declaration summary page")
      // Possible match (best=0.94)
      thenIclickOnTheLinkOnTheDeclarationSummaryPage("Amend transport details")
      // --- Other possible matches ---
      // thenIclickTheLinkOnTheDeclarationSummaryPage() [0.78] (TaskListStepDefSteps.scala) pattern: (?:I )?click the (.+) link on the 'Declaration summary' page

      And(
        "I click the Change link for Do you want to add a method of payment for transport charges? on the Transport details Check your answers page"
      )
      // Possible match (best=0.80)
      andIclickTheChangeLinkForOnTheCheckYourAnswersPage("Change")

      And("I choose radio option No on the Do you want to add a method of payment for transport charges? page")
      // Possible match (best=0.82)
      andIchooseRadioOptionXOnTheDoYouWantToAddAMethodOfPaymentForTransportChargesPage("No")
      // --- Other possible matches ---
      // andIchooseRadioOptionXOnTheDoYouWantToAddAnAuthorisationPage() [0.76] (TransportAuthorisationsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add an authorisation' page
      // andIchooseRadioOptionXOnTheDoYouWantToAddASealPage() [0.76] (TransportEquipmentChargesStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a seal\?' page
      // andIChooseRadioOptionXOnTheDoYouWantToAddACarrierPage() [0.76] (CarrierDetailsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a carrier\?' page

      And("I submit on the Check your answers section Transport details page")
      // Possible match (best=1.00)
      andIsubmitOnTheCheckYourAnswersSectionXPage("Transport details")

      And("I should see Amended status for transport details on the Declaration summary page")
      // Possible match (best=0.88)
      andIshouldSeeXStatusForOnTheDeclarationSummaryPage("Amended", "transport details")

      And("I click on the Amend documents link on the Declaration summary page")
      // Possible match (best=0.94)
      thenIclickOnTheLinkOnTheDeclarationSummaryPage("Amend")
      // --- Other possible matches ---
      // thenIclickTheLinkOnTheDeclarationSummaryPage() [0.78] (TaskListStepDefSteps.scala) pattern: (?:I )?click the (.+) link on the 'Declaration summary' page

      And("I click the Change link on the You have added 3 documents page")
      // Possible match (best=0.89)
      whenIclickTheXLinkOnTheYouHaveAddedXDocumentsPage("Change", "3")

      And(
        "I click the Change link for Do you want to add any additional information for this document? on the Documents Check your answers page"
      )
      // Possible match (best=0.80)
      andIclickTheChangeLinkForOnTheCheckYourAnswersPage("Change")

      And("I click radio option No on the Do you want to add any additional information for this document? page")
      // Possible match (best=0.81)
      andIclickRadioOptionXOnTheDoYouWantToAddAnyAdditionalInformationForThisDocumentPage("No")
      // --- Other possible matches ---
      // andIclickRadioOptionXOnTheDoYouWantToAddAnyAdditionalInformationForThisItemPage() [0.78] (ItemDetailsStepDefSteps.scala) pattern: (?:I )?click radio option (.*) on the 'Do you want to add any additional information for this item\?' page
      // andIclickRadioOptionXOnTheDoYouWantToAddAnyCommentsForTheAdditionalInformationPage() [0.78] (ItemDetailsStepDefSteps.scala) pattern: (?:I )?click radio option (.*) on the 'Do you want to add any comments for the additional information\?' page
      // andIclickRadioOptionXOnTheDoYouWantToAddAnyDocumentsPage() [0.76] (ItemDetailsStepDefSteps.scala) pattern: (?:I )?click radio option (.*) on the 'Do you want to add any documents\?' page

      And("I submit on the Check your answers section Documents page")
      // Possible match (best=1.00)
      andIsubmitOnTheCheckYourAnswersSectionXPage("Documents")

      And("I choose radio option No on the You have added 3 documents page")
      // Possible match (best=0.89)
      andIchooseRadioOptionXOnTheYouHaveAddedXDocumentsPage("No", "3")

      And("I should see Amended status for documents on the Declaration summary page")
      // Possible match (best=0.88)
      andIshouldSeeXStatusForOnTheDeclarationSummaryPage("Amend", "documents")

      And("I click on the Amend items link on the Declaration summary page")
      // Possible match (best=0.94)
      thenIclickOnTheLinkOnTheDeclarationSummaryPage("Amend items")
      // --- Other possible matches ---
      // thenIclickTheLinkOnTheDeclarationSummaryPage() [0.78] (TaskListStepDefSteps.scala) pattern: (?:I )?click the (.+) link on the 'Declaration summary' page

      And("I click the Change link on the You have added 1 item page")
      // ⚠️ No step-def match found for: I click the Change link on the You have added 1 item page
      andIclickTheXLinkOnTheYouHaveAddedXItemsPage("Change", "1")

      And("I click the Change link for Do you want to add supplementary units? on the Item 1 Check your answers page")
      // Possible match (best=0.80)
      andIclickTheChangeLinkForOnTheCheckYourAnswersPage("Change")

      And("I click radio option No on the Do you want to add supplementary units? page")
      // Possible match (best=0.80)
      andIclickRadioOptionXOnTheDoYouWantToAddSupplementaryUnitsPage("No")

      And("I submit on the Check your answers section Items page")
      // Possible match (best=1.00)
      andIsubmitOnTheCheckYourAnswersSectionXPage("Items")

      And("I click radio option No on the You have added 1 item page")
      // Possible match (best=0.89)
      andIclickRadioOptionXOnTheYouHaveAddedXItemPage("No", "1")

      And("I should see Amended status for items on the Declaration summary page")
      // Possible match (best=0.88)
      andIshouldSeeXStatusForOnTheDeclarationSummaryPage("Amended", "items")

      And("I click on the Amend guarantee details link on the Declaration summary page")
      // Possible match (best=0.94)
      thenIclickOnTheLinkOnTheDeclarationSummaryPage("Amend")
      // --- Other possible matches ---
      // thenIclickTheLinkOnTheDeclarationSummaryPage() [0.78] (TaskListStepDefSteps.scala) pattern: (?:I )?click the (.+) link on the 'Declaration summary' page

      And("I click the Change link on the You have added 4 guarantees page")
      // Possible match (best=0.89)
      andIclickTheXLinkOnTheYouHaveAddedXGuaranteesPage("Change", "4")

      And("I click the Change link for Liability amount on the Guarantee details Check your answers page")
      // Possible match (best=0.80)
      andIclickTheChangeLinkForOnTheCheckYourAnswersPage("Change")

      And("I enter 999.99 on the How much is the liability in pounds? page")
      // Possible match (best=0.80)
      andIenterOnTheHowMuchIsTheLiabilityInPoundsPage("999.9")

      And("I submit on the Check your answers section Guarantee details page")
      // Possible match (best=1.00)
      andIsubmitOnTheCheckYourAnswersSectionXPage("Guarantee details")

      And("I choose radio option No on the You have added 4 guarantees page")
      // Possible match (best=0.89)
      whenIchooseRadioOptionXOnTheYouHaveAddedXGuaranteesPage("No", "4")

      And("I should see Amended status for guarantee details on the Declaration summary page")
      // Possible match (best=0.88)
      andIshouldSeeXStatusForOnTheDeclarationSummaryPage("Amended", "guarantee details")

      And("I click the Confirm and resend button on the Declaration summary page")
      andIclickTheConfirmAndResendConfirmAndSendButtonOnTheDeclarationSummaryPage()
      // ⚠️ No step-def match found for: I click the Confirm and resend button on the Declaration summary page

      And("I click the Sign out link on the Departure declaration sent page")
      // Possible match (best=0.94)
      andIclickTheLinkOnTheDepartureDeclarationSentPage("Sign out")

    }

    Scenario("02 End to end journey for amending a departure declaration after MRN allocation") {
      Given("I login with ID 1234567890")
      // Possible match (best=1.00)
      andILoginWithIDX("1234567890")

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

      Then("I input a random LRN on the What is the new Local Reference Number? page")
      // ⚠️ No step-def match found for: I input a random LRN on the What is the new Local Reference Number? page
      whenIInputARandomLRNOnTheWhatIsTheNewLocalReferenceNumberPage()

      And("I should see Error status for trader details on the Declaration summary page")
      // Possible match (best=0.88)
      andIshouldSeeXStatusForOnTheDeclarationSummaryPage("Error", "trader details")

      And("I should see Error status for route details on the Declaration summary page")
      // Possible match (best=0.88)
      andIshouldSeeXStatusForOnTheDeclarationSummaryPage("Error", "route details")

      And("I should see Error status for transport details on the Declaration summary page")
      // Possible match (best=0.88)
      andIshouldSeeXStatusForOnTheDeclarationSummaryPage("Error", "transport details")

      And("I should see Error status for documents on the Declaration summary page")
      // Possible match (best=0.88)
      andIshouldSeeXStatusForOnTheDeclarationSummaryPage("Error", "documents")

      And("I should see Error status for items on the Declaration summary page")
      // Possible match (best=0.88)
      andIshouldSeeXStatusForOnTheDeclarationSummaryPage("Error", "items")

      And("I should see Error status for guarantee details on the Declaration summary page")
      // Possible match (best=0.88)
      andIshouldSeeXStatusForOnTheDeclarationSummaryPage("Error", "guarantee details")

      And("I click on the Amend trader details link on the Declaration summary page")
      // Possible match (best=0.94)
      thenIclickOnTheLinkOnTheDeclarationSummaryPage("Amend")
      // --- Other possible matches ---
      // thenIclickTheLinkOnTheDeclarationSummaryPage() [0.78] (TaskListStepDefSteps.scala) pattern: (?:I )?click the (.+) link on the 'Declaration summary' page

      And("I click the Change link for Do you want to add a contact? on the Trader details Check your answers page")
      // Possible match (best=0.80)
      andIclickTheChangeLinkForOnTheCheckYourAnswersPage("Change")

      And("I choose radio option No on the Do you want to add a contact for the transit holder? page")
      // Possible match (best=0.81)
      andIchooseRadioOptionXOnTheDoYouWantToAddAContactForTheTransitHolderPage("No")
      // --- Other possible matches ---
      // andIchooseRadioOptionXOnTheDoYouWantToAddAContactForTheConsignorPage() [0.77] (TraderDetailsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a contact for the consignor\?' page
      // andIchooseRadioOptionXOnThEDoYouWantToAddAContactForTheCarrierPage() [0.77] (CarrierDetailsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a contact for the carrier\?' page
      // andIchooseRadioOptionXOnTheDoYouWantToAddAnAuthorisationPage() [0.76] (TransportAuthorisationsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add an authorisation' page
      // andIchooseRadioOptionXOnTheDoYouWantToAddASealPage() [0.76] (TransportEquipmentChargesStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a seal\?' page
      // andIChooseRadioOptionXOnTheDoYouWantToAddACarrierPage() [0.76] (CarrierDetailsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a carrier\?' page

      And("I submit on the Check your answers section Trader details page")
      // Possible match (best=1.00)
      andIsubmitOnTheCheckYourAnswersSectionXPage("Trader details")

      And("I should see Amended status for trader details on the Declaration summary page")
      // Possible match (best=0.88)
      andIshouldSeeXStatusForOnTheDeclarationSummaryPage("Amended", "trader details")

      And("I click on the Amend route details link on the Declaration summary page")
      // Possible match (best=0.94)
      thenIclickOnTheLinkOnTheDeclarationSummaryPage("Amend")
      // --- Other possible matches ---
      // thenIclickTheLinkOnTheDeclarationSummaryPage() [0.78] (TaskListStepDefSteps.scala) pattern: (?:I )?click the (.+) link on the 'Declaration summary' page

      And(
        "I click the Change link for Do you want to add a contact for the location of goods? on the Route details Check your answers page"
      )
      // Possible match (best=0.80)
      andIclickTheChangeLinkForOnTheCheckYourAnswersPage("Change")

      And("I choose radio option No on the Do you want to add a contact for the location of goods? page")
      // Possible match (best=0.82)
      andIchooseRadioOptionXOnTheDoYouWantToAddAContactForTheLocationOfGoodsPage("No")
      // --- Other possible matches ---
      // andIchooseRadioOptionXOnTheDoYouWantToAddALocationOfGoodsPage() [0.81] (RouteDetailsLocationOfGoodsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a location of goods\?' page
      // andIchooseRadioOptionXOnThePresentationDoYouWantToAddAContactForTheLocationOfGoodsPage() [0.78] (PresentationNotificationStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the presentation 'Do you want to add a contact for the location of goods\?' page
      // andIchooseRadioOptionXOnTheDoYouWantToAddAContactForTheConsignorPage() [0.77] (TraderDetailsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a contact for the consignor\?' page
      // andIchooseRadioOptionXOnThEDoYouWantToAddAContactForTheCarrierPage() [0.77] (CarrierDetailsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a contact for the carrier\?' page
      // andIchooseRadioOptionXOnTheDoYouWantToAddAnAuthorisationPage() [0.76] (TransportAuthorisationsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add an authorisation' page
      // andIchooseRadioOptionXOnTheDoYouWantToAddASealPage() [0.76] (TransportEquipmentChargesStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a seal\?' page
      // andIChooseRadioOptionXOnTheDoYouWantToAddACarrierPage() [0.76] (CarrierDetailsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a carrier\?' page
      // andIchooseRadioOptionXOnTheDoYouWantToAddAnAdditionalIdentifierForTheLocationOfGoodsPage() [0.75] (RouteDetailsLocationOfGoodsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add an additional identifier for the location of goods\?' page
      // andIchooseRadioOptionXOnTheArrivalLocationOfGoodsAddContactPage() [0.75] (LocationOfGoodsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the arrival location of goods add contact page

      And("I submit on the Check your answers section Route details page")
      // Possible match (best=1.00)
      andIsubmitOnTheCheckYourAnswersSectionXPage("Route details")

      And("I should see Amended status for route details on the Declaration summary page")
      // Possible match (best=0.88)
      andIshouldSeeXStatusForOnTheDeclarationSummaryPage("Amended", "route details")

      And("I click on the Amend transport details link on the Declaration summary page")
      // Possible match (best=0.94)
      thenIclickOnTheLinkOnTheDeclarationSummaryPage("Amend")
      // --- Other possible matches ---
      // thenIclickTheLinkOnTheDeclarationSummaryPage() [0.78] (TaskListStepDefSteps.scala) pattern: (?:I )?click the (.+) link on the 'Declaration summary' page

      And(
        "I click the Change link for Do you want to add a method of payment for transport charges? on the Transport details Check your answers page"
      )
      // Possible match (best=0.80)
      andIclickTheChangeLinkForOnTheCheckYourAnswersPage("Change")

      And("I choose radio option No on the Do you want to add a method of payment for transport charges? page")
      // Possible match (best=0.82)
      andIchooseRadioOptionXOnTheDoYouWantToAddAMethodOfPaymentForTransportChargesPage("No")
      // --- Other possible matches ---
      // andIchooseRadioOptionXOnTheDoYouWantToAddAnAuthorisationPage() [0.76] (TransportAuthorisationsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add an authorisation' page
      // andIchooseRadioOptionXOnTheDoYouWantToAddASealPage() [0.76] (TransportEquipmentChargesStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a seal\?' page
      // andIChooseRadioOptionXOnTheDoYouWantToAddACarrierPage() [0.76] (CarrierDetailsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a carrier\?' page

      And("I submit on the Check your answers section Transport details page")
      // Possible match (best=1.00)
      andIsubmitOnTheCheckYourAnswersSectionXPage("Transport details")

      And("I should see Amended status for transport details on the Declaration summary page")
      // Possible match (best=0.88)
      andIshouldSeeXStatusForOnTheDeclarationSummaryPage("Amended", "transport details")

      And("I click on the Amend documents link on the Declaration summary page")
      // Possible match (best=0.94)
      thenIclickOnTheLinkOnTheDeclarationSummaryPage("Amend")
      // --- Other possible matches ---
      // thenIclickTheLinkOnTheDeclarationSummaryPage() [0.78] (TaskListStepDefSteps.scala) pattern: (?:I )?click the (.+) link on the 'Declaration summary' page

      And("I click the Change link on the You have added 3 documents page")
      // Possible match (best=0.89)
      whenIclickTheXLinkOnTheYouHaveAddedXDocumentsPage("Change", "3")

      And(
        "I click the Change link for Do you want to add any additional information for this document? on the Documents Check your answers page"
      )
      // Possible match (best=0.80)
      andIclickTheChangeLinkForOnTheCheckYourAnswersPage("Change")

      And("I click radio option No on the Do you want to add any additional information for this document? page")
      // Possible match (best=0.81)
      andIclickRadioOptionXOnTheDoYouWantToAddAnyAdditionalInformationForThisDocumentPage("No")
      // --- Other possible matches ---
      // andIclickRadioOptionXOnTheDoYouWantToAddAnyAdditionalInformationForThisItemPage() [0.78] (ItemDetailsStepDefSteps.scala) pattern: (?:I )?click radio option (.*) on the 'Do you want to add any additional information for this item\?' page
      // andIclickRadioOptionXOnTheDoYouWantToAddAnyCommentsForTheAdditionalInformationPage() [0.78] (ItemDetailsStepDefSteps.scala) pattern: (?:I )?click radio option (.*) on the 'Do you want to add any comments for the additional information\?' page
      // andIclickRadioOptionXOnTheDoYouWantToAddAnyDocumentsPage() [0.76] (ItemDetailsStepDefSteps.scala) pattern: (?:I )?click radio option (.*) on the 'Do you want to add any documents\?' page

      And("I submit on the Check your answers section Documents page")
      // Possible match (best=1.00)
      andIsubmitOnTheCheckYourAnswersSectionXPage("Documents")

      And("I choose radio option No on the You have added 3 documents page")
      // Possible match (best=0.89)
      andIchooseRadioOptionXOnTheYouHaveAddedXDocumentsPage("No", "3")

      And("I should see Amended status for documents on the Declaration summary page")
      // Possible match (best=0.88)
      andIshouldSeeXStatusForOnTheDeclarationSummaryPage("Amended", "documents")

      And("I click on the Amend items link on the Declaration summary page")
      // Possible match (best=0.94)
      thenIclickOnTheLinkOnTheDeclarationSummaryPage("Amend items")
      // --- Other possible matches ---
      // thenIclickTheLinkOnTheDeclarationSummaryPage() [0.78] (TaskListStepDefSteps.scala) pattern: (?:I )?click the (.+) link on the 'Declaration summary' page

      And("I click the Change link on the You have added 1 item page")
      // ⚠️ No step-def match found for: I click the Change link on the You have added 1 item page
      andIclickTheXLinkOnTheYouHaveAddedXItemsPage("Change", "1")

      And("I click the Change link for Do you want to add supplementary units? on the Item 1 Check your answers page")
      // Possible match (best=0.80)
      andIclickTheChangeLinkForOnTheCheckYourAnswersPage("Change")

      And("I click radio option No on the Do you want to add supplementary units? page")
      // Possible match (best=0.80)
      andIclickRadioOptionXOnTheDoYouWantToAddSupplementaryUnitsPage("No")

      And("I submit on the Check your answers section Items page")
      // Possible match (best=1.00)
      andIsubmitOnTheCheckYourAnswersSectionXPage("Items")

      And("I click radio option No on the You have added 1 item page")
      // Possible match (best=0.89)
      andIclickRadioOptionXOnTheYouHaveAddedXItemPage("No", "1")

      And("I should see Amended status for items on the Declaration summary page")
      // Possible match (best=0.88)
      andIshouldSeeXStatusForOnTheDeclarationSummaryPage("Amended", "items")

      And("I click on the Amend guarantee details link on the Declaration summary page")
      // Possible match (best=0.94)
      thenIclickOnTheLinkOnTheDeclarationSummaryPage("Amend")
      // --- Other possible matches ---
      // thenIclickTheLinkOnTheDeclarationSummaryPage() [0.78] (TaskListStepDefSteps.scala) pattern: (?:I )?click the (.+) link on the 'Declaration summary' page

      And("I click the Change link on the You have added 4 guarantees page")
      // Possible match (best=0.89)
      andIclickTheXLinkOnTheYouHaveAddedXGuaranteesPage("Change", "4")

      And("I click the Change link for Liability amount on the Guarantee details Check your answers page")
      // Possible match (best=0.80)
      andIclickTheChangeLinkForOnTheCheckYourAnswersPage("Change")

      And("I enter 999.99 on the How much is the liability in pounds? page")
      // Possible match (best=0.80)
      andIenterOnTheHowMuchIsTheLiabilityInPoundsPage("999.99")

      And("I submit on the Check your answers section Guarantee details page")
      // Possible match (best=1.00)
      andIsubmitOnTheCheckYourAnswersSectionXPage("Guarantee details")

      And("I choose radio option No on the You have added 4 guarantees page")
      // Possible match (best=0.89)
      whenIchooseRadioOptionXOnTheYouHaveAddedXGuaranteesPage("No", "4")

      And("I should see Amended status for guarantee details on the Declaration summary page")
      // Possible match (best=0.88)
      andIshouldSeeXStatusForOnTheDeclarationSummaryPage("Amended", "guarantee details")

      And("I click the Confirm and resend button on the Declaration summary page")
      // ⚠️ No step-def match found for: I click the Confirm and resend button on the Declaration summary page
      andIclickTheConfirmAndResendConfirmAndSendButtonOnTheDeclarationSummaryPage()

      And("I click the Sign out link on the Departure declaration sent page")
      // Possible match (best=0.94)
      andIclickTheLinkOnTheDepartureDeclarationSentPage("Sign out")

    }

    Scenario("03 End to end journey for amending a rejected declaration amendment after MRN allocation") {
      Given("I login with ID 1234567890")
      // Possible match (best=1.00)
      andILoginWithIDX("1234567890")

      When("I submit an IE015 Departure Declaration")
      // Possible match (best=1.00)
      givenIsubmitAFile("IE015 Departure Declaration")

      Then("I submit an IE028 MRN Allocated")
      // Possible match (best=1.00)
      givenIsubmitAFile("IE028 MRN Allocated")

      Then("I submit an IE013 Declaration Amendment")
      // Possible match (best=1.00)
      givenIsubmitAFile("IE013 Declaration Amendment")

      And("I submit an IE056 Amendment Rejection With Amendable Errors")
      // Possible match (best=1.00)
      givenIsubmitAFile("IE056 Amendment Rejection With Amendable Errors")

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
      andIclickOnTheXLinkForLRNXOnTheDepartureDeclarationsPage("Amend declaration ", "25GB000246TK0E6WJ1")
      // --- Other possible matches ---
      // givenIclickOnTheLinkOnTheDepartureDeclarationsPage() [0.79] (DepartureDeclarationsStepDefSteps.scala) pattern: (?:I )?click on the (.+) link on the 'Departure declarations' page

      And("I click on the Amend errors button on the Amend declaration errors page")
      // Possible match (best=1.00)
      givenIclickOnTheAmendErrorsButtonOnTheAmendDeclarationErrorsPage()

      And("I should see Error status for trader details on the Declaration summary page")
      // Possible match (best=0.88)
      andIshouldSeeXStatusForOnTheDeclarationSummaryPage("Error", "trader details")

      And("I should see Error status for route details on the Declaration summary page")
      // Possible match (best=0.88)
      andIshouldSeeXStatusForOnTheDeclarationSummaryPage("Error", "route details")

      And("I should see Error status for transport details on the Declaration summary page")
      // Possible match (best=0.88)
      andIshouldSeeXStatusForOnTheDeclarationSummaryPage("Error", "transport details")

      And("I should see Error status for documents on the Declaration summary page")
      // Possible match (best=0.88)
      andIshouldSeeXStatusForOnTheDeclarationSummaryPage("Error", "documents")

      And("I should see Error status for items on the Declaration summary page")
      // Possible match (best=0.88)
      andIshouldSeeXStatusForOnTheDeclarationSummaryPage("Error", "items")

      And("I should see Error status for guarantee details on the Declaration summary page")
      // Possible match (best=0.88)
      andIshouldSeeXStatusForOnTheDeclarationSummaryPage("Error", "guarantee details")

      And("I click on the Amend trader details link on the Declaration summary page")
      // Possible match (best=0.94)
      thenIclickOnTheLinkOnTheDeclarationSummaryPage("Amend")
      // --- Other possible matches ---
      // thenIclickTheLinkOnTheDeclarationSummaryPage() [0.78] (TaskListStepDefSteps.scala) pattern: (?:I )?click the (.+) link on the 'Declaration summary' page

      And(
        "I click the Change link for Do you want to add a contact for the consignor? on the Trader details Check your answers page"
      )
      // Possible match (best=0.80)
      andIclickTheChangeLinkForOnTheCheckYourAnswersPage("Change")

      And("I choose radio option No on the Do you want to add a contact for the consignor? page")
      // Possible match (best=0.81)
      andIchooseRadioOptionXOnTheDoYouWantToAddAContactForTheConsignorPage("No")
      // --- Other possible matches ---
      // andIchooseRadioOptionXOnThEDoYouWantToAddAContactForTheCarrierPage() [0.77] (CarrierDetailsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a contact for the carrier\?' page
      // andIchooseRadioOptionXOnTheDoYouWantToAddAnAuthorisationPage() [0.76] (TransportAuthorisationsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add an authorisation' page
      // andIchooseRadioOptionXOnTheDoYouWantToAddASealPage() [0.76] (TransportEquipmentChargesStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a seal\?' page
      // andIChooseRadioOptionXOnTheDoYouWantToAddACarrierPage() [0.76] (CarrierDetailsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a carrier\?' page

      And("I submit on the Check your answers section Trader details page")
      // Possible match (best=1.00)
      andIsubmitOnTheCheckYourAnswersSectionXPage("Trader details")

      And("I should see Amended status for trader details on the Declaration summary page")
      // Possible match (best=0.88)
      andIshouldSeeXStatusForOnTheDeclarationSummaryPage("Amended", "trader details")

      And("I click on the Amend route details link on the Declaration summary page")
      // Possible match (best=0.94)
      thenIclickOnTheLinkOnTheDeclarationSummaryPage("Amend")
      // --- Other possible matches ---
      // thenIclickTheLinkOnTheDeclarationSummaryPage() [0.78] (TaskListStepDefSteps.scala) pattern: (?:I )?click the (.+) link on the 'Declaration summary' page

      And(
        "I click the Change link for Do you want to add a contact for the location of goods? on the Route details Check your answers page"
      )
      // Possible match (best=0.80)
      andIclickTheChangeLinkForOnTheCheckYourAnswersPage("Change")

      And("I choose radio option No on the Do you want to add a contact for the location of goods? page")
      // Possible match (best=0.82)
      andIchooseRadioOptionXOnTheDoYouWantToAddAContactForTheLocationOfGoodsPage("No")
      // --- Other possible matches ---
      // andIchooseRadioOptionXOnTheDoYouWantToAddALocationOfGoodsPage() [0.81] (RouteDetailsLocationOfGoodsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a location of goods\?' page
      // andIchooseRadioOptionXOnThePresentationDoYouWantToAddAContactForTheLocationOfGoodsPage() [0.78] (PresentationNotificationStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the presentation 'Do you want to add a contact for the location of goods\?' page
      // andIchooseRadioOptionXOnTheDoYouWantToAddAContactForTheConsignorPage() [0.77] (TraderDetailsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a contact for the consignor\?' page
      // andIchooseRadioOptionXOnThEDoYouWantToAddAContactForTheCarrierPage() [0.77] (CarrierDetailsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a contact for the carrier\?' page
      // andIchooseRadioOptionXOnTheDoYouWantToAddAnAuthorisationPage() [0.76] (TransportAuthorisationsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add an authorisation' page
      // andIchooseRadioOptionXOnTheDoYouWantToAddASealPage() [0.76] (TransportEquipmentChargesStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a seal\?' page
      // andIChooseRadioOptionXOnTheDoYouWantToAddACarrierPage() [0.76] (CarrierDetailsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a carrier\?' page
      // andIchooseRadioOptionXOnTheDoYouWantToAddAnAdditionalIdentifierForTheLocationOfGoodsPage() [0.75] (RouteDetailsLocationOfGoodsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add an additional identifier for the location of goods\?' page
      // andIchooseRadioOptionXOnTheArrivalLocationOfGoodsAddContactPage() [0.75] (LocationOfGoodsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the arrival location of goods add contact page

      And("I submit on the Check your answers section Route details page")
      // Possible match (best=1.00)
      andIsubmitOnTheCheckYourAnswersSectionXPage("Route details")

      And("I should see Amended status for route details on the Declaration summary page")
      // Possible match (best=0.88)
      andIshouldSeeXStatusForOnTheDeclarationSummaryPage("Amended", "route details")

      And("I click on the Amend transport details link on the Declaration summary page")
      // Possible match (best=0.94)
      thenIclickOnTheLinkOnTheDeclarationSummaryPage("Amend")
      // --- Other possible matches ---
      // thenIclickTheLinkOnTheDeclarationSummaryPage() [0.78] (TaskListStepDefSteps.scala) pattern: (?:I )?click the (.+) link on the 'Declaration summary' page

      And(
        "I click the Change link for Do you want to add a method of payment for transport charges? on the Transport details Check your answers page"
      )
      // Possible match (best=0.80)
      andIclickTheChangeLinkForOnTheCheckYourAnswersPage("Change")

      And("I choose radio option No on the Do you want to add a method of payment for transport charges? page")
      // Possible match (best=0.82)
      andIchooseRadioOptionXOnTheDoYouWantToAddAMethodOfPaymentForTransportChargesPage("No")
      // --- Other possible matches ---
      // andIchooseRadioOptionXOnTheDoYouWantToAddAnAuthorisationPage() [0.76] (TransportAuthorisationsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add an authorisation' page
      // andIchooseRadioOptionXOnTheDoYouWantToAddASealPage() [0.76] (TransportEquipmentChargesStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a seal\?' page
      // andIChooseRadioOptionXOnTheDoYouWantToAddACarrierPage() [0.76] (CarrierDetailsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a carrier\?' page

      And("I submit on the Check your answers section Transport details page")
      // Possible match (best=1.00)
      andIsubmitOnTheCheckYourAnswersSectionXPage("Transport details")

      And("I should see Amended status for transport details on the Declaration summary page")
      // Possible match (best=0.88)
      andIshouldSeeXStatusForOnTheDeclarationSummaryPage("Amended", "transport details")

      And("I click on the Amend documents link on the Declaration summary page")
      // Possible match (best=0.94)
      thenIclickOnTheLinkOnTheDeclarationSummaryPage("Amend")
      // --- Other possible matches ---
      // thenIclickTheLinkOnTheDeclarationSummaryPage() [0.78] (TaskListStepDefSteps.scala) pattern: (?:I )?click the (.+) link on the 'Declaration summary' page

      And("I click the Change link on the You have added 3 documents page")
      // Possible match (best=0.89)
      whenIclickTheXLinkOnTheYouHaveAddedXDocumentsPage("Change", "3")

      And(
        "I click the Change link for Do you want to add any additional information for this document? on the Documents Check your answers page"
      )
      // Possible match (best=0.80)
      andIclickTheChangeLinkForOnTheCheckYourAnswersPage("Change")

      And("I click radio option No on the Do you want to add any additional information for this document? page")
      // Possible match (best=0.81)
      andIclickRadioOptionXOnTheDoYouWantToAddAnyAdditionalInformationForThisDocumentPage("No")
      // --- Other possible matches ---
      // andIclickRadioOptionXOnTheDoYouWantToAddAnyAdditionalInformationForThisItemPage() [0.78] (ItemDetailsStepDefSteps.scala) pattern: (?:I )?click radio option (.*) on the 'Do you want to add any additional information for this item\?' page
      // andIclickRadioOptionXOnTheDoYouWantToAddAnyCommentsForTheAdditionalInformationPage() [0.78] (ItemDetailsStepDefSteps.scala) pattern: (?:I )?click radio option (.*) on the 'Do you want to add any comments for the additional information\?' page
      // andIclickRadioOptionXOnTheDoYouWantToAddAnyDocumentsPage() [0.76] (ItemDetailsStepDefSteps.scala) pattern: (?:I )?click radio option (.*) on the 'Do you want to add any documents\?' page

      And("I submit on the Check your answers section Documents page")
      // Possible match (best=1.00)
      andIsubmitOnTheCheckYourAnswersSectionXPage("Documents")

      And("I choose radio option No on the You have added 3 documents page")
      // Possible match (best=0.89)
      andIchooseRadioOptionXOnTheYouHaveAddedXDocumentsPage("No", "3")

      And("I should see Amended status for documents on the Declaration summary page")
      // Possible match (best=0.88)
      andIshouldSeeXStatusForOnTheDeclarationSummaryPage("Amended", "documents")

      And("I click on the Amend items link on the Declaration summary page")
      // Possible match (best=0.94)
      thenIclickOnTheLinkOnTheDeclarationSummaryPage("Amend")
      // --- Other possible matches ---
      // thenIclickTheLinkOnTheDeclarationSummaryPage() [0.78] (TaskListStepDefSteps.scala) pattern: (?:I )?click the (.+) link on the 'Declaration summary' page

      And("I click the Change link on the You have added 1 item page")
      // ⚠️ No step-def match found for: I click the Change link on the You have added 1 item page
      andIclickTheXLinkOnTheYouHaveAddedXItemsPage("Change", "1")

      And("I click the Change link for Do you want to add supplementary units? on the Item 1 Check your answers page")
      // Possible match (best=0.80)
      andIclickTheChangeLinkForOnTheCheckYourAnswersPage("Change")

      And("I click radio option No on the Do you want to add supplementary units? page")
      // Possible match (best=0.80)
      andIclickRadioOptionXOnTheDoYouWantToAddSupplementaryUnitsPage("No")

      And("I submit on the Check your answers section Items page")
      // Possible match (best=1.00)
      andIsubmitOnTheCheckYourAnswersSectionXPage("Items")

      And("I click radio option No on the You have added 1 item page")
      // Possible match (best=0.89)
      andIclickRadioOptionXOnTheYouHaveAddedXItemPage("No", "1")

      And("I should see Amended status for items on the Declaration summary page")
      // Possible match (best=0.88)
      andIshouldSeeXStatusForOnTheDeclarationSummaryPage("Amended", "items")

      And("I click on the Amend guarantee details link on the Declaration summary page")
      // Possible match (best=0.94)
      thenIclickOnTheLinkOnTheDeclarationSummaryPage("Amend guarantee details")
      // --- Other possible matches ---
      // thenIclickTheLinkOnTheDeclarationSummaryPage() [0.78] (TaskListStepDefSteps.scala) pattern: (?:I )?click the (.+) link on the 'Declaration summary' page

      And("I click the Change link on the You have added 4 guarantees page")
      // Possible match (best=0.89)
      andIclickTheXLinkOnTheYouHaveAddedXGuaranteesPage("Change", "4")

      And("I click the Change link for Liability amount on the Guarantee details Check your answers page")
      // Possible match (best=0.80)
      andIclickTheChangeLinkForOnTheCheckYourAnswersPage("Change")

      And("I enter 999.99 on the How much is the liability in pounds? page")
      // Possible match (best=0.80)
      andIenterOnTheHowMuchIsTheLiabilityInPoundsPage("999.9")

      And("I submit on the Check your answers section Guarantee details page")
      // Possible match (best=1.00)
      andIsubmitOnTheCheckYourAnswersSectionXPage("Guarantee details")

      And("I choose radio option No on the You have added 4 guarantees page")
      // Possible match (best=0.89)
      whenIchooseRadioOptionXOnTheYouHaveAddedXGuaranteesPage("No", "4")

      And("I should see Amended status for guarantee details on the Declaration summary page")
      // Possible match (best=0.88)
      andIshouldSeeXStatusForOnTheDeclarationSummaryPage("Amended", "guarantee details")

      And("I click the Confirm and resend button on the Declaration summary page")
      // ⚠️ No step-def match found for: I click the Confirm and resend button on the Declaration summary page
      andIclickTheConfirmAndResendConfirmAndSendButtonOnTheDeclarationSummaryPage()

      And("I click the Sign out link on the Departure declaration sent page")
      // Possible match (best=0.94)
      andIclickTheLinkOnTheDepartureDeclarationSentPage("Sing out")

    }

    Scenario("04 End to end journey for amending a departure declaration with invalid guarantee") {
      Given("I login with ID 1234567890")
      // Possible match (best=1.00)
      andILoginWithIDX("1234567890")

      When("I submit an IE015 Departure Declaration")
      // Possible match (best=1.00)
      givenIsubmitAFile("IE015 Departure Declaration")

      Then("I submit an IE028 MRN Allocated")
      // Possible match (best=1.00)
      givenIsubmitAFile("IE028 MRN Allocated")

      Then("I submit an IE055 Guarantee Not Valid")
      // Possible match (best=1.00)
      givenIsubmitAFile("IE055 Guarantee Not Valid")

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

      And("I click on the View errors link for LRN 25GB000246TK0E6WJ1 on the Departure declarations page")
      // Possible match (best=0.90)
      andIclickOnTheXLinkForLRNXOnTheDepartureDeclarationsPage("View errors", "25GB000246TK0E6WJ1")
      // --- Other possible matches ---
      // givenIclickOnTheLinkOnTheDepartureDeclarationsPage() [0.79] (DepartureDeclarationsStepDefSteps.scala) pattern: (?:I )?click on the (.+) link on the 'Departure declarations' page
      // givenIclickOnTheLinkOnTheDeclarationErrorsPage() [0.79] (DepartureDeclarationsStepDefSteps.scala) pattern: (?:I )?click on the (.+) link on the 'Declaration errors' page

      And("I click on the Amend errors button on the Amend guarantee errors page")
      // Possible match (best=1.00)
      givenIclickOnTheAmendErrorsButtonOnTheAmendGuaranteeErrorsPage()

      And("I should see Completed status for trader details on the Declaration summary page")
      // Possible match (best=0.88)
      andIshouldSeeXStatusForOnTheDeclarationSummaryPage("Completed", "trader details")

      And("I should see Completed status for route details on the Declaration summary page")
      // Possible match (best=0.88)
      andIshouldSeeXStatusForOnTheDeclarationSummaryPage("Completed", "route details")

      And("I should see Completed status for transport details on the Declaration summary page")
      // Possible match (best=0.88)
      andIshouldSeeXStatusForOnTheDeclarationSummaryPage("Completed", "transport details")

      And("I should see Completed status for documents on the Declaration summary page")
      // Possible match (best=0.88)
      andIshouldSeeXStatusForOnTheDeclarationSummaryPage("Completed", "documents")

      And("I should see Completed status for items on the Declaration summary page")
      // Possible match (best=0.88)
      andIshouldSeeXStatusForOnTheDeclarationSummaryPage("Completed", "items")

      And("I should see Error status for guarantee details on the Declaration summary page")
      // Possible match (best=0.88)
      andIshouldSeeXStatusForOnTheDeclarationSummaryPage("Error", "guarantee details")

      And("I click on the Amend guarantee details link on the Declaration summary page")
      // Possible match (best=0.94)
      thenIclickOnTheLinkOnTheDeclarationSummaryPage("Amend")
      // --- Other possible matches ---
      // thenIclickTheLinkOnTheDeclarationSummaryPage() [0.78] (TaskListStepDefSteps.scala) pattern: (?:I )?click the (.+) link on the 'Declaration summary' page

      And("I click the Remove link on the You have added 4 guarantees page")
      // Possible match (best=0.89)
      andIclickTheXLinkOnTheYouHaveAddedXGuaranteesPage("Remove", "4")

      And("I choose radio option Yes on the Are you sure you want to remove this guarantee? page")
      // Possible match (best=0.81)
      andIchooseRadioOptionXOnTheAreYouSureYouWantToRemoveThisGuaranteePage("Yes")

      And("I choose radio option No on the You have added 3 guarantee page")
      // ⚠️ No step-def match found for: I choose radio option No on the You have added 3 guarantee page
      whenIchooseRadioOptionXOnTheYouHaveAddedXGuaranteesPage("No", "3")

      And("I click the Confirm and resend button on the Declaration summary page")
      // ⚠️ No step-def match found for: I click the Confirm and resend button on the Declaration summary page
      andIclickTheConfirmAndResendConfirmAndSendButtonOnTheDeclarationSummaryPage()

      And("I click the Sign out link on the Departure declaration sent page")
      // Possible match (best=0.94)
      andIclickTheLinkOnTheDepartureDeclarationSentPage("Sign out")

    }

    Scenario("05 User is unable to continue with an amendment if an IE029 message is received while amending") {
      Given("I login with ID 1234567890")
      // Possible match (best=1.00)
      andILoginWithIDX("1234567890")

      When("I submit an IE015 Departure Declaration")
      // Possible match (best=1.00)
      givenIsubmitAFile("IE015 Departure Declaration")

      Then("I submit an IE028 MRN Allocated")
      // Possible match (best=1.00)
      givenIsubmitAFile("IE028 MRN Allocated")

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
      andIclickOnTheXLinkForLRNXOnTheDepartureDeclarationsPage("Amend", "25GB000246TK0E6WJ1")
      // --- Other possible matches ---
      // givenIclickOnTheLinkOnTheDepartureDeclarationsPage() [0.79] (DepartureDeclarationsStepDefSteps.scala) pattern: (?:I )?click on the (.+) link on the 'Departure declarations' page

      And("I click on the Edit trader details link on the Declaration summary page")
      // Possible match (best=0.94)
      thenIclickOnTheLinkOnTheDeclarationSummaryPage("Edit trader details")
      // --- Other possible matches ---
      // thenIclickTheLinkOnTheDeclarationSummaryPage() [0.78] (TaskListStepDefSteps.scala) pattern: (?:I )?click the (.+) link on the 'Declaration summary' page

      And(
        "I click the Change link for Do you want to add a contact for the consignor? on the Trader details Check your answers page"
      )
      // Possible match (best=0.80)
      andIclickTheChangeLinkForOnTheCheckYourAnswersPage("Change")

      And("I choose radio option No on the Do you want to add a contact for the consignor? page")
      // Possible match (best=0.81)
      andIchooseRadioOptionXOnTheDoYouWantToAddAContactForTheConsignorPage("No")
      // --- Other possible matches ---
      // andIchooseRadioOptionXOnThEDoYouWantToAddAContactForTheCarrierPage() [0.77] (CarrierDetailsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a contact for the carrier\?' page
      // andIchooseRadioOptionXOnTheDoYouWantToAddAnAuthorisationPage() [0.76] (TransportAuthorisationsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add an authorisation' page
      // andIchooseRadioOptionXOnTheDoYouWantToAddASealPage() [0.76] (TransportEquipmentChargesStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a seal\?' page
      // andIChooseRadioOptionXOnTheDoYouWantToAddACarrierPage() [0.76] (CarrierDetailsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a carrier\?' page

      When("I submit an IE029 Release For Transit")
      // Possible match (best=1.00)
      givenIsubmitAFile("IE029 Release For Transit")

      And("I submit on the Check your answers section Trader details page")
      // Possible match (best=1.00)
      andIsubmitOnTheCheckYourAnswersSectionXPage("Trader details")

      Then("I should be on the For your security we signed you out page")
      // Possible match (best=1.00)
      thenIshouldBeOnTheForYourSecurityWeSignedYouOutPage()

    }
  }
}
