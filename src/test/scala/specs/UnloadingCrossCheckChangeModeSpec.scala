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

import specsteps.UnloadingStepDefSteps.*
import org.scalatest.{BeforeAndAfterEach, GivenWhenThen}
import specsteps.ArrivalNotificationsStepDefSteps.andIClickOnTheXLinkForMRNXOnTheArrivalNotificationsPage
import specsteps.CommonStepDefSteps.andISignOut
import specsteps.LoginStepDefSteps.*
import specsteps.ManageStepDefSteps.*

class UnloadingCrossCheckChangeModeSpec extends BaseSpec with GivenWhenThen with BeforeAndAfterEach {

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

    Scenario("01 - Unloading remarks - Consignment level Cross-check page in change mode") {
      And("I should be on the Enter the discrepancies between the transit movement and unloading permission page")
      thenIshouldBeOnTheEnterTheDiscrepanciesBetweenTheTransitMovementAndUnloadingPermissionPage()

      And("I click the Departure means identification type Change link for section Departure means of transport 1")
      andIclickTheLinkForSection("Departure means identification type Change", "Departure means of transport", "1")

      And(
        "I choose radio option Name of the sea-going vessel on the Which identification do you want to use for the new departure means of transport? page"
      )
      andIchooseRadioOptionXOnTheWhichIdentificationDoYouWantToUseForTheNewDepartureMeansOfTransportPage(
        "Name of the sea-going vessel"
      )

      And("I click the Departure identification number Change link for section Departure means of transport 1")
      andIclickTheLinkForSection("Departure identification number Change", "Departure means of transport", "1")

      And(
        "I enter identification number info1234 on the What is the identification number for the new departure means of transport? page"
      )
      andIenterIdentificationNumberOnTheWhatIsTheIdentificationNumberForTheNewDepartureMeansOfTransportPage("info1234")

      And("I click the Departure registered country Change link for section Departure means of transport 1")
      andIclickTheLinkForSection("Departure registered country Change", "Departure means of transport", "1")

      And("I select Germany - DE on the What country is the new departure means of transport registered to? page")
      andIselectOnTheWhatCountryIsTheNewDepartureMeansOfTransportRegisteredToPage("Germany - DE")

      And("I click the Container identification number Change link for section Transport equipment 1")
      andIclickTheLinkForSection("Container identification number Change", "Transport equipment", "1")

      And("I enter identification number NewContainer1234 on What is the new container identification number? page")
      andIenterIdentificationNumberOnWhatIsTheNewContainerIdentificationNumberPage("NewContainer1234")

      And("I click the Change seal1 link for sub-section Seals of section Transport equipment 1")
      andIclickTheChangeLinkForSubsectionOfSection("seal1", "Seals", "Transport equipment", "1")

      And("I enter seal identification number Seal1234 on the What is the new seal identification number? page")
      andIenterSealIdentificationNumberOnTheWhatIsTheNewSealIdentificationNumberPage("Seal1234")

      And("I click the Change item1 link for sub-section Items applied of section Transport equipment 1")
      andIclickTheChangeLinkForSubsectionOfSection("item1", "Items applied", "Transport equipment", "1")

      And("I select 1 on the Which item does this transport equipment apply to? page")
      andIselectOnTheWhichItemDoesThisTransportEquipmentApplyToPage("1")

      And("I click the Document type Change link for section Document 1")
      andIclickTheLinkForSection("Document type Change", "Document", "1")

      And("I select Supporting - (C641) Dissostichus on the What is the new document type? page")
      andIselectOnTheWhatIsTheNewDocumentTypePage("Supporting - (C641) Dissostichus")

      And("I click the Document reference number Change link for section Document 1")
      andIclickTheLinkForSection("Document reference number Change", "Document", "1")

      And("I enter reference number ref1234 on the What is the document’s new reference number? page")
      andIenterReferenceNumberOnTheWhatIsTheDocumentsNewReferenceNumberPage("ref1234")

      And("I click the Document additional information Change link for section Document 1")
      andIclickTheLinkForSection("Document additional information Change", "Document", "1")

      And("I enter additional information 1234 on the Enter the new additional information? page")
      andIenterAdditionalInformationOnTheEnterTheNewAdditionalInformationPage("1234")

      And("I click the Additional reference type Change link for section Additional reference 1")
      andIclickTheLinkForSection("Additional reference type Change", "Additional reference", "1")

      And("I select Y023 - Consignee (AEO certificate number) on the What is the new additional reference type? page")
      andIselectOnTheWhatIsTheNewAdditionalReferenceTypePage("Y023 - Consignee (AEO certificate number)")

      And("I click the Additional reference number Change link for section Additional reference 1")
      andIclickTheLinkForSection("Additional reference number Change", "Additional reference", "1")

      And("I enter additional reference additionalRef123 on the What is the new additional reference number? page")
      andenterAdditionalReferenceOnTheWhatIsTheNewAdditionalReferenceNumberPage("additionalRef123")

      And("I sign out")
      andISignOut()
    }

