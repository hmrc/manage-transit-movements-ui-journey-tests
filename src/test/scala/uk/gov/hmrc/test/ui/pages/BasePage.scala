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

import org.openqa.selenium.support.ui.{ExpectedConditions, FluentWait}
import org.openqa.selenium.{By, JavascriptExecutor, WebDriver, WebElement}
import org.scalatest.matchers.should.Matchers
import uk.gov.hmrc.test.ui.conf.TestConfiguration.config
import uk.gov.hmrc.test.ui.driver.BrowserDriver

import java.time.Duration

trait BasePage extends BrowserDriver with Matchers {
  val continueButton = "submit"

  def submitPage(): Unit =
    driver.findElement(By.id(continueButton)).click()

  def onPage(pageTitle: String): Unit =
    if (driver.getTitle != pageTitle)
      throw PageNotFoundException(
        s"Expected '$pageTitle' page, but found '${driver.getTitle}' page."
      )

  //
  def deleteCookies() = driver.manage().deleteAllCookies()

  val fluentWait: FluentWait[WebDriver] = new FluentWait[WebDriver](driver)
    .withTimeout(Duration.ofSeconds(config.getInt("wait.timeout.seconds")))
    .pollingEvery(Duration.ofMillis(config.getInt("wait.poll.seconds")))
    .ignoring(classOf[Exception])

  def waitForPresence(by: By): WebElement =
    fluentWait.until(ExpectedConditions.presenceOfElementLocated(by))

  def findBy(by: By): WebElement = waitForPresence(by)

  def findById(id: String): WebElement = findBy(By.id(id))

  def findByCssSelector(cssSelector: String): WebElement = findBy(By.cssSelector(cssSelector))

  def clickById(id: String): Unit = findById(id).click()

  def randomStringFromCharList(length: Int, chars: Seq[Char]): String = {
    val sb = new StringBuilder
    for (_ <- 1 to length) {
      val randomNum = util.Random.nextInt(chars.length)
      sb.append(chars(randomNum))
    }
    sb.toString
  }
  def randomAlphaNumericString(length: Int): String = {
    val chars = ('a' to 'z') ++ ('A' to 'Z') ++ ('0' to '9')
    randomStringFromCharList(length, chars)
  }

  def fillInput(by: By, text: String): Unit = {
    val input = driver.findElement(by)
    input.clear()
    if (text != null && text.nonEmpty) input.sendKeys(text)
  }
  def fillInputById(id: String, text: String): Unit = fillInput(By.id(id), text)

  def bringIntoView(by: By, action: WebElement => Unit): Unit = {
    val element                 = waitForPresence(by)
    val jse: JavascriptExecutor = driver.asInstanceOf[JavascriptExecutor]
    jse.executeScript("arguments[0].scrollIntoView()", element)
    action(element)
  }

  def click(by: By): Unit = bringIntoView(by, _.click)

  def clickByCssSelector(cssSelector: String): Unit = click(By.cssSelector(cssSelector))

  def clickRadioBtn(answer: String): Unit =
    findByCssSelector(s"input[type='radio'][value='$answer']").click()
}

case class PageNotFoundException(s: String) extends Exception(s)
