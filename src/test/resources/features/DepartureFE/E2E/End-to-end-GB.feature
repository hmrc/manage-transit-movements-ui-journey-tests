@departureGBe2e

Feature: End to end journey for Great Britain office of departure

  Background:
    Given I login with ID 1234567
    Then I am on the Manage Transit Movements Hub service
    Given I click on the Make a departure declaration link
    And I input a random LRN on the LocalReferenceNumber page
    And I select GB on the office of departure page

  @a11y

  Scenario: 01 GB Simplified - T1 - NO Safety and Security, Guarantees [0,3,5,9,R],Transport - InlandMode As Maritime
    And I choose radio option Simplified on the procedure type page
    And I choose radio option T1 on the declaration type page
    And I choose radio option No security on the security type page
    And I submit on the CYA page
    #Holder of transit
    And I click the link with visible text: Add trader details
    And I choose radio option No on the is eori known type page
    And I enter Joe Blog on the holder name page
    And I select United Kingdom on the holder country page
    And I fill in the holder address page
    #Holder's contact person's details
    And I choose radio option No on the add contact page
    #Representative details
    And I choose radio option No on the acting as representative page
    #Reduced data set
    And I choose radio option Yes on the approved operator page
    #Consignee at header level
    And I choose radio option Yes on the more than one consignee page
    #Change reduced data set indicator
    And I click the change link for has reduced data set on the CYA page
    And I choose radio option No on the approved operator page
    #Add consignor
    And I choose radio option Yes on the is consignor eori number or tin known page
    And I enter GB123456789000 on the consignor eori number or tin page
    And I enter Lewies Blog Consignor on the consignor name page
    And I select United Kingdom on the consignor country page
    And I fill in the consignor address page
    And I choose radio option No on adding contact for consignor page
    #Change and add contact
    And I click the change link for has consignor contact on the CYA page
    And I choose radio option Yes on adding contact for consignor page
    And I enter John Blog Consignor Contact on the consignor contact name page
    And I enter +348756374563 on the consignor contact number page
    #Change has more than one consignee
    And I click the change link for has more than one consignee on the CYA page
    And I choose radio option No on the more than one consignee page
    And I choose radio option Yes on the is consignee eori number or tin known page
    And I enter GB123456123456 on the consignee eori number or tin page
    And I enter Simpson Blog Consignee on the consignee name page
    And I select United Kingdom on the consignee country page
    And I fill in the consignee address page
    And I submit on the CYA page
    Then I should be on the task list page
    And I should see COMPLETED status for trader details
    When I click the link with visible text: Add guarantee details
  #Guarantee details
    And I choose radio option (0) Guarantee waiver on the guarantee type page
    And I enter 01GB1234567890120A123456 on the Guarantee Reference Number page
    And I enter AC01 on the access code page
    And I enter 10000 on the amount to be covered page
    And I submit on the CYA page
    Then I should have 1 guarantees added on the add another guarantee page
    When I choose radio option Yes on the add another guarantee page
    And I choose radio option (3) Individual guarantee in cash on the guarantee type page
    And I choose radio option Yes on the do you want to add a reference for the guarantee page
    And I enter 01GB123456789012 on the other reference for the guarantee 3 page
    And I submit on the CYA page
    Then I should have 2 guarantees added on the add another guarantee page
    When I choose radio option Yes on the add another guarantee page
    And I choose radio option (5) Guarantee waiver – secured for 500 euros or less on the guarantee type page
    And I enter 01GB1234567890120A123456 on the Guarantee Reference Number page
    And I submit on the CYA page
    Then I should have 3 guarantees added on the add another guarantee page
    When I choose radio option Yes on the add another guarantee page
    And I choose radio option (9) Individual guarantee with multiple usage on the guarantee type page
    And I enter 01GB1234567890120A123456 on the Guarantee Reference Number page
    And I enter AC01 on the access code page
    And I enter 10000 on the amount to be covered page
    And I submit on the CYA page
    Then I should have 4 guarantees added on the add another guarantee page
    When I choose radio option Yes on the add another guarantee page
    And I choose radio option (R) Guarantee not required – goods carried on the Rhine, the Danube or their waterways on the guarantee type page
    Then I should have 5 guarantees added on the add another guarantee page
    When I choose radio option No on the add another guarantee page
    Then I should be on the task list page
  #Route details: Binding Itinerary set to Yes
    When I click the link with visible text: Add route details
    And I select United Kingdom on the country of destination page
    And I select GB on the departure office of destination page
    And I choose radio option Yes on the binding itinerary page
    And I select Andorra on the transit route country page
    Then I should have 1 country added to the transit route add another country page
    When I choose to click on Remove link on the transit route add another country page
    And I choose radio option Yes on the transit route remove country page
    And I choose radio option Yes on the binding itinerary page
    And I select Andorra on the transit route country page
    Then I should have 1 country added to the transit route add another country page
    And I choose radio option No on the transit route add another country page
    And I submit on the CYA page
  #Route Details Transit -> Entry point is -> Add office of transit [No]
    And I choose radio option No on the add office of transit page
  #Route Details Location Of Goods -> Qualifier of the identification X [EORI number] -> [YES]
    And I choose radio option Authorised place on the departure location of goods type page
    And I choose radio option EORI number or TIN on the departure location of goods identification page
    And I enter GB123456789000 on the departure location of goods eori tin page
    And I choose radio option Yes on the departure location of goods add identifier page
    And I enter 1000 on the departure location of goods additional identifier page
    And I choose radio option Yes on the departure location of goods add contact page
    And I enter HMRC Test on the departure location of goods contact page
    And I enter +44 2345 82 83 on the departure location of goods contact telephone number page
    And I submit on the CYA page
  #Route Details Loading -> place of loading add un locode [Yes] -> Add Extra Info [Yes]
    And I choose radio option Yes on the place of loading add un locode page
    And I select Aalen on the place of loading un locode page
    And I choose radio option Yes on the place of loading add extra information page
    And I select United Kingdom on the place of loading country page
    Then I should have United Kingdom as loading location on the place of loading location page
    When I enter London on the place of loading location page
  #Route Details Unloading -> [Set 0]
    And I submit on the CYA page
    And I submit on the CYA page
    Then I should be on the task list page
  #Transport details
    When I click the link with visible text: Add transport details
    And I choose radio option Yes on the apply ucr item page
    And I enter GB123456123456 on the UCR page
    And I choose radio option Yes on the items same destination country page
    And I select United Kingdom on the items destination country page
  #Transport details -> Container details
    And I choose radio option Yes on the containers page
  #Inland Mode Of Transport
    And I choose radio option Maritime on the Inland Mode of Transport page
    And I choose radio option Name of a sea-going vessel on the Transport Identification page
    And I enter GB1234567 as name of the sea-going vessel on the transport identification number page
    And I select United Kingdom on the Transport country page
  #Border Means Of Transport
    And I choose radio option Yes on the add border mode of transport page
    And I choose radio option Maritime on the border mode of transport page
    And I choose radio option Name of a sea-going vessel on the border means of transport identification page
    And I enter GB1234567 as name of the sea-going vessel on the border means of transport identification number page
  #Border Means of Transport - Add Country
    And I choose radio option Yes on the add border means of transport country page
    And I select United Kingdom on the border means of transport country page
  #Border Means of Transport - Office of Transit
    And I select GB000142 on the border means of transport office of transit page
    And I choose radio option Yes on the add conveyance reference number page
  #Conveyance Reference Number
    And I enter GB123456123456 on the conveyance reference number page
  #Border Means of Transport - Remove
    Then I should have 1 border means of transport added on the add another border means of transport page
    When I choose to click on Remove link on the add another border means of transport page
    And I choose radio option Yes on the remove border means of transport page
  #Border Means of Transport - Add
    And I choose radio option Yes on the add border mode of transport page
    And I choose radio option Name of a sea-going vessel on the border means of transport identification page
    And I enter GB1234567 as name of the sea-going vessel on the border means of transport identification number page
    And I choose radio option Yes on the add border means of transport country page
    And I select United Kingdom on the border means of transport country page
    And I select GB000142 on the border means of transport office of transit page
    And I choose radio option Yes on the add conveyance reference number page
    And I enter GB123456123456 on the conveyance reference number page
    Then I should have 1 border means of transport added on the add another border means of transport page
  #Border Means of Transport - Add Another
    When I choose radio option Yes on the add another border means of transport page
    And I choose radio option Name of a sea-going vessel on the border means of transport identification page
    And I enter 0987654 as name of the sea-going vessel on the border means of transport identification number page
    And I choose radio option Yes on the add border means of transport country page
    And I select United Kingdom on the border means of transport country page
    And I select GB000142 on the border means of transport office of transit page
    And I choose radio option Yes on the add conveyance reference number page
    And I enter GB123456123456 on the conveyance reference number page
    Then I should have 2 border means of transport added on the add another border means of transport page
    When I choose radio option No on the add another border means of transport page
  #Transport Means Inland Mode - Change
    And I click the change link for transport means inland mode on the CYA page
    And I choose radio option Rail on the Inland Mode of Transport page
    And I choose radio option Train number on the Transport Identification page
    And I enter GB1234567 as train number on the transport identification number page
    And I select United Kingdom on the Transport country page
  #Transport - Inland Mode - Border Means [ CYA ]
    And I submit on the CYA page


  Scenario: 02 Pre Task List - GB Normal - T2 - ENS, Guarantees [1,2,4,8],Transport
    And I choose radio option Normal on the procedure type page
    And I choose radio option T2 on the declaration type page
    And I choose radio option Entry summary declaration (ENS) on the security type page
    And I submit on the CYA page
    #Holder of transit
    And I click the link with visible text: Add trader details
    And I choose radio option No on the is eori known type page
    And I enter Joe Blog on the holder name page
    And I select United Kingdom on the holder country page
    And I fill in the holder address page
    #Holder's contact person's details
    And I choose radio option No on the add contact page
    #Representative details
    And I choose radio option Yes on the acting as representative page
    And I enter GB123456121111 on the representative eori number or tin page
    And I enter Rosie Blog Rep on the representative name page
    And I choose radio option Direct (principal solely liable) on the representative capacity page
    And I enter +44 4381 82 83 on the representative phone number page
    #Reduced data set
    And I choose radio option No on the approved operator page
    #Consignor
    And I choose radio option Yes on the is consignor eori number or tin known page
    And I enter GB123456789000 on the consignor eori number or tin page
    And I enter Lewies Blog Consignor on the consignor name page
    And I select United Kingdom on the consignor country page
    And I fill in the consignor address page
    #Consignor contact
    And I choose radio option Yes on adding contact for consignor page
    And I enter John Blog Consignor Contact on the consignor contact name page
    And I enter +348756374563 on the consignor contact number page
    #Consignee at header level
    When I choose radio option Yes on the more than one consignee page
    And I submit on the CYA page
    Then I should be on the task list page
    And I should see COMPLETED status for trader details
    #Guarantee details
    And I click the link with visible text: Add guarantee details
    And I choose radio option (1) Comprehensive guarantee on the guarantee type page
    And I enter 01GB1234567890120A123456 on the Guarantee Reference Number page
    And I enter AC01 on the access code page
    And I enter 10000 on the amount to be covered page
    And I submit on the CYA page
    Then I should have 1 guarantees added on the add another guarantee page
    And I choose radio option Yes on the add another guarantee page
    #Guarantee details
    And I choose radio option (2) Individual guarantee as an undertaking by a guarantor on the guarantee type page
    And I enter 01GB1234567890120A123456 on the Guarantee Reference Number page
    And I enter AC01 on the access code page
    And I enter 10000 on the amount to be covered page
    And I submit on the CYA page
    Then I should have 2 guarantees added on the add another guarantee page
    And I choose radio option Yes on the add another guarantee page
    #Guarantee details
    And I choose radio option (4) Individual guarantee in the form of vouchers on the guarantee type page
    And I enter 01GB1234567890120A123456 on the Guarantee Reference Number page
    And I enter AC01 on the access code page
    And I enter 40000 on the amount to be covered page
    And I submit on the CYA page
    Then I should have 3 guarantees added on the add another guarantee page
    And I choose radio option Yes on the add another guarantee page
    And I choose radio option (8) Guarantee not required – exempt public body on the guarantee type page
    And I enter 01GB123456789012 on the other reference for the guarantee 8 page
    And I submit on the CYA page
    And I choose radio option No on the add another guarantee page
    Then I should be on the task list page
  #Route details: Binding Itinerary set to No and additional route
    When I click the link with visible text: Add route details
    And I select Italy on the country of destination page
    And I select Bari on the departure office of destination page
    And I choose radio option No on the binding itinerary page
    And I select Andorra on the transit route country page
    Then I should have 1 country added to the transit route add another country page
    When I choose radio option Yes on the transit route add another country page
    And I select Argentina on the transit route country page
    Then I should have 2 countries added to the transit route add another country page
    When I choose radio option No on the transit route add another country page
    And I submit on the CYA page
  #Route Details Transit -> Entry point is [Office of transit country]
    And I select Andorra on the office of transit country page
    Then I should have Andorra as office of transit on the office of transit page
    When I select DCNJ PORTA on the office of transit page
    Then I should have DCNJ PORTA (AD000002) arrival time title on the office of transit add eta page
    When I choose radio option Yes on the office of transit add eta page
    Then I should have DCNJ PORTA, Andorra as transit to arrive on the office of transit eta page
    And I choose fill in the date and time on the office of transit eta page
    And I submit on the CYA page
    Then I should have 1 office of transit added on the add another office of transit page
    When I choose radio option Yes on the add another office of transit page
    And I select Andorra on the office of transit country page
    Then I should have Andorra as office of transit on the office of transit page
    When I select CUSTOMS OFFICE on the office of transit page
    Then I should have CUSTOMS OFFICE SANT JULIÀ DE LÒRIA (AD000001) arrival time title on the office of transit add eta page
    When I choose radio option No on the office of transit add eta page
    And I submit on the CYA page
    Then I should have 2 offices of transit added on the add another office of transit page
    And I choose radio option No on the add another office of transit page
  #Route Details Location Of Goods -> Qualifier of the identification W [Coordinate] -> [No]
    And I choose radio option Designated location on the departure location of goods type page
    And I choose radio option Coordinates on the departure location of goods identification page
    And I enter 50.96622 and 50.96622 on the departure location of goods coordinates page
    And I choose radio option No on the departure location of goods add contact page
    And I submit on the CYA page
  #Route Details Loading -> place of loading add un locode [No]
    And I choose radio option Yes on the place of loading add un locode page
    And I select Andorra la Vella on the place of loading un locode page
    And I choose radio option No on the place of loading add extra information page
  #Route Details Unloading -> [Set 1]
    And I choose radio option No on the place of unloading add un locode page
    And I select United Kingdom on the place of unloading country page
    And I enter Manchester on the United Kingdom place of unloading location page
    And I submit on the CYA page
    And I submit on the CYA page
    Then I should be on the task list page
  #Transport details
    When I click the link with visible text: Add transport details
    And I choose radio option Yes on the apply ucr item page
    And I enter GB123456123456 on the UCR page
    And I choose radio option Yes on the items same destination country page
    And I select United Kingdom on the items destination country page
  #Transport details -> Container details
    And I choose radio option Yes on the containers page
  #Inland Mode Of Transport
    And I choose radio option Rail on the Inland Mode of Transport page
    And I choose radio option Train number on the Transport Identification page
    And I enter 1234567 as train number on the transport identification number page
    And I select United Kingdom on the Transport country page
  #Border Means Of Transport
    And I choose radio option Rail on the border mode of transport page
    And I enter 1234567 as train number on the border means of transport identification number page
  #Border Means of Transport - Add Country
    And I choose radio option Yes on the add border means of transport country page
    And I select United Kingdom on the border means of transport country page
  #Border Means of Transport - Office of Transit
    And I select BARI on the border means of transport office of transit page
  #Conveyance Reference Number
    And I choose radio option Yes on the add conveyance reference number page
    And I enter GB123456123456 on the conveyance reference number page
  #Border Means of Transport
    Then I should have 1 border means of transport added on the add another border means of transport page
    When I choose radio option No on the add another border means of transport page
  #Transport - Inland Mode - Border Means [ CYA ]
    And I submit on the CYA page


  Scenario: 03 GB Simplified - T2 - NO Safety and Security, Guarantees [0,3,5,9,R], Transport
    And I choose radio option Simplified on the procedure type page
    And I choose radio option T2 on the declaration type page
    And I choose radio option No security on the security type page
    And I submit on the CYA page
    #Holder of transit
    And I click the link with visible text: Add trader details
    And I choose radio option No on the is eori known type page
    And I enter Joe Blog on the holder name page
    And I select United Kingdom on the holder country page
    And I fill in the holder address page
    #Holder's contact person's details
    And I choose radio option No on the add contact page
    #Representative details
    And I choose radio option No on the acting as representative page
    #Reduced data set
    And I choose radio option Yes on the approved operator page
    #Consignee at header level
    And I choose radio option Yes on the more than one consignee page
    #Change reduced data set indicator
    And I click the change link for has reduced data set on the CYA page
    And I choose radio option No on the approved operator page
    #Add consignor
    And I choose radio option Yes on the is consignor eori number or tin known page
    And I enter GB123456789000 on the consignor eori number or tin page
    And I enter Lewies Blog Consignor on the consignor name page
    And I select United Kingdom on the consignor country page
    And I fill in the consignor address page
    And I choose radio option No on adding contact for consignor page
    #Change and add contact
    And I click the change link for has consignor contact on the CYA page
    And I choose radio option Yes on adding contact for consignor page
    And I enter John Blog Consignor Contact on the consignor contact name page
    And I enter +348756374563 on the consignor contact number page
    #Change has more than one consignee
    And I click the change link for has more than one consignee on the CYA page
    And I choose radio option No on the more than one consignee page
    And I choose radio option Yes on the is consignee eori number or tin known page
    And I enter GB123456123456 on the consignee eori number or tin page
    And I enter Simpson Blog Consignee on the consignee name page
    And I select United Kingdom on the consignee country page
    And I fill in the consignee address page
    And I submit on the CYA page
    Then I should be on the task list page
    And I should see COMPLETED status for trader details
    When I click the link with visible text: Add guarantee details
  #Guarantee details
    And I choose radio option (0) Guarantee waiver on the guarantee type page
    And I enter 01GB1234567890120A123456 on the Guarantee Reference Number page
    And I enter AC01 on the access code page
    And I enter 10000 on the amount to be covered page
    And I submit on the CYA page
    Then I should have 1 guarantees added on the add another guarantee page
    When I choose radio option Yes on the add another guarantee page
    And I choose radio option (3) Individual guarantee in cash on the guarantee type page
    And I choose radio option Yes on the do you want to add a reference for the guarantee page
    And I enter 01GB123456789012 on the other reference for the guarantee 3 page
    And I submit on the CYA page
    Then I should have 2 guarantees added on the add another guarantee page
    When I choose radio option Yes on the add another guarantee page
    And I choose radio option (5) Guarantee waiver – secured for 500 euros or less on the guarantee type page
    And I enter 01GB1234567890120A123456 on the Guarantee Reference Number page
    And I submit on the CYA page
    Then I should have 3 guarantees added on the add another guarantee page
    When I choose radio option Yes on the add another guarantee page
    And I choose radio option (9) Individual guarantee with multiple usage on the guarantee type page
    And I enter 01GB1234567890120A123456 on the Guarantee Reference Number page
    And I enter AC01 on the access code page
    And I enter 10000 on the amount to be covered page
    And I submit on the CYA page
    Then I should have 4 guarantees added on the add another guarantee page
    When I choose radio option Yes on the add another guarantee page
    And I choose radio option (R) Guarantee not required – goods carried on the Rhine, the Danube or their waterways on the guarantee type page
    Then I should have 5 guarantees added on the add another guarantee page
    When I choose radio option No on the add another guarantee page
    Then I should be on the task list page
  #Route details: Binding Itinerary set to Yes
    When I click the link with visible text: Add route details
    And I select United Kingdom on the country of destination page
    And I select GB on the departure office of destination page
    And I choose radio option Yes on the binding itinerary page
    And I select Andorra on the transit route country page
    Then I should have 1 country added to the transit route add another country page
    When I choose to click on Remove link on the transit route add another country page
    And I choose radio option Yes on the transit route remove country page
    And I choose radio option Yes on the binding itinerary page
    And I select Andorra on the transit route country page
    Then I should have 1 country added to the transit route add another country page
    And I choose radio option No on the transit route add another country page
    And I submit on the CYA page
  #Route Details Transit -> Entry point is -> Add office of transit [No]
    And I choose radio option No on the add office of transit page
  #Route Details Location Of Goods ->  Qualifier of the identification Z [Address]
    And I choose radio option Designated location on the departure location of goods type page
    And I choose radio option Address on the departure location of goods identification page
    And I select United Kingdom on the location of goods country page
    And I fill in address on the departure location of goods address page
    And I choose radio option No on the departure location of goods add contact page
    And I submit on the CYA page
  #Route Details Loading -> place of loading add un locode [Yes] -> place of loading add extra information [No]
    And I choose radio option Yes on the place of loading add un locode page
    And I select Andorra la Vella on the place of loading un locode page
    And I choose radio option No on the place of loading add extra information page
  #Route Details Unloading -> [Set 0]
    And I submit on the CYA page
    And I submit on the CYA page
    Then I should be on the task list page
  #Transport details
    When I click the link with visible text: Add transport details
    And I choose radio option Yes on the apply ucr item page
    And I enter GB123456123456 on the UCR page
    And I choose radio option Yes on the items same destination country page
    And I select United Kingdom on the items destination country page
  #Transport details -> Container details
    And I choose radio option Yes on the containers page
  #Inland Mode Of Transport
    And I choose radio option Mail on the Inland Mode of Transport page
  #Transport - Inland Mode [ CYA ]
    And I submit on the CYA page


  Scenario: 04 GB Normal - T1 - NO Safety and Security, Guarantees [0,3,5,9,R]
    And I choose radio option Normal on the procedure type page
    And I choose radio option T1 on the declaration type page
    And I choose radio option No security on the security type page
    And I submit on the CYA page
    #Holder of transit
    And I click the link with visible text: Add trader details
    And I choose radio option No on the is eori known type page
    And I enter Joe Blog on the holder name page
    And I select United Kingdom on the holder country page
    And I fill in the holder address page
    #Holder's contact person's details
    And I choose radio option No on the add contact page
    #Representative details
    And I choose radio option No on the acting as representative page
    #Reduced data set
    And I choose radio option Yes on the approved operator page
    #Consignee at header level
    And I choose radio option Yes on the more than one consignee page
    #Change reduced data set indicator
    And I click the change link for has reduced data set on the CYA page
    And I choose radio option No on the approved operator page
    #Add consignor
    And I choose radio option Yes on the is consignor eori number or tin known page
    And I enter GB123456789000 on the consignor eori number or tin page
    And I enter Lewies Blog Consignor on the consignor name page
    And I select United Kingdom on the consignor country page
    And I fill in the consignor address page
    And I choose radio option No on adding contact for consignor page
    #Change and add contact
    And I click the change link for has consignor contact on the CYA page
    And I choose radio option Yes on adding contact for consignor page
    And I enter John Blog Consignor Contact on the consignor contact name page
    And I enter +348756374563 on the consignor contact number page
    #Change has more than one consignee
    And I click the change link for has more than one consignee on the CYA page
    And I choose radio option No on the more than one consignee page
    And I choose radio option Yes on the is consignee eori number or tin known page
    And I enter GB123456123456 on the consignee eori number or tin page
    And I enter Simpson Blog Consignee on the consignee name page
    And I select United Kingdom on the consignee country page
    And I fill in the consignee address page
    And I submit on the CYA page
    Then I should be on the task list page
    And I should see COMPLETED status for trader details
    When I click the link with visible text: Add guarantee details
  #Guarantee details
    And I choose radio option (0) Guarantee waiver on the guarantee type page
    And I enter 01GB1234567890120A123456 on the Guarantee Reference Number page
    And I enter AC01 on the access code page
    And I enter 10000 on the amount to be covered page
    And I submit on the CYA page
    Then I should have 1 guarantees added on the add another guarantee page
    When I choose radio option Yes on the add another guarantee page
    And I choose radio option (3) Individual guarantee in cash on the guarantee type page
    And I choose radio option Yes on the do you want to add a reference for the guarantee page
    And I enter 01GB123456789012 on the other reference for the guarantee 3 page
    And I submit on the CYA page
    Then I should have 2 guarantees added on the add another guarantee page
    When I choose radio option Yes on the add another guarantee page
    And I choose radio option (5) Guarantee waiver – secured for 500 euros or less on the guarantee type page
    And I enter 01GB1234567890120A123456 on the Guarantee Reference Number page
    And I submit on the CYA page
    Then I should have 3 guarantees added on the add another guarantee page
    When I choose radio option Yes on the add another guarantee page
    And I choose radio option (9) Individual guarantee with multiple usage on the guarantee type page
    And I enter 01GB1234567890120A123456 on the Guarantee Reference Number page
    And I enter AC01 on the access code page
    And I enter 10000 on the amount to be covered page
    And I submit on the CYA page
    Then I should have 4 guarantees added on the add another guarantee page
    When I choose radio option Yes on the add another guarantee page
    And I choose radio option (R) Guarantee not required – goods carried on the Rhine, the Danube or their waterways on the guarantee type page
    Then I should have 5 guarantees added on the add another guarantee page
    When I choose radio option No on the add another guarantee page
    Then I should be on the task list page
  #Route details: Binding Itinerary set to Yes
    When I click the link with visible text: Add route details
    And I select United Kingdom on the country of destination page
    And I select GB on the departure office of destination page
    And I choose radio option Yes on the binding itinerary page
    And I select Andorra on the transit route country page
    Then I should have 1 country added to the transit route add another country page
    When I choose to click on Remove link on the transit route add another country page
    And I choose radio option Yes on the transit route remove country page
    And I choose radio option Yes on the binding itinerary page
    And I select Andorra on the transit route country page
    Then I should have 1 country added to the transit route add another country page
    And I choose radio option No on the transit route add another country page
    And I submit on the CYA page
  #Route Details Transit -> Entry point is -> Add office of transit [No]
    And I choose radio option No on the add office of transit page
  #Route Details Location Of Goods -> Qualifier of the identification T [Postal code]
    And I choose radio option Authorised place on the departure location of goods type page
    And I choose radio option Postal code on the departure location of goods identification page
    And I fill in address on the departure location of goods postal code page
    And I choose radio option No on the departure location of goods add contact page
    And I submit on the CYA page
  #Route Details Loading -> place of loading add un locode [No]
    And I choose radio option No on the place of loading add un locode page
    And I select United Kingdom on the place of loading country page
    Then I should have United Kingdom as loading location on the place of loading location page
    When I enter London on the place of loading location page
  #Route Details Unloading -> [Set 0]
    And I submit on the CYA page
    And I submit on the CYA page
    Then I should be on the task list page
  #Transport details
    When I click the link with visible text: Add transport details
    And I choose radio option Yes on the apply ucr item page
    And I enter GB123456123456 on the UCR page
    And I choose radio option Yes on the items same destination country page
    And I select United Kingdom on the items destination country page
  #Transport details -> Container details
    And I choose radio option Yes on the containers page
  #Inland Mode Of Transport
    And I choose radio option Road on the Inland Mode of Transport page
    And I choose radio option Registration number of a road trailer on the Transport Identification page
    And I enter GB1234567 as registration number of the road trailer on the transport identification number page
    And I select United Kingdom on the Transport country page
  #Border Means Of Transport
    And I choose radio option Yes on the add border mode of transport page
    And I choose radio option Maritime on the border mode of transport page
    And I choose radio option Name of a sea-going vessel on the border means of transport identification page
    And I enter GB1234567 as name of the sea-going vessel on the border means of transport identification number page
  #Border Means of Transport - Add Country
    And I choose radio option Yes on the add border means of transport country page
    And I select United Kingdom on the border means of transport country page
  #Border Means of Transport - Office of Transit
    And I select GB000142 on the border means of transport office of transit page
  #Conveyance Reference Number
    And I choose radio option Yes on the add conveyance reference number page
    And I enter GB123456123456 on the conveyance reference number page
  #Border Means of Transport - -Add another - No
    Then I should have 1 border means of transport added on the add another border means of transport page
    When I choose radio option No on the add another border means of transport page
  #Transport - Inland Mode - Border Means [ CYA ]
    And I submit on the CYA page

