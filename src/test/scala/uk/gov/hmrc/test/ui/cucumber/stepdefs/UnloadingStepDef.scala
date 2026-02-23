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

package uk.gov.hmrc.test.ui.cucumber.stepdefs

import uk.gov.hmrc.test.ui.cucumber.stepdefs.BaseStepDef
import uk.gov.hmrc.test.ui.pages.Departures.Items.PackagesTypeQuantityPage
import uk.gov.hmrc.test.ui.pages.PresentationNotification.PresentationNotificationTransportEquipmentIncrementPage
import uk.gov.hmrc.test.ui.pages.Unloading.*

class UnloadingStepDef extends BaseStepDef {

  Then("""^(?:I )?should be on the 'Do you want to use the revised unloading procedure\?' page$""") { () =>
    UnloadingFEIsRevisedUnloadingProcedurePage
      .loadPage()
  }

  Then(
    """^(?:I )?should be on the 'Enter the discrepancies between the transit movement and unloading permission' page$"""
  ) { () =>
    UnloadingFEConsignmentCrossCheckPage
      .loadPage()
  }

  Then("""^(?:I )?should be on the 'House consignment (.+)' page$""") { (houseConsignments: String) =>
    UnloadingFEHouseConsignmentPage
      .loadPage(houseConsignments)
  }

  And("""^(?:I )?fill in the date on the 'When were the goods unloaded\?' page$""") { () =>
    UnloadingFEGoodsUnloadedDatePage
      .loadPage()
      .fillInputs()
      .submitPage()
  }

  And("""^(?:I )?choose radio option (.*) on the 'Have you fully or partially unloaded the goods\?' page$""") {
    (answer: String) =>
      UnloadingFEFullyOrPartiallyUnloadedPage
        .loadPage()
        .select(answer)
        .submitPage()
  }

  And(
    """^(?:I )?choose radio option (.*) on the 'Are all the seal identification numbers or marks readable\?' page$"""
  ) { (answer: String) =>
    UnloadingFESealNumbersReadablePage
      .loadPage()
      .select(answer)
      .submitPage()
  }

  And("""^(?:I )?choose radio option (.*) on the 'Are any of the seals broken\?' page$""") { (answer: String) =>
    UnloadingFESealsBrokenPage
      .loadPage()
      .select(answer)
      .submitPage()
  }

  And(
    """^(?:I )?click the Continue button on the 'Enter the discrepancies between the transit movement and unloading permission' page$"""
  ) { () =>
    UnloadingFEConsignmentCrossCheckPage
      .loadPage()
      .submitPage()
  }

  Given(
    """^(?:I )?click the 'More details' link for house consignment (.+) on the 'Enter the discrepancies between the transit movement and unloading permission' page$"""
  ) { (index: String) =>
    UnloadingFEConsignmentCrossCheckPage
      .loadPage()
      .selectAction(index)
  }

  Given(
    """^(?:I )?click the Back to summary button on the 'House consignment (.*)' page$"""
  ) { (houseConsignmentNumber: String) =>
    UnloadingFEHouseConsignmentPage
      .loadPage(houseConsignmentNumber)
      .submitPage()
  }

  And(
    """^(?:I )?choose radio option (.*) on the 'Were there any discrepancies between the transit movement and unloading permission\?' page$"""
  ) { (answer: String) =>
    UnloadingFEDifferencesPage
      .loadPage()
      .select(answer)
      .submitPage()
  }

  And(
    """^(?:I )?choose radio option (.*) on the 'Do you want to use the revised unloading procedure\?' page$"""
  ) { (answer: String) =>
    UnloadingFEIsRevisedUnloadingProcedurePage
      .loadPage()
      .select(answer)
      .submitPage()
  }

  And(
    """^(?:I )?choose radio option (.*) on the 'Conditions for using the revised unloading procedure' page$"""
  ) { (answer: String) =>
    UnloadingFEIsRevisedProcedureConditionPage
      .loadPage()
      .select(answer)
      .submitPage()
  }

  And(
    """^(?:I )?choose radio option (.*) on the 'Are the goods too large to fit into a container\?' page$"""
  ) { (answer: String) =>
    UnloadingFEGoodsTooLargeToFitIntoContainerPage
      .loadPage()
      .select(answer)
      .submitPage()
  }

  And(
    """^(?:I )?choose radio option (.*) on the 'Has the external seal been replaced by a customs authority\?' page$"""
  ) { (answer: String) =>
    UnloadingFEHaveSealsBeenReplacedByCustomsPage
      .loadPage()
      .select(answer)
      .submitPage()
  }

  And(
    """^(?:I )?click the Continue button on the 'Check the goods and note any discrepancies' page$"""
  ) { () =>
    UnloadingFECheckGoodsAndNoteDiscrepanciesPage
      .loadPage()
      .submitPage()
  }

  And(
    """^(?:I )?click the Continue button on the 'You cannot use the revised unloading procedure' page$"""
  ) { () =>
    UnloadingFERevisedUnloadingProcedurePage
      .loadPage()
      .submitPage()
  }

  And(
    """^(?:I )?click the Continue button on the 'Unload the goods and note any discrepancies' page$"""
  ) { () =>
    UnloadingFEUnloadAndNoteDiscrepanciesPage
      .loadPage()
      .submitPage()
  }

  And(
    """^(?:I )?click the Continue button on the 'Download the unloading permission' page$"""
  ) { () =>
    UnloadingFEDownloadUnloadingPermissionsPage
      .loadPage()
      .submitPage()
  }

  And(
    """^(?:I )?click the Continue button on the 'Take a photograph of the external seal before it is broken' page$"""
  ) { () =>
    UnloadingFETakeAPhotographOfSealPage
      .loadPage()
      .submitPage()
  }

  Then("""^(?:I )?(?:should )?be on the 'Unloading remarks sent' page$""") { () =>
    UnloadingFEUnloadingConfirmationPage
      .loadPage()
  }

  Then("""^(?:I )?(?:should )?be on the 'You cannot send these unloading remarks' page$""") { () =>
    CannotSendUnloadingPage
      .loadPage()
  }

