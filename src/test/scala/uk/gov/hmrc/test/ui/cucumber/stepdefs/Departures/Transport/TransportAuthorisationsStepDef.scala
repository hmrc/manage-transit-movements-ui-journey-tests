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

package uk.gov.hmrc.test.ui.cucumber.stepdefs.Departures.Transport

import uk.gov.hmrc.test.ui.cucumber.stepdefs.BaseStepDef
import uk.gov.hmrc.test.ui.pages.Departures.Transport.Authorisations.{AuthorisationAddAnotherPage, AuthorisationRefNumberPage, AuthorisationTypePage, LimitDatePage, RemoveAuthPage}

class TransportAuthorisationsStepDef extends BaseStepDef {

  And("""^(?:I )?enter (.+) reference number on the (.+) transport authorisations number page$""") {
    (answer: String, authorisation: String) =>
      AuthorisationRefNumberPage
        .loadPage(authorisation)
        .fillInput(answer)
        .submitPage()
  }

  Then("""^(?:I )?should have (.*) authorisations? on the add another transport authorisation page$""") {
    (numberOfOffices: String) =>
      AuthorisationAddAnotherPage
        .loadPage(numberOfOffices)
  }

  When("""^(?:I )?choose radio option (.*) on the You have added (.+) transport authorisations? page$""") {
    (answer: String, numberOfActors: String) =>
      AuthorisationAddAnotherPage
        .loadPage(numberOfActors)
        .select(answer)
        .submitPage()
  }

  And("""^(?:I )?choose radio option (.*) on the transport authorisations type page$""") { (answer: String) =>
    AuthorisationTypePage
      .loadPage()
      .select(answer)
      .submitPage()
  }

  When("""^(?:I )?choose to click on (.*) link on the add another transport authorisation page$""") {
    (sectionLink: String) =>
      AuthorisationAddAnotherPage
        .clickByPartialLinkText(sectionLink)
  }

  And(
    """^(?:I )?choose radio option (.*) for the (.+) transport authorisation (.+) on the remove page$"""
  ) { (answer: String, authorisationType: String, identificationVal: String) =>
    RemoveAuthPage
      .loadPage(authorisationType, identificationVal)
      .select(answer)
      .submitPage()
  }

  And("""^(?:I )?enter the date on the limit date page$""") { () =>
    LimitDatePage
      .fillInputs()
      .submitPage()
  }

}
