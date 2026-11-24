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

import specpage.Departures.Confirmation.DepartureConfirmationPage
import specpage.Departures.Documents.Documents.DocumentAddAnotherPage
import specpage.Departures.Items.ItemsAddAnotherPage
import specpage.Departures.Items.MeasurementAddSupplementaryUnitsPage
import specpage.ManagedFEAmendDeclarationErrorsPage
import specpage.ManagedFEAmendGuaranteeErrorsPage
import specpage.ManagedFEDepartureDeclarationsPage
import specpage.CommonPages.CYAPage
import specpage.CommonPages.CommonPage
import specpage.Departures.Guarantee.AddAnotherGuaranteePage
import specpage.Departures.Guarantee.ConfirmRemoveGuaranteePage
import specpage.Departures.Guarantee.GuaranteeLiabilityAmountPage
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
      andILoginWithIDX("1234567890")

      When("I submit an IE015 Departure Declaration")
      givenIsubmitAFile("IE015 Departure Declaration")

      Then("I submit an IE056 Rejection With Amendable Errors")
      givenIsubmitAFile("IE056 Rejection With Amendable Errors")

      And("the user has submitted departureDeclaration.json for LRN 25GB000246TK0E6WJ1 and EORI number 1234567890")
      whenTheUserHasSubmittedFileForLRNAndEORINumber("departureDeclaration.json", "25GB000246TK0E6WJ1", "1234567890")

      And("I refresh the page")
      CommonPage.refreshPage()

      And("I click on the View departure declarations link on the Manage your transit movements page")
      givenIclickOnTheLinkOnTheManageYourTransitMovementsPage("View departure declarations")

      And("I click on the Amend declaration link for LRN 25GB000246TK0E6WJ1 on the Departure declarations page")
      ManagedFEDepartureDeclarationsPage.openDeparture("Amend declaration", "25GB000246TK0E6WJ1")

      And("I click on the Amend errors button on the Amend declaration errors page")
      ManagedFEAmendDeclarationErrorsPage.amendErrors()

      And("I should see Error status for trader details on the Declaration summary page")
      andIshouldSeeXStatusForOnTheDeclarationSummaryPage("Error", "trader details")

      And("I should see Error status for route details on the Declaration summary page")
      andIshouldSeeXStatusForOnTheDeclarationSummaryPage("Error", "route details")

      And("I should see Error status for transport details on the Declaration summary page")
      andIshouldSeeXStatusForOnTheDeclarationSummaryPage("Error", "transport details")

      And("I should see Error status for documents on the Declaration summary page")
      andIshouldSeeXStatusForOnTheDeclarationSummaryPage("Error", "documents")

      And("I should see Error status for items on the Declaration summary page")
      andIshouldSeeXStatusForOnTheDeclarationSummaryPage("Error", "items")

      And("I should see Error status for guarantee details on the Declaration summary page")
      andIshouldSeeXStatusForOnTheDeclarationSummaryPage("Error", "guarantee details")

      And("I click on the Amend trader details link on the Declaration summary page")
      thenIclickOnTheLinkOnTheDeclarationSummaryPage("Amend trader details")

      And("I click the Change link for Do you want to add a contact? on the Trader details Check your answers page")
      CYAPage.clickChangeLink("Do you want to add a contact?")

      And("I choose radio option No on the Do you want to add a contact for the transit holder? page")
      andIchooseRadioOptionXOnTheDoYouWantToAddAContactForTheTransitHolderPage("No")

      And("I submit on the Check your answers section Trader details page")
      CYAPage.submitAnswers("Trader details")

      And("I should see Amended status for trader details on the Declaration summary page")
      andIshouldSeeXStatusForOnTheDeclarationSummaryPage("Amended", "trader details")

      And("I click on the Amend route details link on the Declaration summary page")
      thenIclickOnTheLinkOnTheDeclarationSummaryPage("Amend route details")

      And(
        "I click the Change link for Do you want to add a contact for the location of goods? on the Route details Check your answers page"
      )
      CYAPage.clickChangeLink("Do you want to add a contact for the location of goods?")

      And("I choose radio option No on the Do you want to add a contact for the location of goods? page")
      andIchooseRadioOptionXOnTheDoYouWantToAddAContactForTheLocationOfGoodsPage("No")

      And("I submit on the Check your answers section Route details page")
      CYAPage.submitAnswers("Route details")

      And("I should see Amended status for route details on the Declaration summary page")
      andIshouldSeeXStatusForOnTheDeclarationSummaryPage("Amended", "route details")

      And("I click on the Amend transport details link on the Declaration summary page")
      thenIclickOnTheLinkOnTheDeclarationSummaryPage("Amend transport details")

      And(
        "I click the Change link for Do you want to add a method of payment for transport charges? on the Transport details Check your answers page"
      )
      CYAPage.clickChangeLink("Do you want to add a method of payment for transport charges?")

      And("I choose radio option No on the Do you want to add a method of payment for transport charges? page")
      andIchooseRadioOptionXOnTheDoYouWantToAddAMethodOfPaymentForTransportChargesPage("No")

      And("I submit on the Check your answers section Transport details page")
      CYAPage.submitAnswers("Transport details")

      And("I should see Amended status for transport details on the Declaration summary page")
      andIshouldSeeXStatusForOnTheDeclarationSummaryPage("Amended", "transport details")

      And("I click on the Amend documents link on the Declaration summary page")
      thenIclickOnTheLinkOnTheDeclarationSummaryPage("Amend")

      And("I click the Change link on the You have added 3 documents page")
      DocumentAddAnotherPage.followLink("Change", "3")

      And(
        "I click the Change link for Do you want to add any additional information for this document? on the Documents Check your answers page"
      )
      CYAPage.clickChangeLink("Do you want to add any additional information for this document?")

      And("I click radio option No on the Do you want to add any additional information for this document? page")
      andIclickRadioOptionXOnTheDoYouWantToAddAnyAdditionalInformationForThisDocumentPage("No")

      And("I submit on the Check your answers section Documents page")
      CYAPage.submitAnswers("Documents")

      And("I choose radio option No on the You have added 3 documents page")
      DocumentAddAnotherPage.answerAddAnother("No", "3")

      And("I should see Amended status for documents on the Declaration summary page")
      andIshouldSeeXStatusForOnTheDeclarationSummaryPage("Amended", "documents")

      And("I click on the Amend items link on the Declaration summary page")
      thenIclickOnTheLinkOnTheDeclarationSummaryPage("Amend items")

      And("I click the Change link on the You have added 1 item page")
      ItemsAddAnotherPage.followLink("Change", "1")

      And("I click the Change link for Do you want to add supplementary units? on the Item 1 Check your answers page")
      CYAPage.clickChangeLink("Do you want to add supplementary units?")

      And("I click radio option No on the Do you want to add supplementary units? page")
      MeasurementAddSupplementaryUnitsPage.selectAndContinue("No")

      And("I submit on the Check your answers section Items page")
      CYAPage.submitAnswers("Items")

      And("I click radio option No on the You have added 1 item page")
      ItemsAddAnotherPage.answerAddAnother("No", "1")

      And("I should see Amended status for items on the Declaration summary page")
      andIshouldSeeXStatusForOnTheDeclarationSummaryPage("Amended", "items")

      And("I click on the Amend guarantee details link on the Declaration summary page")
      thenIclickOnTheLinkOnTheDeclarationSummaryPage("Amend")

      And("I click the Change link on the You have added 4 guarantees page")
      AddAnotherGuaranteePage.followLink("Change", "4")

      And("I click the Change link for Liability amount on the Guarantee details Check your answers page")
      CYAPage.clickChangeLink("Liability amount")

      And("I enter 999.99 on the How much is the liability in pounds? page")
      GuaranteeLiabilityAmountPage.enterLiabilityAmount("999.9")

      And("I submit on the Check your answers section Guarantee details page")
      CYAPage.submitAnswers("Guarantee details")

      And("I choose radio option No on the You have added 4 guarantees page")
      AddAnotherGuaranteePage.answerAddAnother("No", "4")

      And("I should see Amended status for guarantee details on the Declaration summary page")
      andIshouldSeeXStatusForOnTheDeclarationSummaryPage("Amended", "guarantee details")

      And("I click the Confirm and resend button on the Declaration summary page")
      andIclickTheConfirmAndResendConfirmAndSendButtonOnTheDeclarationSummaryPage()

      And("I click the Sign out link on the Departure declaration sent page")
      DepartureConfirmationPage.followConfirmationLink("Sign out")

    }

    Scenario("02 End to end journey for amending a departure declaration after MRN allocation") {
      Given("I login with ID 1234567890")
      andILoginWithIDX("1234567890")

      When("I submit an IE015 Departure Declaration")
      givenIsubmitAFile("IE015 Departure Declaration")

      Then("I submit an IE028 MRN Allocated")
      givenIsubmitAFile("IE028 MRN Allocated")

      And("I submit an IE056 Rejection With Amendable Errors")
      givenIsubmitAFile("IE056 Rejection With Amendable Errors")

      And("the user has submitted departureDeclaration.json for LRN 25GB000246TK0E6WJ1 and EORI number 1234567890")
      whenTheUserHasSubmittedFileForLRNAndEORINumber("departureDeclaration.json", "25GB000246TK0E6WJ1", "1234567890")

      And("I refresh the page")
      CommonPage.refreshPage()

      And("I click on the View departure declarations link on the Manage your transit movements page")
      givenIclickOnTheLinkOnTheManageYourTransitMovementsPage("View departure declarations")

      And("I click on the Amend declaration link for LRN 25GB000246TK0E6WJ1 on the Departure declarations page")
      ManagedFEDepartureDeclarationsPage.openDeparture("Amend declaration", "25GB000246TK0E6WJ1")

      And("I click on the Amend errors button on the Amend declaration errors page")
      ManagedFEAmendDeclarationErrorsPage.amendErrors()

      Then("I input a random LRN on the What is the new Local Reference Number? page")
      whenIInputARandomLRNOnTheWhatIsTheNewLocalReferenceNumberPage()

      And("I should see Error status for trader details on the Declaration summary page")
      andIshouldSeeXStatusForOnTheDeclarationSummaryPage("Error", "trader details")

      And("I should see Error status for route details on the Declaration summary page")
      andIshouldSeeXStatusForOnTheDeclarationSummaryPage("Error", "route details")

      And("I should see Error status for transport details on the Declaration summary page")
      andIshouldSeeXStatusForOnTheDeclarationSummaryPage("Error", "transport details")

      And("I should see Error status for documents on the Declaration summary page")
      andIshouldSeeXStatusForOnTheDeclarationSummaryPage("Error", "documents")

      And("I should see Error status for items on the Declaration summary page")
      andIshouldSeeXStatusForOnTheDeclarationSummaryPage("Error", "items")

      And("I should see Error status for guarantee details on the Declaration summary page")
      andIshouldSeeXStatusForOnTheDeclarationSummaryPage("Error", "guarantee details")

      And("I click on the Amend trader details link on the Declaration summary page")
      thenIclickOnTheLinkOnTheDeclarationSummaryPage("Amend")

      And("I click the Change link for Do you want to add a contact? on the Trader details Check your answers page")
      CYAPage.clickChangeLink("Do you want to add a contact?")

      And("I choose radio option No on the Do you want to add a contact for the transit holder? page")
      andIchooseRadioOptionXOnTheDoYouWantToAddAContactForTheTransitHolderPage("No")

      And("I submit on the Check your answers section Trader details page")
      CYAPage.submitAnswers("Trader details")

      And("I should see Amended status for trader details on the Declaration summary page")
      andIshouldSeeXStatusForOnTheDeclarationSummaryPage("Amended", "trader details")

      And("I click on the Amend route details link on the Declaration summary page")
      thenIclickOnTheLinkOnTheDeclarationSummaryPage("Amend")

      And(
        "I click the Change link for Do you want to add a contact for the location of goods? on the Route details Check your answers page"
      )
      CYAPage.clickChangeLink("Do you want to add a contact for the location of goods?")

      And("I choose radio option No on the Do you want to add a contact for the location of goods? page")
      andIchooseRadioOptionXOnTheDoYouWantToAddAContactForTheLocationOfGoodsPage("No")

      And("I submit on the Check your answers section Route details page")
      CYAPage.submitAnswers("Route details")

      And("I should see Amended status for route details on the Declaration summary page")
      andIshouldSeeXStatusForOnTheDeclarationSummaryPage("Amended", "route details")

      And("I click on the Amend transport details link on the Declaration summary page")
      thenIclickOnTheLinkOnTheDeclarationSummaryPage("Amend")

      And(
        "I click the Change link for Do you want to add a method of payment for transport charges? on the Transport details Check your answers page"
      )
      CYAPage.clickChangeLink("Do you want to add a method of payment for transport charges?")

      And("I choose radio option No on the Do you want to add a method of payment for transport charges? page")
      andIchooseRadioOptionXOnTheDoYouWantToAddAMethodOfPaymentForTransportChargesPage("No")

      And("I submit on the Check your answers section Transport details page")
      CYAPage.submitAnswers("Transport details")

      And("I should see Amended status for transport details on the Declaration summary page")
      andIshouldSeeXStatusForOnTheDeclarationSummaryPage("Amended", "transport details")

      And("I click on the Amend documents link on the Declaration summary page")
      thenIclickOnTheLinkOnTheDeclarationSummaryPage("Amend")

      And("I click the Change link on the You have added 3 documents page")
      DocumentAddAnotherPage.followLink("Change", "3")

      And(
        "I click the Change link for Do you want to add any additional information for this document? on the Documents Check your answers page"
      )
      CYAPage.clickChangeLink("Do you want to add any additional information for this document?")

      And("I click radio option No on the Do you want to add any additional information for this document? page")
      andIclickRadioOptionXOnTheDoYouWantToAddAnyAdditionalInformationForThisDocumentPage("No")

      And("I submit on the Check your answers section Documents page")
      CYAPage.submitAnswers("Documents")

      And("I choose radio option No on the You have added 3 documents page")
      DocumentAddAnotherPage.answerAddAnother("No", "3")

      And("I should see Amended status for documents on the Declaration summary page")
      andIshouldSeeXStatusForOnTheDeclarationSummaryPage("Amended", "documents")

      And("I click on the Amend items link on the Declaration summary page")
      thenIclickOnTheLinkOnTheDeclarationSummaryPage("Amend items")

      And("I click the Change link on the You have added 1 item page")
      ItemsAddAnotherPage.followLink("Change", "1")

      And("I click the Change link for Do you want to add supplementary units? on the Item 1 Check your answers page")
      CYAPage.clickChangeLink("Do you want to add supplementary units?")

      And("I click radio option No on the Do you want to add supplementary units? page")
      MeasurementAddSupplementaryUnitsPage.selectAndContinue("No")

      And("I submit on the Check your answers section Items page")
      CYAPage.submitAnswers("Items")

      And("I click radio option No on the You have added 1 item page")
      ItemsAddAnotherPage.answerAddAnother("No", "1")

      And("I should see Amended status for items on the Declaration summary page")
      andIshouldSeeXStatusForOnTheDeclarationSummaryPage("Amended", "items")

      And("I click on the Amend guarantee details link on the Declaration summary page")
      thenIclickOnTheLinkOnTheDeclarationSummaryPage("Amend")

      And("I click the Change link on the You have added 4 guarantees page")
      AddAnotherGuaranteePage.followLink("Change", "4")

      And("I click the Change link for Liability amount on the Guarantee details Check your answers page")
      CYAPage.clickChangeLink("Liability amount")

      And("I enter 999.99 on the How much is the liability in pounds? page")
      GuaranteeLiabilityAmountPage.enterLiabilityAmount("999.99")

      And("I submit on the Check your answers section Guarantee details page")
      CYAPage.submitAnswers("Guarantee details")

      And("I choose radio option No on the You have added 4 guarantees page")
      AddAnotherGuaranteePage.answerAddAnother("No", "4")

      And("I should see Amended status for guarantee details on the Declaration summary page")
      andIshouldSeeXStatusForOnTheDeclarationSummaryPage("Amended", "guarantee details")

      And("I click the Confirm and resend button on the Declaration summary page")
      andIclickTheConfirmAndResendConfirmAndSendButtonOnTheDeclarationSummaryPage()

      And("I click the Sign out link on the Departure declaration sent page")
      DepartureConfirmationPage.followConfirmationLink("Sign out")

    }

    Scenario("03 End to end journey for amending a rejected declaration amendment after MRN allocation") {
      Given("I login with ID 1234567890")
      andILoginWithIDX("1234567890")

      When("I submit an IE015 Departure Declaration")
      givenIsubmitAFile("IE015 Departure Declaration")

      Then("I submit an IE028 MRN Allocated")
      givenIsubmitAFile("IE028 MRN Allocated")

      Then("I submit an IE013 Declaration Amendment")
      givenIsubmitAFile("IE013 Declaration Amendment")

      And("I submit an IE056 Amendment Rejection With Amendable Errors")
      givenIsubmitAFile("IE056 Amendment Rejection With Amendable Errors")

      And("the user has submitted departureDeclaration.json for LRN 25GB000246TK0E6WJ1 and EORI number 1234567890")
      whenTheUserHasSubmittedFileForLRNAndEORINumber("departureDeclaration.json", "25GB000246TK0E6WJ1", "1234567890")

      And("I refresh the page")
      CommonPage.refreshPage()

      And("I click on the View departure declarations link on the Manage your transit movements page")
      givenIclickOnTheLinkOnTheManageYourTransitMovementsPage("View departure declarations")

      And("I click on the Amend declaration link for LRN 25GB000246TK0E6WJ1 on the Departure declarations page")
      ManagedFEDepartureDeclarationsPage.openDeparture("Amend declaration", "25GB000246TK0E6WJ1")

      And("I click on the Amend errors button on the Amend declaration errors page")
      ManagedFEAmendDeclarationErrorsPage.amendErrors()

      And("I should see Error status for trader details on the Declaration summary page")
      andIshouldSeeXStatusForOnTheDeclarationSummaryPage("Error", "trader details")

      And("I should see Error status for route details on the Declaration summary page")
      andIshouldSeeXStatusForOnTheDeclarationSummaryPage("Error", "route details")

      And("I should see Error status for transport details on the Declaration summary page")
      andIshouldSeeXStatusForOnTheDeclarationSummaryPage("Error", "transport details")

      And("I should see Error status for documents on the Declaration summary page")
      andIshouldSeeXStatusForOnTheDeclarationSummaryPage("Error", "documents")

      And("I should see Error status for items on the Declaration summary page")
      andIshouldSeeXStatusForOnTheDeclarationSummaryPage("Error", "items")

      And("I should see Error status for guarantee details on the Declaration summary page")
      andIshouldSeeXStatusForOnTheDeclarationSummaryPage("Error", "guarantee details")

      And("I click on the Amend trader details link on the Declaration summary page")
      thenIclickOnTheLinkOnTheDeclarationSummaryPage("Amend")

      And(
        "I click the Change link for Do you want to add a contact for the consignor? on the Trader details Check your answers page"
      )
      CYAPage.clickChangeLink("Do you want to add a contact for the consignor?")

      And("I choose radio option No on the Do you want to add a contact for the consignor? page")
      andIchooseRadioOptionXOnTheDoYouWantToAddAContactForTheConsignorPage("No")

      And("I submit on the Check your answers section Trader details page")
      CYAPage.submitAnswers("Trader details")

      And("I should see Amended status for trader details on the Declaration summary page")
      andIshouldSeeXStatusForOnTheDeclarationSummaryPage("Amended", "trader details")

      And("I click on the Amend route details link on the Declaration summary page")
      thenIclickOnTheLinkOnTheDeclarationSummaryPage("Amend")

      And(
        "I click the Change link for Do you want to add a contact for the location of goods? on the Route details Check your answers page"
      )
      CYAPage.clickChangeLink("Do you want to add a contact for the location of goods?")

      And("I choose radio option No on the Do you want to add a contact for the location of goods? page")
      andIchooseRadioOptionXOnTheDoYouWantToAddAContactForTheLocationOfGoodsPage("No")

      And("I submit on the Check your answers section Route details page")
      CYAPage.submitAnswers("Route details")

      And("I should see Amended status for route details on the Declaration summary page")
      andIshouldSeeXStatusForOnTheDeclarationSummaryPage("Amended", "route details")

      And("I click on the Amend transport details link on the Declaration summary page")
      thenIclickOnTheLinkOnTheDeclarationSummaryPage("Amend")

      And(
        "I click the Change link for Do you want to add a method of payment for transport charges? on the Transport details Check your answers page"
      )
      CYAPage.clickChangeLink("Do you want to add a method of payment for transport charges?")

      And("I choose radio option No on the Do you want to add a method of payment for transport charges? page")
      andIchooseRadioOptionXOnTheDoYouWantToAddAMethodOfPaymentForTransportChargesPage("No")

      And("I submit on the Check your answers section Transport details page")
      CYAPage.submitAnswers("Transport details")

      And("I should see Amended status for transport details on the Declaration summary page")
      andIshouldSeeXStatusForOnTheDeclarationSummaryPage("Amended", "transport details")

      And("I click on the Amend documents link on the Declaration summary page")
      thenIclickOnTheLinkOnTheDeclarationSummaryPage("Amend")

      And("I click the Change link on the You have added 3 documents page")
      DocumentAddAnotherPage.followLink("Change", "3")

      And(
        "I click the Change link for Do you want to add any additional information for this document? on the Documents Check your answers page"
      )
      CYAPage.clickChangeLink("Do you want to add any additional information for this document?")

      And("I click radio option No on the Do you want to add any additional information for this document? page")
      andIclickRadioOptionXOnTheDoYouWantToAddAnyAdditionalInformationForThisDocumentPage("No")

      And("I submit on the Check your answers section Documents page")
      CYAPage.submitAnswers("Documents")

      And("I choose radio option No on the You have added 3 documents page")
      DocumentAddAnotherPage.answerAddAnother("No", "3")

      And("I should see Amended status for documents on the Declaration summary page")
      andIshouldSeeXStatusForOnTheDeclarationSummaryPage("Amended", "documents")

      And("I click on the Amend items link on the Declaration summary page")
      thenIclickOnTheLinkOnTheDeclarationSummaryPage("Amend")

      And("I click the Change link on the You have added 1 item page")
      ItemsAddAnotherPage.followLink("Change", "1")

      And("I click the Change link for Do you want to add supplementary units? on the Item 1 Check your answers page")
      CYAPage.clickChangeLink("Do you want to add supplementary units?")

      And("I click radio option No on the Do you want to add supplementary units? page")
      MeasurementAddSupplementaryUnitsPage.selectAndContinue("No")

      And("I submit on the Check your answers section Items page")
      CYAPage.submitAnswers("Items")

      And("I click radio option No on the You have added 1 item page")
      ItemsAddAnotherPage.answerAddAnother("No", "1")

      And("I should see Amended status for items on the Declaration summary page")
      andIshouldSeeXStatusForOnTheDeclarationSummaryPage("Amended", "items")

      And("I click on the Amend guarantee details link on the Declaration summary page")
      thenIclickOnTheLinkOnTheDeclarationSummaryPage("Amend guarantee details")

      And("I click the Change link on the You have added 4 guarantees page")
      AddAnotherGuaranteePage.followLink("Change", "4")

      And("I click the Change link for Liability amount on the Guarantee details Check your answers page")
      CYAPage.clickChangeLink("Liability amount")

      And("I enter 999.99 on the How much is the liability in pounds? page")
      GuaranteeLiabilityAmountPage.enterLiabilityAmount("999.9")

      And("I submit on the Check your answers section Guarantee details page")
      CYAPage.submitAnswers("Guarantee details")

      And("I choose radio option No on the You have added 4 guarantees page")
      AddAnotherGuaranteePage.answerAddAnother("No", "4")

      And("I should see Amended status for guarantee details on the Declaration summary page")
      andIshouldSeeXStatusForOnTheDeclarationSummaryPage("Amended", "guarantee details")

      And("I click the Confirm and resend button on the Declaration summary page")
      andIclickTheConfirmAndResendConfirmAndSendButtonOnTheDeclarationSummaryPage()

      And("I click the Sign out link on the Departure declaration sent page")
      DepartureConfirmationPage.followConfirmationLink("Sign out")

    }

    Scenario("04 End to end journey for amending a departure declaration with invalid guarantee") {
      Given("I login with ID 1234567890")
      andILoginWithIDX("1234567890")

      When("I submit an IE015 Departure Declaration")
      givenIsubmitAFile("IE015 Departure Declaration")

      Then("I submit an IE028 MRN Allocated")
      givenIsubmitAFile("IE028 MRN Allocated")

      Then("I submit an IE055 Guarantee Not Valid")
      givenIsubmitAFile("IE055 Guarantee Not Valid")

      And("the user has submitted departureDeclaration.json for LRN 25GB000246TK0E6WJ1 and EORI number 1234567890")
      whenTheUserHasSubmittedFileForLRNAndEORINumber("departureDeclaration.json", "25GB000246TK0E6WJ1", "1234567890")

      And("I refresh the page")
      CommonPage.refreshPage()

      And("I click on the View departure declarations link on the Manage your transit movements page")
      givenIclickOnTheLinkOnTheManageYourTransitMovementsPage("View departure declarations")

      And("I click on the View errors link for LRN 25GB000246TK0E6WJ1 on the Departure declarations page")
      ManagedFEDepartureDeclarationsPage.openDeparture("View errors", "25GB000246TK0E6WJ1")

      And("I click on the Amend errors button on the Amend guarantee errors page")
      ManagedFEAmendGuaranteeErrorsPage.amendErrors()

      And("I should see Completed status for trader details on the Declaration summary page")
      andIshouldSeeXStatusForOnTheDeclarationSummaryPage("Completed", "trader details")

      And("I should see Completed status for route details on the Declaration summary page")
      andIshouldSeeXStatusForOnTheDeclarationSummaryPage("Completed", "route details")

      And("I should see Completed status for transport details on the Declaration summary page")
      andIshouldSeeXStatusForOnTheDeclarationSummaryPage("Completed", "transport details")

      And("I should see Completed status for documents on the Declaration summary page")
      andIshouldSeeXStatusForOnTheDeclarationSummaryPage("Completed", "documents")

      And("I should see Completed status for items on the Declaration summary page")
      andIshouldSeeXStatusForOnTheDeclarationSummaryPage("Completed", "items")

      And("I should see Error status for guarantee details on the Declaration summary page")
      andIshouldSeeXStatusForOnTheDeclarationSummaryPage("Error", "guarantee details")

      And("I click on the Amend guarantee details link on the Declaration summary page")
      thenIclickOnTheLinkOnTheDeclarationSummaryPage("Amend")

      And("I click the Remove link on the You have added 4 guarantees page")
      AddAnotherGuaranteePage.followLink("Remove", "4")

      And("I choose radio option Yes on the Are you sure you want to remove this guarantee? page")
      ConfirmRemoveGuaranteePage.confirmRemoval("Yes")

      And("I choose radio option No on the You have added 3 guarantee page")
      AddAnotherGuaranteePage.answerAddAnother("No", "3")

      And("I click the Confirm and resend button on the Declaration summary page")
      andIclickTheConfirmAndResendConfirmAndSendButtonOnTheDeclarationSummaryPage()

      And("I click the Sign out link on the Departure declaration sent page")
      DepartureConfirmationPage.followConfirmationLink("Sign out")

    }

    Scenario("05 User is unable to continue with an amendment if an IE029 message is received while amending") {
      Given("I login with ID 1234567890")
      andILoginWithIDX("1234567890")

      When("I submit an IE015 Departure Declaration")
      givenIsubmitAFile("IE015 Departure Declaration")

      Then("I submit an IE028 MRN Allocated")
      givenIsubmitAFile("IE028 MRN Allocated")

      And("the user has submitted departureDeclaration.json for LRN 25GB000246TK0E6WJ1 and EORI number 1234567890")
      whenTheUserHasSubmittedFileForLRNAndEORINumber("departureDeclaration.json", "25GB000246TK0E6WJ1", "1234567890")

      And("I refresh the page")
      CommonPage.refreshPage()

      And("I click on the View departure declarations link on the Manage your transit movements page")
      givenIclickOnTheLinkOnTheManageYourTransitMovementsPage("View departure declarations")

      And("I click on the Amend declaration link for LRN 25GB000246TK0E6WJ1 on the Departure declarations page")
      ManagedFEDepartureDeclarationsPage.openDeparture("Amend declaration", "25GB000246TK0E6WJ1")

      And("I click on the Edit trader details link on the Declaration summary page")
      thenIclickOnTheLinkOnTheDeclarationSummaryPage("Edit trader details")

      And(
        "I click the Change link for Do you want to add a contact for the consignor? on the Trader details Check your answers page"
      )
      CYAPage.clickChangeLink("Do you want to add a contact for the consignor?")

      And("I choose radio option No on the Do you want to add a contact for the consignor? page")
      andIchooseRadioOptionXOnTheDoYouWantToAddAContactForTheConsignorPage("No")

      When("I submit an IE029 Release For Transit")
      givenIsubmitAFile("IE029 Release For Transit")

      And("I submit on the Check your answers section Trader details page")
      CYAPage.submitAnswers("Trader details")

      Then("I should be on the For your security we signed you out page")
      thenIshouldBeOnTheForYourSecurityWeSignedYouOutPage()

    }
  }
}
