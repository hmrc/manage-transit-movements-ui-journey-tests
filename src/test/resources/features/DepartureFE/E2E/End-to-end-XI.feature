@departureXIe2e
@wip
Feature: End to end journey for Northern Ireland office of departure

  Background:
    Given I login with ID 1234567
    Then I am on the Manage Transit Movements Hub service
    Given I click on the Make a departure declaration link
    And I input a random LRN on the LocalReferenceNumber page
    And I select XI on the office of departure page

  Scenario: 01 Pre Task List - XI Simplified - T2F (NON TIR) - EXS - XI NON TIR guarantee
    And I choose radio option Simplified on the procedure type page
    And I choose radio option T2F on the declaration type page
    And I choose radio option Exit summary declaration (EXS) on the security type page
    And I submit on the CYA page

    #Holder of transit
    And I click the link with visible text: Add trader details
    And I choose radio option No on the is eori known type page
    And I enter Joe Blog on the holder name page
    And I fill in the holder address page

    #Holder's contact person's details
    And I choose radio option No on the add contact page
    And I submit on the CYA page

    #Representative details
    And I choose radio option Yes on the acting as representative page
    And I enter GB123456121111 on the representative eori page
    And I enter Rosie Blog Rep on the representative name page
    And I choose radio option Direct (principal solely liable) on the representative capacity page
    And I enter +44 4381 82 83 on the representative phone number page
    And I submit on the CYA page

    #Reduced data set
    And I choose radio option No on the approved operator page

    #Consignor
    And I choose radio option Yes on the is consignor eori known page
    And I enter GB123456789000 on the consignor eori number page
    And I enter Lewies Blog Consignor on the consignor name page
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
    And I choose radio option (2) Individual guarantee as an undertaking by a guarantor on the guarantee type page
    And I enter 01GB1234567890120A123456 on the Guarantee Reference Number page
    And I enter AC01 on the access code page
    And I enter 10000 on the amount to be covered page
    And I submit on the CYA page

    Then I should have 2 guarantees added on the add another guarantee page
    And I choose radio option Yes on the add another guarantee page
    And I choose radio option (8) Guarantee not required – exempt public body on the guarantee type page
    And I enter 01GB123456789012 on the other reference for the guarantee 8 page
    And I submit on the CYA page

    Then I should have 3 guarantees added on the add another guarantee page
    And I choose radio option Yes on the add another guarantee page
    And I choose radio option (A) Guarantee waiver by agreement on the guarantee type page

    Then I should have 4 guarantees added on the add another guarantee page
    And I choose radio option No on the add another guarantee page
    Then I should be on the task list page

    #Route details: Binding Itinerary set to Yes
    When I click the link with visible text: Add route details
    And I select XI on the office of destination page
    And I choose radio option Yes on the binding itinerary page
    And I select Andorra on the transit route country page
    Then I should have 1 country or countries to transit route added on the transit route add country page
    When I choose radio option No on the add another transit route country page
    And I submit on the CYA page
    Then I should be on the task list page


  Scenario: 02 Pre Task list - XI Normal - TIR - Both - TIR Guarantee B
    And I choose radio option Normal on the procedure type page
    And I choose radio option TIR on the declaration type page
    And I enter 1234567 on the tir carnet page
    And I choose radio option Exit summary declaration (EXS) on the security type page
    And I submit on the CYA page
    Then I should be on the task list page

    #Transit holder details
    When I click the link with visible text: Add trader details
    And I choose radio option Yes on the is TIR id known type page
    And I enter ABC/123/12345 on the TIR holder id page
    And I enter Joe Blog on the holder name page
    And I fill in the holder address page

   #Holder's contact person's details
    And I choose radio option No on the add contact page
    And I submit on the CYA page

    #Representative details
    And I choose radio option No on the acting as representative page

    #Consignor
    And I choose radio option No on the is consignor eori known page
    And I enter Lewies Blog Consignor on the consignor name page
    And I fill in the consignor address page

    #Consignor contact
    And I choose radio option No on adding contact for consignor page

    #Consignee at header level
    And I choose radio option Yes on the more than one consignee page
    And I submit on the CYA page
    Then I should be on the task list page
    And I should see COMPLETED status for trader details

    #Guarantee details
    And I click the link with visible text: Add guarantee details
    Then I should be on the guarantee B added for TIR declaration page
    When I choose to continue
    And I should be on the task list page

    #Route details: Binding Itinerary set to No
    When I click the link with visible text: Add route details
    And I select XI on the office of destination page
    And I choose radio option No on the binding itinerary page
    And I select Andorra on the transit route country page
    Then I should have 1 country or countries to transit route added on the transit route add country page
    When I choose radio option Yes on the add another transit route country page
    And I select Argentina on the transit route country page
    Then I should have 2 country or countries to transit route added on the transit route add country page
    When I choose radio option No on the add another transit route country page
    And I submit on the CYA page
    Then I should be on the task list page