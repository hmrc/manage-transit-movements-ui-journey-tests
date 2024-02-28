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

package uk.gov.hmrc.test.ui.pages.Unloading

import uk.gov.hmrc.test.ui.pages.Page

object DeclarationSummaryPage extends Page {

  override def title(args: String*): String = "Cross-check the transit with this declaration summary"

  def selectAction(link: String): this.type = {
    link match {
      case "More details"        => clickById("view_link.id")
      case "House consignment 1" => clickById("houseConsignment1")
      case "House consignments"  => clickById("houseConsignments")
    }
    this
  }

}
