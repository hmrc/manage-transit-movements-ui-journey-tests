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

import uk.gov.hmrc.test.ui.pages.RouteDetails.LocationOfGoods._

class RouteLocationStepDef extends BaseStepDef {

  And("""^(?:I )?choose radio option (.*) on the add location of goods page$""") { (answer: String) =>
    AddLocationOfGoodsPage.loadPage
    AddLocationOfGoodsPage.selectAddLocationOfGoods(answer)
    AddLocationOfGoodsPage.submitPage()
  }

  And("""^(?:I )?choose radio option (.*) on the location of goods type page$""") { (answer: String) =>
    LocationOfGoodsTypePage.loadPage
    LocationOfGoodsTypePage.selectLocationOfGoodsType(answer)
    LocationOfGoodsTypePage.submitPage()
  }

  And("""^(?:I )?choose radio option (.*) on the location of goods identification page$""") { (answer: String) =>
    LocationOfGoodsIdentificationPage.loadPage
    LocationOfGoodsIdentificationPage.selectLocationOfGoodsIdentification(answer)
    LocationOfGoodsIdentificationPage.submitPage()
  }

  And("""^(?:I )?select (.+) on the location of goods customs office identification page$""") { (answer: String) =>
    LocationOfGoodsCustomsOfficeIdentificationPage.loadPage
    LocationOfGoodsCustomsOfficeIdentificationPage.selectValueFromDropDown(answer)
    LocationOfGoodsCustomsOfficeIdentificationPage.submitPage()
  }

  And("""^(?:I )?enter (.+) on the location of goods eori page$""") { (answer: String) =>
    LocationOfGoodsEoriPage.loadPage
    LocationOfGoodsEoriPage.enterEoriNumber(answer);
    LocationOfGoodsEoriPage.submitPage();
  }

  And("""^(?:I )?enter (.+) on the location of goods authorisation number page$""") { (answer: String) =>
    LocationOfGoodsAuthorisationNumberPage.loadPage
    LocationOfGoodsAuthorisationNumberPage.enterAuthorisationNumber(answer);
    LocationOfGoodsAuthorisationNumberPage.submitPage();
  }

  And("""^(?:I )?fill in address on the location of goods address page$""") { () =>
    LocationOfGoodsAddressPage.loadPage
    LocationOfGoodsAddressPage.enterLocationOfGoodsAddress;
    LocationOfGoodsAddressPage.submitPage()
  }

  And("""^(?:I )?select (.+) on the location of goods customs un locode page$""") { (answer: String) =>
    LocationOfGoodsUnLocodePage.loadPage
    LocationOfGoodsUnLocodePage.selectValueFromDropDown(answer)
    LocationOfGoodsUnLocodePage.submitPage()
  }

  And("""^(?:I )?choose radio option (.*) on the location of goods add identifier page$""") { (answer: String) =>
    LocationOfGoodsAddIdentificationPage.loadPage
    LocationOfGoodsAddIdentificationPage.selectLocationOfGoodsAddIdentification(answer)
    LocationOfGoodsAddIdentificationPage.submitPage()
  }

  And("""^(?:I )?enter (.+) on the location of goods additional identifier page$""") { (answer: String) =>
    LocationOfGoodsAdditionalIdentifierPage.loadPage
    LocationOfGoodsAdditionalIdentifierPage.enterLocationOfGoodsAdditionalIdentifierNumber(answer);
    LocationOfGoodsAdditionalIdentifierPage.submitPage();
  }

  And("""^(?:I )?choose radio option (.*) on the location of goods add contact page$""") { (answer: String) =>
    LocationOfGoodsAddContactPage.loadPage
    LocationOfGoodsAddContactPage.selectLocationOfGoodsAddContact(answer)
    LocationOfGoodsAddContactPage.submitPage()
  }

  And("""^(?:I )?enter (.+) and (.+) on the location of goods coordinates page$""") { (latitudeNo: String, longitudeNo: String) =>
    LocationOfGoodsCoordinatesPage.loadPage
    LocationOfGoodsCoordinatesPage.enterLocationOfGoodsCoordinates(latitudeNo, longitudeNo);
    LocationOfGoodsCoordinatesPage.submitPage();
  }

  And("""^(?:I )?fill in address on the location of goods postal code page$""") { () =>
    LocationOfGoodsPostalCodePage.loadPage
    LocationOfGoodsPostalCodePage.enterFirstLocationOfGoodsPostalCodeCountry;
    LocationOfGoodsPostalCodePage.submitPage()
  }

  And("""^(?:I )?enter (.+) on the location of goods contact page$""") { (answer: String) =>
    LocationOfGoodsContactPage.loadPage
    LocationOfGoodsContactPage.enterLocationOfGoodsContact(answer);
    LocationOfGoodsContactPage.submitPage();
  }

  And("""^(?:I )?enter (.+) on the location of goods contact telephone number page$""") { (answer: String) =>
    LocationOfGoodsContactTelephoneNumberPage.loadPage
    LocationOfGoodsContactTelephoneNumberPage.enterLocationOfGoodsContactTelephoneNumber(answer)
    LocationOfGoodsContactTelephoneNumberPage.submitPage()
  }
}