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

import specpage.CommonPages.*
import specpage.Departures.PreTaskList.GenericCYAPage

object CYAStepDefSteps {

  // ^(?:I )?should be on the 'Check your answers' page$
  def andIshouldBeOnTheCheckYourAnswersPage(): Unit =
    CYAPage
      .loadPage()

  // ^(?:I )?submit the 'Check your answers' page$
  def andIsubmitTheCheckYourAnswersPage(): Unit =
    GenericCYAPage
      .loadPage()
      .submitPage()

  // ^(?:I )?submit on the Check your answers section (.*) page$
  def andIsubmitOnTheCheckYourAnswersSectionXPage(subheading: String): Unit =
    CYAPage
      .loadPage(subheading)
      .submitPage()

  // ^(?:I )?click the Change link for (.+) on the 'Check your answers' page$
  def andIclickTheChangeLinkForOnTheCheckYourAnswersPage(text: String): Unit =
    CYAPage
      .clickChangeLink(text)

  // ^(?:I )?click the Change link for (.+) on the (?:Transport details|Unloading|Route details|Trader details|Documents|Item 1|Guarantee details) 'Check your answers' page$
  def andIclickTheChangeLinkForOnTheTransportDetailsUnloadingRouteDetailsTraderDetailsDocumentsItem1GuaranteeDetailsCheckYourAnswersPage(
    text: String
  ): Unit =
    CYAPage
      .clickChangeLink(text)

}
