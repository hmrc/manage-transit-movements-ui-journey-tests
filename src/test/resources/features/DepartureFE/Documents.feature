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
#  CTCP-1943 What previous document do you want to add? CL214
#  CTCP-1946 What is the document’s reference number?
#  CTCP-1947 Do you want to add a goods item number? YES
#  CTCP-1952 What is the goods item number?
#  CTCP-1948 Do you want to declare the package the goods arrived in?
#  CTCP-1949 What type of package did the goods arrive in?
#  CTCP-1981 Do you want to add a package to the document?
#  CTCP-1982 How many of these were there?
#  CTCP-1953 Do you want to declare the quantity of goods?
#  CTCP-1950 How many of these do the goods include?
#  CTCP-1951 What metric do you want to use for the quantity of goods?
#  CTCP-1969 Check your answers –  Previous Documents
#  CTCP-1970 You have added 1 document YES
#  CTCP-1971 Are you sure you want to remove the [document_type]? YES

    When I click the Add documents link on the 'Declaration summary' page
    Then I select (T2L) T2L on the 'What previous document do you want to add?' page
    And I enter 1234 on the 'What is the document’s reference number?' page
    And I click radio option Yes on the 'Do you want to add a goods item number?' page
    And I enter 1234 on the documents 'What is the goods item number?' page
    And I click radio option Yes on the 'Do you want to declare the package the goods arrived in?' page
    Then I select (BG) Bag on the 'What type of package did the goods arrive in?' page
#    And I sign out



  Scenario: 02 Departure Office 'GB' - Declaration 'T' - Documents - 'Transport'
    And I select GB on the 'Where is the office of departure?' page
    And I choose radio option Normal on the 'What type of procedure are you using?' page
    And I choose radio option T on the 'What declaration do you want to create?' page
    And I choose radio option No security on the 'What type of safety and security details do you need to add?' page
    And I submit the 'Check your answers' page

    # Documents - Transport document
#  CTCP-1968 What type of document do you want to add? CL754
#  CTCP-1946/2025 What is the document’s reference number?
#  CTCP-2026 Check your answers - Transport documents
#  CTCP-1970 You have added 1 document NO

    When I click the Add documents link on the 'Declaration summary' page
    Then I select (235) Container list on the 'What type of document do you want to add?' page
    And I enter 1234 on the 'What is the document’s reference number?' page
    #And I sign out



  Scenario: 03 Departure Office 'XI' - Declaration 'TIR' - Documents - 'Supporting'
    And I select XI on the 'Where is the office of departure?' page
    And I choose radio option Normal on the 'What type of procedure are you using?' page
    And I choose radio option TIR on the 'What declaration do you want to create?' page
    And I enter 1234567 on the 'What is the TIR carnet reference?' page
    And I choose radio option Entry summary declaration (ENS) on the 'What type of safety and security details do you need to add?' page
    And I submit the 'Check your answers' page

   # Documents - Supporting document
#  CTCP-1968 What type of document do you want to add? CL213
#  CTCP-1946/2011 What is the document’s reference number?
#  CTCP-2014 Do you want to add a line item number? YES
#  CTCP-2015 What is the line item number?
#  CTCP-2019 Check your answers - Supporting documents
#  CTCP-1970 You have added 1 document NO

    When I click the Add documents link on the 'Declaration summary' page
    Then I select (3) Certificate of quality on the 'What type of document do you want to add?' page
    And I enter 1234 on the 'What is the document’s reference number?' page
    #And I sign out













