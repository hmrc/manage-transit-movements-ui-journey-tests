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

package uk.gov.hmrc.test.ui.pages.Departures.PreTaskList

import uk.gov.hmrc.test.ui.pages.RadioPage

object SecurityDetailsPage extends RadioPage {

  override def title(args: String*): String = "What type of safety and security details do you need to add?"

  override def select(answer: String): this.type = {
    val securityTypeCSSValue = answer match {
      case "No security"                                            => "noSecurity"
      case "Entry summary declaration (ENS)"                        => "entrySummaryDeclaration"
      case "Exit summary declaration (EXS)"                         => "exitSummaryDeclaration"
      case "Both entry and exit summary declarations (ENS and EXS)" => "entryAndExitSummaryDeclaration"
    }
    clickRadioBtn(securityTypeCSSValue)
    this
  }

}