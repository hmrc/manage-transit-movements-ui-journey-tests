@getGuaranteeBalanceService
Feature: Get Guarantee Balance frontend journey test

  Scenario: 01 Trader is able to see their balance
    Given I login with ID 1234567890
    And I click on the Check your guarantee balance link on the 'Manage your transit movements' page
    And I enter 22GB1111111111113 on the Get Balance 'What is the Guarantee Reference Number?' page
    And I enter x906 on the Get Balance 'What is the access code?' page
    And I submit on the Get Balance 'Check your answers' page
    And I click the Check your details and try again link on the 'The Guarantee Reference Number and access code do not match' page
    And I submit on the Get Balance 'Check your answers' page
    And I click the check your details are correct and try again link on the 'We could not check your guarantee balance' page
    And I wait for 60 seconds
    And I click the change link for guarantee reference number on the 'Check your answers' page
    And I enter 22GB1111111111112 on the Get Balance 'What is the Guarantee Reference Number?' page
    And I click the change link for access code on the 'Check your answers' page
    And I enter AB12 on the Get Balance 'What is the access code?' page
    And I submit on the Get Balance 'Check your answers' page
    Then I should see a confirmation of my balance on the 'Available balance' page

    And I sign out

  Scenario: 02 Invalid guarantee type
    Given I login with ID 1234567890
    And I click on the Check your guarantee balance link on the 'Manage your transit movements' page
    And I enter 02GB1234567890120 on the Get Balance 'What is the Guarantee Reference Number?' page
    And I enter AB12 on the Get Balance 'What is the access code?' page
    And I submit on the Get Balance 'Check your answers' page
    Then I should be on the 'We cannot get the balance for this type of guarantee' page

    And I sign out