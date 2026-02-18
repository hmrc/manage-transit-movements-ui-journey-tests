import uk.gov.hmrc.test.ui.cucumber.stepdefs.BaseStepDef
import uk.gov.hmrc.test.ui.pages.Manage.ManageDepartures.PreLodgeCYA
import uk.gov.hmrc.test.ui.pages.PresentationNotification.*
import uk.gov.hmrc.test.ui.pages.PresentationNotification.ActiveMeansOfBorderTransport.*
import uk.gov.hmrc.test.ui.pages.PresentationNotification.DepartureMenasOfTransport.{DepartureMeansOfTransportIdentificationNumberPage, DepartureMeansOfTransportTransportCountryPage, DepartureMeansOfTransportWhichIdentificationPage}
import uk.gov.hmrc.test.ui.pages.PresentationNotification.Represntative.*

object PresentationNotificationStepDefSteps {

  // ^(?:I )?click the Continue button on the presentation 'More information needed to complete pre-lodged declaration' page$
  def andIclickTheContinueButtonOnThePresentationMoreInformationNeededToCompletePrelodgedDeclarationPage(): Unit = {
    MoreInformationPage
          .loadPage()
          .submitPage()
  }

  // ^(?:I )?click the Continue button on the presentation 'Confirmation needed to complete pre-lodged declaration' page$
  def andIclickTheContinueButtonOnThePresentationConfirmationNeededToCompletePrelodgedDeclarationPage(): Unit = {
    ConfirmationNeededPage
          .loadPage()
          .submitPage()
  }

  // ^(?:I )?choose radio option (.*) on the presentation 'Which type of location are the goods in\?' page$
  def andIchooseRadioOptionXOnThePresentationWhichTypeOfLocationAreTheGoodsInPage(answer: String): Unit = {
    LocationOfGoodsTypePage
            .loadPage()
            .select(answer)
            .submitPage()
  }

  // ^(?:I )?choose a radio option (.*) on the presentation 'How do you want to identify the location of goods\?' page$
  def andIchooseARadioOptionXOnThePresentationHowDoYouWantToIdentifyTheLocationOfGoodsPage(answer: String): Unit = {
    LocationOfGoodsIdentificationPage
          .loadPage()
          .select(answer)
          .submitPage()
  }

  // ^(?:I )?select (.+) on the presentation 'In which country is the location of goods\?' page$
  def andIselectOnThePresentationInWhichCountryIsTheLocationOfGoodsPage(answer: String): Unit = {
    LocationOfGoodsCountryPage
            .loadPage()
            .select(answer)
            .submitPage()
  }

  // ^(?:I )?fill in the address on the presentation 'What is the address for the location of goods\?' page$
  def andIfillInTheAddressOnThePresentationWhatIsTheAddressForTheLocationOfGoodsPage(): Unit = {
    LocationOfGoodsAddressPage
            .loadPage()
            .fillInputs()
            .submitPage()
  }

  // ^(?:I )?enter (.+) on the presentation 'What is the authorisation number for the location of goods\?' page$
  def andIenterOnThePresentationWhatIsTheAuthorisationNumberForTheLocationOfGoodsPage(answer: String): Unit = {
    LocationOfGoodsAuthorisationNumberPage
          .loadPage()
          .fillInput(answer)
          .submitPage()
  }

  // ^(?:I )?choose radio option (.*) on the presentation 'Do you want to add a contact for the location of goods\?' page$
  def andIchooseRadioOptionXOnThePresentationDoYouWantToAddAContactForTheLocationOfGoodsPage(answer: String): Unit = {
    LocationOfGoodsAddContactPage
          .loadPage()
          .select(answer)
          .submitPage()
  }

  // ^(?:I )?enter (.+) on the presentation 'Who is the contact for the location of goods\?' page$
  def andIenterOnThePresentationWhoIsTheContactForTheLocationOfGoodsPage(answer: String): Unit = {
    LocationOfGoodsContactPage
            .loadPage()
            .fillInput(answer)
            .submitPage()
  }

