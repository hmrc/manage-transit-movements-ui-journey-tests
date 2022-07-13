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

package uk.gov.hmrc.test.ui.pages

import uk.gov.hmrc.test.ui.conf.TestConfiguration
import uk.gov.hmrc.test.ui.pages.PreTaskList.LocalReferenceNumberPage

object ManageTransitMovementsHomePage extends BasePage {
  val url: String                    = TestConfiguration.url("manage-transit-movements-frontend") + "/what-do-you-want-to-do"
  val manageTransitMovementsHubTitle = "Manage your transit movements - GOV.UK - Manage your transit movements - GOV.UK"

  def loadPage: this.type = {
    driver.navigate().to(url)
    onPage(manageTransitMovementsHubTitle)
    this
  }

  def selectAction(link: String): LocalReferenceNumberPage.type = {
    link match {
      case "Make a departure declaration" => clickById("make-departure-declaration")
      case "Make an arrival notification" => clickById("make-arrival-notification")
      case "Check your guarantee balance" => clickById("check-guarantee-balance")
      // case _                              => "Something went wrong"
    }
    LocalReferenceNumberPage
  }
}
