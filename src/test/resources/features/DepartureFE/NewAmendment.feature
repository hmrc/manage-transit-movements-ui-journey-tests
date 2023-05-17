@departureAmendment

Feature: End to end journey for amending a departure declaration

  Scenario: End to end journey for amending a departure declaration
    Given I login with ID 1234567890
    When I submit an IE015 Departure Declaration
    Then I submit an IE056 Rejection With Amendable Errors
    And the user has submitted departureDeclaration.json for LRN 83LU49243708J1I4B5A2NM and EORI number 1234567890
    And I refresh the page
    And I click on the View departure declarations link on the 'Manage your transit movements' page
    And I click on the Amend declaration link for LRN 83LU49243708J1I4B5A2NM on the 'Departure declarations' page
    And I click on the Amend errors button on the 'Amend declaration errors' page
    Then I should be on the 'Declaration summary' page

    And I should see ERROR status for trader details on the 'Declaration summary' page
    And I should see ERROR status for route details on the 'Declaration summary' page
    And I should see ERROR status for transport details on the 'Declaration summary' page
    And I should see ERROR status for documents on the 'Declaration summary' page
    And I should see ERROR status for items on the 'Declaration summary' page
    And I should see ERROR status for guarantee details on the 'Declaration summary' page

    And I click on the Edit trader details link on the 'Declaration summary' page
    And I click the Change link for Do you want to add a contact? on the Trader details 'Check your answers' page
    And I choose radio option No on the 'Do you want to add a contact?' page
    And I submit on the 'Trader details Check your answers' page
    And I should see COMPLETED status for trader details on the 'Declaration summary' page

    And I click on the Edit route details link on the 'Declaration summary' page
    And I click the Change link for Do you want to add a contact for the location of goods? on the Route details 'Check your answers' page
    And I choose radio option No on the 'Do you want to add a contact for the location of goods?' page
    And I submit on the 'Route details Check your answers' page
    And I should see COMPLETED status for route details on the 'Declaration summary' page

    And I click on the Edit transport details link on the 'Declaration summary' page
    And I click the Change link for Do you want to add a method of payment for transport charges? on the Transport details 'Check your answers' page
    And I choose radio option No on the 'Do you want to add a method of payment for transport charges?' page
    And I submit on the 'Transport details Check your answers' page
    And I should see COMPLETED status for transport details on the 'Declaration summary' page

    And I click on the Edit documents link on the 'Declaration summary' page
    And I wait for 10000 seconds
    And I click the Change link on the 'You have added 1 document' page
    And I click the Change link for Do you want to add a goods item number? on the Documents 'Check your answers' page
    And I choose radio option No on the 'Do you want to add a goods item number?' page
    And I submit on the 'Documents Check your answers' page
    And I choose radio option No on the 'You have added 1 document' page
    And I should see COMPLETED status for document details on the 'Declaration summary' page

#    And I click on the Edit items link on the 'Declaration summary' page
#    And I click the Change link on the 'You have added 1 item' page
#    And I click the Change link for Does the item contain any dangerous goods? on the Item 1 'Check your answers' page
#    And I click radio option No on the 'Does the item contain any dangerous goods?' page
#    And I submit on the 'Item 1 Check your answers' page
#    And I choose radio option No on the 'You have added 1 item' page
#    And I should see COMPLETED status for item details on the 'Declaration summary' page
#
#    And I click on the Edit guarantee details link on the 'Declaration summary' page
#    And I click the Change link on the 'You have added 1 guarantee' page
#    And I click the Change link for Liability currency on the Guarantee details 'Check your answers' page
#    And I select EUR on the 'What currency do you want to use for the liability?' page
#    And I submit on the 'Guarantee details Check your answers' page
#    And I choose radio option No on the 'You have added 1 guarantee' page
#    And I should see COMPLETED status for guarantee details on the 'Declaration summary' page
    And I sign out
