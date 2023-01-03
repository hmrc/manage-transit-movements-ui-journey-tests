@managehub

Feature: Manage transit movements feature

  Background: I log on to the Manage Transit Movements Hub service
    Given I login with ID 1234567890
    Then I should be on the Manage your transit movements page


  Scenario: 01 - Trader is able to make an arrival notifications from home page
    When I click on the Make an arrival notification link on the Manage your transit movements page
    Then I should be on the What is the Movement Reference Number page


  Scenario: 02 - Trader is able to view and make an arrival notifications
    When I click on the View arrival notifications link on the Manage your transit movements page
    And I click on the Make an arrival notification link on the Arrival notifications page
    Then I should be on the What is the Movement Reference Number page


  Scenario: 03 - Trader is able to view and make unloading remarks
    When I click on the View arrival notifications link on the Manage your transit movements page
    And I click on the Make unloading remarks link for MRN 19IT02110010007827 on the Arrival notifications page
    Then I should be on the Unload the goods before you send the unloading remarks page


  Scenario: 04 - Trader is able to view arrival notification with duplicate MRN & change the MRN
    When I click on the View arrival notifications link on the Manage your transit movements page
    Then I should be on the Arrival notifications page
    And I click on the View errors link for MRN 99IT9876AB88901209 on the Arrival notifications page
#    And I click on the Change link on the There is a problem with this arrival notification page
#    Then I should be on the What is the Movement Reference Number page


  Scenario: 05 - Trader is able to view arrival notification with generic errors
    When I click on the View arrival notifications link on the Manage your transit movements page
    Then I should be on the Arrival notifications page
    And I click on the View errors link for MRN 19IT02110010007A33 on the Arrival notifications page
#    And I should see the content Error code on the There is a problem with this arrival notification page


  Scenario: 06 - Trader is able to view unloading remarks with specific error for Vehicle Registration Number
    When I click on the View arrival notifications link on the Manage your transit movements page
    Then I should be on the Arrival notifications page
    And I click on the View errors link for MRN 66KYNS1Y465HIJK3M7 on the Arrival notifications page
    And I should see the content Name, registration or reference on the Unloading rejection page


  Scenario: 07 - Trader is able to view unloading remarks with specific error for Date Goods Unloaded
    When I click on the View arrival notifications link on the Manage your transit movements page
    Then I should be on the Arrival notifications page
    And I click on the View errors link for MRN 35YJ28Z73FNSUQK6M9 on the Arrival notifications page
    And I should see the content Unloading date on the Unloading rejection page


  Scenario: 08 - Trader is able to view unloading remarks for multiple errors
    When I click on the View arrival notifications link on the Manage your transit movements page
    Then I should be on the Arrival notifications page
    And I click on the View errors link for MRN 31KYA7YO4FVSIJK911 on the Arrival notifications page
    And I should see the content Error code on the Unloading rejection page


  Scenario: 09 - Trader is able to view invalid arrival notification
    When I click on the View arrival notifications link on the Manage your transit movements page
    Then I click on the View errors link for MRN 74WWQIVU856KEG5U37 on the Arrival notifications page
#    And I should see the content You must review the error on the There is a problem with this arrival notification page
#    And I click on the send a new arrival notification with the right information link on the There is a problem with this arrival notification page
#    Then I should be on the What is the Movement Reference Number page


  Scenario: 10 - Trader is able to make a departure declaration from home page
    When I click on the Make a departure declaration link on the Manage your transit movements page
    Then I should be on the What is the Local Reference Number page


  Scenario: 11 - Trader is able to view guarantee rejection for departure declaration
    When I click on the View departure declarations link on the Manage your transit movements page
    Then I click on the View errors link for LRN LRN123461 on the Departure declarations page
#    And I should be on the There is a problem with the guarantee for this departure declaration page


  Scenario: 12 - Trader is able to view declaration rejection for departure declaration
    When I click on the View departure declarations link on the Manage your transit movements page
    Then I click on the View errors link for LRN LRN123459 on the Departure declarations page
#    And I should be on the There is a problem with this departure declaration page


  Scenario: 13 - Trader is able to see Goods not released for departure declaration
    When I click on the View departure declarations link on the Manage your transit movements page
    Then I click on the View details link for LRN LRN123470 on the Departure declarations page
    And I should see the content No release motivation on the No release for transit page


  Scenario: 14 - Trader is able to see the negative acknowledgement for arrivals
    When I click on the View arrival notifications link on the Manage your transit movements page
    Then I click on the View errors link for MRN 67QJPVXD78GHIJYQT on the Arrival notifications page
    And I should be on the Negative acknowledgement page


  Scenario: 15 - Trader is able to see Control decision for departure declaration
    When I click on the View departure declarations link on the Manage your transit movements page
    Then I click on the View details link for LRN LRN123471 on the Departure declarations page
    And I should be on the Your goods have been selected for control page


  Scenario: 16 - Trader is able to view unloading remarks for negative submission acknowledgement error
    When I click on the View arrival notifications link on the Manage your transit movements page
    Then I click on the View errors link for MRN 99QJPVXD78GHIJYQT on the Arrival notifications page
    And I click the create new unloading remarks link on the Unloading remarks negative acknowledgement page
    And I should be on the Unload the goods before you send the unloading remarks page


  Scenario: 17 - Trader is unable to cancel their declaration for departure declaration due to a data error
    When I click on the View departure declarations link on the Manage your transit movements page
    Then I click on the Cancel declaration link for LRN LRN123457 on the Departure declarations page
    And I should be on the You cannot cancel this departure declaration page


  Scenario: 18 - Trader is able to check guarantee balance
    When I click on the Check your guarantee balance link on the Manage your transit movements page
    Then I should be on the What is your EORI number page


  Scenario: 19 - Trader is able to search for departures
    When I click on the View departure declarations link on the Manage your transit movements page
    And I enter 99 in the Search field on the Departure declarations page
    Then I should see the content Showing 14 results matching 99 on the Departure declarations page
    And I click on the View all movements link on the Departure declarations page
    And I click on the Go to manage transit movements link on the Departure declarations page
    Then I should be on the Manage your transit movements page


  Scenario: 20 - Trader is able to search for arrivals
    When I click on the View arrival notifications link on the Manage your transit movements page
    And I enter 99 in the Search field on the Arrival notifications page
    Then I should see the content Showing 1 result matching 99 on the Arrival notifications page
    And I click on the View all movements link on the Arrival notifications page
    And I click on the Go to manage transit movements link on the Arrival notifications page
    Then I should be on the Manage your transit movements page


  Scenario: 21 - Trader is able to departure declaration from the Departure declarations page
    When I click on the View departure declarations link on the Manage your transit movements page
    Then I click on the Make a departure declaration link on the Departure declarations page
    And I should be on the What is the Local Reference Number page
