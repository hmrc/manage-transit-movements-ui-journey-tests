@unloading_remarks

Feature: Submit unloading remarks with seals


  Scenario: 01 - Unloading remarks with changes to summary answers & add/remove comment & adds new seals and changes the check seals section from CYA page
    Given I login with ID 1234567890
    When I submit an IE007 Arrival Notification
    And I submit an IE043 Unloading Permission With Seals
    Then I click on the View arrival notifications link on the 'Manage your transit movements' page
    And I click on the Make unloading remarks link for MRN 38VYQTYFU3T0KUTUM3 on the 'Arrival notifications' page
    Then I click the Continue button on the 'Unload the goods before you make unloading remarks' page
    And I choose radio option fully on the 'Have you fully or partially unloaded the goods?' page
    And I fill in the date on the 'When were the goods unloaded?' page
    And I choose radio option Yes on the 'Are all the seal identification numbers or marks readable?' page
    And I choose radio option No on the 'Are any of the seals broken?' page
    And I choose radio option Yes on the 'Were there any discrepancies between the transit and unloading permission?' page

    And I click the 'More details' link for house consignment 1 on the 'Cross-check the transit with this declaration summary' page
    And I click the Back to summary button on the 'Cross-check the transit with house consignment 1' page
    And I click the Continue button on the 'Cross-check the transit with this declaration summary' page
    And I click radio option No on the 'Do you want to add any comments?' page
    And I choose radio option No on the 'Do you have anything else to report?' page

    And I click the Change link for Were there any discrepancies between the transit and unloading permission? on the Unloading 'Check your answers' page
    And I choose radio option Yes on the 'Were there any discrepancies between the transit and unloading permission?' page
    And I click the Continue button on the 'Cross-check the transit with this declaration summary' page
    And I click radio option No on the 'Do you want to add any comments?' page
    And I choose radio option No on the 'Do you have anything else to report?' page
    And I submit the 'Check your answers' page
    And I should be on the 'Unloading remarks sent' page
    And I sign out

  Scenario: 02 - Unloading remarks - Status changes during making unloading remarks (IE057 is received)
    Given I login with ID 1234567890
    When I submit an IE007 Arrival Notification
    And I submit an IE043 Unloading Permission With Seals
    Then I click on the View arrival notifications link on the 'Manage your transit movements' page
    And I click on the Make unloading remarks link for MRN 38VYQTYFU3T0KUTUM3 on the 'Arrival notifications' page
    Then I click the Continue button on the 'Unload the goods before you make unloading remarks' page
    And I choose radio option fully on the 'Have you fully or partially unloaded the goods?' page
    And I fill in the date on the 'When were the goods unloaded?' page
    And I choose radio option Yes on the 'Are all the seal identification numbers or marks readable?' page
    And I choose radio option No on the 'Are any of the seals broken?' page
    And I choose radio option Yes on the 'Were there any discrepancies between the transit and unloading permission?' page
    And I click the Continue button on the 'Cross-check the transit with this declaration summary' page
    And I click radio option No on the 'Do you want to add any comments?' page
    And I choose radio option No on the 'Do you have anything else to report?' page

    When I submit an IE057 Unloading Remarks Rejection
    And I submit the 'Check your answers' page
    Then I should be on the 'You cannot send these unloading remarks' page
    And I sign out

  Scenario: 03 - E2E Navigation (Longest journey - Seals state 1)
    Given I login with ID 1234567890
    When I submit an IE007 Arrival Notification
    And I submit an IE043 Unloading Permission With Seals
    Then I click on the View arrival notifications link on the 'Manage your transit movements' page
    And I click on the Make unloading remarks link for MRN 38VYQTYFU3T0KUTUM3 on the 'Arrival notifications' page
    Then I click the Continue button on the 'Unload the goods before you make unloading remarks' page
    And I choose radio option fully on the 'Have you fully or partially unloaded the goods?' page
    And I fill in the date on the 'When were the goods unloaded?' page
    And I choose radio option Yes on the 'Are all the seal identification numbers or marks readable?' page
    And I choose radio option No on the 'Are any of the seals broken?' page
    And I choose radio option No on the 'Were there any discrepancies between the transit and unloading permission?' page
    And I choose radio option Yes on the 'Do you have anything else to report?' page
    And I enter example comment here on the 'What do you want to report?' page

  Scenario: 04 - E2E Navigation (Seals - State 0)
    Given I login with ID 1234567890
    When I submit an IE007 Arrival Notification
    And I submit an IE043 Unloading Permission With Seals
    Then I click on the View arrival notifications link on the 'Manage your transit movements' page
    And I click on the Make unloading remarks link for MRN 38VYQTYFU3T0KUTUM3 on the 'Arrival notifications' page
    Then I click the Continue button on the 'Unload the goods before you make unloading remarks' page
    And I choose radio option fully on the 'Have you fully or partially unloaded the goods?' page
    And I fill in the date on the 'When were the goods unloaded?' page
    And I choose radio option No on the 'Are all the seal identification numbers or marks readable?' page
    And I choose radio option No on the 'Are any of the seals broken?' page
    And I click the Continue button on the 'Cross-check the transit with this declaration summary' page
    And I click radio option No on the 'Do you want to add any comments?' page
    And I choose radio option No on the 'Do you have anything else to report?' page

  Scenario: 05 - E2E Navigation (Shortest journey)
    Given I login with ID 1234567890
    When I submit an IE007 Arrival Notification
    And I submit an IE043 Unloading Permission With No Seals
    Then I click on the View arrival notifications link on the 'Manage your transit movements' page
    And I click on the Make unloading remarks link for MRN 38VYQTYFU3T0KUTUM3 on the 'Arrival notifications' page
    Then I click the Continue button on the 'Unload the goods before you make unloading remarks' page
    And I choose radio option fully on the 'Have you fully or partially unloaded the goods?' page
    And I fill in the date on the 'When were the goods unloaded?' page
    And I choose radio option No on the 'Were there any discrepancies between the transit and unloading permission?' page
    And I choose radio option No on the 'Do you have anything else to report?' page

