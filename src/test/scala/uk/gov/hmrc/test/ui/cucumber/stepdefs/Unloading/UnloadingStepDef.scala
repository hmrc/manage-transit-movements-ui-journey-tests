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
import uk.gov.hmrc.test.ui.pages.Departures.Items.PackagesTypeQuantityPage
import uk.gov.hmrc.test.ui.pages.PresentationNotification.TransportEquipmentIncrementPage
import uk.gov.hmrc.test.ui.pages.Unloading.CrossCheckPagePages.DepartureMeansOfTransport.*
import uk.gov.hmrc.test.ui.pages.Unloading.CrossCheckPagePages.TransportEquipment.*
import uk.gov.hmrc.test.ui.pages.Unloading.CrossCheckPagePages.*
import uk.gov.hmrc.test.ui.pages.Unloading.*
import uk.gov.hmrc.test.ui.pages.Unloading.P6Pages.{UCRForNewHouseConsignmentPage, UCRForNewHouseConsignmentYesNoPage, UCRForNewItemInHouseConsignmentPage, UCRForNewItemInHouseConsignmentYesNoPage}

class UnloadingStepDef extends BaseStepDef {

  Then("""^(?:I )?should be on the 'Do you want to use the revised unloading procedure\?' page$""") { () =>
    IsRevisedUnloadingProcedurePage
      .loadPage()
  }

  Then(
    """^(?:I )?should be on the 'Enter the discrepancies between the transit movement and unloading permission' page$"""
  ) { () =>
    ConsignmentCrossCheckPage
      .loadPage()
  }

