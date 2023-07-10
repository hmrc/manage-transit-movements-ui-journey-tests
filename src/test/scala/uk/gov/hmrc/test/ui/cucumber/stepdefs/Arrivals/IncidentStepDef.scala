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
import uk.gov.hmrc.test.ui.pages.Arrivals.Incident._

class IncidentStepDef extends BaseStepDef {

  And("""^(?:I )?choose radio option (.*) on the incident identify location page$""") { (answer: String) =>
    IncidentsIdentifyLocationPage
      .loadPage()
      .select(answer)
      .submitPage()
  }

  And("""^(?:I )?enter (.+) and (.+) on the incident coordinates page$""") {
    (latitudeNo: String, longitudeNo: String) =>
      IncidentsCoordinatesPage
        .loadPage()
        .fillInputs(latitudeNo, longitudeNo)
        .submitPage()
  }

  And("""^(?:I )?select (.+) on the incident un locode page$""") { (answer: String) =>
    IncidentsUnLocodePage
      .loadPage()
      .select(answer)
      .submitPage()
  }

  And("""^(?:I )?fill in address on the incident address page$""") { () =>
    IncidentAddressPage
      .loadPage()
      .fillInputs()
      .submitPage()
  }

  And("""^(?:I )?choose radio option (.*) on the add incident page$""") { (answer: String) =>
    AddIncidentPage
      .loadPage()
      .select(answer)
      .submitPage()
  }

  And("""^(?:I )?select (.+) on the In which country did the incident happen page$""") { (answer: String) =>
    IncidentCountryPage
      .loadPage()
      .select(answer)
      .submitPage()
  }

  And("""^(?:I )?choose radio option (.*) on the incident code page$""") { (answer: String) =>
    IncidentCodePage
      .loadPage()
      .select(answer)
      .submitPage()
  }

  And("""^(?:I )?enter (.+) on the incident description page$""") { (answer: String) =>
    IncidentDescriptionPage
      .loadPage()
      .fillInput(answer)
      .submitPage()
  }

  And("""^(?:I )?choose radio option (.*) on the You have added (.*) incidents? page$""") {
    (answer: String, numberOfIncidents: String) =>
      AddAnotherIncidentPage
        .loadPage(numberOfIncidents)
        .select(answer)
        .submitPage()
  }

  And("""^(?:I )?click the (.*) link on the You have added (.*) incidents? page$""") {
    (sectionLink: String, numberOfIncidentsItems: String) =>
      AddAnotherIncidentPage
        .loadPage(numberOfIncidentsItems)
        .clickByPartialLinkText(sectionLink)
  }

  And("""^(?:I )?click radio option (.*) on the Are you sure you want to remove incident (.*) page$""") {
    (answer: String, numberOfIncidentsItems: String) =>
      RemoveIncidentPage
        .loadPage(numberOfIncidentsItems)
        .select(answer)
        .submitPage()
  }

}
