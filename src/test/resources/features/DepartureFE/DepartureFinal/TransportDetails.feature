@departureTransportDetails
Feature: Transport details journey

  Background:
    Given I login with ID 1234567890

  Scenario: 01 Great Britain office of departure
    And the user has submitted transportDetailsGB.json for LRN 1234567890TDGB and EORI number 1234567890
    And I refresh the page
    When I click on the View draft departure declarations link on the 'Manage your transit movements' page
    Then I click on the link for LRN 1234567890TDGB on the 'Draft departure declarations' page
    Then I should be on the 'Declaration summary' page
    And I click the Add transport details link on the 'Declaration summary' page
    And I choose radio option Yes on the 'Do you want to use the same UCR for all items?' page
    And I enter UCR23456 on the 'What is the UCR?' page
    And I choose radio option Yes on the 'Are all the items being transported to the same country?' page
    And I select Italy on the transport details 'What is the country of destination?' page

      ## Container indicator
    And I choose radio option Yes on the 'Are you using any shipping containers to transport the goods?' page

      ## Inland mode of transport
    And I choose radio option Yes on the 'Do you want to add an inland mode of transport?' page
    And I choose radio option Maritime on the 'Which inland mode of transport are you using?' page
    And I choose radio option Yes on the 'Do you want to add the type of identification?' page
    And I choose radio option Name of a sea-going vessel on the inland mode 'Which identification do you want to use for this vehicle?' page
    And I enter registration number GB1234567 on the 'What is the identification number for this?' page
    And I choose radio option Yes on the 'Do you want to add the registered country for this vehicle?' page
    And I select United Kingdom on the inland mode 'What country is this vehicle registered to?' page

      ## Border means of transport
    And I choose radio option Yes on 'Do you want to add a border mode of transport?' page
    And I choose radio option Sea on the 'How is the transit crossing the border?' page
    And I choose radio option Yes on the border means 'Do you want to add identification for this vehicle?' page
    And I choose radio option Name of a sea-going vessel on the border mode 'Which identification do you want to use for this vehicle?' page
    And I enter identification GB1234567 on the 'What is the identification number for this?' page
    And I choose radio option Yes on the 'Do you want to add the registered country for this vehicle?' page
    And I select United Kingdom on the border mode 'What country is this vehicle registered to?' page

      ## Border means office of transit
    And I select Basel (DE004058) on the 'Where is the customs office at the border?' page

      ## Conveyance Reference Number
    And I choose radio option Yes on the 'Do you want to add a conveyance reference number?' page
    And I enter conveyance number GB123456123456 on the 'What is the conveyance reference number?' page
    And I submit on the 'Transport details - Border means of transport Check your answers' page
    And I choose radio option No on the 'You have added 1 border means of transport' page
    And I submit on the 'Transport details - Modes and means of transport Check your answers' page

      ## Supply chain actor
    And I choose radio option Yes on the 'Do you want to add a supply chain actor for all items?' page
    And I choose radio option Consolidator on the 'Which type of supply chain actor do you want to add?' page
    And I enter FR98472189002 on the 'What is the EORI number or Third Country Unique Identification Number TCUIN for the consolidator?' page
    And I choose radio option No on the 'You have added 1 supply chain actor' page

      ## Authorisation
    And I enter TRD123 reference number on the 'What is the reference number for the TRD authorisation?' page
    And I enter ACR123 reference number on the 'What is the reference number for the ACR authorisation?' page
    And I choose radio option Yes on the 'You have added 2 transport authorisations' page
    And I enter SSE123 reference number on the 'What is the reference number for the SSE authorisation?' page
    And I choose to click on Remove link on the 'You have added 3 authorisations' page
    And I choose radio option Yes for the 'Are you sure you want to remove this SSE authorisation?' page
    And I choose radio option No on the 'You have added 2 transport authorisations' page
    And I enter the date on the 'When do you expect the transit to arrive in AEROPORTO (IT262101)?' page

      ## Carrier
    And I choose radio option Yes on the 'Do you want to add a carrier?' page
    And I enter GB123456123456 on the 'What is the carrier’s EORI number or Third Country Unique Identification Number TCUIN?' page
    And I choose radio option Yes on the 'Do you want to add a contact for the carrier?' page
    And I enter Moseley on the 'Who is the contact for the carrier?' page
    And I enter +88 888 888 on the 'What is the phone number for the carrier’s contact?' page

      ## Transport Equipment
    And I enter C001 on the 'What is the container identification number?' page
    And I choose radio option Yes on the 'Do you want to add a seal?' page
    And I enter S001 on the 'What is the seal identification number?' page
    And I choose radio option Yes on the 'You have added 1 seal' page
    And I enter S002 on the 'What is the seal identification number?' page
    And I click the Remove link  on the 'You have added 2 seals' page
    And I click radio option Yes on the 'Are you sure you want to remove seal S001?' page
    And I choose radio option No on the 'You have added 1 seal' page
    And I submit on the 'Transport details - Transport equipment Check your answers' page
    And I choose radio option Yes on the 'You have added 1 transport equipment' page
    And I choose radio option Yes on the 'Do you want to add a container identification number?' page
    And I enter C002 on the 'What is the container identification number?' page
    And I choose radio option No on the 'Do you want to add a seal?' page
    And I submit on the 'Transport details - Transport equipment Check your answers' page
    And I click the Remove link on the 'You have added 2 transport equipment' page
    And I click radio option Yes on the 'Are you sure you want to remove transport equipment 2?' page
    And I choose radio option No on the 'You have added 1 transport equipment' page

    And I submit on the 'Transport details Check your answers' page
    Then I should be on the 'Declaration summary' page
    And I should see COMPLETED status for transport details on the 'Declaration summary' page
    And I sign out



  Scenario: 02 Northern Ireland office of departure
    And the user has submitted transportDetailsXI.json for LRN 1234567890TDXI and EORI number 1234567890
    And I refresh the page
    When I click on the View draft departure declarations link on the 'Manage your transit movements' page
    Then I click on the link for LRN 1234567890TDXI on the 'Draft departure declarations' page
    Then I should be on the 'Declaration summary' page
     ## Transport details
    And I click the Add transport details link on the 'Declaration summary' page
    And I choose radio option Yes on the 'Do you want to use the same UCR for all items?' page
    And I enter UCR23456 on the 'What is the UCR?' page
    And I choose radio option Yes on the 'Are all the items being dispatched from the same country?' page
    And I select United Kingdom on the 'What is the country of dispatch?' page
    And I choose radio option Yes on the 'Are all the items being transported to the same country?' page
    And I select United Kingdom on the transport details 'What is the country of destination?' page

      ## Container indicator
    And I choose radio option Not sure on the 'Are you using any shipping containers to transport the goods?' page

      ## Inland mode of transport
    And I choose radio option Yes on the 'Do you want to add an inland mode of transport?' page
    And I choose radio option Rail on the 'Which inland mode of transport are you using?' page
    And I choose radio option Yes on the 'Do you want to add the type of identification?' page
    And I choose radio option Train number on the inland mode 'Which identification do you want to use for this vehicle?' page
    And I enter registration number 1234567 on the 'What is the identification number for this?' page
    And I choose radio option Yes on the 'Do you want to add the registered country for this vehicle?' page
    And I select United Kingdom on the inland mode 'What country is this vehicle registered to?' page

      ## Border means of transport
    And I choose radio option Yes on 'Do you want to add a border mode of transport?' page
    And I choose radio option Air on the 'How is the transit crossing the border?' page
    And I choose radio option Yes on the border means 'Do you want to add identification for this vehicle?' page
    And I choose radio option registration number of the aircraft on the border mode 'Which identification do you want to use for this vehicle?' page
    And I enter identification GB1234567 on the 'What is the identification number for this?' page
    And I choose radio option Yes on the 'Do you want to add the registered country for this vehicle?' page
    And I select United Kingdom on the border mode 'What country is this vehicle registered to?' page

      ## Border means of transport - office of transit
    And I select BARI on the 'Where is the customs office at the border?' page

      ## Conveyance Reference Number
    And I choose radio option Yes on the 'Do you want to add a conveyance reference number?' page
    And I enter conveyance number GB123456123456 on the 'What is the conveyance reference number?' page
    And I submit on the 'Transport details - Modes and means of transport Check your answers' page

      ## Supply chain actor
    When I choose radio option No on the 'Do you want to add a supply chain actor for all items?' page

      ## Authorisation
    And I choose radio option Yes on the 'Do you want to add an authorisation' page
    And I choose radio option ACR on the 'Which type of authorisation do you want to add' page
    And I enter ACR123 reference number on the 'What is the reference number for the ACR authorisation?' page
    When I choose radio option No on the 'You have added 1 transport authorisation' page
    And I choose radio option Yes on the 'Do you want to add the arrival date at the office of destination' page
    And I enter the date on the 'When do you expect the transit to arrive in Aeroporto Bari - Palese (IT018101)?' page

      ## Carrier
    When I choose radio option No on the 'Do you want to add a carrier?' page

    And I submit on the 'Transport details Check your answers' page
    Then I should be on the 'Declaration summary' page
    And I should see COMPLETED status for transport details on the 'Declaration summary' page
    And I sign out
