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

import specpage.Departures.Documents.Documents.*
import specpage.Departures.Documents.Supporting.*

object DocumentsStepDefSteps {

  // ^(?:I )?select (.+) on the 'What type of document do you want to add\?' page$
  def andIselectOnTheWhatTypeOfDocumentDoYouWantToAddPage(answer: String): Unit =
    DocumentTypePage
      .loadPage()
      .select(answer)
      .submitPage()

  // ^(?:I )?select (.+) on the 'What previous document do you want to add\?' page$
  def andIselectOnTheWhatPreviousDocumentDoYouWantToAddPage(answer: String): Unit =
    DocumentPreviousTypePage
      .loadPage()
      .select(answer)
      .submitPage()

  // ^(?:I )?enter (.+) on the 'What is the document’s reference number\?' page$
  def andIenterOnTheWhatIsTheDocumentsReferenceNumberPage(answer: String): Unit =
    DocumentReferenceNumberPage
      .loadPage()
      .fillInput(answer)
      .submitPage()

  // ^(?:I )?choose radio option (.*) on the 'You have added (.*) documents?' page$
  def andIchooseRadioOptionXOnTheYouHaveAddedXDocumentsPage(answer: String, numberOfDocuments: String): Unit =
    DocumentAddAnotherPage
      .loadPage(numberOfDocuments)
      .select(answer)
      .submitPage()

  // ^(?:I )?click the (.*) link on the 'You have added (.*) documents?' page$
  def whenIclickTheXLinkOnTheYouHaveAddedXDocumentsPage(sectionLink: String, numberOfDocuments: String): Unit =
    DocumentAddAnotherPage
      .loadPage(numberOfDocuments)
      .clickByPartialLinkText(sectionLink)

  // ^(?:I )?click radio option (.*) on the 'Do you want to add a line item number\?' page$
  def andIclickRadioOptionXOnTheDoYouWantToAddALineItemNumberPage(answer: String): Unit =
    AddLineItemNumberPage
      .loadPage()
      .select(answer)
      .submitPage()

  // ^(?:I )?enter (.+) on the 'What is the line item number\?' page$
  def andIenterOnTheWhatIsTheLineItemNumberPage(answer: String): Unit =
    LineItemNumberPage
      .loadPage()
      .fillInput(answer)
      .submitPage()

  // ^(?:I )?choose to click on the (.*) link on the 'You have added (.*) documents?' page$
  def andIchooseToClickOnTheXLinkOnTheYouHaveAddedXDocumentsPage(sectionLink: String, numberOfDocuments: String): Unit =
    DocumentAddAnotherPage
      .loadPage(numberOfDocuments)
      .clickByPartialLinkText(sectionLink)

  // ^(?:I )?click radio option (.*) on the 'Are you sure you want to remove this document\?' page$
  def andIclickRadioOptionXOnTheAreYouSureYouWantToRemoveThisDocumentPage(answer: String): Unit =
    RemoveDocumentPage
      .loadPage()
      .select(answer)
      .submitPage()

  // ^(?:I )?click radio option (.*) on the 'Do you want to use this document for all items\?' page$
  def andIclickRadioOptionXOnTheDoYouWantToUseThisDocumentForAllItemsPage(answer: String): Unit =
    DocumentsForAllItems
      .loadPage()
      .select(answer)
      .submitPage()

}
