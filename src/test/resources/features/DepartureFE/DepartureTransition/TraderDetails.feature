
Feature: Trader details journey - Transition

  Background:
    Given I login with ID 1234567890

  Scenario: 01 Great Britain office of departure, T2 declaration type, exitSummaryDeclaration
  with EORI numbers, Contacts, Representatives, single Consignee

    And the user has submitted traderDetailsGBTransition.json for LRN 1234567890TDGB and EORI number 1234567890
    And I refresh the page
    When I click on the View draft departure declarations link on the 'Manage your transit movements' page
    Then I click on the link for LRN 1234567890TDGB on the 'Draft departure declarations' page
    Then I should be on the 'Declaration summary' page
    And I click the Add trader details link on the 'Declaration summary' page

      ## Transit Holder
    And I choose radio option Yes on the 'Do you know the transit holder’s EORI number?' page
    And I enter GB123456123456 on the 'What is the transit holder’s EORI number?' page

      ## Transit holder's contact person's details
    And I choose radio option Yes on the 'Do you want to add a contact for the transit holder?' page
    And I enter John contact on the 'What is the contact’s name?' page
    And I enter +2112212112 on the 'What is the phone number for the transit holder’s contact?' page

      ## Representative details
    And I choose radio option Yes on the 'Are you acting as a representative?' page
    And I enter FR123123132 on the representative 'What is your EORI number or TIN?' page
    And I choose radio option Yes on the representative 'Do you want to add your details?' page
    And I enter Marie Rep on the representative 'What is your name?' page
    And I enter +11 1111 1111 on the representative 'What is your phone number?' page

      ## Reduced data set operator (can only be true when security = 0)
    And I choose radio option Yes on the 'Do you want to use a reduced data set?' page

      ## Consignor
    And I choose radio option Yes on the 'Do you know the consignor’s EORI number or TIN?' page
    And I enter IT12312313 on the 'What is the consignor’s EORI number or TIN?' page

      ## Consignor contact
    And I choose radio option Yes on the 'Do you want to add a contact for the consignor?' page
    And I enter Pip Contact on the 'What is the contact’s name?' page
    And I enter +123123123213 on the 'What is the phone number for the consignor’s contact?' page

      ## Consignee
    And I choose radio option No on the 'Is there more than one consignee?' page
    And I choose radio option Yes on the 'Do you know the consignee’s EORI number or TIN?' page
    And I enter GE00101001 on the 'What is the consignee’s EORI number or TIN?' page

    And I submit on the Check your answers section Trader details page

    Then I should be on the 'Declaration summary' page
    And I should see Completed status for trader details on the 'Declaration summary' page
    And I sign out


  Scenario: 02 Great Britain office of departure, T2 declaration type, exitSummaryDeclaration,
  no EORI numbers, no Contacts, no Representative, single Consignee

    And the user has submitted traderDetailsGBTransition.json for LRN 1234567890TDGB and EORI number 1234567890
    And I refresh the page
    When I click on the View draft departure declarations link on the 'Manage your transit movements' page
    Then I click on the link for LRN 1234567890TDGB on the 'Draft departure declarations' page
    Then I should be on the 'Declaration summary' page
    And I click the Add trader details link on the 'Declaration summary' page

      ## Transit Holder
    And I choose radio option No on the 'Do you know the transit holder’s EORI number?' page
    And I enter Joe Blog on the 'What is the transit holder’s name?' page
    And I select United Kingdom on the 'Which country is the transit holder based in?' page
    And I fill in the address on the 'What is the transit holder’s address?' page

      ## Transit holder's contact person's details
    And I choose radio option No on the 'Do you want to add a contact for the transit holder?' page

      ## Representative details
    And I choose radio option No on the 'Are you acting as a representative?' page

      ## Reduced data set operator (can only be true when security = 0)
    And I choose radio option No on the 'Do you want to use a reduced data set?' page

      ## Consignor
    And I choose radio option No on the 'Do you know the consignor’s EORI number or TIN?' page
    And I enter Pip Consignor on the 'What is the consignor’s name?' page
    And I select United Kingdom on the 'Which country is the consignor based in?' page
    And I fill in the address on the 'What is the consignor’s address?' page

      ## Consignor contact
    And I choose radio option No on the 'Do you want to add a contact for the consignor?' page

      ## Consignee
    And I choose radio option No on the 'Is there more than one consignee?' page
    And I choose radio option No on the 'Do you know the consignee’s EORI number or TIN?' page
    And I enter Simpson Blog Consignee on the 'What is the consignee’s name?' page
    And I select United Kingdom on the 'Which country is the consignee based in?' page
    And I fill in the address on the 'What is the consignee’s address?' page

    And I submit on the Check your answers section Trader details page

    Then I should be on the 'Declaration summary' page
    And I should see Completed status for trader details on the 'Declaration summary' page
    And I sign out


  Scenario: 03 Northern Ireland office of departure, TIR declaration type, entrySummaryDeclaration,
  no EORI numbers, no Contacts, no Representative, multi Consignees

    And the user has submitted traderDetailsXITransition.json for LRN 1234567890TDXI and EORI number 1234567890
    And I refresh the page
    When I click on the View draft departure declarations link on the 'Manage your transit movements' page
    Then I click on the link for LRN 1234567890TDXI on the 'Draft departure declarations' page
    Then I should be on the 'Declaration summary' page
    And I click the Add trader details link on the 'Declaration summary' page

      ## Transit holder
   And I choose radio option Yes on the 'Do you know the transit holder’s EORI number?' page
   And I enter GB123456123456 on the 'What is the transit holder’s EORI number?' page

      ## Transit holder's contact person's details
    And I choose radio option No on the 'Do you want to add a contact for the transit holder?' page

      ## Transit holder's TIR id
    And I enter ABC/123/12345 on the 'What is the TIR holder’s identification number?' page

      ## Representative details
    And I choose radio option No on the 'Are you acting as a representative?' page

      ## Consignor
    And I choose radio option Yes on the 'Do you know the consignor’s EORI number or TIN?' page
    And I enter IT12312313 on the 'What is the consignor’s EORI number or TIN?' page

      ## Consignor contact
    And I choose radio option No on the 'Do you want to add a contact for the consignor?' page

      ## Consignee
    And I choose radio option Yes on the 'Is there more than one consignee?' page

    And I submit on the Check your answers section Trader details page

    Then I should be on the 'Declaration summary' page
    And I should see Completed status for trader details on the 'Declaration summary' page
    And I sign out

