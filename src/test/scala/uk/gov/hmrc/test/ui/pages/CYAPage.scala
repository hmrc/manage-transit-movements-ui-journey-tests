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

object CYAPage extends Page {

//  override def title(args: String*): String = "Check your answers"
//
  override def title(args: String*): String =
    String.format("Check your answers - %s", args: _*)

  def clickLinkById(text: String): Unit = {
    val id = s"change-${text.replace(" ", "-").toLowerCase}"
    clickById(id)
  }

  def clickChangeLink(answer: String): this.type = {
    answer match {
      case "Do you want to use the same Unique Consignment Reference?"                  => clickLinkById("using-same-ucr")
      case "Are all the items being dispatched from the same country?"                  =>
        clickLinkById("using-same-country-of-dispatch")
      case "Are all the items being transported to the same country?"                   => clickLinkById("transported-to-same-country")
      case "Were there any discrepancies between the transit and unloading permission?" =>
        clickLinkById("add-discrepancies")
      case "Do you want to add a contact?"                                              => clickLinkById("has-transit-holder-contact")
      case "Do you want to add a contact for the consignor?"                            => clickLinkById("has-consignor-contact")
      case "Do you want to add a contact for the location of goods?"                    => clickLinkById("location-of-goods-add-contact")
      case "Do you want to add a method of payment for transport charges?"              => clickLinkById("add-payment-method")
      case "Do you want to add any additional information for this document?"           =>
        clickLinkById("add-additional-information")
      case "Do you want to add supplementary units?"                                    => clickLinkById("add-supplementary-units")
      case "Liability amount"                                                           => clickLinkById("liability-amount")
      case "Other"                                                                      => clickById("value_3")
      case "Do you want to use the revised unloading procedure?"                        => clickLinkById("new-auth-yes-no")
      case "Are the goods too large to fit into a container?"                           => clickLinkById("goods-too-large-yes-no")
      case "Have any seals been replaced by a customs authority?"                       => clickLinkById("seals-replaced-customs-yes-no")
      case "What do you want to report?"                                                => clickLinkById("report")
      case "Are the goods too large to fit into a container"                            =>
        clickByPartialLinkText("Are the goods too large to fit into a container?")
    }
    this
  }

  def pageSubheading(): String = driver.findElement(By.cssSelector("h1 > span")).getText

}