  Given(
    """^(?:I )?click the 'Documents' link for Documents (.+) on the 'Cross-check the transit with this declaration summary' page$"""
  ) { (index: String) =>
    UnloadingFEConsignmentCrossCheckPage
      .loadPage()
      .selectDocAction(index)
  }

  And(
    """^(?:I )?click the Change link for (.+) on the 'Cross-check the transit with this declaration summary' page$"""
  ) { (text: String) =>
    UnloadingFEConsignmentCrossCheckPage
      .clickLinkById(text)
  }

  And(
    """^(?:I )?click the (.+) link for section (.+) (.+)$"""
  ) { (changeLinkText: String, section: String, index: String) =>
    UnloadingFEConsignmentCrossCheckPage
      .loadPage()
      .selectSection(section)
      .selectSectionChild(section, index)
      .clickLinkByIdBySection(changeLinkText)
  }

  And(
    """^(?:I )?click the add or remove house consignment link$"""
  ) { () =>
    UnloadingFEConsignmentCrossCheckPage
      .loadPage()
      .selectAddRemoveHouseConsignment
  }

  And(
    """^(?:I )?click the add or remove countries of routing link$"""
  ) { () =>
    UnloadingFEConsignmentCrossCheckPage
      .loadPage()
      .selectAddRemoveCountriesOfRouting
  }

  And(
    """^(?:I )?click the (.+) link for (.+) in House consignment (.+)$"""
  ) { (changeLinkText: String, section: String, index: String) =>
    UnloadingFEHouseConsignmentPage
      .loadPage(index)
      .selectSection(section)
      .selectItem(section)
      .clickLinkByIdBySection(changeLinkText)
  }

  And(
    """^(?:I )?click the Change (.+) link for sub-section (.+) of section (.+) (.+)$"""
  ) { (changeLinkText: String, subSection: String, section: String, index: String) =>
    UnloadingFEConsignmentCrossCheckPage
      .loadPage()
      .selectSection(section)
      .selectSectionChild(section, index)
      .selectSubSection(subSection)
      .clickLinkByIdBySection(changeLinkText)
  }

  And(
    """^(?:I )?click the (.+) link in House consignment (.+) sub-section (.+) of section (.+)$"""
  ) { (changeLinkText: String, index: String, subSection: String, section: String) =>
    UnloadingFEHouseConsignmentPage
      .loadPage(index)
      .selectSection(section)
      .selectItem(section)
      .selectSectionChild(subSection)
      .selectSubSection(subSection)
      .clickLinkByIdBySection(changeLinkText)
  }

  And("""^(?:I )?select (.+) on the 'What is the new additional reference type\?' page$""") { (answer: String) =>
    UnloadingFENewAdditionalReferenceTypePage
      .loadPage()
      .select(answer)
      .submitPage()
  }

  And(
    """^(?:I )?select (.+) on the 'What is the new additional reference type for item 1 in house consignment 1\?' page$"""
  ) { (answer: String) =>
    UnloadingFENewItemLevelAdditionalReferenceTypePage
      .loadPage()
      .select(answer)
      .submitPage()
  }

  And("""^(?:I )?enter additional reference (.+) on the 'What is the new additional reference number\?' page$""") {
    (answer: String) =>
      UnloadingFENewAdditionalReferenceNumberPage
        .loadPage()
        .fillInput(answer)
        .submitPage()
  }

  And(
    """^(?:I )?enter additional reference (.+) on the 'What is the new additional reference number for item 1 in house consignment 1\?' page$"""
  ) { (answer: String) =>
    UnloadingFENewItemLevelAdditionalReferenceNumberPage
      .loadPage()
      .fillInput(answer)
      .submitPage()
  }

  And(
    """^(?:I )?select (.+) on the 'What is the new package type for item 1 in house consignment 1\?' page$"""
  ) { (answer: String) =>
    UnloadingFENewItemLevelPackageTypePage
      .loadPage()
      .select(answer)
      .submitPage()
  }

  And(
    """^(?:I )?enter shipping mark (.+) on the 'What is the new shipping mark for item 1 in house consignment 1\?' page$"""
  ) { (answer: String) =>
    UnloadingFENewItemLevelPackageShippingMarkPage
      .loadPage()
      .fillInput(answer)
      .submitPage()
  }

  And("""^(?:I )?select (.+) on the 'What is the new document type\?' page$""") { (answer: String) =>
    UnloadingFENewDocumentTypePage
      .loadPage()
      .select(answer)
      .submitPage()
  }

  And("""^(?:I )?enter reference number (.+) on the 'What is the document’s new reference number\?' page$""") {
    (answer: String) =>
      UnloadingFEDocumentsNewReferenceNumberPage
        .loadPage()
        .fillInput(answer)
        .submitPage()
  }

  And("""^(?:I )?enter additional information (.+) on the 'Enter the new additional information\?' page$""") {
    (answer: String) =>
      UnloadingFENewAdditionalInformationPage
        .loadPage()
        .fillInput(answer)
        .submitPage()
  }

  And(
    """^(?:I )?choose radio option (.*) on the 'Which identification do you want to use for the new departure means of transport\?' page$"""
  ) { (answer: String) =>
    UnloadingFEIdentificationForNewDepartureMeansOfTransportPage
      .loadPage()
      .select(answer)
      .submitPage()
  }

  And(
    """^(?:I )?enter identification number (.+) on the 'What is the identification number for the new departure means of transport\?' page$"""
  ) { (answer: String) =>
    UnloadingFEIdentificationNumberForNewDepartureMeansOfTransportPage
      .loadPage()
      .fillInput(answer)
      .submitPage()
  }

  And("""^(?:I )?select (.+) on the 'What country is the new departure means of transport registered to\?' page$""") {
    (answer: String) =>
      UnloadingFECountryForNewDepartureMeansOfTransportPage
        .loadPage()
        .select(answer)
        .submitPage()
  }

