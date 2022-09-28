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

import java.time.LocalDateTime

trait DateTimePage extends Page {

  def fillInputs(): this.type = {
    val dateAndTime = LocalDateTime.now

    val day    = dateAndTime.getDayOfMonth.toString
    val month  = dateAndTime.getMonthValue.toString
    val year   = dateAndTime.getYear.toString
    val hour   = dateAndTime.getHour.toString
    val minute = dateAndTime.getMinute.toString

    fillInputById("dateDay", day)
    fillInputById("dateMonth", month)
    fillInputById("dateYear", year)
    fillInputById("timeHour", hour)
    fillInputById("timeMinute", minute)

    this
  }
}
