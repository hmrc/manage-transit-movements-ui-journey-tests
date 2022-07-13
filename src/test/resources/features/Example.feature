@Example

Feature: Example Feature file using Cucumber

  Background:
    Given I delete all cookies
    And I login with ID 1234567
    Then I am on the Manage Transit Movements Hub service

  @ZAP
  Scenario: GB Simplified - T1 - NO Safety and Security,with Representative and all contact people, NO approved operator, Guarantee type [1,3,5,A,R]
    Given I click on the Make a departure declaration link
    And I input a random LRN on the LocalReferenceNumber page
    And I select GB on the office of departure page
    And I choose radio option Simplified on the procedure type page
    And I choose radio option T1 on the declaration type page
    And I choose radio option No security on the security type page
    And I submit on the CYA page

