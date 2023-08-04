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

package uk.gov.hmrc.test.ui.cucumber.stepdefs.Cancellations

import uk.gov.hmrc.test.ui.cucumber.stepdefs.BaseStepDef
import uk.gov.hmrc.test.ui.pages.Cancellations._

class CancellationsStepDef extends BaseStepDef {

  And(
    """^(?:I )?choose radio option (.*) on the 'Are you sure you want to cancel this declaration\?' page$"""
  ) { (answer: String) =>
    ConfirmCancellationPage
      .loadPage()
      .select(answer)
      .submitPage()
  }

  And("""^(?:I )?enter (.*) on the 'Why do you want to cancel this declaration\?' page$""") {
    (answer: String) =>
      CancellationReasonPage
        .loadPage()
        .fillInput(answer)
        .submitPage()
  }

  Given("""^(?:I )?click on the (.+) link on the 'Cancellation request sent' page$""") { (declarationLink: String) =>
    CancellationRequestSentPage
      .loadPage()
      .selectDepartureDeclarationLink(declarationLink)
  }

}
