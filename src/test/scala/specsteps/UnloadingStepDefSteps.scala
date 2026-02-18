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
  def thenIshouldBeOnTheDoYouWantToUseTheRevisedUnloadingProcedurePage(): Unit = {
    IsRevisedUnloadingProcedurePage
          .loadPage()
  }

  // ^(?:I )?should be on the 'Enter the discrepancies between the transit movement and unloading permission' page$
  def thenIshouldBeOnTheEnterTheDiscrepanciesBetweenTheTransitMovementAndUnloadingPermissionPage(): Unit = {
    ConsignmentCrossCheckPage
          .loadPage()
  }

  // ^(?:I )?should be on the 'House consignment (.+)' page$
  def thenIshouldBeOnTheHouseConsignmentPage(houseConsignments: String): Unit = {
    HouseConsignmentPage
          .loadPage(houseConsignments)
  }

  // ^(?:I )?fill in the date on the 'When were the goods unloaded\?' page$
  def andIfillInTheDateOnTheWhenWereTheGoodsUnloadedPage(): Unit = {
    GoodsUnloadedDatePage
          .loadPage()
          .fillInputs()
          .submitPage()
  }

  // ^(?:I )?choose radio option (.*) on the 'Have you fully or partially unloaded the goods\?' page$
  def andIchooseRadioOptionXOnTheHaveYouFullyOrPartiallyUnloadedTheGoodsPage(answer: String): Unit = {
    FullyOrPartiallyUnloadedPage
            .loadPage()
            .select(answer)
            .submitPage()
  }

  // ^(?:I )?choose radio option (.*) on the 'Are all the seal identification numbers or marks readable\?' page$
  def andIchooseRadioOptionXOnTheAreAllTheSealIdentificationNumbersOrMarksReadablePage(answer: String): Unit = {
    SealNumbersReadablePage
          .loadPage()
          .select(answer)
          .submitPage()
  }

  // ^(?:I )?choose radio option (.*) on the 'Are any of the seals broken\?' page$
  def andIchooseRadioOptionXOnTheAreAnyOfTheSealsBrokenPage(answer: String): Unit = {
    SealsBrokenPage
          .loadPage()
          .select(answer)
          .submitPage()
  }

  // ^(?:I )?click the Continue button on the 'Enter the discrepancies between the transit movement and unloading permission' page$
  def andIclickTheContinueButtonOnTheEnterTheDiscrepanciesBetweenTheTransitMovementAndUnloadingPermissionPage(): Unit = {
    ConsignmentCrossCheckPage
          .loadPage()
          .submitPage()
  }

  // ^(?:I )?click the 'More details' link for house consignment (.+) on the 'Enter the discrepancies between the transit movement and unloading permission' page$
  def givenIclickTheMoreDetailsLinkForHouseConsignmentOnTheEnterTheDiscrepanciesBetweenTheTransitMovementAndUnloadingPermissionPage(index: String): Unit = {
    ConsignmentCrossCheckPage
          .loadPage()
          .selectAction(index)
  }

  // ^(?:I )?click the Back to summary button on the 'House consignment (.*)' page$
  def givenIclickTheBackToSummaryButtonOnTheHouseConsignmentXPage(houseConsignmentNumber: String): Unit = {
    HouseConsignmentPage
          .loadPage(houseConsignmentNumber)
          .submitPage()
  }

  // ^(?:I )?choose radio option (.*) on the 'Were there any discrepancies between the transit movement and unloading permission\?' page$
  def andIchooseRadioOptionXOnTheWereThereAnyDiscrepanciesBetweenTheTransitMovementAndUnloadingPermissionPage(answer: String): Unit = {
    DifferencesPage
          .loadPage()
          .select(answer)
          .submitPage()
  }

  // ^(?:I )?choose radio option (.*) on the 'Do you want to use the revised unloading procedure\?' page$
  def andIchooseRadioOptionXOnTheDoYouWantToUseTheRevisedUnloadingProcedurePage(answer: String): Unit = {
    IsRevisedUnloadingProcedurePage
          .loadPage()
          .select(answer)
          .submitPage()
  }

  // ^(?:I )?choose radio option (.*) on the 'Conditions for using the revised unloading procedure' page$
  def andIchooseRadioOptionXOnTheConditionsForUsingTheRevisedUnloadingProcedurePage(answer: String): Unit = {
    IsRevisedProcedureConditionPage
          .loadPage()
          .select(answer)
          .submitPage()
  }

  // ^(?:I )?choose radio option (.*) on the 'Are the goods too large to fit into a container\?' page$
  def andIchooseRadioOptionXOnTheAreTheGoodsTooLargeToFitIntoAContainerPage(answer: String): Unit = {
    GoodsTooLargeToFitIntoContainerPage
          .loadPage()
          .select(answer)
          .submitPage()
  }

  // ^(?:I )?choose radio option (.*) on the 'Has the external seal been replaced by a customs authority\?' page$
  def andIchooseRadioOptionXOnTheHasTheExternalSealBeenReplacedByACustomsAuthorityPage(answer: String): Unit = {
    HaveSealsBeenReplacedByCustomsPage
          .loadPage()
          .select(answer)
          .submitPage()
  }

  // ^(?:I )?click the Continue button on the 'Check the goods and note any discrepancies' page$
  def andIclickTheContinueButtonOnTheCheckTheGoodsAndNoteAnyDiscrepanciesPage(): Unit = {
    CheckGoodsAndNoteDiscrepanciesPage
          .loadPage()
          .submitPage()
  }

  // ^(?:I )?click the Continue button on the 'You cannot use the revised unloading procedure' page$
  def andIclickTheContinueButtonOnTheYouCannotUseTheRevisedUnloadingProcedurePage(): Unit = {
    RevisedUnloadingProcedurePage
          .loadPage()
          .submitPage()
  }

  // ^(?:I )?click the Continue button on the 'Unload the goods and note any discrepancies' page$
  def andIclickTheContinueButtonOnTheUnloadTheGoodsAndNoteAnyDiscrepanciesPage(): Unit = {
    UnloadAndNoteDiscrepanciesPage
          .loadPage()
          .submitPage()
  }

  // ^(?:I )?click the Continue button on the 'Download the unloading permission' page$
  def andIclickTheContinueButtonOnTheDownloadTheUnloadingPermissionPage(): Unit = {
    DownloadUnloadingPermissionsPage
          .loadPage()
          .submitPage()
  }

  // ^(?:I )?click the Continue button on the 'Take a photograph of the external seal before it is broken' page$
  def andIclickTheContinueButtonOnTheTakeAPhotographOfTheExternalSealBeforeItIsBrokenPage(): Unit = {
    TakeAPhotographOfSealPage
          .loadPage()
          .submitPage()
  }

  // ^(?:I )?(?:should )?be on the 'Unloading remarks sent' page$
  def thenIshouldbeOnTheUnloadingRemarksSentPage(): Unit = {
    UnloadingConfirmationPage
          .loadPage()
  }

  // ^(?:I )?(?:should )?be on the 'You cannot send these unloading remarks' page$
  def thenIshouldbeOnTheYouCannotSendTheseUnloadingRemarksPage(): Unit = {
    CannotSendUnloadingPage
          .loadPage()
  }

  // ^(?:I )?click the 'Documents' link for Documents (.+) on the 'Cross-check the transit with this declaration summary' page$
  def givenIclickTheDocumentsLinkForDocumentsOnTheCrosscheckTheTransitWithThisDeclarationSummaryPage(index: String): Unit = {
    ConsignmentCrossCheckPage
          .loadPage()
          .selectDocAction(index)
  }

  // ^(?:I )?click the Change link for (.+) on the 'Cross-check the transit with this declaration summary' page$
  def andIclickTheChangeLinkForOnTheCrosscheckTheTransitWithThisDeclarationSummaryPage(text: String): Unit = {
    ConsignmentCrossCheckPage
          .clickLinkById(text)
  }

  // ^(?:I )?click the (.+) link for section (.+) (.+)$
  def andIclickTheLinkForSection(changeLinkText: String, section: String, index: String): Unit = {
    ConsignmentCrossCheckPage
          .loadPage()
          .selectSection(section)
          .selectSectionChild(section, index)
          .clickLinkByIdBySection(changeLinkText)
  }

  // ^(?:I )?click the add or remove house consignment link$
  def andIclickTheAddOrRemoveHouseConsignmentLink(): Unit = {
    ConsignmentCrossCheckPage
          .loadPage()
          .selectAddRemoveHouseConsignment
  }

  // ^(?:I )?click the add or remove countries of routing link$
  def andIclickTheAddOrRemoveCountriesOfRoutingLink(): Unit = {
    ConsignmentCrossCheckPage
          .loadPage()
          .selectAddRemoveCountriesOfRouting
  }

  // ^(?:I )?click the (.+) link for (.+) in House consignment (.+)$
  def andIclickTheLinkForInHouseConsignment(changeLinkText: String, section: String, index: String): Unit = {
    HouseConsignmentPage
          .loadPage(index)
          .selectSection(section)
          .selectItem(section)
          .clickLinkByIdBySection(changeLinkText)
  }

  // ^(?:I )?click the Change (.+) link for sub-section (.+) of section (.+) (.+)$
  def andIclickTheChangeLinkForSubsectionOfSection(changeLinkText: String, subSection: String, section: String, index: String): Unit = {
    ConsignmentCrossCheckPage
          .loadPage()
          .selectSection(section)
          .selectSectionChild(section, index)
          .selectSubSection(subSection)
          .clickLinkByIdBySection(changeLinkText)
  }

  // ^(?:I )?click the (.+) link in House consignment (.+) sub-section (.+) of section (.+)$
  def andIclickTheLinkInHouseConsignmentSubsectionOfSection(changeLinkText: String, index: String, subSection: String, section: String): Unit = {
    HouseConsignmentPage
          .loadPage(index)
          .selectSection(section)
          .selectItem(section)
          .selectSectionChild(subSection)
          .selectSubSection(subSection)
          .clickLinkByIdBySection(changeLinkText)
  }

  // ^(?:I )?select (.+) on the 'What is the new additional reference type\?' page$
  def andIselectOnTheWhatIsTheNewAdditionalReferenceTypePage(answer: String): Unit = {
    NewAdditionalReferenceTypePage
          .loadPage()
          .select(answer)
          .submitPage()
  }

  // ^(?:I )?select (.+) on the 'What is the new additional reference type for item 1 in house consignment 1\?' page$
  def andIselectOnTheWhatIsTheNewAdditionalReferenceTypeForItem1InHouseConsignment1Page(answer: String): Unit = {
    NewItemLevelAdditionalReferenceTypePage
          .loadPage()
          .select(answer)
          .submitPage()
  }

  // ^(?:I )?enter additional reference (.+) on the 'What is the new additional reference number\?' page$
  def andenterAdditionalReferenceOnTheWhatIsTheNewAdditionalReferenceNumberPage(answer: String): Unit = {
    NewAdditionalReferenceNumberPage
            .loadPage()
            .fillInput(answer)
            .submitPage()
  }

  // ^(?:I )?enter additional reference (.+) on the 'What is the new additional reference number for item 1 in house consignment 1\?' page$
  def andIenterAdditionalReferenceOnTheWhatIsTheNewAdditionalReferenceNumberForItem1InHouseConsignment1Page(answer: String): Unit = {
    NewItemLevelAdditionalReferenceNumberPage
          .loadPage()
          .fillInput(answer)
          .submitPage()
  }

  // ^(?:I )?select (.+) on the 'What is the new package type for item 1 in house consignment 1\?' page$
  def andIselectOnTheWhatIsTheNewPackageTypeForItem1InHouseConsignment1Page(answer: String): Unit = {
    NewItemLevelPackageTypePage
          .loadPage()
          .select(answer)
          .submitPage()
  }

  // ^(?:I )?enter shipping mark (.+) on the 'What is the new shipping mark for item 1 in house consignment 1\?' page$
  def andIenterShippingMarkOnTheWhatIsTheNewShippingMarkForItem1InHouseConsignment1Page(answer: String): Unit = {
    NewItemLevelPackageShippingMarkPage
          .loadPage()
          .fillInput(answer)
          .submitPage()
  }

  // ^(?:I )?select (.+) on the 'What is the new document type\?' page$
  def andIselectOnTheWhatIsTheNewDocumentTypePage(answer: String): Unit = {
    NewDocumentTypePage
          .loadPage()
          .select(answer)
          .submitPage()
  }

  // ^(?:I )?enter reference number (.+) on the 'What is the document’s new reference number\?' page$
  def andIenterReferenceNumberOnTheWhatIsTheDocumentsNewReferenceNumberPage(answer: String): Unit = {
    DocumentsNewReferenceNumberPage
            .loadPage()
            .fillInput(answer)
            .submitPage()
  }

  // ^(?:I )?enter additional information (.+) on the 'Enter the new additional information\?' page$
  def andIenterAdditionalInformationOnTheEnterTheNewAdditionalInformationPage(answer: String): Unit = {
    NewAdditionalInformationPage
            .loadPage()
            .fillInput(answer)
            .submitPage()
  }

  // ^(?:I )?choose radio option (.*) on the 'Which identification do you want to use for the new departure means of transport\?' page$
  def andIchooseRadioOptionXOnTheWhichIdentificationDoYouWantToUseForTheNewDepartureMeansOfTransportPage(answer: String): Unit = {
    IdentificationForNewDepartureMeansOfTransportPage
          .loadPage()
          .select(answer)
          .submitPage()
  }

  // ^(?:I )?enter identification number (.+) on the 'What is the identification number for the new departure means of transport\?' page$
  def andIenterIdentificationNumberOnTheWhatIsTheIdentificationNumberForTheNewDepartureMeansOfTransportPage(answer: String): Unit = {
    IdentificationNumberForNewDepartureMeansOfTransportPage
          .loadPage()
          .fillInput(answer)
          .submitPage()
  }

  // ^(?:I )?select (.+) on the 'What country is the new departure means of transport registered to\?' page$
  def andIselectOnTheWhatCountryIsTheNewDepartureMeansOfTransportRegisteredToPage(answer: String): Unit = {
    CountryForNewDepartureMeansOfTransportPage
            .loadPage()
            .select(answer)
            .submitPage()
  }

  // ^(?:I )?choose radio option (.*) on the 'You have added (.*) documen(?:t |ts )to all items' page$
  def andIchooseRadioOptionXOnTheYouHaveAddedXDocumentstoAllItemsPage(answer: String, numberOfDocuments: String): Unit = {
    DocumentsAddAnotherDocumentsPage
            .loadPage(numberOfDocuments)
            .select(answer)
            .submitPage()
  }

  // ^(?:I )?Add (.+) on the 'What type of document do you want to add\?' page$
  def andIAddnTheWhatTypeOfDocumentDoYouWantToAddPage(answer: String): Unit = {
    AddDocumentTypePage
          .loadPage()
          .select(answer)
          .submitPage()
  }

  // ^(?:I )?Add (.+) on the 'What type of document do you want to add for item (.*) in house consignment 1\?' page$
  def andIAddOnTheWhatTypeOfDocumentDoYouWantToAddForItemXInHouseConsignment1Page(answer: String, itemIndex: String): Unit = {
    HouseConsignmentItemAddDocumentTypePage
          .loadPage(itemIndex)
          .select(answer)
          .submitPage()
  }

  // ^(?:I )?select (.+) on the 'What type of document do you want to add for house consignment (.*)\?' page$
  def andIselectOnTheWhatTypeOfDocumentDoYouWantToAddForHouseConsignmentXPage(answer: String, houseConsignmentIndex: String): Unit = {
    AddDocumentTypeForHouseConsignmentPage
            .loadPage(houseConsignmentIndex)
            .select(answer)
            .submitPage()
  }

  // ^(?:I )?enter reference number (.+) on 'What is the document’s reference number for item (.*) in house consignment 1\?' page$
  def andIenterReferenceNumberOnWhatIsTheDocumentsReferenceNumberForItemXInHouseConsignment1Page(answer: String, itemIndex: String): Unit = {
    HouseConsignmentItemDocsReferenceNumberPage
          .loadPage(itemIndex)
          .fillInput(answer)
          .submitPage()
  }

  // ^(?:I )?enter reference number (.+) on 'What is the document’s reference number\?' page$
  def andIenterReferenceNumberOnWhatIsTheDocumentsReferenceNumberPage(answer: String): Unit = {
    DocumentsReferenceNumberPage
            .loadPage()
            .fillInput(answer)
            .submitPage()
  }

  // ^(?:I )?choose radio option (.*) on the documents 'Do you want to add any additional information for this document\?' page$
  def andIchooseRadioOptionXOnTheDocumentsDoYouWantToAddAnyAdditionalInformationForThisDocumentPage(answer: String): Unit = {
    AddAdditionalInformationForDocumentPage
          .loadPage()
          .select(answer)
          .submitPage()
  }

  // ^(?:I )?enter additional information (.+) on documents 'Enter the additional information\?' page$
  def andIenterAdditionalInformationOnDocumentsEnterTheAdditionalInformationPage(answer: String): Unit = {
    AdditionalInformationPage
            .loadPage()
            .fillInput(answer)
            .submitPage()
  }

  // ^(?:I )?enter additional information (.+) on documents 'Enter the additional information for item (.*) in house consignment 1' page$
  def andIenterAdditionalInformationOnDocumentsEnterTheAdditionalInformationForItemXInHouseConsignment1Page(answer: String, itemIndex: String): Unit = {
    HouseConsignmentItemAdditionalInformationPage
          .loadPage(itemIndex)
          .fillInput(answer)
          .submitPage()
  }

  // ^(?:I )?add additional information (.+) on documents 'Enter the additional information in house consignment (.*)' page$
  def andIaddAdditionalInformationOnDocumentsEnterTheAdditionalInformationInHouseConsignmentXPage(answer: String, houseConsignmentIndex: String): Unit = {
    HouseConsignmentAdditionalInformationPage
          .loadPage(houseConsignmentIndex)
          .fillInput(answer)
          .submitPage()
  }

  // ^(?:I )?enter reference (.*) on the 'What is the additional reference number\?' page$
  def andIenterReferenceXOnTheWhatIsTheAdditionalReferenceNumberPage(answer: String): Unit = {
    AddNewConsignmentAdditionalReferenceNumberPage
          .loadPage()
          .fillInput(answer)
          .submitPage()
  }

  // ^(?:I )?choose to click on the (.*) link on the 'You have added (.*) documen(?:t |ts )to all items' page$
  def andIchooseToClickOnTheXLinkOnTheYouHaveAddedXDocumentstoAllItemsPage(sectionLink: String, numberOfDocumentsAdded: String): Unit = {
    DocumentsAddAnotherDocumentsPage
          .loadPage(numberOfDocumentsAdded)
          .clickByPartialLinkText(sectionLink)
  }

  // ^(?:I )?choose radio option (.*) on the documents 'Are you sure you want to remove this document from all items\?' page$
  def andIchooseRadioOptionXOnTheDocumentsAreYouSureYouWantToRemoveThisDocumentFromAllItemsPage(answer: String): Unit = {
    RemoveDocumentFromAllItemsPage
          .loadPage()
          .select(answer)
          .submitPage()
  }

  // ^(?:I )?choose radio option (.*) on the documents 'Do you want to add the type of identification for the departure means of transport\?' page$
  def andIchooseRadioOptionXOnTheDocumentsDoYouWantToAddTheTypeOfIdentificationForTheDepartureMeansOfTransportPage(answer: String): Unit = {
    AddIdentificationTypeForDepartureMeansOfTransportPage
          .loadPage()
          .select(answer)
          .submitPage()
  }

  // ^(?:I )?choose radio option (.*) on the 'Which identification do you want to use for the departure means of transport\?' page$
  def andIchooseRadioOptionXOnTheWhichIdentificationDoYouWantToUseForTheDepartureMeansOfTransportPage(answer: String): Unit = {
    IdentificationForDepartureMeansOfTransportPage
          .loadPage()
          .select(answer)
          .submitPage()
  }

  // ^(?:I )?choose radio option (.*) on the 'Which identification do you want to use for the departure means of transport in house consignment (.*)\?' page$
  def andIchooseRadioOptionXOnTheWhichIdentificationDoYouWantToUseForTheDepartureMeansOfTransportInHouseConsignmentXPage(answer: String, houseConsignmentIndex: String): Unit = {
    HouseConsignmentIdentificationForDepartureMeansOfTransportPage
          .loadPage(houseConsignmentIndex)
          .select(answer)
          .submitPage()
  }

  // ^(?:I )?select (.+) on the 'What type of additional reference do you want to add for item (.*) in house consignment 1\?' page$
  def andIselectOnTheWhatTypeOfAdditionalReferenceDoYouWantToAddForItemXInHouseConsignment1Page(answer: String, itemIndex: String): Unit = {
    AdditionalReferenceHouseConsignmentItemTypePage
          .loadPage(itemIndex)
          .select(answer)
          .submitPage()
  }

  // ^(?:I )?choose (.+) on the 'What type of additional reference do you want to add for house consignment (.*)\?' page$
  def andIchooseOnTheWhatTypeOfAdditionalReferenceDoYouWantToAddForHouseConsignmentXPage(answer: String, itemIndex: String): Unit = {
    AdditionalReferenceHouseConsignmentTypePage
          .loadPage(itemIndex)
          .select(answer)
          .submitPage()
  }

  // ^(?:I )?enter additional reference (.*) on the 'What is the additional reference number for item (.*) in house consignment 1\?' page$
  def andIenterAdditionalReferenceXOnTheWhatIsTheAdditionalReferenceNumberForItemXInHouseConsignment1Page(answer: String, itemIndex: String): Unit = {
    HouseConsignmentItemAddAdditionalReferenceNumberPage
          .loadPage(itemIndex)
          .fillInput(answer)
          .submitPage()
  }

  // ^(?:I )?select (.+) on the 'What type of package are you using for item (.*) in house consignment 1\?' page$
  def andIselectOnTheWhatTypeOfPackageAreYouUsingForItemXInHouseConsignment1Page(answer: String, itemIndex: String): Unit = {
    HouseConsignmentItemPackageTypePage
          .loadPage(itemIndex)
          .select(answer)
          .submitPage()
  }

  // ^(?:I )?enter (.*) on the 'What is the shipping mark for item (.*) in house consignment 1\?' page$
  def andIenterXOnTheWhatIsTheShippingMarkForItemXInHouseConsignment1Page(answer: String, itemIndex: String): Unit = {
    HouseConsignmentItemPackagesShippingMarkPage
            .loadPage(itemIndex)
            .fillInput(answer)
            .submitPage()
  }

  // ^(?:I )?choose radio option (.*) on the documents 'Do you want to add an identification number for this vehicle\?' page$
  def andIchooseRadioOptionXOnTheDocumentsDoYouWantToAddAnIdentificationNumberForThisVehiclePage(answer: String): Unit = {
    AddIdentificationNumberForDepartureMeansOfTransportPage
          .loadPage()
          .select(answer)
          .submitPage()
  }

  // ^(?:I )?enter identification number (.+) on 'What is the identification number for this vehicle\?' page$
  def andIenterIdentificationNumberOnWhatIsTheIdentificationNumberForThisVehiclePage(answer: String): Unit = {
    IdentificationNumberForDepartureTransportMeansPage
            .loadPage()
            .fillInput(answer)
            .submitPage()
  }

  // ^(?:I )?choose radio option (.*) on the documents 'Do you want to add the registered country for this vehicle\?' page$
  def andIchooseRadioOptionXOnTheDocumentsDoYouWantToAddTheRegisteredCountryForThisVehiclePage(answer: String): Unit = {
    AddRegisterCountryForDepartureMeansOfTransportPage
          .loadPage()
          .select(answer)
          .submitPage()
  }

  // ^(?:I )?select (.+) on the 'What country is this vehicle registered to\?' page$
  def andIselectOnTheWhatCountryIsThisVehicleRegisteredToPage(answer: String): Unit = {
    CountryTypeVehicleRegisteredPage
          .loadPage()
          .select(answer)
          .submitPage()
  }

  // ^(?:I )?choose to click on the (.*) link on the 'You have added (.*) departure means of transport' page$
  def andIchooseToClickOnTheXLinkOnTheYouHaveAddedXDepartureMeansOfTransportPage(sectionLink: String, numberOfDeparturesAdded: String): Unit = {
    AddAnotherDepartureMeansOfTransportPage
          .loadPage(numberOfDeparturesAdded)
          .clickByPartialLinkText(sectionLink)
  }

  // ^(?:I )?choose radio option (.*) on the documents 'Are you sure you want to remove departure means of transport (.+)\?' page$
  def andIchooseRadioOptionXOnTheDocumentsAreYouSureYouWantToRemoveDepartureMeansOfTransportPage(answer: String, removeCount: String): Unit = {
    RemoveDepartureMeansOfTransportPage
          .loadPage(removeCount)
          .select(answer)
          .submitPage()
  }

  // ^(?:I )?choose radio option (.*) on the 'You have added (.*) departure means of transport' page$
  def andIchooseRadioOptionXOnTheYouHaveAddedXDepartureMeansOfTransportPage(answer: String, numberOfDocuments: String): Unit = {
    AddAnotherDepartureMeansOfTransportPage
            .loadPage(numberOfDocuments)
            .select(answer)
            .submitPage()
  }

  // ^(?:I )?enter identification number (.+) on 'What is the new container identification number\?' page$
  def andIenterIdentificationNumberOnWhatIsTheNewContainerIdentificationNumberPage(answer: String): Unit = {
    NewContainerIdentificationNumberPage
            .loadPage()
            .fillInput(answer)
            .submitPage()
  }

  // ^(?:I )?enter seal identification number (.+) on the 'What is the new seal identification number\?' page$
  def andIenterSealIdentificationNumberOnTheWhatIsTheNewSealIdentificationNumberPage(answer: String): Unit = {
    NewSealIdentificationNumberPage
            .loadPage()
            .fillInput(answer)
            .submitPage()
  }

  // ^(?:I )?select (.+) on the 'Which item does this transport equipment apply to\?' page$
  def andIselectOnTheWhichItemDoesThisTransportEquipmentApplyToPage(answer: String): Unit = {
    ItemTypeForTransportEquipmentPage
            .loadPage()
            .select(answer)
            .submitPage()
  }

  // ^(?:I )?click continue 'You have applied (.*) item to transport equipment (.*)' page$
  def andIclickContinueYouHaveAppliedXItemToTransportEquipmentXPage(numberOfTransportEquipmentItemsInTitle: String,
      numberOfTransportEquipmentIncrementsInTitle: String): Unit = {
    TransportEquipmentIncrementPage
            .loadPage(numberOfTransportEquipmentItemsInTitle, numberOfTransportEquipmentIncrementsInTitle)
            .submitPage()
  }

  // ^(?:I )?choose radio option (.*) on the cross check 'You have added (.*) transport equipment' page$
  def andIchooseRadioOptionXOnTheCrossCheckYouHaveAddedXTransportEquipmentPage(answer: String, numberOfTransportEquipment: String): Unit = {
    AddAnotherForTransportEquipmentPage
            .loadPage(numberOfTransportEquipment)
            .select(answer)
            .submitPage()
  }

  // ^(?:I )?choose radio option (.*) on the cross check 'Do you want to add a container identification number for the transport equipment\?' page$
  def andIchooseRadioOptionXOnTheCrossCheckDoYouWantToAddAContainerIdentificationNumberForTheTransportEquipmentPage(answer: String): Unit = {
    OptionToAddContainerIdentificationNumberPage
          .loadPage()
          .select(answer)
          .submitPage()
  }

  // ^(?:I )?enter identification number (.+) on 'What is the container identification number\?' page$
  def andIenterIdentificationNumberOnWhatIsTheContainerIdentificationNumberPage(answer: String): Unit = {
    ContainerIdentificationNumberforTransportEquipmentPage
            .loadPage()
            .fillInput(answer)
            .submitPage()
  }

  // ^(?:I )?choose radio option (.*) on the cross check 'Do you want to add a seal for the transport equipment\?' page$
  def andIchooseRadioOptionXOnTheCrossCheckDoYouWantToAddASealForTheTransportEquipmentPage(answer: String): Unit = {
    OptionToAddSealPage
          .loadPage()
          .select(answer)
          .submitPage()
  }

  // ^(?:I )?enter identification number (.+) on 'What is the seal identification number\?' page$
  def andIenterIdentificationNumberOnWhatIsTheSealIdentificationNumberPage(answer: String): Unit = {
    SealIdentificationNumberForTransportEquipmentPage
            .loadPage()
            .fillInput(answer)
            .submitPage()
  }

  // ^(?:I )?click (.*) on 'You have added (.*) sea(?: l|ls )to transport equipment (.*)' page$
  def andIclickXOnYouHaveAddedXSealstoTransportEquipmentXPage(answer: String,
      numberOfTransportEquipmentSealInTitle: String,
      numberOfTransportEquipmentIncrementsInTitle: String): Unit = {
    SealsIncrementPage
            .loadPage(numberOfTransportEquipmentSealInTitle, numberOfTransportEquipmentIncrementsInTitle)
            .clickByPartialLinkText(answer)
  }

  // ^(?:I )?choose radio option (.*) on 'Are you sure you want to remove this seal from transport equipment (.*)\?' page$
  def andIchooseRadioOptionXOnAreYouSureYouWantToRemoveThisSealFromTransportEquipmentXPage(answer: String, numberOfTransportEquipmentIncrementsInTitle: String): Unit = {
    RemoveSealFromTransportEquipmentPage
          .loadPage(numberOfTransportEquipmentIncrementsInTitle)
          .select(answer)
          .submitPage()
  }

  // ^(?:I )?click radio option (.*) on the 'You have added (.*) sea(?: l|ls )to transport equipment (.*)' page$
  def andIclickRadioOptionXOnTheYouHaveAddedXSealstoTransportEquipmentXPage(answer: String,
      numberOfTransportEquipmentSealInTitle: String,
      numberOfTransportEquipmentIncrementsInTitle: String): Unit = {
    SealsIncrementPage
            .loadPage(numberOfTransportEquipmentSealInTitle, numberOfTransportEquipmentIncrementsInTitle)
            .select(answer)
            .submitPage()
  }

  // ^(?:I )?choose radio option (.*) on the cross check 'Do any items apply to this transport equipment\?' page$
  def andIchooseRadioOptionXOnTheCrossCheckDoAnyItemsApplyToThisTransportEquipmentPage(answer: String): Unit = {
    OptionToAddItemsApplyPage
          .loadPage()
          .select(answer)
          .submitPage()
  }

  // ^(?:I )?click (.*) on 'You have applied (.*) item to transport equipment (.*)' page$
  def andIclickXOnYouHaveAppliedXItemToTransportEquipmentXPage(answer: String,
      numberOfTransportEquipmentSealInTitle: String,
      numberOfTransportEquipmentIncrementsInTitle: String): Unit = {
    TransportEquipmentIncrementPage
            .loadPage(numberOfTransportEquipmentSealInTitle, numberOfTransportEquipmentIncrementsInTitle)
            .clickByPartialLinkText(answer)
  }

  // ^(?:I )?choose radio option (.*) on the 'Are you sure you want to remove this item from transport equipment (.+)\?' page$
  def andIchooseRadioOptionXOnTheAreYouSureYouWantToRemoveThisItemFromTransportEquipmentPage(answer: String, removeCount: String): Unit = {
    RemoveItemFromTransportEquipmentPage
          .loadPage(removeCount)
          .select(answer)
          .submitPage()
  }

  // ^(?:I )?choose to click on the (.*) link on the 'You have added (.*) transport equipment' page$
  def andIchooseToClickOnTheXLinkOnTheYouHaveAddedXTransportEquipmentPage(sectionLink: String, numberOfTransportEquipAdded: String): Unit = {
    AddAnotherForTransportEquipmentPage
          .loadPage(numberOfTransportEquipAdded)
          .clickByPartialLinkText(sectionLink)
  }

  // ^(?:I )?choose radio option (.*) on the documents 'Are you sure you want to remove transport equipment (.+)\?' page$
  def andIchooseRadioOptionXOnTheDocumentsAreYouSureYouWantToRemoveTransportEquipmentPage(answer: String, removeCount: String): Unit = {
    RemoveTransportEquipmentFromCorssCheckPage
          .loadPage(removeCount)
          .select(answer)
          .submitPage()
  }

  // ^(?:I )?click radio option (.*) on the 'You have applied (.*) ite(?: m|ms )to transport equipment (.*)' page$
  def andIclickRadioOptionXOnTheYouHaveAppliedXItemstoTransportEquipmentXPage(answer: String,
      numberOfTransportEquipmentItemInTitle: String,
      numberOfTransportEquipmentIncrementsInTitle: String): Unit = {
    TransportEquipmentIncrementPage
            .loadPage(numberOfTransportEquipmentItemInTitle, numberOfTransportEquipmentIncrementsInTitle)
            .select(answer)
            .submitPage()
  }

  // ^(?:I )?enter number (.+) on 'What is the new gross weight of item (.+) in house consignment 1\?' page$
  def andIenterNumberOnWhatIsTheNewGrossWeightOfItemInHouseConsignment1Page(answer: String, index: String): Unit = {
    ChangeGrossWeightPage
            .loadPage(index)
            .fillInput(answer)
            .submitPage()
  }

  // ^(?:I )?enter number (.+) on 'What is the gross weight of item (.+) in house consignment 1\?' page$
  def andIenterNumberOnWhatIsTheGrossWeightOfItemInHouseConsignment1Page(answer: String, index: String): Unit = {
    EnterGrossWeightPage
            .loadPage(index)
            .fillInput(answer)
            .submitPage()
  }

  // ^(?:I )?choose radio option (.*) on the 'Are you sure you want to remove the gross weight from item 1 in house consignment 1\?' page$
  def andIchooseRadioOptionXOnTheAreYouSureYouWantToRemoveTheGrossWeightFromItem1InHouseConsignment1Page(answer: String): Unit = {
    RemoveGrossWeightsPage
          .loadPage()
          .select(answer)
          .submitPage()
  }

  // ^(?:I )?enter number (.+) on 'What is the new net weight of item (.+) in house consignment 1\?' page$
  def andIenterNumberOnWhatIsTheNewNetWeightOfItemInHouseConsignment1Page(answer: String, index: String): Unit = {
    ChangeNetWeightPage
            .loadPage(index)
            .fillInput(answer)
            .submitPage()
  }

  // ^(?:I )?enter number (.+) on 'What is the net weight of item (.+) in house consignment 1\?' page$
  def andIenterNumberOnWhatIsTheNetWeightOfItemInHouseConsignment1Page(answer: String, index: String): Unit = {
    EnterNetWeightPage
            .loadPage(index)
            .fillInput(answer)
            .submitPage()
  }

  // ^(?:I )?choose radio option (.*) on the 'Are you sure you want to remove the net weight from item 1 in house consignment 1\?' page$
  def andIchooseRadioOptionXOnTheAreYouSureYouWantToRemoveTheNetWeightFromItem1InHouseConsignment1Page(answer: String): Unit = {
    RemoveNetWeightsPage
          .loadPage()
          .select(answer)
          .submitPage()
  }

  // ^(?:I )?enter number (.+) on 'What is the new Customs Union and Statistics CUS code for item (.+) in house consignment 1\?' page$
  def andIenterNumberOnWhatIsTheNewCustomsUnionAndStatisticsCUSCodeForItemInHouseConsignment1Page(answer: String, index: String): Unit = {
    ChangeCUSCodePage
          .loadPage(index)
          .fillInput(answer)
          .submitPage()
  }

  // ^(?:I )?enter number (.+) on 'What is the Customs Union and Statistics code for item (.+) in house consignment (.+)\?' page$
  def andIenterNumberOnWhatIsTheCustomsUnionAndStatisticsCodeForItemInHouseConsignmentPage(answer: String, itemIndex: String, hcIndex: String): Unit = {
    EnterCUSCodePage
          .loadPage(itemIndex, hcIndex)
          .fillInput(answer)
          .submitPage()
  }

  // ^(?:I )?enter number (.+) on 'What is the new commodity code for item (.+) in house consignment 1\?' page$
  def andIenterNumberOnWhatIsTheNewCommodityCodeForItemInHouseConsignment1Page(answer: String, index: String): Unit = {
    ChangeCommodityCodePage
          .loadPage(index)
          .fillInput(answer)
          .submitPage()
  }

  // ^(?:I )?enter number (.+) on 'What is the commodity code for item (.+) in house consignment 1\?' page$
  def andIenterNumberOnWhatIsTheCommodityCodeForItemInHouseConsignment1Page(answer: String, index: String): Unit = {
    EnterCommodityCodePage
          .loadPage(index)
          .fillInput(answer)
          .submitPage()
  }

  // ^(?:I )?choose radio option (.*) on the 'Are you sure you want to remove the commodity code from item 1 in house consignment 1\?' page$
  def andIchooseRadioOptionXOnTheAreYouSureYouWantToRemoveTheCommodityCodeFromItem1InHouseConsignment1Page(answer: String): Unit = {
    RemoveCommodityCodePage
          .loadPage()
          .select(answer)
          .submitPage()
  }

  // ^(?:I )?enter number (.+) on 'What is the new combined nomenclature code for item (.+) in house consignment 1\?' page$
  def andIenterNumberOnWhatIsTheNewCombinedNomenclatureCodeForItemInHouseConsignment1Page(answer: String, index: String): Unit = {
    ChangeNomenclatureCodePage
          .loadPage(index)
          .fillInput(answer)
          .submitPage()
  }

  // ^(?:I )?enter number (.+) on 'What is the combined nomenclature code for item (.+) in house consignment 1\?' page$
  def andIenterNumberOnWhatIsTheCombinedNomenclatureCodeForItemInHouseConsignment1Page(answer: String, index: String): Unit = {
    EnterNomenclatureCodePage
          .loadPage(index)
          .fillInput(answer)
          .submitPage()
  }

  // ^(?:I )?choose radio option (.*) on the 'Are you sure you want to remove the combined nomenclature code from item 1 in house consignment 1\?' page$
  def andIchooseRadioOptionXOnTheAreYouSureYouWantToRemoveTheCombinedNomenclatureCodeFromItem1InHouseConsignment1Page(answer: String): Unit = {
    RemoveNomenclatureCodePage
          .loadPage()
          .select(answer)
          .submitPage()
  }

  // ^(?:I )?click the (.+) link on house consignment for section (.+) (.+)$
  def andIclickTheLinkOnHouseConsignmentForSection(changeLinkText: String, section: String, index: String): Unit = {
    HouseConsignmentPage
          .loadPage(index)
          .selectItemSection(section)
          .clickLinkByIdBySection(changeLinkText)
  }

  // ^(?:I )?click radio option (.*) on the 'You have added (.*) ite(?:m |ms )for house consignment (.*)' page$
  def andIclickRadioOptionXOnTheYouHaveAddedXItemsforHouseConsignmentXPage(answer: String,
      numberOfItemInTitle: String,
      numberOfHouseConsignmentsInTitle: String): Unit = {
    HouseConsignmentIncrementPage
            .loadPage(numberOfItemInTitle, numberOfHouseConsignmentsInTitle)
            .select(answer)
            .submitPage()
  }

  // ^(?:I )?enter (.*) on the 'Enter the description of ite(?:m |ms )(.+) in house consignment (.*)' page$
  def andIenterXOnTheEnterTheDescriptionOfItemsInHouseConsignmentXPage(answer: String,
      numberOfItemInTitle: String,
      numberOfHouseConsignmentsInTitle: String): Unit = {
    EnterItemDescriptionPage
            .loadPage(numberOfItemInTitle, numberOfHouseConsignmentsInTitle)
            .fillInput(answer)
            .submitPage()
  }

  // ^(?:I )?choose radio option (.*) on the 'Do you want to add the item’s gross weight\?' page$
  def andIhooseRadioOptionXOnTheDoYouWantToAddTheItemsGrossWeightPage(answer: String): Unit = {
    OptionToAddItemGrossWeightPage
          .loadPage()
          .select(answer)
          .submitPage()
  }

  // ^(?:I )?choose radio option (.*) on the 'Do you want to add the item’s net weight\?' page$
  def andIchooseRadioOptionXOnTheDoYouWantToAddTheItemsNetWeightPage(answer: String): Unit = {
    OptionToAddItemNetWeightPage
          .loadPage()
          .select(answer)
          .submitPage()
  }

  // ^(?:I )?choose radio option (.*) on the 'Do you want to add a Customs Union and Statistics (.*) code for the item\?' page$
  def andIchooseRadioOptionXOnTheDoYouWantToAddACustomsUnionAndStatisticsXCodeForTheItemPage(answer: String, index: String): Unit = {
    OptionToAddItemNewCusPage
          .loadPage(index)
          .select(answer)
          .submitPage()
  }

  // ^(?:I )?choose radio option (.*) on the 'Do you want to add a commodity code for the item\?' page$
  def andIchooseRadioOptionXOnTheDoYouWantToAddACommodityCodeForTheItemPage(answer: String): Unit = {
    OptionToAddItemCommodityCodePage
          .loadPage()
          .select(answer)
          .submitPage()
  }

  // ^(?:I )?choose radio option (.*) on the 'Do you want to add a combined nomenclature code for the item\?' page$
  def andIchooseRadioOptionXOnTheDoYouWantToAddACombinedNomenclatureCodeForTheItemPage(answer: String): Unit = {
    OptionToAddItemCombinedNomenclaturePage
          .loadPage()
          .select(answer)
          .submitPage()
  }

  // ^(?:I )?choose radio option (.*) on the 'Do you want to add a document for the item\?' page$
  def andIchooseRadioOptionXOnTheDoYouWantToAddADocumentForTheItemPage(answer: String): Unit = {
    OptionToAddItemDocumentPage
          .loadPage()
          .select(answer)
          .submitPage()
  }

  // ^(?:I )?choose radio option (.*) on the 'Do you want to add an additional reference for the item\?' page$
  def andIchooseRadioOptionXOnTheDoYouWantToAddAnAdditionalReferenceForTheItemPage(answer: String): Unit = {
    OptionToAddItemAdditionalReferencePage
          .loadPage()
          .select(answer)
          .submitPage()
  }

  // ^(?:I )?click (.*) on 'You have added (.*) documen(?: t|ts )to item (.+) in house consignment 1' page$
  def andIclickXOnYouHaveAddedXDocumentstoItemInHouseConsignment1Page(answer: String,
      numberOfDocumentsTitle: String,
      numberOfItemsInTitle: String): Unit = {
    HouseConsignmentDocumentIncrementPage
            .loadPage(numberOfDocumentsTitle, numberOfItemsInTitle)
            .clickByPartialLinkText(answer)
  }

  // ^(?:I )?click radio option (.*) on the 'Are you sure you want to remove this document from item (.+) in house consignment 1\?' page$
  def andIclickRadioOptionXOnTheAreYouSureYouWantToRemoveThisDocumentFromItemInHouseConsignment1Page(answer: String, numberOfItems: String): Unit = {
    HouseConsignmentDocumentRemoveIncrementPage
          .loadPage(numberOfItems)
          .select(answer)
          .submitPage()
  }

  // ^(?:I )?click (.*) on house consignment document 'You have added (.*) documen(?:t |ts )to item (.+) in house consignment 1' page$
  def andIclickXOnHouseConsignmentDocumentYouHaveAddedXDocumentstoItemInHouseConsignment1Page(answer: String,
      numberOfDocumentsTitle: String,
      numberOfItemsInTitle: String): Unit = {
    HouseConsignmentDocumentIncrementPage
            .loadPage(numberOfDocumentsTitle, numberOfItemsInTitle)
            .select(answer)
            .submitPage()
  }

  // ^(?:I )?click (.*) on additional reference 'You have added (.+) additional referenc(?:e |es)for item (.+) in house consignment 1' page$
  def andIclickXOnAdditionalReferenceYouHaveAddedAdditionalReferencesforItemInHouseConsignment1Page(answer: String,
      numberOfAdditionalRefTitle: String,
      numberOfItemsInTitle: String): Unit = {
    HouseConsignmentAdditionalRefIncrementPage
            .loadPage(numberOfAdditionalRefTitle, numberOfItemsInTitle)
            .select(answer)
            .submitPage()
  }

  // ^(?:I )?click (.*) on the 'You have added (.+) additional referenc(?:e |es )for item (.+) in house consignment 1' page$
  def andIclickXOnTheYouHaveAddedAdditionalReferencesforItemInHouseConsignment1Page(answer: String,
      numberOfAdditionalRefTitle: String,
      numberOfItemsInTitle: String): Unit = {
    HouseConsignmentAdditionalRefIncrementPage
            .loadPage(numberOfAdditionalRefTitle, numberOfItemsInTitle)
            .clickByPartialLinkText(answer)
  }

  // ^(?:I )?choose radio option (.*) on the 'Do you want to add a package for the item\?' page$
  def andIchooseRadioOptionXOnTheDoYouWantToAddAPackageForTheItemPage(answer: String): Unit = {
    OptionToAddItemPackagePage
          .loadPage()
          .select(answer)
          .submitPage()
  }

  // ^(?:I )?choose radio option (.*) on the 'Do you want to add the quantity of this package\?' page$
  def andIchooseRadioOptionXOnTheDoYouWantToAddTheQuantityOfThisPackagePage(answer: String): Unit = {
    OptionToAddItemPackageQuantityPage
          .loadPage()
          .select(answer)
          .submitPage()
  }

  // ^(?:I )?enter (.*) on the 'How many of this package are you using\?' page$
  def andIenterXOnTheHowManyOfThisPackageAreYouUsingPage(answer: String): Unit = {
    PackagesTypeQuantityPage
          .loadPage()
          .fillInput(answer)
          .submitPage()
  }

  // ^(?:I )?enter (.*) on the 'How many of this package are you using for item (.*) in house consignment 1\?' page$
  def andIenterXOnTheHowManyOfThisPackageAreYouUsingForItemXInHouseConsignment1Page(answer: String, itemIndex: String): Unit = {
    HouseConsignmentItemPackagesTypeQuantityPage
          .loadPage(itemIndex)
          .fillInput(answer)
          .submitPage()
  }

  // ^(?:I )?click (.*) on house consignment package 'You have added (.*) typ(?:e |es )of packag(?:e |es )for item (.+) in house consignment 1' page$
  def andIclickXOnHouseConsignmentPackageYouHaveAddedXTypesofPackagesforItemInHouseConsignment1Page(answer: String,
      numberOfTypesInTitle: String,
      numberOfPackagesInTitle: String): Unit = {
    HouseConsignmentPackageIncrementPage
            .loadPage(numberOfTypesInTitle, numberOfPackagesInTitle)
            .select(answer)
            .submitPage()
  }

  // ^(?:I )?click (.*) on the house consignment package 'You have added (.*) typ(?:e |es )of packag(?:e |es )for item (.+) in house consignment 1' page$
  def andIclickXOnTheHouseConsignmentPackageYouHaveAddedXTypesofPackagesforItemInHouseConsignment1Page(answer: String,
      numberOfTypesInTitle: String,
      numberOfPackagesInTitle: String): Unit = {
    HouseConsignmentPackageIncrementPage
            .loadPage(numberOfTypesInTitle, numberOfPackagesInTitle)
            .clickByPartialLinkText(answer)
  }

  // ^(?:I )?click radio option (.*) on the 'Are you sure you want to remove this package from item (.+) in house consignment 1\?' page$
  def andIclickRadioOptionXOnTheAreYouSureYouWantToRemoveThisPackageFromItemInHouseConsignment1Page(answer: String, numberOfItems: String): Unit = {
    HouseConsignmentPackageRemoveIncrementPage
          .loadPage(numberOfItems)
          .select(answer)
          .submitPage()
  }

  // ^(?:I )?click option (.*) on the 'You have added (.*) ite(?:m |ms )for house consignment (.*)' page$
  def andIclickOptionXOnTheYouHaveAddedXItemsforHouseConsignmentXPage(answer: String,
      numberOfItemInTitle: String,
      numberOfHouseConsignmentsInTitle: String): Unit = {
    HouseConsignmentIncrementPage
            .loadPage(numberOfItemInTitle, numberOfHouseConsignmentsInTitle)
            .clickByPartialLinkText(answer)
  }

  // ^(?:I )?click radio option (.*) on item 'Are you sure you want to remove item (.+) from house consignment 1\?' page$
  def andIclickRadioOptionXOnItemAreYouSureYouWantToRemoveItemFromHouseConsignment1Page(answer: String, numberOfItems: String): Unit = {
    HouseConsignmentRemoveItemPage
          .loadPage(numberOfItems)
          .select(answer)
          .submitPage()
  }

  // ^(?:I )?choose radio option (.*) on the 'Do you have anything else to report\?' page$
  def andIchooseRadioOptionXOnTheDoYouHaveAnythingElseToReportPage(answer: String): Unit = {
    AnythingReportPage
          .loadPage()
          .select(answer)
          .submitPage()
  }

  // ^(?:I )?enter (.+) on the 'What do you want to report\?' page$
  def andIenterOnTheWhatDoYouWantToReportPage(answer: String): Unit = {
    OtherThingsReportPage
          .loadPage()
          .fillInput(answer)
          .submitPage()
  }

  // ^(?:I )?enter (.+) on the 'What is the identification number for the external seal\?' page$
  def andIenterOnTheWhatIsTheIdentificationNumberForTheExternalSealPage(answer: String): Unit = {
    EnterOriginalSealsIdentificationCommentPage
            .loadPage()
            .fillInput(answer)
            .submitPage()
  }

  // ^(?:I )?enter (.+) on the 'What is the identification number for the replacement external seal\?' page$
  def andIenterOnTheWhatIsTheIdentificationNumberForTheReplacementExternalSealPage(answer: String): Unit = {
    EnterAllSealsIdentificationNumbersPage
            .loadPage()
            .fillInput(answer)
            .submitPage()
  }

  // ^(?:I )?enter (.*) on the 'Enter your comments' page$
  def andIenterXOnTheEnterYourCommentsPage(answer: String): Unit = {
    EnterCommentsPage
          .loadPage()
          .fillInput(answer)
          .submitPage()
  }

  // ^(?:I )?click radio option (.*) on the 'You have added (.*) house consignment' page$
  def andIclickRadioOptionXOnTheYouHaveAddedXHouseConsignmentPage(answer: String, numberOfHC: String): Unit = {
    HouseConsignmentAddAnotherHCPage
            .loadPage(numberOfHC)
            .select(answer)
            .submitPage()
  }

  // ^(?:I )?enter number (.+) on 'What is the gross weight of House Consignment (.+)\?' page$
  def andIenterNumberOnWhatIsTheGrossWeightOfHouseConsignmentPage(answer: String, index: String): Unit = {
    EnterGrossWeightHCPage
            .loadPage(index)
            .fillInput(answer)
            .submitPage()
  }

  // ^(?:I )?choose radio option (.*) on the 'Do you want to add a departure means of transport for house consignment (.*)\?' page$
  def andIchooseRadioOptionXOnTheDoYouWantToAddADepartureMeansOfTransportForHouseConsignmentXPage(answer: String, HCNumber: String): Unit = {
    HouseConsignmentAddDepartureTransportMeansPage
          .loadPage(HCNumber)
          .select(answer)
          .submitPage()
  }

  // ^(?:I )?choose radio option (.*) on the 'You have added (.*) departure means of transport for house consignment 2' page$
  def andIchooseRadioOptionXOnTheYouHaveAddedXDepartureMeansOfTransportForHouseConsignment2Page(answer: String, numberOfDepartureMeans: String): Unit = {
    AddAnotherDepartureMeansOfTransportHCPage
          .loadPage(numberOfDepartureMeans)
          .select(answer)
          .submitPage()
  }

  // ^(?:I )?choose radio option (.*) on the 'Do you want to add any documents for house consignment (.*)\?' page$
  def andIchooseRadioOptionXOnTheDoYouWantToAddAnyDocumentsForHouseConsignmentXPage(answer: String, HCNumber: String): Unit = {
    HouseConsignmentAddDocumentsPage
          .loadPage(HCNumber)
          .select(answer)
          .submitPage()
  }

  // ^(?:I )?choose radio option (.*) on the 'You have added (.*) documen(?:t |ts )to all items in house consignment 2' page$
  def andIchooseRadioOptionXOnTheYouHaveAddedXDocumentstoAllItemsInHouseConsignment2Page(answer: String, numberOfDocuments: String): Unit = {
    DocumentsAddAnotherDocumentsHCPage
          .loadPage(numberOfDocuments)
          .select(answer)
          .submitPage()
  }

  // ^(?:I )?choose radio option (.*) on the 'Do you want to add an additional reference for house consignment (.*)\?' page$
  def andIchooseRadioOptionXOnTheDoYouWantToAddAnAdditionalReferenceForHouseConsignmentXPage(answer: String, HCNumber: String): Unit = {
    HouseConsignmentAddAdditionalReferencePage
          .loadPage(HCNumber)
          .select(answer)
          .submitPage()
  }

  // ^(?:I )?click radio option (.*) on the 'You have added (.*) additional reference for house consignment 2' page$
  def andIclickRadioOptionXOnTheYouHaveAddedXAdditionalReferenceForHouseConsignment2Page(answer: String, numberOfReferences: String): Unit = {
    AdditionalReferenceAddAnotherHCPage
          .loadPage(numberOfReferences)
          .select(answer)
          .submitPage()
  }

  // ^(?:I )?choose radio option (.*) on the 'Do you want to add an item for house consignment (.*)\?' page$
  def andIchooseRadioOptionXOnTheDoYouWantToAddAnItemForHouseConsignmentXPage(answer: String, HCNumber: String): Unit = {
    HouseConsignmentAddItemPage
            .loadPage(HCNumber)
            .select(answer)
            .submitPage()
  }

  // ^(?:I )?click the (.*) link on the 'You have added (.*) house consignments' page$
  def andIclickTheXLinkOnTheYouHaveAddedXHouseConsignmentsPage(sectionLink: String, numberOfHCAdded: String): Unit = {
    HouseConsignmentAddAnotherHCPage
          .loadPage(numberOfHCAdded)
          .clickByPartialLinkText(sectionLink)
  }

  // ^(?:I )?click radio option (.*) on the 'Are you sure you want to remove house consignment (.+)\?' page$
  def andIclickRadioOptionXOnTheAreYouSureYouWantToRemoveHouseConsignmentPage(answer: String, hcNumber: String): Unit = {
    HouseConsignmentRemoveHCPage
          .loadPage(hcNumber)
          .select(answer)
          .submitPage()
  }

  // ^(?:I )?select radio option (.*) on the 'You have added (.*) countr(?:y |ies )to the transit route' page$
  def andIselectRadioOptionXOnTheYouHaveAddedXCountriestoTheTransitRoutePage(answer: String, numberOfCountries: String): Unit = {
    CountryOfRoutingAddAnotherPage
            .loadPage(numberOfCountries)
            .select(answer)
            .submitPage()
  }

  // ^(?:I )?click on the (.*) link on the 'You have added (.*) countr(?:y |ies )to the transit route' page$
  def andIclickOnTheXLinkOnTheYouHaveAddedXCountriestoTheTransitRoutePage(sectionLink: String, numberOfCountries: String): Unit = {
    CountryOfRoutingAddAnotherPage
          .loadPage(numberOfCountries)
          .clickByPartialLinkText(sectionLink)
  }

  // ^(?:I )?select (.+) on the Unloading 'Which country do you want to add to the transit route\?' page$
  def andIselectOnTheUnloadingWhichCountryDoYouWantToAddToTheTransitRoutePage(answer: String): Unit = {
    CountryOfRoutingCountryPage
            .loadPage()
            .select(answer)
            .submitPage()
  }

  // ^(?:I )?select radio option (.*) on the 'Are you sure you want to remove this country from the transit route\?' page$
  def andIselectRadioOptionXOnTheAreYouSureYouWantToRemoveThisCountryFromTheTransitRoutePage(answer: String): Unit = {
    CountryOfRoutingRemoveCountryPage
          .loadPage()
          .select(answer)
          .submitPage()
  }

  // ^(?:I )?choose radio option (.*) on the 'Do you want to add a Unique Consignment Reference for this house consignment\?' page$
  def andIchooseRadioOptionXOnTheDoYouWantToAddAUniqueConsignmentReferenceForThisHouseConsignmentPage(answer: String): Unit = {
    UCRForNewHouseConsignmentYesNoPage
          .loadPage()
          .select(answer)
          .submitPage()
  }

  // ^(?:I )?enter (.+) on the 'What is the Unique Consignment Reference for house consignment (.+)\?' page$
  def andIenterOnTheWhatIsTheUniqueConsignmentReferenceForHouseConsignmentPage(answer: String, houseConsignmentIndex: String): Unit = {
    UCRForNewHouseConsignmentPage
          .loadPage(houseConsignmentIndex)
          .fillInput(answer)
          .submitPage()
  }

  // ^(?:I )?choose radio option (.*) on the 'Do you want to add a Unique Consignment Reference for this item\?' page$
  def andIchooseRadioOptionXOnTheDoYouWantToAddAUniqueConsignmentReferenceForThisItemPage(answer: String): Unit = {
    UCRForNewItemInHouseConsignmentYesNoPage
          .loadPage()
          .select(answer)
          .submitPage()
  }

  // ^(?:I )?enter reference (.+) on the 'What is the Unique Consignment Reference for item (.+) in house consignment 1\?' page$
  def andIenterReferenceOnTheWhatIsTheUniqueConsignmentReferenceForItemInHouseConsignment1Page(answer: String, index: String): Unit = {
    UCRForNewItemInHouseConsignmentPage
          .loadPage(index)
          .fillInput(answer)
          .submitPage()
  }

}
