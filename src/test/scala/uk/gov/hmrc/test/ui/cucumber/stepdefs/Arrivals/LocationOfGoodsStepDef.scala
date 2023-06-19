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

  And("""^(?:I )?choose radio option (.*) on the arrival location of goods type page$""") { (answer: String) =>
    LocationOfGoodsTypePage
      .loadPage()
      .select(answer)
      .submitPage()
  }

  And("""^(?:I )?enter (.+) on the arrival location of goods eori tin page$""") { (answer: String) =>
    LocationOfGoodsEoriTinPage
      .loadPage()
      .fillInput(answer)
      .submitPage()
  }

  And("""^(?:I )?choose radio option (.*) on the arrival location of goods identification page$""") {
    (answer: String) =>
      LocationOfGoodsIdentificationPage
        .loadPage()
        .select(answer)
        .submitPage()
  }

  And("""^(?:I )?enter (.+) and (.+) on the arrival location of goods coordinates page$""") {
    (latitudeNo: String, longitudeNo: String) =>
      LocationOfGoodsCoordinatesPage
        .loadPage()
        .fillInputs(latitudeNo, longitudeNo)
        .submitPage()
  }

  And("""^(?:I )?select (.+) on the arrival location of goods customs un locode page$""") { (answer: String) =>
    LocationOfGoodsUnLocodePage
      .loadPage()
      .select(answer)
      .submitPage()
  }

  And("""^(?:I )?select (.+) on the arrival location of goods customs office identification page$""") {
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

  And("""^(?:I )?choose radio option (.*) on the arrival location of goods add contact page$""") { (answer: String) =>
    LocationOfGoodsAddContactPage
      .loadPage()
      .select(answer)
      .submitPage()
  }

  And("""^(?:I )?enter (.+) on the arrival location of goods contact page$""") { (answer: String) =>
    LocationOfGoodsContactNamePage
      .loadPage()
      .fillInput(answer)
      .submitPage()
  }

  And("""^(?:I )?enter (.+) on the arrival location of goods contact number page$""") { (answer: String) =>
    ContactPhoneNumberPage
      .loadPage()
      .fillInput(answer)
      .submitPage()
  }

  And("""^(?:I )?choose radio option (.*) on the arrival location of goods add additional identifier page$""") {
    (answer: String) =>
      LocationOfGoodsAddAdditionalIdentifierPage
        .loadPage()
        .select(answer)
        .submitPage()
  }

  And("""^(?:I )?enter (.+) on the arrival location of goods additional identifier page$""") { (answer: String) =>
    LocationOfGoodsAdditionalIdentifierPage
      .loadPage()
      .fillInput(answer)
      .submitPage()
  }

  And("""^(?:I )?fill in address on the arrival location of goods address page$""") { () =>
    LocationOfGoodsAddressPage
      .loadPage()
      .fillInputs()
      .submitPage()
  }

  And("""^(?:I )?select (.+) on the In which country is the location of goods page$""") { (answer: String) =>
    LocationOfGoodsCountryPage
      .loadPage()
      .select(answer)
      .submitPage()
  }
}
