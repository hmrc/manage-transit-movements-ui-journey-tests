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

package uk.gov.hmrc.test.ui.cucumber.stepdefs.Transport

import uk.gov.hmrc.test.ui.cucumber.stepdefs.BaseStepDef
import uk.gov.hmrc.test.ui.pages.Transport.TransportDetails._

class TransportDetailsStepDef extends BaseStepDef {

  And("""^(?:I )?choose radio option (.*) on the apply ucr item page$""") { (answer: String) =>
    ApplyUcrToAllItemsPage
      .loadPage()
      .select(answer)
      .submitPage()
  }

  And("""^(?:I )?enter (.+) on the UCR page$""") { (answer: String) =>
    UniqueConsignmentReferencePage
      .loadPage()
      .fillInput(answer)
      .submitPage()
  }

  And("""^(?:I )?choose radio option (.*) on the items same destination country page$""") { (answer: String) =>
    ItemsSameDestinationCountryPage
      .loadPage()
      .select(answer)
      .submitPage()
  }

  And("""^(?:I )?select (.+) on the items destination country page$""") { (answer: String) =>
    ItemsDestinationCountryPage
      .loadPage()
      .select(answer)
      .submitPage()
  }

  And("""^(?:I )?choose radio option (.*) on the containers page$""") { (answer: String) =>
    ContainersPage
      .loadPage()
      .select(answer)
      .submitPage()
  }

  And("""^(?:I )?select (.+) on the country of dispatch page$""") { (answer: String) =>
    CountryOfDispatchPage
      .loadPage()
      .select(answer)
      .submitPage()
  }

  And("""^(?:I )?choose radio option (.*) on the same destination country page$""") { (answer: String) =>
    ItemsSameDestinationCountryPage
      .loadPage()
      .select(answer)
      .submitPage()
  }
  And("""^(?:I )?choose radio option (.*) on the Inland Mode of Transport page$""") { (answer: String) =>
    InlandModeOfTransportPage
      .loadPage()
      .select(answer)
      .submitPage()
  }

  And("""^(?:I )?choose radio option (.*) on the Transport Identification page$""") { (answer: String) =>
    TransportIdentificationPage
      .loadPage()
      .select(answer)
      .submitPage()
  }

  And("""^(?:I )?enter (.+) as (.+) on the transport identification number page$""") {
    (answer: String, meansOfTransport: String) =>
      IdentificationNumberPage
        .loadPage(meansOfTransport)
        .fillInput(answer)
        .submitPage()
  }

  And("""^(?:I )?select (.+) on the Transport country page$""") { (answer: String) =>
    TransportCountryPage
      .loadPage()
      .select(answer)
      .submitPage()
  }

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
}
