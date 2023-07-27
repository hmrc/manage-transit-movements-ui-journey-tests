Feature: End to end journey for Northern Ireland office of departure

  Background:
    Given I login with ID 1234567890
    When I click on the Make a departure declaration link on the 'Manage your transit movements' page
    Then I input a random LRN on the 'What is the Local Reference Number?' page
    And I select XI on the 'Where is the office of departure?' page
    And I choose radio option Normal on the 'What type of procedure are you using?' page
    And I choose radio option TIR on the 'What declaration do you want to create?' page


  Scenario: 01 Security 'ENS' - Guarantee 'B' - Inland Mode 'Rail' - Border Means 'Air' - Container Ind 'No' - CL213 & CL754 Documents
    And I enter 1234567 on the 'What is the TIR carnet reference?' page
    And I choose radio option Entry summary declaration (ENS) on the 'What type of safety and security details do you need to add?' page
    And I submit the 'Check your answers' page

      ## Trader details
    When I click the Add trader details link on the 'Declaration summary' page

        ## Transit holder
    And I choose radio option Yes on the 'Do you know the transit holder’s EORI number or TIN?' page
    And I enter GB123456123456 on the 'What is the transit holder’s EORI number or TIN?' page

      ## Transit holder's contact person's details
    And I choose radio option No on the 'Do you want to add a contact?' page

      ## Transit holder's TIR id
    And I enter ABC/123/12345 on the 'What is the TIR holder’s identification number?' page

      ## Representative details
    And I choose radio option No on the 'Are you acting as a representative?' page

      ## Consignor
    And I choose radio option Yes on the 'Do you know the consignor’s EORI number or TIN?' page
    And I enter IT12312313 on the 'What is the consignor’s EORI number or TIN?' page

    And I choose radio option No on the 'Do you want to add a contact for the consignor?' page

      ## Consignee at header level
    And I choose radio option No on the 'Is there more than one consignee?' page
    And I choose radio option Yes on the 'Do you know the consignee’s EORI number or TIN?' page
    And I enter GE00101001 on the 'What is the consignee’s EORI number or TIN?' page

    And I submit on the 'Trader details Check your answers' page
    Then I should be on the 'Declaration summary' page
    And I should see COMPLETED status for trader details on the 'Declaration summary' page

      ## Route details
    When I click the Add route details link on the 'Declaration summary' page

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

      ## Guarantee details
    And I click the Add guarantee details link on the 'Declaration summary' page
    Then I click the Continue button on the 'Guarantee added for TIR declaration' page
    And I should be on the 'Declaration summary' page

      ## Transport details
    When I click the Add transport details link on the 'Declaration summary' page
    And I choose radio option Yes on the 'Do you want to use the same UCR for all items?' page
    And I enter UCR23456 on the 'What is the UCR?' page
    And I choose radio option Yes on the 'Are all the items being dispatched from the same country?' page
    And I select United Kingdom on the 'What is the country of dispatch?' page
    And I choose radio option Yes on the 'Are all the items being transported to the same country?' page
    And I select United Kingdom on the 'What is the country of destination?' page

      ## Container indicator
    And I choose radio option No on the 'Are you using any containers?' page

      ## Inland mode of transport
    And I choose radio option Rail on the 'Which inland mode of transport are you using?' page
    And I choose radio option Train number on the inland mode 'Which identification do you want to use for this vehicle?' page
    And I enter registration number 1234567 on the 'What is the train number?' page
    And I select United Kingdom on the inland mode 'What country is this vehicle registered to?' page

      ## Border means of transport
    And I choose radio option Air on the 'How is the transit crossing the border?' page
    And I choose radio option registration number of the aircraft on the border mode 'Which identification do you want to use for this vehicle?' page
    And I enter identification GB1234567 on the 'What is the registration number of the aircraft?' page
    And I choose radio option Yes on the 'Do you want to add the registered country for this vehicle?' page
    And I select United Kingdom on the border mode 'What country is this vehicle registered to?' page

      ## Border means of transport - office of transit
    And I select BARI on the 'Where is the customs office at the border?' page

      ## Conveyance Reference Number
    And I enter conveyance number GB123456123456 on the 'What is the conveyance reference number?' page
    And I submit on the 'Transport details - Modes and means of transport Check your answers' page

      ## Supply chain actor
    When I choose radio option No on the 'Do you want to add a supply chain actor for all items?' page

      ## Authorisation
    And I choose radio option Yes on the 'Do you want to add an authorisation' page
    And I choose radio option TRD on the 'Which type of authorisation do you want to add' page
    And I enter TRD123 reference number on the 'What is the reference number for the TRD authorisation?' page
    When I choose radio option No on the 'You have added 1 transport authorisation' page

      ## Carrier
    When I enter GB123456123456 on the 'What is the carrier’s EORI number or Third Country Unique Identification Number TCUIN?' page
    And I choose radio option Yes on the 'Do you want to add a contact for the carrier?' page
    And I enter Carry on the 'Who is the contact for the carrier?' page
    And I enter +88 888 888 on the 'What is the phone number for the carrier’s contact?' page

      ## Transport equipment
    And I choose radio option No on the 'Do you want to add any transport equipment?' page

      ##CYA changes to NO to test in Items details
    And click the Change link for Do you want to use the same Unique Consignment Reference? on the Transport details 'Check your answers' page
    And I choose radio option No on the 'Do you want to use the same UCR for all items?' page
    And click the Change link for Are all the items being dispatched from the same country? on the Transport details 'Check your answers' page
    And I choose radio option No on the 'Are all the items being dispatched from the same country?' page
    And click the Change link for Are all the items being transported to the same country? on the Transport details 'Check your answers' page
    And I choose radio option No on the 'Are all the items being transported to the same country?' page
    And I submit on the 'Transport details Check your answers' page
    Then I should be on the 'Declaration summary' page

    # Documents
    When I click the Add documents link on the 'Declaration summary' page
    And I click radio option Yes on the 'Do you want to add any documents?' page
