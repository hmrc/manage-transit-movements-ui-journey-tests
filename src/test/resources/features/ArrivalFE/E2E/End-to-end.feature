@arrivalE2e

Feature: End to end journey Arrival notification feature

  Background:
    Given I login with ID 12345678
    Then I am on the Manage Transit Movements Hub service
    Given I click on the Make an arrival notification link
    When I enter 21GB00014210026352 on the movement reference number page


  Scenario: 01 - Simplified - Goods Location Id  'EORI Number' - Add additional Id 'Yes' - Add Contact 'Yes' -
  Add Incident 'Yes'- Incident Code '5' - Add Endorsement 'Yes' - Incident Location 'Address' - Add Another Incident 'No'
  #Identification
    When I select GB on the arrival office of destination page
    And I enter GB123456789000 on the consignee eori tin page
    And I choose radio option Simplified on the procedure type page
    And I choose radio option ACT on the authorisations type page
    And I enter 1200014210026352 on the ACT authorisations reference number page
    And I submit on the CYA page
    Then I should have 1 authorisation on the add another authorisation page
    When I choose radio option No on the add another authorisation page
  #Location Of goods - Location of goods - X Eori Number
    And I choose radio option Authorised place on the arrival location of goods type page
    And I choose radio option EORI number on the arrival location of goods identification page
    And I enter GB123456789000 on the arrival location of goods eori tin page
    And I choose radio option Yes on the arrival location of goods add additional identifier page
    And I enter 1234 on the arrival location of goods additional identifier page
    And I choose radio option Yes on the arrival location of goods add contact page
    And I enter John Joe on the arrival location of goods contact page
    And I enter +44 2345 82 83 on the arrival location of goods contact telephone number page
  #Incident
    And I choose radio option Yes on the add incident page
    And I select France on the incident country page
  #Incident code
    And I choose radio option 5 - The holder on the incident code page
    And I enter Test Incident Happened text on the incident description page
  #Endorsement
    And I choose radio option Yes on the add endorsement page
    And I choose fill in the date on the endorsement date page
    And I enter test data on the endorsement authority page
    And I select France on the endorsement country page
    And I enter Incident test data on the endorsement location page
  #Incidents Identify Location
    And I choose radio option Address on the incident identify location page
    And I fill in address on the incident address page
  #Add Another Incident
    And I choose radio option No on the Do you want to add another incident page
  #Goes to Summary CYA page when built
    And I submit on the CYA page


  Scenario: 02 - Normal - Goods Location Id  'Address' - Add Contact 'No' - Add Incident 'Yes'- Incident Code '4' -
  Add Endorsement 'No' - Incident Location 'UN/LOCODE' - Container Id 'Yes' - Add Seal 'Yes' x2 - Add Goods Item 'No' -
  Add Transport Equipment 'No' - Add Another Incident 'No'
  #Identification
    When I select GB on the arrival office of destination page
    And I enter GB123456789000 on the consignee eori tin page
    And I choose radio option Normal on the procedure type page
  #Location Of goods
    And I choose radio option Authorised place on the arrival location of goods type page
    And I choose radio option Address on the arrival location of goods identification page
    And I fill in address on the arrival location of goods address page
    And I choose radio option No on the arrival location of goods add contact page
  #Add Incident
    And I choose radio option Yes on the add incident page
    And I select France on the incident country page
  #Incident Code
    And I choose radio option 4 - The goods were partially on the incident code page
    And I enter Test Incident Happened text on the incident description page
  #Endorsement
    And I choose radio option No on the add endorsement page
  #Incident Identify Location
    And I choose radio option UN/LOCODE on the incident identify location page
    And I select Aalen on the incident un locode page
  #Container Identification Number
    And I choose radio option Yes on the add container identification number page
    And I enter C001 on the container identification number page
  #Add Container Seal
    And I choose radio option Yes for container identification number C001 on the add container seal page
    And I enter S001 for container identification number C001 on the container seal identification number page
    Then I should have 1 container seal added for container identification number C001 on the add another container seal page
  #Add Another Container Seal
    When I choose radio option Yes on the add another container seal page
    And I enter S002 for container identification number C001 on the container seal identification number page
    Then I should have 2 container seals added for container identification number C001 on the add another container seal page
    When I choose radio option No on the add another container seal page
  #Add Goods Item
    And I choose radio option Yes on the Do you want to add a goods item number page
    And I enter G001 on the What is the goods item number page
    And I choose radio option No on the Do you want to add another goods item number page
    And I choose radio option No on the Do you want to add any other transport equipment page
    #Add Another Incident
    And I choose radio option No on the Do you want to add another incident page
  #Goes to Summary CYA page when built
    And I submit on the CYA page


  @a11y
  Scenario: 03 - Simplified - Add Authorisation 'Yes' x2 - Goods Location Id  'Address' - Add contact 'No' - Add Incident 'Yes'- Incident Code '3' -
  Add Endorsement 'No' - (Container Id 'Yes' - Add Seal 'Yes' - Add Goods 'Yes') x2 - Remove Authorisation & Seal -
  Add Another Incident 'Yes'
  #Identification
    When I select XI on the arrival office of destination page
    And I enter GB123456789000 on the consignee eori tin page
    And I choose radio option Simplified on the procedure type page
    And I choose radio option ACE on the authorisations type page
    And I enter 1200014210026351 on the ACE authorisations reference number page
    And I submit on the CYA page
  #Add Authorisation
    Then I should have 1 authorisation on the add another authorisation page
    When I choose radio option Yes on the add another authorisation page
    And I choose radio option ACT on the authorisations type page
    And I enter 1200014210026352 on the ACT authorisations reference number page
    And I submit on the CYA page
    Then I should have 2 authorisations on the add another authorisation page
  #Remove Authorisation
    When I choose to click on Remove link on the add another authorisation page
    And I choose radio option Yes for the ACE authorisation 1200014210026351 on the remove authorisation page
    When I choose radio option No on the add another authorisation page
  #Location Of goods
    And I choose radio option Authorised place on the arrival location of goods type page
    And I choose radio option Address on the arrival location of goods identification page
    And I fill in address on the arrival location of goods address page
    And I choose radio option No on the arrival location of goods add contact page
  #Add Incident
    And I choose radio option Yes on the add incident page
    And I select France on the incident country page
  #Incident Code
    And I choose radio option 3 - The goods on the incident code page
    And I enter Hit an iceburg on the incident description page
  #Endorsement
    And I choose radio option No on the add endorsement page
  #Incident Identify Location
    And I choose radio option UN/LOCODE on the incident identify location page
    And I select Aalen on the incident un locode page
  #Add Container Indicator
    And I wait for 1000 seconds
    And I choose radio option Yes on the container indicator page
    And I enter C001 on the container identification number page
  #Add Container Seal
    And I choose radio option Yes for container identification number C001 on the add container seal page
    And I enter S001 for container identification number C001 on the container seal identification number page
    Then I should have 1 container seal added for container identification number C001 on the add another container seal page
  #Add Another Container Seal
    When I choose radio option Yes on the add another container seal page
    And I enter S002 for container identification number C001 on the container seal identification number page
    Then I should have 2 container seals added for container identification number C001 on the add another container seal page
  #Remove A Container Seal
    When I choose to click on Remove link on the add another container seal page
    And I choose radio option Yes for container seal identification number S001 on the remove seal page
    When I choose radio option No on the add another container seal page
  #Add Goods Item
    And I choose radio option Yes on the Do you want to add a goods item number page
    And I enter G001 on the What is the goods item number page
  #Add Another Goods Item
    And I choose radio option Yes on the Do you want to add another goods item number page
    And I enter G002 on the What is the goods item number page
    And I choose radio option No on the Do you want to add another goods item number page
  #Add Transport Equipment
    And I choose radio option Yes on the Do you want to add any other transport equipment page
  #Add Container Indicator - 2nd transport equipment iteration
    And I enter C002 on the container identification number page
  #Add Container Seal
    And I choose radio option Yes for container identification number C002 on the add container seal page
    And I enter S003 for container identification number C002 on the container seal identification number page
    Then I should have 1 container seal added for container identification number C002 on the add another container seal page
  #Add Another Container Seal
    When I choose radio option Yes on the add another container seal page
    And I enter S004 for container identification number C002 on the container seal identification number page
    Then I should have 2 container seals added for container identification number C002 on the add another container seal page
    When I choose radio option No on the add another container seal page
  #Add Goods Item
    And I choose radio option Yes on the Do you want to add a goods item number page
    And I enter G003 on the What is the goods item number page
  #Add Another Goods Item
    And I choose radio option Yes on the Do you want to add another goods item number page
    And I enter G004 on the What is the goods item number page
    And I choose radio option No on the Do you want to add another goods item number page
  #Add Transport Equipment
    And I choose radio option No on the Do you want to add any other transport equipment page
  #Type of Identification
    And I choose radio option Name of a sea-going vehicle on the Which type of identification do you want to use for the replacement means of transport page
    And I enter Titanic for the name of the sea-going vehicle on the What is the identification number for the replacement transport page
    And I select France on the What country is the replacement transport registered to page
  #Add Another Incident
    And I choose radio option Yes on the Do you want to add another incident page
  #Add Incident - 2nd iteration
    And I select Uruguay on the incident country page
  #Incident Code
    And I choose radio option 3 - The goods on the incident code page
    And I enter The ship sank on the incident description page
  #Endorsement
    And I choose radio option No on the add endorsement page
  #Incident Identify Location
    And I choose radio option UN/LOCODE on the incident identify location page
    And I select Aalen on the incident un locode page
  #Add Container Indicator
    And I choose radio option No on the container indicator page
  #Add Transport Equipment
    And I choose radio option No on the Do you want to add any other transport equipment page
  #Type of Identification
    And I choose radio option Name of a sea-going vehicle on the Which type of identification do you want to use for the replacement means of transport page
    And I enter Bismarck for the name of the sea-going vehicle on the What is the identification number for the replacement transport page
    And I select Uruguay on the What country is the replacement transport registered to page
  #Add Another Incident
    And I choose radio option No on the Do you want to add another incident page
  #Goes to Summary CYA page when built
    And I submit on the CYA page