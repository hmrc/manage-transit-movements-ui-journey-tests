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
import uk.gov.hmrc.test.ui.pages.TraderDetails.{AddHolderContactNamePage, AddHolderContactPersonPage, AddHolderContactPhoneNumberPage, HolderNamePage}

class TraderDetailsStepDef extends BaseStepDef {

  And("""^(?:I )?choose radio option (.*) on the is eori known type page$""") { (answer: String) =>
    IsHolderEORIKnownPage.loadPage
    IsHolderEORIKnownPage.selectIsHolderEORIKnown(answer);
    IsHolderEORIKnownPage.submitPage()
  }

  And("""^(?:I )?enter (.+) on the holder eori number page$""") { (eori: String) =>
    HolderEORINumberPage.loadPage
    HolderEORINumberPage.enterHolderEori(eori);
    HolderEORINumberPage.submitPage();
  }

  And("""^(?:I )?enter (.+) on the holder name page$""") { (holderName: String) =>
    HolderNamePage.loadPage
    HolderNamePage.enterHolderName(holderName);
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
    AddHolderContactNamePage.enterContactPersonNameValue(answer);
    AddHolderContactNamePage.submitPage();
  }

  And("""^(?:I )?enter (.+) on the holder's contact phone number page$""") { (answer: String) =>
    AddHolderContactPhoneNumberPage.loadPage
    AddHolderContactPhoneNumberPage.enterContactPersonTelephoneValue(answer);
    AddHolderContactPhoneNumberPage.submitPage();
  }

}
