import uk.gov.hmrc.test.ui.cucumber.stepdefs.BaseStepDef
import uk.gov.hmrc.test.ui.pages.Departures.Items.PackagesTypeQuantityPage
import uk.gov.hmrc.test.ui.pages.PresentationNotification.TransportEquipmentIncrementPage
import uk.gov.hmrc.test.ui.pages.Unloading.*
import uk.gov.hmrc.test.ui.pages.Unloading.CrossCheckPagePages.*
import uk.gov.hmrc.test.ui.pages.Unloading.CrossCheckPagePages.DepartureMeansOfTransport.*
import uk.gov.hmrc.test.ui.pages.Unloading.CrossCheckPagePages.TransportEquipment.*
import uk.gov.hmrc.test.ui.pages.Unloading.P6Pages.{UCRForNewHouseConsignmentPage, UCRForNewHouseConsignmentYesNoPage, UCRForNewItemInHouseConsignmentPage, UCRForNewItemInHouseConsignmentYesNoPage}

object UnloadingStepDefSteps {

  // ^(?:I )?should be on the 'Do you want to use the revised unloading procedure\?' page$
  def then(?I)?shouldBeOnThe'DoYouWantToUseTheRevisedUnloadingProcedure\?'Page(): Unit = {
    IsRevisedUnloadingProcedurePage
          .loadPage()
  }

  // ^(?:I )?should be on the 'Enter the discrepancies between the transit movement and unloading permission' page$
  def then(?I)?shouldBeOnThe'EnterTheDiscrepanciesBetweenTheTransitMovementAndUnloadingPermission'Page(): Unit = {
    ConsignmentCrossCheckPage
          .loadPage()
  }

  // ^(?:I )?should be on the 'House consignment (.+)' page$
  def then(?I)?shouldBeOnThe'HouseConsignment(.+)'Page(houseConsignments: String): Unit = {
    HouseConsignmentPage
          .loadPage(houseConsignments)
  }

  // ^(?:I )?fill in the date on the 'When were the goods unloaded\?' page$
  def and(?I)?fillInTheDateOnThe'WhenWereTheGoodsUnloaded\?'Page(): Unit = {
    GoodsUnloadedDatePage
          .loadPage()
          .fillInputs()
          .submitPage()
  }

  // ^(?:I )?choose radio option (.*) on the 'Have you fully or partially unloaded the goods\?' page$
  def and(?I)?chooseRadioOptionXOnThe'HaveYouFullyOrPartiallyUnloadedTheGoods\?'Page(answer: String): Unit = {
    FullyOrPartiallyUnloadedPage
            .loadPage()
            .select(answer)
            .submitPage()
  }

  // ^(?:I )?choose radio option (.*) on the 'Are all the seal identification numbers or marks readable\?' page$
  def and(?I)?chooseRadioOptionXOnThe'AreAllTheSealIdentificationNumbersOrMarksReadable\?'Page(answer: String): Unit = {
    SealNumbersReadablePage
          .loadPage()
          .select(answer)
          .submitPage()
  }

  // ^(?:I )?choose radio option (.*) on the 'Are any of the seals broken\?' page$
  def and(?I)?chooseRadioOptionXOnThe'AreAnyOfTheSealsBroken\?'Page(answer: String): Unit = {
    SealsBrokenPage
          .loadPage()
          .select(answer)
          .submitPage()
  }

  // ^(?:I )?click the Continue button on the 'Enter the discrepancies between the transit movement and unloading permission' page$
  def and(?I)?clickTheContinueButtonOnThe'EnterTheDiscrepanciesBetweenTheTransitMovementAndUnloadingPermission'Page(): Unit = {
    ConsignmentCrossCheckPage
          .loadPage()
          .submitPage()
  }

  // ^(?:I )?click the 'More details' link for house consignment (.+) on the 'Enter the discrepancies between the transit movement and unloading permission' page$
  def given(?I)?clickThe'MoreDetails'LinkForHouseConsignment(.+)OnThe'EnterTheDiscrepanciesBetweenTheTransitMovementAndUnloadingPermission'Page(index: String): Unit = {
    ConsignmentCrossCheckPage
          .loadPage()
          .selectAction(index)
  }

  // ^(?:I )?click the Back to summary button on the 'House consignment (.*)' page$
  def given(?I)?clickTheBackToSummaryButtonOnThe'HouseConsignmentX'Page(houseConsignmentNumber: String): Unit = {
    HouseConsignmentPage
          .loadPage(houseConsignmentNumber)
          .submitPage()
  }

  // ^(?:I )?choose radio option (.*) on the 'Were there any discrepancies between the transit movement and unloading permission\?' page$
  def and(?I)?chooseRadioOptionXOnThe'WereThereAnyDiscrepanciesBetweenTheTransitMovementAndUnloadingPermission\?'Page(answer: String): Unit = {
    DifferencesPage
          .loadPage()
          .select(answer)
          .submitPage()
  }

  // ^(?:I )?choose radio option (.*) on the 'Do you want to use the revised unloading procedure\?' page$
  def and(?I)?chooseRadioOptionXOnThe'DoYouWantToUseTheRevisedUnloadingProcedure\?'Page(answer: String): Unit = {
    IsRevisedUnloadingProcedurePage
          .loadPage()
          .select(answer)
          .submitPage()
  }

  // ^(?:I )?choose radio option (.*) on the 'Conditions for using the revised unloading procedure' page$
  def and(?I)?chooseRadioOptionXOnThe'ConditionsForUsingTheRevisedUnloadingProcedure'Page(answer: String): Unit = {
    IsRevisedProcedureConditionPage
          .loadPage()
          .select(answer)
          .submitPage()
  }

  // ^(?:I )?choose radio option (.*) on the 'Are the goods too large to fit into a container\?' page$
  def and(?I)?chooseRadioOptionXOnThe'AreTheGoodsTooLargeToFitIntoAContainer\?'Page(answer: String): Unit = {
    GoodsTooLargeToFitIntoContainerPage
          .loadPage()
          .select(answer)
          .submitPage()
  }

  // ^(?:I )?choose radio option (.*) on the 'Has the external seal been replaced by a customs authority\?' page$
  def and(?I)?chooseRadioOptionXOnThe'HasTheExternalSealBeenReplacedByACustomsAuthority\?'Page(answer: String): Unit = {
    HaveSealsBeenReplacedByCustomsPage
          .loadPage()
          .select(answer)
          .submitPage()
  }

  // ^(?:I )?click the Continue button on the 'Check the goods and note any discrepancies' page$
  def and(?I)?clickTheContinueButtonOnThe'CheckTheGoodsAndNoteAnyDiscrepancies'Page(): Unit = {
    CheckGoodsAndNoteDiscrepanciesPage
          .loadPage()
          .submitPage()
  }

  // ^(?:I )?click the Continue button on the 'You cannot use the revised unloading procedure' page$
  def and(?I)?clickTheContinueButtonOnThe'YouCannotUseTheRevisedUnloadingProcedure'Page(): Unit = {
    RevisedUnloadingProcedurePage
          .loadPage()
          .submitPage()
  }

  // ^(?:I )?click the Continue button on the 'Unload the goods and note any discrepancies' page$
  def and(?I)?clickTheContinueButtonOnThe'UnloadTheGoodsAndNoteAnyDiscrepancies'Page(): Unit = {
    UnloadAndNoteDiscrepanciesPage
          .loadPage()
          .submitPage()
  }

  // ^(?:I )?click the Continue button on the 'Download the unloading permission' page$
  def and(?I)?clickTheContinueButtonOnThe'DownloadTheUnloadingPermission'Page(): Unit = {
    DownloadUnloadingPermissionsPage
          .loadPage()
          .submitPage()
  }

  // ^(?:I )?click the Continue button on the 'Take a photograph of the external seal before it is broken' page$
  def and(?I)?clickTheContinueButtonOnThe'TakeAPhotographOfTheExternalSealBeforeItIsBroken'Page(): Unit = {
    TakeAPhotographOfSealPage
          .loadPage()
          .submitPage()
  }

