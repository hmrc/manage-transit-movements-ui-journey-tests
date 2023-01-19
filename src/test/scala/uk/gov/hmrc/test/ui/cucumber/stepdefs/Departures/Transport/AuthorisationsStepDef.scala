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
import uk.gov.hmrc.test.ui.pages.Arrivals.Identification.AuthorisationsReferenceNumberPage
import uk.gov.hmrc.test.ui.pages.Departures.Transport.Authorisations.{AddAnAuthorisationPage, AddAnotherAuthorisationPage, LimitDatePage, RemoveAnAuthorisationPage, TypeOfAuthorisationPage}

class AuthorisationsStepDef extends BaseStepDef {

  And("""^(?:I )?choose radio option (.*) for Do you want to add an authorisation page$""") { (answer: String) =>
    AddAnAuthorisationPage
      .loadPage()
      .select(answer)
      .submitPage()
  }

  And("""^(?:I )?choose radio option (.*) for Which type of authorisation do you want to add page$""") { (answer: String) =>
    TypeOfAuthorisationPage
      .loadPage()
      .select(answer)
      .submitPage()
  }

  And("""^(?:I )?enter (.+) for What is the reference number for the (.*) page$""") {
    (answer: String, typeOfAuthorisation: String) =>
      AuthorisationsReferenceNumberPage
        .loadPage(typeOfAuthorisation)
        .fillInput(answer)
        .submitPage()
  }

  And("""^(?:I )?choose radio option (.*) for You have added (.+) authorisation page$""") {
    (answer: String, numberOfAuthorisations: String) =>
      AddAnotherAuthorisationPage
        .loadPage(numberOfAuthorisations)
        .select(answer)
        .submitPage()
  }

  When("""^(?:I )?choose to click on the (.*) link on You have added (.+) authorisations page$""") {
    (sectionLink: String, numberOfAuthorisations: String) =>
      AddAnotherAuthorisationPage
        .loadPage(numberOfAuthorisations)
        .clickByPartialLinkText(sectionLink)
  }

  And("""^(?:I )?choose radio option (.+) for Are you sure you want to remove (.*) page$""") {
    (answer: String, typeOfAuthorisation: String) =>
      RemoveAnAuthorisationPage
        .loadPage(typeOfAuthorisation)
        .select(answer)
        .submitPage()
  }

  And("""^(?:I )?enter date on the limit date page$""") { () =>
    LimitDatePage
      .fillInputs()
      .submitPage()
  }

}
