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

import specpage.*

object IdentificationStepDefSteps {

  // ^(?:I )?choose radio option (.*) on the 'What type of procedure are you using\?' page$
  def andIchooseRadioOptionXOnTheWhatTypeOfProcedureAreYouUsingPage(answer: String): Unit =
    Arrivals_ProcedureTypePage
      .loadPage()
      .select(answer)
      .submitPage()

  // ^(?:I )?select (.+) on the arrival office of destination page$
  def andIselectOnTheArrivalOfficeOfDestinationPage(answer: String): Unit =
    Arrivals_OfficeOfDestinationPage
      .loadPage()
      .select(answer)
      .submitPage()

  // ^(?:I )?enter (.+) on the consignee eori tin page$
  def andIenterOnTheConsigneeEoriTinPage(answer: String): Unit =
    Arrivals_ConsigneeEoriTinPage
      .loadPage()
      .fillInput(answer)
      .submitPage()

  // ^(?:I )?enter (.+) on the Movement Reference Number page$
  def andIenterOnTheMovementReferenceNumberPage(answer: String): Unit =
    Arrivals_MovementReferenceNumberPage
      .loadPage()
      .fillInput(answer)
      .submitPage()

  // ^(?:I )?enter (.+) on the authorisations reference number page$
  def andIenterOnTheAuthorisationsReferenceNumberPage(answer: String): Unit =
    Arrivals_AuthorisationsReferenceNumberPage
      .loadPage()
      .fillInput(answer)
      .submitPage()

  // ^(?:I )?(?:should )?be on the What is the Movement Reference Number page$
  def thenIshouldbeOnTheWhatIsTheMovementReferenceNumberPage(): Unit =
    Arrivals_MovementReferenceNumberPage
      .loadPage()

  // ^(?:I )?(?:should )?see an error on the What is the Movement Reference Number page$
  def thenIshouldseeAnErrorOnTheWhatIsTheMovementReferenceNumberPage(): Unit =
    Arrivals_ErrorMovementReferenceNumberPage
      .loadPage()

}
