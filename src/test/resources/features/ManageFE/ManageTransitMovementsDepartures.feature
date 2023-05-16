@managehub

Feature: Manage transit movements feature

  Background: I log on to the Manage Transit Movements Hub service
    Given I login with ID 1234567890


  Scenario: 01 - Trader is able to make a departure declaration from home page
    When I click on the Make a departure declaration link on the 'Manage your transit movements' page
    Then I should be on the 'What is the Local Reference Number?' page
    And I sign out


  @manageA11y
  Scenario: 02 - Trader is able to view a draft departure declaration and delete it
    When I click on the Make a departure declaration link on the 'Manage your transit movements' page
    Then I enter 1234567890ABCDEFGHIJKL on the 'What is the Local Reference Number?' page
    And I sign out
    Given I login with ID 1234567890
    When I click on the View draft departure declarations link on the 'Manage your transit movements' page
    And I click on the Delete link on the 'Draft departure declarations' page
    And I click radio option Yes on the 'Are you sure you want to delete this declaration?' page
    And I sign out


  @manageA11y
  Scenario: 03 - Trader is able to see a control decision notification IE060 with documents
    When I submit an IE015 Departure Declaration
    Then I submit an IE060 Control Decision Notification With Documents
    And I refresh the page
    And I click on the View departure declarations link on the 'Manage your transit movements' page
    And I click on the View details link for LRN 83LU49243708J1I4B5A2NM on the 'Departure declarations' page
    Then I should be on the 'Goods under control - document requested' page
    And I sign out


  Scenario: 04 - Trader is able to see a control decision notification IE060 with no documents
    When I submit an IE015 Departure Declaration
    Then I submit an IE060 Control Decision Notification With No Documents
    And I refresh the page
    And I click on the View departure declarations link on the 'Manage your transit movements' page
    And I click on the View details link for LRN 83LU49243708J1I4B5A2NM on the 'Departure declarations' page
    Then I should be on the 'Goods under control' page
    And I sign out


  @manageA11y
  Scenario: 05 - Trader is able to review declaration errors for a departure declaration
    When I submit an IE015 Departure Declaration
    Then I submit an IE056 Rejection With No Amendable Errors
    And I refresh the page
    And I click on the View departure declarations link on the 'Manage your transit movements' page
    And I click on the View errors link for LRN 83LU49243708J1I4B5A2NM on the 'Departure declarations' page
    Then I should be on the 'Review declaration errors' page
    And I sign out


  @manageA11y
  Scenario: 06 - Trader is able to amend a declaration error for a departure declaration
    When I submit an IE015 Departure Declaration
    Then I submit an IE056 Rejection With Amendable Errors
    And the user has submitted departureDeclaration.json for LRN 83LU49243708J1I4B5A2NM and EORI number 1234567890
    And I refresh the page
    And I click on the View departure declarations link on the 'Manage your transit movements' page
    And I click on the Amend declaration link for LRN 83LU49243708J1I4B5A2NM on the 'Departure declarations' page
    And I click on the Amend errors button on the 'Amend declaration errors' page
    Then I should be on the 'Declaration summary' page
    And I sign out


  @manageA11y
  Scenario: 07 - Trader is notified of multiple declaration errors for a departure declaration
    When I submit an IE015 Departure Declaration
    Then I submit an IE056 Rejection With More Than 10 Errors
    And I refresh the page
    And I click on the View departure declarations link on the 'Manage your transit movements' page
    And I click on the View errors link for LRN 83LU49243708J1I4B5A2NM on the 'Departure declarations' page
    And I click on the Create another departure declaration link on the 'Declaration errors' page
    Then I should be on the 'What is the Local Reference Number?' page
    And I sign out


#  Scenario: 11 - Trader is able to view guarantee rejection for departure declaration
#    When I click on the View departure declarations link on the 'Manage your transit movements' page
#    Then I click on the View errors link for LRN LRN123461 on the 'Departure declarations' page
##    FOUND 10120/manage-transit-movements/departures/not-found EXPECTED manage-transit-movements-departures/27/guarantee-rejection page
##    And I should be on the 'There is a problem with the guarantee for this departure declaration' page
#    And I sign out


#  @manageA11y
#  Scenario: 13 - Trader is able to see Goods not released for departure declaration
#    When I click on the View departure declarations link on the 'Manage your transit movements' page
#    Then I click on the View details link for LRN LRN123470 on the 'Departure declarations' page
#    And I should see the content No release motivation on the 'No release for transit' page
#    And I sign out


#  @manageA11y
#  Scenario: 17 - Trader is unable to cancel their declaration for departure declaration due to a data error
#    When I click on the View departure declarations link on the 'Manage your transit movements' page
#    Then I click on the Cancel declaration link for LRN LRN123457 on the 'Departure declarations' page
#    And I should be on the 'You cannot cancel this departure declaration' page
#    And I sign out


#  @manageA11y
#  Scenario: 19 - Trader is able to search for departures
#    When I click on the View departure declarations link on the 'Manage your transit movements' page
#    And I enter 99 in the Search field on the 'Departure declarations' page
#    Then I should see the content Showing 14 results matching 99 on the 'Departure declarations' page
#    And I click on the View all movements link on the 'Departure declarations' page
#    And I click on the Go to manage transit movements link on the 'Departure declarations' page
#    Then I should be on the 'Manage your transit movements' page
#    And I sign out


#  Scenario: 21 - Trader is able to start a departure declaration from the 'Departure declarations' page
#    When I click on the View departure declarations link on the 'Manage your transit movements' page
#    Then I click on the Make a departure declaration link on the 'Departure declarations' page
#    And I should be on the 'What is the Local Reference Number?' page
#    And I sign out