    Scenario("02 - Unloading remarks - Item level Cross-check page in change mode") {
      Given(
        "I click the More details link for house consignment 1 on the Enter the discrepancies between the transit movement and unloading permission page"
      )
      givenIclickTheMoreDetailsLinkForHouseConsignmentOnTheEnterTheDiscrepanciesBetweenTheTransitMovementAndUnloadingPermissionPage(
        "1"
      )

      And("I should be on the House consignment 1 page")
      thenIshouldBeOnTheHouseConsignmentPage("1")

      And("I click the Change Gross weight link for Item 1 in House consignment 1")
      andIclickTheLinkForInHouseConsignment("Change Gross weight", "Item 1", "1")

      And("enter number 741.56 on What is the new gross weight of item 1 in house consignment 1? page")
      andIenterNumberOnWhatIsTheNewGrossWeightOfItemInHouseConsignment1Page("741.56", "1")

      And("I click the Remove Gross weight link for Item 1 in House consignment 1")
      andIclickTheLinkForInHouseConsignment("Remove Gross weight", "Item 1", "1")

      And(
        "I choose radio option Yes on the Are you sure you want to remove the gross weight from item 1 in house consignment 1? page"
      )
      andIchooseRadioOptionXOnTheAreYouSureYouWantToRemoveTheGrossWeightFromItem1InHouseConsignment1Page("Yes")

      And("I click the Change Net weight link for Item 1 in House consignment 1")
      andIclickTheLinkForInHouseConsignment("Change Net weight", "Item 1", "1")

      And("I enter number 5681.22 on What is the new net weight of item 1 in house consignment 1? page")
      andIenterNumberOnWhatIsTheNewNetWeightOfItemInHouseConsignment1Page("5681.22", "1")

      And("I click the Remove Net weight link for Item 1 in House consignment 1")
      andIclickTheLinkForInHouseConsignment("Remove Net weight", "Item 1", "1")

      And(
        "I choose radio option Yes on the Are you sure you want to remove the net weight from item 1 in house consignment 1? page"
      )
      andIchooseRadioOptionXOnTheAreYouSureYouWantToRemoveTheNetWeightFromItem1InHouseConsignment1Page("Yes")

      And("I click the Change Cus code link for Item 1 in House consignment 1")
      andIclickTheLinkForInHouseConsignment("Change Cus code", "Item 1", "1")

      And(
        "I enter number 0010003-8 on What is the new Customs Union and Statistics CUS code for item 1 in house consignment 1? page"
      )
      andIenterNumberOnWhatIsTheNewCustomsUnionAndStatisticsCUSCodeForItemInHouseConsignment1Page("0010003-8", "1")

      And("I click the Change Commodity code link for Item 1 in House consignment 1")
      andIclickTheLinkForInHouseConsignment("Change Commodity code", "Item 1", "1")

      And("I enter number 010130 on What is the new commodity code for item 1 in house consignment 1? page")
      andIenterNumberOnWhatIsTheNewCommodityCodeForItemInHouseConsignment1Page("010130", "1")

      And("I click the Remove Commodity code link for Item 1 in House consignment 1")
      andIclickTheLinkForInHouseConsignment("Remove Commodity code", "Item 1", "1")

      And(
        "I choose radio option Yes on the Are you sure you want to remove the commodity code from item 1 in house consignment 1? page"
      )
      andIchooseRadioOptionXOnTheAreYouSureYouWantToRemoveTheCommodityCodeFromItem1InHouseConsignment1Page("Yes")

      And("I click the Change Nomenclature code link for Item 1 in House consignment 1")
      andIclickTheLinkForInHouseConsignment("Change Nomenclature code", "Item 1", "1")

      And("I enter number 84 on What is the new combined nomenclature code for item 1 in house consignment 1? page")
      andIenterNumberOnWhatIsTheNewCombinedNomenclatureCodeForItemInHouseConsignment1Page("84", "1")

      And("I click the Remove Nomenclature code link for Item 1 in House consignment 1")
      andIclickTheLinkForInHouseConsignment("Remove Nomenclature code", "Item 1", "1")

      And(
        "I choose radio option Yes on the Are you sure you want to remove the combined nomenclature code from item 1 in house consignment 1? page"
      )
      andIchooseRadioOptionXOnTheAreYouSureYouWantToRemoveTheCombinedNomenclatureCodeFromItem1InHouseConsignment1Page(
        "Yes"
      )

      And(
        "I click the Change additional reference Type link in House consignment 1 sub-section Additional reference 1 of section Item 1"
      )
      andIclickTheLinkInHouseConsignmentSubsectionOfSection(
        "Change additional reference Type",
        "1",
        "Additional reference 1",
        "Item 1"
      )

      And(
        "I select Y023 - Consignee (AEO certificate number) on the What is the new additional reference type for item 1 in house consignment 1? page"
      )
      andIselectOnTheWhatIsTheNewAdditionalReferenceTypeForItem1InHouseConsignment1Page(
        "Y023 - Consignee (AEO certificate number)"
      )

      And(
        "I click the Change additional reference number link in House consignment 1 sub-section Additional reference 1 of section Item 1"
      )
      andIclickTheLinkInHouseConsignmentSubsectionOfSection(
        "Change additional reference number",
        "1",
        "Additional reference 1",
        "Item 1"
      )

      And(
        "I enter additional reference NewReference323 on the What is the new additional reference number for item 1 in house consignment 1? page"
      )
      andIenterAdditionalReferenceOnTheWhatIsTheNewAdditionalReferenceNumberForItem1InHouseConsignment1Page(
        "NewReference323"
      )

      And("I click the Change package type link in House consignment 1 sub-section Packages of section Item 1")
      andIclickTheLinkInHouseConsignmentSubsectionOfSection("Change package type", "1", "Packages", "Item 1")

      And("I select (BG) Bag on the What is the new package type for item 1 in house consignment 1? page")
      andIselectOnTheWhatIsTheNewPackageTypeForItem1InHouseConsignment1Page("(BG) Bag")

      And("I click the Change package quantity link in House consignment 1 sub-section Packages of section Item 1")
      andIclickTheLinkInHouseConsignmentSubsectionOfSection("Change package quantity", "1", "Packages", "Item 1")

      And("I enter 150 on the How many of this package are you using for item 1 in house consignment 1? page")
      andIenterXOnTheHowManyOfThisPackageAreYouUsingForItemXInHouseConsignment1Page("150", "1")

      And("I click the Change shipping mark link in House consignment 1 sub-section Packages of section Item 1")
      andIclickTheLinkInHouseConsignmentSubsectionOfSection("Change shipping mark", "1", "Packages", "Item 1")

      And("I enter shipping mark abc on the What is the new shipping mark for item 1 in house consignment 1? page")
      andIenterShippingMarkOnTheWhatIsTheNewShippingMarkForItem1InHouseConsignment1Page("abc")

      And("I sign out")
      andISignOut()

    }
  }
}
