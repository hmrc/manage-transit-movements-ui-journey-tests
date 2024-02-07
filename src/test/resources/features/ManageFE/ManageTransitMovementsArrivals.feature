@managehub

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
  Scenario: 02 - Trader is able to view unloading remarks for all errors
    When I submit an IE007 Arrival Notification
    And I submit an IE044 Unloading Remarks Notification With Seals
    And I submit an IE057 Unloading Remarks Rejection
    When I click on the View arrival notifications link on the 'Manage your transit movements' page
    Then I should be on the 'Arrival notifications' page
    And I click on the View errors link for MRN 38VYQTYFU3T0KUTUM3 on the 'Arrival notifications' page
    Then I should be on the 'Review unloading remarks errors' page
    And I sign out


#    2917
  Scenario: 03 - Trader is able to view arrival notification rejections for all errors
    When I submit an IE007 Arrival Notification
    And I submit an IE057 Arrival Notification Rejection
    When I click on the View arrival notifications link on the 'Manage your transit movements' page
    Then I should be on the 'Arrival notifications' page
    And I click on the View errors link for MRN 38VYQTYFU3T0KUTUM3 on the 'Arrival notifications' page
    Then I should be on the 'Review notification errors' page
    And I sign out

