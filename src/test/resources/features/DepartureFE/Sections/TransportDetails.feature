@TransportDetails @departure

Feature: Transport details - includes Pre-task list, Transport details, Containers details

  Background:
    Given I login with ID 1234567890
    Then I should be on the Manage your transit movements page
    When I click on the Make a departure declaration link on the Manage your transit movements page
    Then I input a random LRN on the What is the Local Reference Number page


  Scenario: 01 Transport Details - GB Normal - No Security
    And I select GB on the office of departure page
    And I choose radio option Normal on the procedure type page
    And I choose radio option T1 on the declaration type page
    And I choose radio option No security on the security type page
    And I submit on the CYA page
    Then I should be on the task list page
    #Route Details -> Binding Itinerary set to NO
    When I click the link with visible text: Add route details
    #Office of Destination Declared
    And I select United Kingdom on the country of destination page
    And I select GB on the departure office of destination page
    And I choose radio option No on the binding itinerary page
    And I choose radio option No on the transit route add country page
    And I submit on the CYA page
    #Route Details Transit
    And I choose radio option No on the add office of transit page
    #Route Details Location Of Goods
    And I choose radio option Designated location on the departure location of goods type page
    And I choose radio option EORI number or TIN on the departure location of goods identification page
    And I enter GB123456789000 on the departure location of goods eori tin page
    And I choose radio option No on the departure location of goods add identifier page
    And I choose radio option No on the departure location of goods add contact page
    And I submit on the CYA page
    #Route Details Loading
    And I choose radio option Yes on the place of loading add un locode page
    And I select Andorra la Vella on the place of loading un locode page
    And I choose radio option No on the place of loading add extra information page
    And I submit on the CYA page
    And I submit on the CYA page
    Then I should be on the task list page
    #Transport details
    When I click the link with visible text: Add transport details
    And I choose radio option Yes on the apply ucr item page
    And I enter GB123456123456 on the UCR page
    And I choose radio option Yes on the items same destination country page
    And I select United Kingdom on the items destination country page
    #Container details
    And I choose radio option Yes on the containers page
    #Inland Mode Of Transport
    And I choose radio option Maritime on the Inland Mode of Transport page
    And I choose radio option Name of a sea-going vessel on the Transport Identification page
    And I enter GB1234567 as name of the sea-going vessel on the transport identification number page
    And I select United Kingdom on the Transport country page
    #Transport details - Border mode of transport
    And I choose radio option Yes on the add border mode of transport page
    And I choose radio option Maritime on the border mode of transport page
    And I choose radio option Name of a sea-going vessel on the border means of transport identification page
    And I enter GB1234567 as name of the sea-going vessel on the border means of transport identification number page
    And I choose radio option Yes on the add border means of transport country page
    And I select United Kingdom on the border means of transport country page
    #Border Means of Transport - Office of Transit
    And I select Belfast EPU on the border means of transport office of transit page
    And I choose radio option Yes on the add conveyance reference number page
    #Conveyance Reference Number
    And I enter 123456123456 on the conveyance reference number page
    #Transport - Inland Mode - Border Means [CYA]
    And I submit on the CYA page
    #Supply chain actor
    And I choose radio option Yes on the supply chain actor add page
    And I choose radio option Consolidator on the supply chain actor type page
    And I enter GB98472189002 for eori number or tin number for consolidator on the supply chain actor eori tin page
    Then I should have 1 supply chain actor on the supply chain actor add another page
    When I choose radio option No on the supply chain actor add another page


  Scenario: 02 Transport Details - XI Normal - No Security
    And I select XI on the office of departure page
    And I choose radio option Normal on the procedure type page
    And I choose radio option TIR on the declaration type page
    And I enter 1234567 on the tir carnet page
    And I choose radio option Entry summary declaration (ENS) on the security type page
    And I submit on the CYA page
    Then I should be on the task list page
    #Route details section
    When I click the link with visible text: Add route details
    And I select Italy on the country of destination page
    And I select BARI (IT018100) on the departure office of destination page
    And I choose radio option No on the binding itinerary page
    And I select Andorra on the transit route country page
    Then I should have 1 country added to the transit route add another country page
    When I choose radio option No on the transit route add another country page
    And I submit on the CYA page
    #Route Details Location Of Goods
    And I choose radio option No on the departure add location of goods page
    #Route Details Loading
    And I choose radio option No on the place of loading add un locode page
    And I select United Kingdom on the place of loading country page
    Then I should have United Kingdom as loading location on the place of loading location page
    When I enter London on the place of loading location page
    #Route Details Unloading
    And I choose radio option No on the place of unloading add un locode page
    And I select United Kingdom on the place of unloading country page
    And I enter Birmingham on the United Kingdom place of unloading location page
    And I submit on the CYA page
    And I submit on the CYA page
    Then I should be on the task list page
    #Transport details section
    When I click the link with visible text: Add transport details
    And I choose radio option Yes on the apply ucr item page
    And I enter GB123456123456 on the UCR page
    And I select United Kingdom on the country of dispatch page
    And I choose radio option Yes on the same destination country page
    And I select United Kingdom on the items destination country page
    #Container details
    And I choose radio option Yes on the containers page
    #Inland Mode Of Transport
    And I choose radio option Rail on the Inland Mode of Transport page
    And I choose radio option Train number on the Transport Identification page
    And I enter 1234567 as train number on the transport identification number page
    And I select United Kingdom on the Transport country page
    #Border Mode Of Transport
    And I choose radio option Air on the border mode of transport page
    And I choose radio option registration number of the aircraft on the border means of transport identification page
    And I enter GB1234567 as registration number of the aircraft on the border means of transport identification number page
    #Border Means of Transport - Add Country
    And I choose radio option Yes on the add border means of transport country page
    And I select United Kingdom on the border means of transport country page
    #Border Means of Transport - Office of Transit
    And I select BARI on the border means of transport office of transit page
    #Conveyance Reference Number
    And I enter GB123456123456 on the conveyance reference number page
    #Transport - Inland Mode - Border Means [CYA]
    And I submit on the CYA page
    #Supply chain actor
    And I choose radio option No on the supply chain actor add page


  Scenario: 03 Transport Details - XI NON TIR - NO Security, NO UCR, NO containers
    And I select XI on the office of departure page
    And I choose radio option Normal on the procedure type page
    And I choose radio option T1 on the declaration type page
    And I choose radio option No security on the security type page
    And I submit on the CYA page
    Then I should be on the task list page
    #Route Details section
    When I click the link with visible text: Add route details
    #Office of Destination Declared
    And I select Italy on the country of destination page
    And I select BARI on the departure office of destination page
    And I choose radio option No on the binding itinerary page
    And I choose radio option No on the transit route add country page
    And I submit on the CYA page
    #Route Details Transit -> Add office of transit [No]
    And I choose radio option No on the add office of transit page
    #Route Details Location Of Goods -> Do you need to add a location of goods [NO]
    And I choose radio option No on the departure add location of goods page
    #Route Details Loading -> place of loading add un locode [Yes] -> Add Extra Info [Yes]
    And I choose radio option No on the place of loading add un locode page
    And I select Italy on the place of loading country page
    Then I should have Italy as loading location on the place of loading location page
    When I enter Rome on the place of loading location page
    #Route Details Unloading -> [Set 0]
    And I submit on the CYA page
    And I submit on the CYA page
    Then I should be on the task list page
    #Transport details section
    When I click the link with visible text: Add transport details
    And I choose radio option No on the apply ucr item page
    And I choose radio option No on the same destination country page
    #Container details
    And I choose radio option No on the containers page
    #Inland Mode Of Transport
    And I choose radio option Mail on the Inland Mode of Transport page
    And I submit on the CYA page
    #Supply chain actor: Add Another supply chain actor
    And I choose radio option Yes on the supply chain actor add page
    And I choose radio option Consolidator on the supply chain actor type page
    And I enter GB98472189002 for eori number or tin number for consolidator on the supply chain actor eori tin page
    Then I should have 1 supply chain actor on the supply chain actor add another page
    When I choose radio option Yes on the supply chain actor add another page
    And I choose radio option Freight forwarder on the supply chain actor type page
    And I enter GB98472189002 for eori number or tin number for freight forwarder on the supply chain actor eori tin page
    Then I should have 2 supply chain actors on the supply chain actor add another page
    When I choose to click on Remove link on the supply chain actor add another page
    And I choose radio option Yes on the supply chain actor remove page
    Then I should have 1 supply chain actor on the supply chain actor add another page
    When I choose radio option No on the supply chain actor add another page