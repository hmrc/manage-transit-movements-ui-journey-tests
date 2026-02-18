import uk.gov.hmrc.test.ui.cucumber.stepdefs.BaseStepDef
import uk.gov.hmrc.test.ui.pages.Manage.ManageDepartures.PreLodgeCYA
import uk.gov.hmrc.test.ui.pages.PresentationNotification.*
import uk.gov.hmrc.test.ui.pages.PresentationNotification.ActiveMeansOfBorderTransport.*
import uk.gov.hmrc.test.ui.pages.PresentationNotification.DepartureMenasOfTransport.{DepartureMeansOfTransportIdentificationNumberPage, DepartureMeansOfTransportTransportCountryPage, DepartureMeansOfTransportWhichIdentificationPage}
import uk.gov.hmrc.test.ui.pages.PresentationNotification.Represntative.*

object PresentationNotificationStepDefSteps {

  // ^(?:I )?click the Continue button on the presentation 'More information needed to complete pre-lodged declaration' page$
  def and(?I)?clickTheContinueButtonOnThePresentation'MoreInformationNeededToCompletePre-lodgedDeclaration'Page(): Unit = {
    MoreInformationPage
          .loadPage()
          .submitPage()
  }

  // ^(?:I )?click the Continue button on the presentation 'Confirmation needed to complete pre-lodged declaration' page$
  def and(?I)?clickTheContinueButtonOnThePresentation'ConfirmationNeededToCompletePre-lodgedDeclaration'Page(): Unit = {
    ConfirmationNeededPage
          .loadPage()
          .submitPage()
  }

  // ^(?:I )?choose radio option (.*) on the presentation 'Which type of location are the goods in\?' page$
  def and(?I)?chooseRadioOptionXOnThePresentation'WhichTypeOfLocationAreTheGoodsIn\?'Page(answer: String): Unit = {
    LocationOfGoodsTypePage
            .loadPage()
            .select(answer)
            .submitPage()
  }

  // ^(?:I )?choose a radio option (.*) on the presentation 'How do you want to identify the location of goods\?' page$
  def and(?I)?chooseARadioOptionXOnThePresentation'HowDoYouWantToIdentifyTheLocationOfGoods\?'Page(answer: String): Unit = {
    LocationOfGoodsIdentificationPage
          .loadPage()
          .select(answer)
          .submitPage()
  }

  // ^(?:I )?select (.+) on the presentation 'In which country is the location of goods\?' page$
  def and(?I)?select(.+)OnThePresentation'InWhichCountryIsTheLocationOfGoods\?'Page(answer: String): Unit = {
    LocationOfGoodsCountryPage
            .loadPage()
            .select(answer)
            .submitPage()
  }

  // ^(?:I )?fill in the address on the presentation 'What is the address for the location of goods\?' page$
  def and(?I)?fillInTheAddressOnThePresentation'WhatIsTheAddressForTheLocationOfGoods\?'Page(): Unit = {
    LocationOfGoodsAddressPage
            .loadPage()
            .fillInputs()
            .submitPage()
  }

  // ^(?:I )?enter (.+) on the presentation 'What is the authorisation number for the location of goods\?' page$
  def and(?I)?enter(.+)OnThePresentation'WhatIsTheAuthorisationNumberForTheLocationOfGoods\?'Page(answer: String): Unit = {
    LocationOfGoodsAuthorisationNumberPage
          .loadPage()
          .fillInput(answer)
          .submitPage()
  }

  // ^(?:I )?choose radio option (.*) on the presentation 'Do you want to add a contact for the location of goods\?' page$
  def and(?I)?chooseRadioOptionXOnThePresentation'DoYouWantToAddAContactForTheLocationOfGoods\?'Page(answer: String): Unit = {
    LocationOfGoodsAddContactPage
          .loadPage()
          .select(answer)
          .submitPage()
  }

  // ^(?:I )?enter (.+) on the presentation 'Who is the contact for the location of goods\?' page$
  def and(?I)?enter(.+)OnThePresentation'WhoIsTheContactForTheLocationOfGoods\?'Page(answer: String): Unit = {
    LocationOfGoodsContactPage
            .loadPage()
            .fillInput(answer)
            .submitPage()
  }

