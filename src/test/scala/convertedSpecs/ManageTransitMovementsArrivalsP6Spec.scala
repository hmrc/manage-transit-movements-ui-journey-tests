import org.scalatest.matchers.should.Matchers
import org.scalatest.GivenWhenThen
import org.scalatest.featurespec.AnyFeatureSpec



class ManageTransitMovementsArrivalsP6Spec extends AnyFeatureSpec with GivenWhenThen {

  Feature("Manage transit movements frontend tests for Arrivals") {

    Scenario("01 - Trader is able to view and make unloading remarks") {
      When("I submit an Phase6 IE007 Arrival Notification")
        // Possible match (best=1.00)
        givenIsubmitAFile("Phase6 IE007 Arrival Notification")

      And("I submit an IE043 Unloading Permission With Seals")
        // Possible match (best=1.00)
        givenIsubmitAFile("IE043 Unloading Permission With Seals")

      When("I click on the View arrival notifications link on the Manage your transit movements page")
        // Possible match (best=0.95)
        givenIclickOnTheLinkOnTheManageYourTransitMovementsPage("")
        // --- Other possible matches ---
        // givenIClickOnTheLinkOnTheArrivalNotificationsPage() [0.79] (ArrivalNotificationsStepDefSteps.scala) pattern: (?:I )?click on the (.+) link on the 'Arrival notifications' page

      And("I click on the Make unloading remarks link for MRN 25GB000246TK0E6WJ1 on the Arrival notifications page")
        // Possible match (best=0.90)
        andIClickOnTheXLinkForMRNXOnTheArrivalNotificationsPage("", "")
        // --- Other possible matches ---
        // givenIClickOnTheLinkOnTheArrivalNotificationsPage() [0.79] (ArrivalNotificationsStepDefSteps.scala) pattern: (?:I )?click on the (.+) link on the 'Arrival notifications' page

      Then("I should be on the Do you want to use the revised unloading procedure? page")
        // ⚠️ No step-def match found for: I should be on the Do you want to use the revised unloading procedure? page

      And("I sign out")
        // Possible match (best=1.00)
        andISignOut()

    }

    Scenario("02 - Trader is able to view unloading remarks for all errors") {
      When("I submit an Phase6 IE007 Arrival Notification")
        // Possible match (best=1.00)
        givenIsubmitAFile("Phase6 IE007 Arrival Notification")

      And("I submit an IE043 Unloading Permission With Seals")
        // Possible match (best=1.00)
        givenIsubmitAFile("IE043 Unloading Permission With Seals")

      And("I submit an IE044 Unloading Remarks Notification With Seals")
        // Possible match (best=1.00)
        givenIsubmitAFile("IE044 Unloading Remarks Notification With Seals")

      And("I submit an IE057 Unloading Remarks Rejection")
        // Possible match (best=1.00)
        givenIsubmitAFile("IE057 Unloading Remarks Rejection")

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

      Then("I should be on the Review unloading remarks errors page")
        // Possible match (best=1.00)
        thenIshouldBeOnTheReviewUnloadingRemarksErrorsPage()

      And("I sign out")
        // Possible match (best=1.00)
        andISignOut()

    }

    Scenario("03 - Trader is able to view arrival notification rejections for all errors") {
      When("I submit an Phase6 IE007 Arrival Notification")
        // Possible match (best=1.00)
        givenIsubmitAFile("Phase6 IE007 Arrival Notification")

      And("I submit an IE057 Arrival Notification Rejection")
        // Possible match (best=1.00)
        givenIsubmitAFile("IE057 Arrival Notification Rejection")

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

      And("I sign out")
        // Possible match (best=1.00)
        andISignOut()

    }
  }
}
