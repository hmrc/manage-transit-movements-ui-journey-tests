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

object HouseConsignmentPage extends Page {

  override def title(args: String*): String =
    String.format("House consignment %s", args: _*)

  def selectSection(answer: String): this.type = {
    val value = answer match {
      case "Item 1" => "items"
    }
    clickById(value)
    this
  }

  def selectItem(answer: String): this.type = {
    val value = answer match {
      case "Item 1" => "item-1"
    }
    clickById(value)
    this
  }

  def selectSectionChild(answer: String): this.type = {
    val value = answer match {
      case "Item 1"                 => "item-1"
      case "Additional reference 1" => "item-1-additional-references"
      case "Packages"               => "item-1-packages"
    }
    clickById(value)
    this
  }

  def selectItemSection(answer: String): this.type = {
    val value = answer match {
      case "Items" => "items"
    }
    clickById(value)
    this
  }

  def clickLinkByIdBySection(text: String): Unit = {
    val value = text match {
      case "Change Gross weight"                => "change-gross-weight-1"
      case "Remove Gross weight"                => "remove-gross-weight-1"
      case "Change Net weight"                  => "change-net-weight-1"
      case "Remove Net weight"                  => "remove-net-weight-1"
      case "Change Cus code"                    => "change-cus-code-1"
      case "Change Commodity code"              => "change-commodity-code-1"
      case "Remove Commodity code"              => "remove-commodity-code-1"
      case "Change Nomenclature code"           => "change-nomenclature-code-1"
      case "Remove Nomenclature code"           => "remove-nomenclature-code-1"
      case "Change additional reference Type"   => "change-additional-reference-type-1-1"
      case "Change additional reference number" => "change-additional-reference-number-1-1"
      case "Add or remove item"                 => "add-remove-items"
      case "Change package type"                => "change-package-type-1-1"
      case "Change package quantity"            => "change-package-count-1-1"
      case "Change shipping mark"               => "change-package-mark-1-1"
    }
    clickById(value)
  }

  def selectSubSection(answer: String): this.type = {
    val value = answer match {
      case "Additional reference 1" => "item-1-additional-reference-1"
      case "Packages"               => "item-1-package-1"
    }
    clickById(value)
    this
  }

}
