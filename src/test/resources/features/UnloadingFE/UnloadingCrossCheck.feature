@wip
Feature: Navigating to Pages from Cross-check declaration summary to all individual sections of pages


  Scenario: 01 - Unloading remarks - Navigate to Cross check consignment page and hit change links for all sections with in consignment item
    Given I login with ID 1234567890
    When I submit an IE007 Arrival Notification
    And I submit an IE043 Unloading Permission With Seals
    Then I click on the View arrival notifications link on the 'Manage your transit movements' page
    And I click on the Make unloading remarks link for MRN 38VYQTYFU3T0KUTUM3 on the 'Arrival notifications' page
    Then I click the Continue button on the 'Unload the goods before you make unloading remarks' page
    And I choose radio option fully on the 'Have you fully or partially unloaded the goods?' page
    And I fill in the date on the 'When were the goods unloaded?' page
    And I choose radio option Yes on the 'Are all the seal identification numbers or marks readable?' page
    And I choose radio option No on the 'Are any of the seals broken?' page

# Documents Section
    And I click the 'Documents' link for Documents 1 on the 'Cross-check the transit with this declaration summary' page
    And I click the Change link for document type 1 on the 'Cross-check the transit with this declaration summary' page
    And I select Supporting - (C641) Dissostichus on the 'What is the new document type?' page
    And I click the 'Documents' link for Documents 1 on the 'Cross-check the transit with this declaration summary' page
    And I click the Change link for document reference number 1 on the 'Cross-check the transit with this declaration summary' page
    And I enter reference number ref1234 on 'What is the document’s new reference number?' page
    And I click the 'Documents' link for Documents 1 on the 'Cross-check the transit with this declaration summary' page
    And I click the Change link for document additional information 1 on the 'Cross-check the transit with this declaration summary' page
    And I enter additional information 1234 on 'Enter the new additional information?' page

#Add/Remove Documents Flow
    And I click the 'Documents' link for Documents 1 on the 'Cross-check the transit with this declaration summary' page
    And I click the link add-remove-documents on the 'Cross-check the transit with this declaration summary' page
    And I choose radio option Yes on the 'You have added 2 documents to all items' page
    And I Add Supporting - (C651) on the 'What type of document do you want to add?' page
    And I enter reference number ref1234 on 'What is the document’s reference number?' page
    And I choose radio option Yes on the documents 'Do you want to add any additional information for this document?' page
    And I enter additional information 12345 on documents 'Enter the additional information?' page
    And I choose to click on the Remove link on the 'You have added 3 documents to all items' page
    And I choose radio option Yes on the documents 'Are you sure you want to remove this document from all items?' page
    And I choose radio option No on the 'You have added 2 documents to all items' page

#Departure Means of Transport
    And I click the 'Departure means of transport' link for Departure means of transport 1 on the 'Cross-check the transit with this declaration summary' page
    And I click the Change link for transport means identification 1 on the 'Cross-check the transit with this declaration summary' page
    And I choose radio option Name of the sea-going vessel on the 'Which identification do you want to use for the new departure means of transport?' page
    And I click the 'Departure means of transport' link for Departure means of transport 1 on the 'Cross-check the transit with this declaration summary' page
    And I click the Change link for transport means identification number 1 on the 'Cross-check the transit with this declaration summary' page
    And I enter identification number info1234 on 'What is the identification number for the new departure means of transport?' page
    And I click the 'Departure means of transport' link for Departure means of transport 1 on the 'Cross-check the transit with this declaration summary' page
    And I click the Change link for registered country on the 'Cross-check the transit with this declaration summary' page
    And I select Germany - DE on the 'What country is the new departure means of transport registered to?' page

#Add/Remove Departure Means of Transport
    And I click the 'Departure means of transport' link for Departure means of transport 1 on the 'Cross-check the transit with this declaration summary' page
    And I click the link add-remove-departure-transport-means on the 'Cross-check the transit with this declaration summary' page
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

#Transport Equipment
    And I click the 'Transport equipment' link for Transport equipment 1 on the 'Cross-check the transit with this declaration summary' page
    And I click the Change link for container identification number 1 on the 'Cross-check the transit with this declaration summary' page
    And I enter identification number NewContainer1234 on 'What is the new container identification number?' page
    And I click the 'Transport equipment' link for Transport equipment 1 on the 'Cross-check the transit with this declaration summary' page
    And I click the link transport-equipment-1-seals on the 'Cross-check the transit with this declaration summary' page
    And I click the Change link for seal details 1 1 on the 'Cross-check the transit with this declaration summary' page
    And I enter seal identification number Seal1234 on 'What is the new seal identification number?' page
    And I click the 'Transport equipment' link for Transport equipment 1 on the 'Cross-check the transit with this declaration summary' page
    And I click the link transport-equipment-1-items on the 'Cross-check the transit with this declaration summary' page
    And I click the Change link for consignment item details 1 1 on the 'Cross-check the transit with this declaration summary' page
    And I select 100 on the 'Which item does this transport equipment apply to?' page

