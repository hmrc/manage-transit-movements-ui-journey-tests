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
import uk.gov.hmrc.test.ui.pages.Arrivals.TransportEquipmentAndSeal.{AddAnotherArrivalSealPage, AddContainerSealPage, AddTransportEquipmentPage, ContainerSealIdentificationNumberPage, RemoveSealPage, SealIdentificationNumberPage}

class TransportEquipmentSealStepDef extends BaseStepDef {

  And("""^(?:I )?choose radio option (.*) on the add transport equipment page$""") {
    (answer: String) =>
      AddTransportEquipmentPage
        .loadPage()
        .select(answer)
        .submitPage()
  }

  And("""^(?:I )?choose radio option (.*) on the add seals page$""") {
    (answer: String) =>
      AddContainerSealPage
        .loadPage()
        .select(answer)
        .submitPage()
  }

  And("""^(?:I )?enter (.+) on the seal identification number page$""") {
    (answer: String) =>
      ContainerSealIdentificationNumberPage
        .loadPage()
        .fillInput(answer)
        .submitPage()
  }

  When("""^(?:I )?click the (.*) link on the add another container seal page$""") {
    (sectionLink: String) =>
      AddAnotherArrivalSealPage
        .clickByPartialLinkText(sectionLink)
  }

  And("""^(?:I )?choose radio option (.*) on the Arrivals 'You have added (.*) seals?' page$""") {
    (answer: String, numberOfSeals: String) =>
      AddAnotherArrivalSealPage
        .loadPage(numberOfSeals)
        .select(answer)
        .submitPage()
  }

  And("""^(?:I )?click radio option (.*) for container seal identification number (.+) on the remove seal page$""") {
    (answer: String, identificationVal: String) =>
      RemoveSealPage
        .loadPage(identificationVal)
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
}
