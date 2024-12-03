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

package uk.gov.hmrc.test.ui.cucumber.stepdefs.Departures.Items

import uk.gov.hmrc.test.ui.cucumber.stepdefs.BaseStepDef
import uk.gov.hmrc.test.ui.pages.Departures.AdditionalInformation.{AddAnotherPageAdditionalInformation, AddCommentAdditionalInformation, AddPageAdditionalInformation, EnterCommentAdditionalInformation, RemovePageAdditionalInformation}
import uk.gov.hmrc.test.ui.pages.Departures.AdditionalReference.{AddAnotherPageAdditionalReference, AddPageAdditionalReference, AdditionalReferenceAllItemsAddAnotherPage, AdditionalReferenceAllItemsRemovePage}
import uk.gov.hmrc.test.ui.pages.Departures.Items._
import uk.gov.hmrc.test.ui.pages.Departures.TraderDetails.Consignee.ConsigneeEoriNumberOrTinPage
import uk.gov.hmrc.test.ui.pages.Unloading.CrossCheckPagePages.AddNewConsignmentAdditionalReferenceNumberPage

class ItemDetailsStepDef extends BaseStepDef {

  And("""^(?:I )?enter (.*) on the 'Enter a description of item (.*)' page$""") {
    (answer: String, itemNumber: String) =>
      ItemDescriptionPage
        .loadPage(itemNumber)
        .fillInput(answer)
        .submitPage()
  }

  And("""^(?:I )?select (.+) on the 'Which transport equipment are you using for this item\?' page$""") {
    (answer: String) =>
      ItemTransportEquipmentPage
        .loadPage()
        .select(answer)
        .submitPage()
  }

  And(
    """^(?:I )?choose radio option (.*) on the 'Which type of declaration do you want to create for this item\?' page$"""
  ) { (answer: String) =>
    ItemDeclarationTypePage
      .loadPage()
      .select(answer)
      .submitPage()
  }

  And("""^(?:I )?select (.+) on the 'What is the item’s country of dispatch\?' page$""") { (answer: String) =>
    ItemCountryOfDispatchPage
      .loadPage()
      .select(answer)
      .submitPage()
  }

  And("""^(?:I )?select (.+) on the 'What is the item’s country of destination\?' page$""") { (answer: String) =>
    ItemCountryOfDestinationPage
      .loadPage()
      .select(answer)
      .submitPage()
  }

  And("""^(?:I )? choose radio option (.*) on the 'Do you want to add a Unique Consignment Reference\?' page$""") {
    (answer: String) =>
      AddItemUCRPage
        .loadPage()
        .select(answer)
        .submitPage()
  }

  And("""^(?:I )?enter (.*) on the 'What is the Unique Consignment Reference\?' page$""") { (answer: String) =>
    ItemUCRNumberPage
      .loadPage()
      .fillInput(answer)
      .submitPage()
  }

  And("""^(?:I )?click radio option (.*) on the 'Do you want to add a Customs Union and Statistics code\?' page$""") {
    (answer: String) =>
      AddCUSCodePage
        .loadPage()
        .select(answer)
        .submitPage()
  }

  And("""^(?:I )?enter (.*) on the 'What is the Customs Union and Statistics code\?' page$""") { (answer: String) =>
    CUSCodePage
      .loadPage()
      .fillInput(answer)
      .submitPage()
  }

  And("""^(?:I )?click radio option (.*) on the 'Do you want to add a commodity code\?' page$""") { (answer: String) =>
    AddCommodityCodePage
      .loadPage()
      .select(answer)
      .submitPage()
  }

  And("""^(?:I )?enter (.*) on the 'What is the commodity code\?' page$""") { (answer: String) =>
    CommodityCodePage
      .loadPage()
      .fillInput(answer)
      .submitPage()
  }

  And("""^(?:I )?click radio option (.*) on the 'Do you want to add a combined nomenclature code\?' page$""") {
    (answer: String) =>
      AddNomenclatureCodePage
        .loadPage()
        .select(answer)
        .submitPage()
  }

  And("""^(?:I )?enter (.*) on the 'What is the combined nomenclature code\?' page$""") { (answer: String) =>
    NomenclatureCodePage
      .loadPage()
      .fillInput(answer)
      .submitPage()
  }

  And("""^(?:I )?click radio option (.*) on the 'Does the item contain any dangerous goods\?' page$""") {
    (answer: String) =>
      AddDangerousGoodsPage
        .loadPage()
        .select(answer)
        .submitPage()
  }

