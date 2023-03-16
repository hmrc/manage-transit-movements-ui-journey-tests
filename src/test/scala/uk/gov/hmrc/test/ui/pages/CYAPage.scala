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

  override def title(args: String*): String = "Check your answers"

  def clickLinkById(text: String): Unit = {
    val id = s"change-${text.replace(" ", "-").toLowerCase}"
    clickById(id)
  }

  def clickChangeLink(answer: String): this.type = {
    answer match {
      case "Do you want to use the same Unique Consignment Reference?" => clickLinkById("using-same-ucr")
      case "Are all the items being dispatched from the same country?" => clickLinkById("using-same-country-of-dispatch")
      case "Are all the items being transported to the same country?" => clickLinkById("transported-to-same-country")
      case "Other" => clickById("value_3")
    }
    this
  }

  def pageSubheading(): String = driver.findElement(By.cssSelector("h1 > span")).getText

}
