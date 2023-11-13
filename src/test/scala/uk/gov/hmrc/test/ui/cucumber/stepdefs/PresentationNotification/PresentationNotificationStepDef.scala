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
import uk.gov.hmrc.test.ui.pages.PresentationNotification.ActiveMeansOfBorderTransport.{ActiveBorderMeansOfTransportOfficeOfTransitPage, ActiveMeansOfBorderAddAnotherBorderMeansOfTransportPage, ActiveMeansOfBorderAddConveyanceReferenceNumberPage, ActiveMeansOfBorderTransportCountryPage, ActiveMeansOfBorderTransportIdentificationNumberPage, ActiveMeansOfBorderTransportIdentificationPage, ActiveMenasOfBorderConveyanceReferenceNumberPage, BorderMeansOfTransportTransitCrossingAtBorderPage}
import uk.gov.hmrc.test.ui.pages.PresentationNotification._

class PresentationNotificationStepDef extends BaseStepDef {

  And(
    """^(?:I )?click the Continue button on the presentation 'More information needed to complete declaration' page$"""
  ) { () =>
    MoreInformationPage
      .loadPage()
      .submitPage()
  }

  And("""^(?:I )?choose radio option (.*) on the presentation 'Which type of location are the goods in\?' page$""") {
    (answer: String) =>
      LocationOfGoodsTypePage
        .loadPage()
        .select(answer)
        .submitPage()
  }

  And(
    """^(?:I )?choose a radio option (.*) on the presentation 'How do you want to identify the location of goods\?' page$"""
  ) { (answer: String) =>
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
  And("""^(?:I )?fill in the address on the presentation 'What is the address for the location of goods\?' page$""") {
    () =>
      LocationOfGoodsAddressPage
        .loadPage()
        .fillInputs()
        .submitPage()
  }

  And(
    """^(?:I )?enter (.+) on the presentation 'What is the authorisation number for the location of goods\?' page$"""
  ) { (answer: String) =>
    LocationOfGoodsAuthorisationNumberPage
      .loadPage()
      .fillInput(answer)
      .submitPage()
  }

  And(
    """^(?:I )?choose radio option (.*) on the presentation 'Do you want to add a contact for the location of goods\?' page$"""
  ) { (answer: String) =>
    LocationOfGoodsAddContactPage
      .loadPage()
      .select(answer)
      .submitPage()
  }

  And("""^(?:I )?enter (.+) on the presentation 'Who is the contact for the location of goods\?' page$""") {
    (answer: String) =>
      LocationOfGoodsContactPage
        .loadPage()
        .fillInput(answer)
        .submitPage()
  }

  And(
    """^(?:I )?enter (.+) on the presentation 'What is the phone number for the location of goods’ contact\?' page$"""
  ) { (answer: String) =>
    LocationOfGoodsContactTelephoneNumberPage
      .loadPage()
      .fillInput(answer)
      .submitPage()
  }

  And(
    """^(?:I )?choose radio option (.*) on the presentation 'Do you want to add an additional identifier for the location of goods\?' page$"""
  ) { (answer: String) =>
    LocationOfGoodsAddIdentificationPage
      .loadPage()
      .select(answer)
      .submitPage()
  }

  And(
    """^(?:I )?enter (.+) on the presentation 'What is the additional identifier for the location of goods\?' page$"""
  ) { (answer: String) =>
    LocationOfGoodsAdditionalIdentifierPage
      .loadPage()
      .fillInput(answer)
      .submitPage()
  }

  And(
    """^(?:I )?choose radio option (.*) on the presentation 'Do you want to add a UN LOCODE for the place of loading\?' page$"""
  ) { (answer: String) =>
    PlaceOfLoadingAddUnLocodePage
      .loadPage()
      .select(answer)
      .submitPage()
  }

  And("""^(?:I )?enter (.+) on the presentation 'What is the UN LOCODE for the place of loading\?' page$""") {
    (answer: String) =>
      PlaceOfLoadingUnLocodePage
        .loadPage()
        .fillInput(answer)
        .submitPage()
  }

  And(
    """^(?:I )?choose radio option (.*) on the presentation 'Do you want to add extra information for the place of loading\?' page$"""
  ) { (answer: String) =>
    PlaceOfLoadingAddExtraInformationPage
      .loadPage()
      .select(answer)
      .submitPage()
  }

  And("""^(?:I )?select (.+) on the presentation 'In which country is the place of loading\?' page$""") {
    (answer: String) =>
      PlaceOfLoadingCountryPage
        .loadPage()
        .select(answer)
        .submitPage()
  }

  And("""^(?:I )?enter (.+) on the presentation 'Where in (.*) is the place of loading\?' page$""") {
    (answer: String, countryInTitle: String) =>
      PlaceOfLoadingLocationPage
        .loadPage(countryInTitle)
        .fillInput(answer)
        .submitPage()
  };

  And("""^(?:I )?enter the date on the presentation 'When do you expect the transit to arrive in (.*)\?' page$""") {
    (officeOfDestination: String) =>
      LimitDatePage
        .loadPage(officeOfDestination)
        .fillInputs()
        .submitPage()
  }

  And("""^(?:I )?choose radio (.*) on the 'How is the transit crossing the border\?' page$""") {
    (answer: String) =>
      BorderMeansOfTransportTransitCrossingAtBorderPage
        .loadPage()
        .select(answer)
        .submitPage()
  }
  And(
    """^(?:I )?choose radio (.*) on the inland mode 'Which identification do you want to use for this vehicle\?' page$"""
  ) { (answer: String) =>
    ActiveMeansOfBorderTransportIdentificationPage
      .loadPage()
      .select(answer)
      .submitPage()
  }
  And("""^(?:I )?enter identification number (.+) on 'What is the identification number for this\?' page$""") {
    (answer: String) =>
      ActiveMeansOfBorderTransportIdentificationNumberPage
        .loadPage()
        .fillInput(answer)
        .submitPage()
  }
  And("""^(?:I )?select (.+) on the active border mode 'What country is this vehicle registered to\?' page$""") {
    (answer: String) =>
      ActiveMeansOfBorderTransportCountryPage
        .loadPage()
        .select(answer)
        .submitPage()
  }

  And("""^(?:I )?select (.+) on 'Where is the customs office at the border\?' page$""") { (answer: String) =>
    ActiveBorderMeansOfTransportOfficeOfTransitPage
      .loadPage()
      .select(answer)
      .submitPage()
  }

  And("""^(?:I )?choose radio (.*) on the 'Do you want to add a conveyance reference number\?' page$""") {
    (answer: String) =>
      ActiveMeansOfBorderAddConveyanceReferenceNumberPage
        .loadPage()
        .select(answer)
        .submitPage()
  }
  And("""^(?:I )?enter conveyance reference number (.+) on the 'What is the conveyance reference number\?' page$""") {
    (answer: String) =>
      ActiveMenasOfBorderConveyanceReferenceNumberPage
        .loadPage()
        .fillInput(answer)
        .submitPage()
  }

  When("""^(?:I )?choose radio (.*) on the 'You have added (.*) border means of transport' page$""") {
    (answer: String, numberOfBorderMeansInTitle: String) =>
      ActiveMeansOfBorderAddAnotherBorderMeansOfTransportPage
        .loadPage(numberOfBorderMeansInTitle)
        .select(answer)
        .submitPage()
  }
}
