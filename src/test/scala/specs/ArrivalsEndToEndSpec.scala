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

import specpage.Arrivals_AuthorisationsReferenceNumberPage
import specpage.Arrivals_ConsigneeEoriTinPage
import specpage.Arrivals_ContactPhoneNumberPage
import specpage.Arrivals_ErrorMovementReferenceNumberPage
import specpage.Arrivals_LocationOfGoodsAddContactPage
import specpage.Arrivals_LocationOfGoodsAuthorisationNumberPage
import specpage.Arrivals_LocationOfGoodsContactNamePage
import specpage.Arrivals_LocationOfGoodsCoordinatesPage
import specpage.Arrivals_LocationOfGoodsCustomsOfficeIdentificationPage
import specpage.Arrivals_LocationOfGoodsIdentificationPage
import specpage.Arrivals_LocationOfGoodsTypePage
import specpage.Arrivals_MovementReferenceNumberPage
import specpage.Arrivals_OfficeOfDestinationPage
import specpage.Arrivals_ProcedureTypePage
import specpage.Arrivals_ConfirmationPage
import specpage.CommonPages.CYAPage
import specpage.CommonPages.CommonPage
import specpage.ManagedFEArrivalNotificationsPage
import org.scalatest.{BeforeAndAfterEach, GivenWhenThen}
import specsteps.LoginStepDefSteps
import specsteps.ManageStepDefSteps.givenIclickOnTheLinkOnTheManageYourTransitMovementsPage

class ArrivalsEndToEndSpec extends BaseSpec with GivenWhenThen with BeforeAndAfterEach {

  override def beforeEach(): Unit = {
    dropCollections()
    deleteCookies()
    Given("I login with ID 1234567890")
    LoginStepDefSteps.andILoginWithIDX("1234567890")
    When("I click on the Make an arrival notification link on the Manage your transit movements page")
    givenIclickOnTheLinkOnTheManageYourTransitMovementsPage("Make an arrival notification")
    And("I enter 25GB000246TK0E6WJ1 on the Movement Reference Number page")
    Arrivals_MovementReferenceNumberPage.enterMrn("25GB000246TK0E6WJ1")
  }

