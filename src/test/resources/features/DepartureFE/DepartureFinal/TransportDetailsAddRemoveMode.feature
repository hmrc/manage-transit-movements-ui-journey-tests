@departureTransportDetails
Feature: Transport details journey

  Background:
    Given I login with ID 1234567890

  Scenario: 01 Add/Remove Additional References and Additional Information
    And the user has submitted transportDetailsGB.json for LRN 1234567890TDGB and EORI number 1234567890
    And I refresh the page
    When I click on the View draft departure declarations link on the 'Manage your transit movements' page
    Then I click on the link for LRN 1234567890TDGB on the 'Draft departure declarations' page
    Then I should be on the 'Declaration summary' page
    And I click the Add transport details link on the 'Declaration summary' page
    And I choose radio option No on the 'Do you want to use the same UCR for all items?' page
    And I choose radio option No on the 'Are all the items being dispatched from the same country?' page
    And I choose radio option No on the 'Are all the items being transported to the same country?' page

      ## Container indicator (this drives the departure transport means logic)
    And I choose radio option Yes on the 'Are you using any shipping containers to transport the goods?' page

      ## Inland mode of transport
    And I choose radio option No on the 'Do you want to add an inland mode of transport?' page
    And I choose radio option Name of a sea-going vessel on the inland mode 'Which identification do you want to use for this vehicle?' page
    And I enter registration number GB1234567 on the 'What is the identification number for this?' page
    And I select United Kingdom on the inland mode 'What country is this vehicle registered to?' page
    And I submit on the Check your answers section Departure means of transport page
    And I select radio option No on the 'You have added 1 departure means of transport' page
      ## Border means of transport
    And I choose radio option No on 'Do you want to add a border mode of transport?' page
    And I choose radio option No on the border means 'Do you want to add identification for this vehicle?' page

      ## Border means office of transit

      ## Conveyance Reference Number
    And I submit on the Check your answers section Modes and means of transport page
      ## Supply chain actor
    And I choose radio option No on the 'Do you want to add a supply chain actor for all items?' page

      ## Authorisation
    And I enter ACR123 reference number on the 'What is the reference number for the ACR authorisation?' page
    And I enter TRD123 reference number on the 'What is the reference number for the TRD authorisation?' page
    And I choose radio option No on the 'You have added 2 transport authorisations' page
    And I enter the date on the 'When do you expect the transit to arrive in AEROPORTO (IT262101)?' page

#      ## Carrier
    And I choose radio option No on the 'Do you want to add a carrier?' page

#      ## Transport Equipment
    And I enter C001 on the 'What is the container identification number?' page
    And I choose radio option No on the 'Do you want to add a seal?' page
    And I submit on the Check your answers section Transport equipment page
    And I choose radio option No on the 'You have added 1 transport equipment' page
    And I click radio option Yes on the 'Do you want to add an additional reference for all items?' page
    And I select Y022 - Consignor / exporter (AEO certificate number) on the 'What type of additional reference do you want to add?' page
    And I click radio option Yes on the 'Do you want to add an additional reference number?' page
    And I enter 12345 on the 'Enter the additional reference number' page

    And I choose radio option Yes on the 'You have added 1 additional reference for all items' page
    And I select Y025 - Representative (AEO certificate number) on the 'What type of additional reference do you want to add?' page
    And I click radio option No on the 'Do you want to add an additional reference number?' page
    And I click the Remove link on the 'You have added 2 additional references for all items?' page
    And I click radio option No on the 'Are you sure you want to remove this additional reference from all items?' page
    And I click the Remove link on the 'You have added 2 additional references for all items?' page
    And I click radio option Yes on the 'Are you sure you want to remove this additional reference from all items?' page
    And I choose radio option No on the 'You have added 1 additional reference for all items' page

    And I click radio option Yes on the 'Do you want to add any additional information for all items?' page
    And I select 20100 - Export from one EFTA country subject to restriction or export from the Union subject to restriction on the 'What type of additional information do you want to add?' page
    And I click radio option Yes on the 'Do you want to add any comments for the additional information?' page
    And I enter Comment 1 on the 'Enter your comments for the additional information' page

    And I click radio option Yes on the 'You have added 1 additional information for all items' page
    And I select 30600 - In EXS, where negotiable bills of lading 'to order blank endorsed' are concerned and the consignee particulars are unknown. on the 'What type of additional information do you want to add?' page
    And I click radio option No on the 'Do you want to add any comments for the additional information?' page
    And I choose to click on the Remove link on the 'You have added 2 additional information for all items' page
    And click radio option No on the 'Are you sure you want to remove this additional information from all items?' page
    And I choose to click on the Remove link on the 'You have added 2 additional information for all items' page
    And click radio option Yes on the 'Are you sure you want to remove this additional information from all items?' page
    And I click radio option No on the 'You have added 1 additional information for all items' page


#      ## Charges
    And I submit on the Check your answers section Transport details page
    Then I should be on the 'Declaration summary' page
    And I should see Completed status for transport details on the 'Declaration summary' page
    And I sign out

