import org.scalatest.matchers.should.Matchers
import org.scalatest.GivenWhenThen
import org.scalatest.featurespec.AnyFeatureSpec


class DepartureEndtoendGBP6Spec extends AnyFeatureSpec with GivenWhenThen {

  Feature("End to end journey for Great Britain office of departure") {

    Scenario("01 Procedure 'Simplified' - Declaration 'T2' - Security '2 EXS' - Binding itinerary 1 -") {
      And("I choose radio option Simplified on the Which type of procedure are you using? page")
        // Possible match (best=0.80)
        andIchooseRadioOptionXOnTheWhichTypeOfProcedureAreYouUsingPage("")
        // --- Other possible matches ---
        // andIchooseRadioOptionXOnTheWhatTypeOfProcedureAreYouUsingPage() [0.76] (IdentificationStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'What type of procedure are you using\?' page

      And("I choose radio option T2 on the Which type of declaration do you want to create? page")
        // Possible match (best=0.81)
        andIchooseRadioOptionXOnTheWhichTypeOfDeclarationDoYouWantToCreatePage("")
        // --- Other possible matches ---
        // andIchooseRadioOptionXOnTheT2DeclarationPage() [0.78] (RouteDetailsTransitStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the t2 declaration page

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

      And("I click the Add trader details link on the Declaration summary page")
        // Possible match (best=0.93)
        thenIclickTheLinkOnTheDeclarationSummaryPage("")
        // --- Other possible matches ---
        // thenIclickOnTheLinkOnTheDeclarationSummaryPage() [0.79] (TaskListStepDefSteps.scala) pattern: (?:I )?click on the (.+) link on the 'Declaration summary' page

      And("I choose radio option No on the Do you know the transit holder’s EORI number? page")
        // Possible match (best=0.81)
        andIchooseRadioOptionXOnTheDoYouKnowTheTransitHoldersEORINumberPage("")

      And("I enter Joe Blog on the What is the transit holder’s name? page")
        // Possible match (best=0.80)
        andIenterOnTheWhatIsTheTransitHoldersNamePage("")

      And("I select United Kingdom on the Which country is the transit holder based in? page")
        // Possible match (best=0.80)
        andIselectOnTheWhichCountryIsTheTransitHolderBasedInPage("")

      And("I fill in the address on the What is the transit holder’s address? page")
        // ⚠️ No step-def match found for: I fill in the address on the What is the transit holder’s address? page

      And("I choose radio option Yes on the Do you want to add a contact for the transit holder? page")
        // Possible match (best=0.81)
        andIchooseRadioOptionXOnTheDoYouWantToAddAContactForTheTransitHolderPage("")
        // --- Other possible matches ---
        // andIchooseRadioOptionXOnTheDoYouWantToAddAContactForTheConsignorPage() [0.77] (TraderDetailsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a contact for the consignor\?' page
        // andIchooseRadioOptionXOnThEDoYouWantToAddAContactForTheCarrierPage() [0.77] (CarrierDetailsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a contact for the carrier\?' page
        // andIchooseRadioOptionXOnTheDoYouWantToAddAnAuthorisationPage() [0.76] (TransportAuthorisationsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add an authorisation' page
        // andIchooseRadioOptionXOnTheDoYouWantToAddASealPage() [0.76] (TransportEquipmentChargesStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a seal\?' page
        // andIChooseRadioOptionXOnTheDoYouWantToAddACarrierPage() [0.76] (CarrierDetailsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a carrier\?' page

      And("I enter John contact on the What is the contact’s name? page")
        // Possible match (best=0.79)
        andIenterNameOnTheWhatIsTheContactsNamePage("")

      And("I enter +2112212112 on the What is the phone number for the transit holder’s contact? page")
        // Possible match (best=0.81)
        andIenterOnTheWhatIsThePhoneNumberForTheTransitHoldersContactPage("")
        // --- Other possible matches ---
        // andIenterOnTheWhatIsThePhoneNumberForTheConsignorsContactPage() [0.76] (TraderDetailsStepDefSteps.scala) pattern: (?:I )?enter (.+) on the 'What is the phone number for the consignor’s contact\?' page
        // andIenterOnTheWhatIsThePhoneNumberForTheCarriersContactPage() [0.76] (CarrierDetailsStepDefSteps.scala) pattern: (?:I )?enter (.+) on the 'What is the phone number for the carrier’s contact\?' page
        // andIenterOnTheWhatIsTheTransitHoldersEORINumberPage() [0.75] (TraderDetailsStepDefSteps.scala) pattern: (?:I )?enter (.+) on the 'What is the transit holder’s EORI number\?' page

      And("I choose radio option No on the Are you acting as a representative? page")
        // Possible match (best=0.80)
        andIchooseRadioOptionXOnTheAreYouActingAsARepresentativePage("")
        // --- Other possible matches ---
        // andIchooseRadioOptionXOnThePresentationAreYouActingAsARepresentativePage() [0.76] (PresentationNotificationStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the presentation 'Are you acting as a representative\?' page

      And("I choose radio option Yes on the Do you want to use a reduced data set? page")
        // Possible match (best=0.81)
        thenIchooseRadioOptionXOnTheDoYouWantToUseAReducedDataSetPage("")

      And("I choose radio option No on the Do you know the consignor’s EORI number or TIN? page")
        // Possible match (best=0.81)
        andIchooseRadioOptionXOnTheDoYouKnowTheConsignorsEORINumberOrTINPage("")
        // --- Other possible matches ---
        // andIchooseRadioOptionXOnTheDoYouKnowTheConsigneesEORINumberOrTINPage() [0.77] (TraderDetailsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you know the consignee’s EORI number or TIN\?' page

      And("I enter Pip Consignor on the What is the consignor’s name? page")
        // Possible match (best=0.79)
        andIenterOnTheWhatIsTheConsignorsNamePage("")

      And("I select United Kingdom on the Which country is the consignor based in? page")
        // Possible match (best=0.80)
        andIselectOnTheWhichCountryIsTheConsignorBasedInPage("")

      And("I fill in the address on the What is the consignor’s address? page")
        // ⚠️ No step-def match found for: I fill in the address on the What is the consignor’s address? page

      And("I choose radio option No on the Do you want to add a contact for the consignor? page")
        // Possible match (best=0.81)
        andIchooseRadioOptionXOnTheDoYouWantToAddAContactForTheConsignorPage("")
        // --- Other possible matches ---
        // andIchooseRadioOptionXOnThEDoYouWantToAddAContactForTheCarrierPage() [0.77] (CarrierDetailsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a contact for the carrier\?' page
        // andIchooseRadioOptionXOnTheDoYouWantToAddAnAuthorisationPage() [0.76] (TransportAuthorisationsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add an authorisation' page
        // andIchooseRadioOptionXOnTheDoYouWantToAddASealPage() [0.76] (TransportEquipmentChargesStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a seal\?' page
        // andIChooseRadioOptionXOnTheDoYouWantToAddACarrierPage() [0.76] (CarrierDetailsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a carrier\?' page

      And("I choose radio option No on the Do you know the consignee’s EORI number or TIN? page")
        // Possible match (best=0.81)
        andIchooseRadioOptionXOnTheDoYouKnowTheConsigneesEORINumberOrTINPage("")
        // --- Other possible matches ---
        // andIchooseRadioOptionXOnTheDoYouKnowTheConsignorsEORINumberOrTINPage() [0.77] (TraderDetailsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you know the consignor’s EORI number or TIN\?' page

      And("I enter Simpson Blog Consignee on the What is the consignee’s name? page")
        // Possible match (best=0.79)
        andIenterOnTheWhatIsTheConsigneesNamePage("")

      And("I select United Kingdom on the Which country is the consignee based in? page")
        // Possible match (best=0.80)
        andIselectOnTheWhichCountryIsTheConsigneeBasedInPage("")

      And("I fill in the address on the What is the consignee’s address? page")
        // ⚠️ No step-def match found for: I fill in the address on the What is the consignee’s address? page

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

      And("I choose radio option Yes on the Are you using a binding itinerary? page")
        // Possible match (best=0.80)
        andIchooseRadioOptionXOnTheAreYouUsingABindingItineraryPage("")

      And("I select Germany on the Which country do you want to add to the transit route? page")
        // Possible match (best=0.81)
        andIselectOnTheWhichCountryDoYouWantToAddToTheTransitRoutePage("")
        // --- Other possible matches ---
        // andIselectOnTheUnloadingWhichCountryDoYouWantToAddToTheTransitRoutePage() [0.77] (UnloadingStepDefSteps.scala) pattern: (?:I )?select (.+) on the Unloading 'Which country do you want to add to the transit route\?' page

      And("I choose radio option Yes on the You have added 1 country to the transit route page")
        // Possible match (best=0.79)
        andIchooseRadioOptionXOnTheTransitRouteAddCountryPage("")
        // --- Other possible matches ---
        // andIchooseRadioOptionXOnTheYouHaveAddedXCountriestoTheTransitRoutePage() [0.79] (RouteDetailsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'You have added (.*) countr(?:y |ies )to the transit route' page

      And("I select France on the Which country do you want to add to the transit route? page")
        // Possible match (best=0.81)
        andIselectOnTheWhichCountryDoYouWantToAddToTheTransitRoutePage("")
        // --- Other possible matches ---
        // andIselectOnTheUnloadingWhichCountryDoYouWantToAddToTheTransitRoutePage() [0.77] (UnloadingStepDefSteps.scala) pattern: (?:I )?select (.+) on the Unloading 'Which country do you want to add to the transit route\?' page

      And("I choose radio option Yes on the You have added 2 countries to the transit route page")
        // Possible match (best=0.83)
        andIchooseRadioOptionXOnTheYouHaveAddedXCountriestoTheTransitRoutePage("", "")

      And("I select Andorra on the Which country do you want to add to the transit route? page")
        // Possible match (best=0.81)
        andIselectOnTheWhichCountryDoYouWantToAddToTheTransitRoutePage("")
        // --- Other possible matches ---
        // andIselectOnTheUnloadingWhichCountryDoYouWantToAddToTheTransitRoutePage() [0.77] (UnloadingStepDefSteps.scala) pattern: (?:I )?select (.+) on the Unloading 'Which country do you want to add to the transit route\?' page

      And("I choose radio option No on the You have added 3 countries to the transit route page")
        // Possible match (best=0.83)
        andIchooseRadioOptionXOnTheYouHaveAddedXCountriestoTheTransitRoutePage("", "")

      And("I submit on the Check your answers section Transit route page")
        // Possible match (best=1.00)
        andIsubmitOnTheCheckYourAnswersSectionXPage("Transit route")

      And("I select Andorra on the Which country is the office of transit in? page")
        // Possible match (best=0.80)
        andIselectOnTheWhichCountryIsTheOfficeOfTransitInPage("")

      And("I select CUSTOMS OFFICE SANT JULIÀ DE LÒRIA (AD000001) on the Where in Andorra is the office of transit? page")
        // Possible match (best=0.80)
        andIselectOnTheWhereInXIsTheOfficeOfTransitPage("", "")

      And("I choose radio option Yes on the Do you want to add a time of arrival in CUSTOMS OFFICE SANT JULIÀ DE LÒRIA (AD000001)? page")
        // Possible match (best=0.93)
        andIchooseRadioOptionXOnTheDoYouWantToAddATimeOfArrivalInXPage("", "")
        // --- Other possible matches ---
        // andIchooseRadioOptionXOnTheDoYouWantToAddAnAuthorisationPage() [0.76] (TransportAuthorisationsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add an authorisation' page
        // andIchooseRadioOptionXOnTheDoYouWantToAddASealPage() [0.76] (TransportEquipmentChargesStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a seal\?' page
        // andIChooseRadioOptionXOnTheDoYouWantToAddACarrierPage() [0.76] (CarrierDetailsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a carrier\?' page

      And("I choose fill in the date and time on the When do you expect the transit to arrive in CUSTOMS OFFICE SANT JULIÀ DE LÒRIA, Andorra? page")
        // Possible match (best=1.00)
        andIchooseFillInTheDateAndTimeOnTheWhenDoYouExpectTheTransitToArriveInXXPage("", "")
        // --- Other possible matches ---
        // andIenterTheDateOnTheWhenDoYouExpectTheTransitToArriveInXPage() [0.86] (TransportAuthorisationsStepDefSteps.scala) pattern: (?:I )?enter the date on the 'When do you expect the transit to arrive in (.*)\?' page
        // andIenterTheDateOnThePresentationWhenDoYouExpectTheTransitToArriveInXPage() [0.82] (PresentationNotificationStepDefSteps.scala) pattern: (?:I )?enter the date on the presentation 'When do you expect the transit to arrive in (.*)\?' page

      And("I submit on the Check your answers section Office of transit page")
        // Possible match (best=1.00)
        andIsubmitOnTheCheckYourAnswersSectionXPage("Office of transit")

      And("I choose radio option Yes on the You have added 1 office of transit page")
        // Possible match (best=0.79)
        andIchooseRadioOptionXOnTheAddOfficeOfTransitPage("")
        // --- Other possible matches ---
        // andIchooseRadioOptionXOnTheYouHaveAddedXOfficesOfTransitPage() [0.76] (RouteDetailsTransitStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'You have added (.*) offices? of transit' page

      And("I select France on the Which country is the office of transit in? page")
        // Possible match (best=0.80)
        andIselectOnTheWhichCountryIsTheOfficeOfTransitInPage("")

      And("I select Bastia port (FR000380) on the Where in France is the office of transit? page")
        // Possible match (best=0.80)
        andIselectOnTheWhereInXIsTheOfficeOfTransitPage("", "")

      And("I choose radio option No on the Do you want to add a time of arrival in Bastia port (FR000380)? page")
        // Possible match (best=0.93)
        andIchooseRadioOptionXOnTheDoYouWantToAddATimeOfArrivalInXPage("", "")
        // --- Other possible matches ---
        // andIchooseRadioOptionXOnTheDoYouWantToAddAnAuthorisationPage() [0.76] (TransportAuthorisationsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add an authorisation' page
        // andIchooseRadioOptionXOnTheDoYouWantToAddASealPage() [0.76] (TransportEquipmentChargesStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a seal\?' page
        // andIChooseRadioOptionXOnTheDoYouWantToAddACarrierPage() [0.76] (CarrierDetailsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a carrier\?' page

      And("I submit on the Check your answers section Office of transit page")
        // Possible match (best=1.00)
        andIsubmitOnTheCheckYourAnswersSectionXPage("Office of transit")

      And("I choose radio option No on the You have added 2 offices of transit page")
        // Possible match (best=0.91)
        andIchooseRadioOptionXOnTheYouHaveAddedXOfficesOfTransitPage("", "")
        // --- Other possible matches ---
        // andIchooseRadioOptionXOnTheAddOfficeOfTransitPage() [0.79] (RouteDetailsTransitStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the add office of transit page

      And("I enter 1234567890 on the What is the authorisation number for the location of goods? page")
        // Possible match (best=0.81)
        andIenterOnTheWhatIsTheAuthorisationNumberForTheLocationOfGoodsPage("")
        // --- Other possible matches ---
        // andIenterOnThePresentationWhatIsTheAuthorisationNumberForTheLocationOfGoodsPage() [0.77] (PresentationNotificationStepDefSteps.scala) pattern: (?:I )?enter (.+) on the presentation 'What is the authorisation number for the location of goods\?' page

      And("I choose radio option No on the Do you want to add an additional identifier for the location of goods? page")
        // Possible match (best=0.82)
        andIchooseRadioOptionXOnTheDoYouWantToAddAnAdditionalIdentifierForTheLocationOfGoodsPage("")
        // --- Other possible matches ---
        // andIchooseRadioOptionXOnTheDoYouWantToAddALocationOfGoodsPage() [0.81] (RouteDetailsLocationOfGoodsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a location of goods\?' page
        // andIchooseRadioOptionXOnThePresentationDoYouWantToAddAnAdditionalIdentifierForTheLocationOfGoodsPage() [0.79] (PresentationNotificationStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the presentation 'Do you want to add an additional identifier for the location of goods\?' page
        // andIchooseRadioOptionXOnTheDoYouWantToAddAContactForTheLocationOfGoodsPage() [0.78] (RouteDetailsLocationOfGoodsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a contact for the location of goods\?' page
        // andIchooseRadioOptionXOnTheDoYouWantToAddAnAuthorisationPage() [0.76] (TransportAuthorisationsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add an authorisation' page
        // andIchooseRadioOptionXOnTheDoYouWantToAddASealPage() [0.76] (TransportEquipmentChargesStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a seal\?' page
        // andIChooseRadioOptionXOnTheDoYouWantToAddACarrierPage() [0.76] (CarrierDetailsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a carrier\?' page
        // andIchooseRadioOptionXOnThePresentationDoYouWantToAddAContactForTheLocationOfGoodsPage() [0.75] (PresentationNotificationStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the presentation 'Do you want to add a contact for the location of goods\?' page

      And("I choose radio option No on the Do you want to add a contact for the location of goods? page")
        // Possible match (best=0.82)
        andIchooseRadioOptionXOnTheDoYouWantToAddAContactForTheLocationOfGoodsPage("")
        // --- Other possible matches ---
        // andIchooseRadioOptionXOnTheDoYouWantToAddALocationOfGoodsPage() [0.81] (RouteDetailsLocationOfGoodsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a location of goods\?' page
        // andIchooseRadioOptionXOnThePresentationDoYouWantToAddAContactForTheLocationOfGoodsPage() [0.78] (PresentationNotificationStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the presentation 'Do you want to add a contact for the location of goods\?' page
        // andIchooseRadioOptionXOnTheDoYouWantToAddAContactForTheConsignorPage() [0.77] (TraderDetailsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a contact for the consignor\?' page
        // andIchooseRadioOptionXOnThEDoYouWantToAddAContactForTheCarrierPage() [0.77] (CarrierDetailsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a contact for the carrier\?' page
        // andIchooseRadioOptionXOnTheDoYouWantToAddAnAuthorisationPage() [0.76] (TransportAuthorisationsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add an authorisation' page
        // andIchooseRadioOptionXOnTheDoYouWantToAddASealPage() [0.76] (TransportEquipmentChargesStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a seal\?' page
        // andIChooseRadioOptionXOnTheDoYouWantToAddACarrierPage() [0.76] (CarrierDetailsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a carrier\?' page
        // andIchooseRadioOptionXOnTheDoYouWantToAddAnAdditionalIdentifierForTheLocationOfGoodsPage() [0.75] (RouteDetailsLocationOfGoodsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add an additional identifier for the location of goods\?' page
        // andIchooseRadioOptionXOnTheArrivalLocationOfGoodsAddContactPage() [0.75] (LocationOfGoodsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the arrival location of goods add contact page

      And("I submit on the Check your answers section Location of goods page")
        // Possible match (best=1.00)
        andIsubmitOnTheCheckYourAnswersSectionXPage("Location of goods")

      And("I choose radio option No on the Do you want to add a UN LOCODE for the place of loading? page")
        // Possible match (best=0.82)
        andIchooseRadioOptionXOnTheDoYouWantToAddAUNLOCODEForThePlaceOfLoadingPage("")
        // --- Other possible matches ---
        // andIchooseRadioOptionXOnTheDoYouWantToAddAPlaceOfLoadingPage() [0.81] (RouteDetailsPlaceOfLoadingStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a place of loading\?' page
        // andIchooseRadioOptionXOnThePresentationDoYouWantToAddAUNLOCODEForThePlaceOfLoadingPage() [0.79] (PresentationNotificationStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the presentation 'Do you want to add a UN LOCODE for the place of loading\?' page
        // andIchooseRadioOptionXOnTheDoYouWantToAddAUNLOCODEForThePlaceOfUnloadingPage() [0.78] (RouteDetailsPlaceOfUnloadingStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a UN LOCODE for the place of unloading\?' page
        // andIchooseRadioOptionXOnTheDoYouWantToAddAPlaceOfUnloadingPage() [0.77] (RouteDetailsPlaceOfUnloadingStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a place of unloading\?' page
        // andIchooseRadioOptionXOnTheDoYouWantToAddAnAuthorisationPage() [0.76] (TransportAuthorisationsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add an authorisation' page
        // andIchooseRadioOptionXOnTheDoYouWantToAddASealPage() [0.76] (TransportEquipmentChargesStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a seal\?' page
        // andIChooseRadioOptionXOnTheDoYouWantToAddACarrierPage() [0.76] (CarrierDetailsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a carrier\?' page
        // andIchooseRadioOptionXOnTheDoYouWantToAddATimeOfArrivalInXPage() [0.75] (RouteDetailsTransitStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a time of arrival in (.*)\?' page

      And("I select United Kingdom on the In which country is the place of loading? page")
        // Possible match (best=0.80)
        andIselectOnTheInWhichCountryIsThePlaceOfLoadingPage("")
        // --- Other possible matches ---
        // andIselectOnThePresentationInWhichCountryIsThePlaceOfLoadingPage() [0.76] (PresentationNotificationStepDefSteps.scala) pattern: (?:I )?select (.+) on the presentation 'In which country is the place of loading\?' page
        // andIselectOnTheWhichCountryIsThePlaceOfUnloadingInPage() [0.75] (RouteDetailsPlaceOfUnloadingStepDefSteps.scala) pattern: (?:I )?select (.+) on the 'Which country is the place of unloading in\?' page

      And("I enter London on the Where in United Kingdom is the place of loading? page")
        // Possible match (best=0.80)
        andIenterOnTheWhereInXIsThePlaceOfLoadingPage("", "")

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

      When("I click the Add guarantee details link on the Declaration summary page")
        // Possible match (best=0.93)
        thenIclickTheLinkOnTheDeclarationSummaryPage("")
        // --- Other possible matches ---
        // thenIclickOnTheLinkOnTheDeclarationSummaryPage() [0.79] (TaskListStepDefSteps.scala) pattern: (?:I )?click on the (.+) link on the 'Declaration summary' page

      And("I choose radio option (A) Guarantee waiver by agreement on the Which type of guarantee is it? page")
        // Possible match (best=0.80)
        andIchooseRadioOptionXOnTheWhichTypeOfGuaranteeIsItPage("")
        // --- Other possible matches ---
        // andIchooseRadioOptionXOnTheWhichTypeOfLocationIsItPage() [0.75] (RouteDetailsLocationOfGoodsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Which type of location is it\?' page

      And("I choose radio option No on the You have added 1 guarantee page")
        // ⚠️ No step-def match found for: I choose radio option No on the You have added 1 guarantee page

      Then("I should be on the Declaration summary page")
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

      And("I enter GB123456123456 on the What is the UCR? page")
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

      And("I choose radio option Yes on the Are all the items being transported to the same country? page")
        // Possible match (best=0.81)
        andIchooseRadioOptionXOnTheAreAllTheItemsBeingTransportedToTheSameCountryPage("")

      And("I select Italy on the transport details What country are the items being transported to? page")
        // Possible match (best=0.81)
        andIselectOnTheTransportDetailsWhatCountryAreTheItemsBeingTransportedToPage("")

      And("I choose radio option Yes on the Are you using any shipping containers to transport the goods? page")
        // Possible match (best=0.81)
        andIchooseRadioOptionXOnTheAreYouUsingAnyShippingContainersToTransportTheGoodsPage("")
        // --- Other possible matches ---
        // andIchooseRadioOptionXOnThePresentationAreYouUsingAnyShippingContainersToTransportTheGoodsPage() [0.78] (PresentationNotificationStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the presentation 'Are you using any shipping containers to transport the goods\?' page

      And("I choose radio option No on the Do you want to add an inland mode of transport? page")
        // Possible match (best=0.81)
        andIchooseRadioOptionXOnTheDoYouWantToAddAnInlandModeOfTransportPage("")
        // --- Other possible matches ---
        // andIchooseRadioOptionXOnDoYouWantToAddABorderModeOfTransportPage() [0.77] (InlandModeOfTransportStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on 'Do you want to add a border mode of transport\?' page
        // andIchooseRadioOptionXOnTheDoYouWantToAddAnAuthorisationPage() [0.76] (TransportAuthorisationsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add an authorisation' page
        // andIchooseRadioOptionXOnTheDoYouWantToAddASealPage() [0.76] (TransportEquipmentChargesStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a seal\?' page
        // andIChooseRadioOptionXOnTheDoYouWantToAddACarrierPage() [0.76] (CarrierDetailsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a carrier\?' page
        // andIchooseRadioOptionXOnTheDoYouWantToAddATimeOfArrivalInXPage() [0.75] (RouteDetailsTransitStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a time of arrival in (.*)\?' page

      And("I choose radio option Name of a sea-going vessel on the inland mode Which identification do you want to use for this vehicle? page")
        // Possible match (best=0.82)
        andIchooseRadioOptionXOnTheInlandModeWhichIdentificationDoYouWantToUseForThisVehiclePage("")
        // --- Other possible matches ---
        // andIchooseRadioOptionXOnTheBorderModeWhichIdentificationDoYouWantToUseForThisVehiclePage() [0.78] (BorderMeansOfTransportStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the border mode 'Which identification do you want to use for this vehicle\?' page
        // andIchooseRadioXOnThePresentationInlandModeWhichIdentificationDoYouWantToUseForThisVehiclePage() [0.78] (PresentationNotificationStepDefSteps.scala) pattern: (?:I )?choose radio (.*) on the presentation inland mode 'Which identification do you want to use for this vehicle\?' page

      And("I enter registration number GB1234567 on the What is the identification number for this? page")
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

      And("I choose radio option Sea on the How is the transit crossing the border? page")
        // Possible match (best=0.80)
        andIchooseRadioOptionXOnTheHowIsTheTransitCrossingTheBorderPage("")
        // --- Other possible matches ---
        // andIchooseRadioXOnThePresentationHowIsTheTransitCrossingTheBorderPage() [0.76] (PresentationNotificationStepDefSteps.scala) pattern: (?:I )?choose radio (.*) on the presentation 'How is the transit crossing the border\?' page

      And("I choose radio option Name of a sea-going vessel on the border mode Which identification do you want to use for this vehicle? page")
        // Possible match (best=0.82)
        andIchooseRadioOptionXOnTheBorderModeWhichIdentificationDoYouWantToUseForThisVehiclePage("")
        // --- Other possible matches ---
        // andIchooseRadioOptionXOnTheInlandModeWhichIdentificationDoYouWantToUseForThisVehiclePage() [0.78] (InlandModeOfTransportStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the inland mode 'Which identification do you want to use for this vehicle\?' page

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

      And("I select Bastia port (FR000380) on the Where is the customs office at the border? page")
        // Possible match (best=0.80)
        andIselectOnTheWhereIsTheCustomsOfficeAtTheBorderPage("")
        // --- Other possible matches ---
        // andIselectOnWhereIsTheCustomsOfficeAtTheBorderPage() [0.80] (PresentationNotificationStepDefSteps.scala) pattern: (?:I )?select (.+) on 'Where is the customs office at the border\?' page

      And("I choose radio option No on the Do you want to add a conveyance reference number? page")
        // Possible match (best=0.81)
        andIchooseRadioOptionXOnTheDoYouWantToAddAConveyanceReferenceNumberPage("")
        // --- Other possible matches ---
        // andIchooseRadioXOnThePresentationDoYouWantToAddAConveyanceReferenceNumberPage() [0.77] (PresentationNotificationStepDefSteps.scala) pattern: (?:I )?choose radio (.*) on the presentation 'Do you want to add a conveyance reference number\?' page
        // andIchooseRadioOptionXOnTheDoYouWantToAddAnAuthorisationPage() [0.76] (TransportAuthorisationsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add an authorisation' page
        // andIchooseRadioOptionXOnTheDoYouWantToAddASealPage() [0.76] (TransportEquipmentChargesStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a seal\?' page
        // andIChooseRadioOptionXOnTheDoYouWantToAddACarrierPage() [0.76] (CarrierDetailsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a carrier\?' page

      And("I submit on the Check your answers section Border means of transport page")
        // Possible match (best=1.00)
        andIsubmitOnTheCheckYourAnswersSectionXPage("Border means of transport")

      And("I choose radio option No on the You have added 1 border means of transport page")
        // Possible match (best=0.91)
        whenIchooseRadioOptionXOnTheYouHaveAddedXBorderMeansOfTransportPage("", "")
        // --- Other possible matches ---
        // whenIchooseRadioXOnThePresentationYouHaveAddedXBorderMeansOfTransportPage() [0.77] (PresentationNotificationStepDefSteps.scala) pattern: (?:I )?choose radio (.*) on the presentation 'You have added (.*) border means of transport' page
        // andIchooseRadioOptionXOnTheYouHaveAddedXDepartureMeansOfTransportPage() [0.77] (UnloadingStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'You have added (.*) departure means of transport' page

      And("I submit on the Check your answers section Modes and means of transport page")
        // Possible match (best=1.00)
        andIsubmitOnTheCheckYourAnswersSectionXPage("Modes and means of transport")

      And("I choose radio option Yes on the Do you want to add a supply chain actor for all items? page")
        // Possible match (best=0.82)
        andIchooseRadioOptionXOnTheDoYouWantToAddASupplyChainActorForAllItemsPage("")
        // --- Other possible matches ---
        // andIchooseRadioOptionXOnTheDoYouWantToAddADocumentForTheItemPage() [0.77] (UnloadingStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a document for the item\?' page
        // andIchooseRadioOptionXOnTheDoYouWantToAddAPackageForTheItemPage() [0.77] (UnloadingStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a package for the item\?' page
        // andIchooseRadioOptionXOnTheDoYouWantToAddAnAuthorisationPage() [0.76] (TransportAuthorisationsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add an authorisation' page
        // andIchooseRadioOptionXOnTheDoYouWantToAddASealPage() [0.76] (TransportEquipmentChargesStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a seal\?' page
        // andIChooseRadioOptionXOnTheDoYouWantToAddACarrierPage() [0.76] (CarrierDetailsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a carrier\?' page
        // andIchooseRadioOptionXOnTheDoYouWantToAddAnItemForHouseConsignmentXPage() [0.75] (UnloadingStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add an item for house consignment (.*)\?' page

      And("I choose radio option Consolidator on the Which type of supply chain actor do you want to add? page")
        // Possible match (best=0.81)
        andIchooseRadioOptionXOnTheWhichTypeOfSupplyChainActorDoYouWantToAddPage("")
        // --- Other possible matches ---
        // andIchooseRadioOptionXOnTheWhichTypeOfAuthorisationDoYouWantToAddPage() [0.77] (TransportAuthorisationsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Which type of authorisation do you want to add' page
        // andIchooseRadioOptionXOnTheDoYouWantToAddTheTypeOfIdentificationPage() [0.77] (BorderMeansOfTransportStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add the type of identification\?' page
        // andIchooseRadioOptionXOnTheDoYouWantToAddAnAuthorisationPage() [0.76] (TransportAuthorisationsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add an authorisation' page
        // andIchooseRadioOptionXOnTheDoYouWantToAddASealPage() [0.76] (TransportEquipmentChargesStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a seal\?' page
        // andIChooseRadioOptionXOnTheDoYouWantToAddACarrierPage() [0.76] (CarrierDetailsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a carrier\?' page
        // andIchooseRadioOptionXOnTheDoYouWantToAddATimeOfArrivalInXPage() [0.75] (RouteDetailsTransitStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a time of arrival in (.*)\?' page

      And("I enter FR98472189002 on the What is the EORI number or Third Country Unique Identification Number TCUIN for the consolidator? page")
        // Possible match (best=0.93)
        andIenterOnTheWhatIsTheEORINumberOrThirdCountryUniqueIdentificationNumberTCUINForTheXPage("", "")
        // --- Other possible matches ---
        // andIenterOnTheWhatIsTheCarriersEORINumberOrThirdCountryUniqueIdentificationNumberTCUINPage() [0.78] (CarrierDetailsStepDefSteps.scala) pattern: (?:I )?enter (.+) on the 'What is the carrier’s EORI number or Third Country Unique Identification Number TCUIN\?' page

      And("I choose radio option No on the You have added 1 supply chain actor page")
        // Possible match (best=0.76)
        andIchooseRadioOptionXOnTheYouHaveAddedSupplyChainActorsPage("", "")

      And("I enter ACR123 reference number on the What is the reference number for the ACR authorisation? page")
        // Possible match (best=0.82)
        andIenterReferenceNumberOnTheWhatIsTheReferenceNumberForTheAuthorisationPage("", "")
        // --- Other possible matches ---
        // andIenterOnTheWhatIsTheReferencePage() [0.78] (Departure_GuaranteeDetailsStepDefSteps.scala) pattern: (?:I )?enter (.+) on the 'What is the reference\?' page

      And("I enter TRD123 reference number on the What is the reference number for the TRD authorisation? page")
        // Possible match (best=0.82)
        andIenterReferenceNumberOnTheWhatIsTheReferenceNumberForTheAuthorisationPage("", "")
        // --- Other possible matches ---
        // andIenterOnTheWhatIsTheReferencePage() [0.78] (Departure_GuaranteeDetailsStepDefSteps.scala) pattern: (?:I )?enter (.+) on the 'What is the reference\?' page

      And("I choose radio option No on the You have added 2 transport authorisations page")
        // Possible match (best=0.90)
        whenIchooseRadioOptionXOnTheYouHaveAddedTransportAuthorisationsPage("", "")

      And("I enter the date on the When do you expect the transit to arrive in Abruzzo - Pescara (IT406100)? page")
        // Possible match (best=1.00)
        andIenterTheDateOnTheWhenDoYouExpectTheTransitToArriveInXPage("")
        // --- Other possible matches ---
        // andIenterTheDateOnThePresentationWhenDoYouExpectTheTransitToArriveInXPage() [0.86] (PresentationNotificationStepDefSteps.scala) pattern: (?:I )?enter the date on the presentation 'When do you expect the transit to arrive in (.*)\?' page
        // andIchooseFillInTheDateAndTimeOnTheWhenDoYouExpectTheTransitToArriveInXXPage() [0.77] (RouteDetailsTransitStepDefSteps.scala) pattern: (?:I )?choose fill in the date and time on the 'When do you expect the transit to arrive in (.*), (.*)\?' page

      When("I choose radio option No on the Do you want to add a carrier? page")
        // Possible match (best=0.80)
        andIChooseRadioOptionXOnTheDoYouWantToAddACarrierPage("")
        // --- Other possible matches ---
        // andIchooseRadioOptionXOnTheDoYouWantToAddAnAuthorisationPage() [0.76] (TransportAuthorisationsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add an authorisation' page
        // andIchooseRadioOptionXOnTheDoYouWantToAddASealPage() [0.76] (TransportEquipmentChargesStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a seal\?' page

      And("I enter C001 on the What is the container identification number? page")
        // Possible match (best=0.79)
        andIenterOnTheWhatIsTheContainerIdentificationNumberPage("")

      And("I choose radio option No on the Do you want to add a seal? page")
        // Possible match (best=0.80)
        andIchooseRadioOptionXOnTheDoYouWantToAddASealPage("")
        // --- Other possible matches ---
        // andIchooseRadioOptionXOnTheDoYouWantToAddAnAuthorisationPage() [0.76] (TransportAuthorisationsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add an authorisation' page
        // andIChooseRadioOptionXOnTheDoYouWantToAddACarrierPage() [0.76] (CarrierDetailsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a carrier\?' page

      And("I submit on the Check your answers section Transport equipment page")
        // Possible match (best=1.00)
        andIsubmitOnTheCheckYourAnswersSectionXPage("Transport equipment")

      And("I choose radio option No on the You have added 1 transport equipment page")
        // Possible match (best=0.90)
        andIchooseRadioOptionXOnTheYouHaveAddedXTransportEquipmentPage("", "")
        // --- Other possible matches ---
        // andIchooseRadioOptionXOnThePresentationYouHaveAddedXTransportEquipmentPage() [0.76] (PresentationNotificationStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the presentation 'You have added (.*) transport equipment' page

      And("I choose radio option Yes on the Do you want to add a method of payment for transport charges? page")
        // Possible match (best=0.82)
        andIchooseRadioOptionXOnTheDoYouWantToAddAMethodOfPaymentForTransportChargesPage("")
        // --- Other possible matches ---
        // andIchooseRadioOptionXOnTheDoYouWantToAddAnAuthorisationPage() [0.76] (TransportAuthorisationsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add an authorisation' page
        // andIchooseRadioOptionXOnTheDoYouWantToAddASealPage() [0.76] (TransportEquipmentChargesStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a seal\?' page
        // andIChooseRadioOptionXOnTheDoYouWantToAddACarrierPage() [0.76] (CarrierDetailsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a carrier\?' page

      And("I choose radio option Credit card on the Which method of payment do you want to use for transport charges? page")
        // Possible match (best=0.82)
        andIchooseRadioOptionXOnTheWhichMethodOfPaymentDoYouWantToUseForTransportChargesPage("")
        // --- Other possible matches ---
        // andIchooseRadioOptionXOnTheDoYouWantToAddAMethodOfPaymentForTransportChargesPage() [0.78] (TransportEquipmentChargesStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a method of payment for transport charges\?' page

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

      And("I click radio option No on the Do you want to use this document for all items? page")
        // Possible match (best=0.81)
        andIclickRadioOptionXOnTheDoYouWantToUseThisDocumentForAllItemsPage("")

      Then("I select Previous - (C605) Information sheet INF3 on the What previous document do you want to add? page")
        // Possible match (best=0.80)
        andIselectOnTheWhatPreviousDocumentDoYouWantToAddPage("")

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

      And("I choose radio option Yes on the You have added 1 document page")
        // ⚠️ No step-def match found for: I choose radio option Yes on the You have added 1 document page

      And("I click radio option No on the Do you want to use this document for all items? page")
        // Possible match (best=0.81)
        andIclickRadioOptionXOnTheDoYouWantToUseThisDocumentForAllItemsPage("")

      And("I select Supporting - (N003) Certificate of quality on the What type of document do you want to add? page")
        // Possible match (best=0.80)
        andIselectOnTheWhatTypeOfDocumentDoYouWantToAddPage("")
        // --- Other possible matches ---
        // andIselectOnTheWhatPreviousDocumentDoYouWantToAddPage() [0.75] (DocumentsStepDefSteps.scala) pattern: (?:I )?select (.+) on the 'What previous document do you want to add\?' page

      And("I enter 98765 on the What is the document’s reference number? page")
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

      And("I choose radio option Yes on the You have added 2 documents page")
        // Possible match (best=0.89)
        andIchooseRadioOptionXOnTheYouHaveAddedXDocumentsPage("", "")

      And("I click radio option Yes on the Do you want to use this document for all items? page")
        // Possible match (best=0.81)
        andIclickRadioOptionXOnTheDoYouWantToUseThisDocumentForAllItemsPage("")

      Then("I select Transport - (N741) Master airwaybill on the What type of document do you want to add? page")
        // Possible match (best=0.80)
        andIselectOnTheWhatTypeOfDocumentDoYouWantToAddPage("")
        // --- Other possible matches ---
        // andIselectOnTheWhatPreviousDocumentDoYouWantToAddPage() [0.75] (DocumentsStepDefSteps.scala) pattern: (?:I )?select (.+) on the 'What previous document do you want to add\?' page

      And("I enter 1234 on the What is the document’s reference number? page")
        // Possible match (best=0.80)
        andIenterOnTheWhatIsTheDocumentsReferenceNumberPage("")
        // --- Other possible matches ---
        // andIenterOnTheWhatIsTheReferencePage() [0.78] (Departure_GuaranteeDetailsStepDefSteps.scala) pattern: (?:I )?enter (.+) on the 'What is the reference\?' page

      And("I submit on the Check your answers section Documents page")
        // Possible match (best=1.00)
        andIsubmitOnTheCheckYourAnswersSectionXPage("Documents")

      Then("I choose radio option No on the You have added 3 documents page")
        // Possible match (best=0.89)
        andIchooseRadioOptionXOnTheYouHaveAddedXDocumentsPage("", "")

      When("I click the Add items link on the Declaration summary page")
        // Possible match (best=0.93)
        thenIclickTheLinkOnTheDeclarationSummaryPage("")
        // --- Other possible matches ---
        // thenIclickOnTheLinkOnTheDeclarationSummaryPage() [0.79] (TaskListStepDefSteps.scala) pattern: (?:I )?click on the (.+) link on the 'Declaration summary' page

      And("I enter This is a description on the Enter a description of item 1 page")
        // Possible match (best=0.88)
        andIenterXOnTheEnterADescriptionOfItemXPage("", "")

      And("I select (1) Transport equipment - C001 on the Which transport equipment are you using for this item? page")
        // Possible match (best=0.80)
        andIselectOnTheWhichTransportEquipmentAreYouUsingForThisItemPage("")

      And("I click radio option No on the Do you want to add a Customs Union and Statistics code? page")
        // Possible match (best=0.81)
        andIclickRadioOptionXOnTheDoYouWantToAddACustomsUnionAndStatisticsCodePage("")
        // --- Other possible matches ---
        // andIclickRadioOptionXOnTheDoYouWantToAddACommodityCodePage() [0.76] (ItemDetailsStepDefSteps.scala) pattern: (?:I )?click radio option (.*) on the 'Do you want to add a commodity code\?' page

      And("I enter 010130 on the What is the commodity code? page")
        // Possible match (best=0.79)
        andIenterXOnTheWhatIsTheCommodityCodePage("")

      And("I click radio option No on the Does the item contain any dangerous goods? page")
        // Possible match (best=0.80)
        andIclickRadioOptionXOnTheDoesTheItemContainAnyDangerousGoodsPage("")

      And("I enter 100 on the What is the item’s gross weight? page")
        // Possible match (best=0.80)
        andIenterXOnTheWhatIsTheItemsGrossWeightPage("")

      And("I click radio option No on the Do you want to add supplementary units? page")
        // Possible match (best=0.80)
        andIclickRadioOptionXOnTheDoYouWantToAddSupplementaryUnitsPage("")

      And("I select (NE) Unpacked or unpackaged on the What type of package are you using for the item? page")
        // Possible match (best=0.81)
        andIselectOnTheWhatTypeOfPackageAreYouUsingForTheItemPage("")

      And("I enter 1 on the How many of these are you using? page")
        // Possible match (best=0.80)
        andIenterXOnTheHowManyOfTheseAreYouUsingPage("")

      And("I click radio option No on the Do you want to add a shipping mark? page")
        // Possible match (best=0.81)
        andIclickRadioOptionXOnTheDoYouWantToAddAShippingMarkPage("")

      And("I click radio option No on the You have added 1 types of package page")
        // Possible match (best=0.82)
        andIclickRadioOptionXOnTheYouHaveAddedXTypesofPackagePage("", "")

      And("I click radio option No on the Do you want to add a supply chain actor for this item? page")
        // Possible match (best=0.82)
        andIclickRadioOptionXOnTheDoYouWantToAddASupplyChainActorForThisItemPage("")

      And("I select Previous - (C605) Information sheet INF3 on the Which document do you want to attach? page")
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

      And("I click radio option Yes on the You have added 1 item page")
        // Possible match (best=0.89)
        andIclickRadioOptionXOnTheYouHaveAddedXItemPage("", "")

      And("I enter This is a description on the Enter a description of item 2 page")
        // Possible match (best=0.88)
        andIenterXOnTheEnterADescriptionOfItemXPage("", "")

      And("I select (1) Transport equipment - C001 on the Which transport equipment are you using for this item? page")
        // Possible match (best=0.80)
        andIselectOnTheWhichTransportEquipmentAreYouUsingForThisItemPage("")

      And("I click radio option No on the Do you want to add a Customs Union and Statistics code? page")
        // Possible match (best=0.81)
        andIclickRadioOptionXOnTheDoYouWantToAddACustomsUnionAndStatisticsCodePage("")
        // --- Other possible matches ---
        // andIclickRadioOptionXOnTheDoYouWantToAddACommodityCodePage() [0.76] (ItemDetailsStepDefSteps.scala) pattern: (?:I )?click radio option (.*) on the 'Do you want to add a commodity code\?' page

      And("I enter 010130 on the What is the commodity code? page")
        // Possible match (best=0.79)
        andIenterXOnTheWhatIsTheCommodityCodePage("")

      And("I click radio option No on the Does the item contain any dangerous goods? page")
        // Possible match (best=0.80)
        andIclickRadioOptionXOnTheDoesTheItemContainAnyDangerousGoodsPage("")

      And("I enter 0 on the What is the item’s gross weight? page")
        // Possible match (best=0.80)
        andIenterXOnTheWhatIsTheItemsGrossWeightPage("")

      And("I click the continue button on the Before you continue page")
        // Possible match (best=1.00)
        andIclickTheContinueButtonOnTheBeforeYouContinuePage()

      And("I click radio option No on the Do you want to add supplementary units? page")
        // Possible match (best=0.80)
        andIclickRadioOptionXOnTheDoYouWantToAddSupplementaryUnitsPage("")

      And("I select (NE) Unpacked or unpackaged on the What type of package are you using for the item? page")
        // Possible match (best=0.81)
        andIselectOnTheWhatTypeOfPackageAreYouUsingForTheItemPage("")

      And("I enter 1 on the How many of these are you using? page")
        // Possible match (best=0.80)
        andIenterXOnTheHowManyOfTheseAreYouUsingPage("")

      And("I click radio option No on the Do you want to add a shipping mark? page")
        // Possible match (best=0.81)
        andIclickRadioOptionXOnTheDoYouWantToAddAShippingMarkPage("")

      And("I click radio option No on the You have added 1 types of package page")
        // Possible match (best=0.82)
        andIclickRadioOptionXOnTheYouHaveAddedXTypesofPackagePage("", "")

      And("I click radio option No on the Do you want to add a supply chain actor for this item? page")
        // Possible match (best=0.82)
        andIclickRadioOptionXOnTheDoYouWantToAddASupplyChainActorForThisItemPage("")

      And("I select Previous - (C605) Information sheet INF3 - 1234 on the Which document do you want to attach? page")
        // Possible match (best=0.80)
        andIselectOnTheWhichDocumentDoYouWantToAttachPage("")

      And("I click radio option No on the You have attached 2 document to this item page")
        // Possible match (best=0.77)
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

      And("I click radio option No on the You have added 2 item page")
        // Possible match (best=0.89)
        andIclickRadioOptionXOnTheYouHaveAddedXItemPage("", "")

      And("I click the Confirm and send button on the Declaration summary page")
        // ⚠️ No step-def match found for: I click the Confirm and send button on the Declaration summary page

      And("I click the Sign out link on the Departure declaration sent page")
        // Possible match (best=0.94)
        andIclickTheLinkOnTheDepartureDeclarationSentPage("")

    }

    Scenario("02 Procedure 'Normal'- Declaration 'T' - Security '0 No security' - Required document is missing - Declaration 'T' - Item declaration type T2 - Item Level Previous document added") {
      And("I choose radio option Normal on the Which type of procedure are you using? page")
        // Possible match (best=0.80)
        andIchooseRadioOptionXOnTheWhichTypeOfProcedureAreYouUsingPage("")
        // --- Other possible matches ---
        // andIchooseRadioOptionXOnTheWhatTypeOfProcedureAreYouUsingPage() [0.76] (IdentificationStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'What type of procedure are you using\?' page

      And("I choose radio option T on the Which type of declaration do you want to create? page")
        // Possible match (best=0.81)
        andIchooseRadioOptionXOnTheWhichTypeOfDeclarationDoYouWantToCreatePage("")

      And("I choose radio option No security on the Which type of safety and security details do you want to add? page")
        // Possible match (best=0.82)
        andIchooseRadioOptionXOnTheWhichTypeOfSafetyAndSecurityDetailsDoYouWantToAddPage("")
        // --- Other possible matches ---
        // andIchooseRadioOptionXOnTheWhichTypeOfAuthorisationDoYouWantToAddPage() [0.77] (TransportAuthorisationsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Which type of authorisation do you want to add' page
        // andIchooseRadioOptionXOnTheDoYouWantToAddTheTypeOfIdentificationPage() [0.77] (BorderMeansOfTransportStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add the type of identification\?' page
        // andIchooseRadioOptionXOnTheDoYouWantToAddAnAuthorisationPage() [0.76] (TransportAuthorisationsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add an authorisation' page
        // andIchooseRadioOptionXOnTheDoYouWantToAddASealPage() [0.76] (TransportEquipmentChargesStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a seal\?' page
        // andIChooseRadioOptionXOnTheDoYouWantToAddACarrierPage() [0.76] (CarrierDetailsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a carrier\?' page

      And("I submit the Check your answers page")
        // Possible match (best=1.00)
        andIsubmitTheCheckYourAnswersPage()

      And("I click the Add trader details link on the Declaration summary page")
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

      And("I choose radio option No on the Are you acting as a representative? page")
        // Possible match (best=0.80)
        andIchooseRadioOptionXOnTheAreYouActingAsARepresentativePage("")
        // --- Other possible matches ---
        // andIchooseRadioOptionXOnThePresentationAreYouActingAsARepresentativePage() [0.76] (PresentationNotificationStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the presentation 'Are you acting as a representative\?' page

      And("I choose radio option No on the Do you want to use a reduced data set? page")
        // Possible match (best=0.81)
        thenIchooseRadioOptionXOnTheDoYouWantToUseAReducedDataSetPage("")

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

      And("I choose radio option No on the transit route add country page")
        // Possible match (best=1.00)
        andIchooseRadioOptionXOnTheTransitRouteAddCountryPage("No")

      And("I submit on the Check your answers section Transit route page")
        // Possible match (best=1.00)
        andIsubmitOnTheCheckYourAnswersSectionXPage("Transit route")

      And("I choose radio option Yes on the Does the transit include any T2 declarations? page")
        // Possible match (best=0.80)
        andIchooseRadioOptionXOnTheDoesTheTransitIncludeAnyT2DeclarationsPage("")
        // --- Other possible matches ---
        // andIchooseRadioOptionXOnTheT2DeclarationPage() [0.78] (RouteDetailsTransitStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the t2 declaration page

      And("I select France on the Which country is the office of transit in? page")
        // Possible match (best=0.80)
        andIselectOnTheWhichCountryIsTheOfficeOfTransitInPage("")

      And("I select Brest bureau (FR000690) on the Where in France is the office of transit? page")
        // Possible match (best=0.80)
        andIselectOnTheWhereInXIsTheOfficeOfTransitPage("", "")

      And("I choose radio option No on the Do you want to add a time of arrival in Brest bureau (FR000690)? page")
        // Possible match (best=0.93)
        andIchooseRadioOptionXOnTheDoYouWantToAddATimeOfArrivalInXPage("", "")
        // --- Other possible matches ---
        // andIchooseRadioOptionXOnTheDoYouWantToAddAnAuthorisationPage() [0.76] (TransportAuthorisationsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add an authorisation' page
        // andIchooseRadioOptionXOnTheDoYouWantToAddASealPage() [0.76] (TransportEquipmentChargesStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a seal\?' page
        // andIChooseRadioOptionXOnTheDoYouWantToAddACarrierPage() [0.76] (CarrierDetailsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a carrier\?' page

      And("I submit on the Check your answers section Office of transit page")
        // Possible match (best=1.00)
        andIsubmitOnTheCheckYourAnswersSectionXPage("Office of transit")

      And("I choose radio option No on the You have added 1 office of transit page")
        // Possible match (best=0.79)
        andIchooseRadioOptionXOnTheAddOfficeOfTransitPage("")
        // --- Other possible matches ---
        // andIchooseRadioOptionXOnTheYouHaveAddedXOfficesOfTransitPage() [0.76] (RouteDetailsTransitStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'You have added (.*) offices? of transit' page

      And("I choose radio option Approved place on the Which type of location is it? page")
        // Possible match (best=0.80)
        andIchooseRadioOptionXOnTheWhichTypeOfLocationIsItPage("")
        // --- Other possible matches ---
        // andIchooseRadioOptionXOnTheWhichTypeOfGuaranteeIsItPage() [0.75] (Departure_GuaranteeDetailsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Which type of guarantee is it\?' page

      And("I choose radio option GPS coordinates on the How do you want to identify the location of goods? page")
        // Possible match (best=0.81)
        andIchooseRadioOptionXOnTheHowDoYouWantToIdentifyTheLocationOfGoodsPage("")
        // --- Other possible matches ---
        // andIchooseRadioOptionXOnTheDoYouWantToAddALocationOfGoodsPage() [0.77] (RouteDetailsLocationOfGoodsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a location of goods\?' page

      And("I enter 50.96622 and 1.86211 on the What are the coordinates for the location of goods page")
        // Possible match (best=0.92)
        andIenterAndOnTheWhatAreTheCoordinatesForTheLocationOfGoodsPage("", "")

      And("I choose radio option No on the Do you want to add a contact for the location of goods? page")
        // Possible match (best=0.82)
        andIchooseRadioOptionXOnTheDoYouWantToAddAContactForTheLocationOfGoodsPage("")
        // --- Other possible matches ---
        // andIchooseRadioOptionXOnTheDoYouWantToAddALocationOfGoodsPage() [0.81] (RouteDetailsLocationOfGoodsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a location of goods\?' page
        // andIchooseRadioOptionXOnThePresentationDoYouWantToAddAContactForTheLocationOfGoodsPage() [0.78] (PresentationNotificationStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the presentation 'Do you want to add a contact for the location of goods\?' page
        // andIchooseRadioOptionXOnTheDoYouWantToAddAContactForTheConsignorPage() [0.77] (TraderDetailsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a contact for the consignor\?' page
        // andIchooseRadioOptionXOnThEDoYouWantToAddAContactForTheCarrierPage() [0.77] (CarrierDetailsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a contact for the carrier\?' page
        // andIchooseRadioOptionXOnTheDoYouWantToAddAnAuthorisationPage() [0.76] (TransportAuthorisationsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add an authorisation' page
        // andIchooseRadioOptionXOnTheDoYouWantToAddASealPage() [0.76] (TransportEquipmentChargesStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a seal\?' page
        // andIChooseRadioOptionXOnTheDoYouWantToAddACarrierPage() [0.76] (CarrierDetailsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a carrier\?' page
        // andIchooseRadioOptionXOnTheDoYouWantToAddAnAdditionalIdentifierForTheLocationOfGoodsPage() [0.75] (RouteDetailsLocationOfGoodsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add an additional identifier for the location of goods\?' page
        // andIchooseRadioOptionXOnTheArrivalLocationOfGoodsAddContactPage() [0.75] (LocationOfGoodsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the arrival location of goods add contact page

      And("I submit on the Check your answers section Location of goods page")
        // Possible match (best=1.00)
        andIsubmitOnTheCheckYourAnswersSectionXPage("Location of goods")

      And("I choose radio option No on the Do you want to add a UN LOCODE for the place of loading? page")
        // Possible match (best=0.82)
        andIchooseRadioOptionXOnTheDoYouWantToAddAUNLOCODEForThePlaceOfLoadingPage("")
        // --- Other possible matches ---
        // andIchooseRadioOptionXOnTheDoYouWantToAddAPlaceOfLoadingPage() [0.81] (RouteDetailsPlaceOfLoadingStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a place of loading\?' page
        // andIchooseRadioOptionXOnThePresentationDoYouWantToAddAUNLOCODEForThePlaceOfLoadingPage() [0.79] (PresentationNotificationStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the presentation 'Do you want to add a UN LOCODE for the place of loading\?' page
        // andIchooseRadioOptionXOnTheDoYouWantToAddAUNLOCODEForThePlaceOfUnloadingPage() [0.78] (RouteDetailsPlaceOfUnloadingStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a UN LOCODE for the place of unloading\?' page
        // andIchooseRadioOptionXOnTheDoYouWantToAddAPlaceOfUnloadingPage() [0.77] (RouteDetailsPlaceOfUnloadingStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a place of unloading\?' page
        // andIchooseRadioOptionXOnTheDoYouWantToAddAnAuthorisationPage() [0.76] (TransportAuthorisationsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add an authorisation' page
        // andIchooseRadioOptionXOnTheDoYouWantToAddASealPage() [0.76] (TransportEquipmentChargesStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a seal\?' page
        // andIChooseRadioOptionXOnTheDoYouWantToAddACarrierPage() [0.76] (CarrierDetailsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a carrier\?' page
        // andIchooseRadioOptionXOnTheDoYouWantToAddATimeOfArrivalInXPage() [0.75] (RouteDetailsTransitStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a time of arrival in (.*)\?' page

      And("I select United Kingdom on the In which country is the place of loading? page")
        // Possible match (best=0.80)
        andIselectOnTheInWhichCountryIsThePlaceOfLoadingPage("")
        // --- Other possible matches ---
        // andIselectOnThePresentationInWhichCountryIsThePlaceOfLoadingPage() [0.76] (PresentationNotificationStepDefSteps.scala) pattern: (?:I )?select (.+) on the presentation 'In which country is the place of loading\?' page
        // andIselectOnTheWhichCountryIsThePlaceOfUnloadingInPage() [0.75] (RouteDetailsPlaceOfUnloadingStepDefSteps.scala) pattern: (?:I )?select (.+) on the 'Which country is the place of unloading in\?' page

      And("I enter London on the Where in United Kingdom is the place of loading? page")
        // Possible match (best=0.80)
        andIenterOnTheWhereInXIsThePlaceOfLoadingPage("", "")

      And("I submit on the Check your answers section Places of loading and unloading page")
        // Possible match (best=1.00)
        andIsubmitOnTheCheckYourAnswersSectionXPage("Places of loading and unloading")

      And("I submit on the Check your answers section Route details page")
        // Possible match (best=1.00)
        andIsubmitOnTheCheckYourAnswersSectionXPage("Route details")

      Then("I should be on the Declaration summary page")
        // Possible match (best=1.00)
        thenIshouldbeOnTheDeclarationSummaryPage()

      When("I click the Add guarantee details link on the Declaration summary page")
        // Possible match (best=0.93)
        thenIclickTheLinkOnTheDeclarationSummaryPage("")
        // --- Other possible matches ---
        // thenIclickOnTheLinkOnTheDeclarationSummaryPage() [0.79] (TaskListStepDefSteps.scala) pattern: (?:I )?click on the (.+) link on the 'Declaration summary' page

      And("I choose radio option (3) Individual guarantee in cash on the Which type of guarantee is it? page")
        // Possible match (best=0.80)
        andIchooseRadioOptionXOnTheWhichTypeOfGuaranteeIsItPage("")
        // --- Other possible matches ---
        // andIchooseRadioOptionXOnTheWhichTypeOfLocationIsItPage() [0.75] (RouteDetailsLocationOfGoodsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Which type of location is it\?' page

      And("I choose radio option Yes on the Do you want to add a reference for the guarantee? page")
        // Possible match (best=0.81)
        andIchooseRadioOptionXOnTheDoYouWantToAddAReferenceForTheGuaranteePage("")
        // --- Other possible matches ---
        // andIchooseRadioOptionXOnTheDoYouWantToAddALiabilityForTheGuaranteePage() [0.77] (Departure_GuaranteeDetailsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a liability for the guarantee\?' page
        // andIchooseRadioOptionXOnTheDoYouWantToAddAnAuthorisationPage() [0.76] (TransportAuthorisationsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add an authorisation' page
        // andIchooseRadioOptionXOnTheDoYouWantToAddASealPage() [0.76] (TransportEquipmentChargesStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a seal\?' page
        // andIChooseRadioOptionXOnTheDoYouWantToAddACarrierPage() [0.76] (CarrierDetailsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a carrier\?' page

      And("I enter 01GB123456789012 on the What is the reference for the guarantee? page")
        // Possible match (best=0.80)
        andIenterOnTheWhatIsTheReferenceForTheGuaranteePage("")
        // --- Other possible matches ---
        // andIenterOnTheWhatIsTheReferencePage() [0.78] (Departure_GuaranteeDetailsStepDefSteps.scala) pattern: (?:I )?enter (.+) on the 'What is the reference\?' page

      And("I select GBP on the What currency do you want to use for the liability? page")
        // Possible match (best=0.81)
        andIselectOnTheWhatCurrencyDoYouWantToUseForTheLiabilityPage("")

      And("I enter 0 on the How much is the liability in pounds? page")
        // Possible match (best=0.80)
        andIenterOnTheHowMuchIsTheLiabilityInPoundsPage("")

      And("I choose radio option No on the Do you want to use the default liability amount of 10000 euros? page")
        // Possible match (best=0.82)
        andIchooseRadioOptionXOnTheDoYouWantToUseTheDefaultLiabilityAmountOf10000EurosPage("")

      And("I enter 1299.99 on the How much is the liability in pounds? page")
        // Possible match (best=0.80)
        andIenterOnTheHowMuchIsTheLiabilityInPoundsPage("")

      And("I submit on the Check your answers section Guarantee details page")
        // Possible match (best=1.00)
        andIsubmitOnTheCheckYourAnswersSectionXPage("Guarantee details")

      And("I choose radio option No on the You have added 1 guarantee page")
        // ⚠️ No step-def match found for: I choose radio option No on the You have added 1 guarantee page

      Then("I should be on the Declaration summary page")
        // Possible match (best=1.00)
        thenIshouldbeOnTheDeclarationSummaryPage()

      When("I click the Add transport details link on the Declaration summary page")
        // Possible match (best=0.93)
        thenIclickTheLinkOnTheDeclarationSummaryPage("")
        // --- Other possible matches ---
        // thenIclickOnTheLinkOnTheDeclarationSummaryPage() [0.79] (TaskListStepDefSteps.scala) pattern: (?:I )?click on the (.+) link on the 'Declaration summary' page

      And("I choose radio option No on the Do you want to use the same UCR for all items? page")
        // Possible match (best=0.81)
        andIchooseRadioOptionXOnTheDoYouWantToUseTheSameUCRForAllItemsPage("")

      And("I choose radio option No on the Are all the items being dispatched from the same country? page")
        // Possible match (best=0.81)
        andIchooseRadioOptionXOnTheAreAllTheItemsBeingDispatchedFromTheSameCountryPage("")

      And("I choose radio option No on the Are the goods being transported to another country after the end of this transit movement? page")
        // Possible match (best=0.82)
        andIchooseRadioOptionXOnTheAreTheGoodsBeingTransportedToAnotherCountryAfterTheEndOfThisTransitMovementPage("")

      And("I choose radio option No on the Are you using any shipping containers to transport the goods? page")
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

      And("I choose radio option Air on the Which inland mode of transport are you using? page")
        // Possible match (best=0.81)
        andIchooseRadioOptionXOnTheWhichInlandModeOfTransportAreYouUsingPage("")

      And("I choose radio option IATA flight number on the inland mode Which identification do you want to use for this vehicle? page")
        // Possible match (best=0.82)
        andIchooseRadioOptionXOnTheInlandModeWhichIdentificationDoYouWantToUseForThisVehiclePage("")
        // --- Other possible matches ---
        // andIchooseRadioOptionXOnTheBorderModeWhichIdentificationDoYouWantToUseForThisVehiclePage() [0.78] (BorderMeansOfTransportStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the border mode 'Which identification do you want to use for this vehicle\?' page
        // andIchooseRadioXOnThePresentationInlandModeWhichIdentificationDoYouWantToUseForThisVehiclePage() [0.78] (PresentationNotificationStepDefSteps.scala) pattern: (?:I )?choose radio (.*) on the presentation inland mode 'Which identification do you want to use for this vehicle\?' page
        // andIchooseRadioOptionXOnTheDoYouWantToAddAnIdentificationNumberForThisVehiclePage() [0.78] (BorderMeansOfTransportStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add an identification number for this vehicle\?' page

      And("I enter registration number 1234567 on the What is the identification number for this? page")
        // Possible match (best=0.80)
        andIenterRegistrationNumberOnTheWhatIsTheIdentificationNumberForThisPage("")

      And("I select United Kingdom on the border mode What country is this vehicle registered to? page")
        // Possible match (best=0.80)
        andIselectOnTheBorderModeWhatCountryIsThisVehicleRegisteredToPage("")
        // --- Other possible matches ---
        // andIselectOnTheWhatCountryIsThisVehicleRegisteredToPage() [0.80] (UnloadingStepDefSteps.scala) pattern: (?:I )?select (.+) on the 'What country is this vehicle registered to\?' page
        // andIselectOnTheActiveBorderModeWhatCountryIsThisVehicleRegisteredToPage() [0.76] (PresentationNotificationStepDefSteps.scala) pattern: (?:I )?select (.+) on the active border mode 'What country is this vehicle registered to\?' page
        // andIselectOnTheInlandModeWhatCountryIsThisVehicleRegisteredToPage() [0.76] (InlandModeOfTransportStepDefSteps.scala) pattern: (?:I )?select (.+) on the inland mode 'What country is this vehicle registered to\?' page

      And("I submit on the Check your answers section Departure means of transport page")
        // Possible match (best=1.00)
        andIsubmitOnTheCheckYourAnswersSectionXPage("Departure means of transport")

      And("I select radio option No on the You have added 1 departure means of transport page")
        // Possible match (best=0.91)
        andIselectRadioOptionXOnTheYouHaveAddedDepartureMeansOfTransportPage("", "")
        // --- Other possible matches ---
        // andIchooseRadioOptionXOnTheYouHaveAddedXDepartureMeansOfTransportPage() [0.77] (UnloadingStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'You have added (.*) departure means of transport' page

      And("I choose radio option Yes on Do you want to add a border mode of transport? page")
        // Possible match (best=0.81)
        andIchooseRadioOptionXOnDoYouWantToAddABorderModeOfTransportPage("")

      And("I choose radio option Air on the How is the transit crossing the border? page")
        // Possible match (best=0.80)
        andIchooseRadioOptionXOnTheHowIsTheTransitCrossingTheBorderPage("")
        // --- Other possible matches ---
        // andIchooseRadioXOnThePresentationHowIsTheTransitCrossingTheBorderPage() [0.76] (PresentationNotificationStepDefSteps.scala) pattern: (?:I )?choose radio (.*) on the presentation 'How is the transit crossing the border\?' page

      And("I choose radio option No on the border means Do you want to add identification for this vehicle? page")
        // Possible match (best=0.81)
        andIchooseRadioOptionXOnTheBorderMeansDoYouWantToAddIdentificationForThisVehiclePage("")
        // --- Other possible matches ---
        // andIchooseRadioOptionXOnTheDoYouWantToAddAnIdentificationNumberForThisVehiclePage() [0.78] (BorderMeansOfTransportStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add an identification number for this vehicle\?' page
        // andIchooseRadioOptionXOnTheDoYouWantToAddAnAuthorisationPage() [0.76] (TransportAuthorisationsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add an authorisation' page
        // andIchooseRadioOptionXOnTheDoYouWantToAddASealPage() [0.76] (TransportEquipmentChargesStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a seal\?' page
        // andIChooseRadioOptionXOnTheDoYouWantToAddACarrierPage() [0.76] (CarrierDetailsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a carrier\?' page

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

      And("I choose radio option No on the Do you want to add any transport equipment? page")
        // Possible match (best=0.81)
        andIchooseRadioOptionXOnTheDoYouWantToAddAnyTransportEquipmentPage("")
        // --- Other possible matches ---
        // andIchooseRadioOptionXOnThePresentationDoYouWantToAddAnyTransportEquipmentPage() [0.77] (PresentationNotificationStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the presentation 'Do you want to add any transport equipment\?' page
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

      And("I click radio option No on the Do you want to add any documents? page")
        // Possible match (best=0.80)
        andIclickRadioOptionXOnTheDoYouWantToAddAnyDocumentsPage("")

      When("I click the Add items link on the Declaration summary page")
        // Possible match (best=0.93)
        thenIclickTheLinkOnTheDeclarationSummaryPage("")
        // --- Other possible matches ---
        // thenIclickOnTheLinkOnTheDeclarationSummaryPage() [0.79] (TaskListStepDefSteps.scala) pattern: (?:I )?click on the (.+) link on the 'Declaration summary' page

      And("I enter This is a description on the Enter a description of item 1 page")
        // Possible match (best=0.88)
        andIenterXOnTheEnterADescriptionOfItemXPage("", "")

      And("I choose radio option T2 on the Which type of declaration do you want to create for this item? page")
        // Possible match (best=0.82)
        andIchooseRadioOptionXOnTheWhichTypeOfDeclarationDoYouWantToCreateForThisItemPage("")
        // --- Other possible matches ---
        // andIchooseRadioOptionXOnTheWhichTypeOfDeclarationDoYouWantToCreatePage() [0.81] (PreTaskListStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Which type of declaration do you want to create\?' page
        // andIchooseRadioOptionXOnTheT2DeclarationPage() [0.78] (RouteDetailsTransitStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the t2 declaration page
        // andIchooseRadioOptionXOnTheWhichTypeOfLocationIsItPage() [0.75] (RouteDetailsLocationOfGoodsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Which type of location is it\?' page
        // andIchooseRadioOptionXOnTheWhichTypeOfGuaranteeIsItPage() [0.75] (Departure_GuaranteeDetailsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Which type of guarantee is it\?' page

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

      And("I enter UCR12312 on the What is the Unique Consignment Reference? page")
        // Possible match (best=0.79)
        andIenterXOnTheWhatIsTheUniqueConsignmentReferencePage("")
        // --- Other possible matches ---
        // andIenterOnTheWhatIsTheUCRPage() [0.78] (TransportDetailsStepDefSteps.scala) pattern: (?:I )?enter (.+) on the 'What is the UCR\?' page
        // andIenterOnTheWhatIsTheReferencePage() [0.78] (Departure_GuaranteeDetailsStepDefSteps.scala) pattern: (?:I )?enter (.+) on the 'What is the reference\?' page

      And("I click radio option No on the Do you want to add a Customs Union and Statistics code? page")
        // Possible match (best=0.81)
        andIclickRadioOptionXOnTheDoYouWantToAddACustomsUnionAndStatisticsCodePage("")
        // --- Other possible matches ---
        // andIclickRadioOptionXOnTheDoYouWantToAddACommodityCodePage() [0.76] (ItemDetailsStepDefSteps.scala) pattern: (?:I )?click radio option (.*) on the 'Do you want to add a commodity code\?' page

      And("I enter 010130 on the What is the commodity code? page")
        // Possible match (best=0.79)
        andIenterXOnTheWhatIsTheCommodityCodePage("")

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

      And("I select (AE) Aerosol on the What type of package are you using for the item? page")
        // Possible match (best=0.81)
        andIselectOnTheWhatTypeOfPackageAreYouUsingForTheItemPage("")

      And("I enter 10 on the How many of these are you using? page")
        // Possible match (best=0.80)
        andIenterXOnTheHowManyOfTheseAreYouUsingPage("")

      And("I enter This is a description on the What is the shipping mark? page")
        // Possible match (best=0.79)
        andIenterXOnTheWhatIsTheShippingMarkPage("")

      And("I click radio option No on the You have added 1 type of package page")
        // Possible match (best=0.78)
        andIclickRadioOptionXOnTheYouHaveAddedXTypesofPackagePage("", "")

      And("I click radio option No on the Do you want to add a supply chain actor for this item? page")
        // Possible match (best=0.82)
        andIclickRadioOptionXOnTheDoYouWantToAddASupplyChainActorForThisItemPage("")

      And("I click the Go to your Documents section to add another document link on the You do not have any previous documents to attach page")
        // Possible match (best=1.00)
        andIclickTheGoToYourDocumentsSectionToAddAnotherDocumentLinkOnTheYouDoNotHaveAnyPreviousDocumentsToAttachPage()

      Then("I select Previous - (C605) Information sheet INF3 on the What previous document do you want to add? page")
        // Possible match (best=0.80)
        andIselectOnTheWhatPreviousDocumentDoYouWantToAddPage("")

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

      And("I choose radio option No on the You have added 1 documents page")
        // Possible match (best=0.89)
        andIchooseRadioOptionXOnTheYouHaveAddedXDocumentsPage("", "")

      And("I click the Edit items link on the Declaration summary page")
        // Possible match (best=0.93)
        thenIclickTheLinkOnTheDeclarationSummaryPage("")
        // --- Other possible matches ---
        // thenIclickOnTheLinkOnTheDeclarationSummaryPage() [0.79] (TaskListStepDefSteps.scala) pattern: (?:I )?click on the (.+) link on the 'Declaration summary' page

      And("I select Previous - (C605) Information sheet INF3 - 1234 on the Which document do you want to attach? page")
        // Possible match (best=0.80)
        andIselectOnTheWhichDocumentDoYouWantToAttachPage("")

      And("I click radio option No on the You have attached 1 documents to this item page")
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
