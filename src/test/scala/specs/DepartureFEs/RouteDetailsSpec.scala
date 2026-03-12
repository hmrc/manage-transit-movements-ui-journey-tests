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

package specs.DepartureFEs

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

import specs.BaseSpec
import org.scalatest.GivenWhenThen
import specsteps.CYAStepDefSteps.*
import specsteps.CommonStepDefSteps.*
import specsteps.DraftDepartureDeclarationsStepDefSteps.andIclickOnTheLinkForLRNXOnTheDraftDepartureDeclarationsPage
import specsteps.LoginStepDefSteps.*
import specsteps.ManageStepDefSteps.*
import specsteps.PreTaskListStepDefSteps.whenTheUserHasSubmittedFileForLRNAndEORINumber
import specsteps.RouteDetailsLocationOfGoodsStepDefSteps.*
import specsteps.RouteDetailsOfficeOfExitStepDefSteps.*
import specsteps.RouteDetailsPlaceOfLoadingStepDefSteps.*
import specsteps.RouteDetailsPlaceOfUnloadingStepDefSteps.*
import specsteps.TaskListStepDefSteps.*
import specsteps.RouteDetailsStepDefSteps.*
import specsteps.RouteDetailsTransitStepDefSteps.*

class RouteDetailsSpec extends BaseSpec with GivenWhenThen {

