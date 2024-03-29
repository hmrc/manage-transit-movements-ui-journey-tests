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

package uk.gov.hmrc.test.ui.pages.Departures.Transport.Authorisations

import uk.gov.hmrc.test.ui.pages.RadioPage

object AuthorisationTypePage extends RadioPage {

  override def title(args: String*): String = "Which type of authorisation do you want to add?"

  override def select(answer: String): this.type = {
    val authorisationType = answer match {
      case "ACR" => "C521"
      case "SSE" => "C523"
      case "TRD" => "C524"
    }
    clickRadioBtn(authorisationType)
    this
  }
}
