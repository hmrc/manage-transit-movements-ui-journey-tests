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
import uk.gov.hmrc.test.ui.conf.TestConfiguration
import uk.gov.hmrc.test.ui.cucumber.stepdefs.World

object ApiHelper extends HttpClient {

  val arrivalIdIndex: Int = 10
  val departureIdIndex: Int = 10

  private def headers: Seq[(String, String)] = Seq(
    ("Accept", "application/vnd.hmrc.2.0+json"),
    ("Authorization", World.bearerToken)
  )


  def insertXML(filename: String): Unit = {

    val file = s"${filename.replaceAll(" ", "")}.xml"
    val xmlStr = scala.io.Source.fromFile(s"src/test/resources/xml/$file").getLines.mkString

    file match {
      case "DepartureDeclarationIE015.xml" =>
        val url = s"${TestConfiguration.url("manage-transit-movements-frontend")}/test-only/departure-outbound"
        val response: StandaloneWSResponse = post(url, xmlStr, headers)
         World.departureId = response.body.split("/")(departureIdIndex)

      case "ControlDecisionNotificationIE060WithDocuments.xml" =>
        val url = s"${TestConfiguration.url("manage-transit-movements-frontend")}/test-only/departure-inbound/${World.departureId}"
        post(url, xmlStr, headers :+ ("X-Message-Type", "IE060"))

      case _ => throw new scala.RuntimeException("Cannot construct url")

    }



  }

//      <ncts:CC015C PhaseID="NCTS5.0" xmlns:ncts="http://ncts.dgtaxud.ec">
//        <messageSender>token</messageSender>
//        <messageRecipient>FdOcminxBxSLGm1rRUn0q96S1</messageRecipient>
//        <preparationDateAndTime>2022-01-22T07:43:36</preparationDateAndTime>
//        <messageIdentification>6Onxa3En</messageIdentification>
//        <messageType>CC015C</messageType>
//        <TransitOperation>
//          <LRN>83LU49243708J1I4B5A2NM</LRN>
//          <declarationType>Pbg</declarationType>
//          <additionalDeclarationType>O</additionalDeclarationType>
//          <security>8</security>
//          <reducedDatasetIndicator>1</reducedDatasetIndicator>
//          <bindingItinerary>0</bindingItinerary>
//        </TransitOperation>
//        <CustomsOfficeOfDeparture>
//          <referenceNumber>GB123456</referenceNumber>
//        </CustomsOfficeOfDeparture>
//        <CustomsOfficeOfDestinationDeclared>
//          <referenceNumber>ZQZ20442</referenceNumber>
//        </CustomsOfficeOfDestinationDeclared>
//        <HolderOfTheTransitProcedure>
//          <identificationNumber>SFzsisksA</identificationNumber>
//        </HolderOfTheTransitProcedure>
//        <Guarantee>
//          <sequenceNumber>48711</sequenceNumber>
//          <guaranteeType>1</guaranteeType>
//          <otherGuaranteeReference>1qJMA6MbhnnrOJJjHBHX</otherGuaranteeReference>
//        </Guarantee>
//        <Consignment>
//          <grossMass>6430669292.48125</grossMass>
//          <HouseConsignment>
//            <sequenceNumber>48711</sequenceNumber>
//            <grossMass>6430669292.48125</grossMass>
//            <ConsignmentItem>
//              <goodsItemNumber>18914</goodsItemNumber>
//              <declarationGoodsItemNumber>1458</declarationGoodsItemNumber>
//              <Commodity>
//                <descriptionOfGoods>ZMyM5HTSTnLqT5FT9aHXwScqXKC1VitlWeO5gs91cVXBXOB8xBdXG5aGhG9VFjjDGiraIETFfbQWeA7VUokO7ngDOrKZ23ccKKMA6C3GpXciUTt9nS2pzCFFFeg4BXdkIe</descriptionOfGoods>
//              </Commodity>
//              <Packaging>
//                <sequenceNumber>48711</sequenceNumber>
//                <typeOfPackages>Oi</typeOfPackages>
//              </Packaging>
//            </ConsignmentItem>
//          </HouseConsignment>
//        </Consignment>
//      </ncts:CC015C>.mkString

//    val response: StandaloneWSResponse = post(url, xmlStr, headers)
//    World.departureId = response.body.split("/")(departureIdIndex)
//  }

