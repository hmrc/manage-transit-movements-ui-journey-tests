@arrival

Feature: Arrival notification feature

  Background:
    Given I login with ID 1234567890
    And I click on the Make an arrival notification link on the 'Manage your transit movements' page
    And I enter 21GB00014210026352 on the 'What is the Movement Reference Number?' page


  Scenario: 01 - Normal - Goods Location Id  'Customs office' - Add Incident 'Yes' - Incident Code '1' -
  Add Endorsement 'Yes' - Add Another Incident 'No'
  #Identification
    When I select Newcastle-Upon-Tyne (GB000218) on the 'Where is the arrival office of destination?' page
    And I enter GB123456789000 on the 'What is the consignee’s EORI number or Trader Identification Number?'  page
    And I choose radio option Normal on the 'What type of procedure are you using?' page
  #Location Of goods
    And I choose radio option Authorised place on the 'Which type of location are the goods in?' page
    And I choose radio option Customs office identifier on the 'How do you want to identify the location of goods?' page
    And I select Southampton (GB000290) on the 'What is the customs office identifier for the location of goods?' page
  #Add Incident
    And I choose radio option Yes on the 'Were there any incidents during the transit?' page
    And I select France on the 'In which country did the incident happen?' page
  #Incident Code
    And I choose radio option 1 - The carrier on the 'Which type of incident was it?' page
    And I enter Test Incident Happened text on the 'What happened during the incident?' page
  #Endorsement
    And I choose radio option Yes on the add endorsement page
    And I choose fill in the date on the endorsement date page
    And I enter test data on the endorsement authority page
    And I select France on the endorsement country page
    And I enter Incident test data on the endorsement location page
  #Incident Identify Location
    And I choose radio option Coordinates on the incident identify location page
    And I enter 50.96622 and 50.96622 on the incident coordinates page
    And I submit on the 'Arrivals - Incidents Check your answers' page
  #Add Another Incident
    And I choose radio option No on the You have added 1 incident page
  #Summary CYA page
    And I submit on the 'Arrivals Check your answers' page
  #Confirmation
    And I click the Check the status of arrival notifications link on the Arrival notification sent page
    And I should be on the 'Arrival notifications' page
    And I sign out


  Scenario: 02 - Normal - Goods Location Id  'Customs office' - Add Incident 'Yes'- Incident Code '2' - Add Endorsement 'No' -
  Add Container 'Yes' - Add Goods Item 'No' - Add Transport Equipment 'No' - Add Another Incident 'No'
  #Identification
    When I select Newcastle-Upon-Tyne (GB000218) on the 'Where is the arrival office of destination?' page
    And I enter GB123456789000 on the 'What is the consignee’s EORI number or Trader Identification Number?'  page
    And I choose radio option Normal on the 'What type of procedure are you using?' page
  #Location Of goods
    And I choose radio option Authorised place on the 'Which type of location are the goods in?' page
    And I choose radio option Customs office identifier on the 'How do you want to identify the location of goods?' page
    And I select Southampton (GB000290) on the 'What is the customs office identifier for the location of goods?' page
  #Add Incident
    And I choose radio option Yes on the 'Were there any incidents during the transit?' page
    And I select France on the 'In which country did the incident happen?' page
  #Incident Code
    And I choose radio option 2 - The seals on the 'Which type of incident was it?' page
    And I enter Test Incident Happened text on the 'What happened during the incident?' page
  #Endorsement
    And I choose radio option No on the add endorsement page
  #Incident Identify Location
    And I choose radio option Coordinates on the incident identify location page
    And I enter 50.96622 and 50.96622 on the incident coordinates page
  #Add Container
    And I choose radio option Yes on the add container identification number page
    And I enter C001 on the container identification number page
  #Add Seal
    When I enter S001 for container identification number C001 on the container seal identification number page
    Then I should have 1 container seal added for container identification number C001 on the add another container seal page
    When I choose radio option No on the add another container seal page
  #Add Goods Item
    And I choose radio option No on the Do you want to add a goods item number page
    And I submit on the 'Arrivals - Transport equipment Check your answers' page
  #Add Transport Equipment
    When I choose radio option No on the You have added 1 transport equipment page
    And I submit on the 'Arrivals - Incidents Check your answers' page
  #Add Another Incident
    And I choose radio option No on the You have added 1 incident page
  #Summary CYA page
    And I submit on the 'Arrivals Check your answers' page
  #Confirmation
    And I click the Create another arrival notification link on the Arrival notification sent page
    And I should be on the 'What is the Movement Reference Number?' page
    And I sign out


  Scenario: 03 - Normal - Goods Location Id  'Coordinates' - Add Incident 'Yes' - Incident code '6' -
  Endorsement 'No' - Incident Location 'Address' - Add Another Incident 'No'
  # Identification
    When I select Newcastle-Upon-Tyne (GB000218) on the 'Where is the arrival office of destination?' page
    And I enter GB123456789000 on the 'What is the consignee’s EORI number or Trader Identification Number?'  page
    And I choose radio option Normal on the 'What type of procedure are you using?' page
  #Location Of goods
    And I choose radio option Authorised place on the 'Which type of location are the goods in?' page
    And I choose radio option Coordinates on the 'How do you want to identify the location of goods?' page
    And I enter 50.96622 and 50.96622 on the 'What are the coordinates for the location of goods?' page
    And I choose radio option No on the 'Do you want to add a contact for the location of goods?' page
  #Add Incident
    And I choose radio option Yes on the 'Were there any incidents during the transit?' page
    And I select France on the 'In which country did the incident happen?' page
  #Incident Code
    And I choose radio option 6 - The means on the 'Which type of incident was it?' page
    And I enter Test Incident Happened text on the 'What happened during the incident?' page
  #Endorsements
    And I choose radio option No on the add endorsement page
  #Incidents Identify Location
    And I choose radio option Address on the incident identify location page
    And I fill in address on the incident address page
  #Add Container Indicator
    And I choose radio option No on the container indicator page
    And I choose radio option Yes on the add transport equipment page
    And I choose radio option No on the add container identification number page
  #Add Container Seal
    And I enter S001 on the What is the seal identification number page
    And I should have 1 seal added on the add another seal page
    When I choose radio option No on the add another container seal page
  #Add Goods Item
    And I choose radio option No on the Do you want to add a goods item number page
    And I submit on the 'Arrivals - Transport equipment Check your answers' page
  #Add Transport Equipment
    And I choose radio option No on the You have added 1 transport equipment page
 #Type of Identification
    And I choose radio option Name of a sea-going vessel on the Which identification do you want to use for the replacement means of transport page
    And I enter Bismarck for the name of the sea-going vessel on the What is the identification number for the replacement transport page
    And I select Argentina on the What country is the replacement transport registered to page
    And I submit on the 'Arrivals - Incidents Check your answers' page
  #Add Another Incident
    And I choose radio option No on the You have added 1 incident page
  #Summary CYA page
    And I submit on the 'Arrivals Check your answers' page
  #Confirmation
    And I should be on the Arrival notification sent page
    And I sign out


  Scenario: 04 - Normal - Goods id location 'UN/LOCODE' - Add Contact 'No' - Add Incident 'No'
  # Identification
    When I select Belfast EPU (XI000142) on the 'Where is the arrival office of destination?' page
    And I enter GB123456789000 on the 'What is the consignee’s EORI number or Trader Identification Number?'  page
    And I choose radio option Normal on the 'What type of procedure are you using?' page
  #Location Of goods
    And I choose radio option Authorised place on the 'Which type of location are the goods in?' page
    And I choose radio option UN/LOCODE on the 'How do you want to identify the location of goods?' page
    And I select Aalen (DEAAL) on the 'What is the UN/LOCODE for the location of goods?' page
    And I choose radio option No on the 'Do you want to add a contact for the location of goods?' page
  #Add Incident
    And I choose radio option No on the 'Were there any incidents during the transit?' page
  #Summary CYA page
    And I submit on the 'Arrivals Check your answers' page
 #Confirmation
    And I should be on the Arrival notification sent page
    And I sign out
