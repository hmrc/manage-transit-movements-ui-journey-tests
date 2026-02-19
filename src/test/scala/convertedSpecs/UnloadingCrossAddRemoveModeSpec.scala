import org.scalatest.matchers.should.Matchers
import org.scalatest.GivenWhenThen
import org.scalatest.featurespec.AnyFeatureSpec



class UnloadingCrossAddRemoveModeSpec extends AnyFeatureSpec with GivenWhenThen {

  Feature("Navigating to Pages from Cross-check declaration summary to all individual sections of pages") {

    Scenario("01 - Unloading remarks - Consignment level Cross-check page add and remove journeys") {
      And("I click the Add or remove departure means link for section Departure means of transport 1")
        // Possible match (best=1.00)
        andIclickTheLinkForSection("Add or remove departure means", "Departure", "means of transport 1")

      And("I choose radio option Yes on the You have added 1 departure means of transport page")
        // Possible match (best=0.91)
        andIchooseRadioOptionXOnTheYouHaveAddedXDepartureMeansOfTransportPage("", "")
        // --- Other possible matches ---
        // andIchooseRadioOptionXOnThePresentationYouHaveAddedXDepartureMeansOfTransportPage() [0.78] (PresentationNotificationStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the presentation 'You have added (.*) departure means of transport' page
        // andIchooseRadioOptionXOnTheDepartureMeansXPage() [0.77] (InlandModeOfTransportStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the departure means '(.*)' page
        // andIselectRadioOptionXOnTheYouHaveAddedDepartureMeansOfTransportPage() [0.77] (InlandModeOfTransportStepDefSteps.scala) pattern: (?:I )?select radio option (.*) on the 'You have added (.+) departure means of transport?' page
        // whenIchooseRadioOptionXOnTheYouHaveAddedXBorderMeansOfTransportPage() [0.77] (BorderMeansOfTransportStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'You have added (.*) border means of transport' page

      And("I choose radio option Yes on the documents Do you want to add the type of identification for the departure means of transport? page")
        // Possible match (best=0.82)
        andIchooseRadioOptionXOnTheDocumentsDoYouWantToAddTheTypeOfIdentificationForTheDepartureMeansOfTransportPage("")
        // --- Other possible matches ---
        // andIchooseRadioOptionXOnTheDoYouWantToAddTheTypeOfIdentificationPage() [0.81] (BorderMeansOfTransportStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add the type of identification\?' page
        // andIchooseRadioOptionXOnTheDepartureMeansXPage() [0.77] (InlandModeOfTransportStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the departure means '(.*)' page
        // andIchooseRadioOptionXOnTheDoYouWantToAddADepartureMeansOfTransportForHouseConsignmentXPage() [0.77] (UnloadingStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a departure means of transport for house consignment (.*)\?' page
        // andIchooseRadioOptionXOnTheDoYouWantToAddADocumentForTheItemPage() [0.77] (UnloadingStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a document for the item\?' page
        // andIchooseRadioOptionXOnTheDoYouWantToAddAnAuthorisationPage() [0.76] (TransportAuthorisationsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add an authorisation' page
        // andIchooseRadioOptionXOnTheDoYouWantToAddASealPage() [0.76] (TransportEquipmentChargesStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a seal\?' page
        // andIChooseRadioOptionXOnTheDoYouWantToAddACarrierPage() [0.76] (CarrierDetailsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a carrier\?' page
        // andIchooseRadioOptionXOnTheWhichIdentificationDoYouWantToUseForTheDepartureMeansOfTransportPage() [0.75] (UnloadingStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Which identification do you want to use for the departure means of transport\?' page

      And("I choose radio option IMO Ship Identification Number on the Which identification do you want to use for the departure means of transport? page")
        // Possible match (best=0.82)
        andIchooseRadioOptionXOnTheWhichIdentificationDoYouWantToUseForTheDepartureMeansOfTransportPage("")
        // --- Other possible matches ---
        // andIchooseRadioOptionXOnThePresentationDepartureMeansOfTransportWhichIdentificationDoYouWantToUseForTheDepartureMeansOfTransportPage() [0.80] (PresentationNotificationStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the presentation departure means of transport 'Which identification do you want to use for the departure means of transport\?' page
        // andIchooseRadioOptionXOnTheWhichIdentificationDoYouWantToUseForTheNewDepartureMeansOfTransportPage() [0.79] (UnloadingStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Which identification do you want to use for the new departure means of transport\?' page
        // andIchooseRadioOptionXOnTheDepartureMeansXPage() [0.77] (InlandModeOfTransportStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the departure means '(.*)' page
        // andIchooseRadioOptionXOnTheWhichIdentificationDoYouWantToUseForTheDepartureMeansOfTransportInHouseConsignmentXPage() [0.76] (UnloadingStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Which identification do you want to use for the departure means of transport in house consignment (.*)\?' page

      And("I choose radio option Yes on the documents Do you want to add an identification number for this vehicle? page")
        // Possible match (best=0.82)
        andIchooseRadioOptionXOnTheDocumentsDoYouWantToAddAnIdentificationNumberForThisVehiclePage("")
        // --- Other possible matches ---
        // andIchooseRadioOptionXOnTheDoYouWantToAddAnIdentificationNumberForThisVehiclePage() [0.81] (BorderMeansOfTransportStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add an identification number for this vehicle\?' page
        // andIchooseRadioOptionXOnTheDoYouWantToAddADocumentForTheItemPage() [0.77] (UnloadingStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a document for the item\?' page
        // andIchooseRadioOptionXOnTheDoYouWantToAddAContainerIdentificationNumberPage() [0.77] (TransportEquipmentChargesStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a container identification number\?' page
        // andIchooseRadioOptionXOnTheDoYouWantToAddAnAuthorisationPage() [0.76] (TransportAuthorisationsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add an authorisation' page
        // andIchooseRadioOptionXOnTheDoYouWantToAddASealPage() [0.76] (TransportEquipmentChargesStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a seal\?' page
        // andIChooseRadioOptionXOnTheDoYouWantToAddACarrierPage() [0.76] (CarrierDetailsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a carrier\?' page

      And("I enter identification number Identify1234 on What is the identification number for this vehicle? page")
        // Possible match (best=0.80)
        andIenterIdentificationNumberOnWhatIsTheIdentificationNumberForThisVehiclePage("")
        // --- Other possible matches ---
        // andIenterIdentificationOnTheWhatIsTheIdentificationNumberForThisPage() [0.80] (BorderMeansOfTransportStepDefSteps.scala) pattern: (?:I )?enter identification (.+) on the 'What is the identification number for this\?' page
        // andIenterIdentificationNumberOnWhatIsTheIdentificationNumberForThisPage() [0.80] (PresentationNotificationStepDefSteps.scala) pattern: (?:I )?enter identification number (.+) on 'What is the identification number for this\?' page

      And("I choose radio option Yes on the documents Do you want to add the registered country for this vehicle? page")
        // Possible match (best=0.82)
        andIchooseRadioOptionXOnTheDocumentsDoYouWantToAddTheRegisteredCountryForThisVehiclePage("")
        // --- Other possible matches ---
        // andIchooseRadioOptionXOnTheDoYouWantToAddTheRegisteredCountryForThisVehiclePage() [0.81] (BorderMeansOfTransportStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add the registered country for this vehicle\?' page
        // andIchooseRadioOptionXOnTheDoYouWantToAddADocumentForTheItemPage() [0.77] (UnloadingStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a document for the item\?' page
        // andIchooseRadioOptionXOnTheDoYouWantToAddAnAuthorisationPage() [0.76] (TransportAuthorisationsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add an authorisation' page
        // andIchooseRadioOptionXOnTheDoYouWantToAddASealPage() [0.76] (TransportEquipmentChargesStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a seal\?' page
        // andIChooseRadioOptionXOnTheDoYouWantToAddACarrierPage() [0.76] (CarrierDetailsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a carrier\?' page

      And("I select Germany - DE on the What country is this vehicle registered to? page")
        // Possible match (best=0.80)
        andIselectOnTheWhatCountryIsThisVehicleRegisteredToPage("")

      And("I choose to click on the Remove link on the You have added 2 departure means of transport page")
        // Possible match (best=0.93)
        whenIchooseToClickOnTheXLinkOnTheYouHaveAddedDepartureMeansOfTransportPage("", "")
        // --- Other possible matches ---
        // andIchooseToClickOnTheXLinkOnTheYouHaveAddedXDepartureMeansOfTransportPage() [0.93] (UnloadingStepDefSteps.scala) pattern: (?:I )?choose to click on the (.*) link on the 'You have added (.*) departure means of transport' page
        // andIchooseToClickOnTheXLinkOnTheYouHaveAddedXTransportEquipmentPage() [0.78] (UnloadingStepDefSteps.scala) pattern: (?:I )?choose to click on the (.*) link on the 'You have added (.*) transport equipment' page
        // andIchooseToClickOnTheXLinkOnTheYouHaveAddedXDocumentsPage() [0.77] (DocumentsStepDefSteps.scala) pattern: (?:I )?choose to click on the (.*) link on the 'You have added (.*) documents?' page
        // whenIchooseToClickOnXLinkOnTheYouHaveAddedXAuthorisationsPage() [0.76] (TransportAuthorisationsStepDefSteps.scala) pattern: (?:I )?choose to click on (.*) link on the 'You have added (.*) authorisations?' page

      And("I choose radio option Yes on the documents Are you sure you want to remove departure means of transport 1? page")
        // Possible match (best=0.93)
        andIchooseRadioOptionXOnTheDocumentsAreYouSureYouWantToRemoveDepartureMeansOfTransportPage("", "")
        // --- Other possible matches ---
        // andIchooseRadioOptionXOnTheAreYouSureYouWantToRemoveDepartureMeansOfTransportXPage() [0.83] (PresentationNotificationStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Are you sure you want to remove departure means of transport (.*)\?' page
        // andIchooseRadioOptionXForTheAreYouSureYouWantToRemoveDepartureMeansOfTransportPage() [0.79] (InlandModeOfTransportStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) for the 'Are you sure you want to remove departure means of transport (.+)\?' page
        // andIchooseRadioOptionXOnTheDocumentsAreYouSureYouWantToRemoveTransportEquipmentPage() [0.79] (UnloadingStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the documents 'Are you sure you want to remove transport equipment (.+)\?' page
        // andIchooseRadioOptionXOnTheDepartureMeansXPage() [0.77] (InlandModeOfTransportStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the departure means '(.*)' page

      And("I choose radio option No on the You have added 1 departure means of transport page")
        // Possible match (best=0.91)
        andIchooseRadioOptionXOnTheYouHaveAddedXDepartureMeansOfTransportPage("", "")
        // --- Other possible matches ---
        // andIchooseRadioOptionXOnThePresentationYouHaveAddedXDepartureMeansOfTransportPage() [0.78] (PresentationNotificationStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the presentation 'You have added (.*) departure means of transport' page
        // andIchooseRadioOptionXOnTheDepartureMeansXPage() [0.77] (InlandModeOfTransportStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the departure means '(.*)' page
        // andIselectRadioOptionXOnTheYouHaveAddedDepartureMeansOfTransportPage() [0.77] (InlandModeOfTransportStepDefSteps.scala) pattern: (?:I )?select radio option (.*) on the 'You have added (.+) departure means of transport?' page
        // whenIchooseRadioOptionXOnTheYouHaveAddedXBorderMeansOfTransportPage() [0.77] (BorderMeansOfTransportStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'You have added (.*) border means of transport' page

      And("I click the Add or remove transport equipment link for section Transport equipment 1")
        // Possible match (best=1.00)
        andIclickTheLinkForSection("Add or remove transport equipment", "Transport", "equipment 1")

      And("I choose radio option Yes on the cross check You have added 1 transport equipment page")
        // Possible match (best=0.91)
        andIchooseRadioOptionXOnTheCrossCheckYouHaveAddedXTransportEquipmentPage("", "")
        // --- Other possible matches ---
        // andIchooseRadioOptionXOnTheYouHaveAddedXTransportEquipmentPage() [0.80] (TransportEquipmentChargesStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'You have added (.*) transport equipment' page
        // andIchooseRadioOptionXOnThePresentationYouHaveAddedXTransportEquipmentPage() [0.76] (PresentationNotificationStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the presentation 'You have added (.*) transport equipment' page

      And("I choose radio option Yes on the cross check Do you want to add a container identification number for the transport equipment? page")
        // Possible match (best=0.82)
        andIchooseRadioOptionXOnTheCrossCheckDoYouWantToAddAContainerIdentificationNumberForTheTransportEquipmentPage("")
        // --- Other possible matches ---
        // andIchooseRadioOptionXOnTheDoYouWantToAddAContainerIdentificationNumberPage() [0.81] (TransportEquipmentChargesStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a container identification number\?' page
        // andIchooseRadioOptionXOnTheCrossCheckDoYouWantToAddASealForTheTransportEquipmentPage() [0.78] (UnloadingStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the cross check 'Do you want to add a seal for the transport equipment\?' page
        // andIchooseRadioOptionXOnTheDoYouWantToAddAnyTransportEquipmentPage() [0.76] (TransportEquipmentChargesStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add any transport equipment\?' page
        // andIchooseRadioOptionXOnTheDoYouWantToAddAnAuthorisationPage() [0.76] (TransportAuthorisationsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add an authorisation' page
        // andIchooseRadioOptionXOnTheDoYouWantToAddASealPage() [0.76] (TransportEquipmentChargesStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a seal\?' page
        // andIChooseRadioOptionXOnTheDoYouWantToAddACarrierPage() [0.76] (CarrierDetailsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a carrier\?' page

      And("I enter identification number Container1234 on What is the container identification number? page")
        // Possible match (best=0.80)
        andIenterIdentificationNumberOnWhatIsTheContainerIdentificationNumberPage("")
        // --- Other possible matches ---
        // andIenterOnTheWhatIsTheContainerIdentificationNumberPage() [0.79] (TransportEquipmentChargesStepDefSteps.scala) pattern: (?:I )?enter (.+) on the 'What is the container identification number\?' page
        // andIenterIdentificationNumberOnWhatIsTheNewContainerIdentificationNumberPage() [0.75] (UnloadingStepDefSteps.scala) pattern: (?:I )?enter identification number (.+) on 'What is the new container identification number\?' page

      And("I choose radio option Yes on the cross check Do you want to add a seal for the transport equipment? page")
        // Possible match (best=0.82)
        andIchooseRadioOptionXOnTheCrossCheckDoYouWantToAddASealForTheTransportEquipmentPage("")
        // --- Other possible matches ---
        // andIchooseRadioOptionXOnTheDoYouWantToAddASealPage() [0.80] (TransportEquipmentChargesStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a seal\?' page
        // andIchooseRadioOptionXOnTheDoYouWantToAddAnyTransportEquipmentPage() [0.76] (TransportEquipmentChargesStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add any transport equipment\?' page
        // andIchooseRadioOptionXOnTheDoYouWantToAddAnAuthorisationPage() [0.76] (TransportAuthorisationsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add an authorisation' page
        // andIChooseRadioOptionXOnTheDoYouWantToAddACarrierPage() [0.76] (CarrierDetailsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a carrier\?' page

      And("I enter identification number Seal1234 on What is the seal identification number? page")
        // Possible match (best=0.80)
        andIenterIdentificationNumberOnWhatIsTheSealIdentificationNumberPage("")
        // --- Other possible matches ---
        // andIenterOnTheWhatIsTheSealIdentificationNumberPage() [0.79] (TransportEquipmentChargesStepDefSteps.scala) pattern: (?:I )?enter (.+) on the 'What is the seal identification number\?' page

      And("I click Remove on You have added 1 seals to transport equipment 2 page")
        // ⚠️ No step-def match found for: I click Remove on You have added 1 seals to transport equipment 2 page

      And("I choose radio option Yes on Are you sure you want to remove this seal from transport equipment 2? page")
        // Possible match (best=0.93)
        andIchooseRadioOptionXOnAreYouSureYouWantToRemoveThisSealFromTransportEquipmentXPage("", "")
        // --- Other possible matches ---
        // andIchooseRadioOptionXOnTheAreYouSureYouWantToRemoveThisItemFromTransportEquipmentPage() [0.77] (UnloadingStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Are you sure you want to remove this item from transport equipment (.+)\?' page
        // andIchooseRadioOptionXOnTheDocumentsAreYouSureYouWantToRemoveTransportEquipmentPage() [0.75] (UnloadingStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the documents 'Are you sure you want to remove transport equipment (.+)\?' page

      And("I click radio option No on the You have added 0 seals to transport equipment 2 page")
        // ⚠️ No step-def match found for: I click radio option No on the You have added 0 seals to transport equipment 2 page

      And("I choose radio option Yes on the cross check Do any items apply to this transport equipment? page")
        // Possible match (best=0.81)
        andIchooseRadioOptionXOnTheCrossCheckDoAnyItemsApplyToThisTransportEquipmentPage("")

      And("I select 1 on the Which item does this transport equipment apply to? page")
        // Possible match (best=0.80)
        andIselectOnTheWhichItemDoesThisTransportEquipmentApplyToPage("")

      And("I click Remove on You have applied 1 item to transport equipment 2 page")
        // ⚠️ No step-def match found for: I click Remove on You have applied 1 item to transport equipment 2 page

      And("I choose radio option Yes on the Are you sure you want to remove this item from transport equipment 2? page")
        // Possible match (best=0.93)
        andIchooseRadioOptionXOnTheAreYouSureYouWantToRemoveThisItemFromTransportEquipmentPage("", "")
        // --- Other possible matches ---
        // andIchooseRadioOptionXForTheAreYouSureYouWantToRemoveThisItemFromTransportEquipmentPage() [0.80] (PresentationNotificationStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) for the 'Are you sure you want to remove this item from transport equipment (.+)\?' page
        // andIchooseRadioOptionXOnAreYouSureYouWantToRemoveThisSealFromTransportEquipmentXPage() [0.79] (UnloadingStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on 'Are you sure you want to remove this seal from transport equipment (.*)\?' page
        // andIchooseRadioOptionXOnTheDocumentsAreYouSureYouWantToRemoveTransportEquipmentPage() [0.79] (UnloadingStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the documents 'Are you sure you want to remove transport equipment (.+)\?' page
        // andIchooseRadioOptionXOnTheAreYouSureYouWantToRemoveThisGuaranteePage() [0.77] (Departure_GuaranteeDetailsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Are you sure you want to remove this guarantee\?' page

      And("I click radio option No on the You have applied 0 items to transport equipment 2 page")
        // ⚠️ No step-def match found for: I click radio option No on the You have applied 0 items to transport equipment 2 page

      And("I choose to click on the Remove link on the You have added 2 transport equipment page")
        // Possible match (best=0.92)
        andIchooseToClickOnTheXLinkOnTheYouHaveAddedXTransportEquipmentPage("", "")
        // --- Other possible matches ---
        // andIclickTheXLinkOnTheYouHaveAddedXTransportEquipmentPage() [0.80] (TransportEquipmentChargesStepDefSteps.scala) pattern: (?:I )?click the (.*) link on the 'You have added (.*) transport equipment' page
        // andIchooseToClickOnTheXLinkOnTheYouHaveAddedXDocumentsPage() [0.77] (DocumentsStepDefSteps.scala) pattern: (?:I )?choose to click on the (.*) link on the 'You have added (.*) documents?' page
        // whenIchooseToClickOnXLinkOnTheYouHaveAddedXAuthorisationsPage() [0.76] (TransportAuthorisationsStepDefSteps.scala) pattern: (?:I )?choose to click on (.*) link on the 'You have added (.*) authorisations?' page

      And("I choose radio option Yes on the documents Are you sure you want to remove transport equipment 1? page")
        // Possible match (best=0.93)
        andIchooseRadioOptionXOnTheDocumentsAreYouSureYouWantToRemoveTransportEquipmentPage("", "")

      And("I choose radio option No on the cross check You have added 1 transport equipment page")
        // Possible match (best=0.91)
        andIchooseRadioOptionXOnTheCrossCheckYouHaveAddedXTransportEquipmentPage("", "")
        // --- Other possible matches ---
        // andIchooseRadioOptionXOnTheYouHaveAddedXTransportEquipmentPage() [0.80] (TransportEquipmentChargesStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'You have added (.*) transport equipment' page
        // andIchooseRadioOptionXOnThePresentationYouHaveAddedXTransportEquipmentPage() [0.76] (PresentationNotificationStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the presentation 'You have added (.*) transport equipment' page

      And("I click the Add or remove document link for section Document 1")
        // Possible match (best=1.00)
        andIclickTheLinkForSection("Add or remove document", "Document", "1")

      And("I choose radio option Yes on the You have added 2 documents to all items page")
        // Possible match (best=0.82)
        andIchooseRadioOptionXOnTheYouHaveAddedXDocumentstoAllItemsPage("", "")
        // --- Other possible matches ---
        // andIchooseRadioOptionXOnTheYouHaveAddedXDocumentsPage() [0.79] (DocumentsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'You have added (.*) documents?' page

      And("I Add Supporting - (C651) on the What type of document do you want to add? page")
        // Possible match (best=0.80)
        andIAddnTheWhatTypeOfDocumentDoYouWantToAddPage("")

      And("I enter reference number ref1234 on What is the document’s reference number? page")
        // Possible match (best=0.80)
        andIenterReferenceNumberOnWhatIsTheDocumentsReferenceNumberPage("")
        // --- Other possible matches ---
        // andIenterOnTheWhatIsTheDocumentsReferenceNumberPage() [0.80] (DocumentsStepDefSteps.scala) pattern: (?:I )?enter (.+) on the 'What is the document’s reference number\?' page
        // andIenterOnTheWhatIsTheReferencePage() [0.78] (Departure_GuaranteeDetailsStepDefSteps.scala) pattern: (?:I )?enter (.+) on the 'What is the reference\?' page
        // andIenterReferenceNumberOnTheWhatIsTheDocumentsNewReferenceNumberPage() [0.76] (UnloadingStepDefSteps.scala) pattern: (?:I )?enter reference number (.+) on the 'What is the document’s new reference number\?' page

      And("I choose radio option Yes on the documents Do you want to add any additional information for this document? page")
        // Possible match (best=0.82)
        andIchooseRadioOptionXOnTheDocumentsDoYouWantToAddAnyAdditionalInformationForThisDocumentPage("")
        // --- Other possible matches ---
        // andIchooseRadioOptionXOnTheDoYouWantToAddADocumentForTheItemPage() [0.77] (UnloadingStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a document for the item\?' page
        // andIchooseRadioOptionXOnTheDoYouWantToAddAnAuthorisationPage() [0.76] (TransportAuthorisationsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add an authorisation' page
        // andIchooseRadioOptionXOnTheDoYouWantToAddASealPage() [0.76] (TransportEquipmentChargesStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a seal\?' page
        // andIChooseRadioOptionXOnTheDoYouWantToAddACarrierPage() [0.76] (CarrierDetailsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a carrier\?' page
        // andIchooseRadioOptionXOnTheDoYouWantToAddAnyDocumentsForHouseConsignmentXPage() [0.75] (UnloadingStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add any documents for house consignment (.*)\?' page

      And("I enter additional information 12345 on documents Enter the additional information? page")
        // Possible match (best=0.79)
        andIenterAdditionalInformationOnDocumentsEnterTheAdditionalInformationPage("")
        // --- Other possible matches ---
        // andIenterOnTheDocumentsEnterTheAdditionalInformationPage() [0.79] (PreviousStepDefSteps.scala) pattern: (?:I )?enter (.+) on the Documents 'Enter the additional information' page
        // andIenterXOnTheEnterTheAdditionalInformationPage() [0.78] (ItemDetailsStepDefSteps.scala) pattern: (?:I )?enter (.*) on the 'Enter the additional information' page

      And("I choose to click on the Remove link on the You have added 3 documents to all items page")
        // Possible match (best=0.83)
        andIchooseToClickOnTheXLinkOnTheYouHaveAddedXDocumentstoAllItemsPage("", "")
        // --- Other possible matches ---
        // andIchooseToClickOnTheXLinkOnTheYouHaveAddedXDocumentsPage() [0.81] (DocumentsStepDefSteps.scala) pattern: (?:I )?choose to click on the (.*) link on the 'You have added (.*) documents?' page
        // andIclickTheXLinkOnTheYouHaveAddedXItemsPage() [0.79] (ItemDetailsStepDefSteps.scala) pattern: (?:I )?click the (.*) link on the 'You have added (.*) items?' page
        // whenIchooseToClickOnXLinkOnTheYouHaveAddedXAuthorisationsPage() [0.76] (TransportAuthorisationsStepDefSteps.scala) pattern: (?:I )?choose to click on (.*) link on the 'You have added (.*) authorisations?' page

      And("I choose radio option Yes on the documents Are you sure you want to remove this document from all items? page")
        // Possible match (best=0.82)
        andIchooseRadioOptionXOnTheDocumentsAreYouSureYouWantToRemoveThisDocumentFromAllItemsPage("")
        // --- Other possible matches ---
        // andIchooseRadioOptionXOnTheAreYouSureYouWantToRemoveThisGuaranteePage() [0.77] (Departure_GuaranteeDetailsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Are you sure you want to remove this guarantee\?' page
        // andIchooseRadioOptionXOnTheAreYouSureYouWantToRemoveThisItemFromTransportEquipmentPage() [0.77] (UnloadingStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Are you sure you want to remove this item from transport equipment (.+)\?' page
        // andIchooseRadioOptionXOnTheDocumentsAreYouSureYouWantToRemoveTransportEquipmentPage() [0.75] (UnloadingStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the documents 'Are you sure you want to remove transport equipment (.+)\?' page

      And("I choose radio option No on the You have added 2 documents to all items page")
        // Possible match (best=0.82)
        andIchooseRadioOptionXOnTheYouHaveAddedXDocumentstoAllItemsPage("", "")
        // --- Other possible matches ---
        // andIchooseRadioOptionXOnTheYouHaveAddedXDocumentsPage() [0.79] (DocumentsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'You have added (.*) documents?' page

      And("I click the Add or remove additional reference link for section Additional reference 1")
        // Possible match (best=1.00)
        andIclickTheLinkForSection("Add or remove additional reference", "Additional", "reference 1")

      And("I click radio option Yes on the You have added 1 additional reference page")
        // ⚠️ No step-def match found for: I click radio option Yes on the You have added 1 additional reference page

      And("I select Y023 - Consignee (AEO certificate number) on the What type of additional reference do you want to add? page")
        // Possible match (best=0.81)
        andIselectOnTheWhatTypeOfAdditionalReferenceDoYouWantToAddPage("")
        // --- Other possible matches ---
        // andIselectOnTheWhatTypeOfAdditionalInformationDoYouWantToAddPage() [0.76] (ItemDetailsStepDefSteps.scala) pattern: (?:I )?select (.+) on the 'What type of additional information do you want to add\?' page
        // andIselectOnTheWhatTypeOfDocumentDoYouWantToAddPage() [0.76] (DocumentsStepDefSteps.scala) pattern: (?:I )?select (.+) on the 'What type of document do you want to add\?' page

      And("I click radio option Yes on the Do you want to add an additional reference number? page")
        // Possible match (best=0.81)
        andIclickRadioOptionXOnTheDoYouWantToAddAnAdditionalReferenceNumberPage("")

      And("I enter additional reference newRef999 on the What is the additional reference number? page")
        // Possible match (best=0.80)
        andenterAdditionalReferenceOnTheWhatIsTheNewAdditionalReferenceNumberPage("")
        // --- Other possible matches ---
        // andIenterAdditionalReferenceXOnTheWhatIsTheAdditionalReferenceNumberPage() [0.80] (ItemDetailsStepDefSteps.scala) pattern: (?:I )?enter additional reference (.*) on the 'What is the additional reference number\?' page
        // andIenterXOnTheEnterTheAdditionalReferenceNumberPage() [0.79] (ItemDetailsStepDefSteps.scala) pattern: (?:I )?enter (.*) on the 'Enter the additional reference number' page
        // andIenterOnTheWhatIsTheReferencePage() [0.78] (Departure_GuaranteeDetailsStepDefSteps.scala) pattern: (?:I )?enter (.+) on the 'What is the reference\?' page

      And("I click the Remove link on the You have added 2 additional references page")
        // Possible match (best=0.90)
        andIclickTheXLinkOnTheYouHaveAddedXAdditionalReferencesPage("", "")

      And("I click radio option Yes on the Are you sure you want to remove this additional reference? page")
        // Possible match (best=0.81)
        andIclickRadioOptionXOnTheAreYouSureYouWantToRemoveThisAdditionalReferencePage("")
        // --- Other possible matches ---
        // andIclickRadioOptionXOnTheAreYouSureYouWantToRemoveItemXPage() [0.78] (ItemDetailsStepDefSteps.scala) pattern: (?:I )?click radio option (.*) on the 'Are you sure you want to remove item (.*)\?' page
        // andIclickRadioOptionXOnTheAreYouSureYouWantToRemoveThisAdditionalInformationPage() [0.77] (ItemDetailsStepDefSteps.scala) pattern: (?:I )?click radio option (.*) on the 'Are you sure you want to remove this additional information\?' page
        // andIclickRadioOptionXOnTheAreYouSureYouWantToRemoveThisDocumentPage() [0.77] (DocumentsStepDefSteps.scala) pattern: (?:I )?click radio option (.*) on the 'Are you sure you want to remove this document\?' page
        // andIclickRadioOptionXOnTheAreYouSureYouWantToRemoveThisSealpage() [0.77] (TransportEquipmentChargesStepDefSteps.scala) pattern: (?:I )?click radio option (.*) on the 'Are you sure you want to remove this seal\?' page

      And("I click radio option No on the You have added 1 additional reference page")
        // ⚠️ No step-def match found for: I click radio option No on the You have added 1 additional reference page

      And("I click the add or remove countries of routing link")
        // Possible match (best=1.00)
        andIclickTheAddOrRemoveCountriesOfRoutingLink()

      And("I select radio option Yes on the You have added 0 countries to the transit route page")
        // Possible match (best=0.83)
        andIselectRadioOptionXOnTheYouHaveAddedXCountriestoTheTransitRoutePage("", "")

      And("I select France on the Unloading Which country do you want to add to the transit route? page")
        // Possible match (best=0.81)
        andIselectOnTheUnloadingWhichCountryDoYouWantToAddToTheTransitRoutePage("")
        // --- Other possible matches ---
        // andIselectOnTheWhichCountryDoYouWantToAddToTheTransitRoutePage() [0.81] (RouteDetailsStepDefSteps.scala) pattern: (?:I )?select (.+) on the 'Which country do you want to add to the transit route\?' page

      And("I select radio option Yes on the You have added 1 country to the transit route page")
        // Possible match (best=0.79)
        andIselectRadioOptionXOnTheYouHaveAddedXCountriestoTheTransitRoutePage("", "")

      And("I select Germany on the Unloading Which country do you want to add to the transit route? page")
        // Possible match (best=0.81)
        andIselectOnTheUnloadingWhichCountryDoYouWantToAddToTheTransitRoutePage("")
        // --- Other possible matches ---
        // andIselectOnTheWhichCountryDoYouWantToAddToTheTransitRoutePage() [0.81] (RouteDetailsStepDefSteps.scala) pattern: (?:I )?select (.+) on the 'Which country do you want to add to the transit route\?' page

      And("I click on the Remove link on the You have added 2 countries to the transit route page")
        // Possible match (best=0.83)
        andIclickOnTheXLinkOnTheYouHaveAddedXCountriestoTheTransitRoutePage("", "")

      And("I select radio option Yes on the Are you sure you want to remove this country from the transit route? page")
        // Possible match (best=0.82)
        andIselectRadioOptionXOnTheAreYouSureYouWantToRemoveThisCountryFromTheTransitRoutePage("")

      And("I select radio option No on the You have added 1 country to the transit route page")
        // Possible match (best=0.79)
        andIselectRadioOptionXOnTheYouHaveAddedXCountriestoTheTransitRoutePage("", "")

    }

    Scenario("02 - Unloading remarks - Item level Cross-check page add and remove journeys") {
      Given("I click the More details link for house consignment 1 on the Enter the discrepancies between the transit movement and unloading permission page")
        // Possible match (best=0.97)
        givenIclickTheMoreDetailsLinkForHouseConsignmentOnTheEnterTheDiscrepanciesBetweenTheTransitMovementAndUnloadingPermissionPage("")

      And("I should be on the House consignment 1 page")
        // Possible match (best=0.92)
        thenIshouldBeOnTheHouseConsignmentPage("")

      And("I click the Add or remove item link on house consignment for section Items 1")
        // Possible match (best=1.00)
        andIclickTheLinkOnHouseConsignmentForSection("Add or remove item", "Items", "1")

      And("I click radio option Yes on the You have added 1 item for house consignment 1 page")
        // Possible match (best=0.80)
        andIclickRadioOptionXOnTheYouHaveAddedXHouseConsignmentPage("", "")
        // --- Other possible matches ---
        // andIclickRadioOptionXOnTheYouHaveAddedXItemPage() [0.79] (ItemDetailsStepDefSteps.scala) pattern: (?:I )?click radio option (.*) on the 'You have added (.*) item' page

      And("I enter testing on the Enter the description of item 2 in house consignment 1 page")
        // Possible match (best=0.78)
        andIenterXOnTheEnterADescriptionOfItemXPage("", "")

      And("I choose radio option Yes on the Do you want to add the item’s gross weight? page")
        // Possible match (best=0.81)
        andIhooseRadioOptionXOnTheDoYouWantToAddTheItemsGrossWeightPage("")
        // --- Other possible matches ---
        // andIchooseRadioOptionXOnTheDoYouWantToAddTheItemsNetWeightPage() [0.77] (UnloadingStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add the item’s net weight\?' page
        // andIchooseRadioOptionXOnTheDoYouWantToAddAnAuthorisationPage() [0.76] (TransportAuthorisationsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add an authorisation' page
        // andIchooseRadioOptionXOnTheDoYouWantToAddASealPage() [0.76] (TransportEquipmentChargesStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a seal\?' page
        // andIChooseRadioOptionXOnTheDoYouWantToAddACarrierPage() [0.76] (CarrierDetailsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a carrier\?' page

      And("enter number 741.56 on What is the gross weight of item 2 in house consignment 1? page")
        // ⚠️ No step-def match found for: enter number 741.56 on What is the gross weight of item 2 in house consignment 1? page

      And("I choose radio option Yes on the Do you want to add the item’s net weight? page")
        // Possible match (best=0.81)
        andIchooseRadioOptionXOnTheDoYouWantToAddTheItemsNetWeightPage("")
        // --- Other possible matches ---
        // andIhooseRadioOptionXOnTheDoYouWantToAddTheItemsGrossWeightPage() [0.77] (UnloadingStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add the item’s gross weight\?' page
        // andIchooseRadioOptionXOnTheDoYouWantToAddAnAuthorisationPage() [0.76] (TransportAuthorisationsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add an authorisation' page
        // andIchooseRadioOptionXOnTheDoYouWantToAddASealPage() [0.76] (TransportEquipmentChargesStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a seal\?' page
        // andIChooseRadioOptionXOnTheDoYouWantToAddACarrierPage() [0.76] (CarrierDetailsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a carrier\?' page

      And("I enter number 5681.22 on What is the net weight of item 2 in house consignment 1? page")
        // Possible match (best=0.82)
        andIenterNumberOnWhatIsTheNetWeightOfItemInHouseConsignment1Page("", "")
        // --- Other possible matches ---
        // andIenterXOnTheWhatIsTheItemsNetWeightPage() [0.80] (ItemDetailsStepDefSteps.scala) pattern: (?:I )?enter (.*) on the 'What is the item’s net weight\?' page
        // andIenterNumberOnWhatIsTheGrossWeightOfHouseConsignmentPage() [0.76] (UnloadingStepDefSteps.scala) pattern: (?:I )?enter number (.+) on 'What is the gross weight of House Consignment (.+)\?' page

      And("I choose radio option Yes on the Do you want to add a Unique Consignment Reference for this item? page")
        // Possible match (best=0.82)
        andIchooseRadioOptionXOnTheDoYouWantToAddAUniqueConsignmentReferenceForThisItemPage("")
        // --- Other possible matches ---
        // andIChooseRadioOptionXOnTheDoYouWantToAddAUniqueConsignmentReferencePage() [0.81] (ItemDetailsStepDefSteps.scala) pattern: (?:I )? choose radio option (.*) on the 'Do you want to add a Unique Consignment Reference\?' page
        // andIchooseRadioOptionXOnTheDoYouWantToAddAnItemForHouseConsignmentXPage() [0.79] (UnloadingStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add an item for house consignment (.*)\?' page
        // andIchooseRadioOptionXOnTheDoYouWantToAddAUniqueConsignmentReferenceForThisHouseConsignmentPage() [0.78] (UnloadingStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a Unique Consignment Reference for this house consignment\?' page
        // andIchooseRadioOptionXOnTheDoYouWantToAddAnAdditionalReferenceForTheItemPage() [0.78] (UnloadingStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add an additional reference for the item\?' page
        // andIchooseRadioOptionXOnTheDoYouWantToAddAReferenceForTheGuaranteePage() [0.77] (Departure_GuaranteeDetailsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a reference for the guarantee\?' page
        // andIchooseRadioOptionXOnTheDoYouWantToAddADocumentForTheItemPage() [0.77] (UnloadingStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a document for the item\?' page
        // andIchooseRadioOptionXOnTheDoYouWantToAddAPackageForTheItemPage() [0.77] (UnloadingStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a package for the item\?' page
        // andIchooseRadioOptionXOnTheDoYouWantToAddAnAdditionalReferenceForHouseConsignmentXPage() [0.76] (UnloadingStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add an additional reference for house consignment (.*)\?' page
        // andIchooseRadioOptionXOnTheDoYouWantToAddAnAuthorisationPage() [0.76] (TransportAuthorisationsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add an authorisation' page
        // andIchooseRadioOptionXOnTheDoYouWantToAddASealPage() [0.76] (TransportEquipmentChargesStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a seal\?' page
        // andIChooseRadioOptionXOnTheDoYouWantToAddACarrierPage() [0.76] (CarrierDetailsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a carrier\?' page

      And("I enter reference UCRHC12312 on the What is the Unique Consignment Reference for item 2 in house consignment 1? page")
        // Possible match (best=0.83)
        andIenterReferenceOnTheWhatIsTheUniqueConsignmentReferenceForItemInHouseConsignment1Page("", "")
        // --- Other possible matches ---
        // andIenterOnTheWhatIsTheUniqueConsignmentReferenceForHouseConsignmentPage() [0.81] (UnloadingStepDefSteps.scala) pattern: (?:I )?enter (.+) on the 'What is the Unique Consignment Reference for house consignment (.+)\?' page
        // andIenterXOnTheWhatIsTheUniqueConsignmentReferencePage() [0.79] (ItemDetailsStepDefSteps.scala) pattern: (?:I )?enter (.*) on the 'What is the Unique Consignment Reference\?' page
        // andIenterOnTheWhatIsTheUCRPage() [0.78] (TransportDetailsStepDefSteps.scala) pattern: (?:I )?enter (.+) on the 'What is the UCR\?' page
        // andIenterOnTheWhatIsTheReferencePage() [0.78] (Departure_GuaranteeDetailsStepDefSteps.scala) pattern: (?:I )?enter (.+) on the 'What is the reference\?' page

      And("I choose radio option Yes on the Do you want to add a Customs Union and Statistics (CUS) code for the item? page")
        // Possible match (best=0.84)
        andIchooseRadioOptionXOnTheDoYouWantToAddACustomsUnionAndStatisticsXCodeForTheItemPage("", "")
        // --- Other possible matches ---
        // andIchooseRadioOptionXOnTheDoYouWantToAddACommodityCodeForTheItemPage() [0.78] (UnloadingStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a commodity code for the item\?' page
        // andIchooseRadioOptionXOnTheDoYouWantToAddADocumentForTheItemPage() [0.77] (UnloadingStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a document for the item\?' page
        // andIchooseRadioOptionXOnTheDoYouWantToAddAPackageForTheItemPage() [0.77] (UnloadingStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a package for the item\?' page
        // andIchooseRadioOptionXOnTheDoYouWantToAddAnAuthorisationPage() [0.76] (TransportAuthorisationsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add an authorisation' page
        // andIchooseRadioOptionXOnTheDoYouWantToAddASealPage() [0.76] (TransportEquipmentChargesStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a seal\?' page
        // andIChooseRadioOptionXOnTheDoYouWantToAddACarrierPage() [0.76] (CarrierDetailsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a carrier\?' page
        // andIchooseRadioOptionXOnTheDoYouWantToAddAnItemForHouseConsignmentXPage() [0.75] (UnloadingStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add an item for house consignment (.*)\?' page

      And("I enter number 0010003-8 on What is the Customs Union and Statistics code for item 2 in house consignment 1? page")
        // Possible match (best=0.90)
        andIenterNumberOnWhatIsTheCustomsUnionAndStatisticsCodeForItemInHouseConsignmentPage("", "", "")
        // --- Other possible matches ---
        // andIenterXOnTheWhatIsTheCustomsUnionAndStatisticsCodePage() [0.80] (ItemDetailsStepDefSteps.scala) pattern: (?:I )?enter (.*) on the 'What is the Customs Union and Statistics code\?' page

      And("I choose radio option Yes on the Do you want to add a commodity code for the item? page")
        // Possible match (best=0.81)
        andIchooseRadioOptionXOnTheDoYouWantToAddACommodityCodeForTheItemPage("")
        // --- Other possible matches ---
        // andIchooseRadioOptionXOnTheDoYouWantToAddADocumentForTheItemPage() [0.77] (UnloadingStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a document for the item\?' page
        // andIchooseRadioOptionXOnTheDoYouWantToAddAPackageForTheItemPage() [0.77] (UnloadingStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a package for the item\?' page
        // andIchooseRadioOptionXOnTheDoYouWantToAddAnAuthorisationPage() [0.76] (TransportAuthorisationsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add an authorisation' page
        // andIchooseRadioOptionXOnTheDoYouWantToAddASealPage() [0.76] (TransportEquipmentChargesStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a seal\?' page
        // andIChooseRadioOptionXOnTheDoYouWantToAddACarrierPage() [0.76] (CarrierDetailsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a carrier\?' page
        // andIchooseRadioOptionXOnTheDoYouWantToAddAnItemForHouseConsignmentXPage() [0.75] (UnloadingStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add an item for house consignment (.*)\?' page

      And("I enter number 010130 on What is the commodity code for item 2 in house consignment 1? page")
        // Possible match (best=0.82)
        andIenterNumberOnWhatIsTheCommodityCodeForItemInHouseConsignment1Page("", "")
        // --- Other possible matches ---
        // andIenterXOnTheWhatIsTheCommodityCodePage() [0.79] (ItemDetailsStepDefSteps.scala) pattern: (?:I )?enter (.*) on the 'What is the commodity code\?' page

      And("I choose radio option Yes on the Do you want to add a combined nomenclature code for the item? page")
        // Possible match (best=0.82)
        andIchooseRadioOptionXOnTheDoYouWantToAddACombinedNomenclatureCodeForTheItemPage("")
        // --- Other possible matches ---
        // andIchooseRadioOptionXOnTheDoYouWantToAddACommodityCodeForTheItemPage() [0.78] (UnloadingStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a commodity code for the item\?' page
        // andIchooseRadioOptionXOnTheDoYouWantToAddADocumentForTheItemPage() [0.77] (UnloadingStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a document for the item\?' page
        // andIchooseRadioOptionXOnTheDoYouWantToAddAPackageForTheItemPage() [0.77] (UnloadingStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a package for the item\?' page
        // andIchooseRadioOptionXOnTheDoYouWantToAddAnAuthorisationPage() [0.76] (TransportAuthorisationsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add an authorisation' page
        // andIchooseRadioOptionXOnTheDoYouWantToAddASealPage() [0.76] (TransportEquipmentChargesStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a seal\?' page
        // andIChooseRadioOptionXOnTheDoYouWantToAddACarrierPage() [0.76] (CarrierDetailsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a carrier\?' page
        // andIchooseRadioOptionXOnTheDoYouWantToAddAnItemForHouseConsignmentXPage() [0.75] (UnloadingStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add an item for house consignment (.*)\?' page

      And("I enter number 84 on What is the combined nomenclature code for item 2 in house consignment 1? page")
        // Possible match (best=0.83)
        andIenterNumberOnWhatIsTheCombinedNomenclatureCodeForItemInHouseConsignment1Page("", "")
        // --- Other possible matches ---
        // andIenterXOnTheWhatIsTheCombinedNomenclatureCodePage() [0.79] (ItemDetailsStepDefSteps.scala) pattern: (?:I )?enter (.*) on the 'What is the combined nomenclature code\?' page

      And("I choose radio option Yes on the Do you want to add a document for the item? page")
        // Possible match (best=0.81)
        andIchooseRadioOptionXOnTheDoYouWantToAddADocumentForTheItemPage("")
        // --- Other possible matches ---
        // andIchooseRadioOptionXOnTheDoYouWantToAddAPackageForTheItemPage() [0.77] (UnloadingStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a package for the item\?' page
        // andIchooseRadioOptionXOnTheDoYouWantToAddAnAuthorisationPage() [0.76] (TransportAuthorisationsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add an authorisation' page
        // andIchooseRadioOptionXOnTheDoYouWantToAddASealPage() [0.76] (TransportEquipmentChargesStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a seal\?' page
        // andIChooseRadioOptionXOnTheDoYouWantToAddACarrierPage() [0.76] (CarrierDetailsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a carrier\?' page
        // andIchooseRadioOptionXOnTheDoYouWantToAddAnItemForHouseConsignmentXPage() [0.75] (UnloadingStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add an item for house consignment (.*)\?' page

      And("I Add Supporting - (C651) on the What type of document do you want to add for item 2 in house consignment 1? page")
        // Possible match (best=0.84)
        andIAddOnTheWhatTypeOfDocumentDoYouWantToAddForItemXInHouseConsignment1Page("", "")
        // --- Other possible matches ---
        // andIAddnTheWhatTypeOfDocumentDoYouWantToAddPage() [0.80] (UnloadingStepDefSteps.scala) pattern: (?:I )?Add (.+) on the 'What type of document do you want to add\?' page

      And("I enter reference number ref1234 on What is the document’s reference number for item 2 in house consignment 1? page")
        // Possible match (best=0.80)
        andIenterReferenceNumberOnWhatIsTheDocumentsReferenceNumberPage("")
        // --- Other possible matches ---
        // andIenterOnTheWhatIsTheDocumentsReferenceNumberPage() [0.80] (DocumentsStepDefSteps.scala) pattern: (?:I )?enter (.+) on the 'What is the document’s reference number\?' page
        // andIenterOnTheWhatIsTheReferencePage() [0.78] (Departure_GuaranteeDetailsStepDefSteps.scala) pattern: (?:I )?enter (.+) on the 'What is the reference\?' page
        // andIenterOnTheWhatIsTheUniqueConsignmentReferenceForHouseConsignmentPage() [0.77] (UnloadingStepDefSteps.scala) pattern: (?:I )?enter (.+) on the 'What is the Unique Consignment Reference for house consignment (.+)\?' page
        // andIenterReferenceNumberOnTheWhatIsTheDocumentsNewReferenceNumberPage() [0.76] (UnloadingStepDefSteps.scala) pattern: (?:I )?enter reference number (.+) on the 'What is the document’s new reference number\?' page

      And("I choose radio option Yes on the documents Do you want to add any additional information for this document? page")
        // Possible match (best=0.82)
        andIchooseRadioOptionXOnTheDocumentsDoYouWantToAddAnyAdditionalInformationForThisDocumentPage("")
        // --- Other possible matches ---
        // andIchooseRadioOptionXOnTheDoYouWantToAddADocumentForTheItemPage() [0.77] (UnloadingStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a document for the item\?' page
        // andIchooseRadioOptionXOnTheDoYouWantToAddAnAuthorisationPage() [0.76] (TransportAuthorisationsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add an authorisation' page
        // andIchooseRadioOptionXOnTheDoYouWantToAddASealPage() [0.76] (TransportEquipmentChargesStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a seal\?' page
        // andIChooseRadioOptionXOnTheDoYouWantToAddACarrierPage() [0.76] (CarrierDetailsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a carrier\?' page
        // andIchooseRadioOptionXOnTheDoYouWantToAddAnyDocumentsForHouseConsignmentXPage() [0.75] (UnloadingStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add any documents for house consignment (.*)\?' page

      And("I enter additional information 12345 on documents Enter the additional information for item 2 in house consignment 1 page")
        // Possible match (best=0.93)
        andIenterAdditionalInformationOnDocumentsEnterTheAdditionalInformationForItemXInHouseConsignment1Page("", "")
        // --- Other possible matches ---
        // andIenterAdditionalInformationOnDocumentsEnterTheAdditionalInformationPage() [0.79] (UnloadingStepDefSteps.scala) pattern: (?:I )?enter additional information (.+) on documents 'Enter the additional information\?' page
        // andIenterOnTheDocumentsEnterTheAdditionalInformationPage() [0.79] (PreviousStepDefSteps.scala) pattern: (?:I )?enter (.+) on the Documents 'Enter the additional information' page
        // andIenterXOnTheEnterTheAdditionalInformationPage() [0.78] (ItemDetailsStepDefSteps.scala) pattern: (?:I )?enter (.*) on the 'Enter the additional information' page

      And("I click Yes on house consignment document You have added 1 document to item 2 in house consignment 1 page")
        // ⚠️ No step-def match found for: I click Yes on house consignment document You have added 1 document to item 2 in house consignment 1 page

      And("I Add Supporting - (C651) on the What type of document do you want to add for item 2 in house consignment 1? page")
        // Possible match (best=0.84)
        andIAddOnTheWhatTypeOfDocumentDoYouWantToAddForItemXInHouseConsignment1Page("", "")
        // --- Other possible matches ---
        // andIAddnTheWhatTypeOfDocumentDoYouWantToAddPage() [0.80] (UnloadingStepDefSteps.scala) pattern: (?:I )?Add (.+) on the 'What type of document do you want to add\?' page

      And("I enter reference number ref1234 on What is the document’s reference number for item 2 in house consignment 1? page")
        // Possible match (best=0.80)
        andIenterReferenceNumberOnWhatIsTheDocumentsReferenceNumberPage("")
        // --- Other possible matches ---
        // andIenterOnTheWhatIsTheDocumentsReferenceNumberPage() [0.80] (DocumentsStepDefSteps.scala) pattern: (?:I )?enter (.+) on the 'What is the document’s reference number\?' page
        // andIenterOnTheWhatIsTheReferencePage() [0.78] (Departure_GuaranteeDetailsStepDefSteps.scala) pattern: (?:I )?enter (.+) on the 'What is the reference\?' page
        // andIenterOnTheWhatIsTheUniqueConsignmentReferenceForHouseConsignmentPage() [0.77] (UnloadingStepDefSteps.scala) pattern: (?:I )?enter (.+) on the 'What is the Unique Consignment Reference for house consignment (.+)\?' page
        // andIenterReferenceNumberOnTheWhatIsTheDocumentsNewReferenceNumberPage() [0.76] (UnloadingStepDefSteps.scala) pattern: (?:I )?enter reference number (.+) on the 'What is the document’s new reference number\?' page

      And("I choose radio option Yes on the documents Do you want to add any additional information for this document? page")
        // Possible match (best=0.82)
        andIchooseRadioOptionXOnTheDocumentsDoYouWantToAddAnyAdditionalInformationForThisDocumentPage("")
        // --- Other possible matches ---
        // andIchooseRadioOptionXOnTheDoYouWantToAddADocumentForTheItemPage() [0.77] (UnloadingStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a document for the item\?' page
        // andIchooseRadioOptionXOnTheDoYouWantToAddAnAuthorisationPage() [0.76] (TransportAuthorisationsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add an authorisation' page
        // andIchooseRadioOptionXOnTheDoYouWantToAddASealPage() [0.76] (TransportEquipmentChargesStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a seal\?' page
        // andIChooseRadioOptionXOnTheDoYouWantToAddACarrierPage() [0.76] (CarrierDetailsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a carrier\?' page
        // andIchooseRadioOptionXOnTheDoYouWantToAddAnyDocumentsForHouseConsignmentXPage() [0.75] (UnloadingStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add any documents for house consignment (.*)\?' page

      And("I enter additional information 12345 on documents Enter the additional information for item 2 in house consignment 1 page")
        // Possible match (best=0.93)
        andIenterAdditionalInformationOnDocumentsEnterTheAdditionalInformationForItemXInHouseConsignment1Page("", "")
        // --- Other possible matches ---
        // andIenterAdditionalInformationOnDocumentsEnterTheAdditionalInformationPage() [0.79] (UnloadingStepDefSteps.scala) pattern: (?:I )?enter additional information (.+) on documents 'Enter the additional information\?' page
        // andIenterOnTheDocumentsEnterTheAdditionalInformationPage() [0.79] (PreviousStepDefSteps.scala) pattern: (?:I )?enter (.+) on the Documents 'Enter the additional information' page
        // andIenterXOnTheEnterTheAdditionalInformationPage() [0.78] (ItemDetailsStepDefSteps.scala) pattern: (?:I )?enter (.*) on the 'Enter the additional information' page

      And("I click Remove on You have added 2 documents to item 2 in house consignment 1 page")
        // ⚠️ No step-def match found for: I click Remove on You have added 2 documents to item 2 in house consignment 1 page

      And("I click radio option Yes on the Are you sure you want to remove this document from item 2 in house consignment 1? page")
        // Possible match (best=0.84)
        andIclickRadioOptionXOnTheAreYouSureYouWantToRemoveThisDocumentFromItemInHouseConsignment1Page("", "")
        // --- Other possible matches ---
        // andIclickRadioOptionXOnTheAreYouSureYouWantToRemoveHouseConsignmentPage() [0.82] (UnloadingStepDefSteps.scala) pattern: (?:I )?click radio option (.*) on the 'Are you sure you want to remove house consignment (.+)\?' page
        // andIclickRadioOptionXOnTheAreYouSureYouWantToRemoveItemXPage() [0.82] (ItemDetailsStepDefSteps.scala) pattern: (?:I )?click radio option (.*) on the 'Are you sure you want to remove item (.*)\?' page
        // andIclickRadioOptionXOnTheAreYouSureYouWantToRemoveThisDocumentFromTheItemDocumentPage() [0.82] (ItemDetailsStepDefSteps.scala) pattern: (?:I )?click radio option (.*) on the 'Are you sure you want to remove this document from the item\?' document page
        // andIclickRadioOptionXOnTheAreYouSureYouWantToRemoveThisDocumentFromTheItemPage() [0.82] (ItemDetailsStepDefSteps.scala) pattern: (?:I )?click radio option (.*) on the 'Are you sure you want to remove this document from the item\?' page
        // andIclickRadioOptionXOnTheAreYouSureYouWantToRemoveThisDocumentPage() [0.81] (DocumentsStepDefSteps.scala) pattern: (?:I )?click radio option (.*) on the 'Are you sure you want to remove this document\?' page
        // andIclickRadioOptionXOnTheAreYouSureYouWantToRemoveThisPackageFromTheItemPage() [0.78] (ItemDetailsStepDefSteps.scala) pattern: (?:I )?click radio option (.*) on the 'Are you sure you want to remove this package from the item\?' page
        // andIclickRadioOptionXOnTheAreYouSureYouWantToRemoveThisSealpage() [0.77] (TransportEquipmentChargesStepDefSteps.scala) pattern: (?:I )?click radio option (.*) on the 'Are you sure you want to remove this seal\?' page
        // andIclickRadioOptionXOnTheAreYouSureYouWantToRemoveGoodsItemNumberXPage() [0.75] (TransportEquipmentChargesStepDefSteps.scala) pattern: (?:I )?click radio option (.*) on the 'Are you sure you want to remove goods item number (.*)\?' page

      And("I click No on house consignment document You have added 1 documents to item 2 in house consignment 1 page")
        // ⚠️ No step-def match found for: I click No on house consignment document You have added 1 documents to item 2 in house consignment 1 page

      And("I choose radio option Yes on the Do you want to add an additional reference for the item? page")
        // Possible match (best=0.81)
        andIchooseRadioOptionXOnTheDoYouWantToAddAnAdditionalReferenceForTheItemPage("")
        // --- Other possible matches ---
        // andIchooseRadioOptionXOnTheDoYouWantToAddAReferenceForTheGuaranteePage() [0.77] (Departure_GuaranteeDetailsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a reference for the guarantee\?' page
        // andIchooseRadioOptionXOnTheDoYouWantToAddADocumentForTheItemPage() [0.77] (UnloadingStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a document for the item\?' page
        // andIchooseRadioOptionXOnTheDoYouWantToAddAPackageForTheItemPage() [0.77] (UnloadingStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a package for the item\?' page
        // andIchooseRadioOptionXOnTheDoYouWantToAddAnAdditionalReferenceForHouseConsignmentXPage() [0.76] (UnloadingStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add an additional reference for house consignment (.*)\?' page
        // andIchooseRadioOptionXOnTheDoYouWantToAddAnAuthorisationPage() [0.76] (TransportAuthorisationsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add an authorisation' page
        // andIchooseRadioOptionXOnTheDoYouWantToAddASealPage() [0.76] (TransportEquipmentChargesStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a seal\?' page
        // andIChooseRadioOptionXOnTheDoYouWantToAddACarrierPage() [0.76] (CarrierDetailsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a carrier\?' page
        // andIchooseRadioOptionXOnTheDoYouWantToAddAnItemForHouseConsignmentXPage() [0.75] (UnloadingStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add an item for house consignment (.*)\?' page

      And("I select Y023 - Consignee (AEO certificate number) on the What type of additional reference do you want to add for item 2 in house consignment 1? page")
        // Possible match (best=0.84)
        andIselectOnTheWhatTypeOfAdditionalReferenceDoYouWantToAddForItemXInHouseConsignment1Page("", "")
        // --- Other possible matches ---
        // andIselectOnTheWhatTypeOfAdditionalReferenceDoYouWantToAddPage() [0.81] (ItemDetailsStepDefSteps.scala) pattern: (?:I )?select (.+) on the 'What type of additional reference do you want to add\?' page
        // andIselectOnTheWhatTypeOfDocumentDoYouWantToAddForHouseConsignmentXPage() [0.79] (UnloadingStepDefSteps.scala) pattern: (?:I )?select (.+) on the 'What type of document do you want to add for house consignment (.*)\?' page
        // andIselectOnTheWhatTypeOfAdditionalInformationDoYouWantToAddPage() [0.76] (ItemDetailsStepDefSteps.scala) pattern: (?:I )?select (.+) on the 'What type of additional information do you want to add\?' page
        // andIselectOnTheWhatTypeOfDocumentDoYouWantToAddPage() [0.76] (DocumentsStepDefSteps.scala) pattern: (?:I )?select (.+) on the 'What type of document do you want to add\?' page

      And("I click radio option Yes on the Do you want to add an additional reference number? page")
        // Possible match (best=0.81)
        andIclickRadioOptionXOnTheDoYouWantToAddAnAdditionalReferenceNumberPage("")

      And("I enter additional reference newRef999 on the What is the additional reference number for item 2 in house consignment 1? page")
        // Possible match (best=0.83)
        andIenterAdditionalReferenceXOnTheWhatIsTheAdditionalReferenceNumberForItemXInHouseConsignment1Page("", "")
        // --- Other possible matches ---
        // andIenterAdditionalReferenceOnTheWhatIsTheNewAdditionalReferenceNumberForItem1InHouseConsignment1Page() [0.82] (UnloadingStepDefSteps.scala) pattern: (?:I )?enter additional reference (.+) on the 'What is the new additional reference number for item 1 in house consignment 1\?' page
        // andenterAdditionalReferenceOnTheWhatIsTheNewAdditionalReferenceNumberPage() [0.80] (UnloadingStepDefSteps.scala) pattern: (?:I )?enter additional reference (.+) on the 'What is the new additional reference number\?' page
        // andIenterAdditionalReferenceXOnTheWhatIsTheAdditionalReferenceNumberPage() [0.80] (ItemDetailsStepDefSteps.scala) pattern: (?:I )?enter additional reference (.*) on the 'What is the additional reference number\?' page
        // andIenterXOnTheEnterTheAdditionalReferenceNumberPage() [0.79] (ItemDetailsStepDefSteps.scala) pattern: (?:I )?enter (.*) on the 'Enter the additional reference number' page
        // andIenterOnTheWhatIsTheReferencePage() [0.78] (Departure_GuaranteeDetailsStepDefSteps.scala) pattern: (?:I )?enter (.+) on the 'What is the reference\?' page
        // andIenterOnTheWhatIsTheUniqueConsignmentReferenceForHouseConsignmentPage() [0.77] (UnloadingStepDefSteps.scala) pattern: (?:I )?enter (.+) on the 'What is the Unique Consignment Reference for house consignment (.+)\?' page

      And("I click Yes on additional reference You have added 1 additional reference for item 2 in house consignment 1 page")
        // ⚠️ No step-def match found for: I click Yes on additional reference You have added 1 additional reference for item 2 in house consignment 1 page

      And("I select Y023 - Consignee (AEO certificate number) on the What type of additional reference do you want to add for item 2 in house consignment 1? page")
        // Possible match (best=0.84)
        andIselectOnTheWhatTypeOfAdditionalReferenceDoYouWantToAddForItemXInHouseConsignment1Page("", "")
        // --- Other possible matches ---
        // andIselectOnTheWhatTypeOfAdditionalReferenceDoYouWantToAddPage() [0.81] (ItemDetailsStepDefSteps.scala) pattern: (?:I )?select (.+) on the 'What type of additional reference do you want to add\?' page
        // andIselectOnTheWhatTypeOfDocumentDoYouWantToAddForHouseConsignmentXPage() [0.79] (UnloadingStepDefSteps.scala) pattern: (?:I )?select (.+) on the 'What type of document do you want to add for house consignment (.*)\?' page
        // andIselectOnTheWhatTypeOfAdditionalInformationDoYouWantToAddPage() [0.76] (ItemDetailsStepDefSteps.scala) pattern: (?:I )?select (.+) on the 'What type of additional information do you want to add\?' page
        // andIselectOnTheWhatTypeOfDocumentDoYouWantToAddPage() [0.76] (DocumentsStepDefSteps.scala) pattern: (?:I )?select (.+) on the 'What type of document do you want to add\?' page

      And("I click radio option Yes on the Do you want to add an additional reference number? page")
        // Possible match (best=0.81)
        andIclickRadioOptionXOnTheDoYouWantToAddAnAdditionalReferenceNumberPage("")

      And("I enter additional reference newRef999 on the What is the additional reference number for item 2 in house consignment 1? page")
        // Possible match (best=0.83)
        andIenterAdditionalReferenceXOnTheWhatIsTheAdditionalReferenceNumberForItemXInHouseConsignment1Page("", "")
        // --- Other possible matches ---
        // andIenterAdditionalReferenceOnTheWhatIsTheNewAdditionalReferenceNumberForItem1InHouseConsignment1Page() [0.82] (UnloadingStepDefSteps.scala) pattern: (?:I )?enter additional reference (.+) on the 'What is the new additional reference number for item 1 in house consignment 1\?' page
        // andenterAdditionalReferenceOnTheWhatIsTheNewAdditionalReferenceNumberPage() [0.80] (UnloadingStepDefSteps.scala) pattern: (?:I )?enter additional reference (.+) on the 'What is the new additional reference number\?' page
        // andIenterAdditionalReferenceXOnTheWhatIsTheAdditionalReferenceNumberPage() [0.80] (ItemDetailsStepDefSteps.scala) pattern: (?:I )?enter additional reference (.*) on the 'What is the additional reference number\?' page
        // andIenterXOnTheEnterTheAdditionalReferenceNumberPage() [0.79] (ItemDetailsStepDefSteps.scala) pattern: (?:I )?enter (.*) on the 'Enter the additional reference number' page
        // andIenterOnTheWhatIsTheReferencePage() [0.78] (Departure_GuaranteeDetailsStepDefSteps.scala) pattern: (?:I )?enter (.+) on the 'What is the reference\?' page
        // andIenterOnTheWhatIsTheUniqueConsignmentReferenceForHouseConsignmentPage() [0.77] (UnloadingStepDefSteps.scala) pattern: (?:I )?enter (.+) on the 'What is the Unique Consignment Reference for house consignment (.+)\?' page

      And("I click Remove on the You have added 2 additional references for item 2 in house consignment 1 page")
        // ⚠️ No step-def match found for: I click Remove on the You have added 2 additional references for item 2 in house consignment 1 page

      And("I click radio option Yes on the Are you sure you want to remove this additional reference? page")
        // Possible match (best=0.81)
        andIclickRadioOptionXOnTheAreYouSureYouWantToRemoveThisAdditionalReferencePage("")
        // --- Other possible matches ---
        // andIclickRadioOptionXOnTheAreYouSureYouWantToRemoveItemXPage() [0.78] (ItemDetailsStepDefSteps.scala) pattern: (?:I )?click radio option (.*) on the 'Are you sure you want to remove item (.*)\?' page
        // andIclickRadioOptionXOnTheAreYouSureYouWantToRemoveThisAdditionalInformationPage() [0.77] (ItemDetailsStepDefSteps.scala) pattern: (?:I )?click radio option (.*) on the 'Are you sure you want to remove this additional information\?' page
        // andIclickRadioOptionXOnTheAreYouSureYouWantToRemoveThisDocumentPage() [0.77] (DocumentsStepDefSteps.scala) pattern: (?:I )?click radio option (.*) on the 'Are you sure you want to remove this document\?' page
        // andIclickRadioOptionXOnTheAreYouSureYouWantToRemoveThisSealpage() [0.77] (TransportEquipmentChargesStepDefSteps.scala) pattern: (?:I )?click radio option (.*) on the 'Are you sure you want to remove this seal\?' page

      And("I click No on additional reference You have added 1 additional reference for item 2 in house consignment 1 page")
        // ⚠️ No step-def match found for: I click No on additional reference You have added 1 additional reference for item 2 in house consignment 1 page

      And("I choose radio option Yes on the Do you want to add a package for the item? page")
        // Possible match (best=0.81)
        andIchooseRadioOptionXOnTheDoYouWantToAddAPackageForTheItemPage("")
        // --- Other possible matches ---
        // andIchooseRadioOptionXOnTheDoYouWantToAddADocumentForTheItemPage() [0.77] (UnloadingStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a document for the item\?' page
        // andIchooseRadioOptionXOnTheDoYouWantToAddAnAuthorisationPage() [0.76] (TransportAuthorisationsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add an authorisation' page
        // andIchooseRadioOptionXOnTheDoYouWantToAddASealPage() [0.76] (TransportEquipmentChargesStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a seal\?' page
        // andIChooseRadioOptionXOnTheDoYouWantToAddACarrierPage() [0.76] (CarrierDetailsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a carrier\?' page
        // andIchooseRadioOptionXOnTheDoYouWantToAddAnItemForHouseConsignmentXPage() [0.75] (UnloadingStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add an item for house consignment (.*)\?' page

      And("I select (AE) Aerosol on the What type of package are you using for item 2 in house consignment 1? page")
        // Possible match (best=0.83)
        andIselectOnTheWhatTypeOfPackageAreYouUsingForItemXInHouseConsignment1Page("", "")
        // --- Other possible matches ---
        // andIselectOnTheWhatTypeOfPackageAreYouUsingForTheItemPage() [0.81] (ItemDetailsStepDefSteps.scala) pattern: (?:I )?select (.+) on the 'What type of package are you using for the item\?' page

      And("I choose radio option Yes on the Do you want to add the quantity of this package? page")
        // Possible match (best=0.81)
        andIchooseRadioOptionXOnTheDoYouWantToAddTheQuantityOfThisPackagePage("")
        // --- Other possible matches ---
        // andIchooseRadioOptionXOnTheDoYouWantToAddAnAuthorisationPage() [0.76] (TransportAuthorisationsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add an authorisation' page
        // andIchooseRadioOptionXOnTheDoYouWantToAddASealPage() [0.76] (TransportEquipmentChargesStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a seal\?' page
        // andIChooseRadioOptionXOnTheDoYouWantToAddACarrierPage() [0.76] (CarrierDetailsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a carrier\?' page

      And("I enter 2 on the How many of this package are you using for item 2 in house consignment 1? page")
        // Possible match (best=0.83)
        andIenterXOnTheHowManyOfThisPackageAreYouUsingForItemXInHouseConsignment1Page("", "")
        // --- Other possible matches ---
        // andIenterXOnTheHowManyOfThisPackageAreYouUsingPage() [0.80] (UnloadingStepDefSteps.scala) pattern: (?:I )?enter (.*) on the 'How many of this package are you using\?' page

      And("I click radio option Yes on the Do you want to add a shipping mark? page")
        // Possible match (best=0.81)
        andIclickRadioOptionXOnTheDoYouWantToAddAShippingMarkPage("")

      And("I enter This is a description of the cargo 1 on the What is the shipping mark for item 2 in house consignment 1? page")
        // Possible match (best=0.82)
        andIenterXOnTheWhatIsTheShippingMarkForItemXInHouseConsignment1Page("", "")
        // --- Other possible matches ---
        // andIenterXOnTheWhatIsTheShippingMarkPage() [0.79] (ItemDetailsStepDefSteps.scala) pattern: (?:I )?enter (.*) on the 'What is the shipping mark\?' page
        // andIenterXOnTheEnterADescriptionOfItemXPage() [0.78] (ItemDetailsStepDefSteps.scala) pattern: (?:I )?enter (.*) on the 'Enter a description of item (.*)' page

      And("I click Yes on house consignment package You have added 1 type of package for item 2 in house consignment 1 page")
        // ⚠️ No step-def match found for: I click Yes on house consignment package You have added 1 type of package for item 2 in house consignment 1 page

      And("I select (43) Bag, super bulk on the What type of package are you using for item 2 in house consignment 1? page")
        // Possible match (best=0.83)
        andIselectOnTheWhatTypeOfPackageAreYouUsingForItemXInHouseConsignment1Page("", "")
        // --- Other possible matches ---
        // andIselectOnTheWhatTypeOfPackageAreYouUsingForTheItemPage() [0.81] (ItemDetailsStepDefSteps.scala) pattern: (?:I )?select (.+) on the 'What type of package are you using for the item\?' page

      And("I choose radio option No on the Do you want to add the quantity of this package? page")
        // Possible match (best=0.81)
        andIchooseRadioOptionXOnTheDoYouWantToAddTheQuantityOfThisPackagePage("")
        // --- Other possible matches ---
        // andIchooseRadioOptionXOnTheDoYouWantToAddAnAuthorisationPage() [0.76] (TransportAuthorisationsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add an authorisation' page
        // andIchooseRadioOptionXOnTheDoYouWantToAddASealPage() [0.76] (TransportEquipmentChargesStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a seal\?' page
        // andIChooseRadioOptionXOnTheDoYouWantToAddACarrierPage() [0.76] (CarrierDetailsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a carrier\?' page

      And("I click radio option No on the Do you want to add a shipping mark? page")
        // Possible match (best=0.81)
        andIclickRadioOptionXOnTheDoYouWantToAddAShippingMarkPage("")

      And("I click Remove on the house consignment package You have added 2 types of packages for item 2 in house consignment 1 page")
        // ⚠️ No step-def match found for: I click Remove on the house consignment package You have added 2 types of packages for item 2 in house consignment 1 page

      And("I click radio option Yes on the Are you sure you want to remove this package from item 2 in house consignment 1? page")
        // Possible match (best=0.84)
        andIclickRadioOptionXOnTheAreYouSureYouWantToRemoveThisPackageFromItemInHouseConsignment1Page("", "")
        // --- Other possible matches ---
        // andIclickRadioOptionXOnTheAreYouSureYouWantToRemoveHouseConsignmentPage() [0.82] (UnloadingStepDefSteps.scala) pattern: (?:I )?click radio option (.*) on the 'Are you sure you want to remove house consignment (.+)\?' page
        // andIclickRadioOptionXOnTheAreYouSureYouWantToRemoveItemXPage() [0.82] (ItemDetailsStepDefSteps.scala) pattern: (?:I )?click radio option (.*) on the 'Are you sure you want to remove item (.*)\?' page
        // andIclickRadioOptionXOnTheAreYouSureYouWantToRemoveThisPackageFromTheItemPage() [0.82] (ItemDetailsStepDefSteps.scala) pattern: (?:I )?click radio option (.*) on the 'Are you sure you want to remove this package from the item\?' page
        // andIclickRadioOptionXOnTheAreYouSureYouWantToRemoveThisDocumentFromTheItemPage() [0.78] (ItemDetailsStepDefSteps.scala) pattern: (?:I )?click radio option (.*) on the 'Are you sure you want to remove this document from the item\?' page
        // andIclickRadioOptionXOnTheAreYouSureYouWantToRemoveThisDocumentPage() [0.77] (DocumentsStepDefSteps.scala) pattern: (?:I )?click radio option (.*) on the 'Are you sure you want to remove this document\?' page
        // andIclickRadioOptionXOnTheAreYouSureYouWantToRemoveThisSealpage() [0.77] (TransportEquipmentChargesStepDefSteps.scala) pattern: (?:I )?click radio option (.*) on the 'Are you sure you want to remove this seal\?' page
        // andIclickRadioOptionXOnTheAreYouSureYouWantToRemoveGoodsItemNumberXPage() [0.75] (TransportEquipmentChargesStepDefSteps.scala) pattern: (?:I )?click radio option (.*) on the 'Are you sure you want to remove goods item number (.*)\?' page
        // andIclickRadioOptionXOnTheAreYouSureYouWantToRemoveThisDocumentFromTheItemDocumentPage() [0.75] (ItemDetailsStepDefSteps.scala) pattern: (?:I )?click radio option (.*) on the 'Are you sure you want to remove this document from the item\?' document page

      And("I click No on house consignment package You have added 1 type of package for item 2 in house consignment 1 page")
        // ⚠️ No step-def match found for: I click No on house consignment package You have added 1 type of package for item 2 in house consignment 1 page

      And("I click option Remove on the You have added 2 items for house consignment 1 page")
        // ⚠️ No step-def match found for: I click option Remove on the You have added 2 items for house consignment 1 page

      And("I click radio option Yes on item Are you sure you want to remove item 1 from house consignment 1? page")
        // Possible match (best=0.83)
        andIclickRadioOptionXOnItemAreYouSureYouWantToRemoveItemFromHouseConsignment1Page("", "")
        // --- Other possible matches ---
        // andIclickRadioOptionXOnTheAreYouSureYouWantToRemoveHouseConsignmentPage() [0.78] (UnloadingStepDefSteps.scala) pattern: (?:I )?click radio option (.*) on the 'Are you sure you want to remove house consignment (.+)\?' page
        // andIclickRadioOptionXOnTheAreYouSureYouWantToRemoveItemXPage() [0.78] (ItemDetailsStepDefSteps.scala) pattern: (?:I )?click radio option (.*) on the 'Are you sure you want to remove item (.*)\?' page

      And("I click radio option No on the You have added 1 item for house consignment 1 page")
        // Possible match (best=0.80)
        andIclickRadioOptionXOnTheYouHaveAddedXHouseConsignmentPage("", "")
        // --- Other possible matches ---
        // andIclickRadioOptionXOnTheYouHaveAddedXItemPage() [0.79] (ItemDetailsStepDefSteps.scala) pattern: (?:I )?click radio option (.*) on the 'You have added (.*) item' page

    }

    Scenario("03 - Unloading remarks - Cross-check page add and remove House Consignment") {
      And("I click the add or remove house consignment link")
        // Possible match (best=1.00)
        andIclickTheAddOrRemoveHouseConsignmentLink()

      And("I click radio option Yes on the You have added 1 house consignment page")
        // Possible match (best=0.90)
        andIclickRadioOptionXOnTheYouHaveAddedXHouseConsignmentPage("", "")

      And("I enter number 100 on What is the gross weight of House Consignment 2? page")
        // Possible match (best=0.91)
        andIenterNumberOnWhatIsTheGrossWeightOfHouseConsignmentPage("", "")

      And("I choose radio option Yes on the Do you want to add a Unique Consignment Reference for this house consignment? page")
        // Possible match (best=0.82)
        andIchooseRadioOptionXOnTheDoYouWantToAddAUniqueConsignmentReferenceForThisHouseConsignmentPage("")
        // --- Other possible matches ---
        // andIChooseRadioOptionXOnTheDoYouWantToAddAUniqueConsignmentReferencePage() [0.81] (ItemDetailsStepDefSteps.scala) pattern: (?:I )? choose radio option (.*) on the 'Do you want to add a Unique Consignment Reference\?' page
        // andIchooseRadioOptionXOnTheDoYouWantToAddAnAdditionalReferenceForHouseConsignmentXPage() [0.79] (UnloadingStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add an additional reference for house consignment (.*)\?' page
        // andIchooseRadioOptionXOnTheDoYouWantToAddAnItemForHouseConsignmentXPage() [0.79] (UnloadingStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add an item for house consignment (.*)\?' page
        // andIchooseRadioOptionXOnTheDoYouWantToAddAUniqueConsignmentReferenceForThisItemPage() [0.78] (UnloadingStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a Unique Consignment Reference for this item\?' page
        // andIchooseRadioOptionXOnTheDoYouWantToAddAReferenceForTheGuaranteePage() [0.77] (Departure_GuaranteeDetailsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a reference for the guarantee\?' page
        // andIchooseRadioOptionXOnTheDoYouWantToAddAnAuthorisationPage() [0.76] (TransportAuthorisationsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add an authorisation' page
        // andIchooseRadioOptionXOnTheDoYouWantToAddASealPage() [0.76] (TransportEquipmentChargesStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a seal\?' page
        // andIChooseRadioOptionXOnTheDoYouWantToAddACarrierPage() [0.76] (CarrierDetailsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a carrier\?' page
        // andIchooseRadioOptionXOnTheDoYouWantToAddAnyDocumentsForHouseConsignmentXPage() [0.75] (UnloadingStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add any documents for house consignment (.*)\?' page

      And("I enter UCRHC12312 on the What is the Unique Consignment Reference for house consignment 2? page")
        // Possible match (best=0.91)
        andIenterOnTheWhatIsTheUniqueConsignmentReferenceForHouseConsignmentPage("", "")
        // --- Other possible matches ---
        // andIenterXOnTheWhatIsTheUniqueConsignmentReferencePage() [0.79] (ItemDetailsStepDefSteps.scala) pattern: (?:I )?enter (.*) on the 'What is the Unique Consignment Reference\?' page
        // andIenterOnTheWhatIsTheUCRPage() [0.78] (TransportDetailsStepDefSteps.scala) pattern: (?:I )?enter (.+) on the 'What is the UCR\?' page
        // andIenterOnTheWhatIsTheReferencePage() [0.78] (Departure_GuaranteeDetailsStepDefSteps.scala) pattern: (?:I )?enter (.+) on the 'What is the reference\?' page

      And("I choose radio option Yes on the Do you want to add a departure means of transport for house consignment 2? page")
        // Possible match (best=0.94)
        andIchooseRadioOptionXOnTheDoYouWantToAddADepartureMeansOfTransportForHouseConsignmentXPage("", "")
        // --- Other possible matches ---
        // andIchooseRadioOptionXOnTheDoYouWantToAddAnItemForHouseConsignmentXPage() [0.79] (UnloadingStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add an item for house consignment (.*)\?' page
        // andIchooseRadioOptionXOnTheDepartureMeansXPage() [0.77] (InlandModeOfTransportStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the departure means '(.*)' page
        // andIchooseRadioOptionXOnTheWhichIdentificationDoYouWantToUseForTheDepartureMeansOfTransportInHouseConsignmentXPage() [0.76] (UnloadingStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Which identification do you want to use for the departure means of transport in house consignment (.*)\?' page
        // andIchooseRadioOptionXOnTheDoYouWantToAddAnAdditionalReferenceForHouseConsignmentXPage() [0.76] (UnloadingStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add an additional reference for house consignment (.*)\?' page
        // andIchooseRadioOptionXOnTheDoYouWantToAddAnAuthorisationPage() [0.76] (TransportAuthorisationsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add an authorisation' page
        // andIchooseRadioOptionXOnTheDoYouWantToAddASealPage() [0.76] (TransportEquipmentChargesStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a seal\?' page
        // andIChooseRadioOptionXOnTheDoYouWantToAddACarrierPage() [0.76] (CarrierDetailsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a carrier\?' page
        // andIchooseRadioOptionXOnTheDoYouWantToAddAnyDocumentsForHouseConsignmentXPage() [0.75] (UnloadingStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add any documents for house consignment (.*)\?' page
        // andIchooseRadioOptionXOnTheWhichIdentificationDoYouWantToUseForTheDepartureMeansOfTransportPage() [0.75] (UnloadingStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Which identification do you want to use for the departure means of transport\?' page

      And("I choose radio option IMO Ship Identification Number on the Which identification do you want to use for the departure means of transport in house consignment 2? page")
        // Possible match (best=0.94)
        andIchooseRadioOptionXOnTheWhichIdentificationDoYouWantToUseForTheDepartureMeansOfTransportInHouseConsignmentXPage("", "")
        // --- Other possible matches ---
        // andIchooseRadioOptionXOnTheWhichIdentificationDoYouWantToUseForTheDepartureMeansOfTransportPage() [0.82] (UnloadingStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Which identification do you want to use for the departure means of transport\?' page
        // andIchooseRadioOptionXOnTheDoYouWantToAddADepartureMeansOfTransportForHouseConsignmentXPage() [0.80] (UnloadingStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a departure means of transport for house consignment (.*)\?' page
        // andIchooseRadioOptionXOnThePresentationDepartureMeansOfTransportWhichIdentificationDoYouWantToUseForTheDepartureMeansOfTransportPage() [0.80] (PresentationNotificationStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the presentation departure means of transport 'Which identification do you want to use for the departure means of transport\?' page
        // andIchooseRadioOptionXOnTheWhichIdentificationDoYouWantToUseForTheNewDepartureMeansOfTransportPage() [0.79] (UnloadingStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Which identification do you want to use for the new departure means of transport\?' page
        // andIchooseRadioOptionXOnTheDepartureMeansXPage() [0.77] (InlandModeOfTransportStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the departure means '(.*)' page
        // andIchooseRadioOptionXOnTheDoYouWantToAddAnItemForHouseConsignmentXPage() [0.75] (UnloadingStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add an item for house consignment (.*)\?' page

      And("I enter identification number Identify1234 on What is the identification number for this vehicle? page")
        // Possible match (best=0.80)
        andIenterIdentificationNumberOnWhatIsTheIdentificationNumberForThisVehiclePage("")
        // --- Other possible matches ---
        // andIenterIdentificationOnTheWhatIsTheIdentificationNumberForThisPage() [0.80] (BorderMeansOfTransportStepDefSteps.scala) pattern: (?:I )?enter identification (.+) on the 'What is the identification number for this\?' page
        // andIenterIdentificationNumberOnWhatIsTheIdentificationNumberForThisPage() [0.80] (PresentationNotificationStepDefSteps.scala) pattern: (?:I )?enter identification number (.+) on 'What is the identification number for this\?' page

      And("I select Germany - DE on the What country is this vehicle registered to? page")
        // Possible match (best=0.80)
        andIselectOnTheWhatCountryIsThisVehicleRegisteredToPage("")

      And("I choose radio option No on the You have added 1 departure means of transport for house consignment 2 page")
        // Possible match (best=0.93)
        andIchooseRadioOptionXOnTheYouHaveAddedXDepartureMeansOfTransportForHouseConsignment2Page("", "")
        // --- Other possible matches ---
        // andIchooseRadioOptionXOnTheYouHaveAddedXDepartureMeansOfTransportPage() [0.81] (UnloadingStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'You have added (.*) departure means of transport' page
        // andIchooseRadioOptionXOnTheDepartureMeansXPage() [0.77] (InlandModeOfTransportStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the departure means '(.*)' page
        // whenIchooseRadioOptionXOnTheYouHaveAddedXBorderMeansOfTransportPage() [0.77] (BorderMeansOfTransportStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'You have added (.*) border means of transport' page

      And("I choose radio option Yes on the Do you want to add any documents for house consignment 2? page")
        // Possible match (best=0.93)
        andIchooseRadioOptionXOnTheDoYouWantToAddAnyDocumentsForHouseConsignmentXPage("", "")
        // --- Other possible matches ---
        // andIchooseRadioOptionXOnTheDoYouWantToAddAnItemForHouseConsignmentXPage() [0.79] (UnloadingStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add an item for house consignment (.*)\?' page
        // andIchooseRadioOptionXOnTheDoYouWantToAddADocumentForTheItemPage() [0.77] (UnloadingStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a document for the item\?' page
        // andIchooseRadioOptionXOnTheDoYouWantToAddAnAdditionalReferenceForHouseConsignmentXPage() [0.76] (UnloadingStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add an additional reference for house consignment (.*)\?' page
        // andIchooseRadioOptionXOnTheDoYouWantToAddAnAuthorisationPage() [0.76] (TransportAuthorisationsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add an authorisation' page
        // andIchooseRadioOptionXOnTheDoYouWantToAddASealPage() [0.76] (TransportEquipmentChargesStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a seal\?' page
        // andIChooseRadioOptionXOnTheDoYouWantToAddACarrierPage() [0.76] (CarrierDetailsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a carrier\?' page

      And("I select Supporting - (C651) on the What type of document do you want to add for house consignment 2? page")
        // Possible match (best=0.93)
        andIselectOnTheWhatTypeOfDocumentDoYouWantToAddForHouseConsignmentXPage("", "")
        // --- Other possible matches ---
        // andIselectOnTheWhatTypeOfDocumentDoYouWantToAddPage() [0.80] (DocumentsStepDefSteps.scala) pattern: (?:I )?select (.+) on the 'What type of document do you want to add\?' page
        // andIselectOnTheWhatPreviousDocumentDoYouWantToAddPage() [0.75] (DocumentsStepDefSteps.scala) pattern: (?:I )?select (.+) on the 'What previous document do you want to add\?' page

      And("I enter reference number ref1234 on What is the document’s reference number? page")
        // Possible match (best=0.80)
        andIenterReferenceNumberOnWhatIsTheDocumentsReferenceNumberPage("")
        // --- Other possible matches ---
        // andIenterOnTheWhatIsTheDocumentsReferenceNumberPage() [0.80] (DocumentsStepDefSteps.scala) pattern: (?:I )?enter (.+) on the 'What is the document’s reference number\?' page
        // andIenterOnTheWhatIsTheReferencePage() [0.78] (Departure_GuaranteeDetailsStepDefSteps.scala) pattern: (?:I )?enter (.+) on the 'What is the reference\?' page
        // andIenterReferenceNumberOnTheWhatIsTheDocumentsNewReferenceNumberPage() [0.76] (UnloadingStepDefSteps.scala) pattern: (?:I )?enter reference number (.+) on the 'What is the document’s new reference number\?' page

      And("I choose radio option Yes on the documents Do you want to add any additional information for this document? page")
        // Possible match (best=0.82)
        andIchooseRadioOptionXOnTheDocumentsDoYouWantToAddAnyAdditionalInformationForThisDocumentPage("")
        // --- Other possible matches ---
        // andIchooseRadioOptionXOnTheDoYouWantToAddADocumentForTheItemPage() [0.77] (UnloadingStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a document for the item\?' page
        // andIchooseRadioOptionXOnTheDoYouWantToAddAnAuthorisationPage() [0.76] (TransportAuthorisationsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add an authorisation' page
        // andIchooseRadioOptionXOnTheDoYouWantToAddASealPage() [0.76] (TransportEquipmentChargesStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a seal\?' page
        // andIChooseRadioOptionXOnTheDoYouWantToAddACarrierPage() [0.76] (CarrierDetailsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a carrier\?' page
        // andIchooseRadioOptionXOnTheDoYouWantToAddAnyDocumentsForHouseConsignmentXPage() [0.75] (UnloadingStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add any documents for house consignment (.*)\?' page

      And("I add additional information 12345 on documents Enter the additional information in house consignment 2 page")
        // Possible match (best=0.91)
        andIaddAdditionalInformationOnDocumentsEnterTheAdditionalInformationInHouseConsignmentXPage("", "")

      And("I choose radio option No on the You have added 1 document to all items in house consignment 2 page")
        // Possible match (best=0.80)
        andIchooseRadioOptionXOnTheYouHaveAddedXDocumentstoAllItemsInHouseConsignment2Page("", "")
        // --- Other possible matches ---
        // andIchooseRadioOptionXOnTheYouHaveAddedXDocumentstoAllItemsPage() [0.78] (UnloadingStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'You have added (.*) documen(?:t |ts )to all items' page

      And("I choose radio option Yes on the Do you want to add an additional reference for house consignment 2? page")
        // Possible match (best=0.93)
        andIchooseRadioOptionXOnTheDoYouWantToAddAnAdditionalReferenceForHouseConsignmentXPage("", "")
        // --- Other possible matches ---
        // andIchooseRadioOptionXOnTheDoYouWantToAddAnItemForHouseConsignmentXPage() [0.79] (UnloadingStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add an item for house consignment (.*)\?' page
        // andIchooseRadioOptionXOnTheDoYouWantToAddAnAdditionalReferenceForTheItemPage() [0.78] (UnloadingStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add an additional reference for the item\?' page
        // andIchooseRadioOptionXOnTheDoYouWantToAddAReferenceForTheGuaranteePage() [0.77] (Departure_GuaranteeDetailsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a reference for the guarantee\?' page
        // andIChooseRadioOptionXOnTheDoYouWantToAddAUniqueConsignmentReferencePage() [0.77] (ItemDetailsStepDefSteps.scala) pattern: (?:I )? choose radio option (.*) on the 'Do you want to add a Unique Consignment Reference\?' page
        // andIchooseRadioOptionXOnTheDoYouWantToAddAnAuthorisationPage() [0.76] (TransportAuthorisationsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add an authorisation' page
        // andIchooseRadioOptionXOnTheDoYouWantToAddASealPage() [0.76] (TransportEquipmentChargesStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a seal\?' page
        // andIChooseRadioOptionXOnTheDoYouWantToAddACarrierPage() [0.76] (CarrierDetailsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a carrier\?' page
        // andIchooseRadioOptionXOnTheDoYouWantToAddAnyDocumentsForHouseConsignmentXPage() [0.75] (UnloadingStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add any documents for house consignment (.*)\?' page
        // andIchooseRadioOptionXOnTheDoYouWantToAddAUniqueConsignmentReferenceForThisHouseConsignmentPage() [0.75] (UnloadingStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a Unique Consignment Reference for this house consignment\?' page

      And("I choose Y023 - Consignee (AEO certificate number) on the What type of additional reference do you want to add for house consignment 2? page")
        // Possible match (best=0.93)
        andIchooseOnTheWhatTypeOfAdditionalReferenceDoYouWantToAddForHouseConsignmentXPage("", "")

      And("I click radio option Yes on the Do you want to add an additional reference number? page")
        // Possible match (best=0.81)
        andIclickRadioOptionXOnTheDoYouWantToAddAnAdditionalReferenceNumberPage("")

      And("I enter additional reference newRef999 on the What is the additional reference number? page")
        // Possible match (best=0.80)
        andenterAdditionalReferenceOnTheWhatIsTheNewAdditionalReferenceNumberPage("")
        // --- Other possible matches ---
        // andIenterAdditionalReferenceXOnTheWhatIsTheAdditionalReferenceNumberPage() [0.80] (ItemDetailsStepDefSteps.scala) pattern: (?:I )?enter additional reference (.*) on the 'What is the additional reference number\?' page
        // andIenterXOnTheEnterTheAdditionalReferenceNumberPage() [0.79] (ItemDetailsStepDefSteps.scala) pattern: (?:I )?enter (.*) on the 'Enter the additional reference number' page
        // andIenterOnTheWhatIsTheReferencePage() [0.78] (Departure_GuaranteeDetailsStepDefSteps.scala) pattern: (?:I )?enter (.+) on the 'What is the reference\?' page

      And("I click radio option No on the You have added 1 additional reference for house consignment 2 page")
        // Possible match (best=0.92)
        andIclickRadioOptionXOnTheYouHaveAddedXAdditionalReferenceForHouseConsignment2Page("", "")
        // --- Other possible matches ---
        // andIclickRadioOptionXOnTheYouHaveAddedXHouseConsignmentPage() [0.80] (UnloadingStepDefSteps.scala) pattern: (?:I )?click radio option (.*) on the 'You have added (.*) house consignment' page

      And("I choose radio option No on the Do you want to add an item for house consignment 2? page")
        // Possible match (best=0.93)
        andIchooseRadioOptionXOnTheDoYouWantToAddAnItemForHouseConsignmentXPage("", "")
        // --- Other possible matches ---
        // andIchooseRadioOptionXOnTheDoYouWantToAddADocumentForTheItemPage() [0.77] (UnloadingStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a document for the item\?' page
        // andIchooseRadioOptionXOnTheDoYouWantToAddAPackageForTheItemPage() [0.77] (UnloadingStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a package for the item\?' page
        // andIchooseRadioOptionXOnTheDoYouWantToAddAnAdditionalReferenceForHouseConsignmentXPage() [0.76] (UnloadingStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add an additional reference for house consignment (.*)\?' page
        // andIchooseRadioOptionXOnTheDoYouWantToAddAnAuthorisationPage() [0.76] (TransportAuthorisationsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add an authorisation' page
        // andIchooseRadioOptionXOnTheDoYouWantToAddASealPage() [0.76] (TransportEquipmentChargesStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a seal\?' page
        // andIChooseRadioOptionXOnTheDoYouWantToAddACarrierPage() [0.76] (CarrierDetailsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a carrier\?' page
        // andIchooseRadioOptionXOnTheDoYouWantToAddAnyDocumentsForHouseConsignmentXPage() [0.75] (UnloadingStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add any documents for house consignment (.*)\?' page

      And("I click the Remove link on the You have added 2 house consignments page")
        // Possible match (best=0.90)
        andIclickTheXLinkOnTheYouHaveAddedXHouseConsignmentsPage("", "")

      And("I click radio option Yes on the Are you sure you want to remove house consignment 1? page")
        // Possible match (best=0.92)
        andIclickRadioOptionXOnTheAreYouSureYouWantToRemoveHouseConsignmentPage("", "")
        // --- Other possible matches ---
        // andIclickRadioOptionXOnTheAreYouSureYouWantToRemoveItemXPage() [0.78] (ItemDetailsStepDefSteps.scala) pattern: (?:I )?click radio option (.*) on the 'Are you sure you want to remove item (.*)\?' page

      And("I click radio option No on the You have added 1 house consignment page")
        // Possible match (best=0.90)
        andIclickRadioOptionXOnTheYouHaveAddedXHouseConsignmentPage("", "")

    }
  }
}
