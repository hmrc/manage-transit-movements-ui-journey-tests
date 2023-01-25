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

package uk.gov.hmrc.test.ui.cucumber.stepdefs.Departures.TraderDetails

import uk.gov.hmrc.test.ui.cucumber.stepdefs.BaseStepDef
import uk.gov.hmrc.test.ui.pages.Departures.TraderDetails.Consignee.{ConsigneeAddressPage, ConsigneeCountryPage, ConsigneeEoriNumberOrTinPage, ConsigneeNamePage, IsConsigneeEoriNumberOrTinKnownPage, MoreThanOneConsigneePage}
import uk.gov.hmrc.test.ui.pages.Departures.TraderDetails.Consignor.{AddConsignorContactNamePage, AddConsignorContactPersonPage, AddConsignorContactPhoneNumberPage, ConsignorAddressPage, ConsignorCountryPage, ConsignorEoriNumberOrTinPage, ConsignorNamePage, IsConsignorEoriNumberOrTinKnownPage}
import uk.gov.hmrc.test.ui.pages.Departures.TraderDetails.Representative.{ActingAsRepresentativePage, RepresentativeCapacityPage, RepresentativeEoriNumbeOrTinPage, RepresentativeNamePage, RepresentativePhoneNumberPage}
import uk.gov.hmrc.test.ui.pages.Departures.TraderDetails.SetReducedDataSetIndicatorPage
import uk.gov.hmrc.test.ui.pages.Departures.TraderDetails.TransitHolder.{AddHolderContactNamePage, AddHolderContactPersonPage, AddHolderContactPhoneNumberPage, HolderAddressPage, HolderCountryPage, HolderEoriNumberOrTinPage, HolderNamePage, IsHolderEoriKnownPage, IsTIRidKnownPage, TirHolderIdPage}

class TraderDetailsStepDef extends BaseStepDef {

  And("""^(?:I )?choose radio option (.*) on the 'Do you know the transit holder’s EORI number or TIN\?' page$""") {
    (answer: String) =>
      IsHolderEoriKnownPage
        .loadPage()
        .select(answer)
        .submitPage()
  }

  And("""^(?:I )?enter (.+) on the 'What is the transit holder’s EORI number or TIN\?' page$""") { (answer: String) =>
    HolderEoriNumberOrTinPage
      .loadPage()
      .fillInput(answer)
      .submitPage()
  }

  And("""^(?:I )?enter (.+) on the 'What is the transit holder’s name\?' page$""") { (answer: String) =>
    HolderNamePage
      .loadPage()
      .fillInput(answer)
      .submitPage()
  }

  And("""^(?:I )?select (.+) on the 'Which country is the transit holder based in\?' page$""") { (answer: String) =>
    HolderCountryPage
      .loadPage()
      .select(answer)
      .submitPage()
  }
  And("""^(?:I )?fill in the address on the 'What is the transit holder’s address\?' page$""") { () =>
    HolderAddressPage
      .loadPage()
      .fillInputs()
      .submitPage()
  }

  //Transit holder contact person

  And("""^(?:I )?choose radio option (.*) on the 'Do you want to add a contact\?' page$""") { (answer: String) =>
    AddHolderContactPersonPage
      .loadPage()
      .select(answer)
      .submitPage()
  }

  And("""^(?:I )?enter (.+) on the 'What is the contact’s name\?' page$""") { (answer: String) =>
    AddHolderContactNamePage
      .loadPage()
      .fillInput(answer)
      .submitPage()
  }

  And("""^(?:I )?enter (.+) on the 'What is the transit holder’s contact phone number\?' page$""") { (answer: String) =>
    AddHolderContactPhoneNumberPage
      .loadPage()
      .fillInput(answer)
      .submitPage()
  }

  //Representative

  And("""^(?:I )?choose radio option (.*) on the 'Are you acting as a representative\?' page$""") { (answer: String) =>
    ActingAsRepresentativePage
      .loadPage()
      .select(answer)
      .submitPage()
  }

  And("""^(?:I )?enter (.+) on the representative 'What is your EORI number or TIN\?' page$""") { (answer: String) =>
    RepresentativeEoriNumbeOrTinPage
      .loadPage()
      .fillInput(answer)
      .submitPage()
  }

  And("""^(?:I )?enter (.+) on the representative 'What is your name\?' page$""") { (answer: String) =>
    RepresentativeNamePage
      .loadPage()
      .fillInput(answer)
      .submitPage()
  }

