@routeDetails @departure
@wip
Feature: Route details transit journeys

  Background:
    Given I login with ID 1234567
    Then I am on the Manage Transit Movements Hub service
    Given I click on the Make a departure declaration link
    And I input a random LRN on the LocalReferenceNumber page


 @a11y @ZAP
#TransitOperation/declarationType is set to TIR
  Scenario: 01 XI TransitOperation/declarationType is set to TIR
    When I select XI on the office of departure page
    And I choose radio option Normal on the procedure type page
    And I choose radio option TIR on the declaration type page
    And I enter 1234567 on the tir carnet page
    And I choose radio option Exit summary declaration (EXS) on the security type page
    And I submit on the CYA page
    Then I should be on the task list page
   #Route Details -> Binding Itinerary set to YES
    When I click the link with visible text: Add route details
    And I select Italy on the country of destination page
    And I select Bari on the office of destination page
    And I choose radio option Yes on the binding itinerary page
    And I select Andorra on the transit route country page
    Then I should have 1 country or countries to transit route added on the transit route add another country page
    And I choose radio option No on the transit route add another country page
    And I submit on the CYA page
#Page not found is displayed



#Customs Office of Departure/Reference Number is in CL112 set AND the first 2 characters of the Customs Office of Destination Declared/Reference Number is in CL112 set
#AND the first 2 characters of Customs Office of Departure is EQUAL the first 2 characters of the Customs Office of Destination Declared/Reference Number
#AND Route Details Transit -> Add office of transit [No]
  Scenario: 02 GB No Security selected and Binding Itinerary set to NO
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
#Page not found is displayed




#Customs Office of Departure/Reference Number is in CL112 set AND the first 2 characters of the Customs Office of Destination Declared/Reference Number is in CL112 set
#AND the first 2 characters of Customs Office of Departure is EQUAL the first 2 characters of the Customs Office of Destination Declared/Reference Number
#AND Route Details Transit -> Add office of transit [Yes]
  Scenario: 03 GB No Security selected and Binding Itinerary set to NO
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
    When I select BOSTON on the office of transit page
    Then I should have BOSTON arrival time title on the office of transit add eta page
    When I choose radio option Yes on the office of transit add eta page
    Then I should have BOSTON, United Kingdom as transit to arrive on the office of transit eta page
    And I choose fill in the date and time on the office of transit eta page
    And I submit on the CYA page
    Then I should have 1 office or offices of transit added on the add another office of transit page
    When I choose radio option No on the add another office of transit page
#Page not found is displayed




#Declaration Type EQUAL T2 [TRUE]
  Scenario: 04 XI Binding Itinerary set to YES
    When I select XI on the office of departure page
    And I choose radio option Normal on the procedure type page
    And I choose radio option T2 on the declaration type page
    And I choose radio option Entry summary declaration (ENS) on the security type page
    And I submit on the CYA page
    Then I should be on the task list page
    When I click the link with visible text: Add route details
 #Route Details -> Yes
    And I select Italy on the country of destination page
    And I select Bari on the office of destination page
    And I choose radio option Yes on the binding itinerary page
    And I select Andorra on the transit route country page
    Then I should have 1 country or countries to transit route added on the transit route add another country page
    And I choose radio option No on the transit route add another country page
    And I submit on the CYA page
  #Route Details Transit -> Entry point is [Office of transit country]
    And I select United Kingdom on the office of transit country page
    Then I should have United Kingdom as office of transit on the office of transit page
    When I select BOSTON on the office of transit page
    Then I should have BOSTON arrival time title on the office of transit add eta page
    When I choose radio option No on the office of transit add eta page
    And I submit on the CYA page
    Then I should have 1 office or offices of transit added on the add another office of transit page
    When I choose radio option No on the add another office of transit page



