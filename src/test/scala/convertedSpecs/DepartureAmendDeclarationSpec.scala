import org.scalatest.matchers.should.Matchers
import org.scalatest.GivenWhenThen
import org.scalatest.featurespec.AnyFeatureSpec


class DepartureAmendDeclarationSpec extends AnyFeatureSpec with GivenWhenThen {

  Feature("End to end journey for amending a departure declaration - Post Transition") {

    Scenario("01 End to end journey for amending a departure declaration before MRN allocation") {
      Given("I login with ID 1234567890")
        // Possible match (best=1.00)
        andILoginWithIDX("1234567890")

      When("I submit an IE015 Departure Declaration")
        // Possible match (best=1.00)
        givenIsubmitAFile("IE015 Departure Declaration")

      Then("I submit an IE056 Rejection With Amendable Errors")
        // Possible match (best=1.00)
        givenIsubmitAFile("IE056 Rejection With Amendable Errors")

      And("the user has submitted departureDeclaration.json for LRN 25GB000246TK0E6WJ1 and EORI number 1234567890")
        // Possible match (best=1.00)
        whenTheUserHasSubmittedFileForLRNAndEORINumber("departureDeclaration.json", "25GB000246TK0E6WJ1", "1234567890")

      And("I refresh the page")
        // Possible match (best=1.00)
        andIrefreshThePage()

      And("I click on the View departure declarations link on the Manage your transit movements page")
        // Possible match (best=0.95)
        givenIclickOnTheLinkOnTheManageYourTransitMovementsPage("")
        // --- Other possible matches ---
        // givenIclickOnTheLinkOnTheDepartureDeclarationsPage() [0.79] (DepartureDeclarationsStepDefSteps.scala) pattern: (?:I )?click on the (.+) link on the 'Departure declarations' page

      And("I click on the Amend declaration link for LRN 25GB000246TK0E6WJ1 on the Departure declarations page")
        // Possible match (best=0.90)
        andIclickOnTheXLinkForLRNXOnTheDepartureDeclarationsPage("", "")
        // --- Other possible matches ---
        // givenIclickOnTheLinkOnTheDepartureDeclarationsPage() [0.79] (DepartureDeclarationsStepDefSteps.scala) pattern: (?:I )?click on the (.+) link on the 'Departure declarations' page

      And("I click on the Amend errors button on the Amend declaration errors page")
        // Possible match (best=1.00)
        givenIclickOnTheAmendErrorsButtonOnTheAmendDeclarationErrorsPage()

      And("I should see Error status for trader details on the Declaration summary page")
        // Possible match (best=0.88)
        andIshouldSeeXStatusForOnTheDeclarationSummaryPage("", "")

      And("I should see Error status for route details on the Declaration summary page")
        // Possible match (best=0.88)
        andIshouldSeeXStatusForOnTheDeclarationSummaryPage("", "")

      And("I should see Error status for transport details on the Declaration summary page")
        // Possible match (best=0.88)
        andIshouldSeeXStatusForOnTheDeclarationSummaryPage("", "")

      And("I should see Error status for documents on the Declaration summary page")
        // Possible match (best=0.88)
        andIshouldSeeXStatusForOnTheDeclarationSummaryPage("", "")

      And("I should see Error status for items on the Declaration summary page")
        // Possible match (best=0.88)
        andIshouldSeeXStatusForOnTheDeclarationSummaryPage("", "")

      And("I should see Error status for guarantee details on the Declaration summary page")
        // Possible match (best=0.88)
        andIshouldSeeXStatusForOnTheDeclarationSummaryPage("", "")

      And("I click on the Amend trader details link on the Declaration summary page")
        // Possible match (best=0.94)
        thenIclickOnTheLinkOnTheDeclarationSummaryPage("")
        // --- Other possible matches ---
        // thenIclickTheLinkOnTheDeclarationSummaryPage() [0.78] (TaskListStepDefSteps.scala) pattern: (?:I )?click the (.+) link on the 'Declaration summary' page

      And("I click the Change link for Do you want to add a contact? on the Trader details Check your answers page")
        // Possible match (best=0.80)
        andIclickTheChangeLinkForOnTheCheckYourAnswersPage("")

      And("I choose radio option No on the Do you want to add a contact for the transit holder? page")
        // Possible match (best=0.81)
        andIchooseRadioOptionXOnTheDoYouWantToAddAContactForTheTransitHolderPage("")
        // --- Other possible matches ---
        // andIchooseRadioOptionXOnTheDoYouWantToAddAContactForTheConsignorPage() [0.77] (TraderDetailsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a contact for the consignor\?' page
        // andIchooseRadioOptionXOnThEDoYouWantToAddAContactForTheCarrierPage() [0.77] (CarrierDetailsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a contact for the carrier\?' page
        // andIchooseRadioOptionXOnTheDoYouWantToAddAnAuthorisationPage() [0.76] (TransportAuthorisationsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add an authorisation' page
        // andIchooseRadioOptionXOnTheDoYouWantToAddASealPage() [0.76] (TransportEquipmentChargesStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a seal\?' page
        // andIChooseRadioOptionXOnTheDoYouWantToAddACarrierPage() [0.76] (CarrierDetailsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a carrier\?' page

      And("I submit on the Check your answers section Trader details page")
        // Possible match (best=1.00)
        andIsubmitOnTheCheckYourAnswersSectionXPage("Trader details")

      And("I should see Amended status for trader details on the Declaration summary page")
        // Possible match (best=0.88)
        andIshouldSeeXStatusForOnTheDeclarationSummaryPage("", "")

      And("I click on the Amend route details link on the Declaration summary page")
        // Possible match (best=0.94)
        thenIclickOnTheLinkOnTheDeclarationSummaryPage("")
        // --- Other possible matches ---
        // thenIclickTheLinkOnTheDeclarationSummaryPage() [0.78] (TaskListStepDefSteps.scala) pattern: (?:I )?click the (.+) link on the 'Declaration summary' page

      And("I click the Change link for Do you want to add a contact for the location of goods? on the Route details Check your answers page")
        // Possible match (best=0.80)
        andIclickTheChangeLinkForOnTheCheckYourAnswersPage("")

      And("I choose radio option No on the Do you want to add a contact for the location of goods? page")
        // Possible match (best=0.82)
        andIchooseRadioOptionXOnTheDoYouWantToAddAContactForTheLocationOfGoodsPage("")
        // --- Other possible matches ---
        // andIchooseRadioOptionXOnTheDoYouWantToAddALocationOfGoodsPage() [0.81] (RouteDetailsLocationOfGoodsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a location of goods\?' page
        // andIchooseRadioOptionXOnThePresentationDoYouWantToAddAContactForTheLocationOfGoodsPage() [0.78] (PresentationNotificationStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the presentation 'Do you want to add a contact for the location of goods\?' page
        // andIchooseRadioOptionXOnTheDoYouWantToAddAContactForTheConsignorPage() [0.77] (TraderDetailsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a contact for the consignor\?' page
        // andIchooseRadioOptionXOnThEDoYouWantToAddAContactForTheCarrierPage() [0.77] (CarrierDetailsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a contact for the carrier\?' page
        // andIchooseRadioOptionXOnTheDoYouWantToAddAnAuthorisationPage() [0.76] (TransportAuthorisationsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add an authorisation' page
        // andIchooseRadioOptionXOnTheDoYouWantToAddASealPage() [0.76] (TransportEquipmentChargesStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a seal\?' page
        // andIChooseRadioOptionXOnTheDoYouWantToAddACarrierPage() [0.76] (CarrierDetailsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a carrier\?' page
        // andIchooseRadioOptionXOnTheDoYouWantToAddAnAdditionalIdentifierForTheLocationOfGoodsPage() [0.75] (RouteDetailsLocationOfGoodsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add an additional identifier for the location of goods\?' page
        // andIchooseRadioOptionXOnTheArrivalLocationOfGoodsAddContactPage() [0.75] (LocationOfGoodsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the arrival location of goods add contact page

      And("I submit on the Check your answers section Route details page")
        // Possible match (best=1.00)
        andIsubmitOnTheCheckYourAnswersSectionXPage("Route details")

      And("I should see Amended status for route details on the Declaration summary page")
        // Possible match (best=0.88)
        andIshouldSeeXStatusForOnTheDeclarationSummaryPage("", "")

      And("I click on the Amend transport details link on the Declaration summary page")
        // Possible match (best=0.94)
        thenIclickOnTheLinkOnTheDeclarationSummaryPage("")
        // --- Other possible matches ---
        // thenIclickTheLinkOnTheDeclarationSummaryPage() [0.78] (TaskListStepDefSteps.scala) pattern: (?:I )?click the (.+) link on the 'Declaration summary' page

      And("I click the Change link for Do you want to add a method of payment for transport charges? on the Transport details Check your answers page")
        // Possible match (best=0.80)
        andIclickTheChangeLinkForOnTheCheckYourAnswersPage("")

      And("I choose radio option No on the Do you want to add a method of payment for transport charges? page")
        // Possible match (best=0.82)
        andIchooseRadioOptionXOnTheDoYouWantToAddAMethodOfPaymentForTransportChargesPage("")
        // --- Other possible matches ---
        // andIchooseRadioOptionXOnTheDoYouWantToAddAnAuthorisationPage() [0.76] (TransportAuthorisationsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add an authorisation' page
        // andIchooseRadioOptionXOnTheDoYouWantToAddASealPage() [0.76] (TransportEquipmentChargesStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a seal\?' page
        // andIChooseRadioOptionXOnTheDoYouWantToAddACarrierPage() [0.76] (CarrierDetailsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a carrier\?' page

      And("I submit on the Check your answers section Transport details page")
        // Possible match (best=1.00)
        andIsubmitOnTheCheckYourAnswersSectionXPage("Transport details")

      And("I should see Amended status for transport details on the Declaration summary page")
        // Possible match (best=0.88)
        andIshouldSeeXStatusForOnTheDeclarationSummaryPage("", "")

      And("I click on the Amend documents link on the Declaration summary page")
        // Possible match (best=0.94)
        thenIclickOnTheLinkOnTheDeclarationSummaryPage("")
        // --- Other possible matches ---
        // thenIclickTheLinkOnTheDeclarationSummaryPage() [0.78] (TaskListStepDefSteps.scala) pattern: (?:I )?click the (.+) link on the 'Declaration summary' page

      And("I click the Change link on the You have added 3 documents page")
        // Possible match (best=0.89)
        whenIclickTheXLinkOnTheYouHaveAddedXDocumentsPage("", "")

      And("I click the Change link for Do you want to add any additional information for this document? on the Documents Check your answers page")
        // Possible match (best=0.80)
        andIclickTheChangeLinkForOnTheCheckYourAnswersPage("")

      And("I click radio option No on the Do you want to add any additional information for this document? page")
        // Possible match (best=0.81)
        andIclickRadioOptionXOnTheDoYouWantToAddAnyAdditionalInformationForThisDocumentPage("")
        // --- Other possible matches ---
        // andIclickRadioOptionXOnTheDoYouWantToAddAnyAdditionalInformationForThisItemPage() [0.78] (ItemDetailsStepDefSteps.scala) pattern: (?:I )?click radio option (.*) on the 'Do you want to add any additional information for this item\?' page
        // andIclickRadioOptionXOnTheDoYouWantToAddAnyCommentsForTheAdditionalInformationPage() [0.78] (ItemDetailsStepDefSteps.scala) pattern: (?:I )?click radio option (.*) on the 'Do you want to add any comments for the additional information\?' page
        // andIclickRadioOptionXOnTheDoYouWantToAddAnyDocumentsPage() [0.76] (ItemDetailsStepDefSteps.scala) pattern: (?:I )?click radio option (.*) on the 'Do you want to add any documents\?' page

      And("I submit on the Check your answers section Documents page")
        // Possible match (best=1.00)
        andIsubmitOnTheCheckYourAnswersSectionXPage("Documents")

      And("I choose radio option No on the You have added 3 documents page")
        // Possible match (best=0.89)
        andIchooseRadioOptionXOnTheYouHaveAddedXDocumentsPage("", "")

      And("I should see Amended status for documents on the Declaration summary page")
        // Possible match (best=0.88)
        andIshouldSeeXStatusForOnTheDeclarationSummaryPage("", "")

      And("I click on the Amend items link on the Declaration summary page")
        // Possible match (best=0.94)
        thenIclickOnTheLinkOnTheDeclarationSummaryPage("")
        // --- Other possible matches ---
        // thenIclickTheLinkOnTheDeclarationSummaryPage() [0.78] (TaskListStepDefSteps.scala) pattern: (?:I )?click the (.+) link on the 'Declaration summary' page

      And("I click the Change link on the You have added 1 item page")
        // ⚠️ No step-def match found for: I click the Change link on the You have added 1 item page

      And("I click the Change link for Do you want to add supplementary units? on the Item 1 Check your answers page")
        // Possible match (best=0.80)
        andIclickTheChangeLinkForOnTheCheckYourAnswersPage("")

      And("I click radio option No on the Do you want to add supplementary units? page")
        // Possible match (best=0.80)
        andIclickRadioOptionXOnTheDoYouWantToAddSupplementaryUnitsPage("")

      And("I submit on the Check your answers section Items page")
        // Possible match (best=1.00)
        andIsubmitOnTheCheckYourAnswersSectionXPage("Items")

      And("I click radio option No on the You have added 1 item page")
        // Possible match (best=0.89)
        andIclickRadioOptionXOnTheYouHaveAddedXItemPage("", "")

      And("I should see Amended status for items on the Declaration summary page")
        // Possible match (best=0.88)
        andIshouldSeeXStatusForOnTheDeclarationSummaryPage("", "")

      And("I click on the Amend guarantee details link on the Declaration summary page")
        // Possible match (best=0.94)
        thenIclickOnTheLinkOnTheDeclarationSummaryPage("")
        // --- Other possible matches ---
        // thenIclickTheLinkOnTheDeclarationSummaryPage() [0.78] (TaskListStepDefSteps.scala) pattern: (?:I )?click the (.+) link on the 'Declaration summary' page

      And("I click the Change link on the You have added 4 guarantees page")
        // Possible match (best=0.89)
        andIclickTheXLinkOnTheYouHaveAddedXGuaranteesPage("", "")

      And("I click the Change link for Liability amount on the Guarantee details Check your answers page")
        // Possible match (best=0.80)
        andIclickTheChangeLinkForOnTheCheckYourAnswersPage("")

      And("I enter 999.99 on the How much is the liability in pounds? page")
        // Possible match (best=0.80)
        andIenterOnTheHowMuchIsTheLiabilityInPoundsPage("")

      And("I submit on the Check your answers section Guarantee details page")
        // Possible match (best=1.00)
        andIsubmitOnTheCheckYourAnswersSectionXPage("Guarantee details")

      And("I choose radio option No on the You have added 4 guarantees page")
        // Possible match (best=0.89)
        whenIchooseRadioOptionXOnTheYouHaveAddedXGuaranteesPage("", "")

      And("I should see Amended status for guarantee details on the Declaration summary page")
        // Possible match (best=0.88)
        andIshouldSeeXStatusForOnTheDeclarationSummaryPage("", "")

      And("I click the Confirm and resend button on the Declaration summary page")
        // ⚠️ No step-def match found for: I click the Confirm and resend button on the Declaration summary page

      And("I click the Sign out link on the Departure declaration sent page")
        // Possible match (best=0.94)
        andIclickTheLinkOnTheDepartureDeclarationSentPage("")

    }

    Scenario("02 End to end journey for amending a departure declaration after MRN allocation") {
      Given("I login with ID 1234567890")
        // Possible match (best=1.00)
        andILoginWithIDX("1234567890")

      When("I submit an IE015 Departure Declaration")
        // Possible match (best=1.00)
        givenIsubmitAFile("IE015 Departure Declaration")

      Then("I submit an IE028 MRN Allocated")
        // Possible match (best=1.00)
        givenIsubmitAFile("IE028 MRN Allocated")

      And("I submit an IE056 Rejection With Amendable Errors")
        // Possible match (best=1.00)
        givenIsubmitAFile("IE056 Rejection With Amendable Errors")

      And("the user has submitted departureDeclaration.json for LRN 25GB000246TK0E6WJ1 and EORI number 1234567890")
        // Possible match (best=1.00)
        whenTheUserHasSubmittedFileForLRNAndEORINumber("departureDeclaration.json", "25GB000246TK0E6WJ1", "1234567890")

      And("I refresh the page")
        // Possible match (best=1.00)
        andIrefreshThePage()

      And("I click on the View departure declarations link on the Manage your transit movements page")
        // Possible match (best=0.95)
        givenIclickOnTheLinkOnTheManageYourTransitMovementsPage("")
        // --- Other possible matches ---
        // givenIclickOnTheLinkOnTheDepartureDeclarationsPage() [0.79] (DepartureDeclarationsStepDefSteps.scala) pattern: (?:I )?click on the (.+) link on the 'Departure declarations' page

      And("I click on the Amend declaration link for LRN 25GB000246TK0E6WJ1 on the Departure declarations page")
        // Possible match (best=0.90)
        andIclickOnTheXLinkForLRNXOnTheDepartureDeclarationsPage("", "")
        // --- Other possible matches ---
        // givenIclickOnTheLinkOnTheDepartureDeclarationsPage() [0.79] (DepartureDeclarationsStepDefSteps.scala) pattern: (?:I )?click on the (.+) link on the 'Departure declarations' page

      And("I click on the Amend errors button on the Amend declaration errors page")
        // Possible match (best=1.00)
        givenIclickOnTheAmendErrorsButtonOnTheAmendDeclarationErrorsPage()

      Then("I input a random LRN on the What is the new Local Reference Number? page")
        // ⚠️ No step-def match found for: I input a random LRN on the What is the new Local Reference Number? page

      And("I should see Error status for trader details on the Declaration summary page")
        // Possible match (best=0.88)
        andIshouldSeeXStatusForOnTheDeclarationSummaryPage("", "")

      And("I should see Error status for route details on the Declaration summary page")
        // Possible match (best=0.88)
        andIshouldSeeXStatusForOnTheDeclarationSummaryPage("", "")

      And("I should see Error status for transport details on the Declaration summary page")
        // Possible match (best=0.88)
        andIshouldSeeXStatusForOnTheDeclarationSummaryPage("", "")

      And("I should see Error status for documents on the Declaration summary page")
        // Possible match (best=0.88)
        andIshouldSeeXStatusForOnTheDeclarationSummaryPage("", "")

      And("I should see Error status for items on the Declaration summary page")
        // Possible match (best=0.88)
        andIshouldSeeXStatusForOnTheDeclarationSummaryPage("", "")

      And("I should see Error status for guarantee details on the Declaration summary page")
        // Possible match (best=0.88)
        andIshouldSeeXStatusForOnTheDeclarationSummaryPage("", "")

      And("I click on the Amend trader details link on the Declaration summary page")
        // Possible match (best=0.94)
        thenIclickOnTheLinkOnTheDeclarationSummaryPage("")
        // --- Other possible matches ---
        // thenIclickTheLinkOnTheDeclarationSummaryPage() [0.78] (TaskListStepDefSteps.scala) pattern: (?:I )?click the (.+) link on the 'Declaration summary' page

      And("I click the Change link for Do you want to add a contact? on the Trader details Check your answers page")
        // Possible match (best=0.80)
        andIclickTheChangeLinkForOnTheCheckYourAnswersPage("")

      And("I choose radio option No on the Do you want to add a contact for the transit holder? page")
        // Possible match (best=0.81)
        andIchooseRadioOptionXOnTheDoYouWantToAddAContactForTheTransitHolderPage("")
        // --- Other possible matches ---
        // andIchooseRadioOptionXOnTheDoYouWantToAddAContactForTheConsignorPage() [0.77] (TraderDetailsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a contact for the consignor\?' page
        // andIchooseRadioOptionXOnThEDoYouWantToAddAContactForTheCarrierPage() [0.77] (CarrierDetailsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a contact for the carrier\?' page
        // andIchooseRadioOptionXOnTheDoYouWantToAddAnAuthorisationPage() [0.76] (TransportAuthorisationsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add an authorisation' page
        // andIchooseRadioOptionXOnTheDoYouWantToAddASealPage() [0.76] (TransportEquipmentChargesStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a seal\?' page
        // andIChooseRadioOptionXOnTheDoYouWantToAddACarrierPage() [0.76] (CarrierDetailsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a carrier\?' page

      And("I submit on the Check your answers section Trader details page")
        // Possible match (best=1.00)
        andIsubmitOnTheCheckYourAnswersSectionXPage("Trader details")

      And("I should see Amended status for trader details on the Declaration summary page")
        // Possible match (best=0.88)
        andIshouldSeeXStatusForOnTheDeclarationSummaryPage("", "")

      And("I click on the Amend route details link on the Declaration summary page")
        // Possible match (best=0.94)
        thenIclickOnTheLinkOnTheDeclarationSummaryPage("")
        // --- Other possible matches ---
        // thenIclickTheLinkOnTheDeclarationSummaryPage() [0.78] (TaskListStepDefSteps.scala) pattern: (?:I )?click the (.+) link on the 'Declaration summary' page

      And("I click the Change link for Do you want to add a contact for the location of goods? on the Route details Check your answers page")
        // Possible match (best=0.80)
        andIclickTheChangeLinkForOnTheCheckYourAnswersPage("")

      And("I choose radio option No on the Do you want to add a contact for the location of goods? page")
        // Possible match (best=0.82)
        andIchooseRadioOptionXOnTheDoYouWantToAddAContactForTheLocationOfGoodsPage("")
        // --- Other possible matches ---
        // andIchooseRadioOptionXOnTheDoYouWantToAddALocationOfGoodsPage() [0.81] (RouteDetailsLocationOfGoodsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a location of goods\?' page
        // andIchooseRadioOptionXOnThePresentationDoYouWantToAddAContactForTheLocationOfGoodsPage() [0.78] (PresentationNotificationStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the presentation 'Do you want to add a contact for the location of goods\?' page
        // andIchooseRadioOptionXOnTheDoYouWantToAddAContactForTheConsignorPage() [0.77] (TraderDetailsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a contact for the consignor\?' page
        // andIchooseRadioOptionXOnThEDoYouWantToAddAContactForTheCarrierPage() [0.77] (CarrierDetailsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a contact for the carrier\?' page
        // andIchooseRadioOptionXOnTheDoYouWantToAddAnAuthorisationPage() [0.76] (TransportAuthorisationsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add an authorisation' page
        // andIchooseRadioOptionXOnTheDoYouWantToAddASealPage() [0.76] (TransportEquipmentChargesStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a seal\?' page
        // andIChooseRadioOptionXOnTheDoYouWantToAddACarrierPage() [0.76] (CarrierDetailsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a carrier\?' page
        // andIchooseRadioOptionXOnTheDoYouWantToAddAnAdditionalIdentifierForTheLocationOfGoodsPage() [0.75] (RouteDetailsLocationOfGoodsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add an additional identifier for the location of goods\?' page
        // andIchooseRadioOptionXOnTheArrivalLocationOfGoodsAddContactPage() [0.75] (LocationOfGoodsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the arrival location of goods add contact page

      And("I submit on the Check your answers section Route details page")
        // Possible match (best=1.00)
        andIsubmitOnTheCheckYourAnswersSectionXPage("Route details")

      And("I should see Amended status for route details on the Declaration summary page")
        // Possible match (best=0.88)
        andIshouldSeeXStatusForOnTheDeclarationSummaryPage("", "")

      And("I click on the Amend transport details link on the Declaration summary page")
        // Possible match (best=0.94)
        thenIclickOnTheLinkOnTheDeclarationSummaryPage("")
        // --- Other possible matches ---
        // thenIclickTheLinkOnTheDeclarationSummaryPage() [0.78] (TaskListStepDefSteps.scala) pattern: (?:I )?click the (.+) link on the 'Declaration summary' page

      And("I click the Change link for Do you want to add a method of payment for transport charges? on the Transport details Check your answers page")
        // Possible match (best=0.80)
        andIclickTheChangeLinkForOnTheCheckYourAnswersPage("")

      And("I choose radio option No on the Do you want to add a method of payment for transport charges? page")
        // Possible match (best=0.82)
        andIchooseRadioOptionXOnTheDoYouWantToAddAMethodOfPaymentForTransportChargesPage("")
        // --- Other possible matches ---
        // andIchooseRadioOptionXOnTheDoYouWantToAddAnAuthorisationPage() [0.76] (TransportAuthorisationsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add an authorisation' page
        // andIchooseRadioOptionXOnTheDoYouWantToAddASealPage() [0.76] (TransportEquipmentChargesStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a seal\?' page
        // andIChooseRadioOptionXOnTheDoYouWantToAddACarrierPage() [0.76] (CarrierDetailsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a carrier\?' page

      And("I submit on the Check your answers section Transport details page")
        // Possible match (best=1.00)
        andIsubmitOnTheCheckYourAnswersSectionXPage("Transport details")

      And("I should see Amended status for transport details on the Declaration summary page")
        // Possible match (best=0.88)
        andIshouldSeeXStatusForOnTheDeclarationSummaryPage("", "")

      And("I click on the Amend documents link on the Declaration summary page")
        // Possible match (best=0.94)
        thenIclickOnTheLinkOnTheDeclarationSummaryPage("")
        // --- Other possible matches ---
        // thenIclickTheLinkOnTheDeclarationSummaryPage() [0.78] (TaskListStepDefSteps.scala) pattern: (?:I )?click the (.+) link on the 'Declaration summary' page

      And("I click the Change link on the You have added 3 documents page")
        // Possible match (best=0.89)
        whenIclickTheXLinkOnTheYouHaveAddedXDocumentsPage("", "")

      And("I click the Change link for Do you want to add any additional information for this document? on the Documents Check your answers page")
        // Possible match (best=0.80)
        andIclickTheChangeLinkForOnTheCheckYourAnswersPage("")

      And("I click radio option No on the Do you want to add any additional information for this document? page")
        // Possible match (best=0.81)
        andIclickRadioOptionXOnTheDoYouWantToAddAnyAdditionalInformationForThisDocumentPage("")
        // --- Other possible matches ---
        // andIclickRadioOptionXOnTheDoYouWantToAddAnyAdditionalInformationForThisItemPage() [0.78] (ItemDetailsStepDefSteps.scala) pattern: (?:I )?click radio option (.*) on the 'Do you want to add any additional information for this item\?' page
        // andIclickRadioOptionXOnTheDoYouWantToAddAnyCommentsForTheAdditionalInformationPage() [0.78] (ItemDetailsStepDefSteps.scala) pattern: (?:I )?click radio option (.*) on the 'Do you want to add any comments for the additional information\?' page
        // andIclickRadioOptionXOnTheDoYouWantToAddAnyDocumentsPage() [0.76] (ItemDetailsStepDefSteps.scala) pattern: (?:I )?click radio option (.*) on the 'Do you want to add any documents\?' page

      And("I submit on the Check your answers section Documents page")
        // Possible match (best=1.00)
        andIsubmitOnTheCheckYourAnswersSectionXPage("Documents")

      And("I choose radio option No on the You have added 3 documents page")
        // Possible match (best=0.89)
        andIchooseRadioOptionXOnTheYouHaveAddedXDocumentsPage("", "")

      And("I should see Amended status for documents on the Declaration summary page")
        // Possible match (best=0.88)
        andIshouldSeeXStatusForOnTheDeclarationSummaryPage("", "")

      And("I click on the Amend items link on the Declaration summary page")
        // Possible match (best=0.94)
        thenIclickOnTheLinkOnTheDeclarationSummaryPage("")
        // --- Other possible matches ---
        // thenIclickTheLinkOnTheDeclarationSummaryPage() [0.78] (TaskListStepDefSteps.scala) pattern: (?:I )?click the (.+) link on the 'Declaration summary' page

      And("I click the Change link on the You have added 1 item page")
        // ⚠️ No step-def match found for: I click the Change link on the You have added 1 item page

      And("I click the Change link for Do you want to add supplementary units? on the Item 1 Check your answers page")
        // Possible match (best=0.80)
        andIclickTheChangeLinkForOnTheCheckYourAnswersPage("")

      And("I click radio option No on the Do you want to add supplementary units? page")
        // Possible match (best=0.80)
        andIclickRadioOptionXOnTheDoYouWantToAddSupplementaryUnitsPage("")

      And("I submit on the Check your answers section Items page")
        // Possible match (best=1.00)
        andIsubmitOnTheCheckYourAnswersSectionXPage("Items")

      And("I click radio option No on the You have added 1 item page")
        // Possible match (best=0.89)
        andIclickRadioOptionXOnTheYouHaveAddedXItemPage("", "")

      And("I should see Amended status for items on the Declaration summary page")
        // Possible match (best=0.88)
        andIshouldSeeXStatusForOnTheDeclarationSummaryPage("", "")

      And("I click on the Amend guarantee details link on the Declaration summary page")
        // Possible match (best=0.94)
        thenIclickOnTheLinkOnTheDeclarationSummaryPage("")
        // --- Other possible matches ---
        // thenIclickTheLinkOnTheDeclarationSummaryPage() [0.78] (TaskListStepDefSteps.scala) pattern: (?:I )?click the (.+) link on the 'Declaration summary' page

      And("I click the Change link on the You have added 4 guarantees page")
        // Possible match (best=0.89)
        andIclickTheXLinkOnTheYouHaveAddedXGuaranteesPage("", "")

      And("I click the Change link for Liability amount on the Guarantee details Check your answers page")
        // Possible match (best=0.80)
        andIclickTheChangeLinkForOnTheCheckYourAnswersPage("")

      And("I enter 999.99 on the How much is the liability in pounds? page")
        // Possible match (best=0.80)
        andIenterOnTheHowMuchIsTheLiabilityInPoundsPage("")

      And("I submit on the Check your answers section Guarantee details page")
        // Possible match (best=1.00)
        andIsubmitOnTheCheckYourAnswersSectionXPage("Guarantee details")

      And("I choose radio option No on the You have added 4 guarantees page")
        // Possible match (best=0.89)
        whenIchooseRadioOptionXOnTheYouHaveAddedXGuaranteesPage("", "")

      And("I should see Amended status for guarantee details on the Declaration summary page")
        // Possible match (best=0.88)
        andIshouldSeeXStatusForOnTheDeclarationSummaryPage("", "")

      And("I click the Confirm and resend button on the Declaration summary page")
        // ⚠️ No step-def match found for: I click the Confirm and resend button on the Declaration summary page

      And("I click the Sign out link on the Departure declaration sent page")
        // Possible match (best=0.94)
        andIclickTheLinkOnTheDepartureDeclarationSentPage("")

    }

    Scenario("03 End to end journey for amending a rejected declaration amendment after MRN allocation") {
      Given("I login with ID 1234567890")
        // Possible match (best=1.00)
        andILoginWithIDX("1234567890")

      When("I submit an IE015 Departure Declaration")
        // Possible match (best=1.00)
        givenIsubmitAFile("IE015 Departure Declaration")

      Then("I submit an IE028 MRN Allocated")
        // Possible match (best=1.00)
        givenIsubmitAFile("IE028 MRN Allocated")

      Then("I submit an IE013 Declaration Amendment")
        // Possible match (best=1.00)
        givenIsubmitAFile("IE013 Declaration Amendment")

      And("I submit an IE056 Amendment Rejection With Amendable Errors")
        // Possible match (best=1.00)
        givenIsubmitAFile("IE056 Amendment Rejection With Amendable Errors")

      And("the user has submitted departureDeclaration.json for LRN 25GB000246TK0E6WJ1 and EORI number 1234567890")
        // Possible match (best=1.00)
        whenTheUserHasSubmittedFileForLRNAndEORINumber("departureDeclaration.json", "25GB000246TK0E6WJ1", "1234567890")

      And("I refresh the page")
        // Possible match (best=1.00)
        andIrefreshThePage()

      And("I click on the View departure declarations link on the Manage your transit movements page")
        // Possible match (best=0.95)
        givenIclickOnTheLinkOnTheManageYourTransitMovementsPage("")
        // --- Other possible matches ---
        // givenIclickOnTheLinkOnTheDepartureDeclarationsPage() [0.79] (DepartureDeclarationsStepDefSteps.scala) pattern: (?:I )?click on the (.+) link on the 'Departure declarations' page

      And("I click on the Amend declaration link for LRN 25GB000246TK0E6WJ1 on the Departure declarations page")
        // Possible match (best=0.90)
        andIclickOnTheXLinkForLRNXOnTheDepartureDeclarationsPage("", "")
        // --- Other possible matches ---
        // givenIclickOnTheLinkOnTheDepartureDeclarationsPage() [0.79] (DepartureDeclarationsStepDefSteps.scala) pattern: (?:I )?click on the (.+) link on the 'Departure declarations' page

      And("I click on the Amend errors button on the Amend declaration errors page")
        // Possible match (best=1.00)
        givenIclickOnTheAmendErrorsButtonOnTheAmendDeclarationErrorsPage()

      And("I should see Error status for trader details on the Declaration summary page")
        // Possible match (best=0.88)
        andIshouldSeeXStatusForOnTheDeclarationSummaryPage("", "")

      And("I should see Error status for route details on the Declaration summary page")
        // Possible match (best=0.88)
        andIshouldSeeXStatusForOnTheDeclarationSummaryPage("", "")

      And("I should see Error status for transport details on the Declaration summary page")
        // Possible match (best=0.88)
        andIshouldSeeXStatusForOnTheDeclarationSummaryPage("", "")

      And("I should see Error status for documents on the Declaration summary page")
        // Possible match (best=0.88)
        andIshouldSeeXStatusForOnTheDeclarationSummaryPage("", "")

      And("I should see Error status for items on the Declaration summary page")
        // Possible match (best=0.88)
        andIshouldSeeXStatusForOnTheDeclarationSummaryPage("", "")

      And("I should see Error status for guarantee details on the Declaration summary page")
        // Possible match (best=0.88)
        andIshouldSeeXStatusForOnTheDeclarationSummaryPage("", "")

      And("I click on the Amend trader details link on the Declaration summary page")
        // Possible match (best=0.94)
        thenIclickOnTheLinkOnTheDeclarationSummaryPage("")
        // --- Other possible matches ---
        // thenIclickTheLinkOnTheDeclarationSummaryPage() [0.78] (TaskListStepDefSteps.scala) pattern: (?:I )?click the (.+) link on the 'Declaration summary' page

      And("I click the Change link for Do you want to add a contact for the consignor? on the Trader details Check your answers page")
        // Possible match (best=0.80)
        andIclickTheChangeLinkForOnTheCheckYourAnswersPage("")

      And("I choose radio option No on the Do you want to add a contact for the consignor? page")
        // Possible match (best=0.81)
        andIchooseRadioOptionXOnTheDoYouWantToAddAContactForTheConsignorPage("")
        // --- Other possible matches ---
        // andIchooseRadioOptionXOnThEDoYouWantToAddAContactForTheCarrierPage() [0.77] (CarrierDetailsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a contact for the carrier\?' page
        // andIchooseRadioOptionXOnTheDoYouWantToAddAnAuthorisationPage() [0.76] (TransportAuthorisationsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add an authorisation' page
        // andIchooseRadioOptionXOnTheDoYouWantToAddASealPage() [0.76] (TransportEquipmentChargesStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a seal\?' page
        // andIChooseRadioOptionXOnTheDoYouWantToAddACarrierPage() [0.76] (CarrierDetailsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a carrier\?' page

      And("I submit on the Check your answers section Trader details page")
        // Possible match (best=1.00)
        andIsubmitOnTheCheckYourAnswersSectionXPage("Trader details")

      And("I should see Amended status for trader details on the Declaration summary page")
        // Possible match (best=0.88)
        andIshouldSeeXStatusForOnTheDeclarationSummaryPage("", "")

      And("I click on the Amend route details link on the Declaration summary page")
        // Possible match (best=0.94)
        thenIclickOnTheLinkOnTheDeclarationSummaryPage("")
        // --- Other possible matches ---
        // thenIclickTheLinkOnTheDeclarationSummaryPage() [0.78] (TaskListStepDefSteps.scala) pattern: (?:I )?click the (.+) link on the 'Declaration summary' page

      And("I click the Change link for Do you want to add a contact for the location of goods? on the Route details Check your answers page")
        // Possible match (best=0.80)
        andIclickTheChangeLinkForOnTheCheckYourAnswersPage("")

      And("I choose radio option No on the Do you want to add a contact for the location of goods? page")
        // Possible match (best=0.82)
        andIchooseRadioOptionXOnTheDoYouWantToAddAContactForTheLocationOfGoodsPage("")
        // --- Other possible matches ---
        // andIchooseRadioOptionXOnTheDoYouWantToAddALocationOfGoodsPage() [0.81] (RouteDetailsLocationOfGoodsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a location of goods\?' page
        // andIchooseRadioOptionXOnThePresentationDoYouWantToAddAContactForTheLocationOfGoodsPage() [0.78] (PresentationNotificationStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the presentation 'Do you want to add a contact for the location of goods\?' page
        // andIchooseRadioOptionXOnTheDoYouWantToAddAContactForTheConsignorPage() [0.77] (TraderDetailsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a contact for the consignor\?' page
        // andIchooseRadioOptionXOnThEDoYouWantToAddAContactForTheCarrierPage() [0.77] (CarrierDetailsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a contact for the carrier\?' page
        // andIchooseRadioOptionXOnTheDoYouWantToAddAnAuthorisationPage() [0.76] (TransportAuthorisationsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add an authorisation' page
        // andIchooseRadioOptionXOnTheDoYouWantToAddASealPage() [0.76] (TransportEquipmentChargesStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a seal\?' page
        // andIChooseRadioOptionXOnTheDoYouWantToAddACarrierPage() [0.76] (CarrierDetailsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a carrier\?' page
        // andIchooseRadioOptionXOnTheDoYouWantToAddAnAdditionalIdentifierForTheLocationOfGoodsPage() [0.75] (RouteDetailsLocationOfGoodsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add an additional identifier for the location of goods\?' page
        // andIchooseRadioOptionXOnTheArrivalLocationOfGoodsAddContactPage() [0.75] (LocationOfGoodsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the arrival location of goods add contact page

      And("I submit on the Check your answers section Route details page")
        // Possible match (best=1.00)
        andIsubmitOnTheCheckYourAnswersSectionXPage("Route details")

      And("I should see Amended status for route details on the Declaration summary page")
        // Possible match (best=0.88)
        andIshouldSeeXStatusForOnTheDeclarationSummaryPage("", "")

      And("I click on the Amend transport details link on the Declaration summary page")
        // Possible match (best=0.94)
        thenIclickOnTheLinkOnTheDeclarationSummaryPage("")
        // --- Other possible matches ---
        // thenIclickTheLinkOnTheDeclarationSummaryPage() [0.78] (TaskListStepDefSteps.scala) pattern: (?:I )?click the (.+) link on the 'Declaration summary' page

      And("I click the Change link for Do you want to add a method of payment for transport charges? on the Transport details Check your answers page")
        // Possible match (best=0.80)
        andIclickTheChangeLinkForOnTheCheckYourAnswersPage("")

      And("I choose radio option No on the Do you want to add a method of payment for transport charges? page")
        // Possible match (best=0.82)
        andIchooseRadioOptionXOnTheDoYouWantToAddAMethodOfPaymentForTransportChargesPage("")
        // --- Other possible matches ---
        // andIchooseRadioOptionXOnTheDoYouWantToAddAnAuthorisationPage() [0.76] (TransportAuthorisationsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add an authorisation' page
        // andIchooseRadioOptionXOnTheDoYouWantToAddASealPage() [0.76] (TransportEquipmentChargesStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a seal\?' page
        // andIChooseRadioOptionXOnTheDoYouWantToAddACarrierPage() [0.76] (CarrierDetailsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a carrier\?' page

      And("I submit on the Check your answers section Transport details page")
        // Possible match (best=1.00)
        andIsubmitOnTheCheckYourAnswersSectionXPage("Transport details")

      And("I should see Amended status for transport details on the Declaration summary page")
        // Possible match (best=0.88)
        andIshouldSeeXStatusForOnTheDeclarationSummaryPage("", "")

      And("I click on the Amend documents link on the Declaration summary page")
        // Possible match (best=0.94)
        thenIclickOnTheLinkOnTheDeclarationSummaryPage("")
        // --- Other possible matches ---
        // thenIclickTheLinkOnTheDeclarationSummaryPage() [0.78] (TaskListStepDefSteps.scala) pattern: (?:I )?click the (.+) link on the 'Declaration summary' page

      And("I click the Change link on the You have added 3 documents page")
        // Possible match (best=0.89)
        whenIclickTheXLinkOnTheYouHaveAddedXDocumentsPage("", "")

      And("I click the Change link for Do you want to add any additional information for this document? on the Documents Check your answers page")
        // Possible match (best=0.80)
        andIclickTheChangeLinkForOnTheCheckYourAnswersPage("")

      And("I click radio option No on the Do you want to add any additional information for this document? page")
        // Possible match (best=0.81)
        andIclickRadioOptionXOnTheDoYouWantToAddAnyAdditionalInformationForThisDocumentPage("")
        // --- Other possible matches ---
        // andIclickRadioOptionXOnTheDoYouWantToAddAnyAdditionalInformationForThisItemPage() [0.78] (ItemDetailsStepDefSteps.scala) pattern: (?:I )?click radio option (.*) on the 'Do you want to add any additional information for this item\?' page
        // andIclickRadioOptionXOnTheDoYouWantToAddAnyCommentsForTheAdditionalInformationPage() [0.78] (ItemDetailsStepDefSteps.scala) pattern: (?:I )?click radio option (.*) on the 'Do you want to add any comments for the additional information\?' page
        // andIclickRadioOptionXOnTheDoYouWantToAddAnyDocumentsPage() [0.76] (ItemDetailsStepDefSteps.scala) pattern: (?:I )?click radio option (.*) on the 'Do you want to add any documents\?' page

      And("I submit on the Check your answers section Documents page")
        // Possible match (best=1.00)
        andIsubmitOnTheCheckYourAnswersSectionXPage("Documents")

      And("I choose radio option No on the You have added 3 documents page")
        // Possible match (best=0.89)
        andIchooseRadioOptionXOnTheYouHaveAddedXDocumentsPage("", "")

      And("I should see Amended status for documents on the Declaration summary page")
        // Possible match (best=0.88)
        andIshouldSeeXStatusForOnTheDeclarationSummaryPage("", "")

      And("I click on the Amend items link on the Declaration summary page")
        // Possible match (best=0.94)
        thenIclickOnTheLinkOnTheDeclarationSummaryPage("")
        // --- Other possible matches ---
        // thenIclickTheLinkOnTheDeclarationSummaryPage() [0.78] (TaskListStepDefSteps.scala) pattern: (?:I )?click the (.+) link on the 'Declaration summary' page

      And("I click the Change link on the You have added 1 item page")
        // ⚠️ No step-def match found for: I click the Change link on the You have added 1 item page

      And("I click the Change link for Do you want to add supplementary units? on the Item 1 Check your answers page")
        // Possible match (best=0.80)
        andIclickTheChangeLinkForOnTheCheckYourAnswersPage("")

      And("I click radio option No on the Do you want to add supplementary units? page")
        // Possible match (best=0.80)
        andIclickRadioOptionXOnTheDoYouWantToAddSupplementaryUnitsPage("")

      And("I submit on the Check your answers section Items page")
        // Possible match (best=1.00)
        andIsubmitOnTheCheckYourAnswersSectionXPage("Items")

      And("I click radio option No on the You have added 1 item page")
        // Possible match (best=0.89)
        andIclickRadioOptionXOnTheYouHaveAddedXItemPage("", "")

      And("I should see Amended status for items on the Declaration summary page")
        // Possible match (best=0.88)
        andIshouldSeeXStatusForOnTheDeclarationSummaryPage("", "")

      And("I click on the Amend guarantee details link on the Declaration summary page")
        // Possible match (best=0.94)
        thenIclickOnTheLinkOnTheDeclarationSummaryPage("")
        // --- Other possible matches ---
        // thenIclickTheLinkOnTheDeclarationSummaryPage() [0.78] (TaskListStepDefSteps.scala) pattern: (?:I )?click the (.+) link on the 'Declaration summary' page

      And("I click the Change link on the You have added 4 guarantees page")
        // Possible match (best=0.89)
        andIclickTheXLinkOnTheYouHaveAddedXGuaranteesPage("", "")

      And("I click the Change link for Liability amount on the Guarantee details Check your answers page")
        // Possible match (best=0.80)
        andIclickTheChangeLinkForOnTheCheckYourAnswersPage("")

      And("I enter 999.99 on the How much is the liability in pounds? page")
        // Possible match (best=0.80)
        andIenterOnTheHowMuchIsTheLiabilityInPoundsPage("")

      And("I submit on the Check your answers section Guarantee details page")
        // Possible match (best=1.00)
        andIsubmitOnTheCheckYourAnswersSectionXPage("Guarantee details")

      And("I choose radio option No on the You have added 4 guarantees page")
        // Possible match (best=0.89)
        whenIchooseRadioOptionXOnTheYouHaveAddedXGuaranteesPage("", "")

      And("I should see Amended status for guarantee details on the Declaration summary page")
        // Possible match (best=0.88)
        andIshouldSeeXStatusForOnTheDeclarationSummaryPage("", "")

      And("I click the Confirm and resend button on the Declaration summary page")
        // ⚠️ No step-def match found for: I click the Confirm and resend button on the Declaration summary page

      And("I click the Sign out link on the Departure declaration sent page")
        // Possible match (best=0.94)
        andIclickTheLinkOnTheDepartureDeclarationSentPage("")

    }

    Scenario("04 End to end journey for amending a departure declaration with invalid guarantee") {
      Given("I login with ID 1234567890")
        // Possible match (best=1.00)
        andILoginWithIDX("1234567890")

      When("I submit an IE015 Departure Declaration")
        // Possible match (best=1.00)
        givenIsubmitAFile("IE015 Departure Declaration")

      Then("I submit an IE028 MRN Allocated")
        // Possible match (best=1.00)
        givenIsubmitAFile("IE028 MRN Allocated")

      Then("I submit an IE055 Guarantee Not Valid")
        // Possible match (best=1.00)
        givenIsubmitAFile("IE055 Guarantee Not Valid")

      And("the user has submitted departureDeclaration.json for LRN 25GB000246TK0E6WJ1 and EORI number 1234567890")
        // Possible match (best=1.00)
        whenTheUserHasSubmittedFileForLRNAndEORINumber("departureDeclaration.json", "25GB000246TK0E6WJ1", "1234567890")

      And("I refresh the page")
        // Possible match (best=1.00)
        andIrefreshThePage()

      And("I click on the View departure declarations link on the Manage your transit movements page")
        // Possible match (best=0.95)
        givenIclickOnTheLinkOnTheManageYourTransitMovementsPage("")
        // --- Other possible matches ---
        // givenIclickOnTheLinkOnTheDepartureDeclarationsPage() [0.79] (DepartureDeclarationsStepDefSteps.scala) pattern: (?:I )?click on the (.+) link on the 'Departure declarations' page

      And("I click on the View errors link for LRN 25GB000246TK0E6WJ1 on the Departure declarations page")
        // Possible match (best=0.90)
        andIclickOnTheXLinkForLRNXOnTheDepartureDeclarationsPage("", "")
        // --- Other possible matches ---
        // givenIclickOnTheLinkOnTheDepartureDeclarationsPage() [0.79] (DepartureDeclarationsStepDefSteps.scala) pattern: (?:I )?click on the (.+) link on the 'Departure declarations' page
        // givenIclickOnTheLinkOnTheDeclarationErrorsPage() [0.79] (DepartureDeclarationsStepDefSteps.scala) pattern: (?:I )?click on the (.+) link on the 'Declaration errors' page

      And("I click on the Amend errors button on the Amend guarantee errors page")
        // Possible match (best=1.00)
        givenIclickOnTheAmendErrorsButtonOnTheAmendGuaranteeErrorsPage()

      And("I should see Completed status for trader details on the Declaration summary page")
        // Possible match (best=0.88)
        andIshouldSeeXStatusForOnTheDeclarationSummaryPage("", "")

      And("I should see Completed status for route details on the Declaration summary page")
        // Possible match (best=0.88)
        andIshouldSeeXStatusForOnTheDeclarationSummaryPage("", "")

      And("I should see Completed status for transport details on the Declaration summary page")
        // Possible match (best=0.88)
        andIshouldSeeXStatusForOnTheDeclarationSummaryPage("", "")

      And("I should see Completed status for documents on the Declaration summary page")
        // Possible match (best=0.88)
        andIshouldSeeXStatusForOnTheDeclarationSummaryPage("", "")

      And("I should see Completed status for items on the Declaration summary page")
        // Possible match (best=0.88)
        andIshouldSeeXStatusForOnTheDeclarationSummaryPage("", "")

      And("I should see Error status for guarantee details on the Declaration summary page")
        // Possible match (best=0.88)
        andIshouldSeeXStatusForOnTheDeclarationSummaryPage("", "")

      And("I click on the Amend guarantee details link on the Declaration summary page")
        // Possible match (best=0.94)
        thenIclickOnTheLinkOnTheDeclarationSummaryPage("")
        // --- Other possible matches ---
        // thenIclickTheLinkOnTheDeclarationSummaryPage() [0.78] (TaskListStepDefSteps.scala) pattern: (?:I )?click the (.+) link on the 'Declaration summary' page

      And("I click the Remove link on the You have added 4 guarantees page")
        // Possible match (best=0.89)
        andIclickTheXLinkOnTheYouHaveAddedXGuaranteesPage("", "")

      And("I choose radio option Yes on the Are you sure you want to remove this guarantee? page")
        // Possible match (best=0.81)
        andIchooseRadioOptionXOnTheAreYouSureYouWantToRemoveThisGuaranteePage("")

      And("I choose radio option No on the You have added 3 guarantee page")
        // ⚠️ No step-def match found for: I choose radio option No on the You have added 3 guarantee page

      And("I click the Confirm and resend button on the Declaration summary page")
        // ⚠️ No step-def match found for: I click the Confirm and resend button on the Declaration summary page

      And("I click the Sign out link on the Departure declaration sent page")
        // Possible match (best=0.94)
        andIclickTheLinkOnTheDepartureDeclarationSentPage("")

    }

    Scenario("05 User is unable to continue with an amendment if an IE029 message is received while amending") {
      Given("I login with ID 1234567890")
        // Possible match (best=1.00)
        andILoginWithIDX("1234567890")

      When("I submit an IE015 Departure Declaration")
        // Possible match (best=1.00)
        givenIsubmitAFile("IE015 Departure Declaration")

      Then("I submit an IE028 MRN Allocated")
        // Possible match (best=1.00)
        givenIsubmitAFile("IE028 MRN Allocated")

      And("the user has submitted departureDeclaration.json for LRN 25GB000246TK0E6WJ1 and EORI number 1234567890")
        // Possible match (best=1.00)
        whenTheUserHasSubmittedFileForLRNAndEORINumber("departureDeclaration.json", "25GB000246TK0E6WJ1", "1234567890")

      And("I refresh the page")
        // Possible match (best=1.00)
        andIrefreshThePage()

      And("I click on the View departure declarations link on the Manage your transit movements page")
        // Possible match (best=0.95)
        givenIclickOnTheLinkOnTheManageYourTransitMovementsPage("")
        // --- Other possible matches ---
        // givenIclickOnTheLinkOnTheDepartureDeclarationsPage() [0.79] (DepartureDeclarationsStepDefSteps.scala) pattern: (?:I )?click on the (.+) link on the 'Departure declarations' page

      And("I click on the Amend declaration link for LRN 25GB000246TK0E6WJ1 on the Departure declarations page")
        // Possible match (best=0.90)
        andIclickOnTheXLinkForLRNXOnTheDepartureDeclarationsPage("", "")
        // --- Other possible matches ---
        // givenIclickOnTheLinkOnTheDepartureDeclarationsPage() [0.79] (DepartureDeclarationsStepDefSteps.scala) pattern: (?:I )?click on the (.+) link on the 'Departure declarations' page

      And("I click on the Edit trader details link on the Declaration summary page")
        // Possible match (best=0.94)
        thenIclickOnTheLinkOnTheDeclarationSummaryPage("")
        // --- Other possible matches ---
        // thenIclickTheLinkOnTheDeclarationSummaryPage() [0.78] (TaskListStepDefSteps.scala) pattern: (?:I )?click the (.+) link on the 'Declaration summary' page

      And("I click the Change link for Do you want to add a contact for the consignor? on the Trader details Check your answers page")
        // Possible match (best=0.80)
        andIclickTheChangeLinkForOnTheCheckYourAnswersPage("")

      And("I choose radio option No on the Do you want to add a contact for the consignor? page")
        // Possible match (best=0.81)
        andIchooseRadioOptionXOnTheDoYouWantToAddAContactForTheConsignorPage("")
        // --- Other possible matches ---
        // andIchooseRadioOptionXOnThEDoYouWantToAddAContactForTheCarrierPage() [0.77] (CarrierDetailsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a contact for the carrier\?' page
        // andIchooseRadioOptionXOnTheDoYouWantToAddAnAuthorisationPage() [0.76] (TransportAuthorisationsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add an authorisation' page
        // andIchooseRadioOptionXOnTheDoYouWantToAddASealPage() [0.76] (TransportEquipmentChargesStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a seal\?' page
        // andIChooseRadioOptionXOnTheDoYouWantToAddACarrierPage() [0.76] (CarrierDetailsStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Do you want to add a carrier\?' page

      When("I submit an IE029 Release For Transit")
        // Possible match (best=1.00)
        givenIsubmitAFile("IE029 Release For Transit")

      And("I submit on the Check your answers section Trader details page")
        // Possible match (best=1.00)
        andIsubmitOnTheCheckYourAnswersSectionXPage("Trader details")

      Then("I should be on the For your security we signed you out page")
        // Possible match (best=1.00)
        thenIshouldBeOnTheForYourSecurityWeSignedYouOutPage()

    }
  }
}
