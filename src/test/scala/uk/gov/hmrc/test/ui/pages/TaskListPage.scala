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

import org.openqa.selenium.By
import org.scalatest.compatible.Assertion

object TaskListPage extends BasePage {

  val taskListTitle = "Declaration summary - Manage your transit movements - GOV.UK"

  def loadPage: this.type = {
    onPage(taskListTitle)
    this
  }

  def selectDeclarationSection(sectionLink: String): Unit =
    sectionLink match {
      case "Add trader details"    => clickByPartialLinkText(sectionLink)
      case "Add guarantee details" => clickByPartialLinkText(sectionLink)
      case "Add route details"     => clickByPartialLinkText(sectionLink)
    }

  def checkTraderDetailsStatus(status: String): Assertion = {
    val statusFieldText: String = driver.findElement(By.id("trader-details-status")).getText
    statusFieldText shouldBe status
  }

}
