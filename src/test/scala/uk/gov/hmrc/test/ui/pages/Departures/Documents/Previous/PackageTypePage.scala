package uk.gov.hmrc.test.ui.pages.Departures.Documents.Previous

import uk.gov.hmrc.test.ui.pages.RadioPage

object PackageTypePage extends RadioPage {

  override def title(args: String*): String = "What type of package did the goods arrive in?"

  override def select(answer: String): this.type = {
    clickRadioBtn(answer)
    this
  }
}
