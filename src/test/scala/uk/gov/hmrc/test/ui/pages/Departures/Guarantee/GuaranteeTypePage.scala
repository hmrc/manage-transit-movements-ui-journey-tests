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

package uk.gov.hmrc.test.ui.pages.Departures.Guarantee

import uk.gov.hmrc.test.ui.pages.RadioPage

object GuaranteeTypePage extends RadioPage {

  override def title(args: String*): String = "Which type of guarantee is it?"

  override def select(answer: String): this.type = {
    val value = answer match {
      case "(0) Guarantee waiver"                                                                   =>
        "0"
      case "(1) Comprehensive guarantee"                                                            =>
        "1"
      case "(2) Individual guarantee as an undertaking by a guarantor"                              =>
        "2"
      case "(3) Individual guarantee in cash"                                                       =>
        "3"
      case "(4) Individual guarantee in the form of vouchers"                                       =>
        "4"
      case "(5) Guarantee waiver – secured for 500 euros or less"                                   =>
        "5"
      case "(8) Guarantee not required – exempt public body"                                        =>
        "8"
      case "(9) Individual guarantee with multiple usage"                                           =>
        "9"
      case "(A) Guarantee waiver by agreement"                                                      =>
        "A"
      case "(R) Guarantee not required – goods carried on the Rhine, the Danube or their waterways" =>
        "R"
    }
    clickRadioBtn(value)
    this
  }
}
