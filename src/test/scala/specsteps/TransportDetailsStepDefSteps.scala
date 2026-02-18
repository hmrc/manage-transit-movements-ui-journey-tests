import uk.gov.hmrc.test.ui.cucumber.stepdefs.BaseStepDef
import uk.gov.hmrc.test.ui.pages.Departures.Transport.InlandModeOfTransport.AddInlandModeOfTransportPage
import uk.gov.hmrc.test.ui.pages.Departures.Transport.TransportDetails.*

object TransportDetailsStepDefSteps {

  // ^(?:I )?choose radio option (.*) on the 'Do you want to use the same UCR for all items\?' page$
  def and(?I)?chooseRadioOptionXOnThe'DoYouWantToUseTheSameUCRForAllItems\?'Page(answer: String): Unit = {
    ApplyUcrToAllItemsPage
            .loadPage()
            .select(answer)
            .submitPage()
  }

  // ^(?:I )?enter (.+) on the 'What is the UCR\?' page$
  def and(?I)?enter(.+)OnThe'WhatIsTheUCR\?'Page(answer: String): Unit = {
    UniqueConsignmentReferencePage
          .loadPage()
          .fillInput(answer)
          .submitPage()
  }

  // ^(?:I )?choose radio option (.*) on the 'Are all the items being transported to the same country\?' page$
  def and(?I)?chooseRadioOptionXOnThe'AreAllTheItemsBeingTransportedToTheSameCountry\?'Page(answer: String): Unit = {
    ItemsSameDestinationCountryPage
            .loadPage()
            .select(answer)
            .submitPage()
  }

  // ^(?:I )?select (.+) on the transport details 'What country are the items being transported to\?' page$
  def and(?I)?select(.+)OnTheTransportDetails'WhatCountryAreTheItemsBeingTransportedTo\?'Page(answer: String): Unit = {
    ItemsDestinationCountryPage
            .loadPage()
            .select(answer)
            .submitPage()
  }

  // ^(?:I )?choose radio option (.*) on the 'Are you using any shipping containers to transport the goods\?' page$
  def and(?I)?chooseRadioOptionXOnThe'AreYouUsingAnyShippingContainersToTransportTheGoods\?'Page(answer: String): Unit = {
    ContainersPage
          .loadPage()
          .select(answer)
          .submitPage()
  }

  // ^(?:I )?choose radio option (.*) on the 'Are the goods being transported to another country after the end of this transit movement\?' page$
  def and(?I)?chooseRadioOptionXOnThe'AreTheGoodsBeingTransportedToAnotherCountryAfterTheEndOfThisTransitMovement\?'Page(answer: String): Unit = {
    ItemsBeingTransportedToAnotherCountry
          .loadPage()
          .select(answer)
          .submitPage()
  }

  // ^(?:I )?choose radio option (.*) on the 'Do you want to add an inland mode of transport\?' page$
  def and(?I)?chooseRadioOptionXOnThe'DoYouWantToAddAnInlandModeOfTransport\?'Page(answer: String): Unit = {
    AddInlandModeOfTransportPage
          .loadPage()
          .select(answer)
          .submitPage()
  }

  // ^(?:I )?choose radio option (.*) on the 'Are all the items being dispatched from the same country\?' page$
  def and(?I)?chooseRadioOptionXOnThe'AreAllTheItemsBeingDispatchedFromTheSameCountry\?'Page(answer: String): Unit = {
    ItemsSameDispatchCountryPage
          .loadPage()
          .select(answer)
          .submitPage()
  }

  // ^(?:I )?select (.+) on the 'What is the country of dispatch\?' page$
  def and(?I)?select(.+)OnThe'WhatIsTheCountryOfDispatch\?'Page(answer: String): Unit = {
    CountryOfDispatchPage
          .loadPage()
          .select(answer)
          .submitPage()
  }

  // ^(?:I )?choose radio option (.*) on the same destination country page$
  def and(?I)?chooseRadioOptionXOnTheSameDestinationCountryPage(answer: String): Unit = {
    ItemsSameDestinationCountryPage
          .loadPage()
          .select(answer)
          .submitPage()
  }

}
