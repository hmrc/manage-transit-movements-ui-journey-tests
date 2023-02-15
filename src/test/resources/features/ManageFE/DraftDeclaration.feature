@manageDraftDeparture
Feature: Journey to test a draft departure in the Manage Transit Movements frontend

  Scenario: 01 User starts a departure declaration, signs out, then returns to continue the declaration on a subsequent login before deleting the draft
    Given I login with ID 1234567890
    When I click on the Make a departure declaration link on the 'Manage your transit movements' page
    Then I enter 1234567890ABCDEFGHIJKL on the 'What is the Local Reference Number?' page
    And I select XI on the 'Where is the office of departure?' page
    And I choose radio option Normal on the 'What type of procedure are you using?' page
    And I choose radio option TIR on the 'What declaration do you want to create?' page
    And I sign out

    Given I login with ID 1234567890
    When I click on the View draft departure declarations link on the 'Manage your transit movements' page
    Then I enter 1234567890ABCDEFGHIJKL in the Search field on the 'Draft departure declarations' page
    And I should see the content Showing 1 result matching 1234567890ABCDEFGHIJKL on the 'Draft departure declarations' page
    Then I click on the link for LRN 1234567890ABCDEFGHIJKL on the 'Draft departure declarations' page
    And I enter 1234567 on the 'What is the TIR carnet reference?' page
    And I choose radio option Entry summary declaration (ENS) on the 'What type of safety and security details do you need to add?' page
    And I submit the 'Check your answers' page
    And I sign out

    Given I login with ID 1234567890
    When I click on the View draft departure declarations link on the 'Manage your transit movements' page
    Then I click on the link for LRN 1234567890ABCDEFGHIJKL on the 'Draft departure declarations' page

    And I click the link with visible text: Add guarantee details on the 'Declaration summary' page
    Then I click the Continue button on the 'Guarantee added for TIR declaration' page

    And I click on the Back to transit movements link on the 'Declaration summary' page
    And I click on the View draft departure declarations link on the 'Manage your transit movements' page
    And I click on the Delete link on the 'Draft departure declarations' page
    And I click radio option Yes on the 'Are you sure you want to delete this declaration?' page
    And I sign out