  def insertPostiveAcknowledgement(): Unit = {
    val url = s"${TestConfiguration.url("manage-transit-movements-frontend")}/test-only/departure-inbound/${World.departureId}"

    val xmlStr =
      <ns2:CC928C xmlns:ns2="http://ncts.dgtaxud.ec" PhaseID="NCTS5.1">
        <messageSender>NTA.LU</messageSender>
        <messageRecipient>LU11868245</messageRecipient>
        <preparationDateAndTime>2021-10-19T06:44:30</preparationDateAndTime>
        <messageIdentification>5b839278095847eb830e48965a68d4b2</messageIdentification>
        <messageType>CC928C</messageType>
        <TransitOperation>
          <LRN>83LU49243708J1I4B5A2NM</LRN>
        </TransitOperation>
        <CustomsOfficeOfDeparture>
          <referenceNumber>LU715000</referenceNumber>
        </CustomsOfficeOfDeparture>
        <HolderOfTheTransitProcedure>
          <identificationNumber>LU14900721</identificationNumber>
        </HolderOfTheTransitProcedure>
      </ns2:CC928C>.mkString

    post(url, xmlStr, headers :+ ("X-Message-Type", "IE928"))
  }

  def insertMRNAllocation(): Unit = {
    val url = s"${TestConfiguration.url("manage-transit-movements-frontend")}/test-only/departure-inbound/${World.departureId}"

    val xmlStr =
      <ncts:CC028C PhaseID="NCTS5.0" xmlns:ncts="http://ncts.dgtaxud.ec">
        <messageSender>token</messageSender>
        <messageRecipient>FdOcminxBxSLGm1rRUn0q96S1</messageRecipient>
        <preparationDateAndTime>2022-12-25T07:36:28</preparationDateAndTime>
        <messageIdentification>6Onxa3En</messageIdentification>
        <messageType>CC057C</messageType>
        <correlationIdentifier>co-id-1</correlationIdentifier>
        <TransitOperation>
          <MRN>28BDU7NB98LCWXLNM2</MRN>
          <declarationAcceptanceDate>2022-12-25</declarationAcceptanceDate>
        </TransitOperation>
        <CustomsOfficeOfDeparture>
          <referenceNumber>2</referenceNumber>
        </CustomsOfficeOfDeparture>
        <HolderOfTheTransitProcedure>
          <identificationNumber>Fzsisks</identificationNumber>
          <TIRHolderIdentificationNumber>trp-id-1</TIRHolderIdentificationNumber>
          <name>Jean Doe</name>
          <Address>
            <streetAndNumber>1 avenue marceau</streetAndNumber>
            <postcode>10006</postcode>
            <city>Paris</city>
            <country>FR</country>
          </Address>
        </HolderOfTheTransitProcedure>
      </ncts:CC028C>.mkString

    post(url, xmlStr, headers :+ ("X-Message-Type", "IE028"))
  }

//  def insertControlDecision(): Unit = {
//    val url = s"${TestConfiguration.url("manage-transit-movements-frontend")}/test-only/departure-inbound/${World.departureId}"
//
//    val xmlStr =
//      <ncts:CC060C PhaseID="NCTS5.0" xmlns:ncts="http://ncts.dgtaxud.ec">
//        <messageSender>token</messageSender>
//        <messageRecipient>token</messageRecipient>
//        <preparationDateAndTime>2007-10-26T07:36:28</preparationDateAndTime>
//        <messageIdentification>token</messageIdentification>
//        <messageType>CC060C</messageType>
//        <!--Optional:-->
//        <correlationIdentifier>token</correlationIdentifier>
//        <TransitOperation>
//          <!--Optional:-->
//          <LRN>string</LRN>
//          <!--Optional:-->
//          <MRN>string</MRN>
//          <controlNotificationDateAndTime>2014-06-09T16:15:04+01:00</controlNotificationDateAndTime>
//          <notificationType>token</notificationType>
//        </TransitOperation>
//        <CustomsOfficeOfDeparture>
//          <referenceNumber>stringst</referenceNumber>
//        </CustomsOfficeOfDeparture>
//        <HolderOfTheTransitProcedure>
//          <!--Optional:-->
//          <identificationNumber>string</identificationNumber>
//          <!--Optional:-->
//          <TIRHolderIdentificationNumber>string</TIRHolderIdentificationNumber>
//          <!--Optional:-->
//          <name>string</name>
//          <!--Optional:-->
//          <Address>
//            <streetAndNumber>string</streetAndNumber>
//            <!--Optional:-->
//            <postcode>string</postcode>
//            <city>string</city>
//            <country>st</country>
//          </Address>
//          <!--Optional:-->
//          <ContactPerson>
//            <name>string</name>
//            <phoneNumber>token</phoneNumber>
//            <!--Optional:-->
//            <eMailAddress>string</eMailAddress>
//          </ContactPerson>
//        </HolderOfTheTransitProcedure>
//        <!--Optional:-->
//        <Representative>
//          <identificationNumber>string</identificationNumber>
//          <status>token</status>
//          <!--Optional:-->
//          <ContactPerson>
//            <name>string</name>
//            <phoneNumber>token</phoneNumber>
//            <!--Optional:-->
//            <eMailAddress>string</eMailAddress>
//          </ContactPerson>
//        </Representative>
//        <!--0 to 99 repetitions:-->
//        <TypeOfControls>
//          <sequenceNumber>token</sequenceNumber>
//          <type>str</type>
//          <!--Optional:-->
//          <text>string</text>
//        </TypeOfControls>
//        <!--0 to 99 repetitions:-->
//        <RequestedDocument>
//          <sequenceNumber>token</sequenceNumber>
//          <documentType>token</documentType>
//          <!--Optional:-->
//          <description>string</description>
//        </RequestedDocument>
//      </ncts:CC060C>.mkString

//    post(url, xmlStr, headers :+ ("X-Message-Type", "IE060"))
//  }

