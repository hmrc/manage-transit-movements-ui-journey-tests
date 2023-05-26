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
import uk.gov.hmrc.test.ui.pages.Manage._
import uk.gov.hmrc.test.ui.pages.Unloading._

class UnloadingStepDef extends BaseStepDef {

  Then("""^(?:I )?should be on the 'Unload the goods before you make unloading remarks' page$""") { () =>
    UnloadingGuidancePage
      .loadPage()
  }

  Then("""^(?:I )?should be on the 'Review unloading remarks errors' page$""") { () =>
    ReviewUnloadingRemarksErrorsPage
      .loadPage()
  }

  Then("""^(?:I )?should be on the 'Unloading remarks errors' page$""") { () =>
    UnloadingRemarksErrors
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

  And("""^(?:I )?choose radio option (.*) on the 'Have you fully or partially unloaded the goods\?' page$""") {
    (answer: String) =>
      FullyOrPartiallyUnloadedPage
        .loadPage()
        .select(answer)
        .submitPage()
  }

  And("""^(?:I )?choose radio option (.*) on the 'Are all the seal identification numbers or marks readable\?' page$""") {
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

  And("""^(?:I )?click the Continue button on the 'Cross-check the transit with this declaration summary' page$""") { () =>
      DeclarationSummaryPage
        .loadPage()
        .submitPage()
  }

  Given("""^(?:I )?click the (.+) link on the 'Cross-check the transit with this declaration summary' page$""") { (link: String) =>
    DeclarationSummaryPage
      .loadPage()
      .selectAction(link)
  }

  Given("""^(?:I )?click the Back to summary button on the 'Cross-check the transit with house consignment (.*)' page$""") { (houseConsignmentNumber: String) =>
    HouseConsignmentPage
      .loadPage(houseConsignmentNumber)
      .submitPage()
  }

  And("""^(?:I )?choose radio option (.*) on the 'Were there any differences between the transit and the declaration information\?' page$""") {
    (answer: String) =>
      DifferencesPage
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

  And("""^(?:I )?enter (.*) on the 'What comments do you want to add\?' page$""") {
    (answer: String) =>
      UnloadingCommentsPage
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

  And("""^(?:I )?enter (.*) on the 'What is the new container identification number\?' page$""") {
    (answer: String) =>
      ContainerNumberPage
        .loadPage()
        .fillInput(answer)
        .submitPage()
  }

  And("""^(?:I )?enter (.*) on the 'What is the new gross weight of item (.*)\?' page$""") {
    (answer: String, itemNumber: String) =>
      GrossWeightPage
        .loadPage(itemNumber)
        .fillInput(answer)
        .submitPage()
  }

  And("""^(?:I )?enter (.*) on the 'What is the new number of packages for item (.*)\?' page$""") {
    (answer: String, itemNumber: String) =>
      NumberPackagesPage
        .loadPage(itemNumber)
        .fillInput(answer)
        .submitPage()
  }

  And("""^(?:I )?enter (.*) on the 'What is the new net weight of item (.*)\?' page$""") {
    (answer: String, itemNumber: String) =>
      NetWeightPage
        .loadPage(itemNumber)
        .fillInput(answer)
        .submitPage()
  }

  Then("""^(?:I )?(?:should )?be on the 'Unloading remarks sent' page$""") { () =>
    UnloadingConfirmationPage
      .loadPage()
  }

  And("""^(?:I )?click radio option (.*) on the 'Are you sure you want to remove your comments\?' page$""") {
    (answer: String) =>
      RemoveCommentsPage
        .loadPage()
        .select(answer)
        .submitPage()
  }


}
