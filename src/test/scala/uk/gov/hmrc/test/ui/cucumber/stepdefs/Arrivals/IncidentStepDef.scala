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

import uk.gov.hmrc.test.ui.pages.Arrival.Incidents._


class IncidentStepDef extends BaseStepDef {

  And("""^(?:I )?choose radio option (.*) on the incident identify location page$""") {
    (answer: String) =>
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

  And("""^(?:I )?choose radio option (.*) on the container indicator page$""") { (answer: String) =>
    ContainerIndicatorPage
      .loadPage()
      .select(answer)
      .submitPage()
  }

  And("""^(?:I )?enter (.+) on the container identification number page$""") { (answer: String) =>
    ContainerIdentificationNumberPage
      .loadPage()
      .fillInput(answer)
      .submitPage()
  }

  And("""^(?:I )?choose radio option (.*) on the add transport equipment page$""") { (answer: String) =>
    AddTransportEquipmentPage
      .loadPage()
      .select(answer)
      .submitPage()
  }

  And("""^(?:I )?choose radio option (.*) on the add container identification number page$""") { (answer: String) =>
    AddContainerIdentificationNumberPage
      .loadPage()
      .select(answer)
      .submitPage()
  }

  And("""^(?:I )?choose radio option (.*) on the Do you want to add another incident page$""") { (answer: String) =>
    AddAnotherIncidentPage
      .loadPage()
      .select(answer)
      .submitPage()
  }
}
