import uk.gov.hmrc.test.ui.cucumber.stepdefs.BaseStepDef
import uk.gov.hmrc.test.ui.pages.Departures.Transport.BorderMeansOfTransport.{AddAnotherDepartureMeansOfTransportPage, AddNewBorderModeOfTransportPage, RemoveDepartureMeansOfTransportPage}
import uk.gov.hmrc.test.ui.pages.Departures.Transport.InlandModeOfTransport.*

object InlandModeOfTransportStepDefSteps {

  // ^(?:I )?choose radio option (.*) on the 'Which inland mode of transport are you using\?' page$
  def andIchooseRadioOptionXOnTheWhichInlandModeOfTransportAreYouUsingPage(answer: String): Unit = {
    InlandModeOfTransportPage
            .loadPage()
            .select(answer)
            .submitPage()
  }

  // ^(?:I )?choose radio option (.*) on the inland mode 'Which identification do you want to use for this vehicle\?' page$
  def andIchooseRadioOptionXOnTheInlandModeWhichIdentificationDoYouWantToUseForThisVehiclePage(answer: String): Unit = {
    TransportIdentificationPage
          .loadPage()
          .select(answer)
          .submitPage()
  }

  // ^(?:I )?enter registration number (.+) on the 'What is the identification number for this\?' page$
  def andIenterRegistrationNumberOnTheWhatIsTheIdentificationNumberForThisPage(answer: String): Unit = {
    IdentificationNumberPage
            .loadPage()
            .fillInput(answer)
            .submitPage()
  }

  // ^(?:I )?select (.+) on the inland mode 'What country is this vehicle registered to\?' page$
  def andIselectOnTheInlandModeWhatCountryIsThisVehicleRegisteredToPage(answer: String): Unit = {
    TransportCountryPage
            .loadPage()
            .select(answer)
            .submitPage()
  }

  // ^(?:I )?choose radio option (.*) on 'Do you want to add a border mode of transport\?' page$
  def andIchooseRadioOptionXOnDoYouWantToAddABorderModeOfTransportPage(answer: String): Unit = {
    AddNewBorderModeOfTransportPage
          .loadPage()
          .select(answer)
          .submitPage()
  }

  // ^(?:I )?choose radio option (.*) on the departure means '(.*)' page$
  def andIchooseRadioOptionXOnTheDepartureMeansXPage(answer: String, pageTitle: String): Unit = {
    AddVehicleIdentificationInlandModeOfTransport
          .loadPage(pageTitle)
          .select(answer)
          .submitPage()
  }

  // ^(?:I )?select radio option (.*) on the 'You have added (.+) departure means of transport?' page$
  def andIselectRadioOptionXOnTheYouHaveAddedDepartureMeansOfTransportPage(answer: String, numberOfDepartureMeans: String): Unit = {
    AddAnotherDepartureMeansOfTransportPage
            .loadPage(numberOfDepartureMeans)
            .select(answer)
            .submitPage()
  }

  // ^(?:I )?choose to click on the (.*) link on the You have added (.+) departure means of transport' page$
  def whenIchooseToClickOnTheXLinkOnTheYouHaveAddedDepartureMeansOfTransportPage(sectionLink: String, numberOfDepartureMeans: String): Unit = {
    AddAnotherDepartureMeansOfTransportPage
            .loadPage(numberOfDepartureMeans)
            .clickByPartialLinkText(sectionLink)
  }

  // ^(?:I )?choose radio option (.*) for the 'Are you sure you want to remove departure means of transport (.+)\?' page$
  def andIchooseRadioOptionXForTheAreYouSureYouWantToRemoveDepartureMeansOfTransportPage(answer: String, departureMeansNo: String): Unit = {
    RemoveDepartureMeansOfTransportPage
          .loadPage(departureMeansNo)
          .select(answer)
          .submitPage()
  }

}
