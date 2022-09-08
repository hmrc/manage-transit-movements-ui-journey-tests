@traderDetails @departure @ZAP

Feature: Trader details - includes Pre-task list, Holder of transit, Representative, Consignor, Consignee

  Background:
    Given I login with ID 1234567
    Then I am on the Manage Transit Movements Hub service
    Given I click on the Make a departure declaration link
    And I input a random LRN on the LocalReferenceNumber page

  @ZAP
  Scenario: 01 TraderDetails - GB Normal - No Security - Reduced Data Set - Not more than 1 consignee
    And I select GB on the office of departure page
    And I choose radio option Normal on the procedure type page
    And I choose radio option T1 on the declaration type page
    And I choose radio option No security on the security type page
    And I submit on the CYA page
    Then I should be on the task list page

    #Transit holder details
    When I click the link with visible text: Add trader details
    And I choose radio option Yes on the is eori known type page
    And I enter GB123456123456 on the holder eori number page
    And I enter Joe Blog on the holder name page
    And I fill in the holder address page

    #Holder's contact person's details
    And I choose radio option Yes on the add contact page
    And I enter Bob Blog Contact on the holder's contact name page
    And I enter +44 4381 82 83 on the holder's contact phone number page

    #Representative details
    And I choose radio option No on the acting as representative page

    #Reduced data set
    And I choose radio option Yes on the approved operator page

    #Consignee at header level
    And I choose radio option No on the more than one consignee page
    And I choose radio option Yes on the is consignee eori known page
    And I enter GB123456123456 on the consignee eori number page
    And I enter Simpson Blog Consignee on the consignee name page
    And I fill in the consignee address page
    And I submit on the CYA page
    Then I should be on the task list page
    And I should see COMPLETED status for trader details

  Scenario: 02 TraderDetails - GB Normal - Both Security - No reduced data set - Add consignor contact
    And I select GB on the office of departure page
    And I choose radio option Normal on the procedure type page
    And I choose radio option T2 on the declaration type page
    And I choose radio option Both entry and exit summary declarations (ENS and EXS) on the security type page
    And I submit on the CYA page

    #Holder of transit
    And I click the link with visible text: Add trader details
    And I choose radio option No on the is eori known type page
    And I enter Joe Blog on the holder name page
    And I fill in the holder address page

    #Holder's contact person's details
    And I choose radio option No on the add contact page

    #Representative details
    And I choose radio option Yes on the acting as representative page
    And I enter GB123456121111 on the representative eori page
    And I enter Rosie Blog Rep on the representative name page
    And I choose radio option Direct (principal solely liable) on the representative capacity page
    And I enter +44 4381 82 83 on the representative phone number page

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

  Scenario: 03 TraderDetails - XI Normal - TIR - No Security
    And I select XI on the office of departure page
    And I choose radio option Normal on the procedure type page
    And I choose radio option TIR on the declaration type page
    And I enter 1234567 on the tir carnet page
    And I choose radio option No security on the security type page
    And I submit on the CYA page
    Then I should be on the task list page

    #Transit holder details
    When I click the link with visible text: Add trader details
    And I choose radio option No on the is TIR id known type page
    And I enter Joe Blog on the holder name page
    And I fill in the holder address page

    #Holder's contact person's details
    And I choose radio option No on the add contact page

    #Representative details
    And I choose radio option Yes on the acting as representative page
    And I enter GB123456121111 on the representative eori page
    And I enter Rosie Blog Rep on the representative name page
    And I choose radio option Direct (principal solely liable) on the representative capacity page
    And I enter +44 4381 82 83 on the representative phone number page

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

  Scenario: 04 TraderDetails - XI Normal - TIR - Both security
    And I select XI on the office of departure page
    And I choose radio option Normal on the procedure type page
    And I choose radio option TIR on the declaration type page
    And I enter 1234567 on the tir carnet page
    And I choose radio option Both entry and exit summary declarations (ENS and EXS) on the security type page
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

  Scenario: 05 TraderDetails - Change reduced data set, add consignor contact and change more than one consignee
    And I select GB on the office of departure page
    And I choose radio option Normal on the procedure type page
    And I choose radio option T2 on the declaration type page
    And I choose radio option Entry summary declaration (ENS) on the security type page
    And I submit on the CYA page
    Then I should be on the task list page

    #Holder of transit
    And I click the link with visible text: Add trader details
    And I choose radio option No on the is eori known type page
    And I enter Joe Blog on the holder name page
    And I fill in the holder address page

    #Holder's contact person's details
    And I choose radio option No on the add contact page

    #Representative details
    And I choose radio option No on the acting as representative page

    #Reduced data set
    And I choose radio option Yes on the approved operator page

    #Consignor
    And I choose radio option Yes on the is consignor eori known page
    And I enter GB123456789000 on the consignor eori number page
    And I enter Lewies Blog Consignor on the consignor name page
    And I fill in the consignor address page

    #Consignor contact
    And I choose radio option No on adding contact for consignor page

    #Consignee at header level
    And I choose radio option Yes on the more than one consignee page

    #Change reduced data set indicator
    And I click the change link for has reduced data set on the CYA page
    And I choose radio option No on the approved operator page

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
