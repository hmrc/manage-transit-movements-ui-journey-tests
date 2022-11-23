@arrival

Feature: Arrival notification feature

  Background:
    Given I login with ID 12345678
    Then I am on the Manage Transit Movements Hub service
    Given I click on the Make an arrival notification link
    And I enter 21GB00014210026352 on the movement reference number page


  Scenario: 01 - Normal - Goods Location Id  'Customs office' - Add Incident 'Yes' - Incident Code '1' - Add Endorsement 'Yes'
  #Identification
    When I select GB on the arrival office of destination page
    And I enter GB123456789000 on the consignee eori tin page
    And I choose radio option Normal on the procedure type page
  #Location Of goods
    And I choose radio option Authorised place on the arrival location of goods type page
    And I choose radio option Customs office identifier on the arrival location of goods identification page
    And I select GB on the arrival location of goods customs office identification page
  #Add Incident
    And I choose radio option Yes on the add incident page
    And I select France on the incident country page
  #Incident Code
    And I choose radio option 1 - The carrier on the incident code page
    And I enter Test Incident Happened text on the incident description page
  #Endorsement
    And I choose radio option Yes on the add endorsement page
    And I choose fill in the date on the endorsement date page
    And I enter test data on the endorsement authority page
    And I select France on the endorsement country page
    And I enter Incident test data on the endorsement location page
  #Incident Identify Location
    And I choose radio option Coordinates on the incident identify location page
    And I enter 50.96622 and 50.96622 on the incident coordinates page
  #Goes to Do you want to add another incident CTCP-701


  Scenario: 02 - Normal - Goods Location Id  'Customs office' - Add Incident 'Yes'- Incident Code '2' - Add Endorsement 'No' -
  Add Container 'Yes' - Add Goods Item 'No' - Add Transport Equipment 'No'
  #Identification
    When I select GB on the arrival office of destination page
    And I enter GB123456789000 on the consignee eori tin page
    And I choose radio option Normal on the procedure type page
  #Location Of goods
    And I choose radio option Authorised place on the arrival location of goods type page
    And I choose radio option Customs office identifier on the arrival location of goods identification page
    And I select GB on the arrival location of goods customs office identification page
  #Add Incident
    And I choose radio option Yes on the add incident page
    And I select France on the incident country page
  #Incident Code
    And I choose radio option 2 - The seals on the incident code page
    And I enter Test Incident Happened text on the incident description page
  #Endorsement
    And I choose radio option No on the add endorsement page
  #Incident Identify Location
    And I choose radio option Coordinates on the incident identify location page
    And I enter 50.96622 and 50.96622 on the incident coordinates page
  #Add Container
    And I choose radio option Yes on the add container identification number page
    And I enter C001 on the container identification number page
  #Add Seal
    When I enter S001 for container identification number C001 on the container seal identification number page
    Then I should have 1 container seal added for container identification number C001 on the add another container seal page
    When I choose radio option No on the add another container seal page
  #Add Goods Item
    And I choose radio option No on the Do you want to add a goods item number page
    Then I submit on the CYA page
  #Add Transport Equipment
    When I choose radio option No on the You have added 1 transport equipment page
  #Goes to Do you want to add another incident CTCP-701


  Scenario: 03 - Simplified - Add Authorisation 'Yes' x2 - Goods Location Id  'Address' - Add contact 'No' - Add Incident 'Yes'- Incident Code '3' -
  Add Endorsement 'No' - (Container Id 'Yes' - Add Seal 'Yes' - Add Goods 'Yes') x2 - Remove 'Authorisation, Seal, Goods & Equipment' -
  Change 'Good & Equipment'
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
    Then I choose radio option No on the add another authorisation page
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
    And I enter Test Incident Happened text on the incident description page
  #Endorsement
    And I choose radio option No on the add endorsement page
  #Incident Identify Location
    And I choose radio option UN/LOCODE on the incident identify location page
    And I select Aalen on the incident un locode page
  #Add Container Indicator
    When I choose radio option Yes on the container indicator page
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
    When I click the Remove link on the add another container seal page
    And I click radio option Yes for container seal identification number S001 on the remove seal page
    Then I choose radio option No on the add another container seal page
  #Add Goods Item
    When I choose radio option Yes on the Do you want to add a goods item number page
    And I enter 00001 on the What is the goods item number page
  #Add Another Goods Item
    When I choose radio option Yes on the You have added 1 goods item number page
    And I enter 00002 on the What is the goods item number page
    And I choose radio option No on the You have added 2 goods item numbers page
    Then I submit on the CYA page
  #Add Transport Equipment
    When I choose radio option Yes on the You have added 1 transport equipment page
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
    And I enter 00003 on the What is the goods item number page
  #Add Another Goods Item
    And I choose radio option Yes on the You have added 1 goods item number page
    And I enter 00004 on the What is the goods item number page
  #Change Goods Item
    When I click the Change link on the You have added 2 goods item numbers page
    Then I enter 00005 on the What is the goods item number page
  #Remove Goods Item
    When I click the Remove link on the You have added 2 goods item numbers page
    And I click radio option Yes on the Are you sure you want to remove goods item number 00005 page
    And I choose radio option No on the You have added 1 goods item number page
    Then I submit on the CYA page
  #Change Transport Equipment
    When I click the Change link on the You have added 2 transport equipment page
    And I click the change link for Container identification number on the CYA page
    And I enter C003 on the container identification number page
    Then I submit on the CYA page
  #Remove Transport Equipment
    When I click the Remove link on the You have added 2 transport equipment page
    And I click radio option Yes on the Are you sure you want to remove transport equipment 2 page
    And I choose radio option No on the You have added 1 transport equipment page
  #Goes to Type of Identification CTCP-701 then choose 'Yes' to iterate another incident


  Scenario: 04 - Simplified - Goods Location Id  'Address' - Add Contact 'No' - Add Incident 'Yes'- Incident Code '4' -
  Add Endorsement 'No' - Incident Location 'UN/LOCODE' - Container Id 'Yes' - Add Seal 'Yes' x2 - Add Goods Item 'No' -
  Add Transport Equipment 'No'
  # Identification
    When I select XI on the arrival office of destination page
    And I enter GB123456789000 on the consignee eori tin page
    And I choose radio option Simplified on the procedure type page
    And I choose radio option ACE on the authorisations type page
    And I enter 1200014210026352 on the ACE authorisations reference number page
    Then I submit on the CYA page
    When I should have 1 authorisation on the add another authorisation page
    And I choose radio option No on the add another authorisation page
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
    And I enter 00001 on the What is the goods item number page
    And I choose radio option No on the You have added 1 goods item number page
    Then I submit on the CYA page
    And I choose radio option No on the You have added 1 transport equipment page
  #Goes to Do you want to add another incident CTCP-701


  Scenario: 05 - Simplified - Goods Location Id  'EORI Number' - Add additional Id 'Yes' - Add Contact 'Yes' -
  Add Incident 'Yes'- Incident Code '5' - Add Endorsement 'Yes' - Incident Location 'Address'
  #Identification
    When I select GB on the arrival office of destination page
    And I enter GB123456789000 on the consignee eori tin page
    And I choose radio option Simplified on the procedure type page
    And I choose radio option ACT on the authorisations type page
    And I enter 1200014210026352 on the ACT authorisations reference number page
    Then I submit on the CYA page
    And I should have 1 authorisation on the add another authorisation page
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
  #Goes to Do you want to add another incident CTCP-701


  Scenario: 06 - Normal - Goods Location Id  'Coordinates' - Add Incident 'Yes' - Incident code '6' -
  Endorsement 'No' - Incident Location 'Address'
  # Identification
    When I select GB on the arrival office of destination page
    And I enter GB123456789000 on the consignee eori tin page
    And I choose radio option Normal on the procedure type page
  #Location Of goods
    And I choose radio option Authorised place on the arrival location of goods type page
    And I choose radio option Coordinates on the arrival location of goods identification page
    And I enter 50.96622 and 50.96622 on the arrival location of goods coordinates page
    And I choose radio option No on the arrival location of goods add contact page
  #Add Incident
    And I choose radio option Yes on the add incident page
    And I select France on the incident country page
  #Incident Code
    And I choose radio option 6 - The means on the incident code page
    And I enter Test Incident Happened text on the incident description page
  #Endorsements
    And I choose radio option No on the add endorsement page
  #Incidents Identify Location
    And I choose radio option Address on the incident identify location page
    And I fill in address on the incident address page
  #Add Container Indicator
    And I choose radio option No on the container indicator page
    And I choose radio option Yes on the add transport equipment page
    And I choose radio option No on the add container identification number page
  #Add Container Seal
    And I enter S001 on the What is the seal identification number page
    And I should have 1 seal added on the add another seal page
    When I choose radio option No on the add another container seal page
  #Add Goods Item
    And I choose radio option No on the Do you want to add a goods item number page
    Then I submit on the CYA page
  #Add Transport Equipment
    And I choose radio option No on the You have added 1 transport equipment page
  #Goes to Type of Identification CTCP-701 then choose 'No' for another incident to go to Summary CYA page


  Scenario: 07 - Normal - Goods id location 'UN/LOCODE' - Add Contact 'No' - Add Incident 'No'
  # Identification
    When I select XI on the arrival office of destination page
    And I enter GB123456789000 on the consignee eori tin page
    And I choose radio option Normal on the procedure type page
  #Location Of goods
    And I choose radio option Authorised place on the arrival location of goods type page
    And I choose radio option UN/LOCODE on the arrival location of goods identification page
    And I select Aalen on the arrival location of goods customs un locode page
    And I choose radio option No on the arrival location of goods add contact page
  #Add Incident
    And I choose radio option No on the add incident page
  #This goes to the Summary CYA page for Arrivals when built
