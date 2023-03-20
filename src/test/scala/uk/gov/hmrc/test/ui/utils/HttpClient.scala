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

import akka.actor.ActorSystem
import akka.stream.{Materializer, SystemMaterializer}
import play.api.libs.json.JsValue
import play.api.libs.ws.ahc.StandaloneAhcWSClient
import play.api.libs.ws.{BodyWritable, StandaloneWSResponse}

trait HttpClient extends AsyncHelper {

  private lazy val asyncClient: StandaloneAhcWSClient = {
    val system: ActorSystem                 = ActorSystem()
    implicit val materializer: Materializer = SystemMaterializer(system).materializer
    StandaloneAhcWSClient()
  }

  def get(url: String, headers: Seq[(String, String)] = Nil): StandaloneWSResponse =
    awaitResult(asyncClient.url(url).withHttpHeaders(headers: _*).get())

  def post[T](url: String, value: T, headers: Seq[(String, String)] = Nil)(implicit bodyWritable: BodyWritable[T]): StandaloneWSResponse =
    awaitResult(asyncClient.url(url).withHttpHeaders(headers: _*).post(value))

  def put(url: String, json: JsValue, headers: Seq[(String, String)] = Nil): StandaloneWSResponse =
    awaitResult(asyncClient.url(url).withHttpHeaders(headers: _*).put(json))

  def delete(url: String, headers: Seq[(String, String)] = Nil): StandaloneWSResponse =
    awaitResult(asyncClient.url(url).withHttpHeaders(headers: _*).delete())

}
