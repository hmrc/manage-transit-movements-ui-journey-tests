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

package uk.gov.hmrc.test.ui.cucumber.stepdefs.Arrivals

import uk.gov.hmrc.test.ui.cucumber.stepdefs.BaseStepDef
import uk.gov.hmrc.test.ui.pages.Arrival.IncidentsAndEndorsements._

class IncidentsAndEndorsementsStepDef extends BaseStepDef {

  And("""^(?:I )?choose radio option (.*) on the incidents add page$""") { (answer: String) =>
    IncidentsAddPage
      .loadPage()
      .select(answer)
      .submitPage()
  }

  And("""^(?:I )?select (.+) on the incidents country page$""") { (answer: String) =>
    IncidentsCountryPage
      .loadPage()
      .select(answer)
      .submitPage()
  }

  And("""^(?:I )?choose radio option (.*) on the incidents code page$""") { (answer: String) =>
    IncidentsCodePage
      .loadPage()
      .select(answer)
      .submitPage()
  }

  And("""^(?:I )?enter (.+) on the incidents description page$""") { (answer: String) =>
    IncidentsDescriptionPage
      .loadPage()
      .fillInput(answer)
      .submitPage()
  }

  And("""^(?:I )?choose radio option (.*) on the incidents add endorsement page$""") { (answer: String) =>
    IncidentsAddEndorsementPage
      .loadPage()
      .select(answer)
      .submitPage()
  }

  And("""^(?:I )?choose fill in the date on the incidents endorsement date page$""") { () =>
    IncidentsEndorsementDatePage
      .fillYesterdayDateInputs()
      .submitPage()
  }

  And("""^(?:I )?enter (.+) on the incidents endorsement authority page$""") { (answer: String) =>
    IncidentsEndorsementAuthorityPage
      .loadPage()
      .fillInput(answer)
      .submitPage()
  }

  And("""^(?:I )?select (.+) on the incidents endorsement country page$""") { (answer: String) =>
    IncidentsEndorsementCountryPage
      .loadPage()
      .select(answer)
      .submitPage()
  }

  And("""^(?:I )?enter (.+) on the incidents endorsement location page$""") { (answer: String) =>
    IncidentsEndorsementLocationPage
      .loadPage()
      .fillInput(answer)
      .submitPage()
  }
}