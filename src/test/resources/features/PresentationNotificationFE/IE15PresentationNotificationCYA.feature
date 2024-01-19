@presentationNotificationIe15 @a11y

Feature: Trader sends in fully complete IE015 to goes to the CYA page

  Background: I log on to the Manage Transit Movements Hub service
    Given I login with ID 1234567890
    When I submit an IE015 Normal Prelodged Departure Declaration Complete
    Then I submit an IE928 Positive Acknowledgment
    And I refresh the page
    And I click on the View departure declarations link on the 'Manage your transit movements' page
    And I click on the Complete declaration link for LRN 38VYQTYFU3T0KUTUM3 on the 'Departure declarations' page
    Then I should be on the 'Confirmation needed to complete declaration' page
    And I click the Continue button on the presentation 'Confirmation needed to complete declaration' page

  Scenario: 01 Full Simplified e2e journey with security type 1 - answer 'YES' to all optional questions
    Given I should be on the Presentation Notification 'Check your answers' page

