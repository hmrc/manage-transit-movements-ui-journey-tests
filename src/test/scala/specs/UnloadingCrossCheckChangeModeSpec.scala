import org.scalatest.matchers.should.Matchers

import org.scalatest.GivenWhenThen
import org.scalatest.featurespec.AnyFeatureSpec



class UnloadingCrossCheckChangeModeSpec extends AnyFeatureSpec with GivenWhenThen {

  Feature("Navigating to Pages from Cross-check declaration summary to all individual sections of pages") {

    Scenario("01 - Unloading remarks - Consignment level Cross-check page in change mode") {
      And("I should be on the Enter the discrepancies between the transit movement and unloading permission page")
      And("I click the Departure means identification type Change link for section Departure means of transport 1")
      And("I choose radio option Name of the sea-going vessel on the Which identification do you want to use for the new departure means of transport? page")
      And("I click the Departure identification number Change link for section Departure means of transport 1")
      And("I enter identification number info1234 on the What is the identification number for the new departure means of transport? page")
      And("I click the Departure registered country Change link for section Departure means of transport 1")
      And("I select Germany - DE on the What country is the new departure means of transport registered to? page")
      And("I click the Container identification number Change link for section Transport equipment 1")
      And("I enter identification number NewContainer1234 on What is the new container identification number? page")
      And("I click the Change seal1 link for sub-section Seals of section Transport equipment 1")
      And("I enter seal identification number Seal1234 on the What is the new seal identification number? page")
      And("I click the Change item1 link for sub-section Items applied of section Transport equipment 1")
      And("I select 1 on the Which item does this transport equipment apply to? page")
      And("I click the Document type Change link for section Document 1")
      And("I select Supporting - (C641) Dissostichus on the What is the new document type? page")
      And("I click the Document reference number Change link for section Document 1")
      And("I enter reference number ref1234 on the What is the document’s new reference number? page")
      And("I click the Document additional information Change link for section Document 1")
      And("I enter additional information 1234 on the Enter the new additional information? page")
      And("I click the Additional reference type Change link for section Additional reference 1")
      And("I select Y023 - Consignee (AEO certificate number) on the What is the new additional reference type? page")
      And("I click the Additional reference number Change link for section Additional reference 1")
      And("I enter additional reference additionalRef123 on the What is the new additional reference number? page")
    }

    Scenario("02 - Unloading remarks - Item level Cross-check page in change mode") {
      Given("I click the More details link for house consignment 1 on the Enter the discrepancies between the transit movement and unloading permission page")
      And("I should be on the House consignment 1 page")
      And("I click the Change Gross weight link for Item 1 in House consignment 1")
      And("enter number 741.56 on What is the new gross weight of item 1 in house consignment 1? page")
      And("I click the Remove Gross weight link for Item 1 in House consignment 1")
      And("I choose radio option Yes on the Are you sure you want to remove the gross weight from item 1 in house consignment 1? page")
      And("I click the Change Net weight link for Item 1 in House consignment 1")
      And("I enter number 5681.22 on What is the new net weight of item 1 in house consignment 1? page")
      And("I click the Remove Net weight link for Item 1 in House consignment 1")
      And("I choose radio option Yes on the Are you sure you want to remove the net weight from item 1 in house consignment 1? page")
      And("I click the Change Cus code link for Item 1 in House consignment 1")
      And("I enter number 0010003-8 on What is the new Customs Union and Statistics CUS code for item 1 in house consignment 1? page")
      And("I click the Change Commodity code link for Item 1 in House consignment 1")
      And("I enter number 010130 on What is the new commodity code for item 1 in house consignment 1? page")
      And("I click the Remove Commodity code link for Item 1 in House consignment 1")
      And("I choose radio option Yes on the Are you sure you want to remove the commodity code from item 1 in house consignment 1? page")
      And("I click the Change Nomenclature code link for Item 1 in House consignment 1")
      And("I enter number 84 on What is the new combined nomenclature code for item 1 in house consignment 1? page")
      And("I click the Remove Nomenclature code link for Item 1 in House consignment 1")
      And("I choose radio option Yes on the Are you sure you want to remove the combined nomenclature code from item 1 in house consignment 1? page")
      And("I click the Change additional reference Type link in House consignment 1 sub-section Additional reference 1 of section Item 1")
      And("I select Y023 - Consignee (AEO certificate number) on the What is the new additional reference type for item 1 in house consignment 1? page")
      And("I click the Change additional reference number link in House consignment 1 sub-section Additional reference 1 of section Item 1")
      And("I enter additional reference NewReference323 on the What is the new additional reference number for item 1 in house consignment 1? page")
      And("I click the Change package type link in House consignment 1 sub-section Packages of section Item 1")
      And("I select (BG) Bag on the What is the new package type for item 1 in house consignment 1? page")
      And("I click the Change package quantity link in House consignment 1 sub-section Packages of section Item 1")
      And("I enter 150 on the How many of this package are you using for item 1 in house consignment 1? page")
      And("I click the Change shipping mark link in House consignment 1 sub-section Packages of section Item 1")
      And("I enter shipping mark abc on the What is the new shipping mark for item 1 in house consignment 1? page")
    }
  }
}
