import uk.gov.hmrc.test.ui.cucumber.stepdefs.BaseStepDef
import uk.gov.hmrc.test.ui.pages.Departures.TraderDetails.Consignee.*
import uk.gov.hmrc.test.ui.pages.Departures.TraderDetails.Consignor.*
import uk.gov.hmrc.test.ui.pages.Departures.TraderDetails.Representative.*
import uk.gov.hmrc.test.ui.pages.Departures.TraderDetails.SetReducedDataSetIndicatorPage
import uk.gov.hmrc.test.ui.pages.Departures.TraderDetails.TransitHolder.*

object TraderDetailsStepDefSteps {

  // ^(?:I )?choose radio option (.*) on the 'Do you know the transit holder’s EORI number\?' page$
  def andIchooseRadioOptionXOnTheDoYouKnowTheTransitHoldersEORINumberPage(answer: String): Unit = {
    IsHolderEoriKnownPage
            .loadPage()
            .select(answer)
            .submitPage()
  }

  // ^(?:I )?enter (.+) on the 'What is the transit holder’s EORI number\?' page$
  def andIenterOnTheWhatIsTheTransitHoldersEORINumberPage(answer: String): Unit = {
    HolderEoriNumberOrTinPage
          .loadPage()
          .fillInput(answer)
          .submitPage()
  }

  // ^(?:I )?enter (.+) on the 'What is the transit holder’s name\?' page$
  def andIenterOnTheWhatIsTheTransitHoldersNamePage(answer: String): Unit = {
    HolderNamePage
          .loadPage()
          .fillInput(answer)
          .submitPage()
  }

  // ^(?:I )?select (.+) on the 'Which country is the transit holder based in\?' page$
  def andIselectOnTheWhichCountryIsTheTransitHolderBasedInPage(answer: String): Unit = {
    HolderCountryPage
          .loadPage()
          .select(answer)
          .submitPage()
  }

  // ^(?:I )?fill in the address on the 'What is the transit holder’s address\?' page$
  def andIfillInTheAddressOnTheWhatIsTheTransitHoldersAddressPage(): Unit = {
    HolderAddressPage
          .loadPage()
          .fillInputs()
          .submitPage()
  }

  // ^(?:I )?choose radio option (.*) on the 'Do you want to add a contact for the transit holder\?' page$
  def andIchooseRadioOptionXOnTheDoYouWantToAddAContactForTheTransitHolderPage(answer: String): Unit = {
    AddHolderContactPersonPage
            .loadPage()
            .select(answer)
            .submitPage()
  }

  // ^(?:I )?enter (.+) on the 'What is the contact’s name\?' page$
  def andIenterNameOnTheWhatIsTheContactsNamePage(answer: String): Unit = {
    AddHolderContactNamePage
          .loadPage()
          .fillInput(answer)
          .submitPage()
  }

  // ^(?:I )?enter (.+) on the 'What is the phone number for the transit holder’s contact\?' page$
  def andIenterOnTheWhatIsThePhoneNumberForTheTransitHoldersContactPage(answer: String): Unit = {
    AddHolderContactPhoneNumberPage
            .loadPage()
            .fillInput(answer)
            .submitPage()
  }

  // ^(?:I )?choose radio option (.*) on the 'Are you acting as a representative\?' page$
  def andIchooseRadioOptionXOnTheAreYouActingAsARepresentativePage(answer: String): Unit = {
    ActingAsRepresentativePage
          .loadPage()
          .select(answer)
          .submitPage()
  }

  // ^(?:I )?enter (.+) on the representative 'What is your EORI number or TIN\?' page$
  def andIenterOnTheRepresentativeWhatIsYourEORINumberOrTINPage(answer: String): Unit = {
    RepresentativeEoriNumbeOrTinPage
          .loadPage()
          .fillInput(answer)
          .submitPage()
  }

  // ^(?:I )?choose radio option (.*) on the representative 'Do you want to add your details\?' page$
  def andIchooseRadioOptionXOnTheRepresentativeDoYouWantToAddYourDetailsPage(answer: String): Unit = {
    RepresentativeAddContactPage
            .loadPage()
            .select(answer)
            .submitPage()
  }

  // ^(?:I )?enter (.+) on the representative 'What is your name\?' page$
  def andIenterOnTheRepresentativeWhatIsYourNamePage(answer: String): Unit = {
    RepresentativeNamePage
          .loadPage()
          .fillInput(answer)
          .submitPage()
  }

  // ^(?:I )?enter (.+) on the representative 'What is your phone number\?' page$
  def andIenterOnTheRepresentativeWhatIsYourPhoneNumberPage(answer: String): Unit = {
    RepresentativePhoneNumberPage
          .loadPage()
          .fillInput(answer)
          .submitPage()
  }

  // ^(?:I )?choose radio option (.*) on the 'Do you want to use a reduced data set\?' page
  def thenIchooseRadioOptionXOnTheDoYouWantToUseAReducedDataSetPage(answer: String): Unit = {
    SetReducedDataSetIndicatorPage
            .loadPage()
            .select(answer)
            .submitPage()
  }

