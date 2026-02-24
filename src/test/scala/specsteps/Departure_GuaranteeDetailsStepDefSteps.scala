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

import specpage.Departures.Guarantee.*

object Departure_GuaranteeDetailsStepDefSteps {

  // ^(?:I )?choose radio option (.*) on the 'Which type of guarantee is it\?' page$
  def andIchooseRadioOptionXOnTheWhichTypeOfGuaranteeIsItPage(answer: String): Unit =
    GuaranteeTypePage
      .loadPage()
      .select(answer)
      .submitPage()

  // ^(?:I )?enter (.+) on the 'What is the access code\?' page$
  def andIenterOnTheWhatIsTheAccessCodePage(answer: String): Unit =
    GuaranteeAccessCodePage
      .loadPage()
      .fillInput(answer)
      .submitPage()

  // ^(?:I )?select (.+) on the 'What currency do you want to use for the liability\?' page$
  def andIselectOnTheWhatCurrencyDoYouWantToUseForTheLiabilityPage(answer: String): Unit =
    GuaranteeLiabilityCurrencyPage
      .loadPage()
      .select(answer)
      .submitPage()

  // ^(?:I )?enter (.+) on the 'How much is the liability in pounds\?' page$
  def andIenterOnTheHowMuchIsTheLiabilityInPoundsPage(answer: String): Unit =
    GuaranteeLiabilityAmount
      .loadPage()
      .fillInput(answer)
      .submitPage()

  // ^(?:I )?choose radio option (.*) on the 'Do you want to use the default liability amount of 10000 euros\?' page$
  def andIchooseRadioOptionXOnTheDoYouWantToUseTheDefaultLiabilityAmountOf10000EurosPage(answer: String): Unit =
    GuaranteeDefaultLiabilityPage
      .loadPage()
      .select(answer)
      .submitPage()

  // ^(?:I )?(?:should )?have (.+) guarantees? added on 'You have added (.*) guarantees?' page$
  def thenIshouldhaveGuaranteesAddedOnYouHaveAddedXGuaranteesPage(numberOfGuarantees: String): Unit =
    AddAnotherGuaranteePage
      .loadPage(numberOfGuarantees)

  // ^(?:I )?choose radio option (.*) on the 'You have added (.*) guarantees?' page$
  def whenIchooseRadioOptionXOnTheYouHaveAddedXGuaranteesPage(answer: String, guaranteesInTitle: String): Unit =
    AddAnotherGuaranteePage
      .loadPage(guaranteesInTitle)
      .select(answer)
      .submitPage()

  // ^(?:I )?click the (.*) link on the 'You have added (.*) guarantees?' page$
  def andIclickTheXLinkOnTheYouHaveAddedXGuaranteesPage(linkText: String, numberOfGuaranteeTitle: String): Unit =
    AddAnotherGuaranteePage
      .loadPage(numberOfGuaranteeTitle)
      .clickByPartialLinkText(linkText)

  // ^(?:I )?choose radio option (.*) on the 'Are you sure you want to remove this guarantee\?' page$
  def andIchooseRadioOptionXOnTheAreYouSureYouWantToRemoveThisGuaranteePage(answer: String): Unit =
    ConfirmRemoveGuaranteePage
      .loadPage()
      .select(answer)
      .submitPage()

  // ^(?:I )?choose radio option (.*) on the 'Do you want to add a reference for the guarantee\?' page
  def andIchooseRadioOptionXOnTheDoYouWantToAddAReferenceForTheGuaranteePage(answer: String): Unit =
    WantToAddReferenceForGuaranteePage
      .loadPage()
      .select(answer)
      .submitPage()

  // ^(?:I )?enter (.+) on the 'What is the reference for the guarantee\?' page$
  def andIenterOnTheWhatIsTheReferenceForTheGuaranteePage(answer: String): Unit =
    OtherGuarantee3ReferencePage
      .loadPage()
      .fillInput(answer)
      .submitPage()

  // ^(?:I )?enter (.+) on the 'What is the reference\?' page$
  def andIenterOnTheWhatIsTheReferencePage(answer: String): Unit =
    OtherGuarantee8ReferencePage
      .loadPage()
      .fillInput(answer)
      .submitPage()

  // ^(?:I )?enter (.+) on the 'What is the Guarantee Reference Number\?' page$
  def andIenterOnTheWhatIsTheGuaranteeReferenceNumberPage(answer: String): Unit =
    GuaranteeReferenceNumberPage
      .loadPage()
      .fillInput(answer)
      .submitPage()

  // ^(?:I )?click the Continue button on the 'Guarantee added for TIR declaration' page$
  def andIclickTheContinueButtonOnTheGuaranteeAddedForTIRDeclarationPage(): Unit =
    GuaranteeBForTIRDeclarationPage
      .loadPage()
      .submitPage()

  // ^(?:I )?choose radio option (.*) on the 'Do you want to add a liability for the guarantee\?' page$
  def andIchooseRadioOptionXOnTheDoYouWantToAddALiabilityForTheGuaranteePage(answer: String): Unit =
    LiabilityForGuarantee
      .loadPage()
      .select(answer)
      .submitPage()

}
