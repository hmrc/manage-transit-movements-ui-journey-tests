package uk.gov.hmrc.test.ui.cucumber.stepdefs.Arrivals

import uk.gov.hmrc.test.ui.cucumber.stepdefs.BaseStepDef
import uk.gov.hmrc.test.ui.pages.Arrival.Confirmation.ConfirmationPage

class ConfirmationStepDef extends BaseStepDef {

  And("""^(?:I )?click the (.+) link on the Arrival notification sent page$""") { (answer: String) =>
    ConfirmationPage
      .loadPage()
      .selectNotificationLink(answer)
  }

  And("""^I sign out$""") { () =>
    ConfirmationPage
      .selectSignOutLink("Sign out")
  }

  Then("""^(?:I )?(?:should )?be on the Arrival notification sent page$""") { () =>
    ConfirmationPage
      .loadPage()
  }

}