  And("""^(?:I )?choose radio option (.*) on the 'You have added (.*) documen(?:t |ts )to all items' page$""") {
    (answer: String, numberOfDocuments: String) =>
      UnloadingFEDocumentsAddAnotherDocumentsPage
        .loadPage(numberOfDocuments)
        .select(answer)
        .submitPage()
  }

  And("""^(?:I )?Add (.+) on the 'What type of document do you want to add\?' page$""") { (answer: String) =>
    UnloadingFEAddDocumentTypePage
      .loadPage()
      .select(answer)
      .submitPage()
  }

  And(
    """^(?:I )?Add (.+) on the 'What type of document do you want to add for item (.*) in house consignment 1\?' page$"""
  ) { (answer: String, itemIndex: String) =>
    UnloadingFEHouseConsignmentItemAddDocumentTypePage
      .loadPage(itemIndex)
      .select(answer)
      .submitPage()
  }

  And("""^(?:I )?select (.+) on the 'What type of document do you want to add for house consignment (.*)\?' page$""") {
    (answer: String, houseConsignmentIndex: String) =>
      UnloadingFEAddDocumentTypeForHouseConsignmentPage
        .loadPage(houseConsignmentIndex)
        .select(answer)
        .submitPage()
  }

  And(
    """^(?:I )?enter reference number (.+) on 'What is the document’s reference number for item (.*) in house consignment 1\?' page$"""
  ) { (answer: String, itemIndex: String) =>
    UnloadingFEHouseConsignmentItemDocsReferenceNumberPage
      .loadPage(itemIndex)
      .fillInput(answer)
      .submitPage()
  }

  And("""^(?:I )?enter reference number (.+) on 'What is the document’s reference number\?' page$""") {
    (answer: String) =>
      UnloadingFEDocumentsReferenceNumberPage
        .loadPage()
        .fillInput(answer)
        .submitPage()
  }

  And(
    """^(?:I )?choose radio option (.*) on the documents 'Do you want to add any additional information for this document\?' page$"""
  ) { (answer: String) =>
    UnloadingFEAddAdditionalInformationForDocumentPage
      .loadPage()
      .select(answer)
      .submitPage()
  }

  And("""^(?:I )?enter additional information (.+) on documents 'Enter the additional information\?' page$""") {
    (answer: String) =>
      UnloadingFEAdditionalInformationPage
        .loadPage()
        .fillInput(answer)
        .submitPage()
  }

  And(
    """^(?:I )?enter additional information (.+) on documents 'Enter the additional information for item (.*) in house consignment 1' page$"""
  ) { (answer: String, itemIndex: String) =>
    UnloadingFEHouseConsignmentItemAdditionalInformationPage
      .loadPage(itemIndex)
      .fillInput(answer)
      .submitPage()
  }

  And(
    """^(?:I )?add additional information (.+) on documents 'Enter the additional information in house consignment (.*)' page$"""
  ) { (answer: String, houseConsignmentIndex: String) =>
    UnloadingFEHouseConsignmentAdditionalInformationPage
      .loadPage(houseConsignmentIndex)
      .fillInput(answer)
      .submitPage()
  }

  And("""^(?:I )?enter reference (.*) on the 'What is the additional reference number\?' page$""") { (answer: String) =>
    UnloadingFEAddNewConsignmentAdditionalReferenceNumberPage
      .loadPage()
      .fillInput(answer)
      .submitPage()
  }

  And(
    """^(?:I )?choose to click on the (.*) link on the 'You have added (.*) documen(?:t |ts )to all items' page$"""
  ) { (sectionLink: String, numberOfDocumentsAdded: String) =>
    UnloadingFEDocumentsAddAnotherDocumentsPage
      .loadPage(numberOfDocumentsAdded)
      .clickByPartialLinkText(sectionLink)
  }

  And(
    """^(?:I )?choose radio option (.*) on the documents 'Are you sure you want to remove this document from all items\?' page$"""
  ) { (answer: String) =>
    UnloadingFERemoveDocumentFromAllItemsPage
      .loadPage()
      .select(answer)
      .submitPage()
  }

  And(
    """^(?:I )?choose radio option (.*) on the documents 'Do you want to add the type of identification for the departure means of transport\?' page$"""
  ) { (answer: String) =>
    UnloadingFEDepMeansAddIdentificationTypeForDepartureMeansOfTransportPage
      .loadPage()
      .select(answer)
      .submitPage()
  }

  And(
    """^(?:I )?choose radio option (.*) on the 'Which identification do you want to use for the departure means of transport\?' page$"""
  ) { (answer: String) =>
    UnloadingFEDepMeansIdentificationForDepartureMeansOfTransportPage
      .loadPage()
      .select(answer)
      .submitPage()
  }

  And(
    """^(?:I )?choose radio option (.*) on the 'Which identification do you want to use for the departure means of transport in house consignment (.*)\?' page$"""
  ) { (answer: String, houseConsignmentIndex: String) =>
    UnloadingFEDepMeansHouseConsignmentIdentificationForDepartureMeansOfTransportPage
      .loadPage(houseConsignmentIndex)
      .select(answer)
      .submitPage()
  }

  And(
    """^(?:I )?select (.+) on the 'What type of additional reference do you want to add for item (.*) in house consignment 1\?' page$"""
  ) { (answer: String, itemIndex: String) =>
    UnloadingFEAdditionalReferenceHouseConsignmentItemTypePage
      .loadPage(itemIndex)
      .select(answer)
      .submitPage()
  }

  And(
    """^(?:I )?choose (.+) on the 'What type of additional reference do you want to add for house consignment (.*)\?' page$"""
  ) { (answer: String, itemIndex: String) =>
    UnloadingFEAdditionalReferenceHouseConsignmentTypePage
      .loadPage(itemIndex)
      .select(answer)
      .submitPage()
  }

  And(
    """^(?:I )?enter additional reference (.*) on the 'What is the additional reference number for item (.*) in house consignment 1\?' page$"""
  ) { (answer: String, itemIndex: String) =>
    UnloadingFEHouseConsignmentItemAddAdditionalReferenceNumberPage
      .loadPage(itemIndex)
      .fillInput(answer)
      .submitPage()
  }

