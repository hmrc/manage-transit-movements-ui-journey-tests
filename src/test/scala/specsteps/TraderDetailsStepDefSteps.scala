import uk.gov.hmrc.test.ui.cucumber.stepdefs.BaseStepDef
import uk.gov.hmrc.test.ui.pages.Departures.TraderDetails.Consignee.*
import uk.gov.hmrc.test.ui.pages.Departures.TraderDetails.Consignor.*
import uk.gov.hmrc.test.ui.pages.Departures.TraderDetails.Representative.*
import uk.gov.hmrc.test.ui.pages.Departures.TraderDetails.SetReducedDataSetIndicatorPage
import uk.gov.hmrc.test.ui.pages.Departures.TraderDetails.TransitHolder.*

object TraderDetailsStepDefSteps {

  // ^(?:I )?choose radio option (.*) on the 'Do you know the transit holder’s EORI number\?' page$
  def and(?I)?chooseRadioOptionXOnThe'DoYouKnowTheTransitHolder’sEORINumber\?'Page(answer: String): Unit = {
    IsHolderEoriKnownPage
            .loadPage()
            .select(answer)
            .submitPage()
  }

  // ^(?:I )?enter (.+) on the 'What is the transit holder’s EORI number\?' page$
  def and(?I)?enter(.+)OnThe'WhatIsTheTransitHolder’sEORINumber\?'Page(answer: String): Unit = {
    HolderEoriNumberOrTinPage
          .loadPage()
          .fillInput(answer)
          .submitPage()
  }

  // ^(?:I )?enter (.+) on the 'What is the transit holder’s name\?' page$
  def and(?I)?enter(.+)OnThe'WhatIsTheTransitHolder’sName\?'Page(answer: String): Unit = {
    HolderNamePage
          .loadPage()
          .fillInput(answer)
          .submitPage()
  }

  // ^(?:I )?select (.+) on the 'Which country is the transit holder based in\?' page$
  def and(?I)?select(.+)OnThe'WhichCountryIsTheTransitHolderBasedIn\?'Page(answer: String): Unit = {
    HolderCountryPage
          .loadPage()
          .select(answer)
          .submitPage()
  }

  // ^(?:I )?fill in the address on the 'What is the transit holder’s address\?' page$
  def and(?I)?fillInTheAddressOnThe'WhatIsTheTransitHolder’sAddress\?'Page(): Unit = {
    HolderAddressPage
          .loadPage()
          .fillInputs()
          .submitPage()
  }

  // ^(?:I )?choose radio option (.*) on the 'Do you want to add a contact for the transit holder\?' page$
  def and(?I)?chooseRadioOptionXOnThe'DoYouWantToAddAContactForTheTransitHolder\?'Page(answer: String): Unit = {
    AddHolderContactPersonPage
            .loadPage()
            .select(answer)
            .submitPage()
  }

  // ^(?:I )?enter (.+) on the 'What is the contact’s name\?' page$
  def and(?I)?enter(.+)OnThe'WhatIsTheContact’sName\?'Page(answer: String): Unit = {
    AddHolderContactNamePage
          .loadPage()
          .fillInput(answer)
          .submitPage()
  }

  // ^(?:I )?enter (.+) on the 'What is the phone number for the transit holder’s contact\?' page$
  def and(?I)?enter(.+)OnThe'WhatIsThePhoneNumberForTheTransitHolder’sContact\?'Page(answer: String): Unit = {
    AddHolderContactPhoneNumberPage
            .loadPage()
            .fillInput(answer)
            .submitPage()
  }

  // ^(?:I )?choose radio option (.*) on the 'Are you acting as a representative\?' page$
  def and(?I)?chooseRadioOptionXOnThe'AreYouActingAsARepresentative\?'Page(answer: String): Unit = {
    ActingAsRepresentativePage
          .loadPage()
          .select(answer)
          .submitPage()
  }

  // ^(?:I )?enter (.+) on the representative 'What is your EORI number or TIN\?' page$
  def and(?I)?enter(.+)OnTheRepresentative'WhatIsYourEORINumberOrTIN\?'Page(answer: String): Unit = {
    RepresentativeEoriNumbeOrTinPage
          .loadPage()
          .fillInput(answer)
          .submitPage()
  }

  // ^(?:I )?choose radio option (.*) on the representative 'Do you want to add your details\?' page$
  def and(?I)?chooseRadioOptionXOnTheRepresentative'DoYouWantToAddYourDetails\?'Page(answer: String): Unit = {
    RepresentativeAddContactPage
            .loadPage()
            .select(answer)
            .submitPage()
  }

  // ^(?:I )?enter (.+) on the representative 'What is your name\?' page$
  def and(?I)?enter(.+)OnTheRepresentative'WhatIsYourName\?'Page(answer: String): Unit = {
    RepresentativeNamePage
          .loadPage()
          .fillInput(answer)
          .submitPage()
  }

  // ^(?:I )?enter (.+) on the representative 'What is your phone number\?' page$
  def and(?I)?enter(.+)OnTheRepresentative'WhatIsYourPhoneNumber\?'Page(answer: String): Unit = {
    RepresentativePhoneNumberPage
          .loadPage()
          .fillInput(answer)
          .submitPage()
  }

  // ^(?:I )?choose radio option (.*) on the 'Do you want to use a reduced data set\?' page
  def then(?I)?chooseRadioOptionXOnThe'DoYouWantToUseAReducedDataSet\?'Page(answer: String): Unit = {
    SetReducedDataSetIndicatorPage
            .loadPage()
            .select(answer)
            .submitPage()
  }

