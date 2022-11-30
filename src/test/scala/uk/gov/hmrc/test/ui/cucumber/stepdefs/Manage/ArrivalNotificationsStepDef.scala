package uk.gov.hmrc.test.ui.cucumber.stepdefs.Manage

import uk.gov.hmrc.test.ui.cucumber.stepdefs.BaseStepDef
import uk.gov.hmrc.test.ui.pages.Manage.ArrivalNotificationsPage

class ArrivalNotificationsStepDef extends BaseStepDef {

   Then("""^(?:I )?(?:should )?be on the Arrival notifications page$""") { () =>
    ArrivalNotificationsPage
      .loadPage()
  }

}