  And(
    """^(?:I )?select (.+) on the 'What type of package are you using for item (.*) in house consignment 1\?' page$"""
  ) { (answer: String, itemIndex: String) =>
    UnloadingFEHouseConsignmentItemPackageTypePage
      .loadPage(itemIndex)
      .select(answer)
      .submitPage()
  }

  And("""^(?:I )?enter (.*) on the 'What is the shipping mark for item (.*) in house consignment 1\?' page$""") {
    (answer: String, itemIndex: String) =>
      UnloadingFEHouseConsignmentItemPackagesShippingMarkPage
        .loadPage(itemIndex)
        .fillInput(answer)
        .submitPage()
  }

  And(
    """^(?:I )?choose radio option (.*) on the documents 'Do you want to add an identification number for this vehicle\?' page$"""
  ) { (answer: String) =>
    UnloadingFEDepMeansAddIdentificationNumberForDepartureMeansOfTransportPage
      .loadPage()
      .select(answer)
      .submitPage()
  }

  And("""^(?:I )?enter identification number (.+) on 'What is the identification number for this vehicle\?' page$""") {
    (answer: String) =>
      UnloadingFEDepMeansIdentificationNumberForDepartureTransportMeansPage
        .loadPage()
        .fillInput(answer)
        .submitPage()
  }

  And(
    """^(?:I )?choose radio option (.*) on the documents 'Do you want to add the registered country for this vehicle\?' page$"""
  ) { (answer: String) =>
    UnloadingFEDepMeansAddRegisterCountryForDepartureMeansOfTransportPage
      .loadPage()
      .select(answer)
      .submitPage()
  }

  And("""^(?:I )?select (.+) on the 'What country is this vehicle registered to\?' page$""") { (answer: String) =>
    UnloadingFEDepMeansCountryTypeVehicleRegisteredPage
      .loadPage()
      .select(answer)
      .submitPage()
  }

  And(
    """^(?:I )?choose to click on the (.*) link on the 'You have added (.*) departure means of transport' page$"""
  ) { (sectionLink: String, numberOfDeparturesAdded: String) =>
    UnloadingFEDepMeansAddAnotherDepartureMeansOfTransportPage
      .loadPage(numberOfDeparturesAdded)
      .clickByPartialLinkText(sectionLink)
  }

  And(
    """^(?:I )?choose radio option (.*) on the documents 'Are you sure you want to remove departure means of transport (.+)\?' page$"""
  ) { (answer: String, removeCount: String) =>
    UnloadingFEDepMeansRemoveDepartureMeansOfTransportPage
      .loadPage(removeCount)
      .select(answer)
      .submitPage()
  }

  And("""^(?:I )?choose radio option (.*) on the 'You have added (.*) departure means of transport' page$""") {
    (answer: String, numberOfDocuments: String) =>
      UnloadingFEDepMeansAddAnotherDepartureMeansOfTransportPage
        .loadPage(numberOfDocuments)
        .select(answer)
        .submitPage()
  }

  // TransportEquipment

  And("""^(?:I )?enter identification number (.+) on 'What is the new container identification number\?' page$""") {
    (answer: String) =>
      UnloadingFENewContainerIdentificationNumberPage
        .loadPage()
        .fillInput(answer)
        .submitPage()
  }

  And("""^(?:I )?enter seal identification number (.+) on the 'What is the new seal identification number\?' page$""") {
    (answer: String) =>
      UnloadingFENewSealIdentificationNumberPage
        .loadPage()
        .fillInput(answer)
        .submitPage()
  }

  And("""^(?:I )?select (.+) on the 'Which item does this transport equipment apply to\?' page$""") {
    (answer: String) =>
      UnloadingFEItemTypeForTransportEquipmentPage
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
      PresentationNotificationTransportEquipmentIncrementPage
        .loadPage(numberOfTransportEquipmentItemsInTitle, numberOfTransportEquipmentIncrementsInTitle)
        .submitPage()
  }

  And("""^(?:I )?choose radio option (.*) on the cross check 'You have added (.*) transport equipment' page$""") {
    (answer: String, numberOfTransportEquipment: String) =>
      UnloadingFEAddAnotherForTransportEquipmentPage
        .loadPage(numberOfTransportEquipment)
        .select(answer)
        .submitPage()
  }

  And(
    """^(?:I )?choose radio option (.*) on the cross check 'Do you want to add a container identification number for the transport equipment\?' page$"""
  ) { (answer: String) =>
    UnloadingFEOptionToAddContainerIdentificationNumberPage
      .loadPage()
      .select(answer)
      .submitPage()
  }

  And("""^(?:I )?enter identification number (.+) on 'What is the container identification number\?' page$""") {
    (answer: String) =>
      UnloadingFEContainerIdentificationNumberforTransportEquipmentPage
        .loadPage()
        .fillInput(answer)
        .submitPage()
  }

  And(
    """^(?:I )?choose radio option (.*) on the cross check 'Do you want to add a seal for the transport equipment\?' page$"""
  ) { (answer: String) =>
    UnloadingFEOptionToAddSealPage
      .loadPage()
      .select(answer)
      .submitPage()
  }

  And("""^(?:I )?enter identification number (.+) on 'What is the seal identification number\?' page$""") {
    (answer: String) =>
      UnloadingFESealIdentificationNumberForTransportEquipmentPage
        .loadPage()
        .fillInput(answer)
        .submitPage()
  }

  And(
    """^(?:I )?click (.*) on 'You have added (.*) sea(?: l|ls )to transport equipment (.*)' page$"""
  ) {
    (
      answer: String,
      numberOfTransportEquipmentSealInTitle: String,
      numberOfTransportEquipmentIncrementsInTitle: String
    ) =>
      UnloadingFESealsIncrementPage
        .loadPage(numberOfTransportEquipmentSealInTitle, numberOfTransportEquipmentIncrementsInTitle)
        .clickByPartialLinkText(answer)
  }

