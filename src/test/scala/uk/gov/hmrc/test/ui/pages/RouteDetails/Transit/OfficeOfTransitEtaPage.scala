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

import org.openqa.selenium.By
import uk.gov.hmrc.test.ui.pages.BasePage
import uk.gov.hmrc.test.ui.pages.RouteDetails.Transit.OfficeOfTransitAddEtaPage.onPage

import java.time.LocalDateTime

object OfficeOfTransitEtaPage extends BasePage {

  def checkOfficeOfTransitEtaTitle(etaOffice: String): Unit = {
    onPage(f"When do you expect the transit to arrive in $etaOffice? - Manage your transit movements - GOV.UK");
  }

  def fillInNowDateAndTime(): Unit = {
    val dateAndTime = LocalDateTime.now

    val day    = dateAndTime.getDayOfMonth.toString;
    val month  = dateAndTime.getMonthValue.toString;
    val year   = dateAndTime.getYear.toString;
    val hour   = dateAndTime.getHour.toString;
    val minute = dateAndTime.getMinute.toString;

    sendKeys(By.id("dateDay"), day)
    sendKeys(By.id("dateMonth"), month)
    sendKeys(By.id("dateYear"), year)
    sendKeys(By.id("timeHour"), hour)
    sendKeys(By.id("timeMinute"), minute)
  }
}
