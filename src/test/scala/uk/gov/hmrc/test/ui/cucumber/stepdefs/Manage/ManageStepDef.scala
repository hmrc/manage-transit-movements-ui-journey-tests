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
import uk.gov.hmrc.test.ui.pages.Manage.ManageDepartures.{ForYourSecuritySignedOutPage, GoodsUnderControlDocumentsRequestedPage, GoodsUnderControlPage, PreLodgedGoodsUnderControlPage}
import uk.gov.hmrc.test.ui.pages.Manage._
import uk.gov.hmrc.test.ui.utils.ApiHelper

class ManageStepDef extends BaseStepDef {

  Given("""^(?:I )?submit an (.+)$""") {
    (filename: String) =>
      ApiHelper.insertXML(filename)
  }

  Then("""^(?:I )?should be on the 'Manage your transit movements' page$""") {
    () =>
      ManageTransitMovementsPage
        .loadPage()
  }

  Given("""^(?:I )?click on the (.+) link on the 'Manage your transit movements' page$""") {
    (link: String) =>
      ManageTransitMovementsPage
        .loadPage()
        .selectAction(link)
  }

  Then("""^(?:I )?should be on the 'Goods under control - document requested' page$""") {
    () =>
      GoodsUnderControlDocumentsRequestedPage
        .loadPage()
  }

  Then("""^(?:I )?should be on the 'Goods under control' page$""") {
    () =>
      GoodsUnderControlPage
        .loadPage()
  }

  Then("""^(?:I )?should be on the 'Intention to control - complete pre-lodged declaration' page$""") {
    () =>
      PreLodgedGoodsUnderControlPage
        .loadPage()
  }

  Then("""^(?:I )?should be on the 'For your security we signed you out' page$""") {
    () =>
      ForYourSecuritySignedOutPage
        .loadPage()
  }

}