#Declaration Type EQUAL T
#AND
#Route Details Transit -> Entry point is [T2 declarations] -> T2 declarations [Yes]
  Scenario: 05 XI Binding Itinerary set to YES
    When I select XI on the office of departure page
    And I choose radio option Normal on the procedure type page
    And I choose radio option T on the declaration type page
    And I choose radio option No security on the security type page
    And I submit on the CYA page
    Then I should be on the task list page
    #Route Details -> Yes
    When I click the link with visible text: Add route details
    And I select Italy on the country of destination page
    And I select Bari on the office of destination page
    And I choose radio option Yes on the binding itinerary page
    And I select Andorra on the transit route country page
    Then I should have 1 country or countries to transit route added on the transit route add another country page
    And I choose radio option No on the transit route add another country page
    And I submit on the CYA page
    #Route Details Transit -> Entry point is [T2 declarations] -> T2 declarations [Yes]
    And I choose radio option Yes on the t2 declaration type page
    And I select United Kingdom on the office of transit country page
    Then I should have United Kingdom as office of transit on the office of transit page
    When I select BOSTON on the office of transit page
    Then I should have BOSTON arrival time title on the office of transit add eta page
    When I choose radio option No on the office of transit add eta page
    And I submit on the CYA page
    Then I should have 1 office or offices of transit added on the add another office of transit page
    When I choose radio option No on the add another office of transit page




#If at least one instance of consignment/country of routing of consignment/country is in CL112 set
#Declaration Type EQUAL T
#AND
#Route Details Transit -> Entry point is [T2 declarations] -> T2 declarations [No]
  Scenario: 06 GB Binding Itinerary set to YES
    When I select BOSTON on the office of departure page
    And I choose radio option Normal on the procedure type page
    And I choose radio option T on the declaration type page
    And I choose radio option No security on the security type page
    And I submit on the CYA page
    Then I should be on the task list page
    #Route Details -> Yes
    When I click the link with visible text: Add route details
    And I select Italy on the country of destination page
    And I select Bari on the office of destination page
    And I choose radio option No on the binding itinerary page
    And I choose radio option No on the transit route add country page
    And I submit on the CYA page
    #Route Details Transit -> Entry point is [T2 declarations] -> T2 declarations [No]
    And I choose radio option No on the t2 declaration type page
    Then I should have Italy as office of transit on the office of transit page
    When I select Bari on the office of transit page
    Then I should have Bari arrival time title on the office of transit add eta page
    When I choose radio option No on the office of transit add eta page
    And I submit on the CYA page
    Then I should have 1 office or offices of transit added on the add another office of transit page
    When I choose radio option Yes on the add another office of transit page
    And I select United Kingdom on the office of transit country page
    Then I should have United Kingdom as office of transit on the office of transit page
    When I select BOSTON on the office of transit page
    Then I should have BOSTON arrival time title on the office of transit add eta page
    When I choose radio option No on the office of transit add eta page
    And I submit on the CYA page
    Then I should have 2 office or offices of transit added on the add another office of transit page



#If at least one instance of consignment/country of routing of consignment/country is in CL112 set [True]
  Scenario: 07 GB Binding Itinerary set to YES
    When I select BOSTON on the office of departure page
    And I choose radio option Normal on the procedure type page
    And I choose radio option T1 on the declaration type page
    And I choose radio option No security on the security type page
    And I submit on the CYA page
    Then I should be on the task list page
    #Route Details -> Yes
    When I click the link with visible text: Add route details
    And I select Italy on the country of destination page
    And I select Bari on the office of destination page
    And I choose radio option No on the binding itinerary page
    And I choose radio option No on the transit route add country page
    And I submit on the CYA page
    #Route Details Transit -> Entry point is [Office of transit]
    Then I should have Italy as office of transit on the office of transit page
    When I select Bari on the office of transit page
    Then I should have Bari arrival time title on the office of transit add eta page
    When I choose radio option No on the office of transit add eta page
    And I submit on the CYA page
    Then I should have 1 office or offices of transit added on the add another office of transit page
    When I choose radio option No on the office of transit add eta page




#If at least one instance of consignment/country of routing of consignment/country is in CL112 set [false]
  Scenario: 08 XI Binding Itinerary set to YES
    When I select XI on the office of departure page
    And I choose radio option Normal on the procedure type page
    And I choose radio option T1 on the declaration type page
    And I choose radio option No security on the security type page
    And I submit on the CYA page
    Then I should be on the task list page
    #Route Details -> Yes
    When I click the link with visible text: Add route details
    And I select Italy on the country of destination page
    And I select Bari on the office of destination page
    And I choose radio option No on the binding itinerary page
    And I choose radio option No on the transit route add country page
    And I submit on the CYA page
    #Route Details Transit -> Add office of transit [No]
    And I choose radio option No on the add office of transit page
