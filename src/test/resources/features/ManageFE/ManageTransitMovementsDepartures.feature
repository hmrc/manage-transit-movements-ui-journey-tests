@managehub

Feature: Manage transit movements frontend tests for Departures

  Background: I log on to the Manage Transit Movements Hub service
    Given I login with ID 1234567890


  Scenario: 01 - Trader is able to make a departure declaration from home page
    When I click on the Make a departure declaration link on the 'Manage your transit movements' page
    Then I should be on the 'What is the Local Reference Number?' page
    And I sign out


  Scenario: 02 - Trader is able to view a draft departure declaration and delete it
    When I click on the Make a departure declaration link on the 'Manage your transit movements' page
    Then I enter 1234567890ABCDEFGHIJKL on the 'What is the Local Reference Number?' page
    And I sign out
    Given I login with ID 1234567890
    When I click on the View draft departure declarations link on the 'Manage your transit movements' page
    And I click on the Delete link on the 'Draft departure declarations' page
    And I click radio option Yes on the 'Are you sure you want to delete this declaration?' page
    And I sign out


  Scenario: 03 - Trader is able to see a control decision notification IE060 with documents
    When I submit an IE015 Departure Declaration
    Then I submit an IE060 Control Decision Notification With Documents
    And I refresh the page
    And I click on the View departure declarations link on the 'Manage your transit movements' page
    And I click on the View details link for LRN 38VYQTYFU3T0KUTUM3 on the 'Departure declarations' page
    Then I should be on the 'Goods under control - document requested' page
    And I sign out


  Scenario: 04 - Trader is able to see a control decision notification IE060 with no documents
    When I submit an IE015 Departure Declaration
    Then I submit an IE060 Control Decision Notification With No Documents
    And I refresh the page
    And I click on the View departure declarations link on the 'Manage your transit movements' page
    And I click on the View details link for LRN 38VYQTYFU3T0KUTUM3 on the 'Departure declarations' page
    Then I should be on the 'Goods under control' page
    And I sign out

# 2795
  Scenario: 05 - Trader is able to review declaration errors for a departure declaration
    When I submit an IE015 Departure Declaration
    Then I submit an IE056 Rejection With No Amendable Errors
    And I refresh the page
    And I click on the View departure declarations link on the 'Manage your transit movements' page
    And I click on the View errors link for LRN 38VYQTYFU3T0KUTUM3 on the 'Departure declarations' page
    Then I should be on the 'Review declaration errors' page
    And I sign out

# 2796
  Scenario: 06 - Trader is able to amend a declaration error for a departure declaration before MRN allocation
    When I submit an IE015 Departure Declaration
    Then I submit an IE056 Rejection With Amendable Errors
    And the user has submitted departureDeclaration.json for LRN 38VYQTYFU3T0KUTUM3 and EORI number 1234567890
    And I refresh the page
    And I click on the View departure declarations link on the 'Manage your transit movements' page
    And I click on the Amend declaration link for LRN 38VYQTYFU3T0KUTUM3 on the 'Departure declarations' page
    And I click on the Amend errors button on the 'Amend declaration errors' page
    Then I should be on the 'Declaration summary' page
    And I sign out

# 3817
  Scenario: 07 - Trader is able to amend a declaration error for a departure declaration after MRN allocation
    When I submit an IE015 Departure Declaration
    Then I submit an IE028 MRN Allocated
    And I submit an IE056 Rejection With Amendable Errors
    And the user has submitted departureDeclaration.json for LRN 38VYQTYFU3T0KUTUM3 and EORI number 1234567890
    And I refresh the page
    And I click on the View departure declarations link on the 'Manage your transit movements' page
    And I click on the Amend declaration link for LRN 38VYQTYFU3T0KUTUM3 on the 'Departure declarations' page
    And I click on the Amend errors button on the 'Amend declaration errors' page
    Then I should be on the 'What is the new Local Reference Number?' page
    And I sign out


  Scenario: 08 - Trader is able to review errors for a amended departure declaration with no functional errors
    When I submit an IE015 Departure Declaration
    Then I submit an IE013 Declaration Amendment
    And I submit an IE056 Amendment Rejection With NO Amendable Errors
    And I refresh the page
    And I click on the View departure declarations link on the 'Manage your transit movements' page
    And I click on the View errors link for LRN 38VYQTYFU3T0KUTUM3 on the 'Departure declarations' page
    Then I should be on the 'Declaration errors' page
    And I sign out


# 2898
  Scenario: 09 - Trader is able to review cancellation errors for a departure declaration
    When I submit an IE015 Departure Declaration
    Then I submit an IE014 Declaration Cancellation
    And I submit an IE056 Cancellation Rejection With No Amendable Errors
    And I refresh the page
    And I click on the View departure declarations link on the 'Manage your transit movements' page
    And I click on the View errors link for LRN 38VYQTYFU3T0KUTUM3 on the 'Departure declarations' page
    Then I should be on the 'Review cancellation errors' page
    And I sign out

