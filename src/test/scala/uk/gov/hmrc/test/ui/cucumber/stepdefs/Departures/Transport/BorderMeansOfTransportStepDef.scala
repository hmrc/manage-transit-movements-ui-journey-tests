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

  And("""^(?:I )?choose radio option (.*) on the border mode of transport page$""") { (answer: String) =>
    BorderModeOfTransportPage
      .loadPage()
      .select(answer)
      .submitPage()
  }

  And("""^(?:I )?choose radio option (.*) on the border means of transport identification page$""") { (answer: String) =>
    BorderMeansOftransportIdentificationPage
      .loadPage()
      .select(answer)
      .submitPage()
  }

  And("""^(?:I )?enter (.+) as (.+) on the border means of transport identification number page$""") {
    (answer: String, bordermeansOfTransport: String) =>
      BorderMeansOfTransportIdentificationNumberPage
        .loadPage(bordermeansOfTransport)
        .fillInput(answer)
        .submitPage()
  }

  And("""^(?:I )?select (.+) on the border means of transport country page$""") { (answer: String) =>
    BorderMeansOfTransportCountryPage
      .loadPage()
      .select(answer)
      .submitPage()
  }

  And("""^(?:I )?choose radio option (.*) on the add border means of transport country page$""") { (answer: String) =>
    AddBorderMeansOfTransportCountryPage
      .loadPage()
      .select(answer)
      .submitPage()
  }

  And("""^(?:I )?select (.+) on the border means of transport office of transit page$""") { (answer: String) =>
    BorderMeansOfTransportOfficeOfTransitPage
      .loadPage()
      .select(answer)
      .submitPage()
  }

  And("""^(?:I )?choose radio option (.*) on the add conveyance reference number page$""") { (answer: String) =>
    AddConveyanceReferenceNumberPage
      .loadPage()
      .select(answer)
      .submitPage()
  }

  And("""^(?:I )?enter (.+) on the conveyance reference number page$""") { (answer: String) =>
    ConveyanceReferenceNumberPage
      .loadPage()
      .fillInput(answer)
      .submitPage()
  }

  Then("""^(?:I )?(?:should )?have (.+) border means of transport added on the add another border means of transport page$""") {
    (numberOfBorderMeansTransport: String) =>
      AddAnotherBorderMeansOfTransportPage
        .loadPage(numberOfBorderMeansTransport)
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

  When("""^(?:I )?choose radio option (.*) on the add another border means of transport page$""") { (answer: String) =>
    AddAnotherBorderMeansOfTransportPage
      .select(answer)
      .submitPage()
  }

}