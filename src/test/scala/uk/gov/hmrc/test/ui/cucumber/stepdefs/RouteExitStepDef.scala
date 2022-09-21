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

import uk.gov.hmrc.test.ui.pages.RouteDetails.Exit._

class RouteExitStepDef extends BaseStepDef {

  And("""^(?:I )?select (.+) on the office of exit country page$""") { (answer: String) =>
    OfficeOfExitCountryPage.loadPage
    OfficeOfExitCountryPage.selectValueFromDropDown(answer)
    OfficeOfExitCountryPage.submitPage()
  }

  Then("""^(?:I )?(?:should )?have (.+) as an office of exit title on the office of exit page$""") { (answer: String) =>
    OfficeOfExitPage.checkOfficeOfExitTitle(answer)
  }

  And("""^(?:I )?select (.+) on the office of exit page$""") { (answer: String) =>
    OfficeOfExitPage.selectValueFromDropDown(answer)
    OfficeOfExitPage.submitPage()
  }

  Then(
    """^(?:I )?(?:should )?have (.+) (?:office|offices) of transit added on the add another office of exit page$"""
  ) { (answer: String) =>
    AddAnotherOfficeOfExitPage.checkAddAnotherOfficeOfExitTitle(answer)
  }

  And("""^(?:I )?choose radio option (.*) on the add another office of exit page$""") { (answer: String) =>
    AddAnotherOfficeOfExitPage.selectAddAnotherOfficeOfExit(answer)
    AddAnotherOfficeOfExitPage.submitPage()
  }
}