  And("""^(?:I )?enter (.*) on the 'What is the UN number for the dangerous goods\?' page$""") { (answer: String) =>
    DangerousGoodsUnNumberPage
      .loadPage()
      .fillInput(answer)
      .submitPage()
  }

  And("""^(?:I )?click radio option (.*) on the 'You have added (.*) UN numbe(?:r |rs )for dangerous goods' page$""") {
    (answer: String, numberOfUnNumber: String) =>
      DangerousGoodsUnNumberAddAnotherPage
        .loadPage(numberOfUnNumber)
        .select(answer)
        .submitPage()
  }

  And("""^(?:I )?click the (.*) link on the 'You have added (.*) UN numbe(?:r |rs )for dangerous goods' page$""") {
    (sectionLink: String, numberOfUnNumber: String) =>
      DangerousGoodsUnNumberAddAnotherPage
        .loadPage(numberOfUnNumber)
        .clickByPartialLinkText(sectionLink)
  }

  And("""^(?:I )?click radio option (.*) on the 'Are you sure you want to remove this UN number\?' page$""") {
    (answer: String) =>
      RemoveDangerousGoodsPage
        .loadPage()
        .select(answer)
        .submitPage()
  }

  And("""^(?:I )?enter (.*) on the 'What is the item’s gross weight\?' page$""") { (answer: String) =>
    MeasurementGrossWeightPage
      .loadPage()
      .fillInput(answer)
      .submitPage()
  }

  And("""^(?:I )?click radio option (.*) on the 'Do you want to add the item’s net weight\?' page$""") {
    (answer: String) =>
      MeasurementAddNetWeightPage
        .loadPage()
        .select(answer)
        .submitPage()
  }

  And("""^(?:I )?enter (.*) on the 'What is the item’s net weight\?' page$""") { (answer: String) =>
    MeasurementNetWeightPage
      .loadPage()
      .fillInput(answer)
      .submitPage()
  }

  And("""^(?:I )?click radio option (.*) on the 'Do you want to add supplementary units\?' page$""") {
    (answer: String) =>
      MeasurementAddSupplementaryUnitsPage
        .loadPage()
        .select(answer)
        .submitPage()
  }

  And("""^(?:I )?enter (.*) on the 'How many supplementary units does the item include\?' page$""") {
    (answer: String) =>
      MeasurementSupplementaryUnitsPage
        .loadPage()
        .fillInput(answer)
        .submitPage()
  }

  And("""^(?:I )?select (.+) on the 'What type of package are you using for the item\?' page$""") { (answer: String) =>
    PackageTypePage
      .loadPage()
      .select(answer)
      .submitPage()
  }

  And("""^(?:I )?enter (.*) on the 'How many of these are you using\?' page$""") { (answer: String) =>
    PackagesTypeQuantityPage
      .loadPage()
      .fillInput(answer)
      .submitPage()
  }

  And("""^(?:I )?click continue on the 'Before you continue' page$""") {
    ErrorHintTextPage
      .loadPage()
      .submitPage()
  }

  And("""^(?:I )?click radio option (.*) on the 'Do you want to add a shipping mark\?' page$""") { (answer: String) =>
    PackagesAddShippingMarkPage
      .loadPage()
      .select(answer)
      .submitPage()
  }

  And("""^(?:I )?enter (.*) on the 'What is the shipping mark\?' page$""") { (answer: String) =>
    PackagesShippingMarkPage
      .loadPage()
      .fillInput(answer)
      .submitPage()
  }

  And("""^(?:I )?click radio option (.*) on the 'You have added (.*) typ(?:e |es )of package' page$""") {
    (answer: String, numberOfPackage: String) =>
      PackagesAddAnotherPage
        .loadPage(numberOfPackage)
        .select(answer)
        .submitPage()
  }

  And("""^(?:I )?click the (.*) link on the 'You have added (.*) typ(?:e |es )of packag(?:e |es)' page$""") {
    (sectionLink: String, numberOfPackage: String) =>
      PackagesAddAnotherPage
        .loadPage(numberOfPackage)
        .clickByPartialLinkText(sectionLink)
  }

  And(
    """^(?:I )?click radio option (.*) on the 'Are you sure you want to remove this package from the item\?' page$"""
  ) { (answer: String) =>
    RemovePackagePage
      .loadPage()
      .select(answer)
      .submitPage()
  }

