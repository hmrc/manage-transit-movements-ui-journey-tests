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
import akka.util.ByteString
import play.api.libs.json.{JsValue, Json}
import play.api.libs.ws.ahc.StandaloneAhcWSClient
import play.api.libs.ws.{BodyWritable, InMemoryBody, StandaloneWSResponse}

object HttpClient extends AsyncHelper {

  private implicit val bodyWrites: BodyWritable[JsValue] =
    BodyWritable(a => InMemoryBody(ByteString.fromArrayUnsafe(Json.toBytes(a))), "application/json")

  private implicit val bodyStrWrites: BodyWritable[String] =
    BodyWritable(a => InMemoryBody(ByteString.fromArrayUnsafe(a.getBytes())), "application/xml")

  private lazy val asyncClient: StandaloneAhcWSClient = {
    val system: ActorSystem                 = ActorSystem()
    implicit val materializer: Materializer = SystemMaterializer(system).materializer
    StandaloneAhcWSClient()
  }

  def get(url: String, headers: Seq[(String, String)] = Nil): StandaloneWSResponse =
    awaitResult(asyncClient.url(url).withHttpHeaders(headers: _*).get())

  def post(url: String, json: JsValue, headers: Seq[(String, String)] = Nil): StandaloneWSResponse =
    awaitResult(asyncClient.url(url).withHttpHeaders(headers: _*).post(json))

  def postStr(url: String, value: String, headers: Seq[(String, String)] = Nil): StandaloneWSResponse =
    awaitResult(asyncClient.url(url).withHttpHeaders(headers: _*).post(value))

  def put(url: String, json: JsValue, headers: Seq[(String, String)] = Nil): StandaloneWSResponse =
    awaitResult(asyncClient.url(url).withHttpHeaders(headers: _*).put(json))

  def delete(url: String, headers: Seq[(String, String)] = Nil): StandaloneWSResponse =
    awaitResult(asyncClient.url(url).withHttpHeaders(headers: _*).delete())

}
