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
    And I click the Add route details link on the 'Declaration summary' page
#
#    #Specific Circumstance Indicator (SCI)
    And I choose radio option Yes on the 'Do you want to add a specific circumstance indicator?' page
    And I choose radio option XXX - Authorised economic operators on the 'Which specific circumstance indicator do you want to add?' page
#
#      ## Transit route
    And I select Italy on the 'What country is the office of destination in?' page
    And I select IT on the 'Where in Italy is the office of destination?' page
#
#      ## Binding itinerary indicator
    And I choose radio option Yes on the 'Are you using a binding itinerary?' page
#
#      ## Country of routing - removing a transit country
    And I select Serbia - XS on the 'Which country do you want to add to the transit route?' page
    And I choose radio option No on the 'You have added 1 country to the transit route' page
    And I submit on the Check your answers section Transit route page
    And I choose to click on transit route summary page link on the 'No offices of transit' page
    And I choose to click on Add or remove transit route countries link on the Check your answers section Transit route page
    And I choose radio option Yes on the 'You have added 1 country to the transit route' page
    And I select Germany on the 'Which country do you want to add to the transit route?' page
    And I choose radio option Yes on the 'You have added 2 country to the transit route' page
    And I select France on the 'Which country do you want to add to the transit route?' page
    And I choose radio option Yes on the 'You have added 3 countries to the transit route' page
    And I select Andorra on the 'Which country do you want to add to the transit route?' page
    And I choose to click on the Remove link on the 'You have added 4 countries to the transit route' page
    And I choose radio option Yes on the 'Are you sure you want to remove this country from the transit route?' page
    And I choose radio option Yes on the 'You have added 3 countries to the transit route' page
    And I select Serbia on the 'Which country do you want to add to the transit route?' page
    And I choose radio option No on the 'You have added 4 countries to the transit route' page
    And I submit on the Check your answers section Transit route page

      ## Office of transit country page - removing a transit office
    And I select Andorra on the 'Which country is the office of transit in?' page
    And I select CUSTOMS OFFICE SANT JULIÀ DE LÒRIA (AD000001) on the 'Where in Andorra is the office of transit?' page
    And I choose radio option Yes on the 'Do you want to add a time of arrival in CUSTOMS OFFICE SANT JULIÀ DE LÒRIA (AD000001)?' page
    And I choose fill in the date and time on the 'When do you expect the transit to arrive in CUSTOMS OFFICE SANT JULIÀ DE LÒRIA, Andorra?' page
    And I submit on the Check your answers section Office of transit page

    And I choose radio option Yes on the 'You have added 1 office of transit' page
    And I select France on the 'Which country is the office of transit in?' page
    And I select Bastia port (FR000380) on the 'Where in France is the office of transit?' page
    And I choose radio option No on the 'Do you want to add a time of arrival in Bastia port (FR000380)?' page
    And I submit on the Check your answers section Office of transit page

    And I choose to click on the Remove link on the 'You have added 2 offices of transit' page
    And I choose radio option Yes on the 'Are you sure you want to remove this office of transit?' page
    And I choose radio option Yes on the 'You have added 1 office of transit' page
    And I select Germany on the 'Which country is the office of transit in?' page
    And I select Brake (DE005301) on the 'Where in Germany is the office of transit?' page
    And I choose radio option No on the 'Do you want to add a time of arrival in Brake (DE005301)?' page
    And I submit on the Check your answers section Office of transit page
    And I choose radio option Yes on the 'You have added 2 offices of transit' page
    And I select Serbia on the 'Which country is the office of transit in?' page
    And I select CI GRADINA (RS013277) on the 'Where in Serbia is the office of transit?' page
    And I choose radio option No on the 'Do you want to add a time of arrival in CI GRADINA (RS013277)?' page
    And I submit on the Check your answers section Office of transit page
    And I choose radio option No on the 'You have added 3 offices of transit' page

    And I choose radio option Yes on the 'Do you want to add a customs office of exit?' page
    And I select France on the 'In which country is the office of exit for transit?' page
    And I select Dijon bureau (FR001170) on the 'Where in France is the office of exit for transit?' page
    And I submit on the Check your answers section Office of exit for transit page
    And I choose radio option Yes on the 'You have added 1 office of exit for transit' page
    And I select France on the 'In which country is the office of exit for transit?' page
    And I select Brest bureau (FR000690) on the 'Where in France is the office of exit for transit?' page
    And I submit on the Check your answers section Office of exit for transit page
    And I choose to click on the Remove link on the 'You have added 2 offices of exit for transit' page
    And I choose radio option Yes on the 'Are you sure you want to remove this office of exit for transit?' page
    And I choose radio option No on the 'You have added 1 office of exit for transit' page


      ## Location of goods
    And I enter 1234567890 on the 'What is the authorisation number for the location of goods?' page
    And I choose radio option Yes on the 'Do you want to add an additional identifier for the location of goods?' page
    And I enter x9x9 on the 'What is the additional identifier for the location of goods?' page
    And I choose radio option Yes on the 'Do you want to add a contact for the location of goods?' page
    And I enter Locator Joe on the 'Who is the contact for the location of goods?' page
    And I enter +432 1212 1212 on the 'What is the phone number for the location of goods’ contact?' page
    And I submit on the Check your answers section Location of goods page

      ## Place of loading UN LOCODE
    And I choose radio option Yes on the 'Do you want to add a UN LOCODE for the place of loading?' page
    And I enter AEFAT on the 'What is the UN LOCODE for the place of loading?' page
    And I choose radio option Yes on the 'Do you want to add extra information for the place of loading?' page
    And I select United Kingdom on the 'In which country is the place of loading?' page
    And I enter London on the 'Where in United Kingdom is the place of loading?' page
    And I choose radio option Yes on the 'Do you want to add a place of unloading?' page
    And I choose radio option Yes on the 'Do you want to add a UN LOCODE for the place of unloading?' page
    And I enter DEAAL on the 'What is the UN LOCODE for the place of unloading?' page
    And I choose radio option Yes on the 'Do you want to add extra information for the place of unloading?' page
    And I select Italy on the 'Which country is the place of unloading in?' page
    And I enter Milano on the 'Where in Italy is the place of unloading?' page
    And I submit on the Check your answers section Places of loading and unloading page
    And I submit on the Check your answers section Route details page

    Then I should be on the 'Declaration summary' page
    And I should see Completed status for route details on the 'Declaration summary' page
    And I sign out


  Scenario: 02 Northern Ireland office of departure

    And the user has submitted routeDetailsXI.json for LRN 1234567890RDXI and EORI number 1234567890
    And I refresh the page
    When I click on the View draft departure declarations link on the 'Manage your transit movements' page
    Then I click on the link for LRN 1234567890RDXI on the 'Draft departure declarations' page
    Then I should be on the 'Declaration summary' page
    And I click the Add route details link on the 'Declaration summary' page

      ## Transit route
    And I select Italy on the 'What country is the office of destination in?' page
    And I select Bari on the 'Where in Italy is the office of destination?' page
    And I choose radio option No on the 'Are you using a binding itinerary?' page
    And I choose radio option Yes on the 'Do you want to add a country to the transit route?' page
    And I select Andorra on the 'Which country do you want to add to the transit route?' page
    When I choose radio option Yes on the 'You have added 1 country to the transit route' page
    And I select Argentina on the 'Which country do you want to add to the transit route?' page
    When I choose radio option No on the 'You have added 2 countries to the transit route' page
    And I submit on the Check your answers section Transit route page

      ## Location of goods
    And I choose radio option Yes on the 'Do you want to add a location of goods?' page
    And I choose radio option Designated location on the 'Which type of location is it?' page
    And I choose radio option Customs office identifier on the 'How do you want to identify the location of goods?' page
    And I select XI on the departure location of goods customs office identification page
    And I submit on the Check your answers section Location of goods page

      ## Place of loading
    And I choose radio option Yes on the 'Do you want to add a place of loading?' page
    And I choose radio option No on the 'Do you want to add a UN LOCODE for the place of loading?' page
    And I select United Kingdom on the 'In which country is the place of loading?' page
    When I enter London on the 'Where in United Kingdom is the place of loading?' page
    And I submit on the Check your answers section Places of loading and unloading page
    And I submit on the Check your answers section Route details page

    Then I should be on the 'Declaration summary' page
    And I should see Completed status for route details on the 'Declaration summary' page
    And I sign out