  And(
    """^(?:I )?choose radio option (.*) on 'Are you sure you want to remove this seal from transport equipment (.*)\?' page$"""
  ) { (answer: String, numberOfTransportEquipmentIncrementsInTitle: String) =>
    UnloadingFERemoveSealFromTransportEquipmentPage
      .loadPage(numberOfTransportEquipmentIncrementsInTitle)
      .select(answer)
      .submitPage()
  }

  And(
    """^(?:I )?click radio option (.*) on the 'You have added (.*) sea(?: l|ls )to transport equipment (.*)' page$"""
  ) {
    (
      answer: String,
      numberOfTransportEquipmentSealInTitle: String,
      numberOfTransportEquipmentIncrementsInTitle: String
    ) =>
      UnloadingFESealsIncrementPage
        .loadPage(numberOfTransportEquipmentSealInTitle, numberOfTransportEquipmentIncrementsInTitle)
        .select(answer)
        .submitPage()
  }

  And(
    """^(?:I )?choose radio option (.*) on the cross check 'Do any items apply to this transport equipment\?' page$"""
  ) { (answer: String) =>
    UnloadingFEOptionToAddItemsApplyPage
      .loadPage()
      .select(answer)
      .submitPage()
  }

  And(
    """^(?:I )?click (.*) on 'You have applied (.*) item to transport equipment (.*)' page$"""
  ) {
    (
      answer: String,
      numberOfTransportEquipmentSealInTitle: String,
      numberOfTransportEquipmentIncrementsInTitle: String
    ) =>
      PresentationNotificationTransportEquipmentIncrementPage
        .loadPage(numberOfTransportEquipmentSealInTitle, numberOfTransportEquipmentIncrementsInTitle)
        .clickByPartialLinkText(answer)
  }

  And(
    """^(?:I )?choose radio option (.*) on the 'Are you sure you want to remove this item from transport equipment (.+)\?' page$"""
  ) { (answer: String, removeCount: String) =>
    UnloadingFERemoveItemFromTransportEquipmentPage
      .loadPage(removeCount)
      .select(answer)
      .submitPage()
  }

  And(
    """^(?:I )?choose to click on the (.*) link on the 'You have added (.*) transport equipment' page$"""
  ) { (sectionLink: String, numberOfTransportEquipAdded: String) =>
    UnloadingFEAddAnotherForTransportEquipmentPage
      .loadPage(numberOfTransportEquipAdded)
      .clickByPartialLinkText(sectionLink)
  }

  And(
    """^(?:I )?choose radio option (.*) on the documents 'Are you sure you want to remove transport equipment (.+)\?' page$"""
  ) { (answer: String, removeCount: String) =>
    UnloadingFERemoveTransportEquipmentFromCorssCheckPage
      .loadPage(removeCount)
      .select(answer)
      .submitPage()
  }

  And(
    """^(?:I )?click radio option (.*) on the 'You have applied (.*) ite(?: m|ms )to transport equipment (.*)' page$"""
  ) {
    (
      answer: String,
      numberOfTransportEquipmentItemInTitle: String,
      numberOfTransportEquipmentIncrementsInTitle: String
    ) =>
      PresentationNotificationTransportEquipmentIncrementPage
        .loadPage(numberOfTransportEquipmentItemInTitle, numberOfTransportEquipmentIncrementsInTitle)
        .select(answer)
        .submitPage()
  }

  And("""^(?:I )?enter number (.+) on 'What is the new gross weight of item (.+) in house consignment 1\?' page$""") {
    (answer: String, index: String) =>
      UnloadingFEChangeGrossWeightPage
        .loadPage(index)
        .fillInput(answer)
        .submitPage()
  }

  And("""^(?:I )?enter number (.+) on 'What is the gross weight of item (.+) in house consignment 1\?' page$""") {
    (answer: String, index: String) =>
      UnloadingFEEnterGrossWeightPage
        .loadPage(index)
        .fillInput(answer)
        .submitPage()
  }

  And(
    """^(?:I )?choose radio option (.*) on the 'Are you sure you want to remove the gross weight from item 1 in house consignment 1\?' page$"""
  ) { (answer: String) =>
    UnloadingFERemoveGrossWeightsPage
      .loadPage()
      .select(answer)
      .submitPage()
  }

  And("""^(?:I )?enter number (.+) on 'What is the new net weight of item (.+) in house consignment 1\?' page$""") {
    (answer: String, index: String) =>
      UnloadingFEChangeNetWeightPage
        .loadPage(index)
        .fillInput(answer)
        .submitPage()
  }

  And("""^(?:I )?enter number (.+) on 'What is the net weight of item (.+) in house consignment 1\?' page$""") {
    (answer: String, index: String) =>
      UnloadingFEEnterNetWeightPage
        .loadPage(index)
        .fillInput(answer)
        .submitPage()
  }

  And(
    """^(?:I )?choose radio option (.*) on the 'Are you sure you want to remove the net weight from item 1 in house consignment 1\?' page$"""
  ) { (answer: String) =>
    UnloadingFERemoveNetWeightsPage
      .loadPage()
      .select(answer)
      .submitPage()
  }

  And(
    """^(?:I )?enter number (.+) on 'What is the new Customs Union and Statistics CUS code for item (.+) in house consignment 1\?' page$"""
  ) { (answer: String, index: String) =>
    UnloadingFEChangeCUSCodePage
      .loadPage(index)
      .fillInput(answer)
      .submitPage()
  }

  And(
    """^(?:I )?enter number (.+) on 'What is the Customs Union and Statistics code for item (.+) in house consignment (.+)\?' page$"""
  ) { (answer: String, itemIndex: String, hcIndex: String) =>
    UnloadingFEEnterCUSCodePage
      .loadPage(itemIndex, hcIndex)
      .fillInput(answer)
      .submitPage()
  }

  And(
    """^(?:I )?enter number (.+) on 'What is the new commodity code for item (.+) in house consignment 1\?' page$"""
  ) { (answer: String, index: String) =>
    UnloadingFEChangeCommodityCodePage
      .loadPage(index)
      .fillInput(answer)
      .submitPage()
  }

