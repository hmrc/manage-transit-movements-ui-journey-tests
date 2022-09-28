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

package uk.gov.hmrc.test.ui.pages.TraderDetails.TransitHolder

import uk.gov.hmrc.test.ui.pages.Page

object HolderAddressPage extends Page {

  override def title(args: String*): String =
    "What is the transit holder’s address? - Manage your transit movements - GOV.UK"

  def enterHolderAddress: this.type = {
    fillInAddress("1 Church lane", "Godrics Hollow", "BA1 0AA", "United Kingdom")
    this
  }

}
