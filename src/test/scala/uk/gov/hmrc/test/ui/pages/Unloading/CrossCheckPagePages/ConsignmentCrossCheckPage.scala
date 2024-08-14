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

package uk.gov.hmrc.test.ui.pages.Unloading.CrossCheckPagePages

import uk.gov.hmrc.test.ui.pages.Page

object ConsignmentCrossCheckPage extends Page {

  override def title(args: String*): String =
    "Enter the discrepancies between the transit movement and unloading permission - Arrival notifications"

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

  def selectAddRemoveHouseConsignment: this.type = {
    clickById("houseConsignments")
    clickById("add-remove-house-consignment")
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
      case "Transport equipment"          => "transportEquipments"
      case "Document"                     => "documents"
      case "Additional reference"         => "additionalReferences"
    }
    clickById(value)
    this
  }

  def selectSubSection(answer: String): this.type = {
    val value = answer match {
      case "Seals"         => "transport-equipment-1-seals"
      case "Items applied" => "transport-equipment-1-items"
    }

    clickById(value)
    this
  }
  def selectSectionChild(answer: String, index: String): this.type = {
    val value = answer match {
      case "Departure means of transport" => s"departureTransportMeans$index"
      case "Transport equipment"          => s"transportEquipment$index"
      case "Document"                     => s"document$index"
      case "Additional reference"         => s"additionalReference$index"
    }
    clickById(value)
    this
  }

  def clickLinkByIdBySection(text: String): Unit = {
    val value = text match {
      case "Departure means identification type Change" => "change-transport-means-identification-1"
      case "Departure identification number Change"     => "change-transport-means-identification-number-1"
      case "Departure registered country Change"        => "change-registered-country"
      case "Container identification number Change"     => "change-container-identification-number-1"
      case "seal1"                                      => "change-seal-details-1-1"
      case "item1"                                      => "change-consignment-item-details-1-1"
      case "Document type Change"                       => "change-document-type-1"
      case "Document reference number Change"           => "change-document-reference-number-1"
      case "Document additional information Change"     => "change-document-additional-information-1"
      case "Additional reference type Change"           => "change-additional-reference-type-1"
      case "Additional reference number Change"         => "change-additional-reference-number-1"
      case "Gross weight Change"                        => "change-gross-weight-1"
      case "Gross weight Remove"                        => "remove-gross-weight-1"
      case "Net weight Change"                          => "change-net-weight-1"
      case "Net weight Remove"                          => "remove-net-weight-1"
      case "Add or remove additional reference"         => "add-remove-additional-reference"
      case "Add or remove document"                     => "add-remove-documents"
      case "Add or remove transport equipment"          => "add-remove-transport-equipment"
      case "Add or remove departure means"              => "add-remove-departure-transport-means"
      case "Add or remove item"                         => "add-remove-items"
      case "Add or remove house consignment"            => "add-remove-house-consignment"

    }
    clickById(value)
  }

}