  // ^(?:I )?(?:should )?be on the 'Unloading remarks sent' page$
  def then(?I)?(?should)?beOnThe'UnloadingRemarksSent'Page(): Unit = {
    UnloadingConfirmationPage
          .loadPage()
  }

  // ^(?:I )?(?:should )?be on the 'You cannot send these unloading remarks' page$
  def then(?I)?(?should)?beOnThe'YouCannotSendTheseUnloadingRemarks'Page(): Unit = {
    CannotSendUnloadingPage
          .loadPage()
  }

  // ^(?:I )?click the 'Documents' link for Documents (.+) on the 'Cross-check the transit with this declaration summary' page$
  def given(?I)?clickThe'Documents'LinkForDocuments(.+)OnThe'Cross-checkTheTransitWithThisDeclarationSummary'Page(index: String): Unit = {
    ConsignmentCrossCheckPage
          .loadPage()
          .selectDocAction(index)
  }

  // ^(?:I )?click the Change link for (.+) on the 'Cross-check the transit with this declaration summary' page$
  def and(?I)?clickTheChangeLinkFor(.+)OnThe'Cross-checkTheTransitWithThisDeclarationSummary'Page(text: String): Unit = {
    ConsignmentCrossCheckPage
          .clickLinkById(text)
  }

  // ^(?:I )?click the (.+) link for section (.+) (.+)$
  def and(?I)?clickThe(.+)LinkForSection(.+)(.+)(changeLinkText: String, section: String, index: String): Unit = {
    ConsignmentCrossCheckPage
          .loadPage()
          .selectSection(section)
          .selectSectionChild(section, index)
          .clickLinkByIdBySection(changeLinkText)
  }

  // ^(?:I )?click the add or remove house consignment link$
  def and(?I)?clickTheAddOrRemoveHouseConsignmentLink(): Unit = {
    ConsignmentCrossCheckPage
          .loadPage()
          .selectAddRemoveHouseConsignment
  }

  // ^(?:I )?click the add or remove countries of routing link$
  def and(?I)?clickTheAddOrRemoveCountriesOfRoutingLink(): Unit = {
    ConsignmentCrossCheckPage
          .loadPage()
          .selectAddRemoveCountriesOfRouting
  }

  // ^(?:I )?click the (.+) link for (.+) in House consignment (.+)$
  def and(?I)?clickThe(.+)LinkFor(.+)InHouseConsignment(.+)(changeLinkText: String, section: String, index: String): Unit = {
    HouseConsignmentPage
          .loadPage(index)
          .selectSection(section)
          .selectItem(section)
          .clickLinkByIdBySection(changeLinkText)
  }

  // ^(?:I )?click the Change (.+) link for sub-section (.+) of section (.+) (.+)$
  def and(?I)?clickTheChange(.+)LinkForSub-section(.+)OfSection(.+)(.+)(changeLinkText: String, subSection: String, section: String, index: String): Unit = {
    ConsignmentCrossCheckPage
          .loadPage()
          .selectSection(section)
          .selectSectionChild(section, index)
          .selectSubSection(subSection)
          .clickLinkByIdBySection(changeLinkText)
  }

  // ^(?:I )?click the (.+) link in House consignment (.+) sub-section (.+) of section (.+)$
  def and(?I)?clickThe(.+)LinkInHouseConsignment(.+)Sub-section(.+)OfSection(.+)(changeLinkText: String, index: String, subSection: String, section: String): Unit = {
    HouseConsignmentPage
          .loadPage(index)
          .selectSection(section)
          .selectItem(section)
          .selectSectionChild(subSection)
          .selectSubSection(subSection)
          .clickLinkByIdBySection(changeLinkText)
  }

  // ^(?:I )?select (.+) on the 'What is the new additional reference type\?' page$
  def and(?I)?select(.+)OnThe'WhatIsTheNewAdditionalReferenceType\?'Page(answer: String): Unit = {
    NewAdditionalReferenceTypePage
          .loadPage()
          .select(answer)
          .submitPage()
  }

  // ^(?:I )?select (.+) on the 'What is the new additional reference type for item 1 in house consignment 1\?' page$
  def and(?I)?select(.+)OnThe'WhatIsTheNewAdditionalReferenceTypeForItem1InHouseConsignment1\?'Page(answer: String): Unit = {
    NewItemLevelAdditionalReferenceTypePage
          .loadPage()
          .select(answer)
          .submitPage()
  }

  // ^(?:I )?enter additional reference (.+) on the 'What is the new additional reference number\?' page$
  def and(?I)?enterAdditionalReference(.+)OnThe'WhatIsTheNewAdditionalReferenceNumber\?'Page(answer: String): Unit = {
    NewAdditionalReferenceNumberPage
            .loadPage()
            .fillInput(answer)
            .submitPage()
  }

  // ^(?:I )?enter additional reference (.+) on the 'What is the new additional reference number for item 1 in house consignment 1\?' page$
  def and(?I)?enterAdditionalReference(.+)OnThe'WhatIsTheNewAdditionalReferenceNumberForItem1InHouseConsignment1\?'Page(answer: String): Unit = {
    NewItemLevelAdditionalReferenceNumberPage
          .loadPage()
          .fillInput(answer)
          .submitPage()
  }

  // ^(?:I )?select (.+) on the 'What is the new package type for item 1 in house consignment 1\?' page$
  def and(?I)?select(.+)OnThe'WhatIsTheNewPackageTypeForItem1InHouseConsignment1\?'Page(answer: String): Unit = {
    NewItemLevelPackageTypePage
          .loadPage()
          .select(answer)
          .submitPage()
  }

  // ^(?:I )?enter shipping mark (.+) on the 'What is the new shipping mark for item 1 in house consignment 1\?' page$
  def and(?I)?enterShippingMark(.+)OnThe'WhatIsTheNewShippingMarkForItem1InHouseConsignment1\?'Page(answer: String): Unit = {
    NewItemLevelPackageShippingMarkPage
          .loadPage()
          .fillInput(answer)
          .submitPage()
  }

  // ^(?:I )?select (.+) on the 'What is the new document type\?' page$
  def and(?I)?select(.+)OnThe'WhatIsTheNewDocumentType\?'Page(answer: String): Unit = {
    NewDocumentTypePage
          .loadPage()
          .select(answer)
          .submitPage()
  }

  // ^(?:I )?enter reference number (.+) on the 'What is the document’s new reference number\?' page$
  def and(?I)?enterReferenceNumber(.+)OnThe'WhatIsTheDocument’sNewReferenceNumber\?'Page(answer: String): Unit = {
    DocumentsNewReferenceNumberPage
            .loadPage()
            .fillInput(answer)
            .submitPage()
  }

  // ^(?:I )?enter additional information (.+) on the 'Enter the new additional information\?' page$
  def and(?I)?enterAdditionalInformation(.+)OnThe'EnterTheNewAdditionalInformation\?'Page(answer: String): Unit = {
    NewAdditionalInformationPage
            .loadPage()
            .fillInput(answer)
            .submitPage()
  }

  // ^(?:I )?choose radio option (.*) on the 'Which identification do you want to use for the new departure means of transport\?' page$
  def and(?I)?chooseRadioOptionXOnThe'WhichIdentificationDoYouWantToUseForTheNewDepartureMeansOfTransport\?'Page(answer: String): Unit = {
    IdentificationForNewDepartureMeansOfTransportPage
          .loadPage()
          .select(answer)
          .submitPage()
  }

  // ^(?:I )?enter identification number (.+) on the 'What is the identification number for the new departure means of transport\?' page$
  def and(?I)?enterIdentificationNumber(.+)OnThe'WhatIsTheIdentificationNumberForTheNewDepartureMeansOfTransport\?'Page(answer: String): Unit = {
    IdentificationNumberForNewDepartureMeansOfTransportPage
          .loadPage()
          .fillInput(answer)
          .submitPage()
  }

