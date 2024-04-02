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

object ConsignmentCrossCheckPage extends Page {

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
   def selectSection(answer: String): this.type = {
     val value = answer match {
       case "Departure means of transport" => "departureTransportMeans"
       case "Transport equipment" => "transportEquipments"
       case "Document" => "documents"
       case "Additional reference" => "additionalReferences"

     }
           clickById(value)
           this
   }

  def selectSubSection(answer: String): this.type = {
    val value = answer match {
      case "Seals" => "transport-equipment-1-seals"
      case "Items applied" => "transport-equipment-1-items"
    }

    clickById(value)
    this
  }
  def selectSectionChild(answer: String, index: String): this.type = {
    val value = answer match {
      case "Departure means of transport" => s"departureTransportMeans$index"
      case "Transport equipment" => s"transportEquipment$index"
      case "Document" => s"document$index"
      case "Additional reference" => s"additionalReference$index"
    }
      clickById(value)
      this
  }

  def clickLinkByIdBySection(text: String): Unit = {
    val value = text match {
      case "Departure means identification type" => "change-transport-means-identification-1"
      case "Departure identification number" => "change-transport-means-identification-number-1"
      case "Departure registered country" => "change-registered-country"
      case "Container identification number" => "change-container-identification-number-1"
      case "seal1" => "change-seal-details-1-1"
      case "item1" => "change-consignment-item-details-1-1"
      case "Document type" => "change-document-type-1"
      case "Document reference number" => "change-document-reference-number-1"
      case "Document additional information" => "change-document-additional-information-1"
      case "Additional reference type" => "change-additional-reference-type-1"
      case "Additional reference number" => "change-additional-reference-number-1"
    }
    clickById(value)
  }
//
//  def selectAdditionalRefAction(index: String): this.type = {
//    clickById("additionalReferences")
//    clickById(s"additionalReference$index")
//    this
//  }

}
