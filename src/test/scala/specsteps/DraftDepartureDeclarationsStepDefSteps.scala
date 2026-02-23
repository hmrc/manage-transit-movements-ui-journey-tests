/*
 * Copyright 2026 HM Revenue & Customs
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

import uk.gov.hmrc.test.ui.cucumber.stepdefs.BaseStepDef
import uk.gov.hmrc.test.ui.pages.Manage.{ManageFEDeleteDraftDeclarationsPage, ManagedFEDraftDepartureDelcarationsPage}

object DraftDepartureDeclarationsStepDefSteps {

  // ^(?:I )?click on the link for LRN (.*) on the 'Draft departure declarations' page
  def andIclickOnTheLinkForLRNXOnTheDraftDepartureDeclarationsPage(link: String): Unit =
    ManagedFEDraftDepartureDelcarationsPage
      .loadPage()
      .selectDraftDeclarationLink(link)

  // ^(?:I )?click on the (.+) link on the 'Draft departure declarations' page$
  def givenIclickOnTheLinkOnTheDraftDepartureDeclarationsPage(link: String): Unit =
    ManagedFEDraftDepartureDelcarationsPage
      .loadPage()
      .selectDraftDeclarationLink(link)

  // ^(?:I )?click radio option (.*) on the 'Are you sure you want to delete this declaration\?' page$
  def andIclickRadioOptionXOnTheAreYouSureYouWantToDeleteThisDeclarationPage(answer: String): Unit =
    ManageFEDeleteDraftDeclarationsPage
      .loadPage()
      .select(answer)
      .submitPage()

  // ^(?:I )?enter (.+) in the Search field on the 'Draft departure declarations' page$
  def andIenterInTheSearchFieldOnTheDraftDepartureDeclarationsPage(searchString: String): Unit =
    ManagedFEDraftDepartureDelcarationsPage
      .loadPage()
      .fillInput(searchString)
      .clickById("submit")

  // ^(?:I )?should see the content (.*) on the 'Draft departure declarations' page$
  def andIshouldSeeTheContentXOnTheDraftDepartureDeclarationsPage(content: String): Unit =
    ManagedFEDraftDepartureDelcarationsPage
      .loadPage()
      .checkForContent(content)

}