  // ^(?:I )?enter (.+) on the presentation 'What is the phone number for the location of goods’ contact\?' page$
  def and(?I)?enter(.+)OnThePresentation'WhatIsThePhoneNumberForTheLocationOfGoods’Contact\?'Page(answer: String): Unit = {
    LocationOfGoodsContactTelephoneNumberPage
          .loadPage()
          .fillInput(answer)
          .submitPage()
  }

  // ^(?:I )?choose radio option (.*) on the presentation 'Do you want to add an additional identifier for the location of goods\?' page$
  def and(?I)?chooseRadioOptionXOnThePresentation'DoYouWantToAddAnAdditionalIdentifierForTheLocationOfGoods\?'Page(answer: String): Unit = {
    LocationOfGoodsAddIdentificationPage
          .loadPage()
          .select(answer)
          .submitPage()
  }

  // ^(?:I )?enter (.+) on the presentation 'What is the additional identifier for the location of goods\?' page$
  def and(?I)?enter(.+)OnThePresentation'WhatIsTheAdditionalIdentifierForTheLocationOfGoods\?'Page(answer: String): Unit = {
    LocationOfGoodsAdditionalIdentifierPage
          .loadPage()
          .fillInput(answer)
          .submitPage()
  }

  // ^(?:I )?choose radio option (.*) on the presentation 'Do you want to add a UN LOCODE for the place of loading\?' page$
  def and(?I)?chooseRadioOptionXOnThePresentation'DoYouWantToAddAUNLOCODEForThePlaceOfLoading\?'Page(answer: String): Unit = {
    PlaceOfLoadingAddUnLocodePage
          .loadPage()
          .select(answer)
          .submitPage()
  }

  // ^(?:I )?enter (.+) on the presentation 'What is the UN LOCODE for the place of loading\?' page$
  def and(?I)?enter(.+)OnThePresentation'WhatIsTheUNLOCODEForThePlaceOfLoading\?'Page(answer: String): Unit = {
    PlaceOfLoadingUnLocodePage
            .loadPage()
            .fillInput(answer)
            .submitPage()
  }

  // ^(?:I )?choose radio option (.*) on the presentation 'Do you want to add extra information for the place of loading\?' page$
  def and(?I)?chooseRadioOptionXOnThePresentation'DoYouWantToAddExtraInformationForThePlaceOfLoading\?'Page(answer: String): Unit = {
    PlaceOfLoadingAddExtraInformationPage
          .loadPage()
          .select(answer)
          .submitPage()
  }

  // ^(?:I )?select (.+) on the presentation 'In which country is the place of loading\?' page$
  def and(?I)?select(.+)OnThePresentation'InWhichCountryIsThePlaceOfLoading\?'Page(answer: String): Unit = {
    PlaceOfLoadingCountryPage
            .loadPage()
            .select(answer)
            .submitPage()
  }

  // ^(?:I )?enter (.+) on the presentation 'Where in (.*) is the place of loading\?' page$
  def and(?I)?enter(.+)OnThePresentation'WhereInXIsThePlaceOfLoading\?'Page(answer: String, countryInTitle: String): Unit = {
    PlaceOfLoadingLocationPage
            .loadPage(countryInTitle)
            .fillInput(answer)
            .submitPage()
  }

  // ^(?:I )?enter the date on the presentation 'When do you expect the transit to arrive in (.*)\?' page$
  def and(?I)?enterTheDateOnThePresentation'WhenDoYouExpectTheTransitToArriveInX\?'Page(officeOfDestination: String): Unit = {
    LimitDatePage
            .loadPage(officeOfDestination)
            .fillInputs()
            .submitPage()
  }

  // ^(?:I )?choose radio option (.*) on the presentation 'Are you using any shipping containers to transport the goods\?' page$
  def and(?I)?chooseRadioOptionXOnThePresentation'AreYouUsingAnyShippingContainersToTransportTheGoods\?'Page(answer: String): Unit = {
    ContainersPage
          .loadPage()
          .select(answer)
          .submitPage()
  }

