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

import org.openqa.selenium.{By, Keys, WebElement}

import scala.jdk.CollectionConverters._

trait SelectPage extends StringPage {

  def select(answer: String): this.type = {
    selectValueFromDropDown(answer)
    this
  }

  protected def selectValueFromDropDown(valueOption: String, id: String = "value"): Unit = {
    findBy(By.id(id))
    fillInputById(id, valueOption)
    selectFirstValue(id)
  }

  override def clearInput(input: WebElement): Unit = {
    val length = findById("value-select")
      .findElements(By.tagName("option"))
      .asScala
      .find(_.isSelected)
      .map(_.getAttribute("innerText").length)
      .getOrElse(0)

    (0 until length).foreach(
      _ => input.sendKeys(Keys.BACK_SPACE)
    )
  }

  protected def openDropdownAndSelectFirstValue(id: String): Unit = {
    clickById(id)
    selectFirstValue(id)
  }

  private def selectFirstValue(id: String): Unit =
    clickById(s"${id}__option--0")
}
