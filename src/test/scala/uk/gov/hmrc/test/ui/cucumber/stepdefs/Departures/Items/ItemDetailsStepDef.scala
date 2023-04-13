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
}
