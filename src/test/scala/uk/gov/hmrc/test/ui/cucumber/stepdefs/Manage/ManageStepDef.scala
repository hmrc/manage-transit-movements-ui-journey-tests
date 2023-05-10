/*
 * Copyright 2023 HM Revenue & Customs
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package uk.gov.hmrc.test.ui.cucumber.stepdefs.Manage

import uk.gov.hmrc.test.ui.cucumber.stepdefs.BaseStepDef
import uk.gov.hmrc.test.ui.pages.Manage._
import uk.gov.hmrc.test.ui.utils.ApiHelper

class ManageStepDef extends BaseStepDef {

  Given("""^(?:I )?submit a departure declaration IE015$""") { () =>
    ApiHelper.insertDeparture()
  }

  Given("""^(?:I )?submit a positive acknowledgement$ IE928""") { () =>
    ApiHelper.insertPostiveAcknowledgement()
  }

  Given("""^(?:I )?submit a MRN allocation IE028$""") { () =>
    ApiHelper.insertMRNAllocation()
  }

  Given("""^(?:I )?submit a control decision notification IE060 with documents$""") { () =>
    ApiHelper.insertControlDecision()
  }

  Given("""^(?:I )?submit a control decision notification IE060 with no documents$""") { () =>
    ApiHelper.insertControlDecisionNoDocuments()
  }


  Given("""^(?:I )?submit an arrival notification IE007$""") { () =>
    ApiHelper.insertArrival()
  }

  Given("""^(?:I )?submit an unloading permission IE043 with seals$""") { () =>
    ApiHelper.insertUnloadingPermissionWithSeals()
  }

  Given("""^(?:I )?submit a rejection IE056 with amendable errors$""") { () =>
    ApiHelper.insertRejectionAmendable()
  }

  Given("""^(?:I )?submit a rejection IE056 with more than 10 errors$""") { () =>
    ApiHelper.insertRejectionMoreThan10Errors()
  }

  Given("""^(?:I )?submit a rejection IE056 with no amendable errors$""") { () =>
    ApiHelper.insertRejectionNonAmendable()
  }

  Then("""^(?:I )?should be on the 'Manage your transit movements' page$""") { () =>
    ManageTransitMovementsPage
      .loadPage()
  }

  Given("""^(?:I )?click on the (.+) link on the 'Manage your transit movements' page$""") { (link: String) =>
    ManageTransitMovementsPage
      .loadPage()
      .selectAction(link)
  }

  Then("""^(?:I )?should be on the 'There is a problem with the guarantee for this departure declaration' page$""") { () =>
    GuaranteeRejectionPage
      .loadPage()
  }



  Then("""^(?:I )?should be on the 'No release for transit' page$""") { () =>
    NoReleaseForTransitPage
      .loadPage()
  }

 Then("""^(?:I )?should be on the 'Negative acknowledgement' page$""") { () =>
    NegativeAcknowledgementPage
      .loadPage()
  }


  Then("""^(?:I )?should be on the 'Goods under control - document requested' page$""") { () =>
    GoodsUnderControlDocumentsRequestedPage
      .loadPage()
  }

  Then("""^(?:I )?should be on the 'Goods under control' page$""") { () =>
    GoodsUnderControlPage
      .loadPage()
  }

  And("""^(?:I )?should see the content (.*) on the 'No release for transit' page$""") {
    (content: String) =>
      NoReleaseForTransitPage
        .loadPage()
        .checkForContent(content)
  }

}
