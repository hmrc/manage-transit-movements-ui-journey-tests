/*
 * Copyright 2022 HM Revenue & Customs
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

package uk.gov.hmrc.test.ui.cucumber.stepdefs

import uk.gov.hmrc.test.ui.pages.{AddAnotherGuaranteePage, GuaranteeAccessCodePage, GuaranteeBForTIRDeclarationPage, GuaranteeLiabilityAmount, GuaranteeReferenceNumberPage, GuaranteeTypePage, OtherGuarantee3ReferencePage, OtherGuarantee8ReferencePage, WantToAddReferenceForGuaranteePage}

class GuaranteeDetailsStepDef extends BaseStepDef {
  And("""^(?:I )?choose radio option (.*) on the guarantee type page$""") { (answer: String) =>
    GuaranteeTypePage.loadPage
    GuaranteeTypePage.selectGuaranteeType(answer)
    GuaranteeTypePage.submitPage()
  }

  And("""^(?:I )?enter (.+) on the Guarantee Reference Number page$""") { (answer: String) =>
    GuaranteeReferenceNumberPage.loadPage
    GuaranteeReferenceNumberPage.enterGRN(answer)
    GuaranteeReferenceNumberPage.submitPage()
  }

  And("""^(?:I )?enter (.+) on the access code page$""") { (answer: String) =>
    GuaranteeAccessCodePage.loadPage
    GuaranteeAccessCodePage.enterAccessCode(answer)
    GuaranteeAccessCodePage.submitPage()
  }

  And("""^(?:I )?enter (.+) on the amount to be covered page$""") { (answer: String) =>
    GuaranteeLiabilityAmount.loadPage
    GuaranteeLiabilityAmount.enterLiabilityAmount(answer)
    GuaranteeLiabilityAmount.submitPage()
  }

  Then("""^(?:I )?(?:should )?be on the add another guarantee page$""") { () =>
    AddAnotherGuaranteePage.loadPage
  }

  When("""^(?:I )?choose radio option (.*) on the add another guarantee page$""") { (answer: String) =>
    AddAnotherGuaranteePage.needToAddAnotherGuarantee(answer)
    AddAnotherGuaranteePage.submitPage()
  }

  And("""^(?:I )?choose radio option (.*) on the do you want to add a reference for the guarantee page""") {
    (answer: String) =>
      WantToAddReferenceForGuaranteePage.loadPage
      WantToAddReferenceForGuaranteePage.selectToAddReference(answer)
      WantToAddReferenceForGuaranteePage.submitPage()
  }

  And("""^(?:I )?enter (.+) on the other reference for the guarantee 3 page$""") { (answer: String) =>
    OtherGuarantee3ReferencePage.loadPage
    OtherGuarantee3ReferencePage.enterOtherReference(answer)
    OtherGuarantee3ReferencePage.submitPage()
  }

  And("""^(?:I )?enter (.+) on the other reference for the guarantee 8 page$""") { (answer: String) =>
    OtherGuarantee8ReferencePage.loadPage
    OtherGuarantee8ReferencePage.enterOtherReference(answer)
    OtherGuarantee8ReferencePage.submitPage()
  }

  Then("""^(?:I )?(?:should )?be on the guarantee B added for TIR declaration page$""") { () =>
    GuaranteeBForTIRDeclarationPage.loadPage
  }

}
