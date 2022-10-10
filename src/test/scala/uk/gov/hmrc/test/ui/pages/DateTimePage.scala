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

trait DateTimePage extends DatePage {

  final val hour: String   = now.getHour.toString
  final val minute: String = now.getMinute.toString

  override def fillInputs(): this.type = {
    fillInputById("dateDay", day)
    fillInputById("dateMonth", month)
    fillInputById("dateYear", year)
    fillInputById("timeHour", hour)
    fillInputById("timeMinute", minute)

    this
  }
}
