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

object ProcedureTypePage extends BasePage {

  val procedureTypeTitle = "What type of procedure are you using? - Manage your transit movements - GOV.UK"

  def loadPage: this.type = {
    onPage(procedureTypeTitle)
    this
  }

  def selectWhatTypeOfProcedure(procedureTypeSelected: String): this.type = {
    onPage(procedureTypeTitle)
    procedureTypeSelected match {
      case "Normal"     => clickRadioBtn(procedureTypeSelected.toLowerCase());
      case "Simplified" => clickRadioBtn(procedureTypeSelected.toLowerCase());
    }
    this
  }

}