  def insertControlDecisionNoDocuments(): Unit = {
    val url = s"${TestConfiguration.url("manage-transit-movements-frontend")}/test-only/departure-inbound/${World.departureId}"

    val xmlStr =
      <ncts:CC060C PhaseID="NCTS5.0" xmlns:ncts="http://ncts.dgtaxud.ec">
        <messageSender>token</messageSender>
        <messageRecipient>token</messageRecipient>
        <preparationDateAndTime>2007-10-26T07:36:28</preparationDateAndTime>
        <messageIdentification>token</messageIdentification>
        <messageType>CC060C</messageType>
        <!--Optional:-->
        <correlationIdentifier>token</correlationIdentifier>
        <TransitOperation>
          <!--Optional:-->
          <LRN>qvRcL</LRN>
          <!--Optional:-->
          <MRN>28BDU7NB98LCWXLNM2</MRN>
          <controlNotificationDateAndTime>2014-06-09T16:15:04+01:00</controlNotificationDateAndTime>
          <notificationType>0</notificationType>
        </TransitOperation>
        <CustomsOfficeOfDeparture>
          <referenceNumber>GB000060</referenceNumber>
        </CustomsOfficeOfDeparture>
        <HolderOfTheTransitProcedure>
          <!--Optional:-->
          <identificationNumber>string</identificationNumber>
          <!--Optional:-->
          <TIRHolderIdentificationNumber>string</TIRHolderIdentificationNumber>
          <!--Optional:-->
          <name>string</name>
          <!--Optional:-->
          <Address>
            <streetAndNumber>string</streetAndNumber>
            <!--Optional:-->
            <postcode>string</postcode>
            <city>string</city>
            <country>st</country>
          </Address>
          <!--Optional:-->
          <ContactPerson>
            <name>string</name>
            <phoneNumber>token</phoneNumber>
            <!--Optional:-->
            <eMailAddress>string</eMailAddress>
          </ContactPerson>
        </HolderOfTheTransitProcedure>
        <!--Optional:-->
        <Representative>
          <identificationNumber>string</identificationNumber>
          <status>token</status>
          <!--Optional:-->
          <ContactPerson>
            <name>string</name>
            <phoneNumber>token</phoneNumber>
            <!--Optional:-->
            <eMailAddress>string</eMailAddress>
          </ContactPerson>
        </Representative>
        <!--0 to 99 repetitions:-->
        <TypeOfControls>
          <sequenceNumber>1</sequenceNumber>
          <type>42</type>
          <!--Optional:-->
          <text>string</text>
        </TypeOfControls>
        <TypeOfControls>
          <sequenceNumber>2</sequenceNumber>
          <type>44</type>
          <!--Optional:-->
          <text>string</text>
        </TypeOfControls>
      </ncts:CC060C>.mkString

    post(url, xmlStr, headers :+ ("X-Message-Type", "IE060"))
  }

  def insertArrival(): Unit = {
    val url = s"${TestConfiguration.url("manage-transit-movements-frontend")}/test-only/arrival-outbound"

    val xmlStr =
      <ncts:CC007C PhaseID="NCTS5.0" xmlns:ncts="http://ncts.dgtaxud.ec">
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
      </ncts:CC007C>.mkString

    val response: StandaloneWSResponse = post(url, xmlStr, headers)
    World.arrivalId                    = response.body.split("/")(arrivalIdIndex)
  }

