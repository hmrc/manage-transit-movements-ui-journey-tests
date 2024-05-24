@arrivalAmendmentTransition
Feature: End to end journey for amending an arrival notification - Transition

  Scenario: 01 - Arrival rejected. Resubmit.
    Given I login with ID 1234567890

    When I submit an IE007 Transition Arrival Notification
    And I submit an IE057 Arrival Notification Rejection
    And the user has submitted arrivalNotificationTransition.json for MRN 21GB00014210026352 and EORI number 1234567890
    #cut-over
    And I click on the View NCTS 5 arrival notifications link on the 'Manage your transit movements' page

    # TODO 1 July
    #When I click on the View arrival notifications link on the 'Manage your transit movements' page
    Then I should be on the 'Arrival notifications' page
    And I click on the View errors link for MRN 21GB00014210026352 on the 'Arrival notifications' page
    Then I should be on the 'Review notification errors' page

    And I click on the Make another arrival notification link on the 'Review notification errors' page
    And I enter 21GB00014210026352 on the Movement Reference Number page
    And I submit on the Check your answers section Arrivals page
    And I should be on the Arrival notification sent page
    And I sign out
