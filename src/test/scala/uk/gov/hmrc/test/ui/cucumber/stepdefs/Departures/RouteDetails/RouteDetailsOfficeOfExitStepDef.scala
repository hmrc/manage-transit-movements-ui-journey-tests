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

package uk.gov.hmrc.test.ui.cucumber.stepdefs.Departures.RouteDetails

import uk.gov.hmrc.test.ui.cucumber.stepdefs.BaseStepDef
import uk.gov.hmrc.test.ui.pages.Departures.RouteDetails.Exit._

class RouteDetailsOfficeOfExitStepDef extends BaseStepDef {

  And("""^(?:I )?select (.+) on the 'Which country is the office of exit in\?' page$""") { (answer: String) =>
    OfficeOfExitCountryPage
      .loadPage()
      .select(answer)
      .submitPage()
  }

  And("""^(?:I )?select (.+) on the 'Where in (.*) is the office of exit\?' page$""") {
    (answer: String, countryInTitle: String) =>
      OfficeOfExitPage
        .loadPage(countryInTitle)
        .select(answer)
        .submitPage()
  }

  And(
    """^(?:I )?choose to click on the (.*) link on the 'You have added (.*) offices? of exit' page$"""
  ) { (sectionLink: String, officesOfExitInTitle: String) =>
    AddAnotherOfficeOfExitPage
      .loadPage(officesOfExitInTitle)
      .clickByPartialLinkText(sectionLink)
  }

  And(
    """^(?:I )?choose radio option (.*) on the 'Are you sure you want to remove (.*) as an office of exit\?' page$"""
  ) { (answer: String, exitOfficeInTitle: String) =>
    ConfirmRemoveOfficeOfExitPage
      .loadPage(exitOfficeInTitle)
      .select(answer)
      .submitPage()
  }

  And("""^(?:I )?choose radio option (.*) on the 'You have added (.) offices? of exit' page$""") { (answer: String, officesInTitle: String) =>
    AddAnotherOfficeOfExitPage
      .loadPage(officesInTitle)
      .select(answer)
      .submitPage()
  }
}
