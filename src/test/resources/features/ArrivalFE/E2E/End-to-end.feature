@arrivalE2e

Feature: End to end journey Arrival notification feature

  Background:
    Given I login with ID 1234567890
    Then I should be on the Manage your transit movements page
    And I click on the Make an arrival notification link on the Manage your transit movements page
    And I enter 21GB00014210026352 on the movement reference number page

  @ally
  Scenario: 01 - Simplified - Add Authorisation 'Yes' x2 - Goods Location Id  'Address' - Add contact 'No' - Add Incident 'Yes'- Incident Code '3' -
  Add Endorsement 'No' - (Container Id 'Yes' - Add Seal 'Yes' - Add Goods 'Yes') x2 - Add Another Incident 'Yes' -
  Remove 'Authorisation, Seal, Goods, Equipment & Incident' - Change 'Goods, Equipment & Incident'
    #Identification
    When I select XI on the arrival office of destination page
    And I enter GB123456789000 on the consignee eori tin page
    And I choose radio option Simplified on the procedure type page
    And I choose radio option ACE on the authorisations type page
    And I enter 1200014210026351 on the ACE authorisations reference number page
    And I submit on the CYA page
    #Add Authorisation
    Then I should have 1 authorisation on the add another authorisation page
    When I choose radio option Yes on the add another authorisation page
    And I choose radio option ACT on the authorisations type page
    And I enter 1200014210026352 on the ACT authorisations reference number page
    And I submit on the CYA page
    Then I should have 2 authorisations on the add another authorisation page
    #Remove Authorisation
    When I choose to click on Remove link on the add another authorisation page
    And I choose radio option Yes for the ACE authorisation 1200014210026351 on the remove authorisation page
    Then I choose radio option No on the add another authorisation page
    #Location Of goods
    And I choose radio option Authorised place on the arrival location of goods type page
    And I choose radio option Address on the arrival location of goods identification page
    And I select United Arab Emirates on the In which country is the location of goods page
    And I fill in address on the arrival location of goods address page
    And I choose radio option No on the arrival location of goods add contact page
    #Add Incident
    And I choose radio option Yes on the add incident page
    And I select France on the In which country did the incident happen page
    #Incident Code
    And I choose radio option 3 - The goods on the incident code page
    And I enter Hit an iceburg on the incident description page
    #Endorsement
    And I choose radio option No on the add endorsement page
    #Incident Identify Location
    And I choose radio option UN/LOCODE on the incident identify location page
    And I select Aalen on the incident un locode page
    #Add Container Indicator
    When I choose radio option Yes on the container indicator page
    And I enter C001 on the container identification number page
    #Add Container Seal
    And I choose radio option Yes for container identification number C001 on the add container seal page
    And I enter S001 for container identification number C001 on the container seal identification number page
    Then I should have 1 container seal added for container identification number C001 on the add another container seal page
    #Add Another Container Seal
    When I choose radio option Yes on the add another container seal page
    And I enter S002 for container identification number C001 on the container seal identification number page
    Then I should have 2 container seals added for container identification number C001 on the add another container seal page
    #Remove A Container Seal
    When I click the Remove link on the add another container seal page
    And I click radio option Yes for container seal identification number S001 on the remove seal page
    Then I choose radio option No on the add another container seal page
    #Add Goods Item
    When I choose radio option Yes on the Do you want to add a goods item number page
    And I enter 0001 on the What is the goods item number page
    #Add Another Goods Item
    When I choose radio option Yes on the You have added 1 goods item number page
    And I enter 0002 on the What is the goods item number page
    And I choose radio option No on the You have added 2 goods item numbers page
    Then I submit on the CYA page
    #Add Transport Equipment
    When I choose radio option Yes on the You have added 1 transport equipment page
    #Add Container Indicator - 2nd transport equipment iteration
    And I enter C002 on the container identification number page
    #Add Container Seal
    And I choose radio option Yes for container identification number C002 on the add container seal page
    And I enter S003 for container identification number C002 on the container seal identification number page
    Then I should have 1 container seal added for container identification number C002 on the add another container seal page
    #Add Another Container Seal
    When I choose radio option Yes on the add another container seal page
    And I enter S004 for container identification number C002 on the container seal identification number page
    Then I should have 2 container seals added for container identification number C002 on the add another container seal page
    When I choose radio option No on the add another container seal page
    #Add Goods Item
    And I choose radio option Yes on the Do you want to add a goods item number page
    And I enter 0003 on the What is the goods item number page
    #Add Another Goods Item
    And I choose radio option Yes on the You have added 1 goods item number page
    And I enter 0004 on the What is the goods item number page
    #Change Goods Item
    When I click the Change link on the You have added 2 goods item numbers page
    Then I enter 0005 on the What is the goods item number page
    #Remove Goods Item
    When I click the Remove link on the You have added 2 goods item numbers page
    And I click radio option Yes on the Are you sure you want to remove goods item number 0005 page
    And I choose radio option No on the You have added 1 goods item number page
    Then I submit on the CYA page
    #Change Transport Equipment
    When I click the Change link on the You have added 2 transport equipment page
    And I click the change link for Container identification number on the CYA page
    And I enter C003 on the container identification number page
    Then I submit on the CYA page
    #Remove Transport Equipment
    When I click the Remove link on the You have added 2 transport equipment page
    And I click radio option Yes on the Are you sure you want to remove transport equipment 2 page
    And I choose radio option No on the You have added 1 transport equipment page
    #Type of Identification 1
    And I choose radio option Name of a sea-going vessel on the Which identification do you want to use for the replacement means of transport page
    And I enter Titanic for the name of the sea-going vessel on the What is the identification number for the replacement transport page
    And I select France on the What country is the replacement transport registered to page
    Then I submit on the CYA page
    #Add Another Incident
    And I choose radio option Yes on the You have added 1 incident page
    #Add Incident - 2nd iteration
    And I select Argentina on the In which country did the incident happen page
    #Incident Code - Second Incident
    And I choose radio option 3 - The goods on the incident code page
    And I enter The ship sank on the incident description page
    #Endorsement - Second Incident
    And I choose radio option No on the add endorsement page
    #Incident Identify Location - Second Incident
    And I choose radio option UN/LOCODE on the incident identify location page
    And I select Aalen on the incident un locode page
    #Add Container Indicator - Second Incident
    And I choose radio option No on the container indicator page
    #Add Transport Equipment - Second Incident
    And I choose radio option No on the add transport equipment page
    #Type of Identification - Second Incident
    And I choose radio option Name of a sea-going vessel on the Which identification do you want to use for the replacement means of transport page
    And I enter Bismarck for the name of the sea-going vessel on the What is the identification number for the replacement transport page
    And I select Argentina on the What country is the replacement transport registered to page
    Then I submit on the CYA page
    #Change an incident
    When I click the Change link on the You have added 2 incidents page
    And I click the change link for add endorsement on the CYA page
    And I choose radio option Yes on the add endorsement page
    And I choose fill in the date on the endorsement date page
    And I enter Border Patrol on the endorsement authority page
    And I select France on the endorsement country page
    And I enter Route 1A junction 6 on the endorsement location page
    Then I submit on the CYA page
    #Remove an incident
    When I click the Remove link on the You have added 2 incidents page
    And I click radio option Yes on the Are you sure you want to remove incident 1 page
    And I choose radio option No on the You have added 1 incident page
    #Summary CYA page
    And I submit on the CYA page
    #Confirmation
    And I should be on the Arrival notification sent page
    And I sign out


  Scenario: 02 - Simplified - Goods Location Id  'Address' - Add Contact 'No' - Add Incident 'Yes'- Incident Code '4' -
  Add Endorsement 'No' - Incident Location 'UN/LOCODE' - Container Id 'Yes' - Add Seal 'Yes' x2 - Add Goods Item 'No' -
  Add Transport Equipment 'No' - Add Another Incident 'No'
  # Identification
    When I select XI on the arrival office of destination page
    And I enter GB123456789000 on the consignee eori tin page
    And I choose radio option Simplified on the procedure type page
    And I choose radio option ACE on the authorisations type page
    And I enter 1200014210026352 on the ACE authorisations reference number page
    Then I submit on the CYA page
    When I should have 1 authorisation on the add another authorisation page
    And I choose radio option No on the add another authorisation page
  #Location Of goods
    And I choose radio option Authorised place on the arrival location of goods type page
    And I choose radio option Address on the arrival location of goods identification page
    And I select France on the In which country is the location of goods page
    And I fill in address on the arrival location of goods address page
    And I choose radio option No on the arrival location of goods add contact page
  #Add Incident
    And I choose radio option Yes on the add incident page
    And I select France on the In which country did the incident happen page
  #Incident Code
    And I choose radio option 4 - The goods were partially on the incident code page
    And I enter Test Incident Happened text on the incident description page
  #Endorsement
    And I choose radio option No on the add endorsement page
  #Incident Identify Location
    And I choose radio option UN/LOCODE on the incident identify location page
    And I select Aalen on the incident un locode page
  #Container Identification Number
    And I choose radio option Yes on the add container identification number page
    And I enter C001 on the container identification number page
  #Add Container Seal
    And I choose radio option Yes for container identification number C001 on the add container seal page
    And I enter S001 for container identification number C001 on the container seal identification number page
    Then I should have 1 container seal added for container identification number C001 on the add another container seal page
  #Add Another Container Seal
    When I choose radio option Yes on the add another container seal page
    And I enter S002 for container identification number C001 on the container seal identification number page
    Then I should have 2 container seals added for container identification number C001 on the add another container seal page
    When I choose radio option No on the add another container seal page
  #Add Goods Item
    And I choose radio option Yes on the Do you want to add a goods item number page
    And I enter 0001 on the What is the goods item number page
    And I choose radio option No on the You have added 1 goods item number page
    Then I submit on the CYA page
    And I choose radio option No on the You have added 1 transport equipment page
    Then I submit on the CYA page
  #Add Another Incident
    And I choose radio option No on the You have added 1 incident page
  #Summary CYA page
    And I submit on the CYA page
  #Confirmation
    And I click the Check the status of arrival notifications link on the Arrival notification sent page
    And I should be on the Arrival notifications page
    And I sign out


  Scenario: 03 - Simplified - Goods Location Id  'EORI Number' - Add additional Id 'Yes' - Add Contact 'Yes' -
  Add Incident 'Yes'- Incident Code '5' - Add Endorsement 'Yes' - Incident Location 'Address' - Add Another Incident 'No'
  #Identification
    When I select GB on the arrival office of destination page
    And I enter GB123456789000 on the consignee eori tin page
    And I choose radio option Simplified on the procedure type page
    And I choose radio option ACT on the authorisations type page
    And I enter 1200014210026352 on the ACT authorisations reference number page
    Then I submit on the CYA page
    And I should have 1 authorisation on the add another authorisation page
    When I choose radio option No on the add another authorisation page
  #Location Of goods - Location of goods - X Eori Number
    And I choose radio option Authorised place on the arrival location of goods type page
    And I choose radio option EORI number on the arrival location of goods identification page
    And I enter GB123456789000 on the arrival location of goods eori tin page
    And I choose radio option Yes on the arrival location of goods add additional identifier page
    And I enter 1234 on the arrival location of goods additional identifier page
    And I choose radio option Yes on the arrival location of goods add contact page
    And I enter John Joe on the arrival location of goods contact page
    And I enter +44 2345 82 83 on the arrival location of goods contact telephone number page
  #Incident
    And I choose radio option Yes on the add incident page
    And I select France on the In which country did the incident happen page
  #Incident code
    And I choose radio option 5 - The holder on the incident code page
    And I enter Test Incident Happened text on the incident description page
  #Endorsement
    And I choose radio option Yes on the add endorsement page
    And I choose fill in the date on the endorsement date page
    And I enter test data on the endorsement authority page
    And I select France on the endorsement country page
    And I enter Incident test data on the endorsement location page
  #Incidents Identify Location
    And I choose radio option Address on the incident identify location page
    And I fill in address on the incident address page
    And I submit on the CYA page
  #Add Another Incident
    And I choose radio option No on the You have added 1 incident page
  #Summary CYA page
    And I submit on the CYA page
  #Confirmation
    And I click the Create another arrival notification link on the Arrival notification sent page
    And I should be on the What is the Movement Reference Number page
    And I sign out
