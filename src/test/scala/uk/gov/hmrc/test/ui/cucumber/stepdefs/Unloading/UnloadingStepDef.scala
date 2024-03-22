/*
 * Copyright 2023 HM Revenue & Customs
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

package uk.gov.hmrc.test.ui.cucumber.stepdefs.Unloading

import uk.gov.hmrc.test.ui.cucumber.stepdefs.BaseStepDef
import uk.gov.hmrc.test.ui.pages.PresentationNotification.ActiveMeansOfBorderTransport.ActiveMeansOfBorderTransportIdentificationNumberPage
import uk.gov.hmrc.test.ui.pages.PresentationNotification.TransportEquipmentIncrementPage
import uk.gov.hmrc.test.ui.pages.Unloading.CrossCheckPagePages.DepartureMeansOfTransport.{AddAnotherDepartureMeansOfTransportPage, AddIdentificationNumberForDepartureMeansOfTransportPage, AddIdentificationTypeForDepartureMeansOfTransportPage, AddRegisterCountryForDepartureMeansOfTransportPage, CountryTypeVehicleRegisteredPage, IdentificationForDepartureMeansOfTransportPage, IdentificationNumberForDepartureTransportMeansPage, RemoveDepartureMeansOfTransportPage}
import uk.gov.hmrc.test.ui.pages.Unloading.CrossCheckPagePages.TransportEquipment.{AddAnotherForTransportEquipmentPage, ContainerIdentificationNumberforTransportEquipmentPage, ItemTypeForTransportEquipmentPage, NewContainerIdentificationNumberPage, NewSealIdentificationNumberPage, OptionToAddContainerIdentificationNumberPage, OptionToAddItemsApplyPage, OptionToAddSealPage, RemoveItemFromTransportEquipmentPage, RemoveSealFromTransportEquipmentPage, RemoveTransportEquipmentFromCorssCheckPage, SealIdentificationNumberForTransportEquipmentPage, SealsIncrementPage}
import uk.gov.hmrc.test.ui.pages.Unloading.CrossCheckPagePages.{AddAdditionalInformationForDocumentPage, AddDocumentTypePage, AdditionalInformationPage, CountryForNewDepartureMeansOfTransportPage, DocumentsAddAnotherDocumentsPage, DocumentsNewReferenceNumber, DocumentsReferenceNumberPage, IdentificationForNewDepartureMeansOfTransportPage, IdentificationNumberForNewDepartureMeansOfTransportPage, NewAdditionalInformation, NewDocumentType, RemoveDocumentFromAllItemsPage}
import uk.gov.hmrc.test.ui.pages.Unloading._

class UnloadingStepDef extends BaseStepDef {

  Then("""^(?:I )?should be on the 'Unload the goods before you make unloading remarks' page$""") { () =>
    UnloadingGuidancePage
      .loadPage()
  }

  And("""^(?:I )?should see the content (.*) on the Unloading rejection page$""") { (content: String) =>
    UnloadingRejectionPage
      .loadPage()
      .checkForContent(content)
  }

  And("""^(?:I )?fill in the date on the 'When were the goods unloaded\?' page$""") { () =>
    GoodsUnloadedDatePage
      .loadPage()
      .fillInputs()
      .submitPage()
  }

  And("""^(?:I )?choose radio option (.*) on the 'Have you fully or partially unloaded the goods\?' page$""") {
    (answer: String) =>
      FullyOrPartiallyUnloadedPage
        .loadPage()
        .select(answer)
        .submitPage()
  }

  And(
    """^(?:I )?choose radio option (.*) on the 'Are all the seal identification numbers or marks readable\?' page$"""
  ) { (answer: String) =>
    SealNumbersReadablePage
      .loadPage()
      .select(answer)
      .submitPage()
  }

  And("""^(?:I )?choose radio option (.*) on the 'Are any of the seals broken\?' page$""") { (answer: String) =>
    SealsBrokenPage
      .loadPage()
      .select(answer)
      .submitPage()
  }

  And("""^(?:I )?click the Continue button on the 'Cross-check the transit with this declaration summary' page$""") {
    () =>
      DeclarationSummaryPage
        .loadPage()
        .submitPage()
  }

  Given(
    """^(?:I )?click the 'More details' link for house consignment (.+) on the 'Cross-check the transit with this declaration summary' page$"""
  ) { (index: String) =>
    DeclarationSummaryPage
      .loadPage()
      .selectAction(index)
  }

  Given(
    """^(?:I )?click the Back to summary button on the 'Cross-check the transit with house consignment (.*)' page$"""
  ) { (houseConsignmentNumber: String) =>
    HouseConsignmentPage
      .loadPage(houseConsignmentNumber)
      .submitPage()
  }

  And(
    """^(?:I )?choose radio option (.*) on the 'Were there any discrepancies between the transit and the declaration summary\?' page$"""
  ) { (answer: String) =>
    DifferencesPage
      .loadPage()
      .select(answer)
      .submitPage()
  }

  And("""^(?:I )?enter (.+) on the 'What is the identification number for the new vehicle\?' page$""") {
    (answer: String) =>
      VehicleIdPage
        .loadPage()
        .fillInput(answer)
        .submitPage()
  }

  And("""^(?:I )?click the Continue button on the 'Unload the goods before you make unloading remarks' page$""") { () =>
    UnloadingGuidancePage
      .loadPage()
      .submitPage()
  }

  When("""^(?:I )?click the (.*) link on the 'What did you find when unloading\?' page$""") { (sectionLink: String) =>
    UnloadingSummaryPage
      .loadPage()
      .clickByPartialLinkText(sectionLink)
  }

  And("""^(?:I )?enter (.*) on the 'What do you need to report\?' page$""") { (answer: String) =>
    UnloadingReportPage
      .loadPage()
      .fillInput(answer)
      .submitPage()
  }

  And(
    """^(?:I )?enter (.*) on the 'Describe the discrepancies between the transit and the declaration summary' page$"""
  ) { (answer: String) =>
    UnloadingCommentsPage
      .loadPage()
      .fillInput(answer)
      .submitPage()
  }

  And("""^(?:I )?click the Change link for (.+) on the 'What did you find when unloading\?' page$""") {
    (text: String) =>
      UnloadingReportPage
        .loadPage()
        .clickChangeLink(text)
  }

  And("""^(?:I )?select (.*) on the unloading 'What country is the vehicle registered to\?' page$""") {
    (answer: String) =>
      VehicleCountryPage
        .loadPage()
        .select(answer)
        .submitPage()
  }

  And("""^(?:I )?enter (.*) on the 'What is the new seal number\?' page$""") { (answer: String) =>
    SealNumberPage
      .loadPage()
      .fillInput(answer)
      .submitPage()
  }

  And("""^(?:I )?enter (.*) on the 'What is the new container identification number\?' page$""") { (answer: String) =>
    ContainerNumberPage
      .loadPage()
      .fillInput(answer)
      .submitPage()
  }

  And("""^(?:I )?enter (.*) on the 'What is the new gross weight of item (.*)\?' page$""") {
    (answer: String, itemNumber: String) =>
      GrossWeightPage
        .loadPage(itemNumber)
        .fillInput(answer)
        .submitPage()
  }

  And("""^(?:I )?enter (.*) on the 'What is the new number of packages for item (.*)\?' page$""") {
    (answer: String, itemNumber: String) =>
      NumberPackagesPage
        .loadPage(itemNumber)
        .fillInput(answer)
        .submitPage()
  }

  And("""^(?:I )?enter (.*) on the 'What is the new net weight of item (.*)\?' page$""") {
    (answer: String, itemNumber: String) =>
      NetWeightPage
        .loadPage(itemNumber)
        .fillInput(answer)
        .submitPage()
  }

  Then("""^(?:I )?(?:should )?be on the 'Unloading remarks sent' page$""") { () =>
    UnloadingConfirmationPage
      .loadPage()
  }

  Then("""^(?:I )?(?:should )?be on the 'You cannot send these unloading remarks' page$""") { () =>
    CannotSendUnloadingPage
      .loadPage()
  }

  And("""^(?:I )?click radio option (.*) on the 'Are you sure you want to remove your comments\?' page$""") {
    (answer: String) =>
      RemoveCommentsPage
        .loadPage()
        .select(answer)
        .submitPage()
  }

  Given(
    """^(?:I )?click the 'Documents' link for Documents (.+) on the 'Cross-check the transit with this declaration summary' page$"""
  ) { (index: String) =>
    DeclarationSummaryPage
      .loadPage()
      .selectDocAction(index)
  }
  And(
    """^(?:I )?click the Change link for (.+) on the 'Cross-check the transit with this declaration summary' page$"""
  ) { (text: String) =>
    DeclarationSummaryPage
      .clickLinkById(text)
  }

  And("""^(?:I )?select (.+) on the 'What is the new document type\?' page$""") { (answer: String) =>
    NewDocumentType
      .loadPage()
      .select(answer)
      .submitPage()
  }
  And("""^(?:I )?enter reference number (.+) on 'What is the document’s new reference number\?' page$""") {
    (answer: String) =>
      DocumentsNewReferenceNumber
        .loadPage()
        .fillInput(answer)
        .submitPage()
  }

  And("""^(?:I )?enter additional information (.+) on 'Enter the new additional information\?' page$""") {
    (answer: String) =>
      NewAdditionalInformation
        .loadPage()
        .fillInput(answer)
        .submitPage()
  }

  Given(
    """^(?:I )?click the 'Departure means of transport' link for Departure means of transport (.+) on the 'Cross-check the transit with this declaration summary' page$"""
  ) { (index: String) =>
    DeclarationSummaryPage
      .loadPage()
      .selectDepartureTransportAction(index)
  }

  And(
    """^(?:I )?choose radio option (.*) on the 'Which identification do you want to use for the new departure means of transport\?' page$"""
  ) { (answer: String) =>
    IdentificationForNewDepartureMeansOfTransportPage
      .loadPage()
      .select(answer)
      .submitPage()
  }

  And(
    """^(?:I )?enter identification number (.+) on 'What is the identification number for the new departure means of transport\?' page$"""
  ) { (answer: String) =>
    IdentificationNumberForNewDepartureMeansOfTransportPage
      .loadPage()
      .fillInput(answer)
      .submitPage()
  }

  And("""^(?:I )?select (.+) on the 'What country is the new departure means of transport registered to\?' page$""") {
    (answer: String) =>
      CountryForNewDepartureMeansOfTransportPage
        .loadPage()
        .select(answer)
        .submitPage()
  }

  And("""^(?:I )?click the link (.+) on the 'Cross-check the transit with this declaration summary' page$""") {
    (text: String) =>
      DeclarationSummaryPage
        .clickById(text)

  }

  And("""^(?:I )?choose radio option (.*) on the 'You have added (.*) documen(?:t |ts )to all items' page$""") {
    (answer: String, numberOfDocuments: String) =>
      DocumentsAddAnotherDocumentsPage
        .loadPage(numberOfDocuments)
        .select(answer)
        .submitPage()
  }
  And("""^(?:I )?Add (.+) on the 'What type of document do you want to add\?' page$""") { (answer: String) =>
    AddDocumentTypePage
      .loadPage()
      .select(answer)
      .submitPage()
  }
  And("""^(?:I )?enter reference number (.+) on 'What is the document’s reference number\?' page$""") {
    (answer: String) =>
      DocumentsReferenceNumberPage
        .loadPage()
        .fillInput(answer)
        .submitPage()
  }

  And(
    """^(?:I )?choose radio option (.*) on the documents 'Do you want to add any additional information for this document\?' page$"""
  ) { (answer: String) =>
    AddAdditionalInformationForDocumentPage
      .loadPage()
      .select(answer)
      .submitPage()
  }

  And("""^(?:I )?enter additional information (.+) on documents 'Enter the additional information\?' page$""") {
    (answer: String) =>
      AdditionalInformationPage
        .loadPage()
        .fillInput(answer)
        .submitPage()
  }

  And(
    """^(?:I )?choose to click on the (.*) link on the 'You have added (.*) documen(?:t |ts )to all items' page$"""
  ) { (sectionLink: String, numberOfDocumentsAdded: String) =>
    DocumentsAddAnotherDocumentsPage
      .loadPage(numberOfDocumentsAdded)
      .clickByPartialLinkText(sectionLink)
  }
  And(
    """^(?:I )?choose radio option (.*) on the documents 'Are you sure you want to remove this document from all items\?' page$"""
  ) { (answer: String) =>
    RemoveDocumentFromAllItemsPage
      .loadPage()
      .select(answer)
      .submitPage()
  }

  And(
    """^(?:I )?choose radio option (.*) on the documents 'Do you want to add the type of identification for the departure means of transport\?' page$"""
  ) { (answer: String) =>
    AddIdentificationTypeForDepartureMeansOfTransportPage
      .loadPage()
      .select(answer)
      .submitPage()
  }
  And(
    """^(?:I )?choose radio option (.*) on the 'Which identification do you want to use for the departure means of transport\?' page$"""
  ) { (answer: String) =>
    IdentificationForDepartureMeansOfTransportPage
      .loadPage()
      .select(answer)
      .submitPage()
  }
  And(
    """^(?:I )?choose radio option (.*) on the documents 'Do you want to add an identification number for this vehicle\?' page$"""
  ) { (answer: String) =>
    AddIdentificationNumberForDepartureMeansOfTransportPage
      .loadPage()
      .select(answer)
      .submitPage()
  }
  And("""^(?:I )?enter identification number (.+) on 'What is the identification number for this vehicle\?' page$""") {
    (answer: String) =>
      IdentificationNumberForDepartureTransportMeansPage
        .loadPage()
        .fillInput(answer)
        .submitPage()
  }
  And(
    """^(?:I )?choose radio option (.*) on the documents 'Do you want to add the registered country for this vehicle\?' page$"""
  ) { (answer: String) =>
    AddRegisterCountryForDepartureMeansOfTransportPage
      .loadPage()
      .select(answer)
      .submitPage()
  }
  And("""^(?:I )?select (.+) on the 'What country is this vehicle registered to\?' page$""") { (answer: String) =>
    CountryTypeVehicleRegisteredPage
      .loadPage()
      .select(answer)
      .submitPage()
  }

  And(
    """^(?:I )?choose to click on the (.*) link on the 'You have added (.*) departure means of transport' page$"""
  ) { (sectionLink: String, numberOfDeparturesAdded: String) =>
    AddAnotherDepartureMeansOfTransportPage
      .loadPage(numberOfDeparturesAdded)
      .clickByPartialLinkText(sectionLink)
  }
  And(
    """^(?:I )?choose radio option (.*) on the documents 'Are you sure you want to remove departure means of transport (.+)\?' page$"""
  ) { (answer: String, removeCount: String) =>
    RemoveDepartureMeansOfTransportPage
      .loadPage(removeCount)
      .select(answer)
      .submitPage()
  }
  And("""^(?:I )?choose radio option (.*) on the 'You have added (.*) departure means of transport' page$""") {
    (answer: String, numberOfDocuments: String) =>
      AddAnotherDepartureMeansOfTransportPage
        .loadPage(numberOfDocuments)
        .select(answer)
        .submitPage()
  }

  //TransportEquipment
  Given(
    """^(?:I )?click the 'Transport equipment' link for Transport equipment (.+) on the 'Cross-check the transit with this declaration summary' page$"""
  ) { (index: String) =>
    DeclarationSummaryPage
      .loadPage()
      .selectTransportEquipmentAction(index)
  }
  And("""^(?:I )?enter identification number (.+) on 'What is the new container identification number\?' page$""") {
    (answer: String) =>
      NewContainerIdentificationNumberPage
        .loadPage()
        .fillInput(answer)
        .submitPage()
  }

  And("""^(?:I )?enter seal identification number (.+) on 'What is the new seal identification number\?' page$""") {
    (answer: String) =>
      NewSealIdentificationNumberPage
        .loadPage()
        .fillInput(answer)
        .submitPage()
  }
  And("""^(?:I )?select (.+) on the 'Which item does this transport equipment apply to\?' page$""") { (answer: String) =>
      ItemTypeForTransportEquipmentPage
      .loadPage()
      .select(answer)
      .submitPage()
  }
  And(
    """^(?:I )?click continue 'You have applied (.*) item to transport equipment (.*)' page$"""
  ) {
    (
      numberOfTransportEquipmentItemsInTitle: String,
      numberOfTransportEquipmentIncrementsInTitle: String
    ) =>
      TransportEquipmentIncrementPage
        .loadPage(numberOfTransportEquipmentItemsInTitle, numberOfTransportEquipmentIncrementsInTitle)
        .submitPage()
  }
  And("""^(?:I )?choose radio option (.*) on the cross check 'You have added (.*) transport equipment' page$""") {
    (answer: String, numberOfTransportEquipment: String) =>
      AddAnotherForTransportEquipmentPage
        .loadPage(numberOfTransportEquipment)
        .select(answer)
        .submitPage()
  }
  And("""^(?:I )?choose radio option (.*) on the cross check 'Do you want to add a container identification number for the transport equipment\?' page$""") {
    (answer: String) =>
      OptionToAddContainerIdentificationNumberPage
        .loadPage()
        .select(answer)
        .submitPage()
  }
  And("""^(?:I )?enter identification number (.+) on 'What is the container identification number\?' page$""") {
    (answer: String) =>
      ContainerIdentificationNumberforTransportEquipmentPage
        .loadPage()
        .fillInput(answer)
        .submitPage()
  }
  And("""^(?:I )?choose radio option (.*) on the cross check 'Do you want to add a seal for the transport equipment\?' page$""") {
    (answer: String) =>
      OptionToAddSealPage
        .loadPage()
        .select(answer)
        .submitPage()
  }
  And("""^(?:I )?enter identification number (.+) on 'What is the seal identification number\?' page$""") {
    (answer: String) =>
      SealIdentificationNumberForTransportEquipmentPage
        .loadPage()
        .fillInput(answer)
        .submitPage()
  }
  And(
    """^(?:I )?click (.*) on 'You have added (.*) sea(?: l|ls )to transport equipment (.*)' page$"""
  ) {
    (answer: String,
      numberOfTransportEquipmentSealInTitle: String,
      numberOfTransportEquipmentIncrementsInTitle: String
    ) =>
      SealsIncrementPage
        .loadPage(numberOfTransportEquipmentSealInTitle, numberOfTransportEquipmentIncrementsInTitle)
        .clickByPartialLinkText(answer)
  }
  And(
    """^(?:I )?choose radio option (.*) on 'Are you sure you want to remove seal (.*) from transport equipment (.*)\?' page$"""
  ) {
    (answer: String,
     SealValue: String,
     numberOfTransportEquipmentIncrementsInTitle: String
    ) =>
      RemoveSealFromTransportEquipmentPage
        .loadPage(SealValue, numberOfTransportEquipmentIncrementsInTitle)
        .select(answer)
        .submitPage()
  }
  And(
    """^(?:I )?click radio option (.*) on the 'You have added (.*) sea(?: l|ls )to transport equipment (.*)' page$"""
  ) {
    (answer: String,
     numberOfTransportEquipmentSealInTitle: String,
     numberOfTransportEquipmentIncrementsInTitle: String
    ) =>
      SealsIncrementPage
        .loadPage(numberOfTransportEquipmentSealInTitle, numberOfTransportEquipmentIncrementsInTitle)
        .select(answer)
        .submitPage()
  }
  And("""^(?:I )?choose radio option (.*) on the cross check 'Do any items apply to this transport equipment\?' page$""") {
    (answer: String) =>
      OptionToAddItemsApplyPage
        .loadPage()
        .select(answer)
        .submitPage()
  }
  And(
    """^(?:I )?click (.*) on 'You have applied (.*) item to transport equipment (.*)' page$"""
  ) {
    (answer: String,
     numberOfTransportEquipmentSealInTitle: String,
     numberOfTransportEquipmentIncrementsInTitle: String
    ) =>
      TransportEquipmentIncrementPage
        .loadPage(numberOfTransportEquipmentSealInTitle, numberOfTransportEquipmentIncrementsInTitle)
        .clickByPartialLinkText(answer)
  }
  And(
    """^(?:I )?choose radio option (.*) on the 'Are you sure you want to remove this item from transport equipment (.+)\?' page$"""
  ) { (answer: String, removeCount: String) =>
    RemoveItemFromTransportEquipmentPage
      .loadPage(removeCount)
      .select(answer)
      .submitPage()
  }
  And(
    """^(?:I )?click radio option (.*) on the 'You have applied (.*) item to transport equipment (.*)' page$"""
  ) {
    (answer: String,
      numberOfTransportEquipmentItemsInTitle: String,
      numberOfTransportEquipmentIncrementsInTitle: String
    ) =>
      TransportEquipmentIncrementPage
        .loadPage(numberOfTransportEquipmentItemsInTitle, numberOfTransportEquipmentIncrementsInTitle)
        .select(answer)
        .submitPage()
  }
  And(
    """^(?:I )?choose to click on the (.*) link on the 'You have added (.*) transport equipment' page$"""
  ) { (sectionLink: String, numberOfTransportEquipAdded: String) =>
    AddAnotherForTransportEquipmentPage
      .loadPage(numberOfTransportEquipAdded)
      .clickByPartialLinkText(sectionLink)
  }
  And(
    """^(?:I )?choose radio option (.*) on the documents 'Are you sure you want to remove transport equipment (.+)\?' page$"""
  ) { (answer: String, removeCount: String) =>
    RemoveTransportEquipmentFromCorssCheckPage
      .loadPage(removeCount)
      .select(answer)
      .submitPage()
  }

}