  // ^(?:I )?select (.+) on the 'What country is the new departure means of transport registered to\?' page$
  def and(?I)?select(.+)OnThe'WhatCountryIsTheNewDepartureMeansOfTransportRegisteredTo\?'Page(answer: String): Unit = {
    CountryForNewDepartureMeansOfTransportPage
            .loadPage()
            .select(answer)
            .submitPage()
  }

  // ^(?:I )?choose radio option (.*) on the 'You have added (.*) documen(?:t |ts )to all items' page$
  def and(?I)?chooseRadioOptionXOnThe'YouHaveAddedXDocumen(?t|ts)toAllItems'Page(answer: String, numberOfDocuments: String): Unit = {
    DocumentsAddAnotherDocumentsPage
            .loadPage(numberOfDocuments)
            .select(answer)
            .submitPage()
  }

  // ^(?:I )?Add (.+) on the 'What type of document do you want to add\?' page$
  def and(?I)?Add(.+)OnThe'WhatTypeOfDocumentDoYouWantToAdd\?'Page(answer: String): Unit = {
    AddDocumentTypePage
          .loadPage()
          .select(answer)
          .submitPage()
  }

  // ^(?:I )?Add (.+) on the 'What type of document do you want to add for item (.*) in house consignment 1\?' page$
  def and(?I)?Add(.+)OnThe'WhatTypeOfDocumentDoYouWantToAddForItemXInHouseConsignment1\?'Page(answer: String, itemIndex: String): Unit = {
    HouseConsignmentItemAddDocumentTypePage
          .loadPage(itemIndex)
          .select(answer)
          .submitPage()
  }

  // ^(?:I )?select (.+) on the 'What type of document do you want to add for house consignment (.*)\?' page$
  def and(?I)?select(.+)OnThe'WhatTypeOfDocumentDoYouWantToAddForHouseConsignmentX\?'Page(answer: String, houseConsignmentIndex: String): Unit = {
    AddDocumentTypeForHouseConsignmentPage
            .loadPage(houseConsignmentIndex)
            .select(answer)
            .submitPage()
  }

  // ^(?:I )?enter reference number (.+) on 'What is the document’s reference number for item (.*) in house consignment 1\?' page$
  def and(?I)?enterReferenceNumber(.+)On'WhatIsTheDocument’sReferenceNumberForItemXInHouseConsignment1\?'Page(answer: String, itemIndex: String): Unit = {
    HouseConsignmentItemDocsReferenceNumberPage
          .loadPage(itemIndex)
          .fillInput(answer)
          .submitPage()
  }

  // ^(?:I )?enter reference number (.+) on 'What is the document’s reference number\?' page$
  def and(?I)?enterReferenceNumber(.+)On'WhatIsTheDocument’sReferenceNumber\?'Page(answer: String): Unit = {
    DocumentsReferenceNumberPage
            .loadPage()
            .fillInput(answer)
            .submitPage()
  }

  // ^(?:I )?choose radio option (.*) on the documents 'Do you want to add any additional information for this document\?' page$
  def and(?I)?chooseRadioOptionXOnTheDocuments'DoYouWantToAddAnyAdditionalInformationForThisDocument\?'Page(answer: String): Unit = {
    AddAdditionalInformationForDocumentPage
          .loadPage()
          .select(answer)
          .submitPage()
  }

  // ^(?:I )?enter additional information (.+) on documents 'Enter the additional information\?' page$
  def and(?I)?enterAdditionalInformation(.+)OnDocuments'EnterTheAdditionalInformation\?'Page(answer: String): Unit = {
    AdditionalInformationPage
            .loadPage()
            .fillInput(answer)
            .submitPage()
  }

  // ^(?:I )?enter additional information (.+) on documents 'Enter the additional information for item (.*) in house consignment 1' page$
  def and(?I)?enterAdditionalInformation(.+)OnDocuments'EnterTheAdditionalInformationForItemXInHouseConsignment1'Page(answer: String, itemIndex: String): Unit = {
    HouseConsignmentItemAdditionalInformationPage
          .loadPage(itemIndex)
          .fillInput(answer)
          .submitPage()
  }

  // ^(?:I )?add additional information (.+) on documents 'Enter the additional information in house consignment (.*)' page$
  def and(?I)?addAdditionalInformation(.+)OnDocuments'EnterTheAdditionalInformationInHouseConsignmentX'Page(answer: String, houseConsignmentIndex: String): Unit = {
    HouseConsignmentAdditionalInformationPage
          .loadPage(houseConsignmentIndex)
          .fillInput(answer)
          .submitPage()
  }

  // ^(?:I )?enter reference (.*) on the 'What is the additional reference number\?' page$
  def and(?I)?enterReferenceXOnThe'WhatIsTheAdditionalReferenceNumber\?'Page(answer: String): Unit = {
    AddNewConsignmentAdditionalReferenceNumberPage
          .loadPage()
          .fillInput(answer)
          .submitPage()
  }

  // ^(?:I )?choose to click on the (.*) link on the 'You have added (.*) documen(?:t |ts )to all items' page$
  def and(?I)?chooseToClickOnTheXLinkOnThe'YouHaveAddedXDocumen(?t|ts)toAllItems'Page(sectionLink: String, numberOfDocumentsAdded: String): Unit = {
    DocumentsAddAnotherDocumentsPage
          .loadPage(numberOfDocumentsAdded)
          .clickByPartialLinkText(sectionLink)
  }

  // ^(?:I )?choose radio option (.*) on the documents 'Are you sure you want to remove this document from all items\?' page$
  def and(?I)?chooseRadioOptionXOnTheDocuments'AreYouSureYouWantToRemoveThisDocumentFromAllItems\?'Page(answer: String): Unit = {
    RemoveDocumentFromAllItemsPage
          .loadPage()
          .select(answer)
          .submitPage()
  }

  // ^(?:I )?choose radio option (.*) on the documents 'Do you want to add the type of identification for the departure means of transport\?' page$
  def and(?I)?chooseRadioOptionXOnTheDocuments'DoYouWantToAddTheTypeOfIdentificationForTheDepartureMeansOfTransport\?'Page(answer: String): Unit = {
    AddIdentificationTypeForDepartureMeansOfTransportPage
          .loadPage()
          .select(answer)
          .submitPage()
  }

  // ^(?:I )?choose radio option (.*) on the 'Which identification do you want to use for the departure means of transport\?' page$
  def and(?I)?chooseRadioOptionXOnThe'WhichIdentificationDoYouWantToUseForTheDepartureMeansOfTransport\?'Page(answer: String): Unit = {
    IdentificationForDepartureMeansOfTransportPage
          .loadPage()
          .select(answer)
          .submitPage()
  }

  // ^(?:I )?choose radio option (.*) on the 'Which identification do you want to use for the departure means of transport in house consignment (.*)\?' page$
  def and(?I)?chooseRadioOptionXOnThe'WhichIdentificationDoYouWantToUseForTheDepartureMeansOfTransportInHouseConsignmentX\?'Page(answer: String, houseConsignmentIndex: String): Unit = {
    HouseConsignmentIdentificationForDepartureMeansOfTransportPage
          .loadPage(houseConsignmentIndex)
          .select(answer)
          .submitPage()
  }

  // ^(?:I )?select (.+) on the 'What type of additional reference do you want to add for item (.*) in house consignment 1\?' page$
  def and(?I)?select(.+)OnThe'WhatTypeOfAdditionalReferenceDoYouWantToAddForItemXInHouseConsignment1\?'Page(answer: String, itemIndex: String): Unit = {
    AdditionalReferenceHouseConsignmentItemTypePage
          .loadPage(itemIndex)
          .select(answer)
          .submitPage()
  }

  // ^(?:I )?choose (.+) on the 'What type of additional reference do you want to add for house consignment (.*)\?' page$
  def and(?I)?choose(.+)OnThe'WhatTypeOfAdditionalReferenceDoYouWantToAddForHouseConsignmentX\?'Page(answer: String, itemIndex: String): Unit = {
    AdditionalReferenceHouseConsignmentTypePage
          .loadPage(itemIndex)
          .select(answer)
          .submitPage()
  }