  Then("""^(?:I )?should be on the 'House consignment (.+)' page$""") { (houseConsignments: String) =>
    HouseConsignmentPage
      .loadPage(houseConsignments)
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

  And(
    """^(?:I )?click the Continue button on the 'Enter the discrepancies between the transit movement and unloading permission' page$"""
  ) { () =>
    ConsignmentCrossCheckPage
      .loadPage()
      .submitPage()
  }

  Given(
    """^(?:I )?click the 'More details' link for house consignment (.+) on the 'Enter the discrepancies between the transit movement and unloading permission' page$"""
  ) { (index: String) =>
    ConsignmentCrossCheckPage
      .loadPage()
      .selectAction(index)
  }

  Given(
    """^(?:I )?click the Back to summary button on the 'House consignment (.*)' page$"""
  ) { (houseConsignmentNumber: String) =>
    HouseConsignmentPage
      .loadPage(houseConsignmentNumber)
      .submitPage()
  }

  And(
    """^(?:I )?choose radio option (.*) on the 'Were there any discrepancies between the transit movement and unloading permission\?' page$"""
  ) { (answer: String) =>
    DifferencesPage
      .loadPage()
      .select(answer)
      .submitPage()
  }

  And(
    """^(?:I )?choose radio option (.*) on the 'Do you want to use the revised unloading procedure\?' page$"""
  ) { (answer: String) =>
    IsRevisedUnloadingProcedurePage
      .loadPage()
      .select(answer)
      .submitPage()
  }

  And(
    """^(?:I )?choose radio option (.*) on the 'Conditions for using the revised unloading procedure' page$"""
  ) { (answer: String) =>
    IsRevisedProcedureConditionPage
      .loadPage()
      .select(answer)
      .submitPage()
  }

  And(
    """^(?:I )?choose radio option (.*) on the 'Are the goods too large to fit into a container\?' page$"""
  ) { (answer: String) =>
    GoodsTooLargeToFitIntoContainerPage
      .loadPage()
      .select(answer)
      .submitPage()
  }

  And(
    """^(?:I )?choose radio option (.*) on the 'Has the external seal been replaced by a customs authority\?' page$"""
  ) { (answer: String) =>
    HaveSealsBeenReplacedByCustomsPage
      .loadPage()
      .select(answer)
      .submitPage()
  }

  And(
    """^(?:I )?click the Continue button on the 'Check the goods and note any discrepancies' page$"""
  ) { () =>
    CheckGoodsAndNoteDiscrepanciesPage
      .loadPage()
      .submitPage()
  }

  And(
    """^(?:I )?click the Continue button on the 'You cannot use the revised unloading procedure' page$"""
  ) { () =>
    RevisedUnloadingProcedurePage
      .loadPage()
      .submitPage()
  }

  And(
    """^(?:I )?click the Continue button on the 'Unload the goods and note any discrepancies' page$"""
  ) { () =>
    UnloadAndNoteDiscrepanciesPage
      .loadPage()
      .submitPage()
  }

  And(
    """^(?:I )?click the Continue button on the 'Download the unloading permission' page$"""
  ) { () =>
    DownloadUnloadingPermissionsPage
      .loadPage()
      .submitPage()
  }

  And(
    """^(?:I )?click the Continue button on the 'Take a photograph of the external seal before it is broken' page$"""
  ) { () =>
    TakeAPhotographOfSealPage
      .loadPage()
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

  Given(
    """^(?:I )?click the 'Documents' link for Documents (.+) on the 'Cross-check the transit with this declaration summary' page$"""
  ) { (index: String) =>
    ConsignmentCrossCheckPage
      .loadPage()
      .selectDocAction(index)
  }

  And(
    """^(?:I )?click the Change link for (.+) on the 'Cross-check the transit with this declaration summary' page$"""
  ) { (text: String) =>
    ConsignmentCrossCheckPage
      .clickLinkById(text)
  }

  And(
    """^(?:I )?click the (.+) link for section (.+) (.+)$"""
  ) { (changeLinkText: String, section: String, index: String) =>
    ConsignmentCrossCheckPage
      .loadPage()
      .selectSection(section)
      .selectSectionChild(section, index)
      .clickLinkByIdBySection(changeLinkText)
  }

  And(
    """^(?:I )?click the add or remove house consignment link$"""
  ) { () =>
    ConsignmentCrossCheckPage
      .loadPage()
      .selectAddRemoveHouseConsignment
  }

  And(
    """^(?:I )?click the add or remove countries of routing link$"""
  ) { () =>
    ConsignmentCrossCheckPage
      .loadPage()
      .selectAddRemoveCountriesOfRouting
  }

  And(
    """^(?:I )?click the (.+) link for (.+) in House consignment (.+)$"""
  ) { (changeLinkText: String, section: String, index: String) =>
    HouseConsignmentPage
      .loadPage(index)
      .selectSection(section)
      .selectItem(section)
      .clickLinkByIdBySection(changeLinkText)
  }

  And(
    """^(?:I )?click the Change (.+) link for sub-section (.+) of section (.+) (.+)$"""
  ) { (changeLinkText: String, subSection: String, section: String, index: String) =>
    ConsignmentCrossCheckPage
      .loadPage()
      .selectSection(section)
      .selectSectionChild(section, index)
      .selectSubSection(subSection)
      .clickLinkByIdBySection(changeLinkText)
  }

  And(
    """^(?:I )?click the (.+) link in House consignment (.+) sub-section (.+) of section (.+)$"""
  ) { (changeLinkText: String, index: String, subSection: String, section: String) =>
    HouseConsignmentPage
      .loadPage(index)
      .selectSection(section)
      .selectItem(section)
      .selectSectionChild(subSection)
      .selectSubSection(subSection)
      .clickLinkByIdBySection(changeLinkText)
  }

  And("""^(?:I )?select (.+) on the 'What is the new additional reference type\?' page$""") { (answer: String) =>
    NewAdditionalReferenceTypePage
      .loadPage()
      .select(answer)
      .submitPage()
  }

  And(
    """^(?:I )?select (.+) on the 'What is the new additional reference type for item 1 in house consignment 1\?' page$"""
  ) { (answer: String) =>
    NewItemLevelAdditionalReferenceTypePage
      .loadPage()
      .select(answer)
      .submitPage()
  }

  And("""^(?:I )?enter additional reference (.+) on the 'What is the new additional reference number\?' page$""") {
    (answer: String) =>
      NewAdditionalReferenceNumberPage
        .loadPage()
        .fillInput(answer)
        .submitPage()
  }

  And(
    """^(?:I )?enter additional reference (.+) on the 'What is the new additional reference number for item 1 in house consignment 1\?' page$"""
  ) { (answer: String) =>
    NewItemLevelAdditionalReferenceNumberPage
      .loadPage()
      .fillInput(answer)
      .submitPage()
  }

  And(
    """^(?:I )?select (.+) on the 'What is the new package type for item 1 in house consignment 1\?' page$"""
  ) { (answer: String) =>
    NewItemLevelPackageTypePage
      .loadPage()
      .select(answer)
      .submitPage()
  }

  And(
    """^(?:I )?enter quantity (.+) on the 'How many of this package are you using for item (.+) in house consignment 1\?' page$"""
  ) { (answer: String, index: String) =>
    ChangePackageQuantityPage
      .loadPage(index)
      .fillInput(answer)
      .submitPage()
  }

  And(
    """^(?:I )?enter shipping mark (.+) on the 'What is the new shipping mark for item 1 in house consignment 1\?' page$"""
  ) { (answer: String) =>
    NewItemLevelPackageShippingMarkPage
      .loadPage()
      .fillInput(answer)
      .submitPage()
  }

  And("""^(?:I )?select (.+) on the 'What is the new document type\?' page$""") { (answer: String) =>
    NewDocumentTypePage
      .loadPage()
      .select(answer)
      .submitPage()
  }

  And("""^(?:I )?enter reference number (.+) on the 'What is the document’s new reference number\?' page$""") {
    (answer: String) =>
      DocumentsNewReferenceNumberPage
        .loadPage()
        .fillInput(answer)
        .submitPage()
  }

  And("""^(?:I )?enter additional information (.+) on the 'Enter the new additional information\?' page$""") {
    (answer: String) =>
      NewAdditionalInformationPage
        .loadPage()
        .fillInput(answer)
        .submitPage()
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
    """^(?:I )?enter identification number (.+) on the 'What is the identification number for the new departure means of transport\?' page$"""
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

  // TransportEquipment

  And("""^(?:I )?enter identification number (.+) on 'What is the new container identification number\?' page$""") {
    (answer: String) =>
      NewContainerIdentificationNumberPage
        .loadPage()
        .fillInput(answer)
        .submitPage()
  }

  And("""^(?:I )?enter seal identification number (.+) on the 'What is the new seal identification number\?' page$""") {
    (answer: String) =>
      NewSealIdentificationNumberPage
        .loadPage()
        .fillInput(answer)
        .submitPage()
  }

  And("""^(?:I )?select (.+) on the 'Which item does this transport equipment apply to\?' page$""") {
    (answer: String) =>
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

  And(
    """^(?:I )?choose radio option (.*) on the cross check 'Do you want to add a container identification number for the transport equipment\?' page$"""
  ) { (answer: String) =>
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

  And(
    """^(?:I )?choose radio option (.*) on the cross check 'Do you want to add a seal for the transport equipment\?' page$"""
  ) { (answer: String) =>
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
    (
      answer: String,
      numberOfTransportEquipmentSealInTitle: String,
      numberOfTransportEquipmentIncrementsInTitle: String
    ) =>
      SealsIncrementPage
        .loadPage(numberOfTransportEquipmentSealInTitle, numberOfTransportEquipmentIncrementsInTitle)
        .clickByPartialLinkText(answer)
  }

  And(
    """^(?:I )?choose radio option (.*) on 'Are you sure you want to remove this seal from transport equipment (.*)\?' page$"""
  ) { (answer: String, numberOfTransportEquipmentIncrementsInTitle: String) =>
    RemoveSealFromTransportEquipmentPage
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
      SealsIncrementPage
        .loadPage(numberOfTransportEquipmentSealInTitle, numberOfTransportEquipmentIncrementsInTitle)
        .select(answer)
        .submitPage()
  }

  And(
    """^(?:I )?choose radio option (.*) on the cross check 'Do any items apply to this transport equipment\?' page$"""
  ) { (answer: String) =>
    OptionToAddItemsApplyPage
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

  And(
    """^(?:I )?click radio option (.*) on the 'You have applied (.*) ite(?: m|ms )to transport equipment (.*)' page$"""
  ) {
    (
      answer: String,
      numberOfTransportEquipmentItemInTitle: String,
      numberOfTransportEquipmentIncrementsInTitle: String
    ) =>
      TransportEquipmentIncrementPage
        .loadPage(numberOfTransportEquipmentItemInTitle, numberOfTransportEquipmentIncrementsInTitle)
        .select(answer)
        .submitPage()
  }

  And("""^(?:I )?enter number (.+) on 'What is the new gross weight of item (.+) in house consignment 1\?' page$""") {
    (answer: String, index: String) =>
      ChangeGrossWeightPage
        .loadPage(index)
        .fillInput(answer)
        .submitPage()
  }

  And("""^(?:I )?enter number (.+) on 'What is the gross weight of item (.+) in house consignment 1\?' page$""") {
    (answer: String, index: String) =>
      EnterGrossWeightPage
        .loadPage(index)
        .fillInput(answer)
        .submitPage()
  }

  And(
    """^(?:I )?choose radio option (.*) on the 'Are you sure you want to remove the gross weight from item 1 in house consignment 1\?' page$"""
  ) { (answer: String) =>
    RemoveGrossWeightsPage
      .loadPage()
      .select(answer)
      .submitPage()
  }

  And("""^(?:I )?enter number (.+) on 'What is the new net weight of item (.+) in house consignment 1\?' page$""") {
    (answer: String, index: String) =>
      ChangeNetWeightPage
        .loadPage(index)
        .fillInput(answer)
        .submitPage()
  }

  And("""^(?:I )?enter number (.+) on 'What is the net weight of item (.+) in house consignment 1\?' page$""") {
    (answer: String, index: String) =>
      EnterNetWeightPage
        .loadPage(index)
        .fillInput(answer)
        .submitPage()
  }

  And(
    """^(?:I )?choose radio option (.*) on the 'Are you sure you want to remove the net weight from item 1 in house consignment 1\?' page$"""
  ) { (answer: String) =>
    RemoveNetWeightsPage
      .loadPage()
      .select(answer)
      .submitPage()
  }

  And(
    """^(?:I )?enter number (.+) on 'What is the new Customs Union and Statistics CUS code for item (.+) in house consignment 1\?' page$"""
  ) { (answer: String, index: String) =>
    ChangeCUSCodePage
      .loadPage(index)
      .fillInput(answer)
      .submitPage()
  }

  And(
    """^(?:I )?enter number (.+) on 'What is the Customs Union and Statistics CUS code\?' page$"""
  ) { (answer: String) =>
    EnterCUSCodePage
      .loadPage()
      .fillInput(answer)
      .submitPage()
  }

  And(
    """^(?:I )?enter number (.+) on 'What is the new commodity code for item (.+) in house consignment 1\?' page$"""
  ) { (answer: String, index: String) =>
    ChangeCommodityCodePage
      .loadPage(index)
      .fillInput(answer)
      .submitPage()
  }

  And(
    """^(?:I )?enter number (.+) on 'What is the commodity code for item (.+) in house consignment 1\?' page$"""
  ) { (answer: String, index: String) =>
    EnterCommodityCodePage
      .loadPage(index)
      .fillInput(answer)
      .submitPage()
  }

  And(
    """^(?:I )?choose radio option (.*) on the 'Are you sure you want to remove the commodity code from item 1 in house consignment 1\?' page$"""
  ) { (answer: String) =>
    RemoveCommodityCodePage
      .loadPage()
      .select(answer)
      .submitPage()
  }

  And(
    """^(?:I )?enter number (.+) on 'What is the new combined nomenclature code for item (.+) in house consignment 1\?' page$"""
  ) { (answer: String, index: String) =>
    ChangeNomenclatureCodePage
      .loadPage(index)
      .fillInput(answer)
      .submitPage()
  }

  And(
    """^(?:I )?enter number (.+) on 'What is the combined nomenclature code for item (.+) in house consignment 1\?' page$"""
  ) { (answer: String, index: String) =>
    EnterNomenclatureCodePage
      .loadPage(index)
      .fillInput(answer)
      .submitPage()
  }

  And(
    """^(?:I )?choose radio option (.*) on the 'Are you sure you want to remove the combined nomenclature code from item 1 in house consignment 1\?' page$"""
  ) { (answer: String) =>
    RemoveNomenclatureCodePage
      .loadPage()
      .select(answer)
      .submitPage()
  }

  And(
    """^(?:I )?click the (.+) link on house consignment for section (.+) (.+)$"""
  ) { (changeLinkText: String, section: String, index: String) =>
    HouseConsignmentPage
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
      HouseConsignmentIncrementPage
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
      EnterItemDescriptionPage
        .loadPage(numberOfItemInTitle, numberOfHouseConsignmentsInTitle)
        .fillInput(answer)
        .submitPage()
  }

  And(
    """^(?:I )?choose radio option (.*) on the 'Do you want to add the item’s gross weight\?' page$"""
  ) { (answer: String) =>
    OptionToAddItemGrossWeightPage
      .loadPage()
      .select(answer)
      .submitPage()
  }

  And(
    """^(?:I )?choose radio option (.*) on the 'Do you want to add the item’s net weight\?' page$"""
  ) { (answer: String) =>
    OptionToAddItemNetWeightPage
      .loadPage()
      .select(answer)
      .submitPage()
  }

  And(
    """^(?:I )?choose radio option (.*) on the 'Do you want to add a Customs Union and Statistics (.*) code for the item\?' page$"""
  ) { (answer: String, index: String) =>
    OptionToAddItemNewCusPage
      .loadPage(index)
      .select(answer)
      .submitPage()
  }

  And(
    """^(?:I )?choose radio option (.*) on the 'Do you want to add a commodity code for the item\?' page$"""
  ) { (answer: String) =>
    OptionToAddItemCommodityCodePage
      .loadPage()
      .select(answer)
      .submitPage()
  }

  And(
    """^(?:I )?choose radio option (.*) on the 'Do you want to add a combined nomenclature code for the item\?' page$"""
  ) { (answer: String) =>
    OptionToAddItemCombinedNomenclaturePage
      .loadPage()
      .select(answer)
      .submitPage()
  }

  And(
    """^(?:I )?choose radio option (.*) on the 'Do you want to add a document for the item\?' page$"""
  ) { (answer: String) =>
    OptionToAddItemDocumentPage
      .loadPage()
      .select(answer)
      .submitPage()
  }

  And(
    """^(?:I )?choose radio option (.*) on the 'Do you want to add an additional reference for the item\?' page$"""
  ) { (answer: String) =>
    OptionToAddItemAdditionalReferencePage
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
      HouseConsignmentDocumentIncrementPage
        .loadPage(numberOfDocumentsTitle, numberOfItemsInTitle)
        .clickByPartialLinkText(answer)
  }

  And(
    """^(?:I )?click radio option (.*) on the 'Are you sure you want to remove this document from item (.+) in house consignment 1\?' page$"""
  ) { (answer: String, numberOfItems: String) =>
    HouseConsignmentDocumentRemoveIncrementPage
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
      HouseConsignmentDocumentIncrementPage
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
      HouseConsignmentAdditionalRefIncrementPage
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
      HouseConsignmentAdditionalRefIncrementPage
        .loadPage(numberOfAdditionalRefTitle, numberOfItemsInTitle)
        .clickByPartialLinkText(answer)

  }

  And(
    """^(?:I )?choose radio option (.*) on the 'Do you want to add a package for the item\?' page$"""
  ) { (answer: String) =>
    OptionToAddItemPackagePage
      .loadPage()
      .select(answer)
      .submitPage()
  }

  And(
    """^(?:I )?choose radio option (.*) on the 'Do you want to add the quantity of this package\?' page$"""
  ) { (answer: String) =>
    OptionToAddItemPackageQuantityPage
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
    """^(?:I )?click (.*) on house consignment package 'You have added (.*) typ(?:e |es )of packag(?:e |es )for item (.+) in house consignment 1' page$"""
  ) {
    (
      answer: String,
      numberOfTypesInTitle: String,
      numberOfPackagesInTitle: String
    ) =>
      HouseConsignmentPackageIncrementPage
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
      HouseConsignmentPackageIncrementPage
        .loadPage(numberOfTypesInTitle, numberOfPackagesInTitle)
        .clickByPartialLinkText(answer)

  }

  And(
    """^(?:I )?click radio option (.*) on the 'Are you sure you want to remove this package from item (.+) in house consignment 1\?' page$"""
  ) { (answer: String, numberOfItems: String) =>
    HouseConsignmentPackageRemoveIncrementPage
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
      HouseConsignmentIncrementPage
        .loadPage(numberOfItemInTitle, numberOfHouseConsignmentsInTitle)
        .clickByPartialLinkText(answer)
  }

  And(
    """^(?:I )?click radio option (.*) on item 'Are you sure you want to remove item (.+) from house consignment 1\?' page$"""
  ) { (answer: String, numberOfItems: String) =>
    HouseConsignmentRemoveItemPage
      .loadPage(numberOfItems)
      .select(answer)
      .submitPage()
  }

  And("""^(?:I )?choose radio option (.*) on the 'Do you have anything else to report\?' page$""") { (answer: String) =>
    AnythingReportPage
      .loadPage()
      .select(answer)
      .submitPage()
  }

  And("""^(?:I )?enter (.+) on the 'What do you want to report\?' page$""") { (answer: String) =>
    OtherThingsReportPage
      .loadPage()
      .fillInput(answer)
      .submitPage()
  }

  And("""^(?:I )?enter (.+) on the 'What is the identification number for the external seal\?' page$""") {
    (answer: String) =>
      EnterOriginalSealsIdentificationCommentPage
        .loadPage()
        .fillInput(answer)
        .submitPage()
  }

  And("""^(?:I )?enter (.+) on the 'What is the identification number for the replacement external seal\?' page$""") {
    (answer: String) =>
      EnterAllSealsIdentificationNumbersPage
        .loadPage()
        .fillInput(answer)
        .submitPage()
  }

  And("""^(?:I )?enter (.*) on the 'Enter your comments' page$""") { (answer: String) =>
    EnterCommentsPage
      .loadPage()
      .fillInput(answer)
      .submitPage()
  }

  And("""^(?:I )?click radio option (.*) on the 'You have added (.*) house consignment' page$""") {
    (answer: String, numberOfHC: String) =>
      HouseConsignmentAddAnotherHCPage
        .loadPage(numberOfHC)
        .select(answer)
        .submitPage()
  }

  And("""^(?:I )?enter number (.+) on 'What is the gross weight of House Consignment (.+)\?' page$""") {
    (answer: String, index: String) =>
      EnterGrossWeightHCPage
        .loadPage(index)
        .fillInput(answer)
        .submitPage()
  }

  And(
    """^(?:I )?choose radio option (.*) on the 'Do you want to add a departure means of transport for house consignment (.*)\?' page$"""
  ) { (answer: String, HCNumber: String) =>
    HouseConsignmentAddDepartureTransportMeansPage
      .loadPage(HCNumber)
      .select(answer)
      .submitPage()
  }

  And(
    """^(?:I )?choose radio option (.*) on the 'You have added (.*) departure means of transport for house consignment 2' page$"""
  ) { (answer: String, numberOfDepartureMeans: String) =>
    AddAnotherDepartureMeansOfTransportHCPage
      .loadPage(numberOfDepartureMeans)
      .select(answer)
      .submitPage()
  }

  And(
    """^(?:I )?choose radio option (.*) on the 'Do you want to add any documents for house consignment (.*)\?' page$"""
  ) { (answer: String, HCNumber: String) =>
    HouseConsignmentAddDocumentsPage
      .loadPage(HCNumber)
      .select(answer)
      .submitPage()
  }

  And(
    """^(?:I )?choose radio option (.*) on the 'You have added (.*) documen(?:t |ts )to all items in house consignment 2' page$"""
  ) { (answer: String, numberOfDocuments: String) =>
    DocumentsAddAnotherDocumentsHCPage
      .loadPage(numberOfDocuments)
      .select(answer)
      .submitPage()
  }

  And(
    """^(?:I )?choose radio option (.*) on the 'Do you want to add an additional reference for house consignment (.*)\?' page$"""
  ) { (answer: String, HCNumber: String) =>
    HouseConsignmentAddAdditionalReferencePage
      .loadPage(HCNumber)
      .select(answer)
      .submitPage()
  }

  And(
    """^(?:I )?click radio option (.*) on the 'You have added (.*) additional reference for house consignment 2' page$"""
  ) { (answer: String, numberOfReferences: String) =>
    AdditionalReferenceAddAnotherHCPage
      .loadPage(numberOfReferences)
      .select(answer)
      .submitPage()
  }

  And("""^(?:I )?choose radio option (.*) on the 'Do you want to add an item for house consignment (.*)\?' page$""") {
    (answer: String, HCNumber: String) =>
      HouseConsignmentAddItemPage
        .loadPage(HCNumber)
        .select(answer)
        .submitPage()
  }

  And(
    """^(?:I )?click the (.*) link on the 'You have added (.*) house consignments' page$"""
  ) { (sectionLink: String, numberOfHCAdded: String) =>
    HouseConsignmentAddAnotherHCPage
      .loadPage(numberOfHCAdded)
      .clickByPartialLinkText(sectionLink)
  }

  And(
    """^(?:I )?click radio option (.*) on the 'Are you sure you want to remove house consignment (.+)\?' page$"""
  ) { (answer: String, hcNumber: String) =>
    HouseConsignmentRemoveHCPage
      .loadPage(hcNumber)
      .select(answer)
      .submitPage()
  }

  And("""^(?:I )?select radio option (.*) on the 'You have added (.*) countr(?:y |ies )to the transit route' page$""") {
    (answer: String, numberOfCountries: String) =>
      CountryOfRoutingAddAnotherPage
        .loadPage(numberOfCountries)
        .select(answer)
        .submitPage()
  }

  And(
    """^(?:I )?click on the (.*) link on the 'You have added (.*) countr(?:y |ies )to the transit route' page$"""
  ) { (sectionLink: String, numberOfCountries: String) =>
    CountryOfRoutingAddAnotherPage
      .loadPage(numberOfCountries)
      .clickByPartialLinkText(sectionLink)
  }

  And("""^(?:I )?select (.+) on the Unloading 'Which country do you want to add to the transit route\?' page$""") {
    (answer: String) =>
      CountryOfRoutingCountryPage
        .loadPage()
        .select(answer)
        .submitPage()
  }

  And(
    """^(?:I )?select radio option (.*) on the 'Are you sure you want to remove this country from the transit route\?' page$"""
  ) { (answer: String) =>
    CountryOfRoutingRemoveCountryPage
      .loadPage()
      .select(answer)
      .submitPage()
  }

  And(
    """^(?:I )?choose radio option (.*) on the 'Do you want to add a Unique Consignment Reference for this house consignment\?' page$"""
  ) { (answer: String) =>
    UCRForNewHouseConsignmentYesNoPage
      .loadPage()
      .select(answer)
      .submitPage()
  }

  And(
    """^(?:I )?enter (.+) on the 'What is the Unique Consignment Reference for house consignment (.+)\?' page$"""
  ) { (answer: String, houseConsignmentIndex: String) =>
    UCRForNewHouseConsignmentPage
      .loadPage(houseConsignmentIndex)
      .fillInput(answer)
      .submitPage()
  }

  And(
    """^(?:I )?choose radio option (.*) on the 'Do you want to add a Unique Consignment Reference for this item\?' page$"""
  ) { (answer: String) =>
    UCRForNewItemInHouseConsignmentYesNoPage
      .loadPage()
      .select(answer)
      .submitPage()
  }

  And(
    """^(?:I )?enter reference (.+) on the 'What is the Unique Consignment Reference for item (.+) in house consignment 1\?' page$"""
  ) { (answer: String, index: String) =>
    UCRForNewItemInHouseConsignmentPage
      .loadPage(index)
      .fillInput(answer)
      .submitPage()
  }

}
