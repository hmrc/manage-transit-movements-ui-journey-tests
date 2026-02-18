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

package uk.gov.hmrc.test.ui.cucumber.stepdefs

import uk.gov.hmrc.test.ui.cucumber.stepdefs.BaseStepDef
import uk.gov.hmrc.test.ui.pages.Manage.ManagedFEPreLodgeCYA
import uk.gov.hmrc.test.ui.pages.PresentationNotification.*
import uk.gov.hmrc.test.ui.pages.PresentationNotification.*
import uk.gov.hmrc.test.ui.pages.PresentationNotification.*

class PresentationNotificationStepDef extends BaseStepDef {

  And(
    """^(?:I )?click the Continue button on the presentation 'More information needed to complete pre-lodged declaration' page$"""
  ) { () =>
    PresentationNotificationMoreInformationPage
      .loadPage()
      .submitPage()
  }

  And(
    """^(?:I )?click the Continue button on the presentation 'Confirmation needed to complete pre-lodged declaration' page$"""
  ) { () =>
    PresentationNotificationConfirmationNeededPage
      .loadPage()
      .submitPage()
  }

  And("""^(?:I )?choose radio option (.*) on the presentation 'Which type of location are the goods in\?' page$""") {
    (answer: String) =>
      PresentationNotificationLocationOfGoodsTypePage
        .loadPage()
        .select(answer)
        .submitPage()
  }

  And(
    """^(?:I )?choose a radio option (.*) on the presentation 'How do you want to identify the location of goods\?' page$"""
  ) { (answer: String) =>
    PresentationNotificationLocationOfGoodsIdentificationPage
      .loadPage()
      .select(answer)
      .submitPage()
  }

  And("""^(?:I )?select (.+) on the presentation 'In which country is the location of goods\?' page$""") {
    (answer: String) =>
      PresentationNotificationLocationOfGoodsCountryPage
        .loadPage()
        .select(answer)
        .submitPage()
  }

  And("""^(?:I )?fill in the address on the presentation 'What is the address for the location of goods\?' page$""") {
    () =>
      PresentationNotificationLocationOfGoodsAddressPage
        .loadPage()
        .fillInputs()
        .submitPage()
  }

  And(
    """^(?:I )?enter (.+) on the presentation 'What is the authorisation number for the location of goods\?' page$"""
  ) { (answer: String) =>
    PresentationNotificationLocationOfGoodsAuthorisationNumberPage
      .loadPage()
      .fillInput(answer)
      .submitPage()
  }

  And(
    """^(?:I )?choose radio option (.*) on the presentation 'Do you want to add a contact for the location of goods\?' page$"""
  ) { (answer: String) =>
    PresentationNotificationLocationOfGoodsAddContactPage
      .loadPage()
      .select(answer)
      .submitPage()
  }

  And("""^(?:I )?enter (.+) on the presentation 'Who is the contact for the location of goods\?' page$""") {
    (answer: String) =>
      PresentationNotificationLocationOfGoodsContactPage
        .loadPage()
        .fillInput(answer)
        .submitPage()
  }

  And(
    """^(?:I )?enter (.+) on the presentation 'What is the phone number for the location of goods’ contact\?' page$"""
  ) { (answer: String) =>
    PresentationNotificationLocationOfGoodsContactTelephoneNumberPage
      .loadPage()
      .fillInput(answer)
      .submitPage()
  }

  And(
    """^(?:I )?choose radio option (.*) on the presentation 'Do you want to add an additional identifier for the location of goods\?' page$"""
  ) { (answer: String) =>
    PresentationNotificationLocationOfGoodsAddIdentificationPage
      .loadPage()
      .select(answer)
      .submitPage()
  }

  And(
    """^(?:I )?enter (.+) on the presentation 'What is the additional identifier for the location of goods\?' page$"""
  ) { (answer: String) =>
    PresentationNotificationLocationOfGoodsAdditionalIdentifierPage
      .loadPage()
      .fillInput(answer)
      .submitPage()
  }

  And(
    """^(?:I )?choose radio option (.*) on the presentation 'Do you want to add a UN LOCODE for the place of loading\?' page$"""
  ) { (answer: String) =>
    PresentationNotificationPlaceOfLoadingAddUnLocodePage
      .loadPage()
      .select(answer)
      .submitPage()
  }

  And("""^(?:I )?enter (.+) on the presentation 'What is the UN LOCODE for the place of loading\?' page$""") {
    (answer: String) =>
      PresentationNotificationPlaceOfLoadingUnLocodePage
        .loadPage()
        .fillInput(answer)
        .submitPage()
  }

