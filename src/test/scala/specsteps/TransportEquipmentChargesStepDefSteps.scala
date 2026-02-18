import uk.gov.hmrc.test.ui.cucumber.stepdefs.BaseStepDef
import uk.gov.hmrc.test.ui.pages.Departures.Transport.TransportEquipmentCharges.*

object TransportEquipmentChargesStepDefSteps {

  // ^(?:I )?choose radio option (.*) on the 'Do you want to add any transport equipment\?' page$
  def and(?I)?chooseRadioOptionXOnThe'DoYouWantToAddAnyTransportEquipment\?'Page(answer: String): Unit = {
    AddTransportEquipmentPage
            .loadPage()
            .select(answer)
            .submitPage()
  }

  // ^(?:I )?choose radio option (.*) on the 'Do you want to add a container identification number\?' page$
  def and(?I)?chooseRadioOptionXOnThe'DoYouWantToAddAContainerIdentificationNumber\?'Page(answer: String): Unit = {
    AddContainerIdentificationNumberPage
            .loadPage()
            .select(answer)
            .submitPage()
  }

  // ^(?:I )?choose radio option (.*) on the 'Do you want to add a seal\?' page$
  def and(?I)?chooseRadioOptionXOnThe'DoYouWantToAddASeal\?'Page(answer: String): Unit = {
    AddSealPage
          .loadPage()
          .select(answer)
          .submitPage()
  }

  // ^(?:I )?choose radio option (.*) on the 'Do you want to add a goods item number\?' page$
  def and(?I)?chooseRadioOptionXOnThe'DoYouWantToAddAGoodsItemNumber\?'Page(answer: String): Unit = {
    AddGoodsItemNumberPage
            .loadPage()
            .select(answer)
            .submitPage()
  }

  // ^(?:I )?click the (.*) link on the 'You have added (.*) transport equipment' page$
  def and(?I)?clickTheXLinkOnThe'YouHaveAddedXTransportEquipment'Page(sectionLink: String, numberOfContainers: String): Unit = {
    AddAnotherContainerPage
            .loadPage(numberOfContainers)
            .clickByPartialLinkText(sectionLink)
  }

  // ^(?:I )?click the (.*) link  on the 'You have added (.*) seals?' page$
  def and(?I)?clickTheXLinkOnThe'YouHaveAddedXSeals?'Page(sectionLink: String, numberOfSeals: String): Unit = {
    AddAnotherSealPage
            .loadPage(numberOfSeals)
            .clickByPartialLinkText(sectionLink)
  }

  // ^(?:I )?click the (.*) link on the 'You have added (.*) goods item numbers?' page$
  def and(?I)?clickTheXLinkOnThe'YouHaveAddedXGoodsItemNumbers?'Page(sectionLink: String, numberOfGoodsItems: String): Unit = {
    AddAnotherGoodsItemPage
            .loadPage(numberOfGoodsItems)
            .clickByPartialLinkText(sectionLink)
  }

  // ^(?:I )?choose radio option (.*) on the 'You have added (.*) transport equipment' page$
  def and(?I)?chooseRadioOptionXOnThe'YouHaveAddedXTransportEquipment'Page(answer: String, numberOfContainers: String): Unit = {
    AddAnotherContainerPage
            .loadPage(numberOfContainers)
            .select(answer)
            .submitPage()
  }

  // ^(?:I )?choose radio option (.*) on the 'You have added (.*) seals?' page$
  def and(?I)?chooseRadioOptionXOnThe'YouHaveAddedXSeals?'Page(answer: String, numberOfSeals: String): Unit = {
    AddAnotherSealPage
            .loadPage(numberOfSeals)
            .select(answer)
            .submitPage()
  }

  // ^(?:I )?choose radio option (.*) on the 'You have added (.*) goods item numbers?' page$
  def and(?I)?chooseRadioOptionXOnThe'YouHaveAddedXGoodsItemNumbers?'Page(answer: String, numberOfGoodsItems: String): Unit = {
    AddAnotherGoodsItemPage
            .loadPage(numberOfGoodsItems)
            .select(answer)
            .submitPage()
  }

  // ^(?:I )?enter (.+) on the 'What is the container identification number\?' page$
  def and(?I)?enter(.+)OnThe'WhatIsTheContainerIdentificationNumber\?'Page(answer: String): Unit = {
    ContainerIdentificationNumberPage
          .loadPage()
          .fillInput(answer)
          .submitPage()
  }

  // ^(?:I )?enter (.+) on the 'What is the seal identification number\?' page$
  def and(?I)?enter(.+)OnThe'WhatIsTheSealIdentificationNumber\?'Page(answer: String): Unit = {
    SealIdentificationNumberPage
          .loadPage()
          .fillInput(answer)
          .submitPage()
  }

  // ^(?:I )?enter (.*) on the 'What is the goods item number\?' page$
  def and(?I)?enterXOnThe'WhatIsTheGoodsItemNumber\?'Page(answer: String): Unit = {
    GoodsItemPage
          .loadPage()
          .fillInput(answer)
          .submitPage()
  }

  // ^(?:I )?click radio option (.*) on the 'Are you sure you want to remove transport equipment (.*)\?' page$
  def and(?I)?clickRadioOptionXOnThe'AreYouSureYouWantToRemoveTransportEquipmentX\?'Page(answer: String, containerIdNumber: String): Unit = {
    RemoveContainerPage
            .loadPage(containerIdNumber)
            .select(answer)
            .submitPage()
  }

  // ^(?:I )?click radio option (.*) on the 'Are you sure you want to remove this seal\?' page$
  def and(?I)?clickRadioOptionXOnThe'AreYouSureYouWantToRemoveThisSeal\?'Page(answer: String): Unit = {
    RemoveSealPage
            .loadPage()
            .select(answer)
            .submitPage()
  }

  // ^(?:I )?click radio option (.*) on the 'Are you sure you want to remove goods item number (.*)\?' page$
  def and(?I)?clickRadioOptionXOnThe'AreYouSureYouWantToRemoveGoodsItemNumberX\?'Page(answer: String, goodsIdNumber: String): Unit = {
    RemoveGoodsItemPage
            .loadPage(goodsIdNumber)
            .select(answer)
            .submitPage()
  }

  // ^(?:I )?choose radio option (.*) on the 'Do you want to add a method of payment for transport charges\?' page$
  def and(?I)?chooseRadioOptionXOnThe'DoYouWantToAddAMethodOfPaymentForTransportCharges\?'Page(answer: String): Unit = {
    AddPaymentMethodPage
          .loadPage()
          .select(answer)
          .submitPage()
  }

  // ^(?:I )?choose radio option (.*) on the 'Which method of payment do you want to use for transport charges\?' page$
  def and(?I)?chooseRadioOptionXOnThe'WhichMethodOfPaymentDoYouWantToUseForTransportCharges\?'Page(answer: String): Unit = {
    MethodOfPaymentPage
          .loadPage()
          .select(answer)
          .submitPage()
  }

}
