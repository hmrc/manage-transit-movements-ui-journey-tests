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

package uk.gov.hmrc.test.ui.pages.RouteDetails.Transit

import uk.gov.hmrc.test.ui.pages.{DateTimePage, InvalidTitleArgsException}

object OfficeOfTransitEtaPage extends DateTimePage {

  override def title(args: String*): String = args match {
    case Seq(office, country) =>
      String.format(
        "When do you expect the transit to arrive in %s, %s? - Manage your transit movements - GOV.UK",
        office,
        country
      )
    case _                    =>
      throw InvalidTitleArgsException(s"Expected a country and office but got: $args")
  }
}