  And(
    """^(?:I )?choose radio option (.*) on the presentation 'Do you want to add extra information for the place of loading\?' page$"""
  ) { (answer: String) =>
    PresentationNotificationPlaceOfLoadingAddExtraInformationPage
      .loadPage()
      .select(answer)
      .submitPage()
  }

  And("""^(?:I )?select (.+) on the presentation 'In which country is the place of loading\?' page$""") {
    (answer: String) =>
      PresentationNotificationPlaceOfLoadingCountryPage
        .loadPage()
        .select(answer)
        .submitPage()
  }

  And("""^(?:I )?enter (.+) on the presentation 'Where in (.*) is the place of loading\?' page$""") {
    (answer: String, countryInTitle: String) =>
      PresentationNotificationPlaceOfLoadingLocationPage
        .loadPage(countryInTitle)
        .fillInput(answer)
        .submitPage()
  };

  And("""^(?:I )?enter the date on the presentation 'When do you expect the transit to arrive in (.*)\?' page$""") {
    (officeOfDestination: String) =>
      PresentationNotificationLimitDatePage
        .loadPage(officeOfDestination)
        .fillInputs()
        .submitPage()
  }

  And(
    """^(?:I )?choose radio option (.*) on the presentation 'Are you using any shipping containers to transport the goods\?' page$"""
  ) { (answer: String) =>
    PresentationNotificationContainersPage
      .loadPage()
      .select(answer)
      .submitPage()
  }

  And("""^(?:I )?choose radio (.*) on the presentation 'How is the transit crossing the border\?' page$""") {
    (answer: String) =>
      PresentationNotificationBorderMeansOfTransportTransitCrossingAtBorderPage
        .loadPage()
        .select(answer)
        .submitPage()
  }

  And(
    """^(?:I )?choose radio (.*) on the presentation inland mode 'Which identification do you want to use for this vehicle\?' page$"""
  ) { (answer: String) =>
    PresentationNotificationActiveMeansOfBorderTransportIdentificationPage
      .loadPage()
      .select(answer)
      .submitPage()
  }

  And("""^(?:I )?enter identification number (.+) on 'What is the identification number for this\?' page$""") {
    (answer: String) =>
      PresentationNotificationActiveMeansOfBorderTransportIdentificationNumberPage
        .loadPage()
        .fillInput(answer)
        .submitPage()
  }

  And("""^(?:I )?select (.+) on the active border mode 'What country is this vehicle registered to\?' page$""") {
    (answer: String) =>
      PresentationNotificationActiveMeansOfBorderTransportCountryPage
        .loadPage()
        .select(answer)
        .submitPage()
  }

  And("""^(?:I )?select (.+) on 'Where is the customs office at the border\?' page$""") { (answer: String) =>
    PresentationNotificationActiveBorderMeansOfTransportOfficeOfTransitPage
      .loadPage()
      .select(answer)
      .submitPage()
  }

  And("""^(?:I )?choose radio (.*) on the presentation 'Do you want to add a conveyance reference number\?' page$""") {
    (answer: String) =>
      PresentationNotificationActiveMeansOfBorderAddConveyanceReferenceNumberPage
        .loadPage()
        .select(answer)
        .submitPage()
  }

  And("""^(?:I )?enter conveyance reference number (.+) on the 'What is the conveyance reference number\?' page$""") {
    (answer: String) =>
      PresentationNotificationActiveMenasOfBorderConveyanceReferenceNumberPage
        .loadPage()
        .fillInput(answer)
        .submitPage()
  }

  When("""^(?:I )?choose radio (.*) on the presentation 'You have added (.*) border means of transport' page$""") {
    (answer: String, numberOfBorderMeansInTitle: String) =>
      PresentationNotificationActiveMeansOfBorderAddAnotherBorderMeansOfTransportPage
        .loadPage(numberOfBorderMeansInTitle)
        .select(answer)
        .submitPage()
  }

  And("""^(?:I )?click radio (.*) on the 'Are you sure you want to remove border means of transport (.*)\?' page$""") {
    (answer: String, borderMeansOfTransportNumber: String) =>
      PresentationNotificationActiveMeansOfBorderRemoveBorderMeansOfTransportPage
        .loadPage(borderMeansOfTransportNumber)
        .select(answer)
        .submitPage()
  }

  And("""^(?:I )?click the (.*) link  on the 'You have added (.*) border means of transport' page$""") {
    (sectionLink: String, numberOfContainers: String) =>
      PresentationNotificationActiveMeansOfBorderAddAnotherBorderMeansOfTransportPage
        .loadPage(numberOfContainers)
        .clickByPartialLinkText(sectionLink)
  }

  And("""^(?:I )?enter (.+) on the presentation 'What is the container identification number\?' page$""") {
    (answer: String) =>
      PresentationNotificationContainerIdentificationNumberPage
        .loadPage()
        .fillInput(answer)
        .submitPage()
  }

