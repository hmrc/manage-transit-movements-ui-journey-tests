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

import play.api.libs.json.{JsValue, Json}

import scala.io.Source

trait FileHelper {

  def getJson(fileName: String): JsValue = {
    val source     = Source.fromResource(s"useranswers/$fileName")
    val jsonString = source.mkString
    source.close()
    Json.parse(jsonString)
  }

  def getXml(fileName: String): String = {
    val source = Source.fromResource(s"xml/$fileName")
    val xml    = source.getLines().mkString
    source.close()
    xml
  }

}
