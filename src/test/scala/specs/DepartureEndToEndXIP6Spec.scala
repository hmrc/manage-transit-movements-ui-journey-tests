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

package specs

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

import specpage.Departures.AdditionalInformation.AddPageAdditionalInformationPage
import specpage.Departures.AdditionalReference.AddPageAdditionalReferencePage
import specpage.Departures.Confirmation.DepartureConfirmationPage
import specpage.Departures.Documents.Documents.DocumentAddAnotherPage
import specpage.Departures.Documents.Documents.DocumentReferenceNumberPage
import specpage.Departures.Documents.Documents.DocumentTypePage
import specpage.Departures.Documents.Documents.DocumentsForAllItemsPage
import specpage.Departures.Documents.Supporting.AddLineItemNumberPage
import specpage.Departures.Items.AddCUSCodePage
import specpage.Departures.Items.AddCommodityCodePage
import specpage.Departures.Items.AddDangerousGoodsPage
import specpage.Departures.Items.AddDocumentsPage
import specpage.Departures.Items.AddItemUCRPage
import specpage.Departures.Items.AddNomenclatureCodePage
import specpage.Departures.Items.AdditionalInformationAddPage
import specpage.Departures.Items.AdditionalReferenceAddPage
import specpage.Departures.Items.CUSCodePage
import specpage.Departures.Items.CommodityCodePage
import specpage.Departures.Items.DocumentsAddAnotherPage
import specpage.Departures.Items.DocumentsWhichDocumentPage
import specpage.Departures.Items.ItemCountryOfDestinationPage
import specpage.Departures.Items.ItemCountryOfDispatchPage
import specpage.Departures.Items.ItemDescriptionPage
import specpage.Departures.Items.ItemUCRNumberPage
import specpage.Departures.Items.ItemsAddAnotherPage
import specpage.Departures.Items.MeasurementAddNetWeightPage
import specpage.Departures.Items.MeasurementAddSupplementaryUnitsPage
import specpage.Departures.Items.MeasurementGrossWeightPage
import specpage.Departures.Items.NomenclatureCodePage
import specpage.Departures.Items.PackageTypePage
import specpage.Departures.Items.PackagesAddAnotherPage
import specpage.Departures.Items.PackagesAddShippingMarkPage
import specpage.Departures.Items.SupplyChainActorItemAddPage
import specpage.Departures.Transport.BorderMeansOfTransport.AddAnotherDepartureMeansOfTransportPage
import specpage.Departures.Transport.InlandModeOfTransport.IdentificationNumberPage
import specpage.Departures.Transport.InlandModeOfTransport.InlandModeOfTransportPage
import specpage.Departures.Transport.InlandModeOfTransport.TransportCountryPage
import specpage.Departures.Transport.InlandModeOfTransport.TransportIdentificationPage
import specpage.CommonPages.CYAPage
import specpage.Departures.Guarantee.GuaranteeBForTIRDeclarationPage
import specpage.Departures.PreTaskList.GenericCYAPage
import specpage.Departures.Transport.BorderMeansOfTransport.BorderMeansOfTransportCountryPage
import specpage.Departures.Transport.BorderMeansOfTransport.BorderMeansOfTransportIdentificationNumberPage
import specpage.Departures.Transport.BorderMeansOfTransport.BorderMeansOfTransportOfficeOfTransitPage
import specpage.Departures.Transport.BorderMeansOfTransport.BorderMeansOftransportIdentificationPage
import specpage.Departures.Transport.BorderMeansOfTransport.BorderModeOfTransportPage
import specpage.Departures.Transport.BorderMeansOfTransport.ConveyanceReferenceNumberPage
import specpage.Departures.Transport.Carrier.AddCarrierPage
import specsteps.PreTaskListStepDefSteps.*
import specsteps.PreviousStepDefSteps.*
import specsteps.RouteDetailsLocationOfGoodsStepDefSteps.*
import specsteps.RouteDetailsPlaceOfLoadingStepDefSteps.*
import specsteps.RouteDetailsStepDefSteps.*
import specsteps.SupplyChainActorStepDefSteps.*
import specsteps.TaskListStepDefSteps.*
import specsteps.TraderDetailsStepDefSteps.*
import specsteps.TransportDetailsStepDefSteps.*
import specsteps.TransportEquipmentChargesStepDefSteps.*
import specsteps.TransportAuthorisationsStepDefSteps.*
import org.scalatest.GivenWhenThen
import specsteps.*
import specsteps.ManageStepDefSteps.*
import specsteps.RouteDetailsPlaceOfUnloadingStepDefSteps.*

