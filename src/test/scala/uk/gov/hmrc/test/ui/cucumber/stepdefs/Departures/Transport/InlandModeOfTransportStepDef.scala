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
import uk.gov.hmrc.test.ui.pages.Departures.Transport.BorderMeansOfTransport.{AddAnotherDepartureMeansOfTransportPage, AddNewBorderModeOfTransportPage, RemoveDepartureMeansOfTransportPage}
import uk.gov.hmrc.test.ui.pages.Departures.Transport.InlandModeOfTransport.{AddVehicleIdentificationInlandModeOfTransport, IdentificationNumberPage, InlandModeOfTransportPage, TransportCountryPage, TransportIdentificationPage}

class InlandModeOfTransportStepDef extends BaseStepDef {

  And("""^(?:I )?choose radio option (.*) on the 'Which inland mode of transport are you using\?' page$""") {
    (answer: String) =>
      InlandModeOfTransportPage
        .loadPage()
        .select(answer)
        .submitPage()
  }

  And(
    """^(?:I )?choose radio option (.*) on the inland mode 'Which identification do you want to use for this vehicle\?' page$"""
  ) {
    (answer: String) =>
      TransportIdentificationPage
        .loadPage()
        .select(answer)
        .submitPage()
  }

  And("""^(?:I )?enter registration number (.+) on the 'What is the identification number for this\?' page$""") {
    (answer: String) =>
      IdentificationNumberPage
        .loadPage()
        .fillInput(answer)
        .submitPage()
  }

  And("""^(?:I )?select (.+) on the inland mode 'What country is this vehicle registered to\?' page$""") {
    (answer: String) =>
      TransportCountryPage
        .loadPage()
        .select(answer)
        .submitPage()
  }

  And(
    """^(?:I )?choose radio option (.*) on 'Do you want to add a border mode of transport\?' page$"""
  ) {
    (answer: String) =>
      AddNewBorderModeOfTransportPage
        .loadPage()
        .select(answer)
        .submitPage()
  }

  And(
    """^(?:I )?choose radio option (.*) on the departure means '(.*)' page$"""
  ) {
    (answer: String, pageTitle: String) =>
      AddVehicleIdentificationInlandModeOfTransport
        .loadPage(pageTitle)
        .select(answer)
        .submitPage()
  }

  And("""^(?:I )?select radio option (.*) on the 'You have added (.+) departure means of transport?' page$""") {
    (answer: String, numberOfDepartureMeans: String) =>
      AddAnotherDepartureMeansOfTransportPage
        .loadPage(numberOfDepartureMeans)
        .select(answer)
        .submitPage()
  }

  When("""^(?:I )?choose to click on the (.*) link on the You have added (.+) departure means of transport' page$""") {
    (sectionLink: String, numberOfDepartureMeans: String) =>
      AddAnotherDepartureMeansOfTransportPage
        .loadPage(numberOfDepartureMeans)
        .clickByPartialLinkText(sectionLink)
  }

  And(
    """^(?:I )?choose radio option (.*) for the 'Are you sure you want to remove departure means of transport (.+)\?' page$"""
  ) {
    (answer: String, departureMeansNo: String) =>
      RemoveDepartureMeansOfTransportPage
        .loadPage(departureMeansNo)
        .select(answer)
        .submitPage()
  }

}
