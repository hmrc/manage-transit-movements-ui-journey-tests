@unloading_remarksP6
Feature: Submit unloading remarks with seals


  Scenario: 01 - Unloading remarks with revised procedure and seals replaced by customs
    Given I login with ID 1234567890
    When I submit an IE007 Arrival Notification
    And I submit an IE043 Unloading Permission With Seals
    When I click on the View arrival notifications link on the 'Manage your transit movements' page
    And I click on the Make unloading remarks link for MRN 25GB000246TK0E6WJ1 on the 'Arrival notifications' page
    And I choose radio option Yes on the 'Do you want to use the revised unloading procedure?' page
    And I choose radio option Yes on the 'Conditions for using the revised unloading procedure' page
    And I choose radio option No on the 'Are the goods too large to fit into a container?' page
    Then I click the Continue button on the 'Download the unloading permission' page
    #5847
    And I click the Continue button on the 'Take a photograph of the external seal before it is broken' page
    And I choose radio option No on the 'Has the external seal been replaced by a customs authority?' page
    And I enter Seal1 on the 'What is the identification number for the external seal?' page
    And I click the Change link for Has the external seal been replaced by a customs authority? on the Unloading 'Check your answers' page
    And I choose radio option Yes on the 'Has the external seal been replaced by a customs authority?' page
    And I enter NewSeal1 on the 'What is the identification number for the replacement external seal?' page
    And I submit the 'Check your answers' page
    And I should be on the 'Unloading remarks sent' page

  Scenario: 02 - Unloading remarks with new agreement to old procedure and no discrepancies
    Given I login with ID 1234567890
    When I submit an IE007 Arrival Notification
    And I submit an IE043 Unloading Permission With Seals
    When I click on the View arrival notifications link on the 'Manage your transit movements' page
    And I click on the Make unloading remarks link for MRN 25GB000246TK0E6WJ1 on the 'Arrival notifications' page
    And I choose radio option Yes on the 'Do you want to use the revised unloading procedure?' page
    And I choose radio option Yes on the 'Conditions for using the revised unloading procedure' page
    And I choose radio option Yes on the 'Are the goods too large to fit into a container?' page
    Then I click the Continue button on the 'Check the goods and note any discrepancies' page
    And I choose radio option Yes on the 'Were there any discrepancies between the transit movement and unloading permission?' page
    Then I click the Continue button on the 'You cannot use the revised unloading procedure' page

    And I choose radio option Yes on the 'Are all the seal identification numbers or marks readable?' page
    And I choose radio option No on the 'Are any of the seals broken?' page
    And I click the Continue button on the 'Enter the discrepancies between the transit movement and unloading permission' page
    And I enter remarks on the 'Enter your comments' page
    And I choose radio option No on the 'Do you have anything else to report?' page
    And I submit the 'Check your answers' page
    And I should be on the 'Unloading remarks sent' page


  Scenario: 03 - Unloading remarks attempt to use revised procedure, with changes to summary answers & add/remove comment & adds new seals and changes the check seals section from CYA page
    Given I login with ID 1234567890
    When I submit an IE007 Arrival Notification
    And I submit an IE043 Unloading Permission With Seals
    When I click on the View arrival notifications link on the 'Manage your transit movements' page
    And I click on the Make unloading remarks link for MRN 25GB000246TK0E6WJ1 on the 'Arrival notifications' page
    And I choose radio option Yes on the 'Do you want to use the revised unloading procedure?' page
    And I choose radio option No on the 'Conditions for using the revised unloading procedure' page
    And I click the Continue button on the 'You cannot use the revised unloading procedure' page
    Then I click the Continue button on the 'Unload the goods and note any discrepancies' page
    And I choose radio option fully on the 'Have you fully or partially unloaded the goods?' page
    And I fill in the date on the 'When were the goods unloaded?' page
    And I choose radio option Yes on the 'Are all the seal identification numbers or marks readable?' page
    And I choose radio option No on the 'Are any of the seals broken?' page
    And I choose radio option Yes on the 'Were there any discrepancies between the transit movement and unloading permission?' page
    And I click the 'More details' link for house consignment 1 on the 'Enter the discrepancies between the transit movement and unloading permission' page
    And I click the Back to summary button on the 'House consignment 1' page
    And I click the Continue button on the 'Enter the discrepancies between the transit movement and unloading permission' page
    And I enter remarks on the 'Enter your comments' page
    And I choose radio option No on the 'Do you have anything else to report?' page
    And I submit the 'Check your answers' page
    And I should be on the 'Unloading remarks sent' page
    And I sign out


  Scenario: 04 - Unloading remarks - Status changes during making unloading remarks (IE057 is received)
    Given I login with ID 1234567890
    When I submit an IE007 Arrival Notification
    And I submit an IE043 Unloading Permission With Seals
    When I click on the View arrival notifications link on the 'Manage your transit movements' page
    And I click on the Make unloading remarks link for MRN 25GB000246TK0E6WJ1 on the 'Arrival notifications' page
    And I choose radio option No on the 'Do you want to use the revised unloading procedure?' page
    Then I click the Continue button on the 'Unload the goods and note any discrepancies' page
    And I choose radio option fully on the 'Have you fully or partially unloaded the goods?' page
    And I fill in the date on the 'When were the goods unloaded?' page
    And I choose radio option Yes on the 'Are all the seal identification numbers or marks readable?' page
    And I choose radio option No on the 'Are any of the seals broken?' page
    And I choose radio option Yes on the 'Were there any discrepancies between the transit movement and unloading permission?' page
    And I click the Continue button on the 'Enter the discrepancies between the transit movement and unloading permission' page
    And I enter remarks on the 'Enter your comments' page
    And I choose radio option No on the 'Do you have anything else to report?' page

    When I submit an IE057 Unloading Remarks Rejection
    And I submit the 'Check your answers' page
    Then I should be on the 'You cannot send these unloading remarks' page
    And I sign out

  Scenario: 05 - Trader is able to view unloading remarks with rejections and resubmit
    Given I login with ID 1234567890
    When I submit an IE007 Arrival Notification
    And I submit an IE043 Unloading Permission With Seals
    And I submit an IE044 Unloading Remarks Notification With Seals
    And I submit an IE057 Unloading Remarks Rejection
    When I click on the View arrival notifications link on the 'Manage your transit movements' page
    Then I should be on the 'Arrival notifications' page
    And I click on the View errors link for MRN 25GB000246TK0E6WJ1 on the 'Arrival notifications' page
    Then I should be on the 'Review unloading remarks errors' page
    And I click on the Make unloading remarks on the 'Review unloading remarks errors' page
    And I choose radio option Yes on the 'Do you want to use the revised unloading procedure?' page
    And I choose radio option Yes on the 'Conditions for using the revised unloading procedure' page
    And I choose radio option Yes on the 'Are the goods too large to fit into a container?' page
    Then I click the Continue button on the 'Check the goods and note any discrepancies' page
    And I choose radio option No on the 'Were there any discrepancies between the transit movement and unloading permission?' page
    And I click the Change link for Were there any discrepancies between the transit and unloading permission? on the Unloading 'Check your answers' page
    And I choose radio option Yes on the 'Were there any discrepancies between the transit movement and unloading permission?' page
    Then I click the Continue button on the 'You cannot use the revised unloading procedure' page
    And I choose radio option Yes on the 'Are all the seal identification numbers or marks readable?' page
    And I choose radio option No on the 'Are any of the seals broken?' page
    And I click the Continue button on the 'Enter the discrepancies between the transit movement and unloading permission' page
    And I enter remarks on the 'Enter your comments' page
    And I choose radio option No on the 'Do you have anything else to report?' page
    And I submit the 'Check your answers' page
    And I should be on the 'Unloading remarks sent' page
    And I sign out


  Scenario: 06 - E2E Navigation (Longest journey - Seals state 1)
    Given I login with ID 1234567890
    When I submit an IE007 Arrival Notification
    And I submit an IE043 Unloading Permission With Seals
    When I click on the View arrival notifications link on the 'Manage your transit movements' page
    And I click on the Make unloading remarks link for MRN 25GB000246TK0E6WJ1 on the 'Arrival notifications' page
    And I choose radio option No on the 'Do you want to use the revised unloading procedure?' page
    Then I click the Continue button on the 'Unload the goods and note any discrepancies' page
    And I choose radio option fully on the 'Have you fully or partially unloaded the goods?' page
    And I fill in the date on the 'When were the goods unloaded?' page
    And I choose radio option Yes on the 'Are all the seal identification numbers or marks readable?' page
    And I choose radio option No on the 'Are any of the seals broken?' page
    And I choose radio option No on the 'Were there any discrepancies between the transit movement and unloading permission?' page
    And I choose radio option Yes on the 'Do you have anything else to report?' page
    And I enter example comment here on the 'What do you want to report?' page

  Scenario: 07 - E2E Navigation (Seals - State 0)
    Given I login with ID 1234567890
    When I submit an IE007 Arrival Notification
    And I submit an IE043 Unloading Permission With Seals
    When I click on the View arrival notifications link on the 'Manage your transit movements' page
    And I click on the Make unloading remarks link for MRN 25GB000246TK0E6WJ1 on the 'Arrival notifications' page
    And I choose radio option No on the 'Do you want to use the revised unloading procedure?' page
    Then I click the Continue button on the 'Unload the goods and note any discrepancies' page
    And I choose radio option fully on the 'Have you fully or partially unloaded the goods?' page
    And I fill in the date on the 'When were the goods unloaded?' page
    And I choose radio option No on the 'Are all the seal identification numbers or marks readable?' page
    And I choose radio option No on the 'Are any of the seals broken?' page
    And I click the Continue button on the 'Enter the discrepancies between the transit movement and unloading permission' page
    And I enter remarks on the 'Enter your comments' page
    And I choose radio option No on the 'Do you have anything else to report?' page

  Scenario: 08 - E2E Navigation (Shortest journey)
    Given I login with ID 1234567890
    When I submit an IE007 Arrival Notification
    And I submit an IE043 Unloading Permission With No Seals
    When I click on the View arrival notifications link on the 'Manage your transit movements' page
    And I click on the Make unloading remarks link for MRN 25GB000246TK0E6WJ1 on the 'Arrival notifications' page
    And I choose radio option No on the 'Do you want to use the revised unloading procedure?' page
    Then I click the Continue button on the 'Unload the goods and note any discrepancies' page
    And I choose radio option fully on the 'Have you fully or partially unloaded the goods?' page
    And I fill in the date on the 'When were the goods unloaded?' page
    And I choose radio option No on the 'Were there any discrepancies between the transit movement and unloading permission?' page
    And I choose radio option No on the 'Do you have anything else to report?' page