  // ^(?:I )?enter additional reference (.*) on the 'What is the additional reference number for item (.*) in house consignment 1\?' page$
  def and(?I)?enterAdditionalReferenceXOnThe'WhatIsTheAdditionalReferenceNumberForItemXInHouseConsignment1\?'Page(answer: String, itemIndex: String): Unit = {
    HouseConsignmentItemAddAdditionalReferenceNumberPage
          .loadPage(itemIndex)
          .fillInput(answer)
          .submitPage()
  }

  // ^(?:I )?select (.+) on the 'What type of package are you using for item (.*) in house consignment 1\?' page$
  def and(?I)?select(.+)OnThe'WhatTypeOfPackageAreYouUsingForItemXInHouseConsignment1\?'Page(answer: String, itemIndex: String): Unit = {
    HouseConsignmentItemPackageTypePage
          .loadPage(itemIndex)
          .select(answer)
          .submitPage()
  }

  // ^(?:I )?enter (.*) on the 'What is the shipping mark for item (.*) in house consignment 1\?' page$
  def and(?I)?enterXOnThe'WhatIsTheShippingMarkForItemXInHouseConsignment1\?'Page(answer: String, itemIndex: String): Unit = {
    HouseConsignmentItemPackagesShippingMarkPage
            .loadPage(itemIndex)
            .fillInput(answer)
            .submitPage()
  }

  // ^(?:I )?choose radio option (.*) on the documents 'Do you want to add an identification number for this vehicle\?' page$
  def and(?I)?chooseRadioOptionXOnTheDocuments'DoYouWantToAddAnIdentificationNumberForThisVehicle\?'Page(answer: String): Unit = {
    AddIdentificationNumberForDepartureMeansOfTransportPage
          .loadPage()
          .select(answer)
          .submitPage()
  }

  // ^(?:I )?enter identification number (.+) on 'What is the identification number for this vehicle\?' page$
  def and(?I)?enterIdentificationNumber(.+)On'WhatIsTheIdentificationNumberForThisVehicle\?'Page(answer: String): Unit = {
    IdentificationNumberForDepartureTransportMeansPage
            .loadPage()
            .fillInput(answer)
            .submitPage()
  }

  // ^(?:I )?choose radio option (.*) on the documents 'Do you want to add the registered country for this vehicle\?' page$
  def and(?I)?chooseRadioOptionXOnTheDocuments'DoYouWantToAddTheRegisteredCountryForThisVehicle\?'Page(answer: String): Unit = {
    AddRegisterCountryForDepartureMeansOfTransportPage
          .loadPage()
          .select(answer)
          .submitPage()
  }

  // ^(?:I )?select (.+) on the 'What country is this vehicle registered to\?' page$
  def and(?I)?select(.+)OnThe'WhatCountryIsThisVehicleRegisteredTo\?'Page(answer: String): Unit = {
    CountryTypeVehicleRegisteredPage
          .loadPage()
          .select(answer)
          .submitPage()
  }

  // ^(?:I )?choose to click on the (.*) link on the 'You have added (.*) departure means of transport' page$
  def and(?I)?chooseToClickOnTheXLinkOnThe'YouHaveAddedXDepartureMeansOfTransport'Page(sectionLink: String, numberOfDeparturesAdded: String): Unit = {
    AddAnotherDepartureMeansOfTransportPage
          .loadPage(numberOfDeparturesAdded)
          .clickByPartialLinkText(sectionLink)
  }

  // ^(?:I )?choose radio option (.*) on the documents 'Are you sure you want to remove departure means of transport (.+)\?' page$
  def and(?I)?chooseRadioOptionXOnTheDocuments'AreYouSureYouWantToRemoveDepartureMeansOfTransport(.+)\?'Page(answer: String, removeCount: String): Unit = {
    RemoveDepartureMeansOfTransportPage
          .loadPage(removeCount)
          .select(answer)
          .submitPage()
  }

  // ^(?:I )?choose radio option (.*) on the 'You have added (.*) departure means of transport' page$
  def and(?I)?chooseRadioOptionXOnThe'YouHaveAddedXDepartureMeansOfTransport'Page(answer: String, numberOfDocuments: String): Unit = {
    AddAnotherDepartureMeansOfTransportPage
            .loadPage(numberOfDocuments)
            .select(answer)
            .submitPage()
  }

  // ^(?:I )?enter identification number (.+) on 'What is the new container identification number\?' page$
  def and(?I)?enterIdentificationNumber(.+)On'WhatIsTheNewContainerIdentificationNumber\?'Page(answer: String): Unit = {
    NewContainerIdentificationNumberPage
            .loadPage()
            .fillInput(answer)
            .submitPage()
  }

  // ^(?:I )?enter seal identification number (.+) on the 'What is the new seal identification number\?' page$
  def and(?I)?enterSealIdentificationNumber(.+)OnThe'WhatIsTheNewSealIdentificationNumber\?'Page(answer: String): Unit = {
    NewSealIdentificationNumberPage
            .loadPage()
            .fillInput(answer)
            .submitPage()
  }

  // ^(?:I )?select (.+) on the 'Which item does this transport equipment apply to\?' page$
  def and(?I)?select(.+)OnThe'WhichItemDoesThisTransportEquipmentApplyTo\?'Page(answer: String): Unit = {
    ItemTypeForTransportEquipmentPage
            .loadPage()
            .select(answer)
            .submitPage()
  }

  // ^(?:I )?click continue 'You have applied (.*) item to transport equipment (.*)' page$
  def and(?I)?clickContinue'YouHaveAppliedXItemToTransportEquipmentX'Page(numberOfTransportEquipmentItemsInTitle: String,
      numberOfTransportEquipmentIncrementsInTitle: String): Unit = {
    TransportEquipmentIncrementPage
            .loadPage(numberOfTransportEquipmentItemsInTitle, numberOfTransportEquipmentIncrementsInTitle)
            .submitPage()
  }

  // ^(?:I )?choose radio option (.*) on the cross check 'You have added (.*) transport equipment' page$
  def and(?I)?chooseRadioOptionXOnTheCrossCheck'YouHaveAddedXTransportEquipment'Page(answer: String, numberOfTransportEquipment: String): Unit = {
    AddAnotherForTransportEquipmentPage
            .loadPage(numberOfTransportEquipment)
            .select(answer)
            .submitPage()
  }

  // ^(?:I )?choose radio option (.*) on the cross check 'Do you want to add a container identification number for the transport equipment\?' page$
  def and(?I)?chooseRadioOptionXOnTheCrossCheck'DoYouWantToAddAContainerIdentificationNumberForTheTransportEquipment\?'Page(answer: String): Unit = {
    OptionToAddContainerIdentificationNumberPage
          .loadPage()
          .select(answer)
          .submitPage()
  }

  // ^(?:I )?enter identification number (.+) on 'What is the container identification number\?' page$
  def and(?I)?enterIdentificationNumber(.+)On'WhatIsTheContainerIdentificationNumber\?'Page(answer: String): Unit = {
    ContainerIdentificationNumberforTransportEquipmentPage
            .loadPage()
            .fillInput(answer)
            .submitPage()
  }

  // ^(?:I )?choose radio option (.*) on the cross check 'Do you want to add a seal for the transport equipment\?' page$
  def and(?I)?chooseRadioOptionXOnTheCrossCheck'DoYouWantToAddASealForTheTransportEquipment\?'Page(answer: String): Unit = {
    OptionToAddSealPage
          .loadPage()
          .select(answer)
          .submitPage()
  }

  // ^(?:I )?enter identification number (.+) on 'What is the seal identification number\?' page$
  def and(?I)?enterIdentificationNumber(.+)On'WhatIsTheSealIdentificationNumber\?'Page(answer: String): Unit = {
    SealIdentificationNumberForTransportEquipmentPage
            .loadPage()
            .fillInput(answer)
            .submitPage()
  }

