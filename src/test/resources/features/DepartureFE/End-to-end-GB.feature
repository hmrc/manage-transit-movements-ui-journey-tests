@departureGBe2e

Feature: End to end journey for Great Britain office of departure

  Background:
    Given I login with ID 1234567890
    When I click on the Make a departure declaration link on the 'Manage your transit movements' page
    Then I input a random LRN on the 'What is the Local Reference Number?' page
    And I choose radio option A on the 'Is this a standard or pre-lodged declaration?' page
    And I select GB on the 'Where is the office of departure?' page


  Scenario: 01 Procedure 'Simplified' - Declaration 'T2' - Security '2 EXS' - Binding itinerary 1 -
  Completed Consignee at header level - Container Ind 'Yes' - CL214 Documents - Optional Questions Covered in Individual Features
    And I choose radio option Simplified on the 'Which type of procedure are you using?' page
    And I choose radio option T2 on the 'Which type of declaration do you want to create?' page
    And I choose radio option Exit summary declaration (EXS) on the 'Which type of safety and security details do you want to add?' page
    And I submit the 'Check your answers' page

      ## Trader details
    And I click the Add trader details link on the 'Declaration summary' page
      ## Transit Holder
    And I choose radio option No on the 'Do you know the transit holder’s EORI number?' page
    And I enter Joe Blog on the 'What is the transit holder’s name?' page
    And I select United Kingdom on the 'Which country is the transit holder based in?' page
    And I fill in the address on the 'What is the transit holder’s address?' page

      ## Transit holder's contact person's details
    And I choose radio option Yes on the 'Do you want to add a contact for the transit holder?' page
    And I enter John contact on the 'What is the contact’s name?' page
    And I enter +2112212112 on the 'What is the phone number for the transit holder’s contact?' page

      ## Representative details
    And I choose radio option No on the 'Are you acting as a representative?' page

      ## Reduced data set operator (can only be true when security = 0)
    And I choose radio option Yes on the 'Do you want to use a reduced data set?' page

      ## Consignor
    And I choose radio option No on the 'Do you know the consignor’s EORI number or TIN?' page
    And I enter Pip Consignor on the 'What is the consignor’s name?' page
    And I select United Kingdom on the 'Which country is the consignor based in?' page
    And I fill in the address on the 'What is the consignor’s address?' page

      ## Consignor contact person's details
    And I choose radio option No on the 'Do you want to add a contact for the consignor?' page

      ## Consignee
    And I choose radio option No on the 'Do you know the consignee’s EORI number or TIN?' page
    And I enter Simpson Blog Consignee on the 'What is the consignee’s name?' page
    And I select United Kingdom on the 'Which country is the consignee based in?' page
    And I fill in the address on the 'What is the consignee’s address?' page
    And I submit on the Check your answers section Trader details page
    Then I should be on the 'Declaration summary' page
    And I should see Completed status for trader details on the 'Declaration summary' page

      ## Route details
    When I click the Add route details link on the 'Declaration summary' page

    And I choose radio option No on the 'Do you want to add a specific circumstance indicator?' page

      ## Transit route
    And I select Italy on the 'What country is the office of destination in?' page
    And I select IT on the 'Where in Italy is the office of destination?' page

      ## Binding itinerary indicator
    And I choose radio option Yes on the 'Are you using a binding itinerary?' page

      ## Country of routing - removing a transit country
    And I select Germany on the 'Which country do you want to add to the transit route?' page
    And I choose radio option Yes on the 'You have added 1 country to the transit route' page
    And I select France on the 'Which country do you want to add to the transit route?' page
    And I choose radio option Yes on the 'You have added 2 countries to the transit route' page
    And I select Andorra on the 'Which country do you want to add to the transit route?' page
    And I choose radio option No on the 'You have added 3 countries to the transit route' page
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
    And I choose radio option No on the 'You have added 2 offices of transit' page

      ## Location of goods
    And I enter 1234567890 on the 'What is the authorisation number for the location of goods?' page
    And I choose radio option No on the 'Do you want to add an additional identifier for the location of goods?' page
    And I choose radio option No on the 'Do you want to add a contact for the location of goods?' page
    And I submit on the Check your answers section Location of goods page

      ## Place of loading UN LOCODE
    And I choose radio option No on the 'Do you want to add a UN LOCODE for the place of loading?' page
    And I select United Kingdom on the 'In which country is the place of loading?' page
    And I enter London on the 'Where in United Kingdom is the place of loading?' page
    And I choose radio option No on the 'Do you want to add a place of unloading?' page
    And I submit on the Check your answers section Places of loading and unloading page

    And I submit on the Check your answers section Route details page
    Then I should be on the 'Declaration summary' page

      ## Guarantee details - remove guarantee
    When I click the Add guarantee details link on the 'Declaration summary' page
    And I choose radio option (A) Guarantee waiver by agreement on the 'Which type of guarantee is it?' page
    And I choose radio option No on the 'You have added 1 guarantee' page
    Then I should be on the 'Declaration summary' page

       # Transport details
    When I click the Add transport details link on the 'Declaration summary' page
    And I choose radio option Yes on the 'Do you want to use the same UCR for all items?' page
    And I enter GB123456123456 on the 'What is the UCR?' page
    And I choose radio option Yes on the 'Are all the items being dispatched from the same country?' page
    And I select United Kingdom on the 'What is the country of dispatch?' page

      ## Container indicator
    And I choose radio option Yes on the 'Are the goods being transported to another country after the end of this transit movement?' page
    And I choose radio option Yes on the 'Are all the items being transported to the same country?' page
    And I select Italy on the transport details 'What country are the items being transported to?' page
    And I choose radio option Yes on the 'Are you using any shipping containers to transport the goods?' page

      ## Inland mode of transport
    And I choose radio option No on the 'Do you want to add an inland mode of transport?' page
    And I choose radio option Name of a sea-going vessel on the inland mode 'Which identification do you want to use for this vehicle?' page
    And I enter registration number GB1234567 on the 'What is the identification number for this?' page
    And I select United Kingdom on the inland mode 'What country is this vehicle registered to?' page
    And I submit on the Check your answers section Departure means of transport page
    And I select radio option No on the 'You have added 1 departure means of transport' page

      ## Border means of transport
    And I choose radio option Sea on the 'How is the transit crossing the border?' page
    And I choose radio option Name of a sea-going vessel on the border mode 'Which identification do you want to use for this vehicle?' page
    And I enter identification GB1234567 on the 'What is the identification number for this?' page
    And I select United Kingdom on the border mode 'What country is this vehicle registered to?' page

      ## Border means office of transit
    And I select Bastia port (FR000380) on the 'Where is the customs office at the border?' page

      ## Conveyance Reference Number
    And I choose radio option No on the 'Do you want to add a conveyance reference number?' page
    And I submit on the Check your answers section Border means of transport page
    And I choose radio option No on the 'You have added 1 border means of transport' page
    And I submit on the Check your answers section Modes and means of transport page

      ## Supply chain actor
    And I choose radio option Yes on the 'Do you want to add a supply chain actor for all items?' page
    And I choose radio option Consolidator on the 'Which type of supply chain actor do you want to add?' page
    And I enter FR98472189002 on the 'What is the EORI number or Third Country Unique Identification Number TCUIN for the consolidator?' page
    And I choose radio option No on the 'You have added 1 supply chain actor' page

      ## Authorisation
    And I enter ACR123 reference number on the 'What is the reference number for the ACR authorisation?' page
    And I enter TRD123 reference number on the 'What is the reference number for the TRD authorisation?' page
    And I choose radio option No on the 'You have added 2 transport authorisations' page
    And I enter the date on the 'When do you expect the transit to arrive in AEROPORTO (IT262101)?' page


      ## Carrier
    When I choose radio option No on the 'Do you want to add a carrier?' page

      ## Transport Equipment
    And I enter C001 on the 'What is the container identification number?' page
    And I choose radio option No on the 'Do you want to add a seal?' page
    And I submit on the Check your answers section Transport equipment page
    And I choose radio option No on the 'You have added 1 transport equipment' page


      ## Charges
    And I choose radio option Yes on the 'Do you want to add a method of payment for transport charges?' page
    And I choose radio option Credit card on the 'Which method of payment do you want to use for transport charges?' page
    And I click radio option No on the 'Do you want to add an additional reference for all items?' page
    And I click radio option No on the 'Do you want to add any additional information for all items?' page
    And I submit on the Check your answers section Transport details page
    Then I should be on the 'Declaration summary' page

    ## Documents
    #  Add a Previous document from list CL214

    When I click the Add documents link on the 'Declaration summary' page
    And I click radio option No on the 'Do you want to use this document for all items?' page
    Then I select Previous - (C605) Information sheet INF3 on the 'What previous document do you want to add?' page
    And I enter 1234 on the 'What is the document’s reference number?' page
    And I click radio option No on the 'Do you want to add any additional information for this document?' page
    And I submit on the Check your answers section Documents page

    #  Add a Supporting document from list 213
    And I choose radio option Yes on the 'You have added 1 document' page
    And I click radio option No on the 'Do you want to use this document for all items?' page
    And I select Supporting - (N003) Certificate of quality on the 'What type of document do you want to add?' page
    And I enter 98765 on the 'What is the document’s reference number?' page
    And I click radio option No on the 'Do you want to add a line item number?' page
    And I click radio option No on the 'Do you want to add any additional information for this document?' page
    And I submit on the Check your answers section Documents page
    And I choose radio option Yes on the 'You have added 2 documents' page

        #  Add a Transport document from list 754
    And I click radio option Yes on the 'Do you want to use this document for all items?' page
    Then I select Transport - (N741) Master airwaybill on the 'What type of document do you want to add?' page
    And I enter 1234 on the 'What is the document’s reference number?' page
    And I submit on the Check your answers section Documents page
    Then I choose radio option No on the 'You have added 3 documents' page

    #Items
    When I click the Add items link on the 'Declaration summary' page
    And I enter This is a description on the 'Enter a description of item 1' page
    And I select (1) Transport equipment - C001 on the 'Which transport equipment are you using for this item?' page
    And I click radio option No on the 'Do you want to add a Customs Union and Statistics code?' page
    And I enter 010130 on the 'What is the commodity code?' page
      #  Dangerous goods section
    And I click radio option No on the 'Does the item contain any dangerous goods?' page

      #  Measurement section
    And I enter 100 on the 'What is the item’s gross weight?' page
    And I click radio option No on the 'Do you want to add supplementary units?' page

      #  Package section CL182 Yes
    And I select (NE) Unpacked or unpackaged on the 'What type of package are you using for the item?' page
    And I enter 1 on the 'How many of these are you using?' page
    And I click radio option No on the 'Do you want to add a shipping mark?' page
    And I click radio option No on the 'You have added 1 types of package' page

      #  Supply Chain Actor section
    And I click radio option No on the 'Do you want to add a supply chain actor for this item?' page


      #  Items Documents Section -T2 skips Yes/No to add document
    And I select Previous - (C605) Information sheet INF3 on the 'Which document do you want to attach?' page
    And I click radio option No on the 'You have attached 2 documents to this item' page

      #  Additional Reference Section
    And I click radio option No on the 'Do you want to add an additional reference for this item?' page

      #  Additional information section
    And I click radio option No on the 'Do you want to add any additional information for this item?' page

      #  Items Summary page
    And I submit on the Check your answers section Items page
    And I click radio option No on the 'You have added 1 item' page
    And I click the Confirm and send button on the 'Declaration summary' page
    And I click the Sign out link on the 'Departure declaration sent' page

  Scenario: 02 Procedure 'Normal'- Declaration 'T' - Security '0 No security' - Required document is missing - Declaration 'T' - Item declaration type T2 - Item Level Previous document added
    And I choose radio option Normal on the 'Which type of procedure are you using?' page
    And I choose radio option T on the 'Which type of declaration do you want to create?' page
    And I choose radio option No security on the 'Which type of safety and security details do you want to add?' page
    And I submit the 'Check your answers' page

    ## Trader details
    And I click the Add trader details link on the 'Declaration summary' page
      ## Transit Holder
    And I choose radio option Yes on the 'Do you know the transit holder’s EORI number?' page
    And I enter GB123456123456 on the 'What is the transit holder’s EORI number?' page

      ## Transit holder's contact person's details
    And I choose radio option No on the 'Do you want to add a contact for the transit holder?' page

      ## Representative details
    And I choose radio option No on the 'Are you acting as a representative?' page

      ## Reduced data set operator
    And I choose radio option No on the 'Do you want to use a reduced data set?' page

      ## Consignor
    And I choose radio option Yes on the 'Do you know the consignor’s EORI number or TIN?' page
    And I enter IT12312313 on the 'What is the consignor’s EORI number or TIN?' page
      ## Consignor contact person's details
    And I choose radio option No on the 'Do you want to add a contact for the consignor?' page

      ## Consignee
    And I choose radio option Yes on the 'Do you know the consignee’s EORI number or TIN?' page
    And I enter GE00101001 on the 'What is the consignee’s EORI number or TIN?' page

    And I submit on the Check your answers section Trader details page
    Then I should be on the 'Declaration summary' page
    And I should see Completed status for trader details on the 'Declaration summary' page

    # Route details
    When I click the Add route details link on the 'Declaration summary' page

      ## Transit route
    And I select Italy on the 'What country is the office of destination in?' page
    And I select IT on the 'Where in Italy is the office of destination?' page

      ## Binding itinerary indicator
    And I choose radio option No on the 'Are you using a binding itinerary?' page

      ## Transit route country optional
    And I choose radio option No on the transit route add country page
    And I submit on the Check your answers section Transit route page

      ## Country of Transit
    And I choose radio option Yes on the 'Does the transit include any T2 declarations?' page
    And I select France on the 'Which country is the office of transit in?' page
    And I select Brest bureau (FR000690) on the 'Where in France is the office of transit?' page
    And I choose radio option No on the 'Do you want to add a time of arrival in Brest bureau (FR000690)?' page
    And I submit on the Check your answers section Office of transit page
    And I choose radio option No on the 'You have added 1 office of transit' page

      ## Location of goods
    And I choose radio option Approved place on the 'Which type of location is it?' page
    And I choose radio option GPS coordinates on the 'How do you want to identify the location of goods?' page
    And I enter 50.96622 and 1.86211 on the 'What are the coordinates for the location of goods' page
    And I choose radio option No on the 'Do you want to add a contact for the location of goods?' page
    And I submit on the Check your answers section Location of goods page

      ## Place of loading UN LOCODE
    And I choose radio option No on the 'Do you want to add a UN LOCODE for the place of loading?' page
    And I select United Kingdom on the 'In which country is the place of loading?' page
    And I enter London on the 'Where in United Kingdom is the place of loading?' page
    And I submit on the Check your answers section Places of loading and unloading page

    And I submit on the Check your answers section Route details page
    Then I should be on the 'Declaration summary' page

     ## Guarantee details
    When I click the Add guarantee details link on the 'Declaration summary' page
    And I choose radio option (3) Individual guarantee in cash on the 'Which type of guarantee is it?' page
    And I choose radio option Yes on the 'Do you want to add a reference for the guarantee?' page
    And I enter 01GB123456789012 on the 'What is the reference for the guarantee?' page
    And I select GBP on the 'What currency do you want to use for the liability?' page
    And I enter 0 on the 'How much is the liability in pounds?' page
    And I choose radio option No on the 'Do you want to use the default liability amount of 10000 euros?' page
    And I enter 1299.99 on the 'How much is the liability in pounds?' page
    And I submit on the Check your answers section Guarantee details page
    And I choose radio option No on the 'You have added 1 guarantee' page
    Then I should be on the 'Declaration summary' page

     ## Transport details
    When I click the Add transport details link on the 'Declaration summary' page
    And I choose radio option No on the 'Do you want to use the same UCR for all items?' page
    And I choose radio option No on the 'Are all the items being dispatched from the same country?' page
    And I choose radio option No on the 'Are the goods being transported to another country after the end of this transit movement?' page

     ## Container indicator
    And I choose radio option No on the 'Are you using any shipping containers to transport the goods?' page

      ## Inland mode of transport
    And I choose radio option Yes on the 'Do you want to add an inland mode of transport?' page
    And I choose radio option Air on the 'Which inland mode of transport are you using?' page
    And I choose radio option IATA flight number on the inland mode 'Which identification do you want to use for this vehicle?' page
    And I enter registration number 1234567 on the 'What is the identification number for this?' page
    And I select United Kingdom on the border mode 'What country is this vehicle registered to?' page
    And I submit on the Check your answers section Departure means of transport page
    And I select radio option No on the 'You have added 1 departure means of transport' page
    And I choose radio option Yes on 'Do you want to add a border mode of transport?' page

      ## Border means of transport
    And I choose radio option Air on the 'How is the transit crossing the border?' page
    And I choose radio option No on the border means 'Do you want to add identification for this vehicle?' page
    And I submit on the Check your answers section Modes and means of transport page

      ## Supply chain actor
    When I choose radio option No on the 'Do you want to add a supply chain actor for all items?' page

      ## Carrier
    When I choose radio option No on the 'Do you want to add a carrier?' page

      ## Transport equipment
    And I choose radio option No on the 'Do you want to add any transport equipment?' page
    And I click radio option No on the 'Do you want to add an additional reference for all items?' page
    And I click radio option No on the 'Do you want to add any additional information for all items?' page

    And I submit on the Check your answers section Transport details page
    Then I should be on the 'Declaration summary' page

    # Documents - Previous document from list CL214

    When I click the Add documents link on the 'Declaration summary' page
    And I click radio option No on the 'Do you want to add any documents?' page

    #Items
    When I click the Add items link on the 'Declaration summary' page
    And I enter This is a description on the 'Enter a description of item 1' page
    And I choose radio option T2 on the 'Which type of declaration do you want to create for this item?' page
    And I select United Kingdom on the 'What is the item’s country of dispatch?' page
    And I select Italy on the 'What is the item’s country of destination?' page
    And I enter UCR12312 on the 'What is the Unique Consignment Reference?' page
    And I click radio option No on the 'Do you want to add a Customs Union and Statistics code?' page
    And I enter 010130 on the 'What is the commodity code?' page
       # Dangerous goods section
    And I click radio option No on the 'Does the item contain any dangerous goods?' page
       # Measurement section
    And I enter 100 on the 'What is the item’s gross weight?' page
    And I click radio option No on the 'Do you want to add the item’s net weight?' page
    And I click radio option No on the 'Do you want to add supplementary units?' page
      #Package section CL182 No, CL181 No
    And I select (AE) Aerosol on the 'What type of package are you using for the item?' page
    And I enter 10 on the 'How many of these are you using?' page
    And I enter This is a description on the 'What is the shipping mark?' page
    And I click radio option No on the 'You have added 1 type of package' page
    #Supply Chain Actor section
    And I click radio option No on the 'Do you want to add a supply chain actor for this item?' page

    #Documents section
    And I click the Go to your Documents section to add another document link on the 'You do not have any previous documents to attach' page
    Then I select Previous - (C605) Information sheet INF3 on the 'What previous document do you want to add?' page
    And I enter 1234 on the 'What is the document’s reference number?' page
    And I click radio option No on the 'Do you want to add any additional information for this document?' page
    And I submit on the Check your answers section Documents page
    And I choose radio option No on the 'You have added 1 documents' page
    And I click the Edit items link on the 'Declaration summary' page
    And I select Previous - (C605) Information sheet INF3 - 1234 on the 'Which document do you want to attach?' page
    And I click radio option No on the 'You have attached 1 documents to this item' page

       #Additional Reference section
    And I click radio option No on the 'Do you want to add an additional reference for this item?' page
    #Additional Information
    And I click radio option No on the 'Do you want to add any additional information for this item?' page
    #Items Summary
    And I submit on the Check your answers section Items page
    And I click radio option No on the 'You have added 1 item' page
    And I click the Confirm and send button on the 'Declaration summary' page
    And I click the Sign out link on the 'Departure declaration sent' page



