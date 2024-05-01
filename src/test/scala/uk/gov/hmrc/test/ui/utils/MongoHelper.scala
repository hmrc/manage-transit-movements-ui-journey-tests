/*
 * Copyright 2024 HM Revenue & Customs
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

import org.mongodb.scala.MongoClient

import scala.language.postfixOps

trait MongoHelper extends AsyncHelper {

  lazy val mongoClient: MongoClient = MongoClient()

  def dropCollections(): Unit = {
    println("============================Dropping dbs")

    def dropCollection(dbName: String, collectionName: String = "user-answers"): Unit =
      awaitResult(mongoClient.getDatabase(dbName).getCollection(collectionName).drop().toFuture())

    dropCollection("manage-transit-movements-departure-cache")
    dropCollection("manage-transit-movements-departure-cache", "draft-locks")
    dropCollection("manage-transit-movements-arrival-cache")
    dropCollection("manage-transit-movements-arrival-cache", "draft-locks")
    dropCollection("manage-transit-movements-unloading-frontend")
    dropCollection("manage-transit-movements-cancellation-frontend")
    dropCollection("transit-movements", "movements")
  }
}