# 3000
  Scenario: 10 Trader is able to cancel a departure declaration
    When I submit an IE015 Departure Declaration
    Then I submit an IE028 MRN Allocated
    Then I refresh the page
    And I click on the View departure declarations link on the 'Manage your transit movements' page
    And I click on the Cancel declaration link for LRN 38VYQTYFU3T0KUTUM3 on the 'Departure declarations' page
    And I sign out

# TODO Pre-lodge
#  Scenario: 10 Trader completes a departure declaration that was previously pre-lodged
#    When I submit an IE015 Prelodged Departure Declaration
#    Then I submit an IE928 Positive Acknowledgment
#    And I refresh the page
#    And I click on the View departure declarations link on the 'Manage your transit movements' page
#    And I click on the Complete pre lodged declaration link for LRN 38VYQTYFU3T0KUTUM3 on the 'Departure declarations' page


# TODO Pre-lodge
#  Scenario: 11 Trader is sent to declaration completed page for a pre-lodge declaration where all details were completed initially
#    When I submit an IE015 Normal Prelodged Departure Declaration Complete
#    Then I submit an IE928 Positive Acknowledgment
#    And I refresh the page
#    And I click on the View departure declarations link on the 'Manage your transit movements' page
#    And I click on the Complete pre lodged declaration link for LRN 38VYQTYFU3T0KUTUM3 on the 'Departure declarations' page
#    Then I should be on the 'Confirmation needed to complete pre-lodged declaration' page
#    And I click the Continue button on the presentation 'Confirmation needed to complete pre-lodged declaration' page
#    Then I should be on the Presentation Notification 'Check your answers' page

# TODO Pre-lodge
#  Scenario: 12 Trader is sent to declaration completed page for a pre-lodge declaration where all details were completed initially
#    When I submit an IE015 Normal Prelodged Departure Declaration Complete
#    Then I submit an IE928 Positive Acknowledgment
#    Then I submit an IE060 Control Decision Type 2
#    And I refresh the page
#    And I click on the View departure declarations link on the 'Manage your transit movements' page
#    And I click on the View details link for LRN 38VYQTYFU3T0KUTUM3 on the 'Departure declarations' page
#    Then I should be on the 'Intention to control - complete pre-lodged declaration' page
#    And I sign out

  Scenario: 13 Trader receives IE056 with no functional errors after submitting an IE170
    When I submit an IE015 Normal Prelodged Departure Declaration Complete
    Then I submit an IE928 Positive Acknowledgment
    Then I submit an IE170 Presentation Notification PreLodge
    Then I submit an IE056 Rejection Of IE170 No Errors
    And I refresh the page
    And I click on the View departure declarations link on the 'Manage your transit movements' page
    And I click on the View errors link for LRN 38VYQTYFU3T0KUTUM3 on the 'Departure declarations' page
    And I click on the Complete pre-lodged declaration link on the 'Prelodged declaration errors' page
    Then I should be on the 'More information needed to complete pre-lodged declaration' page
    And I sign out

  Scenario: 14 Trader receives IE056 with functional errors after submitting an IE170
    When I submit an IE015 Normal Prelodged Departure Declaration Complete
    Then I submit an IE928 Positive Acknowledgment
    Then I submit an IE170 Presentation Notification PreLodge
    Then I submit an IE056 Rejection Of IE170 With Errors
    And I refresh the page
    And I click on the View departure declarations link on the 'Manage your transit movements' page
    And I click on the View errors link for LRN 38VYQTYFU3T0KUTUM3 on the 'Departure declarations' page
    Then I should be on the 'Review prelodged declaration errors' page
    And I sign out

  # 4085
  Scenario: 15 Trader is able to review IE035 message details for Goods being recovered
    When I submit an IE015 Departure Declaration
    Then I submit an IE035 Recovery Notification
    And I refresh the page
    And I click on the View departure declarations link on the 'Manage your transit movements' page
    And I click on the View details link for LRN 38VYQTYFU3T0KUTUM3 on the 'Departure declarations' page
    Then I should be on the 'Goods being recovered' page
    And I sign out


  # 4039
  Scenario: 16 Trader is able to review IE051 message details for Goods not released
    When I submit an IE015 Departure Declaration
    Then I submit an IE051 No Release For Transit
    And I refresh the page
    And I click on the View departure declarations link on the 'Manage your transit movements' page
    And I click on the View details link for LRN 38VYQTYFU3T0KUTUM3 on the 'Departure declarations' page
    Then I should be on the 'Goods not released' page
    And I sign out

    #ToDo This test will fail if ran in transition mode - will pass in pipelines as it is ran against final in those
  Scenario: 17 Trader cannot access a Transitional draft declaration when in Final mode
    And the user has submitted itemDetailsGBTransition.json for LRN 38VYQTYFU3T0KUTUM3 and EORI number 1234567890
    And I refresh the page
    When I click on the View draft departure declarations link on the 'Manage your transit movements' page
    And I click on the link for LRN 38VYQTYFU3T0KUTUM3 on the 'Draft departure declarations' page
    Then I should be on the 'This declaration is no longer available' page
    And I sign out

