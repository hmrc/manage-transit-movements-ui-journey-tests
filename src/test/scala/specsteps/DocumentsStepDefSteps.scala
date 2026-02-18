import uk.gov.hmrc.test.ui.cucumber.stepdefs.BaseStepDef
import uk.gov.hmrc.test.ui.pages.Departures.Documents.Documents.*
import uk.gov.hmrc.test.ui.pages.Departures.Documents.Supporting.{AddLineItemNumberPage, LineItemNumberPage}

object DocumentsStepDefSteps {

  // ^(?:I )?select (.+) on the 'What type of document do you want to add\?' page$
  def and(?I)?select(.+)OnThe'WhatTypeOfDocumentDoYouWantToAdd\?'Page(answer: String): Unit = {
    DocumentTypePage
          .loadPage()
          .select(answer)
          .submitPage()
  }

  // ^(?:I )?select (.+) on the 'What previous document do you want to add\?' page$
  def and(?I)?select(.+)OnThe'WhatPreviousDocumentDoYouWantToAdd\?'Page(answer: String): Unit = {
    DocumentPreviousTypePage
          .loadPage()
          .select(answer)
          .submitPage()
  }

  // ^(?:I )?enter (.+) on the 'What is the document’s reference number\?' page$
  def and(?I)?enter(.+)OnThe'WhatIsTheDocument’sReferenceNumber\?'Page(answer: String): Unit = {
    DocumentReferenceNumberPage
          .loadPage()
          .fillInput(answer)
          .submitPage()
  }

  // ^(?:I )?choose radio option (.*) on the 'You have added (.*) documents?' page$
  def and(?I)?chooseRadioOptionXOnThe'YouHaveAddedXDocuments?'Page(answer: String, numberOfDocuments: String): Unit = {
    DocumentAddAnotherPage
            .loadPage(numberOfDocuments)
            .select(answer)
            .submitPage()
  }

  // ^(?:I )?click the (.*) link on the 'You have added (.*) documents?' page$
  def when(?I)?clickTheXLinkOnThe'YouHaveAddedXDocuments?'Page(sectionLink: String, numberOfDocuments: String): Unit = {
    DocumentAddAnotherPage
            .loadPage(numberOfDocuments)
            .clickByPartialLinkText(sectionLink)
  }

  // ^(?:I )?click radio option (.*) on the 'Do you want to add a line item number\?' page$
  def and(?I)?clickRadioOptionXOnThe'DoYouWantToAddALineItemNumber\?'Page(answer: String): Unit = {
    AddLineItemNumberPage
            .loadPage()
            .select(answer)
            .submitPage()
  }

  // ^(?:I )?enter (.+) on the 'What is the line item number\?' page$
  def and(?I)?enter(.+)OnThe'WhatIsTheLineItemNumber\?'Page(answer: String): Unit = {
    LineItemNumberPage
          .loadPage()
          .fillInput(answer)
          .submitPage()
  }

  // ^(?:I )?choose to click on the (.*) link on the 'You have added (.*) documents?' page$
  def and(?I)?chooseToClickOnTheXLinkOnThe'YouHaveAddedXDocuments?'Page(sectionLink: String, numberOfDocuments: String): Unit = {
    DocumentAddAnotherPage
          .loadPage(numberOfDocuments)
          .clickByPartialLinkText(sectionLink)
  }

  // ^(?:I )?click radio option (.*) on the 'Are you sure you want to remove this document\?' page$
  def and(?I)?clickRadioOptionXOnThe'AreYouSureYouWantToRemoveThisDocument\?'Page(answer: String): Unit = {
    RemoveDocumentPage
            .loadPage()
            .select(answer)
            .submitPage()
  }

  // ^(?:I )?click radio option (.*) on the 'Do you want to use this document for all items\?' page$
  def and(?I)?clickRadioOptionXOnThe'DoYouWantToUseThisDocumentForAllItems\?'Page(answer: String): Unit = {
    DocumentsForAllItems
            .loadPage()
            .select(answer)
            .submitPage()
  }

}
