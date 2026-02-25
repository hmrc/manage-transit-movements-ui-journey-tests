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

package convertedSpecs

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

import specsteps.BorderMeansOfTransportStepDefSteps.*
import specsteps.CYAStepDefSteps.*
import specsteps.CarrierDetailsStepDefSteps.*
import specsteps.DepartureConfirmationStepDefSteps.*
import specsteps.Departure_GuaranteeDetailsStepDefSteps.*
import specsteps.DocumentsStepDefSteps.*
import specsteps.InlandModeOfTransportStepDefSteps.*
import specsteps.ItemDetailsStepDefSteps.*
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
      andIsubmitTheCheckYourAnswersPage()


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
      andIsubmitOnTheCheckYourAnswersSectionXPage("Trader details")

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
      andIsubmitOnTheCheckYourAnswersSectionXPage("Transit route")

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
      andIsubmitOnTheCheckYourAnswersSectionXPage("Location of goods")

      And("I choose radio option No on the Do you want to add a UN LOCODE for the place of loading? page")
      andIchooseRadioOptionXOnTheDoYouWantToAddAUNLOCODEForThePlaceOfLoadingPage("No")

      And("I select United Kingdom on the In which country is the place of loading? page")
      andIselectOnTheInWhichCountryIsThePlaceOfLoadingPage("United Kingdom")

      And("I enter London on the Where in United Kingdom is the place of loading? page")
      andIenterOnTheWhereInXIsThePlaceOfLoadingPage("London", "United Kingdom")

      And("I choose radio option No on the Do you want to add a place of unloading? page")
      andIchooseRadioOptionXOnTheDoYouWantToAddAPlaceOfUnloadingPage("No")

      And("I submit on the Check your answers section Places of loading and unloading page")
      andIsubmitOnTheCheckYourAnswersSectionXPage("Places of loading and unloading")

      And("I submit on the Check your answers section Route details page")
      andIsubmitOnTheCheckYourAnswersSectionXPage("Route details")

      Then("I should be on the Declaration summary page")
      thenIshouldbeOnTheDeclarationSummaryPage()



      // -------------------------Guarantee details-------------------------
      And("I click the Add guarantee details link on the Declaration summary page")
      thenIclickTheLinkOnTheDeclarationSummaryPage("Add guarantee details")

      Then("I click the Continue button on the Guarantee added for TIR declaration page")
      andIclickTheContinueButtonOnTheGuaranteeAddedForTIRDeclarationPage()

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
      andIchooseRadioOptionXOnTheWhichInlandModeOfTransportAreYouUsingPage("Rail")

      And(
        "I choose radio option Train number on the inland mode Which identification do you want to use for this vehicle? page"
      )
      andIchooseRadioOptionXOnTheInlandModeWhichIdentificationDoYouWantToUseForThisVehiclePage("Train number")

      And("I enter registration number 1234567 on the What is the identification number for this? page")
      andIenterRegistrationNumberOnTheWhatIsTheIdentificationNumberForThisPage("1234567")

      And("I select United Kingdom on the inland mode What country is this vehicle registered to? page")
      andIselectOnTheInlandModeWhatCountryIsThisVehicleRegisteredToPage("United Kingdom")

      And("I submit on the Check your answers section Departure means of transport page")
      andIsubmitOnTheCheckYourAnswersSectionXPage("Departure means of transport")

      And("I select radio option No on the You have added 1 departure means of transport page")
      andIselectRadioOptionXOnTheYouHaveAddedDepartureMeansOfTransportPage("No", "1")

      And("I choose radio option Air on the How is the transit crossing the border? page")
      andIchooseRadioOptionXOnTheHowIsTheTransitCrossingTheBorderPage("Air")

      And(
        "I choose radio option registration number of the aircraft on the border mode Which identification do you want to use for this vehicle? page"
      )
      andIchooseRadioOptionXOnTheBorderModeWhichIdentificationDoYouWantToUseForThisVehiclePage(
        "registration number of the aircraft"
      )

      And("I enter identification GB1234567 on the What is the identification number for this? page")
      andIenterIdentificationOnTheWhatIsTheIdentificationNumberForThisPage("GB1234567")

      And("I select United Kingdom on the border mode What country is this vehicle registered to? page")
      andIselectOnTheBorderModeWhatCountryIsThisVehicleRegisteredToPage("United Kingdom")

      And("I select Abruzzo on the Where is the customs office at the border? page")
      andIselectOnTheWhereIsTheCustomsOfficeAtTheBorderPage("Abruzzo")

      And("I enter conveyance number GB123456123456 on the What is the conveyance reference number? page")
      andIenterConveyanceNumberOnTheWhatIsTheConveyanceReferenceNumberPage("GB123456123456")

      And("I submit on the Check your answers section Modes and means of transport page")
      andIsubmitOnTheCheckYourAnswersSectionXPage("Modes and means of transport")

      When("I choose radio option No on the Do you want to add a supply chain actor for all items? page")
      andIchooseRadioOptionXOnTheDoYouWantToAddASupplyChainActorForAllItemsPage("No")

      When("I choose radio option No on the Do you want to add a carrier? page")
      andIChooseRadioOptionXOnTheDoYouWantToAddACarrierPage("No")

      And("I choose radio option No on the Do you want to add any transport equipment? page")
      andIchooseRadioOptionXOnTheDoYouWantToAddAnyTransportEquipmentPage("No")

      And("I choose radio option No on the Do you want to add a method of payment for transport charges? page")
      andIchooseRadioOptionXOnTheDoYouWantToAddAMethodOfPaymentForTransportChargesPage("No")

      And("I click radio option No on the Do you want to add an additional reference for all items? page")
      andIclickRadioOptionXOnTheDoYouWantToAddAnAdditionalReferenceForAllItemsPage("No")

      And("I click radio option No on the Do you want to add any additional information for all items? page")
      andIclickRadioOptionXOnTheDoYouWantToAddAnyAdditionalInformationForAllItemsPage("No")

      And(
        "click the Change link for Do you want to use the same Unique Consignment Reference? on the Transport details Check your answers page"
      )
      andIclickTheChangeLinkForOnTheCheckYourAnswersPage("Do you want to use the same Unique Consignment Reference?")

      And("I choose radio option No on the Do you want to use the same UCR for all items? page")
      andIchooseRadioOptionXOnTheDoYouWantToUseTheSameUCRForAllItemsPage("No")

      And(
        "click the Change link for Are all the items being dispatched from the same country? on the Transport details Check your answers page"
      )
      andIclickTheChangeLinkForOnTheCheckYourAnswersPage("Are all the items being dispatched from the same country?")

      And("I choose radio option No on the Are all the items being dispatched from the same country? page")
      andIchooseRadioOptionXOnTheAreAllTheItemsBeingDispatchedFromTheSameCountryPage("No")

      And(
        "click the Change link for Are all the items being transported to the same country? on the Transport details Check your answers page"
      )
      andIclickTheChangeLinkForOnTheCheckYourAnswersPage("Are all the items being transported to the same country?")

      And("I choose radio option No on the Are all the items being transported to the same country? page")
      andIchooseRadioOptionXOnTheAreAllTheItemsBeingTransportedToTheSameCountryPage("No")

      And("I submit on the Check your answers section Transport details page")
      andIsubmitOnTheCheckYourAnswersSectionXPage("Transport details")

      Then("I should be on the Declaration summary page")
      thenIshouldbeOnTheDeclarationSummaryPage()



      // -------------------------Document details-------------------------
      When("I click the Add documents link on the Declaration summary page")
      thenIclickTheLinkOnTheDeclarationSummaryPage("Add documents")

      And("I click radio option Yes on the Do you want to add any documents? page")
      andIclickRadioOptionXOnTheDoYouWantToAddAnyDocumentsPage("Yes")

      And("I click radio option No on the Do you want to use this document for all items? page")
      andIclickRadioOptionXOnTheDoYouWantToUseThisDocumentForAllItemsPage("No")

      Then("I select Supporting - (C673) Catch certificate on the What type of document do you want to add? page")
      andIselectOnTheWhatTypeOfDocumentDoYouWantToAddPage("Supporting - (C673) Catch certificate")

      And("I enter RefNoCL213Doc1 on the What is the document’s reference number? page")
      andIenterOnTheWhatIsTheDocumentsReferenceNumberPage("RefNoCL213Doc1")

      And("I click radio option No on the Do you want to add a line item number? page")
      andIclickRadioOptionXOnTheDoYouWantToAddALineItemNumberPage("No")

      And("I click radio option No on the Do you want to add any additional information for this document? page")
      andIclickRadioOptionXOnTheDoYouWantToAddAnyAdditionalInformationForThisDocumentPage("No")

      And("I submit on the Check your answers section Documents page")
      andIsubmitOnTheCheckYourAnswersSectionXPage("Documents")

      And("I choose radio option Yes on the You have added 1 document page")
      andIchooseRadioOptionXOnTheYouHaveAddedXDocumentsPage("Yes", "1")

      And("I click radio option Yes on the Do you want to use this document for all items? page")
      andIclickRadioOptionXOnTheDoYouWantToUseThisDocumentForAllItemsPage("Yes")

      And("I select Transport - (N741) Master airwaybill on the What type of document do you want to add? page")
      andIselectOnTheWhatTypeOfDocumentDoYouWantToAddPage("Transport - (N741) Master airwaybill")

      And("I enter air1234 on the What is the document’s reference number? page")
      andIenterOnTheWhatIsTheDocumentsReferenceNumberPage("air1234")

      And("I submit on the Check your answers section Documents page")
      andIsubmitOnTheCheckYourAnswersSectionXPage("Documents")

      And("I choose radio option Yes on the You have added 2 documents page")
      andIchooseRadioOptionXOnTheYouHaveAddedXDocumentsPage("Yes", "2")

      And("I click radio option No on the Do you want to use this document for all items? page")
      andIclickRadioOptionXOnTheDoYouWantToUseThisDocumentForAllItemsPage("No")

      And("I select Previous - (C605) Information sheet INF3 on the What type of document do you want to add? page")
      andIselectOnTheWhatTypeOfDocumentDoYouWantToAddPage("Previous - (C605) Information sheet INF3")

      And("I enter 1234 on the What is the document’s reference number? page")
      andIenterOnTheWhatIsTheDocumentsReferenceNumberPage("1234")

      And("I click radio option No on the Do you want to add any additional information for this document? page")
      andIclickRadioOptionXOnTheDoYouWantToAddAnyAdditionalInformationForThisDocumentPage("No")

      And("I submit on the Check your answers section Documents page")
      andIsubmitOnTheCheckYourAnswersSectionXPage("Documents")

      And("I choose radio option No on the You have added 3 documents page")
      andIchooseRadioOptionXOnTheYouHaveAddedXDocumentsPage("No", "3")



      // -------------------------Item details-------------------------
      When("I click the Add items link on the Declaration summary page")
      thenIclickTheLinkOnTheDeclarationSummaryPage("Add items")

      And("I enter This is a description of Item 1 on the Enter a description of item 1 page")
      andIenterXOnTheEnterADescriptionOfItemXPage("This is a description ", "1")

      And("I select United Kingdom on the What is the item’s country of dispatch? page")
      andIselectOnTheWhatIsTheItemsCountryOfDispatchPage("United Kingdom")

      And("I select Italy on the What is the item’s country of destination? page")
      andIselectOnTheWhatIsTheItemsCountryOfDestinationPage("Italy")

      And("I choose radio option Yes on the Do you want to add a Unique Consignment Reference? page")
      andIChooseRadioOptionXOnTheDoYouWantToAddAUniqueConsignmentReferencePage("Yes")

      And("I enter UCR12312 on the What is the Unique Consignment Reference? page")
      andIenterXOnTheWhatIsTheUniqueConsignmentReferencePage("UCR12312")

      And("I click radio option Yes on the Do you want to add a Customs Union and Statistics code? page")
      andIclickRadioOptionXOnTheDoYouWantToAddACustomsUnionAndStatisticsCodePage("Yes")

      And("I enter 0010003-8 on the What is the Customs Union and Statistics code? page")
      andIenterXOnTheWhatIsTheCustomsUnionAndStatisticsCodePage("0010003-8")

      And("I click radio option Yes on the Do you want to add a commodity code? page")
      andIclickRadioOptionXOnTheDoYouWantToAddACommodityCodePage("Yes")

      And("I enter 010130 on the What is the commodity code? page")
      andIenterXOnTheWhatIsTheCommodityCodePage("010130")

      And("I click radio option Yes on the Do you want to add a combined nomenclature code? page")
      andIclickRadioOptionXOnTheDoYouWantToAddACombinedNomenclatureCodePage("Yes")

      And("I enter A1 on the What is the combined nomenclature code? page")
      andIenterXOnTheWhatIsTheCombinedNomenclatureCodePage("A1")

      And("I click radio option No on the Does the item contain any dangerous goods? page")
      andIclickRadioOptionXOnTheDoesTheItemContainAnyDangerousGoodsPage("No")

      And("I enter 100 on the What is the item’s gross weight? page")
      andIenterXOnTheWhatIsTheItemsGrossWeightPage("100")

      And("I click radio option No on the Do you want to add the item’s net weight? page")
      andIclickRadioOptionXOnTheDoYouWantToAddTheItemsNetWeightPage("No")

      And("I click radio option No on the Do you want to add supplementary units? page")
      andIclickRadioOptionXOnTheDoYouWantToAddSupplementaryUnitsPage("No")

      And("I select (VL) Bulk, liquid on the What type of package are you using for the item? page")
      andIselectOnTheWhatTypeOfPackageAreYouUsingForTheItemPage("(VL) Bulk, liquid")

      And("I click radio option No on the Do you want to add a shipping mark? page")
      andIclickRadioOptionXOnTheDoYouWantToAddAShippingMarkPage("No")

      And("I click radio option No on the You have added 1 type of package page")
      andIclickRadioOptionXOnTheYouHaveAddedXTypesofPackagePage("No", "1")

      And("I click radio option No on the Do you want to add a supply chain actor for this item? page")
      andIclickRadioOptionXOnTheDoYouWantToAddASupplyChainActorForThisItemPage("No")

      And("I click radio option Yes on the You have attached 1 document to this item page")
      andIclickRadioOptionXOnTheYouHaveAttachedXDocumentsToThisItemPage("Yes", "1")

      And(
        "I select Supporting - (C673) Catch certificate - RefNoCL213Doc1 on the Which document do you want to attach? page"
      )
      andIselectOnTheWhichDocumentDoYouWantToAttachPage("Supporting - (C673) Catch certificate - RefNoCL213Doc1")

      And("I click radio option No on the You have attached 2 documents to this item page")
      andIclickRadioOptionXOnTheYouHaveAttachedXDocumentsToThisItemPage("No", "2")

      And("I click radio option No on the Do you want to add an additional reference for this item? page")
      andIclickRadioOptionXOnTheDoYouWantToAddAnAdditionalReferenceForThisItemPage("No")

      And("I click radio option No on the Do you want to add any additional information for this item? page")
      andIclickRadioOptionXOnTheDoYouWantToAddAnyAdditionalInformationForThisItemPage("No")

      And("I submit on the Check your answers section Items page")
      andIsubmitOnTheCheckYourAnswersSectionXPage("Items")

      And("I click radio option No on the You have added 1 item page")
      andIclickRadioOptionXOnTheYouHaveAddedXItemPage("No", "1")

      And("I click the Confirm and send button on the Declaration summary page")
      andIclickTheConfirmAndResendConfirmAndSendButtonOnTheDeclarationSummaryPage()

      And("I click the Sign out link on the Departure declaration sent page")
      andIclickTheLinkOnTheDepartureDeclarationSentPage("Sign out")
    }
  }
}
