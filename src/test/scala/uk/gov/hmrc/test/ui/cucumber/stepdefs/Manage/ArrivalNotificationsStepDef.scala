/*
 * Copyright 2023 HM Revenue & Customs
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

package uk.gov.hmrc.test.ui.cucumber.stepdefs.Manage

import uk.gov.hmrc.test.ui.cucumber.stepdefs.BaseStepDef
import uk.gov.hmrc.test.ui.pages.Manage.ManageArrivals._

class ArrivalNotificationsStepDef extends BaseStepDef {

  Then("""^(?:I )?(?:should )?be on the 'Arrival notifications' page$""") { () =>
    ArrivalNotificationsPage
      .loadPage()
  }

  And("""^(?:I )?click on the (.*) link for MRN (.*) on the 'Arrival notifications' page$""") {
    (linkText: String, mrn: String) =>
      ArrivalNotificationsPage
        .loadPage()
        .selectArrivalAction(linkText, mrn)
  }

  And("""^(?:I )?click on the Make unloading remarks on the 'Review unloading remarks errors' page$""") { () =>
    ReviewUnloadingRemarksErrorsPage
      .clickById("submit")
  }

  Given("""^(?:I )?click on the (.+) link on the 'Arrival notifications' page$""") { (link: String) =>
    ArrivalNotificationsPage
      .loadPage()
      .selectAction(link)
  }

  And("""^(?:I )?enter (.+) in the Search field on the 'Arrival notifications' page$""") { (searchString: String) =>
    ArrivalNotificationsPage
      .loadPage()
      .fillInput(searchString)
      .clickById("submit")
  }

  And("""^(?:I )?should see the content (.*) on the 'Arrival notifications' page$""") { (content: String) =>
    ArrivalNotificationsPage
      .loadPage()
      .checkForContent(content)
  }

  Then("""^(?:I )?should be on the 'Review notification errors' page$""") { () =>
    ReviewNotificationErrorsPage
      .loadPage()
  }

  Then("""^(?:I )?click on the Make another arrival notification link on the 'Review notification errors' page$""") {
    () =>
      ReviewNotificationErrorsPage
        .loadPage()
        .clickById("arrival-link")
  }

  Then("""^(?:I )?should be on the 'Notification errors' page$""") { () =>
    NotificationErrorsPage
      .loadPage()
  }

  Then("""^(?:I )?should be on the 'Review unloading remarks errors' page$""") { () =>
    ReviewUnloadingRemarksErrorsPage
      .loadPage()
  }

  Then("""^(?:I )?should be on the 'Unloading remarks errors' page$""") { () =>
    UnloadingRemarksErrors
      .loadPage()
  }

  Then("""^(?:I )?(?:should )?be on the 'This arrival notification is no longer available' page$""") { () =>
    ArrivalNotificationNotAvailablePage
      .loadPage()
  }

}
