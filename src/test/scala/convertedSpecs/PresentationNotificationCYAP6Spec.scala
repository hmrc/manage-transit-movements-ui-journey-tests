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

package convertedSpecs

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

import specsteps.CYAStepDefSteps.*
import specsteps.DepartureDeclarationsStepDefSteps.*
import specsteps.InlandModeOfTransportStepDefSteps.*
import specsteps.PresentationNotificationStepDefSteps.*
import org.scalatest.GivenWhenThen
import specsteps.LoginStepDefSteps
import specsteps.ManageStepDefSteps.*
import specsteps.CommonStepDefSteps.*
import specsteps.LoginStepDefSteps.*

class PresentationNotificationCYAP6Spec extends BaseSpec with GivenWhenThen {

  override def beforeEach(): Unit = {
    dropCollections()
    deleteCookies()
    Given("I login with ID 1234567890")
    andILoginWithIDX("1234567890")

    When("I submit an IE015 Normal Prelodged Departure Declaration Complete")
    givenIsubmitAFile("IE015 Normal Prelodged Departure Declaration Complete")

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
    And("I click the Continue button on the presentation 'Confirmation needed to complete pre-lodged declaration' page")
    andIclickTheContinueButtonOnThePresentationConfirmationNeededToCompletePrelodgedDeclarationPage()

  }

