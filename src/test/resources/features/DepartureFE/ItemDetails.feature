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
    And I sign out