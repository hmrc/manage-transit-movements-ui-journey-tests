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

package uk.gov.hmrc.test.ui.cucumber.stepdefs.Unloading

import uk.gov.hmrc.test.ui.cucumber.stepdefs.BaseStepDef
import uk.gov.hmrc.test.ui.pages.Unloading._

class UnloadingStepDef extends BaseStepDef {

  Then("""^(?:I )?should be on the 'Unload the goods before you make unloading remarks' page$""") { () =>
    UnloadingGuidancePage
      .loadPage()
  }

  Given("""^(?:I )?click the create new unloading remarks link on the Unloading remarks negative acknowledgement page$""") { () =>
    UnloadingRemarksNegativeAcknowledgementPage
      .loadPage()
      .createNewUnloadingRemarks()
  }

   And("""^(?:I )?should see the content (.*) on the Unloading rejection page$""") {
    (content: String) =>
    UnloadingRejectionPage
      .loadPage()
      .checkForContent(content)
  }

  And("""^(?:I )?fill in the date on the 'When were the goods unloaded\?' page$""") { () =>
      GoodsUnloadedDatePage
        .loadPage()
        .fillInputs()
        .submitPage()
  }

  And("""^(?:I )?choose radio option (.*) on the 'Are all the seal numbers of marks readable\?' page$""") {
    (answer: String) =>
    SealNumbersReadablePage
      .loadPage()
      .select(answer)
      .submitPage()
  }

  And("""^(?:I )?choose radio option (.*) on the 'Are any of the seals broken\?' page$""") {
    (answer: String) =>
    SealsBrokenPage
      .loadPage()
      .select(answer)
      .submitPage()
  }

  And("""^(?:I )?enter (.+) on the 'What is the identification number for the new vehicle\?' page$""") {
    (answer: String) =>
      VehicleIdPage
        .loadPage()
        .fillInput(answer)
        .submitPage()
  }

  And("""^(?:I )?click the Continue button on the 'Unload the goods before you make unloading remarks' page$""") { () =>
    UnloadingGuidancePage
      .loadPage()
      .submitPage()
  }

  When("""^(?:I )?click the (.*) link on the 'What did you find when unloading\?' page$""") {
    (sectionLink: String) =>
    UnloadingSummaryPage
      .loadPage()
      .clickByPartialLinkText(sectionLink)
  }

  And("""^(?:I )?enter (.*) on the 'What do you need to report\?' page$""") {
    (answer: String) =>
      UnloadingReportPage
        .loadPage()
        .fillInput(answer)
        .submitPage()
    }

  And("""^(?:I )?click the Change link for (.+) on the 'What did you find when unloading\?' page$""") {
    (text: String) =>
    UnloadingReportPage
      .loadPage()
      .clickChangeLink(text)
  }

  And("""^(?:I )?select (.*) on the unloading 'What country is the vehicle registered to\?' page$""") {
  (answer: String) =>
    VehicleCountryPage
      .loadPage()
      .select(answer)
      .submitPage()
  }

  And("""^(?:I )?enter (.*) on the 'What is the new seal number\?' page$""") {
    (answer: String) =>
      SealNumberPage
        .loadPage()
        .fillInput(answer)
        .submitPage()
  }

  And("""^(?:I )?enter (.*) on the 'What is the new total gross weight\?' page$""") {
    (answer: String) =>
      TotalGrossWeightPage
        .loadPage()
        .fillInput(answer)
        .submitPage()
  }

  And("""^(?:I )?enter (.*) on the 'What is the new total number of packages\?' page$""") {
    (answer: String) =>
      TotalNumberPackagesPage
        .loadPage()
        .fillInput(answer)
        .submitPage()
  }

}
