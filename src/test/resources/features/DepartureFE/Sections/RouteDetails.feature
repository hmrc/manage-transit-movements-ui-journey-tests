@routeDetails @departure
Feature: Route details transit journeys

  Background:
    Given I login with ID 1234567
    Then I am on the Manage Transit Movements Hub service
    Given I click on the Make a departure declaration link
    And I input a random LRN on the LocalReferenceNumber page


  @a11y
#[CTCP-641] : Security type No Security selected and Binding Itinerary set to NO for route
#[CTCP-960] : Customs Office of Departure/Reference Number is in CL112 set AND the first 2 characters of the Customs Office of Destination Declared/Reference Number is in CL112 set
              #AND the first 2 characters of Customs Office of Departure is EQUAL the first 2 characters of the Customs Office of Destination Declared/Reference Number AND Route Details Transit -> Add office of transit [No]
#[CTCP-884] : Route Details Exit and Location of goods -> Qualifier of the identification X [EORI number] Location of goods add identifier -> [YES] -> Location of goods add contact [Yes]
#[CTCP-944] : Route Details Loading -> place of loading add un locode [No]
#[CTCP-1252] : Route Details Unloading -> Security details -> No security [Set 0]
  Scenario: 01 GB
   #Office of Departure
    When I select GB on the office of departure page
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
  #Route Details Transit -> Add office of transit [No]
    And I choose radio option No on the add office of transit page
  #Route Details Location Of Goods -> Qualifier of the identification X [EORI number] -> [YES]
    And I choose radio option Designated location on the departure location of goods type page
    And I choose radio option EORI number or TIN on the departure location of goods identification page
    And I enter GB123456789000 on the departure location of goods eori tin page
    And I choose radio option Yes on the departure location of goods add identifier page
    And I enter 1000 on the departure location of goods additional identifier page
    And I choose radio option Yes on the departure location of goods add contact page
    And I enter HMRC Test on the departure location of goods contact page
    And I enter +44 2345 82 83 on the departure location of goods contact telephone number page
    And I submit on the CYA page
  #Route Details Loading -> place of loading add un locode [No]
    And I choose radio option Yes on the place of loading add un locode page
    And I select Andorra la Vella on the place of loading un locode page
    And I choose radio option No on the place of loading add extra information page
    And I submit on the CYA page
    And I submit on the CYA page
   Then I should be on the task list page




#[CTCP-641] : Security type No Security selected and Binding Itinerary set to NO
#[CTCP-960] : Customs Office of Departure/Reference Number is in CL112 set AND the first 2 characters of the Customs Office of Destination Declared/Reference Number is in CL112 set
              #AND the first 2 characters of Customs Office of Departure is EQUAL the first 2 characters of the Customs Office of Destination Declared/Reference Number AND Route Details Transit -> Add office of transit [Yes]
#[CTCP-884] : Route Details Exit and Location of goods -> Qualifier of the identification W [Coordinate] -> Location of goods add contact [No]
#[CTCP-944] : Route Details Loading -> place of loading add un locode [Yes] -> place of loading add extra information [No]
#[CTCP-1252] : Route Details Unloading -> Security details -> No security [Set 0]
  Scenario: 02 GB
  #Office of Departure
    When I select GB on the office of departure page
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
  #Route Details Transit -> Entry point is -> Add office of transit [Yes]
    And I choose radio option Yes on the add office of transit page
    Then I should have United Kingdom as office of transit on the office of transit page
    When I select Dover on the office of transit page
    Then I should have Dover/Folkestone Eurotunnel Freight (GB000060) arrival time title on the office of transit add eta page
    When I choose radio option Yes on the office of transit add eta page
    Then I should have Dover/Folkestone Eurotunnel Freight, United Kingdom as transit to arrive on the office of transit eta page
    And I choose fill in the date and time on the office of transit eta page
    And I submit on the CYA page
    Then I should have 1 office of transit added on the add another office of transit page
    When I choose radio option No on the add another office of transit page
  #Route Details Location Of Goods -> Qualifier of the identification W [Coordinate] -> [No]
    And I choose radio option Designated location on the departure location of goods type page
    And I choose radio option Coordinates on the departure location of goods identification page
    And I enter 50.96622 and 50.96622 on the departure location of goods coordinates page
    And I choose radio option No on the departure location of goods add contact page
    And I submit on the CYA page
  #Route Details Loading -> place of loading add un locode [Yes] -> place of loading add extra information [No]
    And I choose radio option Yes on the place of loading add un locode page
    And I select Andorra la Vella on the place of loading un locode page
    And I choose radio option No on the place of loading add extra information page
    And I submit on the CYA page
    And I submit on the CYA page
    Then I should be on the task list page





