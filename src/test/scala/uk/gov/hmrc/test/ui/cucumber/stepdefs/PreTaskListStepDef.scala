/*
 * Copyright 2022 HM Revenue & Customs
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

package uk.gov.hmrc.test.ui.cucumber.stepdefs

import uk.gov.hmrc.test.ui.pages.PreTaskList._

class PreTaskListStepDef extends BaseStepDef {

  When("""^I input a random LRN on the LocalReferenceNumber page$""") { () =>
    LocalReferenceNumberPage.loadPage
    LocalReferenceNumberPage.inputRandomLRN
    LocalReferenceNumberPage.submitPage()
  }

  And("""^(?:I )?select (.+) on the office of departure page$""") { (answer: String) =>
    OfficeOfDeparturePage.loadPage
    OfficeOfDeparturePage.selectValueFromDropDown(answer)
    OfficeOfDeparturePage.submitPage()
  }

  And("""^(?:I )?choose radio option (.*) on the procedure type page$""") { (answer: String) =>
    ProcedureTypePage.loadPage
    ProcedureTypePage.selectWhatTypeOfProcedure(answer)
    ProcedureTypePage.submitPage()
  }

  And("""^(?:I )?choose radio option (.*) on the declaration type page$""") { (answer: String) =>
    DeclarationTypePage.loadPage
    DeclarationTypePage.selectDeclarationType(answer)
    DeclarationTypePage.submitPage()
  }

  And("""^(?:I )?enter (.+) on the tir carnet page$""") { (answer: String) =>
    TIRCarnetPage.loadPage
    TIRCarnetPage.enterCarnetNumber(answer)
    TIRCarnetPage.submitPage()
  }

  And("""^(?:I )?choose radio option (.*) on the security type page$""") { (answer: String) =>
    SecurityDetailsPage.loadPage
    SecurityDetailsPage.selectSecurityType(answer)
    SecurityDetailsPage.submitPage()
  }
}