  Feature(
    "Trader sends in fully completed pre-lodged departure declaration type D (IE015) " +
      "and reviews their answers in presentation notification service (IE170) via CYA page"
  ) {

    Scenario("01 Representative section for a complete Normal pre-lodge departure declaration") {
      Given("I should be on the Presentation Notification Check your answers page")
      thenIshouldbeOnThePresentationNotificationCheckYourAnswersPage()

      And("I click the Change link for acting as representative on the Check your answers page")
      andIclickTheChangeLinkForOnTheCheckYourAnswersPage("Are you acting as a representative?")

      And("I choose radio option Yes on the presentation Are you acting as a representative? page")
      andIchooseRadioOptionXOnThePresentationAreYouActingAsARepresentativePage("Yes")

      And("I enter FR123123132 on the presentation representative What is your EORI number or TIN? page")
      andIenterOnThePresentationRepresentativeWhatIsYourEORINumberOrTINPage("FR123123132")

      And("I choose radio option Yes on the presentation representative Do you want to add your details? page")
      andIchooseRadioOptionXOnThePresentationRepresentativeDoYouWantToAddYourDetailsPage("Yes")

      And("I enter Marie Rep on the presentation representative What is your name? page")
      andIenterOnThePresentationRepresentativeWhatIsYourNamePage("Marie Rep")

      And("I enter +11 1111 1111 on the presentation representative What is your phone number? page")
      andIenterOnThePresentationRepresentativeWhatIsYourPhoneNumberPage("+11 1111 1111")

      Then("I should be on the Presentation Notification Check your answers page")
      thenIshouldbeOnThePresentationNotificationCheckYourAnswersPage()

      And("I submit the Check your answers page")
      andIsubmitTheCheckYourAnswersPage()

      Then("I should be on the Information sent page")
      thenIshouldbeOnTheInformationSentPage()

    }

    Scenario(
      "02 Departure means of transport section with Mode as other than Mail for a complete Normal pre-lodge departure declaration"
    ) {
      Given("I should be on the Presentation Notification Check your answers page")
      thenIshouldbeOnThePresentationNotificationCheckYourAnswersPage()

      And("I click the Change link for transport inland Mode on the Check your answers page")
      andIclickTheChangeLinkForOnTheCheckYourAnswersPage("Do you want to add an inland mode of transport?")

      And("I choose radio option Maritime on the Which inland mode of transport are you using? page")
      andIchooseRadioOptionXOnTheWhichInlandModeOfTransportAreYouUsingPage("Maritime")

      And(
        "I choose radio option Name of a sea-going vessel on the presentation departure means of transport Which identification do you want to use for the departure means of transport? page"
      )
      andIchooseRadioOptionXOnThePresentationDepartureMeansOfTransportWhichIdentificationDoYouWantToUseForTheDepartureMeansOfTransportPage(
        "Name of a sea-going vessel"
      )

      And(
        "I enter registration number GB1234567 on the presentation What is the identification number for the departure means of transport? page"
      )
      andIenterRegistrationNumberOnThePresentationWhatIsTheIdentificationNumberForTheDepartureMeansOfTransportPage(
        "GB1234567"
      )

      And(
        "I select United Kingdom on the presentation What country is the departure means of transport registered to? page"
      )
      andIselectOnThePresentationWhatCountryIsTheDepartureMeansOfTransportRegisteredToPage("United Kingdom")

      Then("I should be on the Presentation Notification Check your answers page")
      thenIshouldbeOnThePresentationNotificationCheckYourAnswersPage()

      And("I submit the Check your answers page")
      andIsubmitTheCheckYourAnswersPage()

      Then("I should be on the Information sent page")
      thenIshouldbeOnTheInformationSentPage()

    }

    Scenario(
      "03 Inland mode of transport section with mode as Mail for a complete Normal pre-lodge departure declaration"
    ) {
      Given("I should be on the Presentation Notification Check your answers page")
      thenIshouldbeOnThePresentationNotificationCheckYourAnswersPage()

      And("I click the Change link for transport inland mode on the Check your answers page")
      andIclickTheChangeLinkForOnTheCheckYourAnswersPage("Do you want to add an inland mode of transport?")

      And("I choose radio option Mail on the Which inland mode of transport are you using? page")
      andIchooseRadioOptionXOnTheWhichInlandModeOfTransportAreYouUsingPage("Mail")

      Then("I should be on the Presentation Notification Check your answers page")
      thenIshouldbeOnThePresentationNotificationCheckYourAnswersPage()

      And("I submit the Check your answers page")
      andIsubmitTheCheckYourAnswersPage()

      Then("I should be on the Information sent page")
      thenIshouldbeOnTheInformationSentPage()

    }

    Scenario("04 Add and Remove a departure transport Means for a complete Normal pre-lodge departure declaration") {
      Given("I should be on the Presentation Notification Check your answers page")
      thenIshouldbeOnThePresentationNotificationCheckYourAnswersPage()

      And("I click the Add or remove departure means of transport link on the Prelodge Check your answers page")
      andIclickTheLinkOnThePrelodgeCheckYourAnswersPage("Add or remove departure means of transport")

      And("I choose radio option Yes on the presentation You have added 1 departure means of transport page")
      andIchooseRadioOptionXOnThePresentationYouHaveAddedXDepartureMeansOfTransportPage("Yes", "1")

      And(
        "I choose radio option Registration number of a road vehicle on the presentation departure means of transport Which identification do you want to use for the departure means of transport? page"
      )
      andIchooseRadioOptionXOnThePresentationDepartureMeansOfTransportWhichIdentificationDoYouWantToUseForTheDepartureMeansOfTransportPage(
        "Registration number of a road vehicle"
      )

      And(
        "I enter registration number NC15REG on the presentation What is the identification number for the departure means of transport? page"
      )
      andIenterRegistrationNumberOnThePresentationWhatIsTheIdentificationNumberForTheDepartureMeansOfTransportPage(
        "NC15REG"
      )

      And(
        "I select United Kingdom on the presentation What country is the departure means of transport registered to? page"
      )
      andIselectOnThePresentationWhatCountryIsTheDepartureMeansOfTransportRegisteredToPage("United Kingdom")

      And("I click the Remove link on the presentation You have added 2 departure means of transport page")
      andIclickTheXLinkOnThePresentationYouHaveAddedXDepartureMeansOfTransportPage("Remove", "2")

      And("I choose radio option Yes on the Are you sure you want to remove departure means of transport 1? page")
      andIchooseRadioOptionXOnTheAreYouSureYouWantToRemoveDepartureMeansOfTransportXPage("Yes", "1")

      And("I choose radio option No on the presentation You have added 1 departure means of transport page")
      andIchooseRadioOptionXOnThePresentationYouHaveAddedXDepartureMeansOfTransportPage("No", "1")

      And("I submit the Check your answers page")
      andIsubmitTheCheckYourAnswersPage()

      Then("I should be on the Information sent page")
      thenIshouldbeOnTheInformationSentPage()

    }
  }
}
