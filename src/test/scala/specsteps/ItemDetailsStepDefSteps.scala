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

package specsteps

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

import specpage.Departures.AdditionalInformation.*
import specpage.Departures.AdditionalReference.*
import specpage.Departures.Items.*
import specpage.UnloadingFEAddNewConsignmentAdditionalReferenceNumberPage

object ItemDetailsStepDefSteps {

  // ^(?:I )?enter (.*) on the 'Enter a description of item (.*)' page$
  def andIenterXOnTheEnterADescriptionOfItemXPage(answer: String, itemNumber: String): Unit =
    ItemDescriptionPage
      .loadPage(itemNumber)
      .fillInput(answer)
      .submitPage()

  // ^(?:I )?select (.+) on the 'Which transport equipment are you using for this item\?' page$
  def andIselectOnTheWhichTransportEquipmentAreYouUsingForThisItemPage(answer: String): Unit =
    ItemTransportEquipmentPage
      .loadPage()
      .select(answer)
      .submitPage()

  // ^(?:I )?choose radio option (.*) on the 'Which type of declaration do you want to create for this item\?' page$
  def andIchooseRadioOptionXOnTheWhichTypeOfDeclarationDoYouWantToCreateForThisItemPage(answer: String): Unit =
    ItemDeclarationTypePage
      .loadPage()
      .select(answer)
      .submitPage()

  // ^(?:I )?select (.+) on the 'What is the item’s country of dispatch\?' page$
  def andIselectOnTheWhatIsTheItemsCountryOfDispatchPage(answer: String): Unit =
    ItemCountryOfDispatchPage
      .loadPage()
      .select(answer)
      .submitPage()

  // ^(?:I )?select (.+) on the 'What is the item’s country of destination\?' page$
  def andIselectOnTheWhatIsTheItemsCountryOfDestinationPage(answer: String): Unit =
    ItemCountryOfDestinationPage
      .loadPage()
      .select(answer)
      .submitPage()

  // ^(?:I )? choose radio option (.*) on the 'Do you want to add a Unique Consignment Reference\?' page$
  def andIChooseRadioOptionXOnTheDoYouWantToAddAUniqueConsignmentReferencePage(answer: String): Unit =
    AddItemUCRPage
      .loadPage()
      .select(answer)
      .submitPage()

  // ^(?:I )?enter (.*) on the 'What is the Unique Consignment Reference\?' page$
  def andIenterXOnTheWhatIsTheUniqueConsignmentReferencePage(answer: String): Unit =
    ItemUCRNumberPage
      .loadPage()
      .fillInput(answer)
      .submitPage()

  // ^(?:I )?click radio option (.*) on the 'Do you want to add a Customs Union and Statistics code\?' page$
  def andIclickRadioOptionXOnTheDoYouWantToAddACustomsUnionAndStatisticsCodePage(answer: String): Unit =
    AddCUSCodePage
      .loadPage()
      .select(answer)
      .submitPage()

  // ^(?:I )?enter (.*) on the 'What is the Customs Union and Statistics code\?' page$
  def andIenterXOnTheWhatIsTheCustomsUnionAndStatisticsCodePage(answer: String): Unit =
    CUSCodePage
      .loadPage()
      .fillInput(answer)
      .submitPage()

  // ^(?:I )?click radio option (.*) on the 'Do you want to add a commodity code\?' page$
  def andIclickRadioOptionXOnTheDoYouWantToAddACommodityCodePage(answer: String): Unit =
    AddCommodityCodePage
      .loadPage()
      .select(answer)
      .submitPage()

  // ^(?:I )?enter (.*) on the 'What is the commodity code\?' page$
  def andIenterXOnTheWhatIsTheCommodityCodePage(answer: String): Unit =
    CommodityCodePage
      .loadPage()
      .fillInput(answer)
      .submitPage()

