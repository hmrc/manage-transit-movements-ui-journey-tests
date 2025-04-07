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

package uk.gov.hmrc.test.ui.cucumber.stepdefs.Departures.RouteDetails

import uk.gov.hmrc.test.ui.cucumber.stepdefs.BaseStepDef
import uk.gov.hmrc.test.ui.pages.CYAPage
import uk.gov.hmrc.test.ui.pages.Departures.RouteDetails.Transit.*

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

  And("""^(?:I )?select (.+) on the 'Which country is the office of transit in\?' page$""") { (answer: String) =>
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

  And("""^(?:I )?select (.+) on the 'Where in (.*) is the office of transit\?' page$""") {
    (answer: String, countryInTitle: String) =>
      OfficeOfTransitPage
        .loadPage(countryInTitle)
        .select(answer)
        .submitPage()
  }

  And("""^(?:I )?choose radio option (.*) on the 'Do you want to add a time of arrival in (.*)\?' page$""") {
    (answer: String, officeInTitle: String) =>
      OfficeOfTransitAddEtaPage
        .loadPage(officeInTitle)
        .select(answer)
        .submitPage()
  }

  And(
    """^(?:I )?choose fill in the date and time on the 'When do you expect the transit to arrive in (.*), (.*)\?' page$"""
  ) { (office: String, country: String) =>
    OfficeOfTransitEtaPage
      .loadPage(office, country)
      .fillInputs()
      .submitPage()
  }

  Then(
    """^(?:I )?(?:should )?have (.+) offices? of transit added on the 'You have added (.*) offices? of transit' page$"""
  ) { (numberOfOffices: String, _: String) =>
    AddAnotherOfficeOfTransitPage
      .loadPage(numberOfOffices)
  }

  And("""^(?:I )?choose radio option (.*) on the 'You have added (.*) offices? of transit' page$""") {
    (answer: String, numberOfCountriesInTitle: String) =>
      AddAnotherOfficeOfTransitPage
        .loadPage(numberOfCountriesInTitle)
        .select(answer)
        .submitPage()
  }

  And(
    """^(?:I )?choose to click on the (.*) link on the 'You have added (.*) offices? of transit' page$"""
  ) { (sectionLink: String, numberOfOfficeInTitle: String) =>
    AddAnotherOfficeOfTransitPage
      .loadPage(numberOfOfficeInTitle)
      .clickByPartialLinkText(sectionLink)
  }

  And(
    """^(?:I )?choose radio option (.*) on the 'Are you sure you want to remove this office of transit?\?' page$"""
  ) { (answer: String) =>
    ConfirmRemoveOfficeOfTransitPage
      .loadPage()
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

  And("""^(?:I )?choose to click on (.*) link on the 'No offices of transit' page$""") {
    (sectionLink: String) =>
      NoTransitOfficesPage
        .loadPage()
        .clickByPartialLinkText(sectionLink)
  }

  And("""^(?:I )?choose to click on (.*) link on the Check your answers section (.*) page$""") {
    (sectionLink: String, subheading: String) =>
      CYAPage
        .loadPage(subheading)
        .clickByPartialLinkText(sectionLink)
  }

}
