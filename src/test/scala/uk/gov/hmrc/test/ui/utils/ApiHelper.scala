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

object ApiHelper extends HttpClient {

  val arrivalIdIndex: Int = 10
  val departureIdIndex: Int = 10

  private def headers: Seq[(String, String)] = Seq(
    ("Accept", "application/vnd.hmrc.2.0+json"),
    ("Authorization", World.bearerToken)
  )


  def insertXML(filename: String): Unit = {

    val file = s"${filename.replaceAll(" ", "")}.xml"
    val xmlStr = scala.io.Source.fromFile(s"src/test/resources/xml/$file").getLines.mkString


    file match {

      case "IE007ArrivalNotification.xml" =>
        val url = s"${TestConfiguration.url("manage-transit-movements-frontend")}/test-only/arrival-outbound"
        val response: StandaloneWSResponse = post(url, xmlStr, headers)
        World.arrivalId = response.body.split("/")(arrivalIdIndex)

      case "IE015DepartureDeclaration.xml" =>
        val url = s"${TestConfiguration.url("manage-transit-movements-frontend")}/test-only/departure-outbound"
        val response: StandaloneWSResponse = post(url, xmlStr, headers)
         World.departureId = response.body.split("/")(departureIdIndex)

      case "IE014DeclarationCancellation.xml" =>
        val url = s"${TestConfiguration.url("manage-transit-movements-frontend")}/test-only/departure-outbound-message/${World.departureId}"
        post(url, xmlStr, headers)

      case "IE060ControlDecisionNotificationWithDocuments.xml" =>
        val url = s"${TestConfiguration.url("manage-transit-movements-frontend")}/test-only/departure-inbound/${World.departureId}"
        post(url, xmlStr, headers :+ ("X-Message-Type", "IE060"))

      case "IE060ControlDecisionNotificationWithNoDocuments.xml" =>
        val url = s"${TestConfiguration.url("manage-transit-movements-frontend")}/test-only/departure-inbound/${World.departureId}"
        post(url, xmlStr, headers :+ ("X-Message-Type", "IE060"))

      case "IE056RejectionWithAmendableErrors.xml" =>
        val url = s"${TestConfiguration.url("manage-transit-movements-frontend")}/test-only/departure-inbound/${World.departureId}"
        post(url, xmlStr, headers :+ ("X-Message-Type", "IE056"))

      case "IE056RejectionWithNoAmendableErrors.xml" =>
        val url = s"${TestConfiguration.url("manage-transit-movements-frontend")}/test-only/departure-inbound/${World.departureId}"
        post(url, xmlStr, headers :+ ("X-Message-Type", "IE056"))

      case "IE056RejectionWithMoreThan10Errors.xml" =>
        val url = s"${TestConfiguration.url("manage-transit-movements-frontend")}/test-only/departure-inbound/${World.departureId}"
        post(url, xmlStr, headers :+ ("X-Message-Type", "IE056"))

      case "IE057RejectionLessThan10Errors.xml" =>
        val url = s"${TestConfiguration.url("manage-transit-movements-frontend")}/test-only/arrival-inbound/${World.arrivalId}"
        post(url, xmlStr, headers :+ ("X-Message-Type", "IE057"))

      case "IE057RejectionMoreThan10Errors.xml" =>
        val url = s"${TestConfiguration.url("manage-transit-movements-frontend")}/test-only/arrival-inbound/${World.arrivalId}"
        post(url, xmlStr, headers :+ ("X-Message-Type", "IE057"))

      case "IE043UnloadingPermissionWithSeals.xml" =>
        val url = s"${TestConfiguration.url("manage-transit-movements-frontend")}/test-only/arrival-inbound/${World.arrivalId}"
        post(url, xmlStr, headers :+ ("X-Message-Type", "IE043"))

      case "IE044UnloadingRemarksNotificationWithSeals.xml" =>
        val url = s"${TestConfiguration.url("manage-transit-movements-frontend")}/test-only/arrival-inbound/${World.arrivalId}"
        post(url, xmlStr, headers :+ ("X-Message-Type", "IE044"))



      case _ => throw new scala.RuntimeException("Cannot construct url")

    }
  }

}
