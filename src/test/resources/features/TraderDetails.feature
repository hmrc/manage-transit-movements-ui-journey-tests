@traderDetails @departure

Feature: Example Feature file using Cucumber

  Background:
    Given I delete all cookies
    And I login with ID 1234567
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
    And I submit on the CYA page

    