  // ^(?:I )?choose radio (.*) on the presentation 'How is the transit crossing the border\?' page$
  def and(?I)?chooseRadioXOnThePresentation'HowIsTheTransitCrossingTheBorder\?'Page(answer: String): Unit = {
    BorderMeansOfTransportTransitCrossingAtBorderPage
            .loadPage()
            .select(answer)
            .submitPage()
  }

  // ^(?:I )?choose radio (.*) on the presentation inland mode 'Which identification do you want to use for this vehicle\?' page$
  def and(?I)?chooseRadioXOnThePresentationInlandMode'WhichIdentificationDoYouWantToUseForThisVehicle\?'Page(answer: String): Unit = {
    ActiveMeansOfBorderTransportIdentificationPage
          .loadPage()
          .select(answer)
          .submitPage()
  }

  // ^(?:I )?enter identification number (.+) on 'What is the identification number for this\?' page$
  def and(?I)?enterIdentificationNumber(.+)On'WhatIsTheIdentificationNumberForThis\?'Page(answer: String): Unit = {
    ActiveMeansOfBorderTransportIdentificationNumberPage
            .loadPage()
            .fillInput(answer)
            .submitPage()
  }

  // ^(?:I )?select (.+) on the active border mode 'What country is this vehicle registered to\?' page$
  def and(?I)?select(.+)OnTheActiveBorderMode'WhatCountryIsThisVehicleRegisteredTo\?'Page(answer: String): Unit = {
    ActiveMeansOfBorderTransportCountryPage
            .loadPage()
            .select(answer)
            .submitPage()
  }

  // ^(?:I )?select (.+) on 'Where is the customs office at the border\?' page$
  def and(?I)?select(.+)On'WhereIsTheCustomsOfficeAtTheBorder\?'Page(answer: String): Unit = {
    ActiveBorderMeansOfTransportOfficeOfTransitPage
          .loadPage()
          .select(answer)
          .submitPage()
  }

  // ^(?:I )?choose radio (.*) on the presentation 'Do you want to add a conveyance reference number\?' page$
  def and(?I)?chooseRadioXOnThePresentation'DoYouWantToAddAConveyanceReferenceNumber\?'Page(answer: String): Unit = {
    ActiveMeansOfBorderAddConveyanceReferenceNumberPage
            .loadPage()
            .select(answer)
            .submitPage()
  }

  // ^(?:I )?enter conveyance reference number (.+) on the 'What is the conveyance reference number\?' page$
  def and(?I)?enterConveyanceReferenceNumber(.+)OnThe'WhatIsTheConveyanceReferenceNumber\?'Page(answer: String): Unit = {
    ActiveMenasOfBorderConveyanceReferenceNumberPage
            .loadPage()
            .fillInput(answer)
            .submitPage()
  }

  // ^(?:I )?choose radio (.*) on the presentation 'You have added (.*) border means of transport' page$
  def when(?I)?chooseRadioXOnThePresentation'YouHaveAddedXBorderMeansOfTransport'Page(answer: String, numberOfBorderMeansInTitle: String): Unit = {
    ActiveMeansOfBorderAddAnotherBorderMeansOfTransportPage
            .loadPage(numberOfBorderMeansInTitle)
            .select(answer)
            .submitPage()
  }

  // ^(?:I )?click radio (.*) on the 'Are you sure you want to remove border means of transport (.*)\?' page$
  def and(?I)?clickRadioXOnThe'AreYouSureYouWantToRemoveBorderMeansOfTransportX\?'Page(answer: String, borderMeansOfTransportNumber: String): Unit = {
    ActiveMeansOfBorderRemoveBorderMeansOfTransportPage
            .loadPage(borderMeansOfTransportNumber)
            .select(answer)
            .submitPage()
  }

  // ^(?:I )?click the (.*) link  on the 'You have added (.*) border means of transport' page$
  def and(?I)?clickTheXLinkOnThe'YouHaveAddedXBorderMeansOfTransport'Page(sectionLink: String, numberOfContainers: String): Unit = {
    ActiveMeansOfBorderAddAnotherBorderMeansOfTransportPage
            .loadPage(numberOfContainers)
            .clickByPartialLinkText(sectionLink)
  }

