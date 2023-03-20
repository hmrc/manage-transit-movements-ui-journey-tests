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

import org.openqa.selenium.By.cssSelector
import uk.gov.hmrc.test.ui.conf.TestConfiguration
import uk.gov.hmrc.test.ui.pages.AuthorityWizard
import uk.gov.hmrc.test.ui.pages.AuthorityWizard.{findElementBy, navigateTo}

// For caching values between steps
object World {
  var bearerToken: String = ""
  var sessionId: String = ""
  var arrivalId: String   = ""
}

class LoginStepDef extends BaseStepDef {

  And("""^I login with ID (.*)$""") { (id: String) =>
    AuthorityWizard
      .loadPage()
      .fillInputs(id)
      .submitPage()

    World.bearerToken = findElementBy(cssSelector("[data-session-id='authToken']")).getText
    World.sessionId = findElementBy(cssSelector("[data-session-id='sessionId']")).getText

    navigateTo(TestConfiguration.url("manage-transit-movements-frontend"))
  }

}
