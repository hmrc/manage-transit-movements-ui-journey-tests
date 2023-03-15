package uk.gov.hmrc.test.ui.pages.Departures.Documents.Documents

import uk.gov.hmrc.test.ui.pages.RadioPage

object DocumentPreviousTypePage extends RadioPage {

  override def title(args: String*): String = "What previous document do you want to add?"

  override def select(answer: String): this.type = {
    clickRadioBtn(answer)
    this
  }
}
