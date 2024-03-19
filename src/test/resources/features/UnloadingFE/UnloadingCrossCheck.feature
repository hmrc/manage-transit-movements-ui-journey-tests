@wip
Feature: Navigating to Pages from Cross-check the transit with this declaration summary


Scenario: 01 - Unloading remarks - Navigate the Cross check consignment page and hit change links for all sections with in consignment item
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
## docuements section
  And I click the 'Documents' link for Documents 1 on the 'Cross-check the transit with this declaration summary' page
  And I click the Change link for document type 1 on the 'Cross-check the transit with this declaration summary' page
  And I select Supporting - (C641) Dissostichus on the 'What is the new document type?' page
  And I click the 'Documents' link for Documents 1 on the 'Cross-check the transit with this declaration summary' page
  And I click the Change link for document reference number 1 on the 'Cross-check the transit with this declaration summary' page
  And I enter reference number ref1234 on 'What is the document’s new reference number?' page
  And I click the 'Documents' link for Documents 1 on the 'Cross-check the transit with this declaration summary' page
  And I click the Change link for document additional information 1 on the 'Cross-check the transit with this declaration summary' page
  And I enter additional information 1234 on 'Enter the new additional information?' page

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



