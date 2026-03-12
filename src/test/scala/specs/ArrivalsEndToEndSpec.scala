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

import specsteps.ArrivalNotificationsStepDefSteps.thenIShouldBeOnTheArrivalNotificationsPage
import specsteps.CYAStepDefSteps.*
import specsteps.CommonStepDefSteps.*
import specsteps.ConfirmationStepDefSteps.*
import specsteps.IdentificationStepDefSteps.*
import specsteps.LocationOfGoodsStepDefSteps.*
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
    andIenterOnTheMovementReferenceNumberPage("25GB000246TK0E6WJ1")
  }

  Feature("End to end journey Arrival notification feature") {

    Scenario("01 - Simplified - Authorisation number w/ contact") {
      When("I select GB on the arrival office of destination page")
      andIselectOnTheArrivalOfficeOfDestinationPage("GB")
      And("I choose radio option Simplified on the What type of procedure are you using? page")
      andIchooseRadioOptionXOnTheWhatTypeOfProcedureAreYouUsingPage("Simplified")
      And("I enter GB123456789000 on the consignee eori tin page")
      andIenterOnTheConsigneeEoriTinPage("GB123456789000")
      And("I enter XIACT24A7770003 on the authorisations reference number page")
      andIenterOnTheAuthorisationsReferenceNumberPage("XIACT24A7770003")
      And("I enter XI DES BT1 3ET on the arrival location of goods authorisation number page")
      andIenterOnTheArrivalLocationOfGoodsAuthorisationNumberPage("XI DES BT1 3ET")
      And("I choose radio option Yes on the arrival location of goods add contact page")
      andIchooseRadioOptionXOnTheArrivalLocationOfGoodsAddContactPage("Yes")
      And("I enter John Joe on the arrival location of goods contact page")
      andIenterOnTheArrivalLocationOfGoodsContactPage("John Joe")
      And("I enter +44 2345 82 83 on the arrival location of goods contact number page")
      andIenterOnTheArrivalLocationOfGoodsContactNumberPage("+44 2345 82 83")
      And("I submit on the Check your answers section Arrivals page")
      andIsubmitOnTheCheckYourAnswersSectionXPage("Arrivals")
      And("I click the Make another arrival notification link on the Arrival notification sent page")
      andIclickTheLinkOnTheArrivalNotificationSentPage("Make another arrival notification")
      And("I should be on the What is the Movement Reference Number page")
      thenIshouldbeOnTheWhatIsTheMovementReferenceNumberPage()

      And("I sign out")
      andISignOut()

    }

    Scenario("02 - Normal - Customs office") {
      When("I select GB on the arrival office of destination page")
      andIselectOnTheArrivalOfficeOfDestinationPage("GB")
      And("I choose radio option Normal on the What type of procedure are you using? page")
      andIchooseRadioOptionXOnTheWhatTypeOfProcedureAreYouUsingPage("Normal")
      And("I enter GB123456789000 on the consignee eori tin page")
      andIenterOnTheConsigneeEoriTinPage("GB123456789000")
      And("I choose radio option Designated destination on the arrival location of goods type page")
      andIchooseRadioOptionXOnTheArrivalLocationOfGoodsTypePage("Designated destination")
      And("I choose radio option Customs office identifier on the arrival location of goods identification page")
      andIchooseRadioOptionXOnTheArrivalLocationOfGoodsIdentificationPage("Customs office identifier")
      And("I select GB on the arrival location of goods customs office identification page")
      andIselectOnTheArrivalLocationOfGoodsCustomsOfficeIdentificationPage("GB")
      And("I submit on the Check your answers section Arrivals page")
      andIsubmitOnTheCheckYourAnswersSectionXPage("Arrivals")
      And("I click the Check the status of arrival notifications link on the Arrival notification sent page")
      andIclickTheLinkOnTheArrivalNotificationSentPage("Check the status of arrival notifications")
      And("I should be on the Arrival notifications page")
      thenIShouldBeOnTheArrivalNotificationsPage()

      And("I sign out")
      andISignOut()

    }

    Scenario("03 - Normal - Coordinates w/ contact") {
      When("I select GB on the arrival office of destination page")
      andIselectOnTheArrivalOfficeOfDestinationPage("GB")

      And("I choose radio option Normal on the What type of procedure are you using? page")
      andIchooseRadioOptionXOnTheWhatTypeOfProcedureAreYouUsingPage("Normal")
      And("I enter GB123456789000 on the consignee eori tin page")
      andIenterOnTheConsigneeEoriTinPage("GB123456789000")
      And("I choose radio option Approved place on the arrival location of goods type page")
      andIchooseRadioOptionXOnTheArrivalLocationOfGoodsTypePage("Approved place")
      And("I choose radio option Coordinates on the arrival location of goods identification page")
      andIchooseRadioOptionXOnTheArrivalLocationOfGoodsIdentificationPage("Coordinates")
      And("I enter 50.96622 and 1.86201 on the arrival location of goods coordinates page")
      andIenterAndOnTheArrivalLocationOfGoodsCoordinatesPage("50.96622", "1.86201")
      And("I choose radio option Yes on the arrival location of goods add contact page")
      andIchooseRadioOptionXOnTheArrivalLocationOfGoodsAddContactPage("Yes")
      And("I enter John Joe on the arrival location of goods contact page")
      andIenterOnTheArrivalLocationOfGoodsContactPage("John Joe")
      And("I enter +44 2345 82 83 on the arrival location of goods contact number page")
      andIenterOnTheArrivalLocationOfGoodsContactNumberPage("+44 2345 82 83")
      And("I submit on the Check your answers section Arrivals page")
      andIsubmitOnTheCheckYourAnswersSectionXPage("Arrivals")
      And("I should be on the Arrival notification sent page")
      thenIshouldbeOnTheArrivalNotificationSentPage()
      And("I sign out")
      andISignOut()

    }

    Scenario("04 - User cannot re-enter their Arrival notification after submission") {
      When("I select GB on the arrival office of destination page")
      andIselectOnTheArrivalOfficeOfDestinationPage("GB")
      And("I choose radio option Simplified on the What type of procedure are you using? page")
      andIchooseRadioOptionXOnTheWhatTypeOfProcedureAreYouUsingPage("Simplified")
      And("I enter GB123456789000 on the consignee eori tin page")
      andIenterOnTheConsigneeEoriTinPage("GB123456789000")
      And("I enter XIACT24A7770003 on the authorisations reference number page")
      andIenterOnTheAuthorisationsReferenceNumberPage("XIACT24A7770003")
      And("I enter XI DES BT1 3ET on the arrival location of goods authorisation number page")
      andIenterOnTheArrivalLocationOfGoodsAuthorisationNumberPage("XI DES BT1 3ET")
      And("I choose radio option Yes on the arrival location of goods add contact page")
      andIchooseRadioOptionXOnTheArrivalLocationOfGoodsAddContactPage("Yes")
      And("I enter John Joe on the arrival location of goods contact page")
      andIenterOnTheArrivalLocationOfGoodsContactPage("John Joe")
      And("I enter +44 2345 82 83 on the arrival location of goods contact number page")
      andIenterOnTheArrivalLocationOfGoodsContactNumberPage("+44 2345 82 83")
      And("I submit on the Check your answers section Arrivals page")
      andIsubmitOnTheCheckYourAnswersSectionXPage("Arrivals")
      And("I click the Make another arrival notification link on the Arrival notification sent page")
      andIclickTheLinkOnTheArrivalNotificationSentPage("Make another arrival notification")
      And("I should be on the What is the Movement Reference Number page")
      thenIshouldbeOnTheWhatIsTheMovementReferenceNumberPage()
      And("I enter 25GB000246TK0E6WJ1 on the Movement Reference Number page")
      andIenterOnTheMovementReferenceNumberPage("25GB000246TK0E6WJ1")
      And("I should see an error on the What is the Movement Reference Number page")
      thenIshouldseeAnErrorOnTheWhatIsTheMovementReferenceNumberPage()

      And("I sign out")
      andISignOut()

    }

  }
}
