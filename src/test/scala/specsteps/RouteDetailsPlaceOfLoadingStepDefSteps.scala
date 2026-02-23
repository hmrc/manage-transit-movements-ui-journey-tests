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
import uk.gov.hmrc.test.ui.pages.Departures.RouteDetails.PlaceOfLoading.*

object RouteDetailsPlaceOfLoadingStepDefSteps {

  // ^(?:I )?choose radio option (.*) on the 'Do you want to add a UN LOCODE for the place of loading\?' page$
  def andIchooseRadioOptionXOnTheDoYouWantToAddAUNLOCODEForThePlaceOfLoadingPage(answer: String): Unit =
    PlaceOfLoadingAddUnLocodePage
      .loadPage()
      .select(answer)
      .submitPage()

  // ^(?:I )?choose radio option (.*) on the 'Do you want to add a place of loading\?' page$
  def andIchooseRadioOptionXOnTheDoYouWantToAddAPlaceOfLoadingPage(answer: String): Unit =
    AddPlaceOfLoading
      .loadPage()
      .select(answer)
      .submitPage()

  // ^(?:I )?enter (.+) on the 'What is the UN LOCODE for the place of loading\?' page$
  def andIenterOnTheWhatIsTheUNLOCODEForThePlaceOfLoadingPage(answer: String): Unit =
    PlaceOfLoadingUnLocodePage
      .loadPage()
      .fillInput(answer)
      .submitPage()

  // ^(?:I )?choose radio option (.*) on the 'Do you want to add extra information for the place of loading\?' page$
  def andIchooseRadioOptionXOnTheDoYouWantToAddExtraInformationForThePlaceOfLoadingPage(answer: String): Unit =
    PlaceOfLoadingAddExtraInformationPage
      .loadPage()
      .select(answer)
      .submitPage()

  // ^(?:I )?select (.+) on the 'In which country is the place of loading\?' page$
  def andIselectOnTheInWhichCountryIsThePlaceOfLoadingPage(answer: String): Unit =
    PlaceOfLoadingCountryPage
      .loadPage()
      .select(answer)
      .submitPage()

  // ^(?:I )?enter (.+) on the 'Where in (.*) is the place of loading\?' page$
  def andIenterOnTheWhereInXIsThePlaceOfLoadingPage(answer: String, countryInTitle: String): Unit =
    PlaceOfLoadingLocationPage
      .loadPage(countryInTitle)
      .fillInput(answer)
      .submitPage()

}