  // ^(?:I )?enter (.+) on the presentation 'What is the phone number for the location of goods’ contact\?' page$
  def andIenterOnThePresentationWhatIsThePhoneNumberForTheLocationOfGoodsContactPage(answer: String): Unit = {
    LocationOfGoodsContactTelephoneNumberPage
          .loadPage()
          .fillInput(answer)
          .submitPage()
  }

  // ^(?:I )?choose radio option (.*) on the presentation 'Do you want to add an additional identifier for the location of goods\?' page$
  def andIchooseRadioOptionXOnThePresentationDoYouWantToAddAnAdditionalIdentifierForTheLocationOfGoodsPage(answer: String): Unit = {
    LocationOfGoodsAddIdentificationPage
          .loadPage()
          .select(answer)
          .submitPage()
  }

  // ^(?:I )?enter (.+) on the presentation 'What is the additional identifier for the location of goods\?' page$
  def andIenterOnThePresentationWhatIsTheAdditionalIdentifierForTheLocationOfGoodsPage(answer: String): Unit = {
    LocationOfGoodsAdditionalIdentifierPage
          .loadPage()
          .fillInput(answer)
          .submitPage()
  }

  // ^(?:I )?choose radio option (.*) on the presentation 'Do you want to add a UN LOCODE for the place of loading\?' page$
  def andIchooseRadioOptionXOnThePresentationDoYouWantToAddAUNLOCODEForThePlaceOfLoadingPage(answer: String): Unit = {
    PlaceOfLoadingAddUnLocodePage
          .loadPage()
          .select(answer)
          .submitPage()
  }

  // ^(?:I )?enter (.+) on the presentation 'What is the UN LOCODE for the place of loading\?' page$
  def andIenterOnThePresentationWhatIsTheUNLOCODEForThePlaceOfLoadingPage(answer: String): Unit = {
    PlaceOfLoadingUnLocodePage
            .loadPage()
            .fillInput(answer)
            .submitPage()
  }

  // ^(?:I )?choose radio option (.*) on the presentation 'Do you want to add extra information for the place of loading\?' page$
  def andIchooseRadioOptionXOnThePresentationDoYouWantToAddExtraInformationForThePlaceOfLoadingPage(answer: String): Unit = {
    PlaceOfLoadingAddExtraInformationPage
          .loadPage()
          .select(answer)
          .submitPage()
  }

  // ^(?:I )?select (.+) on the presentation 'In which country is the place of loading\?' page$
  def andIselectOnThePresentationInWhichCountryIsThePlaceOfLoadingPage(answer: String): Unit = {
    PlaceOfLoadingCountryPage
            .loadPage()
            .select(answer)
            .submitPage()
  }

  // ^(?:I )?enter (.+) on the presentation 'Where in (.*) is the place of loading\?' page$
  def andIenterOnThePresentationWhereInXIsThePlaceOfLoadingPage(answer: String, countryInTitle: String): Unit = {
    PlaceOfLoadingLocationPage
            .loadPage(countryInTitle)
            .fillInput(answer)
            .submitPage()
  }

  // ^(?:I )?enter the date on the presentation 'When do you expect the transit to arrive in (.*)\?' page$
  def andIenterTheDateOnThePresentationWhenDoYouExpectTheTransitToArriveInXPage(officeOfDestination: String): Unit = {
    LimitDatePage
            .loadPage(officeOfDestination)
            .fillInputs()
            .submitPage()
  }

  // ^(?:I )?choose radio option (.*) on the presentation 'Are you using any shipping containers to transport the goods\?' page$
  def andIchooseRadioOptionXOnThePresentationAreYouUsingAnyShippingContainersToTransportTheGoodsPage(answer: String): Unit = {
    ContainersPage
          .loadPage()
          .select(answer)
          .submitPage()
  }

