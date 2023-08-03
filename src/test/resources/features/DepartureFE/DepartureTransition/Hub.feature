@departureHubTransition

Feature: Hub journey (pre-task list and declaration) - Transition

  Background:
    Given I login with ID 1234567890
    When I click on the Make a departure declaration link on the 'Manage your transit movements' page
    Then I input a random LRN on the 'What is the Local Reference Number?' page

  Scenario: 01 Great Britain office of departure (simplified)
    And I select GB on the 'Where is the office of departure?' page
    And I choose radio option Simplified on the 'Which type of procedure are you using?' page
    And I choose radio option T2 on the 'Which type of declaration do you want to create?' page
    And I choose radio option Exit summary declaration (EXS) on the 'Which type of safety and security details do you want to add?' page
    And I submit the 'Check your answers' page

    Then I should be on the 'Declaration summary' page
    And I sign out

  Scenario: 02 Great Britain office of departure (normal)
    And I select GB on the 'Where is the office of departure?' page
    And I choose radio option Normal on the 'Which type of procedure are you using?' page
    And I choose radio option T1 on the 'Which type of declaration do you want to create?' page
    And I choose radio option No security on the 'Which type of safety and security details do you want to add?' page
    And I submit the 'Check your answers' page

    Then I should be on the 'Declaration summary' page
    And I sign out

  Scenario: 03 Northern Ireland office of departure
    And I select XI on the 'Where is the office of departure?' page
    And I choose radio option Normal on the 'Which type of procedure are you using?' page
    And I choose radio option TIR on the 'Which type of declaration do you want to create?' page
    And I enter 1234567 on the 'What is the TIR carnet reference?' page
    And I choose radio option Entry summary declaration (ENS) on the 'Which type of safety and security details do you want to add?' page
    And I submit the 'Check your answers' page

    Then I should be on the 'Declaration summary' page
    And I sign out
