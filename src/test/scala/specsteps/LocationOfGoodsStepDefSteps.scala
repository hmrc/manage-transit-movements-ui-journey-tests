/*
 * Copyright 2026 HM Revenue & Customs
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

import uk.gov.hmrc.test.ui.cucumber.stepdefs.BaseStepDef
import uk.gov.hmrc.test.ui.pages.Arrivals.{Arrivals_ContactPhoneNumberPage, Arrivals_LocationOfGoodsAddContactPage, Arrivals_LocationOfGoodsAuthorisationNumberPage, Arrivals_LocationOfGoodsContactNamePage, Arrivals_LocationOfGoodsCoordinatesPage, Arrivals_LocationOfGoodsCustomsOfficeIdentificationPage, Arrivals_LocationOfGoodsIdentificationPage, Arrivals_LocationOfGoodsTypePage}
import uk.gov.hmrc.test.ui.pages.Arrivals.*

object LocationOfGoodsStepDefSteps {

  // ^(?:I )?choose radio option (.*) on the arrival location of goods type page$
  def andIchooseRadioOptionXOnTheArrivalLocationOfGoodsTypePage(answer: String): Unit =
    Arrivals_LocationOfGoodsTypePage
      .loadPage()
      .select(answer)
      .submitPage()

  // ^(?:I )?choose radio option (.*) on the arrival location of goods identification page$
  def andIchooseRadioOptionXOnTheArrivalLocationOfGoodsIdentificationPage(answer: String): Unit =
    Arrivals_LocationOfGoodsIdentificationPage
      .loadPage()
      .select(answer)
      .submitPage()

  // ^(?:I )?enter (.+) and (.+) on the arrival location of goods coordinates page$
  def andIenterAndOnTheArrivalLocationOfGoodsCoordinatesPage(latitudeNo: String, longitudeNo: String): Unit =
    Arrivals_LocationOfGoodsCoordinatesPage
      .loadPage()
      .fillInputs(latitudeNo, longitudeNo)
      .submitPage()

  // ^(?:I )?select (.+) on the arrival location of goods customs office identification page$
  def andIselectOnTheArrivalLocationOfGoodsCustomsOfficeIdentificationPage(answer: String): Unit =
    Arrivals_LocationOfGoodsCustomsOfficeIdentificationPage
      .loadPage()
      .select(answer)
      .submitPage()

  // ^(?:I )?enter (.+) on the arrival location of goods authorisation number page$
  def andIenterOnTheArrivalLocationOfGoodsAuthorisationNumberPage(answer: String): Unit =
    Arrivals_LocationOfGoodsAuthorisationNumberPage
      .loadPage()
      .fillInput(answer)
      .submitPage()

  // ^(?:I )?choose radio option (.*) on the arrival location of goods add contact page$
  def andIchooseRadioOptionXOnTheArrivalLocationOfGoodsAddContactPage(answer: String): Unit =
    Arrivals_LocationOfGoodsAddContactPage
      .loadPage()
      .select(answer)
      .submitPage()

  // ^(?:I )?enter (.+) on the arrival location of goods contact page$
  def andIenterOnTheArrivalLocationOfGoodsContactPage(answer: String): Unit =
    Arrivals_LocationOfGoodsContactNamePage
      .loadPage()
      .fillInput(answer)
      .submitPage()

  // ^(?:I )?enter (.+) on the arrival location of goods contact number page$
  def andIenterOnTheArrivalLocationOfGoodsContactNumberPage(answer: String): Unit =
    Arrivals_ContactPhoneNumberPage
      .loadPage()
      .fillInput(answer)
      .submitPage()

}
