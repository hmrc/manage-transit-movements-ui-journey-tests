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

package uk.gov.hmrc.test.ui.pages

import org.openqa.selenium.{By, WebElement}
import uk.gov.hmrc.test.ui.conf.TestConfiguration

object AuthorityWizard extends BasePage {

  def loadPage(): this.type = {
    val url: String = TestConfiguration.url("auth-login-stub")
    driver.navigate().to(url)
    this
  }

  def navigateTo(url: String): Unit     = driver.navigate().to(url)
  def findElementBy(by: By): WebElement = driver.findElement(by)

  def fillInputs(eoriNumber: String): this.type = {
    val redirectionUrl = "http://localhost:9949/auth-login-stub/session"
    findById("redirectionUrl").sendKeys(redirectionUrl)
    findById("credentialStrength").sendKeys("weak")
    findById("confidenceLevel").sendKeys("50")
    findById("affinityGroupSelect").sendKeys("Organisation")
    findById("enrolment[0].name").sendKeys("HMRC-CTC-ORG")
    findById("input-0-0-name").sendKeys("EORINumber")
    findById("input-0-0-value").sendKeys(eoriNumber)
    this
  }
}
