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

trait Page extends BasePage {

  def title(args: String*): String

  def loadPage(args: String*): this.type = {
    onPage(title(args: _*))
    this
  }

  private def onPage(expectedTitle: String): Unit = {
    val title = driver.getTitle
    val regex = "(.+) - Manage your transit movements - GOV.UK".r
    title match
      case regex(s"$expectedTitle - Departure declarations") => ()
      case regex(s"$expectedTitle - Arrival notifications") => ()
      case regex(s"$expectedTitle - Guarantee balance") => ()
      case regex(expectedTitle) => ()
      case _ => throw PageNotFoundException(s"Expected title to be '$expectedTitle', but found '$title'.")
  }

}

object Page extends BasePage {

  def selectSignOutLink(signOutLink: String): Unit =
    clickByPartialLinkText(signOutLink)
}
