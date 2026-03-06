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
import specpage.Departures.Transport.Authorisations.*

object TransportAuthorisationsStepDefSteps {

  // ^(?:I )?enter (.+) reference number on the 'What is the reference number for the (.+) authorisation\?' page$
  def andIenterReferenceNumberOnTheWhatIsTheReferenceNumberForTheAuthorisationPage(
    answer: String,
    authorisation: String
  ): Unit =
    AuthorisationRefNumberPage
      .loadPage(authorisation)
      .fillInput(answer)
      .submitPage()

  // ^(?:I )?should have (.*) authorisations? on the 'You have added (.*) authorisations?' page$
  def thenIshouldHaveXAuthorisationsOnTheYouHaveAddedXAuthorisationsPage(numberOfAuthorisations: String): Unit =
    AuthorisationAddAnotherPage
      .loadPage(numberOfAuthorisations)

  // ^(?:I )?choose radio option (.*) on the 'You have added (.+) transport authorisations?' page$
  def whenIchooseRadioOptionXOnTheYouHaveAddedTransportAuthorisationsPage(
    answer: String,
    numberOfActors: String
  ): Unit =
    AuthorisationAddAnotherPage
      .loadPage(numberOfActors)
      .select(answer)
      .submitPage()

  // ^(?:I )?choose radio option (.*) on the 'Which type of authorisation do you want to add' page$
  def andIchooseRadioOptionXOnTheWhichTypeOfAuthorisationDoYouWantToAddPage(answer: String): Unit =
    AuthorisationTypePage
      .loadPage()
      .select(answer)
      .submitPage()

  def andIclickTheContinueButtonOnTheYouHaveAddedXAuthorisationsPage(numberOfAuthorisations: String): Unit =
    AuthorisationAddAnotherPage
      .loadPage(numberOfAuthorisations)
      .submitPage()

  // ^(?:I )?choose to click on (.*) link on the 'You have added (.*) authorisations?' page$
  def whenIchooseToClickOnXLinkOnTheYouHaveAddedXAuthorisationsPage(
    sectionLink: String,
    numberOfAuthsInTitle: String
  ): Unit =
    AuthorisationAddAnotherPage
      .loadPage(numberOfAuthsInTitle)
      .clickByPartialLinkText(sectionLink)

  // ^(?:I )?choose radio option (.*) for the 'Are you sure you want to remove this (.+) authorisation\?' page$
  def andIchooseRadioOptionXForTheAreYouSureYouWantToRemoveThisAuthorisationPage(
    answer: String,
    authorisationType: String
  ): Unit =
    RemoveAuthPage
      .loadPage(authorisationType)
      .select(answer)
      .submitPage()

  // ^(?:I )?enter the date on the 'When do you expect the transit to arrive in (.*)\?' page$
  def andIenterTheDateOnTheWhenDoYouExpectTheTransitToArriveInXPage(officeOfDestination: String): Unit =
    LimitDatePage
      .loadPage(officeOfDestination)
      .fillInputs()
      .submitPage()

  // ^(?:I )?choose radio option (.*) on the 'Do you want to add an authorisation' page$
  def andIchooseRadioOptionXOnTheDoYouWantToAddAnAuthorisationPage(answer: String): Unit =
    WantToAddAuthorisation
      .loadPage()
      .select(answer)
      .submitPage()

  // ^(?:I )?choose radio option (.*) on the 'Do you want to add the arrival date at the office of destination' page$
  def andIchooseRadioOptionXOnTheDoYouWantToAddTheArrivalDateAtTheOfficeOfDestinationPage(answer: String): Unit =
    WantToAddArrivalPage
      .loadPage()
      .select(answer)
      .submitPage()

}