  Feature("Route details Journey") {

    Scenario("01 Great Britain office of departure") {

      Given("I login with ID 1234567890")
      andILoginWithIDX("1234567890")

      And("The user has submitted RouteDetailsGB.json for LRN 1234567890RDGB and EORI Number 1234567890")
      whenTheUserHasSubmittedFileForLRNAndEORINumber("routeDetailsGB.json", "1234567890RDGB", "1234567890")

      And("I refresh the page")
      andIrefreshThePage()

      And("I click on the View draft departure declarations link on the Manage your transit movements page")
      givenIclickOnTheLinkOnTheManageYourTransitMovementsPage("View draft departure declarations")

      And(
        "I click on the link for LRN 1234567890RDGB on the Draft Departure declarations page"
      )
      andIclickOnTheLinkForLRNXOnTheDraftDepartureDeclarationsPage("1234567890RDGB")
      And("I click on the Add route details link on the Declaration summary page")
      thenIclickOnTheLinkOnTheDeclarationSummaryPage("Add route details")

      // Specific Circumstance Indicator
      And("I choose radio option Yes on the 'Do you want to add a specific circumstance indicator?' page")
      andIchooseRadioOptionXOnTheDoYouWantToAddASpecificCircumstanceIndicatorPage("Yes")
      And(
        "I choose radio option A20 - Express consignments in the context of exit summary declarations on the 'Which specific circumstance indicator do you want to add?' page"
      )
      andIchooseRadioOptionXOnTheWhichSpecificCircumstanceIndicatorDoYouWantToAddPage(
        "A20 - Express consignments in the context of exit summary declarations"
      )

      // Transit Route
      And("I select Italy on the 'What country is the office of destination in?' page")
      andIselectOnTheWhatCountryIsTheOfficeOfDestinationInPage("Italy")
      And("I select IT on the 'Where in Italy is the office of destination?' page")
      andIselectOnTheWhereInIsTheOfficeOfDestinationPage("IT", "Italy")

      // Binding Itinerary
      And("I choose radio option Yes on the 'Are you using a binding itinerary?' page")
      andIchooseRadioOptionXOnTheAreYouUsingABindingItineraryPage("Yes")

      // Country of Routing - Adding and Removing a Transit Country
      And("I select Serbia - XS on the 'Which country do you want to add to the transit route?' page")
      andIselectOnTheWhichCountryDoYouWantToAddToTheTransitRoutePage("Serbia - XS")
      And("I choose radio option No on the 'You have added 1 country to the transit route' page")
      andIchooseRadioOptionXOnTheYouHaveAddedXCountriestoTheTransitRoutePage("No", "1")
      And("I submit on the Check your answers section Transit route page")
      andIsubmitOnTheCheckYourAnswersSectionXPage("Transit route")
      And("I choose to click on transit route summary page link on the 'No offices of transit' page")
      andIchooseToClickOnXLinkOnTheNoOfficesOfTransitPage("transit route summary page")
      And(
        "I choose to click on Add or remove transit route countries link on the Check your answers section Transit route page"
      )
      andIchooseToClickOnXLinkOnTheCheckYourAnswersSectionXPage(
        "Add or remove transit route countries",
        "Transit route"
      )
      And("I choose radio option No on the 'You have added 1 country to the transit route' page")
      andIchooseRadioOptionXOnTheYouHaveAddedXCountriestoTheTransitRoutePage("Yes", "1")
      And("I select Germany on the 'Which country do you want to add to the transit route?' page")
      andIselectOnTheWhichCountryDoYouWantToAddToTheTransitRoutePage("Germany")
      And("I choose radio option Yes on the 'You have added 2 countries to the transit route' page")
      andIchooseRadioOptionXOnTheYouHaveAddedXCountriestoTheTransitRoutePage("Yes", "2")
      And("I select France on the 'Which country do you want to add to the transit route?' page")
      andIselectOnTheWhichCountryDoYouWantToAddToTheTransitRoutePage("France")
      And("And I choose radio option Yes on the 'You have added 3 countries to the transit route' page")
      andIchooseRadioOptionXOnTheYouHaveAddedXCountriestoTheTransitRoutePage("Yes", "3")
      And("I select Andorra on the 'Which country do you want to add to the transit route?' page")
      andIselectOnTheWhichCountryDoYouWantToAddToTheTransitRoutePage("Andorra")
      And("I choose to click on the Remove link on the 'You have added 4 countries to the transit route' page")
      andIchooseToClickOnTheXLinkOnTheYouHaveAddedXCountriestoTheTransitRoutePage("Remove", "4")
      And(
        "I choose radio option Yes on the 'Are you sure you want to remove this country from the transit route?' page"
      )
      andIchooseRadioOptionXOnTheAreYouSureYouWantToRemoveThisCountryFromTheTransitRoutePage("Yes")
      And("I choose radio option Yes on the 'You have added 3 countries to the transit route' page")
      andIchooseRadioOptionXOnTheYouHaveAddedXCountriestoTheTransitRoutePage("Yes", "3")
      And("I select Serbia on the 'Which country do you want to add to the transit route?' page")
      andIselectOnTheWhichCountryDoYouWantToAddToTheTransitRoutePage("Serbia")
      And("I choose radio option No on the 'You have added 4 countries to the transit route' page")
      andIchooseRadioOptionXOnTheYouHaveAddedXCountriestoTheTransitRoutePage("No", "4")
      And("I submit on the Check your answers section Transit route page")
      andIsubmitOnTheCheckYourAnswersSectionXPage("Transit route")

      // Office of Transit

      And("I select Andorra on the 'Which country is the office of transit in?' page")
      andIselectOnTheWhichCountryIsTheOfficeOfTransitInPage("Andorra")
      And(
        "I select CUSTOMS OFFICE SANT JULIÀ DE LÒRIA (AD000001) on the 'Where in Andorra is the office of transit?' page"
      )
      andIselectOnTheWhereInXIsTheOfficeOfTransitPage("CUSTOMS OFFICE SANT JULIÀ DE LÒRIA (AD000001)", "Andorra")
      And(
        "I choose radio option Yes on the 'Do you want to add a time of arrival in CUSTOMS OFFICE SANT JULIÀ DE LÒRIA (AD000001)?' page"
      )
      andIchooseRadioOptionXOnTheDoYouWantToAddATimeOfArrivalInXPage(
        "Yes",
        "CUSTOMS OFFICE SANT JULIÀ DE LÒRIA (AD000001)"
      )
      And(
        "I choose fill in the date and time on the 'When do you expect the transit to arrive in CUSTOMS OFFICE SANT JULIÀ DE LÒRIA, Andorra?' page"
      )
      andIchooseFillInTheDateAndTimeOnTheWhenDoYouExpectTheTransitToArriveInXXPage(
        "CUSTOMS OFFICE SANT JULIÀ DE LÒRIA",
        "Andorra"
      )
      And("I submit on the Check your answers section Office of transit page")
      andIsubmitOnTheCheckYourAnswersSectionXPage("Office of transit")
      And("I choose radio option Yes on the 'You have added 1 office of transit' page")
      andIchooseRadioOptionXOnTheYouHaveAddedXOfficesOfTransitPage("Yes", "1")
      And("I select France on the 'Which country is the office of transit in?' page")
      andIselectOnTheWhichCountryIsTheOfficeOfTransitInPage("France")
      And("I select Bastia port (FR000380) on the 'Where in France is the office of transit?' page")
      andIselectOnTheWhereInXIsTheOfficeOfTransitPage("Bastia port (FR000380)", "France")
      And("I choose radio option No on the 'Do you want to add a time of arrival in Bastia port (FR000380)?' page")
      andIchooseRadioOptionXOnTheDoYouWantToAddATimeOfArrivalInXPage("No", "Bastia port (FR000380)")
      And("I submit on the Check your answers section Office of transit page")
      andIsubmitOnTheCheckYourAnswersSectionXPage("Office of transit")
      And("I choose to click on the Remove link on the 'You have added 2 offices of transit' page")
      andIchooseToClickOnTheXLinkOnTheYouHaveAddedXOfficesOfTransitPage("Remove", "2")
      And("I choose radio option Yes on the 'Are you sure you want to remove this office of transit?' page")
      andIchooseRadioOptionXOnTheAreYouSureYouWantToRemoveThisOfficeOfTransitPage("Yes")
      And("I choose radio option Yes on the 'You have added 1 office of transit' page")
      andIchooseRadioOptionXOnTheYouHaveAddedXOfficesOfTransitPage("Yes", "1")
      And("I select Germany on the 'Which country is the office of transit in?' page")
      andIselectOnTheWhichCountryIsTheOfficeOfTransitInPage("Germany")
      And("I select Brake (DE005301) on the 'Where in Germany is the office of transit?' page")
      andIselectOnTheWhereInXIsTheOfficeOfTransitPage("Brake (DE005301)", "Germany")
      And("I choose radio option No on the 'Do you want to add a time of arrival in Brake (DE005301)?' page")
      andIchooseRadioOptionXOnTheDoYouWantToAddATimeOfArrivalInXPage("No", "Brake (DE005301)")
      And("I submit on the Check your answers section Office of transit page")
      andIsubmitOnTheCheckYourAnswersSectionXPage("Office of transit")
      And("I choose radio option No on the 'You have added 2 offices of transit' page")
      andIchooseRadioOptionXOnTheYouHaveAddedXOfficesOfTransitPage("Yes", "2")
      And("I select Serbia on the 'Which country is the office of transit in?' page")
      andIselectOnTheWhichCountryIsTheOfficeOfTransitInPage("Serbia")
      And("I select CI GRADINA (RS013277) on the 'Where in Serbia is the office of transit?' page")
      andIselectOnTheWhereInXIsTheOfficeOfTransitPage("CI GRADINA (RS013277)", "Serbia")
      And("I choose radio option No on the 'Do you want to add a time of arrival in CI GRADINA (RS013277)?' page")
      andIchooseRadioOptionXOnTheDoYouWantToAddATimeOfArrivalInXPage("No", "CI GRADINA (RS013277)")
      And("I submit on the Check your answers section Office of transit page")
      andIsubmitOnTheCheckYourAnswersSectionXPage("Office of transit")
      And("I choose radio option No on the 'You have added 3 offices of transit' page")
      andIchooseRadioOptionXOnTheYouHaveAddedXOfficesOfTransitPage("No", "3")

      // Office of Exit

      And("I choose radio option Yes on the 'Do you want to add a customs office of exit?' page")
      andIchooseRadioOptionXOnTheDoYouWantToAddACustomsOfficeOfExitPage("Yes")
      And("I select France on the 'In which country is the office of exit for transit?' page")
      andIselectOnTheInWhichCountryIsTheOfficeOfExitForTransitPage("France")
      And("I select Dijon bureau (FR001170) on the 'Where in France is the office of exit for transit?' page")
      andIselectOnTheWhereInXIsTheOfficeOfExitForTransitPage("Dijon bureau (FR001170)", "France")
      And("I submit on the Check your answers section Office of exit for transit page")
      andIsubmitOnTheCheckYourAnswersSectionXPage("Office of exit for transit")
      And("I choose radio option Yes on the 'You have added 1 office of exit for transit' page")
      andIchooseRadioOptionXOnTheYouHaveAddedOfficesOfExitForTransitPage("Yes", "1")
      And("I select France on the 'In which country is the office of exit for transit?' page")
      andIselectOnTheInWhichCountryIsTheOfficeOfExitForTransitPage("France")
      And("I select Brest bureau (FR000690) on the 'Where in France is the office of exit for transit?' page")
      andIselectOnTheWhereInXIsTheOfficeOfExitForTransitPage("Brest bureau (FR000690)", "France")
      And("I submit on the Check your answers section Office of exit for transit page")
      andIsubmitOnTheCheckYourAnswersSectionXPage("Office of exit for transit")
      And("I choose to click on the Remove link on the 'You have added 2 offices of exit for transit' page")
      andIchooseToClickOnTheXLinkOnTheYouHaveAddedXOfficesOfExitForTransitPage("Remove", "2")
      And(
        "I choose radio option Yes on the 'Are you sure you want to remove this office of exit for transit?' page"
      )
      andIchooseRadioOptionXOnTheAreYouSureYouWantToRemoveThisOfficeOfExitForTransitPage("Yes")
      And("I choose radio option No on the 'You have added 1 office of exit for transit' page")
      andIchooseRadioOptionXOnTheYouHaveAddedOfficesOfExitForTransitPage("No", "1")

      // Location of Goods

      And("I enter 1234567890 on the 'What is the authorisation number for the location of goods?' page")
      andIenterOnTheWhatIsTheAuthorisationNumberForTheLocationOfGoodsPage("1234567890")
      And(
        "I choose radio option Yes on the 'Do you want to add an additional identifier for the location of goods?' page"
      )
      andIchooseRadioOptionXOnTheDoYouWantToAddAnAdditionalIdentifierForTheLocationOfGoodsPage("Yes")
      And("I enter x9x9 on the 'What is the additional identifier for the location of goods?' page")
      andIenterOnTheWhatIsTheAdditionalIdentifierForTheLocationOfGoodsPage("x9x9")
      And("I choose radio option Yes on the 'Do you want to add a contact for the location of goods?' page")
      andIchooseRadioOptionXOnTheDoYouWantToAddAContactForTheLocationOfGoodsPage("Yes")
      And("I enter Locator Joe on the 'Who is the contact for the location of goods?' page")
      andIenterOnTheWhoIsTheContactForTheLocationOfGoodsPage("Locator Joe")
      And("I enter +432 1212 1212 on the 'What is the phone number for the location of goods’ contact?' page")
      andIenterOnTheWhatIsThePhoneNumberForTheLocationOfGoodsContactPage("+432 1212 1212")
      And("I submit on the Check your answers section Location of goods page")
      andIsubmitOnTheCheckYourAnswersSectionXPage("Location of goods")

      // PLace of Loading/Unloading UNLOCODE

      And("I choose radio option Yes on the 'Do you want to add a UN LOCODE for the place of loading?' page")
      andIchooseRadioOptionXOnTheDoYouWantToAddAUNLOCODEForThePlaceOfLoadingPage("Yes")
      And("I enter AEFAT on the 'What is the UN LOCODE for the place of loading?' page")
      andIenterOnTheWhatIsTheUNLOCODEForThePlaceOfLoadingPage("AEFAT")
      And("I choose radio option Yes on the 'Do you want to add extra information for the place of loading?' page")
      andIchooseRadioOptionXOnTheDoYouWantToAddExtraInformationForThePlaceOfLoadingPage("Yes")
      And("I select United Kingdom on the 'In which country is the place of loading?' page")
      andIselectOnTheInWhichCountryIsThePlaceOfLoadingPage("United Kingdom")
      And("I enter London on the 'Where in United Kingdom is the place of loading?' page")
      andIenterOnTheWhereInXIsThePlaceOfLoadingPage("London", "United Kingdom")
      And("I choose radio option Yes on the 'Do you want to add a place of unloading?' page")
      andIchooseRadioOptionXOnTheDoYouWantToAddAPlaceOfUnloadingPage("Yes")
      And("I choose radio option Yes on the 'Do you want to add a UN LOCODE for the place of unloading?' page")
      andIchooseRadioOptionXOnTheDoYouWantToAddAUNLOCODEForThePlaceOfUnloadingPage("Yes")
      And("I enter DEAAL on the 'What is the UN LOCODE for the place of unloading?' page")
      andIenterOnTheWhatIsTheUNLOCODEForThePlaceOfUnloadingPage("DEAAL")
      And(
        "I choose radio option Yes on the 'Do you want to add extra information for the place of unloading?' page"
      )
      andIchooseRadioOptionXOnTheDoYouWantToAddExtraInformationForThePlaceOfUnloadingPage("Yes")
      And("I select Italy on the 'Which country is the place of unloading in?' page")
      andIselectOnTheWhichCountryIsThePlaceOfUnloadingInPage("Italy")
      And("I enter Milano on the 'Where in Italy is the place of unloading?' page")
      andIenterOnTheWhereInXIsThePlaceOfUnloadingPage("Milano", "Italy")
      And("I submit on the Check your answers section Places of loading and unloading page")
      andIsubmitOnTheCheckYourAnswersSectionXPage("Places of loading and unloading")
      And("I submit on the Check your answers section Route details page")
      andIsubmitOnTheCheckYourAnswersSectionXPage("Route details")

      Then("I should be on the Declaration summary page")
      thenIshouldbeOnTheDeclarationSummaryPage()
      And("I should see Completed status for route details on the Declaration summary page")
      andIshouldSeeXStatusForOnTheDeclarationSummaryPage("Completed", "route details")

      And("I sign out")
      andISignOut()

    }

    Scenario("02 Northern Ireland office of departure") {

      Given("I login with ID 1234567890")
      andILoginWithIDX("1234567890")

      And("The user has submitted RouteDetailsXI.json for LRN 1234567890RDXI and EORI Number 1234567890")
      whenTheUserHasSubmittedFileForLRNAndEORINumber("routeDetailsXI.json", "1234567890RDXI", "1234567890")

      And("I refresh the page")
      andIrefreshThePage()

      And("I click on the View draft departure declarations link on the Manage your transit movements page")
      givenIclickOnTheLinkOnTheManageYourTransitMovementsPage("View draft departure declarations")

      And(
        "I click on the link for LRN 1234567890RDXI on the Draft Departure declarations page"
      )
      andIclickOnTheLinkForLRNXOnTheDraftDepartureDeclarationsPage("1234567890RDXI")
      And("I click on the Add route details link on the Declaration summary page")
      thenIclickOnTheLinkOnTheDeclarationSummaryPage("Add route details")

      // Transit Route
      And("I select Italy on the 'What country is the office of destination in?' page")
      andIselectOnTheWhatCountryIsTheOfficeOfDestinationInPage("Italy")
      And("I select Bari on the 'Where in Italy is the office of destination?' page")
      andIselectOnTheWhereInIsTheOfficeOfDestinationPage("Bari", "Italy")

      // Binding Itinerary
      And("I choose radio option No on the 'Are you using a binding itinerary?' page")
      andIchooseRadioOptionXOnTheAreYouUsingABindingItineraryPage("No")

      // Country of Routing
      And("And I choose radio option Yes on the 'Do you want to add a country to the transit route?' page")
      andIchooseRadioOptionXOnTheDoYouWantToAddACountryToTheTransitRoutePage("Yes")
      And("I select Andorra on the 'Which country do you want to add to the transit route?' page")
      andIselectOnTheWhichCountryDoYouWantToAddToTheTransitRoutePage("Andorra")
      And("And I choose radio option Yes on the 'You have added 1 country to the transit route' page")
      andIchooseRadioOptionXOnTheYouHaveAddedXCountriestoTheTransitRoutePage("Yes", "1")
      And("I select Argentina on the 'Which country do you want to add to the transit route?' page")
      andIselectOnTheWhichCountryDoYouWantToAddToTheTransitRoutePage("Argentina")
      And("And I choose radio option No on the 'You have added 2 countries to the transit route' page")
      andIchooseRadioOptionXOnTheYouHaveAddedXCountriestoTheTransitRoutePage("No", "2")
      And("I submit on the Check your answers section Transit route page")
      andIsubmitOnTheCheckYourAnswersSectionXPage("Transit route")

      // Location of Goods
      And("I choose radio option Yes on the 'Do you want to add a location of goods?' page")
      andIchooseRadioOptionXOnTheDoYouWantToAddALocationOfGoodsPage("Yes")
      And("I choose radio option Designated location on the 'Which type of location is it?' page")
      andIchooseRadioOptionXOnTheWhichTypeOfLocationIsItPage("Designated location")
      And(
        "I choose radio option Customs office identifier on the 'How do you want to identify the location of goods?' page"
      )
      andIchooseRadioOptionXOnTheHowDoYouWantToIdentifyTheLocationOfGoodsPage("Customs office identifier")
      And("I select XI on the departure location of goods customs office identification page")
      andIselectOnTheDepartureLocationOfGoodsCustomsOfficeIdentificationPage("XI")
      And("I submit on the Check your answers section Location of goods page")
      andIsubmitOnTheCheckYourAnswersSectionXPage("Location of goods")

      // Place of loading
      And("I choose radio option Yes on the 'Do you want to add a place of loading?' page")
      andIchooseRadioOptionXOnTheDoYouWantToAddAPlaceOfLoadingPage("Yes")
      And("I choose radio option No on the 'Do you want to add a UN LOCODE for the place of loading?' page")
      andIchooseRadioOptionXOnTheDoYouWantToAddAUNLOCODEForThePlaceOfLoadingPage("No")
      And("I select United Kingdom on the 'In which country is the place of loading?' page")
      andIselectOnTheInWhichCountryIsThePlaceOfLoadingPage("United Kingdom")
      And("I enter London on the 'Where in United Kingdom is the place of loading?' page")
      andIenterOnTheWhereInXIsThePlaceOfLoadingPage("London", "United Kingdom")
      And("I submit on the Check your answers section Places of loading and unloading page")
      andIsubmitOnTheCheckYourAnswersSectionXPage("Places of loading and unloading")
      And("I submit on the Check your answers section Route details page")
      andIsubmitOnTheCheckYourAnswersSectionXPage("Route details")

      Then("I should be on the Declaration summary page")
      thenIshouldbeOnTheDeclarationSummaryPage()
      And("I should see Completed status for route details on the Declaration summary page")
      andIshouldSeeXStatusForOnTheDeclarationSummaryPage("Completed", "route details")

      And("I sign out")
      andISignOut()
    }
  }
}