  And("""^(?:I )?choose radio option (.*) on the representative 'What is your capacity\?' page$""") { (answer: String) =>
    RepresentativeCapacityPage
      .loadPage()
      .select(answer)
      .submitPage()
  }

  And("""^(?:I )?enter (.+) on the representative 'What is your phone number\?' page$""") { (answer: String) =>
    RepresentativePhoneNumberPage
      .loadPage()
      .fillInput(answer)
      .submitPage()
  }

  //Approved operator - data set indicator
  Then("""^(?:I )?choose radio option (.*) on the 'Do you want to use a reduced data set\?' page""") { (answer: String) =>
    SetReducedDataSetIndicatorPage
      .loadPage()
      .select(answer)
      .submitPage()
  }

  //Consignor
  And("""^(?:I )?choose radio option (.*) on the 'Is the TIR holder’s identification number known\?' page$""") { (answer: String) =>
    IsTIRidKnownPage
      .loadPage()
      .select(answer)
      .submitPage()
  }

  And("""^(?:I )?enter (.+) on the 'What is the TIR holder’s identification number\?' page$""") { (answer: String) =>
    TirHolderIdPage
      .loadPage()
      .fillInput(answer)
      .submitPage()
  }

  And("""^(?:I )?choose radio option (.*) on the 'Do you know the consignor’s EORI number or TIN\?' page$""") {
    (answer: String) =>
      IsConsignorEoriNumberOrTinKnownPage
        .loadPage()
        .select(answer)
        .submitPage()
  }

  And("""^(?:I )?enter (.+) on the 'What is the consignor’s EORI number or TIN\?' page$""") { (answer: String) =>
    ConsignorEoriNumberOrTinPage
      .loadPage()
      .fillInput(answer)
      .submitPage()
  }

  And("""^(?:I )?enter (.+) on the 'What is the consignor’s name\?' page$""") { (answer: String) =>
    ConsignorNamePage
      .loadPage()
      .fillInput(answer)
      .submitPage()
  }
  And("""^(?:I )?select (.+) on the 'Which country is the consignee based in\?' page$""") { (answer: String) =>
    ConsigneeCountryPage
      .loadPage()
      .select(answer)
      .submitPage()
  }
  And("""^(?:I )?fill in the address on the 'What is the consignor’s address\?' page$""") { () =>
    ConsignorAddressPage
      .loadPage()
      .fillInputs()
      .submitPage()
  }

  //Consignor contact
  And("""^(?:I )?choose radio option (.*) on the 'Do you want to add a contact for the consignor\?' page$""") {
    (answer: String) =>
      AddConsignorContactPersonPage
        .loadPage()
        .select(answer)
        .submitPage()
  }

  And("""^(?:I )?enter (.+) on the 'Who is the contact for the consignor\?' page$""") { (answer: String) =>
    AddConsignorContactNamePage
      .loadPage()
      .fillInput(answer)
      .submitPage()
  }

  And("""^(?:I )?enter (.+) on the 'What is the consignor contact’s phone number\?' page$""") { (answer: String) =>
    AddConsignorContactPhoneNumberPage
      .loadPage()
      .fillInput(answer)
      .submitPage()
  }

  //Consignee
  And("""^(?:I )?choose radio option (.*) on the 'Is there more than one consignee\?' page$""") { (answer: String) =>
    MoreThanOneConsigneePage
      .loadPage()
      .select(answer)
      .submitPage()
  }

  And("""^(?:I )?choose radio option (.*) on the 'Do you know the consignee’s EORI number or TIN\?' page$""") {
    (answer: String) =>
      IsConsigneeEoriNumberOrTinKnownPage
        .loadPage()
        .select(answer)
        .submitPage()
  }

  And("""^(?:I )?enter (.+) on the 'What is the consignee’s EORI number or TIN\?' page$""") { (answer: String) =>
    ConsigneeEoriNumberOrTinPage
      .loadPage()
      .fillInput(answer)
      .submitPage()
  }

  And("""^(?:I )?enter (.+) on the 'What is the consignee’s name\?' page$""") { (answer: String) =>
    ConsigneeNamePage
      .loadPage()
      .fillInput(answer)
      .submitPage()
  }

  And("""^(?:I )?select (.+) on the 'Which country is the consignor based in\?' page$""") { (answer: String) =>
    ConsignorCountryPage
      .loadPage()
      .select(answer)
      .submitPage()
  }

  And("""^(?:I )?fill in the address on the 'What is the consignee’s address\?' page$""") { () =>
    ConsigneeAddressPage
      .loadPage()
      .fillInputs()
      .submitPage()
  }

}
