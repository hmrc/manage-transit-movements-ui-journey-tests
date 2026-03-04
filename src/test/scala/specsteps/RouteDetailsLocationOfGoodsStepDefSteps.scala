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

import specpage.Departures.RouteDetails.LocationOfGoods.*

object RouteDetailsLocationOfGoodsStepDefSteps {

  // ^(?:I )?choose radio option (.*) on the 'Do you want to add a location of goods\?' page$
  def andIchooseRadioOptionXOnTheDoYouWantToAddALocationOfGoodsPage(answer: String): Unit =
    AddLocationOfGoodsPage
      .loadPage()
      .select(answer)
      .submitPage()

  // ^(?:I )?choose radio option (.*) on the 'Which type of location is it\?' page$
  def andIchooseRadioOptionXOnTheWhichTypeOfLocationIsItPage(answer: String): Unit =
    LocationOfGoodsTypePage
      .loadPage()
      .select(answer)
      .submitPage()

  // ^(?:I )?choose radio option (.*) on the 'How do you want to identify the location of goods\?' page$
  def andIchooseRadioOptionXOnTheHowDoYouWantToIdentifyTheLocationOfGoodsPage(answer: String): Unit =
    LocationOfGoodsIdentificationPage
      .loadPage()
      .select(answer)
      .submitPage()

  // ^(?:I )?select (.+) on the departure location of goods customs office identification page$
  def andIselectOnTheDepartureLocationOfGoodsCustomsOfficeIdentificationPage(answer: String): Unit =
    LocationOfGoodsCustomsOfficeIdentificationPage
      .loadPage()
      .select(answer)
      .submitPage()

  // ^(?:I )?enter (.+) on the departure location of goods eori tin page$
  def andIenterOnTheDepartureLocationOfGoodsEoriTinPage(answer: String): Unit =
    LocationOfGoodsEoriTinPage
      .loadPage()
      .fillInput(answer)
      .submitPage()

  // ^(?:I )?enter (.+) on the 'What is the authorisation number for the location of goods\?' page$
  def andIenterOnTheWhatIsTheAuthorisationNumberForTheLocationOfGoodsPage(answer: String): Unit =
    LocationOfGoodsAuthorisationNumberPage
      .loadPage()
      .fillInput(answer)
      .submitPage()

  // ^(?:I )?select (.+) on the location of goods country page$
  def andIselectOnTheLocationOfGoodsCountryPage(answer: String): Unit =
    LocationOfGoodsCountryPage
      .loadPage()
      .select(answer)
      .submitPage()

  // ^(?:I )?fill in address on the departure location of goods address page$
  def andIfillInAddressOnTheDepartureLocationOfGoodsAddressPage(): Unit =
    LocationOfGoodsAddressPage
      .loadPage()
      .fillInputs()
      .submitPage()

  // ^(?:I )?enter (.+) on the departure location of goods customs un locode page$
  def andIenterOnTheDepartureLocationOfGoodsCustomsUnLocodePage(answer: String): Unit =
    LocationOfGoodsUnLocodePage
      .loadPage()
      .fillInput(answer)
      .submitPage()

  // ^(?:I )?choose radio option (.*) on the 'Do you want to add an additional identifier for the location of goods\?' page$
  def andIchooseRadioOptionXOnTheDoYouWantToAddAnAdditionalIdentifierForTheLocationOfGoodsPage(answer: String): Unit =
    LocationOfGoodsAddIdentificationPage
      .loadPage()
      .select(answer)
      .submitPage()

  // ^(?:I )?enter (.+) on the 'What is the additional identifier for the location of goods\?' page$
  def andIenterOnTheWhatIsTheAdditionalIdentifierForTheLocationOfGoodsPage(answer: String): Unit =
    LocationOfGoodsAdditionalIdentifierPage
      .loadPage()
      .fillInput(answer)
      .submitPage()

  // ^(?:I )?choose radio option (.*) on the 'Do you want to add a contact for the location of goods\?' page$
  def andIchooseRadioOptionXOnTheDoYouWantToAddAContactForTheLocationOfGoodsPage(answer: String): Unit =
    LocationOfGoodsAddContactPage
      .loadPage()
      .select(answer)
      .submitPage()

  // ^(?:I )?enter (.+) and (.+) on the 'What are the coordinates for the location of goods' page$
  def andIenterAndOnTheWhatAreTheCoordinatesForTheLocationOfGoodsPage(latitudeNo: String, longitudeNo: String): Unit =
    LocationOfGoodsCoordinatesPage
      .loadPage()
      .fillInputs(latitudeNo, longitudeNo)
      .submitPage()

  // ^(?:I )?enter (.+) on the 'Who is the contact for the location of goods\?' page$
  def andIenterOnTheWhoIsTheContactForTheLocationOfGoodsPage(answer: String): Unit =
    LocationOfGoodsContactPage
      .loadPage()
      .fillInput(answer)
      .submitPage()

  // ^(?:I )?enter (.+) on the 'What is the phone number for the location of goods’ contact\?' page$
  def andIenterOnTheWhatIsThePhoneNumberForTheLocationOfGoodsContactPage(answer: String): Unit =
    LocationOfGoodsContactTelephoneNumberPage
      .loadPage()
      .fillInput(answer)
      .submitPage()

}
