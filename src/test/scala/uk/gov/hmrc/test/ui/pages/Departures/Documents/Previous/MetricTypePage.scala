package uk.gov.hmrc.test.ui.pages.Departures.Documents.Previous

import uk.gov.hmrc.test.ui.pages.RadioPage

object MetricTypePage extends RadioPage {

  override def title(args: String*): String = "What metric do you want to use for the quantity of goods?"

  override def select(answer: String): this.type = {
    clickRadioBtn(answer)
    this
  }
}
