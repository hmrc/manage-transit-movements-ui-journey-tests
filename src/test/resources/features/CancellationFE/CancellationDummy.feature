@cancellation

Feature: Cancellation dummy feature

  Scenario: Cancellation dummy
    Given I login with ID 1234567890
    When I submit a departure declaration IE015
    And I refresh the page
    When I click on the View departure declarations link on the 'Manage your transit movements' page
    And I sign out