  Feature("End to end journey Arrival notification feature") {

    Scenario("01 - Simplified - Authorisation number w/ contact") {
      When("I select GB on the arrival office of destination page")
      Arrivals_OfficeOfDestinationPage.selectOffice("GB")
      And("I choose radio option Simplified on the What type of procedure are you using? page")
      Arrivals_ProcedureTypePage.selectProcedureType("Simplified")
      And("I enter GB123456789000 on the consignee eori tin page")
      Arrivals_ConsigneeEoriTinPage.enterEoriOrTin("GB123456789000")
      And("I enter XIACT24A7770003 on the authorisations reference number page")
      Arrivals_AuthorisationsReferenceNumberPage.enterAuthorisationReference("XIACT24A7770003")
      And("I enter XI DES BT1 3ET on the arrival location of goods authorisation number page")
      Arrivals_LocationOfGoodsAuthorisationNumberPage.enterAuthorisationNumber("XI DES BT1 3ET")
      And("I choose radio option Yes on the arrival location of goods add contact page")
      Arrivals_LocationOfGoodsAddContactPage.answerAddContact("Yes")
      And("I enter John Joe on the arrival location of goods contact page")
      Arrivals_LocationOfGoodsContactNamePage.enterContactName("John Joe")
      And("I enter +44 2345 82 83 on the arrival location of goods contact number page")
      Arrivals_ContactPhoneNumberPage.enterContactPhoneNumber("+44 2345 82 83")

      And("I submit on the Check your answers section Arrivals page")
      CYAPage.submitAnswers("Arrivals")

      And("I click the Make another arrival notification link on the Arrival notification sent page")
      Arrivals_ConfirmationPage.followNotificationLink("Make another arrival notification")

      And("I should be on the What is the Movement Reference Number page")
      Arrivals_MovementReferenceNumberPage.loadPage()

      And("I sign out")
      CommonPage.signOut()

    }

    Scenario("02 - Normal - Customs office") {
      When("I select GB on the arrival office of destination page")
      Arrivals_OfficeOfDestinationPage.selectOffice("GB")
      And("I choose radio option Normal on the What type of procedure are you using? page")
      Arrivals_ProcedureTypePage.selectProcedureType("Normal")
      And("I enter GB123456789000 on the consignee eori tin page")
      Arrivals_ConsigneeEoriTinPage.enterEoriOrTin("GB123456789000")
      And("I choose radio option Designated destination on the arrival location of goods type page")
      Arrivals_LocationOfGoodsTypePage.selectLocationType("Designated destination")
      And("I choose radio option Customs office identifier on the arrival location of goods identification page")
      Arrivals_LocationOfGoodsIdentificationPage.selectIdentificationType("Customs office identifier")
      And("I select GB on the arrival location of goods customs office identification page")
      Arrivals_LocationOfGoodsCustomsOfficeIdentificationPage.selectCustomsOffice("GB")

      And("I submit on the Check your answers section Arrivals page")
      CYAPage.submitAnswers("Arrivals")

      And("I click the Check the status of arrival notifications link on the Arrival notification sent page")
      Arrivals_ConfirmationPage.followNotificationLink("Check the status of arrival notifications")

      And("I should be on the Arrival notifications page")
      ManagedFEArrivalNotificationsPage.loadPage()

      And("I sign out")
      CommonPage.signOut()

    }

    Scenario("03 - Normal - Coordinates w/ contact") {
      When("I select GB on the arrival office of destination page")
      Arrivals_OfficeOfDestinationPage.selectOffice("GB")

      And("I choose radio option Normal on the What type of procedure are you using? page")
      Arrivals_ProcedureTypePage.selectProcedureType("Normal")
      And("I enter GB123456789000 on the consignee eori tin page")
      Arrivals_ConsigneeEoriTinPage.enterEoriOrTin("GB123456789000")
      And("I choose radio option Approved place on the arrival location of goods type page")
      Arrivals_LocationOfGoodsTypePage.selectLocationType("Approved place")
      And("I choose radio option Coordinates on the arrival location of goods identification page")
      Arrivals_LocationOfGoodsIdentificationPage.selectIdentificationType("Coordinates")
      And("I enter 50.96622 and 1.86201 on the arrival location of goods coordinates page")
      Arrivals_LocationOfGoodsCoordinatesPage.enterCoordinates("50.96622", "1.86201")
      And("I choose radio option Yes on the arrival location of goods add contact page")
      Arrivals_LocationOfGoodsAddContactPage.answerAddContact("Yes")
      And("I enter John Joe on the arrival location of goods contact page")
      Arrivals_LocationOfGoodsContactNamePage.enterContactName("John Joe")
      And("I enter +44 2345 82 83 on the arrival location of goods contact number page")
      Arrivals_ContactPhoneNumberPage.enterContactPhoneNumber("+44 2345 82 83")

      And("I submit on the Check your answers section Arrivals page")
      CYAPage.submitAnswers("Arrivals")

      And("I should be on the Arrival notification sent page")
      Arrivals_ConfirmationPage.loadPage()

      And("I sign out")
      CommonPage.signOut()

    }

    Scenario("04 - User cannot re-enter their Arrival notification after submission") {
      When("I select GB on the arrival office of destination page")
      Arrivals_OfficeOfDestinationPage.selectOffice("GB")
      And("I choose radio option Simplified on the What type of procedure are you using? page")
      Arrivals_ProcedureTypePage.selectProcedureType("Simplified")
      And("I enter GB123456789000 on the consignee eori tin page")
      Arrivals_ConsigneeEoriTinPage.enterEoriOrTin("GB123456789000")
      And("I enter XIACT24A7770003 on the authorisations reference number page")
      Arrivals_AuthorisationsReferenceNumberPage.enterAuthorisationReference("XIACT24A7770003")
      And("I enter XI DES BT1 3ET on the arrival location of goods authorisation number page")
      Arrivals_LocationOfGoodsAuthorisationNumberPage.enterAuthorisationNumber("XI DES BT1 3ET")
      And("I choose radio option Yes on the arrival location of goods add contact page")
      Arrivals_LocationOfGoodsAddContactPage.answerAddContact("Yes")
      And("I enter John Joe on the arrival location of goods contact page")
      Arrivals_LocationOfGoodsContactNamePage.enterContactName("John Joe")
      And("I enter +44 2345 82 83 on the arrival location of goods contact number page")
      Arrivals_ContactPhoneNumberPage.enterContactPhoneNumber("+44 2345 82 83")

      And("I submit on the Check your answers section Arrivals page")
      CYAPage.submitAnswers("Arrivals")

      And("I click the Make another arrival notification link on the Arrival notification sent page")
      Arrivals_ConfirmationPage.followNotificationLink("Make another arrival notification")

      And("I should be on the What is the Movement Reference Number page")
      Arrivals_MovementReferenceNumberPage.loadPage()
      And("I enter 25GB000246TK0E6WJ1 on the Movement Reference Number page")
      Arrivals_MovementReferenceNumberPage.enterMrn("25GB000246TK0E6WJ1")
      And("I should see an error on the What is the Movement Reference Number page")
      Arrivals_ErrorMovementReferenceNumberPage.loadPage()

      And("I sign out")
      CommonPage.signOut()

    }

  }
}
