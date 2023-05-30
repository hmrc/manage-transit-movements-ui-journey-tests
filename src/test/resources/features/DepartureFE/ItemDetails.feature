@departureItemDetails
Feature: Item details journey

  Background:
    Given I login with ID 1234567890

  Scenario: 01 Office Departure 'GB', Declaration 'T'
    And the user has submitted itemDetailsGB.json for LRN 1234567890TDGB and EORI number 1234567890
    And I refresh the page
    When I click on the View draft departure declarations link on the 'Manage your transit movements' page
    Then I click on the link for LRN 1234567890TDGB on the 'Draft departure declarations' page
    Then I should be on the 'Declaration summary' page

    ## Item details
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
    And I click radio option Yes on the 'You have added 1 UN number for dangerous goods' page
    And I enter 1234 on the 'What is the UN number for the dangerous goods?' page
    And I click the Remove link on the 'You have added 2 UN numbers for dangerous goods' page
    And I click radio option Yes on the 'Are you sure you want to remove UN number AB12?' page
    And I click radio option No on the 'You have added 1 UN number for dangerous goods' page

    #Measurement section
    And I enter 100 on the 'What is the item’s gross weight?' page
    And I click radio option Yes on the 'Do you want to add supplementary units?' page
    And I enter 123.99 on the 'How many supplementary units does the item include?' page

    #Package section
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

    #Supply Chain Actor Section
    And I click radio option Yes on the 'Do you want to add a supply chain actor for this item?' page
    And I click radio option Consolidator on the 'Which type of supply chain actor do you want to add?' item page
    And I enter GB123456 on the 'What is the EORI number or Trader Identification Number TIN for the consolidator?' item page
    And I click radio option Yes on the 'You have added 1 supply chain actor for this item' item page
    And I click radio option Warehouse keeper on the 'Which type of supply chain actor do you want to add?' item page
    And I enter ABC123 on the 'What is the EORI number or Trader Identification Number TIN for the warehouse keeper?' item page
    And I click the Remove link on the 'You have added 2 supply chain actors for this item' item page
    And I click radio option Yes on the 'Are you sure you want to remove this supply chain actor?' item page
    And I click radio option No on the 'You have added 1 supply chain actor for this item' item page

    #Documents section
    And I click radio option Yes on the 'Do you want to attach any documents to this item?' page
    And I select T2L on the 'Which document do you want to attach?' page
    And I click radio option Yes on the 'You have attached 1 document to this item' page
    And I select 380 on the 'Which document do you want to attach?' page
    And I click the Remove link on the 'You have attached 2 documents to this item' page
    And I click radio option Yes on the 'Are you sure you want to remove this document from the item?' document page
    And I click radio option No on the 'You have attached 1 document to this item' page

    #Additional Reference section
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
    And I choose radio option T1 on the 'Which type of declaration do you want to create for this item?' page
    And I select Italy on the 'What is the item’s country of destination?' page
    And I enter UCR12312 on the 'What is the Unique Consignment Reference?' page
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

    #Additional Supply Chain Actor section
    And I click radio option No on the 'Do you want to add a supply chain actor for this item?' page

    #Documents section
    And I click radio option No on the 'Do you want to attach any documents to this item?' page

    #Additional Reference section
    And I click radio option No on the 'Do you want to add an additional reference for this item?' page
    #Additional Information
    And I click radio option No on the 'Do you want to add any additional information for this item?' page
    #Items Summary
    And I submit the 'Check your answers' page
    And I click the Remove link on the 'You have added 2 items' page
    And I click radio option Yes on the 'Are you sure you want to remove item 1?' page
    And I sign out


  Scenario: 02 Office Departure 'XI', Declaration 'TIR'
    And the user has submitted itemDetailsXI.json for LRN 1234567890TDXI and EORI number 1234567890
    And I refresh the page
    When I click on the View draft departure declarations link on the 'Manage your transit movements' page
    Then I click on the link for LRN 1234567890TDXI on the 'Draft departure declarations' page
    Then I should be on the 'Declaration summary' page

    ## Item details
    When I click the Add items link on the 'Declaration summary' page
    And I enter This is a description on the 'Enter a description of item 1' page
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
    And I click radio option Yes on the 'Do you want to add the item’s net weight?' page
    And I enter 25.99 on the 'What is the item’s net weight?' page
    And I click radio option No on the 'Do you want to add supplementary units?' page

    #Package section
    And I select (AE) Aerosol on the 'What type of package are you using for the item?' page
    And I enter This is a description on the 'What is the shipping mark?' page
    And I click radio option No on the 'You have added 1 type of package' page

    #Additional Supply Chain Actor section
    And I click radio option No on the 'Do you want to add a supply chain actor for this item?' page

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

  Scenario: 03 Office Departure 'GB', Declaration 'T'
    And the user has submitted itemDetailsGB.json for LRN 1234567890TDGB and EORI number 1234567890
    And I refresh the page
    When I click on the View draft departure declarations link on the 'Manage your transit movements' page
    Then I click on the link for LRN 1234567890TDGB on the 'Draft departure declarations' page
    Then I should be on the 'Declaration summary' page
    When I click the Edit documents link on the 'Declaration summary' page
    And I click radio option No on the 'Do you want to use this document for all items?' page
    Then I select CodeOnly on the 'What type of document do you want to add?' page
    And I enter 1234 on the 'What is the document’s reference number?' page
    And I click radio option No on the 'Do you want to add a goods item number?' page
    And I click radio option No on the 'Do you want to declare the package the goods arrived in?' page
    And I click radio option No on the 'Do you want to declare the quantity of goods?' page
    And I click radio option No on the 'Do you want to add any additional information for this document?' page
    And I submit on the 'Documents Check your answers' page
    And I choose radio option Yes on the 'You have added 2 documents' page
    And I click radio option No on the 'Do you want to use this document for all items?' page
    Then I select (740) Air waybill on the 'What type of document do you want to add?' page
    And I enter AirwayBill123 on the 'What is the document’s reference number?' page
    And I submit the 'Check your answers' page
    And I choose radio option No on the 'You have added 3 documents' page
    Then I should be on the 'Declaration summary' page
    When I click the Edit documents link on the 'Declaration summary' page
    And I click radio option Yes on the 'Do you want to use this document for all items?' page
    Then I select (T1) Document T1 on the 'What type of document do you want to add?' page
    And I enter 1234 on the 'What is the document’s reference number?' page
    And I click radio option Yes on the 'Do you want to add any additional information for this document?' page
    And I enter 12345 on the Documents 'Enter the additional information' page
    And I submit on the 'Documents Check your answers' page
    And I choose radio option No on the 'You have added 3 document' page
    Then I should be on the 'Declaration summary' page
    When I click the Add item link on the 'Declaration summary' page
    And I enter This is a description on the 'Enter a description of item 1' page
    And I choose radio option T2 on the 'Which type of declaration do you want to create for this item?' page
    And I select Italy on the 'What is the item’s country of destination?' page
    And I enter UCR12312 on the 'What is the Unique Consignment Reference?' page
    And I click radio option No on the 'Do you want to add a Customs Union and Statistics code?' page
    And I enter ABC123 on the 'What is the commodity code?' page
    And I click radio option No on the 'Does the item contain any dangerous goods?' page
    And I enter 100 on the 'What is the item’s gross weight?' page
    And I click radio option No on the 'Do you want to add supplementary units?' page
    And I select (NE) Unpacked or unpackaged on the 'What type of package are you using for the item?' page
    And I enter 100 on the 'How many (NE) Unpacked or unpackaged are you using?' page
    And I click radio option No on the 'Do you want to add a shipping mark?' page
    And I click radio option No on the 'You have added 1 type of package' page
    And I click radio option Yes on the 'Do you want to add a supply chain actor for this item?' page
    And I click radio option Consolidator on the 'Which type of supply chain actor do you want to add?' item page
    And I enter GB123456 on the 'What is the EORI number or Trader Identification Number TIN for the consolidator?' item page
    And I click radio option No on the 'You have added 1 supply chain actor for this item' item page
    And I click radio option Yes on the 'Do you want to attach any documents to this item?' page
    And I select AirwayBill123 on the 'Which document do you want to attach?' page
    And I click the Remove link on the 'You have attached 2 documents to this item' page
    And I click radio option No on the 'Are you sure you want to remove this document from the item?' document page
    And I click radio option No on the 'You have attached 2 document to this item' page
    And I click radio option No on the 'Do you want to add an additional reference for this item?' page
    And I click radio option No on the 'Do you want to add any additional information for this item?' page
    And I submit the 'Check your answers' page
    And I click radio option No on the 'You have added 1 item' page
    And I sign out

