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

class RouteDetailsTransitStepDef extends BaseStepDef {

  And("""^(?:I )?choose radio option (.*) on the t2 declaration page$""") { (answer: String) =>
    T2DeclarationPage
      .loadPage()
      .select(answer)
      .submitPage()
  }

  And("""^(?:I )?choose radio option (.*) on the add office of transit page$""") { (answer: String) =>
    AddOfficeOfTransitPage
      .loadPage()
      .select(answer)
      .submitPage()
  }

  And("""^(?:I )?select (.+) on the office of transit country page$""") { (answer: String) =>
    OfficeOfTransitCountryPage
      .loadPage()
      .select(answer)
      .submitPage()
  }

  Then("""^(?:I )?(?:should )?have (.+) as office of transit on the office of transit page$""") {
    (numberOfOffices: String) =>
      OfficeOfTransitPage
        .loadPage(numberOfOffices)
  }

  And("""^(?:I )?select (.+) on the office of transit page$""") { (answer: String) =>
    OfficeOfTransitPage
      .select(answer)
      .submitPage()
  }

  Then("""^(?:I )?(?:should )?have (.+) arrival time title on the office of transit add eta page$""") {
    (office: String) =>
      OfficeOfTransitAddEtaPage
        .loadPage(office)
  }

  And("""^(?:I )?choose radio option (.*) on the office of transit add eta page$""") { (answer: String) =>
    OfficeOfTransitAddEtaPage
      .select(answer)
      .submitPage()
  }

  Then("""^(?:I )?(?:should )?have (.+), (.+) as transit to arrive on the office of transit eta page$""") {
    (office: String, country: String) =>
      OfficeOfTransitEtaPage
        .loadPage(office, country)
  }

  And("""^(?:I )?choose fill in the date and time on the office of transit eta page$""") { () =>
    OfficeOfTransitEtaPage
      .fillInputs()
      .submitPage()
  }

  Then("""^(?:I )?(?:should )?have (.+) offices? of transit added on the add another office of transit page$""") {
    (numberOfOffices: String) =>
    AddAnotherOfficeOfTransitPage
      .loadPage(numberOfOffices)
  }

  And("""^(?:I )?choose radio option (.*) on the add another office of transit page$""") { (answer: String) =>
    AddAnotherOfficeOfTransitPage
      .select(answer)
      .submitPage()
  }

  And("""^(?:I )?choose to click on (.*) link on the add another office of transit page$""") { (sectionLink: String) =>
    AddAnotherOfficeOfTransitPage
      .clickByPartialLinkText(sectionLink)
  }

  And("""^(?:I )?choose radio option (.*) on the confirm remove office of transit page$""") { (answer: String) =>
    ConfirmRemoveOfficeOfTransitPage
      .loadPage()
      .select(answer)
      .submitPage()
  }
}
