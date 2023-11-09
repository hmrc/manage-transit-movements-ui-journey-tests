@departureGuaranteeDetails

Feature: Guarantee details journey

  Background:
    Given I login with ID 1234567890

  Scenario: 01 Great Britain office of departure

    And the user has submitted guaranteeDetailsGB.json for LRN 1234567890GDGB and EORI number 1234567890
    And I refresh the page
    When I click on the View draft departure declarations link on the 'Manage your transit movements' page
    Then I click on the link for LRN 1234567890GDGB on the 'Draft departure declarations' page
    Then I should be on the 'Declaration summary' page
    And I click the Add guarantee details link on the 'Declaration summary' page

    And I choose radio option (A) Guarantee waiver by agreement on the 'Which type of guarantee is it?' page
    And I choose radio option Yes on the 'You have added 1 guarantee' page
    And I choose radio option (1) Comprehensive guarantee on the 'Which type of guarantee is it?' page
    And I enter 01GB1234567890120A123456 on the 'What is the Guarantee Reference Number?' page
    And I select GBP on the 'What currency do you want to use for the liability?' page
    And I enter 0 on the 'How much is the liability in pounds?' page
    And I choose radio option No on the 'Do you want to use the default liability amount of 10000 euros?' page
    And I enter 120 on the 'How much is the liability in pounds?' page
    And I enter AC01 on the 'What is the access code?' page
    And I submit on the Check your answers section Guarantee details page
    And I click the Remove link on the 'You have added 2 guarantees' page
    And I choose radio option Yes on the 'Are you sure you want to remove this guarantee?' page
    And I choose radio option Yes on the 'You have added 1 guarantee' page
    And I choose radio option (8) Guarantee not required – exempt public body on the 'Which type of guarantee is it?' page
    And I enter 01GB123456789012 on the 'What is the reference?' page
    And I select GBP on the 'What currency do you want to use for the liability?' page
    And I enter 0 on the 'How much is the liability in pounds?' page
    And I choose radio option No on the 'Do you want to use the default liability amount of 10000 euros?' page
    And I enter 123.00 on the 'How much is the liability in pounds?' page
    And I submit on the Check your answers section Guarantee details page
    And I choose radio option Yes on the 'You have added 2 guarantees' page
    And I choose radio option (3) Individual guarantee in cash on the 'Which type of guarantee is it?' page
    And I choose radio option Yes on the 'Do you want to add a reference for the guarantee?' page
    And I enter 01GB123456789012 on the 'What is the reference for the guarantee?' page
    And I select GBP on the 'What currency do you want to use for the liability?' page
    And I enter 0 on the 'How much is the liability in pounds?' page
    And I choose radio option No on the 'Do you want to use the default liability amount of 10000 euros?' page
    And I enter 54.99 on the 'How much is the liability in pounds?' page
    And I submit on the Check your answers section Guarantee details page
    And I choose radio option Yes on the 'You have added 3 guarantees' page
    And I choose radio option (5) Guarantee waiver – secured for 500 euros or less on the 'Which type of guarantee is it?' page
    And I select GBP on the 'What currency do you want to use for the liability?' page
    And I enter 54.99 on the 'How much is the liability in pounds?' page
    And I submit on the Check your answers section Guarantee details page
    And I choose radio option No on the 'You have added 4 guarantees' page

    Then I should be on the 'Declaration summary' page
    And I should see COMPLETED status for guarantee details on the 'Declaration summary' page
    And I sign out

  Scenario: 02 Northern Ireland office of departure

    And the user has submitted guaranteeDetailsXI.json for LRN 1234567890GDXI and EORI number 1234567890
    And I refresh the page
    When I click on the View draft departure declarations link on the 'Manage your transit movements' page
    Then I click on the link for LRN 1234567890GDXI on the 'Draft departure declarations' page
    Then I should be on the 'Declaration summary' page
    And I click the Add guarantee details link on the 'Declaration summary' page

    Then I click the Continue button on the 'Guarantee added for TIR declaration' page

    Then I should be on the 'Declaration summary' page
    And I should see COMPLETED status for guarantee details on the 'Declaration summary' page
    And I sign out
