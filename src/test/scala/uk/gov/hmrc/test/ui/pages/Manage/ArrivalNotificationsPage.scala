/*
 * Copyright 2022 HM Revenue & Customs
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

import uk.gov.hmrc.test.ui.pages.StringPage

object ArrivalNotificationsPage extends StringPage {

   override def title(args: String*): String = "Arrival notifications"

  def selectAction(link: String): this.type = {
    link match {
      case "Make an arrival notification" => clickById("make-arrival-notification")
      case "Go to manage transit movements"  => clickById("go-to-manage-transit-movements")
      case "View all movements"  => clickById("go-to-view-all-movements")
    }
    this
  }

  def selectArrivalAction(linkText: String, mrn: String): Unit = {
    val id = s"${linkText.replace (" ", "-")}-$mrn"
    clickById (id)
  }

}
