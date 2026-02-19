import org.scalatest.matchers.should.Matchers
import org.scalatest.GivenWhenThen
import org.scalatest.featurespec.AnyFeatureSpec



class PresentationNotificationCYAP6Spec extends AnyFeatureSpec with GivenWhenThen {

  Feature("Trader sends in fully completed pre-lodged departure declaration type D (IE015) and reviews their answers in presentation notification service (IE170) via CYA page") {

    Scenario("01 Representative section for a complete Normal pre-lodge departure declaration") {
      Given("I should be on the Presentation Notification Check your answers page")
        // Possible match (best=1.00)
        thenIshouldbeOnThePresentationNotificationCheckYourAnswersPage()

      And("I click the Change link for acting as representative on the Check your answers page")
        // Possible match (best=0.95)
        andIclickTheChangeLinkForOnTheCheckYourAnswersPage("")
        // --- Other possible matches ---
        // andIClickTheChangeLinkForOnTheCheckYourAnswersPage() [0.80] (GetGuaranteeBalanceStepDefSteps.scala) pattern: (?:I )?I click the change link for (.+) on the 'Check your answers' page

      And("I choose radio option Yes on the presentation Are you acting as a representative? page")
        // Possible match (best=0.80)
        andIchooseRadioOptionXOnThePresentationAreYouActingAsARepresentativePage("")
        // --- Other possible matches ---
        // andIchooseRadioOptionXOnTheAreYouActingAsARepresentativePage() [0.80] (TraderDetailsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Are you acting as a representative\?' page

      And("I enter FR123123132 on the presentation representative What is your EORI number or TIN? page")
        // Possible match (best=0.80)
        andIenterOnThePresentationRepresentativeWhatIsYourEORINumberOrTINPage("")
        // --- Other possible matches ---
        // andIenterOnTheRepresentativeWhatIsYourEORINumberOrTINPage() [0.80] (TraderDetailsStepDefSteps.scala) pattern: (?:I )?enter (.+) on the representative 'What is your EORI number or TIN\?' page
        // andIenterOnTheWhatIsTheConsignorsEORINumberOrTINPage() [0.76] (TraderDetailsStepDefSteps.scala) pattern: (?:I )?enter (.+) on the 'What is the consignor’s EORI number or TIN\?' page
        // andIenterOnTheWhatIsTheConsigneesEORINumberOrTINPage() [0.76] (TraderDetailsStepDefSteps.scala) pattern: (?:I )?enter (.+) on the 'What is the consignee’s EORI number or TIN\?' page

      And("I choose radio option Yes on the presentation representative Do you want to add your details? page")
        // Possible match (best=0.81)
        andIchooseRadioOptionXOnThePresentationRepresentativeDoYouWantToAddYourDetailsPage("")
        // --- Other possible matches ---
        // andIchooseRadioOptionXOnTheRepresentativeDoYouWantToAddYourDetailsPage() [0.81] (TraderDetailsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the representative 'Do you want to add your details\?' page
        // andIchooseRadioOptionXOnTheDoYouWantToAddAnAuthorisationPage() [0.76] (TransportAuthorisationsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add an authorisation' page
        // andIchooseRadioOptionXOnTheDoYouWantToAddASealPage() [0.76] (TransportEquipmentChargesStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a seal\?' page
        // andIChooseRadioOptionXOnTheDoYouWantToAddACarrierPage() [0.76] (CarrierDetailsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a carrier\?' page

      And("I enter Marie Rep on the presentation representative What is your name? page")
        // Possible match (best=0.79)
        andIenterOnThePresentationRepresentativeWhatIsYourNamePage("")
        // --- Other possible matches ---
        // andIenterOnTheRepresentativeWhatIsYourNamePage() [0.79] (TraderDetailsStepDefSteps.scala) pattern: (?:I )?enter (.+) on the representative 'What is your name\?' page

      And("I enter +11 1111 1111 on the presentation representative What is your phone number? page")
        // Possible match (best=0.80)
        andIenterOnThePresentationRepresentativeWhatIsYourPhoneNumberPage("")
        // --- Other possible matches ---
        // andIenterOnTheRepresentativeWhatIsYourPhoneNumberPage() [0.79] (TraderDetailsStepDefSteps.scala) pattern: (?:I )?enter (.+) on the representative 'What is your phone number\?' page

      Then("I should be on the Presentation Notification Check your answers page")
        // Possible match (best=1.00)
        thenIshouldbeOnThePresentationNotificationCheckYourAnswersPage()

      And("I submit the Check your answers page")
        // Possible match (best=1.00)
        andIsubmitTheCheckYourAnswersPage()

      Then("I should be on the Information sent page")
        // Possible match (best=1.00)
        thenIshouldbeOnTheInformationSentPage()

    }

    Scenario("02 Departure means of transport section with Mode as other than Mail for a complete Normal pre-lodge departure declaration") {
      Given("I should be on the Presentation Notification Check your answers page")
        // Possible match (best=1.00)
        thenIshouldbeOnThePresentationNotificationCheckYourAnswersPage()

      And("I click the Change link for transport inland mode on the Check your answers page")
        // Possible match (best=0.95)
        andIclickTheChangeLinkForOnTheCheckYourAnswersPage("")
        // --- Other possible matches ---
        // andIClickTheChangeLinkForOnTheCheckYourAnswersPage() [0.80] (GetGuaranteeBalanceStepDefSteps.scala) pattern: (?:I )?I click the change link for (.+) on the 'Check your answers' page

      And("I choose radio option Maritime on the Which inland mode of transport are you using? page")
        // Possible match (best=0.81)
        andIchooseRadioOptionXOnTheWhichInlandModeOfTransportAreYouUsingPage("")

      And("I choose radio option Name of a sea-going vessel on the presentation departure means of transport Which identification do you want to use for the departure means of transport? page")
        // Possible match (best=0.82)
        andIchooseRadioOptionXOnThePresentationDepartureMeansOfTransportWhichIdentificationDoYouWantToUseForTheDepartureMeansOfTransportPage("")
        // --- Other possible matches ---
        // andIchooseRadioOptionXOnTheWhichIdentificationDoYouWantToUseForTheDepartureMeansOfTransportPage() [0.82] (UnloadingStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Which identification do you want to use for the departure means of transport\?' page
        // andIchooseRadioOptionXOnTheWhichIdentificationDoYouWantToUseForTheDepartureMeansOfTransportInHouseConsignmentXPage() [0.79] (UnloadingStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Which identification do you want to use for the departure means of transport in house consignment (.*)\?' page
        // andIchooseRadioOptionXOnTheWhichIdentificationDoYouWantToUseForTheNewDepartureMeansOfTransportPage() [0.79] (UnloadingStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Which identification do you want to use for the new departure means of transport\?' page
        // andIchooseRadioOptionXOnTheDepartureMeansXPage() [0.77] (InlandModeOfTransportStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the departure means '(.*)' page

      And("I enter registration number GB1234567 on the presentation What is the identification number for the departure means of transport? page")
        // Possible match (best=0.82)
        andIenterRegistrationNumberOnThePresentationWhatIsTheIdentificationNumberForTheDepartureMeansOfTransportPage("")
        // --- Other possible matches ---
        // andIenterRegistrationNumberOnTheWhatIsTheIdentificationNumberForThisPage() [0.76] (InlandModeOfTransportStepDefSteps.scala) pattern: (?:I )?enter registration number (.+) on the 'What is the identification number for this\?' page

      And("I select United Kingdom on the presentation What country is the departure means of transport registered to? page")
        // Possible match (best=0.81)
        andIselectOnThePresentationWhatCountryIsTheDepartureMeansOfTransportRegisteredToPage("")
        // --- Other possible matches ---
        // andIselectOnTheWhatCountryIsTheNewDepartureMeansOfTransportRegisteredToPage() [0.77] (UnloadingStepDefSteps.scala) pattern: (?:I )?select (.+) on the 'What country is the new departure means of transport registered to\?' page

      Then("I should be on the Presentation Notification Check your answers page")
        // Possible match (best=1.00)
        thenIshouldbeOnThePresentationNotificationCheckYourAnswersPage()

      And("I submit the Check your answers page")
        // Possible match (best=1.00)
        andIsubmitTheCheckYourAnswersPage()

      Then("I should be on the Information sent page")
        // Possible match (best=1.00)
        thenIshouldbeOnTheInformationSentPage()

    }

    Scenario("03 Inland mode of transport section with mode as Mail for a complete Normal pre-lodge departure declaration") {
      Given("I should be on the Presentation Notification Check your answers page")
        // Possible match (best=1.00)
        thenIshouldbeOnThePresentationNotificationCheckYourAnswersPage()

      And("I click the Change link for transport inland mode on the Check your answers page")
        // Possible match (best=0.95)
        andIclickTheChangeLinkForOnTheCheckYourAnswersPage("")
        // --- Other possible matches ---
        // andIClickTheChangeLinkForOnTheCheckYourAnswersPage() [0.80] (GetGuaranteeBalanceStepDefSteps.scala) pattern: (?:I )?I click the change link for (.+) on the 'Check your answers' page

      And("I choose radio option Mail on the Which inland mode of transport are you using? page")
        // Possible match (best=0.81)
        andIchooseRadioOptionXOnTheWhichInlandModeOfTransportAreYouUsingPage("")

      Then("I should be on the Presentation Notification Check your answers page")
        // Possible match (best=1.00)
        thenIshouldbeOnThePresentationNotificationCheckYourAnswersPage()

      And("I submit the Check your answers page")
        // Possible match (best=1.00)
        andIsubmitTheCheckYourAnswersPage()

      Then("I should be on the Information sent page")
        // Possible match (best=1.00)
        thenIshouldbeOnTheInformationSentPage()

    }

    Scenario("04 Add and Remove a departure transport Means for a complete Normal pre-lodge departure declaration") {
      Given("I should be on the Presentation Notification Check your answers page")
        // Possible match (best=1.00)
        thenIshouldbeOnThePresentationNotificationCheckYourAnswersPage()

      And("I click the Add or remove departure means of transport link on the Prelodge Check your answers page")
        // Possible match (best=0.94)
        andIclickTheLinkOnThePrelodgeCheckYourAnswersPage("")

      And("I choose radio option Yes on the presentation You have added 1 departure means of transport page")
        // Possible match (best=0.92)
        andIchooseRadioOptionXOnThePresentationYouHaveAddedXDepartureMeansOfTransportPage("", "")
        // --- Other possible matches ---
        // andIchooseRadioOptionXOnTheYouHaveAddedXDepartureMeansOfTransportPage() [0.81] (UnloadingStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'You have added (.*) departure means of transport' page
        // andIchooseRadioOptionXOnTheDepartureMeansXPage() [0.77] (InlandModeOfTransportStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the departure means '(.*)' page
        // whenIchooseRadioXOnThePresentationYouHaveAddedXBorderMeansOfTransportPage() [0.77] (PresentationNotificationStepDefSteps.scala) pattern: (?:I )?choose radio (.*) on the presentation 'You have added (.*) border means of transport' page
        // andIchooseRadioOptionXOnThePresentationYouHaveAddedXTransportEquipmentPage() [0.76] (PresentationNotificationStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the presentation 'You have added (.*) transport equipment' page

      And("I choose radio option Registration number of a road vehicle on the presentation departure means of transport Which identification do you want to use for the departure means of transport? page")
        // Possible match (best=0.82)
        andIchooseRadioOptionXOnThePresentationDepartureMeansOfTransportWhichIdentificationDoYouWantToUseForTheDepartureMeansOfTransportPage("")
        // --- Other possible matches ---
        // andIchooseRadioOptionXOnTheWhichIdentificationDoYouWantToUseForTheDepartureMeansOfTransportPage() [0.82] (UnloadingStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Which identification do you want to use for the departure means of transport\?' page
        // andIchooseRadioOptionXOnTheWhichIdentificationDoYouWantToUseForTheNewDepartureMeansOfTransportPage() [0.79] (UnloadingStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Which identification do you want to use for the new departure means of transport\?' page
        // andIchooseRadioOptionXOnTheDepartureMeansXPage() [0.77] (InlandModeOfTransportStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the departure means '(.*)' page
        // andIchooseRadioOptionXOnTheWhichIdentificationDoYouWantToUseForTheDepartureMeansOfTransportInHouseConsignmentXPage() [0.76] (UnloadingStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Which identification do you want to use for the departure means of transport in house consignment (.*)\?' page

      And("I enter registration number NC15REG on the presentation What is the identification number for the departure means of transport? page")
        // Possible match (best=0.82)
        andIenterRegistrationNumberOnThePresentationWhatIsTheIdentificationNumberForTheDepartureMeansOfTransportPage("")
        // --- Other possible matches ---
        // andIenterRegistrationNumberOnTheWhatIsTheIdentificationNumberForThisPage() [0.76] (InlandModeOfTransportStepDefSteps.scala) pattern: (?:I )?enter registration number (.+) on the 'What is the identification number for this\?' page

      And("I select United Kingdom on the presentation What country is the departure means of transport registered to? page")
        // Possible match (best=0.81)
        andIselectOnThePresentationWhatCountryIsTheDepartureMeansOfTransportRegisteredToPage("")
        // --- Other possible matches ---
        // andIselectOnTheWhatCountryIsTheNewDepartureMeansOfTransportRegisteredToPage() [0.77] (UnloadingStepDefSteps.scala) pattern: (?:I )?select (.+) on the 'What country is the new departure means of transport registered to\?' page

      And("I click the Remove link on the presentation You have added 2 departure means of transport page")
        // Possible match (best=0.92)
        andIclickTheXLinkOnThePresentationYouHaveAddedXDepartureMeansOfTransportPage("", "")
        // --- Other possible matches ---
        // andIclickTheXLinkOnThePresentationYouHaveAddedXTransportEquipmentPage() [0.76] (PresentationNotificationStepDefSteps.scala) pattern: (?:I )?click the (.*) link  on the presentation 'You have added (.*) transport equipment' page
        // andIclickTheXLinkOnTheAddPresentationYouHaveAddedXTransportEquipmentPage() [0.76] (PresentationNotificationStepDefSteps.scala) pattern: (?:I )?click the (.*) link on the presentation 'You have added (.*) transport equipment' page

      And("I choose radio option Yes on the Are you sure you want to remove departure means of transport 1? page")
        // Possible match (best=0.93)
        andIchooseRadioOptionXOnTheAreYouSureYouWantToRemoveDepartureMeansOfTransportXPage("", "")
        // --- Other possible matches ---
        // andIchooseRadioOptionXOnTheDocumentsAreYouSureYouWantToRemoveDepartureMeansOfTransportPage() [0.80] (UnloadingStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the documents 'Are you sure you want to remove departure means of transport (.+)\?' page
        // andIchooseRadioOptionXForTheAreYouSureYouWantToRemoveDepartureMeansOfTransportPage() [0.79] (InlandModeOfTransportStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) for the 'Are you sure you want to remove departure means of transport (.+)\?' page
        // andIchooseRadioOptionXOnTheDepartureMeansXPage() [0.77] (InlandModeOfTransportStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the departure means '(.*)' page
        // andIchooseRadioOptionXOnTheDocumentsAreYouSureYouWantToRemoveTransportEquipmentPage() [0.75] (UnloadingStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the documents 'Are you sure you want to remove transport equipment (.+)\?' page

      And("I choose radio option No on the presentation You have added 1 departure means of transport page")
        // Possible match (best=0.92)
        andIchooseRadioOptionXOnThePresentationYouHaveAddedXDepartureMeansOfTransportPage("", "")
        // --- Other possible matches ---
        // andIchooseRadioOptionXOnTheYouHaveAddedXDepartureMeansOfTransportPage() [0.81] (UnloadingStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'You have added (.*) departure means of transport' page
        // andIchooseRadioOptionXOnTheDepartureMeansXPage() [0.77] (InlandModeOfTransportStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the departure means '(.*)' page
        // whenIchooseRadioXOnThePresentationYouHaveAddedXBorderMeansOfTransportPage() [0.77] (PresentationNotificationStepDefSteps.scala) pattern: (?:I )?choose radio (.*) on the presentation 'You have added (.*) border means of transport' page
        // andIchooseRadioOptionXOnThePresentationYouHaveAddedXTransportEquipmentPage() [0.76] (PresentationNotificationStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the presentation 'You have added (.*) transport equipment' page

      And("I submit the Check your answers page")
        // Possible match (best=1.00)
        andIsubmitTheCheckYourAnswersPage()

      Then("I should be on the Information sent page")
        // Possible match (best=1.00)
        thenIshouldbeOnTheInformationSentPage()

    }
  }
}
