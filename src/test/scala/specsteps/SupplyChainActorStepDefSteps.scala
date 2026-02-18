import uk.gov.hmrc.test.ui.cucumber.stepdefs.BaseStepDef
import uk.gov.hmrc.test.ui.pages.Departures.Transport.SupplyChainActor.*

object SupplyChainActorStepDefSteps {

  // ^(?:I )?choose radio option (.*) on the 'Do you want to add a supply chain actor for all items\?' page$
  def and(?I)?chooseRadioOptionXOnThe'DoYouWantToAddASupplyChainActorForAllItems\?'Page(answer: String): Unit = {
    AddSupplyChainActorPage
            .loadPage()
            .select(answer)
            .submitPage()
  }

  // ^(?:I )?choose radio option (.*) on the 'Which type of supply chain actor do you want to add\?' page$
  def and(?I)?chooseRadioOptionXOnThe'WhichTypeOfSupplyChainActorDoYouWantToAdd\?'Page(answer: String): Unit = {
    TypeSupplyChainActorPage
            .loadPage()
            .select(answer)
            .submitPage()
  }

  // ^(?:I )?enter (.+) on the 'What is the EORI number or Third Country Unique Identification Number TCUIN for the (.*)\?' page$
  def and(?I)?enter(.+)OnThe'WhatIsTheEORINumberOrThirdCountryUniqueIdentificationNumberTCUINForTheX\?'Page(answer: String, typeVal: String): Unit = {
    EoriTinSupplyChainActorPage
          .loadPage(typeVal)
          .fillInput(answer)
          .submitPage()
  }

  // ^(?:I )?choose radio option (.*) on the 'You have added (.+) supply chain actors?' page$
  def and(?I)?chooseRadioOptionXOnThe'YouHaveAdded(.+)SupplyChainActors?'Page(answer: String, numberOfActors: String): Unit = {
    AddAnotherSupplyChainActorPage
            .loadPage(numberOfActors)
            .select(answer)
            .submitPage()
  }

  // ^(?:I )?choose to click on (.*) link on the 'You have added (.+) supply chain actors' page$
  def when(?I)?chooseToClickOnXLinkOnThe'YouHaveAdded(.+)SupplyChainActors'Page(sectionLink: String, numberOfActors: String): Unit = {
    AddAnotherSupplyChainActorPage
            .loadPage(numberOfActors)
            .clickByPartialLinkText(sectionLink)
  }

  // ^(?:I )?choose radio option (.*) on the Are you sure you want to remove this supply chain actor page$
  def and(?I)?chooseRadioOptionXOnTheAreYouSureYouWantToRemoveThisSupplyChainActorPage(answer: String): Unit = {
    RemoveSupplyChainActorPage
            .loadPage()
            .select(answer)
            .submitPage()
  }

}