  // ^(?:I )?choose radio (.*) on the presentation 'How is the transit crossing the border\?' page$
  def andIchooseRadioXOnThePresentationHowIsTheTransitCrossingTheBorderPage(answer: String): Unit = {
    BorderMeansOfTransportTransitCrossingAtBorderPage
            .loadPage()
            .select(answer)
            .submitPage()
  }

  // ^(?:I )?choose radio (.*) on the presentation inland mode 'Which identification do you want to use for this vehicle\?' page$
  def andIchooseRadioXOnThePresentationInlandModeWhichIdentificationDoYouWantToUseForThisVehiclePage(answer: String): Unit = {
    ActiveMeansOfBorderTransportIdentificationPage
          .loadPage()
          .select(answer)
          .submitPage()
  }

  // ^(?:I )?enter identification number (.+) on 'What is the identification number for this\?' page$
  def andIenterIdentificationNumberOnWhatIsTheIdentificationNumberForThisPage(answer: String): Unit = {
    ActiveMeansOfBorderTransportIdentificationNumberPage
            .loadPage()
            .fillInput(answer)
            .submitPage()
  }

  // ^(?:I )?select (.+) on the active border mode 'What country is this vehicle registered to\?' page$
  def andIselectOnTheActiveBorderModeWhatCountryIsThisVehicleRegisteredToPage(answer: String): Unit = {
    ActiveMeansOfBorderTransportCountryPage
            .loadPage()
            .select(answer)
            .submitPage()
  }

  // ^(?:I )?select (.+) on 'Where is the customs office at the border\?' page$
  def andIselectOnWhereIsTheCustomsOfficeAtTheBorderPage(answer: String): Unit = {
    ActiveBorderMeansOfTransportOfficeOfTransitPage
          .loadPage()
          .select(answer)
          .submitPage()
  }

  // ^(?:I )?choose radio (.*) on the presentation 'Do you want to add a conveyance reference number\?' page$
  def andIchooseRadioXOnThePresentationDoYouWantToAddAConveyanceReferenceNumberPage(answer: String): Unit = {
    ActiveMeansOfBorderAddConveyanceReferenceNumberPage
            .loadPage()
            .select(answer)
            .submitPage()
  }

  // ^(?:I )?enter conveyance reference number (.+) on the 'What is the conveyance reference number\?' page$
  def andIenterConveyanceReferenceNumberOnTheWhatIsTheConveyanceReferenceNumberPage(answer: String): Unit = {
    ActiveMenasOfBorderConveyanceReferenceNumberPage
            .loadPage()
            .fillInput(answer)
            .submitPage()
  }

  // ^(?:I )?choose radio (.*) on the presentation 'You have added (.*) border means of transport' page$
  def whenIchooseRadioXOnThePresentationYouHaveAddedXBorderMeansOfTransportPage(answer: String, numberOfBorderMeansInTitle: String): Unit = {
    ActiveMeansOfBorderAddAnotherBorderMeansOfTransportPage
            .loadPage(numberOfBorderMeansInTitle)
            .select(answer)
            .submitPage()
  }

  // ^(?:I )?click radio (.*) on the 'Are you sure you want to remove border means of transport (.*)\?' page$
  def andIclickRadioXOnTheAreYouSureYouWantToRemoveBorderMeansOfTransportXPage(answer: String, borderMeansOfTransportNumber: String): Unit = {
    ActiveMeansOfBorderRemoveBorderMeansOfTransportPage
            .loadPage(borderMeansOfTransportNumber)
            .select(answer)
            .submitPage()
  }

  // ^(?:I )?click the (.*) link  on the 'You have added (.*) border means of transport' page$
  def andIclickTheXLinkOnTheYouHaveAddedXBorderMeansOfTransportPage(sectionLink: String, numberOfContainers: String): Unit = {
    ActiveMeansOfBorderAddAnotherBorderMeansOfTransportPage
            .loadPage(numberOfContainers)
            .clickByPartialLinkText(sectionLink)
  }