  // ^(?:I )?click radio option (.*) on the 'Do you want to add a combined nomenclature code\?' page$
  def andIclickRadioOptionXOnTheDoYouWantToAddACombinedNomenclatureCodePage(answer: String): Unit =
    AddNomenclatureCodePage
      .loadPage()
      .select(answer)
      .submitPage()

  // ^(?:I )?enter (.*) on the 'What is the combined nomenclature code\?' page$
  def andIenterXOnTheWhatIsTheCombinedNomenclatureCodePage(answer: String): Unit =
    NomenclatureCodePage
      .loadPage()
      .fillInput(answer)
      .submitPage()

  // ^(?:I )?click radio option (.*) on the 'Does the item contain any dangerous goods\?' page$
  def andIclickRadioOptionXOnTheDoesTheItemContainAnyDangerousGoodsPage(answer: String): Unit =
    AddDangerousGoodsPage
      .loadPage()
      .select(answer)
      .submitPage()

  // ^(?:I )?enter (.*) on the 'What is the UN number for the dangerous goods\?' page$
  def andIenterXOnTheWhatIsTheUNNumberForTheDangerousGoodsPage(answer: String): Unit =
    DangerousGoodsUnNumberPage
      .loadPage()
      .fillInput(answer)
      .submitPage()

  // ^(?:I )?click radio option (.*) on the 'You have added (.*) UN numbe(?:r |rs )for dangerous goods' page$
  def andIclickRadioOptionXOnTheYouHaveAddedXUNNumbesforDangerousGoodsPage(
    answer: String,
    numberOfUnNumber: String
  ): Unit =
    DangerousGoodsUnNumberAddAnotherPage
      .loadPage(numberOfUnNumber)
      .select(answer)
      .submitPage()

  // ^(?:I )?click the (.*) link on the 'You have added (.*) UN numbe(?:r |rs )for dangerous goods' page$
  def andIclickTheXLinkOnTheYouHaveAddedXUNNumbersforDangerousGoodsPage(
    sectionLink: String,
    numberOfUnNumber: String
  ): Unit =
    DangerousGoodsUnNumberAddAnotherPage
      .loadPage(numberOfUnNumber)
      .clickByPartialLinkText(sectionLink)

  // ^(?:I )?click radio option (.*) on the 'Are you sure you want to remove this UN number\?' page$
  def andIclickRadioOptionXOnTheAreYouSureYouWantToRemoveThisUNNumberPage(answer: String): Unit =
    RemoveDangerousGoodsPage
      .loadPage()
      .select(answer)
      .submitPage()

  // ^(?:I )?enter (.*) on the 'What is the item’s gross weight\?' page$
  def andIenterXOnTheWhatIsTheItemsGrossWeightPage(answer: String): Unit =
    MeasurementGrossWeightPage
      .loadPage()
      .fillInput(answer)
      .submitPage()

  // ^(?:I )?click the continue button on the 'Before you continue' page$
  def andIclickTheContinueButtonOnTheBeforeYouContinuePage(): Unit =
    MeasurementGrossWeightWarningPage
      .loadPage()
      .submitPage()

  // ^(?:I )?click radio option (.*) on the 'Do you want to add the item’s net weight\?' page$
  def andIclickRadioOptionXOnTheDoYouWantToAddTheItemsNetWeightPage(answer: String): Unit =
    MeasurementAddNetWeightPage
      .loadPage()
      .select(answer)
      .submitPage()

  // ^(?:I )?enter (.*) on the 'What is the item’s net weight\?' page$
  def andIenterXOnTheWhatIsTheItemsNetWeightPage(answer: String): Unit =
    MeasurementNetWeightPage
      .loadPage()
      .fillInput(answer)
      .submitPage()

  // ^(?:I )?click radio option (.*) on the 'Do you want to add supplementary units\?' page$
  def andIclickRadioOptionXOnTheDoYouWantToAddSupplementaryUnitsPage(answer: String): Unit =
    MeasurementAddSupplementaryUnitsPage
      .loadPage()
      .select(answer)
      .submitPage()

