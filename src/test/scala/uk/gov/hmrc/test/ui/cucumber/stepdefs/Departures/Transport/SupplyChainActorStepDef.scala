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
import uk.gov.hmrc.test.ui.pages.Departures.Transport.SupplyChainActor._

class SupplyChainActorStepDef extends BaseStepDef {

  And("""^(?:I )?choose radio option (.*) on the 'Do you want to add a supply chain actor for all items\?' page$""") {
    (answer: String) =>
      AddSupplyChainActorPage
        .loadPage()
        .select(answer)
        .submitPage()
  }

  And("""^(?:I )?choose radio option (.*) on the 'Which type of supply chain actor do you want to add\?' page$""") {
    (answer: String) =>
      TypeSupplyChainActorPage
        .loadPage()
        .select(answer)
        .submitPage()
  }

  And(
    """^(?:I )?enter (.+) on the 'What is the EORI number or Trader Identification Number TIN for the (.*)\?' page$"""
  ) { (answer: String, typeVal: String) =>
    EoriTinSupplyChainActorPage
      .loadPage(typeVal)
      .fillInput(answer)
      .submitPage()
  }

  And("""^(?:I )?choose radio option (.*) on the 'You have added (.+) supply chain actors?' page$""") {
    (answer: String, numberOfActors: String) =>
      AddAnotherSupplyChainActorPage
        .loadPage(numberOfActors)
        .select(answer)
        .submitPage()
  }

  When("""^(?:I )?choose to click on the (.*) link on the You have added (.+) supply chain actors? page$""") {
    (sectionLink: String, numberOfActors: String) =>
      AddAnotherSupplyChainActorPage
        .loadPage(numberOfActors)
        .clickByPartialLinkText(sectionLink)
  }

  And("""^(?:I )?choose radio option (.*) on the Are you sure you want to remove this supply chain actor page$""") {
    (answer: String) =>
      RemoveSupplyChainActorPage
        .loadPage()
        .select(answer)
        .submitPage()
  }
}
