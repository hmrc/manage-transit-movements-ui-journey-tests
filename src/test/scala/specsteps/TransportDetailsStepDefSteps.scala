import uk.gov.hmrc.test.ui.cucumber.stepdefs.BaseStepDef
import uk.gov.hmrc.test.ui.pages.Departures.Transport.InlandModeOfTransport.AddInlandModeOfTransportPage
import uk.gov.hmrc.test.ui.pages.Departures.Transport.TransportDetails.*

object TransportDetailsStepDefSteps {

  // ^(?:I )?choose radio option (.*) on the 'Do you want to use the same UCR for all items\?' page$
  def andIchooseRadioOptionXOnTheDoYouWantToUseTheSameUCRForAllItemsPage(answer: String): Unit = {
    ApplyUcrToAllItemsPage
            .loadPage()
            .select(answer)
            .submitPage()
  }

  // ^(?:I )?enter (.+) on the 'What is the UCR\?' page$
  def andIenterOnTheWhatIsTheUCRPage(answer: String): Unit = {
    UniqueConsignmentReferencePage
          .loadPage()
          .fillInput(answer)
          .submitPage()
  }

  // ^(?:I )?choose radio option (.*) on the 'Are all the items being transported to the same country\?' page$
  def andIchooseRadioOptionXOnTheAreAllTheItemsBeingTransportedToTheSameCountryPage(answer: String): Unit = {
    ItemsSameDestinationCountryPage
            .loadPage()
            .select(answer)
            .submitPage()
  }

  // ^(?:I )?select (.+) on the transport details 'What country are the items being transported to\?' page$
  def andIselectOnTheTransportDetailsWhatCountryAreTheItemsBeingTransportedToPage(answer: String): Unit = {
    ItemsDestinationCountryPage
            .loadPage()
            .select(answer)
            .submitPage()
  }

  // ^(?:I )?choose radio option (.*) on the 'Are you using any shipping containers to transport the goods\?' page$
  def andIchooseRadioOptionXOnTheAreYouUsingAnyShippingContainersToTransportTheGoodsPage(answer: String): Unit = {
    ContainersPage
          .loadPage()
          .select(answer)
          .submitPage()
  }

  // ^(?:I )?choose radio option (.*) on the 'Are the goods being transported to another country after the end of this transit movement\?' page$
  def andIchooseRadioOptionXOnTheAreTheGoodsBeingTransportedToAnotherCountryAfterTheEndOfThisTransitMovementPage(answer: String): Unit = {
    ItemsBeingTransportedToAnotherCountry
          .loadPage()
          .select(answer)
          .submitPage()
  }

  // ^(?:I )?choose radio option (.*) on the 'Do you want to add an inland mode of transport\?' page$
  def andIchooseRadioOptionXOnTheDoYouWantToAddAnInlandModeOfTransportPage(answer: String): Unit = {
    AddInlandModeOfTransportPage
          .loadPage()
          .select(answer)
          .submitPage()
  }

  // ^(?:I )?choose radio option (.*) on the 'Are all the items being dispatched from the same country\?' page$
  def andIchooseRadioOptionXOnTheAreAllTheItemsBeingDispatchedFromTheSameCountryPage(answer: String): Unit = {
    ItemsSameDispatchCountryPage
          .loadPage()
          .select(answer)
          .submitPage()
  }

  // ^(?:I )?select (.+) on the 'What is the country of dispatch\?' page$
  def andIselectOnTheWhatIsTheCountryOfDispatchPage(answer: String): Unit = {
    CountryOfDispatchPage
          .loadPage()
          .select(answer)
          .submitPage()
  }

  // ^(?:I )?choose radio option (.*) on the same destination country page$
  def andIchooseRadioOptionXOnTheSameDestinationCountryPage(answer: String): Unit = {
    ItemsSameDestinationCountryPage
          .loadPage()
          .select(answer)
          .submitPage()
  }

}
