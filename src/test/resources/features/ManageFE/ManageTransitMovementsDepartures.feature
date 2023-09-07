@managehub @a11y

Feature: Manage transit movements frontend tests for Departures

  Background: I log on to the Manage Transit Movements Hub service
    Given I login with ID 1234567890


  Scenario: 01 - Trader is able to make a departure declaration from home page
    When I click on the Make a departure declaration link on the 'Manage your transit movements' page
    Then I should be on the 'What is the Local Reference Number?' page
    And I sign out


  Scenario: 02 - Trader is able to view a draft departure declaration and delete it
    When I click on the Make a departure declaration link on the 'Manage your transit movements' page
    Then I enter 1234567890ABCDEFGHIJKL on the 'What is the Local Reference Number?' page
    And I sign out
    Given I login with ID 1234567890
    When I click on the View draft departure declarations link on the 'Manage your transit movements' page
    And I click on the Delete link on the 'Draft departure declarations' page
    And I click radio option Yes on the 'Are you sure you want to delete this declaration?' page
    And I sign out


  Scenario: 03 - Trader is able to see a control decision notification IE060 with documents
    When I submit an IE015 Departure Declaration
    Then I submit an IE060 Control Decision Notification With Documents
    And I refresh the page
    And I click on the View departure declarations link on the 'Manage your transit movements' page
    And I click on the View details link for LRN 38VYQTYFU3T0KUTUM3 on the 'Departure declarations' page
    Then I should be on the 'Goods under control - document requested' page
    And I sign out


  Scenario: 04 - Trader is able to see a control decision notification IE060 with no documents
    When I submit an IE015 Departure Declaration
    Then I submit an IE060 Control Decision Notification With No Documents
    And I refresh the page
    And I click on the View departure declarations link on the 'Manage your transit movements' page
    And I click on the View details link for LRN 38VYQTYFU3T0KUTUM3 on the 'Departure declarations' page
    Then I should be on the 'Goods under control' page
    And I sign out

# 2795
  Scenario: 05 - Trader is able to review declaration errors for a departure declaration
    When I submit an IE015 Departure Declaration
    Then I submit an IE056 Rejection With No Amendable Errors
    And I refresh the page
    And I click on the View departure declarations link on the 'Manage your transit movements' page
    And I click on the View errors link for LRN 38VYQTYFU3T0KUTUM3 on the 'Departure declarations' page
    Then I should be on the 'Review declaration errors' page
    And I sign out

# 2796
#  Scenario: 06 - Trader is able to amend a declaration error for a departure declaration
#    When I submit an IE015 Departure Declaration
#    Then I submit an IE056 Rejection With Amendable Errors
#    And the user has submitted departureDeclaration.json for LRN 38VYQTYFU3T0KUTUM3 and EORI number 1234567890
#    And I refresh the page
#    And I click on the View departure declarations link on the 'Manage your transit movements' page
#    And I click on the Amend declaration link for LRN 38VYQTYFU3T0KUTUM3 on the 'Departure declarations' page
#    And I click on the Amend errors button on the 'Amend declaration errors' page
#    Then I should be on the 'What is the new Local Reference Number?' page
#    And I sign out

# 2898
  Scenario: 07 - Trader is able to review cancellation errors for a departure declaration
    When I submit an IE015 Departure Declaration
    Then I submit an IE014 Declaration Cancellation
    And I submit an IE056 Cancellation Rejection With No Amendable Errors
    And I refresh the page
    And I click on the View departure declarations link on the 'Manage your transit movements' page
    And I click on the View errors link for LRN 38VYQTYFU3T0KUTUM3 on the 'Departure declarations' page
    Then I should be on the 'Review cancellation errors' page
    And I sign out

# 3000
  Scenario: 08 Trader is able to cancel a departure declaration
    Given I login with ID 1234567890
    When I submit an IE015 Departure Declaration
    And I refresh the page
    When I click on the View departure declarations link on the 'Manage your transit movements' page
    And I click on the Cancel declaration link for LRN 38VYQTYFU3T0KUTUM3 on the 'Departure declarations' page
    And I sign out
