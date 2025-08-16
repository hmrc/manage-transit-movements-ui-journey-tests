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
import uk.gov.hmrc.test.ui.utils.DriverHelper

import scala.language.postfixOps

trait BasePage extends DriverHelper {

  def findById(id: String): WebElement = find(By.id(id))

  def findByCssSelector(cssSelector: String): WebElement = find(By.cssSelector(cssSelector))

  def clickById(id: String): Unit = click(By.id(id))

  def clickByPartialLinkText(linkText: String): Unit = click(By.partialLinkText(linkText))

  def submitPage(): Unit = clickById("submit")

  def checkForContent(content: String): Unit = assert(findById("main-content").getText.contains(content))

  def navigateTo(url: String): Unit = driver.navigate().to(url)
}

case class PageNotFoundException(s: String) extends Exception(s)

case class InvalidTitleArgsException(s: String) extends Exception(s)