#    Supporting document from list CL213 Supporting docs
    Then I select Supporting - (C673) Catch certificate on the 'What type of document do you want to add?' page
    And I enter RefNoCL213Doc1 on the 'What is the document’s reference number?' page
    And I click radio option Yes on the 'Do you want to add a line item number?' page
    And I enter 10001 on the 'What is the line item number?' page
    And I click radio option Yes on the 'Do you want to add any additional information for this document?' page
    And I enter 12345 on the Documents 'Enter the additional information' page
    And I submit on the 'Documents Check your answers' page
    And I choose radio option Yes on the 'You have added 1 document' page
#    Transport document from list CL754
    And I select Transport - (N741) Master airwaybill on the 'What type of document do you want to add?' page
    And I enter air1234 on the 'What is the document’s reference number?' page
    And I submit on the 'Documents Check your answers' page
    And I choose radio option Yes on the 'You have added 2 documents' page
    # Previous document from list
    And I select Previous - (C605) Information sheet INF3 on the 'What type of document do you want to add?' page
    And I enter 1234 on the 'What is the document’s reference number?' page
    And I click radio option No on the 'Do you want to declare the package used to transport the goods into the UK?' page
    And I click radio option No on the 'Do you want to declare the quantity of goods?' page
    And I click radio option No on the 'Do you want to add any additional information for this document?' page
    And I submit on the 'Documents Check your answers' page
    And I choose radio option No on the 'You have added 3 documents' page

      #Items
    When I click the Add items link on the 'Declaration summary' page
    And I enter This is a description of Item 1 on the 'Enter a description of item 1' page
    And I select United Kingdom on the 'What is the item’s country of dispatch?' page
    And I select Italy on the 'What is the item’s country of destination?' page
    And I enter UCR12312 on the 'What is the Unique Consignment Reference?' page
    And I click radio option Yes on the 'Do you want to add a Customs Union and Statistics code?' page
    And I enter ABC123456 on the 'What is the Customs Union and Statistics code?' page
    And I click radio option Yes on the 'Do you want to add a commodity code?' page
    And I enter ABC123 on the 'What is the commodity code?' page
    And I click radio option Yes on the 'Do you want to add a combined nomenclature code?' page
    And I enter A1 on the 'What is the combined nomenclature code?' page
      # Dangerous goods section
    And I click radio option No on the 'Does the item contain any dangerous goods?' page
      # Measurement section
    And I enter 100 on the 'What is the item’s gross weight?' page
    And I click radio option No on the 'Do you want to add the item’s net weight?' page
    And I click radio option No on the 'Do you want to add supplementary units?' page
      #Package section
    And I select (VL) Bulk, liquid on the 'What type of package are you using for the item?' page
    And I click radio option No on the 'Do you want to add a shipping mark?' page
    And I click radio option No on the 'You have added 1 type of package' page
    #Supply Chain Actor section
    And I click radio option No on the 'Do you want to add a supply chain actor for this item?' page
      #Documents section
    And I select Supporting - (C673) Catch certificate - RefNoCL213Doc1 on the 'Which document do you want to attach?' page
    And I click radio option No on the 'You have attached 2 documents to this item' page

     #Additional Reference section
    And I click radio option No on the 'Do you want to add an additional reference for this item?' page
    #Additional Information
    And I click radio option No on the 'Do you want to add any additional information for this item?' page
    #Items Summary
    And I submit on the 'Item 1 Check your answers' page
    And I click radio option No on the 'You have added 1 item' page
    And I sign out
