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

import specsteps.ItemDetailsStepDefSteps.*
import specsteps.UnloadingStepDefSteps.*
import org.scalatest.{BeforeAndAfterEach, GivenWhenThen}
import specsteps.ArrivalNotificationsStepDefSteps.andIClickOnTheXLinkForMRNXOnTheArrivalNotificationsPage
import specsteps.CommonStepDefSteps.andISignOut
import specsteps.LoginStepDefSteps.andILoginWithIDX
import specsteps.ManageStepDefSteps.*

class UnloadingCrossAddRemoveModeSpec extends BaseSpec with GivenWhenThen with BeforeAndAfterEach {

  override def beforeEach(): Unit = {
    dropCollections()
    deleteCookies()
    Given("I login with ID 1234567890")
    andILoginWithIDX("1234567890")
    When("I submit an Phase6 IE007 Arrival Notification")
    givenIsubmitAFile("Phase6 IE007 Arrival Notification")
    And("I submit an IE043 Unloading Permission With Seals")
    givenIsubmitAFile("IE043 Unloading Permission With Seals")
    When("I click on the View arrival notifications link on the Manage your transit movements page")
    givenIclickOnTheLinkOnTheManageYourTransitMovementsPage("View arrival notifications")
    And("I click on the Make unloading remarks link for MRN 25GB000246TK0E6WJ1 on the Arrival notifications page")
    andIClickOnTheXLinkForMRNXOnTheArrivalNotificationsPage("Make unloading remarks", "25GB000246TK0E6WJ1")
    And("I choose radio option No on the Do you want to use the revised unloading procedure? page")
    andIchooseRadioOptionXOnTheDoYouWantToUseTheRevisedUnloadingProcedurePage("No")
    Then("I click the Continue button on the Unload the goods and note any discrepancies page")
    andIclickTheContinueButtonOnTheUnloadTheGoodsAndNoteAnyDiscrepanciesPage()
    And("I choose radio option fully on the Have you fully or partially unloaded the goods? page")
    andIchooseRadioOptionXOnTheHaveYouFullyOrPartiallyUnloadedTheGoodsPage("fully")
    And("I fill in the date on the When were the goods unloaded? page")
    andIfillInTheDateOnTheWhenWereTheGoodsUnloadedPage()
    And("I choose radio option Yes on the Are all the seal identification numbers or marks readable? page")
    andIchooseRadioOptionXOnTheAreAllTheSealIdentificationNumbersOrMarksReadablePage("Yes")
    And("I choose radio option No on the Are any of the seals broken? page")
    andIchooseRadioOptionXOnTheAreAnyOfTheSealsBrokenPage("No")
    And(
      "I choose radio option No on the Were there any discrepancies between the transit movement and unloading permission? page"
    )
    andIchooseRadioOptionXOnTheWereThereAnyDiscrepanciesBetweenTheTransitMovementAndUnloadingPermissionPage("Yes")

  }