#[CTCP-641] : Security type No security and Binding Itinerary set to No
#[CTCP-960] : If at least one instance of consignment/country of routing of consignment/country is in CL112 set Declaration Type EQUAL T AND Route Details Transit -> Entry point is [T2 declarations] -> T2 declarations [No]
#[CTCP-884] : Route Details Exit and Location of goods -> Qualifier of the identification Z [Address] -> Location of goods add contact [No]
#[CTCP-944] : Route Details Loading -> place of loading add un locode [No]
#[CTCP-1252] : Route Details Unloading -> Security details -> No security [Set 0]
  Scenario: 03 GB
  #Office of Departure
    When I select GB on the office of departure page
    And I choose radio option Normal on the procedure type page
    And I choose radio option T on the declaration type page
    And I choose radio option No security on the security type page
    And I submit on the CYA page
    Then I should be on the task list page
  #Route Details -> Binding Itinerary set to No
    When I click the link with visible text: Add route details
  #Office of Destination Declared
    And I select Italy on the country of destination page
    And I select Bari on the departure office of destination page
    And I choose radio option No on the binding itinerary page
    And I choose radio option No on the transit route add country page
    And I submit on the CYA page
  #Route Details Transit -> Entry point is [T2 declarations] -> T2 declarations [No]
    And I choose radio option No on the t2 declaration page
    And I select Italy on the office of transit country page
    Then I should have Italy as office of transit on the office of transit page
    When I select Bari on the office of transit page
    Then I should have Bari (IT018100) arrival time title on the office of transit add eta page
    When I choose radio option No on the office of transit add eta page
    And I submit on the CYA page
    Then I should have 1 office of transit added on the add another office of transit page
    When I choose radio option Yes on the add another office of transit page
    And I select France on the office of transit country page
    Then I should have France as office of transit on the office of transit page
    When I select Dunkerque on the office of transit page
    Then I should have Dunkerque port bureau (FR001260) arrival time title on the office of transit add eta page
    When I choose radio option No on the office of transit add eta page
    And I submit on the CYA page
    Then I should have 2 offices of transit added on the add another office of transit page
    When I choose radio option No on the add another office of transit page
  #Route Details Location Of Goods ->  Qualifier of the identification Z [Address]
    And I choose radio option Designated location on the departure location of goods type page
    And I choose radio option Address on the departure location of goods identification page
    And I select United Kingdom on the location of goods country page
    And I fill in address on the departure location of goods address page
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




#[CTCP-641] : Security type No security and Binding Itinerary set to No
#[CTCP-960] : If at least one instance of consignment/country of routing of consignment/country is in CL112 set [True]
#[CTCP-884] : Route Details Exit and Location of goods -> Qualifier of the identification T [Postal code]
#[CTCP-944] : Route Details Loading -> place of loading add un locode [No]
#[CTCP-1252] : Route Details Unloading -> Security details -> No security [Set 0]
  Scenario: 04 GB
   #Office of Departure
    When I select GB on the office of departure page
    And I choose radio option Normal on the procedure type page
    And I choose radio option T1 on the declaration type page
    And I choose radio option No security on the security type page
    And I submit on the CYA page
    Then I should be on the task list page
  #Route Details -> Binding Itinerary set to No
    When I click the link with visible text: Add route details
  #Office of Destination Declared
    And I select Italy on the country of destination page
    And I select Bari on the departure office of destination page
    And I choose radio option No on the binding itinerary page
    And I choose radio option No on the transit route add country page
    And I submit on the CYA page
  #Route Details Transit -> Entry point is [Office of transit]
    And I select Italy on the office of transit country page
    Then I should have Italy as office of transit on the office of transit page
    When I select Bari on the office of transit page
    Then I should have Bari (IT018100) arrival time title on the office of transit add eta page
    When I choose radio option No on the office of transit add eta page
    And I submit on the CYA page
    Then I should have 1 office of transit added on the add another office of transit page
    When I choose radio option No on the office of transit add eta page
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





