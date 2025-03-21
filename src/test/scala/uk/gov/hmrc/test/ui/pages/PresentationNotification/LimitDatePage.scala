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

package uk.gov.hmrc.test.ui.pages.PresentationNotification

import uk.gov.hmrc.test.ui.pages.DatePage

import java.time.LocalDateTime

object LimitDatePage extends DatePage {

  override def title(args: String*): String = String.format("When do you expect the transit to arrive in %s?", args: _*)

  override lazy val now: LocalDateTime = LocalDateTime.now().plusDays(2)

  override def fillInputs(): this.type = {
    fillInputById("value.day", day)
    fillInputById("value.month", month)
    fillInputById("value.year", year)

    this
  }

}
