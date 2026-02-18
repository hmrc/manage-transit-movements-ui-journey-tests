import uk.gov.hmrc.test.ui.cucumber.stepdefs.BaseStepDef
import uk.gov.hmrc.test.ui.pages.Departures.AdditionalInformation.{AdditionalInformationTypePage, *}
import uk.gov.hmrc.test.ui.pages.Departures.AdditionalReference.{AddAnotherPageAdditionalReference, AddPageAdditionalReference, AdditionalReferenceAllItemsAddAnotherPage, AdditionalReferenceAllItemsRemovePage}
import uk.gov.hmrc.test.ui.pages.Departures.Items.*
import uk.gov.hmrc.test.ui.pages.Unloading.CrossCheckPagePages.AddNewConsignmentAdditionalReferenceNumberPage

object ItemDetailsStepDefSteps {

  // ^(?:I )?enter (.*) on the 'Enter a description of item (.*)' page$
  def and(?I)?enterXOnThe'EnterADescriptionOfItemX'Page(answer: String, itemNumber: String): Unit = {
    ItemDescriptionPage
            .loadPage(itemNumber)
            .fillInput(answer)
            .submitPage()
  }

  // ^(?:I )?select (.+) on the 'Which transport equipment are you using for this item\?' page$
  def and(?I)?select(.+)OnThe'WhichTransportEquipmentAreYouUsingForThisItem\?'Page(answer: String): Unit = {
    ItemTransportEquipmentPage
            .loadPage()
            .select(answer)
            .submitPage()
  }

  // ^(?:I )?choose radio option (.*) on the 'Which type of declaration do you want to create for this item\?' page$
  def and(?I)?chooseRadioOptionXOnThe'WhichTypeOfDeclarationDoYouWantToCreateForThisItem\?'Page(answer: String): Unit = {
    ItemDeclarationTypePage
          .loadPage()
          .select(answer)
          .submitPage()
  }

  // ^(?:I )?select (.+) on the 'What is the item’s country of dispatch\?' page$
  def and(?I)?select(.+)OnThe'WhatIsTheItem’sCountryOfDispatch\?'Page(answer: String): Unit = {
    ItemCountryOfDispatchPage
          .loadPage()
          .select(answer)
          .submitPage()
  }

  // ^(?:I )?select (.+) on the 'What is the item’s country of destination\?' page$
  def and(?I)?select(.+)OnThe'WhatIsTheItem’sCountryOfDestination\?'Page(answer: String): Unit = {
    ItemCountryOfDestinationPage
          .loadPage()
          .select(answer)
          .submitPage()
  }

  // ^(?:I )? choose radio option (.*) on the 'Do you want to add a Unique Consignment Reference\?' page$
  def and(?I)?ChooseRadioOptionXOnThe'DoYouWantToAddAUniqueConsignmentReference\?'Page(answer: String): Unit = {
    AddItemUCRPage
            .loadPage()
            .select(answer)
            .submitPage()
  }

  // ^(?:I )?enter (.*) on the 'What is the Unique Consignment Reference\?' page$
  def and(?I)?enterXOnThe'WhatIsTheUniqueConsignmentReference\?'Page(answer: String): Unit = {
    ItemUCRNumberPage
          .loadPage()
          .fillInput(answer)
          .submitPage()
  }

  // ^(?:I )?click radio option (.*) on the 'Do you want to add a Customs Union and Statistics code\?' page$
  def and(?I)?clickRadioOptionXOnThe'DoYouWantToAddACustomsUnionAndStatisticsCode\?'Page(answer: String): Unit = {
    AddCUSCodePage
            .loadPage()
            .select(answer)
            .submitPage()
  }

  // ^(?:I )?enter (.*) on the 'What is the Customs Union and Statistics code\?' page$
  def and(?I)?enterXOnThe'WhatIsTheCustomsUnionAndStatisticsCode\?'Page(answer: String): Unit = {
    CUSCodePage
          .loadPage()
          .fillInput(answer)
          .submitPage()
  }

  // ^(?:I )?click radio option (.*) on the 'Do you want to add a commodity code\?' page$
  def and(?I)?clickRadioOptionXOnThe'DoYouWantToAddACommodityCode\?'Page(answer: String): Unit = {
    AddCommodityCodePage
          .loadPage()
          .select(answer)
          .submitPage()
  }