  Feature("Navigating to Pages from Cross-check declaration summary to all individual sections of pages") {

    Scenario("01 - Unloading remarks - Consignment level Cross-check page add and remove journeys") {
      And("I click the Add or remove departure means link for section Departure means of transport 1")
      andIclickTheLinkForSection("Add or remove departure means", "Departure means of transport", "1")

      And("I choose radio option Yes on the You have added 1 departure means of transport page")
      andIchooseRadioOptionXOnTheYouHaveAddedXDepartureMeansOfTransportPage("Yes", "1")

      And(
        "I choose radio option Yes on the documents Do you want to add the type of identification for the departure means of transport? page"
      )
      andIchooseRadioOptionXOnTheDocumentsDoYouWantToAddTheTypeOfIdentificationForTheDepartureMeansOfTransportPage(
        "Yes"
      )

      And(
        "I choose radio option IMO Ship Identification Number on the Which identification do you want to use for the departure means of transport? page"
      )
      andIchooseRadioOptionXOnTheWhichIdentificationDoYouWantToUseForTheDepartureMeansOfTransportPage(
        "IMO Ship Identification Number"
      )

      And(
        "I choose radio option Yes on the documents Do you want to add an identification number for this vehicle? page"
      )
      andIchooseRadioOptionXOnTheDocumentsDoYouWantToAddAnIdentificationNumberForThisVehiclePage("Yes")

      And("I enter identification number Identify1234 on What is the identification number for this vehicle? page")
      andIenterIdentificationNumberOnWhatIsTheIdentificationNumberForThisVehiclePage("Identify1234")

      And("I choose radio option Yes on the documents Do you want to add the registered country for this vehicle? page")
      andIchooseRadioOptionXOnTheDocumentsDoYouWantToAddTheRegisteredCountryForThisVehiclePage("Yes")

      And("I select Germany - DE on the What country is this vehicle registered to? page")
      andIselectOnTheWhatCountryIsThisVehicleRegisteredToPage("Germany - DE")

      And("I choose to click on the Remove link on the You have added 2 departure means of transport page")
      andIchooseToClickOnTheXLinkOnTheYouHaveAddedXDepartureMeansOfTransportPage("Remove", "2")

      And(
        "I choose radio option Yes on the documents Are you sure you want to remove departure means of transport 1? page"
      )
      andIchooseRadioOptionXOnTheDocumentsAreYouSureYouWantToRemoveDepartureMeansOfTransportPage("Yes", "1")

      And("I choose radio option No on the You have added 1 departure means of transport page")
      andIchooseRadioOptionXOnTheYouHaveAddedXDepartureMeansOfTransportPage("No", "1")

      And("I click the Add or remove transport equipment link for section Transport equipment 1")
      andIclickTheLinkForSection("Add or remove transport equipment", "Transport equipment", "1")

      And("I choose radio option Yes on the cross check You have added 1 transport equipment page")
      andIchooseRadioOptionXOnTheCrossCheckYouHaveAddedXTransportEquipmentPage("Yes", "1")

      And(
        "I choose radio option Yes on the cross check Do you want to add a container identification number for the transport equipment? page"
      )
      andIchooseRadioOptionXOnTheCrossCheckDoYouWantToAddAContainerIdentificationNumberForTheTransportEquipmentPage(
        "Yes"
      )

      And("I enter identification number Container1234 on What is the container identification number? page")
      andIenterIdentificationNumberOnWhatIsTheContainerIdentificationNumberPage("Container1234")

      And("I choose radio option Yes on the cross check Do you want to add a seal for the transport equipment? page")
      andIchooseRadioOptionXOnTheCrossCheckDoYouWantToAddASealForTheTransportEquipmentPage("Yes")

      And("I enter identification number Seal1234 on What is the seal identification number? page")
      andIenterIdentificationNumberOnWhatIsTheSealIdentificationNumberPage("Seal1234")

      And("I click Remove on You have added 1 seals to transport equipment 2 page")
      andIclickXOnYouHaveAddedXSealstoTransportEquipmentXPage("Remove", "1", "2")

      And("I choose radio option Yes on Are you sure you want to remove this seal from transport equipment 2? page")
      andIchooseRadioOptionXOnAreYouSureYouWantToRemoveThisSealFromTransportEquipmentXPage("Yes", "2")

      And("I click radio option No on the You have added 0 seals to transport equipment 2 page")
      andIclickRadioOptionXOnTheYouHaveAddedXSealstoTransportEquipmentXPage("No", "0", "2")

      And("I choose radio option Yes on the cross check Do any items apply to this transport equipment? page")
      andIchooseRadioOptionXOnTheCrossCheckDoAnyItemsApplyToThisTransportEquipmentPage("Yes")

      And("I select 1 on the Which item does this transport equipment apply to? page")
      andIselectOnTheWhichItemDoesThisTransportEquipmentApplyToPage("1")

      And("I click Remove on You have applied 1 item to transport equipment 2 page")
      andIclickXOnYouHaveAppliedXItemToTransportEquipmentXPage("Remove", "1", "2")

      And("I choose radio option Yes on the Are you sure you want to remove this item from transport equipment 2? page")
      andIchooseRadioOptionXOnTheAreYouSureYouWantToRemoveThisItemFromTransportEquipmentPage("Yes", "2")

      And("I click radio option No on the You have applied 0 items to transport equipment 2 page")
      andIclickRadioOptionXOnTheYouHaveAppliedXItemstoTransportEquipmentXPage("No", "0", "2")

      And("I choose to click on the Remove link on the You have added 2 transport equipment page")
      andIchooseToClickOnTheXLinkOnTheYouHaveAddedXTransportEquipmentPage("Remove", "2")

      And("I choose radio option Yes on the documents Are you sure you want to remove transport equipment 1? page")
      andIchooseRadioOptionXOnTheDocumentsAreYouSureYouWantToRemoveTransportEquipmentPage("Yes", "1")

      And("I choose radio option No on the cross check You have added 1 transport equipment page")
      andIchooseRadioOptionXOnTheCrossCheckYouHaveAddedXTransportEquipmentPage("No", "1")

      And("I click the Add or remove document link for section Document 1")
      andIclickTheLinkForSection("Add or remove document", "Document", "1")

      And("I choose radio option Yes on the You have added 2 documents to all items page")
      andIchooseRadioOptionXOnTheYouHaveAddedXDocumentstoAllItemsPage("Yes", "2")

      And("I Add Supporting - (C651) on the What type of document do you want to add? page")
      andIAddnTheWhatTypeOfDocumentDoYouWantToAddPage("Supporting - (C651)")

      And("I enter reference number ref1234 on What is the document’s reference number? page")
      andIenterReferenceNumberOnWhatIsTheDocumentsReferenceNumberPage("ref1234")

      And(
        "I choose radio option Yes on the documents Do you want to add any additional information for this document? page"
      )
      andIchooseRadioOptionXOnTheDocumentsDoYouWantToAddAnyAdditionalInformationForThisDocumentPage("Yes")

      And("I enter additional information 12345 on documents Enter the additional information? page")
      andIenterAdditionalInformationOnDocumentsEnterTheAdditionalInformationPage("12345")

      And("I choose to click on the Remove link on the You have added 3 documents to all items page")
      andIchooseToClickOnTheXLinkOnTheYouHaveAddedXDocumentstoAllItemsPage("Remove", "3")

      And(
        "I choose radio option Yes on the documents Are you sure you want to remove this document from all items? page"
      )
      andIchooseRadioOptionXOnTheDocumentsAreYouSureYouWantToRemoveThisDocumentFromAllItemsPage("Yes")

      And("I choose radio option No on the You have added 2 documents to all items page")
      andIchooseRadioOptionXOnTheYouHaveAddedXDocumentstoAllItemsPage("No", "2")

      And("I click the Add or remove additional reference link for section Additional reference 1")
      andIclickTheLinkForSection("Add or remove additional reference", "Additional reference", "1")

      And("I click radio option Yes on the You have added 1 additional reference page")
      andIclickRadioOptionXOnTheYouHaveAddedXAdditionalReferencesPage("Yes", "1")

      And(
        "I select Y023 - Consignee (AEO certificate number) on the What type of additional reference do you want to add? page"
      )
      andIselectOnTheWhatTypeOfAdditionalReferenceDoYouWantToAddPage("Y023 - Consignee (AEO certificate number)")

      And("I click radio option Yes on the Do you want to add an additional reference number? page")
      andIclickRadioOptionXOnTheDoYouWantToAddAnAdditionalReferenceNumberPage("Yes")

      And("I enter additional reference newRef999 on the What is the additional reference number? page")
      andIenterAdditionalReferenceXOnTheWhatIsTheAdditionalReferenceNumberPage("newRef999")

      And("I click the Remove link on the You have added 2 additional references page")
      andIclickTheXLinkOnTheYouHaveAddedXAdditionalReferencesPage("Remove", "2")

      And("I click radio option Yes on the Are you sure you want to remove this additional reference? page")
      andIclickRadioOptionXOnTheAreYouSureYouWantToRemoveThisAdditionalReferencePage("Yes")

      And("I click radio option No on the You have added 1 additional reference page")
      andIclickRadioOptionXOnTheYouHaveAddedXAdditionalReferencesPage("No", "1")

      And("I click the add or remove countries of routing link")
      andIclickTheAddOrRemoveCountriesOfRoutingLink()

      And("I select radio option Yes on the You have added 0 countries to the transit route page")
      andIselectRadioOptionXOnTheYouHaveAddedXCountriestoTheTransitRoutePage("Yes", "0")

      And("I select France on the Unloading Which country do you want to add to the transit route? page")
      andIselectOnTheUnloadingWhichCountryDoYouWantToAddToTheTransitRoutePage("France")

      And("I select radio option Yes on the You have added 1 country to the transit route page")
      andIselectRadioOptionXOnTheYouHaveAddedXCountriestoTheTransitRoutePage("Yes", "1")

      And("I select Germany on the Unloading Which country do you want to add to the transit route? page")
      andIselectOnTheUnloadingWhichCountryDoYouWantToAddToTheTransitRoutePage("Germany")

      And("I click on the Remove link on the You have added 2 countries to the transit route page")
      andIclickOnTheXLinkOnTheYouHaveAddedXCountriestoTheTransitRoutePage("Remove", "2")

      And("I select radio option Yes on the Are you sure you want to remove this country from the transit route? page")
      andIselectRadioOptionXOnTheAreYouSureYouWantToRemoveThisCountryFromTheTransitRoutePage("Yes")

      And("I select radio option No on the You have added 1 country to the transit route page")
      andIselectRadioOptionXOnTheYouHaveAddedXCountriestoTheTransitRoutePage("No", "1")

      And("I sign out")
      andISignOut()

    }

    Scenario("02 - Unloading remarks - Item level Cross-check page add and remove journeys") {
      Given(
        "I click the More details link for house consignment 1 on the Enter the discrepancies between the transit movement and unloading permission page"
      )
      givenIclickTheMoreDetailsLinkForHouseConsignmentOnTheEnterTheDiscrepanciesBetweenTheTransitMovementAndUnloadingPermissionPage(
        "1"
      )

      And("I should be on the House consignment 1 page")
      thenIshouldBeOnTheHouseConsignmentPage("1")

      And("I click the Add or remove item link on house consignment for section Items 1")
      andIclickTheLinkOnHouseConsignmentForSection("Add or remove item", "Items", "1")

      And("I click radio option Yes on the You have added 1 item for house consignment 1 page")
      andIclickRadioOptionXOnTheYouHaveAddedXItemsforHouseConsignmentXPage("Yes", "1", "1")

      And("I enter testing on the Enter the description of item 2 in house consignment 1 page")
      andIenterXOnTheEnterADescriptionOfItemXPage("testing", "2")

      And("I choose radio option Yes on the Do you want to add the item’s gross weight? page")
      andIhooseRadioOptionXOnTheDoYouWantToAddTheItemsGrossWeightPage("Yes")

      And("enter number 741.56 on What is the gross weight of item 2 in house consignment 1? page")
      andIenterNumberOnWhatIsTheGrossWeightOfItemInHouseConsignment1Page("741.56", "2")

      And("I choose radio option Yes on the Do you want to add the item’s net weight? page")
      andIchooseRadioOptionXOnTheDoYouWantToAddTheItemsNetWeightPage("Yes")

      And("I enter number 5681.22 on What is the net weight of item 2 in house consignment 1? page")
      andIenterNumberOnWhatIsTheNetWeightOfItemInHouseConsignment1Page("5681.22", "2")

      And("I choose radio option Yes on the Do you want to add a Unique Consignment Reference for this item? page")
      andIchooseRadioOptionXOnTheDoYouWantToAddAUniqueConsignmentReferenceForThisItemPage("Yes")

      And(
        "I enter reference UCRHC12312 on the What is the Unique Consignment Reference for item 2 in house consignment 1? page"
      )
      andIenterReferenceOnTheWhatIsTheUniqueConsignmentReferenceForItemInHouseConsignment1Page("UCRHC12312", "2")

      And(
        "I choose radio option Yes on the Do you want to add a Customs Union and Statistics (CUS) code for the item? page"
      )
      andIchooseRadioOptionXOnTheDoYouWantToAddACustomsUnionAndStatisticsXCodeForTheItemPage("Yes")

      And(
        "I enter number 0010003-8 on What is the Customs Union and Statistics code for item 2 in house consignment 1? page"
      )
      andIenterNumberOnWhatIsTheCustomsUnionAndStatisticsCodeForItemInHouseConsignmentPage("0010003-8", "2", "1")

      And("I choose radio option Yes on the Do you want to add a commodity code for the item? page")
      andIchooseRadioOptionXOnTheDoYouWantToAddACommodityCodeForTheItemPage("Yes")

      And("I enter number 010130 on What is the commodity code for item 2 in house consignment 1? page")
      andIenterNumberOnWhatIsTheCommodityCodeForItemInHouseConsignment1Page("010130", "2")

      And("I choose radio option Yes on the Do you want to add a combined nomenclature code for the item? page")
      andIchooseRadioOptionXOnTheDoYouWantToAddACombinedNomenclatureCodeForTheItemPage("Yes")

      And("I enter number 84 on What is the combined nomenclature code for item 2 in house consignment 1? page")
      andIenterNumberOnWhatIsTheCombinedNomenclatureCodeForItemInHouseConsignment1Page("84", "2")

      And("I choose radio option Yes on the Do you want to add a document for the item? page")
      andIchooseRadioOptionXOnTheDoYouWantToAddADocumentForTheItemPage("Yes")

      And(
        "I Add Supporting - (C651) on the What type of document do you want to add for item 2 in house consignment 1? page"
      )
      andIAddOnTheWhatTypeOfDocumentDoYouWantToAddForItemXInHouseConsignment1Page("Supporting - (C651)", "2")

      And(
        "I enter reference number ref1234 on What is the document’s reference number for item 2 in house consignment 1? page"
      )
      andIenterReferenceNumberOnWhatIsTheDocumentsReferenceNumberForItemXInHouseConsignment1Page("ref1234", "2")

      And(
        "I choose radio option Yes on the documents Do you want to add any additional information for this document? page"
      )
      andIchooseRadioOptionXOnTheDocumentsDoYouWantToAddAnyAdditionalInformationForThisDocumentPage("Yes")

      And(
        "I enter additional information 12345 on documents Enter the additional information for item 2 in house consignment 1 page"
      )
      andIenterAdditionalInformationOnDocumentsEnterTheAdditionalInformationForItemXInHouseConsignment1Page(
        "12345",
        "2"
      )

      And("I click Yes on house consignment document You have added 1 document to item 2 in house consignment 1 page")
      andIclickXOnHouseConsignmentDocumentYouHaveAddedXDocumentstoItemInHouseConsignment1Page("Yes", "1", "2")

      And(
        "I Add Supporting - (C651) on the What type of document do you want to add for item 2 in house consignment 1? page"
      )
      andIAddOnTheWhatTypeOfDocumentDoYouWantToAddForItemXInHouseConsignment1Page("Supporting - (C651)", "2")

      And(
        "I enter reference number ref1234 on What is the document’s reference number for item 2 in house consignment 1? page"
      )
      andIenterReferenceNumberOnWhatIsTheDocumentsReferenceNumberForItemXInHouseConsignment1Page("ref1234", "2")

      And(
        "I choose radio option Yes on the documents Do you want to add any additional information for this document? page"
      )
      andIchooseRadioOptionXOnTheDocumentsDoYouWantToAddAnyAdditionalInformationForThisDocumentPage("Yes")

      And(
        "I enter additional information 12345 on documents Enter the additional information for item 2 in house consignment 1 page"
      )
      andIenterAdditionalInformationOnDocumentsEnterTheAdditionalInformationForItemXInHouseConsignment1Page(
        "12345",
        "2"
      )

      And("I click Remove on You have added 2 documents to item 2 in house consignment 1 page")
      andIclickXOnYouHaveAddedXDocumentstoItemInHouseConsignment1Page("Remove", "2", "2")

      And(
        "I click radio option Yes on the Are you sure you want to remove this document from item 2 in house consignment 1? page"
      )
      andIclickRadioOptionXOnTheAreYouSureYouWantToRemoveThisDocumentFromItemInHouseConsignment1Page("Yes", "2")

      And("I click No on house consignment document You have added 1 documents to item 2 in house consignment 1 page")
      andIclickXOnHouseConsignmentDocumentYouHaveAddedXDocumentstoItemInHouseConsignment1Page("No", "1", "2")

      And("I choose radio option Yes on the Do you want to add an additional reference for the item? page")
      andIchooseRadioOptionXOnTheDoYouWantToAddAnAdditionalReferenceForTheItemPage("Yes")

      And(
        "I select Y023 - Consignee (AEO certificate number) on the What type of additional reference do you want to add for item 2 in house consignment 1? page"
      )
      andIselectOnTheWhatTypeOfAdditionalReferenceDoYouWantToAddForItemXInHouseConsignment1Page(
        "Y023 - Consignee (AEO certificate number)",
        "2"
      )

      And("I click radio option Yes on the Do you want to add an additional reference number? page")
      andIclickRadioOptionXOnTheDoYouWantToAddAnAdditionalReferenceNumberPage("Yes")

      And(
        "I enter additional reference newRef999 on the What is the additional reference number for item 2 in house consignment 1? page"
      )
      andIenterAdditionalReferenceXOnTheWhatIsTheAdditionalReferenceNumberForItemXInHouseConsignment1Page(
        "newRef999",
        "2"
      )

      And(
        "I click Yes on additional reference You have added 1 additional reference for item 2 in house consignment 1 page"
      )
      andIclickXOnAdditionalReferenceYouHaveAddedAdditionalReferencesforItemInHouseConsignment1Page("Yes", "1", "2")

      And(
        "I select Y023 - Consignee (AEO certificate number) on the What type of additional reference do you want to add for item 2 in house consignment 1? page"
      )
      andIselectOnTheWhatTypeOfAdditionalReferenceDoYouWantToAddForItemXInHouseConsignment1Page(
        "Y023 - Consignee (AEO certificate number)",
        "2"
      )

      And("I click radio option Yes on the Do you want to add an additional reference number? page")
      andIclickRadioOptionXOnTheDoYouWantToAddAnAdditionalReferenceNumberPage("Yes")

      And(
        "I enter additional reference newRef999 on the What is the additional reference number for item 2 in house consignment 1? page"
      )
      andIenterAdditionalReferenceXOnTheWhatIsTheAdditionalReferenceNumberForItemXInHouseConsignment1Page(
        "newRef999",
        "2"
      )

      And("I click Remove on the You have added 2 additional references for item 2 in house consignment 1 page")
      andIclickXOnTheYouHaveAddedAdditionalReferencesforItemInHouseConsignment1Page("Remove", "2", "2")

      And("I click radio option Yes on the Are you sure you want to remove this additional reference? page")
      andIclickRadioOptionXOnTheAreYouSureYouWantToRemoveThisAdditionalReferencePage("Yes")

      And(
        "I click No on additional reference You have added 1 additional reference for item 2 in house consignment 1 page"
      )
      andIclickXOnAdditionalReferenceYouHaveAddedAdditionalReferencesforItemInHouseConsignment1Page("No", "1", "2")

      And("I choose radio option Yes on the Do you want to add a package for the item? page")
      andIchooseRadioOptionXOnTheDoYouWantToAddAPackageForTheItemPage("Yes")

      And("I select (AE) Aerosol on the What type of package are you using for item 2 in house consignment 1? page")
      andIselectOnTheWhatTypeOfPackageAreYouUsingForItemXInHouseConsignment1Page("(AE) Aerosol", "2")

      And("I choose radio option Yes on the Do you want to add the quantity of this package? page")
      andIchooseRadioOptionXOnTheDoYouWantToAddTheQuantityOfThisPackagePage("Yes")

      And("I enter 2 on the How many of this package are you using for item 2 in house consignment 1? page")
      andIenterXOnTheHowManyOfThisPackageAreYouUsingForItemXInHouseConsignment1Page("2", "2")

      And("I click radio option Yes on the Do you want to add a shipping mark? page")
      andIclickRadioOptionXOnTheDoYouWantToAddAShippingMarkPage("Yes")

      And(
        "I enter This is a description of the cargo 1 on the What is the shipping mark for item 2 in house consignment 1? page"
      )
      andIenterXOnTheWhatIsTheShippingMarkForItemXInHouseConsignment1Page("This is a description of the cargo 1", "2")

      And(
        "I click Yes on house consignment package You have added 1 type of package for item 2 in house consignment 1 page"
      )
      andIclickXOnHouseConsignmentPackageYouHaveAddedXTypesofPackagesforItemInHouseConsignment1Page("Yes", "1", "2")

      And(
        "I select (43) Bag, super bulk on the What type of package are you using for item 2 in house consignment 1? page"
      )
      andIselectOnTheWhatTypeOfPackageAreYouUsingForItemXInHouseConsignment1Page("(43) Bag", "2")

      And("I choose radio option No on the Do you want to add the quantity of this package? page")
      andIchooseRadioOptionXOnTheDoYouWantToAddTheQuantityOfThisPackagePage("No")

      And("I click radio option No on the Do you want to add a shipping mark? page")
      andIclickRadioOptionXOnTheDoYouWantToAddAShippingMarkPage("No")

      And(
        "I click Remove on the house consignment package You have added 2 types of packages for item 2 in house consignment 1 page"
      )
      andIclickXOnTheHouseConsignmentPackageYouHaveAddedXTypesofPackagesforItemInHouseConsignment1Page(
        "Remove",
        "2",
        "2"
      )

      And(
        "I click radio option Yes on the Are you sure you want to remove this package from item 2 in house consignment 1? page"
      )
      andIclickRadioOptionXOnTheAreYouSureYouWantToRemoveThisPackageFromItemInHouseConsignment1Page("Yes", "2")

      And(
        "I click No on house consignment package You have added 1 type of package for item 2 in house consignment 1 page"
      )
      andIclickXOnHouseConsignmentPackageYouHaveAddedXTypesofPackagesforItemInHouseConsignment1Page("No", "1", "2")

      And("I click option Remove on the You have added 2 items for house consignment 1 page")
      andIclickOptionXOnTheYouHaveAddedXItemsforHouseConsignmentXPage("Remove", "2", "1")

      And("I click radio option Yes on item Are you sure you want to remove item 1 from house consignment 1? page")
      andIclickRadioOptionXOnItemAreYouSureYouWantToRemoveItemFromHouseConsignment1Page("Yes", "1")

      And("I click radio option No on the You have added 1 item for house consignment 1 page")
      andIclickRadioOptionXOnTheYouHaveAddedXItemsforHouseConsignmentXPage("No", "1", "1")

      And("I sign out")
      andISignOut()

    }

    Scenario("03 - Unloading remarks - Cross-check page add and remove House Consignment") {
      And("I click the add or remove house consignment link")
      andIclickTheAddOrRemoveHouseConsignmentLink()

      And("I click radio option Yes on the You have added 1 house consignment page")
      andIclickRadioOptionXOnTheYouHaveAddedXHouseConsignmentPage("Yes", "1")

      And("I enter number 100 on What is the gross weight of House Consignment 2? page")
      andIenterNumberOnWhatIsTheGrossWeightOfHouseConsignmentPage("100", "2")

      And(
        "I choose radio option Yes on the Do you want to add a Unique Consignment Reference for this house consignment? page"
      )
      andIchooseRadioOptionXOnTheDoYouWantToAddAUniqueConsignmentReferenceForThisHouseConsignmentPage("Yes")

      And("I enter UCRHC12312 on the What is the Unique Consignment Reference for house consignment 2? page")
      andIenterOnTheWhatIsTheUniqueConsignmentReferenceForHouseConsignmentPage("UCRHC12312", "2")

      And(
        "I choose radio option Yes on the Do you want to add a departure means of transport for house consignment 2? page"
      )
      andIchooseRadioOptionXOnTheDoYouWantToAddADepartureMeansOfTransportForHouseConsignmentXPage("Yes", "2")

      And(
        "I choose radio option IMO Ship Identification Number on the Which identification do you want to use for the departure means of transport in house consignment 2? page"
      )
      andIchooseRadioOptionXOnTheWhichIdentificationDoYouWantToUseForTheDepartureMeansOfTransportInHouseConsignmentXPage(
        "IMO Ship Identification Number",
        "2"
      )

      And("I enter identification number Identify1234 on What is the identification number for this vehicle? page")
      andIenterIdentificationNumberOnWhatIsTheIdentificationNumberForThisVehiclePage("Identify1234")

      And("I select Germany - DE on the What country is this vehicle registered to? page")
      andIselectOnTheWhatCountryIsThisVehicleRegisteredToPage("Germany - DE")

      And("I choose radio option No on the You have added 1 departure means of transport for house consignment 2 page")
      andIchooseRadioOptionXOnTheYouHaveAddedXDepartureMeansOfTransportForHouseConsignment2Page("No", "1")

      And("I choose radio option Yes on the Do you want to add any documents for house consignment 2? page")
      andIchooseRadioOptionXOnTheDoYouWantToAddAnyDocumentsForHouseConsignmentXPage("Yes", "2")

      And("I select Supporting - (C651) on the What type of document do you want to add for house consignment 2? page")
      andIselectOnTheWhatTypeOfDocumentDoYouWantToAddForHouseConsignmentXPage("Supporting - (C651)", "2")

      And("I enter reference number ref1234 on What is the document’s reference number? page")
      andIenterReferenceNumberOnWhatIsTheDocumentsReferenceNumberPage("ref1234")

      And(
        "I choose radio option Yes on the documents Do you want to add any additional information for this document? page"
      )
      andIchooseRadioOptionXOnTheDocumentsDoYouWantToAddAnyAdditionalInformationForThisDocumentPage("Yes")

      And(
        "I add additional information 12345 on documents Enter the additional information in house consignment 2 page"
      )
      andIaddAdditionalInformationOnDocumentsEnterTheAdditionalInformationInHouseConsignmentXPage("12345", "2")

      And("I choose radio option No on the You have added 1 document to all items in house consignment 2 page")
      andIchooseRadioOptionXOnTheYouHaveAddedXDocumentstoAllItemsInHouseConsignment2Page("No", "1")

      And("I choose radio option Yes on the Do you want to add an additional reference for house consignment 2? page")
      andIchooseRadioOptionXOnTheDoYouWantToAddAnAdditionalReferenceForHouseConsignmentXPage("Yes", "2")

      And(
        "I choose Y023 - Consignee (AEO certificate number) on the What type of additional reference do you want to add for house consignment 2? page"
      )
      andIchooseOnTheWhatTypeOfAdditionalReferenceDoYouWantToAddForHouseConsignmentXPage(
        "Y023 - Consignee (AEO certificate number)",
        "2"
      )

      And("I click radio option Yes on the Do you want to add an additional reference number? page")
      andIclickRadioOptionXOnTheDoYouWantToAddAnAdditionalReferenceNumberPage("Yes")

      And("I enter additional reference newRef999 on the What is the additional reference number? page")
      andIenterAdditionalReferenceXOnTheWhatIsTheAdditionalReferenceNumberPage("newRef999")

      And("I click radio option No on the You have added 1 additional reference for house consignment 2 page")
      andIclickRadioOptionXOnTheYouHaveAddedXAdditionalReferenceForHouseConsignment2Page("No", "1")

      And("I choose radio option No on the Do you want to add an item for house consignment 2? page")
      andIchooseRadioOptionXOnTheDoYouWantToAddAnItemForHouseConsignmentXPage("No", "2")

      And("I click the Remove link on the You have added 2 house consignments page")
      andIclickTheXLinkOnTheYouHaveAddedXHouseConsignmentsPage("Remove", "2")

      And("I click radio option Yes on the Are you sure you want to remove house consignment 1? page")
      andIclickRadioOptionXOnTheAreYouSureYouWantToRemoveHouseConsignmentPage("Yes", "1")

      And("I click radio option No on the You have added 1 house consignment page")
      andIclickRadioOptionXOnTheYouHaveAddedXHouseConsignmentPage("No", "1")

      And("I sign out")
      andISignOut()

    }
  }
}
