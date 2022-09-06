@routeDetails @departure
Feature: Route details transit journeys

  Background:
    Given I login with ID 1234567
    Then I am on the Manage Transit Movements Hub service
    Given I click on the Make a departure declaration link
    And I input a random LRN on the LocalReferenceNumber page


 @a11y @ZAP
#[CTCP-641] : TIR and Binding Itinerary set to YES
#[CTCP-960] : TransitOperation/declarationType is set to TIR
#[CTCP-884] : Route Details Exit
  Scenario: 01 XI
   #Office of Departure
    When I select XI on the office of departure page
    And I choose radio option Normal on the procedure type page
    And I choose radio option TIR on the declaration type page
    And I enter 1234567 on the tir carnet page
    And I choose radio option Exit summary declaration (EXS) on the security type page
    And I submit on the CYA page
    Then I should be on the task list page
   #Route Details -> Binding Itinerary set to YES
    When I click the link with visible text: Add route details
   #Office of Destination Declared
    And I select Italy on the country of destination page
    And I select Bari on the office of destination page
    And I choose radio option Yes on the binding itinerary page
    And I select Andorra on the transit route country page
    Then I should have 1 country or countries to transit route added on the transit route add another country page
    And I choose radio option No on the transit route add another country page
    And I submit on the CYA page
   #Route Details Exit -> TransitOperation/declarationType is set to [TIR]
#Page not found is displayed



#[CTCP-641] : Security type No Security selected and Binding Itinerary set to NO for route
#[CTCP-960] : Customs Office of Departure/Reference Number is in CL112 set AND the first 2 characters of the Customs Office of Destination Declared/Reference Number is in CL112 set
              #AND the first 2 characters of Customs Office of Departure is EQUAL the first 2 characters of the Customs Office of Destination Declared/Reference Number
              #AND Route Details Transit -> Add office of transit [No]
#[CTCP-884] : Route Details Exit
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
    And I select GB on the office of destination page
    And I choose radio option No on the binding itinerary page
    And I choose radio option No on the transit route add country page
    And I submit on the CYA page
   #Route Details Transit -> Add office of transit [No]
    And I choose radio option No on the add office of transit page
   #Route Details Exit -> TransitOperation/declarationType is in set [0,1] -> [No security]
#Page not found is displayed



#[CTCP-641] : Security type No Security selected and Binding Itinerary set to NO
#[CTCP-960] : Customs Office of Departure/Reference Number is in CL112 set AND the first 2 characters of the Customs Office of Destination Declared/Reference Number is in CL112 set
              #AND the first 2 characters of Customs Office of Departure is EQUAL the first 2 characters of the Customs Office of Destination Declared/Reference Number
              #AND Route Details Transit -> Add office of transit [Yes]
#[CTCP-884] : Route Details Exit
  Scenario: 03 GB
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
    And I select GB on the office of destination page
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
    Then I should have 1 office or offices of transit added on the add another office of transit page
    When I choose radio option No on the add another office of transit page
#Page not found is displayed



#[CTCP-641] : Security type Entry summary declaration (ENS) and Binding Itinerary set to Yes
#[CTCP-960] : Declaration Type EQUAL T2 [TRUE]
#[CTCP-884] : Route Details Exit
  Scenario: 04 XI
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
    And I select Bari on the office of destination page
    And I choose radio option Yes on the binding itinerary page
    And I select Germany on the transit route country page
    Then I should have 1 country or countries to transit route added on the transit route add another country page
    When I choose radio option No on the transit route add another country page
    And I submit on the CYA page
   #Route Details Transit -> Entry point is [Office of transit country]
    And I select Germany on the office of transit country page
    Then I should have Germany as office of transit on the office of transit page
    When I select Berlin on the office of transit page
    Then I should have Berlin, Berlin-Flughafen-Tegel (DE002105) arrival time title on the office of transit add eta page
    When I choose radio option No on the office of transit add eta page
    And I submit on the CYA page
    Then I should have 1 office or offices of transit added on the add another office of transit page
    When I choose radio option No on the add another office of transit page
   #Route Details Exit -> Set CL147 country security and custom office Transit declared is present [False]
    And I select Germany on the office of exit country page
    Then I should have Germany as an office of exit title on the office of exit page
    When I select Dortmund on the office of exit page
    And I submit on the CYA page
    Then I should have 1 office or offices of transit added on the add another office of exit page
    When I choose radio option No on the add another office of exit page



#[CTCP-641] : Security type No security and Binding Itinerary set to YES
#[CTCP-960] : Declaration Type EQUAL T
              #AND Route Details Transit -> Entry point is [T2 declarations] -> T2 declarations [Yes]
#[CTCP-884] : Route Details Exit
  Scenario: 05 XI
   #Office of Departure
    When I select XI on the office of departure page
    And I choose radio option Normal on the procedure type page
    And I choose radio option T on the declaration type page
    And I choose radio option No security on the security type page
    And I submit on the CYA page
    Then I should be on the task list page
   #Route Details -> Binding Itinerary set to Yes
    When I click the link with visible text: Add route details
   #Office of Destination Declared
    And I select Italy on the country of destination page
    And I select Bari on the office of destination page
    And I choose radio option Yes on the binding itinerary page
    And I select Andorra on the transit route country page
    Then I should have 1 country or countries to transit route added on the transit route add another country page
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
    Then I should have 1 office or offices of transit added on the add another office of transit page
    When I choose radio option No on the add another office of transit page
   #Route Details Exit -> TransitOperation/declarationType is in set [0,1] -> [No security]



#[CTCP-641] : Security type No security and Binding Itinerary set to No
#[CTCP-960] : If at least one instance of consignment/country of routing of consignment/country is in CL112 set
              #Declaration Type EQUAL T AND Route Details Transit -> Entry point is [T2 declarations] -> T2 declarations [No]
#[CTCP-884] : Route Details Exit
  Scenario: 06 GB
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
    And I select Bari on the office of destination page
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
    Then I should have 1 office or offices of transit added on the add another office of transit page
    When I choose radio option Yes on the add another office of transit page
    And I select France on the office of transit country page
    Then I should have France as office of transit on the office of transit page
    When I select Dunkerque on the office of transit page
    Then I should have Dunkerque port bureau (FR001260) arrival time title on the office of transit add eta page
    When I choose radio option No on the office of transit add eta page
    And I submit on the CYA page
    Then I should have 2 office or offices of transit added on the add another office of transit page
   #Route Details Exit -> TransitOperation/declarationType is in set [0,1] -> [No security]



#[CTCP-641] : Security type No security and Binding Itinerary set to No
#[CTCP-960] : If at least one instance of consignment/country of routing of consignment/country is in CL112 set [True]
#[CTCP-884] : Route Details Exit
  Scenario: 07 GB
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
    And I select Bari on the office of destination page
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
    Then I should have 1 office or offices of transit added on the add another office of transit page
    When I choose radio option No on the office of transit add eta page
   #Route Details Exit -> TransitOperation/declarationType is in set [0,1] -> [No security]



#[CTCP-641] : Security type No security and Binding Itinerary set to No
#[CTCP-960] : If at least one instance of consignment/country of routing of consignment/country is in CL112 set [False]
#[CTCP-884] : Route Details Exit
  Scenario: 08 XI
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
    And I select Bari on the office of destination page
    And I choose radio option No on the binding itinerary page
    And I choose radio option No on the transit route add country page
    And I submit on the CYA page
   #Route Details Transit -> Add office of transit [No]
    And I choose radio option No on the add office of transit page
   #Route Details Exit -> TransitOperation/declarationType is in set [0,1] -> [No security]