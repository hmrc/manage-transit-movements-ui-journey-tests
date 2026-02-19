import ArrivalNotificationsStepDefSteps.thenIShouldBeOnTheArrivalNotificationsPage
import IdentificationStepDefSteps.*
import LocationOfGoodsStepDefSteps.*
import CYAStepDefSteps.*
import ConfirmationStepDefSteps.*
import CommonStepDefSteps.*
import org.scalatest.GivenWhenThen
import org.scalatest.featurespec.AnyFeatureSpec
import org.scalatest.matchers.should.Matchers




class ArrivalsEndtoendSpec extends AnyFeatureSpec with GivenWhenThen {

  Feature("End to end journey Arrival notification feature") {

    Scenario("01 - Simplified - Authorisation number w/ contact") {
      When("I select GB on the arrival office of destination page")
        // Possible match (best=1.00)
        andIselectOnTheArrivalOfficeOfDestinationPage("GB")

      And("I choose radio option Simplified on the What type of procedure are you using? page")
        // Possible match (best=0.80)
        andIchooseRadioOptionXOnTheWhatTypeOfProcedureAreYouUsingPage("")
        // --- Other possible matches ---
        // andIchooseRadioOptionXOnTheWhichTypeOfProcedureAreYouUsingPage() [0.76] (PreTaskListStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Which type of procedure are you using\?' page

      And("I enter GB123456789000 on the consignee eori tin page")
        // Possible match (best=1.00)
        andIenterOnTheConsigneeEoriTinPage("GB123456789000")

      And("I enter XIACT24A7770003 on the authorisations reference number page")
        // Possible match (best=1.00)
        andIenterOnTheAuthorisationsReferenceNumberPage("XIACT24A7770003")
        // --- Other possible matches ---
        // andIenterXOnTheEnterTheAdditionalReferenceNumberPage() [0.79] (ItemDetailsStepDefSteps.scala) pattern: (?:I )?enter (.*) on the 'Enter the additional reference number' page
        // andIenterOnTheWhatIsTheReferencePage() [0.78] (Departure_GuaranteeDetailsStepDefSteps.scala) pattern: (?:I )?enter (.+) on the 'What is the reference\?' page
        // andIenterOnTheMovementReferenceNumberPage() [0.77] (IdentificationStepDefSteps.scala) pattern: (?:I )?enter (.+) on the Movement Reference Number page

      And("I enter XI DES BT1 3ET on the arrival location of goods authorisation number page")
        // Possible match (best=1.00)
        andIenterOnTheArrivalLocationOfGoodsAuthorisationNumberPage("XI DES BT1 3ET")
        // --- Other possible matches ---
        // andIenterOnTheArrivalLocationOfGoodsContactNumberPage() [0.79] (LocationOfGoodsStepDefSteps.scala) pattern: (?:I )?enter (.+) on the arrival location of goods contact number page
        // andIenterOnTheArrivalLocationOfGoodsContactPage() [0.79] (LocationOfGoodsStepDefSteps.scala) pattern: (?:I )?enter (.+) on the arrival location of goods contact page
        // andIenterXOnTheEnterADescriptionOfItemXPage() [0.78] (ItemDetailsStepDefSteps.scala) pattern: (?:I )?enter (.*) on the 'Enter a description of item (.*)' page
        // andIenterOnTheWhatIsTheAuthorisationNumberForTheLocationOfGoodsPage() [0.76] (RouteDetailsLocationOfGoodsStepDefSteps.scala) pattern: (?:I )?enter (.+) on the 'What is the authorisation number for the location of goods\?' page

      And("I choose radio option Yes on the arrival location of goods add contact page")
        // Possible match (best=1.00)
        andIchooseRadioOptionXOnTheArrivalLocationOfGoodsAddContactPage("Yes")

      And("I enter John Joe on the arrival location of goods contact page")
        // Possible match (best=1.00)
        andIenterOnTheArrivalLocationOfGoodsContactPage("John Joe")

      And("I enter +44 2345 82 83 on the arrival location of goods contact number page")
        // Possible match (best=1.00)
        andIenterOnTheArrivalLocationOfGoodsContactNumberPage("+44 2345 82 83")
        // --- Other possible matches ---
        // andIenterOnTheArrivalLocationOfGoodsContactPage() [0.79] (LocationOfGoodsStepDefSteps.scala) pattern: (?:I )?enter (.+) on the arrival location of goods contact page

      And("I submit on the Check your answers section Arrivals page")
        // Possible match (best=1.00)
        andIsubmitOnTheCheckYourAnswersSectionXPage("Arrivals")

      And("I click the Make another arrival notification link on the Arrival notification sent page")
        // Possible match (best=1.00)
        andIclickTheLinkOnTheArrivalNotificationSentPage("Make another arrival notification")

      And("I should be on the What is the Movement Reference Number page")
        // Possible match (best=1.00)
        thenIshouldbeOnTheWhatIsTheMovementReferenceNumberPage()

      And("I sign out")
        // Possible match (best=1.00)
        andISignOut()

    }

    Scenario("02 - Normal - Customs office") {
      When("I select GB on the arrival office of destination page")
        // Possible match (best=1.00)
        andIselectOnTheArrivalOfficeOfDestinationPage("GB")

      And("I choose radio option Normal on the What type of procedure are you using? page")
        // Possible match (best=0.80)
        andIchooseRadioOptionXOnTheWhatTypeOfProcedureAreYouUsingPage("")
        // --- Other possible matches ---
        // andIchooseRadioOptionXOnTheWhichTypeOfProcedureAreYouUsingPage() [0.76] (PreTaskListStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Which type of procedure are you using\?' page

      And("I enter GB123456789000 on the consignee eori tin page")
        // Possible match (best=1.00)
        andIenterOnTheConsigneeEoriTinPage("GB123456789000")

      And("I choose radio option Designated destination on the arrival location of goods type page")
        // Possible match (best=1.00)
        andIchooseRadioOptionXOnTheArrivalLocationOfGoodsTypePage("Designated destination")

      And("I choose radio option Customs office identifier on the arrival location of goods identification page")
        // Possible match (best=1.00)
        andIchooseRadioOptionXOnTheArrivalLocationOfGoodsIdentificationPage("Customs office identifier")

      And("I select GB on the arrival location of goods customs office identification page")
        // Possible match (best=1.00)
        andIselectOnTheArrivalLocationOfGoodsCustomsOfficeIdentificationPage("GB")

      And("I submit on the Check your answers section Arrivals page")
        // Possible match (best=1.00)
        andIsubmitOnTheCheckYourAnswersSectionXPage("Arrivals")

      And("I click the Check the status of arrival notifications link on the Arrival notification sent page")
        // Possible match (best=1.00)
        andIclickTheLinkOnTheArrivalNotificationSentPage("Check the status of arrival notifications")

      And("I should be on the Arrival notifications page")
        // Possible match (best=1.00)
        thenIShouldBeOnTheArrivalNotificationsPage()

      And("I sign out")
        // Possible match (best=1.00)
        andISignOut()

    }

    Scenario("03 - Normal - Coordinates w/ contact") {
      When("I select GB on the arrival office of destination page")
        // Possible match (best=1.00)
        andIselectOnTheArrivalOfficeOfDestinationPage("GB")

      And("I choose radio option Normal on the What type of procedure are you using? page")
        // Possible match (best=0.80)
        andIchooseRadioOptionXOnTheWhatTypeOfProcedureAreYouUsingPage("")
        // --- Other possible matches ---
        // andIchooseRadioOptionXOnTheWhichTypeOfProcedureAreYouUsingPage() [0.76] (PreTaskListStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Which type of procedure are you using\?' page

      And("I enter GB123456789000 on the consignee eori tin page")
        // Possible match (best=1.00)
        andIenterOnTheConsigneeEoriTinPage("GB123456789000")

      And("I choose radio option Approved place on the arrival location of goods type page")
        // Possible match (best=1.00)
        andIchooseRadioOptionXOnTheArrivalLocationOfGoodsTypePage("Approved place")

      And("I choose radio option Coordinates on the arrival location of goods identification page")
        // Possible match (best=1.00)
        andIchooseRadioOptionXOnTheArrivalLocationOfGoodsIdentificationPage("Coordinates")

      And("I enter 50.96622 and 1.86201 on the arrival location of goods coordinates page")
        // Possible match (best=1.00)
        andIenterAndOnTheArrivalLocationOfGoodsCoordinatesPage("50.96622", "1.86201")

      And("I choose radio option Yes on the arrival location of goods add contact page")
        // Possible match (best=1.00)
        andIchooseRadioOptionXOnTheArrivalLocationOfGoodsAddContactPage("Yes")

      And("I enter John Joe on the arrival location of goods contact page")
        // Possible match (best=1.00)
        andIenterOnTheArrivalLocationOfGoodsContactPage("John Joe")

      And("I enter +44 2345 82 83 on the arrival location of goods contact number page")
        // Possible match (best=1.00)
        andIenterOnTheArrivalLocationOfGoodsContactNumberPage("+44 2345 82 83")
        // --- Other possible matches ---
        // andIenterOnTheArrivalLocationOfGoodsContactPage() [0.79] (LocationOfGoodsStepDefSteps.scala) pattern: (?:I )?enter (.+) on the arrival location of goods contact page

      And("I submit on the Check your answers section Arrivals page")
        // Possible match (best=1.00)
        andIsubmitOnTheCheckYourAnswersSectionXPage("Arrivals")

      And("I should be on the Arrival notification sent page")
        // Possible match (best=1.00)
        thenIshouldbeOnTheArrivalNotificationSentPage()

      And("I sign out")
        // Possible match (best=1.00)
        andISignOut()

    }

    Scenario("04 - User cannot re-enter their Arrival notification after submission") {
      When("I select GB on the arrival office of destination page")
        // Possible match (best=1.00)
        andIselectOnTheArrivalOfficeOfDestinationPage("GB")

      And("I choose radio option Simplified on the What type of procedure are you using? page")
        // Possible match (best=0.80)
        andIchooseRadioOptionXOnTheWhatTypeOfProcedureAreYouUsingPage("")
        // --- Other possible matches ---
        // andIchooseRadioOptionXOnTheWhichTypeOfProcedureAreYouUsingPage() [0.76] (PreTaskListStepDefSteps.scala) pattern: (?:I )?choose radio option (.*) on the 'Which type of procedure are you using\?' page

      And("I enter GB123456789000 on the consignee eori tin page")
        // Possible match (best=1.00)
        andIenterOnTheConsigneeEoriTinPage("GB123456789000")

      And("I enter XIACT24A7770003 on the authorisations reference number page")
        // Possible match (best=1.00)
        andIenterOnTheAuthorisationsReferenceNumberPage("XIACT24A7770003")
        // --- Other possible matches ---
        // andIenterXOnTheEnterTheAdditionalReferenceNumberPage() [0.79] (ItemDetailsStepDefSteps.scala) pattern: (?:I )?enter (.*) on the 'Enter the additional reference number' page
        // andIenterOnTheWhatIsTheReferencePage() [0.78] (Departure_GuaranteeDetailsStepDefSteps.scala) pattern: (?:I )?enter (.+) on the 'What is the reference\?' page
        // andIenterOnTheMovementReferenceNumberPage() [0.77] (IdentificationStepDefSteps.scala) pattern: (?:I )?enter (.+) on the Movement Reference Number page

      And("I enter XI DES BT1 3ET on the arrival location of goods authorisation number page")
        // Possible match (best=1.00)
        andIenterOnTheArrivalLocationOfGoodsAuthorisationNumberPage("XI DES BT1 3ET")
        // --- Other possible matches ---
        // andIenterOnTheArrivalLocationOfGoodsContactNumberPage() [0.79] (LocationOfGoodsStepDefSteps.scala) pattern: (?:I )?enter (.+) on the arrival location of goods contact number page
        // andIenterOnTheArrivalLocationOfGoodsContactPage() [0.79] (LocationOfGoodsStepDefSteps.scala) pattern: (?:I )?enter (.+) on the arrival location of goods contact page
        // andIenterXOnTheEnterADescriptionOfItemXPage() [0.78] (ItemDetailsStepDefSteps.scala) pattern: (?:I )?enter (.*) on the 'Enter a description of item (.*)' page
        // andIenterOnTheWhatIsTheAuthorisationNumberForTheLocationOfGoodsPage() [0.76] (RouteDetailsLocationOfGoodsStepDefSteps.scala) pattern: (?:I )?enter (.+) on the 'What is the authorisation number for the location of goods\?' page

      And("I choose radio option Yes on the arrival location of goods add contact page")
        // Possible match (best=1.00)
        andIchooseRadioOptionXOnTheArrivalLocationOfGoodsAddContactPage("Yes")

      And("I enter John Joe on the arrival location of goods contact page")
        // Possible match (best=1.00)
        andIenterOnTheArrivalLocationOfGoodsContactPage("John Joe")

      And("I enter +44 2345 82 83 on the arrival location of goods contact number page")
        // Possible match (best=1.00)
        andIenterOnTheArrivalLocationOfGoodsContactNumberPage("+44 2345 82 83")
        // --- Other possible matches ---
        // andIenterOnTheArrivalLocationOfGoodsContactPage() [0.79] (LocationOfGoodsStepDefSteps.scala) pattern: (?:I )?enter (.+) on the arrival location of goods contact page

      And("I submit on the Check your answers section Arrivals page")
        // Possible match (best=1.00)
        andIsubmitOnTheCheckYourAnswersSectionXPage("Arrivals")

      And("I click the Make another arrival notification link on the Arrival notification sent page")
        // Possible match (best=1.00)
        andIclickTheLinkOnTheArrivalNotificationSentPage("Make another arrival notification")

      And("I should be on the What is the Movement Reference Number page")
        // Possible match (best=1.00)
        thenIshouldbeOnTheWhatIsTheMovementReferenceNumberPage()

      And("I enter 29GBQHFCG83AJEB0K1 on the Movement Reference Number page")
        // Possible match (best=1.00)
        andIenterOnTheMovementReferenceNumberPage("29GBQHFCG83AJEB0K1")

      And("I should see an error on the What is the Movement Reference Number page")
        // Possible match (best=1.00)
        thenIshouldseeAnErrorOnTheWhatIsTheMovementReferenceNumberPage()

      And("I sign out")
        // Possible match (best=1.00)
        andISignOut()

    }
  }
}
