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

package uk.gov.hmrc.test.ui.cucumber.stepdefs.Manage

import uk.gov.hmrc.test.ui.cucumber.stepdefs.BaseStepDef
import uk.gov.hmrc.test.ui.pages.Manage.{DeleteDraftDeclarationsPage, DraftDepartureDelcarationsPage}

class DraftDepartureDeclarationsStepDef extends BaseStepDef {

  And("""^(?:I )?click on the link for LRN (.*) on the 'Draft departure declarations' page""") {
    (link: String) =>
      DraftDepartureDelcarationsPage
        .loadPage()
        .selectDraftDeclarationLink(link)
  }

  Given("""^(?:I )?click on the (.+) link on the 'Draft departure declarations' page$""") { (link: String) =>
    DraftDepartureDelcarationsPage
      .loadPage()
      .selectDraftDeclarationLink(link)
  }

  And("""^(?:I )?click radio option (.*) on the 'Are you sure you want to delete this declaration\?' page$""") {
    (answer: String) =>
      DeleteDraftDeclarationsPage
        .loadPage()
        .select(answer)
        .submitPage()
      }

  And("""^(?:I )?enter (.+) in the Search field on the 'Draft departure declarations' page$""") {
    (searchString: String) =>
      DraftDepartureDelcarationsPage
        .loadPage()
        .fillInput(searchString)
        .clickById("submit")
  }

  And("""^(?:I )?should see the content (.*) on the 'Draft departure declarations' page$""") {
    (content: String) =>
      DraftDepartureDelcarationsPage
        .loadPage()
        .checkForContent(content)
  }

}
