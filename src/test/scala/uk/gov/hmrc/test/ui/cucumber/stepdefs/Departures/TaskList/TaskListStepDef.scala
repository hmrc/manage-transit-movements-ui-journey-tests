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

package uk.gov.hmrc.test.ui.cucumber.stepdefs.Departures.TaskList

import uk.gov.hmrc.test.ui.cucumber.stepdefs.BaseStepDef
import uk.gov.hmrc.test.ui.pages.Departures.TaskList.TaskListPage

class TaskListStepDef extends BaseStepDef {

  Then("""^(?:I )?(?:should )?be on the task list page$""") { () =>
    TaskListPage
      .loadPage()
  }

  Then("""^(?:I )?click the link with visible text: (.+)$""") { (answer: String) =>
    TaskListPage
      .loadPage()
      .selectDeclarationSection(answer)
  }

  And("""^(?:I )?should see (.*) status for trader details$""") { (status: String) =>
    TaskListPage
      .checkTraderDetailsStatus(status)
  }
}
