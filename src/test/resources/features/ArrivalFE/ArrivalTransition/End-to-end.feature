@arrivalE2eTransition
Feature: End to end journey Arrival notification feature - Transition

  Background:
    Given I login with ID 1234567890
    And I click on the Make an arrival notification link on the 'Manage your transit movements' page
    And I enter 21GB00014210026352 on the Movement Reference Number page


  Scenario: 01 - Simplified - Add contact 'Yes' - Add Incident 'Yes'- Incident Code '3' -
  Add Endorsement 'No' - (Container Id 'Yes' - Add Seal 'Yes' - Add Goods 'Yes') x2 - Add Another Incident 'Yes' -
  Remove 'Authorisation, Seal, Goods, Equipment & Incident'
    #Identification
    When I select XI on the arrival office of destination page
    And I choose radio option Simplified on the 'What type of procedure are you using?' page
    And I enter GB123456789000 on the consignee eori tin page
    And I enter 1200014210026352 on the authorisations reference number page
    And I enter 12345 on the arrival location of goods authorisation number page
    And I choose radio option Yes on the arrival location of goods add contact page
    And I enter John on the arrival location of goods contact page
    And I enter +44 2345 82 83 on the arrival location of goods contact number page
    #Add Incident
    And I choose radio option Yes on the add incident page
    And I select France on the In which country did the incident happen page
    #Incident Code
    And I choose radio option 3 - The goods on the incident code page
    And I enter Hit an iceberg, then sank on the incident description page
    #Endorsement
    And I choose radio option No on the add endorsement page
    #Incident Identify Location
    And I choose radio option UN/LOCODE on the incident identify location page
    And I enter DEAAL on the incident un locode page
    #Add Container Indicator
    When I choose radio option Yes on the container indicator page
    And I enter C001 on the container identification number page
      #Add Container Seal
    And I choose radio option Yes on the add seals page
    And I enter S001 on the seal identification number page
  #Add Another Container Seal
    When I choose radio option Yes on the Arrivals 'You have added 1 seal' page
    And I enter S002 on the seal identification number page
  #Remove A Container Seal
    When I click the Remove link on the add another container seal page
    And I click radio option Yes for container seal identification number S001 on the remove seal page
    When I choose radio option No on the Arrivals 'You have added 1 seal' page
  #Add Goods Item
    When I choose radio option Yes on the Do you want to add a goods item number page
    And I enter 1 on the What is the goods item number page
  #Add Another Goods Item
    When I choose radio option Yes on the You have added 1 goods item number page
    And I enter 2 on the What is the goods item number page
    And I choose radio option No on the You have added 2 goods item numbers page
    And I submit on the Check your answers section Transport equipment page

  #Add Transport Equipment
    When I choose radio option Yes on the You have added 1 transport equipment page
  #Add Container Indicator - 2nd transport equipment iteration
    And I enter C002 on the container identification number page
  #Add Container Seal
    And I choose radio option Yes on the add seals page
    And I enter S003 on the seal identification number page
  #Add Another Container Seal
    When I choose radio option Yes on the Arrivals 'You have added 1 seal' page
    And I enter S004 on the seal identification number page
    When I choose radio option No on the Arrivals 'You have added 2 seals' page
    #Add Goods Item
    And I choose radio option Yes on the Do you want to add a goods item number page
    And I enter 3 on the What is the goods item number page
    #Add Another Goods Item
    And I choose radio option Yes on the You have added 1 goods item number page
    And I enter 4 on the What is the goods item number page

    #Remove Goods Item
    When I click the Remove link on the You have added 2 goods item numbers page
    And I click radio option Yes on the Are you sure you want to remove goods item number 3 page
    And I choose radio option No on the You have added 1 goods item number page
    And I submit on the Check your answers section Transport equipment page

    #Remove Transport Equipment
    When I click the Remove link on the You have added 2 transport equipment page
    And I click radio option Yes on the Are you sure you want to remove transport equipment 1 page
    And I choose radio option No on the You have added 1 transport equipment page
    #Type of Identification 1
    And I choose radio option Name of a sea-going vessel on the Which identification do you want to use for the replacement means of transport page
    And I enter Titanic on the What is the identification number for this page
    And I select France on the What country is the replacement transport registered to page
    And I submit on the Check your answers section Incidents page
      #Add Another Incident
    And I choose radio option Yes on the You have added 1 incident page
    #Add Incident - 2nd iteration
    And I select Italy on the In which country did the incident happen page
    #Incident Code - Second Incident
    And I choose radio option 3 - The goods on the incident code page
    And I enter The ship sank on the incident description page
    #Endorsement - Second Incident
    And I choose radio option No on the add endorsement page
    #Incident Identify Location - Second Incident
    And I choose radio option UN/LOCODE on the incident identify location page
    And I enter DEAAL on the incident un locode page
    #Add Container Indicator - Second Incident
    And I choose radio option No on the container indicator page
    #Add Transport Equipment - Second Incident
    And I choose radio option No on the add transport equipment page
    #Type of Identification - Second Incident
    And I choose radio option Name of a sea-going vessel on the Which identification do you want to use for the replacement means of transport page
    And I enter Bismarck on the What is the identification number for this page
    And I select Argentina on the What country is the replacement transport registered to page
    And I submit on the Check your answers section Incidents page

    #Remove an incident
    When I click the Remove link on the You have added 2 incidents page
    And I click radio option Yes on the Are you sure you want to remove incident 1 page
    And I choose radio option No on the You have added 1 incident page
    #Summary CYA page
    And I submit on the Check your answers section Arrivals page

    #Confirmation
    And I should be on the Arrival notification sent page
    And I sign out


  Scenario: 02 - Normal - Coordinates - Add Contact 'Yes' - Add Incident 'Yes'- Incident Code '4' -
  Add Endorsement 'No' - Incident Location 'UN/LOCODE' - Container Id 'Yes' - Add Seal 'Yes' x2 - Add Goods Item 'No' -
  Add Transport Equipment 'No' - Add Another Incident 'No'
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
    And I enter DEAAL on the incident un locode page
  #Container Identification Number
    And I choose radio option Yes on the add container identification number page
    And I enter C001 on the container identification number page
  #Add Container Seal
    And I choose radio option Yes on the add seals page
    And I enter S001 on the seal identification number page
  #Add Another Container Seal
    When I choose radio option Yes on the Arrivals 'You have added 1 seal' page
    And I enter S002 on the seal identification number page
    When I choose radio option No on the Arrivals 'You have added 2 seals' page
  #Add Goods Item
    And I choose radio option Yes on the Do you want to add a goods item number page
    And I enter 1 on the What is the goods item number page
    And I choose radio option No on the You have added 1 goods item number page
    And I submit on the Check your answers section Transport equipment page
    And I choose radio option No on the You have added 1 transport equipment page
    And I submit on the Check your answers section Incidents page
  #Add Another Incident
    And I choose radio option No on the You have added 1 incident page
  #Summary CYA page
    And I submit on the Check your answers section Arrivals page
  #Confirmation
    And I click the Check the status of arrival notifications link on the Arrival notification sent page
    And I should be on the 'Arrival notifications' page
    And I sign out


  Scenario: 03 - Normal - Customs office - Add Incident 'Yes'- Incident Code '5' - Add Endorsement 'Yes' - Incident Location 'Address' - Add Another Incident 'No'
  #Identification
    When I select GB on the arrival office of destination page
    And I choose radio option Normal on the 'What type of procedure are you using?' page
    And I enter GB123456789000 on the consignee eori tin page
  #Location Of goods
    And I choose radio option Designated location on the arrival location of goods type page
    And I choose radio option Customs office identifier on the arrival location of goods identification page
    And I select GB on the arrival location of goods customs office identification page
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
    And I submit on the Check your answers section Incidents page
  #Add Another Incident
    And I choose radio option No on the You have added 1 incident page
  #Summary CYA page
    And I submit on the Check your answers section Arrivals page
  #Confirmation
    And I click the Make another arrival notification link on the Arrival notification sent page
    And I should be on the What is the Movement Reference Number page
    And I sign out


  Scenario: 04 - Normal - Customs office - Add Incident 'Yes' - Incident Code '1' - Add Endorsement 'Yes' - Incident Location 'Coordinates' - Add Another Incident 'No'
  Add Endorsement 'Yes' - Add Another Incident 'No'
  #Identification
    When I select GB on the arrival office of destination page
    And I choose radio option Normal on the 'What type of procedure are you using?' page
    And I enter GB123456789000 on the consignee eori tin page
  #Location Of goods
    And I choose radio option Designated location on the arrival location of goods type page
    And I choose radio option Customs office identifier on the arrival location of goods identification page
    And I select GB on the arrival location of goods customs office identification page
  #Add Incident
    And I choose radio option Yes on the add incident page
    And I select France on the In which country did the incident happen page
  #Incident Code
    And I choose radio option 1 - The carrier on the incident code page
    And I enter Test Incident Happened text on the incident description page
  #Endorsement
    And I choose radio option Yes on the add endorsement page
    And I choose fill in the date on the endorsement date page
    And I enter test data on the endorsement authority page
    And I select France on the endorsement country page
    And I enter Incident test data on the endorsement location page
  #Incident Identify Location
    And I choose radio option Coordinates on the incident identify location page
    And I enter 50.96622 and 50.96622 on the incident coordinates page
    And I submit on the Check your answers section Incidents page
  #Add Another Incident
    And I choose radio option No on the You have added 1 incident page
  #Summary CYA page
    And I submit on the Check your answers section Arrivals page
  #Confirmation
    And I click the Check the status of arrival notifications link on the Arrival notification sent page
    And I should be on the 'Arrival notifications' page
    And I sign out


  Scenario: 05 - Normal - Customs office - Add Incident 'Yes'- Incident Code '2' - Add Endorsement 'No' -
  Add Container 'Yes' - Add Goods Item 'No' - Add Transport Equipment 'No' - Add Another Incident 'No'
  #Identification
    When I select GB on the arrival office of destination page
    And I choose radio option Normal on the 'What type of procedure are you using?' page
    And I enter GB123456789000 on the consignee eori tin page
  #Location Of goods
    And I choose radio option Designated location on the arrival location of goods type page
    And I choose radio option Customs office identifier on the arrival location of goods identification page
    And I select GB on the arrival location of goods customs office identification page
  #Add Incident
    And I choose radio option Yes on the add incident page
    And I select France on the In which country did the incident happen page
  #Incident Code
    And I choose radio option 2 - The seals on the incident code page
    And I enter Test Incident Happened text on the incident description page
  #Endorsement
    And I choose radio option No on the add endorsement page
  #Incident Identify Location
    And I choose radio option Coordinates on the incident identify location page
    And I enter 50.96622 and 50.96622 on the incident coordinates page
  #Add Container
    And I choose radio option Yes on the add container identification number page
    And I enter C001 on the container identification number page
  #Add Seal
    And I enter S001 on the seal identification number page
    And I choose radio option No on the Arrivals 'You have added 1 seal' page
  #Add Goods Item
    And I choose radio option No on the Do you want to add a goods item number page
    And I submit on the Check your answers section Transport equipment page
  #Add Transport Equipment
    When I choose radio option No on the You have added 1 transport equipment page
    And I submit on the Check your answers section Incidents page
  #Add Another Incident
    And I choose radio option No on the You have added 1 incident page
  #Summary CYA page
    And I submit on the Check your answers section Arrivals page
  #Confirmation
    And I click the Make another arrival notification link on the Arrival notification sent page
    And I should be on the What is the Movement Reference Number page
    And I sign out


  Scenario: 06 - Simplified - Add Authorisation 'Yes' x2 - Goods Location Id  'Address' - Add contact 'No' - Add Incident 'Yes'- Incident Code '3' -
  Add Endorsement 'No' - (Container Id 'Yes' - Add Seal 'Yes' - Add Goods 'Yes') x2 - Add Another Incident 'Yes' -
  Remove 'Authorisation, Seal, Goods, Equipment & Incident'
  #Identification
    When I select XI on the arrival office of destination page
    And I choose radio option Simplified on the 'What type of procedure are you using?' page
    And I enter GB123456789000 on the consignee eori tin page
    And I enter 1200014210026352 on the authorisations reference number page
    And I enter 12345 on the arrival location of goods authorisation number page
    And I choose radio option Yes on the arrival location of goods add contact page
    And I enter John on the arrival location of goods contact page
    And I enter +44 2345 82 83 on the arrival location of goods contact number page
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
    And I enter DEAAL on the incident un locode page
  #Add Container Indicator
    When I choose radio option Yes on the container indicator page
    And I enter C001 on the container identification number page
  #Add Container Seal
    And I choose radio option Yes on the add seals page
    And I enter S001 on the seal identification number page
  #Add Another Container Seal
    When I choose radio option Yes on the Arrivals 'You have added 1 seal' page
    And I enter S002 on the seal identification number page
  #Remove A Container Seal
    When I click the Remove link on the add another container seal page
    And I click radio option Yes for container seal identification number S001 on the remove seal page
    When I choose radio option No on the Arrivals 'You have added 1 seal' page
  #Add Goods Item
    When I choose radio option Yes on the Do you want to add a goods item number page
    And I enter 1 on the What is the goods item number page
  #Add Another Goods Item
    When I choose radio option Yes on the You have added 1 goods item number page
    And I enter 2 on the What is the goods item number page
    And I choose radio option No on the You have added 2 goods item numbers page
    And I submit on the Check your answers section Transport equipment page
  #Add Transport Equipment
    When I choose radio option Yes on the You have added 1 transport equipment page
  #Add Container Indicator - 2nd transport equipment iteration
    And I enter C002 on the container identification number page
  #Add Container Seal
    And I choose radio option Yes on the add seals page
    And I enter S003 on the seal identification number page
  #Add Another Container Seal
    When I choose radio option Yes on the Arrivals 'You have added 1 seal' page
    And I enter S004 on the seal identification number page
    When I choose radio option No on the Arrivals 'You have added 2 seals' page
  #Add Goods Item
    And I choose radio option Yes on the Do you want to add a goods item number page
    And I enter 3 on the What is the goods item number page
  #Add Another Goods Item
    And I choose radio option Yes on the You have added 1 goods item number page
    And I enter 4 on the What is the goods item number page

  #Remove Goods Item
    When I click the Remove link on the You have added 2 goods item numbers page
    And I click radio option Yes on the Are you sure you want to remove goods item number 3 page
    And I choose radio option No on the You have added 1 goods item number page
    And I submit on the Check your answers section Transport equipment page

  #Remove Transport Equipment
    When I click the Remove link on the You have added 2 transport equipment page
    And I click radio option Yes on the Are you sure you want to remove transport equipment 1 page
    And I choose radio option No on the You have added 1 transport equipment page
  #Type of Identification 1
    And I choose radio option Name of a sea-going vessel on the Which identification do you want to use for the replacement means of transport page
    And I enter Titanic on the What is the identification number for this page
    And I select France on the What country is the replacement transport registered to page
    And I submit on the Check your answers section Incidents page
  #Add Another Incident
    And I choose radio option Yes on the You have added 1 incident page
  #Add Incident - 2nd iteration
    And I select Italy on the In which country did the incident happen page
  #Incident Code - Second Incident
    And I choose radio option 3 - The goods on the incident code page
    And I enter The ship sank on the incident description page
  #Endorsement - Second Incident
    And I choose radio option No on the add endorsement page
  #Incident Identify Location - Second Incident
    And I choose radio option UN/LOCODE on the incident identify location page
    And I enter DEAAL on the incident un locode page
  #Add Container Indicator - Second Incident
    And I choose radio option No on the container indicator page
  #Add Transport Equipment - Second Incident
    And I choose radio option No on the add transport equipment page
  #Type of Identification - Second Incident
    And I choose radio option Name of a sea-going vessel on the Which identification do you want to use for the replacement means of transport page
    And I enter Bismarck on the What is the identification number for this page
    And I select Argentina on the What country is the replacement transport registered to page
    And I submit on the Check your answers section Incidents page

  #Remove an incident
    When I click the Remove link on the You have added 2 incidents page
    And I click radio option Yes on the Are you sure you want to remove incident 1 page
    And I choose radio option No on the You have added 1 incident page
  #Summary CYA page
    And I submit on the Check your answers section Arrivals page
  #Confirmation
    And I should be on the Arrival notification sent page
    And I sign out


  Scenario: 07 - Simplified - Goods Location Id  'Address' - Add Contact 'No' - Add Incident 'Yes'- Incident Code '4' -
  Add Endorsement 'No' - Incident Location 'UN/LOCODE' - Container Id 'Yes' - Add Seal 'Yes' x2 - Add Goods Item 'No' -
  Add Transport Equipment 'No' - Add Another Incident 'No'
  # Identification
    When I select XI on the arrival office of destination page
    And I choose radio option Simplified on the 'What type of procedure are you using?' page
    And I enter GB123456789000 on the consignee eori tin page
    And I enter 1200014210026352 on the authorisations reference number page
    And I enter 12345 on the arrival location of goods authorisation number page
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
    And I enter DEAAL on the incident un locode page
  #Container Identification Number
    And I choose radio option Yes on the add container identification number page
    And I enter C001 on the container identification number page
  #Add Container Seal
    And I choose radio option Yes on the add seals page
    And I enter S001 on the seal identification number page
  #Add Another Container Seal
    When I choose radio option Yes on the Arrivals 'You have added 1 seal' page
    And I enter S002 on the seal identification number page
    When I choose radio option No on the Arrivals 'You have added 2 seals' page
  #Add Goods Item
    And I choose radio option Yes on the Do you want to add a goods item number page
    And I enter 1 on the What is the goods item number page
    And I choose radio option No on the You have added 1 goods item number page
    And I submit on the Check your answers section Transport equipment page
    And I choose radio option No on the You have added 1 transport equipment page
    And I submit on the Check your answers section Incidents page
  #Add Another Incident
    And I choose radio option No on the You have added 1 incident page
  #Summary CYA page
    And I submit on the Check your answers section Arrivals page
  #Confirmation
    And I click the Check the status of arrival notifications link on the Arrival notification sent page
    And I should be on the 'Arrival notifications' page
    And I sign out


  Scenario: 08 - Simplified - Goods Location Id  'EORI Number' - Add additional Id 'Yes' - Add Contact 'Yes' -
  Add Incident 'Yes'- Incident Code '5' - Add Endorsement 'Yes' - Incident Location 'Address' - Add Another Incident 'No'
  #Identification
    When I select GB on the arrival office of destination page
    And I choose radio option Simplified on the 'What type of procedure are you using?' page
    And I enter GB123456789000 on the consignee eori tin page
    And I enter 1200014210026352 on the authorisations reference number page
    And I enter 12345 on the arrival location of goods authorisation number page
    And I choose radio option Yes on the arrival location of goods add contact page
    And I enter John on the arrival location of goods contact page
    And I enter +44 2345 82 83 on the arrival location of goods contact number page
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
    And I submit on the Check your answers section Incidents page
  #Add Another Incident
    And I choose radio option No on the You have added 1 incident page
  #Summary CYA page
    And I submit on the Check your answers section Arrivals page
  #Confirmation
    And I click the Make another arrival notification link on the Arrival notification sent page
    And I should be on the What is the Movement Reference Number page
    And I sign out


  Scenario: 09 - Normal - Goods Location Id  'Coordinates' - Add Incident 'Yes' - Incident code '6' -
  Endorsement 'No' - Incident Location 'Address' - Add Another Incident 'No'
  # Identification
    When I select GB on the arrival office of destination page
    And I choose radio option Normal on the 'What type of procedure are you using?' page
    And I enter GB123456789000 on the consignee eori tin page
  #Location Of goods
    And I choose radio option Approved place on the arrival location of goods type page
    And I choose radio option Coordinates on the arrival location of goods identification page
    And I enter 50.96622 and 50.96622 on the arrival location of goods coordinates page
    And I choose radio option No on the arrival location of goods add contact page
  #Add Incident
    And I choose radio option Yes on the add incident page
    And I select France on the In which country did the incident happen page
  #Incident Code
    And I choose radio option 6 - The means on the incident code page
    And I enter Test Incident Happened text on the incident description page
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
    And I choose radio option No on the Arrivals 'You have added 1 seal' page
  #Add Goods Item
    And I choose radio option No on the Do you want to add a goods item number page
    And I submit on the Check your answers section Transport equipment page
  #Add Transport Equipment
    And I choose radio option No on the You have added 1 transport equipment page
 #Type of Identification
    And I choose radio option Name of a sea-going vessel on the Which identification do you want to use for the replacement means of transport page
    And I enter Bismarck on the What is the identification number for this page
    And I select Argentina on the What country is the replacement transport registered to page
    And I submit on the Check your answers section Incidents page
  #Add Another Incident
    And I choose radio option No on the You have added 1 incident page
  #Summary CYA page
    And I submit on the Check your answers section Arrivals page
  #Confirmation
    And I should be on the Arrival notification sent page
    And I sign out

  Scenario: 10 - Normal - Goods id location 'UN/LOCODE' - Add Contact 'No' - Add Incident 'No'
  # Identification
    When I select XI on the arrival office of destination page
    And I choose radio option Normal on the 'What type of procedure are you using?' page
    And I enter GB123456789000 on the consignee eori tin page
  #Location Of goods
    And I choose radio option Other on the arrival location of goods type page
    And I choose radio option UN/LOCODE on the arrival location of goods identification page
    And I enter DEAAL on the arrival location of goods customs un locode page
    And I choose radio option No on the arrival location of goods add contact page
  #Add Incident
    And I choose radio option No on the add incident page
  #Summary CYA page
    And I submit on the Check your answers section Arrivals page
 #Confirmation
    And I should be on the Arrival notification sent page
    And I sign out