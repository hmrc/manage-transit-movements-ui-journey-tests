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
import uk.gov.hmrc.test.ui.pages.Departures.Transport.InlandModeOfTransport.AddInlandModeOfTransportPage
import uk.gov.hmrc.test.ui.pages.Departures.Transport.TransportDetails._

class TransportDetailsStepDef extends BaseStepDef {

  And("""^(?:I )?choose radio option (.*) on the 'Do you want to use the same UCR for all items\?' page$""") {
    (answer: String) =>
      ApplyUcrToAllItemsPage
        .loadPage()
        .select(answer)
        .submitPage()
  }

  And("""^(?:I )?enter (.+) on the 'What is the UCR\?' page$""") { (answer: String) =>
    UniqueConsignmentReferencePage
      .loadPage()
      .fillInput(answer)
      .submitPage()
  }

  And("""^(?:I )?choose radio option (.*) on the 'Are all the items being transported to the same country\?' page$""") {
    (answer: String) =>
      ItemsSameDestinationCountryPage
        .loadPage()
        .select(answer)
        .submitPage()
  }

  And("""^(?:I )?select (.+) on the transport details 'What is the country of destination\?' page$""") {
    (answer: String) =>
      ItemsDestinationCountryPage
        .loadPage()
        .select(answer)
        .submitPage()
  }

  And(
    """^(?:I )?choose radio option (.*) on the 'Are you using any shipping containers to transport the goods\?' page$"""
  ) { (answer: String) =>
    ContainersPage
      .loadPage()
      .select(answer)
      .submitPage()
  }
  And(
    """^(?:I )?choose radio option (.*) on the 'Are the goods being transported to another country after the end of this transit movement\?' page$"""
  ) { (answer: String) =>
    ItemsBeingTransportedToAnotherCountry
      .loadPage()
      .select(answer)
      .submitPage()
  }

  And(
    """^(?:I )?choose radio option (.*) on the 'Do you want to add an inland mode of transport\?' page$"""
  ) { (answer: String) =>
    AddInlandModeOfTransportPage
      .loadPage()
      .select(answer)
      .submitPage()
  }

  And(
    """^(?:I )?choose radio option (.*) on the 'Are all the items being dispatched from the same country\?' page$"""
  ) { (answer: String) =>
    ItemsSameDispatchCountryPage
      .loadPage()
      .select(answer)
      .submitPage()
  }

  And("""^(?:I )?select (.+) on the 'What is the country of dispatch\?' page$""") { (answer: String) =>
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

}
