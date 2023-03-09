@unloading_remarks

Feature: Submit unloading remarks with seals

  Scenario: 01 - Unloading remarks with changes to summary answers & add/remove comment & adds new seals and changes the check seals section from CYA page
    Given I login with ID 1234567890
#    Given The user submits an arrival notification
#    And The user submits and unloading permission
    When I click on the View arrival notifications link on the 'Manage your transit movements' page
    And I click on the Make unloading remarks link for MRN 38VYQTYFU3T0KUTUM3 on the 'Arrival notifications' page
    #    2276
    Then I click the Continue button on the 'Unload the goods before you make unloading remarks' page
    #    2288
    And I fill in the date on the 'When were the goods unloaded?' page
    #    2292
    And I choose radio option Yes on the 'Are all the seal numbers of marks readable?' page
    #    2293
    And I choose radio option No on the 'Are any of the seals broken?' page


#       2324
    And I click the Change link for Identification number on the 'What did you find when unloading?' page
    And I enter LX58TZO on the 'What is the identification number for the new vehicle?' page

    #    2328
    And I click the Change link for Registered country on the 'What did you find when unloading?' page
    And I select United Kingdom on the unloading 'What country is the vehicle registered to?' page

    #     2388
    And I click the Change link for Container identification number on the 'What did you find when unloading?' page
    And I enter C001 on the 'What is the new container identification number?' page
#    2331
    And I click the Change link for Seal 1 on the 'What did you find when unloading?' page
    And I enter S001 on the 'What is the new seal number?' page

    #     2494
    And I click radio option Yes on the 'Are you sure you want to remove seal S001?' page

#    2333
    And I click the Change link for Total gross weight on the 'What did you find when unloading?' page
    And I enter 123.45 on the 'What is the new gross weight of item 1?' page

#     2385
    And I click the Change link for Net weight on the 'What did you find when unloading?' page
    And I enter 123.456789 on the 'What is the new net weight of item 1?' page

    #    2342
    And I click the Change link for Total number of packages on the 'What did you find when unloading?' page
    And I enter 100 on the 'What is the new total number of packages?' page

    #    2343 Add a comment
    When I click the Add comment link on the 'What did you find when unloading?' page
    And I enter a comment into the text field on the 'What do you need to report?' page
#     2648
    When I click the Remove link on the 'What did you find when unloading?' page
    And I click radio option Yes on the 'Are you sure you want to remove your comments?' page

#     2344
    And I submit on the 'Unloading remarks Check your answers' page

#     2360
    And I should be on the 'Unloading remarks sent' page
    And I sign out

