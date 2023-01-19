@TransportDetails @departure


Feature: Transport details - includes Pre-task list, Transport details, Containers details, Supply Chain, Authorisation

  Background:
    Given I login with ID 1234567890
    Then I should be on the Manage your transit movements page
    When I click on the Make a departure declaration link on the Manage your transit movements page
    Then I input a random LRN on the What is the Local Reference Number page


  Scenario: 01 Transport Details - GB Normal - Goods not-in free circulation with EU - No Security - Inland Mode 'Maritime' - Border Means 'Maritime' -
  Supply Chain Actor 'Add & Remove' - Authorisations 'Add & Remove'
  Authorisations: Procedure type = Normal, Reduced Data Set Indicator = 1, InlandMode = 1-Maritime, 2-Rail or 4-Air, AuthorisationTypeDeparture should be C524 TRD

    And I select GB on the office of departure page
    And I choose radio option Normal on the procedure type page
    And I choose radio option T1 on the declaration type page
    And I choose radio option No security on the security type page
    And I submit on the Pre-task list Check your answers page
    Then I should be on the task list page
    #Transit holder details
    When I click the link with visible text: Add trader details
    And I choose radio option Yes on the is eori known type page
    And I enter GB123456789000 on the holder eori number or tin page
    And I enter Joe Blog on the holder name page
    And I select United Kingdom on the holder country page
    And I fill in the holder address page
    #Holder's contact person's details
    And I choose radio option Yes on the add contact page
    And I enter Bob Blog Contact on the holder's contact name page
    And I enter +44 4381 82 83 on the holder's contact phone number page
    #Representative details
    And I choose radio option No on the acting as representative page
    #Reduced data set - YES
    And I choose radio option Yes on the approved operator page
    #Consignee at header level
    And I choose radio option No on the more than one consignee page
    And I choose radio option Yes on the is consignee eori number or tin known page
    And I enter GB123456123456 on the consignee eori number or tin page
    And I enter Simpson Blog Consignee on the consignee name page
    And I select United Kingdom on the consignee country page
    And I fill in the consignee address page
    And I submit on the Trader details Check your answers page
    #Route Details -> Binding Itinerary set to NO
    When I click the link with visible text: Add route details
    #Office of Destination Declared
    And I select United Kingdom on the country of destination page
    And I select GB on the departure office of destination page
    And I choose radio option No on the binding itinerary page
    And I choose radio option No on the transit route add country page
    And I submit on the Transit route Check your answers page
    #Route Details Transit
    And I choose radio option No on the add office of transit page
    #Route Details Location Of Goods
    And I choose radio option Designated location on the departure location of goods type page
    And I choose radio option EORI number or TIN on the departure location of goods identification page
    And I enter GB123456789000 on the departure location of goods eori tin page
    And I choose radio option No on the departure location of goods add identifier page
    And I choose radio option No on the departure location of goods add contact page
    And I submit on the Location of goods Check your answers page
    #Route Details Loading
    And I choose radio option Yes on the place of loading add un locode page
    And I select Andorra la Vella on the place of loading un locode page
    And I choose radio option No on the place of loading add extra information page
    And I submit on the Places of loading and unloading Check your answers page
    And I submit on the Route details Check your answers page
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
    And I submit on the Modes and means of transport Check your answers page
    #Supply chain actor
    When I choose radio option Yes on the Do you want to add a supply chain actor page
    And I choose radio option Consolidator on the Which type of supply chain actor do you want to add page
    And I enter GB98472189002 on the What is the EORI number or Trader Identification Number for the consolidator page
    When I choose radio option Yes on the You have added 1 supply chain actor page
    And I choose radio option Freight forwarder on the Which type of supply chain actor do you want to add page
    And I enter GB98472189002 on the What is the EORI number or Trader Identification Number for the freight forwarder page
    When I choose to click on the Remove link on the You have added 2 supply chain actors page
    And I choose radio option Yes on the Are you sure you want to remove this supply chain actor page
    When I choose radio option No on the You have added 1 supply chain actor page
    #Transport details - Authorisations - AuthorisationTypeDeparture should be C524 TRD
    And I enter 987654321012345 for What is the reference number for the TRD authorisation page
    When I choose radio option Yes for You have added 1 authorisation page
    And I choose radio option ACR authorisation for Which type of authorisation do you want to add page
    #authorisation ref no.
    And I enter 987654321012345 for What is the reference number for the ACR authorisation page
    When I choose to click on the Remove link on You have added 2 authorisations page
    And I choose radio option Yes for Are you sure you want to remove ACR authorisation 987654321012345 page
    And I choose radio option No for You have added 1 authorisation page


  Scenario: 02 Transport Details - XI Normal - Goods in free circulation with EU - No Security - Inland Mode 'Rail' - Border Means 'Air' - Authorisations 'Add & Change', Limit date
  Authorisations: Procedure type = Normal, Reduced Data Set Indicator = 0, InlandMode = 1-Maritime, 2-Rail or 4-Air, AuthorisationTypeDeparture should be optional - Yes/No

    And I select XI on the office of departure page
    And I choose radio option Normal on the procedure type page
    And I choose radio option T2 on the declaration type page
    And I choose radio option Entry summary declaration (ENS) on the security type page
    And I submit on the Pre-task list Check your answers page
    Then I should be on the task list page
    #Transit holder details
    When I click the link with visible text: Add trader details
    And I choose radio option No on the is eori known type page
    And I enter Joe Blog on the holder name page
    And I select United Kingdom on the holder country page
    And I fill in the holder address page
    #Holder's contact person's details
    And I choose radio option No on the add contact page
    #Representative details
    And I choose radio option No on the acting as representative page
    #Reduced data set - NO
    And I choose radio option No on the approved operator page
    #Consignor
    And I choose radio option No on the is consignor eori number or tin known page
    And I enter Lewies Blog Consignor on the consignor name page
    And I select United Kingdom on the consignor country page
    And I fill in the consignor address page
    #Consignor contact
    And I choose radio option No on adding contact for consignor page
    #Consignee at header level
    And I choose radio option Yes on the more than one consignee page
    And I submit on the Trader details Check your answers page
    #Route Details -> Binding Itinerary set to NO
    When I click the link with visible text: Add route details
    And I select Italy on the country of destination page
    And I select BARI (IT018100) on the departure office of destination page
    And I choose radio option No on the binding itinerary page
    And I select Andorra on the transit route country page
    Then I should have 1 country added to the transit route add another country page
    When I choose radio option No on the transit route add another country page
    And I submit on the Transit route Check your answers page
    And I select Andorra on the office of transit country page
    Then I should have Andorra as office of transit on the office of transit page
    When I select DCNJ PORTA on the office of transit page
    Then I should have DCNJ PORTA (AD000002) arrival time title on the office of transit add eta page
    When I choose radio option No on the office of transit add eta page
    And I submit on the Office of transit Check your answers page
    Then I should have 1 office of transit added on the add another office of transit page
    When I choose radio option No on the add another office of transit page
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
    And I submit on the Places of loading and unloading Check your answers page
    And I submit on the Route details Check your answers page
    Then I should be on the task list page
    #Transport details section
    When I click the link with visible text: Add transport details
    And I choose radio option Yes on the apply ucr item page
    And I enter GB123456123456 on the UCR page
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
    And I submit on the Modes and means of transport Check your answers page
    When I choose radio option No on the add another border means of transport page
    And I submit on the Modes and means of transport Check your answers page
    #Supply chain actor
    When I choose radio option No on the Do you want to add a supply chain actor page
    #Transport details - Authorisations - AuthorisationTypeDeparture should be Optional: Yes/No
    When I choose radio option Yes for Do you want to add an authorisation page
    And I choose radio option ACR authorisation for Which type of authorisation do you want to add page
    #authorisation ref no.
    And I enter 987654321012345 for What is the reference number for the ACR authorisation page
    When I choose to click on the Change link on You have added 1 authorisations page
    And I enter 123451234512345 for What is the reference number for the ACR authorisation page
    And I choose radio option No for You have added 1 authorisation page
    And I enter date on the limit date page


  Scenario: 03 Transport Details - XI NON TIR - Goods not-in free circulation with EU - NO Security, NO UCR, NO containers - Inland Mode 'Mail' - Authorisations 'Add & Remove'
  Authorisations: Procedure type = Simplified, Reduced Data Set Indicator = 1, InlandMode != 1-Maritime, 2-Rail or 4-Air, AuthorisationTypeDeparture should be C521 ACR

    And I select XI on the office of departure page
    And I choose radio option Simplified on the procedure type page
    And I choose radio option T1 on the declaration type page
    And I choose radio option No security on the security type page
    And I submit on the Pre-task list Check your answers page
    Then I should be on the task list page
    #Transit holder details
    When I click the link with visible text: Add trader details
    And I choose radio option No on the is eori known type page
    And I enter Joe Blog on the holder name page
    And I select United Kingdom on the holder country page
    And I fill in the holder address page
    #Holder's contact person's details
    And I choose radio option No on the add contact page
    #Representative details
    And I choose radio option No on the acting as representative page
    #Reduced data set - YES
    And I choose radio option Yes on the approved operator page
    #Consignee at header level
    And I choose radio option No on the more than one consignee page
    And I choose radio option Yes on the is consignee eori number or tin known page
    And I enter GB123456123456 on the consignee eori number or tin page
    And I enter Simpson Blog Consignee on the consignee name page
    And I select United Kingdom on the consignee country page
    And I fill in the consignee address page
    And I submit on the Trader details Check your answers page
    #Route Details section
    When I click the link with visible text: Add route details
    #Office of Destination Declared
    And I select Italy on the country of destination page
    And I select BARI on the departure office of destination page
    And I choose radio option No on the binding itinerary page
    And I choose radio option No on the transit route add country page
    And I submit on the Transit route Check your answers page
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
    And I submit on the Places of loading and unloading Check your answers page
    And I submit on the Route details Check your answers page
    Then I should be on the task list page
    #Transport details section
    When I click the link with visible text: Add transport details
    And I choose radio option No on the apply ucr item page
    And I choose radio option No on the same destination country page
    #Container details
    And I choose radio option No on the containers page
    #Inland Mode Of Transport
    And I choose radio option Mail on the Inland Mode of Transport page
    And I submit on the Modes and means of transport Check your answers page
    #Supply chain actor: Add Another supply chain actor
    When I choose radio option No on the Do you want to add a supply chain actor page
    #Transport details - Authorisations - AuthorisationTypeDeparture should be C521 ACR
    And I enter 987654321012345 for What is the reference number for the ACR authorisation page
    When I choose radio option Yes for You have added 1 authorisation page
    And I choose radio option SSE authorisation for Which type of authorisation do you want to add page
    #authorisation ref no.
    And I enter 987654321012345 for What is the reference number for the SSE authorisation page
    When I choose to click on the Remove link on You have added 2 authorisations page
    And I choose radio option Yes for Are you sure you want to remove SSE authorisation 987654321012345 page
    And I choose radio option No for You have added 1 authorisation page


  Scenario: 04 Transport Details - XI NON TIR - Goods not-in free circulation with EU - NO Security, NO UCR, NO containers - Inland Mode 'Mail' - Authorisations 'Add & Change'
  Authorisations: Procedure type = Normal, Reduced Data Set Indicator = 1, InlandMode != 1-Maritime, 2-Rail or 4-Air, AuthorisationTypeDeparture should be = user to choose the type of authorisation
    And I select XI on the office of departure page
    And I choose radio option Normal on the procedure type page
    And I choose radio option T1 on the declaration type page
    And I choose radio option No security on the security type page
    And I submit on the Pre-task list Check your answers page
    Then I should be on the task list page
    #Transit holder details
    When I click the link with visible text: Add trader details
    And I choose radio option No on the is eori known type page
    And I enter Joe Blog on the holder name page
    And I select United Kingdom on the holder country page
    And I fill in the holder address page
    #Holder's contact person's details
    And I choose radio option No on the add contact page
    #Representative details
    And I choose radio option No on the acting as representative page
    #Reduced data set - YES
    And I choose radio option Yes on the approved operator page
    #Consignee at header level
    And I choose radio option No on the more than one consignee page
    And I choose radio option Yes on the is consignee eori number or tin known page
    And I enter GB123456123456 on the consignee eori number or tin page
    And I enter Simpson Blog Consignee on the consignee name page
    And I select United Kingdom on the consignee country page
    And I fill in the consignee address page
    And I submit on the Trader details Check your answers page
    #Route Details section
    When I click the link with visible text: Add route details
    #Office of Destination Declared
    And I select Italy on the country of destination page
    And I select BARI on the departure office of destination page
    And I choose radio option No on the binding itinerary page
    And I choose radio option No on the transit route add country page
    And I submit on the Transit route Check your answers page
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
    And I submit on the Places of loading and unloading Check your answers page
    And I submit on the Route details Check your answers page
    Then I should be on the task list page
    #Transport details section
    When I click the link with visible text: Add transport details
    And I choose radio option No on the apply ucr item page
    And I choose radio option No on the same destination country page
    #Container details
    And I choose radio option No on the containers page
    #Inland Mode Of Transport
    And I choose radio option Mail on the Inland Mode of Transport page
    And I submit on the Modes and means of transport Check your answers page
    #Supply chain actor: Add Another supply chain actor
    When I choose radio option No on the Do you want to add a supply chain actor page
    #Transport details - Authorisations - AuthorisationTypeDeparture should be: "Which type of Authorisation do you want to add?"
    And I choose radio option SSE authorisation for Which type of authorisation do you want to add page
    #authorisation ref no.
    And I enter 987654321012345 for What is the reference number for the SSE authorisation page
    When I choose to click on the Change link on You have added 1 authorisations page
    And I enter 123451234512345 for What is the reference number for the SSE authorisation page
    And I choose radio option No for You have added 1 authorisation page