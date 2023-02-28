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
import uk.gov.hmrc.test.ui.pages.Departures.Items.{AddItemUCRPage, ItemCountryOfDestinationPage, ItemCountryOfDispatchPage, ItemDeclarationTypePage, ItemDescriptionPage, ItemUCRPage}


class ItemsStepDef extends BaseStepDef {

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

  And("""^(?:I )? choose radio option (.*) on the 'Do you want to add a Unique Consignment Reference (UCR)\?' page$"""){
    (answer: String) =>
      AddItemUCRPage
        .loadPage()
        .select(answer)
        .submitPage()
  }

  And("""^(?:I )?enter UCR (.*) on the 'What is the Unique Consignment Reference (UCR)\?' page$""") {
    (answer: String) =>
      ItemUCRPage
        .loadPage()
        .fillInput(answer)
        .submitPage()
  }

}
