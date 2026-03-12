/*
 * Copyright 2026 HM Revenue & Customs
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

package specs

/*
 * Copyright 2026 HM Revenue & Customs
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

import specsteps.BorderMeansOfTransportStepDefSteps.*
import specsteps.CYAStepDefSteps.*
import specsteps.CommonStepDefSteps.*
import specsteps.DepartureDeclarationsStepDefSteps.*
import specsteps.ManageStepDefSteps.*
import specsteps.PresentationNotificationStepDefSteps.*
import specsteps.RouteDetailsLocationOfGoodsStepDefSteps.*
import specsteps.UnloadingStepDefSteps.*
import org.scalatest.GivenWhenThen
import specsteps.LoginStepDefSteps.andILoginWithIDX

class PresentationNotificationE2EP6Spec extends BaseSpec with GivenWhenThen {

  Feature("Trader completes a departure declaration that was previously pre-lodged") {

    Scenario(
      "01 Full Simplified e2e journey with security type 1 - answer 'YES' to all optional questions - Add and Remove"
    ) {
      Given("I login with ID 1234567890")
      andILoginWithIDX("1234567890")

      When("I submit an IE015 Simplified Prelodged Departure Declaration")
      givenIsubmitAFile("IE015 Simplified Prelodged Departure Declaration")

      Then("I submit an IE928 Positive Acknowledgment")
      givenIsubmitAFile("IE928 Positive Acknowledgment")

      And("I refresh the page")
      andIrefreshThePage()

      And("I click on the View departure declarations link on the Manage your transit movements page")
      givenIclickOnTheLinkOnTheManageYourTransitMovementsPage("View departure declarations")

      And(
        "I click on the Complete pre lodged declaration link for LRN 25GB000246TK0E6WJ1 on the Departure declarations page"
      )
      andIclickOnTheXLinkForLRNXOnTheDepartureDeclarationsPage("Complete pre lodged declaration", "25GB000246TK0E6WJ1")

      And(
        "I click the Continue button on the presentation More information needed to complete pre-lodged declaration page"
      )
      andIclickTheContinueButtonOnThePresentationMoreInformationNeededToCompletePrelodgedDeclarationPage()

      And("I enter GBDEPE201HZ on the presentation What is the authorisation number for the location of goods? page")
      andIenterOnThePresentationWhatIsTheAuthorisationNumberForTheLocationOfGoodsPage("GBDEPE201HZ")

      And(
        "I choose radio option Yes on the presentation Do you want to add an additional identifier for the location of goods? page"
      )
      andIchooseRadioOptionXOnThePresentationDoYouWantToAddAnAdditionalIdentifierForTheLocationOfGoodsPage("Yes")

      And("I enter x9x9 on the presentation What is the additional identifier for the location of goods? page")
      andIenterOnTheWhatIsTheAdditionalIdentifierForTheLocationOfGoodsPage("x9x9")

      And("I choose radio option Yes on the presentation Do you want to add a contact for the location of goods? page")
      andIchooseRadioOptionXOnThePresentationDoYouWantToAddAContactForTheLocationOfGoodsPage("Yes")

      And("I enter Locator Joe on the presentation Who is the contact for the location of goods? page")
      andIenterOnThePresentationWhoIsTheContactForTheLocationOfGoodsPage("Locator Joe")

      And(
        "I enter +432 1212 1212 on the presentation What is the phone number for the location of goods’ contact? page"
      )
      andIenterOnThePresentationWhatIsThePhoneNumberForTheLocationOfGoodsContactPage("+432 1212 1212")

      And("I choose radio option Yes on the presentation Do you want to add a UN LOCODE for the place of loading? page")
      andIchooseRadioOptionXOnThePresentationDoYouWantToAddAUNLOCODEForThePlaceOfLoadingPage("Yes")

      And("I enter DEAAL on the presentation What is the UN LOCODE for the place of loading? page")
      andIenterOnThePresentationWhatIsTheUNLOCODEForThePlaceOfLoadingPage("DEAAL")

      And(
        "I choose radio option Yes on the presentation Do you want to add extra information for the place of loading? page"
      )
      andIchooseRadioOptionXOnThePresentationDoYouWantToAddExtraInformationForThePlaceOfLoadingPage("Yes")

      And("I select United Kingdom on the presentation In which country is the place of loading? page")
      andIselectOnThePresentationInWhichCountryIsThePlaceOfLoadingPage("United Kingdom")

      And("I enter London on the presentation Where in United Kingdom is the place of loading? page")
      andIenterOnThePresentationWhereInXIsThePlaceOfLoadingPage("London", "United Kingdom")

      And(
        "I enter the date on the presentation When do you expect the transit to arrive in Nancy bureau (FR003000)? page"
      )
      andIenterTheDateOnThePresentationWhenDoYouExpectTheTransitToArriveInXPage("Nancy bureau (FR003000)")

      And(
        "I choose radio option Yes on the presentation Are you using any shipping containers to transport the goods? page"
      )
      andIchooseRadioOptionXOnThePresentationAreYouUsingAnyShippingContainersToTransportTheGoodsPage("Yes")

      And("I choose radio Maritime Transport on the presentation How is the transit crossing the border? page")
      andIchooseRadioXOnThePresentationHowIsTheTransitCrossingTheBorderPage("Maritime Transport")

      And(
        "I choose radio Name of the sea-going vessel on the presentation inland mode Which identification do you want to use for this vehicle? page"
      )
      andIchooseRadioXOnThePresentationInlandModeWhichIdentificationDoYouWantToUseForThisVehiclePage(
        "Name of the sea-going vessel"
      )

      And("I enter identification number 5h1p1nn on What is the identification number for this? page")
      andIenterIdentificationOnTheWhatIsTheIdentificationNumberForThisPage("5h1p1nn")

      And("I select United Kingdom on the active border mode What country is this vehicle registered to? page")
      andIselectOnTheActiveBorderModeWhatCountryIsThisVehicleRegisteredToPage("United Kingdom")

      And("I select Nancy bureau (FR003000) on Where is the customs office at the border? page")
      andIselectOnTheWhereIsTheCustomsOfficeAtTheBorderPage("Nancy bureau (FR003000)")

      And("I choose radio Yes on the presentation Do you want to add a conveyance reference number? page")
      andIchooseRadioXOnThePresentationDoYouWantToAddAConveyanceReferenceNumberPage("Yes")

      And("I enter conveyance reference number 123456123456 on the What is the conveyance reference number? page")
      andIenterConveyanceReferenceNumberOnTheWhatIsTheConveyanceReferenceNumberPage("123456123456")

      And("I choose radio Yes on the presentation You have added 1 border means of transport page")
      whenIchooseRadioXOnThePresentationYouHaveAddedXBorderMeansOfTransportPage("Yes", "1")

      And(
        "I choose radio IATA flight number on the presentation inland mode Which identification do you want to use for this vehicle? page"
      )
      andIchooseRadioXOnThePresentationInlandModeWhichIdentificationDoYouWantToUseForThisVehiclePage(
        "IATA flight number"
      )

      And("I enter identification number YATA010 on What is the identification number for this? page")
      andIenterIdentificationOnTheWhatIsTheIdentificationNumberForThisPage("YATA010")

      And("I select United Kingdom on the active border mode What country is this vehicle registered to? page")
      andIselectOnTheActiveBorderModeWhatCountryIsThisVehicleRegisteredToPage("United Kingdom")

      And("I select Nancy bureau (FR003000) on Where is the customs office at the border? page")
      andIselectOnTheWhereIsTheCustomsOfficeAtTheBorderPage("Nancy bureau (FR003000)")

      And("I choose radio No on the presentation Do you want to add a conveyance reference number? page")
      andIchooseRadioXOnThePresentationDoYouWantToAddAConveyanceReferenceNumberPage("No")

      And("I click the Remove link on the You have added 2 border means of transport page")
      andIclickTheXLinkOnTheYouHaveAddedXBorderMeansOfTransportPage("Remove", "2")

      And("I click radio Yes on the Are you sure you want to remove border means of transport 1? page")
      andIclickRadioXOnTheAreYouSureYouWantToRemoveBorderMeansOfTransportXPage("Yes", "1")

      And("I choose radio No on the presentation You have added 1 border means of transport page")
      whenIchooseRadioXOnThePresentationYouHaveAddedXBorderMeansOfTransportPage("No", "1")

      And("I enter C001 on the presentation What is the container identification number? page")
      andIenterOnThePresentationWhatIsTheContainerIdentificationNumberPage("C001")

      And("I click radio Yes on the presentation Do you want to add a seal? page")
      andIclickRadioXOnThePresentationDoYouWantToAddASealPage("Yes")

      And("I enter S001 on the presentation What is the seal identification number? page")
      andIenterOnThePresentationWhatIsTheSealIdentificationNumberPage("S001")

      And("I choose radio Yes on the presentation You have added 1 seal page")
      whenIchooseRadioXOnThePresentationYouHaveAddedXSealPage("Yes", "1")

      And("I enter S002 on the presentation What is the seal identification number? page")
      andIenterOnThePresentationWhatIsTheSealIdentificationNumberPage("S002")

      And("I click the Remove link on the presentation You have added 2 seals page")
      andIclickTheXLinkOnThePresentationYouHaveAddedXSealsPage("Remove", "2")

      And("I click radio option Yes on the presentation Are you sure you want to remove this seal? page")
      andIclickRadioOptionXOnThePresentationAreYouSureYouWantToRemoveThisSealPage("Yes")

      And("I choose radio No on the presentation You have added 1 seal page")
      whenIchooseRadioXOnThePresentationYouHaveAddedXSealPage("No", "1")

      And("I select item1 on the presentation Which items does this transport equipment apply to? page")
      andIselectOnThePresentationWhichItemsDoesThisTransportEquipmentApplyToPage("item1")

      And("I choose radio Yes on the presentation You have applied 1 item to transport equipment 1 page")
      andIchooseRadioXOnThePresentationYouHaveAppliedXItemsToTransportEquipmentXPage("Yes", "1", "1")

      And("I select item2 on the presentation Which items does this transport equipment apply to? page")
      andIselectOnThePresentationWhichItemsDoesThisTransportEquipmentApplyToPage("item2")

      And("I click the Remove link on the You have applied 2 item to transport equipment 1 page")
      andIclickXOnYouHaveAppliedXItemToTransportEquipmentXPage("Remove", "2", "1")

      And(
        "I choose radio option Yes for the Are you sure you want to remove this item from transport equipment 1? page"
      )
      andIchooseRadioOptionXForTheAreYouSureYouWantToRemoveThisItemFromTransportEquipmentPage("Yes", "1")

      And("I choose radio No on the presentation You have applied 1 item to transport equipment 1 page")
      andIchooseRadioXOnThePresentationYouHaveAppliedXItemsToTransportEquipmentXPage("No", "1", "1")

      And("I choose radio option Yes on the presentation You have added 1 transport equipment page")
      andIchooseRadioOptionXOnThePresentationYouHaveAddedXTransportEquipmentPage("Yes", "1")

      And("I click radio No on the presentation Do you want to add a container identification number? page")
      andIclickRadioXOnThePresentationDoYouWantToAddAContainerIdentificationNumberPage("No")

      And("I click radio No on the presentation Do you want to add a seal? page")
      andIclickRadioXOnThePresentationDoYouWantToAddASealPage("No")

      And("I select item3 on the presentation Which items does this transport equipment apply to? page")
      andIselectOnThePresentationWhichItemsDoesThisTransportEquipmentApplyToPage("item3")

      And("I choose radio No on the presentation You have applied 1 item to transport equipment 2 page")
      andIchooseRadioXOnThePresentationYouHaveAppliedXItemsToTransportEquipmentXPage("No", "1", "2")

      And("I click the Remove link on the presentation You have added 2 transport equipment page")
      andIclickTheXLinkOnThePresentationYouHaveAddedXTransportEquipmentPage("Remove", "2")

      And("I click radio option Yes on the presentation Are you sure you want to remove transport equipment 1? page")
      andIclickRadioOptionXOnThePresentationAreYouSureYouWantToRemoveTransportEquipmentXPage("Yes", "1")

      And("I choose radio option No on the presentation You have added 1 transport equipment page")
      andIchooseRadioOptionXOnThePresentationYouHaveAddedXTransportEquipmentPage("No", "1")

      Then("I should be on the Presentation Notification Check your answers page")
      thenIshouldbeOnThePresentationNotificationCheckYourAnswersPage()

      And("I submit the Check your answers page")
      andIsubmitTheCheckYourAnswersPage()

      Then("I should be on the Information sent page")
      thenIshouldbeOnTheInformationSentPage()

    }

    Scenario("02 'Normal' short journey with security type 1;  answer 'No' to all optional questions") {
      Given("I login with ID 1234567890")
      andILoginWithIDX("1234567890")

      When("I submit an IE015 Prelodged Departure Declaration")
      givenIsubmitAFile("IE015 Prelodged Departure Declaration")

      Then("I submit an IE928 Positive Acknowledgment")
      givenIsubmitAFile("IE928 Positive Acknowledgment")

      And("I refresh the page")
      andIrefreshThePage()

      And("I click on the View departure declarations link on the Manage your transit movements page")
      givenIclickOnTheLinkOnTheManageYourTransitMovementsPage("View departure declarations")

      And(
        "I click on the Complete pre lodged declaration link for LRN 25GB000246TK0E6WJ1 on the Departure declarations page"
      )
      andIclickOnTheXLinkForLRNXOnTheDepartureDeclarationsPage("Complete pre lodged declaration", "25GB000246TK0E6WJ1")

      And(
        "I click the Continue button on the presentation More information needed to complete pre-lodged declaration page"
      )
      andIclickTheContinueButtonOnThePresentationMoreInformationNeededToCompletePrelodgedDeclarationPage()

      And("I choose radio option Approved place on the presentation Which type of location are the goods in? page")
      andIchooseRadioOptionXOnThePresentationWhichTypeOfLocationAreTheGoodsInPage("Approved place")

      And("I choose a radio option Address on the presentation How do you want to identify the location of goods? page")
      andIchooseARadioOptionXOnThePresentationHowDoYouWantToIdentifyTheLocationOfGoodsPage("Address")

      And("I select United Kingdom on the presentation In which country is the location of goods? page")
      andIselectOnThePresentationInWhichCountryIsTheLocationOfGoodsPage("United Kingdom")

      And("I fill in the address on the presentation What is the address for the location of goods? page")
      andIfillInTheAddressOnThePresentationWhatIsTheAddressForTheLocationOfGoodsPage()

      And("I choose radio option No on the presentation Do you want to add a contact for the location of goods? page")
      andIchooseRadioOptionXOnThePresentationDoYouWantToAddAContactForTheLocationOfGoodsPage("No")

      And("I choose radio option No on the presentation Do you want to add a UN LOCODE for the place of loading? page")
      andIchooseRadioOptionXOnThePresentationDoYouWantToAddAUNLOCODEForThePlaceOfLoadingPage("No")

      And("I select United Kingdom on the presentation In which country is the place of loading? page")
      andIselectOnThePresentationInWhichCountryIsThePlaceOfLoadingPage("United Kingdom")

      And("I enter London on the presentation Where in United Kingdom is the place of loading? page")
      andIenterOnThePresentationWhereInXIsThePlaceOfLoadingPage("London", "United Kingdom")

      And(
        "I choose radio option No on the presentation Are you using any shipping containers to transport the goods? page"
      )
      andIchooseRadioOptionXOnThePresentationAreYouUsingAnyShippingContainersToTransportTheGoodsPage("No")

      And("I choose radio Air transport on the presentation How is the transit crossing the border? page")
      andIchooseRadioXOnThePresentationHowIsTheTransitCrossingTheBorderPage("Air transport")

      And(
        "I choose radio Registration Number of the Aircraft on the presentation inland mode Which identification do you want to use for this vehicle? page"
      )
      andIchooseRadioXOnThePresentationInlandModeWhichIdentificationDoYouWantToUseForThisVehiclePage(
        "Registration Number of the Aircraft"
      )

      And("I enter identification number GB1234567 on What is the identification number for this? page")
      andIenterIdentificationOnTheWhatIsTheIdentificationNumberForThisPage("GB1234567")

      And("I select United Kingdom on the active border mode What country is this vehicle registered to? page")
      andIselectOnTheActiveBorderModeWhatCountryIsThisVehicleRegisteredToPage("United Kingdom")

      And("I select Belfast Docks,Unit 2 Block C (XI000142) on Where is the customs office at the border? page")
      andIselectOnTheWhereIsTheCustomsOfficeAtTheBorderPage("Belfast Docks,Unit 2 Block C (XI000142)")

      And("I enter conveyance reference number GB123456123456 on the What is the conveyance reference number? page")
      andIenterConveyanceReferenceNumberOnTheWhatIsTheConveyanceReferenceNumberPage("GB123456123456")

      And("I choose radio option No on the presentation Do you want to add any transport equipment? page")
      andIchooseRadioOptionXOnThePresentationDoYouWantToAddAnyTransportEquipmentPage("No")

      Then("I should be on the Presentation Notification Check your answers page")
      thenIshouldbeOnThePresentationNotificationCheckYourAnswersPage()

      And("I submit the Check your answers page")
      andIsubmitTheCheckYourAnswersPage()

      Then("I should be on the Information sent page")
      thenIshouldbeOnTheInformationSentPage()

    }

    Scenario(
      "03 'Normal' short journey with security type 0 and location of goods in IE015;  answer 'No' to all optional questions"
    ) {
      Given("I login with ID 1234567890")
      andILoginWithIDX("1234567890")

      When("I submit an IE015 Prelodged Departure Declaration With Location Of Goods")
      givenIsubmitAFile("IE015 Prelodged Departure Declaration With Location Of Goods")

      Then("I submit an IE928 Positive Acknowledgment")
      givenIsubmitAFile("IE928 Positive Acknowledgment")

      And("I refresh the page")
      andIrefreshThePage()

      And("I click on the View departure declarations link on the Manage your transit movements page")
      givenIclickOnTheLinkOnTheManageYourTransitMovementsPage("View departure declarations")

      And(
        "I click on the Complete pre lodged declaration link for LRN 25GB000246TK0E6WJ1 on the Departure declarations page"
      )
      andIclickOnTheXLinkForLRNXOnTheDepartureDeclarationsPage("Complete pre lodged declaration", "25GB000246TK0E6WJ1")

      And(
        "I click the Continue button on the presentation More information needed to complete pre-lodged declaration page"
      )
      andIclickTheContinueButtonOnThePresentationMoreInformationNeededToCompletePrelodgedDeclarationPage()

      And("I choose radio option No on the presentation Do you want to add a UN LOCODE for the place of loading? page")
      andIchooseRadioOptionXOnThePresentationDoYouWantToAddAUNLOCODEForThePlaceOfLoadingPage("No")

      And("I select United Kingdom on the presentation In which country is the place of loading? page")
      andIselectOnThePresentationInWhichCountryIsThePlaceOfLoadingPage("United Kingdom")

      And("I enter London on the presentation Where in United Kingdom is the place of loading? page")
      andIenterOnThePresentationWhereInXIsThePlaceOfLoadingPage("London", "United Kingdom")

      And(
        "I choose radio option No on the presentation Are you using any shipping containers to transport the goods? page"
      )
      andIchooseRadioOptionXOnThePresentationAreYouUsingAnyShippingContainersToTransportTheGoodsPage("No")

      And("I choose radio option No on the presentation Do you want to add any transport equipment? page")
      andIchooseRadioOptionXOnThePresentationDoYouWantToAddAnyTransportEquipmentPage("No")

      Then("I should be on the Presentation Notification Check your answers page")
      thenIshouldbeOnThePresentationNotificationCheckYourAnswersPage()

      And("I submit the Check your answers page")
      andIsubmitTheCheckYourAnswersPage()

      Then("I should be on the Information sent page")
      thenIshouldbeOnTheInformationSentPage()

    }
  }
}
