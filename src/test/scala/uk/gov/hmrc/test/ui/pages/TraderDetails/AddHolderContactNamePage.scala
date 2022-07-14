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

package uk.gov.hmrc.test.ui.pages.TraderDetails

import uk.gov.hmrc.test.ui.pages.BasePage

object AddHolderContactNamePage extends BasePage {

  val holderContactPersonNameTitle = "What is the contact’s name? - Manage your transit movements - GOV.UK"

  def loadPage: this.type = {
    onPage(holderContactPersonNameTitle)
    this
  }

  def enterContactPersonNameValue(holderContactName: String): this.type = {
    onPage(holderContactPersonNameTitle)
    fillInputById("value", holderContactName);
    this;
  }

}
