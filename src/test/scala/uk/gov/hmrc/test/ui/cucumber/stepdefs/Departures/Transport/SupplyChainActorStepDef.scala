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
<<<<<<< HEAD
=======
import uk.gov.hmrc.test.ui.pages.Departures.Transport.SupplyChainActor.{AddAnotherSupplyChainActorPage, AddSupplyChainActorPage, EoriTinSupplyChainActorPage, RemoveSupplyChainActorPage, TypeSupplyChainActorPage}
>>>>>>> main
import uk.gov.hmrc.test.ui.pages.Departures.Transport.SupplyChainActor._

class SupplyChainActorStepDef extends BaseStepDef {

  And("""^(?:I )?choose radio option (.*) on the supply chain actor add page$""") { (answer: String) =>
    AddSupplyChainActorPage
      .loadPage()
      .select(answer)
      .submitPage()
  }

  And("""^(?:I )?choose radio option (.*) on the supply chain actor type page$""") { (answer: String) =>
    TypeSupplyChainActorPage
      .loadPage()
      .select(answer)
      .submitPage()
  }

  And("""^(?:I )?enter (.+) for eori number or tin number for (.*) on the supply chain actor eori tin page$""") { (answer: String, typeVal: String) =>
    EoriTinSupplyChainActorPage
      .loadPage(typeVal)
      .fillInput(answer)
      .submitPage()
  }

  Then("""^(?:I )?(?:should )?have (.+) supply chain actors? on the supply chain actor add another page$""") {
    (numberOfOffices: String) =>
      AddAnotherSupplyChainActorPage
        .loadPage(numberOfOffices)
  }

  And("""^(?:I )?choose radio option (.*) on the supply chain actor add another page$""") { (answer: String) =>
    AddAnotherSupplyChainActorPage
      .select(answer)
      .submitPage()
  }

  When("""^(?:I )?choose to click on (.*) link on the supply chain actor add another page$""") {
    (sectionLink: String) =>
      AddAnotherSupplyChainActorPage
        .clickByPartialLinkText(sectionLink)
  }

  And("""^(?:I )?choose radio option (.*) on the supply chain actor remove page$""") { (answer: String) =>
    RemoveSupplyChainActorPage
      .loadPage()
      .select(answer)
      .submitPage()
  }
}
