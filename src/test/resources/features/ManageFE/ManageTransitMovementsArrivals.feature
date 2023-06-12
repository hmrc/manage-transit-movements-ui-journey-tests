@managehub @manageA11y

Feature: Manage transit movements frontend tests for Arrivals

  Background: I log on to the Manage Transit Movements Hub service
    Given I login with ID 1234567890


  Scenario: 01 - Trader is able to view and make unloading remarks
    When I submit an IE007 Arrival Notification
    And I submit an IE043 Unloading Permission With Seals
    When I click on the View arrival notifications link on the 'Manage your transit movements' page
    And I click on the Make unloading remarks link for MRN 38VYQTYFU3T0KUTUM3 on the 'Arrival notifications' page
    Then I should be on the 'Unload the goods before you make unloading remarks' page
    And I sign out

#    2929
  Scenario: 02 - Trader is able to view unloading remarks for multiple errors
    When I submit an IE007 Arrival Notification
    And I submit an IE044 Unloading Remarks Notification With Seals
    And I submit an IE057 Rejection Less Than 10 Errors
    When I click on the View arrival notifications link on the 'Manage your transit movements' page
    Then I should be on the 'Arrival notifications' page
    And I click on the View errors link for MRN 38VYQTYFU3T0KUTUM3 on the 'Arrival notifications' page
    Then I should be on the 'Review unloading remarks errors' page
    And I sign out

#    2930
  Scenario: 03 - Trader is able to view unloading remarks for multiple errors
    When I submit an IE007 Arrival Notification
    And I submit an IE044 Unloading Remarks Notification With Seals
    And I submit an IE057 Rejection More Than 10 Errors
    When I click on the View arrival notifications link on the 'Manage your transit movements' page
    Then I should be on the 'Arrival notifications' page
    And I click on the View errors link for MRN 38VYQTYFU3T0KUTUM3 on the 'Arrival notifications' page
    Then I should be on the 'Unloading remarks errors' page
    And I sign out

#     2918
  Scenario: 04 - Trader is able to view arrival notification rejection for more than 10 errors
    When I submit an IE007 Arrival Notification
    And I submit an IE057 Rejection More Than 10 Errors
    When I click on the View arrival notifications link on the 'Manage your transit movements' page
    Then I should be on the 'Arrival notifications' page
    And I click on the View errors link for MRN 38VYQTYFU3T0KUTUM3 on the 'Arrival notifications' page
    Then I should be on the 'Notification errors' page
   And I sign out

#    2917
  Scenario: 05 - Trader is able to view arrival notification rejection for less than 10 errors
    When I submit an IE007 Arrival Notification
    And I submit an IE057 Rejection Less Than 10 Errors
    When I click on the View arrival notifications link on the 'Manage your transit movements' page
    Then I should be on the 'Arrival notifications' page
    And I click on the View errors link for MRN 38VYQTYFU3T0KUTUM3 on the 'Arrival notifications' page
    Then I should be on the 'Review notification errors' page
    And I sign out


  Scenario: 06 - Trader is able to check guarantee balance
    When I click on the Check your guarantee balance link on the 'Manage your transit movements' page
    Then I should be on the 'What is your EORI number?' page
    And I sign out

