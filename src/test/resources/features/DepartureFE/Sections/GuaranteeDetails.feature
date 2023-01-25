@guaranteeDetails @departure
Feature: Guarantee journeys includes pre task list

  Background:
    Given I login with ID 1234567890
    Then I should be on the Manage your transit movements page
    When I click on the Make a departure declaration link on the Manage your transit movements page
    Then I input a random LRN on the What is the Local Reference Number page

  @a11y
    Scenario: 01 GB declaration with multiple guarantees [0,3,5,9,R]
      And I select GB on the office of departure page
      And I choose radio option Normal on the procedure type page
      And I choose radio option T1 on the declaration type page
      And I choose radio option No security on the security type page
      And I submit the Check your answers page
      Then I should be on the task list page
      When I click the link with visible text: Add guarantee details
      #Guarantee details
      And I choose radio option (0) Guarantee waiver on the guarantee type page
      And I enter 01GB1234567890120A123456 on the Guarantee Reference Number page
      And I enter AC01 on the access code page
      And I enter 10000 on the amount to be covered page
      And I submit on the Guarantee details Check your answers page
      Then I should have 1 guarantees added on the add another guarantee page
      When I choose radio option Yes on the add another guarantee page
      And I choose radio option (3) Individual guarantee in cash on the guarantee type page
      And I choose radio option Yes on the do you want to add a reference for the guarantee page
      And I enter 01GB123456789012 on the other reference for the guarantee 3 page
      And I submit on the Guarantee details Check your answers page
      Then I should have 2 guarantees added on the add another guarantee page
      When I choose radio option Yes on the add another guarantee page
      And I choose radio option (5) Guarantee waiver – secured for 500 euros or less on the guarantee type page
      And I enter 01GB1234567890120A123456 on the Guarantee Reference Number page
      And I submit on the Guarantee details Check your answers page
      Then I should have 3 guarantees added on the add another guarantee page
      When I choose radio option Yes on the add another guarantee page
      And I choose radio option (9) Individual guarantee with multiple usage on the guarantee type page
      And I enter 01GB1234567890120A123456 on the Guarantee Reference Number page
      And I enter AC01 on the access code page
      And I enter 10000 on the amount to be covered page
      And I submit on the Guarantee details Check your answers page
      Then I should have 4 guarantees added on the add another guarantee page
      When I choose radio option Yes on the add another guarantee page
      And I choose radio option (R) Guarantee not required – goods carried on the Rhine, the Danube or their waterways on the guarantee type page
      Then I should have 5 guarantees added on the add another guarantee page
      When I choose radio option No on the add another guarantee page
      Then I should be on the task list page


    Scenario: 02 XI NON TIR declaration with multiple guarantees [1,2,8,A]
      And I select XI on the office of departure page
      And I choose radio option Normal on the procedure type page
      And I choose radio option T2F on the declaration type page
      And I choose radio option No security on the security type page
      And I submit the Check your answers page
      And I click the link with visible text: Add guarantee details
      #Guarantee details
      And I choose radio option (1) Comprehensive guarantee on the guarantee type page
      And I enter 01GB1234567890120A123456 on the Guarantee Reference Number page
      And I enter AC01 on the access code page
      And I enter 10000 on the amount to be covered page
      And I submit on the Guarantee details Check your answers page
      Then I should have 1 guarantees added on the add another guarantee page
      And I choose radio option Yes on the add another guarantee page
      And I choose radio option (2) Individual guarantee as an undertaking by a guarantor on the guarantee type page
      And I enter 01GB1234567890120A123456 on the Guarantee Reference Number page
      And I enter AC01 on the access code page
      And I enter 10000 on the amount to be covered page
      And I submit on the Guarantee details Check your answers page
      Then I should have 2 guarantees added on the add another guarantee page
      And I choose radio option Yes on the add another guarantee page
      And I choose radio option (8) Guarantee not required – exempt public body on the guarantee type page
      And I enter 01GB123456789012 on the other reference for the guarantee 8 page
      And I submit on the Guarantee details Check your answers page
      Then I should have 3 guarantees added on the add another guarantee page
      And I choose radio option Yes on the add another guarantee page
      And I choose radio option (A) Guarantee waiver by agreement on the guarantee type page
      Then I should have 4 guarantees added on the add another guarantee page
      And I choose radio option No on the add another guarantee page
      Then I should be on the task list page


    Scenario: 03 XI TIR declaration
      And I select XI on the office of departure page
      And I choose radio option Normal on the procedure type page
      And I choose radio option TIR on the declaration type page
      And I enter 1234567 on the tir carnet page
      And I choose radio option Both entry and exit summary declarations (ENS and EXS) on the security type page
      And I submit the Check your answers page
      And I click the link with visible text: Add guarantee details
      Then I should be on the guarantee B added for TIR declaration page






