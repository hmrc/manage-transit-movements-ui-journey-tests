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

package uk.gov.hmrc.test.ui.cucumber.stepdefs

import uk.gov.hmrc.test.ui.pages.CYAPage

class CYAStepDef extends BaseStepDef {

  And("""^(?:I )?should be on the CYA page""") { () =>
    CYAPage
      .loadPage()
  }

  And(
    """^(?:I )?submit on the (?:Pre-task list|Trader details|Transit route|Office of transit|Location of goods|
    |Places of loading and unloading|Office of exit|Route details|Border means of transport|Modes and means of transport|
    |Guarantee details|Authorisations|Transport equipment|Incidents|Arrivals) Check your answers page""") { () =>
    CYAPage
      .loadPage()
      .submitPage()
  }

  And("""^(?:I )?click the change link for (.+) on the CYA page$""") { (text: String) =>
    CYAPage
      .clickChangeLink(text)
  }

  And("""^(?:I )?view the CYA page""") { () =>
    CYAPage
      .loadPage()
  }

}
