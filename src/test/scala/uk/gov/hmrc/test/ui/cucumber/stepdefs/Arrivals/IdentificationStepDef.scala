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
import uk.gov.hmrc.test.ui.pages.Arrival._

class IdentificationStepDef extends BaseStepDef {

  And("""^(?:I )?enter (.+) on the movement reference number page$""") { (answer: String) =>
    MovementReferenceNumberPage
      .loadPage()
      .fillInput(answer)
      .submitPage()
  }

  And("""^(?:I )?choose radio option (.*) on the authorisations type page$""") { (answer: String) =>
    AuthorisationsTypePage
      .loadPage()
      .select(answer)
      .submitPage()
  }

  And("""^(?:I )?enter (.+) on the authorisations reference number page$""") { (answer: String) =>
    AuthorisationsReferenceNumberPage
      .loadPage()
      .fillInput(answer)
      .submitPage()
  }

  Then("""^(?:I )?(?:should )?have (.+) (?:authorisation|authorisations) on the authorisations add another page$"""
  ) { (numberOfOffices: String) =>
    AuthorisationsAddAnotherPage
      .loadPage(numberOfOffices)
  }

  And("""^(?:I )?choose radio option (.*) on the authorisations add another page$""") { (answer: String) =>
    AuthorisationsAddAnotherPage
      .select(answer)
      .submitPage()
  }
}