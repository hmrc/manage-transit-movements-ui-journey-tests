import uk.gov.hmrc.test.ui.cucumber.stepdefs.BaseStepDef
import uk.gov.hmrc.test.ui.pages.Departures.RouteDetails.LocationOfGoods.*

object RouteDetailsLocationOfGoodsStepDefSteps {

  // ^(?:I )?choose radio option (.*) on the 'Do you want to add a location of goods\?' page$
  def and(?I)?chooseRadioOptionXOnThe'DoYouWantToAddALocationOfGoods\?'Page(answer: String): Unit = {
    AddLocationOfGoodsPage
            .loadPage()
            .select(answer)
            .submitPage()
  }

  // ^(?:I )?choose radio option (.*) on the 'Which type of location is it\?' page$
  def and(?I)?chooseRadioOptionXOnThe'WhichTypeOfLocationIsIt\?'Page(answer: String): Unit = {
    LocationOfGoodsTypePage
          .loadPage()
          .select(answer)
          .submitPage()
  }

  // ^(?:I )?choose radio option (.*) on the 'How do you want to identify the location of goods\?' page$
  def and(?I)?chooseRadioOptionXOnThe'HowDoYouWantToIdentifyTheLocationOfGoods\?'Page(answer: String): Unit = {
    LocationOfGoodsIdentificationPage
            .loadPage()
            .select(answer)
            .submitPage()
  }

  // ^(?:I )?select (.+) on the departure location of goods customs office identification page$
  def and(?I)?select(.+)OnTheDepartureLocationOfGoodsCustomsOfficeIdentificationPage(answer: String): Unit = {
    LocationOfGoodsCustomsOfficeIdentificationPage
            .loadPage()
            .select(answer)
            .submitPage()
  }

  // ^(?:I )?enter (.+) on the departure location of goods eori tin page$
  def and(?I)?enter(.+)OnTheDepartureLocationOfGoodsEoriTinPage(answer: String): Unit = {
    LocationOfGoodsEoriTinPage
          .loadPage()
          .fillInput(answer)
          .submitPage()
  }

  // ^(?:I )?enter (.+) on the 'What is the authorisation number for the location of goods\?' page$
  def and(?I)?enter(.+)OnThe'WhatIsTheAuthorisationNumberForTheLocationOfGoods\?'Page(answer: String): Unit = {
    LocationOfGoodsAuthorisationNumberPage
            .loadPage()
            .fillInput(answer)
            .submitPage()
  }

  // ^(?:I )?select (.+) on the location of goods country page$
  def and(?I)?select(.+)OnTheLocationOfGoodsCountryPage(answer: String): Unit = {
    LocationOfGoodsCountryPage
          .loadPage()
          .select(answer)
          .submitPage()
  }

  // ^(?:I )?fill in address on the departure location of goods address page$
  def and(?I)?fillInAddressOnTheDepartureLocationOfGoodsAddressPage(): Unit = {
    LocationOfGoodsAddressPage
          .loadPage()
          .fillInputs()
          .submitPage()
  }

  // ^(?:I )?enter (.+) on the departure location of goods customs un locode page$
  def and(?I)?enter(.+)OnTheDepartureLocationOfGoodsCustomsUnLocodePage(answer: String): Unit = {
    LocationOfGoodsUnLocodePage
          .loadPage()
          .fillInput(answer)
          .submitPage()
  }

  // ^(?:I )?choose radio option (.*) on the 'Do you want to add an additional identifier for the location of goods\?' page$
  def and(?I)?chooseRadioOptionXOnThe'DoYouWantToAddAnAdditionalIdentifierForTheLocationOfGoods\?'Page(answer: String): Unit = {
    LocationOfGoodsAddIdentificationPage
          .loadPage()
          .select(answer)
          .submitPage()
  }

  // ^(?:I )?enter (.+) on the 'What is the additional identifier for the location of goods\?' page$
  def and(?I)?enter(.+)OnThe'WhatIsTheAdditionalIdentifierForTheLocationOfGoods\?'Page(answer: String): Unit = {
    LocationOfGoodsAdditionalIdentifierPage
            .loadPage()
            .fillInput(answer)
            .submitPage()
  }

  // ^(?:I )?choose radio option (.*) on the 'Do you want to add a contact for the location of goods\?' page$
  def and(?I)?chooseRadioOptionXOnThe'DoYouWantToAddAContactForTheLocationOfGoods\?'Page(answer: String): Unit = {
    LocationOfGoodsAddContactPage
            .loadPage()
            .select(answer)
            .submitPage()
  }

  // ^(?:I )?enter (.+) and (.+) on the 'What are the coordinates for the location of goods' page$
  def and(?I)?enter(.+)And(.+)OnThe'WhatAreTheCoordinatesForTheLocationOfGoods'Page(latitudeNo: String, longitudeNo: String): Unit = {
    LocationOfGoodsCoordinatesPage
            .loadPage()
            .fillInputs(latitudeNo, longitudeNo)
            .submitPage()
  }

  // ^(?:I )?enter (.+) on the 'Who is the contact for the location of goods\?' page$
  def and(?I)?enter(.+)OnThe'WhoIsTheContactForTheLocationOfGoods\?'Page(answer: String): Unit = {
    LocationOfGoodsContactPage
          .loadPage()
          .fillInput(answer)
          .submitPage()
  }

  // ^(?:I )?enter (.+) on the 'What is the phone number for the location of goods’ contact\?' page$
  def and(?I)?enter(.+)OnThe'WhatIsThePhoneNumberForTheLocationOfGoods’Contact\?'Page(answer: String): Unit = {
    LocationOfGoodsContactTelephoneNumberPage
            .loadPage()
            .fillInput(answer)
            .submitPage()
  }

}
