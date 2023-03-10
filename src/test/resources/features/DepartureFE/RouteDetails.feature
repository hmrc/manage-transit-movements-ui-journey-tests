@departureRouteDetails

Feature: Route details journey

  Background:
    Given I login with ID 1234567890

  Scenario: 01 Great Britain office of departure

    And the user has submitted routeDetailsGB.json for LRN 1234567890RDGB and EORI number 1234567890
    And I refresh the page
    When I click on the View draft departure declarations link on the 'Manage your transit movements' page
    Then I click on the link for LRN 1234567890RDGB on the 'Draft departure declarations' page
    Then I should be on the 'Declaration summary' page
    And I click the link with visible text: Add route details on the 'Declaration summary' page

      ## Transit route
    And I select Italy on the 'What is the country of destination?' page
    And I select IT on the 'Where is the office of destination?' page

      ## Binding itinerary indicator
    And I choose radio option Yes on the 'Are you using a binding itinerary?' page

      ## Country of routing - removing a transit country
    And I select Andorra on the 'Which country do you want to add to the transit route?' page
    And I choose radio option Yes on the 'You have added 1 country to the transit route' page
    And I select France on the 'Which country do you want to add to the transit route?' page
    And I choose radio option Yes on the 'You have added 2 countries to the transit route' page
    And I select Germany on the 'Which country do you want to add to the transit route?' page
    And I choose to click on the Remove link on the 'You have added 3 countries to the transit route' page
    And I choose radio option Yes on the 'Are you sure you want to remove Andorra from the transit route?' page
    And I choose radio option No on the 'You have added 2 countries to the transit route' page
    And I submit on the 'Route details - Transit route Check your answers' page

      ## Office of transit country page - removing a transit office
    And I select Germany on the 'Which country is the office of transit in?' page
    And I select Basel (DE004058) on the 'Where in Germany is the office of transit?' page
    And I choose radio option Yes on the 'Do you want to add a time of arrival in Basel (DE004058)?' page
    And I choose fill in the date and time on the 'When do you expect the transit to arrive in Basel, Germany?' page
    And I submit on the 'Route details - Office of transit Check your answers' page
    And I choose radio option Yes on the 'You have added 1 office of transit' page
    And I select France on the 'Which country is the office of transit in?' page
    And I select Bastia port (FR000380) on the 'Where in France is the office of transit?' page
    And I choose radio option No on the 'Do you want to add a time of arrival in Bastia port (FR000380)?' page
    And I submit on the 'Route details - Office of transit Check your answers' page
    And I choose to click on the Remove link on the 'You have added 2 offices of transit' page
    And I choose radio option Yes on the 'Are you sure you want to remove Bastia port as an office of transit?' page
    And I choose radio option No on the 'You have added 1 office of transit' page

      ## Office of exit - removing an office of exit
    And I select Germany on the 'Which country is the office of exit in?' page
    When I select Dortmund on the 'Where in Germany is the office of exit?' page
    And I submit on the 'Route details - Office of exit Check your answers' page
    And I choose radio option Yes on the 'You have added 1 office of exit' page
    And I select France on the 'Which country is the office of exit in?' page
    And I select Agen bureau on the 'Where in France is the office of exit?' page
    And I submit on the 'Route details - Office of exit Check your answers' page
    And I choose to click on the Remove link on the 'You have added 2 offices of exit' page
    And I choose radio option Yes on the 'Are you sure you want to remove Dortmund - Flughafen as an office of exit?' page
    And I choose radio option No on the 'You have added 1 office of exit' page

      ## Location of goods
    And I choose radio option Designated location on the 'Which type of location is it?' page
    And I choose radio option Authorisation number on the 'How do you want to identify the location of goods?' page
    And I enter 1234567890 on the 'What is the authorisation number for the location of goods?' page
    And I choose radio option Yes on the 'Do you want to add another identifier for the location of goods?' page
    And I enter x9x9 on the 'What is the additional identifier for the location of goods?' page
    And I choose radio option Yes on the 'Do you want to add a contact for the location of goods?' page
    And I enter Locator Joe on the 'Who is the contact for the location of goods?' page
    And I enter +432 1212 1212 on the 'What is the contact for the location of goods’ telephone number?' page
    And I submit on the 'Route details - Location of goods Check your answers' page

      ## Place of loading UN LOCODE
    And I choose radio option Yes on the 'Do you want to add a UN LOCODE for the place of loading?' page
    And I select Fateh Terminal (AEFAT) on the 'What is the UN LOCODE for the place of loading?' page
    And I choose radio option Yes on the 'Do you want to add extra information for the place of loading?' page
    And I select United Kingdom on the 'In which country is the place of loading?' page
    And I enter London on the 'Where in United Kingdom is the place of loading?' page
    And I choose radio option Yes on the 'Do you want to add a place of unloading?' page
    And I choose radio option Yes on the 'Do you want to add a UN LOCODE for the place of unloading?' page
    And I select Aalen on the 'What is the UN LOCODE for the place of unloading?' page
    And I choose radio option Yes on the 'Do you want to add extra information for the place of unloading?' page
    And I select Italy on the 'Which country is the place of unloading in?' page
    And I enter Milano on the 'Where in Italy is the place of unloading?' page
    And I submit on the 'Route details - Places of loading and unloading Check your answers' page
    And I submit on the 'Route details Check your answers' page

    Then I should be on the 'Declaration summary' page
    And I should see COMPLETED status for route details on the 'Declaration summary' page
    And I sign out

  Scenario: 02 Northern Ireland office of departure

    And the user has submitted routeDetailsXI.json for LRN 1234567890RDXI and EORI number 1234567890
    And I refresh the page
    When I click on the View draft departure declarations link on the 'Manage your transit movements' page
    Then I click on the link for LRN 1234567890RDXI on the 'Draft departure declarations' page
    Then I should be on the 'Declaration summary' page
    And I click the link with visible text: Add route details on the 'Declaration summary' page

      ## Transit route
    And I select Italy on the 'What is the country of destination?' page
    And I select Bari on the 'Where is the office of destination?' page
    And I choose radio option No on the 'Are you using a binding itinerary?' page
    And I select Andorra on the 'Which country do you want to add to the transit route?' page
    When I choose radio option Yes on the 'You have added 1 country to the transit route' page
    And I select Argentina on the 'Which country do you want to add to the transit route?' page
    When I choose radio option No on the 'You have added 2 countries to the transit route' page
    And I submit on the 'Route details - Transit route Check your answers' page

      ## Location of goods
    And I choose radio option Yes on the departure add location of goods page
    And I choose radio option Designated location on the 'Which type of location is it?' page
    And I choose radio option Customs office identifier on the 'How do you want to identify the location of goods?' page
    And I select XI on the departure location of goods customs office identification page
    And I submit on the 'Route details - Location of goods Check your answers' page

      ## Place of loading
    And I choose radio option No on the 'Do you want to add a UN LOCODE for the place of loading?' page
    And I select United Kingdom on the 'In which country is the place of loading?' page
    When I enter London on the 'Where in United Kingdom is the place of loading?' page

      ## Place of unloading
    And I choose radio option No on the 'Do you want to add a UN LOCODE for the place of unloading?' page
    And I select United Kingdom on the 'Which country is the place of unloading in?' page
    And I enter London on the 'Where in United Kingdom is the place of unloading?' page
    And I submit on the 'Route details - Places of loading and unloading Check your answers' page
    And I submit on the 'Route details Check your answers' page

    Then I should be on the 'Declaration summary' page
    And I should see COMPLETED status for route details on the 'Declaration summary' page
    And I sign out
