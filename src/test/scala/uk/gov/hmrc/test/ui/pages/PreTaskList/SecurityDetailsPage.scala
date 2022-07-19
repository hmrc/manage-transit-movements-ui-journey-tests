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

package uk.gov.hmrc.test.ui.pages.PreTaskList

import uk.gov.hmrc.test.ui.pages.BasePage

object SecurityDetailsPage extends BasePage {

  val securityDetailsTitle =
    "What type of safety and security details do you need to add? - Manage your transit movements - GOV.UK"
  var securityTypeCSSValue = "";

  def loadPage: this.type = {
    onPage(securityDetailsTitle)
    this
  }
  def selectDeclarationType(securityTypeSelected: String): this.type = {
    securityTypeSelected match {
      case "No security"                                            =>
        securityTypeCSSValue = "noSecurity"
        clickRadioBtn(securityTypeCSSValue);
      case "Entry summary declaration (ENS)"                        =>
        securityTypeCSSValue = "entrySummaryDeclaration"
        clickRadioBtn(securityTypeCSSValue);
      case "Exit summary declaration (EXS)"                         =>
        securityTypeCSSValue = "exitSummaryDeclaration"
        clickRadioBtn(securityTypeCSSValue);
      case "Both entry and exit summary declarations (ENS and EXS)" =>
        securityTypeCSSValue = "entryAndExitSummaryDeclaration"
        clickRadioBtn(securityTypeCSSValue);
    }
    this
  }

}
