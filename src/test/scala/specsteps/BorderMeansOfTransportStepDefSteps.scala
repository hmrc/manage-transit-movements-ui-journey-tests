import uk.gov.hmrc.test.ui.cucumber.stepdefs.BaseStepDef
import uk.gov.hmrc.test.ui.pages.Departures.Transport.BorderMeansOfTransport.*

object BorderMeansOfTransportStepDefSteps {

  // ^(?:I )?choose radio option (.*) on the add border mode of transport page$
  def andIchooseRadioOptionXOnTheAddBorderModeOfTransportPage(answer: String): Unit = {
    AddBorderModeOfTransportPage
          .loadPage()
          .select(answer)
          .submitPage()
  }

  // ^(?:I )?choose radio option (.*) on the 'How is the transit crossing the border\?' page$
  def andIchooseRadioOptionXOnTheHowIsTheTransitCrossingTheBorderPage(answer: String): Unit = {
    BorderModeOfTransportPage
            .loadPage()
            .select(answer)
            .submitPage()
  }

  // ^(?:I )?choose radio option (.*) on the border mode 'Which identification do you want to use for this vehicle\?' page$
  def andIchooseRadioOptionXOnTheBorderModeWhichIdentificationDoYouWantToUseForThisVehiclePage(answer: String): Unit = {
    BorderMeansOftransportIdentificationPage
          .loadPage()
          .select(answer)
          .submitPage()
  }

  // ^(?:I )?enter identification (.+) on the 'What is the identification number for this\?' page$
  def andIenterIdentificationOnTheWhatIsTheIdentificationNumberForThisPage(answer: String): Unit = {
    BorderMeansOfTransportIdentificationNumberPage
            .loadPage()
            .fillInput(answer)
            .submitPage()
  }

  // ^(?:I )?select (.+) on the border mode 'What country is this vehicle registered to\?' page$
  def andIselectOnTheBorderModeWhatCountryIsThisVehicleRegisteredToPage(answer: String): Unit = {
    BorderMeansOfTransportCountryPage
            .loadPage()
            .select(answer)
            .submitPage()
  }

  // ^(?:I )?select (.+) on the 'Where is the customs office at the border\?' page$
  def andIselectOnTheWhereIsTheCustomsOfficeAtTheBorderPage(answer: String): Unit = {
    BorderMeansOfTransportOfficeOfTransitPage
          .loadPage()
          .select(answer)
          .submitPage()
  }

  // ^(?:I )?choose radio option (.*) on the 'Do you want to add a conveyance reference number\?' page$
  def andIchooseRadioOptionXOnTheDoYouWantToAddAConveyanceReferenceNumberPage(answer: String): Unit = {
    AddConveyanceReferenceNumberPage
            .loadPage()
            .select(answer)
            .submitPage()
  }

  // ^(?:I )?enter conveyance number (.+) on the 'What is the conveyance reference number\?' page$
  def andIenterConveyanceNumberOnTheWhatIsTheConveyanceReferenceNumberPage(answer: String): Unit = {
    ConveyanceReferenceNumberPage
            .loadPage()
            .fillInput(answer)
            .submitPage()
  }

  // ^(?:I )?choose to click on (.*) link on the add another border means of transport page$
  def andIchooseToClickOnXLinkOnTheAddAnotherBorderMeansOfTransportPage(sectionLink: String): Unit = {
    AddAnotherBorderMeansOfTransportPage
            .clickByPartialLinkText(sectionLink)
  }

  // ^(?:I )?select radio option (.*) on the 'Are you sure you want to remove border means of transport (.*)\?' page$
  def andIselectRadioOptionXOnTheAreYouSureYouWantToRemoveBorderMeansOfTransportXPage(answer: String, borderMeansOfTransportNumber: String): Unit = {
    RemoveBorderMeansOfTransportPage
          .loadPage(borderMeansOfTransportNumber)
          .select(answer)
          .submitPage()
  }

  // ^(?:I )?choose radio option (.*) on the 'You have added (.*) border means of transport' page$
  def whenIchooseRadioOptionXOnTheYouHaveAddedXBorderMeansOfTransportPage(answer: String, numberOfBorderMeansInTitle: String): Unit = {
    AddAnotherBorderMeansOfTransportPage
            .loadPage(numberOfBorderMeansInTitle)
            .select(answer)
            .submitPage()
  }

  // ^(?:I )?choose radio option (.*) on the border means 'Do you want to add identification for this vehicle\?' page$
  def andIchooseRadioOptionXOnTheBorderMeansDoYouWantToAddIdentificationForThisVehiclePage(answer: String): Unit = {
    AddVehicleIdentificationBorderMeansOfTransport
          .loadPage()
          .select(answer)
          .submitPage()
  }

  // ^(?:I )?choose radio option (.*) on the 'Do you want to add the type of identification\?' page$
  def andIchooseRadioOptionXOnTheDoYouWantToAddTheTypeOfIdentificationPage(answer: String): Unit = {
    VehicleIdentificationTypeDepartureMeansOfTransport
            .loadPage()
            .select(answer)
            .submitPage()
  }

  // ^(?:I )?choose radio option (.*) on the 'Do you want to add an identification number for this vehicle\?' page$
  def andIchooseRadioOptionXOnTheDoYouWantToAddAnIdentificationNumberForThisVehiclePage(answer: String): Unit = {
    IdentificationNumberDepartureMeansOfTransport
          .loadPage()
          .select(answer)
          .submitPage()
  }

  // ^(?:I )?choose radio option (.*) on the 'Do you want to add the registered country for this vehicle\?' page$
  def andIchooseRadioOptionXOnTheDoYouWantToAddTheRegisteredCountryForThisVehiclePage(answer: String): Unit = {
    RegisteredVehicleCountryDepartureMeansOfTransport
          .loadPage()
          .select(answer)
          .submitPage()
  }

}
