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

package uk.gov.hmrc.test.ui.cucumber.stepdefs.Departures.Documents

import uk.gov.hmrc.test.ui.cucumber.stepdefs.BaseStepDef
import uk.gov.hmrc.test.ui.pages.Departures.Documents.Documents._
import uk.gov.hmrc.test.ui.pages.Departures.Documents.Supporting.{AddLineItemNumberPage, LineItemNumberPage}

class DocumentsStepDef extends BaseStepDef {

  And("""^(?:I )?select (.+) on the 'What type of document do you want to add\?' page$""") { (answer: String) =>
    DocumentTypePage
      .loadPage()
      .select(answer)
      .submitPage()
  }

  And("""^(?:I )?select (.+) on the 'What previous document do you want to add\?' page$""") { (answer: String) =>
    DocumentPreviousTypePage
      .loadPage()
      .select(answer)
      .submitPage()
  }

  And("""^(?:I )?enter (.+) on the 'What is the document’s reference number\?' page$""") { (answer: String) =>
    DocumentReferenceNumberPage
      .loadPage()
      .fillInput(answer)
      .submitPage()
  }

  And("""^(?:I )?choose radio option (.*) on the 'You have added (.*) documents?' page$""") {
    (answer: String, numberOfDocuments: String) =>
      DocumentAddAnotherPage
        .loadPage(numberOfDocuments)
        .select(answer)
        .submitPage()
  }

  And("""^(?:I )?click radio option (.*) on the 'Do you want to add a line item number\?' page$""") {
    (answer: String) =>
      AddLineItemNumberPage
        .loadPage()
        .select(answer)
        .submitPage()
  }

  And("""^(?:I )?enter (.+) on the 'What is the line item number\?' page$""") { (answer: String) =>
    LineItemNumberPage
      .loadPage()
      .fillInput(answer)
      .submitPage()
  }

  And(
    """^(?:I )?choose to click on the (.*) link on the 'You have added (.*) documents?' page$"""
  ) { (sectionLink: String, numberOfDocuments: String) =>
    DocumentAddAnotherPage
      .loadPage(numberOfDocuments)
      .clickByPartialLinkText(sectionLink)
  }


  And("""^(?:I )?click radio option (.*) on the 'Are you sure you want to remove the (.*)\?' page$""") {
    (answer: String, documentTypeToRemove: String) =>
      RemoveDocumentPage
        .loadPage(documentTypeToRemove)
        .select(answer)
        .submitPage()
  }

}
