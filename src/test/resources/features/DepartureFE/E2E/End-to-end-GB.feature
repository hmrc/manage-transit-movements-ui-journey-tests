@departureGBe2e
@wip
Feature: End to end journey for Great Britain office of departure

  Background:
    Given I login with ID 1234567
    Then I am on the Manage Transit Movements Hub service
    Given I click on the Make a departure declaration link
    And I input a random LRN on the LocalReferenceNumber page
    And I select GB on the office of departure page

  Scenario: GB Simplified - T1 - NO Safety and Security, Guarantees [0,3,5,9,R]
    And I choose radio option Simplified on the procedure type page
    And I choose radio option T1 on the declaration type page
    And I choose radio option No security on the security type page
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
    And I choose radio option No on the acting as representative page

    #Reduced data set
    And I choose radio option Yes on the approved operator page

    #Consignee at header level
    And I choose radio option Yes on the more than one consignee page

    #Change reduced data set indicator
    And I click the change link for has reduced data set on the CYA page
    And I choose radio option No on the approved operator page

    #Add consignor
    And I choose radio option Yes on the is consignor eori known page
    And I enter GB123456789000 on the consignor eori number page
    And I enter Lewies Blog Consignor on the consignor name page
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
    And I choose radio option Yes on the is consignee eori known page
    And I enter GB123456123456 on the consignee eori number page
    And I enter Simpson Blog Consignee on the consignee name page
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

    #### Route details: Binding Itinerary set to Yes
    When I click the link with visible text: Add route details
    And I select GB on the office of destination page
    And I choose radio option Yes on the binding itinerary page
    And I select Andorra on the transit route country page
    Then I should have 1 country or countries to transit route added on the transit route add country page
    When I choose radio option No on the add another transit route country page
    And I submit on the CYA page
    Then I should be on the task list page


  Scenario: 01 Pre Task List - GB Normal - T2 - ENS, Guarantees [1,2,4,8]
    And I choose radio option Normal on the procedure type page
    And I choose radio option T2 on the declaration type page
    And I choose radio option Entry summary declaration (ENS) on the security type page
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

    #### Route details: Binding Itinerary set to No and additional route
    When I click the link with visible text: Add route details
    And I select GB on the office of destination page
    And I choose radio option No on the binding itinerary page
    And I select Andorra on the transit route country page
    Then I should have 1 country or countries to transit route added on the transit route add country page
    When I choose radio option Yes on the add another transit route country page
    And I select Argentina on the transit route country page
    Then I should have 2 country or countries to transit route added on the transit route add country page
    When I choose radio option No on the add another transit route country page
    And I submit on the CYA page
    Then I should be on the task list page