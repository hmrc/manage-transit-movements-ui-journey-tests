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

import org.mongodb.scala.bson.BsonDocument
import org.mongodb.scala.{SingleObservableFuture, bsonDocumentToDocument}
import play.api.libs.json.Json
import uk.gov.hmrc.test.ui.conf.TestConfiguration
import uk.gov.hmrc.test.ui.cucumber.stepdefs.World

object CacheHelper extends HttpClient with FileHelper with JsonHelper with MongoHelper {

  private def headers: Seq[(String, String)] = Seq(
    ("Authorization", World.bearerToken)
  )

  private val proxy = TestConfiguration.url("manage-transit-movements-departure-frontend")

  def submitDepartureAnswers(fileName: String, lrn: String, eoriNumber: String): Unit = {
    val url  = s"$proxy/test-only/user-answers/${World.sessionId}"
    val json = getJson(fileName).withLrn(lrn).withEoriNumber(eoriNumber)
    post(url, json, headers)
  }

  def submitArrivalAnswers(fileName: String, mrn: String, eoriNumber: String): Unit = {
    val json = getJson(fileName).withMrn(mrn).withEoriNumber(eoriNumber)
    awaitResult {
      mongoClient
        .getDatabase("manage-transit-movements-arrival-cache")
        .getCollection("user-answers")
        .insertOne(bsonDocumentToDocument(BsonDocument(Json.stringify(json))))
        .toFuture()
    }
  }
}
