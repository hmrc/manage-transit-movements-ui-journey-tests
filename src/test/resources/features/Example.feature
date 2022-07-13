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

