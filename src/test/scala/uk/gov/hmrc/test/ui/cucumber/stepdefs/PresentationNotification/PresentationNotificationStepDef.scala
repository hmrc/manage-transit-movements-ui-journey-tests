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

package uk.gov.hmrc.test.ui.cucumber.stepdefs.PresentationNotification

import uk.gov.hmrc.test.ui.cucumber.stepdefs.BaseStepDef
import uk.gov.hmrc.test.ui.pages.PresentationNotification._

class PresentationNotificationStepDef extends BaseStepDef {

  And("""^(?:I )?click the Continue button on the presentation 'More information needed to complete declaration' page$""") { () =>
    MoreInformationPage
      .loadPage()
      .submitPage()
  }

  And("""^(?:I )?choose radio option (.*) on the presentation 'Which type of location are the goods in\?' page$""") { (answer: String) =>
    LocationOfGoodsTypePage
      .loadPage()
      .select(answer)
      .submitPage()
  }

  And("""^(?:I )?choose a radio option (.*) on the presentation 'How do you want to identify the location of goods\?' page$""") {
    (answer: String) =>
      LocationOfGoodsIdentificationPage
        .loadPage()
        .select(answer)
        .submitPage()
  }

  And("""^(?:I )?select (.+) on the presentation 'In which country is the location of goods\?' page$""") {
    (answer: String) =>
      LocationOfGoodsCountryPage
        .loadPage()
        .select(answer)
        .submitPage()
  }
  And("""^(?:I )?fill in the address on the presentation 'What is the address for the location of goods\?' page$""") { () =>
    LocationOfGoodsAddressPage
      .loadPage()
      .fillInputs()
      .submitPage()
  }

  And("""^(?:I )?enter (.+) on the presentation 'What is the authorisation number for the location of goods\?' page$""") {
    (answer: String) =>
      LocationOfGoodsAuthorisationNumberPage
        .loadPage()
        .fillInput(answer)
        .submitPage()
  }

}
