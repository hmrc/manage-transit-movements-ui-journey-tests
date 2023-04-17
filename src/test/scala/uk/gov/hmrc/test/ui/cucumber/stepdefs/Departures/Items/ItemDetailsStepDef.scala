/*
 * Copyright 2023 HM Revenue & Customs
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

package uk.gov.hmrc.test.ui.cucumber.stepdefs.Departures.Items

import uk.gov.hmrc.test.ui.cucumber.stepdefs.BaseStepDef
import uk.gov.hmrc.test.ui.pages.Departures.Items._
class ItemDetailsStepDef extends BaseStepDef {

  And("""^(?:I )?enter (.*) on the 'Enter a description of item (.*)' page$""") {
    (answer: String, itemNumber: String) =>
      ItemDescriptionPage
        .loadPage(itemNumber)
        .fillInput(answer)
        .submitPage()
  }

  And("""^(?:I )?choose radio option (.*) on the 'Which type of declaration do you want to create for this item\?' page$""") {
    (answer: String) =>
      ItemDeclarationTypePage
        .loadPage()
        .select(answer)
        .submitPage()
  }

  And("""^(?:I )?select (.+) on the 'What is the item’s country of dispatch\?' page$""") {
    (answer: String) =>
      ItemCountryOfDispatchPage
        .loadPage()
        .select(answer)
        .submitPage()
  }

  And("""^(?:I )?select (.+) on the 'What is the item’s country of destination\?' page$""") {
    (answer: String) =>
      ItemCountryOfDestinationPage
        .loadPage()
        .select(answer)
        .submitPage()
  }


  And("""^(?:I )? choose radio option (.*) on the 'Do you want to add a Unique Consignment Reference\?' page$""") {
    (answer: String) =>
      AddItemUCRPage
        .loadPage()
        .select(answer)
        .submitPage()
  }


  And("""^(?:I )?enter (.*) on the 'What is the Unique Consignment Reference\?' page$""") {
    (answer: String) =>
      ItemUCRNumberPage
        .loadPage()
        .fillInput(answer)
        .submitPage()
  }

  And("""^(?:I )?click radio option (.*) on the 'Do you want to add a Customs Union and Statistics code\?' page$""") {
    (answer: String) =>
      AddCUSCodePage
        .loadPage()
        .select(answer)
        .submitPage()
  }

  And("""^(?:I )?enter (.*) on the 'What is the Customs Union and Statistics code\?' page$""") {
    (answer: String) =>
      CUSCodePage
        .loadPage()
        .fillInput(answer)
        .submitPage()
  }

  And("""^(?:I )?click radio option (.*) on the 'Do you want to add a commodity code\?' page$""") {
    (answer: String) =>
      AddCommodityCodePage
        .loadPage()
        .select(answer)
        .submitPage()
  }

  And("""^(?:I )?enter (.*) on the 'What is the commodity code\?' page$""") {
    (answer: String) =>
      CommodityCodePage
        .loadPage()
        .fillInput(answer)
        .submitPage()
  }

  And("""^(?:I )?click radio option (.*) on the 'Do you want to add a combined nomenclature code\?' page$""") {
    (answer: String) =>
      AddNomenclatureCodePage
        .loadPage()
        .select(answer)
        .submitPage()
  }

  And("""^(?:I )?enter (.*) on the 'What is the combined nomenclature code\?' page$""") {
    (answer: String) =>
      NomenclatureCodePage
        .loadPage()
        .fillInput(answer)
        .submitPage()
  }

  And("""^(?:I )?click radio option (.*) on the 'Does the item contain any dangerous goods\?' page$""") {
    (answer: String) =>
      AddDangerousGoodsPage
        .loadPage()
        .select(answer)
        .submitPage()
  }

  And("""^(?:I )?enter (.*) on the 'What is the UN number for the dangerous goods\?' page$""") {
    (answer: String) =>
      DangerousGoodsUnNumberPage
        .loadPage()
        .fillInput(answer)
        .submitPage()
  }

  And("""^(?:I )?click radio option (.*) on the 'You have added (.*) UN numbe(?:r |rs )for dangerous goods' page$""") {
    (answer: String, numberOfUnNumber: String) =>
      DangerousGoodsUnNumberAddAnotherPage
        .loadPage(numberOfUnNumber)
        .select(answer)
        .submitPage()
  }

  And("""^(?:I )?click the (.*) link on the 'You have added (.*) UN numbe(?:r |rs )for dangerous goods' page$""") {
    (sectionLink: String, numberOfUnNumber: String) =>
      DangerousGoodsUnNumberAddAnotherPage
        .loadPage(numberOfUnNumber)
        .clickByPartialLinkText(sectionLink)
  }

  And("""^(?:I )?click radio option (.*) on the 'Are you sure you want to remove UN number (.*)\?' page$""") {
    (answer: String, documentTypeToRemove: String) =>
      RemoveDangerousGoodsPage
        .loadPage(documentTypeToRemove)
        .select(answer)
        .submitPage()
  }

  And("""^(?:I )?enter (.*) on the 'What is the item’s gross weight\?' page$""") {
    (answer: String) =>
      MeasurementGrossWeightPage
        .loadPage()
        .fillInput(answer)
        .submitPage()
  }


  And("""^(?:I )?click radio option (.*) on the 'Do you want to add the item’s net weight\?' page$""") {
    (answer: String) =>
      MeasurementAddNetWeightPage
        .loadPage()
        .select(answer)
        .submitPage()
  }

  And("""^(?:I )?enter (.*) on the 'What is the item’s net weight\?' page$""") {
    (answer: String) =>
      MeasurementNetWeightPage
        .loadPage()
        .fillInput(answer)
        .submitPage()
  }

  And("""^(?:I )?click radio option (.*) on the 'Do you want to add supplementary units\?' page$""") {
    (answer: String) =>
      MeasurementAddSupplementaryUnitsPage
        .loadPage()
        .select(answer)
        .submitPage()
  }

  And("""^(?:I )?enter (.*) on the 'How many supplementary units does the item include\?' page$""") {
    (answer: String) =>
      MeasurementSupplementaryUnitsPage
        .loadPage()
        .fillInput(answer)
        .submitPage()
  }

  And("""^(?:I )?select (.+) on the 'What type of package are you using for the item\?' page$""") {
    (answer: String) =>
      PackageTypePage
        .loadPage()
        .select(answer)
        .submitPage()
  }

  And("""^(?:I )?enter (.*) on the 'How many (.*) are you using\?' page$""") {
    (answer: String, packageValue: String) =>
      PackagesTypeQuantityPage
        .loadPage(packageValue)
        .fillInput(answer)
        .submitPage()
  }

  And("""^(?:I )?click radio option (.*) on the 'Do you want to add a shipping mark\?' page$""") {
    (answer: String) =>
      PackagesAddShippingMarkPage
        .loadPage()
        .select(answer)
        .submitPage()
  }

  And("""^(?:I )?enter (.*) on the 'What is the shipping mark\?' page$""") {
    (answer: String) =>
      PackagesShippingMarkPage
        .loadPage()
        .fillInput(answer)
        .submitPage()
  }

  And("""^(?:I )?click radio option (.*) on the 'You have added (.*) typ(?:e |es )of package' page$""") {
    (answer: String, numberOfPackage: String) =>
      PackagesAddAnotherPage
        .loadPage(numberOfPackage)
        .select(answer)
        .submitPage()
  }

  And("""^(?:I )?click the (.*) link on the 'You have added (.*) typ(?:e |es )of packag(?:e |es)' page$""") {
    (sectionLink: String, numberOfPackage: String) =>
      PackagesAddAnotherPage
        .loadPage(numberOfPackage)
        .clickByPartialLinkText(sectionLink)
  }

  And("""^(?:I )?click radio option (.*) on the 'Are you sure you want to remove (.*) from this item\?' page$""") {
    (answer: String, documentTypeToRemove: String) =>
      RemovePackagePage
        .loadPage(documentTypeToRemove)
        .select(answer)
        .submitPage()
  }
}