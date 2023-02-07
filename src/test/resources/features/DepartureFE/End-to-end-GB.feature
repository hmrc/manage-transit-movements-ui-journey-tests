@departureGBe2e @wip

Feature: End to end journey for Great Britain office of departure

  Background:
    Given I login with ID 1234567890
    Then I should be on the Manage your transit movements page
    When I click on the Make a departure declaration link on the Manage your transit movements page
    Then I input a random LRN on the 'What is the Local Reference Number' page
    And I select GB on the 'Where is the office of departure' page

  @a11y
  Scenario: 01 Procedure 'Simplified' - Declaration 'T2' - Security '2 EXS' - Binding itinerary 1 -
  Completed Consignee at header level - Container Ind 'Yes'
    And I choose radio option Simplified on the 'What type of procedure are you using' page
    And I choose radio option T2 on the 'What declaration do you want to create' page
    And I choose radio option Exit summary declaration (EXS) on the 'What type of safety and security details do you need to add?' page
    And I submit the 'Check your answers' page

    # Trader details
    And I click the link with visible text: Add trader details on the 'Declaration summary' page
      ## Transit Holder
    And I choose radio option Yes on the 'Do you know the transit holder’s EORI number or TIN?' page
    And I enter GB123456123456 on the 'What is the transit holder’s EORI number or TIN?' page
    And I enter Joe Blog on the 'What is the transit holder’s name?' page
    And I select United Kingdom on the 'Which country is the transit holder based in?' page
    And I fill in the address on the 'What is the transit holder’s address?' page

      ## Transit holder's contact person's details

    And I choose radio option Yes on the 'Do you want to add a contact?' page
    And I enter John contact on the 'What is the contact’s name?' page
    And I enter +2112212112 on the 'What is the transit holder’s contact phone number?' page

      ## Representative details
    And I choose radio option Yes on the 'Are you acting as a representative?' page
    And I enter FR123123132 on the representative 'What is your EORI number or TIN?' page
    And I choose radio option Yes on the representative 'Do you want to add your details?' page
    And I enter Marie Rep on the representative 'What is your name?' page
    And I enter +11 1111 1111 on the representative 'What is your phone number?' page

      ## Reduced data set operator
    And I choose radio option Yes on the 'Do you want to use a reduced data set?' page

      ## Consignor
    And I choose radio option Yes on the 'Do you know the consignor’s EORI number or TIN?' page
    And I enter IT12312313 on the 'What is the consignor’s EORI number or TIN?' page
    And I enter Pip Consignor on the 'What is the consignor’s name?' page
    And I select United Kingdom on the 'Which country is the consignor based in?' page
    And I fill in the address on the 'What is the consignor’s address?' page
    And I choose radio option Yes on the 'Do you want to add a contact for the consignor?' page
    And I enter Pip Contact on the 'Who is the contact for the consignor?' page
    And I enter +123123123213 on the 'What is the consignor contact’s phone number?' page

      ## Consignee
    And I choose radio option No on the 'Is there more than one consignee?' page
    And I choose radio option Yes on the 'Do you know the consignee’s EORI number or TIN?' page
    And I enter GE00101001 on the 'What is the consignee’s EORI number or TIN?' page
    And I enter Simpson Blog Consignee on the 'What is the consignee’s name?' page
    And I select United Kingdom on the 'Which country is the consignee based in?' page
    And I fill in the address on the 'What is the consignee’s address?' page

    And I submit on the 'Trader details Check your answers' page
    Then I should be on the 'Declaration summary' page
    And I should see COMPLETED status for trader details on the 'Declaration summary' page

    # Route details
    When I click the link with visible text: Add route details on the 'Declaration summary' page

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

    #Guarantee details - remove guarantee
    When I click the link with visible text: Add guarantee details on the 'Declaration summary' page
    And I choose radio option (A) Guarantee waiver by agreement on the 'Which type of guarantee is it?' page
    And I choose radio option Yes on the 'You have added 1 guarantee' page
    And I choose radio option (1) Comprehensive guarantee on the 'Which type of guarantee is it?' page
    And I enter 01GB1234567890120A123456 on the 'What is the Guarantee Reference Number?' page
    And I select GBP on the 'What currency do you want to use for the liability?' page
    And I enter 120 on the 'How much is the liability in pounds?' page
    And I enter AC01 on the 'What is the access code?' page
    And I submit on the 'Guarantee details Check your answers' page
    And I choose to click on the Remove link on the 'You have added 2 guarantees' page
    And I choose radio option Yes on the 'Are you sure you want to remove this guarantee?' page
    And I choose radio option Yes on the 'You have added 1 guarantee' page
    And I choose radio option (8) Guarantee not required – exempt public body on the 'Which type of guarantee is it?' page
    And I enter 01GB123456789012 on the 'What is the reference?' page
    And I select GBP on the 'What currency do you want to use for the liability?' page
    And I enter 123.00 on the 'How much is the liability in pounds?' page
    And I submit on the 'Guarantee details Check your answers' page
    And I choose radio option Yes on the 'You have added 2 guarantees' page
    And I choose radio option (3) Individual guarantee in cash on the 'Which type of guarantee is it?' page
    And I choose radio option Yes on the 'Do you want to add a reference for the guarantee?' page
    And I enter 01GB123456789012 on the 'What is the reference for the guarantee?' page
    And I select GBP on the 'What currency do you want to use for the liability?' page
    And I enter 54.99 on the 'How much is the liability in pounds?' page
    And I submit on the 'Guarantee details Check your answers' page
    And I choose radio option Yes on the 'You have added 3 guarantees' page
    And I choose radio option (5) Guarantee waiver – secured for 500 euros or less on the 'Which type of guarantee is it?' page
    And I select GBP on the 'What currency do you want to use for the liability?' page
    And I enter 54.99 on the 'How much is the liability in pounds?' page
    And I submit on the 'Guarantee details Check your answers' page
    And I choose radio option No on the 'You have added 4 guarantees' page
    Then I should be on the 'Declaration summary' page

    #Transport details
    When I click the link with visible text: Add transport details on the 'Declaration summary' page

    And I choose radio option Yes on the 'Do you want to use the same UCR for all items?' page
    And I enter GB123456123456 on the 'What is the UCR?' page
    And I choose radio option Yes on the 'Are all the items being transported to the same country?' page
    And I select Italy on the 'What country are the items being transported to?' page

      ## Container indicator
    And I choose radio option Yes on the 'Are you using any containers?' page

      ## Inland mode of transport
    And I choose radio option Road on the 'Which inland mode of transport are you using?' page
    And I choose radio option Registration number of a road trailer on the inland mode 'Which identification do you want to use for this vehicle?' page
    And I enter registration number GB1234567 on the 'What is the registration number of the road trailer?' page
    And I select United Kingdom on the inland mode 'What country is this vehicle registered to?' page

      ## Border means of transport
    And I choose radio option Maritime on the 'Which mode of transport are you using to cross the border?' page
    And I choose radio option Name of a sea-going vessel on the border mode 'Which identification do you want to use for this vehicle?' page
    And I enter identification GB1234567 on the 'What is the name of the sea-going vessel?' page
    And I choose radio option Yes on the 'Do you want to add the registered country for this vehicle?' page
    And I select United Kingdom on the border mode 'What country is this vehicle registered to?' page

      ## Border means office of transit
    And I select Basel (DE004058) on the 'Where is the office of transit?' page

      ## Conveyance Reference Number
    And I choose radio option Yes on the 'Do you want to add a conveyance reference number?' page
    And I enter conveyance number GB123456123456 on the 'What is the conveyance reference number?' page
    And I submit on the 'Transport details - Border means of transport Check your answers' page
    And I choose radio option No on the 'You have added 1 border means of transport' page
    And I submit on the 'Transport details - Modes and means of transport Check your answers' page

      ## Supply chain actor
    And I choose radio option Yes on the 'Do you want to add a supply chain actor?' page
    And I choose radio option Consolidator on the 'Which type of supply chain actor do you want to add?' page
    And I enter FR98472189002 on the 'What’s the EORI number or TIN for the consolidator?' page
    And I choose radio option No on the 'You have added 1 supply chain actor' page

      ## Authorisation
    And I enter ACR123 reference number on the 'What’s the reference number for the ACR authorisation?' page
    And I choose radio option Yes on the 'You have added 1 transport authorisation' page
    And I choose radio option SSE on the 'Which type of authorisation do you want to add' page
    And I enter SSE123 reference number on the 'What’s the reference number for the SSE authorisation?' page
    And I choose to click on Remove link on the 'You have added 2 authorisations' page
    And I choose radio option Yes for the 'Are you sure you want to remove SSE authorisation SSE123?' page
    And I choose radio option No on the 'You have added 1 transport authorisation' page
    And I enter the date on the 'When is the limit date?' page

      ## Carrier
    And I enter GB123456123456 on the 'What is the carrier’s EORI number or TIN?' page
    And I choose radio option Yes on the 'Do you want to add a contact for the carrier?' page
    And I enter Moseley on the 'Who is the contact for the carrier?' page
    And I enter +88 888 888 on the 'What is the phone number for the carrier’s contact?' page

     ## Transport Equipement
    And I enter C001 on the 'What is the container identification number?' page
    And I choose radio option Yes on the 'Do you want to add a seal?' page
    And I enter S001 on the 'What is the seal identification number?' page
    And I choose radio option Yes on the 'You have added 1 seal' page
    And I enter S002 on the 'What is the seal identification number?' page
    And I click the Remove link  on the 'You have added 2 seals' page
    And I click radio option Yes on the 'Are you sure you want to remove seal S001?' page
    And I choose radio option No on the 'You have added 1 seal' page
    And I choose radio option Yes on the 'Do you want to add a goods item number?' page
    And I enter 1 on the 'What is the goods item number?' page
    And I choose radio option Yes on the 'You have added 1 goods item number' page
    And I enter 2 on the 'What is the goods item number?' page
    And I click the Remove link on the 'You have added 2 goods item numbers' page
    And I click radio option Yes on the 'Are you sure you want to remove goods item number 1?' page
    And I choose radio option No on the 'You have added 1 goods item number' page
    And I submit on the 'Transport details - Transport equipment Check your answers' page