  And("""^(?:I )?click radio option (.*) on the 'Do you want to add a supply chain actor for this item\?' page$""") {
    (answer: String) =>
      SupplyChainActorItemAddPage
        .loadPage()
        .select(answer)
        .submitPage()
  }

  And("""^(?:I )?click radio option (.*) on the 'Which type of supply chain actor do you want to add\?' item page$""") {
    (answer: String) =>
      SupplyChainActorTypeItemPage
        .loadPage()
        .select(answer)
        .submitPage()
  }

  And(
    """^(?:I )?enter (.*) on the 'What is the EORI number or Trader Identification Number TIN for the (.*)\?' item page$"""
  ) { (answer: String, typeVal: String) =>
    SupplyChainActorEoriTinItemPage
      .loadPage(typeVal)
      .fillInput(answer)
      .submitPage()
  }

  And(
    """^(?:I )?click radio option (.*) on the 'You have added (.*) supply chain actors? for this item' item page$"""
  ) { (answer: String, numberOfSCAs: String) =>
    SupplyChainActorItemAddAnotherPage
      .loadPage(numberOfSCAs)
      .select(answer)
      .submitPage()
  }

  And("""^(?:I )?click the (.*) link on the 'You have added (.*) supply chain actors? for this item' item page$""") {
    (sectionLink: String, numberOfSCAs: String) =>
      SupplyChainActorItemAddAnotherPage
        .loadPage(numberOfSCAs)
        .clickByPartialLinkText(sectionLink)
  }

  And(
    """^(?:I )?click radio option (.*) on the 'Are you sure you want to remove this supply chain actor\?' item page$"""
  ) { (answer: String) =>
    SupplyChainActorItemRemoveSCAPage
      .loadPage()
      .select(answer)
      .submitPage()
  }

  And("""^(?:I )?click radio option (.*) on the 'Do you want to attach any documents to this item\?' page$""") {
    (answer: String) =>
      DocumentsAddDocumentPage
        .loadPage()
        .select(answer)
        .submitPage()
  }

  And("""^(?:I )?select (.+) on the 'Which document do you want to attach\?' page$""") { (answer: String) =>
    DocumentsWhichDocumentPage
      .loadPage()
      .select(answer)
      .submitPage()
  }

  And("""^(?:I )?click radio option (.*) on the 'You have attached (.*) documents? to this item' page$""") {
    (answer: String, numberOfDocuments: String) =>
      DocumentsAddAnotherPage
        .loadPage(numberOfDocuments)
        .select(answer)
        .submitPage()
  }

  And("""^(?:I )?click the (.*) link on the 'You have attached (.*) documents? to this item' page$""") {
    (sectionLink: String, numberOfDocuments: String) =>
      DocumentsAddAnotherPage
        .loadPage(numberOfDocuments)
        .clickByPartialLinkText(sectionLink)
  }

  And(
    """^(?:I )?click radio option (.*) on the 'Are you sure you want to remove this document from the item\?' document page$"""
  ) { (answer: String) =>
    DocumentsRemoveDocumentPage
      .loadPage()
      .select(answer)
      .submitPage()
  }

  And("""^(?:I )?click radio option (.*) on the 'Do you want to add an additional reference for this item\?' page$""") {
    (answer: String) =>
      AdditionalReferenceAddPage
        .loadPage()
        .select(answer)
        .submitPage()
  }

  And("""^(?:I )?select (.+) on the 'What type of additional reference do you want to add\?' page$""") {
    (answer: String) =>
      AdditionalReferenceTypePage
        .loadPage()
        .select(answer)
        .submitPage()
  }

  And("""^(?:I )?click radio option (.*) on the 'Do you want to add an additional reference number\?' page$""") {
    (answer: String) =>
      AdditionalReferenceAddNumberPage
        .loadPage()
        .select(answer)
        .submitPage()
  }

  And("""^(?:I )?enter (.*) on the 'Enter the additional reference number' page$""") { (answer: String) =>
    AdditionalReferenceEnterNumberPage
      .loadPage()
      .fillInput(answer)
      .submitPage()
  }

  And("""^(?:I )?enter additional reference (.*) on the 'What is the additional reference number\?' page$""") {
    (answer: String) =>
      AddNewConsignmentAdditionalReferenceNumberPage
        .loadPage()
        .fillInput(answer)
        .submitPage()
  }