  // ^(?:I )?enter (.+) on the presentation 'What is the container identification number\?' page$
  def andIenterOnThePresentationWhatIsTheContainerIdentificationNumberPage(answer: String): Unit = {
    ContainerIdentificationNumberPage
            .loadPage()
            .fillInput(answer)
            .submitPage()
  }

  // ^(?:I )?choose radio option (.*) on the presentation 'Do you want to add any transport equipment\?' page$
  def andIchooseRadioOptionXOnThePresentationDoYouWantToAddAnyTransportEquipmentPage(answer: String): Unit = {
    AddTransportEquipmentPage
            .loadPage()
            .select(answer)
            .submitPage()
  }

  // ^(?:I )?click radio (.*) on the presentation 'Do you want to add a seal\?' page$
  def andIclickRadioXOnThePresentationDoYouWantToAddASealPage(answer: String): Unit = {
    AddSealPage
          .loadPage()
          .select(answer)
          .submitPage()
  }

  // ^(?:I )?enter (.+) on the presentation 'What is the seal identification number\?' page$
  def andIenterOnThePresentationWhatIsTheSealIdentificationNumberPage(answer: String): Unit = {
    SealIdentificationNumberPage
            .loadPage()
            .fillInput(answer)
            .submitPage()
  }

  // ^(?:I )?choose radio (.*) on the presentation 'You have added (.*) seal' page$
  def whenIchooseRadioXOnThePresentationYouHaveAddedXSealPage(answer: String, numberOfBorderMeansInTitle: String): Unit = {
    AddAnotherSealPage
            .loadPage(numberOfBorderMeansInTitle)
            .select(answer)
            .submitPage()
  }

  // ^(?:I )?click the (.*) link  on the presentation 'You have added (.*) seals' page$
  def andIclickTheXLinkOnThePresentationYouHaveAddedXSealsPage(sectionLink: String, numberOfContainers: String): Unit = {
    AddAnotherSealPage
            .loadPage(numberOfContainers)
            .clickByPartialLinkText(sectionLink)
  }

  // ^(?:I )?click radio option (.*) on the presentation 'Are you sure you want to remove this seal\?' page$
  def andIclickRadioOptionXOnThePresentationAreYouSureYouWantToRemoveThisSealPage(answer: String): Unit = {
    RemoveSealPage
            .loadPage()
            .select(answer)
            .submitPage()
  }

  // ^(?:I )?select (.+) on the presentation 'Which items does this transport equipment apply to\?' page$
  def andIselectOnThePresentationWhichItemsDoesThisTransportEquipmentApplyToPage(answer: String): Unit = {
    TransportEquipmentPage
            .loadPage()
            .select(answer)
            .submitPage()
  }

  // ^(?:I )?choose radio (.*) on the presentation 'You have applied (.*) items? to transport equipment (.*)' page$
  def andIchooseRadioXOnThePresentationYouHaveAppliedXItemsToTransportEquipmentXPage(answer: String,
      numberOfTransportEquipmentItemsInTitle: String,
      numberOfTransportEquipmentIncrementsInTitle: String): Unit = {
    TransportEquipmentIncrementPage
            .loadPage(numberOfTransportEquipmentItemsInTitle, numberOfTransportEquipmentIncrementsInTitle)
            .select(answer)
            .submitPage()
  }

  // ^(?:I )?click the (.*) link on the 'You have applied (.*) item to transport equipment (.*)' page$
  def andIclickTheXLinkOnTheYouHaveAppliedXItemToTransportEquipmentXPage(answer: String,
      numberOfTransportEquipmentItemsInTitle: String,
      numberOfTransportEquipmentIncrementsInTitle: String): Unit = {
    TransportEquipmentIncrementPage
            .loadPage(numberOfTransportEquipmentItemsInTitle, numberOfTransportEquipmentIncrementsInTitle)
            .clickByPartialLinkText(answer)
  }