#
##    1873 Add Another Container
#    And I choose radio option Yes on the 'You have added 1 container identification number' page
#      ##    1931 Add Container Id Number
#    And I choose radio option Yes on the 'Do you want to add a container identification number?' page
#  ##    1837 Container Id number
#    And I enter C002 on the 'What is the container identification number?' page
#    ##    1854 Add Seal Id Number
#    And I choose radio option No on the 'Do you want to add a seal?' page
#  ##   1872 CYA Page for Transport details - Container, seals and goods item numbers
#    And I submit on the 'Transport details - Transport equipment Check your answers' page
##    Click the remove link
#    And I click the Remove link on the 'You have added 2 container identification numbers' page
#  ##    1874 Remove Container
#    And I click radio option Yes on the 'Are you sure you want to remove container C001?' page
###    1873 Add Another Container
#    And I choose radio option No on the 'You have added 1 container identification number' page


  Scenario: 02 Procedure 'Normal' - Declaration 'T1' - Security '0' - Consignee in Item level, destination countries at Item level
  - Container Ind 'No'
    And I choose radio option Normal on the 'What type of procedure are you using' page
    And I choose radio option T1 on the 'What declaration do you want to create' page
    And I choose radio option No security on the 'What type of safety and security details do you need to add?' page
    And I submit the 'Check your answers' page

    # Trader details
    And I click the link with visible text: Add trader details on the 'Declaration summary' page
      ## Transit Holder
    And I choose radio option No on the 'Do you know the transit holder’s EORI number or TIN?' page
    And I enter Joe Blog on the 'What is the transit holder’s name?' page
    And I select United Kingdom on the 'Which country is the transit holder based in?' page
    And I fill in the address on the 'What is the transit holder’s address?' page

     ## Transit holder's contact person's details

    And I choose radio option No on the 'Do you want to add a contact?' page

      ## Representative details
    And I choose radio option No on the 'Are you acting as a representative?' page

      ## Reduced data set operator
    And I choose radio option No on the 'Do you want to use a reduced data set?' page

      ## Consignor
    And I choose radio option No on the 'Do you know the consignor’s EORI number or TIN?' page
    And I enter Pip Consignor on the 'What is the consignor’s name?' page
    And I select United Kingdom on the 'Which country is the consignor based in?' page
    And I fill in the address on the 'What is the consignor’s address?' page
    And I choose radio option No on the 'Do you want to add a contact for the consignor?' page

      ## Consignee
    And I choose radio option Yes on the 'Is there more than one consignee?' page
    And I submit on the 'Trader details Check your answers' page
    Then I should be on the 'Declaration summary' page
    And I should see COMPLETED status for trader details on the 'Declaration summary' page

    # Route details
    When I click the link with visible text: Add route details on the 'Declaration summary' page

      ## Transit route
    And I select Italy on the 'What is the country of destination?' page
    And I select IT on the 'Where is the office of destination?' page

      ## Binding itinerary indicator
    And I choose radio option No on the 'Are you using a binding itinerary?' page

      ## Transit route country optional
    And I choose radio option No on the transit route add country page
    And I submit on the 'Route details - Transit route Check your answers' page

      ## Country of Transit
    And I select France on the 'Which country is the office of transit in?' page
    And I select Brest bureau (FR000690) on the 'Where in France is the office of transit?' page
    And I choose radio option No on the 'Do you want to add a time of arrival in Brest bureau (FR000690)?' page
    And I submit on the 'Route details - Office of transit Check your answers' page
    And I choose radio option No on the 'You have added 1 office of transit' page

      ## Location of goods
    And I choose radio option Approved place on the 'Which type of location is it?' page
    And I choose radio option Coordinates on the 'How do you want to identify the location of goods?' page
    And I enter 50.96622 and 1.86211 on the 'What are the coordinates for the location of goods' page
    And I choose radio option No on the 'Do you want to add a contact for the location of goods?' page
    And I submit on the 'Route details - Location of goods Check your answers' page

      ## Place of loading UN LOCODE
    And I choose radio option No on the 'Do you want to add a UN LOCODE for the place of loading?' page
    And I select United Kingdom on the 'In which country is the place of loading?' page
    And I enter London on the 'Where in United Kingdom is the place of loading?' page
    And I submit on the 'Route details - Places of loading and unloading Check your answers' page
    And I submit on the 'Route details Check your answers' page
    Then I should be on the 'Declaration summary' page

    # Guarantee details
    When I click the link with visible text: Add guarantee details on the 'Declaration summary' page
    And I choose radio option (3) Individual guarantee in cash on the 'Which type of guarantee is it?' page
    And I choose radio option Yes on the 'Do you want to add a reference for the guarantee?' page
    And I enter 01GB123456789012 on the 'What is the reference for the guarantee?' page
    And I select GBP on the 'What currency do you want to use for the liability?' page
    And I enter 1299.99 on the 'How much is the liability in pounds?' page
    And I submit on the 'Guarantee details Check your answers' page
    And I choose radio option No on the 'You have added 1 guarantee' page
    Then I should be on the 'Declaration summary' page

    # Transport details
    When I click the link with visible text: Add transport details on the 'Declaration summary' page
    And I choose radio option No on the 'Do you want to use the same UCR for all items?' page
    And I choose radio option No on the 'Are all the items being transported to the same country?' page

      ## Container indicator
    And I choose radio option No on the 'Are you using any containers?' page

      ## Inland mode of transport
    And I choose radio option Road on the 'Which inland mode of transport are you using?' page
    And I choose radio option Registration number of a road trailer on the inland mode 'Which identification do you want to use for this vehicle?' page
    And I enter registration number GB1234567 on the 'What is the registration number of the road trailer?' page
    And I select United Kingdom on the inland mode 'What country is this vehicle registered to?' page

      ## Border mode of transport
    And I choose radio option No on the add border mode of transport page
    And I submit on the 'Transport details - Modes and means of transport Check your answers' page

      ## Supply chain actor
    When I choose radio option No on the 'Do you want to add a supply chain actor?' page

      ## Authorisation
    And I choose radio option No on the 'Do you want to add an authorisation' page

      ## Carrier
    When I enter GB123456123456 on the 'What is the carrier’s EORI number or TIN?' page
    And I choose radio option No on the 'Do you want to add a contact for the carrier?' page

      ## Transport equipment Security 0, ContainerID YES, No authorisations
    And I choose radio option Yes on the 'Do you need to add any transport equipment?' page
    And I choose radio option No on the 'Do you want to add a seal?' page
    And I submit on the 'Transport details - Transport equipment Check your answers' page
##    1873 Add Another Container
#    And I choose radio option No on the 'You have added 1 container identification number' page
#     This path will skip Payment Method and go straight to CYA page 1877 as security = 0













