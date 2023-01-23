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
import uk.gov.hmrc.test.ui.pages.Departures.Transport.Carrier.{AddCarrierContactNamePage, AddCarrierContactPersonPage, CarrierContactPhoneNumberPage, CarrierEoriNumberOrTinPage}

class CarrierDetailsStepDef extends BaseStepDef {

  And("""^(?:I )?enter (.+) on the carrier eori number or tin page$""") { (answer: String) =>
    CarrierEoriNumberOrTinPage
      .loadPage()
      .fillInput(answer)
      .submitPage()
  }

  And("""^(?:I )?choose radio option (.*) on the add carrier contact page$""") { (answer: String) =>
    AddCarrierContactPersonPage
      .loadPage()
      .select(answer)
      .submitPage()
  }

  And("""^(?:I )?enter (.+) on the carrier's contact name page$""") { (answer: String) =>
    AddCarrierContactNamePage
      .loadPage()
      .fillInput(answer)
      .submitPage()
  }

  And("""^(?:I )?enter (.+) on the carrier's contact phone number page$""") { (answer: String) =>
    CarrierContactPhoneNumberPage
      .loadPage()
      .fillInput(answer)
      .submitPage()
  }

}
