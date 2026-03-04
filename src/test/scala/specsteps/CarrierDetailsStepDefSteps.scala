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

package specsteps

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

import specpage.Departures.Transport.Carrier.*

object CarrierDetailsStepDefSteps {

  // ^(?:I )?choose radio option (.*) on the 'Do you want to add a carrier\?' page$
  def andIChooseRadioOptionXOnTheDoYouWantToAddACarrierPage(answer: String): Unit =
    AddCarrierPage
      .loadPage()
      .select(answer)
      .submitPage()

  // ^(?:I )?enter (.+) on the 'What is the carrier’s EORI number or Third Country Unique Identification Number TCUIN\?' page$
  def andIenterOnTheWhatIsTheCarriersEORINumberOrThirdCountryUniqueIdentificationNumberTCUINPage(answer: String): Unit =
    CarrierEoriNumberOrTinPage
      .loadPage()
      .fillInput(answer)
      .submitPage()

  // ^(?:I )?choose radio option (.*) on the 'Do you want to add a contact for the carrier\?' page$
  def andIchooseRadioOptionXOnThEDoYouWantToAddAContactForTheCarrierPage(answer: String): Unit =
    AddCarrierContactPersonPage
      .loadPage()
      .select(answer)
      .submitPage()

  // ^(?:I )?enter (.+) on the 'Who is the contact for the carrier\?' page$
  def andIenterOnTheWhoIsTheContactForTheCarrierPage(answer: String): Unit =
    AddCarrierContactNamePage
      .loadPage()
      .fillInput(answer)
      .submitPage()

  // ^(?:I )?enter (.+) on the 'What is the phone number for the carrier’s contact\?' page$
  def andIenterOnTheWhatIsThePhoneNumberForTheCarriersContactPage(answer: String): Unit =
    CarrierContactPhoneNumberPage
      .loadPage()
      .fillInput(answer)
      .submitPage()

}
