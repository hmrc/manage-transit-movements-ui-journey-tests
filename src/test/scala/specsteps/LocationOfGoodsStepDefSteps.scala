import uk.gov.hmrc.test.ui.cucumber.stepdefs.BaseStepDef
import uk.gov.hmrc.test.ui.pages.Arrivals.{Arrivals_ContactPhoneNumberPage, Arrivals_LocationOfGoodsAddContactPage, Arrivals_LocationOfGoodsAuthorisationNumberPage, Arrivals_LocationOfGoodsContactNamePage, Arrivals_LocationOfGoodsCoordinatesPage, Arrivals_LocationOfGoodsCustomsOfficeIdentificationPage, Arrivals_LocationOfGoodsIdentificationPage, Arrivals_LocationOfGoodsTypePage}
import uk.gov.hmrc.test.ui.pages.Arrivals.*

object LocationOfGoodsStepDefSteps {

  // ^(?:I )?choose radio option (.*) on the arrival location of goods type page$
  def andIchooseRadioOptionXOnTheArrivalLocationOfGoodsTypePage(answer: String): Unit = {
    Arrivals_LocationOfGoodsTypePage
          .loadPage()
          .select(answer)
          .submitPage()
  }

  // ^(?:I )?choose radio option (.*) on the arrival location of goods identification page$
  def andIchooseRadioOptionXOnTheArrivalLocationOfGoodsIdentificationPage(answer: String): Unit = {
    Arrivals_LocationOfGoodsIdentificationPage
            .loadPage()
            .select(answer)
            .submitPage()
  }

  // ^(?:I )?enter (.+) and (.+) on the arrival location of goods coordinates page$
  def andIenterAndOnTheArrivalLocationOfGoodsCoordinatesPage(latitudeNo: String, longitudeNo: String): Unit = {
    Arrivals_LocationOfGoodsCoordinatesPage
            .loadPage()
            .fillInputs(latitudeNo, longitudeNo)
            .submitPage()
  }

  // ^(?:I )?select (.+) on the arrival location of goods customs office identification page$
  def andIselectOnTheArrivalLocationOfGoodsCustomsOfficeIdentificationPage(answer: String): Unit = {
    Arrivals_LocationOfGoodsCustomsOfficeIdentificationPage
            .loadPage()
            .select(answer)
            .submitPage()
  }

  // ^(?:I )?enter (.+) on the arrival location of goods authorisation number page$
  def andIenterOnTheArrivalLocationOfGoodsAuthorisationNumberPage(answer: String): Unit = {
    Arrivals_LocationOfGoodsAuthorisationNumberPage
          .loadPage()
          .fillInput(answer)
          .submitPage()
  }

  // ^(?:I )?choose radio option (.*) on the arrival location of goods add contact page$
  def andIchooseRadioOptionXOnTheArrivalLocationOfGoodsAddContactPage(answer: String): Unit = {
    Arrivals_LocationOfGoodsAddContactPage
          .loadPage()
          .select(answer)
          .submitPage()
  }

  // ^(?:I )?enter (.+) on the arrival location of goods contact page$
  def andIenterOnTheArrivalLocationOfGoodsContactPage(answer: String): Unit = {
    Arrivals_LocationOfGoodsContactNamePage
          .loadPage()
          .fillInput(answer)
          .submitPage()
  }

  // ^(?:I )?enter (.+) on the arrival location of goods contact number page$
  def andIenterOnTheArrivalLocationOfGoodsContactNumberPage(answer: String): Unit = {
    Arrivals_ContactPhoneNumberPage
          .loadPage()
          .fillInput(answer)
          .submitPage()
  }

}
