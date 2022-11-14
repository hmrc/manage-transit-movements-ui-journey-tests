@arrival

Feature: Arrival notification feature

  Background:
    Given I login with ID 12345678
    Then I am on the Manage Transit Movements Hub service
    Given I click on the Make an arrival notification link
    And I enter 21GB00014210026352 on the movement reference number page


  Scenario: 01 - GB - Normal - Customs office identifier - Incident Flag 'Yes' - Incident Code '1' - Add Endorsement 'No'
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
    And I choose radio option No on the add endorsement page
  #Incident Identify Location
    And I choose radio option Coordinates on the incident identify location page
    And I enter 50.96622 and 50.96622 on the incident coordinates page
    And I submit on the CYA page


  Scenario: 02 - GB - Normal - Goods identification location 'Customs office identifier' - Incident Flag 'Yes'- Incident Code '2' - Add Endorsement 'Yes'  - Container Identification 'Yes'
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
    And I choose radio option Yes on the add endorsement page
    And I choose fill in the date on the endorsement date page
    And I enter test data on the endorsement authority page
    And I select France on the endorsement country page
    And I enter Incident test data on the endorsement location page
  #Incident Identify Location
    And I choose radio option Coordinates on the incident identify location page
    And I enter 50.96622 and 50.96622 on the incident coordinates page
    And I choose radio option Yes on the add container identification number page
    And I enter 12345 on the container identification number page
    And I enter 76545 for container identification number 12345 on the container seal identification number page
    Then I should have 1 seal container added for container identification number 12345 on the add another container seal page
    When I choose radio option No on the add another container seal page
    And I submit on the CYA page


  Scenario: 03 - Simplified - Goods identification location 'Address' - Add contact 'No' - Incident Flag 'Yes'- Incident Code '3' - Add Endorsement 'NO' - Container Identification 'Yes'
  # Identification
    When I select XI on the arrival office of destination page
    And I enter GB123456789000 on the consignee eori tin page
    And I choose radio option Simplified on the procedure type page
    And I choose radio option ACE on the authorisations type page
    And I enter 1200014210026352 on the ACE authorisations reference number page
    And I submit on the CYA page
    Then I should have 1 authorisation on the authorisations add another page
    When I choose radio option No on the authorisations add another page
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
  #Container Indicator
    And I choose radio option Yes on the container indicator page
    And I enter 12345 on the container identification number page
  #Add Container Seal
    And I choose radio option No for container identification number 12345 on the add container seal page
    And I submit on the CYA page


  Scenario: 04 - Simplified - Goods Identification location 'Address' - Add Contact 'No' -  Incident Flag 'Yes'- Incident Code '4' - Add Endorsement 'NO' - Container Identification 'Yes'
  # Identification
    When I select XI on the arrival office of destination page
    And I enter GB123456789000 on the consignee eori tin page
    And I choose radio option Simplified on the procedure type page
    And I choose radio option ACE on the authorisations type page
    And I enter 1200014210026352 on the ACE authorisations reference number page
    And I submit on the CYA page
    Then I should have 1 authorisation on the authorisations add another page
    When I choose radio option No on the authorisations add another page
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
    And I enter 12345 on the container identification number page
  #Add Container Seal
    And I choose radio option Yes as 12345 on the add container seal page
    And I enter 98765 for container identification number 12345 on the container seal identification number page
    Then I should have 1 seal container added for container identification number 12345 on the add another container seal page
  #Add Another Container Seal
    When I choose radio option Yes on the add another container seal page
    And I enter 56789 for container identification number 12345 on the container seal identification number page
    When I choose radio option No on the add another container seal page
    And I submit on the CYA page


  Scenario: 05 - Simplified - Goods identification Location 'EORI Number' - Add additional Identifier 'Yes' - Add Contact 'Yes' - Incident Flag 'Yes'- Incident Code '5' - Add Endorsement 'Yes'
  #Identification
    When I select GB on the arrival office of destination page
    And I enter GB123456789000 on the consignee eori tin page
    And I choose radio option Simplified on the procedure type page
    And I choose radio option ACT on the authorisations type page
    And I enter 1200014210026352 on the ACT authorisations reference number page
    And I submit on the CYA page
    Then I should have 1 authorisation on the authorisations add another page
    When I choose radio option No on the authorisations add another page
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
    And I submit on the CYA page



  Scenario: 06 - GB - Normal - Goods identification Location 'Coordinates' - Incident Flag 'Yes' - Incident code (1) - Endorsement 'No'
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
    And I choose radio option 1 - The carrier on the incident code page
    And I enter Test Incident Happened text on the incident description page
  #Endorsements
    And I choose radio option No on the add endorsement page
  #Incidents Identify Location
    And I choose radio option Address on the incident identify location page
    And I fill in address on the incident address page
    And I submit on the CYA page


  Scenario: 07 - XI - Normal - Goods identification Location 'UN/LOCODE' - Incident Flag 'Yes' - Incident code (1) - Endorsement 'No' - Incident Identify Location 'Address'
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
    And I choose radio option Yes on the add incident page
    And I select France on the incident country page
  #Incident Code
    And I choose radio option 1 - The carrier on the incident code page
    And I enter Test Incident Happened text on the incident description page
  #Endorsement
    And I choose radio option No on the add endorsement page
  #Incident Identify Location
    And I choose radio option Address on the incident identify location page
    And I fill in address on the incident address page
    And I submit on the CYA page