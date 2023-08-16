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

import play.api.libs.ws.StandaloneWSResponse
import uk.gov.hmrc.test.ui.conf.TestConfiguration
import uk.gov.hmrc.test.ui.cucumber.stepdefs.World

object ApiHelper extends HttpClient with FileHelper {

  private def headers(message: Message): Seq[(String, String)] = Seq(
    ("Accept", "application/vnd.hmrc.2.0+json"),
    ("Authorization", World.bearerToken),
    ("X-Message-Type", message.toString)
  )

  private val proxy = TestConfiguration.url("manage-transit-movements-frontend")

  private def url(message: Message) = s"$proxy/test-only/${message.endpoint}"

  def insertXML(filename: String): Unit = {
    val file = filename.replaceAll(" ", "")
    val xml  = getXml(s"$file.xml")

    val message: Message = file.take(5) match {
      case "IE007" => IE007
      case "IE015" => IE015
      case "IE014" => IE014(World.departureId)
      case "IE060" => IE060(World.departureId)
      case "IE056" => IE056(World.departureId)
      case "IE057" => IE057(World.arrivalId)
      case "IE043" => IE043(World.arrivalId)
      case "IE044" => IE044(World.arrivalId)
      case _       => throw new RuntimeException(s"$file not found in resources")
    }

    val response: StandaloneWSResponse = post(url(message), xml, headers(message))
    message.updateIds(response)
  }

}
