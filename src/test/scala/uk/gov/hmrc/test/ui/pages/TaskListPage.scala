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

import org.openqa.selenium.By
import org.scalatest.compatible.Assertion

object TaskListPage extends Page {

  override def title(args: String*): String = "Declaration summary"

  def selectDeclarationSection(sectionLink: String): Unit =
    clickByPartialLinkText(sectionLink)

  def checkTraderDetailsStatus(status: String): Assertion =
    checkStatus("trader-details", status)

  def checkRouteDetailsStatus(status: String): Assertion =
    checkStatus("route-details", status)

  private def checkStatus(section: String, status: String): Assertion = {
    val statusFieldText: String = driver.findElement(By.id(s"$section-status")).getText
    statusFieldText shouldBe status
  }
}