  def insertUnloadingPermissionWithSeals() : Unit = {
    val url = s"${TestConfiguration.url("manage-transit-movements-frontend")}/test-only/arrival-inbound/${World.arrivalId}"

    val xmlStr =
      <ncts:CC043C PhaseID="NCTS5.0" xmlns:ncts="http://ncts.dgtaxud.ec">
        <messageSender>token</messageSender>
        <messageRecipient>token</messageRecipient>
        <preparationDateAndTime>2007-10-26T07:36:28</preparationDateAndTime>
        <messageIdentification>token</messageIdentification>
        <messageType>CC043C</messageType>
        <correlationIdentifier>token</correlationIdentifier>
        <TransitOperation>
          <MRN>38VYQTYFU3T0KUTUM3</MRN>
          <declarationType>3</declarationType>
          <declarationAcceptanceDate>2014-06-09+01:00</declarationAcceptanceDate>
          <security>4</security>
          <reducedDatasetIndicator>1</reducedDatasetIndicator>
        </TransitOperation>
        <CustomsOfficeOfDestinationActual>
          <referenceNumber>GB000068</referenceNumber>
        </CustomsOfficeOfDestinationActual>
        <HolderOfTheTransitProcedure>
          <identificationNumber>Fzsisks</identificationNumber>
          <TIRHolderIdentificationNumber>trp-id-1</TIRHolderIdentificationNumber>
          <name>Jean Doe</name>
          <Address>
            <streetAndNumber>1 avenue marceau</streetAndNumber>
            <postcode>10006</postcode>
            <city>Paris</city>
            <country>FR</country>
          </Address>
        </HolderOfTheTransitProcedure>
        <TraderAtDestination>
          <identificationNumber>tad-1</identificationNumber>
        </TraderAtDestination>
        <CTLControl>
          <continueUnloading>9</continueUnloading>
        </CTLControl>
        <Consignment>
          <countryOfDestination>FR</countryOfDestination>
          <containerIndicator>1</containerIndicator>
          <inlandModeOfTransport>2</inlandModeOfTransport>
          <grossMass>1000.99</grossMass>
          <Consignor>
            <identificationNumber>id2</identificationNumber>
            <name>john doe</name>
            <Address>
              <streetAndNumber>1 high street</streetAndNumber>
              <postcode>N1 99Z</postcode>
              <city>Newcastle</city>
              <country>GB</country>
            </Address>
          </Consignor>
          <Consignee>
            <identificationNumber>csgnee-1</identificationNumber>
            <name>Jane Doe</name>
            <Address>
              <streetAndNumber>1 Champs Elysees</streetAndNumber>
              <postcode>75008</postcode>
              <city>Paris</city>
              <country>FR</country>
            </Address>
          </Consignee>
          <TransportEquipment>
            <sequenceNumber>te1</sequenceNumber>
            <containerIdentificationNumber>cin-1</containerIdentificationNumber>
            <numberOfSeals>103</numberOfSeals>
            <Seal>
              <sequenceNumber>1001</sequenceNumber>
              <identifier>1002</identifier>
            </Seal>
            <GoodsReference>
              <sequenceNumber>gref-1</sequenceNumber>
              <declarationGoodsItemNumber>108</declarationGoodsItemNumber>
            </GoodsReference>
          </TransportEquipment>
          <DepartureTransportMeans>
            <sequenceNumber>dtm-1</sequenceNumber>
            <typeOfIdentification>4</typeOfIdentification>
            <identificationNumber>28</identificationNumber>
            <nationality>DE</nationality>
          </DepartureTransportMeans>
          <PreviousDocument>
            <sequenceNumber>pr-1</sequenceNumber>
            <type>9811</type>
            <referenceNumber>info1</referenceNumber>
            <complementOfInformation>8</complementOfInformation>
          </PreviousDocument>
          <SupportingDocument>
            <sequenceNumber>sd-1</sequenceNumber>
            <type>4567</type>
            <referenceNumber>1234</referenceNumber>
            <complementOfInformation>2</complementOfInformation>
          </SupportingDocument>
          <TransportDocument>
            <sequenceNumber>td-1</sequenceNumber>
            <type>4</type>
            <referenceNumber>refn-1</referenceNumber>
          </TransportDocument>
          <AdditionalReference>
            <sequenceNumber>12</sequenceNumber>
            <type>4</type>
            <referenceNumber>addref-1</referenceNumber>
          </AdditionalReference>
          <AdditionalInformation>
            <sequenceNumber>adref-2</sequenceNumber>
            <code>6</code>
            <text>additional ref text</text>
          </AdditionalInformation>
          <Incident>
            <sequenceNumber>23</sequenceNumber>
            <code>5</code>
            <text>some text 1</text>
            <Endorsement>
              <date>2013-05-22+01:00</date>
              <authority>de</authority>
              <place>Cologne</place>
              <country>DE</country>
            </Endorsement>
            <Location>
              <qualifierOfIdentification>loc1</qualifierOfIdentification>
              <UNLocode>34</UNLocode>
              <country>DE</country>
              <GNSS>
                <latitude>91.0</latitude>
                <longitude>92.0</longitude>
              </GNSS>
              <Address>
                <streetAndNumber>2 high street</streetAndNumber>
                <postcode>ab12 34c</postcode>
                <city>city2</city>
              </Address>
            </Location>
            <TransportEquipment>
              <sequenceNumber>te1</sequenceNumber>
              <containerIdentificationNumber>tn1</containerIdentificationNumber>
              <numberOfSeals>34</numberOfSeals>
              <Seal>
                <sequenceNumber>7</sequenceNumber>
                <identifier>sl7</identifier>
              </Seal>
              <GoodsReference>
                <sequenceNumber>gref-5</sequenceNumber>
                <declarationGoodsItemNumber>78</declarationGoodsItemNumber>
              </GoodsReference>
            </TransportEquipment>
            <Transhipment>
              <containerIndicator>1</containerIndicator>
              <TransportMeans>
                <typeOfIdentification>5</typeOfIdentification>
                <identificationNumber>44</identificationNumber>
                <nationality>FR</nationality>
              </TransportMeans>
            </Transhipment>
          </Incident>
          <HouseConsignment>
            <sequenceNumber>hc1</sequenceNumber>
            <grossMass>1234.567</grossMass>
            <securityIndicatorFromExportDeclaration>si1</securityIndicatorFromExportDeclaration>
            <Consignor>
              <identificationNumber>csgr1</identificationNumber>
              <name>michael doe</name>
              <Address>
                <streetAndNumber>3 main street</streetAndNumber>
                <postcode>bc2 45d</postcode>
                <city>city4</city>
                <country>FR</country>
              </Address>
            </Consignor>
            <Consignee>
              <identificationNumber>csgee1</identificationNumber>
              <name>John Smith</name>
              <Address>
                <streetAndNumber>5 main street</streetAndNumber>
                <postcode>cd4 56e</postcode>
                <city>city5</city>
                <country>DE</country>
              </Address>
            </Consignee>
            <DepartureTransportMeans>
              <sequenceNumber>56</sequenceNumber>
              <typeOfIdentification>2</typeOfIdentification>
              <identificationNumber>23</identificationNumber>
              <nationality>IT</nationality>
            </DepartureTransportMeans>
            <PreviousDocument>
              <sequenceNumber>67</sequenceNumber>
              <type>3</type>
              <referenceNumber>4</referenceNumber>
              <complementOfInformation>1</complementOfInformation>
            </PreviousDocument>
            <SupportingDocument>
              <sequenceNumber>3</sequenceNumber>
              <type>7</type>
              <referenceNumber>ref4</referenceNumber>
              <complementOfInformation>6</complementOfInformation>
            </SupportingDocument>
            <TransportDocument>
              <sequenceNumber>7</sequenceNumber>
              <type>8</type>
              <referenceNumber>9</referenceNumber>
            </TransportDocument>
            <AdditionalReference>
              <sequenceNumber>3</sequenceNumber>
              <type>5</type>
              <referenceNumber>4</referenceNumber>
            </AdditionalReference>
            <AdditionalInformation>
              <sequenceNumber>6</sequenceNumber>
              <code>7</code>
              <text>8</text>
            </AdditionalInformation>
            <ConsignmentItem>
              <goodsItemNumber>6</goodsItemNumber>
              <declarationGoodsItemNumber>100</declarationGoodsItemNumber>
              <declarationType>2</declarationType>
              <countryOfDestination>DE</countryOfDestination>
              <Consignee>
                <identificationNumber>5</identificationNumber>
                <name>Smith</name>
                <Address>
                  <streetAndNumber>5 main street</streetAndNumber>
                  <postcode>ab12 3cd</postcode>
                  <city>Newcastle</city>
                  <country>GB</country>
                </Address>
              </Consignee>
              <Commodity>
                <descriptionOfGoods>shirts</descriptionOfGoods>
                <cusCode>1</cusCode>
                <CommodityCode>
                  <harmonizedSystemSubHeadingCode>3</harmonizedSystemSubHeadingCode>
                  <combinedNomenclatureCode>45</combinedNomenclatureCode>
                </CommodityCode>
                <DangerousGoods>
                  <sequenceNumber>5</sequenceNumber>
                  <UNNumber>1</UNNumber>
                </DangerousGoods>
                <GoodsMeasure>
                  <grossMass>123.45</grossMass>
                  <netMass>123.45</netMass>
                </GoodsMeasure>
              </Commodity>
              <Packaging>
                <sequenceNumber>5</sequenceNumber>
                <typeOfPackages>3</typeOfPackages>
                <numberOfPackages>99</numberOfPackages>
                <shippingMarks>xyz</shippingMarks>
              </Packaging>
              <PreviousDocument>
                <sequenceNumber>2</sequenceNumber>
                <type>3</type>
                <referenceNumber>4</referenceNumber>
                <goodsItemNumber>5</goodsItemNumber>
                <complementOfInformation>1</complementOfInformation>
              </PreviousDocument>
              <SupportingDocument>
                <sequenceNumber>6</sequenceNumber>
                <type>7</type>
                <referenceNumber>8</referenceNumber>
                <complementOfInformation>0</complementOfInformation>
              </SupportingDocument>
              <TransportDocument>
                <sequenceNumber>3</sequenceNumber>
                <type>2</type>
                <referenceNumber>4</referenceNumber>
              </TransportDocument>
              <AdditionalReference>
                <sequenceNumber>4</sequenceNumber>
                <type>3</type>
                <referenceNumber>1</referenceNumber>
              </AdditionalReference>
              <AdditionalInformation>
                <sequenceNumber>7</sequenceNumber>
                <code>6</code>
                <text>additional info text</text>
              </AdditionalInformation>
            </ConsignmentItem>
          </HouseConsignment>
        </Consignment>
      </ncts:CC043C>.mkString

    post(url, xmlStr, headers :+ ("X-Message-Type", "IE043"))
  }

