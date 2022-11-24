package uk.gov.hmrc.test.ui.pages.Arrival.Incident

import uk.gov.hmrc.test.ui.pages.YesNoPage

object AddAnotherIncidentPage extends YesNoPage {

  override def title(args: String*): String = args match {
    case Seq("1") => "You have added 1 incident"
    case _ =>
      String.format(
        "You have added %s incidents",
        args: _*
      )
  }

}
