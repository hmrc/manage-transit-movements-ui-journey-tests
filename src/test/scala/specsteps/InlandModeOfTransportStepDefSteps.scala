/*
 * Copyright 2026 HM Revenue & Customs
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

import uk.gov.hmrc.test.ui.cucumber.stepdefs.BaseStepDef
import uk.gov.hmrc.test.ui.pages.Departures.Transport.BorderMeansOfTransport.{AddAnotherDepartureMeansOfTransportPage, AddNewBorderModeOfTransportPage, RemoveDepartureMeansOfTransportPage}
import uk.gov.hmrc.test.ui.pages.Departures.Transport.InlandModeOfTransport.*

object InlandModeOfTransportStepDefSteps {

  // ^(?:I )?choose radio option (.*) on the 'Which inland mode of transport are you using\?' page$
  def andIchooseRadioOptionXOnTheWhichInlandModeOfTransportAreYouUsingPage(answer: String): Unit =
    InlandModeOfTransportPage
      .loadPage()
      .select(answer)
      .submitPage()

  // ^(?:I )?choose radio option (.*) on the inland mode 'Which identification do you want to use for this vehicle\?' page$
  def andIchooseRadioOptionXOnTheInlandModeWhichIdentificationDoYouWantToUseForThisVehiclePage(answer: String): Unit =
    TransportIdentificationPage
      .loadPage()
      .select(answer)
      .submitPage()

  // ^(?:I )?enter registration number (.+) on the 'What is the identification number for this\?' page$
  def andIenterRegistrationNumberOnTheWhatIsTheIdentificationNumberForThisPage(answer: String): Unit =
    IdentificationNumberPage
      .loadPage()
      .fillInput(answer)
      .submitPage()

  // ^(?:I )?select (.+) on the inland mode 'What country is this vehicle registered to\?' page$
  def andIselectOnTheInlandModeWhatCountryIsThisVehicleRegisteredToPage(answer: String): Unit =
    TransportCountryPage
      .loadPage()
      .select(answer)
      .submitPage()

  // ^(?:I )?choose radio option (.*) on 'Do you want to add a border mode of transport\?' page$
  def andIchooseRadioOptionXOnDoYouWantToAddABorderModeOfTransportPage(answer: String): Unit =
    AddNewBorderModeOfTransportPage
      .loadPage()
      .select(answer)
      .submitPage()

  // ^(?:I )?choose radio option (.*) on the departure means '(.*)' page$
  def andIchooseRadioOptionXOnTheDepartureMeansXPage(answer: String, pageTitle: String): Unit =
    AddVehicleIdentificationInlandModeOfTransport
      .loadPage(pageTitle)
      .select(answer)
      .submitPage()

  // ^(?:I )?select radio option (.*) on the 'You have added (.+) departure means of transport?' page$
  def andIselectRadioOptionXOnTheYouHaveAddedDepartureMeansOfTransportPage(
    answer: String,
    numberOfDepartureMeans: String
  ): Unit =
    AddAnotherDepartureMeansOfTransportPage
      .loadPage(numberOfDepartureMeans)
      .select(answer)
      .submitPage()

  // ^(?:I )?choose to click on the (.*) link on the You have added (.+) departure means of transport' page$
  def whenIchooseToClickOnTheXLinkOnTheYouHaveAddedDepartureMeansOfTransportPage(
    sectionLink: String,
    numberOfDepartureMeans: String
  ): Unit =
    AddAnotherDepartureMeansOfTransportPage
      .loadPage(numberOfDepartureMeans)
      .clickByPartialLinkText(sectionLink)

  // ^(?:I )?choose radio option (.*) for the 'Are you sure you want to remove departure means of transport (.+)\?' page$
  def andIchooseRadioOptionXForTheAreYouSureYouWantToRemoveDepartureMeansOfTransportPage(
    answer: String,
    departureMeansNo: String
  ): Unit =
    RemoveDepartureMeansOfTransportPage
      .loadPage(departureMeansNo)
      .select(answer)
      .submitPage()

}
