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
import uk.gov.hmrc.test.ui.pages.Arrivals.LocationOfGoodsType._

class LocationOfGoodsStepDef extends BaseStepDef {

  And("""^(?:I )?choose radio option (.*) on the 'Which type of location are the goods in\?' page$""") { (answer: String) =>
    LocationOfGoodsTypePage
      .loadPage()
      .select(answer)
      .submitPage()
  }

  And("""^(?:I )?enter (.+) on the 'What is the EORI number or Trader Identification Number for the location of goods\?' page$""") { (answer: String) =>
    LocationOfGoodsEoriTinPage
      .loadPage()
      .fillInput(answer)
      .submitPage()
  }

  And("""^(?:I )?choose radio option (.*) on the 'How do you want to identify the arrival location of goods\?' page$""") {
    (answer: String) =>
      LocationOfGoodsIdentificationPage
        .loadPage()
        .select(answer)
        .submitPage()
  }

  And("""^(?:I )?enter (.+) and (.+) on the 'What are the coordinates for the location of goods\?' page$""") {
    (latitudeNo: String, longitudeNo: String) =>
      LocationOfGoodsCoordinatesPage
        .loadPage()
        .fillInputs(latitudeNo, longitudeNo)
        .submitPage()
  }

  And("""^(?:I )?select (.+) on the 'What is the UN\/LOCODE for the location of goods\?' page$""") { (answer: String) =>
    LocationOfGoodsUnLocodePage
      .loadPage()
      .select(answer)
      .submitPage()
  }

  And("""^(?:I )?select (.+) on the 'What is the customs office identifier for the location of goods\?' page$""") {
    (answer: String) =>
      LocationOfGoodsCustomsOfficeIdentificationPage
        .loadPage()
        .select(answer)
        .submitPage()
  }

  And("""^(?:I )?fill in address on the arrival location of goods postal code page$""") { () =>
    LocationOfGoodsPostalCodePage
      .loadPage()
      .fillInputs()
      .submitPage()
  }

  And("""^(?:I )?enter (.+) on the arrival location of goods authorisation number page$""") { (answer: String) =>
    LocationOfGoodsAuthorisationNumberPage
      .loadPage()
      .fillInput(answer)
      .submitPage()
  }

  And("""^(?:I )?choose radio option (.*) on the 'Do you want to add a contact for the arrival location of goods\?' page$""") { (answer: String) =>
    LocationOfGoodsAddContactPage
      .loadPage()
      .select(answer)
      .submitPage()
  }

  And("""^(?:I )?enter (.+) on the 'Who is the contact for the arrival location of goods\?' page$""") { (answer: String) =>
    LocationOfGoodsContactPage
      .loadPage()
      .fillInput(answer)
      .submitPage()
  }

  And("""^(?:I )?enter (.+) on the 'What is John Bonham’s telephone number\?' page$""") { (answer: String) =>
    LocationOfGoodsContactTelephoneNumberPage
      .loadPage()
      .fillInput(answer)
      .submitPage()
  }

  And("""^(?:I )?choose radio option (.*) on the 'Do you want to add an additional identifier for the location of goods\?' page$""") {
    (answer: String) =>
      LocationOfGoodsAddAdditionalIdentifierPage
        .loadPage()
        .select(answer)
        .submitPage()
  }

  And("""^(?:I )?enter (.+) on the 'What is the additional identifier for the location of goods?' page$""") { (answer: String) =>
    LocationOfGoodsAdditionalIdentifierPage
      .loadPage()
      .fillInput(answer)
      .submitPage()
  }

  And("""^(?:I )?fill in address on the 'What is the address for the location of goods\?' page$""") { () =>
    LocationOfGoodsAddressPage
      .loadPage()
      .fillInputs()
      .submitPage()
  }

  And("""^(?:I )?select (.+) on the 'In which country is the location of goods\?' page$""") { (answer: String) =>
    LocationOfGoodsCountryPage
      .loadPage()
      .select(answer)
      .submitPage()
  }
}
