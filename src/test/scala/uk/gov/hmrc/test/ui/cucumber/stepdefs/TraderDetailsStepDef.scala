/*
 * Copyright 2022 HM Revenue & Customs
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

import uk.gov.hmrc.test.ui.pages.TraderDetails.TransitHolder.{HolderAddressPage, HolderEORINumberPage, IsHolderEORIKnownPage}
import uk.gov.hmrc.test.ui.pages.TraderDetails.{ActingAsRepresentativePage, AddHolderContactNamePage, AddHolderContactPersonPage, AddHolderContactPhoneNumberPage, ConsigneeAddressPage, ConsigneeEoriPage, ConsigneeNamePage, HolderNamePage, IsConsigneeEoriKnownPage, MoreThanOneConsigneePage, SetReducedDataSetIndicatorPage}

class TraderDetailsStepDef extends BaseStepDef {

  And("""^(?:I )?choose radio option (.*) on the is eori known type page$""") { (answer: String) =>
    IsHolderEORIKnownPage.loadPage
    IsHolderEORIKnownPage.selectIsHolderEORIKnown(answer)
    IsHolderEORIKnownPage.submitPage()
  }

  And("""^(?:I )?enter (.+) on the holder eori number page$""") { (answer: String) =>
    HolderEORINumberPage.loadPage
    HolderEORINumberPage.enterHolderEori(answer)
    HolderEORINumberPage.submitPage();
  }

  And("""^(?:I )?enter (.+) on the holder name page$""") { (answer: String) =>
    HolderNamePage.loadPage
    HolderNamePage.enterHolderName(answer)
    HolderNamePage.submitPage();
  }

  And("""^(?:I )?fill in the holder address page$""") { () =>
    HolderAddressPage.loadPage
    HolderAddressPage.enterHolderAddress;
    HolderAddressPage.submitPage()
  }

  //Transit holder contact person

  And("""^(?:I )?choose radio option (.*) on the add contact page$""") { (answer: String) =>
    AddHolderContactPersonPage.loadPage
    AddHolderContactPersonPage.addContactPersonValue(answer)
    AddHolderContactPersonPage.submitPage();
  }

  And("""^(?:I )?enter (.+) on the holder's contact name page$""") { (answer: String) =>
    AddHolderContactNamePage.loadPage
    AddHolderContactNamePage.enterContactPersonNameValue(answer)
    AddHolderContactNamePage.submitPage();
  }

  And("""^(?:I )?enter (.+) on the holder's contact phone number page$""") { (answer: String) =>
    AddHolderContactPhoneNumberPage.loadPage
    AddHolderContactPhoneNumberPage.enterContactPersonTelephoneValue(answer)
    AddHolderContactPhoneNumberPage.submitPage();
  }

  //Representative

  And("""^(?:I )?choose radio option (.*) on the acting as representative page$""") { (answer: String) =>
    ActingAsRepresentativePage.loadPage
    ActingAsRepresentativePage.actingAsRepresentativeValue(answer)
    ActingAsRepresentativePage.submitPage();
  }

  //Approved operator - data set indicator
  Then("""^(?:I )?choose radio option (.*) on the approved operator page""") { (answer: String) =>
    SetReducedDataSetIndicatorPage.loadPage
    SetReducedDataSetIndicatorPage.setReducedDataSetIndicator(answer)
    SetReducedDataSetIndicatorPage.submitPage();
  }

  //Consignee
  And("""^(?:I )?choose radio option (.*) on the more than one consignee page$""") { (answer: String) =>
    MoreThanOneConsigneePage.loadPage
    MoreThanOneConsigneePage.enterIsThereMoreThanOneConsignee(answer)
    MoreThanOneConsigneePage.submitPage()
  }

  And("""^(?:I )?choose radio option (.*) on the is consignee eori known page$""") { (answer: String) =>
    IsConsigneeEoriKnownPage.loadPage
    IsConsigneeEoriKnownPage.enterDoYouKnowConsigneeEori(answer)
    IsConsigneeEoriKnownPage.submitPage()
  }

  And("""^(?:I )?enter (.+) on the consignee eori number page$""") { (answer: String) =>
    ConsigneeEoriPage.loadPage
    ConsigneeEoriPage.enterConsigneeEori(answer)
    ConsigneeEoriPage.submitPage()
  }

  And("""^(?:I )?enter (.+) on the consignee name page$""") { (answer: String) =>
    ConsigneeNamePage.loadPage
    ConsigneeNamePage.enterConsigneeName(answer)
    ConsigneeNamePage.submitPage()
  }

  And("""^(?:I )?fill in the consignee address page$""") { () =>
    ConsigneeAddressPage.loadPage
    ConsigneeAddressPage.enterConsigneeAddress
    ConsigneeAddressPage.submitPage()
  }

}
