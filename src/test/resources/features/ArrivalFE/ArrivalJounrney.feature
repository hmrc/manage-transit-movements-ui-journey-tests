@arrival

Feature: Arrival notification feature

  Background:
    Given I login with ID 1234567
    Then I am on the Manage Transit Movements Hub service
    Given I click on the Make an arrival notification link

#[CTCP-687] : Identification
#[CTCP-697] : Location of goods
#[CTCP-698] : Incidents and Endorsements

  Scenario: 01

 # Identification
    When I enter G20GB00006010025496 on the movement reference number page
    And I enter date on the arrival date page
    And I choose radio option No on the simplified procedure page
    And I input a random number on the Identification Number page
    And I submit on the CYA page
 # Location of goods
    And I choose radio option Authorised place – the authorised consignor’s own premises on the type of location page
    And I choose radio option Customs office identifier on the type of location page
    And I select GB on the location of goods customs office identifier page
    And I choose radio option No on the IncidentFlag page
  # Incidents and Endorsements
    And I select United Kingdom on the country is the place of incident page
    And I select 1 - The carrier on the incident code for the place of incident page
    And I input a random text on the Description of the incident page
    And I choose radio option Yes on the add an endorsement page
    And I enter date on the Endorsement Date page
    And I input a random text on the authority of endorsement page
    And I input a random text on the endorsement place page
    And I select United Kingdom on the country is the place of endorsement in page