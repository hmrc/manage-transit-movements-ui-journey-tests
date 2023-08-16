package uk.gov.hmrc.test.ui.utils

import play.api.libs.ws.StandaloneWSResponse
import uk.gov.hmrc.test.ui.conf.TestConfiguration
import uk.gov.hmrc.test.ui.cucumber.stepdefs.World

sealed trait Message {
  val endpoint: String
  val url: String = s"${TestConfiguration.url("manage-transit-movements-frontend")}/test-only/$endpoint"

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
