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
import uk.gov.hmrc.test.ui.pages.Manage.ManageDepartures.PreLodgeCYA
import uk.gov.hmrc.test.ui.pages.PresentationNotification.ActiveMeansOfBorderTransport._
import uk.gov.hmrc.test.ui.pages.PresentationNotification.DepartureMenasOfTransport.{DepartureMeansOfTransportIdentificationNumberPage, DepartureMeansOfTransportTransportCountryPage, DepartureMeansOfTransportWhichIdentificationPage}
import uk.gov.hmrc.test.ui.pages.PresentationNotification.Represntative._
import uk.gov.hmrc.test.ui.pages.PresentationNotification._

class PresentationNotificationStepDef extends BaseStepDef {

  And(
    """^(?:I )?click the Continue button on the presentation 'More information needed to complete pre-lodged declaration' page$"""
  ) { () =>
    MoreInformationPage
      .loadPage()
      .submitPage()
  }

  And(
    """^(?:I )?click the Continue button on the presentation 'Confirmation needed to complete pre-lodged declaration' page$"""
  ) { () =>
    ConfirmationNeededPage
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

  And(
    """^(?:I )?choose radio option (.*) on the presentation 'Are you using any shipping containers to transport the goods\?' page$"""
  ) { (answer: String) =>
    ContainersPage
      .loadPage()
      .select(answer)
      .submitPage()
  }

  And("""^(?:I )?choose radio (.*) on the presentation 'How is the transit crossing the border\?' page$""") {
    (answer: String) =>
      BorderMeansOfTransportTransitCrossingAtBorderPage
        .loadPage()
        .select(answer)
        .submitPage()
  }

  And(
    """^(?:I )?choose radio (.*) on the presentation inland mode 'Which identification do you want to use for this vehicle\?' page$"""
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

  And("""^(?:I )?choose radio (.*) on the presentation 'Do you want to add a conveyance reference number\?' page$""") {
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

  When("""^(?:I )?choose radio (.*) on the presentation 'You have added (.*) border means of transport' page$""") {
    (answer: String, numberOfBorderMeansInTitle: String) =>
      ActiveMeansOfBorderAddAnotherBorderMeansOfTransportPage
        .loadPage(numberOfBorderMeansInTitle)
        .select(answer)
        .submitPage()
  }

  And("""^(?:I )?click radio (.*) on the 'Are you sure you want to remove border means of transport (.*)\?' page$""") {
    (answer: String, borderMeansOfTransportNumber: String) =>
      ActiveMeansOfBorderRemoveBorderMeansOfTransportPage
        .loadPage(borderMeansOfTransportNumber)
        .select(answer)
        .submitPage()
  }

  And("""^(?:I )?click the (.*) link  on the 'You have added (.*) border means of transport' page$""") {
    (sectionLink: String, numberOfContainers: String) =>
      ActiveMeansOfBorderAddAnotherBorderMeansOfTransportPage
        .loadPage(numberOfContainers)
        .clickByPartialLinkText(sectionLink)
  }

  And("""^(?:I )?enter (.+) on the presentation 'What is the container identification number\?' page$""") {
    (answer: String) =>
      ContainerIdentificationNumberPage
        .loadPage()
        .fillInput(answer)
        .submitPage()
  }

  And("""^(?:I )?choose radio option (.*) on the presentation 'Do you want to add any transport equipment\?' page$""") {
    (answer: String) =>
      AddTransportEquipmentPage
        .loadPage()
        .select(answer)
        .submitPage()
  }

  And("""^(?:I )?click radio (.*) on the presentation 'Do you want to add a seal\?' page$""") { (answer: String) =>
    AddSealPage
      .loadPage()
      .select(answer)
      .submitPage()
  }

  And("""^(?:I )?enter (.+) on the presentation 'What is the seal identification number\?' page$""") {
    (answer: String) =>
      SealIdentificationNumberPage
        .loadPage()
        .fillInput(answer)
        .submitPage()
  }

  When("""^(?:I )?choose radio (.*) on the presentation 'You have added (.*) seal' page$""") {
    (answer: String, numberOfBorderMeansInTitle: String) =>
      AddAnotherSealPage
        .loadPage(numberOfBorderMeansInTitle)
        .select(answer)
        .submitPage()
  }

  And("""^(?:I )?click the (.*) link  on the presentation 'You have added (.*) seals' page$""") {
    (sectionLink: String, numberOfContainers: String) =>
      AddAnotherSealPage
        .loadPage(numberOfContainers)
        .clickByPartialLinkText(sectionLink)
  }

  And("""^(?:I )?click radio option (.*) on the presentation 'Are you sure you want to remove this seal\?' page$""") {
    (answer: String) =>
      RemoveSealPage
        .loadPage()
        .select(answer)
        .submitPage()
  }

  And("""^(?:I )?select (.+) on the presentation 'Which items does this transport equipment apply to\?' page$""") {
    (answer: String) =>
      TransportEquipmentPage
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
      TransportEquipmentIncrementPage
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
      TransportEquipmentIncrementPage
        .loadPage(numberOfTransportEquipmentItemsInTitle, numberOfTransportEquipmentIncrementsInTitle)
        .clickByPartialLinkText(answer)
  }

  And("""^(?:I )?click the (.*) link  on the presentation 'You have added (.*) transport equipment' page$""") {
    (sectionLink: String, numberOfTransportEquipment: String) =>
      AddAnotherTransportEquipmentPage
        .loadPage(numberOfTransportEquipment)
        .clickByPartialLinkText(sectionLink)
  }

  And(
    """^(?:I )?choose radio option (.*) for the 'Are you sure you want to remove this item from transport equipment (.+)\?' page$"""
  ) { (answer: String, numberOfTransportEquipmentIncrementsInTitle: String) =>
    RemoveTransportEquipmentItemPage
      .loadPage(numberOfTransportEquipmentIncrementsInTitle)
      .select(answer)
      .submitPage()
  }

  And("""^(?:I )?choose radio option (.*) on the presentation 'You have added (.*) transport equipment' page$""") {
    (answer: String, numberOfTransportEquipmentIncrementsInTitle: String) =>
      AddAnotherTransportEquipmentPage
        .loadPage(numberOfTransportEquipmentIncrementsInTitle)
        .select(answer)
        .submitPage()
  }

  And(
    """^(?:I )?click radio (.*) on the presentation 'Do you want to add a container identification number\?' page$"""
  ) { (answer: String) =>
    AddContainerIdentificationNumberPage
      .loadPage()
      .select(answer)
      .submitPage()
  }

  And("""^(?:I )?click the (.*) link on the presentation 'You have added (.*) transport equipment' page$""") {
    (answer: String, numberOfTransportEquipment: String) =>
      AddAnotherTransportEquipmentPage
        .loadPage(numberOfTransportEquipment)
        .clickByPartialLinkText(answer)
  }

  And(
    """^(?:I )?click radio option (.*) on the presentation 'Are you sure you want to remove transport equipment (.*)\?' page$"""
  ) { (answer: String, sealIdNumber: String) =>
    RemoveTransportEquipmentPage
      .loadPage(sealIdNumber)
      .select(answer)
      .submitPage()
  }

  // Representative
  And(
    """^(?:I )?choose radio option (.*) on the presentation 'Are you acting as a representative\?' page$"""
  ) { (answer: String) =>
    ActingAsRepresentative
      .loadPage()
      .select(answer)
      .submitPage()
  }

  And("""^(?:I )?enter (.+) on the presentation representative 'What is your EORI number or TIN\?' page$""") {
    (answer: String) =>
      AddEORINumberOrTraderIdentificationNumber
        .loadPage()
        .fillInput(answer)
        .submitPage()
  }

  And(
    """^(?:I )?choose radio option (.*) on the presentation representative 'Do you want to add your details\?' page$"""
  ) { (answer: String) =>
    AddContactDetailsRepresentativePage
      .loadPage()
      .select(answer)
      .submitPage()
  }

  And("""^(?:I )?enter (.+) on the presentation representative 'What is your name\?' page$""") { (answer: String) =>
    AddContactNameRepresentativePage
      .loadPage()
      .fillInput(answer)
      .submitPage()
  }

  And("""^(?:I )?enter (.+) on the presentation representative 'What is your phone number\?' page$""") {
    (answer: String) =>
      AddContactPhoneNumberRepresentativePage
        .loadPage()
        .fillInput(answer)
        .submitPage()
  }

  And("""^(?:I )?click the (.*) link on the presentation 'You have added (.*) departure means of transport' page$""") {
    (answer: String, numberOfDepartureMeans: String) =>
      AddAnotherDepartureMeansPage
        .loadPage(numberOfDepartureMeans)
        .clickByPartialLinkText(answer)
  }

  And(
    """^(?:I )?choose radio option (.*) on the presentation 'You have added (.*) departure means of transport' page$"""
  ) { (answer: String, numberOfDepartureMeans: String) =>
    AddAnotherDepartureMeansPage
      .loadPage(numberOfDepartureMeans)
      .select(answer)
      .submitPage()
  }

  And(
    """^(?:I )?choose radio option (.*) on the presentation departure means of transport 'Which identification do you want to use for the departure means of transport\?' page$"""
  ) { (answer: String) =>
    DepartureMeansOfTransportWhichIdentificationPage
      .loadPage()
      .select(answer)
      .submitPage()
  }

  And(
    """^(?:I )?enter registration number (.+) on the presentation 'What is the identification number for the departure means of transport\?' page$"""
  ) { (answer: String) =>
    DepartureMeansOfTransportIdentificationNumberPage
      .loadPage()
      .fillInput(answer)
      .submitPage()
  }

  And(
    """^(?:I )?select (.+) on the presentation 'What country is the departure means of transport registered to\?' page$"""
  ) { (answer: String) =>
    DepartureMeansOfTransportTransportCountryPage
      .loadPage()
      .select(answer)
      .submitPage()
  }

  And(
    """^(?:I )?choose radio option (.*) on the 'Are you sure you want to remove departure means of transport (.*)\?' page$"""
  ) { (answer: String, numberOfDepartureMeans: String) =>
    RemoveDepartureMeansPage
      .loadPage(numberOfDepartureMeans)
      .select(answer)
      .submitPage()
  }

  And("""^(?:I )?click the (.+) link on the Prelodge 'Check your answers' page$""") { (link: String) =>
    PreLodgeCYA
      .loadPage()
      .selectLink(link)
  }

  And("""^(?:I )?click the (.+) link on the 'Information sent' page$""") { (link: String) =>
    InformationSentPage
      .loadPage()
      .selectLink(link)
  }

  Then("""^(?:I )?(?:should )?be on the 'Information sent' page$""") { () =>
    InformationSentPage
      .loadPage()
  }

  And(
    """^(?:I )?should be on the 'More information needed to complete pre-lodged declaration' page$"""
  ) { () =>
    MoreInformationPage
      .loadPage()
  }
}
