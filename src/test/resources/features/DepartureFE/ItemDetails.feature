@departureItemDetails
Feature: Transport details journey

  Background:
    Given I login with ID 1234567890

  Scenario: 01 Great Britain office of departure
    And the user has submitted itemDetailsGB.json for LRN 1234567890TDGB and EORI number 1234567890
    And I refresh the page
    When I click on the View draft departure declarations link on the 'Manage your transit movements' page
    Then I click on the link for LRN 1234567890TDGB on the 'Draft departure declarations' page
    Then I should be on the 'Declaration summary' page

    ## Item details
    When I click the link with visible text: Add items on the 'Declaration summary' page
    And I enter This is a description on the 'Enter a description of item 1' page
    And I choose radio option T1 on the 'Which type of declaration do you want to create for this item?' page
    And I select Italy on the 'What is the item’s country of destination?' page
    And I enter UCR12312 on the 'What is the Unique Consignment Reference?' page
    #And I sign out




  Scenario: 02 Northern Ireland office of departure
    And the user has submitted itemDetailsXI.json for LRN 1234567890TDXI and EORI number 1234567890
    And I refresh the page
    When I click on the View draft departure declarations link on the 'Manage your transit movements' page
    Then I click on the link for LRN 1234567890TDXI on the 'Draft departure declarations' page
    Then I should be on the 'Declaration summary' page

    ## Item details
    When I click the link with visible text: Add items on the 'Declaration summary' page
    And I enter This is a description on the 'Enter a description of item 1' page
    And I select United Kingdom on the 'What is the item’s country of dispatch?' page
    And I select Italy on the 'What is the item’s country of destination?' page
    And I enter UCR12312 on the 'What is the Unique Consignment Reference?' page
    #And I sign out