  // ^(?:I )?enter (.*) on the 'How many supplementary units does the item include\?' page$
  def andIenterXOnTheHowManySupplementaryUnitsDoesTheItemIncludePage(answer: String): Unit =
    MeasurementSupplementaryUnitsPage
      .loadPage()
      .fillInput(answer)
      .submitPage()

  // ^(?:I )?select (.+) on the 'What type of package are you using for the item\?' page$
  def andIselectOnTheWhatTypeOfPackageAreYouUsingForTheItemPage(answer: String): Unit =
    PackageTypePage
      .loadPage()
      .select(answer)
      .submitPage()

  // ^(?:I )?enter (.*) on the 'How many of these are you using\?' page$
  def andIenterXOnTheHowManyOfTheseAreYouUsingPage(answer: String): Unit =
    PackagesTypeQuantityPage
      .loadPage()
      .fillInput(answer)
      .submitPage()

  // ^(?:I )?click continue on the 'Before you continue' page$
  def andIclickContinueOnTheBeforeYouContinuePage(): Unit =
    ErrorHintTextPage
      .loadPage()
      .submitPage()

  // ^(?:I )?click radio option (.*) on the 'Do you want to add a shipping mark\?' page$
  def andIclickRadioOptionXOnTheDoYouWantToAddAShippingMarkPage(answer: String): Unit =
    PackagesAddShippingMarkPage
      .loadPage()
      .select(answer)
      .submitPage()

  // ^(?:I )?enter (.*) on the 'What is the shipping mark\?' page$
  def andIenterXOnTheWhatIsTheShippingMarkPage(answer: String): Unit =
    PackagesShippingMarkPage
      .loadPage()
      .fillInput(answer)
      .submitPage()

  // ^(?:I )?click radio option (.*) on the 'You have added (.*) typ(?:e |es )of package' page$
  def andIclickRadioOptionXOnTheYouHaveAddedXTypesofPackagePage(answer: String, numberOfPackage: String): Unit =
    PackagesAddAnotherPage
      .loadPage(numberOfPackage)
      .select(answer)
      .submitPage()

  // ^(?:I )?click the (.*) link on the 'You have added (.*) typ(?:e |es )of packag(?:e |es)' page$
  def andIclickTheXLinkOnTheYouHaveAddedXTypesofPackagesPage(sectionLink: String, numberOfPackage: String): Unit =
    PackagesAddAnotherPage
      .loadPage(numberOfPackage)
      .clickByPartialLinkText(sectionLink)

  // ^(?:I )?click radio option (.*) on the 'Are you sure you want to remove this package from the item\?' page$
  def andIclickRadioOptionXOnTheAreYouSureYouWantToRemoveThisPackageFromTheItemPage(answer: String): Unit =
    RemovePackagePage
      .loadPage()
      .select(answer)
      .submitPage()

  // ^(?:I )?click radio option (.*) on the 'Do you want to add a supply chain actor for this item\?' page$
  def andIclickRadioOptionXOnTheDoYouWantToAddASupplyChainActorForThisItemPage(answer: String): Unit =
    SupplyChainActorItemAddPage
      .loadPage()
      .select(answer)
      .submitPage()

  // ^(?:I )?click radio option (.*) on the 'Which type of supply chain actor do you want to add\?' item page$
  def andIclickRadioOptionXOnTheWhichTypeOfSupplyChainActorDoYouWantToAddItemPage(answer: String): Unit =
    SupplyChainActorTypeItemPage
      .loadPage()
      .select(answer)
      .submitPage()

  // ^(?:I )?enter (.*) on the 'What is the EORI number or Trader Identification Number TIN for the (.*)\?' item page$
  def andIenterXOnTheWhatIsTheEORINumberOrTraderIdentificationNumberTINForTheXItemPage(
    answer: String,
    typeVal: String
  ): Unit =
    SupplyChainActorEoriTinItemPage
      .loadPage(typeVal)
      .fillInput(answer)
      .submitPage()

