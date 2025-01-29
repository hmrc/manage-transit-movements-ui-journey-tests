
Feature: End to end journey for amending a departure declaration - Transition

  Scenario: 01 End to end journey for amending a departure declaration before MRN allocation
    Given I login with ID 1234567890
    When I submit an IE015 Departure Declaration
    Then I submit an IE056 Rejection With Amendable Errors
    And the user has submitted departureDeclarationTransition.json for LRN 38VYQTYFU3T0KUTUM3 and EORI number 1234567890
    And I refresh the page
    And I click on the View departure declarations link on the 'Manage your transit movements' page
    And I click on the Amend declaration link for LRN 38VYQTYFU3T0KUTUM3 on the 'Departure declarations' page
    And I click on the Amend errors button on the 'Amend declaration errors' page

    And I should see Error status for trader details on the 'Declaration summary' page
    And I should see Error status for route details on the 'Declaration summary' page
    And I should see Error status for transport details on the 'Declaration summary' page
    And I should see Error status for documents on the 'Declaration summary' page
    And I should see Error status for items on the 'Declaration summary' page
    And I should see Error status for guarantee details on the 'Declaration summary' page

    And I click on the Amend trader details link on the 'Declaration summary' page
    And I click the Change link for Do you want to add a contact? on the Trader details 'Check your answers' page
    And I choose radio option No on the 'Do you want to add a contact for the transit holder?' page
    And I submit on the Check your answers section Trader details page
    And I should see Amended status for trader details on the 'Declaration summary' page

    And I click on the Amend route details link on the 'Declaration summary' page
    And I click the Change link for Do you want to add a contact for the location of goods? on the Route details 'Check your answers' page
    And I choose radio option No on the 'Do you want to add a contact for the location of goods?' page
    And I submit on the Check your answers section Route details page
    And I should see Amended status for route details on the 'Declaration summary' page

    And I click on the Amend transport details link on the 'Declaration summary' page
    And I click the Change link for Do you want to add a method of payment for transport charges? on the Transport details 'Check your answers' page
    And I choose radio option No on the 'Do you want to add a method of payment for transport charges?' page
    And I submit on the Check your answers section Transport details page
    And I should see Amended status for transport details on the 'Declaration summary' page

    And I click on the Amend documents link on the 'Declaration summary' page
    And I click the Change link on the 'You have added 3 documents' page
    And I click the Change link for Do you want to add any additional information for this document? on the Documents 'Check your answers' page
    And I click radio option No on the 'Do you want to add any additional information for this document?' page
    And I submit on the Check your answers section Documents page
    And I choose radio option No on the 'You have added 3 documents' page
    And I should see Amended status for documents on the 'Declaration summary' page

    And I click on the Amend items link on the 'Declaration summary' page
    And I click the Change link on the 'You have added 1 item' page
    And I click the Change link for Do you want to add supplementary units? on the Item 1 'Check your answers' page
    And I click radio option No on the 'Do you want to add supplementary units?' page
    And I submit on the Check your answers section Items page
    And I click radio option No on the 'You have added 1 item' page
    And I should see Amended status for items on the 'Declaration summary' page

    And I click on the Amend guarantee details link on the 'Declaration summary' page
    And I click the Change link on the 'You have added 4 guarantees' page
    And I click the Change link for Liability amount on the Guarantee details 'Check your answers' page
    And I enter 999.99 on the 'How much is the liability in pounds?' page
    And I submit on the Check your answers section Guarantee details page
    And I choose radio option No on the 'You have added 4 guarantees' page
    And I should see Amended status for guarantee details on the 'Declaration summary' page
    And I click the Confirm and resend button on the 'Declaration summary' page
    And I click the Sign out link on the 'Departure declaration sent' page

  Scenario: 02 End to end journey for amending a departure declaration after MRN allocation
    Given I login with ID 1234567890
    When I submit an IE015 Departure Declaration
    Then I submit an IE028 MRN Allocated
    And I submit an IE056 Rejection With Amendable Errors
    And the user has submitted departureDeclarationTransition.json for LRN 38VYQTYFU3T0KUTUM3 and EORI number 1234567890
    And I refresh the page
    And I click on the View departure declarations link on the 'Manage your transit movements' page
    And I click on the Amend declaration link for LRN 38VYQTYFU3T0KUTUM3 on the 'Departure declarations' page
    And I click on the Amend errors button on the 'Amend declaration errors' page
    Then I input a random LRN on the 'What is the new Local Reference Number?' page

    And I should see Error status for trader details on the 'Declaration summary' page
    And I should see Error status for route details on the 'Declaration summary' page
    And I should see Error status for transport details on the 'Declaration summary' page
    And I should see Error status for documents on the 'Declaration summary' page
    And I should see Error status for items on the 'Declaration summary' page
    And I should see Error status for guarantee details on the 'Declaration summary' page

    And I click on the Amend trader details link on the 'Declaration summary' page
    And I click the Change link for Do you want to add a contact? on the Trader details 'Check your answers' page
    And I choose radio option No on the 'Do you want to add a contact for the transit holder?' page
    And I submit on the Check your answers section Trader details page
    And I should see Amended status for trader details on the 'Declaration summary' page

    And I click on the Amend route details link on the 'Declaration summary' page
    And I click the Change link for Do you want to add a contact for the location of goods? on the Route details 'Check your answers' page
    And I choose radio option No on the 'Do you want to add a contact for the location of goods?' page
    And I submit on the Check your answers section Route details page
    And I should see Amended status for route details on the 'Declaration summary' page

    And I click on the Amend transport details link on the 'Declaration summary' page
    And I click the Change link for Do you want to add a method of payment for transport charges? on the Transport details 'Check your answers' page
    And I choose radio option No on the 'Do you want to add a method of payment for transport charges?' page
    And I submit on the Check your answers section Transport details page
    And I should see Amended status for transport details on the 'Declaration summary' page

    And I click on the Amend documents link on the 'Declaration summary' page
    And I click the Change link on the 'You have added 3 documents' page
    And I click the Change link for Do you want to add any additional information for this document? on the Documents 'Check your answers' page
    And I click radio option No on the 'Do you want to add any additional information for this document?' page
    And I submit on the Check your answers section Documents page
    And I choose radio option No on the 'You have added 3 documents' page
    And I should see Amended status for documents on the 'Declaration summary' page

    And I click on the Amend items link on the 'Declaration summary' page
    And I click the Change link on the 'You have added 1 item' page
    And I click the Change link for Do you want to add supplementary units? on the Item 1 'Check your answers' page
    And I click radio option No on the 'Do you want to add supplementary units?' page
    And I submit on the Check your answers section Items page
    And I click radio option No on the 'You have added 1 item' page
    And I should see Amended status for items on the 'Declaration summary' page

    And I click on the Amend guarantee details link on the 'Declaration summary' page
    And I click the Change link on the 'You have added 4 guarantees' page
    And I click the Change link for Liability amount on the Guarantee details 'Check your answers' page
    And I enter 999.99 on the 'How much is the liability in pounds?' page
    And I submit on the Check your answers section Guarantee details page
    And I choose radio option No on the 'You have added 4 guarantees' page
    And I should see Amended status for guarantee details on the 'Declaration summary' page
    And I click the Confirm and resend button on the 'Declaration summary' page
    And I click the Sign out link on the 'Departure declaration sent' page

  Scenario: 03 End to end journey for amending a rejected declaration amendment after MRN allocation
    Given I login with ID 1234567890
    When I submit an IE015 Departure Declaration
    Then I submit an IE028 MRN Allocated
    Then I submit an IE013 Declaration Amendment
    And I submit an IE056 Amendment Rejection With Amendable Errors
    And the user has submitted departureDeclarationTransition.json for LRN 38VYQTYFU3T0KUTUM3 and EORI number 1234567890
    And I refresh the page
    And I click on the View departure declarations link on the 'Manage your transit movements' page
    And I click on the Amend declaration link for LRN 38VYQTYFU3T0KUTUM3 on the 'Departure declarations' page
    And I click on the Amend errors button on the 'Amend declaration errors' page
    And I should see Error status for trader details on the 'Declaration summary' page
    And I should see Error status for route details on the 'Declaration summary' page
    And I should see Error status for transport details on the 'Declaration summary' page
    And I should see Error status for documents on the 'Declaration summary' page
    And I should see Error status for items on the 'Declaration summary' page
    And I should see Error status for guarantee details on the 'Declaration summary' page

    And I click on the Amend trader details link on the 'Declaration summary' page
    And I click the Change link for Do you want to add a contact for the consignor? on the Trader details 'Check your answers' page
    And I choose radio option No on the 'Do you want to add a contact for the consignor?' page
    And I submit on the Check your answers section Trader details page
    And I should see Amended status for trader details on the 'Declaration summary' page

    And I click on the Amend route details link on the 'Declaration summary' page
    And I click the Change link for Do you want to add a contact for the location of goods? on the Route details 'Check your answers' page
    And I choose radio option No on the 'Do you want to add a contact for the location of goods?' page
    And I submit on the Check your answers section Route details page
    And I should see Amended status for route details on the 'Declaration summary' page

    And I click on the Amend transport details link on the 'Declaration summary' page
    And I click the Change link for Do you want to add a method of payment for transport charges? on the Transport details 'Check your answers' page
    And I choose radio option No on the 'Do you want to add a method of payment for transport charges?' page
    And I submit on the Check your answers section Transport details page
    And I should see Amended status for transport details on the 'Declaration summary' page

    And I click on the Amend documents link on the 'Declaration summary' page
    And I click the Change link on the 'You have added 3 documents' page
    And I click the Change link for Do you want to add any additional information for this document? on the Documents 'Check your answers' page
    And I click radio option No on the 'Do you want to add any additional information for this document?' page
    And I submit on the Check your answers section Documents page
    And I choose radio option No on the 'You have added 3 documents' page
    And I should see Amended status for documents on the 'Declaration summary' page

    And I click on the Amend items link on the 'Declaration summary' page
    And I click the Change link on the 'You have added 1 item' page
    And I click the Change link for Do you want to add supplementary units? on the Item 1 'Check your answers' page
    And I click radio option No on the 'Do you want to add supplementary units?' page
    And I submit on the Check your answers section Items page
    And I click radio option No on the 'You have added 1 item' page
    And I should see Amended status for items on the 'Declaration summary' page

    And I click on the Amend guarantee details link on the 'Declaration summary' page
    And I click the Change link on the 'You have added 4 guarantees' page
    And I click the Change link for Liability amount on the Guarantee details 'Check your answers' page
    And I enter 999.99 on the 'How much is the liability in pounds?' page
    And I submit on the Check your answers section Guarantee details page
    And I choose radio option No on the 'You have added 4 guarantees' page
    And I should see Amended status for guarantee details on the 'Declaration summary' page
    And I click the Confirm and resend button on the 'Declaration summary' page
    And I click the Sign out link on the 'Departure declaration sent' page

  Scenario: 04 End to end journey for amending a departure declaration with invalid guarantee
    Given I login with ID 1234567890
    When I submit an IE015 Departure Declaration
    Then I submit an IE028 MRN Allocated
    Then I submit an IE055 Guarantee Not Valid
    And the user has submitted departureDeclarationTransition.json for LRN 38VYQTYFU3T0KUTUM3 and EORI number 1234567890
    And I refresh the page
    And I click on the View departure declarations link on the 'Manage your transit movements' page
    And I click on the View errors link for LRN 38VYQTYFU3T0KUTUM3 on the 'Departure declarations' page
    And I click on the Amend errors button on the 'Amend guarantee errors' page
    And I should see Completed status for trader details on the 'Declaration summary' page
    And I should see Completed status for route details on the 'Declaration summary' page
    And I should see Completed status for transport details on the 'Declaration summary' page
    And I should see Completed status for documents on the 'Declaration summary' page
    And I should see Completed status for items on the 'Declaration summary' page
    And I should see Error status for guarantee details on the 'Declaration summary' page

    And I click on the Amend guarantee details link on the 'Declaration summary' page
    And I click the Remove link on the 'You have added 4 guarantees' page
    And I choose radio option Yes on the 'Are you sure you want to remove this guarantee?' page
    And I choose radio option No on the 'You have added 3 guarantee' page

    And I click the Confirm and resend button on the 'Declaration summary' page
    And I click the Sign out link on the 'Departure declaration sent' page

  Scenario: 05 End to end journey for amending a departure declaration after MRN allocation no errors
    Given I login with ID 1234567890
    When I submit an IE015 Departure Declaration
    Then I submit an IE028 MRN Allocated
    And the user has submitted departureDeclarationTransition.json for LRN 38VYQTYFU3T0KUTUM3 and EORI number 1234567890
    And I refresh the page
    And I click on the View departure declarations link on the 'Manage your transit movements' page
    And I click on the Amend declaration link for LRN 38VYQTYFU3T0KUTUM3 on the 'Departure declarations' page

    And I should see Completed status for trader details on the 'Declaration summary' page
    And I should see Completed status for route details on the 'Declaration summary' page
    And I should see Completed status for transport details on the 'Declaration summary' page
    And I should see Completed status for documents on the 'Declaration summary' page
    And I should see Completed status for items on the 'Declaration summary' page
    And I should see Completed status for guarantee details on the 'Declaration summary' page

    And I click on the Edit items link on the 'Declaration summary' page
    And I click the Change link on the 'You have added 1 item' page
    And I click the Change link for Do you want to add supplementary units? on the Item 1 'Check your answers' page
    And I click radio option No on the 'Do you want to add supplementary units?' page
    And I submit on the Check your answers section Items page
    And I click radio option No on the 'You have added 1 item' page
    And I should see Amended status for items on the 'Declaration summary' page
    And I click the Confirm and resend button on the 'Declaration summary' page
    And I click the Sign out link on the 'Departure declaration sent' page

  Scenario: 06 User is unable to continue with an amendment if an IE029 message is received while amending
    Given I login with ID 1234567890
    When I submit an IE015 Departure Declaration
    Then I submit an IE028 MRN Allocated
    And the user has submitted departureDeclarationTransition.json for LRN 38VYQTYFU3T0KUTUM3 and EORI number 1234567890
    And I refresh the page
    And I click on the View departure declarations link on the 'Manage your transit movements' page
    And I click on the Amend declaration link for LRN 38VYQTYFU3T0KUTUM3 on the 'Departure declarations' page

    And I click on the Edit trader details link on the 'Declaration summary' page
    And I click the Change link for Do you want to add a contact for the consignor? on the Trader details 'Check your answers' page
    And I choose radio option No on the 'Do you want to add a contact for the consignor?' page
    When I submit an IE029 Release For Transit
    And I submit on the Check your answers section Trader details page
    Then I should be on the 'For your security we signed you out' page