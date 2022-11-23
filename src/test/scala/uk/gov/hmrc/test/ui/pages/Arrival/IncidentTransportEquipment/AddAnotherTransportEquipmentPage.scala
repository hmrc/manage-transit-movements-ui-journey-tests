package uk.gov.hmrc.test.ui.pages.Arrival.IncidentTransportEquipment

import uk.gov.hmrc.test.ui.pages.YesNoPage

object AddAnotherTransportEquipmentPage extends YesNoPage {

  override def title(args: String*): String = String.format("You have added %s transport equipment", args: _*)

}