  def insertRejectionNonAmendable(): Unit = {
    val url = s"${TestConfiguration.url("manage-transit-movements-frontend")}/test-only/departure-inbound/${World.departureId}"

    val xmlStr =
      <ncts:CC056C PhaseID="NCTS5.0" xmlns:ncts="http://ncts.dgtaxud.ec">
        <messageSender>token</messageSender>
        <messageRecipient>token</messageRecipient>
        <preparationDateAndTime>2007-10-26T07:36:28</preparationDateAndTime>
        <messageIdentification>token</messageIdentification>
        <messageType>CC056C</messageType>
        <!--Optional:-->
        <correlationIdentifier>token</correlationIdentifier>
        <TransitOperation>
          <!--Optional:-->
          <LRN>string</LRN>
          <!--Optional:-->
          <MRN>string</MRN>
          <businessRejectionType>token</businessRejectionType>
          <rejectionDateAndTime>2014-06-09T16:15:04+01:00</rejectionDateAndTime>
          <rejectionCode>token</rejectionCode>
          <!--Optional:-->
          <rejectionReason>string</rejectionReason>
        </TransitOperation>
        <CustomsOfficeOfDeparture>
          <referenceNumber>stringst</referenceNumber>
        </CustomsOfficeOfDeparture>
        <HolderOfTheTransitProcedure>
          <!--Optional:-->
          <identificationNumber>string</identificationNumber>
          <!--Optional:-->
          <TIRHolderIdentificationNumber>string</TIRHolderIdentificationNumber>
          <!--Optional:-->
          <name>string</name>
          <!--Optional:-->
          <Address>
            <streetAndNumber>string</streetAndNumber>
            <!--Optional:-->
            <postcode>string</postcode>
            <city>string</city>
            <country>st</country>
          </Address>
        </HolderOfTheTransitProcedure>
        <!--Optional:-->
        <Representative>
          <identificationNumber>string</identificationNumber>
          <status>token</status>
        </Representative>
        <!--0 to 9999 repetitions:-->
        <FunctionalError>
          <errorPointer>/CC015C/NonAmendable[1]/referenceNumber</errorPointer>
          <errorCode>12</errorCode>
          <errorReason>Value of an element in a message is outside the predefined set of values or not part of the applicable business</errorReason>
          <!--Optional:-->
          <originalAttributeValue>string</originalAttributeValue>
        </FunctionalError>
      </ncts:CC056C>.mkString

    post(url, xmlStr, headers :+ ("X-Message-Type", "IE056"))
  }

