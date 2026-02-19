import org.scalatest.matchers.should.Matchers
import org.scalatest.GivenWhenThen
import org.scalatest.featurespec.AnyFeatureSpec


class PresentationNotificationE2EP6Spec extends AnyFeatureSpec with GivenWhenThen {

  Feature("Trader completes a departure declaration that was previously pre-lodged") {

    Scenario("01 Full Simplified e2e journey with security type 1 - answer 'YES' to all optional questions - Add and Remove") {
      When("I submit an IE015 Simplified Prelodged Departure Declaration")
        // Possible match (best=1.00)
        givenIsubmitAFile("IE015 Simplified Prelodged Departure Declaration")

      Then("I submit an IE928 Positive Acknowledgment")
        // Possible match (best=1.00)
        givenIsubmitAFile("IE928 Positive Acknowledgment")

      And("I refresh the page")
        // Possible match (best=1.00)
        andIrefreshThePage()

      And("I click on the View departure declarations link on the Manage your transit movements page")
        // Possible match (best=0.95)
        givenIclickOnTheLinkOnTheManageYourTransitMovementsPage("")
        // --- Other possible matches ---
        // givenIclickOnTheLinkOnTheDepartureDeclarationsPage() [0.79] (DepartureDeclarationsStepDefSteps.scala) pattern: (?:I )?click on the (.+) link on the 'Departure declarations' page

      And("I click on the Complete pre lodged declaration link for LRN 25GB000246TK0E6WJ1 on the Departure declarations page")
        // Possible match (best=0.90)
        andIclickOnTheXLinkForLRNXOnTheDepartureDeclarationsPage("", "")
        // --- Other possible matches ---
        // givenIclickOnTheLinkOnTheDepartureDeclarationsPage() [0.79] (DepartureDeclarationsStepDefSteps.scala) pattern: (?:I )?click on the (.+) link on the 'Departure declarations' page

      And("I click the Continue button on the presentation More information needed to complete pre-lodged declaration page")
        // ⚠️ No step-def match found for: I click the Continue button on the presentation More information needed to complete pre-lodged declaration page

      And("I enter GBDEPE201HZ on the presentation What is the authorisation number for the location of goods? page")
        // Possible match (best=0.81)
        andIenterOnThePresentationWhatIsTheAuthorisationNumberForTheLocationOfGoodsPage("")
        // --- Other possible matches ---
        // andIenterOnTheWhatIsTheAuthorisationNumberForTheLocationOfGoodsPage() [0.81] (RouteDetailsLocationOfGoodsStepDefSteps.scala) pattern: (?:I )?enter (.+) on the 'What is the authorisation number for the location of goods\?' page

      And("I choose radio option Yes on the presentation Do you want to add an additional identifier for the location of goods? page")
        // Possible match (best=0.82)
        andIchooseRadioOptionXOnThePresentationDoYouWantToAddAnAdditionalIdentifierForTheLocationOfGoodsPage("")
        // --- Other possible matches ---
        // andIchooseRadioOptionXOnTheDoYouWantToAddAnAdditionalIdentifierForTheLocationOfGoodsPage() [0.82] (RouteDetailsLocationOfGoodsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add an additional identifier for the location of goods\?' page
        // andIchooseRadioOptionXOnTheDoYouWantToAddALocationOfGoodsPage() [0.81] (RouteDetailsLocationOfGoodsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a location of goods\?' page
        // andIchooseRadioOptionXOnThePresentationDoYouWantToAddAContactForTheLocationOfGoodsPage() [0.78] (PresentationNotificationStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the presentation 'Do you want to add a contact for the location of goods\?' page
        // andIchooseRadioOptionXOnTheDoYouWantToAddAContactForTheLocationOfGoodsPage() [0.78] (RouteDetailsLocationOfGoodsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a contact for the location of goods\?' page
        // andIchooseRadioOptionXOnTheDoYouWantToAddAnAuthorisationPage() [0.76] (TransportAuthorisationsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add an authorisation' page
        // andIchooseRadioOptionXOnTheDoYouWantToAddASealPage() [0.76] (TransportEquipmentChargesStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a seal\?' page
        // andIChooseRadioOptionXOnTheDoYouWantToAddACarrierPage() [0.76] (CarrierDetailsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a carrier\?' page

      And("I enter x9x9 on the presentation What is the additional identifier for the location of goods? page")
        // Possible match (best=0.85)
        andIenterOnTheWhatIsTheAdditionalIdentifierForTheLocationOfGoodsPage("")
        // --- Other possible matches ---
        // andIenterOnThePresentationWhatIsTheAdditionalIdentifierForTheLocationOfGoodsPage() [0.85] (PresentationNotificationStepDefSteps.scala) pattern: (?:I )?enter (.+) on the presentation 'What is the additional identifier for the location of goods\?' page
        // andIenterXOnTheEnterADescriptionOfItemXPage() [0.78] (ItemDetailsStepDefSteps.scala) pattern: (?:I )?enter (.*) on the 'Enter a description of item (.*)' page
        // andIenterOnTheWhatIsTheUCRPage() [0.78] (TransportDetailsStepDefSteps.scala) pattern: (?:I )?enter (.+) on the 'What is the UCR\?' page
        // andIenterOnTheWhatIsTheReferencePage() [0.78] (Departure_GuaranteeDetailsStepDefSteps.scala) pattern: (?:I )?enter (.+) on the 'What is the reference\?' page
        // andIenterXOnTheEnterTheAdditionalInformationPage() [0.78] (ItemDetailsStepDefSteps.scala) pattern: (?:I )?enter (.*) on the 'Enter the additional information' page
        // andIenterOnThePresentationWhatIsTheAuthorisationNumberForTheLocationOfGoodsPage() [0.77] (PresentationNotificationStepDefSteps.scala) pattern: (?:I )?enter (.+) on the presentation 'What is the authorisation number for the location of goods\?' page
        // andIenterOnTheWhatIsTheAuthorisationNumberForTheLocationOfGoodsPage() [0.76] (RouteDetailsLocationOfGoodsStepDefSteps.scala) pattern: (?:I )?enter (.+) on the 'What is the authorisation number for the location of goods\?' page
        // andIenterOnThePresentationWhoIsTheContactForTheLocationOfGoodsPage() [0.76] (PresentationNotificationStepDefSteps.scala) pattern: (?:I )?enter (.+) on the presentation 'Who is the contact for the location of goods\?' page
        // andIenterOnTheWhoIsTheContactForTheLocationOfGoodsPage() [0.76] (RouteDetailsLocationOfGoodsStepDefSteps.scala) pattern: (?:I )?enter (.+) on the 'Who is the contact for the location of goods\?' page

      And("I choose radio option Yes on the presentation Do you want to add a contact for the location of goods? page")
        // Possible match (best=0.82)
        andIchooseRadioOptionXOnThePresentationDoYouWantToAddAContactForTheLocationOfGoodsPage("")
        // --- Other possible matches ---
        // andIchooseRadioOptionXOnTheDoYouWantToAddAContactForTheLocationOfGoodsPage() [0.82] (RouteDetailsLocationOfGoodsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a contact for the location of goods\?' page
        // andIchooseRadioOptionXOnTheDoYouWantToAddALocationOfGoodsPage() [0.81] (RouteDetailsLocationOfGoodsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a location of goods\?' page
        // andIchooseRadioOptionXOnTheDoYouWantToAddAContactForTheConsignorPage() [0.77] (TraderDetailsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a contact for the consignor\?' page
        // andIchooseRadioOptionXOnThEDoYouWantToAddAContactForTheCarrierPage() [0.77] (CarrierDetailsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a contact for the carrier\?' page
        // andIchooseRadioOptionXOnTheDoYouWantToAddAnAuthorisationPage() [0.76] (TransportAuthorisationsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add an authorisation' page
        // andIchooseRadioOptionXOnTheDoYouWantToAddASealPage() [0.76] (TransportEquipmentChargesStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a seal\?' page
        // andIChooseRadioOptionXOnTheDoYouWantToAddACarrierPage() [0.76] (CarrierDetailsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a carrier\?' page
        // andIchooseRadioOptionXOnThePresentationDoYouWantToAddAnAdditionalIdentifierForTheLocationOfGoodsPage() [0.75] (PresentationNotificationStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the presentation 'Do you want to add an additional identifier for the location of goods\?' page
        // andIchooseRadioOptionXOnTheDoYouWantToAddAnAdditionalIdentifierForTheLocationOfGoodsPage() [0.75] (RouteDetailsLocationOfGoodsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add an additional identifier for the location of goods\?' page
        // andIchooseRadioOptionXOnTheArrivalLocationOfGoodsAddContactPage() [0.75] (LocationOfGoodsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the arrival location of goods add contact page

      And("I enter Locator Joe on the presentation Who is the contact for the location of goods? page")
        // Possible match (best=0.81)
        andIenterOnThePresentationWhoIsTheContactForTheLocationOfGoodsPage("")
        // --- Other possible matches ---
        // andIenterOnTheWhoIsTheContactForTheLocationOfGoodsPage() [0.80] (RouteDetailsLocationOfGoodsStepDefSteps.scala) pattern: (?:I )?enter (.+) on the 'Who is the contact for the location of goods\?' page

      And("I enter +432 1212 1212 on the presentation What is the phone number for the location of goods’ contact? page")
        // Possible match (best=0.81)
        andIenterOnThePresentationWhatIsThePhoneNumberForTheLocationOfGoodsContactPage("")
        // --- Other possible matches ---
        // andIenterOnTheWhatIsThePhoneNumberForTheLocationOfGoodsContactPage() [0.81] (RouteDetailsLocationOfGoodsStepDefSteps.scala) pattern: (?:I )?enter (.+) on the 'What is the phone number for the location of goods’ contact\?' page
        // andIenterOnThePresentationWhatIsTheAuthorisationNumberForTheLocationOfGoodsPage() [0.77] (PresentationNotificationStepDefSteps.scala) pattern: (?:I )?enter (.+) on the presentation 'What is the authorisation number for the location of goods\?' page
        // andIenterOnTheWhatIsThePhoneNumberForTheConsignorsContactPage() [0.76] (TraderDetailsStepDefSteps.scala) pattern: (?:I )?enter (.+) on the 'What is the phone number for the consignor’s contact\?' page
        // andIenterOnTheWhatIsTheAuthorisationNumberForTheLocationOfGoodsPage() [0.76] (RouteDetailsLocationOfGoodsStepDefSteps.scala) pattern: (?:I )?enter (.+) on the 'What is the authorisation number for the location of goods\?' page
        // andIenterOnThePresentationWhoIsTheContactForTheLocationOfGoodsPage() [0.76] (PresentationNotificationStepDefSteps.scala) pattern: (?:I )?enter (.+) on the presentation 'Who is the contact for the location of goods\?' page
        // andIenterOnTheWhatIsThePhoneNumberForTheCarriersContactPage() [0.76] (CarrierDetailsStepDefSteps.scala) pattern: (?:I )?enter (.+) on the 'What is the phone number for the carrier’s contact\?' page
        // andIenterOnTheWhoIsTheContactForTheLocationOfGoodsPage() [0.76] (RouteDetailsLocationOfGoodsStepDefSteps.scala) pattern: (?:I )?enter (.+) on the 'Who is the contact for the location of goods\?' page

      And("I choose radio option Yes on the presentation Do you want to add a UN LOCODE for the place of loading? page")
        // Possible match (best=0.82)
        andIchooseRadioOptionXOnThePresentationDoYouWantToAddAUNLOCODEForThePlaceOfLoadingPage("")
        // --- Other possible matches ---
        // andIchooseRadioOptionXOnTheDoYouWantToAddAUNLOCODEForThePlaceOfLoadingPage() [0.82] (RouteDetailsPlaceOfLoadingStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a UN LOCODE for the place of loading\?' page
        // andIchooseRadioOptionXOnTheDoYouWantToAddAPlaceOfLoadingPage() [0.81] (RouteDetailsPlaceOfLoadingStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a place of loading\?' page
        // andIchooseRadioOptionXOnTheDoYouWantToAddAUNLOCODEForThePlaceOfUnloadingPage() [0.78] (RouteDetailsPlaceOfUnloadingStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a UN LOCODE for the place of unloading\?' page
        // andIchooseRadioOptionXOnTheDoYouWantToAddAPlaceOfUnloadingPage() [0.77] (RouteDetailsPlaceOfUnloadingStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a place of unloading\?' page
        // andIchooseRadioOptionXOnTheDoYouWantToAddAnAuthorisationPage() [0.76] (TransportAuthorisationsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add an authorisation' page
        // andIchooseRadioOptionXOnTheDoYouWantToAddASealPage() [0.76] (TransportEquipmentChargesStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a seal\?' page
        // andIChooseRadioOptionXOnTheDoYouWantToAddACarrierPage() [0.76] (CarrierDetailsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a carrier\?' page
        // andIchooseRadioOptionXOnTheDoYouWantToAddATimeOfArrivalInXPage() [0.75] (RouteDetailsTransitStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a time of arrival in (.*)\?' page

      And("I enter DEAAL on the presentation What is the UN LOCODE for the place of loading? page")
        // Possible match (best=0.81)
        andIenterOnThePresentationWhatIsTheUNLOCODEForThePlaceOfLoadingPage("")
        // --- Other possible matches ---
        // andIenterOnTheWhatIsTheUNLOCODEForThePlaceOfLoadingPage() [0.81] (RouteDetailsPlaceOfLoadingStepDefSteps.scala) pattern: (?:I )?enter (.+) on the 'What is the UN LOCODE for the place of loading\?' page
        // andIenterOnTheWhatIsTheUNLOCODEForThePlaceOfUnloadingPage() [0.76] (RouteDetailsPlaceOfUnloadingStepDefSteps.scala) pattern: (?:I )?enter (.+) on the 'What is the UN LOCODE for the place of unloading\?' page

      And("I choose radio option Yes on the presentation Do you want to add extra information for the place of loading? page")
        // Possible match (best=0.90)
        andIchooseRadioOptionXOnThePresentationDoYouWantToAddExtraInformationForThePlaceOfLoadingPage("")
        // --- Other possible matches ---
        // andIchooseRadioOptionXOnTheDoYouWantToAddAPlaceOfLoadingPage() [0.85] (RouteDetailsPlaceOfLoadingStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a place of loading\?' page
        // andIchooseRadioOptionXOnTheDoYouWantToAddATimeOfArrivalInXPage() [0.83] (RouteDetailsTransitStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a time of arrival in (.*)\?' page
        // andIchooseRadioOptionXOnTheDoYouWantToAddAPlaceOfUnloadingPage() [0.81] (RouteDetailsPlaceOfUnloadingStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a place of unloading\?' page
        // andIchooseRadioOptionXOnTheDoYouWantToAddAnAuthorisationPage() [0.80] (TransportAuthorisationsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add an authorisation' page
        // andIchooseRadioOptionXOnTheDoYouWantToAddASealPage() [0.80] (TransportEquipmentChargesStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a seal\?' page
        // andIChooseRadioOptionXOnTheDoYouWantToAddACarrierPage() [0.80] (CarrierDetailsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a carrier\?' page
        // andIchooseRadioOptionXOnTheDoYouWantToAddExtraInformationForThePlaceOfLoadingPage() [0.80] (RouteDetailsPlaceOfLoadingStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add extra information for the place of loading\?' page
        // andIchooseRadioOptionXOnTheDoYouWantToAddAnItemForHouseConsignmentXPage() [0.79] (UnloadingStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add an item for house consignment (.*)\?' page
        // andIchooseRadioOptionXOnThePresentationDoYouWantToAddAUNLOCODEForThePlaceOfLoadingPage() [0.79] (PresentationNotificationStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the presentation 'Do you want to add a UN LOCODE for the place of loading\?' page
        // andIchooseRadioOptionXOnTheDoYouWantToAddAUNLOCODEForThePlaceOfLoadingPage() [0.78] (RouteDetailsPlaceOfLoadingStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a UN LOCODE for the place of loading\?' page
        // andIchooseRadioOptionXOnTheDepartureMeansXPage() [0.77] (InlandModeOfTransportStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the departure means '(.*)' page
        // andIchooseRadioOptionXOnTheDoYouWantToAddAContactForTheConsignorPage() [0.77] (TraderDetailsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a contact for the consignor\?' page
        // andIchooseRadioOptionXOnTheDoYouWantToAddAReferenceForTheGuaranteePage() [0.77] (Departure_GuaranteeDetailsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a reference for the guarantee\?' page
        // andIchooseRadioOptionXOnTheDoYouWantToAddALiabilityForTheGuaranteePage() [0.77] (Departure_GuaranteeDetailsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a liability for the guarantee\?' page
        // andIchooseRadioOptionXOnTheDoYouWantToAddADocumentForTheItemPage() [0.77] (UnloadingStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a document for the item\?' page
        // andIchooseRadioOptionXOnTheDoYouWantToAddAPackageForTheItemPage() [0.77] (UnloadingStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a package for the item\?' page
        // andIchooseRadioOptionXOnThEDoYouWantToAddAContactForTheCarrierPage() [0.77] (CarrierDetailsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a contact for the carrier\?' page
        // andIchooseRadioOptionXOnTheDoYouWantToAddALocationOfGoodsPage() [0.77] (RouteDetailsLocationOfGoodsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a location of goods\?' page
        // andIchooseRadioOptionXOnTheDoYouWantToAddTheTypeOfIdentificationPage() [0.77] (BorderMeansOfTransportStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add the type of identification\?' page
        // andIchooseRadioOptionXOnTheDoYouWantToAddExtraInformationForThePlaceOfUnloadingPage() [0.76] (RouteDetailsPlaceOfUnloadingStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add extra information for the place of unloading\?' page
        // andIchooseRadioOptionXOnTheDoYouWantToAddAnAdditionalReferenceForHouseConsignmentXPage() [0.76] (UnloadingStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add an additional reference for house consignment (.*)\?' page
        // andIchooseRadioOptionXOnTheDoYouWantToAddAnyDocumentsForHouseConsignmentXPage() [0.75] (UnloadingStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add any documents for house consignment (.*)\?' page
        // andIchooseRadioOptionXOnThePresentationDoYouWantToAddAContactForTheLocationOfGoodsPage() [0.75] (PresentationNotificationStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the presentation 'Do you want to add a contact for the location of goods\?' page
        // andIchooseRadioOptionXOnTheDoYouWantToAddAUNLOCODEForThePlaceOfUnloadingPage() [0.75] (RouteDetailsPlaceOfUnloadingStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a UN LOCODE for the place of unloading\?' page

      And("I select United Kingdom on the presentation In which country is the place of loading? page")
        // Possible match (best=0.80)
        andIselectOnThePresentationInWhichCountryIsThePlaceOfLoadingPage("")
        // --- Other possible matches ---
        // andIselectOnTheInWhichCountryIsThePlaceOfLoadingPage() [0.80] (RouteDetailsPlaceOfLoadingStepDefSteps.scala) pattern: (?:I )?select (.+) on the 'In which country is the place of loading\?' page
        // andIselectOnTheWhichCountryIsThePlaceOfUnloadingInPage() [0.75] (RouteDetailsPlaceOfUnloadingStepDefSteps.scala) pattern: (?:I )?select (.+) on the 'Which country is the place of unloading in\?' page

      And("I enter London on the presentation Where in United Kingdom is the place of loading? page")
        // Possible match (best=0.81)
        andIenterOnThePresentationWhereInXIsThePlaceOfLoadingPage("", "")

      And("I enter the date on the presentation When do you expect the transit to arrive in Nancy bureau (FR003000)? page")
        // Possible match (best=1.00)
        andIenterTheDateOnThePresentationWhenDoYouExpectTheTransitToArriveInXPage("")
        // --- Other possible matches ---
        // andIenterTheDateOnTheWhenDoYouExpectTheTransitToArriveInXPage() [0.90] (TransportAuthorisationsStepDefSteps.scala) pattern: (?:I )?enter the date on the 'When do you expect the transit to arrive in (.*)\?' page
        // andIchooseFillInTheDateAndTimeOnTheWhenDoYouExpectTheTransitToArriveInXXPage() [0.77] (RouteDetailsTransitStepDefSteps.scala) pattern: (?:I )?choose fill in the date and time on the 'When do you expect the transit to arrive in (.*), (.*)\?' page

      And("I choose radio option Yes on the presentation Are you using any shipping containers to transport the goods? page")
        // Possible match (best=0.81)
        andIchooseRadioOptionXOnThePresentationAreYouUsingAnyShippingContainersToTransportTheGoodsPage("")
        // --- Other possible matches ---
        // andIchooseRadioOptionXOnTheAreYouUsingAnyShippingContainersToTransportTheGoodsPage() [0.81] (TransportDetailsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Are you using any shipping containers to transport the goods\?' page

      And("I choose radio Maritime Transport on the presentation How is the transit crossing the border? page")
        // Possible match (best=0.80)
        andIchooseRadioXOnThePresentationHowIsTheTransitCrossingTheBorderPage("")

      And("I choose radio Name of the sea-going vessel on the presentation inland mode Which identification do you want to use for this vehicle? page")
        // Possible match (best=0.82)
        andIchooseRadioXOnThePresentationInlandModeWhichIdentificationDoYouWantToUseForThisVehiclePage("")

      And("I enter identification number 5h1p1nn on What is the identification number for this? page")
        // Possible match (best=0.80)
        andIenterIdentificationOnTheWhatIsTheIdentificationNumberForThisPage("")
        // --- Other possible matches ---
        // andIenterIdentificationNumberOnWhatIsTheIdentificationNumberForThisPage() [0.80] (PresentationNotificationStepDefSteps.scala) pattern: (?:I )?enter identification number (.+) on 'What is the identification number for this\?' page
        // andIenterIdentificationNumberOnWhatIsTheIdentificationNumberForThisVehiclePage() [0.76] (UnloadingStepDefSteps.scala) pattern: (?:I )?enter identification number (.+) on 'What is the identification number for this vehicle\?' page

      And("I select United Kingdom on the active border mode What country is this vehicle registered to? page")
        // Possible match (best=0.81)
        andIselectOnTheActiveBorderModeWhatCountryIsThisVehicleRegisteredToPage("")
        // --- Other possible matches ---
        // andIselectOnTheBorderModeWhatCountryIsThisVehicleRegisteredToPage() [0.80] (BorderMeansOfTransportStepDefSteps.scala) pattern: (?:I )?select (.+) on the border mode 'What country is this vehicle registered to\?' page
        // andIselectOnTheWhatCountryIsThisVehicleRegisteredToPage() [0.80] (UnloadingStepDefSteps.scala) pattern: (?:I )?select (.+) on the 'What country is this vehicle registered to\?' page
        // andIselectOnTheInlandModeWhatCountryIsThisVehicleRegisteredToPage() [0.76] (InlandModeOfTransportStepDefSteps.scala) pattern: (?:I )?select (.+) on the inland mode 'What country is this vehicle registered to\?' page

      And("I select Nancy bureau (FR003000) on Where is the customs office at the border? page")
        // Possible match (best=0.80)
        andIselectOnTheWhereIsTheCustomsOfficeAtTheBorderPage("")
        // --- Other possible matches ---
        // andIselectOnWhereIsTheCustomsOfficeAtTheBorderPage() [0.80] (PresentationNotificationStepDefSteps.scala) pattern: (?:I )?select (.+) on 'Where is the customs office at the border\?' page

      And("I choose radio Yes on the presentation Do you want to add a conveyance reference number? page")
        // Possible match (best=0.81)
        andIchooseRadioXOnThePresentationDoYouWantToAddAConveyanceReferenceNumberPage("")

      And("I enter conveyance reference number 123456123456 on the What is the conveyance reference number? page")
        // Possible match (best=0.80)
        andIenterConveyanceReferenceNumberOnTheWhatIsTheConveyanceReferenceNumberPage("")
        // --- Other possible matches ---
        // andIenterOnTheWhatIsTheReferencePage() [0.78] (Departure_GuaranteeDetailsStepDefSteps.scala) pattern: (?:I )?enter (.+) on the 'What is the reference\?' page

      And("I choose radio Yes on the presentation You have added 1 border means of transport page")
        // Possible match (best=0.91)
        whenIchooseRadioXOnThePresentationYouHaveAddedXBorderMeansOfTransportPage("", "")

      And("I choose radio IATA flight number on the presentation inland mode Which identification do you want to use for this vehicle? page")
        // Possible match (best=0.82)
        andIchooseRadioXOnThePresentationInlandModeWhichIdentificationDoYouWantToUseForThisVehiclePage("")

      And("I enter identification number YATA010 on What is the identification number for this? page")
        // Possible match (best=0.80)
        andIenterIdentificationOnTheWhatIsTheIdentificationNumberForThisPage("")
        // --- Other possible matches ---
        // andIenterIdentificationNumberOnWhatIsTheIdentificationNumberForThisPage() [0.80] (PresentationNotificationStepDefSteps.scala) pattern: (?:I )?enter identification number (.+) on 'What is the identification number for this\?' page
        // andIenterIdentificationNumberOnWhatIsTheIdentificationNumberForThisVehiclePage() [0.76] (UnloadingStepDefSteps.scala) pattern: (?:I )?enter identification number (.+) on 'What is the identification number for this vehicle\?' page

      And("I select United Kingdom on the active border mode What country is this vehicle registered to? page")
        // Possible match (best=0.81)
        andIselectOnTheActiveBorderModeWhatCountryIsThisVehicleRegisteredToPage("")
        // --- Other possible matches ---
        // andIselectOnTheBorderModeWhatCountryIsThisVehicleRegisteredToPage() [0.80] (BorderMeansOfTransportStepDefSteps.scala) pattern: (?:I )?select (.+) on the border mode 'What country is this vehicle registered to\?' page
        // andIselectOnTheWhatCountryIsThisVehicleRegisteredToPage() [0.80] (UnloadingStepDefSteps.scala) pattern: (?:I )?select (.+) on the 'What country is this vehicle registered to\?' page
        // andIselectOnTheInlandModeWhatCountryIsThisVehicleRegisteredToPage() [0.76] (InlandModeOfTransportStepDefSteps.scala) pattern: (?:I )?select (.+) on the inland mode 'What country is this vehicle registered to\?' page

      And("I select Nancy bureau (FR003000) on Where is the customs office at the border? page")
        // Possible match (best=0.80)
        andIselectOnTheWhereIsTheCustomsOfficeAtTheBorderPage("")
        // --- Other possible matches ---
        // andIselectOnWhereIsTheCustomsOfficeAtTheBorderPage() [0.80] (PresentationNotificationStepDefSteps.scala) pattern: (?:I )?select (.+) on 'Where is the customs office at the border\?' page

      And("I choose radio No on the presentation Do you want to add a conveyance reference number? page")
        // Possible match (best=0.81)
        andIchooseRadioXOnThePresentationDoYouWantToAddAConveyanceReferenceNumberPage("")

      And("I click the Remove link on the You have added 2 border means of transport page")
        // Possible match (best=0.91)
        andIclickTheXLinkOnTheYouHaveAddedXBorderMeansOfTransportPage("", "")

      And("I click radio Yes on the Are you sure you want to remove border means of transport 1? page")
        // Possible match (best=0.93)
        andIclickRadioXOnTheAreYouSureYouWantToRemoveBorderMeansOfTransportXPage("", "")
        // --- Other possible matches ---
        // andIselectRadioOptionXOnTheAreYouSureYouWantToRemoveBorderMeansOfTransportXPage() [0.76] (BorderMeansOfTransportStepDefSteps.scala) pattern: (?:I )?select radio option (.*) on the 'Are you sure you want to remove border means of transport (.*)\?' page

      And("I choose radio No on the presentation You have added 1 border means of transport page")
        // Possible match (best=0.91)
        whenIchooseRadioXOnThePresentationYouHaveAddedXBorderMeansOfTransportPage("", "")

      And("I enter C001 on the presentation What is the container identification number? page")
        // Possible match (best=0.80)
        andIenterOnThePresentationWhatIsTheContainerIdentificationNumberPage("")
        // --- Other possible matches ---
        // andIenterOnTheWhatIsTheContainerIdentificationNumberPage() [0.79] (TransportEquipmentChargesStepDefSteps.scala) pattern: (?:I )?enter (.+) on the 'What is the container identification number\?' page

      And("I click radio Yes on the presentation Do you want to add a seal? page")
        // Possible match (best=0.80)
        andIclickRadioXOnThePresentationDoYouWantToAddASealPage("")

      And("I enter S001 on the presentation What is the seal identification number? page")
        // Possible match (best=0.80)
        andIenterOnThePresentationWhatIsTheSealIdentificationNumberPage("")
        // --- Other possible matches ---
        // andIenterOnTheWhatIsTheSealIdentificationNumberPage() [0.79] (TransportEquipmentChargesStepDefSteps.scala) pattern: (?:I )?enter (.+) on the 'What is the seal identification number\?' page

      And("I choose radio Yes on the presentation You have added 1 seal page")
        // Possible match (best=0.89)
        whenIchooseRadioXOnThePresentationYouHaveAddedXSealPage("", "")

      And("I enter S002 on the presentation What is the seal identification number? page")
        // Possible match (best=0.80)
        andIenterOnThePresentationWhatIsTheSealIdentificationNumberPage("")
        // --- Other possible matches ---
        // andIenterOnTheWhatIsTheSealIdentificationNumberPage() [0.79] (TransportEquipmentChargesStepDefSteps.scala) pattern: (?:I )?enter (.+) on the 'What is the seal identification number\?' page

      And("I click the Remove link on the presentation You have added 2 seals page")
        // Possible match (best=0.90)
        andIclickTheXLinkOnThePresentationYouHaveAddedXSealsPage("", "")
        // --- Other possible matches ---
        // andIclickTheXLinkOnTheYouHaveAddedXSealsPage() [0.79] (TransportEquipmentChargesStepDefSteps.scala) pattern: (?:I )?click the (.*) link  on the 'You have added (.*) seals?' page

      And("I click radio option Yes on the presentation Are you sure you want to remove this seal? page")
        // Possible match (best=0.81)
        andIclickRadioOptionXOnThePresentationAreYouSureYouWantToRemoveThisSealPage("")
        // --- Other possible matches ---
        // andIclickRadioOptionXOnTheAreYouSureYouWantToRemoveThisSealpage() [0.81] (TransportEquipmentChargesStepDefSteps.scala) pattern: (?:I )?click radio option (.*) on the 'Are you sure you want to remove this seal\?' page
        // andIclickRadioOptionXOnTheAreYouSureYouWantToRemoveItemXPage() [0.78] (ItemDetailsStepDefSteps.scala) pattern: (?:I )?click radio option (.*) on the 'Are you sure you want to remove item (.*)\?' page
        // andIclickRadioOptionXOnTheAreYouSureYouWantToRemoveThisDocumentPage() [0.77] (DocumentsStepDefSteps.scala) pattern: (?:I )?click radio option (.*) on the 'Are you sure you want to remove this document\?' page
        // andIclickRadioOptionXOnThePresentationAreYouSureYouWantToRemoveTransportEquipmentXPage() [0.75] (PresentationNotificationStepDefSteps.scala) pattern: (?:I )?click radio option (.*) on the presentation 'Are you sure you want to remove transport equipment (.*)\?' page

      And("I choose radio No on the presentation You have added 1 seal page")
        // Possible match (best=0.89)
        whenIchooseRadioXOnThePresentationYouHaveAddedXSealPage("", "")

      And("I select item1 on the presentation Which items does this transport equipment apply to? page")
        // Possible match (best=0.80)
        andIselectOnThePresentationWhichItemsDoesThisTransportEquipmentApplyToPage("")
        // --- Other possible matches ---
        // andIselectOnTheWhichItemDoesThisTransportEquipmentApplyToPage() [0.80] (UnloadingStepDefSteps.scala) pattern: (?:I )?select (.+) on the 'Which item does this transport equipment apply to\?' page

      And("I choose radio Yes on the presentation You have applied 1 item to transport equipment 1 page")
        // ⚠️ No step-def match found for: I choose radio Yes on the presentation You have applied 1 item to transport equipment 1 page

      And("I select item2 on the presentation Which items does this transport equipment apply to? page")
        // Possible match (best=0.80)
        andIselectOnThePresentationWhichItemsDoesThisTransportEquipmentApplyToPage("")
        // --- Other possible matches ---
        // andIselectOnTheWhichItemDoesThisTransportEquipmentApplyToPage() [0.80] (UnloadingStepDefSteps.scala) pattern: (?:I )?select (.+) on the 'Which item does this transport equipment apply to\?' page

      And("I click the Remove link on the You have applied 2 item to transport equipment 1 page")
        // ⚠️ No step-def match found for: I click the Remove link on the You have applied 2 item to transport equipment 1 page

      And("I choose radio option Yes for the Are you sure you want to remove this item from transport equipment 1? page")
        // Possible match (best=0.93)
        andIchooseRadioOptionXForTheAreYouSureYouWantToRemoveThisItemFromTransportEquipmentPage("", "")
        // --- Other possible matches ---
        // andIchooseRadioOptionXOnTheAreYouSureYouWantToRemoveThisItemFromTransportEquipmentPage() [0.83] (UnloadingStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Are you sure you want to remove this item from transport equipment (.+)\?' page
        // andIchooseRadioOptionXOnAreYouSureYouWantToRemoveThisSealFromTransportEquipmentXPage() [0.79] (UnloadingStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on 'Are you sure you want to remove this seal from transport equipment (.*)\?' page
        // andIchooseRadioOptionXOnTheDocumentsAreYouSureYouWantToRemoveTransportEquipmentPage() [0.79] (UnloadingStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the documents 'Are you sure you want to remove transport equipment (.+)\?' page
        // andIchooseRadioOptionXForTheAreYouSureYouWantToRemoveThisAuthorisationPage() [0.78] (TransportAuthorisationsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) for the 'Are you sure you want to remove this (.+) authorisation\?' page
        // andIchooseRadioOptionXOnTheAreYouSureYouWantToRemoveThisGuaranteePage() [0.77] (Departure_GuaranteeDetailsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Are you sure you want to remove this guarantee\?' page

      And("I choose radio No on the presentation You have applied 1 item to transport equipment 1 page")
        // ⚠️ No step-def match found for: I choose radio No on the presentation You have applied 1 item to transport equipment 1 page

      And("I choose radio option Yes on the presentation You have added 1 transport equipment page")
        // Possible match (best=0.91)
        andIchooseRadioOptionXOnThePresentationYouHaveAddedXTransportEquipmentPage("", "")
        // --- Other possible matches ---
        // andIchooseRadioOptionXOnTheYouHaveAddedXTransportEquipmentPage() [0.80] (TransportEquipmentChargesStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'You have added (.*) transport equipment' page

      And("I click radio No on the presentation Do you want to add a container identification number? page")
        // Possible match (best=0.81)
        andIclickRadioXOnThePresentationDoYouWantToAddAContainerIdentificationNumberPage("")
        // --- Other possible matches ---
        // andIclickRadioXOnThePresentationDoYouWantToAddASealPage() [0.76] (PresentationNotificationStepDefSteps.scala) pattern: (?:I )?click radio (.*) on the presentation 'Do you want to add a seal\?' page

      And("I click radio No on the presentation Do you want to add a seal? page")
        // Possible match (best=0.80)
        andIclickRadioXOnThePresentationDoYouWantToAddASealPage("")

      And("I select item3 on the presentation Which items does this transport equipment apply to? page")
        // Possible match (best=0.80)
        andIselectOnThePresentationWhichItemsDoesThisTransportEquipmentApplyToPage("")
        // --- Other possible matches ---
        // andIselectOnTheWhichItemDoesThisTransportEquipmentApplyToPage() [0.80] (UnloadingStepDefSteps.scala) pattern: (?:I )?select (.+) on the 'Which item does this transport equipment apply to\?' page

      And("I choose radio No on the presentation You have applied 1 item to transport equipment 2 page")
        // ⚠️ No step-def match found for: I choose radio No on the presentation You have applied 1 item to transport equipment 2 page

      And("I click the Remove link on the presentation You have added 2 transport equipment page")
        // Possible match (best=0.91)
        andIclickTheXLinkOnThePresentationYouHaveAddedXTransportEquipmentPage("", "")
        // --- Other possible matches ---
        // andIclickTheXLinkOnTheAddPresentationYouHaveAddedXTransportEquipmentPage() [0.91] (PresentationNotificationStepDefSteps.scala) pattern: (?:I )?click the (.*) link on the presentation 'You have added (.*) transport equipment' page
        // andIclickTheXLinkOnTheYouHaveAddedXTransportEquipmentPage() [0.80] (TransportEquipmentChargesStepDefSteps.scala) pattern: (?:I )?click the (.*) link on the 'You have added (.*) transport equipment' page

      And("I click radio option Yes on the presentation Are you sure you want to remove transport equipment 1? page")
        // Possible match (best=0.93)
        andIclickRadioOptionXOnThePresentationAreYouSureYouWantToRemoveTransportEquipmentXPage("", "")
        // --- Other possible matches ---
        // andIclickRadioOptionXOnTheAreYouSureYouWantToRemoveTransportEquipmentXPage() [0.82] (TransportEquipmentChargesStepDefSteps.scala) pattern: (?:I )?click radio option (.*) on the 'Are you sure you want to remove transport equipment (.*)\?' page
        // andIclickRadioOptionXOnTheAreYouSureYouWantToRemoveItemXPage() [0.78] (ItemDetailsStepDefSteps.scala) pattern: (?:I )?click radio option (.*) on the 'Are you sure you want to remove item (.*)\?' page

      And("I choose radio option No on the presentation You have added 1 transport equipment page")
        // Possible match (best=0.91)
        andIchooseRadioOptionXOnThePresentationYouHaveAddedXTransportEquipmentPage("", "")
        // --- Other possible matches ---
        // andIchooseRadioOptionXOnTheYouHaveAddedXTransportEquipmentPage() [0.80] (TransportEquipmentChargesStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'You have added (.*) transport equipment' page

      Then("I should be on the Presentation Notification Check your answers page")
        // Possible match (best=1.00)
        thenIshouldbeOnThePresentationNotificationCheckYourAnswersPage()

      And("I submit the Check your answers page")
        // Possible match (best=1.00)
        andIsubmitTheCheckYourAnswersPage()

      Then("I should be on the Information sent page")
        // Possible match (best=1.00)
        thenIshouldbeOnTheInformationSentPage()

    }

    Scenario("02 Checks for limit date in Presentation Notification for simplified departure") {
      When("I submit an IE015 Simplified Prelodged Departure Declaration Full")
        // Possible match (best=1.00)
        givenIsubmitAFile("IE015 Simplified Prelodged Departure Declaration Full")

      Then("I submit an IE928 Positive Acknowledgment")
        // Possible match (best=1.00)
        givenIsubmitAFile("IE928 Positive Acknowledgment")

      And("I refresh the page")
        // Possible match (best=1.00)
        andIrefreshThePage()

      And("I click on the View departure declarations link on the Manage your transit movements page")
        // Possible match (best=0.95)
        givenIclickOnTheLinkOnTheManageYourTransitMovementsPage("")
        // --- Other possible matches ---
        // givenIclickOnTheLinkOnTheDepartureDeclarationsPage() [0.79] (DepartureDeclarationsStepDefSteps.scala) pattern: (?:I )?click on the (.+) link on the 'Departure declarations' page

      And("I click on the Complete pre lodged declaration link for LRN 25GB000246TK0E6WJ1 on the Departure declarations page")
        // Possible match (best=0.90)
        andIclickOnTheXLinkForLRNXOnTheDepartureDeclarationsPage("", "")
        // --- Other possible matches ---
        // givenIclickOnTheLinkOnTheDepartureDeclarationsPage() [0.79] (DepartureDeclarationsStepDefSteps.scala) pattern: (?:I )?click on the (.+) link on the 'Departure declarations' page

      And("I click the Continue button on the presentation More information needed to complete pre-lodged declaration page")
        // ⚠️ No step-def match found for: I click the Continue button on the presentation More information needed to complete pre-lodged declaration page

      And("I enter the date on the presentation When do you expect the transit to arrive in Belfast Docks,Unit 2 Block C (XI000142)? page")
        // Possible match (best=1.00)
        andIenterTheDateOnThePresentationWhenDoYouExpectTheTransitToArriveInXPage("")
        // --- Other possible matches ---
        // andIenterTheDateOnTheWhenDoYouExpectTheTransitToArriveInXPage() [0.90] (TransportAuthorisationsStepDefSteps.scala) pattern: (?:I )?enter the date on the 'When do you expect the transit to arrive in (.*)\?' page
        // andIchooseFillInTheDateAndTimeOnTheWhenDoYouExpectTheTransitToArriveInXXPage() [0.77] (RouteDetailsTransitStepDefSteps.scala) pattern: (?:I )?choose fill in the date and time on the 'When do you expect the transit to arrive in (.*), (.*)\?' page

    }

    Scenario("03 'Normal' short journey with security type 1;  answer 'No' to all optional questions") {
      When("I submit an IE015 Prelodged Departure Declaration")
        // Possible match (best=1.00)
        givenIsubmitAFile("IE015 Prelodged Departure Declaration")

      Then("I submit an IE928 Positive Acknowledgment")
        // Possible match (best=1.00)
        givenIsubmitAFile("IE928 Positive Acknowledgment")

      And("I refresh the page")
        // Possible match (best=1.00)
        andIrefreshThePage()

      And("I click on the View departure declarations link on the Manage your transit movements page")
        // Possible match (best=0.95)
        givenIclickOnTheLinkOnTheManageYourTransitMovementsPage("")
        // --- Other possible matches ---
        // givenIclickOnTheLinkOnTheDepartureDeclarationsPage() [0.79] (DepartureDeclarationsStepDefSteps.scala) pattern: (?:I )?click on the (.+) link on the 'Departure declarations' page

      And("I click on the Complete pre lodged declaration link for LRN 25GB000246TK0E6WJ1 on the Departure declarations page")
        // Possible match (best=0.90)
        andIclickOnTheXLinkForLRNXOnTheDepartureDeclarationsPage("", "")
        // --- Other possible matches ---
        // givenIclickOnTheLinkOnTheDepartureDeclarationsPage() [0.79] (DepartureDeclarationsStepDefSteps.scala) pattern: (?:I )?click on the (.+) link on the 'Departure declarations' page

      And("I click the Continue button on the presentation More information needed to complete pre-lodged declaration page")
        // ⚠️ No step-def match found for: I click the Continue button on the presentation More information needed to complete pre-lodged declaration page

      And("I choose radio option Approved place on the presentation Which type of location are the goods in? page")
        // Possible match (best=0.81)
        andIchooseRadioOptionXOnThePresentationWhichTypeOfLocationAreTheGoodsInPage("")

      And("I choose a radio option Address on the presentation How do you want to identify the location of goods? page")
        // Possible match (best=0.82)
        andIchooseARadioOptionXOnThePresentationHowDoYouWantToIdentifyTheLocationOfGoodsPage("")

      And("I select United Kingdom on the presentation In which country is the location of goods? page")
        // Possible match (best=0.80)
        andIselectOnThePresentationInWhichCountryIsTheLocationOfGoodsPage("")
        // --- Other possible matches ---
        // andIselectOnTheLocationOfGoodsCountryPage() [0.78] (RouteDetailsLocationOfGoodsStepDefSteps.scala) pattern: (?:I )?select (.+) on the location of goods country page

      And("I fill in the address on the presentation What is the address for the location of goods? page")
        // ⚠️ No step-def match found for: I fill in the address on the presentation What is the address for the location of goods? page

      And("I choose radio option No on the presentation Do you want to add a contact for the location of goods? page")
        // Possible match (best=0.82)
        andIchooseRadioOptionXOnThePresentationDoYouWantToAddAContactForTheLocationOfGoodsPage("")
        // --- Other possible matches ---
        // andIchooseRadioOptionXOnTheDoYouWantToAddAContactForTheLocationOfGoodsPage() [0.82] (RouteDetailsLocationOfGoodsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a contact for the location of goods\?' page
        // andIchooseRadioOptionXOnTheDoYouWantToAddALocationOfGoodsPage() [0.81] (RouteDetailsLocationOfGoodsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a location of goods\?' page
        // andIchooseRadioOptionXOnTheDoYouWantToAddAContactForTheConsignorPage() [0.77] (TraderDetailsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a contact for the consignor\?' page
        // andIchooseRadioOptionXOnThEDoYouWantToAddAContactForTheCarrierPage() [0.77] (CarrierDetailsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a contact for the carrier\?' page
        // andIchooseRadioOptionXOnTheDoYouWantToAddAnAuthorisationPage() [0.76] (TransportAuthorisationsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add an authorisation' page
        // andIchooseRadioOptionXOnTheDoYouWantToAddASealPage() [0.76] (TransportEquipmentChargesStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a seal\?' page
        // andIChooseRadioOptionXOnTheDoYouWantToAddACarrierPage() [0.76] (CarrierDetailsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a carrier\?' page
        // andIchooseRadioOptionXOnThePresentationDoYouWantToAddAnAdditionalIdentifierForTheLocationOfGoodsPage() [0.75] (PresentationNotificationStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the presentation 'Do you want to add an additional identifier for the location of goods\?' page
        // andIchooseRadioOptionXOnTheDoYouWantToAddAnAdditionalIdentifierForTheLocationOfGoodsPage() [0.75] (RouteDetailsLocationOfGoodsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add an additional identifier for the location of goods\?' page
        // andIchooseRadioOptionXOnTheArrivalLocationOfGoodsAddContactPage() [0.75] (LocationOfGoodsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the arrival location of goods add contact page

      And("I choose radio option No on the presentation Do you want to add a UN LOCODE for the place of loading? page")
        // Possible match (best=0.82)
        andIchooseRadioOptionXOnThePresentationDoYouWantToAddAUNLOCODEForThePlaceOfLoadingPage("")
        // --- Other possible matches ---
        // andIchooseRadioOptionXOnTheDoYouWantToAddAUNLOCODEForThePlaceOfLoadingPage() [0.82] (RouteDetailsPlaceOfLoadingStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a UN LOCODE for the place of loading\?' page
        // andIchooseRadioOptionXOnTheDoYouWantToAddAPlaceOfLoadingPage() [0.81] (RouteDetailsPlaceOfLoadingStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a place of loading\?' page
        // andIchooseRadioOptionXOnTheDoYouWantToAddAUNLOCODEForThePlaceOfUnloadingPage() [0.78] (RouteDetailsPlaceOfUnloadingStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a UN LOCODE for the place of unloading\?' page
        // andIchooseRadioOptionXOnTheDoYouWantToAddAPlaceOfUnloadingPage() [0.77] (RouteDetailsPlaceOfUnloadingStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a place of unloading\?' page
        // andIchooseRadioOptionXOnTheDoYouWantToAddAnAuthorisationPage() [0.76] (TransportAuthorisationsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add an authorisation' page
        // andIchooseRadioOptionXOnTheDoYouWantToAddASealPage() [0.76] (TransportEquipmentChargesStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a seal\?' page
        // andIChooseRadioOptionXOnTheDoYouWantToAddACarrierPage() [0.76] (CarrierDetailsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a carrier\?' page
        // andIchooseRadioOptionXOnTheDoYouWantToAddATimeOfArrivalInXPage() [0.75] (RouteDetailsTransitStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a time of arrival in (.*)\?' page

      And("I select United Kingdom on the presentation In which country is the place of loading? page")
        // Possible match (best=0.80)
        andIselectOnThePresentationInWhichCountryIsThePlaceOfLoadingPage("")
        // --- Other possible matches ---
        // andIselectOnTheInWhichCountryIsThePlaceOfLoadingPage() [0.80] (RouteDetailsPlaceOfLoadingStepDefSteps.scala) pattern: (?:I )?select (.+) on the 'In which country is the place of loading\?' page
        // andIselectOnTheWhichCountryIsThePlaceOfUnloadingInPage() [0.75] (RouteDetailsPlaceOfUnloadingStepDefSteps.scala) pattern: (?:I )?select (.+) on the 'Which country is the place of unloading in\?' page

      And("I enter London on the presentation Where in United Kingdom is the place of loading? page")
        // Possible match (best=0.81)
        andIenterOnThePresentationWhereInXIsThePlaceOfLoadingPage("", "")

      And("I choose radio option No on the presentation Are you using any shipping containers to transport the goods? page")
        // Possible match (best=0.81)
        andIchooseRadioOptionXOnThePresentationAreYouUsingAnyShippingContainersToTransportTheGoodsPage("")
        // --- Other possible matches ---
        // andIchooseRadioOptionXOnTheAreYouUsingAnyShippingContainersToTransportTheGoodsPage() [0.81] (TransportDetailsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Are you using any shipping containers to transport the goods\?' page

      And("I choose radio Air transport on the presentation How is the transit crossing the border? page")
        // Possible match (best=0.80)
        andIchooseRadioXOnThePresentationHowIsTheTransitCrossingTheBorderPage("")

      And("I choose radio Registration Number of the Aircraft on the presentation inland mode Which identification do you want to use for this vehicle? page")
        // Possible match (best=0.82)
        andIchooseRadioXOnThePresentationInlandModeWhichIdentificationDoYouWantToUseForThisVehiclePage("")

      And("I enter identification number GB1234567 on What is the identification number for this? page")
        // Possible match (best=0.80)
        andIenterIdentificationOnTheWhatIsTheIdentificationNumberForThisPage("")
        // --- Other possible matches ---
        // andIenterIdentificationNumberOnWhatIsTheIdentificationNumberForThisPage() [0.80] (PresentationNotificationStepDefSteps.scala) pattern: (?:I )?enter identification number (.+) on 'What is the identification number for this\?' page
        // andIenterIdentificationNumberOnWhatIsTheIdentificationNumberForThisVehiclePage() [0.76] (UnloadingStepDefSteps.scala) pattern: (?:I )?enter identification number (.+) on 'What is the identification number for this vehicle\?' page

      And("I select United Kingdom on the active border mode What country is this vehicle registered to? page")
        // Possible match (best=0.81)
        andIselectOnTheActiveBorderModeWhatCountryIsThisVehicleRegisteredToPage("")
        // --- Other possible matches ---
        // andIselectOnTheBorderModeWhatCountryIsThisVehicleRegisteredToPage() [0.80] (BorderMeansOfTransportStepDefSteps.scala) pattern: (?:I )?select (.+) on the border mode 'What country is this vehicle registered to\?' page
        // andIselectOnTheWhatCountryIsThisVehicleRegisteredToPage() [0.80] (UnloadingStepDefSteps.scala) pattern: (?:I )?select (.+) on the 'What country is this vehicle registered to\?' page
        // andIselectOnTheInlandModeWhatCountryIsThisVehicleRegisteredToPage() [0.76] (InlandModeOfTransportStepDefSteps.scala) pattern: (?:I )?select (.+) on the inland mode 'What country is this vehicle registered to\?' page

      And("I select Belfast Docks,Unit 2 Block C (XI000142) on Where is the customs office at the border? page")
        // Possible match (best=0.85)
        andIselectOnTheWhereIsTheCustomsOfficeAtTheBorderPage("")
        // --- Other possible matches ---
        // andIselectOnWhereIsTheCustomsOfficeAtTheBorderPage() [0.85] (PresentationNotificationStepDefSteps.scala) pattern: (?:I )?select (.+) on 'Where is the customs office at the border\?' page
        // andIselectOnTheWhereIsTheOfficeOfDeparturePage() [0.79] (PreTaskListStepDefSteps.scala) pattern: (?:I )?select (.+) on the 'Where is the office of departure\?' page

      And("I enter conveyance reference number GB123456123456 on the What is the conveyance reference number? page")
        // Possible match (best=0.80)
        andIenterConveyanceReferenceNumberOnTheWhatIsTheConveyanceReferenceNumberPage("")
        // --- Other possible matches ---
        // andIenterOnTheWhatIsTheReferencePage() [0.78] (Departure_GuaranteeDetailsStepDefSteps.scala) pattern: (?:I )?enter (.+) on the 'What is the reference\?' page

      And("I choose radio option No on the presentation Do you want to add any transport equipment? page")
        // Possible match (best=0.81)
        andIchooseRadioOptionXOnThePresentationDoYouWantToAddAnyTransportEquipmentPage("")
        // --- Other possible matches ---
        // andIchooseRadioOptionXOnTheDoYouWantToAddAnyTransportEquipmentPage() [0.81] (TransportEquipmentChargesStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add any transport equipment\?' page
        // andIchooseRadioOptionXOnTheDoYouWantToAddAnAuthorisationPage() [0.76] (TransportAuthorisationsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add an authorisation' page
        // andIchooseRadioOptionXOnTheDoYouWantToAddASealPage() [0.76] (TransportEquipmentChargesStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a seal\?' page
        // andIChooseRadioOptionXOnTheDoYouWantToAddACarrierPage() [0.76] (CarrierDetailsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a carrier\?' page

      Then("I should be on the Presentation Notification Check your answers page")
        // Possible match (best=1.00)
        thenIshouldbeOnThePresentationNotificationCheckYourAnswersPage()

      And("I submit the Check your answers page")
        // Possible match (best=1.00)
        andIsubmitTheCheckYourAnswersPage()

      Then("I should be on the Information sent page")
        // Possible match (best=1.00)
        thenIshouldbeOnTheInformationSentPage()

    }

    Scenario("04 'Normal' short journey with security type 0 and location of goods in IE015;  answer 'No' to all optional questions") {
      When("I submit an IE015 Prelodged Departure Declaration With Location Of Goods")
        // Possible match (best=1.00)
        givenIsubmitAFile("IE015 Prelodged Departure Declaration With Location Of Goods")

      Then("I submit an IE928 Positive Acknowledgment")
        // Possible match (best=1.00)
        givenIsubmitAFile("IE928 Positive Acknowledgment")

      And("I refresh the page")
        // Possible match (best=1.00)
        andIrefreshThePage()

      And("I click on the View departure declarations link on the Manage your transit movements page")
        // Possible match (best=0.95)
        givenIclickOnTheLinkOnTheManageYourTransitMovementsPage("")
        // --- Other possible matches ---
        // givenIclickOnTheLinkOnTheDepartureDeclarationsPage() [0.79] (DepartureDeclarationsStepDefSteps.scala) pattern: (?:I )?click on the (.+) link on the 'Departure declarations' page

      And("I click on the Complete pre lodged declaration link for LRN 25GB000246TK0E6WJ1 on the Departure declarations page")
        // Possible match (best=0.90)
        andIclickOnTheXLinkForLRNXOnTheDepartureDeclarationsPage("", "")
        // --- Other possible matches ---
        // givenIclickOnTheLinkOnTheDepartureDeclarationsPage() [0.79] (DepartureDeclarationsStepDefSteps.scala) pattern: (?:I )?click on the (.+) link on the 'Departure declarations' page

      And("I click the Continue button on the presentation More information needed to complete pre-lodged declaration page")
        // ⚠️ No step-def match found for: I click the Continue button on the presentation More information needed to complete pre-lodged declaration page

      And("I choose radio option No on the presentation Do you want to add a UN LOCODE for the place of loading? page")
        // Possible match (best=0.82)
        andIchooseRadioOptionXOnThePresentationDoYouWantToAddAUNLOCODEForThePlaceOfLoadingPage("")
        // --- Other possible matches ---
        // andIchooseRadioOptionXOnTheDoYouWantToAddAUNLOCODEForThePlaceOfLoadingPage() [0.82] (RouteDetailsPlaceOfLoadingStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a UN LOCODE for the place of loading\?' page
        // andIchooseRadioOptionXOnTheDoYouWantToAddAPlaceOfLoadingPage() [0.81] (RouteDetailsPlaceOfLoadingStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a place of loading\?' page
        // andIchooseRadioOptionXOnTheDoYouWantToAddAUNLOCODEForThePlaceOfUnloadingPage() [0.78] (RouteDetailsPlaceOfUnloadingStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a UN LOCODE for the place of unloading\?' page
        // andIchooseRadioOptionXOnTheDoYouWantToAddAPlaceOfUnloadingPage() [0.77] (RouteDetailsPlaceOfUnloadingStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a place of unloading\?' page
        // andIchooseRadioOptionXOnTheDoYouWantToAddAnAuthorisationPage() [0.76] (TransportAuthorisationsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add an authorisation' page
        // andIchooseRadioOptionXOnTheDoYouWantToAddASealPage() [0.76] (TransportEquipmentChargesStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a seal\?' page
        // andIChooseRadioOptionXOnTheDoYouWantToAddACarrierPage() [0.76] (CarrierDetailsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a carrier\?' page
        // andIchooseRadioOptionXOnTheDoYouWantToAddATimeOfArrivalInXPage() [0.75] (RouteDetailsTransitStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a time of arrival in (.*)\?' page

      And("I select United Kingdom on the presentation In which country is the place of loading? page")
        // Possible match (best=0.80)
        andIselectOnThePresentationInWhichCountryIsThePlaceOfLoadingPage("")
        // --- Other possible matches ---
        // andIselectOnTheInWhichCountryIsThePlaceOfLoadingPage() [0.80] (RouteDetailsPlaceOfLoadingStepDefSteps.scala) pattern: (?:I )?select (.+) on the 'In which country is the place of loading\?' page
        // andIselectOnTheWhichCountryIsThePlaceOfUnloadingInPage() [0.75] (RouteDetailsPlaceOfUnloadingStepDefSteps.scala) pattern: (?:I )?select (.+) on the 'Which country is the place of unloading in\?' page

      And("I enter London on the presentation Where in United Kingdom is the place of loading? page")
        // Possible match (best=0.81)
        andIenterOnThePresentationWhereInXIsThePlaceOfLoadingPage("", "")

      And("I choose radio option No on the presentation Are you using any shipping containers to transport the goods? page")
        // Possible match (best=0.81)
        andIchooseRadioOptionXOnThePresentationAreYouUsingAnyShippingContainersToTransportTheGoodsPage("")
        // --- Other possible matches ---
        // andIchooseRadioOptionXOnTheAreYouUsingAnyShippingContainersToTransportTheGoodsPage() [0.81] (TransportDetailsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Are you using any shipping containers to transport the goods\?' page

      And("I choose radio option No on the presentation Do you want to add any transport equipment? page")
        // Possible match (best=0.81)
        andIchooseRadioOptionXOnThePresentationDoYouWantToAddAnyTransportEquipmentPage("")
        // --- Other possible matches ---
        // andIchooseRadioOptionXOnTheDoYouWantToAddAnyTransportEquipmentPage() [0.81] (TransportEquipmentChargesStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add any transport equipment\?' page
        // andIchooseRadioOptionXOnTheDoYouWantToAddAnAuthorisationPage() [0.76] (TransportAuthorisationsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add an authorisation' page
        // andIchooseRadioOptionXOnTheDoYouWantToAddASealPage() [0.76] (TransportEquipmentChargesStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a seal\?' page
        // andIChooseRadioOptionXOnTheDoYouWantToAddACarrierPage() [0.76] (CarrierDetailsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a carrier\?' page

      Then("I should be on the Presentation Notification Check your answers page")
        // Possible match (best=1.00)
        thenIshouldbeOnThePresentationNotificationCheckYourAnswersPage()

      And("I submit the Check your answers page")
        // Possible match (best=1.00)
        andIsubmitTheCheckYourAnswersPage()

      Then("I should be on the Information sent page")
        // Possible match (best=1.00)
        thenIshouldbeOnTheInformationSentPage()

    }
  }
}