class DepartureEndToEndXIP6Spec extends BaseSpec with GivenWhenThen {

  override def beforeEach(): Unit = {
    dropCollections()
    deleteCookies()
    Given("I login with ID 1234567890")
    LoginStepDefSteps.andILoginWithIDX("1234567890")
    When("I click on the Make a departure declaration link on the Manage your transit movements page")
    givenIclickOnTheLinkOnTheManageYourTransitMovementsPage("Make a departure declaration")
    And("I input a random LRN on the What is the Local Reference Number page")
    whenIInputARandomLRNOnTheWhatIsTheLocalReferenceNumberPage()
    And("I choose radio option A on the Is this a standard or pre-lodged declaration page")
    andIchooseRadioOptionXOnTheIsThisAStandardOrPrelodgedDeclarationPage("A")
    And("I select XI on the Where is the office of departure page")
    andIselectOnTheWhereIsTheOfficeOfDeparturePage("XI")
    And("I choose radio option Normal on the Which type of procedure are you using? page")
    andIchooseRadioOptionXOnTheWhichTypeOfProcedureAreYouUsingPage("Normal")
    And("I choose radio option TIR on the Which type of declaration do you want to create? page")
    andIchooseRadioOptionXOnTheWhichTypeOfDeclarationDoYouWantToCreatePage("TIR")
  }

