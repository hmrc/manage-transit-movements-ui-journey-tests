import uk.gov.hmrc.test.ui.cucumber.stepdefs.BaseStepDef
import uk.gov.hmrc.test.ui.pages.Departures.Transport.TransportEquipmentCharges.*

object TransportEquipmentChargesStepDefSteps {

  // ^(?:I )?choose radio option (.*) on the 'Do you want to add any transport equipment\?' page$
  def andIchooseRadioOptionXOnTheDoYouWantToAddAnyTransportEquipmentPage(answer: String): Unit = {
    AddTransportEquipmentPage
            .loadPage()
            .select(answer)
            .submitPage()
  }

  // ^(?:I )?choose radio option (.*) on the 'Do you want to add a container identification number\?' page$
  def andIchooseRadioOptionXOnTheDoYouWantToAddAContainerIdentificationNumberPage(answer: String): Unit = {
    AddContainerIdentificationNumberPage
            .loadPage()
            .select(answer)
            .submitPage()
  }

  // ^(?:I )?choose radio option (.*) on the 'Do you want to add a seal\?' page$
  def andIchooseRadioOptionXOnTheDoYouWantToAddASealPage(answer: String): Unit = {
    AddSealPage
          .loadPage()
          .select(answer)
          .submitPage()
  }

  // ^(?:I )?choose radio option (.*) on the 'Do you want to add a goods item number\?' page$
  def andIchooseRadioOptionXOnTheDoYouWantToAddAGoodsItemNumberPage(answer: String): Unit = {
    AddGoodsItemNumberPage
            .loadPage()
            .select(answer)
            .submitPage()
  }

  // ^(?:I )?click the (.*) link on the 'You have added (.*) transport equipment' page$
  def andIclickTheXLinkOnTheYouHaveAddedXTransportEquipmentPage(sectionLink: String, numberOfContainers: String): Unit = {
    AddAnotherContainerPage
            .loadPage(numberOfContainers)
            .clickByPartialLinkText(sectionLink)
  }

  // ^(?:I )?click the (.*) link  on the 'You have added (.*) seals?' page$
  def andIclickTheXLinkOnTheYouHaveAddedXSealsPage(sectionLink: String, numberOfSeals: String): Unit = {
    AddAnotherSealPage
            .loadPage(numberOfSeals)
            .clickByPartialLinkText(sectionLink)
  }

  // ^(?:I )?click the (.*) link on the 'You have added (.*) goods item numbers?' page$
  def andIclickTheXLinkOnTheYouHaveAddedXGoodsItemNumbersPage(sectionLink: String, numberOfGoodsItems: String): Unit = {
    AddAnotherGoodsItemPage
            .loadPage(numberOfGoodsItems)
            .clickByPartialLinkText(sectionLink)
  }

  // ^(?:I )?choose radio option (.*) on the 'You have added (.*) transport equipment' page$
  def andIchooseRadioOptionXOnTheYouHaveAddedXTransportEquipmentPage(answer: String, numberOfContainers: String): Unit = {
    AddAnotherContainerPage
            .loadPage(numberOfContainers)
            .select(answer)
            .submitPage()
  }

  // ^(?:I )?choose radio option (.*) on the 'You have added (.*) seals?' page$
  def andIchooseRadioOptionXOnTheYouHaveAddedXSealsPage(answer: String, numberOfSeals: String): Unit = {
    AddAnotherSealPage
            .loadPage(numberOfSeals)
            .select(answer)
            .submitPage()
  }

  // ^(?:I )?choose radio option (.*) on the 'You have added (.*) goods item numbers?' page$
  def andIchooseRadioOptionXOnTheYouHaveAddedXGoodsItemNumbersPage(answer: String, numberOfGoodsItems: String): Unit = {
    AddAnotherGoodsItemPage
            .loadPage(numberOfGoodsItems)
            .select(answer)
            .submitPage()
  }

  // ^(?:I )?enter (.+) on the 'What is the container identification number\?' page$
  def andIenterOnTheWhatIsTheContainerIdentificationNumberPage(answer: String): Unit = {
    ContainerIdentificationNumberPage
          .loadPage()
          .fillInput(answer)
          .submitPage()
  }

  // ^(?:I )?enter (.+) on the 'What is the seal identification number\?' page$
  def andIenterOnTheWhatIsTheSealIdentificationNumberPage(answer: String): Unit = {
    SealIdentificationNumberPage
          .loadPage()
          .fillInput(answer)
          .submitPage()
  }

  // ^(?:I )?enter (.*) on the 'What is the goods item number\?' page$
  def andIenterXOnTheWhatIsTheGoodsItemNumberPage(answer: String): Unit = {
    GoodsItemPage
          .loadPage()
          .fillInput(answer)
          .submitPage()
  }

  // ^(?:I )?click radio option (.*) on the 'Are you sure you want to remove transport equipment (.*)\?' page$
  def andIclickRadioOptionXOnTheAreYouSureYouWantToRemoveTransportEquipmentXPage(answer: String, containerIdNumber: String): Unit = {
    RemoveContainerPage
            .loadPage(containerIdNumber)
            .select(answer)
            .submitPage()
  }

  // ^(?:I )?click radio option (.*) on the 'Are you sure you want to remove this seal\?' page$
  def andIclickRadioOptionXOnTheAreYouSureYouWantToRemoveThisSealpage(answer: String): Unit = {
    RemoveSealPage
            .loadPage()
            .select(answer)
            .submitPage()
  }

  // ^(?:I )?click radio option (.*) on the 'Are you sure you want to remove goods item number (.*)\?' page$
  def andIclickRadioOptionXOnTheAreYouSureYouWantToRemoveGoodsItemNumberXPage(answer: String, goodsIdNumber: String): Unit = {
    RemoveGoodsItemPage
            .loadPage(goodsIdNumber)
            .select(answer)
            .submitPage()
  }

  // ^(?:I )?choose radio option (.*) on the 'Do you want to add a method of payment for transport charges\?' page$
  def andIchooseRadioOptionXOnTheDoYouWantToAddAMethodOfPaymentForTransportChargesPage(answer: String): Unit = {
    AddPaymentMethodPage
          .loadPage()
          .select(answer)
          .submitPage()
  }

  // ^(?:I )?choose radio option (.*) on the 'Which method of payment do you want to use for transport charges\?' page$
  def andIchooseRadioOptionXOnTheWhichMethodOfPaymentDoYouWantToUseForTransportChargesPage(answer: String): Unit = {
    MethodOfPaymentPage
          .loadPage()
          .select(answer)
          .submitPage()
  }

}