#[CTCP-641] : Security type No security and Binding Itinerary set to No
#[CTCP-960] : If at least one instance of consignment/country of routing of consignment/country is in CL112 set [No]
#[CTCP-884] : Route Details Exit and Location of goods -> Do you need to add a location of goods [NO]
#[CTCP-944] : Route Details Loading -> place of loading add un locode [Yes] -> Add Extra Info [Yes]
#[CTCP-1252] : Route Details Unloading -> Security details -> No security [Set 0]
  Scenario: 05 XI
  #Office of Departure
    When I select XI on the office of departure page
    And I choose radio option Normal on the procedure type page
    And I choose radio option T1 on the declaration type page
    And I choose radio option No security on the security type page
    And I submit on the CYA page
    Then I should be on the task list page
  #Route Details -> Binding Itinerary set to No
    When I click the link with visible text: Add route details
   #Office of Destination Declared
    And I select Italy on the country of destination page
    And I select Bari on the departure office of destination page
    And I choose radio option No on the binding itinerary page
    And I choose radio option No on the transit route add country page
    And I submit on the CYA page
  #Route Details Transit -> Add office of transit [No]
    And I choose radio option No on the add office of transit page
  #Route Details Location Of Goods -> Do you need to add a location of goods [NO]
    And I choose radio option No on the departure add location of goods page
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





#[CTCP-641] : TIR and Binding Itinerary set to YES
#[CTCP-960] : TransitOperation/declarationType is set to TIR
#[CTCP-884] : Route Details Exit and Location of goods -> Qualifier of the identification V [Customs office identifier]
#[CTCP-944] : Route Details Loading -> place of loading add un locode [No]
#[CTCP-1252] : Route Details Unloading -> Security details -> Entry summary declaration (ENS) [Set 1]
  Scenario: 06 XI
  #Office of Departure
    When I select XI on the office of departure page
    And I choose radio option Normal on the procedure type page
    And I choose radio option TIR on the declaration type page
    And I enter 1234567 on the tir carnet page
    And I choose radio option Entry summary declaration (ENS) on the security type page
    And I submit on the CYA page
    Then I should be on the task list page
  #Route Details -> Binding Itinerary set to YES
    When I click the link with visible text: Add route details
  #Office of Destination Declared
    And I select Italy on the country of destination page
    And I select Bari on the departure office of destination page
    And I choose radio option Yes on the binding itinerary page
    And I select Andorra on the transit route country page
    Then I should have 1 country to transit route added on the transit route add another country page
    And I choose radio option No on the transit route add another country page
    And I submit on the CYA page
  #Route Details Exit -> Qualifier of the identification V [Customs office identifier]
    And I choose radio option Yes on the departure add location of goods page
    And I choose radio option Designated location on the departure location of goods type page
    And I choose radio option Customs office identifier on the departure location of goods identification page
    And I select XI on the departure location of goods customs office identification page
    And I submit on the CYA page
  #Route Details Loading -> place of loading add un locode [No]
    And I choose radio option No on the place of loading add un locode page
    And I select United Kingdom on the place of loading country page
    Then I should have United Kingdom as loading location on the place of loading location page
    When I enter London on the place of loading location page
  #Route Details Unloading -> [Set 1]
    And I choose radio option No on the place of unloading add un locode page
    And I select United Kingdom on the place of unloading country page
    And I enter Newcastle on the United Kingdom place of unloading location page
    And I submit on the CYA page
    And I submit on the CYA page
    Then I should be on the task list page





#[CTCP-641] : Security type Exit summary declaration (EXS) and Binding Itinerary set to Yes
#[CTCP-960] : Declaration Type EQUAL T2 [TRUE]
#[CTCP-884] : Route Details Exit and Location of goods -> Qualifier of the identification Y [Authorisation number] -> Location of goods add identifier [No] -> Location of goods add contact [No]
#[CTCP-944] : Route Details Loading -> place of loading add un locode [Yes] -> place of loading add extra information [No]
#[CTCP-1252] : Route Details Unloading -> Security details -> Exit summary declaration (EXS) [Set 2]
  Scenario: 07 XI
   #Office of Departure
    When I select XI on the office of departure page
    And I choose radio option Normal on the procedure type page
    And I choose radio option T2 on the declaration type page
    And I choose radio option Exit summary declaration (EXS) on the security type page
    And I submit on the CYA page
    Then I should be on the task list page
  #Route Details -> Binding Itinerary set to Yes
    When I click the link with visible text: Add route details
  #Office of Destination Declared
    And I select Italy on the country of destination page
    And I select Bari on the departure office of destination page
    And I choose radio option Yes on the binding itinerary page
    And I select Germany on the transit route country page
    Then I should have 1 country to transit route added on the transit route add another country page
    When I choose radio option No on the transit route add another country page
    And I submit on the CYA page
  #Route Details Transit -> Entry point is [Office of transit country]
    And I select Germany on the office of transit country page
    Then I should have Germany as office of transit on the office of transit page
    When I select Berlin on the office of transit page
    Then I should have Berlin, Berlin-Flughafen-Tegel (DE002105) arrival time title on the office of transit add eta page
    When I choose radio option No on the office of transit add eta page
    And I submit on the CYA page
    Then I should have 1 office of transit added on the add another office of transit page
    When I choose radio option No on the add another office of transit page
  #Route Details Exit -> Set CL147 country security and custom office Transit declared is present [False]
    And I select Germany on the office of exit country page
    Then I should have Germany as an office of exit title on the office of exit page
    When I select Dortmund on the office of exit page
    And I submit on the CYA page
    Then I should have 1 office of transit added on the add another office of exit page
    When I choose radio option No on the add another office of exit page
  #Route Details Location Of Goods -> Qualifier of the identification Y [Authorisation number] -> [No] -> [No]
    And I choose radio option Yes on the departure add location of goods page
    And I choose radio option Designated location on the departure location of goods type page
    And I choose radio option Authorisation number on the departure location of goods identification page
    And I enter 1234567890 on the departure location of goods authorisation number page
    And I choose radio option No on the departure location of goods add identifier page
    And I choose radio option No on the departure location of goods add contact page
    And I submit on the CYA page
  #Route Details Loading -> place of loading add un locode [Yes] -> place of loading add extra information [No]
    And I choose radio option Yes on the place of loading add un locode page
    And I select Andorra la Vella on the place of loading un locode page
    And I choose radio option No on the place of loading add extra information page
  #Route Details Unloading -> Yes to all [Set 2]
    And I choose radio option Yes on the add place of unloading page
    And I choose radio option Yes on the place of unloading add un locode page
    And I select Aalen on the place of unloading un locode page
    And I choose radio option Yes on the place of unloading add extra information page
    And I select United Kingdom on the place of unloading country page
    And I enter Leeds on the United Kingdom place of unloading location page
    And I submit on the CYA page
    And I submit on the CYA page
    Then I should be on the task list page




