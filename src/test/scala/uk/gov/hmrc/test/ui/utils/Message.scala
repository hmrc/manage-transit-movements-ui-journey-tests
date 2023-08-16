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

sealed trait Message {
  val endpoint: String

  def updateIds(response: StandaloneWSResponse): Unit = ()
}

sealed trait DepartureInboundMessage extends Message {
  val departureId: String
  override val endpoint: String = s"$departureId/departure-inbound"
}

sealed trait ArrivalInboundMessage extends Message {
  val arrivalId: String
  override val endpoint: String = s"$arrivalId/arrival-inbound"
}

case object IE007 extends Message {
  override val endpoint: String = "arrival-outbound"

  override def updateIds(response: StandaloneWSResponse): Unit =
    World.arrivalId = response.body.split("/")(10)
}

case object IE015 extends Message {
  override val endpoint: String = "departure-outbound"

  override def updateIds(response: StandaloneWSResponse): Unit =
    World.departureId = response.body.split("/")(10)
}

case class IE014(departureId: String) extends Message {
  override val endpoint: String = s"$departureId/departure-outbound-message"
}

case class IE060(departureId: String) extends DepartureInboundMessage
case class IE056(departureId: String) extends DepartureInboundMessage

case class IE057(arrivalId: String) extends ArrivalInboundMessage
case class IE043(arrivalId: String) extends ArrivalInboundMessage
case class IE044(arrivalId: String) extends ArrivalInboundMessage
