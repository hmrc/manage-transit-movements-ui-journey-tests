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

import uk.gov.hmrc.test.ui.pages.{RadioPage, YesNoPage}

object TypeOfAuthorisationPage extends YesNoPage {

  override def title(args: String*): String = "Which type of authorisation do you want to add?"

  override def select(answer: String): this.type = {
    val typeOfAuthorisation = answer match {
      case "ACR authorisation" => "ACR"
      case "SSE authorisation" => "SSE"
      case "TRD authorisation" => "TRD"
    }
    clickRadioBtn(typeOfAuthorisation)
    this
  }

}
