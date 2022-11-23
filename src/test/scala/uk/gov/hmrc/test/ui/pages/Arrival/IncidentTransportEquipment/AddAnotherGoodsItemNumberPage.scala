package uk.gov.hmrc.test.ui.pages.Arrival.IncidentTransportEquipment

import uk.gov.hmrc.test.ui.pages.YesNoPage

object AddAnotherGoodsItemNumberPage extends YesNoPage {

  override def title(args: String*): String = args match {
    case Seq("1") => "You have added 1 goods item number"
    case _ => String.format("You have added %s goods item numbers", args: _*)
  }
}
