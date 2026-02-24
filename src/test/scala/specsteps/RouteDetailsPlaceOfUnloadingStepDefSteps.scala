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

import specpage.Departures.RouteDetails.PlaceOfUnloading.*

object RouteDetailsPlaceOfUnloadingStepDefSteps {

  // ^(?:I )?choose radio option (.*) on the 'Do you want to add a place of unloading\?' page$
  def andIchooseRadioOptionXOnTheDoYouWantToAddAPlaceOfUnloadingPage(answer: String): Unit =
    AddPlaceOfUnloadingPage
      .loadPage()
      .select(answer)
      .submitPage()

  // ^(?:I )?choose radio option (.*) on the 'Do you want to add a UN LOCODE for the place of unloading\?' page$
  def andIchooseRadioOptionXOnTheDoYouWantToAddAUNLOCODEForThePlaceOfUnloadingPage(answer: String): Unit =
    PlaceOfUnloadingAddUnLocodePage
      .loadPage()
      .select(answer)
      .submitPage()

  // ^(?:I )?enter (.+) on the 'What is the UN LOCODE for the place of unloading\?' page$
  def andIenterOnTheWhatIsTheUNLOCODEForThePlaceOfUnloadingPage(answer: String): Unit =
    PlaceOfUnloadingUnLocodePage
      .loadPage()
      .fillInput(answer)
      .submitPage()

  // ^(?:I )?choose radio option (.*) on the 'Do you want to add extra information for the place of unloading\?' page$
  def andIchooseRadioOptionXOnTheDoYouWantToAddExtraInformationForThePlaceOfUnloadingPage(answer: String): Unit =
    PlaceOfUnloadingAddExtraInformationPage
      .loadPage()
      .select(answer)
      .submitPage()

  // ^(?:I )?select (.+) on the 'Which country is the place of unloading in\?' page$
  def andIselectOnTheWhichCountryIsThePlaceOfUnloadingInPage(answer: String): Unit =
    PlaceOfUnloadingCountryPage
      .loadPage()
      .select(answer)
      .submitPage()

  // ^(?:I )?enter (.+) on the 'Where in (.*) is the place of unloading\?' page$
  def andIenterOnTheWhereInXIsThePlaceOfUnloadingPage(answer: String, country: String): Unit =
    PlaceOfUnloadingLocationPage
      .loadPage(country)
      .fillInput(answer)
      .submitPage()

}