  // ^(?:I )?click (.*) on 'You have added (.*) sea(?: l|ls )to transport equipment (.*)' page$
  def and(?I)?clickXOn'YouHaveAddedXSea(?L|ls)toTransportEquipmentX'Page(answer: String,
      numberOfTransportEquipmentSealInTitle: String,
      numberOfTransportEquipmentIncrementsInTitle: String): Unit = {
    SealsIncrementPage
            .loadPage(numberOfTransportEquipmentSealInTitle, numberOfTransportEquipmentIncrementsInTitle)
            .clickByPartialLinkText(answer)
  }

  // ^(?:I )?choose radio option (.*) on 'Are you sure you want to remove this seal from transport equipment (.*)\?' page$
  def and(?I)?chooseRadioOptionXOn'AreYouSureYouWantToRemoveThisSealFromTransportEquipmentX\?'Page(answer: String, numberOfTransportEquipmentIncrementsInTitle: String): Unit = {
    RemoveSealFromTransportEquipmentPage
          .loadPage(numberOfTransportEquipmentIncrementsInTitle)
          .select(answer)
          .submitPage()
  }

  // ^(?:I )?click radio option (.*) on the 'You have added (.*) sea(?: l|ls )to transport equipment (.*)' page$
  def and(?I)?clickRadioOptionXOnThe'YouHaveAddedXSea(?L|ls)toTransportEquipmentX'Page(answer: String,
      numberOfTransportEquipmentSealInTitle: String,
      numberOfTransportEquipmentIncrementsInTitle: String): Unit = {
    SealsIncrementPage
            .loadPage(numberOfTransportEquipmentSealInTitle, numberOfTransportEquipmentIncrementsInTitle)
            .select(answer)
            .submitPage()
  }

  // ^(?:I )?choose radio option (.*) on the cross check 'Do any items apply to this transport equipment\?' page$
  def and(?I)?chooseRadioOptionXOnTheCrossCheck'DoAnyItemsApplyToThisTransportEquipment\?'Page(answer: String): Unit = {
    OptionToAddItemsApplyPage
          .loadPage()
          .select(answer)
          .submitPage()
  }

  // ^(?:I )?click (.*) on 'You have applied (.*) item to transport equipment (.*)' page$
  def and(?I)?clickXOn'YouHaveAppliedXItemToTransportEquipmentX'Page(answer: String,
      numberOfTransportEquipmentSealInTitle: String,
      numberOfTransportEquipmentIncrementsInTitle: String): Unit = {
    TransportEquipmentIncrementPage
            .loadPage(numberOfTransportEquipmentSealInTitle, numberOfTransportEquipmentIncrementsInTitle)
            .clickByPartialLinkText(answer)
  }

  // ^(?:I )?choose radio option (.*) on the 'Are you sure you want to remove this item from transport equipment (.+)\?' page$
  def and(?I)?chooseRadioOptionXOnThe'AreYouSureYouWantToRemoveThisItemFromTransportEquipment(.+)\?'Page(answer: String, removeCount: String): Unit = {
    RemoveItemFromTransportEquipmentPage
          .loadPage(removeCount)
          .select(answer)
          .submitPage()
  }

  // ^(?:I )?choose to click on the (.*) link on the 'You have added (.*) transport equipment' page$
  def and(?I)?chooseToClickOnTheXLinkOnThe'YouHaveAddedXTransportEquipment'Page(sectionLink: String, numberOfTransportEquipAdded: String): Unit = {
    AddAnotherForTransportEquipmentPage
          .loadPage(numberOfTransportEquipAdded)
          .clickByPartialLinkText(sectionLink)
  }

  // ^(?:I )?choose radio option (.*) on the documents 'Are you sure you want to remove transport equipment (.+)\?' page$
  def and(?I)?chooseRadioOptionXOnTheDocuments'AreYouSureYouWantToRemoveTransportEquipment(.+)\?'Page(answer: String, removeCount: String): Unit = {
    RemoveTransportEquipmentFromCorssCheckPage
          .loadPage(removeCount)
          .select(answer)
          .submitPage()
  }

  // ^(?:I )?click radio option (.*) on the 'You have applied (.*) ite(?: m|ms )to transport equipment (.*)' page$
  def and(?I)?clickRadioOptionXOnThe'YouHaveAppliedXIte(?M|ms)toTransportEquipmentX'Page(answer: String,
      numberOfTransportEquipmentItemInTitle: String,
      numberOfTransportEquipmentIncrementsInTitle: String): Unit = {
    TransportEquipmentIncrementPage
            .loadPage(numberOfTransportEquipmentItemInTitle, numberOfTransportEquipmentIncrementsInTitle)
            .select(answer)
            .submitPage()
  }

  // ^(?:I )?enter number (.+) on 'What is the new gross weight of item (.+) in house consignment 1\?' page$
  def and(?I)?enterNumber(.+)On'WhatIsTheNewGrossWeightOfItem(.+)InHouseConsignment1\?'Page(answer: String, index: String): Unit = {
    ChangeGrossWeightPage
            .loadPage(index)
            .fillInput(answer)
            .submitPage()
  }

  // ^(?:I )?enter number (.+) on 'What is the gross weight of item (.+) in house consignment 1\?' page$
  def and(?I)?enterNumber(.+)On'WhatIsTheGrossWeightOfItem(.+)InHouseConsignment1\?'Page(answer: String, index: String): Unit = {
    EnterGrossWeightPage
            .loadPage(index)
            .fillInput(answer)
            .submitPage()
  }

  // ^(?:I )?choose radio option (.*) on the 'Are you sure you want to remove the gross weight from item 1 in house consignment 1\?' page$
  def and(?I)?chooseRadioOptionXOnThe'AreYouSureYouWantToRemoveTheGrossWeightFromItem1InHouseConsignment1\?'Page(answer: String): Unit = {
    RemoveGrossWeightsPage
          .loadPage()
          .select(answer)
          .submitPage()
  }

  // ^(?:I )?enter number (.+) on 'What is the new net weight of item (.+) in house consignment 1\?' page$
  def and(?I)?enterNumber(.+)On'WhatIsTheNewNetWeightOfItem(.+)InHouseConsignment1\?'Page(answer: String, index: String): Unit = {
    ChangeNetWeightPage
            .loadPage(index)
            .fillInput(answer)
            .submitPage()
  }

  // ^(?:I )?enter number (.+) on 'What is the net weight of item (.+) in house consignment 1\?' page$
  def and(?I)?enterNumber(.+)On'WhatIsTheNetWeightOfItem(.+)InHouseConsignment1\?'Page(answer: String, index: String): Unit = {
    EnterNetWeightPage
            .loadPage(index)
            .fillInput(answer)
            .submitPage()
  }

  // ^(?:I )?choose radio option (.*) on the 'Are you sure you want to remove the net weight from item 1 in house consignment 1\?' page$
  def and(?I)?chooseRadioOptionXOnThe'AreYouSureYouWantToRemoveTheNetWeightFromItem1InHouseConsignment1\?'Page(answer: String): Unit = {
    RemoveNetWeightsPage
          .loadPage()
          .select(answer)
          .submitPage()
  }

  // ^(?:I )?enter number (.+) on 'What is the new Customs Union and Statistics CUS code for item (.+) in house consignment 1\?' page$
  def and(?I)?enterNumber(.+)On'WhatIsTheNewCustomsUnionAndStatisticsCUSCodeForItem(.+)InHouseConsignment1\?'Page(answer: String, index: String): Unit = {
    ChangeCUSCodePage
          .loadPage(index)
          .fillInput(answer)
          .submitPage()
  }

  // ^(?:I )?enter number (.+) on 'What is the Customs Union and Statistics code for item (.+) in house consignment (.+)\?' page$
  def and(?I)?enterNumber(.+)On'WhatIsTheCustomsUnionAndStatisticsCodeForItem(.+)InHouseConsignment(.+)\?'Page(answer: String, itemIndex: String, hcIndex: String): Unit = {
    EnterCUSCodePage
          .loadPage(itemIndex, hcIndex)
          .fillInput(answer)
          .submitPage()
  }

