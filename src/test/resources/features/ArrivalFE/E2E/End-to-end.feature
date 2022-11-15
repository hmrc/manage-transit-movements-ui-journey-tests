@arrivalE2e

Feature: End to end journey Arrival notification feature

  Background:
    Given I login with ID 12345678
    Then I am on the Manage Transit Movements Hub service
    Given I click on the Make an arrival notification link
    When I enter 21GB00014210026352 on the movement reference number page


  Scenario: 01 - GB - Normal - Postal Code - Incident Flag 'Yes' - Incident code (1) - Endorsement 'No'
  #Identification
    When I select GB on the arrival office of destination page
    And I enter GB123456789000 on the consignee eori tin page
    And I choose radio option Normal on the procedure type page
  #Location Of goods
    And I choose radio option Authorised place on the arrival location of goods type page
    And I choose radio option Postal code on the arrival location of goods identification page
    And I fill in address on the arrival location of goods postal code page
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
    And I choose radio option UN/LOCODE on the incident identify location page
    And I select Aalen on the incident un locode page
    And I submit on the CYA page


  @a11y
    @wip
  Scenario: 02 - XI - Simplified - ACT Authorisations - Goods Identification Location 'EORI id' - Add additional identifier 'Yes' - Add Contact 'Yes' - Incident Code '4' - Add Endorsement 'Yes'
  #Identification
    And I select XI on the arrival office of destination page
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
  #Add Additional Identifier
    And I choose radio option Yes on the arrival location of goods add additional identifier page
    And I enter 1234 on the arrival location of goods additional identifier page
  #Add Contact
    And I choose radio option Yes on the arrival location of goods add contact page
    And I enter John Joe on the arrival location of goods contact page
    And I enter +44 2345 82 83 on the arrival location of goods contact telephone number page
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
    And I choose radio option Yes for container identification number 12345 on the add container seal page
    And I enter 1 for container identification number 12345 on the container seal identification number page
    Then I should have 1 seal container added for container identification number 12345 on the add another container seal page
  #Add Another Container Seal
    When I choose radio option Yes on the add another container seal page
    And I enter 2 for container identification number 12345 on the container seal identification number page
    Then I should have 2 seals container added for container identification number 12345 on the add another container seal page
    When I choose radio option No on the add another container seal page
    Then I submit on the CYA page


  Scenario: 03 - XI - XI - Normal - Authorisation number - Incident Flag 'Yes' - Incident code (6) - Endorsement 'No'
  #Identification
    When I select XI on the arrival office of destination page
    And I enter GB123456789000 on the consignee eori tin page
    And I choose radio option Normal on the procedure type page
  #Location Of goods
    And I choose radio option Designated location on the arrival location of goods type page
    And I choose radio option Authorisation number on the arrival location of goods identification page
    And I enter 1234567890 on the arrival location of goods authorisation number page
    And I choose radio option No on the arrival location of goods add additional identifier page
    And I choose radio option No on the arrival location of goods add contact page
  #Add Incident
    And I choose radio option Yes on the add incident page
    And I select France on the incident country page
  #Incident code
    And I choose radio option 6 - The means on the incident code page
    And I enter Test Incident Happened text on the incident description page
  #Endorsement
    And I choose radio option No on the add endorsement page
  #Incident Identify Location
    And I choose radio option Coordinates on the incident identify location page
    And I enter 50.96622 and 50.96622 on the incident coordinates page
  #Container Indicator
    And I choose radio option No on the container indicator page
  #Add Transport Equipment
    And I choose radio option Yes on the add transport equipment page
  #Add Container Identification Number
    And I choose radio option Yes on the add container identification number page
    And I enter 12345 on the container identification number page
  #Add Container Seal
    And I choose radio option Yes for container identification number 12345 on the add container seal page
    And I enter 76545 for container identification number 12345 on the container seal identification number page
  #Add Another Container Seal
    Then I should have 1 seal container added for container identification number 12345 on the add another container seal page
    When I choose to click on Remove link on the add another container seal page
    And I choose radio option Yes for container identification number 76545 on the remove seal page
    And I choose radio option Yes for container identification number 12345 on the add container seal page
    And I enter 998877 for container identification number 12345 on the container seal identification number page
    Then I should have 1 seal container added for container identification number 12345 on the add another container seal page
    And I choose radio option No on the add another container seal page
    And I submit on the CYA page