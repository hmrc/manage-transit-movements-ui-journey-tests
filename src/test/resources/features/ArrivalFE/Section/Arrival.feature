@arrival

Feature: Arrival notification feature

  Background:
    Given I login with ID 12345678
    Then I am on the Manage Transit Movements Hub service
    Given I click on the Make an arrival notification link
    And I enter 21GB00014210026352 on the movement reference number page



  #[CTCP-687] : Identification - Normal
  #[CTCP-697] : Location of goods - Customs office identifier [V]
  #[CTCP-698] : Incidents and Endorsements
  #[CTCP-699-700] : Incident location - Incident transport equipment and containers
  #[CTCP-702] : Summary CYA
  Scenario: 01 - Normal - Authorised place - Address id - No contact - Incident code 1 -
  No endorsements - Location id Coordinates
  #Identification
    When I select GB on the arrival office of destination page
    And I enter GB123456789000 on the consignee eori tin page
    And I choose radio option Normal on the procedure type page
  #Location Of goods
    And I choose radio option Authorised place on the arrival location of goods type page
    And I choose radio option Customs office identifier on the arrival location of goods identification page
    And I select GB on the arrival location of goods customs office identification page
  #Incidents
    And I choose radio option Yes on the incidents add page
    And I select France on the incidents country page
    And I choose radio option 1 - The carrier on the incidents code page
    And I enter Test Incident Happened text on the incidents description page
  #Endorsements
    And I choose radio option No on the incidents add endorsement page
  #Incidents Identify Location
    And I choose radio option Coordinates on the incident identify location page
    And I enter 50.96622 and 50.96622 on the incident coordinates page
    And I submit on the CYA page



  #[CTCP-687] : Identification - Simplified -> ACE Authorisations type
  #[CTCP-697] : Location of goods - Address [Z]
  #[CTCP-698] : Incidents and Endorsements
  #[CTCP-699-700] : Incident location -  Incident transport equipment and containers
  #[CTCP-702] : Summary CYA
  Scenario: 02 - Simplified - ACE Authorisations - Authorised place - Address id - No contact - Incident code 3 -
  No endorsements - Location id UN/LOCODE - Yes container indicator
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
  #Incidents
    And I choose radio option Yes on the incidents add page
    And I select France on the incidents country page
    And I choose radio option 3 - The goods on the incidents code page
    And I enter Test Incident Happened text on the incidents description page
  #Endorsements
    And I choose radio option No on the incidents add endorsement page
  #Incidents Identify Location
    And I choose radio option UN/LOCODE on the incident identify location page
    And I select Aalen on the incident un locode page
    And I choose radio option Yes on the container indicator page
    And I enter GBID12345 on the container identification number page
    And I submit on the CYA page



  #[CTCP-687] : Identification - Simplified -> ACT Authorisations type
  #[CTCP-697] : Location of goods - Eori Number [X]
  #[CTCP-698] : Incidents and Endorsements
  #[CTCP-699-700] : Incident location - Incident transport equipment and containers
  #[CTCP-702] : Summary CYA
  Scenario: 03 - Simplified - ACT Authorisations - Authorised place - EORI id - Yes additional id - Yes contact - Incident code 1 -
  Yes endorsement - Location id Address
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
  #Incidents
    And I choose radio option Yes on the incidents add page
    And I select France on the incidents country page
    And I choose radio option 1 - The carrier on the incidents code page
    And I enter Test Incident Happened text on the incidents description page
  #Endorsements
    And I choose radio option Yes on the incidents add endorsement page
    And I choose fill in the date on the incidents endorsement date page
    And I enter test data on the incidents endorsement authority page
    And I select France on the incidents endorsement country page
    And I enter Incident test data on the incidents endorsement location page
  #Incidents Identify Location
    And I choose radio option Address on the incident identify location page
    And I fill in address on the incident address page
    And I submit on the CYA page



  #[CTCP-687] : Identification - Normal
  #[CTCP-697] : Location of goods - Authorisation [Y]
  #[CTCP-698] : Incidents and Endorsements
  #[CTCP-699-700] : Incident location -  Incident transport equipment and containers
  #[CTCP-702] : Summary CYA
  Scenario: 04 - Normal - Designated location - Authorisation number id - No additional identifier - No contact - Incident code 3 -
  No endorsements - Location id Coordinates - No container indicator - Yes transport equipment - Yes container id
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
  #Incidents
    And I choose radio option Yes on the incidents add page
    And I select France on the incidents country page
    And I choose radio option 3 - The goods on the incidents code page
    And I enter Test Incident Happened text on the incidents description page
  #Endorsements
    And I choose radio option No on the incidents add endorsement page
  #Incidents Identify Location
    And I choose radio option Coordinates on the incident identify location page
    And I enter 50.96622 and 50.96622 on the incident coordinates page
    And I choose radio option No on the container indicator page
    And I choose radio option Yes on the add transport equipment page
    And I choose radio option Yes on the add container identification number page
    And I enter GBID12345 on the container identification number page
    And I submit on the CYA page



  #[CTCP-687] : Identification - Normal
  #[CTCP-697] : Location of goods - Coordinates [W]
  #[CTCP-698] : Incidents and Endorsements
  #[CTCP-699-700] -  Incident location -  Incident transport equipment and containers
  #[CTCP-702] : Summary CYA
  Scenario: 05 - Normal - Authorised place - Coordinates id - No contact - Incident code 1 -
  No endorsements - Location id Address
  # Identification
    When I select GB on the arrival office of destination page
    And I enter GB123456789000 on the consignee eori tin page
    And I choose radio option Normal on the procedure type page
  #Location Of goods
    And I choose radio option Authorised place on the arrival location of goods type page
    And I choose radio option Coordinates on the arrival location of goods identification page
    And I enter 50.96622 and 50.96622 on the arrival location of goods coordinates page
    And I choose radio option No on the arrival location of goods add contact page
  #Incidents
    And I choose radio option Yes on the incidents add page
    And I select France on the incidents country page
    And I choose radio option 1 - The carrier on the incidents code page
    And I enter Test Incident Happened text on the incidents description page
  #Endorsements
    And I choose radio option No on the incidents add endorsement page
  #Incidents Identify Location
    And I choose radio option Address on the incident identify location page
    And I fill in address on the incident address page
    And I submit on the CYA page



  #[CTCP-687] : Identification - Normal
  #[CTCP-697] : Location of goods - UN/LOCODE [U]
  #[CTCP-698] : Incidents and Endorsements
  # [CTCP-699-700] -  Incident location -  Incident transport equipment and containers
  #[CTCP-702] : Summary CYA
  Scenario: 06 - Normal- Authorised place - UN/LOCODE id - No contact - Incident code 1 -
  No endorsement - Location id Address
  # Identification
    When I select XI on the arrival office of destination page
    And I enter GB123456789000 on the consignee eori tin page
    And I choose radio option Normal on the procedure type page
  #Location Of goods
    And I choose radio option Authorised place on the arrival location of goods type page
    And I choose radio option UN/LOCODE on the arrival location of goods identification page
    And I select Aalen on the arrival location of goods customs un locode page
    And I choose radio option No on the arrival location of goods add contact page
  #Incidents
    And I choose radio option Yes on the incidents add page
    And I select France on the incidents country page
    And I choose radio option 1 - The carrier on the incidents code page
    And I enter Test Incident Happened text on the incidents description page
  #Endorsements
    And I choose radio option No on the incidents add endorsement page
  #Incidents Identify Location
    And I choose radio option Address on the incident identify location page
    And I fill in address on the incident address page
    And I submit on the CYA page



  #[CTCP-687] : Identification - Normal
  #[CTCP-697] : Location of goods - Postal code [T]
  #[CTCP-698] : Incidents and Endorsements
  #[CTCP-699-700] -  Incident location -  Incident transport equipment and containers
  #[CTCP-702] : Summary CYA
  Scenario: 07 - Normal - Authorised place - Postal code id - No contact - Incident code 1 -
  No endorsements - Location id UN/LOCODE
  #Identification
    When I select GB on the arrival office of destination page
    And I enter GB123456789000 on the consignee eori tin page
    And I choose radio option Normal on the procedure type page
  #Location Of goods
    And I choose radio option Authorised place on the arrival location of goods type page
    And I choose radio option Postal code on the arrival location of goods identification page
    And I fill in address on the arrival location of goods postal code page
    And I choose radio option No on the arrival location of goods add contact page
  #Incidents
    And I choose radio option Yes on the incidents add page
    And I select France on the incidents country page
    And I choose radio option 1 - The carrier on the incidents code page
    And I enter Test Incident Happened text on the incidents description page
  #Endorsements
    And I choose radio option No on the incidents add endorsement page
  #Incidents Identify Location
    And I choose radio option UN/LOCODE on the incident identify location page
    And I select Aalen on the incident un locode page
    And I submit on the CYA page

    And I choose radio option Yes on the Do you want to add a goods item number page
    And I enter 12345 on the What is the goods item number page
    And I choose radio option Yes on the Do you want to add another goods item number page
    And I choose radio option Yes on the Do you want to add any other transport equipment page



#  Do you want to add a goods item number?              Yes   No - go to to add any other transport equipment
#  What is the goods item number?
#  Do you want to add another goods item number?        Yes - go back to What is the goods item number
#  Do you want to add any other transport equipment?    Yes - go to Container id no page No - check if code is 2 (seals) go to equipment seal id if 2. If not 2 ask if want to add seal