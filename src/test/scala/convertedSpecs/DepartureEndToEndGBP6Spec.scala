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
import specsteps.RouteDetailsTransitStepDefSteps.*
import specsteps.SupplyChainActorStepDefSteps.*
import specsteps.TaskListStepDefSteps.*
import specsteps.TraderDetailsStepDefSteps.*
import specsteps.TransportAuthorisationsStepDefSteps.*
import specsteps.TransportDetailsStepDefSteps.*
import specsteps.TransportEquipmentChargesStepDefSteps.*
import org.scalatest.GivenWhenThen
import specsteps.LoginStepDefSteps
import specsteps.ManageStepDefSteps.*
import specsteps.RouteDetailsPlaceOfUnloadingStepDefSteps.*

class DepartureEndToEndGBP6Spec extends BaseSpec with GivenWhenThen{

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
    And("I select GB on the Where is the office of departure page")
    andIselectOnTheWhereIsTheOfficeOfDeparturePage("GB")

  }

  Feature("End to end journey for Great Britain office of departure") {

    Scenario("01 Procedure 'Simplified' - Declaration 'T2' - Security '2 EXS' - Binding itinerary 1 -") {
      And("I choose radio option Simplified on the Which type of procedure are you using? page")
      andIchooseRadioOptionXOnTheWhichTypeOfProcedureAreYouUsingPage("Simplified")
      // --- Other possible matches ---
      // andIchooseRadioOptionXOnTheWhatTypeOfProcedureAreYouUsingPage() [0.76] (IdentificationStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'What type of procedure are you using\?' page

      And("I choose radio option T2 on the Which type of declaration do you want to create? page")
      andIchooseRadioOptionXOnTheWhichTypeOfDeclarationDoYouWantToCreatePage("T2")
      And(
        "I choose radio option Exit summary declaration (EXS) on the Which type of safety and security details do you want to add? page"
      )
      andIchooseRadioOptionXOnTheWhichTypeOfSafetyAndSecurityDetailsDoYouWantToAddPage("Exit summary declaration (EXS)")

      And("I submit the Check your answers page")
      andIsubmitTheCheckYourAnswersPage()

      And("I click the Add trader details link on the Declaration summary page")

      thenIclickTheLinkOnTheDeclarationSummaryPage("Add trader details")
      And("I choose radio option No on the Do you know the transit holder’s EORI number? page")

      andIchooseRadioOptionXOnTheDoYouKnowTheTransitHoldersEORINumberPage("No")

      And("I enter Joe Blog on the What is the transit holder’s name? page")

      andIenterOnTheWhatIsTheTransitHoldersNamePage("Joe Blog")

      And("I select United Kingdom on the Which country is the transit holder based in? page")

      andIselectOnTheWhichCountryIsTheTransitHolderBasedInPage("United Kingdom")

      And("I fill in the address on the What is the transit holder’s address? page")
      andIfillInTheAddressOnTheWhatIsTheTransitHoldersAddressPage()

      And("I choose radio option Yes on the Do you want to add a contact for the transit holder? page")
      andIchooseRadioOptionXOnTheDoYouWantToAddAContactForTheTransitHolderPage("Yes")

      And("I enter John contact on the What is the contact’s name? page")
      andIenterNameOnTheWhatIsTheContactsNamePage("John")

      And("I enter +2112212112 on the What is the phone number for the transit holder’s contact? page")
      andIenterOnTheWhatIsThePhoneNumberForTheTransitHoldersContactPage("+2112212112 ")

      And("I choose radio option No on the Are you acting as a representative? page")
      andIchooseRadioOptionXOnTheAreYouActingAsARepresentativePage("No")
      And("I choose radio option Yes on the Do you want to use a reduced data set? page")
      thenIchooseRadioOptionXOnTheDoYouWantToUseAReducedDataSetPage("Yes")

      And("I choose radio option No on the Do you know the consignor’s EORI number or TIN? page")
      andIchooseRadioOptionXOnTheDoYouKnowTheConsignorsEORINumberOrTINPage("No")
      And("I enter Pip Consignor on the What is the consignor’s name? page")
      andIenterOnTheWhatIsTheConsignorsNamePage("Pip Consignor")

      And("I select United Kingdom on the Which country is the consignor based in? page")
      andIselectOnTheWhichCountryIsTheConsignorBasedInPage("United Kingdom")

      And("I fill in the address on the What is the consignor’s address? page")
      andIfillInTheAddressOnTheWhatIsTheConsignorsAddressPage()

      And("I choose radio option No on the Do you want to add a contact for the consignor? page")
      andIchooseRadioOptionXOnTheDoYouWantToAddAContactForTheConsignorPage("No")
      And("I choose radio option No on the Do you know the consignee’s EORI number or TIN? page")
      andIchooseRadioOptionXOnTheDoYouKnowTheConsigneesEORINumberOrTINPage("No")

      And("I enter Simpson Blog Consignee on the What is the consignee’s name? page")
      andIenterOnTheWhatIsTheConsigneesNamePage("Simpson Blog Consignee")

      And("I select United Kingdom on the Which country is the consignee based in? page")
      andIselectOnTheWhichCountryIsTheConsigneeBasedInPage("United Kingdom")

      And("I fill in the address on the What is the consignee’s address? page")
      andIfillInTheAddressOnTheWhatIsTheConsigneesAddressPage()

      And("I submit on the Check your answers section Trader details page")
      andIsubmitOnTheCheckYourAnswersSectionXPage("Trader details")

      Then("I should be on the Declaration summary page")
      thenIshouldbeOnTheDeclarationSummaryPage()

      And("I should see Completed status for trader details on the Declaration summary page")
      andIshouldSeeXStatusForOnTheDeclarationSummaryPage("Completed", "trader details")

      When("I click the Add route details link on the Declaration summary page")
      thenIclickTheLinkOnTheDeclarationSummaryPage("Add route details")

      And("I choose radio option No on the Do you want to add a specific circumstance indicator? page")
      andIchooseRadioOptionXOnTheDoYouWantToAddASpecificCircumstanceIndicatorPage("No")

      And("I select Italy on the What country is the office of destination in? page")
      andIselectOnTheWhatCountryIsTheOfficeOfDestinationInPage("Italy")
      And("I select IT on the Where in Italy is the office of destination? page")
      andIselectOnTheWhereInIsTheOfficeOfDestinationPage("IT", "Italy")

      And("I choose radio option Yes on the Are you using a binding itinerary? page")
      andIchooseRadioOptionXOnTheAreYouUsingABindingItineraryPage("Yes")

      And("I select Germany on the Which country do you want to add to the transit route? page")
      andIselectOnTheWhichCountryDoYouWantToAddToTheTransitRoutePage("Germany")

      And("I choose radio option Yes on the You have added 1 country to the transit route page")
      // Possible match (best=0.79)
      // andIchooseRadioOptionXOnTheTransitRouteAddCountryPage("Yes")
      // --- Other possible matches ---
      andIchooseRadioOptionXOnTheYouHaveAddedXCountriestoTheTransitRoutePage("Yes", "1")
      // [0.79] (RouteDetailsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'You have added (.*) countr(?:y |ies )to the transit route' page

      And("I select France on the Which country do you want to add to the transit route? page")
      andIselectOnTheWhichCountryDoYouWantToAddToTheTransitRoutePage("France")
      And("I choose radio option Yes on the You have added 2 countries to the transit route page")
      andIchooseRadioOptionXOnTheYouHaveAddedXCountriestoTheTransitRoutePage("Yes", "2")

      And("I select Andorra on the Which country do you want to add to the transit route? page")
      andIselectOnTheWhichCountryDoYouWantToAddToTheTransitRoutePage("Andorra")
      And("I choose radio option No on the You have added 3 countries to the transit route page")
      andIchooseRadioOptionXOnTheYouHaveAddedXCountriestoTheTransitRoutePage("No", "3")

      And("I submit on the Check your answers section Transit route page")
      andIsubmitOnTheCheckYourAnswersSectionXPage("Transit route")

      And("I select Andorra on the Which country is the office of transit in? page")
      andIselectOnTheWhichCountryIsTheOfficeOfTransitInPage("Andorra")

      And(
        "I select CUSTOMS OFFICE SANT JULIÀ DE LÒRIA (AD000001) on the Where in Andorra is the office of transit? page"
      )
      andIselectOnTheWhereInXIsTheOfficeOfTransitPage("CUSTOMS OFFICE SANT JULIÀ DE LÒRIA (AD000001) ", "Andorra")

      And(
        "I choose radio option Yes on the Do you want to add a time of arrival in CUSTOMS OFFICE SANT JULIÀ DE LÒRIA (AD000001)? page"
      )
      andIchooseRadioOptionXOnTheDoYouWantToAddATimeOfArrivalInXPage(
        "Yes",
        "CUSTOMS OFFICE SANT JULIÀ DE LÒRIA (AD000001)"
      )

      And(
        "I choose fill in the date and time on the When do you expect the transit to arrive in CUSTOMS OFFICE SANT JULIÀ DE LÒRIA, Andorra? page"
      )
      andIchooseFillInTheDateAndTimeOnTheWhenDoYouExpectTheTransitToArriveInXXPage(
        "CUSTOMS OFFICE SANT JULIÀ DE LÒRIA",
        "Andorra"
      )

      And("I submit on the Check your answers section Office of transit page")
      // Possible match (best=1.00)
      andIsubmitOnTheCheckYourAnswersSectionXPage("Office of transit")

      And("I choose radio option Yes on the You have added 1 office of transit page")
      // Possible match (best=0.79)
      // andIchooseRadioOptionXOnTheAddOfficeOfTransitPage("Yes")
      // --- Other possible matches ---
      andIchooseRadioOptionXOnTheYouHaveAddedXOfficesOfTransitPage("Yes", "1")
      // [0.76] (RouteDetailsTransitStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'You have added (.*) offices? of transit' page

      And("I select France on the Which country is the office of transit in? page")
      andIselectOnTheWhichCountryIsTheOfficeOfTransitInPage("France")

      And("I select Bastia port (FR000380) on the Where in France is the office of transit? page")
      andIselectOnTheWhereInXIsTheOfficeOfTransitPage("Bastia port (FR000380)", "France")

      And("I choose radio option No on the Do you want to add a time of arrival in Bastia port (FR000380)? page")
      andIchooseRadioOptionXOnTheDoYouWantToAddATimeOfArrivalInXPage("No", "Bastia port (FR000380)")
      And("I submit on the Check your answers section Office of transit page")
      andIsubmitOnTheCheckYourAnswersSectionXPage("Office of transit")

      And("I choose radio option No on the You have added 2 offices of transit page")
      andIchooseRadioOptionXOnTheYouHaveAddedXOfficesOfTransitPage("No", "2")
      And("I enter 1234567890 on the What is the authorisation number for the location of goods? page")
      andIenterOnTheWhatIsTheAuthorisationNumberForTheLocationOfGoodsPage("1234567890")
      And("I choose radio option No on the Do you want to add an additional identifier for the location of goods? page")
      andIchooseRadioOptionXOnTheDoYouWantToAddAnAdditionalIdentifierForTheLocationOfGoodsPage("No")

      And("I choose radio option No on the Do you want to add a contact for the location of goods? page")
      andIchooseRadioOptionXOnTheDoYouWantToAddAContactForTheLocationOfGoodsPage("No")
      And("I submit on the Check your answers section Location of goods page")
      andIsubmitOnTheCheckYourAnswersSectionXPage("Location of goods")

      And("I choose radio option No on the Do you want to add a UN LOCODE for the place of loading? page")
      andIchooseRadioOptionXOnTheDoYouWantToAddAUNLOCODEForThePlaceOfLoadingPage("No")
      And("I select United Kingdom on the In which country is the place of loading? page")
      andIselectOnTheInWhichCountryIsThePlaceOfLoadingPage("United Kingdom")
      And("I enter London on the Where in United Kingdom is the place of loading? page")
      andIenterOnTheWhereInXIsThePlaceOfLoadingPage("London", "United Kingdom")

      And("I choose radio option No on the Do you want to add a place of unloading? page")
      // Possible match (best=0.81)
      andIchooseRadioOptionXOnTheDoYouWantToAddAPlaceOfUnloadingPage("No")
      // --- Other possible matches ---
      // andIchooseRadioOptionXOnTheDoYouWantToAddAPlaceOfUnloadingPage() [0.81] (RouteDetailsPlaceOfUnloadingStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a place of unloading\?' page

      And("I submit on the Check your answers section Places of loading and unloading page")
      andIsubmitOnTheCheckYourAnswersSectionXPage("Places of loading and unloading")

      And("I submit on the Check your answers section Route details page")
      andIsubmitOnTheCheckYourAnswersSectionXPage("Route details")

      Then("I should be on the Declaration summary page")
      thenIshouldbeOnTheDeclarationSummaryPage()

      When("I click the Add guarantee details link on the Declaration summary page")
      thenIclickTheLinkOnTheDeclarationSummaryPage("Add guarantee details")
      And("I choose radio option (A) Guarantee waiver by agreement on the Which type of guarantee is it? page")
      andIchooseRadioOptionXOnTheWhichTypeOfGuaranteeIsItPage("(A) Guarantee waiver by agreement")
      And("I choose radio option No on the You have added 1 guarantee page")
      whenIchooseRadioOptionXOnTheYouHaveAddedXGuaranteesPage("No", "1")

      Then("I should be on the Declaration summary page")
      thenIshouldbeOnTheDeclarationSummaryPage()

      When("I click the Add transport details link on the Declaration summary page")
      thenIclickTheLinkOnTheDeclarationSummaryPage("Add transport details")
      And("I choose radio option Yes on the Do you want to use the same UCR for all items? page")
      andIchooseRadioOptionXOnTheDoYouWantToUseTheSameUCRForAllItemsPage("Yes")

      And("I enter GB123456123456 on the What is the UCR? page")
      andIenterOnTheWhatIsTheUCRPage("GB123456123456")

      And("I choose radio option Yes on the Are all the items being dispatched from the same country? page")
      andIchooseRadioOptionXOnTheAreAllTheItemsBeingDispatchedFromTheSameCountryPage("Yes")

      And("I select United Kingdom on the What is the country of dispatch? page")
      andIselectOnTheWhatIsTheCountryOfDispatchPage("United Kingdom")
      And(
        "I choose radio option Yes on the Are the goods being transported to another country after the end of this transit movement? page"
      )
      andIchooseRadioOptionXOnTheAreTheGoodsBeingTransportedToAnotherCountryAfterTheEndOfThisTransitMovementPage("Yes")

      And("I choose radio option Yes on the Are all the items being transported to the same country? page")
      andIchooseRadioOptionXOnTheAreAllTheItemsBeingTransportedToTheSameCountryPage("Yes")

      And("I select Italy on the transport details What country are the items being transported to? page")
      andIselectOnTheTransportDetailsWhatCountryAreTheItemsBeingTransportedToPage("Italy")

      And("I choose radio option Yes on the Are you using any shipping containers to transport the goods? page")
      andIchooseRadioOptionXOnTheAreYouUsingAnyShippingContainersToTransportTheGoodsPage("Yes")
      And("I choose radio option No on the Do you want to add an inland mode of transport? page")
      andIchooseRadioOptionXOnTheDoYouWantToAddAnInlandModeOfTransportPage("No")
      And(
        "I choose radio option Name of a sea-going vessel on the inland mode Which identification do you want to use for this vehicle? page"
      )
      andIchooseRadioOptionXOnTheInlandModeWhichIdentificationDoYouWantToUseForThisVehiclePage(
        "Name of a sea-going vessel"
      )
      And("I enter registration number GB1234567 on the What is the identification number for this? page")
      andIenterRegistrationNumberOnTheWhatIsTheIdentificationNumberForThisPage("GB1234567")

      And("I select United Kingdom on the inland mode What country is this vehicle registered to? page")
      andIselectOnTheInlandModeWhatCountryIsThisVehicleRegisteredToPage("United Kingdom")
      And("I submit on the Check your answers section Departure means of transport page")
      andIsubmitOnTheCheckYourAnswersSectionXPage("Departure means of transport")

      And("I select radio option No on the You have added 1 departure means of transport page")
      andIselectRadioOptionXOnTheYouHaveAddedDepartureMeansOfTransportPage("No", "1")
      And("I choose radio option Sea on the How is the transit crossing the border? page")
      andIchooseRadioOptionXOnTheHowIsTheTransitCrossingTheBorderPage("Sea")
      And(
        "I choose radio option Name of a sea-going vessel on the border mode Which identification do you want to use for this vehicle? page"
      )
      andIchooseRadioOptionXOnTheBorderModeWhichIdentificationDoYouWantToUseForThisVehiclePage(
        "Name of a sea-going vessel"
      )
      And("I enter identification GB1234567 on the What is the identification number for this? page")
      andIenterIdentificationOnTheWhatIsTheIdentificationNumberForThisPage("GB1234567")

      And("I select United Kingdom on the border mode What country is this vehicle registered to? page")
      andIselectOnTheBorderModeWhatCountryIsThisVehicleRegisteredToPage("United Kingdom")
      And("I select Bastia port (FR000380) on the Where is the customs office at the border? page")
      andIselectOnTheWhereIsTheCustomsOfficeAtTheBorderPage("Bastia port (FR000380)")
      And("I choose radio option No on the Do you want to add a conveyance reference number? page")
      andIchooseRadioOptionXOnTheDoYouWantToAddAConveyanceReferenceNumberPage("No")
      And("I submit on the Check your answers section Border means of transport page")
      andIsubmitOnTheCheckYourAnswersSectionXPage("Border means of transport")

      And("I choose radio option No on the You have added 1 border means of transport page")
      whenIchooseRadioOptionXOnTheYouHaveAddedXBorderMeansOfTransportPage("No", "1")
      And("I submit on the Check your answers section Modes and means of transport page")
      andIsubmitOnTheCheckYourAnswersSectionXPage("Modes and means of transport")

      And("I choose radio option Yes on the Do you want to add a supply chain actor for all items? page")
      andIchooseRadioOptionXOnTheDoYouWantToAddASupplyChainActorForAllItemsPage("Yes")
      And("I choose radio option Consolidator on the Which type of supply chain actor do you want to add? page")
      andIchooseRadioOptionXOnTheWhichTypeOfSupplyChainActorDoYouWantToAddPage("Consolidator")
      And(
        "I enter FR98472189002 on the What is the EORI number or Third Country Unique Identification Number TCUIN for the consolidator? page"
      )
      andIenterOnTheWhatIsTheEORINumberOrThirdCountryUniqueIdentificationNumberTCUINForTheXPage(
        "FR98472189002",
        "consolidator"
      )
      And("I choose radio option No on the You have added 1 supply chain actor page")
      andIchooseRadioOptionXOnTheYouHaveAddedSupplyChainActorsPage("No", "1")
      And("I enter ACR123 reference number on the What is the reference number for the ACR authorisation? page")
      andIenterReferenceNumberOnTheWhatIsTheReferenceNumberForTheAuthorisationPage("ACR123", "ACR")
      And("I enter TRD123 reference number on the What is the reference number for the TRD authorisation? page")
      andIenterReferenceNumberOnTheWhatIsTheReferenceNumberForTheAuthorisationPage("TRD123", "TRD")
      And("I choose radio option No on the You have added 2 transport authorisations page")
      whenIchooseRadioOptionXOnTheYouHaveAddedTransportAuthorisationsPage("No", "2")
      And("I enter the date on the When do you expect the transit to arrive in Abruzzo - Pescara (IT406100)? page")
      andIenterTheDateOnTheWhenDoYouExpectTheTransitToArriveInXPage("Abruzzo - Pescara (IT406100)")
      When("I choose radio option No on the Do you want to add a carrier? page")
      andIChooseRadioOptionXOnTheDoYouWantToAddACarrierPage("No")
      And("I enter C001 on the What is the container identification number? page")
      andIenterOnTheWhatIsTheContainerIdentificationNumberPage("C001")
      And("I choose radio option No on the Do you want to add a seal? page")
      andIchooseRadioOptionXOnTheDoYouWantToAddASealPage("No")
      And("I submit on the Check your answers section Transport equipment page")
      andIsubmitOnTheCheckYourAnswersSectionXPage("Transport equipment")
      And("I choose radio option No on the You have added 1 transport equipment page")
      andIchooseRadioOptionXOnTheYouHaveAddedXTransportEquipmentPage("No", "1")
      And("I choose radio option Yes on the Do you want to add a method of payment for transport charges? page")
      andIchooseRadioOptionXOnTheDoYouWantToAddAMethodOfPaymentForTransportChargesPage("Yes")
      And(
        "I choose radio option Credit card on the Which method of payment do you want to use for transport charges? page"
      )
      andIchooseRadioOptionXOnTheWhichMethodOfPaymentDoYouWantToUseForTransportChargesPage("Credit card")
      And("I click radio option No on the Do you want to add an additional reference for all items? page")
      andIclickRadioOptionXOnTheDoYouWantToAddAnAdditionalReferenceForAllItemsPage("No")
      And("I click radio option No on the Do you want to add any additional information for all items? page")
      andIclickRadioOptionXOnTheDoYouWantToAddAnyAdditionalInformationForAllItemsPage("No")
      And("I submit on the Check your answers section Transport details page")
      andIsubmitOnTheCheckYourAnswersSectionXPage("Transport details")
      Then("I should be on the Declaration summary page")
      thenIshouldbeOnTheDeclarationSummaryPage()
      When("I click the Add documents link on the Declaration summary page")
      thenIclickTheLinkOnTheDeclarationSummaryPage("Add documents")
      And("I click radio option No on the Do you want to use this document for all items? page")
      andIclickRadioOptionXOnTheDoYouWantToUseThisDocumentForAllItemsPage("No")
      Then("I select Previous - (C605) Information sheet INF3 on the What previous document do you want to add? page")
      andIselectOnTheWhatPreviousDocumentDoYouWantToAddPage("Previous - (C605) Information sheet INF3")
      And("I enter 1234 on the What is the document’s reference number? page")
      andIenterOnTheWhatIsTheDocumentsReferenceNumberPage("1234")
      And("I click radio option No on the Do you want to add any additional information for this document? page")
      andIclickRadioOptionXOnTheDoYouWantToAddAnyAdditionalInformationForThisDocumentPage("No")
      And("I submit on the Check your answers section Documents page")
      andIsubmitOnTheCheckYourAnswersSectionXPage("Documents")
      And("I choose radio option Yes on the You have added 1 document page")
      andIchooseRadioOptionXOnTheYouHaveAddedXDocumentsPage("Yes", "1")
      And("I click radio option No on the Do you want to use this document for all items? page")
      andIclickRadioOptionXOnTheDoYouWantToUseThisDocumentForAllItemsPage("No")
      And("I select Supporting - (N003) Certificate of quality on the What type of document do you want to add? page")
      andIselectOnTheWhatTypeOfDocumentDoYouWantToAddPage("Supporting - (N003) Certificate of quality")
      And("I enter 98765 on the What is the document’s reference number? page")
      andIenterOnTheWhatIsTheDocumentsReferenceNumberPage("98765")
      And("I click radio option No on the Do you want to add a line item number? page")
      andIclickRadioOptionXOnTheDoYouWantToAddALineItemNumberPage("No")
      And("I click radio option No on the Do you want to add any additional information for this document? page")
      andIclickRadioOptionXOnTheDoYouWantToAddAnyAdditionalInformationForThisDocumentPage("No")
      And("I submit on the Check your answers section Documents page")
      andIsubmitOnTheCheckYourAnswersSectionXPage("Documents")
      And("I choose radio option Yes on the You have added 2 documents page")
      andIchooseRadioOptionXOnTheYouHaveAddedXDocumentsPage("Yes", "2")
      And("I click radio option Yes on the Do you want to use this document for all items? page")
      andIclickRadioOptionXOnTheDoYouWantToUseThisDocumentForAllItemsPage("Yes")
      Then("I select Transport - (N741) Master airwaybill on the What type of document do you want to add? page")
      andIselectOnTheWhatTypeOfDocumentDoYouWantToAddPage("Transport - (N741) Master airwaybill")
      And("I enter 1234 on the What is the document’s reference number? page")
      andIenterOnTheWhatIsTheDocumentsReferenceNumberPage("1234")
      And("I submit on the Check your answers section Documents page")
      andIsubmitOnTheCheckYourAnswersSectionXPage("Documents")
      Then("I choose radio option No on the You have added 3 documents page")
      andIchooseRadioOptionXOnTheYouHaveAddedXDocumentsPage("No", "3")
      When("I click the Add items link on the Declaration summary page")
      thenIclickTheLinkOnTheDeclarationSummaryPage("Add items")
      And("I enter This is a description on the Enter a description of item 1 page")
      andIenterXOnTheEnterADescriptionOfItemXPage("This is a description", "1")
      And("I select (1) Transport equipment - C001 on the Which transport equipment are you using for this item? page")
      andIselectOnTheWhichTransportEquipmentAreYouUsingForThisItemPage("(1) Transport equipment - C001")
      And("I click radio option No on the Do you want to add a Customs Union and Statistics code? page")
      andIclickRadioOptionXOnTheDoYouWantToAddACustomsUnionAndStatisticsCodePage("No")
      And("I enter 010130 on the What is the commodity code? page")
      andIenterXOnTheWhatIsTheCommodityCodePage("010130")
      And("I click radio option No on the Does the item contain any dangerous goods? page")
      andIclickRadioOptionXOnTheDoesTheItemContainAnyDangerousGoodsPage("No")
      And("I enter 100 on the What is the item’s gross weight? page")
      andIenterXOnTheWhatIsTheItemsGrossWeightPage("100")
      And("I click radio option No on the Do you want to add supplementary units? page")
      andIclickRadioOptionXOnTheDoYouWantToAddSupplementaryUnitsPage("No")
      And("I select (NE) Unpacked or unpackaged on the What type of package are you using for the item? page")
      andIselectOnTheWhatTypeOfPackageAreYouUsingForTheItemPage("(NE) Unpacked or unpackaged")
      And("I enter 1 on the How many of these are you using? page")
      andIenterXOnTheHowManyOfTheseAreYouUsingPage("1")
      And("I click radio option No on the Do you want to add a shipping mark? page")
      andIclickRadioOptionXOnTheDoYouWantToAddAShippingMarkPage("No")
      And("I click radio option No on the You have added 1 types of package page")
      andIclickRadioOptionXOnTheYouHaveAddedXTypesofPackagePage("No", "1")
      And("I click radio option No on the Do you want to add a supply chain actor for this item? page")
      andIclickRadioOptionXOnTheDoYouWantToAddASupplyChainActorForThisItemPage("No")
      And("I select Previous - (C605) Information sheet INF3 on the Which document do you want to attach? page")
      andIselectOnTheWhichDocumentDoYouWantToAttachPage("Previous - (C605) Information sheet INF3")
      And("I click radio option No on the You have attached 2 documents to this item page")
      andIclickRadioOptionXOnTheYouHaveAttachedXDocumentsToThisItemPage("No", "2")
      And("I click radio option No on the Do you want to add an additional reference for this item? page")
      andIclickRadioOptionXOnTheDoYouWantToAddAnAdditionalReferenceForThisItemPage("No")
      And("I click radio option No on the Do you want to add any additional information for this item? page")
      andIclickRadioOptionXOnTheDoYouWantToAddAnyAdditionalInformationForThisItemPage("No")
      And("I submit on the Check your answers section Items page")
      andIsubmitOnTheCheckYourAnswersSectionXPage("Items")
      And("I click radio option Yes on the You have added 1 item page")
      andIclickRadioOptionXOnTheYouHaveAddedXItemPage("Yes", "1")
      And("I enter This is a description on the Enter a description of item 2 page")
      andIenterXOnTheEnterADescriptionOfItemXPage("This is a description ", "2")
      And("I select (1) Transport equipment - C001 on the Which transport equipment are you using for this item? page")
      andIselectOnTheWhichTransportEquipmentAreYouUsingForThisItemPage("(1) Transport equipment - C001")
      And("I click radio option No on the Do you want to add a Customs Union and Statistics code? page")
      andIclickRadioOptionXOnTheDoYouWantToAddACustomsUnionAndStatisticsCodePage("No")
      And("I enter 010130 on the What is the commodity code? page")
      andIenterXOnTheWhatIsTheCommodityCodePage("010130")
      And("I click radio option No on the Does the item contain any dangerous goods? page")
      andIclickRadioOptionXOnTheDoesTheItemContainAnyDangerousGoodsPage("No")
      And("I enter 0 on the What is the item’s gross weight? page")
      andIenterXOnTheWhatIsTheItemsGrossWeightPage("0")
      And("I click the continue button on the Before you continue page")
      andIclickTheContinueButtonOnTheBeforeYouContinuePage()
      And("I click radio option No on the Do you want to add supplementary units? page")
      andIclickRadioOptionXOnTheDoYouWantToAddSupplementaryUnitsPage("No")
      And("I select (NE) Unpacked or unpackaged on the What type of package are you using for the item? page")
      andIselectOnTheWhatTypeOfPackageAreYouUsingForTheItemPage("(NE) Unpacked or unpackaged")
      And("I enter 1 on the How many of these are you using? page")
      andIenterXOnTheHowManyOfTheseAreYouUsingPage("1")
      And("I click radio option No on the Do you want to add a shipping mark? page")
      andIclickRadioOptionXOnTheDoYouWantToAddAShippingMarkPage("No")
      And("I click radio option No on the You have added 1 types of package page")
      andIclickRadioOptionXOnTheYouHaveAddedXTypesofPackagePage("No", "1")
      And("I click radio option No on the Do you want to add a supply chain actor for this item? page")
      andIclickRadioOptionXOnTheDoYouWantToAddASupplyChainActorForThisItemPage("No")
      And("I select Previous - (C605) Information sheet INF3 - 1234 on the Which document do you want to attach? page")
      andIselectOnTheWhichDocumentDoYouWantToAttachPage("Previous - (C605) Information sheet INF3 - 1234")
      And("I click radio option No on the You have attached 2 document to this item page")
      andIclickRadioOptionXOnTheYouHaveAttachedXDocumentsToThisItemPage("No", "2")
      And("I click radio option No on the Do you want to add an additional reference for this item? page")
      andIclickRadioOptionXOnTheDoYouWantToAddAnAdditionalReferenceForThisItemPage("No")
      And("I click radio option No on the Do you want to add any additional information for this item? page")
      andIclickRadioOptionXOnTheDoYouWantToAddAnyAdditionalInformationForThisItemPage("No")
      And("I submit on the Check your answers section Items page")
      andIsubmitOnTheCheckYourAnswersSectionXPage("Items")
      And("I click radio option No on the You have added 2 item page")
      andIclickRadioOptionXOnTheYouHaveAddedXItemPage("No", "2")
      And("I click the Confirm and send button on the Declaration summary page")
      andIclickTheConfirmAndResendConfirmAndSendButtonOnTheDeclarationSummaryPage()
      And("I click the Sign out link on the Departure declaration sent page")
      andIclickTheLinkOnTheDepartureDeclarationSentPage("Sign out")

    }

    Scenario(
      "02 Procedure 'Normal'- Declaration 'T' - Security '0 No security' - Required document is missing - Declaration 'T' - Item declaration type T2 - Item Level Previous document added"
    ) {
      And("I choose radio option Normal on the Which type of procedure are you using? page")
      // Possible match (best=0.80)
      andIchooseRadioOptionXOnTheWhichTypeOfProcedureAreYouUsingPage("Normal")
      // --- Other possible matches ---
      // andIchooseRadioOptionXOnTheWhatTypeOfProcedureAreYouUsingPage() [0.76] (IdentificationStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'What type of procedure are you using\?' page

      And("I choose radio option T on the Which type of declaration do you want to create? page")
      andIchooseRadioOptionXOnTheWhichTypeOfDeclarationDoYouWantToCreatePage("T")

      And("I choose radio option No security on the Which type of safety and security details do you want to add? page")
      // Possible match (best=0.82)
      andIchooseRadioOptionXOnTheWhichTypeOfSafetyAndSecurityDetailsDoYouWantToAddPage("No security")
      // --- Other possible matches ---
      // andIchooseRadioOptionXOnTheWhichTypeOfAuthorisationDoYouWantToAddPage() [0.77] (TransportAuthorisationsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Which type of authorisation do you want to add' page

      And("I submit the Check your answers page")
      andIsubmitTheCheckYourAnswersPage()
      And("I click the Add trader details link on the Declaration summary page")
      thenIclickTheLinkOnTheDeclarationSummaryPage("Add trader details")
      And("I choose radio option Yes on the Do you know the transit holder’s EORI number? page")
      andIchooseRadioOptionXOnTheDoYouKnowTheTransitHoldersEORINumberPage("Yes")
      And("I enter GB123456123456 on the What is the transit holder’s EORI number? page")
      andIenterOnTheWhatIsTheTransitHoldersEORINumberPage("GB123456123456")
      And("I choose radio option No on the Do you want to add a contact for the transit holder? page")
      andIchooseRadioOptionXOnTheDoYouWantToAddAContactForTheTransitHolderPage("No")
      And("I choose radio option No on the Are you acting as a representative? page")
      andIchooseRadioOptionXOnTheAreYouActingAsARepresentativePage("No")
      And("I choose radio option No on the Do you want to use a reduced data set? page")
      thenIchooseRadioOptionXOnTheDoYouWantToUseAReducedDataSetPage("No")
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
      When("I click the Add route details link on the Declaration summary page")
      thenIclickTheLinkOnTheDeclarationSummaryPage("Add route details")
      And("I select Italy on the What country is the office of destination in? page")
      andIselectOnTheWhatCountryIsTheOfficeOfDestinationInPage("Italy")
      And("I select IT on the Where in Italy is the office of destination? page")
      andIselectOnTheWhereInIsTheOfficeOfDestinationPage("IT", "Italy")
      And("I choose radio option No on the Are you using a binding itinerary? page")
      andIchooseRadioOptionXOnTheAreYouUsingABindingItineraryPage("No")
      And("I choose radio option No on the transit route add country page")
      andIchooseRadioOptionXOnTheTransitRouteAddCountryPage("No")
      And("I submit on the Check your answers section Transit route page")
      andIsubmitOnTheCheckYourAnswersSectionXPage("Transit route")
      And("I choose radio option Yes on the Does the transit include any T2 declarations? page")
      andIchooseRadioOptionXOnTheDoesTheTransitIncludeAnyT2DeclarationsPage("Yes")
      And("I select France on the Which country is the office of transit in? page")
      andIselectOnTheWhichCountryIsTheOfficeOfTransitInPage("France")
      And("I select Brest bureau (FR000690) on the Where in France is the office of transit? page")
      andIselectOnTheWhereInXIsTheOfficeOfTransitPage("Brest bureau (FR000690)", "France")
      And("I choose radio option No on the Do you want to add a time of arrival in Brest bureau (FR000690)? page")
      andIchooseRadioOptionXOnTheDoYouWantToAddATimeOfArrivalInXPage("No", "Brest bureau (FR000690)")
      And("I submit on the Check your answers section Office of transit page")
      andIsubmitOnTheCheckYourAnswersSectionXPage("Office of transit")
      And("I choose radio option No on the You have added 1 office of transit page")
      // Possible match (best=0.79)
      // andIchooseRadioOptionXOnTheAddOfficeOfTransitPage("No")
      // --- Other possible matches ---
      andIchooseRadioOptionXOnTheYouHaveAddedXOfficesOfTransitPage("No", "1")
      // [0.76] (RouteDetailsTransitStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'You have added (.*) offices? of transit' page

      And("I choose radio option Approved place on the Which type of location is it? page")
      andIchooseRadioOptionXOnTheWhichTypeOfLocationIsItPage("Approved place")
      And("I choose radio option GPS coordinates on the How do you want to identify the location of goods? page")
      andIchooseRadioOptionXOnTheHowDoYouWantToIdentifyTheLocationOfGoodsPage("GPS coordinates")
      And("I enter 50.96622 and 1.86211 on the What are the coordinates for the location of goods page")
      andIenterAndOnTheWhatAreTheCoordinatesForTheLocationOfGoodsPage("50.96622", "1.86211")
      And("I choose radio option No on the Do you want to add a contact for the location of goods? page")
      andIchooseRadioOptionXOnTheDoYouWantToAddAContactForTheLocationOfGoodsPage("No")
      And("I submit on the Check your answers section Location of goods page")
      andIsubmitOnTheCheckYourAnswersSectionXPage("Location of goods")
      And("I choose radio option No on the Do you want to add a UN LOCODE for the place of loading? page")
      andIchooseRadioOptionXOnTheDoYouWantToAddAUNLOCODEForThePlaceOfLoadingPage("No")
      And("I select United Kingdom on the In which country is the place of loading? page")
      andIselectOnTheInWhichCountryIsThePlaceOfLoadingPage("United Kingdom")
      And("I enter London on the Where in United Kingdom is the place of loading? page")
      andIenterOnTheWhereInXIsThePlaceOfLoadingPage("London", "United Kingdom")
      And("I submit on the Check your answers section Places of loading and unloading page")
      andIsubmitOnTheCheckYourAnswersSectionXPage("Places of loading and unloading")
      And("I submit on the Check your answers section Route details page")
      andIsubmitOnTheCheckYourAnswersSectionXPage("Route details")
      Then("I should be on the Declaration summary page")
      thenIshouldbeOnTheDeclarationSummaryPage()
      When("I click the Add guarantee details link on the Declaration summary page")
      thenIclickTheLinkOnTheDeclarationSummaryPage("Add guarantee details")
      And("I choose radio option (3) Individual guarantee in cash on the Which type of guarantee is it? page")
      andIchooseRadioOptionXOnTheWhichTypeOfGuaranteeIsItPage("(3) Individual guarantee in cash")
      And("I choose radio option Yes on the Do you want to add a reference for the guarantee? page")
      andIchooseRadioOptionXOnTheDoYouWantToAddAReferenceForTheGuaranteePage("Yes")
      And("I enter 01GB123456789012 on the What is the reference for the guarantee? page")
      andIenterOnTheWhatIsTheReferenceForTheGuaranteePage("01GB123456789012")
      And("I select GBP on the What currency do you want to use for the liability? page")
      andIselectOnTheWhatCurrencyDoYouWantToUseForTheLiabilityPage("GBP")
      And("I enter 0 on the How much is the liability in pounds? page")
      andIenterOnTheHowMuchIsTheLiabilityInPoundsPage("0")
      And("I choose radio option No on the Do you want to use the default liability amount of 10000 euros? page")
      andIchooseRadioOptionXOnTheDoYouWantToUseTheDefaultLiabilityAmountOf10000EurosPage("No")
      And("I enter 1299.99 on the How much is the liability in pounds? page")
      andIenterOnTheHowMuchIsTheLiabilityInPoundsPage("1299.99")
      And("I submit on the Check your answers section Guarantee details page")
      andIsubmitOnTheCheckYourAnswersSectionXPage("Guarantee details")
      And("I choose radio option No on the You have added 1 guarantee page")
      whenIchooseRadioOptionXOnTheYouHaveAddedXGuaranteesPage("No", "1")
      Then("I should be on the Declaration summary page")
      thenIshouldbeOnTheDeclarationSummaryPage()
      When("I click the Add transport details link on the Declaration summary page")
      thenIclickTheLinkOnTheDeclarationSummaryPage("Add transport details")

      // --- Other possible matches ---
      // thenIclickOnTheLinkOnTheDeclarationSummaryPage() [0.79] (TaskListStepDefSteps.scala) pattern: (?:I )?click on the (.+) link on the 'Declaration summary' page

      And("I choose radio option No on the Do you want to use the same UCR for all items? page")
      andIchooseRadioOptionXOnTheDoYouWantToUseTheSameUCRForAllItemsPage("No")
      And("I choose radio option No on the Are all the items being dispatched from the same country? page")
      andIchooseRadioOptionXOnTheAreAllTheItemsBeingDispatchedFromTheSameCountryPage("No")
      And(
        "I choose radio option No on the Are the goods being transported to another country after the end of this transit movement? page"
      )
      andIchooseRadioOptionXOnTheAreTheGoodsBeingTransportedToAnotherCountryAfterTheEndOfThisTransitMovementPage("No")
      And("I choose radio option No on the Are you using any shipping containers to transport the goods? page")
      andIchooseRadioOptionXOnTheAreYouUsingAnyShippingContainersToTransportTheGoodsPage("No")
      And("I choose radio option Yes on the Do you want to add an inland mode of transport? page")
      andIchooseRadioOptionXOnTheDoYouWantToAddAnInlandModeOfTransportPage("Yes")
      And("I choose radio option Air on the Which inland mode of transport are you using? page")
      andIchooseRadioOptionXOnTheWhichInlandModeOfTransportAreYouUsingPage("Air")
      And(
        "I choose radio option IATA flight number on the inland mode Which identification do you want to use for this vehicle? page"
      )
      andIchooseRadioOptionXOnTheInlandModeWhichIdentificationDoYouWantToUseForThisVehiclePage("IATA flight number")
      And("I enter registration number 1234567 on the What is the identification number for this? page")
      andIenterRegistrationNumberOnTheWhatIsTheIdentificationNumberForThisPage("1234567")
      And("I select United Kingdom on the border mode What country is this vehicle registered to? page")
      andIselectOnTheBorderModeWhatCountryIsThisVehicleRegisteredToPage("United Kingdom")
      And("I submit on the Check your answers section Departure means of transport page")
      andIsubmitOnTheCheckYourAnswersSectionXPage("Departure means of transport")
      And("I select radio option No on the You have added 1 departure means of transport page")
      andIselectRadioOptionXOnTheYouHaveAddedDepartureMeansOfTransportPage("No", "1")
      And("I choose radio option Yes on Do you want to add a border mode of transport? page")
      andIchooseRadioOptionXOnDoYouWantToAddABorderModeOfTransportPage("Yes")
      And("I choose radio option Air on the How is the transit crossing the border? page")
      andIchooseRadioOptionXOnTheHowIsTheTransitCrossingTheBorderPage("Air")
      And("I choose radio option No on the border means Do you want to add identification for this vehicle? page")
      andIchooseRadioOptionXOnTheBorderMeansDoYouWantToAddIdentificationForThisVehiclePage("No")
      And("I submit on the Check your answers section Modes and means of transport page")
      andIsubmitOnTheCheckYourAnswersSectionXPage("Modes and means of transport")
      When("I choose radio option No on the Do you want to add a supply chain actor for all items? page")
      andIchooseRadioOptionXOnTheDoYouWantToAddASupplyChainActorForAllItemsPage("No")
      When("I choose radio option No on the Do you want to add a carrier? page")
      andIChooseRadioOptionXOnTheDoYouWantToAddACarrierPage("No")
      And("I choose radio option No on the Do you want to add any transport equipment? page")
      andIchooseRadioOptionXOnTheDoYouWantToAddAnyTransportEquipmentPage("No")
      And("I click radio option No on the Do you want to add an additional reference for all items? page")
      andIclickRadioOptionXOnTheDoYouWantToAddAnAdditionalReferenceForAllItemsPage("No")
      And("I click radio option No on the Do you want to add any additional information for all items? page")
      andIclickRadioOptionXOnTheDoYouWantToAddAnyAdditionalInformationForAllItemsPage("No")
      And("I submit on the Check your answers section Transport details page")
      andIsubmitOnTheCheckYourAnswersSectionXPage("Transport details")
      Then("I should be on the Declaration summary page")
      thenIshouldbeOnTheDeclarationSummaryPage()
      When("I click the Add documents link on the Declaration summary page")
      thenIclickTheLinkOnTheDeclarationSummaryPage("Add documents")
      And("I click radio option No on the Do you want to add any documents? page")
      andIclickRadioOptionXOnTheDoYouWantToAddAnyDocumentsPage("No")
      When("I click the Add items link on the Declaration summary page")
      thenIclickTheLinkOnTheDeclarationSummaryPage("Add items")
      And("I enter This is a description on the Enter a description of item 1 page")
      andIenterXOnTheEnterADescriptionOfItemXPage("This is a description ", "1")
      And("I choose radio option T2 on the Which type of declaration do you want to create for this item? page")
      andIchooseRadioOptionXOnTheWhichTypeOfDeclarationDoYouWantToCreateForThisItemPage("T2")
      And("I select United Kingdom on the What is the item’s country of dispatch? page")
      andIselectOnTheWhatIsTheItemsCountryOfDispatchPage("United Kingdom")
      And("I select Italy on the What is the item’s country of destination? page")
      andIselectOnTheWhatIsTheItemsCountryOfDestinationPage("Italy")
      And("I enter UCR12312 on the What is the Unique Consignment Reference? page")
      andIenterXOnTheWhatIsTheUniqueConsignmentReferencePage("UCR12312")
      And("I click radio option No on the Do you want to add a Customs Union and Statistics code? page")
      andIclickRadioOptionXOnTheDoYouWantToAddACustomsUnionAndStatisticsCodePage("No")
      And("I enter 010130 on the What is the commodity code? page")
      andIenterXOnTheWhatIsTheCommodityCodePage("010130")
      And("I click radio option No on the Does the item contain any dangerous goods? page")
      andIclickRadioOptionXOnTheDoesTheItemContainAnyDangerousGoodsPage("No")
      And("I enter 100 on the What is the item’s gross weight? page")
      andIenterXOnTheWhatIsTheItemsGrossWeightPage("100")
      And("I click radio option No on the Do you want to add the item’s net weight? page")
      andIclickRadioOptionXOnTheDoYouWantToAddTheItemsNetWeightPage("No")
      And("I click radio option No on the Do you want to add supplementary units? page")
      andIclickRadioOptionXOnTheDoYouWantToAddSupplementaryUnitsPage("No")
      And("I select (AE) Aerosol on the What type of package are you using for the item? page")
      andIselectOnTheWhatTypeOfPackageAreYouUsingForTheItemPage("(AE) Aerosol")
      And("I enter 10 on the How many of these are you using? page")
      andIenterXOnTheHowManyOfTheseAreYouUsingPage("10")
      And("I enter This is a description on the What is the shipping mark? page")
      andIenterXOnTheWhatIsTheShippingMarkPage("This is a description ")
      And("I click radio option No on the You have added 1 type of package page")
      andIclickRadioOptionXOnTheYouHaveAddedXTypesofPackagePage("No", "1")
      And("I click radio option No on the Do you want to add a supply chain actor for this item? page")
      andIclickRadioOptionXOnTheDoYouWantToAddASupplyChainActorForThisItemPage("No")
      And(
        "I click the Go to your Documents section to add another document link on the You do not have any previous documents to attach page"
      )
      andIclickTheGoToYourDocumentsSectionToAddAnotherDocumentLinkOnTheYouDoNotHaveAnyPreviousDocumentsToAttachPage()
      Then("I select Previous - (C605) Information sheet INF3 on the What previous document do you want to add? page")
      andIselectOnTheWhatPreviousDocumentDoYouWantToAddPage("Previous - (C605) Information sheet INF3")
      And("I enter 1234 on the What is the document’s reference number? page")
      andIenterOnTheWhatIsTheDocumentsReferenceNumberPage("1234")
      And("I click radio option No on the Do you want to add any additional information for this document? page")
      andIclickRadioOptionXOnTheDoYouWantToAddAnyAdditionalInformationForThisDocumentPage("No")
      And("I submit on the Check your answers section Documents page")
      andIsubmitOnTheCheckYourAnswersSectionXPage("Documents")
      And("I choose radio option No on the You have added 1 documents page")
      andIchooseRadioOptionXOnTheYouHaveAddedXDocumentsPage("No", "1")
      And("I click the Edit items link on the Declaration summary page")
      thenIclickTheLinkOnTheDeclarationSummaryPage("Edit items")
      And("I select Previous - (C605) Information sheet INF3 - 1234 on the Which document do you want to attach? page")
      andIselectOnTheWhichDocumentDoYouWantToAttachPage("Previous - (C605) Information sheet INF3 - 1234")
      And("I click radio option No on the You have attached 1 documents to this item page")
      andIclickRadioOptionXOnTheYouHaveAttachedXDocumentsToThisItemPage("No", "1")
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
