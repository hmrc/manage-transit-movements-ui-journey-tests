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
import uk.gov.hmrc.test.ui.cucumber.stepdefs.World

object ApiHelper extends HttpClient with FileHelper {

  val arrivalIdIndex: Int   = 10
  val departureIdIndex: Int = 10

  private def headers: Seq[(String, String)] = Seq(
    ("Accept", "application/vnd.hmrc.2.0+json"),
    ("Authorization", World.bearerToken)
  )

  def insertXML(filename: String): Unit = {
    val file   = filename.replaceAll(" ", "")
    val xmlStr = getXml(s"$file.xml")

    val message: Message = file match {
      case "IE007ArrivalNotification" => IE007
      case "IE015DepartureDeclaration" => IE015
      case "IE014DeclarationCancellation" => IE014(World.departureId)
      case "IE060ControlDecisionNotificationWithDocuments" => IE060(World.departureId)
      case "IE060ControlDecisionNotificationWithNoDocuments" => IE060(World.departureId)
      case "IE056RejectionWithAmendableErrors" => IE056(World.departureId)
      case "IE056RejectionWithNoAmendableErrors" => IE056(World.departureId)
      case "IE057Rejection" => IE057(World.arrivalId)
      case "IE043UnloadingPermissionWithSeals" => IE043(World.arrivalId)
      case "IE044UnloadingRemarksNotificationWithSeals" => IE044(World.arrivalId)
      case _ => throw new scala.RuntimeException(s"$file not found ion resources")
    }

    val response: StandaloneWSResponse = post(message.url, xmlStr, headers :+ ("X-Message-Type", "IE044"))
    message.updateIds(response)
  }

}
