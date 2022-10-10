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

trait DatePage extends StringPage {

  val now: LocalDateTime = LocalDateTime.now

  final val day: String   = now.getDayOfMonth.toString
  final val month: String = now.getMonthValue.toString
  final val year: String  = now.getYear.toString

  def fillInputs(): this.type = {
    fillInputById("value_day", day)
    fillInputById("value_month", month)
    fillInputById("value_year", year)

    this
  }
}
