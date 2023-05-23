@departureDocuments
Feature: Journeys for Previous, Transport & Supporting documents

  Background:
    Given I login with ID 1234567890
    When I click on the Make a departure declaration link on the 'Manage your transit movements' page
    Then I input a random LRN on the 'What is the Local Reference Number?' page


  Scenario: 01 Departure Office 'GB' - Declaration 'T2' - Documents - 'Previous'
    And I select GB on the 'Where is the office of departure?' page
    And I choose radio option Simplified on the 'What type of procedure are you using?' page
    And I choose radio option T2 on the 'What declaration do you want to create?' page
    And I choose radio option Exit summary declaration (EXS) on the 'What type of safety and security details do you need to add?' page
    And I submit the 'Check your answers' page


    # Documents - Previous document
    When I click the Add documents link on the 'Declaration summary' page
    And I click radio option No on the 'Do you want to use this document for all items?' page
    Then I select (T2L) T2L on the 'What previous document do you want to add?' page
    And I enter 1234 on the 'What is the document’s reference number?' page
    And I click radio option Yes on the 'Do you want to add a goods item number?' page
    And I enter 1234 on the documents 'What is the goods item number?' page
    And I click radio option Yes on the 'Do you want to declare the package the goods arrived in?' page
    And I select (BG) Bag on the 'What type of package did the goods arrive in?' page
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
    And I select (380) Commercial invoice on the 'What type of document do you want to add?' page
    And I enter 98765 on the 'What is the document’s reference number?' page
    And I click radio option Yes on the 'Do you want to add a line item number?' page
    And I enter 010101 on the 'What is the line item number?' page
    And I click radio option Yes on the 'Do you want to add any additional information for this document?' page
    And I enter 12345 on the Documents 'Enter the additional information' page
    And I submit on the 'Documents Check your answers' page
    When I choose to click on the Remove link on the 'You have added 2 documents' page
    And I click radio option Yes on the 'Are you sure you want to remove the (380) Commercial invoice?' page
    Then I choose radio option No on the 'You have added 1 documents' page
    And I sign out


  Scenario: 02 Departure Office 'GB' - Declaration 'T' - Documents - 'Transport'
    And I select GB on the 'Where is the office of departure?' page
    And I choose radio option Normal on the 'What type of procedure are you using?' page
    And I choose radio option T on the 'What declaration do you want to create?' page
    And I choose radio option No security on the 'What type of safety and security details do you need to add?' page
    And I submit the 'Check your answers' page

    # Documents - Transport document
    When I click the Add documents link on the 'Declaration summary' page
    And I click radio option Yes on the 'Do you want to use this document for all items?' page
    Then I select (T1) Document T1 on the 'What type of document do you want to add?' page
    And I enter 1234 on the 'What is the document’s reference number?' page
    And I click radio option Yes on the 'Do you want to add any additional information for this document?' page
    And I enter 12345 on the Documents 'Enter the additional information' page
    And I submit on the 'Documents Check your answers' page
    And I choose radio option No on the 'You have added 1 document' page
    And I sign out


  Scenario: 03 Departure Office 'XI' - Declaration 'TIR' - Documents - 'Supporting'
    And I select XI on the 'Where is the office of departure?' page
    And I choose radio option Normal on the 'What type of procedure are you using?' page
    And I choose radio option TIR on the 'What declaration do you want to create?' page
    And I enter 1234567 on the 'What is the TIR carnet reference?' page
    And I choose radio option Entry summary declaration (ENS) on the 'What type of safety and security details do you need to add?' page
    And I submit the 'Check your answers' page

   # Documents - Supporting document
    When I click the Add documents link on the 'Declaration summary' page
    And I click radio option Yes on the 'Do you want to use this document for all items?' page
    Then I select (3) Certificate of quality on the 'What type of document do you want to add?' page
    And I enter 1234 on the 'What is the document’s reference number?' page
    And I click radio option Yes on the 'Do you want to add a line item number?' page
    And I enter 54321 on the 'What is the line item number?' page
    And I click radio option Yes on the 'Do you want to add any additional information for this document?' page
    And I enter 12345 on the Documents 'Enter the additional information' page
    And I submit on the 'Documents Check your answers' page
    And I choose radio option No on the 'You have added 1 document' page
    And I sign out













