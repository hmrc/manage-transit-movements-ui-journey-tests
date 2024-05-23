@cancellation

Feature: Cancellation frontend journey test

  Scenario: 01 Trader is able to cancel a standard departure declaration
    Given I login with ID 1234567890
    When I submit an IE015 Departure Declaration
    Then I submit an IE928 Positive Acknowledgment
    Then I submit an IE028 MRN Allocated
    And I refresh the page
    #cut-over
    And I click on the View NCTS 5 departure declaration link on the 'Manage your transit movements' page

    # TODO 1 July
    #And I click on the View departure declarations link on the 'Manage your transit movements' page
    And I click on the Cancel declaration link for LRN 38VYQTYFU3T0KUTUM3 on the 'Departure declarations' page
    And I choose radio option Yes on the 'Are you sure you want to cancel this declaration?' page
    And I enter a cancellation reason, with a comma on the 'Why do you want to cancel this declaration?' page
    And I click on the Check the status of departure declarations link on the 'Cancellation request sent' page
    And I sign out

  Scenario: 02 Trader is able to cancel a pre-lodged departure declaration
    Given I login with ID 1234567890
    When I submit an IE015 Prelodged Departure Declaration
    Then I submit an IE928 Positive Acknowledgment
    And I refresh the page
    #cut-over
    And I click on the View NCTS 5 departure declaration link on the 'Manage your transit movements' page

    # TODO 1 July
    #And I click on the View departure declarations link on the 'Manage your transit movements' page
    And I click on the Cancel declaration link for LRN 38VYQTYFU3T0KUTUM3 on the 'Departure declarations' page
    And I choose radio option Yes on the 'Are you sure you want to cancel this declaration?' page
    And I enter a cancellation reason, with a comma on the 'Why do you want to cancel this declaration?' page
    And I click on the Check the status of departure declarations link on the 'Cancellation request sent' page
    And I sign out
