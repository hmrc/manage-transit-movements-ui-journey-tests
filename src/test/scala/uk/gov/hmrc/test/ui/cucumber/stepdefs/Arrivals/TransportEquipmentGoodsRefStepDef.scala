package uk.gov.hmrc.test.ui.cucumber.stepdefs.Arrivals

import uk.gov.hmrc.test.ui.cucumber.stepdefs.BaseStepDef
import uk.gov.hmrc.test.ui.pages.Arrival.IncidentTransportEquipment._
import uk.gov.hmrc.test.ui.pages.Arrival.TransportEquipmentAndSeal.{RemoveGoodsItemNumberPage, RemoveTransportEquipmentPage}


class TransportEquipmentGoodsRefStepDef extends BaseStepDef {

  And("""^(?:I )?choose radio option (.*) on the Do you want to add a goods item number page$""") { (answer: String) =>
    AddGoodsItemNumberPage
      .loadPage()
      .select(answer)
      .submitPage()
  }

  And("""^(?:I )?enter (.*) on the What is the goods item number? page$""") { (answer: String) =>
    GoodsItemNumberPage
      .loadPage()
      .fillInput(answer)
      .submitPage()
  }

  And("""^(?:I )?choose radio option (.*) on the You have added (.*) goods item numbers? page$""") {
    (answer: String, numberOfGoodsItems: String) =>
    AddAnotherGoodsItemNumberPage
      .loadPage(numberOfGoodsItems)
      .select(answer)
      .submitPage()
  }

  And("""^(?:I )?click the (.*) link on the You have added (.*) goods item numbers? page""") {
    (sectionLink: String, numberOfGoodsItems: String) =>
      AddAnotherGoodsItemNumberPage
        .loadPage(numberOfGoodsItems)
        .clickByPartialLinkText(sectionLink)
  }

  And("""^(?:I )?click radio option (.*) on the Are you sure you want to remove goods item number (.*) page""") {
    (answer: String, numberOfGoodsItems: String) =>
      RemoveGoodsItemNumberPage
        .loadPage(numberOfGoodsItems)
        .select(answer)
        .submitPage()
  }

  And("""^(?:I )?choose radio option (.*) on the You have added (.*) transport equipment page$""") {
    (answer: String, numberOfTransportEquipment: String) =>
    AddAnotherTransportEquipmentPage
      .loadPage(numberOfTransportEquipment)
      .select(answer)
      .submitPage()
  }

  And("""^(?:I )?click the (.*) link on the You have added (.*) transport equipment page""") {
    (sectionLink: String, numberOfTransportEquipment: String) =>
    AddAnotherTransportEquipmentPage
      .loadPage(numberOfTransportEquipment)
      .clickByPartialLinkText(sectionLink)
  }

  And("""^(?:I )?click radio option (.*) on the Are you sure you want to remove transport equipment (.*) page""") {
    (answer: String, numberOfTransportEquipment: String) =>
        RemoveTransportEquipmentPage
          .loadPage(numberOfTransportEquipment)
          .select(answer)
          .submitPage()
  }
}
