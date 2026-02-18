import uk.gov.hmrc.test.ui.cucumber.stepdefs.BaseStepDef
import uk.gov.hmrc.test.ui.pages.Departures.Transport.Carrier.*

object CarrierDetailsStepDefSteps {

  // ^(?:I )?choose radio option (.*) on the 'Do you want to add a carrier\?' page$
  def andIChooseRadioOptionXOnTheDoYouWantToAddACarrierPage(answer: String): Unit = {
    AddCarrierPage
          .loadPage()
          .select(answer)
          .submitPage()
  }

  // ^(?:I )?enter (.+) on the 'What is the carrier’s EORI number or Third Country Unique Identification Number TCUIN\?' page$
  def andIenterOnTheWhatIsTheCarriersEORINumberOrThirdCountryUniqueIdentificationNumberTCUINPage(answer: String): Unit = {
    CarrierEoriNumberOrTinPage
          .loadPage()
          .fillInput(answer)
          .submitPage()
  }

  // ^(?:I )?choose radio option (.*) on the 'Do you want to add a contact for the carrier\?' page$
  def andIchooseRadioOptionXOnThEDoYouWantToAddAContactForTheCarrierPage(answer: String): Unit = {
    AddCarrierContactPersonPage
            .loadPage()
            .select(answer)
            .submitPage()
  }

  // ^(?:I )?enter (.+) on the 'Who is the contact for the carrier\?' page$
  def andIenterOnTheWhoIsTheContactForTheCarrierPage(answer: String): Unit = {
    AddCarrierContactNamePage
          .loadPage()
          .fillInput(answer)
          .submitPage()
  }

  // ^(?:I )?enter (.+) on the 'What is the phone number for the carrier’s contact\?' page$
  def andIenterOnTheWhatIsThePhoneNumberForTheCarriersContactPage(answer: String): Unit = {
    CarrierContactPhoneNumberPage
            .loadPage()
            .fillInput(answer)
            .submitPage()
  }

}