  // ^(?:I )?enter (.+) on the presentation 'What is the container identification number\?' page$
  def and(?I)?enter(.+)OnThePresentation'WhatIsTheContainerIdentificationNumber\?'Page(answer: String): Unit = {
    ContainerIdentificationNumberPage
            .loadPage()
            .fillInput(answer)
            .submitPage()
  }

  // ^(?:I )?choose radio option (.*) on the presentation 'Do you want to add any transport equipment\?' page$
  def and(?I)?chooseRadioOptionXOnThePresentation'DoYouWantToAddAnyTransportEquipment\?'Page(answer: String): Unit = {
    AddTransportEquipmentPage
            .loadPage()
            .select(answer)
            .submitPage()
  }

  // ^(?:I )?click radio (.*) on the presentation 'Do you want to add a seal\?' page$
  def and(?I)?clickRadioXOnThePresentation'DoYouWantToAddASeal\?'Page(answer: String): Unit = {
    AddSealPage
          .loadPage()
          .select(answer)
          .submitPage()
  }

  // ^(?:I )?enter (.+) on the presentation 'What is the seal identification number\?' page$
  def and(?I)?enter(.+)OnThePresentation'WhatIsTheSealIdentificationNumber\?'Page(answer: String): Unit = {
    SealIdentificationNumberPage
            .loadPage()
            .fillInput(answer)
            .submitPage()
  }

  // ^(?:I )?choose radio (.*) on the presentation 'You have added (.*) seal' page$
  def when(?I)?chooseRadioXOnThePresentation'YouHaveAddedXSeal'Page(answer: String, numberOfBorderMeansInTitle: String): Unit = {
    AddAnotherSealPage
            .loadPage(numberOfBorderMeansInTitle)
            .select(answer)
            .submitPage()
  }

  // ^(?:I )?click the (.*) link  on the presentation 'You have added (.*) seals' page$
  def and(?I)?clickTheXLinkOnThePresentation'YouHaveAddedXSeals'Page(sectionLink: String, numberOfContainers: String): Unit = {
    AddAnotherSealPage
            .loadPage(numberOfContainers)
            .clickByPartialLinkText(sectionLink)
  }

  // ^(?:I )?click radio option (.*) on the presentation 'Are you sure you want to remove this seal\?' page$
  def and(?I)?clickRadioOptionXOnThePresentation'AreYouSureYouWantToRemoveThisSeal\?'Page(answer: String): Unit = {
    RemoveSealPage
            .loadPage()
            .select(answer)
            .submitPage()
  }

  // ^(?:I )?select (.+) on the presentation 'Which items does this transport equipment apply to\?' page$
  def and(?I)?select(.+)OnThePresentation'WhichItemsDoesThisTransportEquipmentApplyTo\?'Page(answer: String): Unit = {
    TransportEquipmentPage
            .loadPage()
            .select(answer)
            .submitPage()
  }

  // ^(?:I )?choose radio (.*) on the presentation 'You have applied (.*) items? to transport equipment (.*)' page$
  def and(?I)?chooseRadioXOnThePresentation'YouHaveAppliedXItems?ToTransportEquipmentX'Page(answer: String,
      numberOfTransportEquipmentItemsInTitle: String,
      numberOfTransportEquipmentIncrementsInTitle: String): Unit = {
    TransportEquipmentIncrementPage
            .loadPage(numberOfTransportEquipmentItemsInTitle, numberOfTransportEquipmentIncrementsInTitle)
            .select(answer)
            .submitPage()
  }

  // ^(?:I )?click the (.*) link on the 'You have applied (.*) item to transport equipment (.*)' page$
  def and(?I)?clickTheXLinkOnThe'YouHaveAppliedXItemToTransportEquipmentX'Page(answer: String,
      numberOfTransportEquipmentItemsInTitle: String,
      numberOfTransportEquipmentIncrementsInTitle: String): Unit = {
    TransportEquipmentIncrementPage
            .loadPage(numberOfTransportEquipmentItemsInTitle, numberOfTransportEquipmentIncrementsInTitle)
            .clickByPartialLinkText(answer)
  }

