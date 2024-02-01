@presentationNotificationIe15 @a11y

Feature: Trader sends in fully complete IE015 to goes to the CYA page

  Background: I log on to the Manage Transit Movements Hub service
    Given I login with ID 123456789
    When I submit an IE015 Normal Prelodged Departure Declaration Complete
    Then I submit an IE928 Positive Acknowledgment
    And I refresh the page
    And I click on the View departure declarations link on the 'Manage your transit movements' page
    And I click on the Complete declaration link for LRN 38VYQTYFU3T0KUTUM3 on the 'Departure declarations' page
    Then I should be on the 'Confirmation needed to complete declaration' page
    And I click the Continue button on the presentation 'Confirmation needed to complete declaration' page

  Scenario: 01 Normal prelodge departure declaration complete for representative section
    Given I should be on the Presentation Notification 'Check your answers' page
    And I click the Change link for acting as representative on the 'Check your answers' page
    And I choose radio option Yes on the presentation 'Are you acting as a representative?' page
    And I enter FR123123132 on the presentation representative 'What is your EORI number or TIN?' page
    And I choose radio option Yes on the presentation representative 'Do you want to add your details?' page
    And I enter Marie Rep on the presentation representative 'What is your name?' page
    And I enter +11 1111 1111 on the presentation representative 'What is your phone number?' page
    Then I should be on the Presentation Notification 'Check your answers' page
    And I submit the 'Check your answers' page
    Then I should be on the 'Information sent' page

  Scenario: 02 Normal prelodge departure declaration complete for Departure means of transport section with Mode as other than Mail
    Given I should be on the Presentation Notification 'Check your answers' page
    And I click the Change link for transport inland mode on the 'Check your answers' page
    And I choose radio option Maritime on the 'Which inland mode of transport are you using?' page
    And I choose radio option Name of a sea-going vessel on the presentation departure mens of transport 'Which identification do you want to use for the departure means of transport?' page
    And I enter registration number GB1234567 on the presentation 'What is the identification number for the departure means of transport?' page
    And I select United Kingdom on the presentation 'What country is the departure means of transport registered to?' page
    Then I should be on the Presentation Notification 'Check your answers' page
    And I submit the 'Check your answers' page
    Then I should be on the 'Information sent' page


  Scenario: 03 Normal prelodge departure declaration complete for inland mode of transport section with mode as Mail
    Given I should be on the Presentation Notification 'Check your answers' page
    And I click the Change link for transport inland mode on the 'Check your answers' page
    And I choose radio option Mail on the 'Which inland mode of transport are you using?' page
    Then I should be on the Presentation Notification 'Check your answers' page
    And I submit the 'Check your answers' page
    Then I should be on the 'Information sent' page