  Feature("End to end journey for Prelodged Northern Ireland office of departure") {

    Scenario(
      "01 Security 'ENS' - Guarantee 'B' - Inland Mode 'Rail' - Border Means 'Air' - Container Ind 'No' - CL213 & CL754 Documents"
    ) {
      And("I enter 1234567 on the What is the TIR carnet reference? page")
      andIenterOnTheWhatIsTheTIRCarnetReferencePage("1234567")

      And(
        "I choose radio option Exit summary declaration (EXS) on the Which type of safety and security details do you want to add? page"
      )
      andIchooseRadioOptionXOnTheWhichTypeOfSafetyAndSecurityDetailsDoYouWantToAddPage("Exit summary declaration (EXS)")

      And("I submit the Check your answers page")
      GenericCYAPage.submitAnswers()

      // -------------------------Trader details-------------------------
      When("I click the Add trader details link on the Declaration summary page")
      thenIclickTheLinkOnTheDeclarationSummaryPage("Add trader details")

      And("I choose radio option Yes on the Do you know the transit holder’s EORI number? page")
      andIchooseRadioOptionXOnTheDoYouKnowTheTransitHoldersEORINumberPage("Yes")

      And("I enter GB123456123456 on the What is the transit holder’s EORI number? page")
      andIenterOnTheWhatIsTheTransitHoldersEORINumberPage("GB123456123456")

      And("I choose radio option No on the Do you want to add a contact for the transit holder? page")
      andIchooseRadioOptionXOnTheDoYouWantToAddAContactForTheTransitHolderPage("No")

      And("I enter ABC/123/12345 on the What is the TIR holder’s identification number? page")
      andIenterOnTheWhatIsTheTIRHoldersIdentificationNumberPage("ABC/123/12345")

      And("I choose radio option No on the Are you acting as a representative? page")
      andIchooseRadioOptionXOnTheAreYouActingAsARepresentativePage("No")

      And("I choose radio option Yes on the Do you know the consignor’s EORI number or TIN? page")
      andIchooseRadioOptionXOnTheDoYouKnowTheConsignorsEORINumberOrTINPage("Yes")

      And("I enter IT12312313 on the What is the consignor’s EORI number or TIN? page")
      andIenterOnTheWhatIsTheConsignorsEORINumberOrTINPage("IT12312313")

      And("I choose radio option No on the Do you want to add a contact for the consignor? page")
      andIchooseRadioOptionXOnTheDoYouWantToAddAContactForTheConsignorPage("No")

      And("I choose radio option Yes on the Do you know the consignee’s EORI number or TIN? page")
      andIchooseRadioOptionXOnTheDoYouKnowTheConsigneesEORINumberOrTINPage("Yes")

      And("I enter GE00101001 on the What is the consignee’s EORI number or TIN? page")
      andIenterOnTheWhatIsTheConsigneesEORINumberOrTINPage("GE00101001")

      And("I submit on the Check your answers section Trader details page")
      CYAPage.submitAnswers("Trader details")

      Then("I should be on the Declaration summary page")
      thenIshouldbeOnTheDeclarationSummaryPage()

      And("I should see Completed status for trader details on the Declaration summary page")
      andIshouldSeeXStatusForOnTheDeclarationSummaryPage("Completed", "trader details")

      // -------------------------Route details-------------------------
      When("I click the Add route details link on the Declaration summary page")
      thenIclickTheLinkOnTheDeclarationSummaryPage("Add route details")

      And("I choose radio option No on the Do you want to add a specific circumstance indicator? page")
      andIchooseRadioOptionXOnTheDoYouWantToAddASpecificCircumstanceIndicatorPage("No")

      And("I select Italy on the What country is the office of destination in? page")
      andIselectOnTheWhatCountryIsTheOfficeOfDestinationInPage("Italy")

      And("I select IT on the Where in Italy is the office of destination? page")
      andIselectOnTheWhereInIsTheOfficeOfDestinationPage("IT", "Italy")

      And("I choose radio option No on the Are you using a binding itinerary? page")
      andIchooseRadioOptionXOnTheAreYouUsingABindingItineraryPage("No")

      And("I select Andorra on the Which country do you want to add to the transit route? page")
      andIselectOnTheWhichCountryDoYouWantToAddToTheTransitRoutePage("Andorra")

      When("I choose radio option Yes on the You have added 1 country to the transit route page")
      andIchooseRadioOptionXOnTheYouHaveAddedXCountriestoTheTransitRoutePage("Yes", "1")

      And("I select Argentina on the Which country do you want to add to the transit route? page")
      andIselectOnTheWhichCountryDoYouWantToAddToTheTransitRoutePage("Argentina")

      When("I choose radio option No on the You have added 2 countries to the transit route page")
      andIchooseRadioOptionXOnTheYouHaveAddedXCountriestoTheTransitRoutePage("No", "2")

      And("I submit on the Check your answers section Transit route page")
      CYAPage.submitAnswers("Transit route")

      And("I choose radio option Yes on the Do you want to add a location of goods? page")
      andIchooseRadioOptionXOnTheDoYouWantToAddALocationOfGoodsPage("Yes")

      And("I choose radio option Designated location on the Which type of location is it? page")
      andIchooseRadioOptionXOnTheWhichTypeOfLocationIsItPage("Designated location")

      And(
        "I choose radio option Customs office identifier on the How do you want to identify the location of goods? page"
      )
      andIchooseRadioOptionXOnTheHowDoYouWantToIdentifyTheLocationOfGoodsPage("Customs office identifier")

      And("I select XI on the departure location of goods customs office identification page")
      andIselectOnTheDepartureLocationOfGoodsCustomsOfficeIdentificationPage("XI")

      And("I submit on the Check your answers section Location of goods page")
      CYAPage.submitAnswers("Location of goods")

      And("I choose radio option No on the Do you want to add a UN LOCODE for the place of loading? page")
      andIchooseRadioOptionXOnTheDoYouWantToAddAUNLOCODEForThePlaceOfLoadingPage("No")

      And("I select United Kingdom on the In which country is the place of loading? page")
      andIselectOnTheInWhichCountryIsThePlaceOfLoadingPage("United Kingdom")

      And("I enter London on the Where in United Kingdom is the place of loading? page")
      andIenterOnTheWhereInXIsThePlaceOfLoadingPage("London", "United Kingdom")

      And("I choose radio option No on the Do you want to add a place of unloading? page")
      andIchooseRadioOptionXOnTheDoYouWantToAddAPlaceOfUnloadingPage("No")

      And("I submit on the Check your answers section Places of loading and unloading page")
      CYAPage.submitAnswers("Places of loading and unloading")

      And("I submit on the Check your answers section Route details page")
      CYAPage.submitAnswers("Route details")

      Then("I should be on the Declaration summary page")
      thenIshouldbeOnTheDeclarationSummaryPage()

      // -------------------------Guarantee details-------------------------
      And("I click the Add guarantee details link on the Declaration summary page")
      thenIclickTheLinkOnTheDeclarationSummaryPage("Add guarantee details")

      Then("I click the Continue button on the Guarantee added for TIR declaration page")
      GuaranteeBForTIRDeclarationPage.continueToNextPage()

      And("I should be on the Declaration summary page")
      thenIshouldbeOnTheDeclarationSummaryPage()

      When("I click the Add transport details link on the Declaration summary page")
      thenIclickTheLinkOnTheDeclarationSummaryPage("Add transport details")

      And("I choose radio option Yes on the Do you want to use the same UCR for all items? page")
      andIchooseRadioOptionXOnTheDoYouWantToUseTheSameUCRForAllItemsPage("Yes")

      And("I enter UCR23456 on the What is the UCR? page")
      andIenterOnTheWhatIsTheUCRPage("UCR23456")

      And("I choose radio option Yes on the Are all the items being dispatched from the same country? page")
      andIchooseRadioOptionXOnTheAreAllTheItemsBeingDispatchedFromTheSameCountryPage("Yes")

      And("I select United Kingdom on the What is the country of dispatch? page")
      andIselectOnTheWhatIsTheCountryOfDispatchPage("United Kingdom ")

      And(
        "I choose radio option Yes on the Are the goods being transported to another country after the end of this transit movement? page"
      )
      andIchooseRadioOptionXOnTheAreTheGoodsBeingTransportedToAnotherCountryAfterTheEndOfThisTransitMovementPage("Yes")

      And("I choose radio option No on the Are all the items being transported to the same country? page")
      andIchooseRadioOptionXOnTheAreAllTheItemsBeingTransportedToTheSameCountryPage("No")

      And("I choose radio option Not sure on the Are you using any shipping containers to transport the goods? page")
      andIchooseRadioOptionXOnTheAreYouUsingAnyShippingContainersToTransportTheGoodsPage("No")

      And("I choose radio option Yes on the Do you want to add an inland mode of transport? page")
      andIchooseRadioOptionXOnTheDoYouWantToAddAnInlandModeOfTransportPage("Yes")

      And("I choose radio option Rail on the Which inland mode of transport are you using? page")
      InlandModeOfTransportPage.selectInlandMode("Rail")

      And(
        "I choose radio option Train number on the inland mode Which identification do you want to use for this vehicle? page"
      )
      TransportIdentificationPage.selectIdentificationType("Train number")

      And("I enter registration number 1234567 on the What is the identification number for this? page")
      IdentificationNumberPage.enterRegistrationNumber("1234567")

      And("I select United Kingdom on the inland mode What country is this vehicle registered to? page")
      TransportCountryPage.selectCountry("United Kingdom")

      And("I submit on the Check your answers section Departure means of transport page")
      CYAPage.submitAnswers("Departure means of transport")

      And("I select radio option No on the You have added 1 departure means of transport page")
      AddAnotherDepartureMeansOfTransportPage.answerAddAnother("No", "1")

      And("I choose radio option Air on the How is the transit crossing the border? page")
      BorderModeOfTransportPage.selectBorderMode("Air")

      And(
        "I choose radio option registration number of the aircraft on the border mode Which identification do you want to use for this vehicle? page"
      )
      BorderMeansOftransportIdentificationPage.selectIdentificationType("registration number of the aircraft")

      And("I enter identification GB1234567 on the What is the identification number for this? page")
      BorderMeansOfTransportIdentificationNumberPage.enterIdentificationNumber("GB1234567")

      And("I select United Kingdom on the border mode What country is this vehicle registered to? page")
      BorderMeansOfTransportCountryPage.selectCountry("United Kingdom")

      And("I select Abruzzo on the Where is the customs office at the border? page")
      BorderMeansOfTransportOfficeOfTransitPage.selectCustomsOffice("Abruzzo")

      And("I enter conveyance number GB123456123456 on the What is the conveyance reference number? page")
      ConveyanceReferenceNumberPage.enterConveyanceReference("GB123456123456")

      And("I submit on the Check your answers section Modes and means of transport page")
      CYAPage.submitAnswers("Modes and means of transport")

      When("I choose radio option No on the Do you want to add a supply chain actor for all items? page")
      andIchooseRadioOptionXOnTheDoYouWantToAddASupplyChainActorForAllItemsPage("No")

      //   ## Authorisation
      And("I choose radio option Yes on the 'Do you want to add an authorisation' page")
      andIchooseRadioOptionXOnTheDoYouWantToAddAnAuthorisationPage("Yes")

      And("I choose radio option TRD on the 'Which type of authorisation do you want to add?' page")
      andIchooseRadioOptionXOnTheWhichTypeOfAuthorisationDoYouWantToAddPage("TRD")

      And("I enter TRD123 reference number on the What is the reference number for the TRD authorisation? page")
      andIenterReferenceNumberOnTheWhatIsTheReferenceNumberForTheAuthorisationPage("TRD123", "TRD")

      And("I choose radio option No on the You have added 2 transport authorisations page")
      whenIchooseRadioOptionXOnTheYouHaveAddedTransportAuthorisationsPage("No", "1")

      When("I choose radio option No on the Do you want to add a carrier? page")
      AddCarrierPage.answerAddCarrier("No")

      And("I choose radio option No on the Do you want to add any transport equipment? page")
      andIchooseRadioOptionXOnTheDoYouWantToAddAnyTransportEquipmentPage("No")

      And("I choose radio option No on the Do you want to add a method of payment for transport charges? page")
      andIchooseRadioOptionXOnTheDoYouWantToAddAMethodOfPaymentForTransportChargesPage("No")

      And("I click radio option No on the Do you want to add an additional reference for all items? page")
      AddPageAdditionalReferencePage.selectAndContinue("No")

      And("I click radio option No on the Do you want to add any additional information for all items? page")
      AddPageAdditionalInformationPage.selectAndContinue("No")

      And(
        "click the Change link for Do you want to use the same Unique Consignment Reference? on the Transport details Check your answers page"
      )
      CYAPage.clickChangeLink("Do you want to use the same Unique Consignment Reference?")

      And("I choose radio option No on the Do you want to use the same UCR for all items? page")
      andIchooseRadioOptionXOnTheDoYouWantToUseTheSameUCRForAllItemsPage("No")

      And(
        "click the Change link for Are all the items being dispatched from the same country? on the Transport details Check your answers page"
      )
      CYAPage.clickChangeLink("Are all the items being dispatched from the same country?")

      And("I choose radio option No on the Are all the items being dispatched from the same country? page")
      andIchooseRadioOptionXOnTheAreAllTheItemsBeingDispatchedFromTheSameCountryPage("No")

      And(
        "click the Change link for Are all the items being transported to the same country? on the Transport details Check your answers page"
      )
      CYAPage.clickChangeLink("Are all the items being transported to the same country?")

      And("I choose radio option No on the Are all the items being transported to the same country? page")
      andIchooseRadioOptionXOnTheAreAllTheItemsBeingTransportedToTheSameCountryPage("No")

      And("I submit on the Check your answers section Transport details page")
      CYAPage.submitAnswers("Transport details")

      Then("I should be on the Declaration summary page")
      thenIshouldbeOnTheDeclarationSummaryPage()

      // -------------------------Document details-------------------------
      When("I click the Add documents link on the Declaration summary page")
      thenIclickTheLinkOnTheDeclarationSummaryPage("Add documents")

      And("I click radio option Yes on the Do you want to add any documents? page")
      AddDocumentsPage.selectAndContinue("Yes")

      And("I click radio option No on the Do you want to use this document for all items? page")
      DocumentsForAllItemsPage.answerUseForAllItems("No")

      Then("I select Supporting - (C673) Catch certificate on the What type of document do you want to add? page")
      DocumentTypePage.selectDocumentType("Supporting - (C673) Catch certificate")

      And("I enter RefNoCL213Doc1 on the What is the document’s reference number? page")
      DocumentReferenceNumberPage.enterReferenceNumber("RefNoCL213Doc1")

      And("I click radio option No on the Do you want to add a line item number? page")
      AddLineItemNumberPage.answerAddLineItemNumber("No")

      And("I click radio option No on the Do you want to add any additional information for this document? page")
      andIclickRadioOptionXOnTheDoYouWantToAddAnyAdditionalInformationForThisDocumentPage("No")

      And("I submit on the Check your answers section Documents page")
      CYAPage.submitAnswers("Documents")

      And("I choose radio option Yes on the You have added 1 document page")
      DocumentAddAnotherPage.answerAddAnother("Yes", "1")

      And("I click radio option Yes on the Do you want to use this document for all items? page")
      DocumentsForAllItemsPage.answerUseForAllItems("Yes")

      And("I select Transport - (N741) Master airwaybill on the What type of document do you want to add? page")
      DocumentTypePage.selectDocumentType("Transport - (N741) Master airwaybill")

      And("I enter air1234 on the What is the document’s reference number? page")
      DocumentReferenceNumberPage.enterReferenceNumber("air1234")

      And("I submit on the Check your answers section Documents page")
      CYAPage.submitAnswers("Documents")

      And("I choose radio option Yes on the You have added 2 documents page")
      DocumentAddAnotherPage.answerAddAnother("Yes", "2")

      And("I click radio option No on the Do you want to use this document for all items? page")
      DocumentsForAllItemsPage.answerUseForAllItems("No")

      And("I select Previous - (C605) Information sheet INF3 on the What type of document do you want to add? page")
      DocumentTypePage.selectDocumentType("Previous - (C605) Information sheet INF3")

      And("I enter 1234 on the What is the document’s reference number? page")
      DocumentReferenceNumberPage.enterReferenceNumber("1234")

      And("I click radio option No on the Do you want to add any additional information for this document? page")
      andIclickRadioOptionXOnTheDoYouWantToAddAnyAdditionalInformationForThisDocumentPage("No")

      And("I submit on the Check your answers section Documents page")
      CYAPage.submitAnswers("Documents")

      And("I choose radio option No on the You have added 3 documents page")
      DocumentAddAnotherPage.answerAddAnother("No", "3")

      // -------------------------Item details-------------------------
      When("I click the Add items link on the Declaration summary page")
      thenIclickTheLinkOnTheDeclarationSummaryPage("Add items")

      And("I enter This is a description of Item 1 on the Enter a description of item 1 page")
      ItemDescriptionPage.enterDescription("This is a description ", "1")

      And("I select United Kingdom on the What is the item’s country of dispatch? page")
      ItemCountryOfDispatchPage.selectCountry("United Kingdom")

      And("I select Italy on the What is the item’s country of destination? page")
      ItemCountryOfDestinationPage.selectCountry("Italy")

      And("I choose radio option Yes on the Do you want to add a Unique Consignment Reference? page")
      AddItemUCRPage.selectAndContinue("Yes")

      And("I enter UCR12312 on the What is the Unique Consignment Reference? page")
      ItemUCRNumberPage.enterAndContinue("UCR12312")

      And("I click radio option Yes on the Do you want to add a Customs Union and Statistics code? page")
      AddCUSCodePage.selectAndContinue("Yes")

      And("I enter 0010003-8 on the What is the Customs Union and Statistics code? page")
      CUSCodePage.enterAndContinue("0010003-8")

      And("I click radio option Yes on the Do you want to add a commodity code? page")
      AddCommodityCodePage.selectAndContinue("Yes")

      And("I enter 010130 on the What is the commodity code? page")
      CommodityCodePage.enterAndContinue("010130")

      And("I click radio option Yes on the Do you want to add a combined nomenclature code? page")
      AddNomenclatureCodePage.selectAndContinue("Yes")

      And("I enter A1 on the What is the combined nomenclature code? page")
      NomenclatureCodePage.enterAndContinue("A1")

      And("I click radio option No on the Does the item contain any dangerous goods? page")
      AddDangerousGoodsPage.selectAndContinue("No")

      And("I enter 100 on the What is the item’s gross weight? page")
      MeasurementGrossWeightPage.enterGrossWeight("100")

      And("I click radio option No on the Do you want to add the item’s net weight? page")
      MeasurementAddNetWeightPage.selectAndContinue("No")

      And("I click radio option No on the Do you want to add supplementary units? page")
      MeasurementAddSupplementaryUnitsPage.selectAndContinue("No")

      And("I select (VL) Bulk, liquid on the What type of package are you using for the item? page")
      PackageTypePage.selectAndContinue("(VL) Bulk, liquid")

      And("I click radio option No on the Do you want to add a shipping mark? page")
      PackagesAddShippingMarkPage.selectAndContinue("No")

      And("I click radio option No on the You have added 1 type of package page")
      PackagesAddAnotherPage.answerAddAnother("No", "1")

      And("I click radio option No on the Do you want to add a supply chain actor for this item? page")
      SupplyChainActorItemAddPage.selectAndContinue("No")

      And("I click radio option Yes on the You have attached 1 document to this item page")
      DocumentsAddAnotherPage.answerAddAnother("Yes", "1")

      And(
        "I select Supporting - (C673) Catch certificate - RefNoCL213Doc1 on the Which document do you want to attach? page"
      )
      DocumentsWhichDocumentPage.selectAndContinue("Supporting - (C673) Catch certificate - RefNoCL213Doc1")

      And("I click radio option No on the You have attached 2 documents to this item page")
      DocumentsAddAnotherPage.answerAddAnother("No", "2")

      And("I click radio option No on the Do you want to add an additional reference for this item? page")
      AdditionalReferenceAddPage.selectAndContinue("No")

      And("I click radio option No on the Do you want to add any additional information for this item? page")
      AdditionalInformationAddPage.selectAndContinue("No")

      And("I submit on the Check your answers section Items page")
      CYAPage.submitAnswers("Items")

      And("I click radio option No on the You have added 1 item page")
      ItemsAddAnotherPage.answerAddAnother("No", "1")

      And("I click the Confirm and send button on the Declaration summary page")
      andIclickTheConfirmAndResendConfirmAndSendButtonOnTheDeclarationSummaryPage()

      And("I click the Sign out link on the Departure declaration sent page")
      DepartureConfirmationPage.followConfirmationLink("Sign out")
    }
  }
}
