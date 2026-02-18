import uk.gov.hmrc.test.ui.cucumber.stepdefs.BaseStepDef
import uk.gov.hmrc.test.ui.pages.Departures.PreTaskList.*
import uk.gov.hmrc.test.ui.pages.Departures.StandardDeclarationMoreInformationPage
import uk.gov.hmrc.test.ui.utils.CacheHelper

object PreTaskListStepDefSteps {

  // ^I input a random LRN on the 'What is the Local Reference Number\?' page$
  def whenIInputARandomLRNOnThe'WhatIsTheLocalReferenceNumber\?'Page(): Unit = {
    LocalReferenceNumberPage
          .loadPage()
          .fillInput()
          .submitPage()
  }

  // ^I input a random LRN on the 'What is the new Local Reference Number\?' page$
  def whenIInputARandomLRNOnThe'WhatIsTheNewLocalReferenceNumber\?'Page(): Unit = {
    NewLocalReferenceNumberPage
          .loadPage()
          .fillInput()
          .submitPage()
  }

  // ^(?:I )?enter (.+) on the 'What is the Local Reference Number\?' page$
  def then(?I)?enter(.+)OnThe'WhatIsTheLocalReferenceNumber\?'Page(answer: String): Unit = {
    LocalReferenceNumberPage
          .loadPage()
          .fillInput(answer)
          .submitPage()
  }

  // ^(?:I )?should be on the 'What is the Local Reference Number\?' page$
  def then(?I)?shouldBeOnThe'WhatIsTheLocalReferenceNumber\?'Page(): Unit = {
    LocalReferenceNumberPage
          .loadPage()
  }

  // ^(?:I )?should be on the 'What is the new Local Reference Number\?' page$
  def then(?I)?shouldBeOnThe'WhatIsTheNewLocalReferenceNumber\?'Page(): Unit = {
    NewLocalReferenceNumberPage
          .loadPage()
  }

  // ^(?:I )?choose radio option (.*) on the 'Is this a standard or pre-lodged declaration\?' page$
  def and(?I)?chooseRadioOptionXOnThe'IsThisAStandardOrPre-lodgedDeclaration\?'Page(answer: String): Unit = {
    AdditionalDeclarationTypePage
            .loadPage()
            .select(answer)
            .submitPage()
  }

  // ^(?:I )?select (.+) on the 'Where is the office of departure\?' page$
  def and(?I)?select(.+)OnThe'WhereIsTheOfficeOfDeparture\?'Page(answer: String): Unit = {
    OfficeOfDeparturePage
          .loadPage()
          .select(answer)
          .submitPage()
  }

  // ^(?:I )?choose radio option (.*) on the 'Which type of procedure are you using\?' page$
  def and(?I)?chooseRadioOptionXOnThe'WhichTypeOfProcedureAreYouUsing\?'Page(answer: String): Unit = {
    ProcedureTypePage
            .loadPage()
            .select(answer)
            .submitPage()
  }

  // ^(?:I )?choose radio option (.*) on the 'Which type of declaration do you want to create\?' page$
  def and(?I)?chooseRadioOptionXOnThe'WhichTypeOfDeclarationDoYouWantToCreate\?'Page(answer: String): Unit = {
    DeclarationTypePage
            .loadPage()
            .select(answer)
            .submitPage()
  }

  // ^(?:I )?enter (.+) on the 'What is the TIR carnet reference\?' page$
  def and(?I)?enter(.+)OnThe'WhatIsTheTIRCarnetReference\?'Page(answer: String): Unit = {
    TIRCarnetPage
          .loadPage()
          .fillInput(answer)
          .submitPage()
  }

  // ^(?:I )?choose radio option (.*) on the 'Which type of safety and security details do you want to add\?' page$
  def and(?I)?chooseRadioOptionXOnThe'WhichTypeOfSafetyAndSecurityDetailsDoYouWantToAdd\?'Page(answer: String): Unit = {
    SecurityDetailsPage
          .loadPage()
          .select(answer)
          .submitPage()
  }

  // ^the user has submitted (.+) for LRN (.+) and EORI number (.+)$
  def whenTheUserHasSubmitted(.+)ForLRN(.+)AndEORINumber(.+)(fileName: String, lrn: String, eoriNumber: String): Unit = {
    CacheHelper.submitDepartureAnswers(fileName, lrn, eoriNumber)
  }

  // ^the user has submitted (.+) for MRN (.+) and EORI number (.+)$
  def whenTheUserHasSubmitted(.+)ForMRN(.+)AndEORINumber(.+)(fileName: String, mrn: String, eoriNumber: String): Unit = {
    CacheHelper.submitArrivalAnswers(fileName, mrn, eoriNumber)
  }

  // ^(?:I )?click the Continue button on the standard declaration 'You can only make a standard declaration' page$
  def and(?I)?clickTheContinueButtonOnTheStandardDeclaration'YouCanOnlyMakeAStandardDeclaration'Page(): Unit = {
    StandardDeclarationMoreInformationPage
          .loadPage()
          .submitPage()
  }

}
