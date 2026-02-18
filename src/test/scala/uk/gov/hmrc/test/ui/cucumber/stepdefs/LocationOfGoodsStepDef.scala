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

package uk.gov.hmrc.test.ui.cucumber.stepdefs

import uk.gov.hmrc.test.ui.cucumber.stepdefs.BaseStepDef
import uk.gov.hmrc.test.ui.pages.Arrivals.{Arrivals_ContactPhoneNumberPage, Arrivals_LocationOfGoodsAddContactPage, Arrivals_LocationOfGoodsAuthorisationNumberPage, Arrivals_LocationOfGoodsContactNamePage, Arrivals_LocationOfGoodsCoordinatesPage, Arrivals_LocationOfGoodsCustomsOfficeIdentificationPage, Arrivals_LocationOfGoodsIdentificationPage, Arrivals_LocationOfGoodsTypePage}
import uk.gov.hmrc.test.ui.pages.Arrivals.*

class LocationOfGoodsStepDef extends BaseStepDef {

  And("""^(?:I )?choose radio option (.*) on the arrival location of goods type page$""") { (answer: String) =>
    Arrivals_LocationOfGoodsTypePage
      .loadPage()
      .select(answer)
      .submitPage()
  }

  And("""^(?:I )?choose radio option (.*) on the arrival location of goods identification page$""") {
    (answer: String) =>
      Arrivals_LocationOfGoodsIdentificationPage
        .loadPage()
        .select(answer)
        .submitPage()
  }

  And("""^(?:I )?enter (.+) and (.+) on the arrival location of goods coordinates page$""") {
    (latitudeNo: String, longitudeNo: String) =>
      Arrivals_LocationOfGoodsCoordinatesPage
        .loadPage()
        .fillInputs(latitudeNo, longitudeNo)
        .submitPage()
  }

  And("""^(?:I )?select (.+) on the arrival location of goods customs office identification page$""") {
    (answer: String) =>
      Arrivals_LocationOfGoodsCustomsOfficeIdentificationPage
        .loadPage()
        .select(answer)
        .submitPage()
  }

  And("""^(?:I )?enter (.+) on the arrival location of goods authorisation number page$""") { (answer: String) =>
    Arrivals_LocationOfGoodsAuthorisationNumberPage
      .loadPage()
      .fillInput(answer)
      .submitPage()
  }

  And("""^(?:I )?choose radio option (.*) on the arrival location of goods add contact page$""") { (answer: String) =>
    Arrivals_LocationOfGoodsAddContactPage
      .loadPage()
      .select(answer)
      .submitPage()
  }

  And("""^(?:I )?enter (.+) on the arrival location of goods contact page$""") { (answer: String) =>
    Arrivals_LocationOfGoodsContactNamePage
      .loadPage()
      .fillInput(answer)
      .submitPage()
  }

  And("""^(?:I )?enter (.+) on the arrival location of goods contact number page$""") { (answer: String) =>
    Arrivals_ContactPhoneNumberPage
      .loadPage()
      .fillInput(answer)
      .submitPage()
  }

}
