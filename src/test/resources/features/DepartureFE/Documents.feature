@departureDocuments
Feature: Journeys for Previous, Transport & Supporting documents

  Background:
    Given I login with ID 1234567890

  Scenario: 01 Departure Office 'GB' - Declaration 'T2' - Documents - 'Previous'
    And the user has submitted documentsGB1.json for LRN 1234567890DGB1 and EORI number 1234567890
    And I refresh the page
    When I click on the View draft departure declarations link on the 'Manage your transit movements' page
    Then I click on the link for LRN 1234567890DGB1 on the 'Draft departure declarations' page
    Then I should be on the 'Declaration summary' page

    # Documents - Previous document
    When I click the Add documents link on the 'Declaration summary' page
    And I click radio option No on the 'Do you want to use this document for all items?' page
    Then I select (C605) Information sheet INF3 on the 'What previous document do you want to add?' page
    And I enter 1234 on the 'What is the document’s reference number?' page
    And I click radio option Yes on the 'Do you want to declare the package used to transport the goods into the UK?' page
    And I select (BG) Bag on the 'What type of package was used to transport the goods into the UK?' page
    And I click radio option Yes on the 'Do you want to declare the quantity of this package?' page
    And I enter 50 on the documents 'How many of these were there?' page
    And I click radio option Yes on the 'Do you want to declare the quantity of goods?' page
    And I select (GRM) Gram on the 'What metric do you want to use for the quantity of goods?' page
    And I enter 1500 on the 'How many of these do the goods include?' page
    And I click radio option Yes on the 'Do you want to add any additional information for this document?' page
    And I enter 12345 on the Documents 'Enter the additional information' page
    And I submit on the 'Documents Check your answers' page
    And I choose radio option Yes on the 'You have added 1 document' page
    And I click radio option No on the 'Do you want to use this document for all items?' page
    And I select (C673) Catch certificate on the 'What type of document do you want to add?' page
    And I enter 98765 on the 'What is the document’s reference number?' page
    And I click radio option Yes on the 'Do you want to add a line item number?' page
    And I enter 010101 on the 'What is the line item number?' page
    And I click radio option Yes on the 'Do you want to add any additional information for this document?' page
    And I enter 12345 on the Documents 'Enter the additional information' page
    And I submit on the 'Documents Check your answers' page
    When I choose to click on the Remove link on the 'You have added 2 documents' page
    And I click radio option Yes on the 'Are you sure you want to remove the (C673) Catch certificate?' page
    Then I choose radio option No on the 'You have added 1 documents' page
    And I sign out


  Scenario: 02 Departure Office 'GB' - Declaration 'T' - Documents - 'Transport'
    And the user has submitted documentsGB2.json for LRN 1234567890DGB2 and EORI number 1234567890
    And I refresh the page
    When I click on the View draft departure declarations link on the 'Manage your transit movements' page
    Then I click on the link for LRN 1234567890DGB2 on the 'Draft departure declarations' page
    Then I should be on the 'Declaration summary' page

    # Documents - Transport document
    When I click the Add documents link on the 'Declaration summary' page
    And I click radio option Yes on the 'Do you want to add any documents?' page
    And I click radio option Yes on the 'Do you want to use this document for all items?' page
    Then I select (C605) Information sheet INF3 on the 'What type of document do you want to add?' page
    And I enter 1234 on the 'What is the document’s reference number?' page
    And I click radio option Yes on the 'Do you want to add any additional information for this document?' page
    And I enter 12345 on the Documents 'Enter the additional information' page
    And I submit on the 'Documents Check your answers' page
    And I choose radio option No on the 'You have added 1 document' page
    And I sign out


  Scenario: 03 Departure Office 'XI' - Declaration 'TIR' - Documents - 'Supporting'
    And the user has submitted documentsXI.json for LRN 1234567890DXI and EORI number 1234567890
    And I refresh the page
    When I click on the View draft departure declarations link on the 'Manage your transit movements' page
    Then I click on the link for LRN 1234567890DXI on the 'Draft departure declarations' page
    Then I should be on the 'Declaration summary' page

   # Documents - Supporting document
    When I click the Add documents link on the 'Declaration summary' page
    And I click radio option Yes on the 'Do you want to add any documents?' page
    And I click radio option Yes on the 'Do you want to use this document for all items?' page
    Then I select (C673) Catch certificate on the 'What type of document do you want to add?' page
    And I enter 1234 on the 'What is the document’s reference number?' page
    And I click radio option Yes on the 'Do you want to add a line item number?' page
    And I enter 54321 on the 'What is the line item number?' page
    And I click radio option Yes on the 'Do you want to add any additional information for this document?' page
    And I enter 12345 on the Documents 'Enter the additional information' page
    And I submit on the 'Documents Check your answers' page
    And I choose radio option No on the 'You have added 1 document' page
    And I sign out

