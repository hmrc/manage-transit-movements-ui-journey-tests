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
import uk.gov.hmrc.test.ui.pages.Manage.{ArrivalNotificationRejectionLessThan10ErrorsPage, ArrivalNotificationRejectionMoreThan10ErrorsPage, ArrivalNotificationsPage, ArrivalRejectionPage}

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

  Given("""^(?:I )?click on the (.+) link on the 'Arrival notifications' page$""") { (link: String) =>
    ArrivalNotificationsPage
      .loadPage()
      .selectAction(link)
  }

  And("""^(?:I )?enter (.+) in the Search field on the 'Arrival notifications' page$""") {
    (searchString: String) =>
    ArrivalNotificationsPage
        .loadPage()
        .fillInput(searchString)
        .clickById("submit")
  }
  And("""^(?:I )?should see the content (.*) on the 'Arrival notifications' page$""") {
    (content: String) =>
    ArrivalNotificationsPage
      .loadPage()
      .checkForContent(content)
  }

  Given("""^(?:I )?click on the (.+) link on the 'There is a problem with this arrival notification' page$""") { (link: String) =>
    ArrivalRejectionPage
      .loadPage()
      .selectAction(link)
  }

  And("""^(?:I )?should see the content (.*) on the 'There is a problem with this arrival notification' page$""") {
    (content: String) =>
      ArrivalRejectionPage
        .loadPage()
        .checkForContent(content)
  }

  Then("""^(?:I )?should be on the 'Review notification errors' page$""") { () =>
    ArrivalNotificationRejectionLessThan10ErrorsPage
      .loadPage()
  }

  Then("""^(?:I )?should be on the 'Notification errors' page$""") { () =>
    ArrivalNotificationRejectionMoreThan10ErrorsPage
      .loadPage()
  }


}