  And(
    """^(?:I )?enter number (.+) on 'What is the commodity code for item (.+) in house consignment 1\?' page$"""
  ) { (answer: String, index: String) =>
    UnloadingFEEnterCommodityCodePage
      .loadPage(index)
      .fillInput(answer)
      .submitPage()
  }

  And(
    """^(?:I )?choose radio option (.*) on the 'Are you sure you want to remove the commodity code from item 1 in house consignment 1\?' page$"""
  ) { (answer: String) =>
    UnloadingFERemoveCommodityCodePage
      .loadPage()
      .select(answer)
      .submitPage()
  }

  And(
    """^(?:I )?enter number (.+) on 'What is the new combined nomenclature code for item (.+) in house consignment 1\?' page$"""
  ) { (answer: String, index: String) =>
    UnloadingFEChangeNomenclatureCodePage
      .loadPage(index)
      .fillInput(answer)
      .submitPage()
  }

  And(
    """^(?:I )?enter number (.+) on 'What is the combined nomenclature code for item (.+) in house consignment 1\?' page$"""
  ) { (answer: String, index: String) =>
    UnloadingFEEnterNomenclatureCodePage
      .loadPage(index)
      .fillInput(answer)
      .submitPage()
  }

  And(
    """^(?:I )?choose radio option (.*) on the 'Are you sure you want to remove the combined nomenclature code from item 1 in house consignment 1\?' page$"""
  ) { (answer: String) =>
    UnloadingFERemoveNomenclatureCodePage
      .loadPage()
      .select(answer)
      .submitPage()
  }

  And(
    """^(?:I )?click the (.+) link on house consignment for section (.+) (.+)$"""
  ) { (changeLinkText: String, section: String, index: String) =>
    UnloadingFEHouseConsignmentPage
      .loadPage(index)
      .selectItemSection(section)
      .clickLinkByIdBySection(changeLinkText)
  }

  And(
    """^(?:I )?click radio option (.*) on the 'You have added (.*) ite(?:m |ms )for house consignment (.*)' page$"""
  ) {
    (
      answer: String,
      numberOfItemInTitle: String,
      numberOfHouseConsignmentsInTitle: String
    ) =>
      UnloadingFEHouseConsignmentIncrementPage
        .loadPage(numberOfItemInTitle, numberOfHouseConsignmentsInTitle)
        .select(answer)
        .submitPage()
  }

  And(
    """^(?:I )?enter (.*) on the 'Enter the description of ite(?:m |ms )(.+) in house consignment (.*)' page$"""
  ) {
    (
      answer: String,
      numberOfItemInTitle: String,
      numberOfHouseConsignmentsInTitle: String
    ) =>
      UnloadingFEEnterItemDescriptionPage
        .loadPage(numberOfItemInTitle, numberOfHouseConsignmentsInTitle)
        .fillInput(answer)
        .submitPage()
  }

  And(
    """^(?:I )?choose radio option (.*) on the 'Do you want to add the item’s gross weight\?' page$"""
  ) { (answer: String) =>
    UnloadingFEOptionToAddItemGrossWeightPage
      .loadPage()
      .select(answer)
      .submitPage()
  }

  And(
    """^(?:I )?choose radio option (.*) on the 'Do you want to add the item’s net weight\?' page$"""
  ) { (answer: String) =>
    UnloadingFEOptionToAddItemNetWeightPage
      .loadPage()
      .select(answer)
      .submitPage()
  }

  And(
    """^(?:I )?choose radio option (.*) on the 'Do you want to add a Customs Union and Statistics (.*) code for the item\?' page$"""
  ) { (answer: String, index: String) =>
    UnloadingFEOptionToAddItemNewCusPage
      .loadPage(index)
      .select(answer)
      .submitPage()
  }

  And(
    """^(?:I )?choose radio option (.*) on the 'Do you want to add a commodity code for the item\?' page$"""
  ) { (answer: String) =>
    UnloadingFEOptionToAddItemCommodityCodePage
      .loadPage()
      .select(answer)
      .submitPage()
  }

  And(
    """^(?:I )?choose radio option (.*) on the 'Do you want to add a combined nomenclature code for the item\?' page$"""
  ) { (answer: String) =>
    UnloadingFEOptionToAddItemCombinedNomenclaturePage
      .loadPage()
      .select(answer)
      .submitPage()
  }

  And(
    """^(?:I )?choose radio option (.*) on the 'Do you want to add a document for the item\?' page$"""
  ) { (answer: String) =>
    UnloadingFEOptionToAddItemDocumentPage
      .loadPage()
      .select(answer)
      .submitPage()
  }

  And(
    """^(?:I )?choose radio option (.*) on the 'Do you want to add an additional reference for the item\?' page$"""
  ) { (answer: String) =>
    UnloadingFEOptionToAddItemAdditionalReferencePage
      .loadPage()
      .select(answer)
      .submitPage()
  }

  And(
    """^(?:I )?click (.*) on 'You have added (.*) documen(?: t|ts )to item (.+) in house consignment 1' page$"""
  ) {
    (
      answer: String,
      numberOfDocumentsTitle: String,
      numberOfItemsInTitle: String
    ) =>
      UnloadingFEHouseConsignmentDocumentIncrementPage
        .loadPage(numberOfDocumentsTitle, numberOfItemsInTitle)
        .clickByPartialLinkText(answer)
  }

  And(
    """^(?:I )?click radio option (.*) on the 'Are you sure you want to remove this document from item (.+) in house consignment 1\?' page$"""
  ) { (answer: String, numberOfItems: String) =>
    UnloadingFEHouseConsignmentDocumentRemoveIncrementPage
      .loadPage(numberOfItems)
      .select(answer)
      .submitPage()
  }

  And(
    """^(?:I )?click (.*) on house consignment document 'You have added (.*) documen(?:t |ts )to item (.+) in house consignment 1' page$"""
  ) {
    (
      answer: String,
      numberOfDocumentsTitle: String,
      numberOfItemsInTitle: String
    ) =>
      UnloadingFEHouseConsignmentDocumentIncrementPage
        .loadPage(numberOfDocumentsTitle, numberOfItemsInTitle)
        .select(answer)
        .submitPage()
  }

