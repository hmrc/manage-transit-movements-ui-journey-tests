@presentationNotification @a11y

Feature: Manage transit movements frontend tests for Departures

  Background: I log on to the Manage Transit Movements Hub service
    Given I login with ID 1234567890
# 3807
  Scenario: 01 Trader completes a Normal departure declaration that was previously pre-lodged
    When I submit an IE015 Prelodged Departure Declaration
    Then I submit an IE928 Positive Acknowledgment
    And I refresh the page
    And I click on the View departure declarations link on the 'Manage your transit movements' page
    And I click on the Complete declaration link for LRN 38VYQTYFU3T0KUTUM3 on the 'Departure declarations' page


    And I click the Continue button on the presentation 'More information needed to complete declaration' page
    And I choose radio option Approved place on the presentation 'Which type of location are the goods in?' page
    And I choose a radio option Address on the presentation 'How do you want to identify the location of goods?' page
    And I select Italy on the presentation 'In which country is the location of goods?' page
    And I fill in the address on the presentation 'What is the address for the location of goods?' page


  Scenario: 02 Trader completes a Simplified departure declaration that was previously pre-lodged
    When I submit an IE015 Simplified Prelodged Departure Declaration
    Then I submit an IE928 Positive Acknowledgment
    And I refresh the page
    And I click on the View departure declarations link on the 'Manage your transit movements' page
    And I click on the Complete declaration link for LRN 38VYQTYFU3T0KUTUM3 on the 'Departure declarations' page

    And I click the Continue button on the presentation 'More information needed to complete declaration' page
    And I enter 1234567890 on the presentation 'What is the authorisation number for the location of goods?' page