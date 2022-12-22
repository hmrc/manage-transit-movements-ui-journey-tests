package uk.gov.hmrc.test.ui.pages.Cancellations

import uk.gov.hmrc.test.ui.pages.Page

object DeclarationNotFoundPage extends Page {

   override def title(args: String*): String = "You cannot cancel this departure declaration"

  def BackToDepartureDeclarations: Unit = {
    clickById("manage-transit-movements")
  }
}
