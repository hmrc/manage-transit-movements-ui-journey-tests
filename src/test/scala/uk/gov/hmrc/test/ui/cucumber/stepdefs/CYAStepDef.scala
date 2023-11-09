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
import uk.gov.hmrc.test.ui.pages.Departures.PreTaskList.GenericCYAPage

class CYAStepDef extends BaseStepDef {

  And("""^(?:I )?should be on the 'Check your answers' page$""") { () =>
    CYAPage
      .loadPage()
  }

  And("""^(?:I )?submit the 'Check your answers' page$""") { () =>
    GenericCYAPage
      .loadPage()
      .submitPage()
  }

  And("""^(?:I )?submit on the Check your answers section (.*) page$""") { (subheading: String) =>
    CYAPage
      .loadPage(subheading)
      .submitPage()
  }

  And("""^(?:I )?click the Change link for (.+) on the 'Check your answers' page$""") { (text: String) =>
    CYAPage
      .clickLinkById(text)
  }

  And(
    """^(?:I )?click the Change link for (.+) on the (?:Transport details|Unloading|Route details|Trader details|Documents|Item 1|Guarantee details) 'Check your answers' page$"""
  ) { (text: String) =>
    CYAPage
      .clickChangeLink(text)
  }

}
