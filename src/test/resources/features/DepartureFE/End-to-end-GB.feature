@departureGBe2e
Feature: End to end journey for Great Britain office of departure

  Background:
    Given I login with ID 1234567890
    When I click on the Make a departure declaration link on the 'Manage your transit movements' page
    Then I input a random LRN on the 'What is the Local Reference Number?' page
    And I select GB on the 'Where is the office of departure?' page

  Scenario: 01 Procedure 'Simplified' - Declaration 'T2' - Security '2 EXS' - Binding itinerary 1 -
  Completed Consignee at header level - Container Ind 'Yes'
    And I choose radio option Simplified on the 'What type of procedure are you using?' page
    And I choose radio option T2 on the 'What declaration do you want to create?' page
    And I choose radio option Exit summary declaration (EXS) on the 'What type of safety and security details do you need to add?' page
    And I submit the 'Check your answers' page

      ## Trader details
    And I click the Add trader details link on the 'Declaration summary' page
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

      ## Route details
    When I click the Add route details link on the 'Declaration summary' page

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
    And I choose radio option Authorised place on the 'Which type of location is it?' page
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

      ## Guarantee details - remove guarantee
    When I click the Add guarantee details link on the 'Declaration summary' page
    And I choose radio option (A) Guarantee waiver by agreement on the 'Which type of guarantee is it?' page
    And I choose radio option Yes on the 'You have added 1 guarantee' page
    And I choose radio option (1) Comprehensive guarantee on the 'Which type of guarantee is it?' page
    And I enter 01GB1234567890120A123456 on the 'What is the Guarantee Reference Number?' page
    And I select GBP on the 'What currency do you want to use for the liability?' page
    And I enter 120 on the 'How much is the liability in pounds?' page
    And I enter AC01 on the 'What is the access code?' page
    And I submit on the 'Guarantee details Check your answers' page
    And I click the Remove link on the 'You have added 2 guarantees' page
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

       # Transport details
    When I click the Add transport details link on the 'Declaration summary' page
    And I choose radio option Yes on the 'Do you want to use the same UCR for all items?' page
    And I enter GB123456123456 on the 'What is the UCR?' page
    And I choose radio option Yes on the 'Are all the items being transported to the same country?' page
    And I select Italy on the transport details 'What is the country of destination?' page

      ## Container indicator
    And I choose radio option Yes on the 'Are you using any containers?' page

      ## Inland mode of transport
    And I choose radio option Road on the 'Which inland mode of transport are you using?' page
    And I choose radio option Registration number of a road trailer on the inland mode 'Which identification do you want to use for this vehicle?' page
    And I enter registration number GB1234567 on the 'What is the registration number of the road trailer?' page
    And I select United Kingdom on the inland mode 'What country is this vehicle registered to?' page

      ## Border means of transport
    And I choose radio option Maritime on the 'How is the transit crossing the border?' page
    And I choose radio option Name of a sea-going vessel on the border mode 'Which identification do you want to use for this vehicle?' page
    And I enter identification GB1234567 on the 'What is the name of the sea-going vessel?' page
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
    And I choose radio option Yes on the 'Do you want to add a supply chain actor?' page
    And I choose radio option Consolidator on the 'Which type of supply chain actor do you want to add?' page
    And I enter FR98472189002 on the 'What is the EORI number or Trader Identification Number TIN for the consolidator?' page
    And I choose radio option No on the 'You have added 1 supply chain actor' page

      ## Authorisation
    And I enter ACR123 reference number on the 'What is the reference number for the ACR authorisation?' page
    And I choose radio option Yes on the 'You have added 1 transport authorisation' page
    And I choose radio option SSE on the 'Which type of authorisation do you want to add' page
    And I enter SSE123 reference number on the 'What is the reference number for the SSE authorisation?' page
    And I choose to click on Remove link on the 'You have added 2 authorisations' page
    And I choose radio option Yes for the 'Are you sure you want to remove SSE authorisation SSE123?' page
    And I choose radio option No on the 'You have added 1 transport authorisation' page
    And I enter the date on the 'When is the limit date?' page

      ## Carrier
    And I enter GB123456123456 on the 'What is the carrier’s EORI number or TIN?' page
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
    And I choose radio option Yes on the 'Do you want to add a goods item number?' page
    And I enter 1 on the 'What is the goods item number?' page
    And I choose radio option Yes on the 'You have added 1 goods item number' page
    And I enter 2 on the 'What is the goods item number?' page
    And I click the Remove link on the 'You have added 2 goods item numbers' page
    And I click radio option Yes on the 'Are you sure you want to remove goods item number 1?' page
    And I choose radio option No on the 'You have added 1 goods item number' page
    And I submit on the 'Transport details - Transport equipment Check your answers' page
    And I choose radio option Yes on the 'You have added 1 transport equipment' page
    And I choose radio option Yes on the 'Do you want to add a container identification number?' page
    And I enter C002 on the 'What is the container identification number?' page
    And I choose radio option No on the 'Do you want to add a seal?' page
    And I enter 1 on the 'What is the goods item number?' page
    And I choose radio option No on the 'You have added 1 goods item number' page
    And I submit on the 'Transport details - Transport equipment Check your answers' page
    And I click the Remove link on the 'You have added 2 transport equipment' page
    And I click radio option Yes on the 'Are you sure you want to remove transport equipment 2?' page
    And I choose radio option No on the 'You have added 1 transport equipment' page

      ## Charges
    And I choose radio option Yes on the 'Do you want to add a method of payment for transport charges?' page
    And I choose radio option Credit card on the 'Which method of payment do you want to use for transport charges?' page
    And I submit on the 'Transport details Check your answers' page
    Then I should be on the 'Declaration summary' page

    # Documents
    When I click the Add documents link on the 'Declaration summary' page
    Then I select (T2L) T2L on the 'What previous document do you want to add?' page
    And I enter 1234 on the 'What is the document’s reference number?' page
    And I click radio option Yes on the 'Do you want to add a goods item number?' page
    And I enter 1234 on the documents 'What is the goods item number?' page
    And I click radio option Yes on the 'Do you want to declare the package the goods arrived in?' page
    Then I select (BG) Bag on the 'What type of package did the goods arrive in?' page
    And I click radio option Yes on the 'Do you want to declare the quantity of this package?' page
    And I enter 50 on the documents 'How many of these were there?' page
    And I click radio option Yes on the 'Do you want to declare the quantity of goods?' page
    And I select (GRM) Gram on the 'What metric do you want to use for the quantity of goods?' page
    And I enter 1500 on the 'How many of these do the goods include?' page
    And I click radio option Yes on the 'Do you want to add any additional information for this document?' page
    And I enter 12345 on the Documents 'Enter the additional information' page
    And I submit on the 'Documents Check your answers' page
    And I choose radio option Yes on the 'You have added 1 document' page
    And I select (380) Commercial invoice on the 'What type of document do you want to add?' page
    And I enter 98765 on the 'What is the document’s reference number?' page
    And I click radio option Yes on the 'Do you want to add a line item number?' page
    And I enter 010101 on the 'What is the line item number?' page
    And I click radio option Yes on the 'Do you want to add any additional information for this document?' page
    And I enter 12345 on the Documents 'Enter the additional information' page
    And I submit on the 'Documents Check your answers' page
    When I choose to click on the Remove link on the 'You have added 2 documents' page
    And I click radio option Yes on the 'Are you sure you want to remove the (380) Commercial invoice?' page
    And I choose radio option Yes on the 'You have added 1 document' page
    Then I select (235) Container list on the 'What type of document do you want to add?' page
    And I enter 1234 on the 'What is the document’s reference number?' page
    And I submit on the 'Documents Check your answers' page
    Then I choose radio option No on the 'You have added 2 documents' page

    #Items
    When I click the Add items link on the 'Declaration summary' page
    And I enter This is a description on the 'Enter a description of item 1' page
    And I click radio option No on the 'Do you want to add a Customs Union and Statistics code?' page
    And I enter ABC123 on the 'What is the commodity code?' page
      # Dangerous goods section
    And I click radio option Yes on the 'Does the item contain any dangerous goods?' page
    And I enter AB12 on the 'What is the UN number for the dangerous goods?' page
    And I click radio option Yes on the 'You have added 1 UN number for dangerous goods' page
    And I enter 1234 on the 'What is the UN number for the dangerous goods?' page
    And I click the Remove link on the 'You have added 2 UN numbers for dangerous goods' page
    And I click radio option Yes on the 'Are you sure you want to remove UN number AB12?' page
    And I click radio option No on the 'You have added 1 UN number for dangerous goods' page
      #Measurement section
    And I enter 100 on the 'What is the item’s gross weight?' page
    And I click radio option Yes on the 'Do you want to add supplementary units?' page
    And I enter 123.99 on the 'How many supplementary units does the item include?' page
      #Package section CL182 Yes
    And I select (NE) Unpacked or unpackaged on the 'What type of package are you using for the item?' page
    And I enter 100 on the 'How many (NE) Unpacked or unpackaged are you using?' page
    And I click radio option Yes on the 'Do you want to add a shipping mark?' page
    And I enter This is a description on the 'What is the shipping mark?' page
    And I click radio option Yes on the 'You have added 1 types of package' page
    And I select (AE) Aerosol on the 'What type of package are you using for the item?' page
    And I enter This is a description on the 'What is the shipping mark?' page
    And I click the Remove link on the 'You have added 2 types of packages' page
    And I click radio option Yes on the 'Are you sure you want to remove (NE) Unpacked or unpackaged from this item?' page
    And I click radio option No on the 'You have added 1 type of package' page
    #Documents Section -T2 skips Yes/No to add document
    And I select T2L on the 'Which document do you want to attach?' page
    And I click radio option Yes on the 'You have attached 1 document to this item' page
    And I select (235) Container list on the 'Which document do you want to attach?' page
    And I click the Remove link on the 'You have attached 2 document to this item' page
    And I click radio option Yes on the 'Are you sure you want to remove the (T2L) T2L - 1234 from this item?' document page
    And I click radio option No on the 'You have attached 1 document to this item' page

    #Additional Reference Section
    And I click radio option Yes on the 'Do you want to add an additional reference for this item?' page
    #select non C561 or C658
    And I select (Y023) Consignee (AEO certificate number) on the 'What type of additional reference do you want to add?' page
    And I click radio option Yes on the 'Do you want to add an additional reference number?' page
    And I enter 12345 on the 'Enter the additional reference number' page
    And click radio option Yes on the 'You have added 1 additional reference' page
    #select C561 or C658
    And I select (C651) Electronic administrative document (e-AD) on the 'What type of additional reference do you want to add?' page
    And I enter 98765 on the 'Enter the additional reference number' page
    And I click the Remove link on the 'You have added 2 additional references' page
    And I click radio option Yes on the 'Are you sure you want to remove this additional reference?' page
    And click radio option No on the 'You have added 1 additional reference' page
    #Additiaonl information section
    And I click radio option Yes on the 'Do you want to add any additional information for this item?' page
    And I select (20300) Export on the 'What type of additional information do you want to add?' page
    And I enter 12345 on the 'Enter the additional information' page
    And I click radio option Yes on the 'You have added 1 additional information' page
    And I select (20200) Export from one EFTA country subject to duties or export from the Union subject to duties on the 'What type of additional information do you want to add?' page
    And I enter 12345 on the 'Enter the additional information' page
    And I click the Remove link on the 'You have added 2 additional information' page
    And I click radio option Yes on 'Do you want to add any additional information for this item?' page
    And I click radio option No on the 'You have added 1 additional information' page
    #Items Summary page
    And I submit the 'Check your answers' page
    And I click radio option Yes on the 'You have added 1 item' page
    #Add another Item
    And I enter This is a description on the 'Enter a description of item 2' page
    And I click radio option No on the 'Do you want to add a Customs Union and Statistics code?' page
    And I enter ABC123 on the 'What is the commodity code?' page
    # Dangerous goods section
    And I click radio option No on the 'Does the item contain any dangerous goods?' page

    # Measurement section
    And I enter 100 on the 'What is the item’s gross weight?' page
    And I click radio option Yes on the 'Do you want to add supplementary units?' page
    And I enter 123.99 on the 'How many supplementary units does the item include?' page

    #Package section
    And I select (AE) Aerosol on the 'What type of package are you using for the item?' page
    And I enter This is a description on the 'What is the shipping mark?' page
    And I click radio option No on the 'You have added 1 type of package' page

    #Documents section
    And I select T2L on the 'Which document do you want to attach?' page
    And I click radio option Yes on the 'You have attached 1 document to this item' page
    And I select (235) Container list on the 'Which document do you want to attach?' page
    And I click the Remove link on the 'You have attached 2 document to this item' page
    And I click radio option Yes on the 'Are you sure you want to remove the (T2L) T2L - 1234 from this item?' document page
    And I click radio option No on the 'You have attached 1 document to this item' page

    #Additional Reference section
    And I click radio option No on the 'Do you want to add an additional reference for this item?' page
    #Additional Information
    And I click radio option No on the 'Do you want to add any additional information for this item?' page
    #Items Summary
    And I submit the 'Check your answers' page
    And I click the Remove link on the 'You have added 2 items' page
    And I click radio option Yes on the 'Are you sure you want to remove item 1?' page
    And I sign out


  Scenario: 02 Procedure 'Normal' - Declaration 'T' - Security '0' - Consignee in Item level, destination countries at Item level
  - Container Ind 'No'
    And I choose radio option Normal on the 'What type of procedure are you using?' page
    And I choose radio option T on the 'What declaration do you want to create?' page
    And I choose radio option No security on the 'What type of safety and security details do you need to add?' page
    And I submit the 'Check your answers' page

    ## Trader details
    And I click the Add trader details link on the 'Declaration summary' page
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
    When I click the Add route details link on the 'Declaration summary' page

      ## Transit route
    And I select Italy on the 'What is the country of destination?' page
    And I select IT on the 'Where is the office of destination?' page

      ## Binding itinerary indicator
    And I choose radio option No on the 'Are you using a binding itinerary?' page

      ## Transit route country optional
    And I choose radio option No on the transit route add country page
    And I submit on the 'Route details - Transit route Check your answers' page

      ## Country of Transit
    And I choose radio option Yes on the 'Does the transit include any T2 declarations?' page
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

     ## Guarantee details
    When I click the Add guarantee details link on the 'Declaration summary' page
    And I choose radio option (3) Individual guarantee in cash on the 'Which type of guarantee is it?' page
    And I choose radio option Yes on the 'Do you want to add a reference for the guarantee?' page
    And I enter 01GB123456789012 on the 'What is the reference for the guarantee?' page
    And I select GBP on the 'What currency do you want to use for the liability?' page
    And I enter 1299.99 on the 'How much is the liability in pounds?' page
    And I submit on the 'Guarantee details Check your answers' page
    And I choose radio option No on the 'You have added 1 guarantee' page
    Then I should be on the 'Declaration summary' page

     ## Transport details
    When I click the Add transport details link on the 'Declaration summary' page
    And I choose radio option No on the 'Do you want to use the same UCR for all items?' page
    And I choose radio option No on the 'Are all the items being transported to the same country?' page

      ## Container indicator
    And I choose radio option No on the 'Are you using any containers?' page

      ## Inland mode of transport
    And I choose radio option Road on the 'Which inland mode of transport are you using?' page
    And I choose radio option Registration number of a road trailer on the inland mode 'Which identification do you want to use for this vehicle?' page
    And I enter registration number GB1234567 on the 'What is the registration number of the road trailer?' page
    And I select United Kingdom on the inland mode 'What country is this vehicle registered to?' page

      ## Border means of transport
    And I choose radio option Air on the 'How is the transit crossing the border?' page
    And I choose radio option registration number of the aircraft on the border mode 'Which identification do you want to use for this vehicle?' page
    And I enter identification Air12345 on the 'What is the registration number of the aircraft?' page
    And I choose radio option Yes on the 'Do you want to add the registered country for this vehicle?' page
    And I select United Kingdom on the border mode 'What country is this vehicle registered to?' page

        ## Border means of transport - office of transit
    And I select Brest bureau (FR000690) on the 'Where is the customs office at the border?' page

       ## Conveyance Reference Number
    And I choose radio option No on the 'Do you want to add a conveyance reference number?' page
    And I submit on the 'Transport details - Border means of transport Check your answers' page
    And I choose radio option No on the 'You have added 1 border means of transport' page
    And I submit on the 'Transport details - Modes and means of transport Check your answers' page

      ## Supply chain actor
    When I choose radio option No on the 'Do you want to add a supply chain actor?' page

      ## Authorisation
    And I choose radio option No on the 'Do you want to add an authorisation' page

      ## Carrier
    When I enter GB123456123456 on the 'What is the carrier’s EORI number or TIN?' page
    And I choose radio option No on the 'Do you want to add a contact for the carrier?' page

      ## Transport equipment
    And I choose radio option Yes on the 'Do you want to add any transport equipment?' page
    And I choose radio option No on the 'Do you want to add a seal?' page
    And I enter 1 on the 'What is the goods item number?' page
    And I choose radio option No on the 'You have added 1 goods item number' page
    And I submit on the 'Transport details - Transport equipment Check your answers' page
    And I choose radio option No on the 'You have added 1 transport equipment' page
    And I submit on the 'Transport details Check your answers' page
    Then I should be on the 'Declaration summary' page

    # Documents - Transport docs
    When I click the Add documents link on the 'Declaration summary' page
    Then I select (235) Container list on the 'What type of document do you want to add?' page
    And I enter 1234 on the 'What is the document’s reference number?' page
    And I submit on the 'Documents Check your answers' page
    And I choose radio option No on the 'You have added 1 document' page

    #Items
    When I click the Add items link on the 'Declaration summary' page
    And I enter This is a description on the 'Enter a description of item 1' page
    And I choose radio option T1 on the 'Which type of declaration do you want to create for this item?' page
    And I select Italy on the 'What is the item’s country of destination?' page
    And I enter UCR12312 on the 'What is the Unique Consignment Reference?' page
    And I click radio option No on the 'Do you want to add a Customs Union and Statistics code?' page
    And I enter ABC123 on the 'What is the commodity code?' page
       # Dangerous goods section
    And I click radio option Yes on the 'Does the item contain any dangerous goods?' page
    And I enter AB12 on the 'What is the UN number for the dangerous goods?' page
    And I click radio option No on the 'You have added 1 UN number for dangerous goods' page
       # Measurement section
    And I enter 100 on the 'What is the item’s gross weight?' page
    And I click radio option Yes on the 'Do you want to add the item’s net weight?' page
    And I enter 25.99 on the 'What is the item’s net weight?' page
    And I click radio option No on the 'Do you want to add supplementary units?' page
      #Package section CL182 No, CL181 No
    And I select (AE) Aerosol on the 'What type of package are you using for the item?' page
    And I enter This is a description on the 'What is the shipping mark?' page
    And I click radio option No on the 'You have added 1 type of package' page
    #Documents section
    And I click radio option No on the 'Do you want to attach any documents to this item?' page
       #Additional Reference section
    And I click radio option No on the 'Do you want to add an additional reference for this item?' page
    #Additional Information
    And I click radio option No on the 'Do you want to add any additional information for this item?' page
    #Items Summary
    And I submit the 'Check your answers' page
    And I click radio option No on the 'You have added 1 item' page
    And I sign out

