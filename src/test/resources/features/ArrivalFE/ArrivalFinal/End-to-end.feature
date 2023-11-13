@arrivalE2e
Feature: End to end journey Arrival notification feature

  Background:
    Given I login with ID 1234567890
    And I click on the Make an arrival notification link on the 'Manage your transit movements' page
    And I enter 21GB00014210026352 on the Movement Reference Number page

  @a11y
  Scenario: 01 - Simplified - Authorisation number w/ contact
  #Identification
    When I select GB on the arrival office of destination page
    And I choose radio option Simplified on the 'What type of procedure are you using?' page
    And I enter GB123456789000 on the consignee eori tin page
    And I enter 1200014210026352 on the authorisations reference number page
  #Location Of goods - Location of goods - X Eori Number
    And I enter 12345 on the arrival location of goods authorisation number page
    And I choose radio option Yes on the arrival location of goods add contact page
    And I enter John Joe on the arrival location of goods contact page
    And I enter +44 2345 82 83 on the arrival location of goods contact number page
  #Summary CYA page
    And I submit on the Check your answers section Arrivals page
  #Confirmation
    And I click the Make another arrival notification link on the Arrival notification sent page
    And I should be on the What is the Movement Reference Number page
    And I sign out


  Scenario: 02 - Normal - Customs office
  #Identification
    When I select GB on the arrival office of destination page
    And I choose radio option Normal on the 'What type of procedure are you using?' page
    And I enter GB123456789000 on the consignee eori tin page
  #Location Of goods
    And I choose radio option Designated location on the arrival location of goods type page
    And I choose radio option Customs office identifier on the arrival location of goods identification page
    And I select GB on the arrival location of goods customs office identification page
  #Summary CYA page
    And I submit on the Check your answers section Arrivals page
  #Confirmation
    And I click the Check the status of arrival notifications link on the Arrival notification sent page
    And I should be on the 'Arrival notifications' page
    And I sign out


  Scenario: 03 - Normal - Coordinates w/ contact
  # Identification
    When I select GB on the arrival office of destination page
    And I choose radio option Normal on the 'What type of procedure are you using?' page
    And I enter GB123456789000 on the consignee eori tin page
  #Location Of goods
    And I choose radio option Approved place on the arrival location of goods type page
    And I choose radio option Coordinates on the arrival location of goods identification page
    And I enter 50.96622 and 50.96622 on the arrival location of goods coordinates page
    And I choose radio option Yes on the arrival location of goods add contact page
    And I enter John Joe on the arrival location of goods contact page
    And I enter +44 2345 82 83 on the arrival location of goods contact number page
  #Summary CYA page
    And I submit on the Check your answers section Arrivals page
  #Confirmation
    And I should be on the Arrival notification sent page
    And I sign out