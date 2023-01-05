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

package uk.gov.hmrc.test.ui.pages.RouteDetails.Exit

import uk.gov.hmrc.test.ui.pages.YesNoPage

object AddAnotherOfficeOfExitPage extends YesNoPage {

  override def title(args: String*): String = args match {
    case Seq("1") => "You have added 1 office of exit"
    case _        => String.format("You have added %s offices of exit", args: _*)
  }
}