  // ^(?:I )?click radio option (.*) on the 'You have added (.*) supply chain actors? for this item' item page$
  def andIclickRadioOptionXOnTheYouHaveAddedXSupplyChainActorsForThisItemItemPage(
    answer: String,
    numberOfSCAs: String
  ): Unit =
    SupplyChainActorItemAddAnotherPage
      .loadPage(numberOfSCAs)
      .select(answer)
      .submitPage()

  // ^(?:I )?click the (.*) link on the 'You have added (.*) supply chain actors? for this item' item page$
  def andIclickTheXLinkOnTheYouHaveAddedXSupplyChainActorsForThisItemItemPage(
    sectionLink: String,
    numberOfSCAs: String
  ): Unit =
    SupplyChainActorItemAddAnotherPage
      .loadPage(numberOfSCAs)
      .clickByPartialLinkText(sectionLink)

  // ^(?:I )?click radio option (.*) on the 'Are you sure you want to remove this supply chain actor\?' item page$
  def andIclickRadioOptionXOnTheAreYouSureYouWantToRemoveThisSupplyChainActorItemPage(answer: String): Unit =
    SupplyChainActorItemRemoveSCAPage
      .loadPage()
      .select(answer)
      .submitPage()

  // ^(?:I )?click radio option (.*) on the 'Do you want to attach any documents to this item\?' page$
  def andIclickRadioOptionXOnTheDoYouWantToAttachAnyDocumentsToThisItemPage(answer: String): Unit =
    DocumentsAddDocumentPage
      .loadPage()
      .select(answer)
      .submitPage()

  // ^(?:I )?select (.+) on the 'Which document do you want to attach\?' page$
  def andIselectOnTheWhichDocumentDoYouWantToAttachPage(answer: String): Unit =
    DocumentsWhichDocumentPage
      .loadPage()
      .select(answer)
      .submitPage()

  // ^(?:I )?click radio option (.*) on the 'You have attached (.*) documents? to this item' page$
  def andIclickRadioOptionXOnTheYouHaveAttachedXDocumentsToThisItemPage(
    answer: String,
    numberOfDocuments: String
  ): Unit =
    DocumentsAddAnotherPage
      .loadPage(numberOfDocuments)
      .select(answer)
      .submitPage()

  // ^(?:I )?click the (.*) link on the 'You have attached (.*) documents? to this item' page$
  def andIclickTheXLinkOnTheYouHaveAttachedXDocumentsToThisItemPage(
    sectionLink: String,
    numberOfDocuments: String
  ): Unit =
    DocumentsAddAnotherPage
      .loadPage(numberOfDocuments)
      .clickByPartialLinkText(sectionLink)

  // ^(?:I )?click radio option (.*) on the 'Are you sure you want to remove this document from the item\?' document page$
  def andIclickRadioOptionXOnTheAreYouSureYouWantToRemoveThisDocumentFromTheItemDocumentPage(answer: String): Unit =
    DocumentsRemoveDocumentPage
      .loadPage()
      .select(answer)
      .submitPage()

  // ^(?:I )?click radio option (.*) on the 'Do you want to add an additional reference for this item\?' page$
  def andIclickRadioOptionXOnTheDoYouWantToAddAnAdditionalReferenceForThisItemPage(answer: String): Unit =
    AdditionalReferenceAddPage
      .loadPage()
      .select(answer)
      .submitPage()

  // ^(?:I )?select (.+) on the 'What type of additional reference do you want to add\?' page$
  def andIselectOnTheWhatTypeOfAdditionalReferenceDoYouWantToAddPage(answer: String): Unit =
    AdditionalReferenceTypePage
      .loadPage()
      .select(answer)
      .submitPage()

