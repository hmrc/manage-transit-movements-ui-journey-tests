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
import specsteps.DepartureConfirmationStepDefSteps.*
import specsteps.DraftDepartureDeclarationsStepDefSteps.*
import specsteps.InlandModeOfTransportStepDefSteps.*
import specsteps.LoginStepDefSteps.*
import specsteps.BorderMeansOfTransportStepDefSteps.*
import specsteps.ManageStepDefSteps.*
import specsteps.PreTaskListStepDefSteps.*
import specsteps.TaskListStepDefSteps.*
import specsteps.TraderDetailsStepDefSteps.*
import specsteps.PresentationNotificationStepDefSteps.*
import specsteps.TransportDetailsStepDefSteps.*
import specsteps.SupplyChainActorStepDefSteps.*
import specsteps.ItemDetailsStepDefSteps.*
import specsteps.TransportAuthorisationsStepDefSteps.*
import specsteps.CarrierDetailsStepDefSteps.*
import specsteps.TransportEquipmentChargesStepDefSteps.*

class TransportDetailsSpec extends BaseSpec with GivenWhenThen {

  override def beforeEach(): Unit = {
    dropCollections()
    deleteCookies()
    Given("I login with ID 1234567890")
    andILoginWithIDX("1234567890")
  }

  Feature("Transport details journey") {

    Scenario(
      "01 Great Britain office of departure"
    ) {
      And("the user has submitted transportDetailsGB.json for LRN 1234567890TDGB and EORI number 1234567890")
      whenTheUserHasSubmittedFileForLRNAndEORINumber("transportDetailsGB.json", "1234567890TDGB", "1234567890")

      And("I refresh the page")
      andIrefreshThePage()

      And("I click on the View draft departure declarations link on the Manage your transit movements page")
      givenIclickOnTheLinkOnTheManageYourTransitMovementsPage("View draft departure declarations")

      And("I click on the link for LRN 1234567890TDGB on the 'Draft departure declarations' page")
      andIclickOnTheLinkForLRNXOnTheDraftDepartureDeclarationsPage("1234567890TDGB")

      Then("I should be on the Declaration summary page")
      thenIshouldbeOnTheDeclarationSummaryPage()

      And("I click the Add transport details link on the Declaration summary page")
      thenIclickTheLinkOnTheDeclarationSummaryPage("Add transport details")

      And("I choose radio option Yes on the Do you want to use the same UCR for all items? page")
      andIchooseRadioOptionXOnTheDoYouWantToUseTheSameUCRForAllItemsPage("Yes")

      And("I enter UCR23456 on the What is the UCR? page")
      andIenterOnTheWhatIsTheUCRPage("UCR23456")

      And("I choose radio option Yes on the Are all the items being dispatched from the same country? page")
      andIchooseRadioOptionXOnTheAreAllTheItemsBeingDispatchedFromTheSameCountryPage("Yes")

      And("I select United Kingdom on the What is the country of dispatch? page")
      andIselectOnTheWhatIsTheCountryOfDispatchPage("United Kingdom")

      //      ## Container indicator
      And(
        "I choose radio option Yes on the Are the goods being transported to another country after the end of this transit movement? page"
      )
      andIchooseRadioOptionXOnTheAreTheGoodsBeingTransportedToAnotherCountryAfterTheEndOfThisTransitMovementPage("Yes")

      And("I choose radio option Yes on the Are all the items being transported to the same country? page")
      andIchooseRadioOptionXOnTheAreAllTheItemsBeingTransportedToTheSameCountryPage("Yes")

      And("I select Italy on the transport details What country are the items being transported to? page")
      andIselectOnTheTransportDetailsWhatCountryAreTheItemsBeingTransportedToPage("Italy")

      And("I choose radio option Yes on the Are you using any shipping containers to transport the goods? page")
      andIchooseRadioOptionXOnTheAreYouUsingAnyShippingContainersToTransportTheGoodsPage("Yes")

      //       ## Inland mode of transport
      And("I choose radio option Yes on the Do you want to add an inland mode of transport? page")
      andIchooseRadioOptionXOnTheDoYouWantToAddAnInlandModeOfTransportPage("Yes")

      And("I choose radio option Maritime on the 'Which inland mode of transport are you using?' page")
      andIchooseRadioOptionXOnTheWhichInlandModeOfTransportAreYouUsingPage("Maritime")

      And(
        "I choose radio option Name of a sea-going vessel on the inland mode 'Which identification do you want to use for this vehicle?' page"
      )
      andIchooseRadioOptionXOnTheInlandModeWhichIdentificationDoYouWantToUseForThisVehiclePage(
        "Name of a sea-going vessel"
      )

      And("I enter registration number GB1234567 on the What is the identification number for this? page")
      andIenterRegistrationNumberOnTheWhatIsTheIdentificationNumberForThisPage("GB1234567")

      And("I select United Kingdom on the inland mode What country is this vehicle registered to? page")
      andIselectOnTheInlandModeWhatCountryIsThisVehicleRegisteredToPage("United Kingdom")

      And("I submit on the Check your answers section Departure means of transport page")
      andIsubmitOnTheCheckYourAnswersSectionXPage("Departure means of transport")

      And("I select radio option Yes on the You have added 1 departure means of transport page")
      andIselectRadioOptionXOnTheYouHaveAddedDepartureMeansOfTransportPage("Yes", "1")

      And(
        "I choose radio option Name of a sea-going vessel on the inland mode 'Which identification do you want to use for this vehicle?' page"
      )
      andIchooseRadioOptionXOnTheInlandModeWhichIdentificationDoYouWantToUseForThisVehiclePage(
        "Name of a sea-going vessel"
      )

      And("I enter registration number GB1234567 on the What is the identification number for this? page")
      andIenterRegistrationNumberOnTheWhatIsTheIdentificationNumberForThisPage("GB1234567")

      And("I select United Kingdom on the inland mode What country is this vehicle registered to? page")
      andIselectOnTheInlandModeWhatCountryIsThisVehicleRegisteredToPage("United Kingdom")

      And("I submit on the Check your answers section Departure means of transport page")
      andIsubmitOnTheCheckYourAnswersSectionXPage("Departure means of transport")

      And("I choose to click on the Remove link on the You have added 2 departure means of transport' page")
      whenIchooseToClickOnTheXLinkOnTheYouHaveAddedDepartureMeansOfTransportPage("Remove", "2")

      And("I choose radio option Yes for the 'Are you sure you want to remove departure means of transport 1?' page")
      andIchooseRadioOptionXForTheAreYouSureYouWantToRemoveDepartureMeansOfTransportPage("Yes", "1")

      And("I select radio option No on the You have added 1 departure means of transport page")
      andIselectRadioOptionXOnTheYouHaveAddedDepartureMeansOfTransportPage("No", "1")

      //      ## Border means of transport
      And("I choose radio option Yes on Do you want to add a border mode of transport? page")
      andIchooseRadioOptionXOnDoYouWantToAddABorderModeOfTransportPage("Yes")

      And("I choose radio option Sea on the How is the transit crossing the border? page")
      andIchooseRadioOptionXOnTheHowIsTheTransitCrossingTheBorderPage("Sea")

      And("I choose radio option Yes on the border means Do you want to add identification for this vehicle? page")
      andIchooseRadioOptionXOnTheBorderMeansDoYouWantToAddIdentificationForThisVehiclePage("Yes")

      And(
        "I choose radio option Name of a sea-going vessel on the border mode 'Which identification do you want to use for this vehicle?' page"
      )
      andIchooseRadioOptionXOnTheBorderModeWhichIdentificationDoYouWantToUseForThisVehiclePage(
        "Name of a sea-going vessel"
      )

      And("I enter identification GB1234567 on the What is the identification number for this? page")
      andIenterIdentificationOnTheWhatIsTheIdentificationNumberForThisPage("GB1234567")

      And("I select United Kingdom on the border mode What country is this vehicle registered to? page")
      andIselectOnTheBorderModeWhatCountryIsThisVehicleRegisteredToPage("United Kingdom")

      // ## Border means office of transit
      And("I select Basel (DE004058) on the 'Where is the customs office at the border?' page")
      andIselectOnTheWhereIsTheCustomsOfficeAtTheBorderPage("Basel (DE004058)")

      //      ## Conveyance Reference Number
      And("I choose radio option Yes on the Do you want to add a conveyance reference number? page")
      andIchooseRadioOptionXOnTheDoYouWantToAddAConveyanceReferenceNumberPage("Yes")

      And("I enter conveyance number GB123456123456 on the What is the conveyance reference number? page")
      andIenterConveyanceNumberOnTheWhatIsTheConveyanceReferenceNumberPage("GB123456123456")

      And("I submit on the Check your answers section Border means of transport page")
      andIsubmitOnTheCheckYourAnswersSectionXPage("Border means of transport")

      And("I choose radio option Yes on the You have added 1 border means of transport page")
      whenIchooseRadioOptionXOnTheYouHaveAddedXBorderMeansOfTransportPage("Yes", "1")

      And(
        "I choose radio option Registration number of the road vehicle on the border mode 'Which identification do you want to use for this vehicle?' page"
      )
      andIchooseRadioOptionXOnTheBorderModeWhichIdentificationDoYouWantToUseForThisVehiclePage(
        "Registration number of the road vehicle"
      )

      And("I enter identification number GB15REG on What is the identification number for this? page")
      andIenterIdentificationOnTheWhatIsTheIdentificationNumberForThisPage("GB15REG")

      And("I select United Kingdom on the border mode What country is this vehicle registered to? page")
      andIselectOnTheBorderModeWhatCountryIsThisVehicleRegisteredToPage("United Kingdom")

      And("I select Basel (DE004058) on the 'Where is the customs office at the border?' page")
      andIselectOnTheWhereIsTheCustomsOfficeAtTheBorderPage("Basel (DE004058)")

      And("I choose radio option No on the Do you want to add a conveyance reference number? page")
      andIchooseRadioOptionXOnTheDoYouWantToAddAConveyanceReferenceNumberPage("No")

      And("I submit on the Check your answers section Border means of transport page")
      andIsubmitOnTheCheckYourAnswersSectionXPage("Border means of transport")

      And("I choose to click on Remove link on the add another border means of transport page")
      andIchooseToClickOnXLinkOnTheAddAnotherBorderMeansOfTransportPage("Remove")

      And("I select radio option Yes on the 'Are you sure you want to remove border means of transport 1?' page")
      andIclickRadioXOnTheAreYouSureYouWantToRemoveBorderMeansOfTransportXPage("Yes", "1")

      And("I choose radio option No on the You have added 1 border means of transport page")
      whenIchooseRadioOptionXOnTheYouHaveAddedXBorderMeansOfTransportPage("No", "1")

      And("I submit on the Check your answers section Modes and means of transport page")
      andIsubmitOnTheCheckYourAnswersSectionXPage("Modes and means of transport")

      //      ## Supply chain actor
      And("I choose radio option Yes on the Do you want to add a supply chain actor for all items? page")
      andIchooseRadioOptionXOnTheDoYouWantToAddASupplyChainActorForAllItemsPage("Yes")

      And("I choose radio option Consolidator on the Which type of supply chain actor do you want to add? page")
      andIchooseRadioOptionXOnTheWhichTypeOfSupplyChainActorDoYouWantToAddPage("Consolidator")

      And(
        "I enter FR98472189002 on the What is the EORI number or Third Country Unique Identification Number TCUIN for the consolidator? page"
      )
      andIenterOnTheWhatIsTheEORINumberOrThirdCountryUniqueIdentificationNumberTCUINForTheXPage(
        "FR98472189002",
        "consolidator"
      )

      And("I choose radio option Yes on the You have added 1 supply chain actor page")
      andIchooseRadioOptionXOnTheYouHaveAddedSupplyChainActorsPage("Yes", "1")

      // Supply chain actor 2
      And("I choose radio option Manufacturer on the Which type of supply chain actor do you want to add? page")
      andIchooseRadioOptionXOnTheWhichTypeOfSupplyChainActorDoYouWantToAddPage("Manufacturer")

      And(
        "I enter FR98472189002 on the What is the EORI number or Third Country Unique Identification Number TCUIN for the consolidator? page"
      )
      andIenterOnTheWhatIsTheEORINumberOrThirdCountryUniqueIdentificationNumberTCUINForTheXPage(
        "GB0101010101",
        "manufacturer"
      )

      And("I choose to click on Remove link on the 'You have added 2 supply chain actors' page")
      whenIchooseToClickOnXLinkOnTheYouHaveAddedSupplyChainActorsPage("Remove", "2")

      And("I click radio option Yes on the 'Are you sure you want to remove this supply chain actor?' item page")
      andIclickRadioOptionXOnTheAreYouSureYouWantToRemoveThisSupplyChainActorItemPage("Yes")

      And("I choose radio option No on the You have added 1 supply chain actor page")
      andIchooseRadioOptionXOnTheYouHaveAddedSupplyChainActorsPage("No", "1")

      //      ## Authorisation
      And("I enter ACR123 reference number on the What is the reference number for the ACR authorisation? page")
      andIenterReferenceNumberOnTheWhatIsTheReferenceNumberForTheAuthorisationPage("ACR123", "ACR")

      And("I enter TRD123 reference number on the What is the reference number for the TRD authorisation? page")
      andIenterReferenceNumberOnTheWhatIsTheReferenceNumberForTheAuthorisationPage("TRD123", "TRD")

      And("I choose radio option Yes on the You have added 2 transport authorisations page")
      whenIchooseRadioOptionXOnTheYouHaveAddedTransportAuthorisationsPage("Yes", "2")

      And("I enter SSE123 reference number on the What is the reference number for the ACR authorisation? page")
      andIenterReferenceNumberOnTheWhatIsTheReferenceNumberForTheAuthorisationPage("SSE123", "SSE")

      And("I choose to click on Remove link on the 'You have added 3 authorisations' page")
      whenIchooseToClickOnXLinkOnTheYouHaveAddedXAuthorisationsPage("Remove", "3")

      And("I choose radio option Yes for the 'Are you sure you want to remove this SSE authorisation?' page")
      andIchooseRadioOptionXForTheAreYouSureYouWantToRemoveThisAuthorisationPage("Yes", "SSE")

      And("I choose radio option No on the You have added 2 transport authorisations page")
      whenIchooseRadioOptionXOnTheYouHaveAddedTransportAuthorisationsPage("No", "2")

      And("I enter the date on the When do you expect the transit to arrive in AEROPORTO (IT262101)? page")
      andIenterTheDateOnTheWhenDoYouExpectTheTransitToArriveInXPage("AEROPORTO (IT262101)")

      //      ## Carrier
      And("I choose radio option Yes on the Do you want to add a carrier? page")
      andIChooseRadioOptionXOnTheDoYouWantToAddACarrierPage("Yes")

      And(
        "I enter GB123456123456 on the 'What is the carrier’s EORI number or Third Country Unique Identification Number TCUIN?' page"
      )
      andIenterOnTheWhatIsTheCarriersEORINumberOrThirdCountryUniqueIdentificationNumberTCUINPage("GB123456123456")

      And("I choose radio option Yes on the 'Do you want to add a contact for the carrier?' page")
      andIchooseRadioOptionXOnThEDoYouWantToAddAContactForTheCarrierPage("Yes")

      And("I enter Moseley on the 'Who is the contact for the carrier?' page")
      andIenterOnTheWhoIsTheContactForTheCarrierPage("Moseley")

      And("I enter +88 888 888 on the 'What is the phone number for the carrier’s contact?' page")
      andIenterOnTheWhatIsThePhoneNumberForTheCarriersContactPage("+88 888 888 ")

      //      ## Transport Equipment
      And("I enter C001 on the What is the container identification number? page")
      andIenterOnTheWhatIsTheContainerIdentificationNumberPage("C001")

      And("I choose radio option Yes on the Do you want to add a seal? page")
      andIchooseRadioOptionXOnTheDoYouWantToAddASealPage("Yes")

      And("I enter S001 on the 'What is the seal identification number?' page")
      andIenterOnTheWhatIsTheSealIdentificationNumberPage("S001")

      And("I choose radio option Yes on the 'You have added 1 seal' page")
      andIchooseRadioOptionXOnTheYouHaveAddedXSealsPage("Yes", "1")

      And("I enter S002 on the 'What is the seal identification number?' page")
      andIenterOnTheWhatIsTheSealIdentificationNumberPage("S002")

      And("I click the Remove link on the presentation You have added 2 seals page")
      andIclickTheXLinkOnThePresentationYouHaveAddedXSealsPage("Remove", "2")

      And("I click radio option Yes on the presentation Are you sure you want to remove this seal? page")
      andIclickRadioOptionXOnThePresentationAreYouSureYouWantToRemoveThisSealPage("Yes")

      And("I choose radio option No on the 'You have added 1 seal' page")
      andIchooseRadioOptionXOnTheYouHaveAddedXSealsPage("No", "1")

      And("I submit on the Check your answers section Transport equipment page")
      andIsubmitOnTheCheckYourAnswersSectionXPage("Transport equipment")

      And("I choose radio option Yes on the You have added 1 transport equipment page")
      andIchooseRadioOptionXOnTheYouHaveAddedXTransportEquipmentPage("Yes", "1")

      // Transport equipment 2

      And("I choose radio option Yes on the 'Do you want to add a container identification number?' page")
      andIchooseRadioOptionXOnTheDoYouWantToAddAContainerIdentificationNumberPage("Yes")

      And("I enter C002 on the What is the container identification number? page")
      andIenterOnTheWhatIsTheContainerIdentificationNumberPage("C002")

      And("I choose radio option No on the Do you want to add a seal? page")
      andIchooseRadioOptionXOnTheDoYouWantToAddASealPage("No")

      And("I submit on the Check your answers section Transport equipment page")
      andIsubmitOnTheCheckYourAnswersSectionXPage("Transport equipment")

      And("I click the Remove link on the 'You have added 2 transport equipment' page")
      andIclickTheXLinkOnTheYouHaveAddedXTransportEquipmentPage("Remove", "2")

      And("I click radio option Yes on the 'Are you sure you want to remove transport equipment 1?' page")
      andIclickRadioOptionXOnTheAreYouSureYouWantToRemoveTransportEquipmentXPage("Yes", "1")

      And("I choose radio option No on the You have added 1 transport equipment page")
      andIchooseRadioOptionXOnTheYouHaveAddedXTransportEquipmentPage("No", "1")

      //    ## Additional Reference
      And("I click radio option Yes on the Do you want to add an additional reference for all items? page")
      andIclickRadioOptionXOnTheDoYouWantToAddAnAdditionalReferenceForAllItemsPage("Yes")

      And(
        "I select Y023 - Consignee (AEO certificate number) on the What type of additional reference do you want to add? page"
      )
      andIselectOnTheWhatTypeOfAdditionalReferenceDoYouWantToAddPage("Y023 - Consignee (AEO certificate number)")

      And("I click radio option Yes on the Do you want to add an additional reference number? page")
      andIclickRadioOptionXOnTheDoYouWantToAddAnAdditionalReferenceNumberPage("Yes")

      And("I enter 12345 on the 'Enter the additional reference number' page")
      andIenterXOnTheEnterTheAdditionalReferenceNumberPage("12345")

      And("I click radio option Yes on the 'You have added 1 additional reference for all items' page")
      andIclickRadioOptionXOnTheYouHaveAddedXAdditionalReferenceForAllItemsPage("Yes", "1")

      And(
        "I select Y025 - Representative (AEO certificate number) on the What type of additional reference do you want to add? page"
      )
      andIselectOnTheWhatTypeOfAdditionalReferenceDoYouWantToAddPage("Y025 - Representative (AEO certificate number)")

      And("I click radio option No on the Do you want to add an additional reference number? page")
      andIclickRadioOptionXOnTheDoYouWantToAddAnAdditionalReferenceNumberPage("No")

      And("I click the Remove link on the 'You have added 2 additional references for all items?' page")
      andIclickTheXLinkOnTheYouHaveAddedXAdditionalReferencesForAllItemsPage("Remove", "2")

      And(
        "I click radio option Yes on the 'Are you sure you want to remove this additional reference from all items?' page"
      )
      andIclickRadioOptionXOnTheAreYouSureYouWantToRemoveThisAdditionalReferenceFromAllItemsPage("Yes")

      And("I click radio option Yes on the 'You have added 1 additional reference for all items' page")
      andIclickRadioOptionXOnTheYouHaveAddedXAdditionalReferenceForAllItemsPage("No", "1")

      //  ## Additional Information

      And("I click radio option Yes on the Do you want to add any additional information for all items? page")
      andIclickRadioOptionXOnTheDoYouWantToAddAnyAdditionalInformationForAllItemsPage("Yes")

      And(
        "I select 20100 - Export from one EFTA country subject to restriction or export from the Union subject to restriction on the 'What type of additional information do you want to add?' page"
      )
      andIselectOnTheWhatTypeOfAdditionalInformationDoYouWantToAddPage(
        "20100 - Export from one EFTA country subject to restriction or export from the Union subject to restriction"
      )

      And("I click radio option Yes on the 'Do you want to add any comments for the additional information?' page")
      andIclickRadioOptionXOnTheDoYouWantToAddAnyCommentsForTheAdditionalInformationPage("Yes")

      And("I enter Comment 1 on the 'Enter your comments for the additional information' page")
      andIenterOnTheEnterYourCommentsForTheAdditionalInformationPage("Comment 1")

      And("I click radio option Yes on the 'You have added 1 additional information for all items' page")
      andIclickRadioOptionXOnTheYouHaveAddedXAdditionalInformationForAllItemsPage("Yes", "1")

      And("I select 20300 - Export on the 'What type of additional information do you want to add?' page")
      andIselectOnTheWhatTypeOfAdditionalInformationDoYouWantToAddPage("20300 - Export")

      And("I click radio option No on the 'Do you want to add any comments for the additional information?' page")
      andIclickRadioOptionXOnTheDoYouWantToAddAnyCommentsForTheAdditionalInformationPage("No")

      And("I choose to click on the Remove link on the 'You have added 2 additional information for all items' page")
      andIchooseToClickOnTheXLinkOnTheYouHaveAddedXAdditionalInformationForAllItemsPage("Remove", "2")

      And(
        "I click radio option Yes on the 'Are you sure you want to remove this additional information from all items?' page"
      )
      andIclickRadioOptionXOnTheAreYouSureYouWantToRemoveThisAdditionalInformationFromAllItemsPage("Yes")

      And("I click radio option No on the 'You have added 1 additional information for all items' page")
      andIclickRadioOptionXOnTheYouHaveAddedXAdditionalInformationForAllItemsPage("No", "1")

      And("I submit on the Check your answers section Transport details page")
      andIsubmitOnTheCheckYourAnswersSectionXPage("Transport details")

      Then("I should be on the 'Declaration summary' page")
      thenIshouldbeOnTheDeclarationSummaryPage()

      And("I should see Completed status for transport details on the 'Declaration summary' page")
      andIshouldSeeXStatusForOnTheDeclarationSummaryPage("Completed", "transport details")

      And("I sign out")
      andISignOut()

    }

    Scenario("02 Great Britain office of departure - No to optional") {

      And("the user has submitted transportDetailsGB.json for LRN 1234567890TDGB and EORI number 1234567890")
      whenTheUserHasSubmittedFileForLRNAndEORINumber("transportDetailsGB.json", "1234567890TDGB", "1234567890")

      And("I refresh the page")
      andIrefreshThePage()

      And("I click on the View draft departure declarations link on the Manage your transit movements page")
      givenIclickOnTheLinkOnTheManageYourTransitMovementsPage("View draft departure declarations")

      And("I click on the link for LRN 1234567890TDGB on the 'Draft departure declarations' page")
      andIclickOnTheLinkForLRNXOnTheDraftDepartureDeclarationsPage("1234567890TDGB")

      Then("I should be on the Declaration summary page")
      thenIshouldbeOnTheDeclarationSummaryPage()

      And("I click the Add transport details link on the Declaration summary page")
      thenIclickTheLinkOnTheDeclarationSummaryPage("Add transport details")

      And("I choose radio option No on the Do you want to use the same UCR for all items? page")
      andIchooseRadioOptionXOnTheDoYouWantToUseTheSameUCRForAllItemsPage("No")

      And("I choose radio option No on the Are all the items being dispatched from the same country? page")
      andIchooseRadioOptionXOnTheAreAllTheItemsBeingDispatchedFromTheSameCountryPage("No")

      //      ## Container indicator
      And(
        "I choose radio option No on the Are the goods being transported to another country after the end of this transit movement? page"
      )
      andIchooseRadioOptionXOnTheAreTheGoodsBeingTransportedToAnotherCountryAfterTheEndOfThisTransitMovementPage("No")

      And("I choose radio option No on the Are you using any shipping containers to transport the goods? page")
      andIchooseRadioOptionXOnTheAreYouUsingAnyShippingContainersToTransportTheGoodsPage("No")

      //       ## Inland mode of transport
      And("I choose radio option No on the Do you want to add an inland mode of transport? page")
      andIchooseRadioOptionXOnTheDoYouWantToAddAnInlandModeOfTransportPage("No")

      And(
        "I choose radio option Name of a sea-going vessel on the inland mode 'Which identification do you want to use for this vehicle?' page"
      )
      andIchooseRadioOptionXOnTheInlandModeWhichIdentificationDoYouWantToUseForThisVehiclePage(
        "Name of a sea-going vessel"
      )

      And("I enter registration number GB1234567 on the What is the identification number for this? page")
      andIenterRegistrationNumberOnTheWhatIsTheIdentificationNumberForThisPage("GB1234567")

      And("I select United Kingdom on the inland mode What country is this vehicle registered to? page")
      andIselectOnTheInlandModeWhatCountryIsThisVehicleRegisteredToPage("United Kingdom")

      And("I submit on the Check your answers section Departure means of transport page")
      andIsubmitOnTheCheckYourAnswersSectionXPage("Departure means of transport")

      And("I select radio option No on the You have added 1 departure means of transport page")
      andIselectRadioOptionXOnTheYouHaveAddedDepartureMeansOfTransportPage("No", "1")

      //      ## Border means of transport
      And("I choose radio option No on Do you want to add a border mode of transport? page")
      andIchooseRadioOptionXOnDoYouWantToAddABorderModeOfTransportPage("No")

      And("I choose radio option No on the border means Do you want to add identification for this vehicle? page")
      andIchooseRadioOptionXOnTheBorderMeansDoYouWantToAddIdentificationForThisVehiclePage("No")

      And("I submit on the Check your answers section Modes and means of transport page")
      andIsubmitOnTheCheckYourAnswersSectionXPage("Modes and means of transport")

      //      ## Supply chain actor
      And("I choose radio option No on the Do you want to add a supply chain actor for all items? page")
      andIchooseRadioOptionXOnTheDoYouWantToAddASupplyChainActorForAllItemsPage("No")

      //      ## Authorisation
      And("I enter ACR123 reference number on the What is the reference number for the ACR authorisation? page")
      andIenterReferenceNumberOnTheWhatIsTheReferenceNumberForTheAuthorisationPage("ACR123", "ACR")

      And("I enter TRD123 reference number on the What is the reference number for the TRD authorisation? page")
      andIenterReferenceNumberOnTheWhatIsTheReferenceNumberForTheAuthorisationPage("TRD123", "TRD")

      And("I choose radio option No on the You have added 2 transport authorisations page")
      whenIchooseRadioOptionXOnTheYouHaveAddedTransportAuthorisationsPage("No", "2")

      And("I enter the date on the When do you expect the transit to arrive in AEROPORTO (IT262101)? page")
      andIenterTheDateOnTheWhenDoYouExpectTheTransitToArriveInXPage("AEROPORTO (IT262101)")

      //      ## Carrier
      And("I choose radio option No on the Do you want to add a carrier? page")
      andIChooseRadioOptionXOnTheDoYouWantToAddACarrierPage("No")

      And("I choose radio option Yes on the 'Do you want to add any transport equipment?' page")
      andIchooseRadioOptionXOnTheDoYouWantToAddAnyTransportEquipmentPage("Yes")

      And("I enter S001 on the 'What is the seal identification number?' page")
      andIenterOnTheWhatIsTheSealIdentificationNumberPage("S001")

      And("I choose radio option No on the 'You have added 1 seal' page")
      andIchooseRadioOptionXOnTheYouHaveAddedXSealsPage("No", "1")

      And("I submit on the Check your answers section Transport equipment page")
      andIsubmitOnTheCheckYourAnswersSectionXPage("Transport equipment")

      And("I choose radio option Yes on the You have added 1 transport equipment page")
      andIchooseRadioOptionXOnTheYouHaveAddedXTransportEquipmentPage("Yes", "1")

      And("I enter S0021 on the 'What is the seal identification number?' page")
      andIenterOnTheWhatIsTheSealIdentificationNumberPage("S0021")

      And("I choose radio option No on the 'You have added 1 seal' page")
      andIchooseRadioOptionXOnTheYouHaveAddedXSealsPage("No", "1")

      And("I submit on the Check your answers section Transport equipment page")
      andIsubmitOnTheCheckYourAnswersSectionXPage("Transport equipment")

      And("I choose radio option No on the You have added 1 transport equipment page")
      andIchooseRadioOptionXOnTheYouHaveAddedXTransportEquipmentPage("No", "2")

      //    ## Additional Reference
      And("I click radio option No on the Do you want to add an additional reference for all items? page")
      andIclickRadioOptionXOnTheDoYouWantToAddAnAdditionalReferenceForAllItemsPage("No")

      //  ## Additional Information
      And("I click radio option No on the Do you want to add any additional information for all items? page")
      andIclickRadioOptionXOnTheDoYouWantToAddAnyAdditionalInformationForAllItemsPage("No")

      And("I submit on the Check your answers section Transport details page")
      andIsubmitOnTheCheckYourAnswersSectionXPage("Transport details")

      Then("I should be on the 'Declaration summary' page")
      thenIshouldbeOnTheDeclarationSummaryPage()

      And("I should see Completed status for transport details on the 'Declaration summary' page")
      andIshouldSeeXStatusForOnTheDeclarationSummaryPage("Completed", "transport details")

      And("I sign out")
      andISignOut()

    }

    Scenario("03 Northern Ireland office of departure with declaration type TIR and additional declaration type D") {

      And("the user has submitted transportDetailsXI.json for LRN 1234567890TDXI and EORI number 1234567890")
      whenTheUserHasSubmittedFileForLRNAndEORINumber("transportDetailsXI.json", "1234567890TDXI", "1234567890")

      And("I refresh the page")
      andIrefreshThePage()

      And("I click on the View draft departure declarations link on the Manage your transit movements page")
      givenIclickOnTheLinkOnTheManageYourTransitMovementsPage("View draft departure declarations")

      And("I click on the link for LRN 1234567890TDXI on the 'Draft departure declarations' page")
      andIclickOnTheLinkForLRNXOnTheDraftDepartureDeclarationsPage("1234567890TDXI")

      Then("I should be on the Declaration summary page")
      thenIshouldbeOnTheDeclarationSummaryPage()

      And("I click the Add transport details link on the Declaration summary page")
      thenIclickTheLinkOnTheDeclarationSummaryPage("Add transport details")

      And("I choose radio option Yes on the Do you want to use the same UCR for all items? page")
      andIchooseRadioOptionXOnTheDoYouWantToUseTheSameUCRForAllItemsPage("Yes")

      And("I enter UCR23456 on the What is the UCR? page")
      andIenterOnTheWhatIsTheUCRPage("UCR23456")

      And("I choose radio option Yes on the Are all the items being dispatched from the same country? page")
      andIchooseRadioOptionXOnTheAreAllTheItemsBeingDispatchedFromTheSameCountryPage("Yes")

      And("I select United Kingdom on the What is the country of dispatch? page")
      andIselectOnTheWhatIsTheCountryOfDispatchPage("United Kingdom")

      //      ## Container indicator
      And(
        "I choose radio option Not sure on the Are the goods being transported to another country after the end of this transit movement? page"
      )
      andIchooseRadioOptionXOnTheAreTheGoodsBeingTransportedToAnotherCountryAfterTheEndOfThisTransitMovementPage(
        "Not sure"
      )

      And("I choose radio option Not sure on the Are you using any shipping containers to transport the goods? page")
      andIchooseRadioOptionXOnTheAreYouUsingAnyShippingContainersToTransportTheGoodsPage("Not sure")

      //       ## Inland mode of transport
      And("I choose radio option Yes on the Do you want to add an inland mode of transport? page")
      andIchooseRadioOptionXOnTheDoYouWantToAddAnInlandModeOfTransportPage("Yes")

      And("I choose radio option Rail on the 'Which inland mode of transport are you using?' page")
      andIchooseRadioOptionXOnTheWhichInlandModeOfTransportAreYouUsingPage("Rail")

      And(
        "I choose radio option Train number on the inland mode 'Which identification do you want to use for this vehicle?' page"
      )
      andIchooseRadioOptionXOnTheInlandModeWhichIdentificationDoYouWantToUseForThisVehiclePage("Train number")

      And("I enter registration number 1234567 on the What is the identification number for this? page")
      andIenterRegistrationNumberOnTheWhatIsTheIdentificationNumberForThisPage("1234567")

      And("I select United Kingdom on the inland mode What country is this vehicle registered to? page")
      andIselectOnTheInlandModeWhatCountryIsThisVehicleRegisteredToPage("United Kingdom")

      And("I submit on the Check your answers section Departure means of transport page")
      andIsubmitOnTheCheckYourAnswersSectionXPage("Departure means of transport")

      And("I select radio option No on the You have added 1 departure means of transport page")
      andIselectRadioOptionXOnTheYouHaveAddedDepartureMeansOfTransportPage("No", "1")

      // Border means of transport
      And("I choose radio option Yes on Do you want to add a border mode of transport? page")
      andIchooseRadioOptionXOnDoYouWantToAddABorderModeOfTransportPage("Yes")

      And("I choose radio option Air on the How is the transit crossing the border? page")
      andIchooseRadioOptionXOnTheHowIsTheTransitCrossingTheBorderPage("Air")

      And("I choose radio option Yes on the border means Do you want to add identification for this vehicle? page")
      andIchooseRadioOptionXOnTheBorderMeansDoYouWantToAddIdentificationForThisVehiclePage("Yes")

      And(
        "I choose radio option registration number of the aircraft on the border mode 'Which identification do you want to use for this vehicle?' page"
      )
      andIchooseRadioOptionXOnTheBorderModeWhichIdentificationDoYouWantToUseForThisVehiclePage(
        "registration number of the aircraft"
      )

      And("I enter identification GB1234567 on the What is the identification number for this? page")
      andIenterIdentificationOnTheWhatIsTheIdentificationNumberForThisPage("GB1234567")

      And("I select United Kingdom on the border mode What country is this vehicle registered to? page")
      andIselectOnTheBorderModeWhatCountryIsThisVehicleRegisteredToPage("United Kingdom")

      // ## Border means office of transit
      And("I select BARI on the 'Where is the customs office at the border?' page")
      andIselectOnTheWhereIsTheCustomsOfficeAtTheBorderPage("BARI")

      // Conveyance Reference Number
      And("I choose radio option Yes on the 'Do you want to add a conveyance reference number?' page")
      andIchooseRadioOptionXOnTheDoYouWantToAddAConveyanceReferenceNumberPage("Yes")

      And("And I enter conveyance number GB123456123456 on the 'What is the conveyance reference number?' page")
      andIenterConveyanceNumberOnTheWhatIsTheConveyanceReferenceNumberPage("GB123456123456")

      And("I submit on the Check your answers section Modes and means of transport page")
      andIsubmitOnTheCheckYourAnswersSectionXPage("Modes and means of transport")

      //      ## Supply chain actor
      And("I choose radio option No on the Do you want to add a supply chain actor for all items? page")
      andIchooseRadioOptionXOnTheDoYouWantToAddASupplyChainActorForAllItemsPage("No")

      //   ## Authorisation
      And("I choose radio option Yes on the 'Do you want to add an authorisation' page")
      andIchooseRadioOptionXOnTheDoYouWantToAddAnAuthorisationPage("Yes")

      And("I choose radio option TRD on the 'Which type of authorisation do you want to add?' page")
      andIchooseRadioOptionXOnTheWhichTypeOfAuthorisationDoYouWantToAddPage("TRD")

      And("I enter TRD123 reference number on the What is the reference number for the TRD authorisation? page")
      andIenterReferenceNumberOnTheWhatIsTheReferenceNumberForTheAuthorisationPage("TRD123", "TRD")

      And("I choose radio option Yes on the You have added 2 transport authorisations page")
      whenIchooseRadioOptionXOnTheYouHaveAddedTransportAuthorisationsPage("Yes", "1")

      And("I enter SSE123 reference number on the What is the reference number for the SSE authorisation? page")
      andIenterReferenceNumberOnTheWhatIsTheReferenceNumberForTheAuthorisationPage("SSE123", "SSE")

      And("I choose to click on Continue link on the You have added 2 transport authorisations page")
      andIclickTheContinueButtonOnTheYouHaveAddedXAuthorisationsPage("2")

      //      ## Carrier
      And("I choose radio option No on the Do you want to add a carrier? page")
      andIChooseRadioOptionXOnTheDoYouWantToAddACarrierPage("No")

      //    ## Additional Reference
      And("I click radio option No on the Do you want to add an additional reference for all items? page")
      andIclickRadioOptionXOnTheDoYouWantToAddAnAdditionalReferenceForAllItemsPage("No")

      //  ## Additional Information
      And("I click radio option No on the Do you want to add any additional information for all items? page")
      andIclickRadioOptionXOnTheDoYouWantToAddAnyAdditionalInformationForAllItemsPage("No")

      And("I submit on the Check your answers section Transport details page")
      andIsubmitOnTheCheckYourAnswersSectionXPage("Transport details")

      Then("I should be on the 'Declaration summary' page")
      thenIshouldbeOnTheDeclarationSummaryPage()

      And("I should see Completed status for transport details on the 'Declaration summary' page")
      andIshouldSeeXStatusForOnTheDeclarationSummaryPage("Completed", "transport details")

      And("I sign out")
      andISignOut()
    }

  }
}
