@routeDetails @departure
@wip
Feature: Route details journeys includes pre task list

  Background:
    Given I login with ID 1234567
    Then I am on the Manage Transit Movements Hub service
    Given I click on the Make a departure declaration link
    And I input a random LRN on the LocalReferenceNumber page


  @a11y @ZAP
  #Route Details GB
  Scenario: 01 GB No Security selected and Binding Itinerary set to NO
    When I select GB on the office of departure page
    And I choose radio option Normal on the procedure type page
    And I choose radio option T1 on the declaration type page
    And I choose radio option No security on the security type page
    And I submit on the CYA page
    Then I should be on the task list page
    When I click the link with visible text: Add route details
    And I select GB on the office of destination page
    And I choose radio option No on the binding itinerary page
    And I choose radio option No on the transit route add country page
    And I submit on the CYA page
    #Route Details Transit -> Yes
    And I choose radio option Yes on the t2 declaration type page
    And I choose radio option Yes on the add office of transit page
    And I select France on the office of transit country page
    When I select Paris on the office of transit page
    Then I should have Paris arrival time title on the office of transit add eta page
    When I choose radio option Yes on the office of transit add eta page
    Then I should have Paris, France as transit to arrive on the office of transit eta page
    And I choose fill in the date and time on the office of transit eta page
    And I submit on the CYA page
    Then I should have 1 office or offices of transit added on the add another office of transit page
    When I choose radio option No on the add another office of transit page
    Then I should be on the task list page


  Scenario: 02 GB No Security selected and Binding Itinerary set to NO and then YES to add country transit route
    When I select GB on the office of departure page
    And I choose radio option Normal on the procedure type page
    And I choose radio option T1 on the declaration type page
    And I choose radio option No security on the security type page
    And I submit on the CYA page
    Then I should be on the task list page
    When I click the link with visible text: Add route details
    And I select GB on the office of destination page
    And I choose radio option No on the binding itinerary page
    And I choose radio option Yes on the transit route add country page
    And I select Andorra on the transit route country page
    Then I should have 1 country or countries to transit route added on the transit route add another country page
    When I choose radio option Yes on the transit route add another country page
    And I select Argentina on the transit route country page
    Then I should have 2 country or countries to transit route added on the transit route add another country page
    When I choose radio option No on the transit route add another country page
    And I submit on the CYA page
    #Route Details Transit ->  Add office of transit page [No]
    And I choose radio option Yes on the t2 declaration type page
    And I choose radio option No on the add office of transit page
    Then I should be on the task list page


  Scenario: 03 GB No Security selected and Binding Itinerary set to YES
    When I select GB on the office of departure page
    And I choose radio option Normal on the procedure type page
    And I choose radio option T1 on the declaration type page
    And I choose radio option No security on the security type page
    And I submit on the CYA page
    Then I should be on the task list page
    When I click the link with visible text: Add route details
    And I select GB on the office of destination page
    And I choose radio option Yes on the binding itinerary page
    And I select Andorra on the transit route country page
    Then I should have 1 country or countries to transit route added on the transit route add another country page
    When I choose to click on Remove link on the transit route add another country page
    And I choose radio option Yes on the transit route remove country page
    And I choose radio option Yes on the binding itinerary page
    And I select Andorra on the transit route country page
    Then I should have 1 country or countries to transit route added on the transit route add another country page
    And I choose radio option No on the transit route add another country page
    And I submit on the CYA page
   #Route Details Transit -> office of transit add eta [No] and Remove office of transit
    And I choose radio option Yes on the t2 declaration type page
    And I choose radio option Yes on the add office of transit page
    And I select France on the office of transit country page
    When I select Paris on the office of transit page
    Then I should have Paris arrival time title on the office of transit add eta page
    When I choose radio option No on the office of transit add eta page
    And I submit on the CYA page
    Then I should have 1 office or offices of transit added on the add another office of transit page
    When I choose to click on Remove link on the add another office of transit page
    And I choose radio option Yes on the confirm remove office of transit page
    And I choose radio option No on the add office of transit page
    Then I should be on the task list page


  Scenario: 04 GB Binding Itinerary set to YES
    When I select GB on the office of departure page
    And I choose radio option Normal on the procedure type page
    And I choose radio option T2 on the declaration type page
    And I choose radio option Entry summary declaration (ENS) on the security type page
    And I submit on the CYA page
    Then I should be on the task list page
    When I click the link with visible text: Add route details
    And I select GB on the office of destination page
    And I choose radio option Yes on the binding itinerary page
    And I select Andorra on the transit route country page
    Then I should have 1 country or countries to transit route added on the transit route add another country page
    And I choose radio option No on the transit route add another country page
    And I submit on the CYA page
   #Route Details Transit -> office of transit add eta [No] and Then add another transit office
    And I choose radio option Yes on the t2 declaration type page
    And I choose radio option Yes on the add office of transit page
    And I select France on the office of transit country page
    Then I should have France as office of transit on the office of transit page
    When I select Paris on the office of transit page
    Then I should have Paris arrival time title on the office of transit add eta page
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
    When I choose radio option No on the add another office of transit page
    Then I should be on the task list page



  #Route Details XI
  Scenario: 05 XI No Security selected and Binding Itinerary set to NO
    When I select XI on the office of departure page
    And I choose radio option Normal on the procedure type page
    And I choose radio option T1 on the declaration type page
    And I choose radio option No security on the security type page
    And I submit on the CYA page
    Then I should be on the task list page
    When I click the link with visible text: Add route details
    And I select XI on the office of destination page
    And I choose radio option No on the binding itinerary page
    And I choose radio option No on the transit route add country page
    And I submit on the CYA page
   #Route Details Transit -> Yes
    And I choose radio option Yes on the t2 declaration type page
    And I choose radio option Yes on the add office of transit page
    And I select France on the office of transit country page
    When I select Paris on the office of transit page
    Then I should have Paris arrival time title on the office of transit add eta page
    When I choose radio option Yes on the office of transit add eta page
    And I choose fill in the date and time on the office of transit eta page
    And I submit on the CYA page
    Then I should have 1 office or offices of transit added on the add another office of transit page
    When I choose radio option No on the add another office of transit page
    Then I should be on the task list page


  Scenario: 06 XI No Security selected and Binding Itinerary set to NO and then YES to add country transit route
    When I select XI on the office of departure page
    And I choose radio option Normal on the procedure type page
    And I choose radio option T1 on the declaration type page
    And I choose radio option No security on the security type page
    And I submit on the CYA page
    Then I should be on the task list page
    When I click the link with visible text: Add route details
    And I select XI on the office of destination page
    And I choose radio option No on the binding itinerary page
    And I choose radio option Yes on the transit route add country page
    And I select Andorra on the transit route country page
    Then I should have 1 country or countries to transit route added on the transit route add another country page
    And I choose radio option No on the transit route add another country page
    And I submit on the CYA page
   #Route Details Transit ->  Add office of transit page [No]
    And I choose radio option Yes on the t2 declaration type page
    And I choose radio option No on the add office of transit page
    Then I should be on the task list page



  Scenario: 07 XI No Security selected and Binding Itinerary set to YES
    When I select XI on the office of departure page
    And I choose radio option Normal on the procedure type page
    And I choose radio option T1 on the declaration type page
    And I choose radio option No security on the security type page
    And I submit on the CYA page
    Then I should be on the task list page
    When I click the link with visible text: Add route details
    And I select XI on the office of destination page
    And I choose radio option Yes on the binding itinerary page
    And I select Andorra on the transit route country page
    Then I should have 1 country or countries to transit route added on the transit route add another country page
    And I choose radio option No on the transit route add another country page
    And I submit on the CYA page
   #Route Details Transit -> office of transit add eta [No] and Remove office of transit
    And I choose radio option Yes on the t2 declaration type page
    And I choose radio option Yes on the add office of transit page
    And I select France on the office of transit country page
    When I select Paris on the office of transit page
    Then I should have Paris arrival time title on the office of transit add eta page
    When I choose radio option No on the office of transit add eta page
    And I submit on the CYA page
    Then I should have 1 office or offices of transit added on the add another office of transit page
    When I choose to click on Remove link on the add another office of transit page
    And I choose radio option Yes on the confirm remove office of transit page
    And I choose radio option No on the add office of transit page
    Then I should be on the task list page