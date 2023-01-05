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

package uk.gov.hmrc.test.ui.cucumber.stepdefs

import uk.gov.hmrc.test.ui.pages.TraderDetails.Consignee._
import uk.gov.hmrc.test.ui.pages.TraderDetails.Consignor._
import uk.gov.hmrc.test.ui.pages.TraderDetails.Representative._
import uk.gov.hmrc.test.ui.pages.TraderDetails.SetReducedDataSetIndicatorPage
import uk.gov.hmrc.test.ui.pages.TraderDetails.TransitHolder._

class TraderDetailsStepDef extends BaseStepDef {

  And("""^(?:I )?choose radio option (.*) on the is eori known type page$""") { (answer: String) =>
    IsHolderEoriKnownPage
      .loadPage()
      .select(answer)
      .submitPage()
  }

  And("""^(?:I )?enter (.+) on the holder eori number or tin page$""") { (answer: String) =>
    HolderEoriNumberOrTinPage
      .loadPage()
      .fillInput(answer)
      .submitPage()
  }

  And("""^(?:I )?enter (.+) on the holder name page$""") { (answer: String) =>
    HolderNamePage
      .loadPage()
      .fillInput(answer)
      .submitPage()
  }

  And("""^(?:I )?select (.+) on the holder country page$""") { (answer: String) =>
    HolderCountryPage
      .loadPage()
      .select(answer)
      .submitPage()
  }
  And("""^(?:I )?fill in the holder address page$""") { () =>
    HolderAddressPage
      .loadPage()
      .fillInputs()
      .submitPage()
  }

  //Transit holder contact person

  And("""^(?:I )?choose radio option (.*) on the add contact page$""") { (answer: String) =>
    AddHolderContactPersonPage
      .loadPage()
      .select(answer)
      .submitPage()
  }

  And("""^(?:I )?enter (.+) on the holder's contact name page$""") { (answer: String) =>
    AddHolderContactNamePage
      .loadPage()
      .fillInput(answer)
      .submitPage()
  }

  And("""^(?:I )?enter (.+) on the holder's contact phone number page$""") { (answer: String) =>
    AddHolderContactPhoneNumberPage
      .loadPage()
      .fillInput(answer)
      .submitPage()
  }

  //Representative

  And("""^(?:I )?choose radio option (.*) on the acting as representative page$""") { (answer: String) =>
    ActingAsRepresentativePage
      .loadPage()
      .select(answer)
      .submitPage()
  }

  And("""^(?:I )?enter (.+) on the representative eori number or tin page$""") { (answer: String) =>
    RepresentativeEoriNumbeOrTinPage
      .loadPage()
      .fillInput(answer)
      .submitPage()
  }

  And("""^(?:I )?enter (.+) on the representative name page$""") { (answer: String) =>
    RepresentativeNamePage
      .loadPage()
      .fillInput(answer)
      .submitPage()
  }

  And("""^(?:I )?choose radio option (.*) on the representative capacity page$""") { (answer: String) =>
    RepresentativeCapacityPage
      .loadPage()
      .select(answer)
      .submitPage()
  }

  And("""^(?:I )?enter (.+) on the representative phone number page$""") { (answer: String) =>
    RepresentativePhoneNumberPage
      .loadPage()
      .fillInput(answer)
      .submitPage()
  }

  //Approved operator - data set indicator
  Then("""^(?:I )?choose radio option (.*) on the approved operator page""") { (answer: String) =>
    SetReducedDataSetIndicatorPage
      .loadPage()
      .select(answer)
      .submitPage()
  }

  //Consignor
  And("""^(?:I )?choose radio option (.*) on the is TIR id known type page$""") { (answer: String) =>
    IsTIRidKnownPage
      .loadPage()
      .select(answer)
      .submitPage()
  }

  And("""^(?:I )?enter (.+) on the TIR holder id page$""") { (answer: String) =>
    TirHolderIdPage
      .loadPage()
      .fillInput(answer)
      .submitPage()
  }

  And("""^(?:I )?choose radio option (.*) on the is consignor eori number or tin known page$""") { (answer: String) =>
    IsConsignorEoriNumberOrTinKnownPage
      .loadPage()
      .select(answer)
      .submitPage()
  }

  And("""^(?:I )?enter (.+) on the consignor eori number or tin page$""") { (answer: String) =>
    ConsignorEoriNumberOrTinPage
      .loadPage()
      .fillInput(answer)
      .submitPage()
  }

  And("""^(?:I )?enter (.+) on the consignor name page$""") { (answer: String) =>
    ConsignorNamePage
      .loadPage()
      .fillInput(answer)
      .submitPage()
  }
  And("""^(?:I )?select (.+) on the consignee country page$""") { (answer: String) =>
    ConsigneeCountryPage
      .loadPage()
      .select(answer)
      .submitPage()
  }
  And("""^(?:I )?fill in the consignor address page$""") { () =>
    ConsignorAddressPage
      .loadPage()
      .fillInputs()
      .submitPage()
  }

  //Consignor contact
  And("""^(?:I )?choose radio option (.*) on adding contact for consignor page$""") { (answer: String) =>
    AddConsignorContactPersonPage
      .loadPage()
      .select(answer)
      .submitPage()
  }

  And("""^(?:I )?enter (.+) on the consignor contact name page$""") { (answer: String) =>
    AddConsignorContactNamePage
      .loadPage()
      .fillInput(answer)
      .submitPage()
  }

  And("""^(?:I )?enter (.+) on the consignor contact number page$""") { (answer: String) =>
    AddConsignorContactPhoneNumberPage
      .loadPage()
      .fillInput(answer)
      .submitPage()
  }

  //Consignee
  And("""^(?:I )?choose radio option (.*) on the more than one consignee page$""") { (answer: String) =>
    MoreThanOneConsigneePage
      .loadPage()
      .select(answer)
      .submitPage()
  }

  And("""^(?:I )?choose radio option (.*) on the is consignee eori number or tin known page$""") { (answer: String) =>
    IsConsigneeEoriNumberOrTinKnownPage
      .loadPage()
      .select(answer)
      .submitPage()
  }

  And("""^(?:I )?enter (.+) on the consignee eori number or tin page$""") { (answer: String) =>
    ConsigneeEoriNumberOrTinPage
      .loadPage()
      .fillInput(answer)
      .submitPage()
  }

  And("""^(?:I )?enter (.+) on the consignee name page$""") { (answer: String) =>
    ConsigneeNamePage
      .loadPage()
      .fillInput(answer)
      .submitPage()
  }

  And("""^(?:I )?select (.+) on the consignor country page$""") { (answer: String) =>
    ConsignorCountryPage
      .loadPage()
      .select(answer)
      .submitPage()
  }

  And("""^(?:I )?fill in the consignee address page$""") { () =>
    ConsigneeAddressPage
      .loadPage()
      .fillInputs()
      .submitPage()
  }

}
