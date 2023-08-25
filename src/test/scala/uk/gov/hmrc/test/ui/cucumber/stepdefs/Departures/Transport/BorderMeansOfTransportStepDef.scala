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
import uk.gov.hmrc.test.ui.pages.Departures.Transport.BorderMeansOfTransport._

class BorderMeansOfTransportStepDef extends BaseStepDef {

  And("""^(?:I )?choose radio option (.*) on the add border mode of transport page$""") { (answer: String) =>
    AddBorderModeOfTransportPage
      .loadPage()
      .select(answer)
      .submitPage()
  }

  And("""^(?:I )?choose radio option (.*) on the 'How is the transit crossing the border\?' page$""") {
    (answer: String) =>
      BorderModeOfTransportPage
        .loadPage()
        .select(answer)
        .submitPage()
  }

  And(
    """^(?:I )?choose radio option (.*) on the border mode 'Which identification do you want to use for this vehicle\?' page$"""
  ) { (answer: String) =>
    BorderMeansOftransportIdentificationPage
      .loadPage()
      .select(answer)
      .submitPage()
  }

  And("""^(?:I )?enter identification (.+) on the 'What is the identification number for this\?' page$""") {
    (answer: String) =>
      BorderMeansOfTransportIdentificationNumberPage
        .loadPage()
        .fillInput(answer)
        .submitPage()
  }

  And("""^(?:I )?select (.+) on the border mode 'What country is this vehicle registered to\?' page$""") {
    (answer: String) =>
      BorderMeansOfTransportCountryPage
        .loadPage()
        .select(answer)
        .submitPage()
  }

  And("""^(?:I )?select (.+) on the 'Where is the customs office at the border\?' page$""") { (answer: String) =>
    BorderMeansOfTransportOfficeOfTransitPage
      .loadPage()
      .select(answer)
      .submitPage()
  }

  And("""^(?:I )?choose radio option (.*) on the 'Do you want to add a conveyance reference number\?' page$""") {
    (answer: String) =>
      AddConveyanceReferenceNumberPage
        .loadPage()
        .select(answer)
        .submitPage()
  }

  And("""^(?:I )?enter conveyance number (.+) on the 'What is the conveyance reference number\?' page$""") {
    (answer: String) =>
      ConveyanceReferenceNumberPage
        .loadPage()
        .fillInput(answer)
        .submitPage()
  }

  And("""^(?:I )?choose to click on (.*) link on the add another border means of transport page$""") {
    (sectionLink: String) =>
      AddAnotherBorderMeansOfTransportPage
        .clickByPartialLinkText(sectionLink)
  }

  And("""^(?:I )?choose radio option (.*) on the remove border means of transport page$""") { (answer: String) =>
    RemoveBorderMeansOfTransportPage
      .loadPage()
      .select(answer)
      .submitPage()
  }

  When("""^(?:I )?choose radio option (.*) on the 'You have added (.*) border means of transport' page$""") {
    (answer: String, numberOfBorderMeansInTitle: String) =>
      AddAnotherBorderMeansOfTransportPage
        .loadPage(numberOfBorderMeansInTitle)
        .select(answer)
        .submitPage()
  }

  And("""^(?:I )?choose radio option (.*) on the 'Do you want to add identification for this vehicle?\?' page$""") {
    (answer: String) =>
      VehicleIdentificationDepartureMeansOfTransport
        .loadPage()
        .select(answer)
        .submitPage()
  }

  And("""^(?:I )?choose radio option (.*) on the 'Do you want to add the type of identification?\?' page$""") {
    (answer: String) =>
      VehicleIdentificationTypeDepartureMeansOfTransport
        .loadPage()
        .select(answer)
        .submitPage()
  }

  And(
    """^(?:I )?choose radio option (.*) on the 'Do you want to add an identification number for this vehicle?\?' page$"""
  ) { (answer: String) =>
    IdentificationNumberDepartureMeansOfTransport
      .loadPage()
      .select(answer)
      .submitPage()
  }

  And(
    """^(?:I )?choose radio option (.*) on the 'Do you want to add the registered country for this vehicle?\?' page$"""
  ) { (answer: String) =>
    RegisteredVehicleCountryDepartureMeansOfTransport
      .loadPage()
      .select(answer)
      .submitPage()
  }

}