  // ^(?:I )?enter (.*) on the 'What is the commodity code\?' page$
  def and(?I)?enterXOnThe'WhatIsTheCommodityCode\?'Page(answer: String): Unit = {
    CommodityCodePage
          .loadPage()
          .fillInput(answer)
          .submitPage()
  }

  // ^(?:I )?click radio option (.*) on the 'Do you want to add a combined nomenclature code\?' page$
  def and(?I)?clickRadioOptionXOnThe'DoYouWantToAddACombinedNomenclatureCode\?'Page(answer: String): Unit = {
    AddNomenclatureCodePage
            .loadPage()
            .select(answer)
            .submitPage()
  }

  // ^(?:I )?enter (.*) on the 'What is the combined nomenclature code\?' page$
  def and(?I)?enterXOnThe'WhatIsTheCombinedNomenclatureCode\?'Page(answer: String): Unit = {
    NomenclatureCodePage
          .loadPage()
          .fillInput(answer)
          .submitPage()
  }

  // ^(?:I )?click radio option (.*) on the 'Does the item contain any dangerous goods\?' page$
  def and(?I)?clickRadioOptionXOnThe'DoesTheItemContainAnyDangerousGoods\?'Page(answer: String): Unit = {
    AddDangerousGoodsPage
            .loadPage()
            .select(answer)
            .submitPage()
  }

  // ^(?:I )?enter (.*) on the 'What is the UN number for the dangerous goods\?' page$
  def and(?I)?enterXOnThe'WhatIsTheUNNumberForTheDangerousGoods\?'Page(answer: String): Unit = {
    DangerousGoodsUnNumberPage
          .loadPage()
          .fillInput(answer)
          .submitPage()
  }

  // ^(?:I )?click radio option (.*) on the 'You have added (.*) UN numbe(?:r |rs )for dangerous goods' page$
  def and(?I)?clickRadioOptionXOnThe'YouHaveAddedXUNNumbe(?r|rs)forDangerousGoods'Page(answer: String, numberOfUnNumber: String): Unit = {
    DangerousGoodsUnNumberAddAnotherPage
            .loadPage(numberOfUnNumber)
            .select(answer)
            .submitPage()
  }

  // ^(?:I )?click the (.*) link on the 'You have added (.*) UN numbe(?:r |rs )for dangerous goods' page$
  def and(?I)?clickTheXLinkOnThe'YouHaveAddedXUNNumbe(?r|rs)forDangerousGoods'Page(sectionLink: String, numberOfUnNumber: String): Unit = {
    DangerousGoodsUnNumberAddAnotherPage
            .loadPage(numberOfUnNumber)
            .clickByPartialLinkText(sectionLink)
  }

  // ^(?:I )?click radio option (.*) on the 'Are you sure you want to remove this UN number\?' page$
  def and(?I)?clickRadioOptionXOnThe'AreYouSureYouWantToRemoveThisUNNumber\?'Page(answer: String): Unit = {
    RemoveDangerousGoodsPage
            .loadPage()
            .select(answer)
            .submitPage()
  }

  // ^(?:I )?enter (.*) on the 'What is the item’s gross weight\?' page$
  def and(?I)?enterXOnThe'WhatIsTheItem’sGrossWeight\?'Page(answer: String): Unit = {
    MeasurementGrossWeightPage
          .loadPage()
          .fillInput(answer)
          .submitPage()
  }

  // ^(?:I )?click the continue button on the 'Before you continue' page$
  def and(?I)?clickTheContinueButtonOnThe'BeforeYouContinue'Page(): Unit = {
    MeasurementGrossWeightWarningPage
          .loadPage()
          .submitPage()
  }

  // ^(?:I )?click radio option (.*) on the 'Do you want to add the item’s net weight\?' page$
  def and(?I)?clickRadioOptionXOnThe'DoYouWantToAddTheItem’sNetWeight\?'Page(answer: String): Unit = {
    MeasurementAddNetWeightPage
            .loadPage()
            .select(answer)
            .submitPage()
  }

  // ^(?:I )?enter (.*) on the 'What is the item’s net weight\?' page$
  def and(?I)?enterXOnThe'WhatIsTheItem’sNetWeight\?'Page(answer: String): Unit = {
    MeasurementNetWeightPage
          .loadPage()
          .fillInput(answer)
          .submitPage()
  }

