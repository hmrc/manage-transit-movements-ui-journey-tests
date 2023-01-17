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

package uk.gov.hmrc.test.ui.cucumber.stepdefs.Departures.Transport

import uk.gov.hmrc.test.ui.cucumber.stepdefs.BaseStepDef
import uk.gov.hmrc.test.ui.pages.Departures.Transport.TransportEquipmentAndSeal._

class TransportEquipmentSealStepDef extends BaseStepDef {


  And("""^(?:I )?choose radio option (.*) on the Do you need to add any transport equipment page$""") { (answer: String) =>
    AddTransportEquipmentPage
      .loadPage()
      .select(answer)
      .submitPage()
  }


  And("""^(?:I )?choose radio option (.*) on the Do you want to add a seal for container (.*) page$""") {
    (answer: String, containerIdNumber: String) =>
    AddSealPage
      .loadPage(containerIdNumber)
      .select(answer)
      .submitPage()
  }

  And("""^(?:I )?enter (.+) on the What is the seal identification number for container (.+) page$""") {
    (answer: String, containerIdNumber: String) =>
    SealIdentificationNumberPage
      .loadPage(containerIdNumber)
      .fillInput(answer)
      .submitPage()
  }

  When("""^(?:I )?click the (.*) link  on the You have added (.*) seals? for container (.*) page$""") {
    (sectionLink: String, numberOfSeals: String, containerIdNumber: String) =>
      AddAnotherSealPage
        .loadPage(numberOfSeals, containerIdNumber)
        .clickByPartialLinkText(sectionLink)
  }

  And("""^(?:I )?choose radio option (.*) on the You have added (.*) seals? for container (.*) page$""") {
    (answer: String, numberOfSeals: String, containerIdNumber: String) =>
      AddAnotherSealPage
        .loadPage(numberOfSeals, containerIdNumber)
        .select(answer)
        .submitPage()
  }

  And("""^(?:I )?click radio option (.*) on the Are you sure you want to remove seal (.*) page$""") {
    (answer: String, sealIdNumber: String) =>
    RemoveSealPage
      .loadPage(sealIdNumber)
      .select(answer)
      .submitPage()
  }

  And("""^(?:I )?enter (.*) on the What is the seal identification number page$""") {
    (answer: String) =>
    SealIdentificationNumberPage
      .loadPage()
      .fillInput(answer)
      .submitPage()
  }

  And("""^(?:I )?choose radio option (.*) on the You have added (.*) container identification numbers? page$""") {
    (answer: String, numberOfContainers: String) =>
      AddAnotherContainerPage
        .loadPage(numberOfContainers)
        .select(answer)
        .submitPage()
  }

  And("""^(?:I )?click the (.*) link on the You have added (.*) container identification numbers? page$""") {
    (sectionLink: String, numberOfContainers: String) =>
      AddAnotherContainerPage
        .loadPage(numberOfContainers)
        .clickByPartialLinkText(sectionLink)
  }

  And("""^(?:I )?choose radio option (.*) on the You have added (.*) goods item numbers? for container (.*) page$""") {
    (answer: String, numberOfGoodsItems: String, containerIdNumber: String) =>
      AddAnotherGoodsItemPage
        .loadPage(numberOfGoodsItems, containerIdNumber)
        .select(answer)
        .submitPage()
  }

  And("""^(?:I )?click the (.*) link on the You have added (.*) goods item numbers? for container (.*) page$""") {
    (sectionLink: String, numberOfGoodsItems: String, containerIdNumber: String) =>
      AddAnotherGoodsItemPage
        .loadPage(numberOfGoodsItems, containerIdNumber)
        .clickByPartialLinkText(sectionLink)
  }

  And("""^(?:I )?choose radio option (.*) on the Do you want to add a container identification number page$""") {
    (answer: String) =>
    AddContainerIdentificationNumberPage
      .loadPage()
      .select(answer)
      .submitPage()
  }

  And("""^(?:I )?choose radio option (.*) on the Do you want to add a goods item number for container (.*) page$""") {
    (answer: String, containerIdNumber: String) =>
    AddGoodsItemNumberPage
      .loadPage(containerIdNumber)
      .select(answer)
      .submitPage()
  }

  And("""^(?:I )?enter (.+) on the What is the container identification number page$""") { (answer: String) =>
    ContainerIdentificationNumberPage
      .loadPage()
      .fillInput(answer)
      .submitPage()
  }

  And("""^(?:I )?enter (.*) on the What is the goods item number for container (.*) page$""") {
    (answer: String, containerIdNumber: String) =>
    GoodsItemNumberPage
      .loadPage(containerIdNumber)
      .fillInput(answer)
      .submitPage()
  }

  And("""^(?:I )?click radio option (.*) on the Are you sure you want to remove container (.*) page$""") {
    (answer: String, containerIdNumber: String) =>
      RemoveContainerPage
        .loadPage(containerIdNumber)
        .select(answer)
        .submitPage()
  }

  And("""^(?:I )?click radio option (.*) on the Are you sure you want to remove goods item number (.*) from container (.*) page$""") {
    (answer: String, goodsIdNumber: String, containerIdNumber: String) =>
      RemoveGoodsItemNumberPage
        .loadPage(goodsIdNumber, containerIdNumber)
        .select(answer)
        .submitPage()
  }
}