  // ^(?:I )?enter number (.+) on 'What is the new commodity code for item (.+) in house consignment 1\?' page$
  def and(?I)?enterNumber(.+)On'WhatIsTheNewCommodityCodeForItem(.+)InHouseConsignment1\?'Page(answer: String, index: String): Unit = {
    ChangeCommodityCodePage
          .loadPage(index)
          .fillInput(answer)
          .submitPage()
  }

  // ^(?:I )?enter number (.+) on 'What is the commodity code for item (.+) in house consignment 1\?' page$
  def and(?I)?enterNumber(.+)On'WhatIsTheCommodityCodeForItem(.+)InHouseConsignment1\?'Page(answer: String, index: String): Unit = {
    EnterCommodityCodePage
          .loadPage(index)
          .fillInput(answer)
          .submitPage()
  }

  // ^(?:I )?choose radio option (.*) on the 'Are you sure you want to remove the commodity code from item 1 in house consignment 1\?' page$
  def and(?I)?chooseRadioOptionXOnThe'AreYouSureYouWantToRemoveTheCommodityCodeFromItem1InHouseConsignment1\?'Page(answer: String): Unit = {
    RemoveCommodityCodePage
          .loadPage()
          .select(answer)
          .submitPage()
  }

  // ^(?:I )?enter number (.+) on 'What is the new combined nomenclature code for item (.+) in house consignment 1\?' page$
  def and(?I)?enterNumber(.+)On'WhatIsTheNewCombinedNomenclatureCodeForItem(.+)InHouseConsignment1\?'Page(answer: String, index: String): Unit = {
    ChangeNomenclatureCodePage
          .loadPage(index)
          .fillInput(answer)
          .submitPage()
  }

  // ^(?:I )?enter number (.+) on 'What is the combined nomenclature code for item (.+) in house consignment 1\?' page$
  def and(?I)?enterNumber(.+)On'WhatIsTheCombinedNomenclatureCodeForItem(.+)InHouseConsignment1\?'Page(answer: String, index: String): Unit = {
    EnterNomenclatureCodePage
          .loadPage(index)
          .fillInput(answer)
          .submitPage()
  }

  // ^(?:I )?choose radio option (.*) on the 'Are you sure you want to remove the combined nomenclature code from item 1 in house consignment 1\?' page$
  def and(?I)?chooseRadioOptionXOnThe'AreYouSureYouWantToRemoveTheCombinedNomenclatureCodeFromItem1InHouseConsignment1\?'Page(answer: String): Unit = {
    RemoveNomenclatureCodePage
          .loadPage()
          .select(answer)
          .submitPage()
  }

  // ^(?:I )?click the (.+) link on house consignment for section (.+) (.+)$
  def and(?I)?clickThe(.+)LinkOnHouseConsignmentForSection(.+)(.+)(changeLinkText: String, section: String, index: String): Unit = {
    HouseConsignmentPage
          .loadPage(index)
          .selectItemSection(section)
          .clickLinkByIdBySection(changeLinkText)
  }

  // ^(?:I )?click radio option (.*) on the 'You have added (.*) ite(?:m |ms )for house consignment (.*)' page$
  def and(?I)?clickRadioOptionXOnThe'YouHaveAddedXIte(?m|ms)forHouseConsignmentX'Page(answer: String,
      numberOfItemInTitle: String,
      numberOfHouseConsignmentsInTitle: String): Unit = {
    HouseConsignmentIncrementPage
            .loadPage(numberOfItemInTitle, numberOfHouseConsignmentsInTitle)
            .select(answer)
            .submitPage()
  }

  // ^(?:I )?enter (.*) on the 'Enter the description of ite(?:m |ms )(.+) in house consignment (.*)' page$
  def and(?I)?enterXOnThe'EnterTheDescriptionOfIte(?m|ms)(.+)InHouseConsignmentX'Page(answer: String,
      numberOfItemInTitle: String,
      numberOfHouseConsignmentsInTitle: String): Unit = {
    EnterItemDescriptionPage
            .loadPage(numberOfItemInTitle, numberOfHouseConsignmentsInTitle)
            .fillInput(answer)
            .submitPage()
  }

  // ^(?:I )?choose radio option (.*) on the 'Do you want to add the item’s gross weight\?' page$
  def and(?I)?chooseRadioOptionXOnThe'DoYouWantToAddTheItem’sGrossWeight\?'Page(answer: String): Unit = {
    OptionToAddItemGrossWeightPage
          .loadPage()
          .select(answer)
          .submitPage()
  }

  // ^(?:I )?choose radio option (.*) on the 'Do you want to add the item’s net weight\?' page$
  def and(?I)?chooseRadioOptionXOnThe'DoYouWantToAddTheItem’sNetWeight\?'Page(answer: String): Unit = {
    OptionToAddItemNetWeightPage
          .loadPage()
          .select(answer)
          .submitPage()
  }

  // ^(?:I )?choose radio option (.*) on the 'Do you want to add a Customs Union and Statistics (.*) code for the item\?' page$
  def and(?I)?chooseRadioOptionXOnThe'DoYouWantToAddACustomsUnionAndStatisticsXCodeForTheItem\?'Page(answer: String, index: String): Unit = {
    OptionToAddItemNewCusPage
          .loadPage(index)
          .select(answer)
          .submitPage()
  }

  // ^(?:I )?choose radio option (.*) on the 'Do you want to add a commodity code for the item\?' page$
  def and(?I)?chooseRadioOptionXOnThe'DoYouWantToAddACommodityCodeForTheItem\?'Page(answer: String): Unit = {
    OptionToAddItemCommodityCodePage
          .loadPage()
          .select(answer)
          .submitPage()
  }

  // ^(?:I )?choose radio option (.*) on the 'Do you want to add a combined nomenclature code for the item\?' page$
  def and(?I)?chooseRadioOptionXOnThe'DoYouWantToAddACombinedNomenclatureCodeForTheItem\?'Page(answer: String): Unit = {
    OptionToAddItemCombinedNomenclaturePage
          .loadPage()
          .select(answer)
          .submitPage()
  }

  // ^(?:I )?choose radio option (.*) on the 'Do you want to add a document for the item\?' page$
  def and(?I)?chooseRadioOptionXOnThe'DoYouWantToAddADocumentForTheItem\?'Page(answer: String): Unit = {
    OptionToAddItemDocumentPage
          .loadPage()
          .select(answer)
          .submitPage()
  }

  // ^(?:I )?choose radio option (.*) on the 'Do you want to add an additional reference for the item\?' page$
  def and(?I)?chooseRadioOptionXOnThe'DoYouWantToAddAnAdditionalReferenceForTheItem\?'Page(answer: String): Unit = {
    OptionToAddItemAdditionalReferencePage
          .loadPage()
          .select(answer)
          .submitPage()
  }

  // ^(?:I )?click (.*) on 'You have added (.*) documen(?: t|ts )to item (.+) in house consignment 1' page$
  def and(?I)?clickXOn'YouHaveAddedXDocumen(?T|ts)toItem(.+)InHouseConsignment1'Page(answer: String,
      numberOfDocumentsTitle: String,
      numberOfItemsInTitle: String): Unit = {
    HouseConsignmentDocumentIncrementPage
            .loadPage(numberOfDocumentsTitle, numberOfItemsInTitle)
            .clickByPartialLinkText(answer)
  }

  // ^(?:I )?click radio option (.*) on the 'Are you sure you want to remove this document from item (.+) in house consignment 1\?' page$
  def and(?I)?clickRadioOptionXOnThe'AreYouSureYouWantToRemoveThisDocumentFromItem(.+)InHouseConsignment1\?'Page(answer: String, numberOfItems: String): Unit = {
    HouseConsignmentDocumentRemoveIncrementPage
          .loadPage(numberOfItems)
          .select(answer)
          .submitPage()
  }