  def insertRejectionAmendable(): Unit = {
    val url = s"${TestConfiguration.url("manage-transit-movements-frontend")}/test-only/departure-inbound/${World.departureId}"

    val xmlStr =
      <ncts:CC056C PhaseID="NCTS5.0" xmlns:ncts="http://ncts.dgtaxud.ec">
        <messageSender>token</messageSender>
        <messageRecipient>token</messageRecipient>
        <preparationDateAndTime>2007-10-26T07:36:28</preparationDateAndTime>
        <messageIdentification>token</messageIdentification>
        <messageType>CC056C</messageType>
        <!--Optional:-->
        <correlationIdentifier>token</correlationIdentifier>
        <TransitOperation>
          <!--Optional:-->
          <LRN>string</LRN>
          <!--Optional:-->
          <MRN>string</MRN>
          <businessRejectionType>token</businessRejectionType>
          <rejectionDateAndTime>2014-06-09T16:15:04+01:00</rejectionDateAndTime>
          <rejectionCode>token</rejectionCode>
          <!--Optional:-->
          <rejectionReason>string</rejectionReason>
        </TransitOperation>
        <CustomsOfficeOfDeparture>
          <referenceNumber>stringst</referenceNumber>
        </CustomsOfficeOfDeparture>
        <HolderOfTheTransitProcedure>
          <!--Optional:-->
          <identificationNumber>string</identificationNumber>
          <!--Optional:-->
          <TIRHolderIdentificationNumber>string</TIRHolderIdentificationNumber>
          <!--Optional:-->
          <name>string</name>
          <!--Optional:-->
          <Address>
            <streetAndNumber>string</streetAndNumber>
            <!--Optional:-->
            <postcode>string</postcode>
            <city>string</city>
            <country>st</country>
          </Address>
        </HolderOfTheTransitProcedure>
        <!--Optional:-->
        <Representative>
          <identificationNumber>string</identificationNumber>
          <status>token</status>
        </Representative>
        <!--0 to 9999 repetitions:-->
        <FunctionalError>
          <errorPointer>/CC015C/Authorisation[1]/referenceNumber</errorPointer>
          <errorCode>12</errorCode>
          <errorReason>Value of an element in a message is outside the predefined set of values or not part of the applicable business</errorReason>
          <!--Optional:-->
          <originalAttributeValue>string</originalAttributeValue>
        </FunctionalError>
        <FunctionalError>
          <errorPointer>/CC015C/Authorisation[1]/referenceNumber</errorPointer>
          <errorCode>13</errorCode>
          <errorReason>Value of an element in a message is outside the predefined set of values or not part of the applicable business</errorReason>
          <!--Optional:-->
          <originalAttributeValue>string</originalAttributeValue>
        </FunctionalError>
        <FunctionalError>
          <errorPointer>/CC015C/Authorisation[1]/referenceNumber</errorPointer>
          <errorCode>14</errorCode>
          <errorReason>Value of an element in a message is outside the predefined set of values or not part of the applicable business</errorReason>
          <!--Optional:-->
          <originalAttributeValue>string</originalAttributeValue>
        </FunctionalError>
        <FunctionalError>
          <errorPointer>/CC015C/Authorisation[1]/referenceNumber</errorPointer>
          <errorCode>15</errorCode>
          <errorReason>Value of an element in a message is outside the predefined set of values or not part of the applicable business</errorReason>
          <!--Optional:-->
          <originalAttributeValue>string</originalAttributeValue>
        </FunctionalError>
        <FunctionalError>
          <errorPointer>/CC015C/Authorisation[1]/referenceNumber</errorPointer>
          <errorCode>26</errorCode>
          <errorReason>Value of an element in a message is outside the predefined set of values or not part of the applicable business</errorReason>
          <!--Optional:-->
          <originalAttributeValue>string</originalAttributeValue>
        </FunctionalError>
        <FunctionalError>
          <errorPointer>/CC015C/Authorisation[1]/referenceNumber</errorPointer>
          <errorCode>50</errorCode>
          <errorReason>Value of an element in a message is outside the predefined set of values or not part of the applicable business</errorReason>
          <!--Optional:-->
          <originalAttributeValue>string</originalAttributeValue>
        </FunctionalError>
        <FunctionalError>
          <errorPointer>/CC015C/Authorisation[1]/referenceNumber</errorPointer>
          <errorCode>51</errorCode>
          <errorReason>Value of an element in a message is outside the predefined set of values or not part of the applicable business</errorReason>
          <!--Optional:-->
          <originalAttributeValue>string</originalAttributeValue>
        </FunctionalError>
        <FunctionalError>
          <errorPointer>/CC015C/Authorisation[1]/referenceNumber</errorPointer>
          <errorCode>52</errorCode>
          <errorReason>Value of an element in a message is outside the predefined set of values or not part of the applicable business</errorReason>
          <!--Optional:-->
          <originalAttributeValue>string</originalAttributeValue>
        </FunctionalError>
        <FunctionalError>
          <errorPointer>/CC015C/Authorisation[1]/referenceNumber</errorPointer>
          <errorCode>90</errorCode>
          <errorReason>Value of an element in a message is outside the predefined set of values or not part of the applicable business</errorReason>
          <!--Optional:-->
          <originalAttributeValue>string</originalAttributeValue>
        </FunctionalError>
        <FunctionalError>
          <errorPointer>/CC015C/Authorisation[1]/referenceNumber</errorPointer>
          <errorCode>92</errorCode>
          <errorReason>Value of an element in a message is outside the predefined set of values or not part of the applicable business</errorReason>
          <!--Optional:-->
          <originalAttributeValue>string</originalAttributeValue>
        </FunctionalError>
      </ncts:CC056C>.mkString

    post(url, xmlStr, headers :+ ("X-Message-Type", "IE056"))
  }