#Add/Remove Transport Equipment
    And I click the 'Transport equipment' link for Transport equipment 1 on the 'Cross-check the transit with this declaration summary' page
    And I click the link add-remove-transport-equipment on the 'Cross-check the transit with this declaration summary' page
    And I choose radio option Yes on the cross check 'You have added 1 transport equipment' page
    And I choose radio option Yes on the cross check 'Do you want to add a container identification number for the transport equipment?' page
    And I enter identification number Container1234 on 'What is the container identification number?' page
    And I choose radio option Yes on the cross check 'Do you want to add a seal for the transport equipment?' page
    And I enter identification number Seal1234 on 'What is the seal identification number?' page
    And I click Remove on 'You have added 1 seals to transport equipment 2' page
    And I choose radio option Yes on 'Are you sure you want to remove seal Seal1234 from transport equipment 2?' page
    And I click radio option No on the 'You have added 0 seals to transport equipment 2' page
    And I choose radio option Yes on the cross check 'Do any items apply to this transport equipment?' page
    And I select 100 on the 'Which item does this transport equipment apply to?' page
    And I click Remove on 'You have applied 1 item to transport equipment 2' page
    And I choose radio option Yes on the 'Are you sure you want to remove this item from transport equipment 2?' page
    And I click radio option No on the 'You have applied 0 items to transport equipment 2' page
    And I choose to click on the Remove link on the 'You have added 2 transport equipment' page
    And I choose radio option Yes on the documents 'Are you sure you want to remove transport equipment 1?' page
    And I choose radio option No on the cross check 'You have added 1 transport equipment' page

# House Consignment - Consignment Item
    And I click the 'More details' link for house consignment 1 on the 'Cross-check the transit with this declaration summary' page
    Given I click the 'Items' link for Items 1 on the 'Cross-check the transit with house consignment 1' page
    And I click the Change link for Gross Weight 1 on the 'Cross-check the transit with house consignment 1' page
    And enter number 741.56 on 'What is the new gross weight of item 1 in house consignment 1?' page
    Given I click the 'Items' link for Items 1 on the 'Cross-check the transit with house consignment 1' page
    And I click the Remove link for Gross Weight 1 on the 'Cross-check the transit with house consignment 1' page
    And I choose radio option Yes on the 'Are you sure you want to remove the gross weight from item 1 in house consignment 1?' page
    Given I click the 'Items' link for Items 1 on the 'Cross-check the transit with house consignment 1' page
    And I click the Change link for Net Weight 1 on the 'Cross-check the transit with house consignment 1' page
    And I enter number 5681.22 on 'What is the new net weight of item 1 in house consignment 1?' page
    Given I click the 'Items' link for Items 1 on the 'Cross-check the transit with house consignment 1' page
    And I click the Remove link for Net Weight 1 on the 'Cross-check the transit with house consignment 1' page
    And I choose radio option Yes on the 'Are you sure you want to remove the net weight from item 1 in house consignment 1?' page
    Given I click the 'Items' link for Items 1 on the 'Cross-check the transit with house consignment 1' page
    And I click the Change link for CUS Code 1 on the 'Cross-check the transit with house consignment 1' page
    And I enter number 0018063-2 on 'What is the new Customs Union and Statistics CUS code for item 1 in house consignment 1?' page
    Given I click the 'Items' link for Items 1 on the 'Cross-check the transit with house consignment 1' page
    And I click the Change link for Commodity Code 1 on the 'Cross-check the transit with house consignment 1' page
    And I enter number 716812 on 'What is the new commodity code for item 1 in house consignment 1?' page
    Given I click the 'Items' link for Items 1 on the 'Cross-check the transit with house consignment 1' page
    And I click the Remove link for Commodity Code 1 on the 'Cross-check the transit with house consignment 1' page
    And I choose radio option Yes on the 'Are you sure you want to remove the commodity code from item 1 in house consignment 1?' page
    Given I click the 'Items' link for Items 1 on the 'Cross-check the transit with house consignment 1' page
    And I click the Change link for Nomenclature Code 1 on the 'Cross-check the transit with house consignment 1' page
    And I enter number 84 on 'What is the new combined nomenclature code for item 1 in house consignment 1?' page
    Given I click the 'Items' link for Items 1 on the 'Cross-check the transit with house consignment 1' page
    And I click the Remove link for Nomenclature Code 1 on the 'Cross-check the transit with house consignment 1' page
    And I choose radio option Yes on the 'Are you sure you want to remove the combined nomenclature code from item 1 in house consignment 1?' page
    Given I click the 'Items' link for Items 1 on the 'Cross-check the transit with house consignment 1' page


































