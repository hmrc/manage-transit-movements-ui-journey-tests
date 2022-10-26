@arrivalE2e
Feature: End to end journey Arrival notification feature

  Background:
    Given I login with ID 12345678
    Then I am on the Manage Transit Movements Hub service
    Given I click on the Make an arrival notification link
    When I enter 21GB00014210026352 on the movement reference number page


#[CTCP-687] : Identification - Simplified -> ACE Authorisations type
#[CTCP-697] : Location of goods - Address [Z]
#[CTCP-698] : Incidents and Endorsements
#[CTCP-702] : Summary CYA
  Scenario: 01 - Simplified
 # Identification
    When I select GB on the arrival office of destination page
    And I enter GB123456789000 on the consignee eori tin page
    And I choose radio option Simplified on the procedure type page
    And I choose radio option ACE on the authorisations type page
    And I enter 1200014210026352 on the ACE authorisations reference number page
    And I submit on the CYA page
    Then I should have 1 authorisation on the authorisations add another page
    When I choose radio option No on the authorisations add another page
#Location Of goods [697]
    And I choose radio option Authorised place on the arrival location of goods type page
    And I choose radio option Address on the arrival location of goods identification page
    And I fill in address on the arrival location of goods address page
    And I choose radio option No on the arrival location of goods add contact page
#Incidents [CTCP-698]
    And I choose radio option Yes on the incidents add page
    And I select France on the incidents country page
    And I choose radio option 1 - The carrier on the incidents code page
    And I enter Test Incident Happened text on the incidents description page
#Endorsements [CTCP-698]
    And I choose radio option No on the incidents add endorsement page
    And I submit on the CYA page


@a11y
#[CTCP-687] : Identification - Simplified -> ACT Authorisations type
#[CTCP-697] : Location of goods - Eori Number [X]
#[CTCP-698] : Incidents and Endorsements
#[CTCP-702] : Summary CYA
  Scenario: 02 - Simplified
 # Identification
    When I select XI on the arrival office of destination page
    And I enter GB123456789000 on the consignee eori tin page
    And I choose radio option Simplified on the procedure type page
    And I choose radio option ACT on the authorisations type page
    And I enter 1200014210026352 on the ACT authorisations reference number page
    And I submit on the CYA page
    Then I should have 1 authorisation on the authorisations add another page
    When I choose radio option No on the authorisations add another page
#Location Of goods [697] Location of goods - X Eori Number
    And I choose radio option Authorised place on the arrival location of goods type page
    And I choose radio option EORI number on the arrival location of goods identification page
    And I enter GB123456789000 on the arrival location of goods eori tin page
    And I choose radio option Yes on the arrival location of goods add additional identifier page
    And I enter 1234 on the arrival location of goods additional identifier page
    And I choose radio option Yes on the arrival location of goods add contact page
    And I enter John Joe on the arrival location of goods contact page
    And I enter +44 2345 82 83 on the arrival location of goods contact telephone number page
#Incidents [CTCP-698]
    And I choose radio option Yes on the incidents add page
    And I select France on the incidents country page
    And I choose radio option 1 - The carrier on the incidents code page
    And I enter Test Incident Happened text on the incidents description page
#Endorsements [CTCP-698]
    And I choose radio option Yes on the incidents add endorsement page
    And I choose fill in the date on the incidents endorsement date page
    And I enter test data on the incidents endorsement authority page
    And I select France on the incidents endorsement country page
    And I enter Incident test data on the incidents endorsement location page
    And I submit on the CYA page


#[CTCP-687] : Identification - Normal
#[CTCP-697] : Location of goods - Coordinates [W]
#[CTCP-698] : Incidents and Endorsements
#[CTCP-702] : Summary CYA
  Scenario: 03 - Normal
 # Identification
    When I select GB on the arrival office of destination page
    And I enter GB123456789000 on the consignee eori tin page
    And I choose radio option Normal on the procedure type page
#Location Of goods [697]
    And I choose radio option Authorised place on the arrival location of goods type page
    And I choose radio option Coordinates on the arrival location of goods identification page
    And I enter 60.96622 and 50.96622 on the arrival location of goods coordinates page
    And I choose radio option No on the arrival location of goods add contact page
#Incidents [CTCP-698]
    And I choose radio option Yes on the incidents add page
    And I select France on the incidents country page
    And I choose radio option 1 - The carrier on the incidents code page
    And I enter Test Incident Happened text on the incidents description page
#Endorsements [CTCP-698]
    And I choose radio option No on the incidents add endorsement page
    And I submit on the CYA page
