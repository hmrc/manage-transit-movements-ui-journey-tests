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

import play.api.libs.json.*
import play.api.libs.ws.StandaloneWSResponse

import java.time.Instant
import java.util.UUID

trait JsonHelper {

  implicit class RichJsValue(json: JsValue) {

    private def put(path: JsPath, value: JsValue): JsValue =
      json.transform(__.json.update(path.json.put(value))) match {
        case JsSuccess(value, _) => value
        case JsError(errors)     => throw new Exception(s"Error adding LRN: $errors")
      }

    def withLrn(lrn: String): JsValue = put(__ \ "lrn", JsString(lrn))

    def withMrn(mrn: String): JsValue = put(__ \ "mrn", JsString(mrn))

    def withCreatedAt(): JsValue = put(__ \ "createdAt" \ "$date" \ "$numberLong", JsString(Instant.now().toEpochMilli.toString))

    def withLastUpdated(): JsValue = put(__ \ "lastUpdated" \ "$date" \ "$numberLong", JsString(Instant.now().toEpochMilli.toString))
    
    def withId(): JsValue = put(__ \ "_id", JsString(UUID.randomUUID().toString))


    def withEoriNumber(eoriNumber: String): JsValue = put(__ \ "eoriNumber", JsString(eoriNumber))

    def pick(path: JsPath): String =
      json.transform(path.json.pick[JsString]).map(_.value).getOrElse {
        throw new RuntimeException(s"Response body did not contain string at path $path")
      }
  }

  implicit class RichStandaloneWSResponse(response: StandaloneWSResponse) {

    def pick(path: JsPath): String = Json.parse(response.body).pick(path)
  }

}