  // ^(?:I )?click radio option (.*) on the 'Do you want to add supplementary units\?' page$
  def and(?I)?clickRadioOptionXOnThe'DoYouWantToAddSupplementaryUnits\?'Page(answer: String): Unit = {
    MeasurementAddSupplementaryUnitsPage
            .loadPage()
            .select(answer)
            .submitPage()
  }

  // ^(?:I )?enter (.*) on the 'How many supplementary units does the item include\?' page$
  def and(?I)?enterXOnThe'HowManySupplementaryUnitsDoesTheItemInclude\?'Page(answer: String): Unit = {
    MeasurementSupplementaryUnitsPage
            .loadPage()
            .fillInput(answer)
            .submitPage()
  }

  // ^(?:I )?select (.+) on the 'What type of package are you using for the item\?' page$
  def and(?I)?select(.+)OnThe'WhatTypeOfPackageAreYouUsingForTheItem\?'Page(answer: String): Unit = {
    PackageTypePage
          .loadPage()
          .select(answer)
          .submitPage()
  }

  // ^(?:I )?enter (.*) on the 'How many of these are you using\?' page$
  def and(?I)?enterXOnThe'HowManyOfTheseAreYouUsing\?'Page(answer: String): Unit = {
    PackagesTypeQuantityPage
          .loadPage()
          .fillInput(answer)
          .submitPage()
  }

  // ^(?:I )?click continue on the 'Before you continue' page$
  def and(?I)?clickContinueOnThe'BeforeYouContinue'Page(): Unit = {
    ErrorHintTextPage
          .loadPage()
          .submitPage()
  }

  // ^(?:I )?click radio option (.*) on the 'Do you want to add a shipping mark\?' page$
  def and(?I)?clickRadioOptionXOnThe'DoYouWantToAddAShippingMark\?'Page(answer: String): Unit = {
    PackagesAddShippingMarkPage
          .loadPage()
          .select(answer)
          .submitPage()
  }

  // ^(?:I )?enter (.*) on the 'What is the shipping mark\?' page$
  def and(?I)?enterXOnThe'WhatIsTheShippingMark\?'Page(answer: String): Unit = {
    PackagesShippingMarkPage
          .loadPage()
          .fillInput(answer)
          .submitPage()
  }

  // ^(?:I )?click radio option (.*) on the 'You have added (.*) typ(?:e |es )of package' page$
  def and(?I)?clickRadioOptionXOnThe'YouHaveAddedXTyp(?e|es)ofPackage'Page(answer: String, numberOfPackage: String): Unit = {
    PackagesAddAnotherPage
            .loadPage(numberOfPackage)
            .select(answer)
            .submitPage()
  }

  // ^(?:I )?click the (.*) link on the 'You have added (.*) typ(?:e |es )of packag(?:e |es)' page$
  def and(?I)?clickTheXLinkOnThe'YouHaveAddedXTyp(?e|es)ofPackag(?e|es)'Page(sectionLink: String, numberOfPackage: String): Unit = {
    PackagesAddAnotherPage
            .loadPage(numberOfPackage)
            .clickByPartialLinkText(sectionLink)
  }

  // ^(?:I )?click radio option (.*) on the 'Are you sure you want to remove this package from the item\?' page$
  def and(?I)?clickRadioOptionXOnThe'AreYouSureYouWantToRemoveThisPackageFromTheItem\?'Page(answer: String): Unit = {
    RemovePackagePage
          .loadPage()
          .select(answer)
          .submitPage()
  }

  // ^(?:I )?click radio option (.*) on the 'Do you want to add a supply chain actor for this item\?' page$
  def and(?I)?clickRadioOptionXOnThe'DoYouWantToAddASupplyChainActorForThisItem\?'Page(answer: String): Unit = {
    SupplyChainActorItemAddPage
            .loadPage()
            .select(answer)
            .submitPage()
  }

  // ^(?:I )?click radio option (.*) on the 'Which type of supply chain actor do you want to add\?' item page$
  def and(?I)?clickRadioOptionXOnThe'WhichTypeOfSupplyChainActorDoYouWantToAdd\?'ItemPage(answer: String): Unit = {
    SupplyChainActorTypeItemPage
            .loadPage()
            .select(answer)
            .submitPage()
  }

