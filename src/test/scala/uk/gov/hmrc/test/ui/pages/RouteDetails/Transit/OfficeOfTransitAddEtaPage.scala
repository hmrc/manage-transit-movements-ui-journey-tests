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

package uk.gov.hmrc.test.ui.pages.RouteDetails.Transit

import uk.gov.hmrc.test.ui.pages.BasePage

object OfficeOfTransitAddEtaPage extends BasePage {

  def checkOfficeOfTransitAddEtaTitle(etaOffice: String): Unit =
    etaOffice match {
      case "Paris" =>
        onPage(f"Do you want to add a time of arrival in Paris (FR001260)? - Manage your transit movements - GOV.UK")
      case "BOSTON" =>
        onPage(f"Do you want to add a time of arrival in BOSTON (GB000244)? - Manage your transit movements - GOV.UK")
      case "Bari" =>
        onPage(f"Do you want to add a time of arrival in Bari (IT018100)? - Manage your transit movements - GOV.UK")
    }

  def selectOfficeOfTransitAddEta(answer: String): this.type = {
    answer match {
      case "Yes" => clickById("value");
      case "No"  => clickById("value-no");
    }
    this
  }
}