  // ^(?:I )?click radio option (.*) on the 'Do you want to add an additional reference number\?' page$
  def andIclickRadioOptionXOnTheDoYouWantToAddAnAdditionalReferenceNumberPage(answer: String): Unit =
    AdditionalReferenceAddNumberPage
      .loadPage()
      .select(answer)
      .submitPage()

  // ^(?:I )?enter (.*) on the 'Enter the additional reference number' page$
  def andIenterXOnTheEnterTheAdditionalReferenceNumberPage(answer: String): Unit =
    AdditionalReferenceEnterNumberPage
      .loadPage()
      .fillInput(answer)
      .submitPage()

  // ^(?:I )?enter additional reference (.*) on the 'What is the additional reference number\?' page$
  def andIenterAdditionalReferenceXOnTheWhatIsTheAdditionalReferenceNumberPage(answer: String): Unit =
    UnloadingFEAddNewConsignmentAdditionalReferenceNumberPage
      .loadPage()
      .fillInput(answer)
      .submitPage()

  // ^(?:I )?click radio option (.*) on the 'You have added (.*) additional references?' page$
  def andIclickRadioOptionXOnTheYouHaveAddedXAdditionalReferencesPage(
    answer: String,
    numberOfReferences: String
  ): Unit =
    AdditionalReferenceAddAnotherPage
      .loadPage(numberOfReferences)
      .select(answer)
      .submitPage()

  // ^(?:I )?click the (.*) link on the 'You have added (.*) additional references?' page$
  def andIclickTheXLinkOnTheYouHaveAddedXAdditionalReferencesPage(
    sectionLink: String,
    numberOfReferences: String
  ): Unit =
    AdditionalReferenceAddAnotherPage
      .loadPage(numberOfReferences)
      .clickByPartialLinkText(sectionLink)

  // ^(?:I )?click radio option (.*) on the 'Are you sure you want to remove this additional reference\?' page$
  def andIclickRadioOptionXOnTheAreYouSureYouWantToRemoveThisAdditionalReferencePage(answer: String): Unit =
    AdditionalReferenceRemovePage
      .loadPage()
      .select(answer)
      .submitPage()

  // ^(?:I )?click radio option (.*) on the 'Do you want to add any additional information for this item\?' page$
  def andIclickRadioOptionXOnTheDoYouWantToAddAnyAdditionalInformationForThisItemPage(answer: String): Unit =
    AdditionalInformationAddPage
      .loadPage()
      .select(answer)
      .submitPage()

  // ^(?:I )?select (.+) on the 'What type of additional information do you want to add\?' page$
  def andIselectOnTheWhatTypeOfAdditionalInformationDoYouWantToAddPage(answer: String): Unit =
    ItemAdditionalInformationTypePage
      .loadPage()
      .select(answer)
      .submitPage()

  // ^(?:I )?enter (.*) on the 'Enter the additional information' page$
  def andIenterXOnTheEnterTheAdditionalInformationPage(answer: String): Unit =
    AdditionalInformationEnterTextPage
      .loadPage()
      .fillInput(answer)
      .submitPage()

  // ^(?:I )?click radio option (.*) on the 'You have added (.*) additional information' page$
  def andIclickRadioOptionXOnTheYouHaveAddedXAdditionalInformationPage(answer: String, documentNumber: String): Unit =
    AdditionalInformationAddAnotherPage
      .loadPage(documentNumber)
      .select(answer)
      .submitPage()

  // ^(?:I )?click the (.*) link on the 'You have added (.*) additional information' page$
  def andIclickTheXLinkOnTheYouHaveAddedXAdditionalInformationPage(
    sectionLink: String,
    numberOfDocuments: String
  ): Unit =
    AdditionalInformationAddAnotherPage
      .loadPage(numberOfDocuments)
      .clickByPartialLinkText(sectionLink)

  // ^(?:I )?click radio option (.*) on the 'Are you sure you want to remove this additional information\?' page$
  def andIclickRadioOptionXOnTheAreYouSureYouWantToRemoveThisAdditionalInformationPage(answer: String): Unit =
    AdditionalInformationRemovePage
      .loadPage()
      .select(answer)
      .submitPage()