  // ^(?:I )?click (.*) on house consignment document 'You have added (.*) documen(?:t |ts )to item (.+) in house consignment 1' page$
  def and(?I)?clickXOnHouseConsignmentDocument'YouHaveAddedXDocumen(?t|ts)toItem(.+)InHouseConsignment1'Page(answer: String,
      numberOfDocumentsTitle: String,
      numberOfItemsInTitle: String): Unit = {
    HouseConsignmentDocumentIncrementPage
            .loadPage(numberOfDocumentsTitle, numberOfItemsInTitle)
            .select(answer)
            .submitPage()
  }

  // ^(?:I )?click (.*) on additional reference 'You have added (.+) additional referenc(?:e |es)for item (.+) in house consignment 1' page$
  def and(?I)?clickXOnAdditionalReference'YouHaveAdded(.+)AdditionalReferenc(?e|es)forItem(.+)InHouseConsignment1'Page(answer: String,
      numberOfAdditionalRefTitle: String,
      numberOfItemsInTitle: String): Unit = {
    HouseConsignmentAdditionalRefIncrementPage
            .loadPage(numberOfAdditionalRefTitle, numberOfItemsInTitle)
            .select(answer)
            .submitPage()
  }

  // ^(?:I )?click (.*) on the 'You have added (.+) additional referenc(?:e |es )for item (.+) in house consignment 1' page$
  def and(?I)?clickXOnThe'YouHaveAdded(.+)AdditionalReferenc(?e|es)forItem(.+)InHouseConsignment1'Page(answer: String,
      numberOfAdditionalRefTitle: String,
      numberOfItemsInTitle: String): Unit = {
    HouseConsignmentAdditionalRefIncrementPage
            .loadPage(numberOfAdditionalRefTitle, numberOfItemsInTitle)
            .clickByPartialLinkText(answer)
  }

  // ^(?:I )?choose radio option (.*) on the 'Do you want to add a package for the item\?' page$
  def and(?I)?chooseRadioOptionXOnThe'DoYouWantToAddAPackageForTheItem\?'Page(answer: String): Unit = {
    OptionToAddItemPackagePage
          .loadPage()
          .select(answer)
          .submitPage()
  }

  // ^(?:I )?choose radio option (.*) on the 'Do you want to add the quantity of this package\?' page$
  def and(?I)?chooseRadioOptionXOnThe'DoYouWantToAddTheQuantityOfThisPackage\?'Page(answer: String): Unit = {
    OptionToAddItemPackageQuantityPage
          .loadPage()
          .select(answer)
          .submitPage()
  }

  // ^(?:I )?enter (.*) on the 'How many of this package are you using\?' page$
  def and(?I)?enterXOnThe'HowManyOfThisPackageAreYouUsing\?'Page(answer: String): Unit = {
    PackagesTypeQuantityPage
          .loadPage()
          .fillInput(answer)
          .submitPage()
  }

  // ^(?:I )?enter (.*) on the 'How many of this package are you using for item (.*) in house consignment 1\?' page$
  def and(?I)?enterXOnThe'HowManyOfThisPackageAreYouUsingForItemXInHouseConsignment1\?'Page(answer: String, itemIndex: String): Unit = {
    HouseConsignmentItemPackagesTypeQuantityPage
          .loadPage(itemIndex)
          .fillInput(answer)
          .submitPage()
  }

  // ^(?:I )?click (.*) on house consignment package 'You have added (.*) typ(?:e |es )of packag(?:e |es )for item (.+) in house consignment 1' page$
  def and(?I)?clickXOnHouseConsignmentPackage'YouHaveAddedXTyp(?e|es)ofPackag(?e|es)forItem(.+)InHouseConsignment1'Page(answer: String,
      numberOfTypesInTitle: String,
      numberOfPackagesInTitle: String): Unit = {
    HouseConsignmentPackageIncrementPage
            .loadPage(numberOfTypesInTitle, numberOfPackagesInTitle)
            .select(answer)
            .submitPage()
  }

  // ^(?:I )?click (.*) on the house consignment package 'You have added (.*) typ(?:e |es )of packag(?:e |es )for item (.+) in house consignment 1' page$
  def and(?I)?clickXOnTheHouseConsignmentPackage'YouHaveAddedXTyp(?e|es)ofPackag(?e|es)forItem(.+)InHouseConsignment1'Page(answer: String,
      numberOfTypesInTitle: String,
      numberOfPackagesInTitle: String): Unit = {
    HouseConsignmentPackageIncrementPage
            .loadPage(numberOfTypesInTitle, numberOfPackagesInTitle)
            .clickByPartialLinkText(answer)
  }

  // ^(?:I )?click radio option (.*) on the 'Are you sure you want to remove this package from item (.+) in house consignment 1\?' page$
  def and(?I)?clickRadioOptionXOnThe'AreYouSureYouWantToRemoveThisPackageFromItem(.+)InHouseConsignment1\?'Page(answer: String, numberOfItems: String): Unit = {
    HouseConsignmentPackageRemoveIncrementPage
          .loadPage(numberOfItems)
          .select(answer)
          .submitPage()
  }

  // ^(?:I )?click option (.*) on the 'You have added (.*) ite(?:m |ms )for house consignment (.*)' page$
  def and(?I)?clickOptionXOnThe'YouHaveAddedXIte(?m|ms)forHouseConsignmentX'Page(answer: String,
      numberOfItemInTitle: String,
      numberOfHouseConsignmentsInTitle: String): Unit = {
    HouseConsignmentIncrementPage
            .loadPage(numberOfItemInTitle, numberOfHouseConsignmentsInTitle)
            .clickByPartialLinkText(answer)
  }

  // ^(?:I )?click radio option (.*) on item 'Are you sure you want to remove item (.+) from house consignment 1\?' page$
  def and(?I)?clickRadioOptionXOnItem'AreYouSureYouWantToRemoveItem(.+)FromHouseConsignment1\?'Page(answer: String, numberOfItems: String): Unit = {
    HouseConsignmentRemoveItemPage
          .loadPage(numberOfItems)
          .select(answer)
          .submitPage()
  }

  // ^(?:I )?choose radio option (.*) on the 'Do you have anything else to report\?' page$
  def and(?I)?chooseRadioOptionXOnThe'DoYouHaveAnythingElseToReport\?'Page(answer: String): Unit = {
    AnythingReportPage
          .loadPage()
          .select(answer)
          .submitPage()
  }

  // ^(?:I )?enter (.+) on the 'What do you want to report\?' page$
  def and(?I)?enter(.+)OnThe'WhatDoYouWantToReport\?'Page(answer: String): Unit = {
    OtherThingsReportPage
          .loadPage()
          .fillInput(answer)
          .submitPage()
  }

  // ^(?:I )?enter (.+) on the 'What is the identification number for the external seal\?' page$
  def and(?I)?enter(.+)OnThe'WhatIsTheIdentificationNumberForTheExternalSeal\?'Page(answer: String): Unit = {
    EnterOriginalSealsIdentificationCommentPage
            .loadPage()
            .fillInput(answer)
            .submitPage()
  }

  // ^(?:I )?enter (.+) on the 'What is the identification number for the replacement external seal\?' page$
  def and(?I)?enter(.+)OnThe'WhatIsTheIdentificationNumberForTheReplacementExternalSeal\?'Page(answer: String): Unit = {
    EnterAllSealsIdentificationNumbersPage
            .loadPage()
            .fillInput(answer)
            .submitPage()
  }

  // ^(?:I )?enter (.*) on the 'Enter your comments' page$
  def and(?I)?enterXOnThe'EnterYourComments'Page(answer: String): Unit = {
    EnterCommentsPage
          .loadPage()
          .fillInput(answer)
          .submitPage()
  }

  // ^(?:I )?click radio option (.*) on the 'You have added (.*) house consignment' page$
  def and(?I)?clickRadioOptionXOnThe'YouHaveAddedXHouseConsignment'Page(answer: String, numberOfHC: String): Unit = {
    HouseConsignmentAddAnotherHCPage
            .loadPage(numberOfHC)
            .select(answer)
            .submitPage()
  }

