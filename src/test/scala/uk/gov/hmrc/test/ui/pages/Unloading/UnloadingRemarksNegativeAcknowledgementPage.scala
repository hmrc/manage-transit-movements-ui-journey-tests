package uk.gov.hmrc.test.ui.pages.Unloading

import uk.gov.hmrc.test.ui.pages.Page

object UnloadingRemarksNegativeAcknowledgementPage extends Page {

   override def title(args: String*): String = "There is a problem with these unloading remarks"

  def CreateNewUnloadingRemarks: Unit = {
    clickById("create-new-unloading-remarks")
  }
}


