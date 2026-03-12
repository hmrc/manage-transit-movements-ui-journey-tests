/*
 * Copyright 2026 HM Revenue & Customs
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

package specsteps

/*
 * Copyright 2026 HM Revenue & Customs
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

import specpage.Departures.DeclarationSummary.*

object TaskListStepDefSteps {

  // ^(?:I )?(?:should )?be on the 'Declaration summary' page$
  def thenIshouldbeOnTheDeclarationSummaryPage(): Unit =
    DeclarationSummaryPage
      .loadPage()

  // ^(?:I )?click the (.+) link on the 'Declaration summary' page$
  def thenIclickTheLinkOnTheDeclarationSummaryPage(answer: String): Unit =
    DeclarationSummaryPage
      .loadPage()
      .selectDeclarationSection(answer)

  // ^(?:I )?click on the (.+) link on the 'Declaration summary' page$
  def thenIclickOnTheLinkOnTheDeclarationSummaryPage(answer: String): Unit =
    DeclarationSummaryPage
      .loadPage()
      .selectDeclarationSection(answer)

  // ^(?:I )?should see (.*) status for (.+) on the 'Declaration summary' page$
  def andIshouldSeeXStatusForOnTheDeclarationSummaryPage(status: String, section: String): Unit =
    DeclarationSummaryPage
      .checkStatus(section, status)

  // ^(?:I )?click the (?:Confirm and resend|Confirm and send) button on the 'Declaration summary' page$
  def andIclickTheConfirmAndResendConfirmAndSendButtonOnTheDeclarationSummaryPage(): Unit =
    DeclarationSummaryPage
      .loadPage()
      .submitPage()

}
