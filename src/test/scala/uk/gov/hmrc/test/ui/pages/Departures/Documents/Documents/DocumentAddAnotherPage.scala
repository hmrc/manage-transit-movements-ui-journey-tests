package uk.gov.hmrc.test.ui.pages.Departures.Documents.Documents

import uk.gov.hmrc.test.ui.pages.YesNoPage

object DocumentAddAnotherPage extends YesNoPage {

  override def title(args: String*): String = args match {
    case Seq("1") => "You have added 1 document"
    case _        => String.format("You have added %s documents", args: _*)
  }
}
