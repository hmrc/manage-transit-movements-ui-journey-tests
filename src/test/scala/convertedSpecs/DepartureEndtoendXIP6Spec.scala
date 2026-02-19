import org.scalatest.matchers.should.Matchers
import org.scalatest.GivenWhenThen
import org.scalatest.featurespec.AnyFeatureSpec


class DepartureEndtoendXIP6Spec extends AnyFeatureSpec with GivenWhenThen{

  Feature("End to end journey for Prelodged Northern Ireland office of departure") {

    Scenario("01 Security 'ENS' - Guarantee 'B' - Inland Mode 'Rail' - Border Means 'Air' - Container Ind 'No' - CL213 & CL754 Documents") {
      And("I enter 1234567 on the What is the TIR carnet reference? page")
        // Possible match (best=0.79)
        andIenterOnTheWhatIsTheTIRCarnetReferencePage("")
        // --- Other possible matches ---
        // andIenterOnTheWhatIsTheReferencePage() [0.78] (Departure_GuaranteeDetailsStepDefSteps.scala) pattern: (?:I )?enter (.+) on the 'What is the reference\?' page

      And("I choose radio option Exit summary declaration (EXS) on the Which type of safety and security details do you want to add? page")
        // Possible match (best=0.85)
        andIchooseRadioOptionXOnTheWhichTypeOfSafetyAndSecurityDetailsDoYouWantToAddPage("")
        // --- Other possible matches ---
        // andIchooseRadioOptionXOnTheWhichTypeOfAuthorisationDoYouWantToAddPage() [0.81] (TransportAuthorisationsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Which type of authorisation do you want to add' page
        // andIchooseRadioOptionXOnTheWhichTypeOfDeclarationDoYouWantToCreatePage() [0.81] (PreTaskListStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Which type of declaration do you want to create\?' page
        // andIchooseRadioOptionXOnTheDoYouWantToAddTheTypeOfIdentificationPage() [0.81] (BorderMeansOfTransportStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add the type of identification\?' page
        // andIchooseRadioOptionXOnTheDoYouWantToAddAnAuthorisationPage() [0.80] (TransportAuthorisationsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add an authorisation' page
        // andIchooseRadioOptionXOnTheDoYouWantToAddASealPage() [0.80] (TransportEquipmentChargesStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a seal\?' page
        // andIChooseRadioOptionXOnTheDoYouWantToAddACarrierPage() [0.80] (CarrierDetailsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a carrier\?' page
        // andIchooseRadioOptionXOnTheDoYouWantToAddATimeOfArrivalInXPage() [0.79] (RouteDetailsTransitStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a time of arrival in (.*)\?' page
        // andIchooseRadioOptionXOnTheT2DeclarationPage() [0.78] (RouteDetailsTransitStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the t2 declaration page
        // andIchooseRadioOptionXOnTheDepartureMeansXPage() [0.77] (InlandModeOfTransportStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the departure means '(.*)' page
        // andIchooseRadioOptionXOnTheDoYouWantToAddALocationOfGoodsPage() [0.77] (RouteDetailsLocationOfGoodsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a location of goods\?' page
        // andIchooseRadioOptionXOnTheDoYouWantToAddAPlaceOfLoadingPage() [0.77] (RouteDetailsPlaceOfLoadingStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a place of loading\?' page
        // andIchooseRadioOptionXOnTheDoYouWantToAddAPlaceOfUnloadingPage() [0.77] (RouteDetailsPlaceOfUnloadingStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a place of unloading\?' page
        // andIchooseRadioOptionXOnTheRepresentativeDoYouWantToAddYourDetailsPage() [0.76] (TraderDetailsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the representative 'Do you want to add your details\?' page
        // andIchooseRadioOptionXOnTheDoYouWantToAddAnItemForHouseConsignmentXPage() [0.75] (UnloadingStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add an item for house consignment (.*)\?' page
        // andIchooseRadioOptionXOnTheWhichTypeOfLocationIsItPage() [0.75] (RouteDetailsLocationOfGoodsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Which type of location is it\?' page
        // andIchooseRadioOptionXOnTheWhichTypeOfGuaranteeIsItPage() [0.75] (Departure_GuaranteeDetailsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Which type of guarantee is it\?' page

      And("I submit the Check your answers page")
        // Possible match (best=1.00)
        andIsubmitTheCheckYourAnswersPage()

      When("I click the Add trader details link on the Declaration summary page")
        // Possible match (best=0.93)
        thenIclickTheLinkOnTheDeclarationSummaryPage("")
        // --- Other possible matches ---
        // thenIclickOnTheLinkOnTheDeclarationSummaryPage() [0.79] (TaskListStepDefSteps.scala) pattern: (?:I )?click on the (.+) link on the 'Declaration summary' page

      And("I choose radio option Yes on the Do you know the transit holder’s EORI number? page")
        // Possible match (best=0.81)
        andIchooseRadioOptionXOnTheDoYouKnowTheTransitHoldersEORINumberPage("")

      And("I enter GB123456123456 on the What is the transit holder’s EORI number? page")
        // Possible match (best=0.80)
        andIenterOnTheWhatIsTheTransitHoldersEORINumberPage("")

      And("I choose radio option No on the Do you want to add a contact for the transit holder? page")
        // Possible match (best=0.81)
        andIchooseRadioOptionXOnTheDoYouWantToAddAContactForTheTransitHolderPage("")
        // --- Other possible matches ---
        // andIchooseRadioOptionXOnTheDoYouWantToAddAContactForTheConsignorPage() [0.77] (TraderDetailsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a contact for the consignor\?' page
        // andIchooseRadioOptionXOnThEDoYouWantToAddAContactForTheCarrierPage() [0.77] (CarrierDetailsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a contact for the carrier\?' page
        // andIchooseRadioOptionXOnTheDoYouWantToAddAnAuthorisationPage() [0.76] (TransportAuthorisationsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add an authorisation' page
        // andIchooseRadioOptionXOnTheDoYouWantToAddASealPage() [0.76] (TransportEquipmentChargesStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a seal\?' page
        // andIChooseRadioOptionXOnTheDoYouWantToAddACarrierPage() [0.76] (CarrierDetailsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a carrier\?' page

      And("I enter ABC/123/12345 on the What is the TIR holder’s identification number? page")
        // Possible match (best=0.80)
        andIenterOnTheWhatIsTheTIRHoldersIdentificationNumberPage("")

      And("I choose radio option No on the Are you acting as a representative? page")
        // Possible match (best=0.80)
        andIchooseRadioOptionXOnTheAreYouActingAsARepresentativePage("")
        // --- Other possible matches ---
        // andIchooseRadioOptionXOnThePresentationAreYouActingAsARepresentativePage() [0.76] (PresentationNotificationStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the presentation 'Are you acting as a representative\?' page

      And("I choose radio option Yes on the Do you know the consignor’s EORI number or TIN? page")
        // Possible match (best=0.81)
        andIchooseRadioOptionXOnTheDoYouKnowTheConsignorsEORINumberOrTINPage("")
        // --- Other possible matches ---
        // andIchooseRadioOptionXOnTheDoYouKnowTheConsigneesEORINumberOrTINPage() [0.77] (TraderDetailsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you know the consignee’s EORI number or TIN\?' page

      And("I enter IT12312313 on the What is the consignor’s EORI number or TIN? page")
        // Possible match (best=0.80)
        andIenterOnTheWhatIsTheConsignorsEORINumberOrTINPage("")
        // --- Other possible matches ---
        // andIenterOnTheWhatIsTheConsigneesEORINumberOrTINPage() [0.76] (TraderDetailsStepDefSteps.scala) pattern: (?:I )?enter (.+) on the 'What is the consignee’s EORI number or TIN\?' page

      And("I choose radio option No on the Do you want to add a contact for the consignor? page")
        // Possible match (best=0.81)
        andIchooseRadioOptionXOnTheDoYouWantToAddAContactForTheConsignorPage("")
        // --- Other possible matches ---
        // andIchooseRadioOptionXOnThEDoYouWantToAddAContactForTheCarrierPage() [0.77] (CarrierDetailsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a contact for the carrier\?' page
        // andIchooseRadioOptionXOnTheDoYouWantToAddAnAuthorisationPage() [0.76] (TransportAuthorisationsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add an authorisation' page
        // andIchooseRadioOptionXOnTheDoYouWantToAddASealPage() [0.76] (TransportEquipmentChargesStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a seal\?' page
        // andIChooseRadioOptionXOnTheDoYouWantToAddACarrierPage() [0.76] (CarrierDetailsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a carrier\?' page

      And("I choose radio option Yes on the Do you know the consignee’s EORI number or TIN? page")
        // Possible match (best=0.81)
        andIchooseRadioOptionXOnTheDoYouKnowTheConsigneesEORINumberOrTINPage("")
        // --- Other possible matches ---
        // andIchooseRadioOptionXOnTheDoYouKnowTheConsignorsEORINumberOrTINPage() [0.77] (TraderDetailsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you know the consignor’s EORI number or TIN\?' page

      And("I enter GE00101001 on the What is the consignee’s EORI number or TIN? page")
        // Possible match (best=0.80)
        andIenterOnTheWhatIsTheConsigneesEORINumberOrTINPage("")
        // --- Other possible matches ---
        // andIenterOnTheConsigneeEoriTinPage() [0.77] (IdentificationStepDefSteps.scala) pattern: (?:I )?enter (.+) on the consignee eori tin page
        // andIenterOnTheWhatIsTheConsignorsEORINumberOrTINPage() [0.76] (TraderDetailsStepDefSteps.scala) pattern: (?:I )?enter (.+) on the 'What is the consignor’s EORI number or TIN\?' page

      And("I submit on the Check your answers section Trader details page")
        // Possible match (best=1.00)
        andIsubmitOnTheCheckYourAnswersSectionXPage("Trader details")

      Then("I should be on the Declaration summary page")
        // Possible match (best=1.00)
        thenIshouldbeOnTheDeclarationSummaryPage()

      And("I should see Completed status for trader details on the Declaration summary page")
        // Possible match (best=0.88)
        andIshouldSeeXStatusForOnTheDeclarationSummaryPage("", "")

      When("I click the Add route details link on the Declaration summary page")
        // Possible match (best=0.93)
        thenIclickTheLinkOnTheDeclarationSummaryPage("")
        // --- Other possible matches ---
        // thenIclickOnTheLinkOnTheDeclarationSummaryPage() [0.79] (TaskListStepDefSteps.scala) pattern: (?:I )?click on the (.+) link on the 'Declaration summary' page

      And("I choose radio option No on the Do you want to add a specific circumstance indicator? page")
        // Possible match (best=0.81)
        andIchooseRadioOptionXOnTheDoYouWantToAddASpecificCircumstanceIndicatorPage("")
        // --- Other possible matches ---
        // andIchooseRadioOptionXOnTheWhichSpecificCircumstanceIndicatorDoYouWantToAddPage() [0.77] (RouteDetailsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Which specific circumstance indicator do you want to add\?' page
        // andIchooseRadioOptionXOnTheDoYouWantToAddAnAuthorisationPage() [0.76] (TransportAuthorisationsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add an authorisation' page
        // andIchooseRadioOptionXOnTheDoYouWantToAddASealPage() [0.76] (TransportEquipmentChargesStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a seal\?' page
        // andIChooseRadioOptionXOnTheDoYouWantToAddACarrierPage() [0.76] (CarrierDetailsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a carrier\?' page

      And("I select Italy on the What country is the office of destination in? page")
        // Possible match (best=0.80)
        andIselectOnTheWhatCountryIsTheOfficeOfDestinationInPage("")
        // --- Other possible matches ---
        // andIselectOnTheWhatIsTheItemsCountryOfDestinationPage() [0.75] (ItemDetailsStepDefSteps.scala) pattern: (?:I )?select (.+) on the 'What is the item’s country of destination\?' page

      And("I select IT on the Where in Italy is the office of destination? page")
        // Possible match (best=0.80)
        andIselectOnTheWhereInIsTheOfficeOfDestinationPage("", "")

      And("I choose radio option No on the Are you using a binding itinerary? page")
        // Possible match (best=0.80)
        andIchooseRadioOptionXOnTheAreYouUsingABindingItineraryPage("")

      And("I select Andorra on the Which country do you want to add to the transit route? page")
        // Possible match (best=0.81)
        andIselectOnTheWhichCountryDoYouWantToAddToTheTransitRoutePage("")
        // --- Other possible matches ---
        // andIselectOnTheUnloadingWhichCountryDoYouWantToAddToTheTransitRoutePage() [0.77] (UnloadingStepDefSteps.scala) pattern: (?:I )?select (.+) on the Unloading 'Which country do you want to add to the transit route\?' page

      When("I choose radio option Yes on the You have added 1 country to the transit route page")
        // Possible match (best=0.79)
        andIchooseRadioOptionXOnTheTransitRouteAddCountryPage("")
        // --- Other possible matches ---
        // andIchooseRadioOptionXOnTheYouHaveAddedXCountriestoTheTransitRoutePage() [0.79] (RouteDetailsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'You have added (.*) countr(?:y |ies )to the transit route' page

      And("I select Argentina on the Which country do you want to add to the transit route? page")
        // Possible match (best=0.81)
        andIselectOnTheWhichCountryDoYouWantToAddToTheTransitRoutePage("")
        // --- Other possible matches ---
        // andIselectOnTheUnloadingWhichCountryDoYouWantToAddToTheTransitRoutePage() [0.77] (UnloadingStepDefSteps.scala) pattern: (?:I )?select (.+) on the Unloading 'Which country do you want to add to the transit route\?' page

      When("I choose radio option No on the You have added 2 countries to the transit route page")
        // Possible match (best=0.83)
        andIchooseRadioOptionXOnTheYouHaveAddedXCountriestoTheTransitRoutePage("", "")

      And("I submit on the Check your answers section Transit route page")
        // Possible match (best=1.00)
        andIsubmitOnTheCheckYourAnswersSectionXPage("Transit route")

      And("I choose radio option Yes on the Do you want to add a location of goods? page")
        // Possible match (best=0.81)
        andIchooseRadioOptionXOnTheDoYouWantToAddALocationOfGoodsPage("")
        // --- Other possible matches ---
        // andIchooseRadioOptionXOnTheDoYouWantToAddAnAuthorisationPage() [0.76] (TransportAuthorisationsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add an authorisation' page
        // andIchooseRadioOptionXOnTheDoYouWantToAddASealPage() [0.76] (TransportEquipmentChargesStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a seal\?' page
        // andIChooseRadioOptionXOnTheDoYouWantToAddACarrierPage() [0.76] (CarrierDetailsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a carrier\?' page

      And("I choose radio option Designated location on the Which type of location is it? page")
        // Possible match (best=0.80)
        andIchooseRadioOptionXOnTheWhichTypeOfLocationIsItPage("")
        // --- Other possible matches ---
        // andIchooseRadioOptionXOnTheWhichTypeOfGuaranteeIsItPage() [0.75] (Departure_GuaranteeDetailsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Which type of guarantee is it\?' page

      And("I choose radio option Customs office identifier on the How do you want to identify the location of goods? page")
        // Possible match (best=0.81)
        andIchooseRadioOptionXOnTheHowDoYouWantToIdentifyTheLocationOfGoodsPage("")
        // --- Other possible matches ---
        // andIchooseRadioOptionXOnTheDoYouWantToAddALocationOfGoodsPage() [0.77] (RouteDetailsLocationOfGoodsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a location of goods\?' page

      And("I select XI on the departure location of goods customs office identification page")
        // Possible match (best=1.00)
        andIselectOnTheDepartureLocationOfGoodsCustomsOfficeIdentificationPage("XI")
        // --- Other possible matches ---
        // andIselectOnTheArrivalLocationOfGoodsCustomsOfficeIdentificationPage() [0.80] (LocationOfGoodsStepDefSteps.scala) pattern: (?:I )?select (.+) on the arrival location of goods customs office identification page
        // andIselectOnTheLocationOfGoodsCountryPage() [0.78] (RouteDetailsLocationOfGoodsStepDefSteps.scala) pattern: (?:I )?select (.+) on the location of goods country page

      And("I submit on the Check your answers section Location of goods page")
        // Possible match (best=1.00)
        andIsubmitOnTheCheckYourAnswersSectionXPage("Location of goods")

      And("I choose radio option No on the Do you want to add a place of loading? page")
        // Possible match (best=0.81)
        andIchooseRadioOptionXOnTheDoYouWantToAddAPlaceOfLoadingPage("")
        // --- Other possible matches ---
        // andIchooseRadioOptionXOnTheDoYouWantToAddAPlaceOfUnloadingPage() [0.77] (RouteDetailsPlaceOfUnloadingStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a place of unloading\?' page
        // andIchooseRadioOptionXOnTheDoYouWantToAddAnAuthorisationPage() [0.76] (TransportAuthorisationsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add an authorisation' page
        // andIchooseRadioOptionXOnTheDoYouWantToAddASealPage() [0.76] (TransportEquipmentChargesStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a seal\?' page
        // andIChooseRadioOptionXOnTheDoYouWantToAddACarrierPage() [0.76] (CarrierDetailsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a carrier\?' page
        // andIchooseRadioOptionXOnTheDoYouWantToAddATimeOfArrivalInXPage() [0.75] (RouteDetailsTransitStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a time of arrival in (.*)\?' page

      And("I choose radio option No on the Do you want to add a place of unloading? page")
        // Possible match (best=0.81)
        andIchooseRadioOptionXOnTheDoYouWantToAddAPlaceOfLoadingPage("")
        // --- Other possible matches ---
        // andIchooseRadioOptionXOnTheDoYouWantToAddAPlaceOfUnloadingPage() [0.81] (RouteDetailsPlaceOfUnloadingStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a place of unloading\?' page
        // andIchooseRadioOptionXOnTheDoYouWantToAddAnAuthorisationPage() [0.76] (TransportAuthorisationsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add an authorisation' page
        // andIchooseRadioOptionXOnTheDoYouWantToAddASealPage() [0.76] (TransportEquipmentChargesStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a seal\?' page
        // andIChooseRadioOptionXOnTheDoYouWantToAddACarrierPage() [0.76] (CarrierDetailsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a carrier\?' page
        // andIchooseRadioOptionXOnTheDoYouWantToAddATimeOfArrivalInXPage() [0.75] (RouteDetailsTransitStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a time of arrival in (.*)\?' page
        // andIchooseRadioOptionXOnTheDoYouWantToAddAUNLOCODEForThePlaceOfLoadingPage() [0.75] (RouteDetailsPlaceOfLoadingStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a UN LOCODE for the place of loading\?' page
        // andIchooseRadioOptionXOnTheDoYouWantToAddAUNLOCODEForThePlaceOfUnloadingPage() [0.75] (RouteDetailsPlaceOfUnloadingStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a UN LOCODE for the place of unloading\?' page

      And("I submit on the Check your answers section Places of loading and unloading page")
        // Possible match (best=1.00)
        andIsubmitOnTheCheckYourAnswersSectionXPage("Places of loading and unloading")

      And("I submit on the Check your answers section Route details page")
        // Possible match (best=1.00)
        andIsubmitOnTheCheckYourAnswersSectionXPage("Route details")

      Then("I should be on the Declaration summary page")
        // Possible match (best=1.00)
        thenIshouldbeOnTheDeclarationSummaryPage()

      And("I click the Add guarantee details link on the Declaration summary page")
        // Possible match (best=0.93)
        thenIclickTheLinkOnTheDeclarationSummaryPage("")
        // --- Other possible matches ---
        // thenIclickOnTheLinkOnTheDeclarationSummaryPage() [0.79] (TaskListStepDefSteps.scala) pattern: (?:I )?click on the (.+) link on the 'Declaration summary' page

      Then("I click the Continue button on the Guarantee added for TIR declaration page")
        // Possible match (best=1.00)
        andIclickTheContinueButtonOnTheGuaranteeAddedForTIRDeclarationPage()

      And("I should be on the Declaration summary page")
        // Possible match (best=1.00)
        thenIshouldbeOnTheDeclarationSummaryPage()

      When("I click the Add transport details link on the Declaration summary page")
        // Possible match (best=0.93)
        thenIclickTheLinkOnTheDeclarationSummaryPage("")
        // --- Other possible matches ---
        // thenIclickOnTheLinkOnTheDeclarationSummaryPage() [0.79] (TaskListStepDefSteps.scala) pattern: (?:I )?click on the (.+) link on the 'Declaration summary' page

      And("I choose radio option Yes on the Do you want to use the same UCR for all items? page")
        // Possible match (best=0.81)
        andIchooseRadioOptionXOnTheDoYouWantToUseTheSameUCRForAllItemsPage("")

      And("I enter UCR23456 on the What is the UCR? page")
        // Possible match (best=0.78)
        andIenterOnTheWhatIsTheUCRPage("")

      And("I choose radio option Yes on the Are all the items being dispatched from the same country? page")
        // Possible match (best=0.81)
        andIchooseRadioOptionXOnTheAreAllTheItemsBeingDispatchedFromTheSameCountryPage("")

      And("I select United Kingdom on the What is the country of dispatch? page")
        // Possible match (best=0.79)
        andIselectOnTheWhatIsTheCountryOfDispatchPage("")
        // --- Other possible matches ---
        // andIselectOnTheWhatIsTheItemsCountryOfDispatchPage() [0.75] (ItemDetailsStepDefSteps.scala) pattern: (?:I )?select (.+) on the 'What is the item’s country of dispatch\?' page

      And("I choose radio option Yes on the Are the goods being transported to another country after the end of this transit movement? page")
        // Possible match (best=0.82)
        andIchooseRadioOptionXOnTheAreTheGoodsBeingTransportedToAnotherCountryAfterTheEndOfThisTransitMovementPage("")

      And("I choose radio option No on the Are all the items being transported to the same country? page")
        // Possible match (best=0.81)
        andIchooseRadioOptionXOnTheAreAllTheItemsBeingTransportedToTheSameCountryPage("")

      And("I choose radio option Not sure on the Are you using any shipping containers to transport the goods? page")
        // Possible match (best=0.81)
        andIchooseRadioOptionXOnTheAreYouUsingAnyShippingContainersToTransportTheGoodsPage("")
        // --- Other possible matches ---
        // andIchooseRadioOptionXOnThePresentationAreYouUsingAnyShippingContainersToTransportTheGoodsPage() [0.78] (PresentationNotificationStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the presentation 'Are you using any shipping containers to transport the goods\?' page

      And("I choose radio option Yes on the Do you want to add an inland mode of transport? page")
        // Possible match (best=0.81)
        andIchooseRadioOptionXOnTheDoYouWantToAddAnInlandModeOfTransportPage("")
        // --- Other possible matches ---
        // andIchooseRadioOptionXOnDoYouWantToAddABorderModeOfTransportPage() [0.77] (InlandModeOfTransportStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on 'Do you want to add a border mode of transport\?' page
        // andIchooseRadioOptionXOnTheDoYouWantToAddAnAuthorisationPage() [0.76] (TransportAuthorisationsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add an authorisation' page
        // andIchooseRadioOptionXOnTheDoYouWantToAddASealPage() [0.76] (TransportEquipmentChargesStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a seal\?' page
        // andIChooseRadioOptionXOnTheDoYouWantToAddACarrierPage() [0.76] (CarrierDetailsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a carrier\?' page
        // andIchooseRadioOptionXOnTheDoYouWantToAddATimeOfArrivalInXPage() [0.75] (RouteDetailsTransitStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a time of arrival in (.*)\?' page

      And("I choose radio option Rail on the Which inland mode of transport are you using? page")
        // Possible match (best=0.81)
        andIchooseRadioOptionXOnTheWhichInlandModeOfTransportAreYouUsingPage("")

      And("I choose radio option Train number on the inland mode Which identification do you want to use for this vehicle? page")
        // Possible match (best=0.82)
        andIchooseRadioOptionXOnTheInlandModeWhichIdentificationDoYouWantToUseForThisVehiclePage("")
        // --- Other possible matches ---
        // andIchooseRadioOptionXOnTheBorderModeWhichIdentificationDoYouWantToUseForThisVehiclePage() [0.78] (BorderMeansOfTransportStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the border mode 'Which identification do you want to use for this vehicle\?' page
        // andIchooseRadioXOnThePresentationInlandModeWhichIdentificationDoYouWantToUseForThisVehiclePage() [0.78] (PresentationNotificationStepDefSteps.scala) pattern: (?:I )?choose radio (.*) on the presentation inland mode 'Which identification do you want to use for this vehicle\?' page
        // andIchooseRadioOptionXOnTheDoYouWantToAddAnIdentificationNumberForThisVehiclePage() [0.78] (BorderMeansOfTransportStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add an identification number for this vehicle\?' page

      And("I enter registration number 1234567 on the What is the identification number for this? page")
        // Possible match (best=0.80)
        andIenterRegistrationNumberOnTheWhatIsTheIdentificationNumberForThisPage("")

      And("I select United Kingdom on the inland mode What country is this vehicle registered to? page")
        // Possible match (best=0.80)
        andIselectOnTheInlandModeWhatCountryIsThisVehicleRegisteredToPage("")
        // --- Other possible matches ---
        // andIselectOnTheWhatCountryIsThisVehicleRegisteredToPage() [0.80] (UnloadingStepDefSteps.scala) pattern: (?:I )?select (.+) on the 'What country is this vehicle registered to\?' page
        // andIselectOnTheBorderModeWhatCountryIsThisVehicleRegisteredToPage() [0.76] (BorderMeansOfTransportStepDefSteps.scala) pattern: (?:I )?select (.+) on the border mode 'What country is this vehicle registered to\?' page

      And("I submit on the Check your answers section Departure means of transport page")
        // Possible match (best=1.00)
        andIsubmitOnTheCheckYourAnswersSectionXPage("Departure means of transport")

      And("I select radio option No on the You have added 1 departure means of transport page")
        // Possible match (best=0.91)
        andIselectRadioOptionXOnTheYouHaveAddedDepartureMeansOfTransportPage("", "")
        // --- Other possible matches ---
        // andIchooseRadioOptionXOnTheYouHaveAddedXDepartureMeansOfTransportPage() [0.77] (UnloadingStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'You have added (.*) departure means of transport' page

      And("I choose radio option Air on the How is the transit crossing the border? page")
        // Possible match (best=0.80)
        andIchooseRadioOptionXOnTheHowIsTheTransitCrossingTheBorderPage("")
        // --- Other possible matches ---
        // andIchooseRadioXOnThePresentationHowIsTheTransitCrossingTheBorderPage() [0.76] (PresentationNotificationStepDefSteps.scala) pattern: (?:I )?choose radio (.*) on the presentation 'How is the transit crossing the border\?' page

      And("I choose radio option registration number of the aircraft on the border mode Which identification do you want to use for this vehicle? page")
        // Possible match (best=0.82)
        andIchooseRadioOptionXOnTheBorderModeWhichIdentificationDoYouWantToUseForThisVehiclePage("")
        // --- Other possible matches ---
        // andIchooseRadioOptionXOnTheInlandModeWhichIdentificationDoYouWantToUseForThisVehiclePage() [0.78] (InlandModeOfTransportStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the inland mode 'Which identification do you want to use for this vehicle\?' page
        // andIchooseRadioOptionXOnTheDoYouWantToAddAnIdentificationNumberForThisVehiclePage() [0.78] (BorderMeansOfTransportStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add an identification number for this vehicle\?' page

      And("I enter identification GB1234567 on the What is the identification number for this? page")
        // Possible match (best=0.80)
        andIenterIdentificationOnTheWhatIsTheIdentificationNumberForThisPage("")

      And("I select United Kingdom on the border mode What country is this vehicle registered to? page")
        // Possible match (best=0.80)
        andIselectOnTheBorderModeWhatCountryIsThisVehicleRegisteredToPage("")
        // --- Other possible matches ---
        // andIselectOnTheWhatCountryIsThisVehicleRegisteredToPage() [0.80] (UnloadingStepDefSteps.scala) pattern: (?:I )?select (.+) on the 'What country is this vehicle registered to\?' page
        // andIselectOnTheActiveBorderModeWhatCountryIsThisVehicleRegisteredToPage() [0.76] (PresentationNotificationStepDefSteps.scala) pattern: (?:I )?select (.+) on the active border mode 'What country is this vehicle registered to\?' page
        // andIselectOnTheInlandModeWhatCountryIsThisVehicleRegisteredToPage() [0.76] (InlandModeOfTransportStepDefSteps.scala) pattern: (?:I )?select (.+) on the inland mode 'What country is this vehicle registered to\?' page

      And("I select Abruzzo on the Where is the customs office at the border? page")
        // Possible match (best=0.80)
        andIselectOnTheWhereIsTheCustomsOfficeAtTheBorderPage("")
        // --- Other possible matches ---
        // andIselectOnWhereIsTheCustomsOfficeAtTheBorderPage() [0.80] (PresentationNotificationStepDefSteps.scala) pattern: (?:I )?select (.+) on 'Where is the customs office at the border\?' page

      And("I enter conveyance number GB123456123456 on the What is the conveyance reference number? page")
        // Possible match (best=0.80)
        andIenterConveyanceNumberOnTheWhatIsTheConveyanceReferenceNumberPage("")
        // --- Other possible matches ---
        // andIenterOnTheWhatIsTheReferencePage() [0.78] (Departure_GuaranteeDetailsStepDefSteps.scala) pattern: (?:I )?enter (.+) on the 'What is the reference\?' page

      And("I submit on the Check your answers section Modes and means of transport page")
        // Possible match (best=1.00)
        andIsubmitOnTheCheckYourAnswersSectionXPage("Modes and means of transport")

      When("I choose radio option No on the Do you want to add a supply chain actor for all items? page")
        // Possible match (best=0.82)
        andIchooseRadioOptionXOnTheDoYouWantToAddASupplyChainActorForAllItemsPage("")
        // --- Other possible matches ---
        // andIchooseRadioOptionXOnTheDoYouWantToAddADocumentForTheItemPage() [0.77] (UnloadingStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a document for the item\?' page
        // andIchooseRadioOptionXOnTheDoYouWantToAddAPackageForTheItemPage() [0.77] (UnloadingStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a package for the item\?' page
        // andIchooseRadioOptionXOnTheDoYouWantToAddAnAuthorisationPage() [0.76] (TransportAuthorisationsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add an authorisation' page
        // andIchooseRadioOptionXOnTheDoYouWantToAddASealPage() [0.76] (TransportEquipmentChargesStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a seal\?' page
        // andIChooseRadioOptionXOnTheDoYouWantToAddACarrierPage() [0.76] (CarrierDetailsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a carrier\?' page
        // andIchooseRadioOptionXOnTheDoYouWantToAddAnItemForHouseConsignmentXPage() [0.75] (UnloadingStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add an item for house consignment (.*)\?' page

      When("I choose radio option No on the Do you want to add a carrier? page")
        // Possible match (best=0.80)
        andIChooseRadioOptionXOnTheDoYouWantToAddACarrierPage("")
        // --- Other possible matches ---
        // andIchooseRadioOptionXOnTheDoYouWantToAddAnAuthorisationPage() [0.76] (TransportAuthorisationsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add an authorisation' page
        // andIchooseRadioOptionXOnTheDoYouWantToAddASealPage() [0.76] (TransportEquipmentChargesStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a seal\?' page

      And("I choose radio option No on the Do you want to add a method of payment for transport charges? page")
        // Possible match (best=0.82)
        andIchooseRadioOptionXOnTheDoYouWantToAddAMethodOfPaymentForTransportChargesPage("")
        // --- Other possible matches ---
        // andIchooseRadioOptionXOnTheDoYouWantToAddAnAuthorisationPage() [0.76] (TransportAuthorisationsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add an authorisation' page
        // andIchooseRadioOptionXOnTheDoYouWantToAddASealPage() [0.76] (TransportEquipmentChargesStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a seal\?' page
        // andIChooseRadioOptionXOnTheDoYouWantToAddACarrierPage() [0.76] (CarrierDetailsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a carrier\?' page

      And("I click radio option No on the Do you want to add an additional reference for all items? page")
        // Possible match (best=0.81)
        andIclickRadioOptionXOnTheDoYouWantToAddAnAdditionalReferenceForAllItemsPage("")
        // --- Other possible matches ---
        // andIclickRadioOptionXOnTheDoYouWantToAddAnAdditionalReferenceForThisItemPage() [0.78] (ItemDetailsStepDefSteps.scala) pattern: (?:I )?click radio option (.*) on the 'Do you want to add an additional reference for this item\?' page
        // andIclickRadioOptionXOnTheDoYouWantToAddAnAdditionalReferenceNumberPage() [0.77] (ItemDetailsStepDefSteps.scala) pattern: (?:I )?click radio option (.*) on the 'Do you want to add an additional reference number\?' page

      And("I click radio option No on the Do you want to add any additional information for all items? page")
        // Possible match (best=0.81)
        andIclickRadioOptionXOnTheDoYouWantToAddAnyAdditionalInformationForAllItemsPage("")
        // --- Other possible matches ---
        // andIclickRadioOptionXOnTheDoYouWantToAddAnyAdditionalInformationForThisItemPage() [0.78] (ItemDetailsStepDefSteps.scala) pattern: (?:I )?click radio option (.*) on the 'Do you want to add any additional information for this item\?' page
        // andIclickRadioOptionXOnTheDoYouWantToAddAnAdditionalReferenceForAllItemsPage() [0.78] (ItemDetailsStepDefSteps.scala) pattern: (?:I )?click radio option (.*) on the 'Do you want to add an additional reference for all items\?' page
        // andIclickRadioOptionXOnTheDoYouWantToAddAnyCommentsForTheAdditionalInformationPage() [0.78] (ItemDetailsStepDefSteps.scala) pattern: (?:I )?click radio option (.*) on the 'Do you want to add any comments for the additional information\?' page
        // andIclickRadioOptionXOnTheDoYouWantToAddAnyDocumentsPage() [0.76] (ItemDetailsStepDefSteps.scala) pattern: (?:I )?click radio option (.*) on the 'Do you want to add any documents\?' page

      And("click the Change link for Do you want to use the same Unique Consignment Reference? on the Transport details Check your answers page")
        // ⚠️ No step-def match found for: click the Change link for Do you want to use the same Unique Consignment Reference? on the Transport details Check your answers page

      And("I choose radio option No on the Do you want to use the same UCR for all items? page")
        // Possible match (best=0.81)
        andIchooseRadioOptionXOnTheDoYouWantToUseTheSameUCRForAllItemsPage("")

      And("click the Change link for Are all the items being dispatched from the same country? on the Transport details Check your answers page")
        // ⚠️ No step-def match found for: click the Change link for Are all the items being dispatched from the same country? on the Transport details Check your answers page

      And("I choose radio option No on the Are all the items being dispatched from the same country? page")
        // Possible match (best=0.81)
        andIchooseRadioOptionXOnTheAreAllTheItemsBeingDispatchedFromTheSameCountryPage("")

      And("click the Change link for Are all the items being transported to the same country? on the Transport details Check your answers page")
        // ⚠️ No step-def match found for: click the Change link for Are all the items being transported to the same country? on the Transport details Check your answers page

      And("I choose radio option No on the Are all the items being transported to the same country? page")
        // Possible match (best=0.81)
        andIchooseRadioOptionXOnTheAreAllTheItemsBeingTransportedToTheSameCountryPage("")

      And("I submit on the Check your answers section Transport details page")
        // Possible match (best=1.00)
        andIsubmitOnTheCheckYourAnswersSectionXPage("Transport details")

      Then("I should be on the Declaration summary page")
        // Possible match (best=1.00)
        thenIshouldbeOnTheDeclarationSummaryPage()

      When("I click the Add documents link on the Declaration summary page")
        // Possible match (best=0.93)
        thenIclickTheLinkOnTheDeclarationSummaryPage("")
        // --- Other possible matches ---
        // thenIclickOnTheLinkOnTheDeclarationSummaryPage() [0.79] (TaskListStepDefSteps.scala) pattern: (?:I )?click on the (.+) link on the 'Declaration summary' page

      And("I click radio option Yes on the Do you want to add any documents? page")
        // Possible match (best=0.80)
        andIclickRadioOptionXOnTheDoYouWantToAddAnyDocumentsPage("")

      And("I click radio option No on the Do you want to use this document for all items? page")
        // Possible match (best=0.81)
        andIclickRadioOptionXOnTheDoYouWantToUseThisDocumentForAllItemsPage("")

      Then("I select Supporting - (C673) Catch certificate on the What type of document do you want to add? page")
        // Possible match (best=0.80)
        andIselectOnTheWhatTypeOfDocumentDoYouWantToAddPage("")
        // --- Other possible matches ---
        // andIselectOnTheWhatPreviousDocumentDoYouWantToAddPage() [0.75] (DocumentsStepDefSteps.scala) pattern: (?:I )?select (.+) on the 'What previous document do you want to add\?' page

      And("I enter RefNoCL213Doc1 on the What is the document’s reference number? page")
        // Possible match (best=0.80)
        andIenterOnTheWhatIsTheDocumentsReferenceNumberPage("")
        // --- Other possible matches ---
        // andIenterOnTheWhatIsTheReferencePage() [0.78] (Departure_GuaranteeDetailsStepDefSteps.scala) pattern: (?:I )?enter (.+) on the 'What is the reference\?' page

      And("I click radio option No on the Do you want to add a line item number? page")
        // Possible match (best=0.81)
        andIclickRadioOptionXOnTheDoYouWantToAddALineItemNumberPage("")
        // --- Other possible matches ---
        // andIclickRadioOptionXOnTheDoYouWantToAddAGoodsItemNumberPage() [0.77] (PreviousStepDefSteps.scala) pattern: (?:I )?click radio option (.*) on the 'Do you want to add a goods item number\?' page

      And("I click radio option No on the Do you want to add any additional information for this document? page")
        // Possible match (best=0.81)
        andIclickRadioOptionXOnTheDoYouWantToAddAnyAdditionalInformationForThisDocumentPage("")
        // --- Other possible matches ---
        // andIclickRadioOptionXOnTheDoYouWantToAddAnyAdditionalInformationForThisItemPage() [0.78] (ItemDetailsStepDefSteps.scala) pattern: (?:I )?click radio option (.*) on the 'Do you want to add any additional information for this item\?' page
        // andIclickRadioOptionXOnTheDoYouWantToAddAnyCommentsForTheAdditionalInformationPage() [0.78] (ItemDetailsStepDefSteps.scala) pattern: (?:I )?click radio option (.*) on the 'Do you want to add any comments for the additional information\?' page
        // andIclickRadioOptionXOnTheDoYouWantToAddAnyDocumentsPage() [0.76] (ItemDetailsStepDefSteps.scala) pattern: (?:I )?click radio option (.*) on the 'Do you want to add any documents\?' page

      And("I submit on the Check your answers section Documents page")
        // Possible match (best=1.00)
        andIsubmitOnTheCheckYourAnswersSectionXPage("Documents")

      And("I choose radio option Yes on the You have added 1 document page")
        // ⚠️ No step-def match found for: I choose radio option Yes on the You have added 1 document page

      And("I click radio option Yes on the Do you want to use this document for all items? page")
        // Possible match (best=0.81)
        andIclickRadioOptionXOnTheDoYouWantToUseThisDocumentForAllItemsPage("")

      And("I select Transport - (N741) Master airwaybill on the What type of document do you want to add? page")
        // Possible match (best=0.80)
        andIselectOnTheWhatTypeOfDocumentDoYouWantToAddPage("")
        // --- Other possible matches ---
        // andIselectOnTheWhatPreviousDocumentDoYouWantToAddPage() [0.75] (DocumentsStepDefSteps.scala) pattern: (?:I )?select (.+) on the 'What previous document do you want to add\?' page

      And("I enter air1234 on the What is the document’s reference number? page")
        // Possible match (best=0.80)
        andIenterOnTheWhatIsTheDocumentsReferenceNumberPage("")
        // --- Other possible matches ---
        // andIenterOnTheWhatIsTheReferencePage() [0.78] (Departure_GuaranteeDetailsStepDefSteps.scala) pattern: (?:I )?enter (.+) on the 'What is the reference\?' page

      And("I submit on the Check your answers section Documents page")
        // Possible match (best=1.00)
        andIsubmitOnTheCheckYourAnswersSectionXPage("Documents")

      And("I choose radio option Yes on the You have added 2 documents page")
        // Possible match (best=0.89)
        andIchooseRadioOptionXOnTheYouHaveAddedXDocumentsPage("", "")

      And("I click radio option No on the Do you want to use this document for all items? page")
        // Possible match (best=0.81)
        andIclickRadioOptionXOnTheDoYouWantToUseThisDocumentForAllItemsPage("")

      And("I select Previous - (C605) Information sheet INF3 on the What type of document do you want to add? page")
        // Possible match (best=0.80)
        andIselectOnTheWhatTypeOfDocumentDoYouWantToAddPage("")
        // --- Other possible matches ---
        // andIselectOnTheWhatPreviousDocumentDoYouWantToAddPage() [0.80] (DocumentsStepDefSteps.scala) pattern: (?:I )?select (.+) on the 'What previous document do you want to add\?' page
        // andIselectOnTheWhatTypeOfAdditionalInformationDoYouWantToAddPage() [0.76] (ItemDetailsStepDefSteps.scala) pattern: (?:I )?select (.+) on the 'What type of additional information do you want to add\?' page
        // andIselectOnTheWhatTypeOfDocumentDoYouWantToAddForHouseConsignmentXPage() [0.75] (UnloadingStepDefSteps.scala) pattern: (?:I )?select (.+) on the 'What type of document do you want to add for house consignment (.*)\?' page

      And("I enter 1234 on the What is the document’s reference number? page")
        // Possible match (best=0.80)
        andIenterOnTheWhatIsTheDocumentsReferenceNumberPage("")
        // --- Other possible matches ---
        // andIenterOnTheWhatIsTheReferencePage() [0.78] (Departure_GuaranteeDetailsStepDefSteps.scala) pattern: (?:I )?enter (.+) on the 'What is the reference\?' page

      And("I click radio option No on the Do you want to add any additional information for this document? page")
        // Possible match (best=0.81)
        andIclickRadioOptionXOnTheDoYouWantToAddAnyAdditionalInformationForThisDocumentPage("")
        // --- Other possible matches ---
        // andIclickRadioOptionXOnTheDoYouWantToAddAnyAdditionalInformationForThisItemPage() [0.78] (ItemDetailsStepDefSteps.scala) pattern: (?:I )?click radio option (.*) on the 'Do you want to add any additional information for this item\?' page
        // andIclickRadioOptionXOnTheDoYouWantToAddAnyCommentsForTheAdditionalInformationPage() [0.78] (ItemDetailsStepDefSteps.scala) pattern: (?:I )?click radio option (.*) on the 'Do you want to add any comments for the additional information\?' page
        // andIclickRadioOptionXOnTheDoYouWantToAddAnyDocumentsPage() [0.76] (ItemDetailsStepDefSteps.scala) pattern: (?:I )?click radio option (.*) on the 'Do you want to add any documents\?' page

      And("I submit on the Check your answers section Documents page")
        // Possible match (best=1.00)
        andIsubmitOnTheCheckYourAnswersSectionXPage("Documents")

      And("I choose radio option No on the You have added 3 documents page")
        // Possible match (best=0.89)
        andIchooseRadioOptionXOnTheYouHaveAddedXDocumentsPage("", "")

      When("I click the Add items link on the Declaration summary page")
        // Possible match (best=0.93)
        thenIclickTheLinkOnTheDeclarationSummaryPage("")
        // --- Other possible matches ---
        // thenIclickOnTheLinkOnTheDeclarationSummaryPage() [0.79] (TaskListStepDefSteps.scala) pattern: (?:I )?click on the (.+) link on the 'Declaration summary' page

      And("I enter This is a description of Item 1 on the Enter a description of item 1 page")
        // Possible match (best=0.88)
        andIenterXOnTheEnterADescriptionOfItemXPage("", "")

      And("I select United Kingdom on the What is the item’s country of dispatch? page")
        // Possible match (best=0.80)
        andIselectOnTheWhatIsTheItemsCountryOfDispatchPage("")
        // --- Other possible matches ---
        // andIselectOnTheWhatIsTheCountryOfDispatchPage() [0.79] (TransportDetailsStepDefSteps.scala) pattern: (?:I )?select (.+) on the 'What is the country of dispatch\?' page
        // andIselectOnTheWhatIsTheItemsCountryOfDestinationPage() [0.75] (ItemDetailsStepDefSteps.scala) pattern: (?:I )?select (.+) on the 'What is the item’s country of destination\?' page

      And("I select Italy on the What is the item’s country of destination? page")
        // Possible match (best=0.80)
        andIselectOnTheWhatIsTheItemsCountryOfDestinationPage("")
        // --- Other possible matches ---
        // andIselectOnTheWhatIsTheItemsCountryOfDispatchPage() [0.75] (ItemDetailsStepDefSteps.scala) pattern: (?:I )?select (.+) on the 'What is the item’s country of dispatch\?' page
        // andIselectOnTheWhatCountryIsTheOfficeOfDestinationInPage() [0.75] (RouteDetailsStepDefSteps.scala) pattern: (?:I )?select (.+) on the 'What country is the office of destination in\?' page

      And("I choose radio option Yes on the Do you want to add a Unique Consignment Reference? page")
        // Possible match (best=0.81)
        andIChooseRadioOptionXOnTheDoYouWantToAddAUniqueConsignmentReferencePage("")
        // --- Other possible matches ---
        // andIchooseRadioOptionXOnTheDoYouWantToAddAnAuthorisationPage() [0.76] (TransportAuthorisationsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add an authorisation' page
        // andIchooseRadioOptionXOnTheDoYouWantToAddASealPage() [0.76] (TransportEquipmentChargesStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a seal\?' page
        // andIChooseRadioOptionXOnTheDoYouWantToAddACarrierPage() [0.76] (CarrierDetailsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a carrier\?' page

      And("I enter UCR12312 on the What is the Unique Consignment Reference? page")
        // Possible match (best=0.79)
        andIenterXOnTheWhatIsTheUniqueConsignmentReferencePage("")
        // --- Other possible matches ---
        // andIenterOnTheWhatIsTheUCRPage() [0.78] (TransportDetailsStepDefSteps.scala) pattern: (?:I )?enter (.+) on the 'What is the UCR\?' page
        // andIenterOnTheWhatIsTheReferencePage() [0.78] (Departure_GuaranteeDetailsStepDefSteps.scala) pattern: (?:I )?enter (.+) on the 'What is the reference\?' page

      And("I click radio option Yes on the Do you want to add a Customs Union and Statistics code? page")
        // Possible match (best=0.81)
        andIclickRadioOptionXOnTheDoYouWantToAddACustomsUnionAndStatisticsCodePage("")
        // --- Other possible matches ---
        // andIclickRadioOptionXOnTheDoYouWantToAddACommodityCodePage() [0.76] (ItemDetailsStepDefSteps.scala) pattern: (?:I )?click radio option (.*) on the 'Do you want to add a commodity code\?' page

      And("I enter 0010002-7 on the What is the Customs Union and Statistics code? page")
        // Possible match (best=0.80)
        andIenterXOnTheWhatIsTheCustomsUnionAndStatisticsCodePage("")

      And("I click radio option Yes on the Do you want to add a commodity code? page")
        // Possible match (best=0.81)
        andIclickRadioOptionXOnTheDoYouWantToAddACommodityCodePage("")

      And("I enter 010130 on the What is the commodity code? page")
        // Possible match (best=0.79)
        andIenterXOnTheWhatIsTheCommodityCodePage("")

      And("I click radio option Yes on the Do you want to add a combined nomenclature code? page")
        // Possible match (best=0.81)
        andIclickRadioOptionXOnTheDoYouWantToAddACombinedNomenclatureCodePage("")
        // --- Other possible matches ---
        // andIclickRadioOptionXOnTheDoYouWantToAddACommodityCodePage() [0.76] (ItemDetailsStepDefSteps.scala) pattern: (?:I )?click radio option (.*) on the 'Do you want to add a commodity code\?' page

      And("I enter A1 on the What is the combined nomenclature code? page")
        // Possible match (best=0.79)
        andIenterXOnTheWhatIsTheCombinedNomenclatureCodePage("")

      And("I click radio option No on the Does the item contain any dangerous goods? page")
        // Possible match (best=0.80)
        andIclickRadioOptionXOnTheDoesTheItemContainAnyDangerousGoodsPage("")

      And("I enter 100 on the What is the item’s gross weight? page")
        // Possible match (best=0.80)
        andIenterXOnTheWhatIsTheItemsGrossWeightPage("")

      And("I click radio option No on the Do you want to add the item’s net weight? page")
        // Possible match (best=0.81)
        andIclickRadioOptionXOnTheDoYouWantToAddTheItemsNetWeightPage("")

      And("I click radio option No on the Do you want to add supplementary units? page")
        // Possible match (best=0.80)
        andIclickRadioOptionXOnTheDoYouWantToAddSupplementaryUnitsPage("")

      And("I select (VL) Bulk, liquid on the What type of package are you using for the item? page")
        // Possible match (best=0.81)
        andIselectOnTheWhatTypeOfPackageAreYouUsingForTheItemPage("")

      And("I click radio option No on the Do you want to add a shipping mark? page")
        // Possible match (best=0.81)
        andIclickRadioOptionXOnTheDoYouWantToAddAShippingMarkPage("")

      And("I click radio option No on the You have added 1 type of package page")
        // Possible match (best=0.78)
        andIclickRadioOptionXOnTheYouHaveAddedXTypesofPackagePage("", "")

      And("I click radio option No on the Do you want to add a supply chain actor for this item? page")
        // Possible match (best=0.82)
        andIclickRadioOptionXOnTheDoYouWantToAddASupplyChainActorForThisItemPage("")

      And("I click radio option Yes on the You have attached 1 document to this item page")
        // Possible match (best=0.77)
        andIclickRadioOptionXOnTheYouHaveAttachedXDocumentsToThisItemPage("", "")

      And("I select Supporting - (C673) Catch certificate - RefNoCL213Doc1 on the Which document do you want to attach? page")
        // Possible match (best=0.80)
        andIselectOnTheWhichDocumentDoYouWantToAttachPage("")

      And("I click radio option No on the You have attached 2 documents to this item page")
        // Possible match (best=0.91)
        andIclickRadioOptionXOnTheYouHaveAttachedXDocumentsToThisItemPage("", "")

      And("I click radio option No on the Do you want to add an additional reference for this item? page")
        // Possible match (best=0.81)
        andIclickRadioOptionXOnTheDoYouWantToAddAnAdditionalReferenceForThisItemPage("")
        // --- Other possible matches ---
        // andIclickRadioOptionXOnTheDoYouWantToAddAnAdditionalReferenceNumberPage() [0.77] (ItemDetailsStepDefSteps.scala) pattern: (?:I )?click radio option (.*) on the 'Do you want to add an additional reference number\?' page

      And("I click radio option No on the Do you want to add any additional information for this item? page")
        // Possible match (best=0.81)
        andIclickRadioOptionXOnTheDoYouWantToAddAnyAdditionalInformationForThisItemPage("")
        // --- Other possible matches ---
        // andIclickRadioOptionXOnTheDoYouWantToAddAnAdditionalReferenceForThisItemPage() [0.78] (ItemDetailsStepDefSteps.scala) pattern: (?:I )?click radio option (.*) on the 'Do you want to add an additional reference for this item\?' page
        // andIclickRadioOptionXOnTheDoYouWantToAddAnyCommentsForTheAdditionalInformationPage() [0.78] (ItemDetailsStepDefSteps.scala) pattern: (?:I )?click radio option (.*) on the 'Do you want to add any comments for the additional information\?' page
        // andIclickRadioOptionXOnTheDoYouWantToAddAnyAdditionalInformationForThisDocumentPage() [0.78] (PreviousStepDefSteps.scala) pattern: (?:I )?click radio option (.*) on the 'Do you want to add any additional information for this document\?' page
        // andIclickRadioOptionXOnTheDoYouWantToAddAnyDocumentsPage() [0.76] (ItemDetailsStepDefSteps.scala) pattern: (?:I )?click radio option (.*) on the 'Do you want to add any documents\?' page

      And("I submit on the Check your answers section Items page")
        // Possible match (best=1.00)
        andIsubmitOnTheCheckYourAnswersSectionXPage("Items")

      And("I click radio option No on the You have added 1 item page")
        // Possible match (best=0.89)
        andIclickRadioOptionXOnTheYouHaveAddedXItemPage("", "")

      And("I click the Confirm and send button on the Declaration summary page")
        // ⚠️ No step-def match found for: I click the Confirm and send button on the Declaration summary page

      And("I click the Sign out link on the Departure declaration sent page")
        // Possible match (best=0.94)
        andIclickTheLinkOnTheDepartureDeclarationSentPage("")

    }
  }
}
