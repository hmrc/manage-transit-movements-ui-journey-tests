@presentationNotificationIe13 @a11y

Feature: Trader completes a departure declaration that was previously pre-lodged and amended

  Background: I log on to the Manage Transit Movements Hub service
    Given I login with ID 1234567890


  Scenario: 01 Full Simplified Amend e2e journey with security type 1 - answer 'YES' to all optional questions
    When I submit an IE015 Simplified Prelodged Departure Declaration
    Then I submit an IE928 Positive Acknowledgment
    When I submit an IE013 Simplified Prelodged Departure Declaration
    Then I submit an IE004 Amendment Acceptance
    And I refresh the page
    And I click on the View departure declarations link on the 'Manage your transit movements' page
    And I click on the Complete declaration link for LRN 38VYQTYFU3T0KUTUM3 on the 'Departure declarations' page

    And I click the Continue button on the presentation 'More information needed to complete declaration' page
    And I enter 1234567890 on the presentation 'What is the authorisation number for the location of goods?' page
    And I choose radio option Yes on the presentation 'Do you want to add an additional identifier for the location of goods?' page
    And I enter x9x9 on the presentation 'What is the additional identifier for the location of goods?' page

    And I choose radio option Yes on the presentation 'Do you want to add a contact for the location of goods?' page
    And I enter Locator Joe on the presentation 'Who is the contact for the location of goods?' page
    And I enter +432 1212 1212 on the presentation 'What is the phone number for the location of goods’ contact?' page

    And I choose radio option Yes on the presentation 'Do you want to add a UN LOCODE for the place of loading?' page
    And I enter DEAAL on the presentation 'What is the UN LOCODE for the place of loading?' page
    And I choose radio option Yes on the presentation 'Do you want to add extra information for the place of loading?' page
    And I select United Kingdom on the presentation 'In which country is the place of loading?' page
    And I enter London on the presentation 'Where in United Kingdom is the place of loading?' page

    And I enter the date on the presentation 'When do you expect the transit to arrive in Amiens bureau (FR000100)?' page
    And I choose radio option Yes on the presentation 'Are you using any shipping containers to transport the goods?' page

   ##Active Means border of transport
    And I choose radio Maritime Transport on the presentation 'How is the transit crossing the border?' page
    And I choose radio Name of the sea-going vessel on the presentation inland mode 'Which identification do you want to use for this vehicle?' page
    And I enter identification number 5h1p1nn on 'What is the identification number for this?' page
    And I select United Kingdom on the active border mode 'What country is this vehicle registered to?' page
    And I select Amiens bureau (FR000100) on 'Where is the customs office at the border?' page
    And I choose radio Yes on the presentation 'Do you want to add a conveyance reference number?' page
    And I enter conveyance reference number 123456123456 on the 'What is the conveyance reference number?' page
    And I choose radio Yes on the presentation 'You have added 1 border means of transport' page

    And I choose radio IATA flight number on the presentation inland mode 'Which identification do you want to use for this vehicle?' page
    And I enter identification number YATA010 on 'What is the identification number for this?' page
    And I select United Kingdom on the active border mode 'What country is this vehicle registered to?' page
    And I select Amiens bureau (FR000100) on 'Where is the customs office at the border?' page
    And I choose radio No on the presentation 'Do you want to add a conveyance reference number?' page
    And I click the Remove link  on the 'You have added 2 border means of transport' page
    And I click radio Yes on the 'Are you sure you want to remove this border means of transport?' page
    And I choose radio Yes on the presentation 'You have added 1 border means of transport' page

    And I choose radio IATA flight number on the presentation inland mode 'Which identification do you want to use for this vehicle?' page
    And I enter identification number YATA011 on 'What is the identification number for this?' page
    And I select United Kingdom on the active border mode 'What country is this vehicle registered to?' page
    And I select Amiens bureau (FR000100) on 'Where is the customs office at the border?' page
    And I choose radio No on the presentation 'Do you want to add a conveyance reference number?' page
    And I choose radio No on the presentation 'You have added 2 border means of transport' page
    #Transport equipment
    And I enter C001 on the presentation 'What is the container identification number?' page
    And I click radio Yes on the presentation 'Do you want to add a seal?' page
    And I enter S001 on the presentation 'What is the seal identification number?' page
    And I choose radio Yes on the presentation 'You have added 1 seal' page
    And I enter S002 on the presentation 'What is the seal identification number?' page
    And I click the Remove link  on the presentation 'You have added 2 seals' page
    And I click radio option Yes on the presentation 'Are you sure you want to remove seal S001?' page
    And I choose radio No on the presentation 'You have added 1 seal' page
  Scenario: 02 Simplified Amend short journey with security type 1;  answer 'No' to all optional questions
    When I submit an IE015 Simplified Prelodged Departure Declaration Full
    Then I submit an IE928 Positive Acknowledgment
    When I submit an IE013 Simplified Prelodged Departure Declaration Full
    Then I submit an IE004 Amendment Acceptance
    And I refresh the page
    And I click on the View departure declarations link on the 'Manage your transit movements' page
    And I click on the Complete declaration link for LRN 38VYQTYFU3T0KUTUM3 on the 'Departure declarations' page

    And I click the Continue button on the presentation 'More information needed to complete declaration' page
    And I enter 1234567890 on the presentation 'What is the authorisation number for the location of goods?' page
    And I choose radio option No on the presentation 'Do you want to add an additional identifier for the location of goods?' page
    And I choose radio option No on the presentation 'Do you want to add a contact for the location of goods?' page


  Scenario: 03 'Normal' Amend short journey with security type 1;  answer 'No' to all optional questions
    When I submit an IE015 Prelodged Departure Declaration
    Then I submit an IE928 Positive Acknowledgment
    When I submit an IE013 Prelodged Departure Declaration
    Then I submit an IE004 Amendment Acceptance
    And I refresh the page
    And I click on the View departure declarations link on the 'Manage your transit movements' page
    And I click on the Complete declaration link for LRN 38VYQTYFU3T0KUTUM3 on the 'Departure declarations' page

    And I click the Continue button on the presentation 'More information needed to complete declaration' page
    And I choose radio option Approved place on the presentation 'Which type of location are the goods in?' page
    And I choose a radio option Address on the presentation 'How do you want to identify the location of goods?' page
    And I select United Kingdom on the presentation 'In which country is the location of goods?' page
    And I fill in the address on the presentation 'What is the address for the location of goods?' page

    And I choose radio option No on the presentation 'Do you want to add a contact for the location of goods?' page

    And I choose radio option No on the presentation 'Do you want to add a UN LOCODE for the place of loading?' page
    And I select United Kingdom on the presentation 'In which country is the place of loading?' page
    And I enter London on the presentation 'Where in United Kingdom is the place of loading?' page

    And I choose radio option No on the presentation 'Are you using any shipping containers to transport the goods?' page

   ##Active Means border of transport
    And I choose radio Air transport on the presentation 'How is the transit crossing the border?' page
    And I choose radio Registration Number of the Aircraft on the presentation inland mode 'Which identification do you want to use for this vehicle?' page
    And I enter identification number GB1234567 on 'What is the identification number for this?' page
    And I select United Kingdom on the active border mode 'What country is this vehicle registered to?' page
    And I select Belfast EPU (XI000142) on 'Where is the customs office at the border?' page
    And I enter conveyance reference number GB123456123456 on the 'What is the conveyance reference number?' page

    And I choose radio option No on the presentation 'Do you want to add any transport equipment?' page


  Scenario: 04 'Normal' short journey with security type 0 and location of goods in IE015;  answer 'No' to all optional questions
    When I submit an IE015 Prelodged Departure Declaration With Location Of Goods
    Then I submit an IE928 Positive Acknowledgment
    When I submit an IE013 Prelodged Departure Declaration With Location Of Goods
    Then I submit an IE004 Amendment Acceptance
    And I refresh the page
    And I click on the View departure declarations link on the 'Manage your transit movements' page
    And I click on the Complete declaration link for LRN 38VYQTYFU3T0KUTUM3 on the 'Departure declarations' page

    And I click the Continue button on the presentation 'More information needed to complete declaration' page
    And I choose radio option No on the presentation 'Do you want to add a UN LOCODE for the place of loading?' page
    And I select United Kingdom on the presentation 'In which country is the place of loading?' page
    And I enter London on the presentation 'Where in United Kingdom is the place of loading?' page

    And I choose radio option No on the presentation 'Are you using any shipping containers to transport the goods?' page
    And I choose radio option No on the presentation 'Do you want to add any transport equipment?' page

      ##Active Border Means of transport and Transport equipment is skipped because of security set to 0


