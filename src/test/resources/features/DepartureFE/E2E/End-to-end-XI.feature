@departureXIe2e
Feature: End to end journey for Northern Ireland office of departure

  Background:
    Given I login with ID 1234567890
    Then I should be on the Manage your transit movements page
    When I click on the Make a departure declaration link on the Manage your transit movements page
    Then I input a random LRN on the 'What is the Local Reference Number' page
    And I select XI on the 'Where is the office of departure' page
    And I choose radio option Normal on the 'What type of procedure are you using' page
    And I choose radio option TIR on the 'What declaration do you want to create' page

  @a11y
  Scenario: 01 Procedure 'Normal' - Delcaration 'TIR' - Security 'ENS' - Guarantee 'B' - Inland Mode 'Rail' - Border Means 'Air'
    And I enter 1234567 on the 'What is the TIR carnet reference' page
    And I choose radio option Entry summary declaration (ENS) on the 'What type of safety and security details do you need to add' page
    And I submit the Check your answers page
    #Transit holder details
    When I click the link with visible text: Add trader details
    And I choose radio option Yes on the 'Is the TIR holder’s identification number known' page
    And I enter ABC/123/12345 on the 'What is the TIR holder’s identification number' page
    And I enter Joe Blog on the 'What is the transit holder’s name' page
    And I select United Kingdom on the 'Which country is the transit holder based in' page
    And I fill in the address on the 'What is the transit holder’s address' page
    #Holder's contact person's details
    And I choose radio option Yes on the 'Do you want to add a contact' page
    And I enter John contact on the 'What is the contact’s name' page
    And I enter +2112212112 on the 'What is the transit holder’s contact phone number' page
    #Representative details
    And I choose radio option Yes on the 'Are you acting as a representative' page
    And I enter FR123123132 on the representative 'What is your EORI number or TIN' page
    And I enter Marie Rep on the representative 'What is your name' page
    And I choose radio option Indirect (principal and agent jointly liable) on the representative 'What is your capacity' page
    And I enter +11 1111 1111 on the representative 'What is your phone number' page
    #Consignor
    And I choose radio option Yes on the 'Do you know the consignor’s EORI number or TIN' page
    And I enter IT12312313 on the 'What is the consignor’s EORI number or TIN' page
    And I enter Pip Consignor on the 'What is the consignor’s name' page
    And I select United Kingdom on the 'Which country is the consignor based in' page
    And I fill in the address on the 'What is the consignor’s address' page
    And I choose radio option Yes on the 'Do you want to add a contact for the consignor' page
    And I enter Pip Contact on the 'Who is the contact for the consignor' page
    And I enter +123123123213 on the 'What is the consignor contact’s phone number' page

    #Consignee at header level
    And I choose radio option No on the 'Is there more than one consignee' page
    And I choose radio option Yes on the 'Do you know the consignee’s EORI number or TIN' page
    And I enter GE00101001 on the 'What is the consignee’s EORI number or TIN' page
    And I enter Simpson Blog Consignee on the 'What is the consignee’s name' page
    And I select United Kingdom on the 'Which country is the consignee based in' page
    And I fill in the address on the 'What is the consignee’s address' page
    And I submit on the Trader details Check your answers page
    Then I should be on the task list page
    And I should see COMPLETED status for trader details

    #Guarantee details
    And I click the link with visible text: Add guarantee details
    Then I should be on the 'Guarantee added for TIR declaration' page
    When I choose to continue
    And I should be on the task list page

    #Route details: Binding Itinerary set to No
    When I click the link with visible text: Add route details
    And I select Italy on the 'What is the country of destination' page
    And I select Bari on the 'Where is the office of destination' page
    And I choose radio option No on the 'Are you using a binding itinerary' page
    And I select Andorra on the 'Which country do you want to add to the transit route' page
    When I choose radio option Yes on the 'You have added 1 country to the transit route' page
    And I select Argentina on the 'Which country do you want to add to the transit route' page
    When I choose radio option No on the 'You have added 2 countries to the transit route' page
    And I submit on the Route details - Transit route Check your answers page

    #Route Details Location Of Goods -> Qualifier of the identification V [Customs office identifier]
    And I choose radio option Yes on the departure add location of goods page
    And I choose radio option Designated location on the 'Which type of location is it' page
    And I choose radio option Customs office identifier on the 'How do you want to identify the location of goods' page
    And I select XI on the departure location of goods customs office identification page
    And I submit on the Route details - Location of goods Check your answers page

    #Route Details Loading -> place of loading add un locode [No]
    And I choose radio option No on the 'Do you want to add a UN LOCODE for the place of loading' page
    And I select United Kingdom on the 'In which country is the place of loading' page
    When I enter London on the 'Where in United Kingdom is the place of loading' page

    #Route Details Unloading -> [Set 1]
    And I choose radio option No on the 'Do you want to add a UN LOCODE for the place of unloading' page
    And I select United Kingdom on the 'Which country is the place of unloading in' page
    And I enter London on the 'Where in United Kingdom is the place of unloading' page
    And I submit on the Route details - Places of loading and unloading Check your answers page
    And I submit on the Route details Check your answers page
    Then I should be on the task list page

    #Transport details
    When I click the link with visible text: Add transport details
    And I choose radio option Yes on the 'Do you want to use the same UCR for all items' page
    And I enter GB123456123456 on the 'What is the UCR' page
    And I select United Kingdom on the country of dispatch page
    And I choose radio option Yes on the 'Are all the items being transported to the same country' page
    And I select United Kingdom on the 'What country are the items being transported to' page

    #Transport details -> Container details
    And I choose radio option Yes on the 'Are you using any containers' page

    #Inland Mode Of Transport
    And I choose radio option Rail on the 'Which inland mode of transport are you using' page
    And I choose radio option Train number on the inland mode 'Which identification do you want to use for this vehicle' page
    And I enter 1234567 as train number on the 'What is the train number' page
    And I select United Kingdom on the inland mode 'What country is this vehicle registered to' page

    #Border Means Of Transport
    And I choose radio option Air on the 'Which mode of transport are you using to cross the border' page
    And I choose radio option registration number of the aircraft on the border mode 'Which identification do you want to use for this vehicle' page
    And I enter GB1234567 as registration number of the aircraft on the border means of transport identification number page
    #Border Means of Transport - Add Country
    And I choose radio option Yes on the 'Do you want to add the registered country for this vehicle' page
    And I select United Kingdom on the border mode 'What country is this vehicle registered to' page

    #Border Means of Transport - Office of Transit
    And I select BARI on the 'Where is the office of transit' page
    #Conveyance Reference Number
    And I enter GB123456123456 on the 'What is the conveyance reference number' page
    #Transport - Inland Mode - Border Means [ CYA ]
    And I submit on the Transport details - Modes and means of transport Check your answers page
    #Supply chain actor
    When I choose radio option No on the 'Do you want to add a supply chain actor' page

    #Authorisation
    And I choose radio option Yes on the 'Do you want to add an authorisation' page
    And I choose radio option TRD on the 'Which type of authorisation do you want to add' page
    And I enter TRD123 reference number on the 'What’s the reference number for the TRD authorisation' page
    When I choose radio option No on the 'You have added 1 transport authorisation' page

    #Carrier
    When I enter GB123456123456 on the 'What is the carrier’s EORI number or TIN' page
    And I choose radio option Yes on the 'Do you want to add a contact for the carrier' page
    And I enter Carry on the 'Who is the contact for the carrier' page
    And I enter +88 888 888 on the 'What is the phone number for the carrier’s contact' page