  // ^(?:I )?choose radio option (.*) on the 'Is the TIR holder’s identification number known\?' page$
  def andIchooseRadioOptionXOnTheIsTheTIRHoldersIdentificationNumberKnownPage(answer: String): Unit = {
    IsTIRidKnownPage
            .loadPage()
            .select(answer)
            .submitPage()
  }

  // ^(?:I )?enter (.+) on the 'What is the TIR holder’s identification number\?' page$
  def andIenterOnTheWhatIsTheTIRHoldersIdentificationNumberPage(answer: String): Unit = {
    TirHolderIdPage
          .loadPage()
          .fillInput(answer)
          .submitPage()
  }

  // ^(?:I )?choose radio option (.*) on the 'Do you know the consignor’s EORI number or TIN\?' page$
  def andIchooseRadioOptionXOnTheDoYouKnowTheConsignorsEORINumberOrTINPage(answer: String): Unit = {
    IsConsignorEoriNumberOrTinKnownPage
            .loadPage()
            .select(answer)
            .submitPage()
  }

  // ^(?:I )?enter (.+) on the 'What is the consignor’s EORI number or TIN\?' page$
  def andIenterOnTheWhatIsTheConsignorsEORINumberOrTINPage(answer: String): Unit = {
    ConsignorEoriNumberOrTinPage
          .loadPage()
          .fillInput(answer)
          .submitPage()
  }

  // ^(?:I )?enter (.+) on the 'What is the consignor’s name\?' page$
  def andIenterOnTheWhatIsTheConsignorsNamePage(answer: String): Unit = {
    ConsignorNamePage
          .loadPage()
          .fillInput(answer)
          .submitPage()
  }

  // ^(?:I )?select (.+) on the 'Which country is the consignee based in\?' page$
  def andIselectOnTheWhichCountryIsTheConsigneeBasedInPage(answer: String): Unit = {
    ConsigneeCountryPage
          .loadPage()
          .select(answer)
          .submitPage()
  }

  // ^(?:I )?fill in the address on the 'What is the consignor’s address\?' page$
  def andIfillInTheAddressOnTheWhatIsTheConsignorsAddressPage(): Unit = {
    ConsignorAddressPage
          .loadPage()
          .fillInputs()
          .submitPage()
  }

  // ^(?:I )?choose radio option (.*) on the 'Do you want to add a contact for the consignor\?' page$
  def andIchooseRadioOptionXOnTheDoYouWantToAddAContactForTheConsignorPage(answer: String): Unit = {
    AddConsignorContactPersonPage
            .loadPage()
            .select(answer)
            .submitPage()
  }

  // ^(?:I )?enter (.+) on the 'What is the contact's name\?' page$
  def andIenterOnTheWhatIsTheContactsNamePage(answer: String): Unit = {
    AddConsignorContactNamePage
          .loadPage()
          .fillInput(answer)
          .submitPage()
  }

  // ^(?:I )?enter (.+) on the 'What is the phone number for the consignor’s contact\?' page$
  def andIenterOnTheWhatIsThePhoneNumberForTheConsignorsContactPage(answer: String): Unit = {
    AddConsignorContactPhoneNumberPage
            .loadPage()
            .fillInput(answer)
            .submitPage()
  }

  // ^(?:I )?choose radio option (.*) on the 'Do you know the consignee’s EORI number or TIN\?' page$
  def andIchooseRadioOptionXOnTheDoYouKnowTheConsigneesEORINumberOrTINPage(answer: String): Unit = {
    IsConsigneeEoriNumberOrTinKnownPage
            .loadPage()
            .select(answer)
            .submitPage()
  }

  // ^(?:I )?enter (.+) on the 'What is the consignee’s EORI number or TIN\?' page$
  def andIenterOnTheWhatIsTheConsigneesEORINumberOrTINPage(answer: String): Unit = {
    ConsigneeEoriNumberOrTinPage
          .loadPage()
          .fillInput(answer)
          .submitPage()
  }

  // ^(?:I )?enter (.+) on the 'What is the consignee’s name\?' page$
  def andIenterOnTheWhatIsTheConsigneesNamePage(answer: String): Unit = {
    ConsigneeNamePage
          .loadPage()
          .fillInput(answer)
          .submitPage()
  }

  // ^(?:I )?select (.+) on the 'Which country is the consignor based in\?' page$
  def andIselectOnTheWhichCountryIsTheConsignorBasedInPage(answer: String): Unit = {
    ConsignorCountryPage
          .loadPage()
          .select(answer)
          .submitPage()
  }

  // ^(?:I )?fill in the address on the 'What is the consignee’s address\?' page$
  def andIfillInTheAddressOnTheWhatIsTheConsigneesAddressPage(): Unit = {
    ConsigneeAddressPage
          .loadPage()
          .fillInputs()
          .submitPage()
  }

}
