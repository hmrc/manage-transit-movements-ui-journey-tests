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

package uk.gov.hmrc.test.ui.cucumber.stepdefs.GuaranteeBalance

import uk.gov.hmrc.test.ui.cucumber.stepdefs.BaseStepDef
import uk.gov.hmrc.test.ui.pages.GuaranteeBalance.{GetBalanceAvailableBalanceConfirmationPage, GetBalanceCYAPage, GetBalanceCantCheckBalancePage, GetBalanceDetailsDoNotMatchPage, GetBalanceGuaranteeAccessCodePage, GetBalanceGuaranteeRefNumberPage}

class GuaranteeBalanceStepDef extends BaseStepDef {

  Then("""^(?:I )?enter (.+) on the Get Balance 'What is the Guarantee Reference Number\?' page$""") {
    (answer: String) =>
      GetBalanceGuaranteeRefNumberPage
        .loadPage()
        .fillInput(answer)
        .submitPage()
  }

  And("""^(?:I )?enter (.+) on the Get Balance 'What is the access code\?' page$""") { (answer: String) =>
    GetBalanceGuaranteeAccessCodePage
      .loadPage()
      .fillInput(answer)
      .submitPage()
  }

  And("""^(?:I )?submit on the Get Balance 'Check your answers' page$""") { () =>
    GetBalanceCYAPage
      .loadPage()
      .submitPage()
  }

  And("""^(?:I )?click the (.+) link on the 'The Guarantee Reference Number and access code do not match' page$""") {
    (link: String) =>
      GetBalanceDetailsDoNotMatchPage
        .loadPage()
        .selectAction(link)
  }

  And("""^(?:I )?click the (.+) link on the 'We could not check your guarantee balance' page$""") { (link: String) =>
    GetBalanceCantCheckBalancePage
      .loadPage()
      .selectAction(link)
  }

  And("""^(?:I )?I click the change link for (.+) on the 'Check your answers' page$""") { (linkText: String) =>
    GetBalanceCYAPage
      .loadPage()
      .clickLinkByIdTextSplit(linkText)
  }

  Then("""^I choose to wait for (.+) seconds$""") { (seconds: Int) =>
    Thread.sleep(seconds * 1000)
  }

  Then("""^(?:I )?(?:should )?see a confirmation of my balance on the 'Available balance' page$""") { () =>
    GetBalanceAvailableBalanceConfirmationPage
      .loadPage()
  }
}