  // ^(?:I )?enter number (.+) on 'What is the gross weight of House Consignment (.+)\?' page$
  def and(?I)?enterNumber(.+)On'WhatIsTheGrossWeightOfHouseConsignment(.+)\?'Page(answer: String, index: String): Unit = {
    EnterGrossWeightHCPage
            .loadPage(index)
            .fillInput(answer)
            .submitPage()
  }

  // ^(?:I )?choose radio option (.*) on the 'Do you want to add a departure means of transport for house consignment (.*)\?' page$
  def and(?I)?chooseRadioOptionXOnThe'DoYouWantToAddADepartureMeansOfTransportForHouseConsignmentX\?'Page(answer: String, HCNumber: String): Unit = {
    HouseConsignmentAddDepartureTransportMeansPage
          .loadPage(HCNumber)
          .select(answer)
          .submitPage()
  }

  // ^(?:I )?choose radio option (.*) on the 'You have added (.*) departure means of transport for house consignment 2' page$
  def and(?I)?chooseRadioOptionXOnThe'YouHaveAddedXDepartureMeansOfTransportForHouseConsignment2'Page(answer: String, numberOfDepartureMeans: String): Unit = {
    AddAnotherDepartureMeansOfTransportHCPage
          .loadPage(numberOfDepartureMeans)
          .select(answer)
          .submitPage()
  }

  // ^(?:I )?choose radio option (.*) on the 'Do you want to add any documents for house consignment (.*)\?' page$
  def and(?I)?chooseRadioOptionXOnThe'DoYouWantToAddAnyDocumentsForHouseConsignmentX\?'Page(answer: String, HCNumber: String): Unit = {
    HouseConsignmentAddDocumentsPage
          .loadPage(HCNumber)
          .select(answer)
          .submitPage()
  }

  // ^(?:I )?choose radio option (.*) on the 'You have added (.*) documen(?:t |ts )to all items in house consignment 2' page$
  def and(?I)?chooseRadioOptionXOnThe'YouHaveAddedXDocumen(?t|ts)toAllItemsInHouseConsignment2'Page(answer: String, numberOfDocuments: String): Unit = {
    DocumentsAddAnotherDocumentsHCPage
          .loadPage(numberOfDocuments)
          .select(answer)
          .submitPage()
  }

  // ^(?:I )?choose radio option (.*) on the 'Do you want to add an additional reference for house consignment (.*)\?' page$
  def and(?I)?chooseRadioOptionXOnThe'DoYouWantToAddAnAdditionalReferenceForHouseConsignmentX\?'Page(answer: String, HCNumber: String): Unit = {
    HouseConsignmentAddAdditionalReferencePage
          .loadPage(HCNumber)
          .select(answer)
          .submitPage()
  }

  // ^(?:I )?click radio option (.*) on the 'You have added (.*) additional reference for house consignment 2' page$
  def and(?I)?clickRadioOptionXOnThe'YouHaveAddedXAdditionalReferenceForHouseConsignment2'Page(answer: String, numberOfReferences: String): Unit = {
    AdditionalReferenceAddAnotherHCPage
          .loadPage(numberOfReferences)
          .select(answer)
          .submitPage()
  }

  // ^(?:I )?choose radio option (.*) on the 'Do you want to add an item for house consignment (.*)\?' page$
  def and(?I)?chooseRadioOptionXOnThe'DoYouWantToAddAnItemForHouseConsignmentX\?'Page(answer: String, HCNumber: String): Unit = {
    HouseConsignmentAddItemPage
            .loadPage(HCNumber)
            .select(answer)
            .submitPage()
  }

  // ^(?:I )?click the (.*) link on the 'You have added (.*) house consignments' page$
  def and(?I)?clickTheXLinkOnThe'YouHaveAddedXHouseConsignments'Page(sectionLink: String, numberOfHCAdded: String): Unit = {
    HouseConsignmentAddAnotherHCPage
          .loadPage(numberOfHCAdded)
          .clickByPartialLinkText(sectionLink)
  }

  // ^(?:I )?click radio option (.*) on the 'Are you sure you want to remove house consignment (.+)\?' page$
  def and(?I)?clickRadioOptionXOnThe'AreYouSureYouWantToRemoveHouseConsignment(.+)\?'Page(answer: String, hcNumber: String): Unit = {
    HouseConsignmentRemoveHCPage
          .loadPage(hcNumber)
          .select(answer)
          .submitPage()
  }

  // ^(?:I )?select radio option (.*) on the 'You have added (.*) countr(?:y |ies )to the transit route' page$
  def and(?I)?selectRadioOptionXOnThe'YouHaveAddedXCountr(?y|ies)toTheTransitRoute'Page(answer: String, numberOfCountries: String): Unit = {
    CountryOfRoutingAddAnotherPage
            .loadPage(numberOfCountries)
            .select(answer)
            .submitPage()
  }

  // ^(?:I )?click on the (.*) link on the 'You have added (.*) countr(?:y |ies )to the transit route' page$
  def and(?I)?clickOnTheXLinkOnThe'YouHaveAddedXCountr(?y|ies)toTheTransitRoute'Page(sectionLink: String, numberOfCountries: String): Unit = {
    CountryOfRoutingAddAnotherPage
          .loadPage(numberOfCountries)
          .clickByPartialLinkText(sectionLink)
  }

  // ^(?:I )?select (.+) on the Unloading 'Which country do you want to add to the transit route\?' page$
  def and(?I)?select(.+)OnTheUnloading'WhichCountryDoYouWantToAddToTheTransitRoute\?'Page(answer: String): Unit = {
    CountryOfRoutingCountryPage
            .loadPage()
            .select(answer)
            .submitPage()
  }

  // ^(?:I )?select radio option (.*) on the 'Are you sure you want to remove this country from the transit route\?' page$
  def and(?I)?selectRadioOptionXOnThe'AreYouSureYouWantToRemoveThisCountryFromTheTransitRoute\?'Page(answer: String): Unit = {
    CountryOfRoutingRemoveCountryPage
          .loadPage()
          .select(answer)
          .submitPage()
  }

  // ^(?:I )?choose radio option (.*) on the 'Do you want to add a Unique Consignment Reference for this house consignment\?' page$
  def and(?I)?chooseRadioOptionXOnThe'DoYouWantToAddAUniqueConsignmentReferenceForThisHouseConsignment\?'Page(answer: String): Unit = {
    UCRForNewHouseConsignmentYesNoPage
          .loadPage()
          .select(answer)
          .submitPage()
  }

  // ^(?:I )?enter (.+) on the 'What is the Unique Consignment Reference for house consignment (.+)\?' page$
  def and(?I)?enter(.+)OnThe'WhatIsTheUniqueConsignmentReferenceForHouseConsignment(.+)\?'Page(answer: String, houseConsignmentIndex: String): Unit = {
    UCRForNewHouseConsignmentPage
          .loadPage(houseConsignmentIndex)
          .fillInput(answer)
          .submitPage()
  }

  // ^(?:I )?choose radio option (.*) on the 'Do you want to add a Unique Consignment Reference for this item\?' page$
  def and(?I)?chooseRadioOptionXOnThe'DoYouWantToAddAUniqueConsignmentReferenceForThisItem\?'Page(answer: String): Unit = {
    UCRForNewItemInHouseConsignmentYesNoPage
          .loadPage()
          .select(answer)
          .submitPage()
  }

  // ^(?:I )?enter reference (.+) on the 'What is the Unique Consignment Reference for item (.+) in house consignment 1\?' page$
  def and(?I)?enterReference(.+)OnThe'WhatIsTheUniqueConsignmentReferenceForItem(.+)InHouseConsignment1\?'Page(answer: String, index: String): Unit = {
    UCRForNewItemInHouseConsignmentPage
          .loadPage(index)
          .fillInput(answer)
          .submitPage()
  }

}
