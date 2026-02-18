import uk.gov.hmrc.test.ui.cucumber.stepdefs.BaseStepDef
import uk.gov.hmrc.test.ui.pages.Departures.Transport.BorderMeansOfTransport.{AddAnotherDepartureMeansOfTransportPage, AddNewBorderModeOfTransportPage, RemoveDepartureMeansOfTransportPage}
import uk.gov.hmrc.test.ui.pages.Departures.Transport.InlandModeOfTransport.*

object InlandModeOfTransportStepDefSteps {

  // ^(?:I )?choose radio option (.*) on the 'Which inland mode of transport are you using\?' page$
  def and(?I)?chooseRadioOptionXOnThe'WhichInlandModeOfTransportAreYouUsing\?'Page(answer: String): Unit = {
    InlandModeOfTransportPage
            .loadPage()
            .select(answer)
            .submitPage()
  }

  // ^(?:I )?choose radio option (.*) on the inland mode 'Which identification do you want to use for this vehicle\?' page$
  def and(?I)?chooseRadioOptionXOnTheInlandMode'WhichIdentificationDoYouWantToUseForThisVehicle\?'Page(answer: String): Unit = {
    TransportIdentificationPage
          .loadPage()
          .select(answer)
          .submitPage()
  }

  // ^(?:I )?enter registration number (.+) on the 'What is the identification number for this\?' page$
  def and(?I)?enterRegistrationNumber(.+)OnThe'WhatIsTheIdentificationNumberForThis\?'Page(answer: String): Unit = {
    IdentificationNumberPage
            .loadPage()
            .fillInput(answer)
            .submitPage()
  }

  // ^(?:I )?select (.+) on the inland mode 'What country is this vehicle registered to\?' page$
  def and(?I)?select(.+)OnTheInlandMode'WhatCountryIsThisVehicleRegisteredTo\?'Page(answer: String): Unit = {
    TransportCountryPage
            .loadPage()
            .select(answer)
            .submitPage()
  }

  // ^(?:I )?choose radio option (.*) on 'Do you want to add a border mode of transport\?' page$
  def and(?I)?chooseRadioOptionXOn'DoYouWantToAddABorderModeOfTransport\?'Page(answer: String): Unit = {
    AddNewBorderModeOfTransportPage
          .loadPage()
          .select(answer)
          .submitPage()
  }

  // ^(?:I )?choose radio option (.*) on the departure means '(.*)' page$
  def and(?I)?chooseRadioOptionXOnTheDepartureMeans'X'Page(answer: String, pageTitle: String): Unit = {
    AddVehicleIdentificationInlandModeOfTransport
          .loadPage(pageTitle)
          .select(answer)
          .submitPage()
  }

  // ^(?:I )?select radio option (.*) on the 'You have added (.+) departure means of transport?' page$
  def and(?I)?selectRadioOptionXOnThe'YouHaveAdded(.+)DepartureMeansOfTransport?'Page(answer: String, numberOfDepartureMeans: String): Unit = {
    AddAnotherDepartureMeansOfTransportPage
            .loadPage(numberOfDepartureMeans)
            .select(answer)
            .submitPage()
  }

  // ^(?:I )?choose to click on the (.*) link on the You have added (.+) departure means of transport' page$
  def when(?I)?chooseToClickOnTheXLinkOnTheYouHaveAdded(.+)DepartureMeansOfTransport'Page(sectionLink: String, numberOfDepartureMeans: String): Unit = {
    AddAnotherDepartureMeansOfTransportPage
            .loadPage(numberOfDepartureMeans)
            .clickByPartialLinkText(sectionLink)
  }

  // ^(?:I )?choose radio option (.*) for the 'Are you sure you want to remove departure means of transport (.+)\?' page$
  def and(?I)?chooseRadioOptionXForThe'AreYouSureYouWantToRemoveDepartureMeansOfTransport(.+)\?'Page(answer: String, departureMeansNo: String): Unit = {
    RemoveDepartureMeansOfTransportPage
          .loadPage(departureMeansNo)
          .select(answer)
          .submitPage()
  }

}
