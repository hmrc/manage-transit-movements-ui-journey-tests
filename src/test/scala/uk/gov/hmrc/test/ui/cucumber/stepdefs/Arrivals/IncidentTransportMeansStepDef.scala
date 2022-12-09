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
import uk.gov.hmrc.test.ui.pages.Arrival.IncidentTransportMeans._


class IncidentTransportMeansStepDef extends BaseStepDef {

  And("""^(?:I )?choose radio option (.*) on the Which identification do you want to use for the replacement means of transport page$""") {
    (answer: String) =>
    ReplacementTransportTypePage
      .loadPage()
      .select(answer)
      .submitPage()
  }

  And("""^(?:I )?enter (.+) for the (.+) on the What is the identification number for the replacement transport page$""") {
    (answer: String, identificationVal: String) =>
    ReplacementTransportIdentificationNumberPage
      .loadPage(identificationVal)
      .fillInput(answer)
      .submitPage()
  }

  And("""^(?:I )?select (.+) on the What country is the replacement transport registered to page$""") {
    (answer: String) =>
      ReplacementTransportCountryPage
        .loadPage()
        .select(answer)
        .submitPage()
  }

}
