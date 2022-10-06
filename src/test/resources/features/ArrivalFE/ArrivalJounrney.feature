@arrival
@wip
Feature: Arrival notification feature

  Background:
    Given I login with ID 12345678
    Then I am on the Manage Transit Movements Hub service
    Given I click on the Make an arrival notification link

#[CTCP-687] : Identification
#[CTCP-697] : Location of goods
#[CTCP-698] : Incidents and Endorsements

  Scenario: 01 - Simplified
 # Identification
    When I enter 21GB00014210026352 on the movement reference number page
    And I choose radio option Simplified on the procedure type page
    And I choose radio option ACT on the authorisations type page
    And I enter 1200014210026352 on the authorisations reference number page
    And I submit on the CYA page
    Then I should have 1 authorisation on the authorisations add another page
    When I choose radio option No on the authorisations add another page
    And I submit on the CYA page



