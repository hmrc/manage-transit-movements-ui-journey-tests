@unloading_remarks

Feature: Submit unloading remarks with seals

  Scenario: 01 - Unloading remarks with changes to summary answers & add/remove comment & adds new seals and changes the check seals section from CYA page
    Given I login with ID 1234567890
    When I submit an IE007 Arrival Notification
    And I submit an IE043 Unloading Permission With Seals
    Then I click on the View arrival notifications link on the 'Manage your transit movements' page
    And I click on the Make unloading remarks link for MRN 38VYQTYFU3T0KUTUM3 on the 'Arrival notifications' page
    Then I click the Continue button on the 'Unload the goods before you make unloading remarks' page
    And I choose radio option fully on the 'Have you fully or partially unloaded the goods?' page
    And I fill in the date on the 'When were the goods unloaded?' page
    And I choose radio option Yes on the 'Are all the seal identification numbers or marks readable?' page
    And I choose radio option No on the 'Are any of the seals broken?' page
    And I click the House consignment 1 link on the 'Cross-check the transit with this declaration summary' page
    And I click the More details link on the 'Cross-check the transit with this declaration summary' page
    And I click the Back to summary button on the 'Cross-check the transit with house consignment 1' page
    And I click the Continue button on the 'Cross-check the transit with this declaration summary' page
    And I choose radio option No on the 'Were there any differences between the transit and the declaration information?' page
    And I click the change link for Were there any differences between the transit and the declaration information? on the Unloading 'Check your answers' page
    And I choose radio option Yes on the 'Were there any differences between the transit and the declaration information?' page
    And I enter a comment into the text field on the 'What comments do you want to add?' page
    And I submit the 'Check your answers' page
    And I should be on the 'Unloading remarks sent' page
    And I sign out



#    #    2324
#    And I click the Change link for Identification number on the 'What did you find when unloading?' page
#    And I enter LX58TZO on the 'What is the identification number for the new vehicle?' page
#
#    #    2328
#    And I click the Change link for Registered country on the 'What did you find when unloading?' page
#    And I select United Kingdom on the unloading 'What country is the vehicle registered to?' page
#
#    #    2388
#    And I click the Change link for Container identification number on the 'What did you find when unloading?' page
#    And I enter C001 on the 'What is the new container identification number?' page
#    #    2331
#    And I click the Change link for Seal 1 on the 'What did you find when unloading?' page
#    And I enter S001 on the 'What is the new seal number?' page
#
#    #    2494
#    And I click radio option Yes on the 'Are you sure you want to remove seal S001?' page
#
#    #    2333
#    And I click the Change link for Gross weight on the 'What did you find when unloading?' page
#    And I enter 123.45 on the 'What is the new gross weight of item 1?' page
#
#    #    2385
#    And I click the Change link for Net weight on the 'What did you find when unloading?' page
#    And I enter 123.456789 on the 'What is the new net weight of item 1?' page
#
#    #    2342
#    And I click the Change link for Number of packages on the 'What did you find when unloading?' page
#    And I enter 100 on the 'What is the new number of packages for item 1?' page
#
#    #    2343 Add a comment
#    When I click the Add comment link on the 'What did you find when unloading?' page
#    And I enter a comment into the text field on the 'What do you need to report?' page

#    #    2648
#    When I click the Remove link on the 'What did you find when unloading?' page
#    And I click radio option Yes on the 'Are you sure you want to remove your comments?' page

#    And I sign out

