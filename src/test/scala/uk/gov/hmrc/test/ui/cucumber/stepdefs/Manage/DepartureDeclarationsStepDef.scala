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
import uk.gov.hmrc.test.ui.pages.Cancellations.ConfirmCancellationPage
import uk.gov.hmrc.test.ui.pages.Manage.ManageDepartures.*

class DepartureDeclarationsStepDef extends BaseStepDef {

  And("""^(?:I )?see the status (.*) on the 'Departure declarations' page$""") { (status: String) =>
    DepartureDeclarationsPage
      .loadPage()
      .checkDepartureStatus(status)
  }

  Then("""^(?:I )?(?:should )?be on the 'Departure declarations' page$""") { () =>
    DepartureDeclarationsPage
      .loadPage()
  }

  And("""^(?:I )?click on the (.*) link for LRN (.*) on the 'Departure declarations' page""") {
    (linkText: String, lrn: String) =>
      DepartureDeclarationsPage
        .loadPage()
        .selectDepartureAction(linkText, lrn)
  }

  Given("""^(?:I )?click on the (.+) link on the 'Departure declarations' page$""") { (link: String) =>
    DepartureDeclarationsPage
      .loadPage()
      .selectAction(link)
  }

  And("""^(?:I )?enter (.+) in the Search field on the 'Departure declarations' page$""") { (searchString: String) =>
    DepartureDeclarationsPage
      .loadPage()
      .fillInput(searchString)
      .clickById("submit")
  }

  And("""^(?:I )?should see the content (.*) on the 'Departure declarations' page$""") { (content: String) =>
    DepartureDeclarationsPage
      .loadPage()
      .checkForContent(content)
  }

  Given("""^(?:I )?click on the (.+) link on the 'Declaration errors' page$""") { (declarationLink: String) =>
    DeclarationErrorsPage
      .loadPage()
      .selectDepartureDeclarationLink(declarationLink)
  }

  Given("""^(?:I )?click on the Amend errors button on the 'Amend declaration errors' page$""") { () =>
    AmendDeclarationErrorsPage
      .loadPage()
      .submitPage()
  }

  Given("""^(?:I )?click on the Amend errors button on the 'Amend guarantee errors' page$""") { () =>
    AmendGuaranteeErrorsPage
      .loadPage()
      .submitPage()
  }

  Then("""^(?:I )?(?:should )?be on the 'Review declaration errors' page$""") { () =>
    ReviewDeclarationErrorsPage
      .loadPage()
  }

  Then("""^(?:I )?(?:should )?be on the 'Review cancellation errors' page$""") { () =>
    ReviewCancellationErrorsPage
      .loadPage()
  }

  Then("""^(?:I )?(?:should )?be on the 'Are you sure you want to cancel this declaration\?' page$""") { () =>
    ConfirmCancellationPage
      .loadPage()
  }

  Then("""^(?:I )?(?:should )?be on the 'Declaration errors' page$""") { () =>
    DeclarationNonFunctionalErrorsPage
      .loadPage()
  }

  Then("""^(?:I )?(?:should )?be on the 'Cancellation errors' page$""") { () =>
    CancellationErrorsPage
      .loadPage()
  }

  Then("""^(?:I )?(?:should )?be on the 'Goods being recovered' page$""") { () =>
    GoodsInRecoveryDetailsPage
      .loadPage()
  }

  Then("""^(?:I )?(?:should )?be on the 'Goods not released' page$""") { () =>
    GoodsNotReleasedDetailsPage
      .loadPage()
  }

  Then("""^(?:I )?(?:should )?be on the 'Confirmation needed to complete pre-lodged declaration' page$""") { () =>
    ConfirmationNeededToCompleteDeclarationPage
      .loadPage()
  }

  Then("""^(?:I )?(?:should )?be on the Presentation Notification 'Check your answers' page$""") { () =>
    PreLodgeCYA
      .loadPage()
  }

  Then("""^(?:I )?(?:should )?be on the 'Prelodged declaration errors' page$""") { () =>
    PrelodgedDeclarationErrors
      .loadPage()
  }

  Then("""^(?:I )?(?:should )?be on the 'Review prelodged declaration errors' page$""") { () =>
    ReviewPrelodgedDeclarationErrors
      .loadPage()
  }

  Given("""^(?:I )?click on the (.+) link on the 'Review pre-lodged declaration errors' page$""") { (declarationLink: String) =>
    ReviewPrelodgedDeclarationErrors
      .loadPage()
      .selectPrelodgeDepartureDeclarationLink(declarationLink)
  }

  Given("""^(?:I )?click on the (.+) link on the 'Prelodged declaration errors' page$""") { (declarationLink: String) =>
    PrelodgedDeclarationErrors
      .loadPage()
      .selectPrelodgeDepartureDeclarationLink(declarationLink)
  }

  Then("""^(?:I )?(?:should )?be on the 'This declaration is no longer available' page$""") { () =>
    DeclarationNoLongerAvailablePage
      .loadPage()
  }
}