  // ^(?:I )?click radio option (.*) on the 'Which method of payment do you want to use for transport charges\?' page$
  def andIclickRadioOptionXOnTheWhichMethodOfPaymentDoYouWantToUseForTransportChargesPage(answer: String): Unit =
    ItemTransportChargesPage
      .loadPage()
      .select(answer)
      .submitPage()

  // ^(?:I )?click the (.*) link on the 'You have added (.*) items?' page$
  def andIclickTheXLinkOnTheYouHaveAddedXItemsPage(sectionLink: String, numberOfItems: String): Unit =
    ItemsAddAnotherPage
      .loadPage(numberOfItems)
      .clickByPartialLinkText(sectionLink)

  // ^(?:I )?click radio option (.*) on the 'Are you sure you want to remove item (.*)\?' page$
  def andIclickRadioOptionXOnTheAreYouSureYouWantToRemoveItemXPage(answer: String, itemNumber: String): Unit =
    RemoveItemPage
      .loadPage(itemNumber)
      .select(answer)
      .submitPage()

  // ^(?:I )?click radio option (.*) on the 'You have added (.*) item' page$
  def andIclickRadioOptionXOnTheYouHaveAddedXItemPage(answer: String, itemNumber: String): Unit =
    ItemsAddAnotherPage
      .loadPage(itemNumber)
      .select(answer)
      .submitPage()

  // ^(?:I )?click radio option (.*) on the 'Are you sure you want to remove this document from the item\?' page$
  def andIclickRadioOptionXOnTheAreYouSureYouWantToRemoveThisDocumentFromTheItemPage(answer: String): Unit =
    ConfirmRemoveDocumentFromItemPage
      .loadPage()
      .select(answer)
      .submitPage()

  // ^(?:I )?click radio option (.*) on the 'Which document do you want to attach\?' page$
  def andIclickRadioOptionXOnTheWhichDocumentDoYouWantToAttachPage(answer: String): Unit =
    ConfirmRemoveDocumentFromItemPage
      .loadPage()
      .select(answer)
      .submitPage()

  // ^(?:I )?click radio option (.*) on the 'Do you want to add any documents\?' page$
  def andIclickRadioOptionXOnTheDoYouWantToAddAnyDocumentsPage(answer: String): Unit =
    AddDocumentsPage
      .loadPage()
      .select(answer)
      .submitPage()

  // ^(?:I )? choose radio option (.*) on the 'Do you want to attach any documents to this item\?' page$
  def andIChooseRadioOptionXOnTheDoYouWantToAttachAnyDocumentsToThisItemPage(answer: String): Unit =
    AddItemDocumentPage
      .loadPage()
      .select(answer)
      .submitPage()

  // ^(?:I )?click radio option (.*) on the 'Do you want to add an additional reference for all items\?' page$
  def andIclickRadioOptionXOnTheDoYouWantToAddAnAdditionalReferenceForAllItemsPage(answer: String): Unit =
    AddPageAdditionalReference
      .loadPage()
      .select(answer)
      .submitPage()

  // ^(?:I )?click radio option (.*) on the 'You have added (.*) additional reference for all items' page$
  def andIclickRadioOptionXOnTheYouHaveAddedXAdditionalReferenceForAllItemsPage(
    answer: String,
    numberOfReferences: String
  ): Unit =
    AddAnotherPageAdditionalReference
      .loadPage(numberOfReferences)
      .select(answer)
      .submitPage()

  // ^(?:I )?click radio option (.*) on the 'Do you want to add any additional information for all items\?' page$
  def andIclickRadioOptionXOnTheDoYouWantToAddAnyAdditionalInformationForAllItemsPage(answer: String): Unit =
    AddPageAdditionalInformation
      .loadPage()
      .select(answer)
      .submitPage()