  def insertRejectionMoreThan10Errors(): Unit = {
    val url = s"${TestConfiguration.url("manage-transit-movements-frontend")}/test-only/departure-inbound/${World.departureId}"

    val xmlStr =
      <ncts:CC056C PhaseID="NCTS5.0" xmlns:ncts="http://ncts.dgtaxud.ec">
        <messageSender>token</messageSender>
        <messageRecipient>token</messageRecipient>
        <preparationDateAndTime>2007-10-26T07:36:28</preparationDateAndTime>
        <messageIdentification>token</messageIdentification>
        <messageType>CC056C</messageType>
        <!--Optional:-->
        <correlationIdentifier>token</correlationIdentifier>
        <TransitOperation>
          <!--Optional:-->
          <LRN>string</LRN>
          <!--Optional:-->
          <MRN>string</MRN>
          <businessRejectionType>token</businessRejectionType>
          <rejectionDateAndTime>2014-06-09T16:15:04+01:00</rejectionDateAndTime>
          <rejectionCode>token</rejectionCode>
          <!--Optional:-->
          <rejectionReason>string</rejectionReason>
        </TransitOperation>
        <CustomsOfficeOfDeparture>
          <referenceNumber>stringst</referenceNumber>
        </CustomsOfficeOfDeparture>
        <HolderOfTheTransitProcedure>
          <!--Optional:-->
          <identificationNumber>string</identificationNumber>
          <!--Optional:-->
          <TIRHolderIdentificationNumber>string</TIRHolderIdentificationNumber>
          <!--Optional:-->
          <name>string</name>
          <!--Optional:-->
          <Address>
            <streetAndNumber>string</streetAndNumber>
            <!--Optional:-->
            <postcode>string</postcode>
            <city>string</city>
            <country>st</country>
          </Address>
        </HolderOfTheTransitProcedure>
        <!--Optional:-->
        <Representative>
          <identificationNumber>string</identificationNumber>
          <status>token</status>
        </Representative>
        <!--0 to 9999 repetitions:-->
        <FunctionalError>
          <errorPointer>/CC015C/Authorisation[1]/referenceNumber</errorPointer>
          <errorCode>12</errorCode>
          <errorReason>Value of an element in a message is outside the predefined set of values or not part of the applicable business</errorReason>
          <!--Optional:-->
          <originalAttributeValue>string</originalAttributeValue>
        </FunctionalError>
        <FunctionalError>
          <errorPointer>/CC015C/Authorisation[1]/referenceNumber</errorPointer>
          <errorCode>13</errorCode>
          <errorReason>Value of an element in a message is outside the predefined set of values or not part of the applicable business</errorReason>
          <!--Optional:-->
          <originalAttributeValue>string</originalAttributeValue>
        </FunctionalError>
        <FunctionalError>
          <errorPointer>/CC015C/Authorisation[1]/referenceNumber</errorPointer>
          <errorCode>14</errorCode>
          <errorReason>Value of an element in a message is outside the predefined set of values or not part of the applicable business</errorReason>
          <!--Optional:-->
          <originalAttributeValue>string</originalAttributeValue>
        </FunctionalError>
        <FunctionalError>
          <errorPointer>/CC015C/Authorisation[1]/referenceNumber</errorPointer>
          <errorCode>15</errorCode>
          <errorReason>Value of an element in a message is outside the predefined set of values or not part of the applicable business</errorReason>
          <!--Optional:-->
          <originalAttributeValue>string</originalAttributeValue>
        </FunctionalError>
        <FunctionalError>
          <errorPointer>/CC015C/Authorisation[1]/referenceNumber</errorPointer>
          <errorCode>26</errorCode>
          <errorReason>Value of an element in a message is outside the predefined set of values or not part of the applicable business</errorReason>
          <!--Optional:-->
          <originalAttributeValue>string</originalAttributeValue>
        </FunctionalError>
        <FunctionalError>
          <errorPointer>/CC015C/Authorisation[1]/referenceNumber</errorPointer>
          <errorCode>50</errorCode>
          <errorReason>Value of an element in a message is outside the predefined set of values or not part of the applicable business</errorReason>
          <!--Optional:-->
          <originalAttributeValue>string</originalAttributeValue>
        </FunctionalError>
        <FunctionalError>
          <errorPointer>/CC015C/Authorisation[1]/referenceNumber</errorPointer>
          <errorCode>51</errorCode>
          <errorReason>Value of an element in a message is outside the predefined set of values or not part of the applicable business</errorReason>
          <!--Optional:-->
          <originalAttributeValue>string</originalAttributeValue>
        </FunctionalError>
        <FunctionalError>
          <errorPointer>/CC015C/Authorisation[1]/referenceNumber</errorPointer>
          <errorCode>52</errorCode>
          <errorReason>Value of an element in a message is outside the predefined set of values or not part of the applicable business</errorReason>
          <!--Optional:-->
          <originalAttributeValue>string</originalAttributeValue>
        </FunctionalError>
        <FunctionalError>
          <errorPointer>/CC015C/Authorisation[1]/referenceNumber</errorPointer>
          <errorCode>90</errorCode>
          <errorReason>Value of an element in a message is outside the predefined set of values or not part of the applicable business</errorReason>
          <!--Optional:-->
          <originalAttributeValue>string</originalAttributeValue>
        </FunctionalError>
        <FunctionalError>
          <errorPointer>/CC015C/Authorisation[1]/referenceNumber</errorPointer>
          <errorCode>92</errorCode>
          <errorReason>Value of an element in a message is outside the predefined set of values or not part of the applicable business</errorReason>
          <!--Optional:-->
          <originalAttributeValue>string</originalAttributeValue>
        </FunctionalError>
        <FunctionalError>
          <errorPointer>/CC015C/Authorisation[1]/referenceNumber</errorPointer>
          <errorCode>93</errorCode>
          <errorReason>Value of an element in a message is outside the predefined set of values or not part of the applicable business</errorReason>
          <!--Optional:-->
          <originalAttributeValue>string</originalAttributeValue>
        </FunctionalError>
      </ncts:CC056C>.mkString

    post(url, xmlStr, headers :+ ("X-Message-Type", "IE056"))
  }
}