  // ^(?:I )?click the (.*) link  on the presentation 'You have added (.*) transport equipment' page$
  def and(?I)?clickTheXLinkOnThePresentation'YouHaveAddedXTransportEquipment'Page(sectionLink: String, numberOfTransportEquipment: String): Unit = {
    AddAnotherTransportEquipmentPage
            .loadPage(numberOfTransportEquipment)
            .clickByPartialLinkText(sectionLink)
  }

  // ^(?:I )?choose radio option (.*) for the 'Are you sure you want to remove this item from transport equipment (.+)\?' page$
  def and(?I)?chooseRadioOptionXForThe'AreYouSureYouWantToRemoveThisItemFromTransportEquipment(.+)\?'Page(answer: String, numberOfTransportEquipmentIncrementsInTitle: String): Unit = {
    RemoveTransportEquipmentItemPage
          .loadPage(numberOfTransportEquipmentIncrementsInTitle)
          .select(answer)
          .submitPage()
  }

  // ^(?:I )?choose radio option (.*) on the presentation 'You have added (.*) transport equipment' page$
  def and(?I)?chooseRadioOptionXOnThePresentation'YouHaveAddedXTransportEquipment'Page(answer: String, numberOfTransportEquipmentIncrementsInTitle: String): Unit = {
    AddAnotherTransportEquipmentPage
            .loadPage(numberOfTransportEquipmentIncrementsInTitle)
            .select(answer)
            .submitPage()
  }

  // ^(?:I )?click radio (.*) on the presentation 'Do you want to add a container identification number\?' page$
  def and(?I)?clickRadioXOnThePresentation'DoYouWantToAddAContainerIdentificationNumber\?'Page(answer: String): Unit = {
    AddContainerIdentificationNumberPage
          .loadPage()
          .select(answer)
          .submitPage()
  }

  // ^(?:I )?click the (.*) link on the presentation 'You have added (.*) transport equipment' page$
  def and(?I)?clickTheXLinkOnThePresentation'YouHaveAddedXTransportEquipment'Page(answer: String, numberOfTransportEquipment: String): Unit = {
    AddAnotherTransportEquipmentPage
            .loadPage(numberOfTransportEquipment)
            .clickByPartialLinkText(answer)
  }

  // ^(?:I )?click radio option (.*) on the presentation 'Are you sure you want to remove transport equipment (.*)\?' page$
  def and(?I)?clickRadioOptionXOnThePresentation'AreYouSureYouWantToRemoveTransportEquipmentX\?'Page(answer: String, sealIdNumber: String): Unit = {
    RemoveTransportEquipmentPage
          .loadPage(sealIdNumber)
          .select(answer)
          .submitPage()
  }

  // ^(?:I )?choose radio option (.*) on the presentation 'Are you acting as a representative\?' page$
  def and(?I)?chooseRadioOptionXOnThePresentation'AreYouActingAsARepresentative\?'Page(answer: String): Unit = {
    ActingAsRepresentative
          .loadPage()
          .select(answer)
          .submitPage()
  }

  // ^(?:I )?enter (.+) on the presentation representative 'What is your EORI number or TIN\?' page$
  def and(?I)?enter(.+)OnThePresentationRepresentative'WhatIsYourEORINumberOrTIN\?'Page(answer: String): Unit = {
    AddEORINumberOrTraderIdentificationNumber
            .loadPage()
            .fillInput(answer)
            .submitPage()
  }

  // ^(?:I )?choose radio option (.*) on the presentation representative 'Do you want to add your details\?' page$
  def and(?I)?chooseRadioOptionXOnThePresentationRepresentative'DoYouWantToAddYourDetails\?'Page(answer: String): Unit = {
    AddContactDetailsRepresentativePage
          .loadPage()
          .select(answer)
          .submitPage()
  }

  // ^(?:I )?enter (.+) on the presentation representative 'What is your name\?' page$
  def and(?I)?enter(.+)OnThePresentationRepresentative'WhatIsYourName\?'Page(answer: String): Unit = {
    AddContactNameRepresentativePage
          .loadPage()
          .fillInput(answer)
          .submitPage()
  }