  // ^(?:I )?click the (.*) link  on the presentation 'You have added (.*) transport equipment' page$
  def andIclickTheXLinkOnThePresentationYouHaveAddedXTransportEquipmentPage(sectionLink: String, numberOfTransportEquipment: String): Unit = {
    AddAnotherTransportEquipmentPage
            .loadPage(numberOfTransportEquipment)
            .clickByPartialLinkText(sectionLink)
  }

  // ^(?:I )?choose radio option (.*) for the 'Are you sure you want to remove this item from transport equipment (.+)\?' page$
  def andIchooseRadioOptionXForTheAreYouSureYouWantToRemoveThisItemFromTransportEquipmentPage(answer: String, numberOfTransportEquipmentIncrementsInTitle: String): Unit = {
    RemoveTransportEquipmentItemPage
          .loadPage(numberOfTransportEquipmentIncrementsInTitle)
          .select(answer)
          .submitPage()
  }

  // ^(?:I )?choose radio option (.*) on the presentation 'You have added (.*) transport equipment' page$
  def andIchooseRadioOptionXOnThePresentationYouHaveAddedXTransportEquipmentPage(answer: String, numberOfTransportEquipmentIncrementsInTitle: String): Unit = {
    AddAnotherTransportEquipmentPage
            .loadPage(numberOfTransportEquipmentIncrementsInTitle)
            .select(answer)
            .submitPage()
  }

  // ^(?:I )?click radio (.*) on the presentation 'Do you want to add a container identification number\?' page$
  def andIclickRadioXOnThePresentationDoYouWantToAddAContainerIdentificationNumberPage(answer: String): Unit = {
    AddContainerIdentificationNumberPage
          .loadPage()
          .select(answer)
          .submitPage()
  }

  // ^(?:I )?click the (.*) link on the presentation 'You have added (.*) transport equipment' page$
  def andIclickTheXLinkOnTheAddPresentationYouHaveAddedXTransportEquipmentPage(answer: String, numberOfTransportEquipment: String): Unit = {
    AddAnotherTransportEquipmentPage
            .loadPage(numberOfTransportEquipment)
            .clickByPartialLinkText(answer)
  }

  // ^(?:I )?click radio option (.*) on the presentation 'Are you sure you want to remove transport equipment (.*)\?' page$
  def andIclickRadioOptionXOnThePresentationAreYouSureYouWantToRemoveTransportEquipmentXPage(answer: String, sealIdNumber: String): Unit = {
    RemoveTransportEquipmentPage
          .loadPage(sealIdNumber)
          .select(answer)
          .submitPage()
  }

  // ^(?:I )?choose radio option (.*) on the presentation 'Are you acting as a representative\?' page$
  def andIchooseRadioOptionXOnThePresentationAreYouActingAsARepresentativePage(answer: String): Unit = {
    ActingAsRepresentative
          .loadPage()
          .select(answer)
          .submitPage()
  }

  // ^(?:I )?enter (.+) on the presentation representative 'What is your EORI number or TIN\?' page$
  def andIenterOnThePresentationRepresentativeWhatIsYourEORINumberOrTINPage(answer: String): Unit = {
    AddEORINumberOrTraderIdentificationNumber
            .loadPage()
            .fillInput(answer)
            .submitPage()
  }

  // ^(?:I )?choose radio option (.*) on the presentation representative 'Do you want to add your details\?' page$
  def andIchooseRadioOptionXOnThePresentationRepresentativeDoYouWantToAddYourDetailsPage(answer: String): Unit = {
    AddContactDetailsRepresentativePage
          .loadPage()
          .select(answer)
          .submitPage()
  }

  // ^(?:I )?enter (.+) on the presentation representative 'What is your name\?' page$
  def andIenterOnThePresentationRepresentativeWhatIsYourNamePage(answer: String): Unit = {
    AddContactNameRepresentativePage
          .loadPage()
          .fillInput(answer)
          .submitPage()
  }

