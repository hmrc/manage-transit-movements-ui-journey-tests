import uk.gov.hmrc.test.ui.cucumber.stepdefs.BaseStepDef
import uk.gov.hmrc.test.ui.pages.Departures.Documents.Documents.*
import uk.gov.hmrc.test.ui.pages.Departures.Documents.Previous.*

object PreviousStepDefSteps {

  // ^(?:I )?click radio option (.*) on the 'Do you want to add a goods item number\?' page$
  def and(?I)?clickRadioOptionXOnThe'DoYouWantToAddAGoodsItemNumber\?'Page(answer: String): Unit = {
    AddGoodsItemNumberPage
            .loadPage()
            .select(answer)
            .submitPage()
  }

  // ^(?:I )?enter (.+) on the documents 'What is the goods item number\?' page$
  def and(?I)?enter(.+)OnTheDocuments'WhatIsTheGoodsItemNumber\?'Page(answer: String): Unit = {
    GoodsItemNumberPage
          .loadPage()
          .fillInput(answer)
          .submitPage()
  }

  // ^(?:I )?click radio option (.*) on the 'Do you want to declare the package used to transport the goods into the UK\?' page$
  def and(?I)?clickRadioOptionXOnThe'DoYouWantToDeclareThePackageUsedToTransportTheGoodsIntoTheUK\?'Page(answer: String): Unit = {
    DeclarePackagePage
          .loadPage()
          .select(answer)
          .submitPage()
  }

  // ^(?:I )?select (.+) on the 'What type of package was used to transport the goods into the UK\?' page$
  def and(?I)?select(.+)OnThe'WhatTypeOfPackageWasUsedToTransportTheGoodsIntoTheUK\?'Page(answer: String): Unit = {
    PackageTypePage
            .loadPage()
            .select(answer)
            .submitPage()
  }

  // ^(?:I )?enter (.+) on the 'How many of these do the goods include\?' page$
  def and(?I)?enter(.+)OnThe'HowManyOfTheseDoTheGoodsInclude\?'Page(answer: String): Unit = {
    GoodsItemMetricAmountPage
          .loadPage()
          .fillInput(answer)
          .submitPage()
  }

  // ^(?:I )?select (.+) on the 'What metric do you want to use for the quantity of goods\?' page$
  def and(?I)?select(.+)OnThe'WhatMetricDoYouWantToUseForTheQuantityOfGoods\?'Page(answer: String): Unit = {
    MetricTypePage
            .loadPage()
            .select(answer)
            .submitPage()
  }

  // ^(?:I )?click radio option (.*) on the 'Do you want to declare the quantity of goods transported into the UK\?' page$
  def and(?I)?clickRadioOptionXOnThe'DoYouWantToDeclareTheQuantityOfGoodsTransportedIntoTheUK\?'Page(answer: String): Unit = {
    AddGoodsMetricPage
          .loadPage()
          .select(answer)
          .submitPage()
  }

  // ^(?:I )?enter (.+) on the documents 'How many of these were there\?' page$
  def and(?I)?enter(.+)OnTheDocuments'HowManyOfTheseWereThere\?'Page(answer: String): Unit = {
    PackageQuantityPage
          .loadPage()
          .fillInput(answer)
          .submitPage()
  }

  // ^(?:I )?click radio option (.*) on the 'Do you want to declare the quantity of this package\?' page$
  def and(?I)?clickRadioOptionXOnThe'DoYouWantToDeclareTheQuantityOfThisPackage\?'Page(answer: String): Unit = {
    DeclareQuantityOfPackagePage
            .loadPage()
            .select(answer)
            .submitPage()
  }

  // ^(?:I )?click radio option (.*) on the 'Do you want to add any additional information for this document\?' page$
  def and(?I)?clickRadioOptionXOnThe'DoYouWantToAddAnyAdditionalInformationForThisDocument\?'Page(answer: String): Unit = {
    AddAdditionalInformationPage
          .loadPage()
          .select(answer)
          .submitPage()
  }

  // ^(?:I )?enter (.+) on the Documents 'Enter the additional information' page$
  def and(?I)?enter(.+)OnTheDocuments'EnterTheAdditionalInformation'Page(answer: String): Unit = {
    DocumentEnterAdditionalInfoPage
          .loadPage()
          .fillInput(answer)
          .submitPage()
  }

}
