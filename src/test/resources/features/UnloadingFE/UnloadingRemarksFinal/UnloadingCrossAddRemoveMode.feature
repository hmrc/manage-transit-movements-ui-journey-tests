@UnloadingCrossCheckFinal
Feature: Navigating to Pages from Cross-check declaration summary to all individual sections of pages

  Background:
    Given I login with ID 1234567890
    When I submit an IE007 Arrival Notification
    And I submit an IE043 Unloading Permission With Seals
    When I click on the View arrival notifications link on the 'Manage your transit movements' page
    And I click on the Make unloading remarks link for MRN 38VYQTYFU3T0KUTUM3 on the 'Arrival notifications' page
    And I choose radio option No on the 'Do you want to use the revised unloading procedure?' page
    Then I click the Continue button on the 'Unload the goods and note any discrepancies' page
    And I choose radio option fully on the 'Have you fully or partially unloaded the goods?' page
    And I fill in the date on the 'When were the goods unloaded?' page
    And I choose radio option Yes on the 'Are all the seal identification numbers or marks readable?' page
    And I choose radio option No on the 'Are any of the seals broken?' page
    And I choose radio option Yes on the 'Were there any discrepancies between the transit and unloading permission?' page


  Scenario: 01 - Unloading remarks - Consignment level Cross-check page add and remove journeys

    #Add/Remove Departure Means of Transport
    And I click the Add or remove departure means link for section Departure means of transport 1
    And I choose radio option Yes on the 'You have added 1 departure means of transport' page
    And I choose radio option Yes on the documents 'Do you want to add the type of identification for the departure means of transport?' page
    And I choose radio option IMO Ship Identification Number on the 'Which identification do you want to use for the departure means of transport?' page
    And I choose radio option Yes on the documents 'Do you want to add an identification number for this vehicle?' page
    And I enter identification number Identify1234 on 'What is the identification number for this vehicle?' page
    And I choose radio option Yes on the documents 'Do you want to add the registered country for this vehicle?' page
    And I select Germany - DE on the 'What country is this vehicle registered to?' page
    And I choose to click on the Remove link on the 'You have added 2 departure means of transport' page
    And I choose radio option Yes on the documents 'Are you sure you want to remove departure means of transport 1?' page
    And I choose radio option No on the 'You have added 1 departure means of transport' page


    #Add/Remove Transport Equipment
    And I click the Add or remove transport equipment link for section Transport equipment 1
    And I choose radio option Yes on the cross check 'You have added 1 transport equipment' page
    And I choose radio option Yes on the cross check 'Do you want to add a container identification number for the transport equipment?' page
    And I enter identification number Container1234 on 'What is the container identification number?' page
    And I choose radio option Yes on the cross check 'Do you want to add a seal for the transport equipment?' page
    And I enter identification number Seal1234 on 'What is the seal identification number?' page
    And I click Remove on 'You have added 1 seals to transport equipment 2' page
    And I choose radio option Yes on 'Are you sure you want to remove this seal from transport equipment 2?' page
    And I click radio option No on the 'You have added 0 seals to transport equipment 2' page
    And I choose radio option Yes on the cross check 'Do any items apply to this transport equipment?' page
    And I select 100 on the 'Which item does this transport equipment apply to?' page
    And I click Remove on 'You have applied 1 item to transport equipment 2' page
    And I choose radio option Yes on the 'Are you sure you want to remove this item from transport equipment 2?' page
    And I click radio option No on the 'You have applied 0 items to transport equipment 2' page
    And I choose to click on the Remove link on the 'You have added 2 transport equipment' page
    And I choose radio option Yes on the documents 'Are you sure you want to remove transport equipment 1?' page
    And I choose radio option No on the cross check 'You have added 1 transport equipment' page


      # Add/Remove Documents Flow
    And I click the Add or remove document link for section Document 1
    And I choose radio option Yes on the 'You have added 2 documents to all items' page
    And I Add Supporting - (C651) on the 'What type of document do you want to add?' page
    And I enter reference number ref1234 on 'What is the document’s reference number?' page
    And I choose radio option Yes on the documents 'Do you want to add any additional information for this document?' page
    And I enter additional information 12345 on documents 'Enter the additional information?' page
    And I choose to click on the Remove link on the 'You have added 3 documents to all items' page
    And I choose radio option Yes on the documents 'Are you sure you want to remove this document from all items?' page
    And I choose radio option No on the 'You have added 2 documents to all items' page

      # Add/Remove Additional reference Flow
    And I click the Add or remove additional reference link for section Additional reference 1
    And I click radio option Yes on the 'You have added 1 additional reference' page
    And I select Y023 - Consignee (AEO certificate number) on the 'What type of additional reference do you want to add?' page
    And I click radio option Yes on the 'Do you want to add an additional reference number?' page
    And I enter additional reference newRef999 on the 'What is the additional reference number?' page
    And I click the Remove link on the 'You have added 2 additional references' page
    And I click radio option Yes on the 'Are you sure you want to remove this additional reference?' page
    And I click radio option No on the 'You have added 1 additional reference' page

  Scenario: 02 - Unloading remarks - Item level Cross-check page add and remove journeys
  # House Consignment - Consignment Item
    Given I click the 'More details' link for house consignment 1 on the 'Enter the discrepancies between the transit movement and unloading permission' page
    And I should be on the 'House consignment 1' page
    And I click the Add or remove item link on house consignment for section Items 1
    And I click radio option Yes on the 'You have added 1 item for house consignment 1' page
    And I enter testing on the 'Enter the description of item 2 in house consignment 1' page
    And I choose radio option Yes on the 'Do you want to add the item’s gross weight?' page
    And enter number 741.56 on 'What is the gross weight of item 2 in house consignment 1?' page
    And I choose radio option Yes on the 'Do you want to add the item’s net weight?' page
    And I enter number 5681.22 on 'What is the net weight of item 2 in house consignment 1?' page
    And I choose radio option Yes on the 'Do you want to add a Customs Union and Statistics (CUS) code for the item?' page
    And I enter number 0018063-2 on 'What is the Customs Union and Statistics CUS code?' page
    And I choose radio option Yes on the 'Do you want to add a commodity code for the item?' page
    And I enter number 716812 on 'What is the commodity code for item 2 in house consignment 1?' page
    And I choose radio option Yes on the 'Do you want to add a combined nomenclature code for the item?' page
    And I enter number 84 on 'What is the combined nomenclature code for item 2 in house consignment 1?' page
    And I choose radio option Yes on the 'Do you want to add a document for the item?' page
    And I Add Supporting - (C651) on the 'What type of document do you want to add?' page
    And I enter reference number ref1234 on 'What is the document’s reference number?' page
    And I choose radio option Yes on the documents 'Do you want to add any additional information for this document?' page
    And I enter additional information 12345 on documents 'Enter the additional information?' page
    And I click Yes on house consignment document 'You have added 1 document to item 2 in house consignment 1' page
    And I Add Supporting - (C651) on the 'What type of document do you want to add?' page
    And I enter reference number ref1234 on 'What is the document’s reference number?' page
    And I choose radio option Yes on the documents 'Do you want to add any additional information for this document?' page
    And I enter additional information 12345 on documents 'Enter the additional information?' page
    And I click Remove on 'You have added 2 documents to item 2 in house consignment 1' page
    And I click radio option Yes on the 'Are you sure you want to remove this document from item 2 in house consignment 1?' page
    And I click No on house consignment document 'You have added 1 documents to item 2 in house consignment 1' page
    And I choose radio option Yes on the 'Do you want to add an additional reference for the item?' page
    And I select Y023 - Consignee (AEO certificate number) on the 'What type of additional reference do you want to add?' page
    And I click radio option Yes on the 'Do you want to add an additional reference number?' page
    And I enter additional reference newRef999 on the 'What is the additional reference number?' page
    And I click Yes on additional reference 'You have added 1 additional reference for item 2 in house consignment 1' page
    And I select Y023 - Consignee (AEO certificate number) on the 'What type of additional reference do you want to add?' page
    And I click radio option Yes on the 'Do you want to add an additional reference number?' page
    And I enter additional reference newRef999 on the 'What is the additional reference number?' page
    And I click Remove on the 'You have added 2 additional references for item 2 in house consignment 1' page
    And I click radio option Yes on the 'Are you sure you want to remove this additional reference?' page
    And I click No on additional reference 'You have added 1 additional reference for item 2 in house consignment 1' page
    And I choose radio option Yes on the 'Do you want to add a package for the item?' page
    And I select (AE) Aerosol on the 'What type of package are you using for the item?' page
    And I choose radio option Yes on the 'Do you want to add the quantity of this package?' page
    And I enter 2 on the 'How many of this package are you using?' page
    And I click radio option Yes on the 'Do you want to add a shipping mark?' page
    And I enter This is a description of the cargo 1 on the 'What is the shipping mark?' page
    And I click Yes on house consignment package 'You have added 1 type of package for item 2 in house consignment 1' page
    And I select (43) Bag, super bulk on the 'What type of package are you using for the item?' page
    And I choose radio option No on the 'Do you want to add the quantity of this package?' page
    And I click radio option No on the 'Do you want to add a shipping mark?' page
    And I click Remove on the house consignment package 'You have added 2 types of packages for item 2 in house consignment 1' page
    And I click radio option Yes on the 'Are you sure you want to remove this package from item 2 in house consignment 1?' page
    And I click No on house consignment package 'You have added 1 type of package for item 2 in house consignment 1' page
    And I click option Remove on the 'You have added 2 items for house consignment 1' page
    And I click radio option Yes on item 'Are you sure you want to remove item 1 from house consignment 1?' page
    And I click radio option No on the 'You have added 1 item for house consignment 1' page


  Scenario: 03 - Unloading remarks - Cross-check page add and remove House Consignment
    And I click the add or remove house consignment link
    And I click radio option Yes on the 'You have added 1 house consignment' page
    And I enter number 100 on 'What is the gross weight of House Consignment 2?' page
    ##Departure means of transport - Yes to adding
    And I choose radio option Yes on the 'Do you want to add a departure means of transport for house consignment 2?' page
    And I choose radio option IMO Ship Identification Number on the 'Which identification do you want to use for the departure means of transport?' page
    And I enter identification number Identify1234 on 'What is the identification number for this vehicle?' page
    And I select Germany - DE on the 'What country is this vehicle registered to?' page
    And I choose radio option No on the 'You have added 1 departure means of transport for house consignment 2' page
    And I choose radio option Yes on the 'Do you want to add any documents for house consignment 2?' page
    And I Add Supporting - (C651) on the 'What type of document do you want to add?' page
    And I enter reference number ref1234 on 'What is the document’s reference number?' page
    And I choose radio option Yes on the documents 'Do you want to add any additional information for this document?' page
    And I enter additional information 12345 on documents 'Enter the additional information?' page
    And I choose radio option No on the 'You have added 1 document to all items in house consignment 2' page
    And I choose radio option Yes on the 'Do you want to add an additional reference for house consignment 2?' page
    And I select Y023 - Consignee (AEO certificate number) on the 'What type of additional reference do you want to add?' page
    And I click radio option Yes on the 'Do you want to add an additional reference number?' page
    And I enter additional reference newRef999 on the 'What is the additional reference number?' page
    And I click radio option No on the 'You have added 1 additional reference for house consignment 2' page
    And I choose radio option No on the 'Do you want to add an item for house consignment 2?' page
    And I click the Remove link on the 'You have added 2 house consignments' page
    And I click radio option Yes on the 'Are you sure you want to remove house consignment 1?' page
    And I click radio option No on the 'You have added 1 house consignment' page