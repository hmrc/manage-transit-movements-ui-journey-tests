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

import specpage.Departures.Transport.SupplyChainActor.*

object SupplyChainActorStepDefSteps {

  // ^(?:I )?choose radio option (.*) on the 'Do you want to add a supply chain actor for all items\?' page$
  def andIchooseRadioOptionXOnTheDoYouWantToAddASupplyChainActorForAllItemsPage(answer: String): Unit =
    AddSupplyChainActorPage
      .loadPage()
      .select(answer)
      .submitPage()

  // ^(?:I )?choose radio option (.*) on the 'Which type of supply chain actor do you want to add\?' page$
  def andIchooseRadioOptionXOnTheWhichTypeOfSupplyChainActorDoYouWantToAddPage(answer: String): Unit =
    TypeSupplyChainActorPage
      .loadPage()
      .select(answer)
      .submitPage()

  // ^(?:I )?enter (.+) on the 'What is the EORI number or Third Country Unique Identification Number TCUIN for the (.*)\?' page$
  def andIenterOnTheWhatIsTheEORINumberOrThirdCountryUniqueIdentificationNumberTCUINForTheXPage(
    answer: String,
    typeVal: String
  ): Unit =
    EoriTinSupplyChainActorPage
      .loadPage(typeVal)
      .fillInput(answer)
      .submitPage()

  // ^(?:I )?choose radio option (.*) on the 'You have added (.+) supply chain actors?' page$
  def andIchooseRadioOptionXOnTheYouHaveAddedSupplyChainActorsPage(answer: String, numberOfActors: String): Unit =
    AddAnotherSupplyChainActorPage
      .loadPage(numberOfActors)
      .select(answer)
      .submitPage()

  // ^(?:I )?choose to click on (.*) link on the 'You have added (.+) supply chain actors' page$
  def whenIchooseToClickOnXLinkOnTheYouHaveAddedSupplyChainActorsPage(
    sectionLink: String,
    numberOfActors: String
  ): Unit =
    AddAnotherSupplyChainActorPage
      .loadPage(numberOfActors)
      .clickByPartialLinkText(sectionLink)

  // ^(?:I )?choose radio option (.*) on the Are you sure you want to remove this supply chain actor page$
  def andIchooseRadioOptionXOnTheAreYouSureYouWantToRemoveThisSupplyChainActorPage(answer: String): Unit =
    RemoveSupplyChainActorPage
      .loadPage()
      .select(answer)
      .submitPage()

}