  And("""^(?:I )?choose radio option (.*) on the presentation 'Do you want to add any transport equipment\?' page$""") {
    (answer: String) =>
      PresentationNotificationAddTransportEquipmentPage
        .loadPage()
        .select(answer)
        .submitPage()
  }

  And("""^(?:I )?click radio (.*) on the presentation 'Do you want to add a seal\?' page$""") { (answer: String) =>
    PresentationNotificationAddSealPage
      .loadPage()
      .select(answer)
      .submitPage()
  }

  And("""^(?:I )?enter (.+) on the presentation 'What is the seal identification number\?' page$""") {
    (answer: String) =>
      PresentationNotificationSealIdentificationNumberPage
        .loadPage()
        .fillInput(answer)
        .submitPage()
  }

  When("""^(?:I )?choose radio (.*) on the presentation 'You have added (.*) seal' page$""") {
    (answer: String, numberOfBorderMeansInTitle: String) =>
      PresentationNotificationAddAnotherSealPage
        .loadPage(numberOfBorderMeansInTitle)
        .select(answer)
        .submitPage()
  }

  And("""^(?:I )?click the (.*) link  on the presentation 'You have added (.*) seals' page$""") {
    (sectionLink: String, numberOfContainers: String) =>
      PresentationNotificationAddAnotherSealPage
        .loadPage(numberOfContainers)
        .clickByPartialLinkText(sectionLink)
  }

  And("""^(?:I )?click radio option (.*) on the presentation 'Are you sure you want to remove this seal\?' page$""") {
    (answer: String) =>
      PresentationNotificationRemoveSealPage
        .loadPage()
        .select(answer)
        .submitPage()
  }

  And("""^(?:I )?select (.+) on the presentation 'Which items does this transport equipment apply to\?' page$""") {
    (answer: String) =>
      PresentationNotificationTransportEquipmentPage
        .loadPage()
        .select(answer)
        .submitPage()
  }

  And(
    """^(?:I )?choose radio (.*) on the presentation 'You have applied (.*) items? to transport equipment (.*)' page$"""
  ) {
    (
      answer: String,
      numberOfTransportEquipmentItemsInTitle: String,
      numberOfTransportEquipmentIncrementsInTitle: String
    ) =>
      PresentationNotificationTransportEquipmentIncrementPage
        .loadPage(numberOfTransportEquipmentItemsInTitle, numberOfTransportEquipmentIncrementsInTitle)
        .select(answer)
        .submitPage()
  }

  And("""^(?:I )?click the (.*) link on the 'You have applied (.*) item to transport equipment (.*)' page$""") {
    (
      answer: String,
      numberOfTransportEquipmentItemsInTitle: String,
      numberOfTransportEquipmentIncrementsInTitle: String
    ) =>
      PresentationNotificationTransportEquipmentIncrementPage
        .loadPage(numberOfTransportEquipmentItemsInTitle, numberOfTransportEquipmentIncrementsInTitle)
        .clickByPartialLinkText(answer)
  }

  And("""^(?:I )?click the (.*) link  on the presentation 'You have added (.*) transport equipment' page$""") {
    (sectionLink: String, numberOfTransportEquipment: String) =>
      PresentationNotificationAddAnotherTransportEquipmentPage
        .loadPage(numberOfTransportEquipment)
        .clickByPartialLinkText(sectionLink)
  }

  And(
    """^(?:I )?choose radio option (.*) for the 'Are you sure you want to remove this item from transport equipment (.+)\?' page$"""
  ) { (answer: String, numberOfTransportEquipmentIncrementsInTitle: String) =>
    PresentationNotificationRemoveTransportEquipmentItemPage
      .loadPage(numberOfTransportEquipmentIncrementsInTitle)
      .select(answer)
      .submitPage()
  }

  And("""^(?:I )?choose radio option (.*) on the presentation 'You have added (.*) transport equipment' page$""") {
    (answer: String, numberOfTransportEquipmentIncrementsInTitle: String) =>
      PresentationNotificationAddAnotherTransportEquipmentPage
        .loadPage(numberOfTransportEquipmentIncrementsInTitle)
        .select(answer)
        .submitPage()
  }

  And(
    """^(?:I )?click radio (.*) on the presentation 'Do you want to add a container identification number\?' page$"""
  ) { (answer: String) =>
    PresentationNotificationAddContainerIdentificationNumberPage
      .loadPage()
      .select(answer)
      .submitPage()
  }

