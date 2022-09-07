/*
 * Copyright 2022 HM Revenue & Customs
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

import uk.gov.hmrc.test.ui.pages.RouteDetails.Transit._

class RouteTransitStepDef extends BaseStepDef {

  And("""^(?:I )?choose radio option (.*) on the t2 declaration page$""") { (answer: String) =>
    T2DeclarationPage.loadPage
    T2DeclarationPage.selectT2Declaration(answer)
    T2DeclarationPage.submitPage()
  }

  And("""^(?:I )?choose radio option (.*) on the add office of transit page$""") { (answer: String) =>
    AddOfficeOfTransitPage.loadPage
    AddOfficeOfTransitPage.selectAddOfficeOfTransit(answer)
    AddOfficeOfTransitPage.submitPage()
  }

  And("""^(?:I )?select (.+) on the office of transit country page$""") { (answer: String) =>
    OfficeOfTransitCountryPage.loadPage
    OfficeOfTransitCountryPage.selectAnOffice(answer)
    OfficeOfTransitCountryPage.submitPage()
  }

  Then("""^(?:I )?(?:should )?have (.+) as office of transit on the office of transit page$""") { (answer: String) =>
    OfficeOfTransitPage.checkOfficeOfTransitTitle(answer)
  }

  And("""^(?:I )?select (.+) on the office of transit page$""") { (answer: String) =>
    OfficeOfTransitPage.selectAnOffice(answer)
    OfficeOfTransitPage.submitPage()
  }

  Then("""^(?:I )?(?:should )?have (.+) arrival time title on the office of transit add eta page$""") {
    (answer: String) =>
      OfficeOfTransitAddEtaPage.checkOfficeOfTransitAddEtaTitle(answer)
  }

  And("""^(?:I )?choose radio option (.*) on the office of transit add eta page$""") { (answer: String) =>
    OfficeOfTransitAddEtaPage.selectOfficeOfTransitAddEta(answer)
    OfficeOfTransitAddEtaPage.submitPage()
  }

  Then("""^(?:I )?(?:should )?have (.+) as transit to arrive on the office of transit eta page$""") {
    (answer: String) =>
      OfficeOfTransitEtaPage.checkOfficeOfTransitEtaTitle(answer)
  }

  And("""^(?:I )?choose fill in the date and time on the office of transit eta page$""") { () =>
    OfficeOfTransitEtaPage.fillInNowDateAndTime()
    OfficeOfTransitEtaPage.submitPage()
  }

  Then(
    """^(?:I )?(?:should )?have (.+) (?:office|offices) of transit added on the add another office of transit page$"""
  ) { (answer: String) =>
    AddAnotherOfficeOfTransitPage.checkAddAnotherOfficeOfTransitTitle(answer)
  }

  And("""^(?:I )?choose radio option (.*) on the add another office of transit page$""") { (answer: String) =>
    AddAnotherOfficeOfTransitPage.selectAddAnotherOfficeOfTransit(answer)
    AddAnotherOfficeOfTransitPage.submitPage()
  }

  And("""^(?:I )?choose to click on (.*) link on the add another office of transit page$""") { (sectionLink: String) =>
    AddAnotherOfficeOfTransitPage.clickByPartialLinkText(sectionLink)
  }

  And("""^(?:I )?choose radio option (.*) on the confirm remove office of transit page$""") { (answer: String) =>
    ConfirmRemoveOfficeOfTransitPage.loadPage
    ConfirmRemoveOfficeOfTransitPage.selectConfirmRemoveOfficeOfTransit(answer)
    ConfirmRemoveOfficeOfTransitPage.submitPage()
  }
}
