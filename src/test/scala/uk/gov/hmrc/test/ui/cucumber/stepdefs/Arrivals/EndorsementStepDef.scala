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

package uk.gov.hmrc.test.ui.cucumber.stepdefs.Arrivals

import uk.gov.hmrc.test.ui.cucumber.stepdefs.BaseStepDef
import uk.gov.hmrc.test.ui.pages.Arrivals.Endorsement._

class EndorsementStepDef extends BaseStepDef {

  And("""^(?:I )?choose radio option (.*) on the 'Do you need to add an endorsement for the incident\?' page$""") { (answer: String) =>
    AddEndorsementPage
      .loadPage()
      .select(answer)
      .submitPage()
  }

  And("""^(?:I )?enter the date on the 'When was the endorsement made\?' page$""") { () =>
    EndorsementDatePage
      .fillInputs()
      .submitPage()
  }

  And("""^(?:I )?enter (.+) on the 'What authority made the endorsement\?' page$""") { (answer: String) =>
    EndorsementAuthorityPage
      .loadPage()
      .fillInput(answer)
      .submitPage()
  }

  And("""^(?:I )?select (.+) on the 'In which country was the endorsement made\?' page$""") { (answer: String) =>
    EndorsementCountryPage
      .loadPage()
      .select(answer)
      .submitPage()
  }

  And("""^(?:I )?enter (.+) on the 'Where in France was the endorsement made\?' page$""") { (answer: String) =>
    EndorsementLocationPage
      .loadPage()
      .fillInput(answer)
      .submitPage()
  }
}
