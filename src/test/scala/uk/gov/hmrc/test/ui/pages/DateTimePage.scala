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

package uk.gov.hmrc.test.ui.pages

import java.time.LocalDateTime

trait DateTimePage extends StringPage {

  lazy val now: LocalDateTime = LocalDateTime.now()

  final val day: String    = now.getDayOfMonth.toString
  final val month: String  = now.getMonthValue.toString
  final val year: String   = now.getYear.toString
  final val hour: String   = now.getHour.toString
  final val minute: String = now.getMinute.toString

  def fillInputs(): this.type = {
    fillInputById("value.day", day)
    fillInputById("value.month", month)
    fillInputById("value.year", year)
    fillInputById("value.hour", hour)
    fillInputById("value.minute", minute)

    this
  }
}
