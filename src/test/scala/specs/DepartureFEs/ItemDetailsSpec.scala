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

package specs.DepartureFEs

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

import specpage.Departures.Items.AddCUSCodePage
import specpage.Departures.Items.AddDangerousGoodsPage
import specpage.Departures.Items.AddNomenclatureCodePage
import specpage.Departures.Items.AdditionalInformationAddAnotherPage
import specpage.Departures.Items.AdditionalInformationAddPage
import specpage.Departures.Items.AdditionalInformationEnterTextPage
import specpage.Departures.Items.AdditionalInformationRemovePage
import specpage.Departures.Items.AdditionalReferenceAddAnotherPage
import specpage.Departures.Items.AdditionalReferenceAddNumberPage
import specpage.Departures.Items.AdditionalReferenceAddPage
import specpage.Departures.Items.AdditionalReferenceEnterNumberPage
import specpage.Departures.Items.AdditionalReferenceRemovePage
import specpage.Departures.Items.AdditionalReferenceTypePage
import specpage.Departures.Items.CUSCodePage
import specpage.Departures.Items.CommodityCodePage
import specpage.Departures.Items.DangerousGoodsUnNumberAddAnotherPage
import specpage.Departures.Items.DangerousGoodsUnNumberPage
import specpage.Departures.Items.DocumentsAddAnotherPage
import specpage.Departures.Items.DocumentsRemoveDocumentPage
import specpage.Departures.Items.DocumentsWhichDocumentPage
import specpage.Departures.Items.ErrorHintTextPage
import specpage.Departures.Items.ItemAdditionalInformationTypePage
import specpage.Departures.Items.ItemCountryOfDestinationPage
import specpage.Departures.Items.ItemCountryOfDispatchPage
import specpage.Departures.Items.ItemDeclarationTypePage
import specpage.Departures.Items.ItemDescriptionPage
import specpage.Departures.Items.ItemTransportEquipmentPage
import specpage.Departures.Items.ItemUCRNumberPage
import specpage.Departures.Items.ItemsAddAnotherPage
import specpage.Departures.Items.MeasurementAddNetWeightPage
import specpage.Departures.Items.MeasurementAddSupplementaryUnitsPage
import specpage.Departures.Items.MeasurementGrossWeightPage
import specpage.Departures.Items.MeasurementGrossWeightWarningPage
import specpage.Departures.Items.MeasurementNetWeightPage
import specpage.Departures.Items.MeasurementSupplementaryUnitsPage
import specpage.Departures.Items.NomenclatureCodePage
import specpage.Departures.Items.PackageTypePage
import specpage.Departures.Items.PackagesAddAnotherPage
import specpage.Departures.Items.PackagesAddShippingMarkPage
import specpage.Departures.Items.PackagesShippingMarkPage
import specpage.Departures.Items.PackagesTypeQuantityPage
import specpage.Departures.Items.RemoveDangerousGoodsPage
import specpage.Departures.Items.RemoveItemPage
import specpage.Departures.Items.RemovePackagePage
import specpage.Departures.Items.SupplyChainActorEoriTinItemPage
import specpage.Departures.Items.SupplyChainActorItemAddAnotherPage
import specpage.Departures.Items.SupplyChainActorItemAddPage
import specpage.Departures.Items.SupplyChainActorItemRemoveSCAPage
import specpage.Departures.Items.SupplyChainActorTypeItemPage
import specpage.ManagedFEDraftDepartureDelcarationsPage
import specpage.CommonPages.CYAPage
import specpage.CommonPages.CommonPage
import specs.BaseSpec
import org.scalatest.GivenWhenThen
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
      CommonPage.refreshPage()
      And("I click on the View draft departure declarations link on the Manage your transit movements page")
      givenIclickOnTheLinkOnTheManageYourTransitMovementsPage("View draft departure declarations")
      And(
        "I click on the link for LRN 1234567890TDGB on the Draft Departure declarations page"
      )
      ManagedFEDraftDepartureDelcarationsPage.followDraftLink("1234567890TDGB")
      And("I click on the Add items link on the Declaration summary page")
      thenIclickOnTheLinkOnTheDeclarationSummaryPage("Add items")

      // Item Details
      And("I enter This is a description, with a comma on the 'Enter a description of item 1' page")
      ItemDescriptionPage.enterDescription("This is a description, with a comma", "1")
      And(
        "I select (1) Transport equipment - GB123456789000 on the 'Which transport equipment are you using for this item?' page"
      )
      ItemTransportEquipmentPage.selectEquipment("(1) Transport equipment - GB123456789000")
      And("I choose radio option T2 on the 'Which type of declaration do you want to create for this item?' page")
      ItemDeclarationTypePage.selectDeclarationType("T2")
      And("I select United Kingdom on the 'What is the item’s country of dispatch?' page")
      ItemCountryOfDispatchPage.selectCountry("United Kingdom")
      And("I select Germany on the 'What is the item’s country of destination?' page")
      ItemCountryOfDestinationPage.selectCountry("Germany")
      And("I enter UCR12312 on the 'What is the Unique Consignment Reference?' page")
      ItemUCRNumberPage.enterAndContinue("UCR12312")
      And("I click radio option Yes on the 'Do you want to add a Customs Union and Statistics code?' page")
      AddCUSCodePage.selectAndContinue("Yes")
      And("I enter 0010001-6 on the 'What is the Customs Union and Statistics code?' page")
      CUSCodePage.enterAndContinue("0010001-6")
      And("And I enter 392690 on the 'What is the commodity code?' page")
      CommodityCodePage.enterAndContinue("392690")

      // Dangerous Goods
      And("I click radio option Yes on the 'Does the item contain any dangerous goods?' page")
      AddDangerousGoodsPage.selectAndContinue("Yes")
      And("I enter AB12 on the 'What is the UN number for the dangerous goods?' page")
      DangerousGoodsUnNumberPage.enterAndContinue("AB12")
      And("I click radio option Yes on the 'You have added 1 UN number for dangerous goods' page")
      DangerousGoodsUnNumberAddAnotherPage.answerAddAnother("Yes", "1")
      And("I enter 1234 on the 'What is the UN number for the dangerous goods?' page")
      DangerousGoodsUnNumberPage.enterAndContinue("1234")
      And("I click the Remove link on the 'You have added 2 UN numbers for dangerous goods' page")
      DangerousGoodsUnNumberAddAnotherPage.followLink("Remove", "2")
      And("I click radio option Yes on the 'Are you sure you want to remove this UN number?' page")
      RemoveDangerousGoodsPage.confirmRemoval("Yes")
      And("I click radio option No on the 'You have added 1 UN number for dangerous goods' page")
      DangerousGoodsUnNumberAddAnotherPage.answerAddAnother("No", "1")

      // Measurement Section
      And("I enter 100 on the 'What is the item’s gross weight?' page")
      MeasurementGrossWeightPage.enterGrossWeight("100")
      And("I click radio option Yes on the 'Do you want to add the item’s net weight?' page")
      MeasurementAddNetWeightPage.selectAndContinue("Yes")
      And("I enter 25.99 on the 'What is the item’s net weight?' page")
      MeasurementNetWeightPage.enterNetWeight("25.99")
      And("I click radio option Yes on the 'Do you want to add supplementary units?' page")
      MeasurementAddSupplementaryUnitsPage.selectAndContinue("Yes")
      And("I enter 123.99 on the 'How many supplementary units does the item include?' page")
      MeasurementSupplementaryUnitsPage.enterSupplementaryUnits("123.99")

      // Package Section
      And("I select (NE) Unpacked or unpackaged on the 'What type of package are you using for the item?' page")
      PackageTypePage.selectAndContinue("(NE) Unpacked or unpackaged")
      And("I enter 1 on the 'How many of these are you using?' page")
      PackagesTypeQuantityPage.enterAndContinue("1")
      And("I click radio option Yes on the 'Do you want to add a shipping mark?' page")
      PackagesAddShippingMarkPage.selectAndContinue("Yes")
      And("I enter This is a description on the 'What is the shipping mark?' page")
      PackagesShippingMarkPage.enterAndContinue("This is a description")
      And("I click radio option Yes on the 'You have added 1 types of package' page")
      PackagesAddAnotherPage.answerAddAnother("Yes", "1")
      And("I select (AE) Aerosol on the 'What type of package are you using for the item?' page")
      PackageTypePage.selectAndContinue("(AE) Aerosol")
      And("I enter 0 on the 'How many of these are you using?' page")
      PackagesTypeQuantityPage.enterAndContinue("0")
      And("I click continue on the 'Before you continue' page")
      ErrorHintTextPage.continueToNextPage()
      And("I enter This is a shipping mark on the 'What is the shipping mark?' page")
      PackagesShippingMarkPage.enterAndContinue("This is a shipping mark")
      And("I click the Remove link on the 'You have added 2 types of packages' page")
      PackagesAddAnotherPage.followLink("Remove", "2")
      And("I click radio option Yes on the 'Are you sure you want to remove this package from the item?' page")
      RemovePackagePage.confirmRemoval("Yes")
      And("I click radio option No on the 'You have added 1 type of package' page")
      PackagesAddAnotherPage.answerAddAnother("No", "1")

      // Supply Chain Actor
      And("I click radio option Yes on the 'Do you want to add a supply chain actor for this item?' page")
      SupplyChainActorItemAddPage.selectAndContinue("Yes")
      And("I click radio option Consolidator on the 'Which type of supply chain actor do you want to add?' item page")
      SupplyChainActorTypeItemPage.selectAndContinue("Consolidator")
      And(
        "I enter GB123456789000 on the 'What is the EORI number or Trader Identification Number TIN for the consolidator?' item page"
      )
      SupplyChainActorEoriTinItemPage.enterAndContinue("GB123456789000", "consolidator")
      And("I click radio option Yes on the 'You have added 1 supply chain actor for this item' item page")
      SupplyChainActorItemAddAnotherPage.answerAddAnother("Yes", "1")
      And(
        "I click radio option Warehouse keeper on the 'Which type of supply chain actor do you want to add?' item page"
      )
      SupplyChainActorTypeItemPage.selectAndContinue("Warehouse keeper")
      And(
        "I enter GB123456789000 on the 'What is the EORI number or Trader Identification Number TIN for the warehouse keeper?' item page"
      )
      SupplyChainActorEoriTinItemPage.enterAndContinue("GB123456789000", "warehouse keeper")
      And("I click the Remove link on the 'You have added 2 supply chain actors for this item' item page")
      SupplyChainActorItemAddAnotherPage.followLink("Remove", "2")
      And("I click radio option Yes on the 'Are you sure you want to remove this supply chain actor?' item page")
      SupplyChainActorItemRemoveSCAPage.confirmRemoval("Yes")
      And("I click radio option No on the 'You have added 1 supply chain actor for this item' item page")
      SupplyChainActorItemAddAnotherPage.answerAddAnother("No", "1")

      // Documents Section
      And("I click radio option Yes on the 'You have attached 1 document to this item' page")
      DocumentsAddAnotherPage.answerAddAnother("Yes", "1")
      And("I select (C673) Catch certificate on the 'Which document do you want to attach?' page")
      DocumentsWhichDocumentPage.selectAndContinue("(C673) Catch certificate")
      And("I click the Remove link on the 'You have attached 2 documents to this item' page")
      DocumentsAddAnotherPage.followLink("Remove", "2")
      And(
        "I click radio option Yes on the 'Are you sure you want to remove this document from the item?' document page"
      )
      DocumentsRemoveDocumentPage.confirmRemoval("Yes")
      And("I click radio option No on the 'You have attached 1 document to this item' page")
      DocumentsAddAnotherPage.answerAddAnother("No", "1")

      // Additional Reference
      And("I click radio option Yes on the 'Do you want to add an additional reference for this item?' page")
      AdditionalReferenceAddPage.selectAndContinue("Yes")
      And(
        "I select (Y023) Consignee (AEO certificate number) on the 'What type of additional reference do you want to add?' page"
      )
      AdditionalReferenceTypePage.selectAndContinue("(Y023) Consignee (AEO certificate number)")
      And("I click radio option Yes on the 'Do you want to add an additional reference number?' page")
      AdditionalReferenceAddNumberPage.selectAndContinue("Yes")
      And("I enter 12345,6789 on the 'Enter the additional reference number' page")
      AdditionalReferenceEnterNumberPage.enterAndContinue("12345,6789")
      And("click radio option Yes on the 'You have added 1 additional reference' page")
      AdditionalReferenceAddAnotherPage.answerAddAnother("Yes", "1")
      And(
        "I select (C651) Electronic administrative document (e-AD) on the 'What type of additional reference do you want to add?' page"
      )
      AdditionalReferenceTypePage.selectAndContinue("(C651) Electronic administrative document (e-AD)")
      And("I enter 98765,4321 on the 'Enter the additional reference number' page")
      AdditionalReferenceEnterNumberPage.enterAndContinue("98765,4321")
      And("I click the Remove link on the 'You have added 2 additional references' page")
      AdditionalReferenceAddAnotherPage.followLink("Remove", "2")
      And("I click radio option Yes on the 'Are you sure you want to remove this additional reference?' page")
      AdditionalReferenceRemovePage.confirmRemoval("Yes")
      And("click radio option No on the 'You have added 1 additional reference' page")
      AdditionalReferenceAddAnotherPage.answerAddAnother("No", "1")

      // Additional Information
      And("I click radio option Yes on the 'Do you want to add any additional information for this item?' page")
      AdditionalInformationAddPage.selectAndContinue("Yes")
      And("I select (20300) Export on the 'What type of additional information do you want to add?' page")
      ItemAdditionalInformationTypePage.selectAndContinue("(20300) Export")
      And("I enter 12345 on the 'Enter the additional information' page")
      AdditionalInformationEnterTextPage.enterAndContinue("12345")
      And("I click radio option Yes on the 'You have added 1 additional information' page")
      AdditionalInformationAddAnotherPage.answerAddAnother("Yes", "1")
      And(
        "I select (20200) Export from one EFTA country subject to duties or export from the Union subject to duties on the 'What type of additional information do you want to add?' page"
      )
      ItemAdditionalInformationTypePage.selectAndContinue("(20200) Export")
      And("I enter 12345 on the 'Enter the additional information' page")
      AdditionalInformationEnterTextPage.enterAndContinue("12345")
      And("I click the Remove link on the 'You have added 2 additional information' page")
      AdditionalInformationAddAnotherPage.followLink("Remove", "2")
      And("I click radio option Yes on the 'Are you sure you want to remove this additional information?' page")
      AdditionalInformationRemovePage.confirmRemoval("Yes")
      And("I click radio option No on the 'You have added 1 additional information' page")
      AdditionalInformationAddAnotherPage.answerAddAnother("No", "1")

      And("I submit on the Check your answers section Items page")
      CYAPage.submitAnswers("Items")
      And("I click radio option Yes on the 'You have added 1 item' page")
      ItemsAddAnotherPage.answerAddAnother("Yes", "1")

      And("I add a second Item answering No to all optional questions")
      ItemDescriptionPage.enterDescription("This is a description", "2")
      ItemTransportEquipmentPage.selectEquipment("(1) Transport equipment - GB123456789000")
      ItemDeclarationTypePage.selectDeclarationType("T1")
      ItemCountryOfDispatchPage.selectCountry("United Kingdom")
      ItemCountryOfDestinationPage.selectCountry("Germany")
      ItemUCRNumberPage.enterAndContinue("UCR12312")
      AddCUSCodePage.selectAndContinue("No")
      CommodityCodePage.enterAndContinue("392690")
      AddDangerousGoodsPage.selectAndContinue("No")
      MeasurementGrossWeightPage.enterGrossWeight("100")
      MeasurementAddNetWeightPage.selectAndContinue("No")
      MeasurementAddSupplementaryUnitsPage.selectAndContinue("No")
      PackageTypePage.selectAndContinue("(NE) Unpacked or unpackaged")
      PackagesTypeQuantityPage.enterAndContinue("1")
      PackagesAddShippingMarkPage.selectAndContinue("No")
      PackagesAddAnotherPage.answerAddAnother("No", "1")
      SupplyChainActorItemAddPage.selectAndContinue("No")
      DocumentsAddAnotherPage.answerAddAnother("No", "1")
      AdditionalReferenceAddPage.selectAndContinue("No")
      AdditionalInformationAddPage.selectAndContinue("No")

      And("I submit on the Check your answers section Items page")
      CYAPage.submitAnswers("Items")
      And("I click the Remove link on the 'You have added 2 items' page")
      ItemsAddAnotherPage.followLink("Remove", "2")
      And("I click radio option Yes on the 'Are you sure you want to remove item 1?' page")
      RemoveItemPage.confirmRemoval("Yes", "1")
      And("I click radio option No on the 'You have added 1 item' page")
      ItemsAddAnotherPage.answerAddAnother("No", "1")
      Then("I should be on the Declaration summary page")
      thenIshouldbeOnTheDeclarationSummaryPage()
      And("I should see Completed status for items on the Declaration summary page")
      andIshouldSeeXStatusForOnTheDeclarationSummaryPage("Completed", "items")

      And("I sign out")
      CommonPage.signOut()

    }

    Scenario("02 Office Departure XI Declaration Type TIR") {

      Given("I login with ID 1234567890")
      andILoginWithIDX("1234567890")
      And("The user has submitted itemDetailsXI.json for LRN 1234567890TDXI and EORI Number 1234567890")
      whenTheUserHasSubmittedFileForLRNAndEORINumber("itemDetailsXI.json", "1234567890TDXI", "1234567890")
      And("I refresh the page")
      CommonPage.refreshPage()
      And("I click on the View draft departure declarations link on the Manage your transit movements page")
      givenIclickOnTheLinkOnTheManageYourTransitMovementsPage("View draft departure declarations")
      And(
        "I click on the link for LRN 1234567890TDXI on the Draft Departure declarations page"
      )
      ManagedFEDraftDepartureDelcarationsPage.followDraftLink("1234567890TDXI")
      And("I click on the Add items link on the Declaration summary page")
      thenIclickOnTheLinkOnTheDeclarationSummaryPage("Add items")

      // Item Details
      And("I enter This is a description on the 'Enter a description of item 1' page")
      ItemDescriptionPage.enterDescription("This is a description", "1")
      And(
        "I select (1) Transport equipment - GB123456789000 on the 'Which transport equipment are you using for this item?' page"
      )
      ItemTransportEquipmentPage.selectEquipment("(1) Transport equipment - GB123456789000")
      And("I select United Kingdom on the 'What is the item’s country of dispatch?' page")
      ItemCountryOfDispatchPage.selectCountry("United Kingdom")
      And("I select Germany on the 'What is the item’s country of destination?' page")
      ItemCountryOfDestinationPage.selectCountry("Germany")
      And("I enter UCR12312 on the 'What is the Unique Consignment Reference?' page")
      ItemUCRNumberPage.enterAndContinue("UCR12312")
      And("I click radio option No on the 'Do you want to add a Customs Union and Statistics code?' page")
      AddCUSCodePage.selectAndContinue("No")
      And("And I enter 392690 on the 'What is the commodity code?' page")
      CommodityCodePage.enterAndContinue("392690")
      And("I click radio option Yes on the 'Do you want to add a combined nomenclature code?' page")
      AddNomenclatureCodePage.selectAndContinue("Yes")
      And("I enter A1 on the 'What is the combined nomenclature code?' page")
      NomenclatureCodePage.enterAndContinue("A1")
      And("I click radio option No on the 'Does the item contain any dangerous goods?' page")
      AddDangerousGoodsPage.selectAndContinue("No")
      And("I enter 0 on the 'What is the item’s gross weight?' page")
      MeasurementGrossWeightPage.enterGrossWeight("0")
      And("I click the continue button on the 'Before you continue' page")
      MeasurementGrossWeightWarningPage.continueToNextPage()
      And("I click radio option No on the 'Do you want to add the item’s net weight?' page")
      MeasurementAddNetWeightPage.selectAndContinue("No")
      And("I click radio option No on the 'Do you want to add supplementary units?' page")
      MeasurementAddSupplementaryUnitsPage.selectAndContinue("No")
      And("I select (AE) Aerosol on the 'What type of package are you using for the item?' page")
      PackageTypePage.selectAndContinue("(AE) Aerosol")
      And("I enter 20 on the 'How many of these are you using?' page")
      PackagesTypeQuantityPage.enterAndContinue("20")
      And("I enter This is a description on the 'What is the shipping mark?' page")
      PackagesShippingMarkPage.enterAndContinue("This is a description")
      And("I click radio option No on the 'You have added 1 types of package' page")
      PackagesAddAnotherPage.answerAddAnother("No", "1")
      And("I click radio option No on the 'Do you want to add a supply chain actor for this item?' page")
      SupplyChainActorItemAddPage.selectAndContinue("No")
      And("I click radio option No on the 'You have attached 1 document to this item' page")
      DocumentsAddAnotherPage.answerAddAnother("No", "1")
      And("I click radio option No on the 'Do you want to add an additional reference for this item?' page")
      AdditionalReferenceAddPage.selectAndContinue("No")
      And("I click radio option No on the 'Do you want to add any additional information for this item?' page")
      AdditionalInformationAddPage.selectAndContinue("No")

      And("I submit on the Check your answers section Items page")
      CYAPage.submitAnswers("Items")

      And("I click radio option No on the 'You have added 1 item' page")
      ItemsAddAnotherPage.answerAddAnother("No", "1")
      Then("I should be on the Declaration summary page")
      thenIshouldbeOnTheDeclarationSummaryPage()
      And("I should see Completed status for items on the Declaration summary page")
      andIshouldSeeXStatusForOnTheDeclarationSummaryPage("Completed", "items")

    }
  }
}