#[CTCP-641] : Security type No security and Binding Itinerary set to YES
#[CTCP-960] : Declaration Type EQUAL T AND Route Details Transit -> Entry point is [T2 declarations] -> T2 declarations [Yes]
#[CTCP-884] : Route Details Exit and Location of goods -> Qualifier of the identification U [UN/LOCODE] -> Location of goods add contact [No]
#[CTCP-944] : Route Details Loading -> place of loading add un locode [Yes] -> place of loading add extra information [No]
#[CTCP-1252] : Route Details Unloading -> Security details -> Both entry and exit summary declarations (ENS and EXS) [Set 3]
  Scenario: 08 XI
  #Office of Departure
    When I select XI on the office of departure page
    And I choose radio option Normal on the procedure type page
    And I choose radio option T on the declaration type page
    And I choose radio option Both entry and exit summary declarations (ENS and EXS) on the security type page
    And I submit on the CYA page
    Then I should be on the task list page
  #Route Details -> Binding Itinerary set to Yes
    When I click the link with visible text: Add route details
  #Office of Destination Declared
    And I select Italy on the country of destination page
    And I select Bari on the departure office of destination page
    And I choose radio option Yes on the binding itinerary page
    And I select Andorra on the transit route country page
    Then I should have 1 country to transit route added on the transit route add another country page
    And I choose radio option No on the transit route add another country page
    And I submit on the CYA page
  #Route Details Transit -> Entry point is [T2 declarations] -> T2 declarations [Yes]
    And I choose radio option Yes on the t2 declaration page
    And I select Andorra on the office of transit country page
    Then I should have Andorra as office of transit on the office of transit page
    When I select DCNJ PORTA on the office of transit page
    Then I should have DCNJ PORTA (AD000002) arrival time title on the office of transit add eta page
    When I choose radio option No on the office of transit add eta page
    And I submit on the CYA page
    Then I should have 1 office of transit added on the add another office of transit page
    When I choose radio option No on the add another office of transit page
  #Route Details Location Of Goods -> Qualifier of the identification U [UN/LOCODE]
    And I choose radio option Yes on the departure add location of goods page
    And I choose radio option Designated location on the departure location of goods type page
    And I choose radio option UN/LOCODE on the departure location of goods identification page
    And I select Aalen on the departure location of goods customs un locode page
    And I choose radio option No on the departure location of goods add contact page
    And I submit on the CYA page
  #Route Details Loading -> place of loading add un locode [Yes] -> place of loading add extra information [No]
    And I choose radio option Yes on the place of loading add un locode page
    And I select Andorra la Vella on the place of loading un locode page
    And I choose radio option No on the place of loading add extra information page
  #Route Details Unloading -> [3]
    And I choose radio option Yes on the place of unloading add un locode page
    And I select Aalen on the place of unloading un locode page
    And I choose radio option No on the place of unloading add extra information page
    And I submit on the CYA page
    And I submit on the CYA page
    Then I should be on the task list page