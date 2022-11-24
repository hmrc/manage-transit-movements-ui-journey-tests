package uk.gov.hmrc.test.ui.pages.Arrival.IncidentTransportMeans

import uk.gov.hmrc.test.ui.pages.StringPage

object ReplacementTransportIdentificationNumberPage extends StringPage {

  override def title(args: String*): String = String.format("What is the %s?", args: _*)

}
