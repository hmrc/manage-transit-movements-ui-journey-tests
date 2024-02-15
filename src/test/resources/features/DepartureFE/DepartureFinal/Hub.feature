@departureHub

Feature: Hub journey (pre-task list and declaration)

  Background:
    Given I login with ID 1234567890
    When I click on the Make a departure declaration link on the 'Manage your transit movements' page
    Then I input a random LRN on the 'What is the Local Reference Number?' page

  Scenario: 01 Great Britain office of departure (simplified)
    And I choose radio option A on the 'Is this a standard or pre-lodged declaration?' page
    And I select GB on the 'Where is the office of departure?' page
    And I choose radio option Simplified on the 'Which type of procedure are you using?' page
    And I choose radio option T2 on the 'Which type of declaration do you want to create?' page
    And I choose radio option Exit summary declaration (EXS) on the 'Which type of safety and security details do you want to add?' page
    And I submit the 'Check your answers' page

    Then I should be on the 'Declaration summary' page
    And I sign out

  Scenario: 02 Great Britain office of departure (normal)
    And I choose radio option A on the 'Is this a standard or pre-lodged declaration?' page
    And I select GB on the 'Where is the office of departure?' page
    And I choose radio option Normal on the 'Which type of procedure are you using?' page
    And I choose radio option T1 on the 'Which type of declaration do you want to create?' page
    And I choose radio option No security on the 'Which type of safety and security details do you want to add?' page
    And I submit the 'Check your answers' page

    Then I should be on the 'Declaration summary' page
    And I sign out

  Scenario: 03 Northern Ireland office of departure
    And I choose radio option A on the 'Is this a standard or pre-lodged declaration?' page
    And I select XI on the 'Where is the office of departure?' page
    And I choose radio option Normal on the 'Which type of procedure are you using?' page
    And I choose radio option TIR on the 'Which type of declaration do you want to create?' page
    And I enter 1234567 on the 'What is the TIR carnet reference?' page
    And I choose radio option Entry summary declaration (ENS) on the 'Which type of safety and security details do you want to add?' page
    And I submit the 'Check your answers' page

    Then I should be on the 'Declaration summary' page
    And I sign out

  Scenario: 04 Draft Declaration Journey
    Given I login with ID 1234567890
    When I click on the Make a departure declaration link on the 'Manage your transit movements' page
    Then I enter 1234567890ABCDEFGHIJKL on the 'What is the Local Reference Number?' page
    And I choose radio option A on the 'Is this a standard or pre-lodged declaration?' page
    And I select XI on the 'Where is the office of departure?' page
    And I choose radio option Normal on the 'Which type of procedure are you using?' page
    And I choose radio option TIR on the 'Which type of declaration do you want to create?' page
    And I enter 1234567 on the 'What is the TIR carnet reference?' page
    And I choose radio option Entry summary declaration (ENS) on the 'Which type of safety and security details do you want to add?' page
    And I submit the 'Check your answers' page
    And I click the Add guarantee details link on the 'Declaration summary' page
    Then I click the Continue button on the 'Guarantee added for TIR declaration' page
    And I click on the Back to transit movements link on the 'Declaration summary' page
    And I click on the View draft departure declarations link on the 'Manage your transit movements' page
    And I click on the Delete link on the 'Draft departure declarations' page
    And I click radio option Yes on the 'Are you sure you want to delete this declaration?' page
    And I sign out