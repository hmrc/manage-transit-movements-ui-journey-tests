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
import uk.gov.hmrc.test.ui.pages.Departures.Transport.TransportEquipmentCharges._

class TransportEquipmentChargesStepDef extends BaseStepDef {

  And("""^(?:I )?choose radio option (.*) on the 'Do you want to add any transport equipment\?' page$""") {
    (answer: String) =>
      AddTransportEquipmentPage
        .loadPage()
        .select(answer)
        .submitPage()
  }

  And("""^(?:I )?choose radio option (.*) on the 'Do you want to add a container identification number\?' page$""") {
    (answer: String) =>
      AddContainerIdentificationNumberPage
        .loadPage()
        .select(answer)
        .submitPage()
  }

  And("""^(?:I )?choose radio option (.*) on the 'Do you want to add a seal\?' page$""") {
    (answer: String) =>
      AddSealPage
        .loadPage()
        .select(answer)
        .submitPage()
  }

  And("""^(?:I )?choose radio option (.*) on the 'Do you want to add a goods item number\?' page$""") {
    (answer: String) =>
      AddGoodsItemNumberPage
        .loadPage()
        .select(answer)
        .submitPage()
  }

  And("""^(?:I )?click the (.*) link on the 'You have added (.*) transport equipment' page$""") {
    (sectionLink: String, numberOfContainers: String) =>
      AddAnotherContainerPage
        .loadPage(numberOfContainers)
        .clickByPartialLinkText(sectionLink)
  }

  And("""^(?:I )?click the (.*) link  on the 'You have added (.*) seals?' page$""") {
    (sectionLink: String, numberOfSeals: String) =>
      AddAnotherSealPage
        .loadPage(numberOfSeals)
        .clickByPartialLinkText(sectionLink)
  }

  And("""^(?:I )?click the (.*) link on the 'You have added (.*) goods item numbers?' page$""") {
    (sectionLink: String, numberOfGoodsItems: String) =>
      AddAnotherGoodsItemPage
        .loadPage(numberOfGoodsItems)
        .clickByPartialLinkText(sectionLink)
  }

  And("""^(?:I )?choose radio option (.*) on the 'You have added (.*) transport equipment' page$""") {
    (answer: String, numberOfContainers: String) =>
      AddAnotherContainerPage
        .loadPage(numberOfContainers)
        .select(answer)
        .submitPage()
  }

  And("""^(?:I )?choose radio option (.*) on the 'You have added (.*) seals?' page$""") {
    (answer: String, numberOfSeals: String) =>
      AddAnotherSealPage
        .loadPage(numberOfSeals)
        .select(answer)
        .submitPage()
  }

  And("""^(?:I )?choose radio option (.*) on the 'You have added (.*) goods item numbers?' page$""") {
    (answer: String, numberOfGoodsItems: String) =>
      AddAnotherGoodsItemPage
        .loadPage(numberOfGoodsItems)
        .select(answer)
        .submitPage()
  }

  And("""^(?:I )?enter (.+) on the 'What is the container identification number\?' page$""") {
    (answer: String) =>
      ContainerIdentificationNumberPage
        .loadPage()
        .fillInput(answer)
        .submitPage()
  }

  And("""^(?:I )?enter (.+) on the 'What is the seal identification number\?' page$""") {
    (answer: String) =>
      SealIdentificationNumberPage
        .loadPage()
        .fillInput(answer)
        .submitPage()
  }

  And("""^(?:I )?enter (.*) on the 'What is the goods item number\?' page$""") {
    (answer: String) =>
      GoodsItemPage
        .loadPage()
        .fillInput(answer)
        .submitPage()
  }

  And("""^(?:I )?click radio option (.*) on the 'Are you sure you want to remove transport equipment (.*)\?' page$""") {
    (answer: String, containerIdNumber: String) =>
      RemoveContainerPage
        .loadPage(containerIdNumber)
        .select(answer)
        .submitPage()
  }

  And("""^(?:I )?click radio option (.*) on the 'Are you sure you want to remove this seal\?' page$""") {
    (answer: String) =>
      RemoveSealPage
        .loadPage()
        .select(answer)
        .submitPage()
  }

  And("""^(?:I )?click radio option (.*) on the 'Are you sure you want to remove goods item number (.*)\?' page$""") {
    (answer: String, goodsIdNumber: String) =>
      RemoveGoodsItemPage
        .loadPage(goodsIdNumber)
        .select(answer)
        .submitPage()
  }

  And(
    """^(?:I )?choose radio option (.*) on the 'Do you want to add a method of payment for transport charges\?' page$"""
  ) {
    (answer: String) =>
      AddPaymentMethodPage
        .loadPage()
        .select(answer)
        .submitPage()
  }

  And(
    """^(?:I )?choose radio option (.*) on the 'Which method of payment do you want to use for transport charges\?' page$"""
  ) {
    (answer: String) =>
      MethodOfPaymentPage
        .loadPage()
        .select(answer)
        .submitPage()
  }

}
