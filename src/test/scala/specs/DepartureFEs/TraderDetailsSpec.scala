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
import specsteps.LoginStepDefSteps.*
import specsteps.ManageStepDefSteps.*
import specsteps.PreTaskListStepDefSteps.*
import specsteps.TaskListStepDefSteps.*
import specsteps.TraderDetailsStepDefSteps.*
import specsteps.DraftDepartureDeclarationsStepDefSteps.*

class TraderDetailsSpec extends BaseSpec with GivenWhenThen {

  override def beforeEach(): Unit = {
    dropCollections()
    deleteCookies()
    Given("I login with ID 1234567890")
    andILoginWithIDX("1234567890")
  }

  Feature("Trader details journey") {

    Scenario(
      "01 Great Britain office of departure, T2 declaration type, exitSummaryDeclaration with EORI numbers, Contacts, Representatives"
    ) {
      And("the user has submitted traderDetailsGB.json for LRN 1234567890TDGB and EORI number 1234567890")
      whenTheUserHasSubmittedFileForLRNAndEORINumber("traderDetailsGB.json", "1234567890TDGB", "1234567890")

      And("I refresh the page")
      andIrefreshThePage()

      And("I click on the View draft departure declarations link on the Manage your transit movements page")
      givenIclickOnTheLinkOnTheManageYourTransitMovementsPage("View draft departure declarations")

      And("I click on the link for LRN 1234567890TDGB on the 'Draft departure declarations' page")
      andIclickOnTheLinkForLRNXOnTheDraftDepartureDeclarationsPage("1234567890TDGB")

      Then("I should be on the Declaration summary page")
      thenIshouldbeOnTheDeclarationSummaryPage()

      And("I click the Add trader details link on the Declaration summary page")
      thenIclickTheLinkOnTheDeclarationSummaryPage("Add trader details")

      // Transit Holder

      And("I choose radio option Yes on the Do you know the transit holder’s EORI number? page")
      andIchooseRadioOptionXOnTheDoYouKnowTheTransitHoldersEORINumberPage("Yes")

      And("I enter GB123456123456 on the What is the transit holder’s EORI number? page")
      andIenterOnTheWhatIsTheTransitHoldersEORINumberPage("GB123456123456")

      And("I choose radio option Yes on the Do you want to add a contact for the transit holder? page")
      andIchooseRadioOptionXOnTheDoYouWantToAddAContactForTheTransitHolderPage("Yes")

      And("I enter John contact on the 'What is the contact’s name?' page")
      andIenterOnTheWhatIsTheContactsNamePage("John")

      And("I enter +2112212112 on the 'What is the phone number for the transit holder’s contact?' page")
      andIenterOnTheWhatIsThePhoneNumberForTheTransitHoldersContactPage("+2112212112")

      And("I choose radio option Yes on the 'Are you acting as a representative?' page")
      andIchooseRadioOptionXOnTheAreYouActingAsARepresentativePage("Yes")

      And("I enter FR123123132 on the representative 'What is your EORI number or TIN?' page")
      andIenterOnTheRepresentativeWhatIsYourEORINumberOrTINPage("FR123123132")

      And("I choose radio option Yes on the representative 'Do you want to add your details?' page")
      andIchooseRadioOptionXOnTheRepresentativeDoYouWantToAddYourDetailsPage("Yes")

      And("I enter Marie Rep on the representative 'What is your name?' page")
      andIenterOnTheRepresentativeWhatIsYourNamePage("Marie Rep")

      And("I enter +11 1111 1111 on the representative 'What is your phone number?' page")
      andIenterOnTheRepresentativeWhatIsYourPhoneNumberPage("+11 1111 1111")

//          ## Reduced data set operator (can only be true when security = 0)
      And("I choose radio option Yes on the 'Do you want to use a reduced data set?' page")
      thenIchooseRadioOptionXOnTheDoYouWantToUseAReducedDataSetPage("Yes")

      //      ## Consignor
      And("I choose radio option Yes on the 'Do you know the consignor’s EORI number or TIN?' page")
      andIchooseRadioOptionXOnTheDoYouKnowTheConsignorsEORINumberOrTINPage("Yes")

      And("I enter IT12312313 on the 'What is the consignor’s EORI number or TIN?' page")
      andIenterOnTheWhatIsTheConsignorsEORINumberOrTINPage("IT12312313")

      //      ## Consignor contact
      And("I choose radio option Yes on the 'Do you want to add a contact for the consignor?' page")
      andIchooseRadioOptionXOnTheDoYouWantToAddAContactForTheConsignorPage("Yes")

      And("I enter Pip Contact on the 'What is the contact’s name?' page")
      andIenterNameOnTheWhatIsTheContactsNamePage("Pip Contact")

      And("I enter +123123123213 on the 'What is the phone number for the consignor’s contact?' page")
      andIenterOnTheWhatIsThePhoneNumberForTheConsignorsContactPage("+123123123213")

      //      ## Consignee
      And("I choose radio option Yes on the 'Do you know the consignee’s EORI number or TIN?' page")
      andIchooseRadioOptionXOnTheDoYouKnowTheConsigneesEORINumberOrTINPage("Yes")

      And("I enter GE00101001 on the 'What is the consignee’s EORI number or TIN?' page")
      andIenterOnTheWhatIsTheConsigneesEORINumberOrTINPage("GE00101001")

      And("I submit on the Check your answers section Trader details page")
      andIsubmitOnTheCheckYourAnswersSectionXPage("Trader details")

      Then("I should be on the 'Declaration summary' page")
      thenIshouldbeOnTheDeclarationSummaryPage()

      And("I should see Completed status for trader details on the 'Declaration summary' page")
      andIshouldSeeXStatusForOnTheDeclarationSummaryPage("Completed", "trader details")

      And("I sign out")
      andISignOut()

    }

    Scenario(
      "02 Great Britain office of departure, T2 declaration type, exitSummaryDeclaration, no EORI numbers, no Contacts, no Representative"
    ) {

      And("the user has submitted traderDetailsGB.json for LRN 1234567890TDGB and EORI number 1234567890")
      whenTheUserHasSubmittedFileForLRNAndEORINumber("traderDetailsGB.json", "1234567890TDGB", "1234567890")

      And("I refresh the page")
      andIrefreshThePage()

      And("I click on the View draft departure declarations link on the Manage your transit movements page")
      givenIclickOnTheLinkOnTheManageYourTransitMovementsPage("View draft departure declarations")

      And("I click on the link for LRN 1234567890TDGB on the 'Draft departure declarations' page")
      andIclickOnTheLinkForLRNXOnTheDraftDepartureDeclarationsPage("1234567890TDGB")

      Then("I should be on the Declaration summary page")
      thenIshouldbeOnTheDeclarationSummaryPage()

      And("I click the Add trader details link on the Declaration summary page")
      thenIclickTheLinkOnTheDeclarationSummaryPage("Add trader details")

      //    ## Transit Holder
      And("I choose radio option Yes on the Do you know the transit holder’s EORI number? page")
      andIchooseRadioOptionXOnTheDoYouKnowTheTransitHoldersEORINumberPage("No")

      And("I enter Joe Blog on the 'What is the transit holder’s name?' page")
      andIenterOnTheWhatIsTheTransitHoldersNamePage("Joe Blog")

      And("I select United Kingdom on the 'Which country is the transit holder based in?' page")
      andIselectOnTheWhichCountryIsTheTransitHolderBasedInPage("United Kingdom")

      And("I fill in the address on the 'What is the transit holder’s address?' page")
      andIfillInTheAddressOnTheWhatIsTheTransitHoldersAddressPage()

      //      ## Transit holder's contact person's details
      And("I choose radio option No on the 'Do you want to add a contact for the transit holder?' page")
      andIchooseRadioOptionXOnTheDoYouWantToAddAContactForTheTransitHolderPage("No")

      //      ## Representative details
      And("I choose radio option No on the 'Are you acting as a representative?' page")
      andIchooseRadioOptionXOnTheAreYouActingAsARepresentativePage("No")

      //      ## Reduced data set operator (can only be true when security = 0)
      And("I choose radio option No on the 'Do you want to use a reduced data set?' page")
      thenIchooseRadioOptionXOnTheDoYouWantToUseAReducedDataSetPage("No")

      //      ## Consignor
      And("I choose radio option No on the 'Do you know the consignor’s EORI number or TIN?' page")
      andIchooseRadioOptionXOnTheDoYouKnowTheConsignorsEORINumberOrTINPage("No")

      And("I enter Pip Consignor on the 'What is the consignor’s name?' page")
      andIenterOnTheWhatIsTheConsignorsNamePage("Pip Consignor")

      And("I select United Kingdom on the 'Which country is the consignor based in?' page")
      andIselectOnTheWhichCountryIsTheConsignorBasedInPage("United Kingdom")

      And("I fill in the address on the 'What is the consignor’s address?' page")
      andIfillInTheAddressOnTheWhatIsTheConsignorsAddressPage()

      //      ## Consignor contact
      And("I choose radio option No on the 'Do you want to add a contact for the consignor?' page")
      andIchooseRadioOptionXOnTheDoYouWantToAddAContactForTheConsignorPage("No")

      //      ## Consignee

      And("I choose radio option No on the 'Do you know the consignee’s EORI number or TIN?' page")
      andIchooseRadioOptionXOnTheDoYouKnowTheConsigneesEORINumberOrTINPage("No")

      And("I enter Simpson Blog Consignee on the 'What is the consignee’s name?' page")
      andIenterOnTheWhatIsTheConsigneesNamePage("Simpson Blog Consignee")

      And("I select United Kingdom on the 'Which country is the consignee based in?' page")
      andIselectOnTheWhichCountryIsTheConsigneeBasedInPage("United Kingdom")

      And("I fill in the address on the 'What is the consignee’s address?' page")
      andIfillInTheAddressOnTheWhatIsTheConsigneesAddressPage()

      And("I submit on the Check your answers section Trader details page")
      andIsubmitOnTheCheckYourAnswersSectionXPage("Trader details")

      Then("I should be on the 'Declaration summary' page")
      thenIshouldbeOnTheDeclarationSummaryPage()

      And("I should see Completed status for trader details on the 'Declaration summary' page")
      andIshouldSeeXStatusForOnTheDeclarationSummaryPage("Completed", "trader details")

      And("I sign out")
      andISignOut()

    }

    Scenario(
      "03 Northern Ireland office of departure, TIR declaration type, entrySummaryDeclaration,  no EORI numbers, no Contacts, no Representative"
    ) {

      And("the user has submitted traderDetailsXI.json for LRN 1234567890TDXI and EORI number 1234567890")
      whenTheUserHasSubmittedFileForLRNAndEORINumber("traderDetailsXI.json", "1234567890TDXI", "1234567890")

      And("I refresh the page")
      andIrefreshThePage()

      And("I click on the View draft departure declarations link on the Manage your transit movements page")
      givenIclickOnTheLinkOnTheManageYourTransitMovementsPage("View draft departure declarations")

      And("I click on the link for LRN 1234567890TDXI on the 'Draft departure declarations' page")
      andIclickOnTheLinkForLRNXOnTheDraftDepartureDeclarationsPage("1234567890TDXI")

      Then("I should be on the Declaration summary page")
      thenIshouldbeOnTheDeclarationSummaryPage()

      And("I click the Add trader details link on the Declaration summary page")
      thenIclickTheLinkOnTheDeclarationSummaryPage("Add trader details")

//       ## Transit holder
      And("I choose radio option Yes on the Do you know the transit holder’s EORI number? page")
      andIchooseRadioOptionXOnTheDoYouKnowTheTransitHoldersEORINumberPage("Yes")

      And("I enter GB123456123456 on the What is the transit holder’s EORI number? page")
      andIenterOnTheWhatIsTheTransitHoldersEORINumberPage("GB123456123456")

      //      ## Transit holder's contact person's details
      And("I choose radio option No on the 'Do you want to add a contact for the transit holder?' page")
      andIchooseRadioOptionXOnTheDoYouWantToAddAContactForTheTransitHolderPage("No")

      //      ## Transit holder's TIR id
      And("I enter ABC/123/12345 on the 'What is the TIR holder’s identification number?' page")
      andIenterOnTheWhatIsTheTIRHoldersIdentificationNumberPage("ABC/123/12345")

      //      ## Representative details
      And("I choose radio option No on the 'Are you acting as a representative?' page")
      andIchooseRadioOptionXOnTheAreYouActingAsARepresentativePage("No")

      //      ## Consignor
      And("I choose radio option Yes on the 'Do you know the consignor’s EORI number or TIN?' page")
      andIchooseRadioOptionXOnTheDoYouKnowTheConsignorsEORINumberOrTINPage("Yes")

      And("I enter IT12312313 on the 'What is the consignor’s EORI number or TIN?' page")
      andIenterOnTheWhatIsTheConsignorsEORINumberOrTINPage("IT12312313")

      //      ## Consignor contact
      And("I choose radio option No on the 'Do you want to add a contact for the consignor?' page")
      andIchooseRadioOptionXOnTheDoYouWantToAddAContactForTheConsignorPage("No")

      //      ## Consignee at header level
      And("I choose radio option Yes on the 'Do you know the consignee’s EORI number or TIN?' page")
      andIchooseRadioOptionXOnTheDoYouKnowTheConsigneesEORINumberOrTINPage("Yes")

      And("I enter GE00101001 on the 'What is the consignee’s EORI number or TIN?' page")
      andIenterOnTheWhatIsTheConsigneesEORINumberOrTINPage("GE00101001")

      And("I submit on the Check your answers section Trader details page")
      andIsubmitOnTheCheckYourAnswersSectionXPage("Trader details")

      Then("I should be on the 'Declaration summary' page")
      thenIshouldbeOnTheDeclarationSummaryPage()

      And("I should see Completed status for trader details on the 'Declaration summary' page")
      andIshouldSeeXStatusForOnTheDeclarationSummaryPage("Completed", "trader details")

      And("I sign out")
      andISignOut()
    }

  }
}
