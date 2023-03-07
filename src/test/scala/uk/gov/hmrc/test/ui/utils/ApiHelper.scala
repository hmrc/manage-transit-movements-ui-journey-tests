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

import uk.gov.hmrc.test.ui.cucumber.stepdefs.World

object ApiHelper {

  private def headers: Seq[(String, String)] = Seq(
    ("Accept", "application/vnd.hmrc.2.0+json"),
    ("Authorization", World.bearerToken)
  )

  def insertArrival(): Unit = {
    val url = "http://localhost:9485/manage-transit-movements/test-only/arrival-outbound"

    val xmlStr =
      (<ncts:CC007C PhaseID="NCTS5.0" xmlns:ncts="http://ncts.dgtaxud.ec">
        <messageSender>token</messageSender>
        <messageRecipient>token</messageRecipient>
        <preparationDateAndTime>2007-10-26T07:36:28</preparationDateAndTime>
        <messageIdentification>token</messageIdentification>
        <messageType>CC007C</messageType>
        <correlationIdentifier>token</correlationIdentifier>
        <TransitOperation>
          <MRN>38VYQTYFU3T0KUTUM3</MRN>
          <arrivalNotificationDateAndTime>2022-07-02T03:11:04</arrivalNotificationDateAndTime>
          <simplifiedProcedure>1</simplifiedProcedure>
          <incidentFlag>1</incidentFlag>
        </TransitOperation>
        <Authorisation>
          <sequenceNumber>123</sequenceNumber>
          <type>3344</type>
          <referenceNumber>token</referenceNumber>
        </Authorisation>
        <CustomsOfficeOfDestinationActual>
          <referenceNumber>GB123456</referenceNumber>
        </CustomsOfficeOfDestinationActual>
        <TraderAtDestination>
          <identificationNumber>ezv3Z</identificationNumber>
          <communicationLanguageAtDestination>sa</communicationLanguageAtDestination>
        </TraderAtDestination>
        <Consignment>
          <LocationOfGoods>
            <typeOfLocation>A</typeOfLocation>
            <qualifierOfIdentification>A</qualifierOfIdentification>
            <authorisationNumber>token</authorisationNumber>
            <additionalIdentifier>1234</additionalIdentifier>
            <UNLocode>token</UNLocode>
            <CustomsOffice>
              <referenceNumber>AB234567</referenceNumber>
            </CustomsOffice>
            <EconomicOperator>
              <identificationNumber>ezv3Z</identificationNumber>
            </EconomicOperator>
            <Address>
              <streetAndNumber>token</streetAndNumber>
              <postcode>token</postcode>
              <city>token</city>
              <country>GB</country>
            </Address>
            <PostcodeAddress>
              <houseNumber>token</houseNumber>
              <postcode>token</postcode>
              <country>SA</country>
            </PostcodeAddress>
            <ContactPerson>
              <name>token</name>
              <phoneNumber>token</phoneNumber>
              <eMailAddress>sandeep@gmail.com</eMailAddress>
            </ContactPerson>
          </LocationOfGoods>
          <Incident>
            <sequenceNumber>12345</sequenceNumber>
            <code>1</code>
            <text>token</text>
            <Endorsement>
              <date>2022-07-02</date>
              <authority>token</authority>
              <place>token</place>
              <country>GB</country>
            </Endorsement>
            <Location>
              <qualifierOfIdentification>A</qualifierOfIdentification>
              <UNLocode>token</UNLocode>
              <country>SA</country>
              <Address>
                <streetAndNumber>token</streetAndNumber>
                <postcode>token</postcode>
                <city>token</city>
              </Address>
            </Location>
            <TransportEquipment>
              <sequenceNumber>12345</sequenceNumber>
              <containerIdentificationNumber>ezv3Z</containerIdentificationNumber>
              <numberOfSeals>2345</numberOfSeals>
              <Seal>
                <sequenceNumber>12345</sequenceNumber>
                <identifier>token</identifier>
              </Seal>
              <GoodsReference>
                <sequenceNumber>12345</sequenceNumber>
                <declarationGoodsItemNumber>12</declarationGoodsItemNumber>
              </GoodsReference>
            </TransportEquipment>
            <Transhipment>
              <containerIndicator>0</containerIndicator>
              <TransportMeans>
                <typeOfIdentification>12</typeOfIdentification>
                <identificationNumber>ezv3Z</identificationNumber>
                <nationality>GB</nationality>
              </TransportMeans>
            </Transhipment>
          </Incident>
        </Consignment>
      </ncts:CC007C>).mkString

    HttpClient.postStr(url, xmlStr, headers)
  }

}