  And("""^(?:I )?click radio option (.*) on the 'You have added (.*) additional references?' page$""") {
    (answer: String, numberOfReferences: String) =>
      AdditionalReferenceAddAnotherPage
        .loadPage(numberOfReferences)
        .select(answer)
        .submitPage()
  }

  And("""^(?:I )?click the (.*) link on the 'You have added (.*) additional references?' page$""") {
    (sectionLink: String, numberOfReferences: String) =>
      AdditionalReferenceAddAnotherPage
        .loadPage(numberOfReferences)
        .clickByPartialLinkText(sectionLink)
  }

  And(
    """^(?:I )?click radio option (.*) on the 'Are you sure you want to remove this additional reference\?' page$"""
  ) { (answer: String) =>
    AdditionalReferenceRemovePage
      .loadPage()
      .select(answer)
      .submitPage()
  }

  And(
    """^(?:I )?click radio option (.*) on the 'Do you want to add any additional information for this item\?' page$"""
  ) { (answer: String) =>
    AdditionalInformationAddPage
      .loadPage()
      .select(answer)
      .submitPage()
  }

  And("""^(?:I )?select (.+) on the 'What type of additional information do you want to add\?' page$""") {
    (answer: String) =>
      AdditionalInformationTypePage
        .loadPage()
        .select(answer)
        .submitPage()
  }

  And("""^(?:I )?enter (.*) on the 'Enter the additional information' page$""") { (answer: String) =>
    AdditionalInformationEnterTextPage
      .loadPage()
      .fillInput(answer)
      .submitPage()
  }

  And("""^(?:I )?click radio option (.*) on the 'You have added (.*) additional information' page$""") {
    (answer: String, documentNumber: String) =>
      AdditionalInformationAddAnotherPage
        .loadPage(documentNumber)
        .select(answer)
        .submitPage()
  }

  And("""^(?:I )?click the (.*) link on the 'You have added (.*) additional information' page$""") {
    (sectionLink: String, numberOfDocuments: String) =>
      AdditionalInformationAddAnotherPage
        .loadPage(numberOfDocuments)
        .clickByPartialLinkText(sectionLink)
  }

  And(
    """^(?:I )?click radio option (.*) on the 'Are you sure you want to remove this additional information\?' page$"""
  ) { (answer: String) =>
    AdditionalInformationRemovePage
      .loadPage()
      .select(answer)
      .submitPage()
  }

  And(
    """^(?:I )?click radio option (.*) on the 'Do you want to add a method of payment for this item’s transport charges\?' page$"""
  ) { (answer: String) =>
    ItemTransportChargesAddPage
      .loadPage()
      .select(answer)
      .submitPage()
  }

  And(
    """^(?:I )?click radio option (.*) on the 'Which method of payment do you want to use for transport charges\?' page$"""
  ) { (answer: String) =>
    ItemTransportChargesPage
      .loadPage()
      .select(answer)
      .submitPage()
  }

  And("""^(?:I )?click the (.*) link on the 'You have added (.*) items?' page$""") {
    (sectionLink: String, numberOfItems: String) =>
      ItemsAddAnotherPage
        .loadPage(numberOfItems)
        .clickByPartialLinkText(sectionLink)
  }

  And("""^(?:I )?click radio option (.*) on the 'Are you sure you want to remove item (.*)\?' page$""") {
    (answer: String, itemNumber: String) =>
      RemoveItemPage
        .loadPage(itemNumber)
        .select(answer)
        .submitPage()
  }

  And("""^(?:I )?click radio option (.*) on the 'You have added (.*) item' page$""") {
    (answer: String, itemNumber: String) =>
      ItemsAddAnotherPage
        .loadPage(itemNumber)
        .select(answer)
        .submitPage()
  }

  And(
    """^(?:I )?click radio option (.*) on the 'Are you sure you want to remove this document from the item\?' page$"""
  ) { (answer: String) =>
    ConfirmRemoveDocumentFromItemPage
      .loadPage()
      .select(answer)
      .submitPage()
  }

  And("""^(?:I )?click radio option (.*) on the 'Which document do you want to attach\?' page$""") { (answer: String) =>
    ConfirmRemoveDocumentFromItemPage
      .loadPage()
      .select(answer)
      .submitPage()
  }

