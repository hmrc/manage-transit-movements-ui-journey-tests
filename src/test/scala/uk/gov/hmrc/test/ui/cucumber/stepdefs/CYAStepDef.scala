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

import org.junit.Assert.assertTrue
import uk.gov.hmrc.test.ui.pages.CYAPage.pageSubheading
import uk.gov.hmrc.test.ui.pages.CYAPage

class CYAStepDef extends BaseStepDef {

  And("""^(?:I )?should be on the CYA page$""") { () =>
    CYAPage
      .loadPage()
  }

  And("""^(?:I )?submit the 'Check your answers' page$""") { () =>
      CYAPage
        .loadPage()
        .submitPage()
  }

  And(
    """^(?:I )?submit on the '(Trader details|
    |Route details - Transit route|
    |Route details - Office of transit|
    |Route details - Location of goods|
    |Route details - Places of loading and unloading|
    |Route details - Office of exit|
    |Route details - Office of transit|
    |Route details|
    |Transport details - Border means of transport|
    |Transport details - Modes and means of transport|
    |Transport details - Transport equipment|
    |Transport details|
    |Guarantee details|
    |Arrivals - Authorisations|
    |Arrivals - Transport equipment|
    |Arrivals - Incidents|
    |Arrivals|
    |Unloading remarks) Check your answers' page$""") {
    (subheading: String) =>
    CYAPage
      .loadPage()
      .pageSubheading()
      assertTrue(pageSubheading().contains(subheading))
      CYAPage.submitPage()

  }

  And("""^(?:I )?click the change link for (.+) on the CYA page$""") { (text: String) =>
    CYAPage
      .clickChangeLink(text)
  }

}
