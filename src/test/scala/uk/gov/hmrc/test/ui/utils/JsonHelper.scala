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

import play.api.libs.json._
import play.api.libs.ws.StandaloneWSResponse

trait JsonHelper {

  implicit class RichJsValue(json: JsValue) {

    private def put(path: JsPath, value: String): JsValue =
      json.transform(__.json.update(path.json.put(JsString(value)))) match {
        case JsSuccess(value, _) => value
        case JsError(errors)     => throw new Exception(s"Error adding LRN: $errors")
      }

    def withLrn(lrn: String): JsValue = put(__ \ "lrn", lrn)

    def withEoriNumber(eoriNumber: String): JsValue = put(__ \ "eoriNumber", eoriNumber)

    def pick(path: JsPath): String =
      json.transform(path.json.pick[JsString]).map(_.value).getOrElse {
        throw new RuntimeException(s"Response body did not contain string at path $path")
      }
  }

  implicit class RichStandaloneWSResponse(response: StandaloneWSResponse) {

    def pick(path: JsPath): String = Json.parse(response.body).pick(path)
  }

}