  // ^(?:I )?click radio option (.*) on the 'Do you want to add any comments for the additional information\?' page$
  def andIclickRadioOptionXOnTheDoYouWantToAddAnyCommentsForTheAdditionalInformationPage(answer: String): Unit =
    AddCommentAdditionalInformation
      .loadPage()
      .select(answer)
      .submitPage()

  // ^(?:I )?enter (.+) on the 'Enter your comments for the additional information\' page$
  def andIenterOnTheEnterYourCommentsForTheAdditionalInformationPage(answer: String): Unit =
    EnterCommentAdditionalInformation
      .loadPage()
      .fillInput(answer)
      .submitPage()

  // ^(?:I )?choose to click on the (.*) link on the 'You have added (.*) additional information for all items' page$
  def andIchooseToClickOnTheXLinkOnTheYouHaveAddedXAdditionalInformationForAllItemsPage(
    sectionLink: String,
    numberOfAdditionalInfoInTitle: String
  ): Unit =
    AddAnotherPageAdditionalInformation
      .loadPage(numberOfAdditionalInfoInTitle)
      .clickByPartialLinkText(sectionLink)

  // ^(?:I )?click radio option (.*) on the 'You have added (.*) additional information for all items' page$
  def andIclickRadioOptionXOnTheYouHaveAddedXAdditionalInformationForAllItemsPage(
    answer: String,
    numberOfReferences: String
  ): Unit =
    AddAnotherPageAdditionalInformation
      .loadPage(numberOfReferences)
      .select(answer)
      .submitPage()

  // ^(?:I )?click radio option (.*) on the 'Are you sure you want to remove this additional information from all items\?' page$
  def andIclickRadioOptionXOnTheAreYouSureYouWantToRemoveThisAdditionalInformationFromAllItemsPage(
    answer: String
  ): Unit =
    RemovePageAdditionalInformation
      .loadPage()
      .select(answer)
      .submitPage()

  // ^(?:I )?choose radio option (.*) on the 'You have added (.*) additional reference for all items' page$
  def andIchooseRadioOptionXOnTheYouHaveAddedXAdditionalReferenceForAllItemsPage(
    answer: String,
    numberOfContainers: String
  ): Unit =
    AdditionalReferenceAllItemsAddAnotherPage
      .loadPage(numberOfContainers)
      .select(answer)
      .submitPage()

  // ^(?:I )?click the (.*) link on the 'You have added (.*) additional references for all items\?' page$
  def andIclickTheXLinkOnTheYouHaveAddedXAdditionalReferencesForAllItemsPage(
    sectionLink: String,
    numberOfReferences: String
  ): Unit =
    AdditionalReferenceAllItemsAddAnotherPage
      .loadPage(numberOfReferences)
      .clickByPartialLinkText(sectionLink)

  // ^(?:I )?click radio option (.*) on the 'Are you sure you want to remove this additional reference from all items\?' page$
  def andIclickRadioOptionXOnTheAreYouSureYouWantToRemoveThisAdditionalReferenceFromAllItemsPage(answer: String): Unit =
    AdditionalReferenceAllItemsRemovePage
      .loadPage()
      .select(answer)
      .submitPage()

  // ^(?:I )?click the Go to your Documents section to add another document link on the 'You do not have any documents to attach' page$
  def andIclickTheGoToYourDocumentsSectionToAddAnotherDocumentLinkOnTheYouDoNotHaveAnyDocumentsToAttachPage(): Unit =
    YouDoNotHaveDocumentsToAttachPage
      .loadPage()
      .clickById("documents")

  // ^(?:I )?click the Go to your Documents section to add another document link on the 'You do not have any previous documents to attach' page$
  def andIclickTheGoToYourDocumentsSectionToAddAnotherDocumentLinkOnTheYouDoNotHaveAnyPreviousDocumentsToAttachPage()
    : Unit =
    YouDoNotHavePreviousDocumentsToAttachPage
      .loadPage()
      .clickById("documents")

}
