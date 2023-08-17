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

package uk.gov.hmrc.test.ui.utils

import uk.gov.hmrc.test.ui.conf.TestConfiguration
import uk.gov.hmrc.test.ui.cucumber.stepdefs.World

object ApiHelper extends HttpClient with FileHelper {

  private def headers(messageType: String): Seq[(String, String)] = Seq(
    ("Accept", "application/vnd.hmrc.2.0+json"),
    ("Authorization", World.bearerToken),
    ("X-Message-Type", messageType)
  )

  private val proxy = TestConfiguration.url("manage-transit-movements-frontend")

  private def url(message: Message) = s"$proxy/test-only/${message.endpoint}"

  def insertXML(descriptor: String): Unit = {
    val fileName    = descriptor.replaceAll(" ", "")
    val xml         = getXml(s"$fileName.xml")
    val messageType = getMessageType(descriptor)
    val message     = Message(messageType)
    val response    = post(url(message), xml, headers(messageType))
    message.updateIds(response)
  }

  private def getMessageType(descriptor: String): String = {
    val regex = "IE\\d+".r
    regex.findFirstIn(descriptor).getOrElse {
      throw new RuntimeException(s"$descriptor did not contain a message type")
    }
  }

}
