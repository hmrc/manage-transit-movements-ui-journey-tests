package uk.gov.hmrc.test.ui.pages.Arrival.Identification

import uk.gov.hmrc.test.ui.pages.YesNoPage

object RemoveAuthorisationPage extends YesNoPage {

    override def title(args: String*): String = String.format("Are you sure you want to remove the %s authorisation %s?", args: _*)

}