  And(
    """^(?:I )?click (.*) on additional reference 'You have added (.+) additional referenc(?:e |es)for item (.+) in house consignment 1' page$"""
  ) {
    (
      answer: String,
      numberOfAdditionalRefTitle: String,
      numberOfItemsInTitle: String
    ) =>
      UnloadingFEHouseConsignmentAdditionalRefIncrementPage
        .loadPage(numberOfAdditionalRefTitle, numberOfItemsInTitle)
        .select(answer)
        .submitPage()
  }

  And(
    """^(?:I )?click (.*) on the 'You have added (.+) additional referenc(?:e |es )for item (.+) in house consignment 1' page$"""
  ) {
    (
      answer: String,
      numberOfAdditionalRefTitle: String,
      numberOfItemsInTitle: String
    ) =>
      UnloadingFEHouseConsignmentAdditionalRefIncrementPage
        .loadPage(numberOfAdditionalRefTitle, numberOfItemsInTitle)
        .clickByPartialLinkText(answer)

  }

  And(
    """^(?:I )?choose radio option (.*) on the 'Do you want to add a package for the item\?' page$"""
  ) { (answer: String) =>
    UnloadingFEOptionToAddItemPackagePage
      .loadPage()
      .select(answer)
      .submitPage()
  }

  And(
    """^(?:I )?choose radio option (.*) on the 'Do you want to add the quantity of this package\?' page$"""
  ) { (answer: String) =>
    UnloadingFEOptionToAddItemPackageQuantityPage
      .loadPage()
      .select(answer)
      .submitPage()
  }

  And("""^(?:I )?enter (.*) on the 'How many of this package are you using\?' page$""") { (answer: String) =>
    PackagesTypeQuantityPage
      .loadPage()
      .fillInput(answer)
      .submitPage()
  }

  And(
    """^(?:I )?enter (.*) on the 'How many of this package are you using for item (.*) in house consignment 1\?' page$"""
  ) { (answer: String, itemIndex: String) =>
    UnloadingFEHouseConsignmentItemPackagesTypeQuantityPage
      .loadPage(itemIndex)
      .fillInput(answer)
      .submitPage()
  }

  And(
    """^(?:I )?click (.*) on house consignment package 'You have added (.*) typ(?:e |es )of packag(?:e |es )for item (.+) in house consignment 1' page$"""
  ) {
    (
      answer: String,
      numberOfTypesInTitle: String,
      numberOfPackagesInTitle: String
    ) =>
      UnloadingFEHouseConsignmentPackageIncrementPage
        .loadPage(numberOfTypesInTitle, numberOfPackagesInTitle)
        .select(answer)
        .submitPage()
  }

  And(
    """^(?:I )?click (.*) on the house consignment package 'You have added (.*) typ(?:e |es )of packag(?:e |es )for item (.+) in house consignment 1' page$"""
  ) {
    (
      answer: String,
      numberOfTypesInTitle: String,
      numberOfPackagesInTitle: String
    ) =>
      UnloadingFEHouseConsignmentPackageIncrementPage
        .loadPage(numberOfTypesInTitle, numberOfPackagesInTitle)
        .clickByPartialLinkText(answer)

  }

  And(
    """^(?:I )?click radio option (.*) on the 'Are you sure you want to remove this package from item (.+) in house consignment 1\?' page$"""
  ) { (answer: String, numberOfItems: String) =>
    UnloadingFEHouseConsignmentPackageRemoveIncrementPage
      .loadPage(numberOfItems)
      .select(answer)
      .submitPage()
  }

  And(
    """^(?:I )?click option (.*) on the 'You have added (.*) ite(?:m |ms )for house consignment (.*)' page$"""
  ) {
    (
      answer: String,
      numberOfItemInTitle: String,
      numberOfHouseConsignmentsInTitle: String
    ) =>
      UnloadingFEHouseConsignmentIncrementPage
        .loadPage(numberOfItemInTitle, numberOfHouseConsignmentsInTitle)
        .clickByPartialLinkText(answer)
  }

  And(
    """^(?:I )?click radio option (.*) on item 'Are you sure you want to remove item (.+) from house consignment 1\?' page$"""
  ) { (answer: String, numberOfItems: String) =>
    UnloadingFEHouseConsignmentRemoveItemPage
      .loadPage(numberOfItems)
      .select(answer)
      .submitPage()
  }

  And("""^(?:I )?choose radio option (.*) on the 'Do you have anything else to report\?' page$""") { (answer: String) =>
    UnloadingFEAnythingReportPage
      .loadPage()
      .select(answer)
      .submitPage()
  }

  And("""^(?:I )?enter (.+) on the 'What do you want to report\?' page$""") { (answer: String) =>
    UnloadingFEOtherThingsReportPage
      .loadPage()
      .fillInput(answer)
      .submitPage()
  }

  And("""^(?:I )?enter (.+) on the 'What is the identification number for the external seal\?' page$""") {
    (answer: String) =>
      UnloadingFEEnterOriginalSealsIdentificationCommentPage
        .loadPage()
        .fillInput(answer)
        .submitPage()
  }

  And("""^(?:I )?enter (.+) on the 'What is the identification number for the replacement external seal\?' page$""") {
    (answer: String) =>
      UnloadingFEEnterAllSealsIdentificationNumbersPage
        .loadPage()
        .fillInput(answer)
        .submitPage()
  }

  And("""^(?:I )?enter (.*) on the 'Enter your comments' page$""") { (answer: String) =>
    UnloadingFEEnterCommentsPage
      .loadPage()
      .fillInput(answer)
      .submitPage()
  }

  And("""^(?:I )?click radio option (.*) on the 'You have added (.*) house consignment' page$""") {
    (answer: String, numberOfHC: String) =>
      UnloadingFEHouseConsignmentAddAnotherHCPage
        .loadPage(numberOfHC)
        .select(answer)
        .submitPage()
  }

