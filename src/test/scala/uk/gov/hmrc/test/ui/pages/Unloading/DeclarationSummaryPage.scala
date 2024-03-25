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

package uk.gov.hmrc.test.ui.pages.Unloading

import org.openqa.selenium.By.{cssSelector, xpath}
import org.openqa.selenium.{By, WebElement}
import uk.gov.hmrc.test.ui.cucumber.stepdefs.World
import uk.gov.hmrc.test.ui.pages.AuthorityWizard.findElementBy
import uk.gov.hmrc.test.ui.pages.Page

object DeclarationSummaryPage extends Page {

  override def title(args: String*): String = "Cross-check the transit with this declaration summary"

  def clickLinkById(text: String): Unit = {
    val id = s"change-${text.replace(" ", "-").toLowerCase}"
    clickById(id)
  }

  def selectAction(index: String): this.type = {
    clickById("houseConsignments")
    clickById(s"houseConsignment$index")
    clickById(s"view-house-consignment-$index")
    this
  }

  def selectDocAction(index: String): this.type = {
    clickById("documents")
    clickById(s"document$index")
    this
  }

  def selectDepartureTransportAction(index: String): this.type = {
    clickById("departureTransportMeans")
    clickById(s"departureTransportMeans$index")
    this
  }

  def selectTransportEquipmentAction(index: String): this.type = {
    clickById("transportEquipments")
    clickById(s"transportEquipment$index")
    this
  }

}