  And("""^(?:I )?click the (.*) link on the presentation 'You have added (.*) transport equipment' page$""") {
    (answer: String, numberOfTransportEquipment: String) =>
      PresentationNotificationAddAnotherTransportEquipmentPage
        .loadPage(numberOfTransportEquipment)
        .clickByPartialLinkText(answer)
  }

  And(
    """^(?:I )?click radio option (.*) on the presentation 'Are you sure you want to remove transport equipment (.*)\?' page$"""
  ) { (answer: String, sealIdNumber: String) =>
    PresentationNotificationRemoveTransportEquipmentPage
      .loadPage(sealIdNumber)
      .select(answer)
      .submitPage()
  }

  // Representative
  And(
    """^(?:I )?choose radio option (.*) on the presentation 'Are you acting as a representative\?' page$"""
  ) { (answer: String) =>
    PresentationNotificationActingAsRepresentative
      .loadPage()
      .select(answer)
      .submitPage()
  }

  And("""^(?:I )?enter (.+) on the presentation representative 'What is your EORI number or TIN\?' page$""") {
    (answer: String) =>
      PresentationNotificationAddEORINumberOrTraderIdentificationNumber
        .loadPage()
        .fillInput(answer)
        .submitPage()
  }

  And(
    """^(?:I )?choose radio option (.*) on the presentation representative 'Do you want to add your details\?' page$"""
  ) { (answer: String) =>
    PresentationNotificationAddContactDetailsRepresentativePage
      .loadPage()
      .select(answer)
      .submitPage()
  }

  And("""^(?:I )?enter (.+) on the presentation representative 'What is your name\?' page$""") { (answer: String) =>
    PresentationNotificationAddContactNameRepresentativePage
      .loadPage()
      .fillInput(answer)
      .submitPage()
  }

  And("""^(?:I )?enter (.+) on the presentation representative 'What is your phone number\?' page$""") {
    (answer: String) =>
      PresentationNotificationAddContactPhoneNumberRepresentativePage
        .loadPage()
        .fillInput(answer)
        .submitPage()
  }

  And("""^(?:I )?click the (.*) link on the presentation 'You have added (.*) departure means of transport' page$""") {
    (answer: String, numberOfDepartureMeans: String) =>
      PresentationNotificationAddAnotherDepartureMeansPage
        .loadPage(numberOfDepartureMeans)
        .clickByPartialLinkText(answer)
  }

  And(
    """^(?:I )?choose radio option (.*) on the presentation 'You have added (.*) departure means of transport' page$"""
  ) { (answer: String, numberOfDepartureMeans: String) =>
    PresentationNotificationAddAnotherDepartureMeansPage
      .loadPage(numberOfDepartureMeans)
      .select(answer)
      .submitPage()
  }

  And(
    """^(?:I )?choose radio option (.*) on the presentation departure means of transport 'Which identification do you want to use for the departure means of transport\?' page$"""
  ) { (answer: String) =>
    PresentationNotificationDepartureMeansOfTransportWhichIdentificationPage
      .loadPage()
      .select(answer)
      .submitPage()
  }

  And(
    """^(?:I )?enter registration number (.+) on the presentation 'What is the identification number for the departure means of transport\?' page$"""
  ) { (answer: String) =>
    PresentationNotificationDepartureMeansOfTransportIdentificationNumberPage
      .loadPage()
      .fillInput(answer)
      .submitPage()
  }

  And(
    """^(?:I )?select (.+) on the presentation 'What country is the departure means of transport registered to\?' page$"""
  ) { (answer: String) =>
    PresentationNotificationDepartureMeansOfTransportTransportCountryPage
      .loadPage()
      .select(answer)
      .submitPage()
  }

  And(
    """^(?:I )?choose radio option (.*) on the 'Are you sure you want to remove departure means of transport (.*)\?' page$"""
  ) { (answer: String, numberOfDepartureMeans: String) =>
    PresentationNotificationRemoveDepartureMeansPage
      .loadPage(numberOfDepartureMeans)
      .select(answer)
      .submitPage()
  }

  And("""^(?:I )?click the (.+) link on the Prelodge 'Check your answers' page$""") { (link: String) =>
    ManagedFEPreLodgeCYA
      .loadPage()
      .selectLink(link)
  }

  And("""^(?:I )?click the (.+) link on the 'Information sent' page$""") { (link: String) =>
    PresentationNotificationInformationSentPage
      .loadPage()
      .selectLink(link)
  }

  Then("""^(?:I )?(?:should )?be on the 'Information sent' page$""") { () =>
    PresentationNotificationInformationSentPage
      .loadPage()
  }

  And(
    """^(?:I )?should be on the 'More information needed to complete pre-lodged declaration' page$"""
  ) { () =>
    PresentationNotificationMoreInformationPage
      .loadPage()
  }
}