  // ^(?:I )?choose radio option (.*) on the 'Is the TIR holder’s identification number known\?' page$
  def and(?I)?chooseRadioOptionXOnThe'IsTheTIRHolder’sIdentificationNumberKnown\?'Page(answer: String): Unit = {
    IsTIRidKnownPage
            .loadPage()
            .select(answer)
            .submitPage()
  }

  // ^(?:I )?enter (.+) on the 'What is the TIR holder’s identification number\?' page$
  def and(?I)?enter(.+)OnThe'WhatIsTheTIRHolder’sIdentificationNumber\?'Page(answer: String): Unit = {
    TirHolderIdPage
          .loadPage()
          .fillInput(answer)
          .submitPage()
  }

  // ^(?:I )?choose radio option (.*) on the 'Do you know the consignor’s EORI number or TIN\?' page$
  def and(?I)?chooseRadioOptionXOnThe'DoYouKnowTheConsignor’sEORINumberOrTIN\?'Page(answer: String): Unit = {
    IsConsignorEoriNumberOrTinKnownPage
            .loadPage()
            .select(answer)
            .submitPage()
  }

  // ^(?:I )?enter (.+) on the 'What is the consignor’s EORI number or TIN\?' page$
  def and(?I)?enter(.+)OnThe'WhatIsTheConsignor’sEORINumberOrTIN\?'Page(answer: String): Unit = {
    ConsignorEoriNumberOrTinPage
          .loadPage()
          .fillInput(answer)
          .submitPage()
  }

  // ^(?:I )?enter (.+) on the 'What is the consignor’s name\?' page$
  def and(?I)?enter(.+)OnThe'WhatIsTheConsignor’sName\?'Page(answer: String): Unit = {
    ConsignorNamePage
          .loadPage()
          .fillInput(answer)
          .submitPage()
  }

  // ^(?:I )?select (.+) on the 'Which country is the consignee based in\?' page$
  def and(?I)?select(.+)OnThe'WhichCountryIsTheConsigneeBasedIn\?'Page(answer: String): Unit = {
    ConsigneeCountryPage
          .loadPage()
          .select(answer)
          .submitPage()
  }

  // ^(?:I )?fill in the address on the 'What is the consignor’s address\?' page$
  def and(?I)?fillInTheAddressOnThe'WhatIsTheConsignor’sAddress\?'Page(): Unit = {
    ConsignorAddressPage
          .loadPage()
          .fillInputs()
          .submitPage()
  }

  // ^(?:I )?choose radio option (.*) on the 'Do you want to add a contact for the consignor\?' page$
  def and(?I)?chooseRadioOptionXOnThe'DoYouWantToAddAContactForTheConsignor\?'Page(answer: String): Unit = {
    AddConsignorContactPersonPage
            .loadPage()
            .select(answer)
            .submitPage()
  }

  // ^(?:I )?enter (.+) on the 'What is the contact's name\?' page$
  def and(?I)?enter(.+)OnThe'WhatIsTheContact'sName\?'Page(answer: String): Unit = {
    AddConsignorContactNamePage
          .loadPage()
          .fillInput(answer)
          .submitPage()
  }

  // ^(?:I )?enter (.+) on the 'What is the phone number for the consignor’s contact\?' page$
  def and(?I)?enter(.+)OnThe'WhatIsThePhoneNumberForTheConsignor’sContact\?'Page(answer: String): Unit = {
    AddConsignorContactPhoneNumberPage
            .loadPage()
            .fillInput(answer)
            .submitPage()
  }

  // ^(?:I )?choose radio option (.*) on the 'Do you know the consignee’s EORI number or TIN\?' page$
  def and(?I)?chooseRadioOptionXOnThe'DoYouKnowTheConsignee’sEORINumberOrTIN\?'Page(answer: String): Unit = {
    IsConsigneeEoriNumberOrTinKnownPage
            .loadPage()
            .select(answer)
            .submitPage()
  }

  // ^(?:I )?enter (.+) on the 'What is the consignee’s EORI number or TIN\?' page$
  def and(?I)?enter(.+)OnThe'WhatIsTheConsignee’sEORINumberOrTIN\?'Page(answer: String): Unit = {
    ConsigneeEoriNumberOrTinPage
          .loadPage()
          .fillInput(answer)
          .submitPage()
  }

  // ^(?:I )?enter (.+) on the 'What is the consignee’s name\?' page$
  def and(?I)?enter(.+)OnThe'WhatIsTheConsignee’sName\?'Page(answer: String): Unit = {
    ConsigneeNamePage
          .loadPage()
          .fillInput(answer)
          .submitPage()
  }

  // ^(?:I )?select (.+) on the 'Which country is the consignor based in\?' page$
  def and(?I)?select(.+)OnThe'WhichCountryIsTheConsignorBasedIn\?'Page(answer: String): Unit = {
    ConsignorCountryPage
          .loadPage()
          .select(answer)
          .submitPage()
  }

  // ^(?:I )?fill in the address on the 'What is the consignee’s address\?' page$
  def and(?I)?fillInTheAddressOnThe'WhatIsTheConsignee’sAddress\?'Page(): Unit = {
    ConsigneeAddressPage
          .loadPage()
          .fillInputs()
          .submitPage()
  }

}
