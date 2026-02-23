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

import uk.gov.hmrc.test.ui.cucumber.stepdefs.BaseStepDef
import uk.gov.hmrc.test.ui.pages.Departures.Documents.Documents.*
import uk.gov.hmrc.test.ui.pages.Departures.Documents.Previous.*

object PreviousStepDefSteps {

  // ^(?:I )?click radio option (.*) on the 'Do you want to add a goods item number\?' page$
  def andIclickRadioOptionXOnTheDoYouWantToAddAGoodsItemNumberPage(answer: String): Unit =
    AddGoodsItemNumberPage
      .loadPage()
      .select(answer)
      .submitPage()

  // ^(?:I )?enter (.+) on the documents 'What is the goods item number\?' page$
  def andIenterOnTheDocumentsWhatIsTheGoodsItemNumberPage(answer: String): Unit =
    GoodsItemNumberPage
      .loadPage()
      .fillInput(answer)
      .submitPage()

  // ^(?:I )?click radio option (.*) on the 'Do you want to declare the package used to transport the goods into the UK\?' page$
  def andIclickRadioOptionXOnTheDoYouWantToDeclareThePackageUsedToTransportTheGoodsIntoTheUKPage(answer: String): Unit =
    DeclarePackagePage
      .loadPage()
      .select(answer)
      .submitPage()

  // ^(?:I )?select (.+) on the 'What type of package was used to transport the goods into the UK\?' page$
  def andIselectOnTheWhatTypeOfPackageWasUsedToTransportTheGoodsIntoTheUKPage(answer: String): Unit =
    PackageTypePage
      .loadPage()
      .select(answer)
      .submitPage()

  // ^(?:I )?enter (.+) on the 'How many of these do the goods include\?' page$
  def andIenterOnTheHowManyOfTheseDoTheGoodsIncludePage(answer: String): Unit =
    GoodsItemMetricAmountPage
      .loadPage()
      .fillInput(answer)
      .submitPage()

  // ^(?:I )?select (.+) on the 'What metric do you want to use for the quantity of goods\?' page$
  def andIselectOnTheWhatMetricDoYouWantToUseForTheQuantityOfGoodsPage(answer: String): Unit =
    MetricTypePage
      .loadPage()
      .select(answer)
      .submitPage()

  // ^(?:I )?click radio option (.*) on the 'Do you want to declare the quantity of goods transported into the UK\?' page$
  def andIclickRadioOptionXOnTheDoYouWantToDeclareTheQuantityOfGoodsTransportedIntoTheUKPage(answer: String): Unit =
    AddGoodsMetricPage
      .loadPage()
      .select(answer)
      .submitPage()

  // ^(?:I )?enter (.+) on the documents 'How many of these were there\?' page$
  def andIenterOnTheDocumentsHowManyOfTheseWereTherePage(answer: String): Unit =
    PackageQuantityPage
      .loadPage()
      .fillInput(answer)
      .submitPage()

  // ^(?:I )?click radio option (.*) on the 'Do you want to declare the quantity of this package\?' page$
  def andIclickRadioOptionXOnTheDoYouWantToDeclareTheQuantityOfThisPackagePage(answer: String): Unit =
    DeclareQuantityOfPackagePage
      .loadPage()
      .select(answer)
      .submitPage()

  // ^(?:I )?click radio option (.*) on the 'Do you want to add any additional information for this document\?' page$
  def andIclickRadioOptionXOnTheDoYouWantToAddAnyAdditionalInformationForThisDocumentPage(answer: String): Unit =
    AddAdditionalInformationPage
      .loadPage()
      .select(answer)
      .submitPage()

  // ^(?:I )?enter (.+) on the Documents 'Enter the additional information' page$
  def andIenterOnTheDocumentsEnterTheAdditionalInformationPage(answer: String): Unit =
    DocumentEnterAdditionalInfoPage
      .loadPage()
      .fillInput(answer)
      .submitPage()

}
