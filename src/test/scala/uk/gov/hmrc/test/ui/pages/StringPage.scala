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

import org.openqa.selenium.{By, WebElement}

trait StringPage extends Page {

  def fillInput(answer: String): this.type = {
    fillInputById("value", answer)
    this
  }

  def fillInputById(id: String, text: String): Unit = {
    val input = findBy(By.id(id))
    clearInput(input)
    input.sendKeys(text)
  }

  def clearInput(input: WebElement): Unit = input.clear()

  protected def randomAlphaNumericString(length: Int): String = {
    val chars = ('a' to 'z') ++ ('A' to 'Z') ++ ('0' to '9')

    def randomStringFromCharList(chars: Seq[Char]): String = {
      val sb = new StringBuilder
      for (_ <- 1 to length) {
        val randomNum = util.Random.nextInt(chars.length)
        sb.append(chars(randomNum))
      }
      sb.toString
    }

    randomStringFromCharList(chars)
  }
}
