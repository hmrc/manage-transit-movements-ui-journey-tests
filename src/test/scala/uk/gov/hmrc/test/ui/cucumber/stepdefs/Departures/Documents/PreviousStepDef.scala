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

package uk.gov.hmrc.test.ui.cucumber.stepdefs.Departures.Documents

import uk.gov.hmrc.test.ui.cucumber.stepdefs.BaseStepDef
import uk.gov.hmrc.test.ui.pages.Departures.Documents.Previous._

class PreviousStepDef extends BaseStepDef {

  And("""^(?:I )?click radio option (.*) on the 'Do you want to add a goods item number\?' page$""") {
    (answer: String) =>
      AddGoodsItemNumberPage
        .loadPage()
        .select(answer)
        .submitPage()
  }

  And("""^(?:I )?enter (.+) on the documents 'What is the goods item number\?' page$""") { (answer: String) =>
    GoodsItemNumberPage
      .loadPage()
      .fillInput(answer)
      .submitPage()
  }

  And("""^(?:I )?click radio option (.*) on the 'Do you want to declare the package the goods arrived in\?' page$""") {
    (answer: String) =>
      DeclarePackagePage
        .loadPage()
        .select(answer)
        .submitPage()
  }

  And("""^(?:I )?select (.+) on the 'What type of package did the goods arrive in\?' page$""") { (answer: String) =>
    PackageTypePage
      .loadPage()
      .select(answer)
      .submitPage()
  }

  And("""^(?:I )?enter (.+) on the 'How many of these do the goods include\?' page$""") { (answer: String) =>
    GoodsItemMetricAmountPage
      .loadPage()
      .fillInput(answer)
      .submitPage()
  }

  And("""^(?:I )?select (.+) on the 'What metric do you want to use for the quantity of goods\?' page$""") { (answer: String) =>
    MetricTypePage
      .loadPage()
      .select(answer)
      .submitPage()
  }


  And("""^(?:I )?click radio option (.*) on the 'Do you want to declare the quantity of goods\?' page$""") {
    (answer: String) =>
      AddGoodsMetricPage
        .loadPage()
        .select(answer)
        .submitPage()
  }

  And("""^(?:I )?enter (.+) on the documents 'How many of these were there\?' page$""") { (answer: String) =>
    PackageQuantityPage
      .loadPage()
      .fillInput(answer)
      .submitPage()
  }


  And("""^(?:I )?click radio option (.*) on the 'Do you want to declare the quantity of this package\?' page$""") {
    (answer: String) =>
      DeclareQuantityOfPackagePage
        .loadPage()
        .select(answer)
        .submitPage()
  }

}