  // ^(?:I )?enter (.+) on the presentation representative 'What is your phone number\?' page$
  def and(?I)?enter(.+)OnThePresentationRepresentative'WhatIsYourPhoneNumber\?'Page(answer: String): Unit = {
    AddContactPhoneNumberRepresentativePage
            .loadPage()
            .fillInput(answer)
            .submitPage()
  }

  // ^(?:I )?click the (.*) link on the presentation 'You have added (.*) departure means of transport' page$
  def and(?I)?clickTheXLinkOnThePresentation'YouHaveAddedXDepartureMeansOfTransport'Page(answer: String, numberOfDepartureMeans: String): Unit = {
    AddAnotherDepartureMeansPage
            .loadPage(numberOfDepartureMeans)
            .clickByPartialLinkText(answer)
  }

  // ^(?:I )?choose radio option (.*) on the presentation 'You have added (.*) departure means of transport' page$
  def and(?I)?chooseRadioOptionXOnThePresentation'YouHaveAddedXDepartureMeansOfTransport'Page(answer: String, numberOfDepartureMeans: String): Unit = {
    AddAnotherDepartureMeansPage
          .loadPage(numberOfDepartureMeans)
          .select(answer)
          .submitPage()
  }

  // ^(?:I )?choose radio option (.*) on the presentation departure means of transport 'Which identification do you want to use for the departure means of transport\?' page$
  def and(?I)?chooseRadioOptionXOnThePresentationDepartureMeansOfTransport'WhichIdentificationDoYouWantToUseForTheDepartureMeansOfTransport\?'Page(answer: String): Unit = {
    DepartureMeansOfTransportWhichIdentificationPage
          .loadPage()
          .select(answer)
          .submitPage()
  }

  // ^(?:I )?enter registration number (.+) on the presentation 'What is the identification number for the departure means of transport\?' page$
  def and(?I)?enterRegistrationNumber(.+)OnThePresentation'WhatIsTheIdentificationNumberForTheDepartureMeansOfTransport\?'Page(answer: String): Unit = {
    DepartureMeansOfTransportIdentificationNumberPage
          .loadPage()
          .fillInput(answer)
          .submitPage()
  }

  // ^(?:I )?select (.+) on the presentation 'What country is the departure means of transport registered to\?' page$
  def and(?I)?select(.+)OnThePresentation'WhatCountryIsTheDepartureMeansOfTransportRegisteredTo\?'Page(answer: String): Unit = {
    DepartureMeansOfTransportTransportCountryPage
          .loadPage()
          .select(answer)
          .submitPage()
  }

  // ^(?:I )?choose radio option (.*) on the 'Are you sure you want to remove departure means of transport (.*)\?' page$
  def and(?I)?chooseRadioOptionXOnThe'AreYouSureYouWantToRemoveDepartureMeansOfTransportX\?'Page(answer: String, numberOfDepartureMeans: String): Unit = {
    RemoveDepartureMeansPage
          .loadPage(numberOfDepartureMeans)
          .select(answer)
          .submitPage()
  }

  // ^(?:I )?click the (.+) link on the Prelodge 'Check your answers' page$
  def and(?I)?clickThe(.+)LinkOnThePrelodge'CheckYourAnswers'Page(link: String): Unit = {
    PreLodgeCYA
          .loadPage()
          .selectLink(link)
  }

  // ^(?:I )?click the (.+) link on the 'Information sent' page$
  def and(?I)?clickThe(.+)LinkOnThe'InformationSent'Page(link: String): Unit = {
    InformationSentPage
          .loadPage()
          .selectLink(link)
  }

  // ^(?:I )?(?:should )?be on the 'Information sent' page$
  def then(?I)?(?should)?beOnThe'InformationSent'Page(): Unit = {
    InformationSentPage
          .loadPage()
  }

  // ^(?:I )?should be on the 'More information needed to complete pre-lodged declaration' page$
  def and(?I)?shouldBeOnThe'MoreInformationNeededToCompletePre-lodgedDeclaration'Page(): Unit = {
    MoreInformationPage
          .loadPage()
  }

}
