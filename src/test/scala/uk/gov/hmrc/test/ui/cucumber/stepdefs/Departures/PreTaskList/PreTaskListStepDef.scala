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

package uk.gov.hmrc.test.ui.cucumber.stepdefs.Departures.PreTaskList

import uk.gov.hmrc.test.ui.cucumber.stepdefs.BaseStepDef
import uk.gov.hmrc.test.ui.pages.BasePage
import uk.gov.hmrc.test.ui.pages.Departures.PreTaskList._
import uk.gov.hmrc.test.ui.utils.CacheHelper

class PreTaskListStepDef extends BaseStepDef with BasePage {

  When("""^I input a random LRN on the 'What is the Local Reference Number\?' page$""") { () =>
    LocalReferenceNumberPage
      .loadPage()
      .fillInput()
      .submitPage()
  }

  When("""^I input a random LRN on the 'What is the new Local Reference Number\?' page$""") { () =>
    NewLocalReferenceNumberPage
      .loadPage()
      .fillInput()
      .submitPage()
  }

  Then("""^(?:I )?enter (.+) on the 'What is the Local Reference Number\?' page$""") { (answer: String) =>
    LocalReferenceNumberPage
      .loadPage()
      .fillInput(answer)
      .submitPage()
  }

  Then("""^(?:I )?should be on the 'What is the Local Reference Number\?' page$""") { () =>
    LocalReferenceNumberPage
      .loadPage()
  }

  Then("""^(?:I )?should be on the 'What is the new Local Reference Number\?' page$""") { () =>
    NewLocalReferenceNumberPage
      .loadPage()
  }

  And("""^(?:I )?select (.+) on the 'Where is the office of departure\?' page$""") { (answer: String) =>
    OfficeOfDeparturePage
      .loadPage()
      .select(answer)
      .submitPage()
  }

  And("""^(?:I )?choose radio option (.*) on the 'Which type of procedure are you using\?' page$""") {
    (answer: String) =>
      ProcedureTypePage
        .loadPage()
        .select(answer)
        .submitPage()
  }

  And("""^(?:I )?choose radio option (.*) on the 'Which type of declaration do you want to create\?' page$""") {
    (answer: String) =>
      DeclarationTypePage
        .loadPage()
        .select(answer)
        .submitPage()
  }

  And("""^(?:I )?enter (.+) on the 'What is the TIR carnet reference\?' page$""") { (answer: String) =>
    TIRCarnetPage
      .loadPage()
      .fillInput(answer)
      .submitPage()
  }

  And(
    """^(?:I )?choose radio option (.*) on the 'Which type of safety and security details do you want to add\?' page$"""
  ) { (answer: String) =>
    SecurityDetailsPage
      .loadPage()
      .select(answer)
      .submitPage()
  }

  When("""^the user has submitted (.+) for LRN (.+) and EORI number (.+)$""") {
    (fileName: String, lrn: String, eoriNumber: String) =>
      CacheHelper.submitUserAnswers(fileName, lrn, eoriNumber)
  }
}