  // ^(?:I )?enter (.*) on the 'What is the EORI number or Trader Identification Number TIN for the (.*)\?' item page$
  def and(?I)?enterXOnThe'WhatIsTheEORINumberOrTraderIdentificationNumberTINForTheX\?'ItemPage(answer: String, typeVal: String): Unit = {
    SupplyChainActorEoriTinItemPage
          .loadPage(typeVal)
          .fillInput(answer)
          .submitPage()
  }

  // ^(?:I )?click radio option (.*) on the 'You have added (.*) supply chain actors? for this item' item page$
  def and(?I)?clickRadioOptionXOnThe'YouHaveAddedXSupplyChainActors?ForThisItem'ItemPage(answer: String, numberOfSCAs: String): Unit = {
    SupplyChainActorItemAddAnotherPage
          .loadPage(numberOfSCAs)
          .select(answer)
          .submitPage()
  }

  // ^(?:I )?click the (.*) link on the 'You have added (.*) supply chain actors? for this item' item page$
  def and(?I)?clickTheXLinkOnThe'YouHaveAddedXSupplyChainActors?ForThisItem'ItemPage(sectionLink: String, numberOfSCAs: String): Unit = {
    SupplyChainActorItemAddAnotherPage
            .loadPage(numberOfSCAs)
            .clickByPartialLinkText(sectionLink)
  }

  // ^(?:I )?click radio option (.*) on the 'Are you sure you want to remove this supply chain actor\?' item page$
  def and(?I)?clickRadioOptionXOnThe'AreYouSureYouWantToRemoveThisSupplyChainActor\?'ItemPage(answer: String): Unit = {
    SupplyChainActorItemRemoveSCAPage
          .loadPage()
          .select(answer)
          .submitPage()
  }

  // ^(?:I )?click radio option (.*) on the 'Do you want to attach any documents to this item\?' page$
  def and(?I)?clickRadioOptionXOnThe'DoYouWantToAttachAnyDocumentsToThisItem\?'Page(answer: String): Unit = {
    DocumentsAddDocumentPage
            .loadPage()
            .select(answer)
            .submitPage()
  }

  // ^(?:I )?select (.+) on the 'Which document do you want to attach\?' page$
  def and(?I)?select(.+)OnThe'WhichDocumentDoYouWantToAttach\?'Page(answer: String): Unit = {
    DocumentsWhichDocumentPage
          .loadPage()
          .select(answer)
          .submitPage()
  }

  // ^(?:I )?click radio option (.*) on the 'You have attached (.*) documents? to this item' page$
  def and(?I)?clickRadioOptionXOnThe'YouHaveAttachedXDocuments?ToThisItem'Page(answer: String, numberOfDocuments: String): Unit = {
    DocumentsAddAnotherPage
            .loadPage(numberOfDocuments)
            .select(answer)
            .submitPage()
  }

  // ^(?:I )?click the (.*) link on the 'You have attached (.*) documents? to this item' page$
  def and(?I)?clickTheXLinkOnThe'YouHaveAttachedXDocuments?ToThisItem'Page(sectionLink: String, numberOfDocuments: String): Unit = {
    DocumentsAddAnotherPage
            .loadPage(numberOfDocuments)
            .clickByPartialLinkText(sectionLink)
  }

  // ^(?:I )?click radio option (.*) on the 'Are you sure you want to remove this document from the item\?' document page$
  def and(?I)?clickRadioOptionXOnThe'AreYouSureYouWantToRemoveThisDocumentFromTheItem\?'DocumentPage(answer: String): Unit = {
    DocumentsRemoveDocumentPage
          .loadPage()
          .select(answer)
          .submitPage()
  }

  // ^(?:I )?click radio option (.*) on the 'Do you want to add an additional reference for this item\?' page$
  def and(?I)?clickRadioOptionXOnThe'DoYouWantToAddAnAdditionalReferenceForThisItem\?'Page(answer: String): Unit = {
    AdditionalReferenceAddPage
            .loadPage()
            .select(answer)
            .submitPage()
  }

