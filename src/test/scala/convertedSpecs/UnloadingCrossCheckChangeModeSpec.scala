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

import specsteps.UnloadingStepDefSteps.*
import org.scalatest.GivenWhenThen

class UnloadingCrossCheckChangeModeSpec extends BaseSpec with GivenWhenThen {

  Feature("Navigating to Pages from Cross-check declaration summary to all individual sections of pages") {

    Scenario("01 - Unloading remarks - Consignment level Cross-check page in change mode") {
      And("I should be on the Enter the discrepancies between the transit movement and unloading permission page")
      // Possible match (best=1.00)
      thenIshouldBeOnTheEnterTheDiscrepanciesBetweenTheTransitMovementAndUnloadingPermissionPage()

      And("I click the Departure means identification type Change link for section Departure means of transport 1")
      // Possible match (best=1.00)
      andIclickTheLinkForSection("Departure means identification type Change", "Departure means of transport", "1")

      And(
        "I choose radio option Name of the sea-going vessel on the Which identification do you want to use for the new departure means of transport? page"
      )
      // Possible match (best=0.82)
      andIchooseRadioOptionXOnTheWhichIdentificationDoYouWantToUseForTheNewDepartureMeansOfTransportPage(
        "Name of the sea-going vessel"
      )
      // --- Other possible matches ---
      // andIchooseRadioOptionXOnTheWhichIdentificationDoYouWantToUseForTheDepartureMeansOfTransportPage() [0.82] (UnloadingStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Which identification do you want to use for the departure means of transport\?' page
      // andIchooseRadioOptionXOnThePresentationDepartureMeansOfTransportWhichIdentificationDoYouWantToUseForTheDepartureMeansOfTransportPage() [0.80] (PresentationNotificationStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the presentation departure means of transport 'Which identification do you want to use for the departure means of transport\?' page
      // andIchooseRadioOptionXOnTheWhichIdentificationDoYouWantToUseForTheDepartureMeansOfTransportInHouseConsignmentXPage() [0.79] (UnloadingStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Which identification do you want to use for the departure means of transport in house consignment (.*)\?' page
      // andIchooseRadioOptionXOnTheDepartureMeansXPage() [0.77] (InlandModeOfTransportStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the departure means '(.*)' page

      And("I click the Departure identification number Change link for section Departure means of transport 1")
      // Possible match (best=1.00)
      andIclickTheLinkForSection("Departure identification number Change", "Departure means of transport", "1")

      And(
        "I enter identification number info1234 on the What is the identification number for the new departure means of transport? page"
      )
      // Possible match (best=0.82)
      andIenterIdentificationNumberOnTheWhatIsTheIdentificationNumberForTheNewDepartureMeansOfTransportPage("info1234")
      // --- Other possible matches ---
      // andIenterIdentificationOnTheWhatIsTheIdentificationNumberForThisPage() [0.75] (BorderMeansOfTransportStepDefSteps.scala) pattern: (?:I )?enter identification (.+) on the 'What is the identification number for this\?' page
      // andIenterIdentificationNumberOnWhatIsTheIdentificationNumberForThisPage() [0.75] (PresentationNotificationStepDefSteps.scala) pattern: (?:I )?enter identification number (.+) on 'What is the identification number for this\?' page
      // andIenterIdentificationNumberOnWhatIsTheNewContainerIdentificationNumberPage() [0.75] (UnloadingStepDefSteps.scala) pattern: (?:I )?enter identification number (.+) on 'What is the new container identification number\?' page

      And("I click the Departure registered country Change link for section Departure means of transport 1")
      // Possible match (best=1.00)
      andIclickTheLinkForSection("Departure registered country Change", "Departure means of transport", "1")

      And("I select Germany - DE on the What country is the new departure means of transport registered to? page")
      // Possible match (best=0.81)
      andIselectOnTheWhatCountryIsTheNewDepartureMeansOfTransportRegisteredToPage("Germany - DE")
      // --- Other possible matches ---
      // andIselectOnThePresentationWhatCountryIsTheDepartureMeansOfTransportRegisteredToPage() [0.77] (PresentationNotificationStepDefSteps.scala) pattern: (?:I )?select (.+) on the presentation 'What country is the departure means of transport registered to\?' page

      And("I click the Container identification number Change link for section Transport equipment 1")
      // Possible match (best=1.00)
      andIclickTheLinkForSection("Container identification number Change", "Transport equipment", "1")

      And("I enter identification number NewContainer1234 on What is the new container identification number? page")
      // Possible match (best=0.80)
      andIenterIdentificationNumberOnWhatIsTheNewContainerIdentificationNumberPage("NewContainer1234")
      // --- Other possible matches ---
      // andIenterIdentificationNumberOnWhatIsTheContainerIdentificationNumberPage() [0.80] (UnloadingStepDefSteps.scala) pattern: (?:I )?enter identification number (.+) on 'What is the container identification number\?' page
      // andIenterOnTheWhatIsTheContainerIdentificationNumberPage() [0.79] (TransportEquipmentChargesStepDefSteps.scala) pattern: (?:I )?enter (.+) on the 'What is the container identification number\?' page

      And("I click the Change seal1 link for sub-section Seals of section Transport equipment 1")
      // Possible match (best=0.90)
      andIclickTheChangeLinkForSubsectionOfSection("seal1", "Seals", "Transport equipment", "1")

      And("I enter seal identification number Seal1234 on the What is the new seal identification number? page")
      // Possible match (best=0.81)
      andIenterSealIdentificationNumberOnTheWhatIsTheNewSealIdentificationNumberPage("Seal1234")
      // --- Other possible matches ---
      // andIenterOnTheWhatIsTheSealIdentificationNumberPage() [0.79] (TransportEquipmentChargesStepDefSteps.scala) pattern: (?:I )?enter (.+) on the 'What is the seal identification number\?' page

      And("I click the Change item1 link for sub-section Items applied of section Transport equipment 1")
      // Possible match (best=0.90)
      andIclickTheChangeLinkForSubsectionOfSection("item1", "Items applied", "Transport", "equipment 1")

      And("I select 1 on the Which item does this transport equipment apply to? page")
      // Possible match (best=0.80)
      andIselectOnTheWhichItemDoesThisTransportEquipmentApplyToPage("1")

      And("I click the Document type Change link for section Document 1")
      // Possible match (best=1.00)
      andIclickTheLinkForSection("Document type Change", "Document", "1")

      And("I select Supporting - (C641) Dissostichus on the What is the new document type? page")
      // Possible match (best=0.79)
      andIselectOnTheWhatIsTheNewDocumentTypePage("Supporting - (C641) Dissostichus")

      And("I click the Document reference number Change link for section Document 1")
      // Possible match (best=1.00)
      andIclickTheLinkForSection("Document reference number Change", "Document", "1")

      And("I enter reference number ref1234 on the What is the document’s new reference number? page")
      // Possible match (best=0.81)
      andIenterReferenceNumberOnTheWhatIsTheDocumentsNewReferenceNumberPage("ref1234")
      // --- Other possible matches ---
      // andIenterReferenceNumberOnWhatIsTheDocumentsReferenceNumberPage() [0.80] (UnloadingStepDefSteps.scala) pattern: (?:I )?enter reference number (.+) on 'What is the document’s reference number\?' page
      // andIenterOnTheWhatIsTheDocumentsReferenceNumberPage() [0.80] (DocumentsStepDefSteps.scala) pattern: (?:I )?enter (.+) on the 'What is the document’s reference number\?' page
      // andIenterOnTheWhatIsTheReferencePage() [0.78] (Departure_GuaranteeDetailsStepDefSteps.scala) pattern: (?:I )?enter (.+) on the 'What is the reference\?' page

      And("I click the Document additional information Change link for section Document 1")
      // Possible match (best=1.00)
      andIclickTheLinkForSection("Document additional information Change", "Document", "1")

      And("I enter additional information 1234 on the Enter the new additional information? page")
      // Possible match (best=0.80)
      andIenterAdditionalInformationOnTheEnterTheNewAdditionalInformationPage("1234")
      // --- Other possible matches ---
      // andIenterXOnTheEnterTheAdditionalInformationPage() [0.78] (ItemDetailsStepDefSteps.scala) pattern: (?:I )?enter (.*) on the 'Enter the additional information' page

      And("I click the Additional reference type Change link for section Additional reference 1")
      // Possible match (best=1.00)
      andIclickTheLinkForSection("Additional reference type Change", "Additional", "reference 1")

      And("I select Y023 - Consignee (AEO certificate number) on the What is the new additional reference type? page")
      // Possible match (best=0.80)
      andIselectOnTheWhatIsTheNewAdditionalReferenceTypePage("Y023 - Consignee (AEO certificate number)")

      And("I click the Additional reference number Change link for section Additional reference 1")
      // Possible match (best=1.00)
      andIclickTheLinkForSection("Additional reference number Change", "Additional reference", "1")

      And("I enter additional reference additionalRef123 on the What is the new additional reference number? page")
      // Possible match (best=0.80)
      andenterAdditionalReferenceOnTheWhatIsTheNewAdditionalReferenceNumberPage("additionalRef123")
      // --- Other possible matches ---
      // andIenterAdditionalReferenceXOnTheWhatIsTheAdditionalReferenceNumberPage() [0.80] (ItemDetailsStepDefSteps.scala) pattern: (?:I )?enter additional reference (.*) on the 'What is the additional reference number\?' page
      // andIenterXOnTheEnterTheAdditionalReferenceNumberPage() [0.79] (ItemDetailsStepDefSteps.scala) pattern: (?:I )?enter (.*) on the 'Enter the additional reference number' page
      // andIenterOnTheWhatIsTheReferencePage() [0.78] (Departure_GuaranteeDetailsStepDefSteps.scala) pattern: (?:I )?enter (.+) on the 'What is the reference\?' page

    }

    Scenario("02 - Unloading remarks - Item level Cross-check page in change mode") {
      Given(
        "I click the More details link for house consignment 1 on the Enter the discrepancies between the transit movement and unloading permission page"
      )
      // Possible match (best=0.97)
      givenIclickTheMoreDetailsLinkForHouseConsignmentOnTheEnterTheDiscrepanciesBetweenTheTransitMovementAndUnloadingPermissionPage(
        "1"
      )

      And("I should be on the House consignment 1 page")
      // Possible match (best=0.92)
      thenIshouldBeOnTheHouseConsignmentPage("1")

      And("I click the Change Gross weight link for Item 1 in House consignment 1")
      // Possible match (best=1.00)
      andIclickTheLinkForInHouseConsignment("Change Gross weight", "Item 1", "1")

      And("enter number 741.56 on What is the new gross weight of item 1 in house consignment 1? page")
      // ⚠️ No step-def match found for: enter number 741.56 on What is the new gross weight of item 1 in house consignment 1? page
      andIenterNumberOnWhatIsTheNewGrossWeightOfItemInHouseConsignment1Page("741.56", "1")

      And("I click the Remove Gross weight link for Item 1 in House consignment 1")
      // Possible match (best=1.00)
      andIclickTheLinkForInHouseConsignment("Remove Gross weight", "Item 1", "1")

      And(
        "I choose radio option Yes on the Are you sure you want to remove the gross weight from item 1 in house consignment 1? page"
      )
      // Possible match (best=0.82)
      andIchooseRadioOptionXOnTheAreYouSureYouWantToRemoveTheGrossWeightFromItem1InHouseConsignment1Page("Yes")
      // --- Other possible matches ---
      // andIchooseRadioOptionXOnTheAreYouSureYouWantToRemoveTheNetWeightFromItem1InHouseConsignment1Page() [0.79] (UnloadingStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Are you sure you want to remove the net weight from item 1 in house consignment 1\?' page
      // andIchooseRadioOptionXOnTheAreYouSureYouWantToRemoveTheCommodityCodeFromItem1InHouseConsignment1Page() [0.77] (UnloadingStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Are you sure you want to remove the commodity code from item 1 in house consignment 1\?' page

      And("I click the Change Net weight link for Item 1 in House consignment 1")
      // Possible match (best=1.00)
      andIclickTheLinkForInHouseConsignment("Change Net weight", "Item 1", "1")

      And("I enter number 5681.22 on What is the new net weight of item 1 in house consignment 1? page")
      // Possible match (best=0.83)
      andIenterNumberOnWhatIsTheNewNetWeightOfItemInHouseConsignment1Page("5681.22", "1")
      // --- Other possible matches ---
      // andIenterXOnTheWhatIsTheItemsNetWeightPage() [0.80] (ItemDetailsStepDefSteps.scala) pattern: (?:I )?enter (.*) on the 'What is the item’s net weight\?' page
      // andIenterNumberOnWhatIsTheGrossWeightOfHouseConsignmentPage() [0.76] (UnloadingStepDefSteps.scala) pattern: (?:I )?enter number (.+) on 'What is the gross weight of House Consignment (.+)\?' page

      And("I click the Remove Net weight link for Item 1 in House consignment 1")
      // Possible match (best=1.00)
      andIclickTheLinkForInHouseConsignment("Remove Net weight", "Item 1", "1")

      And(
        "I choose radio option Yes on the Are you sure you want to remove the net weight from item 1 in house consignment 1? page"
      )
      // Possible match (best=0.82)
      andIchooseRadioOptionXOnTheAreYouSureYouWantToRemoveTheNetWeightFromItem1InHouseConsignment1Page("Yes")
      // --- Other possible matches ---
      // andIchooseRadioOptionXOnTheAreYouSureYouWantToRemoveTheGrossWeightFromItem1InHouseConsignment1Page() [0.79] (UnloadingStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Are you sure you want to remove the gross weight from item 1 in house consignment 1\?' page
      // andIchooseRadioOptionXOnTheAreYouSureYouWantToRemoveTheCommodityCodeFromItem1InHouseConsignment1Page() [0.77] (UnloadingStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Are you sure you want to remove the commodity code from item 1 in house consignment 1\?' page

      And("I click the Change Cus code link for Item 1 in House consignment 1")
      // Possible match (best=1.00)
      andIclickTheLinkForInHouseConsignment("Change Cus code", "Item 1", "1")

      And(
        "I enter number 0010003-8 on What is the new Customs Union and Statistics CUS code for item 1 in house consignment 1? page"
      )
      // Possible match (best=0.84)
      andIenterNumberOnWhatIsTheNewCustomsUnionAndStatisticsCUSCodeForItemInHouseConsignment1Page("0010003-8", "1")
      // --- Other possible matches ---
      // andIenterNumberOnWhatIsTheCustomsUnionAndStatisticsCodeForItemInHouseConsignmentPage() [0.83] (UnloadingStepDefSteps.scala) pattern: (?:I )?enter number (.+) on 'What is the Customs Union and Statistics code for item (.+) in house consignment (.+)\?' page
      // andIenterXOnTheWhatIsTheCustomsUnionAndStatisticsCodePage() [0.80] (ItemDetailsStepDefSteps.scala) pattern: (?:I )?enter (.*) on the 'What is the Customs Union and Statistics code\?' page

      And("I click the Change Commodity code link for Item 1 in House consignment 1")
      // Possible match (best=1.00)
      andIclickTheLinkForInHouseConsignment("Change Commodity code", "Item 1", "1")

      And("I enter number 010130 on What is the new commodity code for item 1 in house consignment 1? page")
      // Possible match (best=0.83)
      andIenterNumberOnWhatIsTheNewCommodityCodeForItemInHouseConsignment1Page("010130", "1")
      // --- Other possible matches ---
      // andIenterXOnTheWhatIsTheCommodityCodePage() [0.79] (ItemDetailsStepDefSteps.scala) pattern: (?:I )?enter (.*) on the 'What is the commodity code\?' page

      And("I click the Remove Commodity code link for Item 1 in House consignment 1")
      // Possible match (best=1.00)
      andIclickTheLinkForInHouseConsignment("Remove Commodity code", "Item 1", "1")

      And(
        "I choose radio option Yes on the Are you sure you want to remove the commodity code from item 1 in house consignment 1? page"
      )
      // Possible match (best=0.82)
      andIchooseRadioOptionXOnTheAreYouSureYouWantToRemoveTheCommodityCodeFromItem1InHouseConsignment1Page("Yes")
      // --- Other possible matches ---
      // andIchooseRadioOptionXOnTheAreYouSureYouWantToRemoveTheCombinedNomenclatureCodeFromItem1InHouseConsignment1Page() [0.77] (UnloadingStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Are you sure you want to remove the combined nomenclature code from item 1 in house consignment 1\?' page
      // andIchooseRadioOptionXOnTheAreYouSureYouWantToRemoveTheGrossWeightFromItem1InHouseConsignment1Page() [0.77] (UnloadingStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Are you sure you want to remove the gross weight from item 1 in house consignment 1\?' page
      // andIchooseRadioOptionXOnTheAreYouSureYouWantToRemoveTheNetWeightFromItem1InHouseConsignment1Page() [0.77] (UnloadingStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Are you sure you want to remove the net weight from item 1 in house consignment 1\?' page

      And("I click the Change Nomenclature code link for Item 1 in House consignment 1")
      // Possible match (best=1.00)
      andIclickTheLinkForInHouseConsignment("Change Nomenclature code", "Item 1", "1")

      And("I enter number 84 on What is the new combined nomenclature code for item 1 in house consignment 1? page")
      // Possible match (best=0.83)
      andIenterNumberOnWhatIsTheNewCombinedNomenclatureCodeForItemInHouseConsignment1Page("84", "1")
      // --- Other possible matches ---
      // andIenterXOnTheWhatIsTheCombinedNomenclatureCodePage() [0.79] (ItemDetailsStepDefSteps.scala) pattern: (?:I )?enter (.*) on the 'What is the combined nomenclature code\?' page

      And("I click the Remove Nomenclature code link for Item 1 in House consignment 1")
      // Possible match (best=1.00)
      andIclickTheLinkForInHouseConsignment("Remove Nomenclature code", "Item 1", "1")

      And(
        "I choose radio option Yes on the Are you sure you want to remove the combined nomenclature code from item 1 in house consignment 1? page"
      )
      // Possible match (best=0.82)
      andIchooseRadioOptionXOnTheAreYouSureYouWantToRemoveTheCombinedNomenclatureCodeFromItem1InHouseConsignment1Page(
        "Yes"
      )
      // --- Other possible matches ---
      // andIchooseRadioOptionXOnTheAreYouSureYouWantToRemoveTheCommodityCodeFromItem1InHouseConsignment1Page() [0.79] (UnloadingStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Are you sure you want to remove the commodity code from item 1 in house consignment 1\?' page
      // andIchooseRadioOptionXOnTheAreYouSureYouWantToRemoveTheGrossWeightFromItem1InHouseConsignment1Page() [0.77] (UnloadingStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Are you sure you want to remove the gross weight from item 1 in house consignment 1\?' page
      // andIchooseRadioOptionXOnTheAreYouSureYouWantToRemoveTheNetWeightFromItem1InHouseConsignment1Page() [0.77] (UnloadingStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Are you sure you want to remove the net weight from item 1 in house consignment 1\?' page

      And(
        "I click the Change additional reference Type link in House consignment 1 sub-section Additional reference 1 of section Item 1"
      )
      // Possible match (best=0.92)
      andIclickTheLinkInHouseConsignmentSubsectionOfSection(
        "Change additional reference Type",
        "1",
        "Additional reference 1",
        "Item 1"
      )

      And(
        "I select Y023 - Consignee (AEO certificate number) on the What is the new additional reference type for item 1 in house consignment 1? page"
      )
      // Possible match (best=0.82)
      andIselectOnTheWhatIsTheNewAdditionalReferenceTypeForItem1InHouseConsignment1Page(
        "Y023 - Consignee (AEO certificate number)"
      )
      // --- Other possible matches ---
      // andIselectOnTheWhatIsTheNewAdditionalReferenceTypePage() [0.80] (UnloadingStepDefSteps.scala) pattern: (?:I )?select (.+) on the 'What is the new additional reference type\?' page
      // andIselectOnTheWhatIsTheNewPackageTypeForItem1InHouseConsignment1Page() [0.78] (UnloadingStepDefSteps.scala) pattern: (?:I )?select (.+) on the 'What is the new package type for item 1 in house consignment 1\?' page

      And(
        "I click the Change additional reference number link in House consignment 1 sub-section Additional reference 1 of section Item 1"
      )
      // Possible match (best=0.92)
      andIclickTheLinkInHouseConsignmentSubsectionOfSection(
        "Change additional reference number",
        "1",
        "Additional reference 1",
        "Item 1"
      )

      And(
        "I enter additional reference NewReference323 on the What is the new additional reference number for item 1 in house consignment 1? page"
      )
      // Possible match (best=0.82)
      andIenterAdditionalReferenceOnTheWhatIsTheNewAdditionalReferenceNumberForItem1InHouseConsignment1Page(
        "NewReference323"
      )
      // --- Other possible matches ---
      // andenterAdditionalReferenceOnTheWhatIsTheNewAdditionalReferenceNumberPage() [0.80] (UnloadingStepDefSteps.scala) pattern: (?:I )?enter additional reference (.+) on the 'What is the new additional reference number\?' page
      // andIenterAdditionalReferenceXOnTheWhatIsTheAdditionalReferenceNumberPage() [0.80] (ItemDetailsStepDefSteps.scala) pattern: (?:I )?enter additional reference (.*) on the 'What is the additional reference number\?' page
      // andIenterXOnTheEnterTheAdditionalReferenceNumberPage() [0.79] (ItemDetailsStepDefSteps.scala) pattern: (?:I )?enter (.*) on the 'Enter the additional reference number' page
      // andIenterOnTheWhatIsTheReferencePage() [0.78] (Departure_GuaranteeDetailsStepDefSteps.scala) pattern: (?:I )?enter (.+) on the 'What is the reference\?' page
      // andIenterOnTheWhatIsTheUniqueConsignmentReferenceForHouseConsignmentPage() [0.77] (UnloadingStepDefSteps.scala) pattern: (?:I )?enter (.+) on the 'What is the Unique Consignment Reference for house consignment (.+)\?' page

      And("I click the Change package type link in House consignment 1 sub-section Packages of section Item 1")
      // Possible match (best=0.92)
      andIclickTheLinkInHouseConsignmentSubsectionOfSection("Change package type", "1", "Packages", "Item 1")

      And("I select (BG) Bag on the What is the new package type for item 1 in house consignment 1? page")
      // Possible match (best=0.81)
      andIselectOnTheWhatIsTheNewPackageTypeForItem1InHouseConsignment1Page("(BG) Bag")

      And("I click the Change package quantity link in House consignment 1 sub-section Packages of section Item 1")
      // Possible match (best=0.92)
      andIclickTheLinkInHouseConsignmentSubsectionOfSection("Change package quantity", "1", "Packages", "Item 1")

      And("I enter 150 on the How many of this package are you using for item 1 in house consignment 1? page")
      // Possible match (best=0.83)
      andIenterXOnTheHowManyOfThisPackageAreYouUsingForItemXInHouseConsignment1Page("150", "1")
      // --- Other possible matches ---
      // andIenterXOnTheHowManyOfThisPackageAreYouUsingPage() [0.80] (UnloadingStepDefSteps.scala) pattern: (?:I )?enter (.*) on the 'How many of this package are you using\?' page

      And("I click the Change shipping mark link in House consignment 1 sub-section Packages of section Item 1")
      // Possible match (best=0.92)
      andIclickTheLinkInHouseConsignmentSubsectionOfSection("Change shipping mark", "1", "Packages", "Item 1")

      And("I enter shipping mark abc on the What is the new shipping mark for item 1 in house consignment 1? page")
      // Possible match (best=0.82)
      andIenterShippingMarkOnTheWhatIsTheNewShippingMarkForItem1InHouseConsignment1Page("abc")
      // --- Other possible matches ---
      // andIenterXOnTheWhatIsTheShippingMarkPage() [0.79] (ItemDetailsStepDefSteps.scala) pattern: (?:I )?enter (.*) on the 'What is the shipping mark\?' page

    }
  }
}
