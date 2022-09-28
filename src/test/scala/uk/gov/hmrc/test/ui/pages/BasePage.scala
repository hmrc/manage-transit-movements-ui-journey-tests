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

import org.mongodb.scala.MongoClient
import org.openqa.selenium.support.ui.{ExpectedConditions, FluentWait}
import org.openqa.selenium.{By, JavascriptExecutor, WebDriver, WebElement}
import org.scalatest.matchers.should.Matchers
import uk.gov.hmrc.test.ui.conf.TestConfiguration.config
import uk.gov.hmrc.test.ui.driver.BrowserDriver

import java.time.Duration
import scala.concurrent.Await
import scala.concurrent.duration.DurationInt
import scala.language.postfixOps

trait BasePage extends BrowserDriver with Matchers {

  private lazy val fluentWait: FluentWait[WebDriver] = new FluentWait[WebDriver](driver)
    .withTimeout(Duration.ofSeconds(config.getInt("wait.timeout.seconds")))
    .pollingEvery(Duration.ofMillis(config.getInt("wait.poll.seconds")))
    .ignoring(classOf[Exception])

  def submitPage(): Unit = clickById("submit")

  def dropCollections(): Unit = {
    println("============================Dropping db")
    val mongoClient: MongoClient = MongoClient()

    def dropCollection(dbName: String, collectionName: String = "user-answers"): Unit =
      Await.result(
        mongoClient.getDatabase(dbName).getCollection(collectionName).drop().toFuture(),
        10 seconds
      )

    dropCollection("manage-transit-movements-departure-cache", "manage-transit-movements-departure-frontend")
    dropCollection("manage-transit-movements-arrival-frontend")
    dropCollection("manage-transit-movements-unloading-frontend")
  }

  def deleteCookies(): Unit = {
    println("============================Clearing cookies")
    driver.manage().deleteAllCookies()
  }

  def findBy(by: By): WebElement = fluentWait.until(ExpectedConditions.presenceOfElementLocated(by))

  def findById(id: String): WebElement = findBy(By.id(id))

  def clickById(id: String): Unit = findById(id).click()

  private def randomStringFromCharList(length: Int, chars: Seq[Char]): String = {
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

  def fillInputById(id: String, text: String): Unit = sendKeys(By.id(id), text)

  private def bringIntoView(by: By, action: WebElement => Unit): Unit = {
    val element                 = findBy(by)
    val jse: JavascriptExecutor = driver.asInstanceOf[JavascriptExecutor]
    jse.executeScript("arguments[0].scrollIntoView()", element)
    action(element)
  }

  def click(by: By): Unit = bringIntoView(by, _.click)

  def clickRadioBtn(answer: String): Unit =
    findBy(By.cssSelector(s"input[type='radio'][value='$answer']")).click()

  def clickByPartialLinkText(linkText: String): Unit = click(By.partialLinkText(linkText))

  private def sendKeys(locator: By, value: String): Unit = {
    val element = findBy(locator)
    element.clear()
    element.sendKeys(value)
  }
}

case class PageNotFoundException(s: String) extends Exception(s)
case class InvalidTitleArgsException(s: String) extends Exception(s)
