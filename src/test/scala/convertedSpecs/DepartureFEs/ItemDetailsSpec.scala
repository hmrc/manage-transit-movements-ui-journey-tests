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

package convertedSpecs.DepartureFEs

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

import convertedSpecs.BaseSpec
import org.scalatest.GivenWhenThen
import specsteps.CYAStepDefSteps.*
import specsteps.CommonStepDefSteps.*
import specsteps.DraftDepartureDeclarationsStepDefSteps.andIclickOnTheLinkForLRNXOnTheDraftDepartureDeclarationsPage
import specsteps.ItemDetailsStepDefSteps.*
import specsteps.LoginStepDefSteps.*
import specsteps.ManageStepDefSteps.*
import specsteps.PreTaskListStepDefSteps.whenTheUserHasSubmittedFileForLRNAndEORINumber
import specsteps.TaskListStepDefSteps.*

class ItemDetailsSpec extends BaseSpec with GivenWhenThen {

  Feature("Item details Journey") {

    Scenario("01 Great Britain office of departure") {

      Given("I login with ID 1234567890")
      andILoginWithIDX("1234567890")
      And("The user has submitted itemDetailsGB.json for LRN 1234567890TDGB and EORI Number 1234567890")
      whenTheUserHasSubmittedFileForLRNAndEORINumber("itemDetailsGB.json", "1234567890TDGB", "1234567890")
      And("I refresh the page")
      andIrefreshThePage()
      And("I click on the View draft departure declarations link on the Manage your transit movements page")
      givenIclickOnTheLinkOnTheManageYourTransitMovementsPage("View draft departure declarations")
      And(
        "I click on the link for LRN 1234567890TDGB on the Draft Departure declarations page"
      )
      andIclickOnTheLinkForLRNXOnTheDraftDepartureDeclarationsPage("1234567890TDGB")
      And("I click on the Add items link on the Declaration summary page")
      thenIclickOnTheLinkOnTheDeclarationSummaryPage("Add items")

      //Item Details
      And("I enter This is a description, with a comma on the 'Enter a description of item 1' page")
      andIenterXOnTheEnterADescriptionOfItemXPage("This is a description, with a comma", "1")
      And("I select (1) Transport equipment - GB123456789000 on the 'Which transport equipment are you using for this item?' page")
      andIselectOnTheWhichTransportEquipmentAreYouUsingForThisItemPage("(1) Transport equipment - GB123456789000")
      And("I choose radio option T2 on the 'Which type of declaration do you want to create for this item?' page")
      andIchooseRadioOptionXOnTheWhichTypeOfDeclarationDoYouWantToCreateForThisItemPage("T2")
      And("I select United Kingdom on the 'What is the item’s country of dispatch?' page")
      andIselectOnTheWhatIsTheItemsCountryOfDispatchPage("United Kingdom")
      And("I select Germany on the 'What is the item’s country of destination?' page")
      andIselectOnTheWhatIsTheItemsCountryOfDestinationPage("Germany")
      And("I enter UCR12312 on the 'What is the Unique Consignment Reference?' page")
      andIenterXOnTheWhatIsTheUniqueConsignmentReferencePage("UCR12312")
      And("I click radio option Yes on the 'Do you want to add a Customs Union and Statistics code?' page")
      andIclickRadioOptionXOnTheDoYouWantToAddACustomsUnionAndStatisticsCodePage("Yes")
      And("I enter 0010001-6 on the 'What is the Customs Union and Statistics code?' page")
      andIenterXOnTheWhatIsTheCustomsUnionAndStatisticsCodePage("0010001-6")
      And("And I enter 392690 on the 'What is the commodity code?' page")
      andIenterXOnTheWhatIsTheCommodityCodePage("392690")

      //Dangerous Goods
      And("I click radio option Yes on the 'Does the item contain any dangerous goods?' page")
      andIclickRadioOptionXOnTheDoesTheItemContainAnyDangerousGoodsPage("Yes")
      And("I enter AB12 on the 'What is the UN number for the dangerous goods?' page")
      andIenterXOnTheWhatIsTheUNNumberForTheDangerousGoodsPage("AB12")
      And("I click radio option Yes on the 'You have added 1 UN number for dangerous goods' page")
      andIclickRadioOptionXOnTheYouHaveAddedXUNNumbesforDangerousGoodsPage("Yes", "1")
      And("I enter 1234 on the 'What is the UN number for the dangerous goods?' page")
      andIenterXOnTheWhatIsTheUNNumberForTheDangerousGoodsPage("1234")
      And("I click the Remove link on the 'You have added 2 UN numbers for dangerous goods' page")
      andIclickTheXLinkOnTheYouHaveAddedXUNNumbersforDangerousGoodsPage("Remove", "2")
      And("I click radio option Yes on the 'Are you sure you want to remove this UN number?' page")
      andIclickRadioOptionXOnTheAreYouSureYouWantToRemoveThisUNNumberPage("Yes")
      And("I click radio option No on the 'You have added 1 UN number for dangerous goods' page")
      andIclickRadioOptionXOnTheYouHaveAddedXUNNumbesforDangerousGoodsPage("No", "1")

      //Measurement Section
      And("I enter 100 on the 'What is the item’s gross weight?' page")
      andIenterXOnTheWhatIsTheItemsGrossWeightPage("100")
      And("I click radio option Yes on the 'Do you want to add the item’s net weight?' page")
      andIclickRadioOptionXOnTheDoYouWantToAddTheItemsNetWeightPage("Yes")
      And("I enter 25.99 on the 'What is the item’s net weight?' page")
      andIenterXOnTheWhatIsTheItemsNetWeightPage("25.99")
      And("I click radio option Yes on the 'Do you want to add supplementary units?' page")
      andIclickRadioOptionXOnTheDoYouWantToAddSupplementaryUnitsPage("Yes")
      And("I enter 123.99 on the 'How many supplementary units does the item include?' page")
      andIenterXOnTheHowManySupplementaryUnitsDoesTheItemIncludePage("123.99")

      //Package Section
      And("I select (NE) Unpacked or unpackaged on the 'What type of package are you using for the item?' page")
      andIselectOnTheWhatTypeOfPackageAreYouUsingForTheItemPage("(NE) Unpacked or unpackaged")
      And("I enter 1 on the 'How many of these are you using?' page")
      andIenterXOnTheHowManyOfTheseAreYouUsingPage("1")
      And("I click radio option Yes on the 'Do you want to add a shipping mark?' page")
      andIclickRadioOptionXOnTheDoYouWantToAddAShippingMarkPage("Yes")
      And("I enter This is a description on the 'What is the shipping mark?' page")
      andIenterXOnTheWhatIsTheShippingMarkPage("This is a description")
      And("I click radio option Yes on the 'You have added 1 types of package' page")
      andIclickRadioOptionXOnTheYouHaveAddedXTypesofPackagePage("Yes", "1")
      And("I select (AE) Aerosol on the 'What type of package are you using for the item?' page")
      andIselectOnTheWhatTypeOfPackageAreYouUsingForTheItemPage("(AE) Aerosol")
      And("I enter 0 on the 'How many of these are you using?' page")
      andIenterXOnTheHowManyOfTheseAreYouUsingPage("0")
      And("I click continue on the 'Before you continue' page")
      andIclickContinueOnTheBeforeYouContinuePage()
      And("I enter This is a shipping mark on the 'What is the shipping mark?' page")
      andIenterXOnTheWhatIsTheShippingMarkPage("This is a shipping mark")
      And("I click the Remove link on the 'You have added 2 types of packages' page")
      andIclickTheXLinkOnTheYouHaveAddedXTypesofPackagesPage("Remove", "2")
      And("I click radio option Yes on the 'Are you sure you want to remove this package from the item?' page")
      andIclickRadioOptionXOnTheAreYouSureYouWantToRemoveThisPackageFromTheItemPage("Yes")
      And("I click radio option No on the 'You have added 1 type of package' page")
      andIclickRadioOptionXOnTheYouHaveAddedXTypesofPackagePage("No", "1")

      //Supply Chain Actor
      And("I click radio option Yes on the 'Do you want to add a supply chain actor for this item?' page")
      andIclickRadioOptionXOnTheDoYouWantToAddASupplyChainActorForThisItemPage("Yes")
      And("I click radio option Consolidator on the 'Which type of supply chain actor do you want to add?' item page")
      andIclickRadioOptionXOnTheWhichTypeOfSupplyChainActorDoYouWantToAddItemPage("Consolidator")
      And("I enter GB123456789000 on the 'What is the EORI number or Trader Identification Number TIN for the consolidator?' item page")
      andIenterXOnTheWhatIsTheEORINumberOrTraderIdentificationNumberTINForTheXItemPage("GB123456789000", "consolidator")
      And("I click radio option Yes on the 'You have added 1 supply chain actor for this item' item page")
      andIclickRadioOptionXOnTheYouHaveAddedXSupplyChainActorsForThisItemItemPage("Yes", "1")
      And("I click radio option Warehouse keeper on the 'Which type of supply chain actor do you want to add?' item page")
      andIclickRadioOptionXOnTheWhichTypeOfSupplyChainActorDoYouWantToAddItemPage("Warehouse keeper")
      And("I enter GB123456789000 on the 'What is the EORI number or Trader Identification Number TIN for the warehouse keeper?' item page")
      andIenterXOnTheWhatIsTheEORINumberOrTraderIdentificationNumberTINForTheXItemPage("GB123456789000", "warehouse keeper")
      And("I click the Remove link on the 'You have added 2 supply chain actors for this item' item page")
      andIclickTheXLinkOnTheYouHaveAddedXSupplyChainActorsForThisItemItemPage("Remove", "2")
      And("I click radio option Yes on the 'Are you sure you want to remove this supply chain actor?' item page")
      andIclickRadioOptionXOnTheAreYouSureYouWantToRemoveThisSupplyChainActorItemPage("Yes")
      And("I click radio option No on the 'You have added 1 supply chain actor for this item' item page")
      andIclickRadioOptionXOnTheYouHaveAddedXSupplyChainActorsForThisItemItemPage("No", "1")

      //Documents Section
      And("I click radio option Yes on the 'You have attached 1 document to this item' page")
      andIclickRadioOptionXOnTheYouHaveAttachedXDocumentsToThisItemPage("Yes", "1")
      And("I select (C673) Catch certificate on the 'Which document do you want to attach?' page")
      andIselectOnTheWhichDocumentDoYouWantToAttachPage("(C673) Catch certificate")
      And("I click the Remove link on the 'You have attached 2 documents to this item' page")
      andIclickTheXLinkOnTheYouHaveAttachedXDocumentsToThisItemPage("Remove", "2")
      And("I click radio option Yes on the 'Are you sure you want to remove this document from the item?' document page")
      andIclickRadioOptionXOnTheAreYouSureYouWantToRemoveThisDocumentFromTheItemDocumentPage("Yes")
      And("I click radio option No on the 'You have attached 1 document to this item' page")
      andIclickRadioOptionXOnTheYouHaveAttachedXDocumentsToThisItemPage("No", "1")

      //Additional Reference
      And("I click radio option Yes on the 'Do you want to add an additional reference for this item?' page")
      andIclickRadioOptionXOnTheDoYouWantToAddAnAdditionalReferenceForThisItemPage("Yes")
      And("I select (Y023) Consignee (AEO certificate number) on the 'What type of additional reference do you want to add?' page")
      andIselectOnTheWhatTypeOfAdditionalReferenceDoYouWantToAddPage("(Y023) Consignee (AEO certificate number)")
      And("I click radio option Yes on the 'Do you want to add an additional reference number?' page")
      andIclickRadioOptionXOnTheDoYouWantToAddAnAdditionalReferenceNumberPage("Yes")
      And("I enter 12345,6789 on the 'Enter the additional reference number' page")
      andIenterXOnTheEnterTheAdditionalReferenceNumberPage("12345,6789")
      And("click radio option Yes on the 'You have added 1 additional reference' page")
      andIclickRadioOptionXOnTheYouHaveAddedXAdditionalReferencesPage("Yes", "1")
      And("I select (C651) Electronic administrative document (e-AD) on the 'What type of additional reference do you want to add?' page")
      andIselectOnTheWhatTypeOfAdditionalReferenceDoYouWantToAddPage("(C651) Electronic administrative document (e-AD)")
      And("I enter 98765,4321 on the 'Enter the additional reference number' page")
      andIenterXOnTheEnterTheAdditionalReferenceNumberPage("98765,4321")
      And("I click the Remove link on the 'You have added 2 additional references' page")
      andIclickTheXLinkOnTheYouHaveAddedXAdditionalReferencesPage("Remove", "2")
      And("I click radio option Yes on the 'Are you sure you want to remove this additional reference?' page")
      andIclickRadioOptionXOnTheAreYouSureYouWantToRemoveThisAdditionalReferencePage("Yes")
      And("click radio option No on the 'You have added 1 additional reference' page")
      andIclickRadioOptionXOnTheYouHaveAddedXAdditionalReferencesPage("No", "1")

      //Additional Information
      And("I click radio option Yes on the 'Do you want to add any additional information for this item?' page")
      andIclickRadioOptionXOnTheDoYouWantToAddAnyAdditionalInformationForThisItemPage("Yes")
      And("I select (20300) Export on the 'What type of additional information do you want to add?' page")
      andIselectOnTheWhatTypeOfAdditionalInformationDoYouWantToAddPage("(20300) Export")
      And("I enter 12345 on the 'Enter the additional information' page")
      andIenterXOnTheEnterTheAdditionalInformationPage("12345")
      And("I click radio option Yes on the 'You have added 1 additional information' page")
      andIclickRadioOptionXOnTheYouHaveAddedXAdditionalInformationPage("Yes", "1")
      And("I select (20200) Export from one EFTA country subject to duties or export from the Union subject to duties on the 'What type of additional information do you want to add?' page")
      andIselectOnTheWhatTypeOfAdditionalInformationDoYouWantToAddPage("(20200) Export")
      And("I enter 12345 on the 'Enter the additional information' page")
      andIenterXOnTheEnterTheAdditionalInformationPage("12345")
      And("I click the Remove link on the 'You have added 2 additional information' page")
      andIclickTheXLinkOnTheYouHaveAddedXAdditionalInformationPage("Remove", "2")
      And("I click radio option Yes on the 'Are you sure you want to remove this additional information?' page")
      andIclickRadioOptionXOnTheAreYouSureYouWantToRemoveThisAdditionalInformationPage("Yes")
      And("I click radio option No on the 'You have added 1 additional information' page")
      andIclickRadioOptionXOnTheYouHaveAddedXAdditionalInformationPage("No", "1")

      And("I submit on the Check your answers section Items page")
      andIsubmitOnTheCheckYourAnswersSectionXPage("Items")
      And("I click radio option Yes on the 'You have added 1 item' page")
      andIclickRadioOptionXOnTheYouHaveAddedXItemPage("Yes", "1")

      And("I add a second Item answering No to all optional questions")
      andIenterXOnTheEnterADescriptionOfItemXPage("This is a description", "2")
      andIselectOnTheWhichTransportEquipmentAreYouUsingForThisItemPage("(1) Transport equipment - GB123456789000")
      andIchooseRadioOptionXOnTheWhichTypeOfDeclarationDoYouWantToCreateForThisItemPage("T1")
      andIselectOnTheWhatIsTheItemsCountryOfDispatchPage("United Kingdom")
      andIselectOnTheWhatIsTheItemsCountryOfDestinationPage("Germany")
      andIenterXOnTheWhatIsTheUniqueConsignmentReferencePage("UCR12312")
      andIclickRadioOptionXOnTheDoYouWantToAddACustomsUnionAndStatisticsCodePage("No")
      andIenterXOnTheWhatIsTheCommodityCodePage("392690")
      andIclickRadioOptionXOnTheDoesTheItemContainAnyDangerousGoodsPage("No")
      andIenterXOnTheWhatIsTheItemsGrossWeightPage("100")
      andIclickRadioOptionXOnTheDoYouWantToAddTheItemsNetWeightPage("No")
      andIclickRadioOptionXOnTheDoYouWantToAddSupplementaryUnitsPage("No")
      andIselectOnTheWhatTypeOfPackageAreYouUsingForTheItemPage("(NE) Unpacked or unpackaged")
      andIenterXOnTheHowManyOfTheseAreYouUsingPage("1")
      andIclickRadioOptionXOnTheDoYouWantToAddAShippingMarkPage("No")
      andIclickRadioOptionXOnTheYouHaveAddedXTypesofPackagePage("No", "1")
      andIclickRadioOptionXOnTheDoYouWantToAddASupplyChainActorForThisItemPage("No")
      andIclickRadioOptionXOnTheYouHaveAttachedXDocumentsToThisItemPage("No", "1")
      andIclickRadioOptionXOnTheDoYouWantToAddAnAdditionalReferenceForThisItemPage("No")
      andIclickRadioOptionXOnTheDoYouWantToAddAnyAdditionalInformationForThisItemPage("No")

      And("I submit on the Check your answers section Items page")
      andIsubmitOnTheCheckYourAnswersSectionXPage("Items")
      And("I click the Remove link on the 'You have added 2 items' page")
      andIclickTheXLinkOnTheYouHaveAddedXItemsPage("Remove","2")
      And("I click radio option Yes on the 'Are you sure you want to remove item 1?' page")
      andIclickRadioOptionXOnTheAreYouSureYouWantToRemoveItemXPage("Yes","1")
      And("I click radio option No on the 'You have added 1 item' page")
      andIclickRadioOptionXOnTheYouHaveAddedXItemPage("No", "1")
      Then("I should be on the Declaration summary page")
      thenIshouldbeOnTheDeclarationSummaryPage()
      And("I should see Completed status for items on the Declaration summary page")
      andIshouldSeeXStatusForOnTheDeclarationSummaryPage("Completed", "items")

      And("I sign out")
      andISignOut()

    }

    Scenario("02 Office Departure XI Declaration Type TIR") {

      Given("I login with ID 1234567890")
      andILoginWithIDX("1234567890")
      And("The user has submitted itemDetailsXI.json for LRN 1234567890TDXI and EORI Number 1234567890")
      whenTheUserHasSubmittedFileForLRNAndEORINumber("itemDetailsXI.json", "1234567890TDXI", "1234567890")
      And("I refresh the page")
      andIrefreshThePage()
      And("I click on the View draft departure declarations link on the Manage your transit movements page")
      givenIclickOnTheLinkOnTheManageYourTransitMovementsPage("View draft departure declarations")
      And(
        "I click on the link for LRN 1234567890TDXI on the Draft Departure declarations page"
      )
      andIclickOnTheLinkForLRNXOnTheDraftDepartureDeclarationsPage("1234567890TDXI")
      And("I click on the Add items link on the Declaration summary page")
      thenIclickOnTheLinkOnTheDeclarationSummaryPage("Add items")

      //Item Details
      And("I enter This is a description on the 'Enter a description of item 1' page")
      andIenterXOnTheEnterADescriptionOfItemXPage("This is a description", "1")
      And("I select (1) Transport equipment - GB123456789000 on the 'Which transport equipment are you using for this item?' page")
      andIselectOnTheWhichTransportEquipmentAreYouUsingForThisItemPage("(1) Transport equipment - GB123456789000")
      And("I select United Kingdom on the 'What is the item’s country of dispatch?' page")
      andIselectOnTheWhatIsTheItemsCountryOfDispatchPage("United Kingdom")
      And("I select Germany on the 'What is the item’s country of destination?' page")
      andIselectOnTheWhatIsTheItemsCountryOfDestinationPage("Germany")
      And("I enter UCR12312 on the 'What is the Unique Consignment Reference?' page")
      andIenterXOnTheWhatIsTheUniqueConsignmentReferencePage("UCR12312")
      And("I click radio option No on the 'Do you want to add a Customs Union and Statistics code?' page")
      andIclickRadioOptionXOnTheDoYouWantToAddACustomsUnionAndStatisticsCodePage("No")
      And("And I enter 392690 on the 'What is the commodity code?' page")
      andIenterXOnTheWhatIsTheCommodityCodePage("392690")
      And("I click radio option Yes on the 'Do you want to add a combined nomenclature code?' page")
      andIclickRadioOptionXOnTheDoYouWantToAddACombinedNomenclatureCodePage("Yes")
      And("I enter A1 on the 'What is the combined nomenclature code?' page")
      andIenterXOnTheWhatIsTheCombinedNomenclatureCodePage("A1")
      And("I click radio option No on the 'Does the item contain any dangerous goods?' page")
      andIclickRadioOptionXOnTheDoesTheItemContainAnyDangerousGoodsPage("No")
      And("I enter 0 on the 'What is the item’s gross weight?' page")
      andIenterXOnTheWhatIsTheItemsGrossWeightPage("0")
      And("I click the continue button on the 'Before you continue' page")
      andIclickTheContinueButtonOnTheBeforeYouContinuePage()
      And("I click radio option No on the 'Do you want to add the item’s net weight?' page")
      andIclickRadioOptionXOnTheDoYouWantToAddTheItemsNetWeightPage("No")
      And("I click radio option No on the 'Do you want to add supplementary units?' page")
      andIclickRadioOptionXOnTheDoYouWantToAddSupplementaryUnitsPage("No")
      And("I select (AE) Aerosol on the 'What type of package are you using for the item?' page")
      andIselectOnTheWhatTypeOfPackageAreYouUsingForTheItemPage("(AE) Aerosol")
      And("I enter 20 on the 'How many of these are you using?' page")
      andIenterXOnTheHowManyOfTheseAreYouUsingPage("20")
      And("I enter This is a description on the 'What is the shipping mark?' page")
      andIenterXOnTheWhatIsTheShippingMarkPage("This is a description")
      And("I click radio option No on the 'You have added 1 types of package' page")
      andIclickRadioOptionXOnTheYouHaveAddedXTypesofPackagePage("No", "1")
      And("I click radio option No on the 'Do you want to add a supply chain actor for this item?' page")
      andIclickRadioOptionXOnTheDoYouWantToAddASupplyChainActorForThisItemPage("No")
      And("I click radio option No on the 'You have attached 1 document to this item' page")
      andIclickRadioOptionXOnTheYouHaveAttachedXDocumentsToThisItemPage("No", "1")
      And("I click radio option No on the 'Do you want to add an additional reference for this item?' page")
      andIclickRadioOptionXOnTheDoYouWantToAddAnAdditionalReferenceForThisItemPage("No")
      And("I click radio option No on the 'Do you want to add any additional information for this item?' page")
      andIclickRadioOptionXOnTheDoYouWantToAddAnyAdditionalInformationForThisItemPage("No")

      And("I submit on the Check your answers section Items page")
      andIsubmitOnTheCheckYourAnswersSectionXPage("Items")
      And("I click radio option No on the 'You have added 1 item' page")
      andIclickRadioOptionXOnTheYouHaveAddedXItemPage("No", "1")
      Then("I should be on the Declaration summary page")
      thenIshouldbeOnTheDeclarationSummaryPage()
      And("I should see Completed status for items on the Declaration summary page")
      andIshouldSeeXStatusForOnTheDeclarationSummaryPage("Completed", "items")


    }
  }
}
