@arrivalAmendment
Feature: End to end journey for amending an arrival notification - Final

  Scenario: 01 - Arrival rejected. Resubmit.
    Given I login with ID 1234567890

    When I submit an IE007 Arrival Notification
    And I submit an IE057 Arrival Notification Rejection
    And the user has submitted arrivalNotification.json for MRN 25GB000246TK0E6WJ1 and EORI number 1234567890
    When I click on the View arrival notifications link on the 'Manage your transit movements' page
    Then I should be on the 'Arrival notifications' page
    And I click on the View errors link for MRN 25GB000246TK0E6WJ1 on the 'Arrival notifications' page
    Then I should be on the 'Review notification errors' page

    And I click on the Make another arrival notification link on the 'Review notification errors' page
    And I enter 25GB000246TK0E6WJ1 on the Movement Reference Number page
    And I submit on the Check your answers section Arrivals page
    And I should be on the Arrival notification sent page
    And I sign out
