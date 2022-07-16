@pretasklist @departure

Feature: Pre-task list

  Background:
    Given I delete all cookies
    And I login with ID 1234567
    Then I am on the Manage Transit Movements Hub service
    Given I click on the Make a departure declaration link
    And I input a random LRN on the LocalReferenceNumber page

  Scenario: GB Simplified - T1 - NO Safety and Security
    And I select GB on the office of departure page
    And I choose radio option Simplified on the procedure type page
    And I choose radio option T1 on the declaration type page
    And I choose radio option No security on the security type page
    And I submit on the CYA page

  Scenario: 01 Pre Task List - GB Normal - T2 - ENS
    And I select GB on the office of departure page
    And I choose radio option Normal on the procedure type page
    And I choose radio option T2 on the declaration type page
    And I choose radio option Entry summary declaration (ENS) on the security type page
    And I submit on the CYA page

  Scenario: 02 Pre Task List - XI Simplified - T2F - EXS
    And I select XI on the office of departure page
    And I choose radio option Simplified on the procedure type page
    And I choose radio option T2F on the declaration type page
    And I choose radio option Exit summary declaration (EXS) on the security type page
    And I submit on the CYA page

  Scenario: 03 Pre Task list - XI Normal - TIR - Both
    And I select XI on the office of departure page
    And I choose radio option Normal on the procedure type page
    And I choose radio option TIR on the declaration type page
    And I enter 1234567 on the tir carnet page
    And I choose radio option Exit summary declaration (EXS) on the security type page
    And I submit on the CYA page

  Scenario: 04 Pre Task List - GB Normal - T - No Security
    And I select GB on the office of departure page
    And I choose radio option Normal on the procedure type page
    And I choose radio option T on the declaration type page
    And I choose radio option No security on the security type page