  // ^(?:I )?select (.+) on the 'What type of additional reference do you want to add\?' page$
  def and(?I)?select(.+)OnThe'WhatTypeOfAdditionalReferenceDoYouWantToAdd\?'Page(answer: String): Unit = {
    AdditionalReferenceTypePage
            .loadPage()
            .select(answer)
            .submitPage()
  }

  // ^(?:I )?click radio option (.*) on the 'Do you want to add an additional reference number\?' page$
  def and(?I)?clickRadioOptionXOnThe'DoYouWantToAddAnAdditionalReferenceNumber\?'Page(answer: String): Unit = {
    AdditionalReferenceAddNumberPage
            .loadPage()
            .select(answer)
            .submitPage()
  }

  // ^(?:I )?enter (.*) on the 'Enter the additional reference number' page$
  def and(?I)?enterXOnThe'EnterTheAdditionalReferenceNumber'Page(answer: String): Unit = {
    AdditionalReferenceEnterNumberPage
          .loadPage()
          .fillInput(answer)
          .submitPage()
  }

  // ^(?:I )?enter additional reference (.*) on the 'What is the additional reference number\?' page$
  def and(?I)?enterAdditionalReferenceXOnThe'WhatIsTheAdditionalReferenceNumber\?'Page(answer: String): Unit = {
    AddNewConsignmentAdditionalReferenceNumberPage
            .loadPage()
            .fillInput(answer)
            .submitPage()
  }

  // ^(?:I )?click radio option (.*) on the 'You have added (.*) additional references?' page$
  def and(?I)?clickRadioOptionXOnThe'YouHaveAddedXAdditionalReferences?'Page(answer: String, numberOfReferences: String): Unit = {
    AdditionalReferenceAddAnotherPage
            .loadPage(numberOfReferences)
            .select(answer)
            .submitPage()
  }

  // ^(?:I )?click the (.*) link on the 'You have added (.*) additional references?' page$
  def and(?I)?clickTheXLinkOnThe'YouHaveAddedXAdditionalReferences?'Page(sectionLink: String, numberOfReferences: String): Unit = {
    AdditionalReferenceAddAnotherPage
            .loadPage(numberOfReferences)
            .clickByPartialLinkText(sectionLink)
  }

  // ^(?:I )?click radio option (.*) on the 'Are you sure you want to remove this additional reference\?' page$
  def and(?I)?clickRadioOptionXOnThe'AreYouSureYouWantToRemoveThisAdditionalReference\?'Page(answer: String): Unit = {
    AdditionalReferenceRemovePage
          .loadPage()
          .select(answer)
          .submitPage()
  }

  // ^(?:I )?click radio option (.*) on the 'Do you want to add any additional information for this item\?' page$
  def and(?I)?clickRadioOptionXOnThe'DoYouWantToAddAnyAdditionalInformationForThisItem\?'Page(answer: String): Unit = {
    AdditionalInformationAddPage
          .loadPage()
          .select(answer)
          .submitPage()
  }

  // ^(?:I )?select (.+) on the 'What type of additional information do you want to add\?' page$
  def and(?I)?select(.+)OnThe'WhatTypeOfAdditionalInformationDoYouWantToAdd\?'Page(answer: String): Unit = {
    AdditionalInformationTypePage
            .loadPage()
            .select(answer)
            .submitPage()
  }

  // ^(?:I )?enter (.*) on the 'Enter the additional information' page$
  def and(?I)?enterXOnThe'EnterTheAdditionalInformation'Page(answer: String): Unit = {
    AdditionalInformationEnterTextPage
          .loadPage()
          .fillInput(answer)
          .submitPage()
  }

  // ^(?:I )?click radio option (.*) on the 'You have added (.*) additional information' page$
  def and(?I)?clickRadioOptionXOnThe'YouHaveAddedXAdditionalInformation'Page(answer: String, documentNumber: String): Unit = {
    AdditionalInformationAddAnotherPage
            .loadPage(documentNumber)
            .select(answer)
            .submitPage()
  }

  // ^(?:I )?click the (.*) link on the 'You have added (.*) additional information' page$
  def and(?I)?clickTheXLinkOnThe'YouHaveAddedXAdditionalInformation'Page(sectionLink: String, numberOfDocuments: String): Unit = {
    AdditionalInformationAddAnotherPage
            .loadPage(numberOfDocuments)
            .clickByPartialLinkText(sectionLink)
  }

