@departureGBe2e

Feature: End to end journey for Great Britain office of departure

  Background:
    Given I login with ID 1234567890
    Then I should be on the Manage your transit movements page
    When I click on the Make a departure declaration link on the Manage your transit movements page
    Then I input a random LRN on the What is the Local Reference Number page
    And I select GB on the office of departure page

  @a11y 
  Scenario: 01 Procedure 'Simplified' - Declaration 'T2' - Security '2 EXS' - Binding itinerary 1 -Completed Consignee at header level
    And I choose radio option Simplified on the procedure type page
    And I choose radio option T2 on the declaration type page
    And I choose radio option Exit summary declaration (EXS) on the security type page
    And I submit the Check your answers page

    # Trader details
    And I click the link with visible text: Add trader details
      ## Transit Holder
    And I choose radio option Yes on the is eori known type page
    And I enter GB123456123456 on the holder eori number or tin page
    And I enter Joe Blog on the holder name page
    And I select United Kingdom on the holder country page
    And I fill in the holder address page

      ## Transit holder's contact person's details

    And I choose radio option Yes on the add contact page
    And I enter John contact on the holder's contact name page
    And I enter +2112212112 on the holder's contact phone number page

      ## Representative details
    And I choose radio option Yes on the acting as representative page
    And I enter FR123123132 on the representative eori number or tin page
    And I enter Marie Rep on the representative name page
    And I choose radio option Indirect (principal and agent jointly liable) on the representative capacity page
    And I enter +11 1111 1111 on the representative phone number page

      ## Reduced data set operator
    And I choose radio option Yes on the approved operator page

      ## Consignor
    And I choose radio option Yes on the is consignor eori number or tin known page
    And I enter IT12312313 on the consignor eori number or tin page
    And I enter Pip Consignor on the consignor name page
    And I select United Kingdom on the consignor country page
    And I fill in the consignor address page
    And I choose radio option Yes on adding contact for consignor page
    And I enter Pip Contact on the consignor contact name page
    And I enter +123123123213 on the consignor contact number page

      ## Consignee
    And I choose radio option No on the more than one consignee page
    And I choose radio option Yes on the is consignee eori number or tin known page
    And I enter GE00101001 on the consignee eori number or tin page
    And I enter Simpson Blog Consignee on the consignee name page
    And I select United Kingdom on the consignee country page
    And I fill in the consignee address page
    And I submit on the Trader details Check your answers page
    Then I should be on the task list page
    And I should see COMPLETED status for trader details

    # Route details
    When I click the link with visible text: Add route details

      ## Transit route
    And I select Italy on the country of destination page
    And I select IT on the office of destination page

      ## Binding itinerary indicator
    And I choose radio option Yes on the binding itinerary page

      ## Country of routing - removing a country page added
    And I select Andorra on the transit route country page
    Then I should have 1 country added to the transit route add another country page
    And I choose radio option Yes on the transit route add another country page
    And I select France on the transit route country page
    Then I should have 2 countries added to the transit route add another country page
    And I choose radio option Yes on the transit route add another country page
    And I select Germany on the transit route country page
    Then I should have 3 countries added to the transit route add another country page
    When I choose to click on the Remove link on the transit route add another country page
    And I choose radio option Yes on the transit route remove country page
    Then I should have 2 countries added to the transit route add another country page
    And I choose radio option No on the transit route add another country page
    And I submit on the Route details - Transit route Check your answers page

      ## Office of transit country page
    And I select Germany on the office of transit country page
    When I select Basel (DE004058) on the office of transit page
    And I choose radio option Yes on the office of transit add eta page
    And I choose fill in the date and time on the office of transit eta page
    And I submit on the Route details - Office of transit Check your answers page
    Then I should have 1 office of transit added on the add another office of transit page
    And I choose radio option No on the add another office of transit page

      ## Office of exit
    And I select Germany on the office of exit country page
    Then I should have Germany as an office of exit title on the office of exit page
    When I select Dortmund on the office of exit page
    And I submit on the Route details - Office of exit Check your answers page
    Then I should have 1 office of transit added on the add another office of exit page
    When I choose radio option No on the add another office of exit page

      ## Location of goods
    And I choose radio option Designated location on the departure location of goods type page
    And I choose radio option Authorisation number on the departure location of goods identification page
    And I enter 1234567890 on the departure location of goods authorisation number page
    And I choose radio option Yes on the departure location of goods add identifier page
    And I enter x9x9 on the departure location of goods additional identifier page
    And I choose radio option Yes on the departure location of goods add contact page
    And I enter Locator Joe on the departure location of goods contact page
    And I enter +432 1212 1212 on the departure location of goods contact telephone number page
    And I submit on the Route details - Location of goods Check your answers page

      ## Place of loading UN LOCODE
    And I choose radio option Yes on the place of loading add un locode page
    And I select Fateh Terminal (AEFAT) on the place of loading un locode page
    And I choose radio option Yes on the place of loading add extra information page
    And I select United Kingdom on the place of loading country page
    Then I should have United Kingdom as loading location on the place of loading location page
    When I enter London on the place of loading location page
    And I choose radio option Yes on the add place of unloading page
    And I choose radio option Yes on the place of unloading add un locode page
    And I select Aalen on the place of unloading un locode page
    And I choose radio option Yes on the place of unloading add extra information page
    And I select Italy on the place of unloading country page
    And I enter Milano on the Italy place of unloading location page
    And I submit on the Route details - Places of loading and unloading Check your answers page
    And I submit on the Route details Check your answers page
    Then I should be on the task list page

    #Guarantee details
    When I click the link with visible text: Add guarantee details

    And I choose radio option (3) Individual guarantee in cash on the guarantee type page
    And I choose radio option Yes on the do you want to add a reference for the guarantee page
    And I enter 01GB123456789012 on the other reference for the guarantee 3 page
    And I submit on the Guarantee details Check your answers page
    Then I should have 1 guarantee added on the add another guarantee page
    When I choose radio option Yes on the add another guarantee page
    And I choose radio option (R) Guarantee not required – goods carried on the Rhine, the Danube or their waterways on the guarantee type page
    Then I should have 2 guarantees added on the add another guarantee page
    When I choose radio option Yes on the add another guarantee page
    And I choose radio option (8) Guarantee not required – exempt public body on the guarantee type page
    And I enter 01GB123456789012 on the other reference for the guarantee 8 page
    And I submit on the Guarantee details Check your answers page
    Then I should have 3 guarantees added on the add another guarantee page
    When I choose radio option Yes on the add another guarantee page
    And I choose radio option (1) Comprehensive guarantee on the guarantee type page
    And I enter 01GB1234567890120A123456 on the Guarantee Reference Number page
    And I enter AC01 on the access code page
    And I enter 10000 on the amount to be covered page
    And I submit on the Guarantee details Check your answers page
    Then I should have 4 guarantees added on the add another guarantee page
    When I choose radio option No on the add another guarantee page
    Then I should be on the task list page

    #Transport details
    When I click the link with visible text: Add transport details

    And I choose radio option Yes on the apply ucr item page
    And I enter GB123456123456 on the UCR page
    And I choose radio option Yes on the items same destination country page
    And I select Italy on the items destination country page

      ## Container indicator
    And I choose radio option Yes on the containers page

      ## Inland mode of transport
    And I choose radio option Road on the Inland Mode of Transport page
    And I choose radio option Registration number of a road trailer on the Transport Identification page
    And I enter GB1234567 as registration number of the road trailer on the transport identification number page
    And I select United Kingdom on the Transport country page

      ## Border mode of transport
    And I choose radio option Maritime on the border mode of transport page
    And I choose radio option Name of a sea-going vessel on the border means of transport identification page
    And I enter GB1234567 as name of the sea-going vessel on the border means of transport identification number page
    And I choose radio option Yes on the add border means of transport country page
    And I select United Kingdom on the border means of transport country page

      ## Border means office of transit
    And I select Basel (DE004058) on the border means of transport office of transit page

      ## Conveyance Reference Number
    And I choose radio option Yes on the add conveyance reference number page
    And I enter GB123456123456 on the conveyance reference number page
    And I submit on the Transport details - Border means of transport Check your answers page
    And I should have 1 border means of transport added on the add another border means of transport page
    When I choose radio option No on the add another border means of transport page
    And I submit on the Transport details - Modes and means of transport Check your answers page

      ## Supply chain actor
    When I choose radio option Yes on the Do you want to add a supply chain actor page
    And I choose radio option Consolidator on the Which type of supply chain actor do you want to add page
    And I enter FR98472189002 on the What is the EORI number or Trader Identification Number for the consolidator page
    When I choose radio option No on the You have added 1 supply chain actor page

      ## Authorisation
    And I enter ACR123 reference number on the ACR transport authorisations number page
    Then I should have 1 authorisation on the add another transport authorisation page
    When I choose radio option Yes on the You have added 1 transport authorisation page
    And I choose radio option SSE on the transport authorisations type page
    And I enter SSE123 reference number on the SSE transport authorisations number page
    Then I should have 2 authorisations on the add another transport authorisation page
    When I choose to click on Remove link on the add another transport authorisation page
    And I choose radio option Yes for the SSE transport authorisation SSE123 on the remove page
    Then I should have 1 authorisation on the add another transport authorisation page
    When I choose radio option No on the You have added 1 transport authorisation page
        ### Authorisation Limit date
    And I enter the date on the limit date page

      ##Carrier
    When I enter GB123456123456 on the carrier eori number or tin page
    And I choose radio option Yes on the add carrier contact page
    And I enter Moseley on the carrier's contact name page
    And I enter +88 888 888 on the carrier's contact phone number page

    #TODO the rest of transport


  Scenario: 02 Procedure 'Normal' - Declaration 'T1' - Security '0' - Consignee in Item level, destination countries at Item level
    And I choose radio option Normal on the procedure type page
    And I choose radio option T1 on the declaration type page
    And I choose radio option No security on the security type page
    And I submit the Check your answers page

    # Trader details
    And I click the link with visible text: Add trader details
      ## Transit Holder
    And I choose radio option No on the is eori known type page
    And I enter Joe Blog on the holder name page
    And I select United Kingdom on the holder country page
    And I fill in the holder address page

     ## Transit holder's contact person's details

    And I choose radio option No on the add contact page

    ## Representative details
    And I choose radio option No on the acting as representative page

    ## Reduced data set operator
    And I choose radio option No on the approved operator page

    ## Consignor
    And I choose radio option No on the is consignor eori number or tin known page
    And I enter Pip Consignor on the consignor name page
    And I select United Kingdom on the consignor country page
    And I fill in the consignor address page
    And I choose radio option No on adding contact for consignor page

    ## Consignee
    And I choose radio option Yes on the more than one consignee page
    And I submit on the Trader details Check your answers page
    Then I should be on the task list page
    And I should see COMPLETED status for trader details

    # Route details
    When I click the link with visible text: Add route details

     ## Transit route
    And I select Italy on the country of destination page
    And I select IT on the office of destination page

      ## Binding itinerary indicator
    And I choose radio option No on the binding itinerary page

      ## Transit route country optional
    And I choose radio option No on the transit route add country page
    And I submit on the Route details - Transit route Check your answers page

      ## Country of Transit
    And I select France on the office of transit country page
    When I select Brest bureau (FR000690) on the office of transit page
    And I choose radio option No on the office of transit add eta page
    And I submit on the Route details - Office of transit Check your answers page
    Then I should have 1 office of transit added on the add another office of transit page
    And I choose radio option No on the add another office of transit page

      ## Location of goods
    And I choose radio option Approved place on the departure location of goods type page
    And I choose radio option Coordinates on the departure location of goods identification page
    And I enter 50.96622 and 1.86201 on the arrival location of goods coordinates page
    And I choose radio option No on the departure location of goods add contact page
    And I submit on the Route details - Location of goods Check your answers page

    ## Place of loading UN LOCODE
    And I choose radio option No on the place of loading add un locode page

    And I select United Kingdom on the place of loading country page
    Then I should have United Kingdom as loading location on the place of loading location page
    When I enter London on the place of loading location page
    And I submit on the Route details - Places of loading and unloading Check your answers page
    And I submit on the Route details Check your answers page
    Then I should be on the task list page


    #Guarantee details
    When I click the link with visible text: Add guarantee details

    And I choose radio option (R) Guarantee not required – goods carried on the Rhine, the Danube or their waterways on the guarantee type page
    Then I should have 1 guarantees added on the add another guarantee page
    When I choose radio option No on the add another guarantee page
    Then I should be on the task list page


    #Transport details
    When I click the link with visible text: Add transport details

    And I choose radio option No on the apply ucr item page
    And I choose radio option No on the items same destination country page

      ## Container indicator
    And I choose radio option No on the containers page

    ## Inland mode of transport
    And I choose radio option Road on the Inland Mode of Transport page
    And I choose radio option Registration number of a road trailer on the Transport Identification page
    And I enter GB1234567 as registration number of the road trailer on the transport identification number page
    And I select United Kingdom on the Transport country page

      ## Border mode of transport
    And I choose radio option No on the add border mode of transport page
    And I submit on the Transport details - Modes and means of transport Check your answers page

      ## Supply chain actor
    When I choose radio option No on the Do you want to add a supply chain actor page

      ## Authorisation
    And I choose radio option No on the Do you want to add an authorisation page

      ##Carrier
    #TODO change the step to be using the h1, add the quotes
    When I enter GB123456123456 on the carrier eori number or tin page
    And I choose radio option No on the add carrier contact page
















