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

object DeclarationTypePage extends BasePage {

  val declarationTypeTitle = "What declaration do you want to create? - Manage your transit movements - GOV.UK"

  def loadPage: this.type = {
    onPage(declarationTypeTitle)
    this
  }
  def selectDeclarationType(declarationTypeSelected: String): this.type = {
    declarationTypeSelected match {
      case "T1"  => clickRadioBtn(declarationTypeSelected);
      case "T2"  => clickRadioBtn(declarationTypeSelected);
      case "T2F" => clickRadioBtn(declarationTypeSelected);
      case "T"   => clickRadioBtn(declarationTypeSelected);
    }
    this
  }

}
