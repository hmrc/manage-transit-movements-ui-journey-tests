/*
 * Copyright 2025 HM Revenue & Customs
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

import org.scalatest.concurrent.Eventually.eventually

object GenericPage extends BasePage {

  def clickLink(linkText: String): Unit =
    clickByPartialLinkText(linkText)

  def refreshPage(): Unit =
    driver.navigate().refresh()

  def wait(t: Int): Unit = {
    val time = t * 1000
    eventually(Thread.sleep(time))
  }
}