  // ^(?:I )?click radio option (.*) on the 'Are you sure you want to remove this additional information\?' page$
  def and(?I)?clickRadioOptionXOnThe'AreYouSureYouWantToRemoveThisAdditionalInformation\?'Page(answer: String): Unit = {
    AdditionalInformationRemovePage
          .loadPage()
          .select(answer)
          .submitPage()
  }

  // ^(?:I )?click radio option (.*) on the 'Which method of payment do you want to use for transport charges\?' page$
  def and(?I)?clickRadioOptionXOnThe'WhichMethodOfPaymentDoYouWantToUseForTransportCharges\?'Page(answer: String): Unit = {
    ItemTransportChargesPage
          .loadPage()
          .select(answer)
          .submitPage()
  }

  // ^(?:I )?click the (.*) link on the 'You have added (.*) items?' page$
  def and(?I)?clickTheXLinkOnThe'YouHaveAddedXItems?'Page(sectionLink: String, numberOfItems: String): Unit = {
    ItemsAddAnotherPage
            .loadPage(numberOfItems)
            .clickByPartialLinkText(sectionLink)
  }

  // ^(?:I )?click radio option (.*) on the 'Are you sure you want to remove item (.*)\?' page$
  def and(?I)?clickRadioOptionXOnThe'AreYouSureYouWantToRemoveItemX\?'Page(answer: String, itemNumber: String): Unit = {
    RemoveItemPage
            .loadPage(itemNumber)
            .select(answer)
            .submitPage()
  }

  // ^(?:I )?click radio option (.*) on the 'You have added (.*) item' page$
  def and(?I)?clickRadioOptionXOnThe'YouHaveAddedXItem'Page(answer: String, itemNumber: String): Unit = {
    ItemsAddAnotherPage
            .loadPage(itemNumber)
            .select(answer)
            .submitPage()
  }

  // ^(?:I )?click radio option (.*) on the 'Are you sure you want to remove this document from the item\?' page$
  def and(?I)?clickRadioOptionXOnThe'AreYouSureYouWantToRemoveThisDocumentFromTheItem\?'Page(answer: String): Unit = {
    ConfirmRemoveDocumentFromItemPage
          .loadPage()
          .select(answer)
          .submitPage()
  }

  // ^(?:I )?click radio option (.*) on the 'Which document do you want to attach\?' page$
  def and(?I)?clickRadioOptionXOnThe'WhichDocumentDoYouWantToAttach\?'Page(answer: String): Unit = {
    ConfirmRemoveDocumentFromItemPage
          .loadPage()
          .select(answer)
          .submitPage()
  }

  // ^(?:I )?click radio option (.*) on the 'Do you want to add any documents\?' page$
  def and(?I)?clickRadioOptionXOnThe'DoYouWantToAddAnyDocuments\?'Page(answer: String): Unit = {
    AddDocumentsPage
          .loadPage()
          .select(answer)
          .submitPage()
  }

  // ^(?:I )? choose radio option (.*) on the 'Do you want to attach any documents to this item\?' page$
  def and(?I)?ChooseRadioOptionXOnThe'DoYouWantToAttachAnyDocumentsToThisItem\?'Page(answer: String): Unit = {
    AddItemDocumentPage
            .loadPage()
            .select(answer)
            .submitPage()
  }

  // ^(?:I )?click radio option (.*) on the 'Do you want to add an additional reference for all items\?' page$
  def and(?I)?clickRadioOptionXOnThe'DoYouWantToAddAnAdditionalReferenceForAllItems\?'Page(answer: String): Unit = {
    AddPageAdditionalReference
            .loadPage()
            .select(answer)
            .submitPage()
  }

  // ^(?:I )?click radio option (.*) on the 'You have added (.*) additional reference for all items' page$
  def and(?I)?clickRadioOptionXOnThe'YouHaveAddedXAdditionalReferenceForAllItems'Page(answer: String, numberOfReferences: String): Unit = {
    AddAnotherPageAdditionalReference
            .loadPage(numberOfReferences)
            .select(answer)
            .submitPage()
  }

  // ^(?:I )?click radio option (.*) on the 'Do you want to add any additional information for all items\?' page$
  def and(?I)?clickRadioOptionXOnThe'DoYouWantToAddAnyAdditionalInformationForAllItems\?'Page(answer: String): Unit = {
    AddPageAdditionalInformation
          .loadPage()
          .select(answer)
          .submitPage()
  }

