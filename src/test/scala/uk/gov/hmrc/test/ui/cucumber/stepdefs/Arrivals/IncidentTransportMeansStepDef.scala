package uk.gov.hmrc.test.ui.cucumber.stepdefs.Arrivals

import uk.gov.hmrc.test.ui.cucumber.stepdefs.BaseStepDef
import uk.gov.hmrc.test.ui.pages.Arrival.IncidentTransportMeans._


class IncidentTransportMeansStepDef extends BaseStepDef {

  And("""^(?:I )?choose radio option (.*) on the Which type of identification do you want to use for the replacement means of transport page$""") {
    (answer: String) =>
    ReplacementTransportTypePage
      .loadPage()
      .select(answer)
      .submitPage()
  }

  And("""^(?:I )?enter (.+) for the (.+) on the What is the identification number for the replacement transport page$""") {
    (answer: String) =>
    ReplacementTransportIdentificationNumberPage
      .loadPage()
      .fillInput(answer)
      .submitPage()
  }

  And("""^(?:I )?select (.+) on the What country is the replacement transport registered to page$""") {
    (answer: String) =>
      ReplacementTransportCountryPage
        .loadPage()
        .fillInput(answer)
        .submitPage()
  }

}
