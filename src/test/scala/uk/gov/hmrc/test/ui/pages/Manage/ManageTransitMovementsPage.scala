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

package uk.gov.hmrc.test.ui.pages.Manage

import uk.gov.hmrc.test.ui.conf.TestConfiguration
import uk.gov.hmrc.test.ui.pages.Page

object ManageTransitMovementsPage extends Page {

  override def title(args: String*): String = "Manage your transit movements"

  override def loadPage(args: String*): this.type = {
    val url: String = TestConfiguration.url("manage-transit-movements-frontend") + "/what-do-you-want-to-do"
    driver.navigate().to(url)
    super.loadPage(args: _*)
  }

  def selectAction(link: String): this.type = {
    link match {
      case "Make an arrival notification"      => clickById("make-arrival-notification")
      case "View arrival notifications"        => clickById("view-arrival-notifications")
      case "Make a departure declaration"      => clickById("make-departure-declaration")
      case "View departure declarations"       => clickById("view-departure-declarations")
      // TODO remove NCTS 5 links 1 July
      case "View NCTS 5 arrival notifications"  => clickById("view-ncts-5-arrival-notifications")
      case "View NCTS 5 departure declarations"  => clickById("view-ncts-5-departure-declarations")
      case "Check your guarantee balance"      => clickById("check-guarantee-balance")
      case "View draft departure declarations" => clickById("view-draft-departures")
    }
    this
  }
}
