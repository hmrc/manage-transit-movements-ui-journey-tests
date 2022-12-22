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

package uk.gov.hmrc.test.ui.cucumber.stepdefs.Manage

import uk.gov.hmrc.test.ui.cucumber.stepdefs.BaseStepDef
import uk.gov.hmrc.test.ui.pages.Manage.DepartureDeclarationsPage

class DepartureDeclarationsStepDef extends BaseStepDef {

   Then("""^(?:I )?(?:should )?be on the Departure declarations page$""") { () =>
    DepartureDeclarationsPage
      .loadPage()
  }

  And("""^(?:I )?click on the (.*) link for LRN (.*) on the Departure declarations page""") {
    (linkText: String, lrn: String) =>
      DepartureDeclarationsPage
        .loadPage()
        .selectDepartureAction(linkText, lrn)
  }

  Given("""^(?:I )?click on the (.+) link on the Departure declarations page$""") { (link: String) =>
    DepartureDeclarationsPage
      .loadPage()
      .selectAction(link)
  }

  And("""^(?:I )?enter (.+) in the Search field on the Departure declarations page$""") {
    (searchString: String) =>
    DepartureDeclarationsPage
      .loadPage()
      .fillInput(searchString)
      .clickById("submit")
  }

  And("""^(?:I )?should see the content (.*) on the Departure declarations page$""") {
    (content: String) =>
    DepartureDeclarationsPage
      .loadPage()
    .checkForContent(content)
  }
}
