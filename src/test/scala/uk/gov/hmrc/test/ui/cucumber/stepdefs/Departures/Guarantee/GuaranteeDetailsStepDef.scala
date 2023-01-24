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

package uk.gov.hmrc.test.ui.cucumber.stepdefs.Departures.Guarantee

import uk.gov.hmrc.test.ui.cucumber.stepdefs.BaseStepDef
import uk.gov.hmrc.test.ui.pages.Departures.Guarantee.{AddAnotherGuaranteePage, GuaranteeAccessCodePage, GuaranteeBForTIRDeclarationPage, GuaranteeLiabilityAmount, GuaranteeReferenceNumberPage, GuaranteeTypePage, OtherGuarantee3ReferencePage, OtherGuarantee8ReferencePage, WantToAddReferenceForGuaranteePage}

class GuaranteeDetailsStepDef extends BaseStepDef {

  And("""^(?:I )?choose radio option (.*) on the 'Which type of guarantee is it' page$""") { (answer: String) =>
    GuaranteeTypePage
      .loadPage()
      .select(answer)
      .submitPage()
  }

  And("""^(?:I )?enter (.+) on the 'What is the access code' page$""") { (answer: String) =>
    GuaranteeAccessCodePage
      .loadPage()
      .fillInput(answer)
      .submitPage()
  }

  And("""^(?:I )?enter (.+) on the 'How much is the liability in pounds' page$""") { (answer: String) =>
    GuaranteeLiabilityAmount
      .loadPage()
      .fillInput(answer)
      .submitPage()
  }

  Then("""^(?:I )?(?:should )?have (.+) guarantees? added on 'You have added (.*) guarantee' page$""") {
    (numberOfGuarantees: String, guaranteesInTitle: String) =>
      AddAnotherGuaranteePage
        .loadPage(numberOfGuarantees)
  }

  When("""^(?:I )?choose radio option (.*) on the 'You have added (.*) guarantee' page$""") { (answer: String, guaranteesInTitle: String) =>
    AddAnotherGuaranteePage
      .select(answer)
      .submitPage()
  }

  And("""^(?:I )?choose radio option (.*) on the 'Do you want to add a reference for the guarantee' page""") {
    (answer: String) =>
      WantToAddReferenceForGuaranteePage
        .loadPage()
        .select(answer)
        .submitPage()
  }

  And("""^(?:I )?enter (.+) on the 'What is the reference for the guarantee' page$""") { (answer: String) =>
    OtherGuarantee3ReferencePage
      .loadPage()
      .fillInput(answer)
      .submitPage()
  }

  And("""^(?:I )?enter (.+) on the 'What is the reference' page$""") { (answer: String) =>
    OtherGuarantee8ReferencePage
      .loadPage()
      .fillInput(answer)
      .submitPage()
  }

  And("""^(?:I )?enter (.+) on the 'What is the Guarantee Reference Number' page$""") { (answer: String) =>
    GuaranteeReferenceNumberPage
      .loadPage()
      .fillInput(answer)
      .submitPage()
  }

  Then("""^(?:I )?(?:should )?be on the 'Guarantee added for TIR declaration' page$""") { () =>
    GuaranteeBForTIRDeclarationPage
      .loadPage()
  }

  And("""^(?:I )?choose to continue""") { () =>
    GuaranteeBForTIRDeclarationPage
      .submitPage()
  }
}