  // ^(?:I )?enter (.+) on the presentation representative 'What is your phone number\?' page$
  def andIenterOnThePresentationRepresentativeWhatIsYourPhoneNumberPage(answer: String): Unit = {
    AddContactPhoneNumberRepresentativePage
            .loadPage()
            .fillInput(answer)
            .submitPage()
  }

  // ^(?:I )?click the (.*) link on the presentation 'You have added (.*) departure means of transport' page$
  def andIclickTheXLinkOnThePresentationYouHaveAddedXDepartureMeansOfTransportPage(answer: String, numberOfDepartureMeans: String): Unit = {
    AddAnotherDepartureMeansPage
            .loadPage(numberOfDepartureMeans)
            .clickByPartialLinkText(answer)
  }

  // ^(?:I )?choose radio option (.*) on the presentation 'You have added (.*) departure means of transport' page$
  def andIchooseRadioOptionXOnThePresentationYouHaveAddedXDepartureMeansOfTransportPage(answer: String, numberOfDepartureMeans: String): Unit = {
    AddAnotherDepartureMeansPage
          .loadPage(numberOfDepartureMeans)
          .select(answer)
          .submitPage()
  }

  // ^(?:I )?choose radio option (.*) on the presentation departure means of transport 'Which identification do you want to use for the departure means of transport\?' page$
  def andIchooseRadioOptionXOnThePresentationDepartureMeansOfTransportWhichIdentificationDoYouWantToUseForTheDepartureMeansOfTransportPage(answer: String): Unit = {
    DepartureMeansOfTransportWhichIdentificationPage
          .loadPage()
          .select(answer)
          .submitPage()
  }

  // ^(?:I )?enter registration number (.+) on the presentation 'What is the identification number for the departure means of transport\?' page$
  def andIenterRegistrationNumberOnThePresentationWhatIsTheIdentificationNumberForTheDepartureMeansOfTransportPage(answer: String): Unit = {
    DepartureMeansOfTransportIdentificationNumberPage
          .loadPage()
          .fillInput(answer)
          .submitPage()
  }

  // ^(?:I )?select (.+) on the presentation 'What country is the departure means of transport registered to\?' page$
  def andIselectOnThePresentationWhatCountryIsTheDepartureMeansOfTransportRegisteredToPage(answer: String): Unit = {
    DepartureMeansOfTransportTransportCountryPage
          .loadPage()
          .select(answer)
          .submitPage()
  }

  // ^(?:I )?choose radio option (.*) on the 'Are you sure you want to remove departure means of transport (.*)\?' page$
  def andIchooseRadioOptionXOnTheAreYouSureYouWantToRemoveDepartureMeansOfTransportXPage(answer: String, numberOfDepartureMeans: String): Unit = {
    RemoveDepartureMeansPage
          .loadPage(numberOfDepartureMeans)
          .select(answer)
          .submitPage()
  }

  // ^(?:I )?click the (.+) link on the Prelodge 'Check your answers' page$
  def andIclickTheLinkOnThePrelodgeCheckYourAnswersPage(link: String): Unit = {
    PreLodgeCYA
          .loadPage()
          .selectLink(link)
  }

  // ^(?:I )?click the (.+) link on the 'Information sent' page$
  def andIclickTheLinkOnTheInformationSentPage(link: String): Unit = {
    InformationSentPage
          .loadPage()
          .selectLink(link)
  }

  // ^(?:I )?(?:should )?be on the 'Information sent' page$
  def thenIshouldbeOnTheInformationSentPage(): Unit = {
    InformationSentPage
          .loadPage()
  }

  // ^(?:I )?should be on the 'More information needed to complete pre-lodged declaration' page$
  def andIshouldBeOnTheMoreInformationNeededToCompletePrelodgedDeclarationPage(): Unit = {
    MoreInformationPage
          .loadPage()
  }

}
