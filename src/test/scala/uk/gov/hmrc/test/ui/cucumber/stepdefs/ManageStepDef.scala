/*
 * Copyright 2022 HM Revenue & Customs
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

package uk.gov.hmrc.test.ui.cucumber.stepdefs


import uk.gov.hmrc.test.ui.pages.Manage.{ArrivalNotificationsPage, DepartureDeclarationFailPage, DepartureDeclarationsPage, GuaranteeRejectionPage, ManageTransitMovementsPage, NoReleaseForTransitage}

class ManageStepDef extends BaseStepDef {

  Then("""^(?:I )?should be on the Manage your transit movements page""") { () =>
    ManageTransitMovementsPage
      .loadPage()
  }

  Given("""^(?:I )?click on the (.+) link$""") { (link: String) =>
    ManageTransitMovementsPage
      .selectAction(link)
  }

  Given("""^(?:I )?click on the (.+) link on the Manage your transit movements page$""") { (link: String) =>
    ManageTransitMovementsPage
      .loadPage()
      .selectAction(link)
  }

  Given("""^(?:I )?click on the (.+) link on the Arrival notifications page$""") { (link: String) =>
    ArrivalNotificationsPage
      .loadPage()
      .selectAction(link)
  }

  Given("""^(?:I )?click on the (.+) link on the Departure Declarations page$""") { (link: String) =>
    DepartureDeclarationsPage
      .loadPage()
      .selectAction(link)
  }

  And("""^(?:I )?click on the (.*) link for MRN (.*) on the Arrival notifications page""") {
    (linkText: String, mrn: String) =>
      ArrivalNotificationsPage
        .loadPage()
        .selectActionType(linkText, mrn)
  }

  And("""^(?:I )?click on the (.*) link for LRN (.*) on the Departure declarations page""") {
    (linkText: String, lrn: String) =>
      DepartureDeclarationsPage
        .loadPage()
        .selectActionType(linkText, lrn)
  }

  Then("""^(?:I )?should be on the There is a problem with the guarantee for this departure declaration page""") { () =>
    GuaranteeRejectionPage
      .loadPage()
  }

  Then("""^(?:I )?should be on the There is a problem with this departure declaration page""") { () =>
    DepartureDeclarationFailPage
      .loadPage()
  }

  Then("""^(?:I )?should be on the No release for transit page""") { () =>
    NoReleaseForTransitage
      .loadPage()
  }
}
