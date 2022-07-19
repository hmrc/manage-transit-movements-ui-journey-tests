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

package uk.gov.hmrc.test.ui.pages

import org.openqa.selenium.WebDriver
import org.scalatestplus.selenium.Chrome.{singleSel, textField}
import uk.gov.hmrc.test.ui.conf.TestConfiguration

object AuthorityWizard extends BasePage {

  val url: String = TestConfiguration.url("auth-login-stub")
  val title       = "Authority Wizard"

  def loadPage: this.type = {
    driver.navigate().to(url)
    onPage(title)
    this
  }

  def login(id: String)(implicit driver: WebDriver): Unit = {
    AuthorityWizard.loadPage
    val redirectionUrl = TestConfiguration.url("manage-transit-movements-frontend")
    textField("redirectionUrl").value = redirectionUrl
    singleSel("credentialStrength").value = "weak"
    singleSel("confidenceLevel").value = "50"
    singleSel("affinityGroup").value = "Organisation"
    textField("enrolment[0].name").value = "HMRC-CTC-ORG"
    textField("enrolment[0].taxIdentifier[0].name").value = "EORINumber"
    textField("enrolment[0].taxIdentifier[0].value").value = id

    submitPage()
  }
}
