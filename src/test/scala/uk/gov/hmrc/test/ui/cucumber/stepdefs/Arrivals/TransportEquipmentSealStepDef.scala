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
import uk.gov.hmrc.test.ui.pages.Arrivals.TransportEquipmentAndSeal.{AddAnotherContainerSealPage, AddContainerSealPage, AddTransportEquipmentPage, ContainerSealIdentificationNumberPage, RemoveSealPage, SealIdentificationNumberPage}

class TransportEquipmentSealStepDef extends BaseStepDef {


  And("""^(?:I )?choose radio option (.*) on the add transport equipment page$""") { (answer: String) =>
    AddTransportEquipmentPage
      .loadPage()
      .select(answer)
      .submitPage()
  }


  And("""^(?:I )?choose radio option (.*) for container identification number (.+) on the add container seal page$""") {
    (answer: String,identificationVal: String) =>
    AddContainerSealPage
      .loadPage(identificationVal)
      .select(answer)
      .submitPage()
  }

  And("""^(?:I )?enter (.+) for container identification number (.*) on the container seal identification number page$""") {
    (answer: String, identificationVal: String) =>
    ContainerSealIdentificationNumberPage
      .loadPage(identificationVal)
      .fillInput(answer)
      .submitPage()
  }

  Then("""^(?:I )?should have (.*) container seals? added for container identification number (.+) on the add another container seal page$""") {
    (numberOfSeals: String, identificationVal: String) =>
      AddAnotherContainerSealPage
        .loadPage(numberOfSeals, identificationVal)
  }

  Then("""^(?:I )?should have (.*) seals? added on the add another seal page$""") {
    (numberOfSeals: String) =>
      AddAnotherContainerSealPage
        .loadPage(numberOfSeals)
  }

  When("""^(?:I )?click the (.*) link on the add another container seal page$""") {
    (sectionLink: String) =>
      AddAnotherContainerSealPage
        .clickByPartialLinkText(sectionLink)
  }

  And("""^(?:I )?choose radio option (.*) on the add another (?:container seal|seal) page$""") {
    (answer: String) =>
      AddAnotherContainerSealPage
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
