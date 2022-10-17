@TransportDetails @departure


Feature: Transport details - includes Pre-task list, Transport details, Containers details

  Background:
    Given I login with ID 1234567
    Then I am on the Manage Transit Movements Hub service
    Given I click on the Make a departure declaration link
    And I input a random LRN on the LocalReferenceNumber page

  Scenario: 01 Transport Details - GB Normal - No Security
    And I select GB on the office of departure page
    And I choose radio option Normal on the procedure type page
    And I choose radio option T1 on the declaration type page
    And I choose radio option No security on the security type page
    And I submit on the CYA page
    Then I should be on the task list page

    #Transport details
    When I click the link with visible text: Add transport details
    And I choose radio option Yes on the apply ucr item page
    And I enter GB123456123456 on the UCR page
    And I choose radio option Yes on the items same destination country page
    And I select United Kingdom on the items destination country page

    #Container details
    And I choose radio option Yes on the containers page


  Scenario: 02 Transport Details - XI Normal - No Security
    And I select XI on the office of departure page
    And I choose radio option Normal on the procedure type page
    And I choose radio option TIR on the declaration type page
    And I enter 1234567 on the tir carnet page
    And I choose radio option Entry summary declaration (ENS) on the security type page
    And I submit on the CYA page
    Then I should be on the task list page


    #Transport details
    When I click the link with visible text: Add transport details
    And I choose radio option Yes on the apply ucr item page
    And I enter GB123456123456 on the UCR page
    And I select United Kingdom on the country of dispatch page
    And I choose radio option Yes on the same destination country page
    And I select United Kingdom on the items destination country page

    #Container details
    And I choose radio option Yes on the containers page