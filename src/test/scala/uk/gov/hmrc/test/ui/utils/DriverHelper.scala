/*
 * Copyright 2024 HM Revenue & Customs
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

package uk.gov.hmrc.test.ui.utils

import io.cucumber.scala.Scenario
import org.openqa.selenium.*
import org.openqa.selenium.support.ui.{ExpectedConditions, FluentWait}
import uk.gov.hmrc.test.ui.conf.TestConfiguration
import uk.gov.hmrc.test.ui.driver.Driver

import java.time.Duration
import scala.language.postfixOps

trait DriverHelper extends Driver {

  def deleteCookies()(implicit driver: WebDriver): Unit = {
    println("============================Clearing cookies")
    require(driver != null, "WebDriver is not initialized")
    driver.manage().deleteAllCookies()
  }

  def takeScreenshot(scenario: Scenario)(implicit driver: WebDriver): Unit =
    if (scenario.isFailed) {
      val screenshotName = scenario.getName.replaceAll(" ", "_")
      val screenshot     = driver.asInstanceOf[TakesScreenshot].getScreenshotAs(OutputType.BYTES)
      scenario.attach(screenshot, "image/png", screenshotName)
    }

  def fluentWait(implicit driver: WebDriver): FluentWait[WebDriver] =
    new FluentWait[WebDriver](driver)
      .withTimeout(Duration.ofSeconds(TestConfiguration.timeout))
      .pollingEvery(Duration.ofMillis(TestConfiguration.pollDelay))
      .ignoring(classOf[Exception])

  def jse(implicit driver: WebDriver): JavascriptExecutor =
    driver.asInstanceOf[JavascriptExecutor]

  def bringIntoView(by: By, action: WebElement => Unit)(implicit driver: WebDriver): Unit = {
    val element = find(by)
    jse.executeScript("arguments[0].scrollIntoView()", element)
    action(element)
  }

  def find(by: By)(implicit driver: WebDriver): WebElement = fluentWait.until(ExpectedConditions.presenceOfElementLocated(by))

  def click(by: By)(implicit driver: WebDriver): Unit = bringIntoView(by, _.click)
}
