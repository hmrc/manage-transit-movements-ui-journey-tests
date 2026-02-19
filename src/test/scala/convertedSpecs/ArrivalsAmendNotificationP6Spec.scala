import ArrivalNotificationsStepDefSteps.{andIClickOnTheXLinkForMRNXOnTheArrivalNotificationsPage, thenIShouldBeOnTheArrivalNotificationsPage, thenIShouldBeOnTheReviewNotificationErrorsPage}
import CYAStepDefSteps.andIsubmitOnTheCheckYourAnswersSectionXPage
import ConfirmationStepDefSteps.thenIshouldbeOnTheArrivalNotificationSentPage
import IdentificationStepDefSteps.andIenterOnTheMovementReferenceNumberPage
import LoginStepDefSteps.andILoginWithIDX
import CommonStepDefSteps.andISignOut
import PreTaskListStepDefSteps.whenTheUserHasSubmittedFileForMRNAndEORINumber
import ManageStepDefSteps.{givenIclickOnTheLinkOnTheManageYourTransitMovementsPage, givenIsubmitAFile}
import org.scalatest.GivenWhenThen
import org.scalatest.matchers.should.Matchers
import org.scalatest.featurespec.AnyFeatureSpec


class ArrivalsAmendNotificationP6Spec extends AnyFeatureSpec with GivenWhenThen{

  Feature("End to end journey for amending an arrival notification - Final") {

    Scenario("01 - Arrival rejected. Resubmit.") {
      Given("I login with ID 1234567890")
        // Possible match (best=1.00)
        andILoginWithIDX("1234567890")

      When("I submit an Phase6 IE007 Arrival Notification")
        // Possible match (best=1.00)
        givenIsubmitAFile("Phase6 IE007 Arrival Notification")

      And("I submit an IE057 Arrival Notification Rejection")
        // Possible match (best=1.00)
        givenIsubmitAFile("IE057 Arrival Notification Rejection")

      And("the user has submitted arrivalNotification.json for MRN 25GB000246TK0E6WJ1 and EORI number 1234567890")
        // Possible match (best=1.00)
        whenTheUserHasSubmittedFileForMRNAndEORINumber("arrivalNotification.json", "25GB000246TK0E6WJ1", "1234567890")

      When("I click on the View arrival notifications link on the Manage your transit movements page")
        // Possible match (best=0.95)
        givenIclickOnTheLinkOnTheManageYourTransitMovementsPage("")
        // --- Other possible matches ---
        // givenIClickOnTheLinkOnTheArrivalNotificationsPage() [0.79] (ArrivalNotificationsStepDefSteps.scala) pattern: (?:I )?click on the (.+) link on the 'Arrival notifications' page

      Then("I should be on the Arrival notifications page")
        // Possible match (best=1.00)
        thenIShouldBeOnTheArrivalNotificationsPage()

      And("I click on the View errors link for MRN 25GB000246TK0E6WJ1 on the Arrival notifications page")
        // Possible match (best=0.90)
        andIClickOnTheXLinkForMRNXOnTheArrivalNotificationsPage("", "")
        // --- Other possible matches ---
        // givenIClickOnTheLinkOnTheArrivalNotificationsPage() [0.79] (ArrivalNotificationsStepDefSteps.scala) pattern: (?:I )?click on the (.+) link on the 'Arrival notifications' page

      Then("I should be on the Review notification errors page")
        // Possible match (best=1.00)
        thenIShouldBeOnTheReviewNotificationErrorsPage()

      And("I click on the Make another arrival notification link on the Review notification errors page")
        // Possible match (best=1.00)
        ArrivalNotificationsStepDefSteps.thenIclickOnTheMakeAnotherArrivalNotificationLinkOnTheReviewNotificationErrorsPage()

      And("I enter 25GB000246TK0E6WJ1 on the Movement Reference Number page")
        // Possible match (best=1.00)
        andIenterOnTheMovementReferenceNumberPage("25GB000246TK0E6WJ1")

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
  }
}