  And("""^(?:I )?click radio option (.*) on the 'Do you want to add any documents\?' page$""") { (answer: String) =>
    AddDocumentsPage
      .loadPage()
      .select(answer)
      .submitPage()
  }

  And(
    """^(?:I )?choose radio option (.*) on the 'Do you know the consignee EORI number or Trader Identification Number TIN for this item\?' page$"""
  ) { (answer: String) =>
    ItemsIsConsigneeEoriNumberOrTinKnownPage
      .loadPage()
      .select(answer)
      .submitPage()
  }

  And(
    """^(?:I )?enter (.*) on the consignee 'What is the consignee’s EORI number or Trader Identification Number TIN\?' page$"""
  ) { (answer: String) =>
    ConsigneeEoriNumberOrTinPage
      .loadPage()
      .fillInput(answer)
      .submitPage()
  }

  And("""^(?:I )? choose radio option (.*) on the 'Do you want to attach any documents to this item\?' page$""") {
    (answer: String) =>
      AddItemDocumentPage
        .loadPage()
        .select(answer)
        .submitPage()
  }

  And("""^(?:I )?click radio option (.*) on the 'Do you want to add an additional reference for all items\?' page$""") {
    (answer: String) =>
      AddPageAdditionalReference
        .loadPage()
        .select(answer)
        .submitPage()
  }

  And("""^(?:I )?click radio option (.*) on the 'You have added (.*) additional reference for all items' page$""") {
    (answer: String, numberOfReferences: String) =>
      AddAnotherPageAdditionalReference
        .loadPage(numberOfReferences)
        .select(answer)
        .submitPage()
  }

  And(
    """^(?:I )?click radio option (.*) on the 'Do you want to add any additional information for all items\?' page$"""
  ) { (answer: String) =>
    AddPageAdditionalInformation
      .loadPage()
      .select(answer)
      .submitPage()
  }

  And(
    """^(?:I )?click radio option (.*) on the 'Do you want to add any comments for the additional information\?' page$"""
  ) { (answer: String) =>
    AddCommentAdditionalInformation
      .loadPage()
      .select(answer)
      .submitPage()
  }

  And("""^(?:I )?enter (.+) on the 'Enter your comments for the additional information\' page$""") { (answer: String) =>
    EnterCommentAdditionalInformation
      .loadPage()
      .fillInput(answer)
      .submitPage()
  }

  And(
    """^(?:I )?choose to click on the (.*) link on the 'You have added (.*) additional information for all items' page$"""
  ) { (sectionLink: String, numberOfAdditionalInfoInTitle: String) =>
    AddAnotherPageAdditionalInformation
      .loadPage(numberOfAdditionalInfoInTitle)
      .clickByPartialLinkText(sectionLink)
  }

  And("""^(?:I )?click radio option (.*) on the 'You have added (.*) additional information for all items' page$""") {
    (answer: String, numberOfReferences: String) =>
      AddAnotherPageAdditionalInformation
        .loadPage(numberOfReferences)
        .select(answer)
        .submitPage()
  }

  And(
    """^(?:I )?click radio option (.*) on the 'Are you sure you want to remove this additional information from all items\?' page$"""
  ) { (answer: String) =>
    RemovePageAdditionalInformation
      .loadPage()
      .select(answer)
      .submitPage()
  }

  And("""^(?:I )?choose radio option (.*) on the 'You have added (.*) additional reference for all items' page$""") {
    (answer: String, numberOfContainers: String) =>
      AdditionalReferenceAllItemsAddAnotherPage
        .loadPage(numberOfContainers)
        .select(answer)
        .submitPage()
  }

  And("""^(?:I )?click the (.*) link on the 'You have added (.*) additional references for all items\?' page$""") {
    (sectionLink: String, numberOfReferences: String) =>
      AdditionalReferenceAllItemsAddAnotherPage
        .loadPage(numberOfReferences)
        .clickByPartialLinkText(sectionLink)
  }

  And(
    """^(?:I )?click radio option (.*) on the 'Are you sure you want to remove this additional reference from all items\?' page$"""
  ) { (answer: String) =>
    AdditionalReferenceAllItemsRemovePage
      .loadPage()
      .select(answer)
      .submitPage()
  }

  And(
    """^(?:I )?click the Go to your Documents section to add another document link on the 'You do not have any documents to attach' page$"""
  ) { () =>
    YouDoNotHaveDocumentsToAttachPage
      .loadPage()
      .clickById("documents")
  }

}
