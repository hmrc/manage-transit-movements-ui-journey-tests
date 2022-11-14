package uk.gov.hmrc.test.ui.cucumber.stepdefs.Arrivals

import uk.gov.hmrc.test.ui.cucumber.stepdefs.BaseStepDef
import uk.gov.hmrc.test.ui.pages.Arrival.IncidentTransportEquipment._


class IncidentTransportEquipmentStepDef extends BaseStepDef {

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

  And("""^(?:I )?choose radio option (.*) on the Do you want to add another goods item number page$""") { (answer: String) =>
    AddGoodsItemNumberPage
      .loadPage()
      .select(answer)
      .submitPage()
  }

  And("""^(?:I )?choose radio option (.*) on the Do you want to add any other transport equipment page$""") { (answer: String) =>
    AddGoodsItemNumberPage
      .loadPage()
      .select(answer)
      .submitPage()
  }
}
