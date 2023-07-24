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
import uk.gov.hmrc.test.ui.pages.Departures.Transport.Carrier.{AddCarrierContactNamePage, AddCarrierContactPersonPage, AddCarrierPage, CarrierContactPhoneNumberPage, CarrierEoriNumberOrTinPage}

class CarrierDetailsStepDef extends BaseStepDef {

  And("""^(?:I )?choose radio option (.*) on the 'Do you want to add a carrier\?' page$""") { (answer: String) =>
    AddCarrierPage
      .loadPage()
      .select(answer)
      .submitPage()
  }

  And(
    """^(?:I )?enter (.+) on the 'What is the carrier’s EORI number or Third Country Unique Identification Number \(TCUIN\)\?' page$"""
  ) { (answer: String) =>
    CarrierEoriNumberOrTinPage
      .loadPage()
      .fillInput(answer)
      .submitPage()
  }

  And("""^(?:I )?choose radio option (.*) on the 'Do you want to add a contact for the carrier\?' page$""") {
    (answer: String) =>
      AddCarrierContactPersonPage
        .loadPage()
        .select(answer)
        .submitPage()
  }

  And("""^(?:I )?enter (.+) on the 'Who is the contact for the carrier\?' page$""") { (answer: String) =>
    AddCarrierContactNamePage
      .loadPage()
      .fillInput(answer)
      .submitPage()
  }

  And("""^(?:I )?enter (.+) on the 'What is the phone number for the carrier’s contact\?' page$""") {
    (answer: String) =>
      CarrierContactPhoneNumberPage
        .loadPage()
        .fillInput(answer)
        .submitPage()
  }

}
