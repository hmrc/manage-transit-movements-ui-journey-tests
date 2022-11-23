package uk.gov.hmrc.test.ui.pages.Arrival.TransportEquipmentAndSeal

import uk.gov.hmrc.test.ui.pages.YesNoPage

object RemoveTransportEquipmentPage extends YesNoPage {

  override def title(args: String*): String = String.format("Are you sure you want to remove transport equipment %s?", args: _*)

}