  And("""^(?:I )?enter number (.+) on 'What is the gross weight of House Consignment (.+)\?' page$""") {
    (answer: String, index: String) =>
      UnloadingFEEnterGrossWeightHCPage
        .loadPage(index)
        .fillInput(answer)
        .submitPage()
  }

  And(
    """^(?:I )?choose radio option (.*) on the 'Do you want to add a departure means of transport for house consignment (.*)\?' page$"""
  ) { (answer: String, HCNumber: String) =>
    UnloadingFEHouseConsignmentAddDepartureTransportMeansPage
      .loadPage(HCNumber)
      .select(answer)
      .submitPage()
  }

  And(
    """^(?:I )?choose radio option (.*) on the 'You have added (.*) departure means of transport for house consignment 2' page$"""
  ) { (answer: String, numberOfDepartureMeans: String) =>
    UnloadingFEAddAnotherDepartureMeansOfTransportHCPage
      .loadPage(numberOfDepartureMeans)
      .select(answer)
      .submitPage()
  }

  And(
    """^(?:I )?choose radio option (.*) on the 'Do you want to add any documents for house consignment (.*)\?' page$"""
  ) { (answer: String, HCNumber: String) =>
    UnloadingFEHouseConsignmentAddDocumentsPage
      .loadPage(HCNumber)
      .select(answer)
      .submitPage()
  }

  And(
    """^(?:I )?choose radio option (.*) on the 'You have added (.*) documen(?:t |ts )to all items in house consignment 2' page$"""
  ) { (answer: String, numberOfDocuments: String) =>
    UnloadingFEDocumentsAddAnotherDocumentsHCPage
      .loadPage(numberOfDocuments)
      .select(answer)
      .submitPage()
  }

  And(
    """^(?:I )?choose radio option (.*) on the 'Do you want to add an additional reference for house consignment (.*)\?' page$"""
  ) { (answer: String, HCNumber: String) =>
    UnloadingFEHouseConsignmentAddAdditionalReferencePage
      .loadPage(HCNumber)
      .select(answer)
      .submitPage()
  }

  And(
    """^(?:I )?click radio option (.*) on the 'You have added (.*) additional reference for house consignment 2' page$"""
  ) { (answer: String, numberOfReferences: String) =>
    UnloadingFEAdditionalReferenceAddAnotherHCPage
      .loadPage(numberOfReferences)
      .select(answer)
      .submitPage()
  }

  And("""^(?:I )?choose radio option (.*) on the 'Do you want to add an item for house consignment (.*)\?' page$""") {
    (answer: String, HCNumber: String) =>
      UnloadingFEHouseConsignmentAddItemPage
        .loadPage(HCNumber)
        .select(answer)
        .submitPage()
  }

  And(
    """^(?:I )?click the (.*) link on the 'You have added (.*) house consignments' page$"""
  ) { (sectionLink: String, numberOfHCAdded: String) =>
    UnloadingFEHouseConsignmentAddAnotherHCPage
      .loadPage(numberOfHCAdded)
      .clickByPartialLinkText(sectionLink)
  }

  And(
    """^(?:I )?click radio option (.*) on the 'Are you sure you want to remove house consignment (.+)\?' page$"""
  ) { (answer: String, hcNumber: String) =>
    UnloadingFEHouseConsignmentRemoveHCPage
      .loadPage(hcNumber)
      .select(answer)
      .submitPage()
  }

  And("""^(?:I )?select radio option (.*) on the 'You have added (.*) countr(?:y |ies )to the transit route' page$""") {
    (answer: String, numberOfCountries: String) =>
      UnloadingFECountryOfRoutingAddAnotherPage
        .loadPage(numberOfCountries)
        .select(answer)
        .submitPage()
  }

  And(
    """^(?:I )?click on the (.*) link on the 'You have added (.*) countr(?:y |ies )to the transit route' page$"""
  ) { (sectionLink: String, numberOfCountries: String) =>
    UnloadingFECountryOfRoutingAddAnotherPage
      .loadPage(numberOfCountries)
      .clickByPartialLinkText(sectionLink)
  }

  And("""^(?:I )?select (.+) on the Unloading 'Which country do you want to add to the transit route\?' page$""") {
    (answer: String) =>
      UnloadingFECountryOfRoutingCountryPage
        .loadPage()
        .select(answer)
        .submitPage()
  }

  And(
    """^(?:I )?select radio option (.*) on the 'Are you sure you want to remove this country from the transit route\?' page$"""
  ) { (answer: String) =>
    UnloadingFECountryOfRoutingRemoveCountryPage
      .loadPage()
      .select(answer)
      .submitPage()
  }

  And(
    """^(?:I )?choose radio option (.*) on the 'Do you want to add a Unique Consignment Reference for this house consignment\?' page$"""
  ) { (answer: String) =>
    UnloadingFEUCRForNewHouseConsignmentYesNoPage
      .loadPage()
      .select(answer)
      .submitPage()
  }

  And(
    """^(?:I )?enter (.+) on the 'What is the Unique Consignment Reference for house consignment (.+)\?' page$"""
  ) { (answer: String, houseConsignmentIndex: String) =>
    UnloadingFEUCRForNewHouseConsignmentPage
      .loadPage(houseConsignmentIndex)
      .fillInput(answer)
      .submitPage()
  }

  And(
    """^(?:I )?choose radio option (.*) on the 'Do you want to add a Unique Consignment Reference for this item\?' page$"""
  ) { (answer: String) =>
    UnloadingFEUCRForNewItemInHouseConsignmentYesNoPage
      .loadPage()
      .select(answer)
      .submitPage()
  }

  And(
    """^(?:I )?enter reference (.+) on the 'What is the Unique Consignment Reference for item (.+) in house consignment 1\?' page$"""
  ) { (answer: String, index: String) =>
    UnloadingFEUCRForNewItemInHouseConsignmentPage
      .loadPage(index)
      .fillInput(answer)
      .submitPage()
  }

}
