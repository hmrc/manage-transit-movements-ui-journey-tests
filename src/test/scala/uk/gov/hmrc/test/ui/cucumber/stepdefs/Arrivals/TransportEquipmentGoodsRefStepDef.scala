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

package uk.gov.hmrc.test.ui.cucumber.stepdefs.Arrivals

import uk.gov.hmrc.test.ui.cucumber.stepdefs.BaseStepDef
import uk.gov.hmrc.test.ui.pages.Arrivals.IncidentTransportEquipment._
import uk.gov.hmrc.test.ui.pages.Arrivals.TransportEquipmentAndSeal.{RemoveGoodsItemNumberPage, RemoveTransportEquipmentPage}

class TransportEquipmentGoodsRefStepDef extends BaseStepDef {

  And("""^(?:I )?choose radio option (.*) on the Do you want to add a goods item number page$""") {
    (answer: String) =>
      AddGoodsItemNumberPage
        .loadPage()
        .select(answer)
        .submitPage()
  }

  And("""^(?:I )?enter (.*) on the What is the goods item number? page$""") {
    (answer: String) =>
      GoodsItemNumberPage
        .loadPage()
        .fillInput(answer)
        .submitPage()
  }

  And("""^(?:I )?choose radio option (.*) on the You have added (.*) goods item numbers? page$""") {
    (answer: String, numberOfGoodsItems: String) =>
      AddAnotherGoodsItemNumberPage
        .loadPage(numberOfGoodsItems)
        .select(answer)
        .submitPage()
  }

  And("""^(?:I )?click the (.*) link on the You have added (.*) goods item numbers? page$""") {
    (sectionLink: String, numberOfGoodsItems: String) =>
      AddAnotherGoodsItemNumberPage
        .loadPage(numberOfGoodsItems)
        .clickByPartialLinkText(sectionLink)
  }

  And("""^(?:I )?click radio option (.*) on the Are you sure you want to remove goods item number (.*) page$""") {
    (answer: String, numberOfGoodsItems: String) =>
      RemoveGoodsItemNumberPage
        .loadPage(numberOfGoodsItems)
        .select(answer)
        .submitPage()
  }

  And("""^(?:I )?choose radio option (.*) on the You have added (.*) transport equipment page$""") {
    (answer: String, numberOfTransportEquipment: String) =>
      AddAnotherTransportEquipmentPage
        .loadPage(numberOfTransportEquipment)
        .select(answer)
        .submitPage()
  }

  And("""^(?:I )?click the (.*) link on the You have added (.*) transport equipment page$""") {
    (sectionLink: String, numberOfTransportEquipment: String) =>
      AddAnotherTransportEquipmentPage
        .loadPage(numberOfTransportEquipment)
        .clickByPartialLinkText(sectionLink)
  }

  And("""^(?:I )?click radio option (.*) on the Are you sure you want to remove transport equipment (.*) page$""") {
    (answer: String, numberOfTransportEquipment: String) =>
      RemoveTransportEquipmentPage
        .loadPage(numberOfTransportEquipment)
        .select(answer)
        .submitPage()
  }
}
