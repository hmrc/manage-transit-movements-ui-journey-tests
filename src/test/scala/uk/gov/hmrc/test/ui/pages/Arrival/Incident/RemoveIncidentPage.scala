package uk.gov.hmrc.test.ui.pages.Arrival.Incident

import uk.gov.hmrc.test.ui.pages.YesNoPage

object RemoveIncidentPage extends YesNoPage {

  override def title(args: String*): String = String.format("Are you sure you want to remove incident %s?", args: _*)

}
