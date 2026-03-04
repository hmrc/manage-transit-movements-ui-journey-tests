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
import specsteps.DocumentsStepDefSteps.*
import specsteps.DraftDepartureDeclarationsStepDefSteps.andIclickOnTheLinkForLRNXOnTheDraftDepartureDeclarationsPage
import specsteps.LoginStepDefSteps.*
import specsteps.ManageStepDefSteps.*
import specsteps.PreTaskListStepDefSteps.whenTheUserHasSubmittedFileForLRNAndEORINumber
import specsteps.TaskListStepDefSteps.*

class DocumentsSpec extends BaseSpec with GivenWhenThen {

  Feature("Journeys for Previous, Transport & Supporting documents") {

    Scenario("01 Departure Office 'GB' - Declaration 'T2' - Documents - 'Previous'") {

      Given("I login with ID 1234567890")
      andILoginWithIDX("1234567890")

      And("The user has submitted documentsGB1.json for LRN 1234567890DGB1 and EORI Number 1234567890")
      whenTheUserHasSubmittedFileForLRNAndEORINumber("documentsGB1.json", "1234567890DGB1", "1234567890")

      And("I refresh the page")
      andIrefreshThePage()

      And("I click on the View draft departure declarations link on the Manage your transit movements page")
      givenIclickOnTheLinkOnTheManageYourTransitMovementsPage("View draft departure declarations")

      And(
        "I click on the link for LRN 1234567890DGB1 on the Draft Departure declarations page"
      )
      andIclickOnTheLinkForLRNXOnTheDraftDepartureDeclarationsPage("1234567890DGB1")
      And("I click on the Add documents link on the Declaration summary page")
      thenIclickOnTheLinkOnTheDeclarationSummaryPage("Add documents")

      // Previous Document
      And("I click radio option No on the 'Do you want to use this document for all items?' page")
      andIclickRadioOptionXOnTheDoYouWantToUseThisDocumentForAllItemsPage("No")
      And("I select Previous - (C605) Information sheet INF3 on the 'What previous document do you want to add?' page")
      andIselectOnTheWhatPreviousDocumentDoYouWantToAddPage("Previous - (C605) Information sheet INF3")
      And("I enter 1234 on the 'What is the document’s reference number?' page")
      andIenterOnTheWhatIsTheDocumentsReferenceNumberPage("1234")
      And("I click radio option Yes on the 'Do you want to add any additional information for this document?' page")
      andIclickRadioOptionXOnTheDoYouWantToAddAnyAdditionalInformationDocument("Yes")
      And("I enter 12345,6789 on the Documents 'Enter the additional information' page")
      andIEnterXOnDocumentEnterAdditionalInformationPage("12345,6789")
      And("I submit on the Check your answers section Documents page")
      andIsubmitOnTheCheckYourAnswersSectionXPage("Documents")
      And("I choose radio option Yes on the 'You have added 1 document' page")
      andIchooseRadioOptionXOnTheYouHaveAddedXDocumentsPage("Yes", "1")
      And("I click radio option No on the 'Do you want to use this document for all items?' page")
      andIclickRadioOptionXOnTheDoYouWantToUseThisDocumentForAllItemsPage("No")
      And("I select Previous - (N380) Commercial invoice on the 'What type of document do you want to add?' page")
      andIselectOnTheWhatTypeOfDocumentDoYouWantToAddPage("Previous - (N380) Commercial invoice")
      And("I enter 1234 on the 'What is the document’s reference number?' page")
      andIenterOnTheWhatIsTheDocumentsReferenceNumberPage("1234")
      And("I click radio option No on the 'Do you want to add any additional information for this document?' page")
      andIclickRadioOptionXOnTheDoYouWantToAddAnyAdditionalInformationDocument("No")
      And("I submit on the Check your answers section Documents page")
      andIsubmitOnTheCheckYourAnswersSectionXPage("Documents")
      And("I choose to click on the Remove link on the 'You have added 2 documents' page")
      whenIclickTheXLinkOnTheYouHaveAddedXDocumentsPage("Remove", "2")
      And("I click radio option Yes on the 'Are you sure you want to remove this document?' page")
      andIclickRadioOptionXOnTheAreYouSureYouWantToRemoveThisDocumentPage("Yes")
      And("I choose radio option No on the 'You have added 1 documents' page")
      andIchooseRadioOptionXOnTheYouHaveAddedXDocumentsPage("No", "1")
      Then("I should be on the Declaration summary page")
      thenIshouldbeOnTheDeclarationSummaryPage()
      And("I should see Completed status for documents on the Declaration summary page")
      andIshouldSeeXStatusForOnTheDeclarationSummaryPage("Completed", "documents")

      And("I sign out")
      andISignOut()

    }

    Scenario("02 Departure Office 'GB' - Declaration 'T' - Documents - 'Transport") {

      Given("I login with ID 1234567890")
      andILoginWithIDX("1234567890")

      And("The user has submitted documentsGB2.json for LRN 1234567890DGB2 and EORI Number 1234567890")
      whenTheUserHasSubmittedFileForLRNAndEORINumber("documentsGB2.json", "1234567890DGB2", "1234567890")
      And("I refresh the page")
      andIrefreshThePage()
      And("I click on the View draft departure declarations link on the Manage your transit movements page")
      givenIclickOnTheLinkOnTheManageYourTransitMovementsPage("View draft departure declarations")
      And(
        "I click on the link for LRN 1234567890DGB2 on the Draft Departure declarations page"
      )
      andIclickOnTheLinkForLRNXOnTheDraftDepartureDeclarationsPage("1234567890DGB")
      And("I click on the Add documents link on the Declaration summary page")
      thenIclickOnTheLinkOnTheDeclarationSummaryPage("Add documents")

      And("I click radio option Yes on the 'Do you want to add any documents?' page")
      andIClickRadioOptionXOnDoYouWantToAddAnyDocuments("Yes")
      And("I click radio option Yes on the 'Do you want to use this document for all items?' page")
      andIclickRadioOptionXOnTheDoYouWantToUseThisDocumentForAllItemsPage("Yes")
      And("I select Transport - (N704) Master bill of lading on the 'What type of document do you want to add?' page")
      andIselectOnTheWhatTypeOfDocumentDoYouWantToAddPage("Transport - (N704) Master bill of lading")
      And("I enter 1234 on the 'What is the document’s reference number?' page")
      andIenterOnTheWhatIsTheDocumentsReferenceNumberPage("1234")
      And("I submit on the Check your answers section Documents page")
      andIsubmitOnTheCheckYourAnswersSectionXPage("Documents")
      And("I choose radio option No on the 'You have added 1 document' page")
      andIchooseRadioOptionXOnTheYouHaveAddedXDocumentsPage("No", "1")

      Then("I should be on the Declaration summary page")
      thenIshouldbeOnTheDeclarationSummaryPage()
      And("I should see Completed status for documents on the Declaration summary page")
      andIshouldSeeXStatusForOnTheDeclarationSummaryPage("Completed", "documents")

      And("I sign out")
      andISignOut()
    }

    Scenario("03 Departure Office 'XI' - Declaration 'TIR' - Documents - 'Supporting'") {

      Given("I login with ID 1234567890")
      andILoginWithIDX("1234567890")

      And("The user has submitted documentsXI.json for LRN 1234567890DXI and EORI Number 1234567890")
      whenTheUserHasSubmittedFileForLRNAndEORINumber("documentsXI.json", "1234567890DXI", "1234567890")
      And("I refresh the page")
      andIrefreshThePage()
      And("I click on the View draft departure declarations link on the Manage your transit movements page")
      givenIclickOnTheLinkOnTheManageYourTransitMovementsPage("View draft departure declarations")
      And(
        "I click on the link for LRN 1234567890DGB2 on the Draft Departure declarations page"
      )
      andIclickOnTheLinkForLRNXOnTheDraftDepartureDeclarationsPage("1234567890DXI")
      And("I click on the Add documents link on the Declaration summary page")
      thenIclickOnTheLinkOnTheDeclarationSummaryPage("Add documents")

      And("I click radio option Yes on the 'Do you want to add any documents?' page")
      andIClickRadioOptionXOnDoYouWantToAddAnyDocuments("Yes")
      And("I click radio option Yes on the 'Do you want to use this document for all items?' page")
      andIclickRadioOptionXOnTheDoYouWantToUseThisDocumentForAllItemsPage("Yes")
      And("I select Supporting - (C673) Catch certificate on the 'What type of document do you want to add?' page")
      andIselectOnTheWhatTypeOfDocumentDoYouWantToAddPage("Supporting - (C673) Catch certificate")
      And("I enter 1234 on the 'What is the document’s reference number?' page")
      andIenterOnTheWhatIsTheDocumentsReferenceNumberPage("1234")
      And("And I click radio option Yes on the 'Do you want to add a line item number?' page")
      andIclickRadioOptionXOnTheDoYouWantToAddALineItemNumberPage("Yes")
      And("And I enter 54321 on the 'What is the line item number?' page")
      andIenterOnTheWhatIsTheLineItemNumberPage("54321")
      And("And I click radio option Yes on the 'Do you want to add any additional information for this document?' page")
      andIclickRadioOptionXOnTheDoYouWantToAddAnyAdditionalInformationDocument("Yes")
      And("And I enter 12345 on the Documents 'Enter the additional information' page")
      andIEnterXOnDocumentEnterAdditionalInformationPage("12345")
      And("I submit on the Check your answers section Documents page")
      andIsubmitOnTheCheckYourAnswersSectionXPage("Documents")
      And("I choose radio option No on the 'You have added 1 document' page")
      andIchooseRadioOptionXOnTheYouHaveAddedXDocumentsPage("No", "1")

      Then("I should be on the Declaration summary page")
      thenIshouldbeOnTheDeclarationSummaryPage()
      And("I should see Completed status for documents on the Declaration summary page")
      andIshouldSeeXStatusForOnTheDeclarationSummaryPage("Completed", "documents")

      And("I sign out")
      andISignOut()
    }
  }
}