  // ^(?:I )?click radio option (.*) on the 'Do you want to add any comments for the additional information\?' page$
  def and(?I)?clickRadioOptionXOnThe'DoYouWantToAddAnyCommentsForTheAdditionalInformation\?'Page(answer: String): Unit = {
    AddCommentAdditionalInformation
          .loadPage()
          .select(answer)
          .submitPage()
  }

  // ^(?:I )?enter (.+) on the 'Enter your comments for the additional information\' page$
  def and(?I)?enter(.+)OnThe'EnterYourCommentsForTheAdditionalInformation\'Page(answer: String): Unit = {
    EnterCommentAdditionalInformation
          .loadPage()
          .fillInput(answer)
          .submitPage()
  }

  // ^(?:I )?choose to click on the (.*) link on the 'You have added (.*) additional information for all items' page$
  def and(?I)?chooseToClickOnTheXLinkOnThe'YouHaveAddedXAdditionalInformationForAllItems'Page(sectionLink: String, numberOfAdditionalInfoInTitle: String): Unit = {
    AddAnotherPageAdditionalInformation
          .loadPage(numberOfAdditionalInfoInTitle)
          .clickByPartialLinkText(sectionLink)
  }

  // ^(?:I )?click radio option (.*) on the 'You have added (.*) additional information for all items' page$
  def and(?I)?clickRadioOptionXOnThe'YouHaveAddedXAdditionalInformationForAllItems'Page(answer: String, numberOfReferences: String): Unit = {
    AddAnotherPageAdditionalInformation
            .loadPage(numberOfReferences)
            .select(answer)
            .submitPage()
  }

  // ^(?:I )?click radio option (.*) on the 'Are you sure you want to remove this additional information from all items\?' page$
  def and(?I)?clickRadioOptionXOnThe'AreYouSureYouWantToRemoveThisAdditionalInformationFromAllItems\?'Page(answer: String): Unit = {
    RemovePageAdditionalInformation
          .loadPage()
          .select(answer)
          .submitPage()
  }

  // ^(?:I )?choose radio option (.*) on the 'You have added (.*) additional reference for all items' page$
  def and(?I)?chooseRadioOptionXOnThe'YouHaveAddedXAdditionalReferenceForAllItems'Page(answer: String, numberOfContainers: String): Unit = {
    AdditionalReferenceAllItemsAddAnotherPage
            .loadPage(numberOfContainers)
            .select(answer)
            .submitPage()
  }

  // ^(?:I )?click the (.*) link on the 'You have added (.*) additional references for all items\?' page$
  def and(?I)?clickTheXLinkOnThe'YouHaveAddedXAdditionalReferencesForAllItems\?'Page(sectionLink: String, numberOfReferences: String): Unit = {
    AdditionalReferenceAllItemsAddAnotherPage
            .loadPage(numberOfReferences)
            .clickByPartialLinkText(sectionLink)
  }

  // ^(?:I )?click radio option (.*) on the 'Are you sure you want to remove this additional reference from all items\?' page$
  def and(?I)?clickRadioOptionXOnThe'AreYouSureYouWantToRemoveThisAdditionalReferenceFromAllItems\?'Page(answer: String): Unit = {
    AdditionalReferenceAllItemsRemovePage
          .loadPage()
          .select(answer)
          .submitPage()
  }

  // ^(?:I )?click the Go to your Documents section to add another document link on the 'You do not have any documents to attach' page$
  def and(?I)?clickTheGoToYourDocumentsSectionToAddAnotherDocumentLinkOnThe'YouDoNotHaveAnyDocumentsToAttach'Page(): Unit = {
    YouDoNotHaveDocumentsToAttachPage
          .loadPage()
          .clickById("documents")
  }

  // ^(?:I )?click the Go to your Documents section to add another document link on the 'You do not have any previous documents to attach' page$
  def and(?I)?clickTheGoToYourDocumentsSectionToAddAnotherDocumentLinkOnThe'YouDoNotHaveAnyPreviousDocumentsToAttach'Page(): Unit = {
    YouDoNotHavePreviousDocumentsToAttachPage
          .loadPage()
          .clickById("documents")
  }

}
