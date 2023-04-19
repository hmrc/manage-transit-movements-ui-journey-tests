@managehub

Feature: Manage transit movements feature

  Background: I log on to the Manage Transit Movements Hub service
    Given I login with ID 1234567890


#  Scenario: 01 - Trader is able to make an arrival notification from home page
#    When I click on the Make an arrival notification link on the 'Manage your transit movements' page
#    Then I should be on the 'What is the Movement Reference Number?' page
#    And I sign out
#
#
#  Scenario: 02 - Trader is able to view and make an arrival notification
#    When I click on the View arrival notifications link on the 'Manage your transit movements' page
#    And I click on the Make an arrival notification link on the 'Arrival notifications' page
#    Then I should be on the 'What is the Movement Reference Number?' page
#    And I sign out
#
  @manageA11y
  Scenario: 03 - Trader is able to view and make unloading remarks
    When I submit an arrival notification
    And I submit an unloading permission with seals
    When I click on the View arrival notifications link on the 'Manage your transit movements' page
    And I click on the Make unloading remarks link for MRN 38VYQTYFU3T0KUTUM3 on the 'Arrival notifications' page
    Then I should be on the 'Unload the goods before you make unloading remarks' page
    And I sign out
#
#
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


  Scenario: 10 - Trader is able to make a departure declaration from home page
    When I click on the Make a departure declaration link on the 'Manage your transit movements' page
    Then I should be on the 'What is the Local Reference Number?' page
    And I sign out


#  Scenario: 11 - Trader is able to view guarantee rejection for departure declaration
#    When I click on the View departure declarations link on the 'Manage your transit movements' page
#    Then I click on the View errors link for LRN LRN123461 on the 'Departure declarations' page
##    FOUND 10120/manage-transit-movements/departures/not-found EXPECTED manage-transit-movements-departures/27/guarantee-rejection page
##    And I should be on the 'There is a problem with the guarantee for this departure declaration' page
#    And I sign out
#
#
#  Scenario: 12 - Trader is able to view declaration rejection for departure declaration
#    When I click on the View departure declarations link on the 'Manage your transit movements' page
#    Then I click on the View errors link for LRN LRN123459 on the 'Departure declarations' page
##    FOUND 10122/manage-transit-movements/cancellation/technical-difficulties EXPECTED manage-transit-movements-departures/33/departure-declaration-fail page
##    And I should be on the 'There is a problem with this departure declaration' page
#    And I sign out
#
#  @manageA11y
#  Scenario: 13 - Trader is able to see Goods not released for departure declaration
#    When I click on the View departure declarations link on the 'Manage your transit movements' page
#    Then I click on the View details link for LRN LRN123470 on the 'Departure declarations' page
#    And I should see the content No release motivation on the 'No release for transit' page
#    And I sign out
#
#  @manageA11y
#  Scenario: 14 - Trader is able to see the negative acknowledgement for arrivals
#    When I click on the View arrival notifications link on the 'Manage your transit movements' page
#    Then I click on the View errors link for MRN 67QJPVXD78GHIJYQT on the 'Arrival notifications' page
#    And I should be on the 'Negative acknowledgement' page
#    And I sign out

  @manageA11y
  Scenario: 15 - Trader is able to see Control decision for departure declaration
#    IE015 - Declaration Data
    When I submit a departure declaration
    And I refresh the page
    And I click on the View departure declarations link on the 'Manage your transit movements' page
    Then I see the status Declaration sent on the 'Departure declarations' page
#    IE928 - Positive Acknowledgement
    When I submit a positive acknowledgement
    And I refresh the page
    Then I see the status Declaration sent on the 'Departure declarations' page
#    IE028 - MRN Allocated
    When I submit a MRN allocation
    And I refresh the page
#            And I wait for 1000 seconds

    Then I see the status MRN allocated on the 'Departure declarations' page
#    IE060 - Control Decision Notification
    When I submit a control decision notification
    And I refresh the page
    Then I see the status Goods under control on the 'Departure declarations' page

    And I click on the View details link for LRN 83LU49243708J1I4B5A2NM on the 'Departure declarations' page
#    And I should be on the 'Your goods have been selected for control' page
#    And I sign out

#  @manageA11y
#  Scenario: 16 - Trader is able to view unloading remarks for negative submission acknowledgement error
#    When I click on the View arrival notifications link on the 'Manage your transit movements' page
#    Then I click on the View errors link for MRN 99QJPVXD78GHIJYQT on the 'Arrival notifications' page
#    And I click the create new unloading remarks link on the 'Unloading remarks negative acknowledgement' page
#    And I should be on the 'Unload the goods before you make unloading remarks' page
#    And I sign out
#
#  @manageA11y
#  Scenario: 17 - Trader is unable to cancel their declaration for departure declaration due to a data error
#    When I click on the View departure declarations link on the 'Manage your transit movements' page
#    Then I click on the Cancel declaration link for LRN LRN123457 on the 'Departure declarations' page
#    And I should be on the 'You cannot cancel this departure declaration' page
#    And I sign out


  Scenario: 18 - Trader is able to check guarantee balance
    When I click on the Check your guarantee balance link on the 'Manage your transit movements' page
    Then I should be on the 'What is your EORI number?' page
    And I sign out

#  @manageA11y
#  Scenario: 19 - Trader is able to search for departures
#    When I click on the View departure declarations link on the 'Manage your transit movements' page
#    And I enter 99 in the Search field on the 'Departure declarations' page
#    Then I should see the content Showing 14 results matching 99 on the 'Departure declarations' page
#    And I click on the View all movements link on the 'Departure declarations' page
#    And I click on the Go to manage transit movements link on the 'Departure declarations' page
#    Then I should be on the 'Manage your transit movements' page
#    And I sign out
#
#
#  @manageA11y
#  Scenario: 20 - Trader is able to search for arrivals
#    When I click on the View arrival notifications link on the 'Manage your transit movements' page
#    And I enter 99 in the Search field on the 'Arrival notifications' page
#    Then I should see the content Showing 1 result matching 99 on the 'Arrival notifications' page
#    And I click on the View all movements link on the 'Arrival notifications' page
#    And I click on the Go to manage transit movements link on the 'Arrival notifications' page
#    Then I should be on the 'Manage your transit movements' page
#    And I sign out
#
#
#  Scenario: 21 - Trader is able to start a departure declaration from the 'Departure declarations' page
#    When I click on the View departure declarations link on the 'Manage your transit movements' page
#    Then I click on the Make a departure declaration link on the 'Departure declarations' page
#    And I should be on the 'What is the Local Reference Number?' page
#    And I sign out

  @manageA11y
  Scenario: 22 - Trader is able to view a draft departure declaration and delete it
    When I click on the Make a departure declaration link on the 'Manage your transit movements' page
    Then I enter 1234567890ABCDEFGHIJKL on the 'What is the Local Reference Number?' page
    And I sign out
    Given I login with ID 1234567890
    When I click on the View draft departure declarations link on the 'Manage your transit movements' page
    And I click on the Delete link on the 'Draft departure declarations' page
    And I click radio option Yes on the 'Are you sure you want to delete this declaration?' page
    And I sign out