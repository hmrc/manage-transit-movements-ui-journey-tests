@managehub

Feature: Manage transit movements feature

  Background: I log on to the Manage Transit Movements Hub service
    Given I login with ID 1234567890

  @manageA11y
  Scenario: 01 - Trader is able to view and make unloading remarks
    When I submit an IE007 Arrival Notification
    And I submit an IE043 Unloading Permission With Seals
    When I click on the View arrival notifications link on the 'Manage your transit movements' page
    And I click on the Make unloading remarks link for MRN 38VYQTYFU3T0KUTUM3 on the 'Arrival notifications' page
    Then I should be on the 'Unload the goods before you make unloading remarks' page
    And I sign out

  @manageA11y
  Scenario: 02 - Trader is able to view unloading remarks for multiple errors
    When I submit an IE007 Arrival Notification
    And I submit an IE044 Unloading Remarks Notification With Seals
    And I submit an IE057 Rejection Less Than 10 Errors
    When I click on the View arrival notifications link on the 'Manage your transit movements' page
    Then I should be on the 'Arrival notifications' page
    And I click on the View errors link for MRN 38VYQTYFU3T0KUTUM3 on the 'Arrival notifications' page
    Then I should be on the 'Review unloading remarks errors' page
    And I sign out

  Scenario: 03 - Trader is able to view arrival notification rejection for more than 10 errors
    When I submit an IE007 Arrival Notification
    And I submit an IE057 Rejection More Than 10 Errors
    When I click on the View arrival notifications link on the 'Manage your transit movements' page
    Then I should be on the 'Arrival notifications' page
    And I click on the View errors link for MRN 38VYQTYFU3T0KUTUM3 on the 'Arrival notifications' page
    Then I should be on the 'Notification errors' page
   And I sign out

  Scenario: 04 - Trader is able to view arrival notification rejection for less than 10 errors
    When I submit an IE007 Arrival Notification
    And I submit an IE057 Rejection Less Than 10 Errors
    When I click on the View arrival notifications link on the 'Manage your transit movements' page
    Then I should be on the 'Arrival notifications' page
    And I click on the View errors link for MRN 38VYQTYFU3T0KUTUM3 on the 'Arrival notifications' page
    Then I should be on the 'Review notification errors' page
    And I sign out


#  Scenario: 04 - Trader is able to view arrival notification with duplicate MRN & change the MRN
#    When I click on the View arrival notifications link on the 'Manage your transit movements' page
#    Then I should be on the 'Arrival notifications' page
#    And I click on the View errors link for MRN 99IT9876AB88901209 on the 'Arrival notifications' page
##  FOUND 10121/manage-transit-movements/arrivals/not-found EXPECTED manage-transit-movements-arrivals/3/arrival-rejection page
##    And I click on the Change link on the 'There is a problem with this arrival notification' page
##    Then I should be on the 'What is the Movement Reference Number?' page
#    And I sign out
#
#
#  Scenario: 05 - Trader is able to view arrival notification with generic errors
#    When I click on the View arrival notifications link on the 'Manage your transit movements' page
#    Then I should be on the 'Arrival notifications' page
#    And I click on the View errors link for MRN 19IT02110010007A33 on the 'Arrival notifications' page
#  #  FOUND 10121/manage-transit-movements/arrivals/not-found EXPECTED manage-transit-movements-arrivals/7/arrival-rejection page
##  And I should see the content Error code on the 'There is a problem with this arrival notification' page
#    And I sign out
#
#  @manageA11y
#  Scenario: 06 - Trader is able to view unloading remarks with specific error for Vehicle Registration Number
#    When I click on the View arrival notifications link on the 'Manage your transit movements' page
#    Then I should be on the 'Arrival notifications' page
#    And I click on the View errors link for MRN 66KYNS1Y465HIJK3M7 on the 'Arrival notifications' page
#    And I should see the content Name, registration or reference on the 'Unloading rejection' page
#    And I sign out
#
#  @manageA11y
#  Scenario: 07 - Trader is able to view unloading remarks with specific error for Date Goods Unloaded
#    When I click on the View arrival notifications link on the 'Manage your transit movements' page
#    Then I should be on the 'Arrival notifications' page
#    And I click on the View errors link for MRN 35YJ28Z73FNSUQK6M9 on the 'Arrival notifications' page
#    And I should see the content Unloading date on the 'Unloading rejection' page
#    And I sign out
#
#  @manageA11y
#  Scenario: 08 - Trader is able to view unloading remarks for multiple errors
#    When I click on the View arrival notifications link on the 'Manage your transit movements' page
#    Then I should be on the 'Arrival notifications' page
#    And I click on the View errors link for MRN 31KYA7YO4FVSIJK911 on the 'Arrival notifications' page
#    And I should see the content Error code on the 'Unloading rejection' page
#    And I sign out
#
#
#  Scenario: 09 - Trader is able to view invalid arrival notification
#    When I click on the View arrival notifications link on the 'Manage your transit movements' page
#    Then I click on the View errors link for MRN 74WWQIVU856KEG5U37 on the 'Arrival notifications' page
#    #  FOUND 10121/manage-transit-movements/arrivals/not-found EXPECTED manage-transit-movements-arrivals/11/arrival-rejection page
##    And I should see the content You must review the error on the 'There is a problem with this arrival notification' page
##    And I click on the send a new arrival notification with the right information link on the 'There is a problem with this arrival notification' page
##    Then I should be on the 'What is the Movement Reference Number?' page
#    And I sign out

#  @manageA11y
#  Scenario: 14 - Trader is able to see the negative acknowledgement for arrivals
#    When I click on the View arrival notifications link on the 'Manage your transit movements' page
#    Then I click on the View errors link for MRN 67QJPVXD78GHIJYQT on the 'Arrival notifications' page
#    And I should be on the 'Negative acknowledgement' page
#    And I sign out

#  @manageA11y
#  Scenario: 16 - Trader is able to view unloading remarks for negative submission acknowledgement error
#    When I click on the View arrival notifications link on the 'Manage your transit movements' page
#    Then I click on the View errors link for MRN 99QJPVXD78GHIJYQT on the 'Arrival notifications' page
#    And I click the create new unloading remarks link on the 'Unloading remarks negative acknowledgement' page
#    And I should be on the 'Unload the goods before you make unloading remarks' page
#    And I sign out

  Scenario: 18 - Trader is able to check guarantee balance
    When I click on the Check your guarantee balance link on the 'Manage your transit movements' page
    Then I should be on the 'What is your EORI number?' page
    And I sign out

#  @manageA11y
#  Scenario: 20 - Trader is able to search for arrivals
#    When I click on the View arrival notifications link on the 'Manage your transit movements' page
#    And I enter 99 in the Search field on the 'Arrival notifications' page
#    Then I should see the content Showing 1 result matching 99 on the 'Arrival notifications' page
#    And I click on the View all movements link on the 'Arrival notifications' page
#    And I click on the Go to manage transit movements link on the 'Arrival notifications' page
#    Then I should be on the 'Manage your transit movements' page
#    And I sign out
