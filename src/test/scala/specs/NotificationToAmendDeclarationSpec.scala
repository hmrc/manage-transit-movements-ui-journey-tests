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
import specsteps.CYAStepDefSteps.*
import specsteps.CommonStepDefSteps.*
import specsteps.DepartureConfirmationStepDefSteps.*
import specsteps.DepartureDeclarationsStepDefSteps.*
import specsteps.DocumentsStepDefSteps.*
import specsteps.LoginStepDefSteps.*
import specsteps.ManageStepDefSteps.*
import specsteps.PreTaskListStepDefSteps.*
import specsteps.PreviousStepDefSteps.*
import specsteps.TaskListStepDefSteps.*

class NotificationToAmendDeclarationSpec extends BaseSpec with GivenWhenThen {

  Feature("End to End Journey for IE022 - Notification to Amend Declaration") {

    Scenario("01 End to end journey for amending a rejected declaration amendment after MRN allocation") {
      Given("I login with ID 1234567890")
      andILoginWithIDX("1234567890")

      When("I submit an IE015 Departure Declaration")
      givenIsubmitAFile("IE015 Departure Declaration")

      Then("I submit an IE028 MRN Allocated")
      givenIsubmitAFile("IE028 MRN Allocated")

      Then("I submit an IE013 Declaration Amendment")
      givenIsubmitAFile("IE013 Declaration Amendment")

      And("I submit an IE022 Notification To Amend Declaration")
      givenIsubmitAFile("IE022 Notification To Amend Declaration")

      And("the user has submitted departureDeclaration.json for LRN 25GB000246TK0E6WJ1 and EORI number 1234567890")
      whenTheUserHasSubmittedFileForLRNAndEORINumber("departureDeclaration.json", "25GB000246TK0E6WJ1", "1234567890")

      And("I refresh the page")
      andIrefreshThePage()

      And("I click on the View departure declarations link on the Manage your transit movements page")
      givenIclickOnTheLinkOnTheManageYourTransitMovementsPage("View departure declarations")

      And("I click on the Amend declaration link for LRN 25GB000246TK0E6WJ1 on the Departure declarations page")
      andIclickOnTheXLinkForLRNXOnTheDepartureDeclarationsPage("Amend declaration", "25GB000246TK0E6WJ1")

      And("I click on the Amend errors button on the Amend declaration errors page")
      givenIclickOnTheAmendErrorsButtonOnTheAmendDeclarationErrorsPage()

      And("I should see Error status for trader details on the Declaration summary page")
      andIshouldSeeXStatusForOnTheDeclarationSummaryPage("Completed", "trader details")

      And("I should see Error status for route details on the Declaration summary page")
      andIshouldSeeXStatusForOnTheDeclarationSummaryPage("Completed", "route details")

      And("I should see Error status for transport details on the Declaration summary page")
      andIshouldSeeXStatusForOnTheDeclarationSummaryPage("Completed", "transport details")

      And("I should see Error status for documents on the Declaration summary page")
      andIshouldSeeXStatusForOnTheDeclarationSummaryPage("Error", "documents")

      And("I should see Error status for items on the Declaration summary page")
      andIshouldSeeXStatusForOnTheDeclarationSummaryPage("Completed", "items")

      And("I should see Error status for guarantee details on the Declaration summary page")
      andIshouldSeeXStatusForOnTheDeclarationSummaryPage("Completed", "guarantee details")

      And("I click on the Amend documents link on the Declaration summary page")
      thenIclickOnTheLinkOnTheDeclarationSummaryPage("Amend")

      And("I click the Change link on the You have added 3 documents page")
      whenIclickTheXLinkOnTheYouHaveAddedXDocumentsPage("Change", "3")

      And(
        "I click the Change link for Do you want to add any additional information for this document? on the Documents Check your answers page"
      )
      andIclickTheChangeLinkForOnTheTransportDetailsUnloadingRouteDetailsTraderDetailsDocumentsItem1GuaranteeDetailsCheckYourAnswersPage(
        "Do you want to add any additional information for this document?"
      )

      And("I click radio option No on the Do you want to add any additional information for this document? page")
      andIclickRadioOptionXOnTheDoYouWantToAddAnyAdditionalInformationForThisDocumentPage("No")

      And("I submit on the Check your answers section Documents page")
      andIsubmitOnTheCheckYourAnswersSectionXPage("Documents")

      And("I choose radio option No on the You have added 3 documents page")
      andIchooseRadioOptionXOnTheYouHaveAddedXDocumentsPage("No", "3")

      And("I should see Amended status for documents on the Declaration summary page")
      andIshouldSeeXStatusForOnTheDeclarationSummaryPage("Amended", "documents")

      And("I click the Confirm and resend button on the Declaration summary page")
      andIclickTheConfirmAndResendConfirmAndSendButtonOnTheDeclarationSummaryPage()

      And("I click the Sign out link on the Departure declaration sent page")
      andIclickTheLinkOnTheDepartureDeclarationSentPage("Sign out")

    }
    
    //These tests have been commented out due to a fix in DL-20605 - if Net Company implement their fix then we can reinstate these tests after reverted the changes.

//    Scenario("02 End to end journey for viewing errors from a rejected declaration amendment after MRN allocation - No data in the cache") {
//      Given("I login with ID 1234567890")
//      andILoginWithIDX("1234567890")
//
//      When("I submit an IE015 Departure Declaration")
//      givenIsubmitAFile("IE015 Departure Declaration")
//
//      Then("I submit an IE028 MRN Allocated")
//      givenIsubmitAFile("IE028 MRN Allocated")
//
//      Then("I submit an IE013 Declaration Amendment")
//      givenIsubmitAFile("IE013 Declaration Amendment")
//
//      And("I submit an IE022 Notification To Amend Declaration")
//      givenIsubmitAFile("IE022 Notification To Amend Declaration")
//
//      And("I refresh the page")
//      andIrefreshThePage()
//
//      And("I click on the View departure declarations link on the Manage your transit movements page")
//      givenIclickOnTheLinkOnTheManageYourTransitMovementsPage("View departure declarations")
//
//      And("I click on the View error link for LRN 25GB000246TK0E6WJ1 on the Departure declarations page")
//      andIclickOnTheXLinkForLRNXOnTheDepartureDeclarationsPage("View error", "25GB000246TK0E6WJ1")
//
//      Then("I should be on the Review Declaration errors page")
//      thenIshouldbeOnTheReviewDeclarationErrorsPage()
//
//      And("I sign out")
//      andISignOut()
//    }
//
//    Scenario("03 End to end journey for when no function errors exist from a rejected declaration amendment after MRN allocation") {
//      Given("I login with ID 1234567890")
//      andILoginWithIDX("1234567890")
//
//      When("I submit an IE015 Departure Declaration")
//      givenIsubmitAFile("IE015 Departure Declaration")
//
//      Then("I submit an IE028 MRN Allocated")
//      givenIsubmitAFile("IE028 MRN Allocated")
//
//      Then("I submit an IE013 Declaration Amendment")
//      givenIsubmitAFile("IE013 Declaration Amendment")
//
//      And("I submit an IE022 Notification To Amend Declaration No Errors")
//      givenIsubmitAFile("IE022 Notification To Amend Declaration No Errors")
//
//      And("the user has submitted departureDeclaration.json for LRN 25GB000246TK0E6WJ1 and EORI number 1234567890")
//      whenTheUserHasSubmittedFileForLRNAndEORINumber("departureDeclaration.json", "25GB000246TK0E6WJ1", "1234567890")
//
//      And("I refresh the page")
//      andIrefreshThePage()
//
//      And("I click on the View departure declarations link on the Manage your transit movements page")
//      givenIclickOnTheLinkOnTheManageYourTransitMovementsPage("View departure declarations")
//
//      And("I click on the Amend declaration link for LRN 25GB000246TK0E6WJ1 on the Departure declarations page")
//      andIclickOnTheXLinkForLRNXOnTheDepartureDeclarationsPage("View errors", "25GB000246TK0E6WJ1")
//
//      Then("I should be on the Declaration errors page")
//      thenIshouldbeOnTheDeclarationErrorsPage()
//
//      And("I sign out")
//      andISignOut()
//    }
//
    Scenario("04 End to end journey for amending a rejected Prelodged declaration amendment after MRN allocation") {
      Given("I login with ID 1234567890")
      andILoginWithIDX("1234567890")

      When("I submit an IE015 PreLodged Departure Declaration")
      givenIsubmitAFile("IE015 Simplified Prelodged Departure Declaration")

      Then("I submit an IE928 Positive Acknowledgment")
      givenIsubmitAFile("IE928 Positive Acknowledgment")

      Then("I submit an IE028 MRN Allocated")
      givenIsubmitAFile("IE028 MRN Allocated")

      Then("I submit an IE013 Declaration Amendment")
      givenIsubmitAFile("IE013 Declaration Amendment")

      And("I submit an IE022 Notification To Amend Declaration")
      givenIsubmitAFile("IE022 Notification To Amend Declaration")

      And("the user has submitted departureDeclaration.json for LRN 25GB000246TK0E6WJ1 and EORI number 1234567890")
      whenTheUserHasSubmittedFileForLRNAndEORINumber("departureDeclaration.json", "25GB000246TK0E6WJ1", "1234567890")

      And("I refresh the page")
      andIrefreshThePage()

      And("I click on the View departure declarations link on the Manage your transit movements page")
      givenIclickOnTheLinkOnTheManageYourTransitMovementsPage("View departure declarations")

      And("I click on the Amend declaration link for LRN 25GB000246TK0E6WJ1 on the Departure declarations page")
      andIclickOnTheXLinkForLRNXOnTheDepartureDeclarationsPage("Amend declaration", "25GB000246TK0E6WJ1")

      And("I click on the Amend errors button on the Amend declaration errors page")
      givenIclickOnTheAmendErrorsButtonOnTheAmendDeclarationErrorsPage()

      And("I should see Error status for trader details on the Declaration summary page")
      andIshouldSeeXStatusForOnTheDeclarationSummaryPage("Completed", "trader details")

      And("I should see Error status for route details on the Declaration summary page")
      andIshouldSeeXStatusForOnTheDeclarationSummaryPage("Completed", "route details")

      And("I should see Error status for transport details on the Declaration summary page")
      andIshouldSeeXStatusForOnTheDeclarationSummaryPage("Completed", "transport details")

      And("I should see Error status for documents on the Declaration summary page")
      andIshouldSeeXStatusForOnTheDeclarationSummaryPage("Error", "documents")

      And("I should see Error status for items on the Declaration summary page")
      andIshouldSeeXStatusForOnTheDeclarationSummaryPage("Completed", "items")

      And("I should see Error status for guarantee details on the Declaration summary page")
      andIshouldSeeXStatusForOnTheDeclarationSummaryPage("Completed", "guarantee details")

      And("I click on the Amend documents link on the Declaration summary page")
      thenIclickOnTheLinkOnTheDeclarationSummaryPage("Amend")

      And("I click the Change link on the You have added 3 documents page")
      whenIclickTheXLinkOnTheYouHaveAddedXDocumentsPage("Change", "3")

      And(
        "I click the Change link for Do you want to add any additional information for this document? on the Documents Check your answers page"
      )
      andIclickTheChangeLinkForOnTheTransportDetailsUnloadingRouteDetailsTraderDetailsDocumentsItem1GuaranteeDetailsCheckYourAnswersPage(
        "Do you want to add any additional information for this document?"
      )

      And("I click radio option No on the Do you want to add any additional information for this document? page")
      andIclickRadioOptionXOnTheDoYouWantToAddAnyAdditionalInformationForThisDocumentPage("No")

      And("I submit on the Check your answers section Documents page")
      andIsubmitOnTheCheckYourAnswersSectionXPage("Documents")

      And("I choose radio option No on the You have added 3 documents page")
      andIchooseRadioOptionXOnTheYouHaveAddedXDocumentsPage("No", "3")

      And("I should see Amended status for documents on the Declaration summary page")
      andIshouldSeeXStatusForOnTheDeclarationSummaryPage("Amended", "documents")

      And("I click the Confirm and resend button on the Declaration summary page")
      andIclickTheConfirmAndResendConfirmAndSendButtonOnTheDeclarationSummaryPage()

      And("I click the Sign out link on the Departure declaration sent page")
      andIclickTheLinkOnTheDepartureDeclarationSentPage("Sign out")

    }

  }
}
