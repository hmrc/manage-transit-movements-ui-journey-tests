@arrivalE2e

Feature: End to end journey Arrival notification feature

  Background:
    Given I login with ID 12345678
    Then I am on the Manage Transit Movements Hub service
    Given I click on the Make an arrival notification link
    When I enter 21GB00014210026352 on the movement reference number page


  Scenario: 01 - GB - Normal - Postal Code - Incident Flag 'Yes' - Incident code (1) - Endorsement 'No'
  #Identification
    When I select GB on the arrival office of destination page
    And I enter GB123456789000 on the consignee eori tin page
    And I choose radio option Normal on the procedure type page
  #Location Of goods
    And I choose radio option Authorised place on the arrival location of goods type page
    And I choose radio option Postal code on the arrival location of goods identification page
    And I fill in address on the arrival location of goods postal code page
    And I choose radio option No on the arrival location of goods add contact page
  #Add Incident
    And I choose radio option Yes on the add incident page
    And I select France on the incident country page
  #Incident Code
    And I choose radio option 1 - The carrier on the incident code page
    And I enter Test Incident Happened text on the incident description page
  #Endorsement
    And I choose radio option No on the add endorsement page
  #Incident Identify Location
    And I choose radio option UN/LOCODE on the incident identify location page
    And I select Aalen on the incident un locode page
    And I submit on the CYA page


  @a11y
  Scenario: 02 - XI - Simplified - ACT Authorisations - Goods Identification Location 'EORI id' - Add additional identifier 'Yes' - Add Contact 'Yes' - Incident Code '4' - Add Endorsement 'Yes'
  #Identification
    And I select XI on the arrival office of destination page
    And I enter GB123456789000 on the consignee eori tin page
    And I choose radio option Simplified on the procedure type page
    And I choose radio option ACT on the authorisations type page
    And I enter 1200014210026352 on the ACT authorisations reference number page
    And I submit on the CYA page
    Then I should have 1 authorisation on the authorisations add another page
    When I choose radio option No on the authorisations add another page
  #Location Of goods - Location of goods - X Eori Number
    And I choose radio option Authorised place on the arrival location of goods type page
    And I choose radio option EORI number on the arrival location of goods identification page
    And I enter GB123456789000 on the arrival location of goods eori tin page
  #Add Additional Identifier
    And I choose radio option Yes on the arrival location of goods add additional identifier page
    And I enter 1234 on the arrival location of goods additional identifier page
  #Add Contact
    And I choose radio option Yes on the arrival location of goods add contact page
    And I enter John Joe on the arrival location of goods contact page
    And I enter +44 2345 82 83 on the arrival location of goods contact telephone number page
  #Add Incident
    And I choose radio option Yes on the add incident page
    And I select France on the incident country page
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
    And I enter 12345 on the container identification number page
  #Add Container Seal
    And I choose radio option Yes for container identification number 12345 on the add container seal page
    And I enter 001 for container identification number 12345 on the container seal identification number page
    Then I should have 1 seal container added for container identification number 12345 on the add another container seal page
  #Add Another Container Seal
    When I choose radio option Yes on the add another container seal page
    And I enter 002 for container identification number 12345 on the container seal identification number page
    Then I should have 2 seals container added for container identification number 12345 on the add another container seal page
    When I choose radio option Yes on the add another container seal page
    And I enter 003 for container identification number 12345 on the container seal identification number page
    Then I should have 3 seals container added for container identification number 12345 on the add another container seal page
    When I choose radio option Yes on the add another container seal page
    And I enter 004 for container identification number 12345 on the container seal identification number page
    Then I should have 4 seals container added for container identification number 12345 on the add another container seal page
    When I choose radio option Yes on the add another container seal page
    And I enter 005 for container identification number 12345 on the container seal identification number page
    Then I should have 5 seals container added for container identification number 12345 on the add another container seal page
    When I choose radio option Yes on the add another container seal page
    And I enter 006 for container identification number 12345 on the container seal identification number page
    Then I should have 6 seals container added for container identification number 12345 on the add another container seal page
    When I choose radio option Yes on the add another container seal page
    And I enter 007 for container identification number 12345 on the container seal identification number page
    Then I should have 7 seals container added for container identification number 12345 on the add another container seal page
    When I choose radio option Yes on the add another container seal page
    And I enter 008 for container identification number 12345 on the container seal identification number page
    Then I should have 8 seals container added for container identification number 12345 on the add another container seal page
    When I choose radio option Yes on the add another container seal page
    And I enter 009 for container identification number 12345 on the container seal identification number page
    Then I should have 9 seals container added for container identification number 12345 on the add another container seal page
    When I choose radio option Yes on the add another container seal page
    And I enter 010 for container identification number 12345 on the container seal identification number page
    Then I should have 10 seals container added for container identification number 12345 on the add another container seal page
    When I choose radio option Yes on the add another container seal page
    And I enter 011 for container identification number 12345 on the container seal identification number page
    Then I should have 11 seal container added for container identification number 12345 on the add another container seal page
    When I choose radio option Yes on the add another container seal page
    And I enter 012 for container identification number 12345 on the container seal identification number page
    Then I should have 12 seals container added for container identification number 12345 on the add another container seal page
    When I choose radio option Yes on the add another container seal page
    And I enter 013 for container identification number 12345 on the container seal identification number page
    Then I should have 13 seals container added for container identification number 12345 on the add another container seal page
    When I choose radio option Yes on the add another container seal page
    And I enter 014 for container identification number 12345 on the container seal identification number page
    Then I should have 14 seals container added for container identification number 12345 on the add another container seal page
    When I choose radio option Yes on the add another container seal page
    And I enter 015 for container identification number 12345 on the container seal identification number page
    Then I should have 15 seals container added for container identification number 12345 on the add another container seal page
    When I choose radio option Yes on the add another container seal page
    And I enter 016 for container identification number 12345 on the container seal identification number page
    Then I should have 16 seals container added for container identification number 12345 on the add another container seal page
    When I choose radio option Yes on the add another container seal page
    And I enter 017 for container identification number 12345 on the container seal identification number page
    Then I should have 17 seals container added for container identification number 12345 on the add another container seal page
    When I choose radio option Yes on the add another container seal page
    And I enter 018 for container identification number 12345 on the container seal identification number page
    Then I should have 18 seals container added for container identification number 12345 on the add another container seal page
    When I choose radio option Yes on the add another container seal page
    And I enter 019 for container identification number 12345 on the container seal identification number page
    Then I should have 19 seals container added for container identification number 12345 on the add another container seal page
    When I choose radio option Yes on the add another container seal page
    And I enter 020 for container identification number 12345 on the container seal identification number page
    Then I should have 20 seals container added for container identification number 12345 on the add another container seal page
    When I choose radio option Yes on the add another container seal page
    And I enter 021 for container identification number 12345 on the container seal identification number page
    Then I should have 21 seal container added for container identification number 12345 on the add another container seal page
    When I choose radio option Yes on the add another container seal page
    And I enter 022 for container identification number 12345 on the container seal identification number page
    Then I should have 22 seals container added for container identification number 12345 on the add another container seal page
    When I choose radio option Yes on the add another container seal page
    And I enter 023 for container identification number 12345 on the container seal identification number page
    Then I should have 23 seals container added for container identification number 12345 on the add another container seal page
    When I choose radio option Yes on the add another container seal page
    And I enter 024 for container identification number 12345 on the container seal identification number page
    Then I should have 24 seals container added for container identification number 12345 on the add another container seal page
    When I choose radio option Yes on the add another container seal page
    And I enter 025 for container identification number 12345 on the container seal identification number page
    Then I should have 25 seals container added for container identification number 12345 on the add another container seal page
    When I choose radio option Yes on the add another container seal page
    And I enter 026 for container identification number 12345 on the container seal identification number page
    Then I should have 26 seals container added for container identification number 12345 on the add another container seal page
    When I choose radio option Yes on the add another container seal page
    And I enter 027 for container identification number 12345 on the container seal identification number page
    Then I should have 27 seals container added for container identification number 12345 on the add another container seal page
    When I choose radio option Yes on the add another container seal page
    And I enter 028 for container identification number 12345 on the container seal identification number page
    Then I should have 28 seals container added for container identification number 12345 on the add another container seal page
    When I choose radio option Yes on the add another container seal page
    And I enter 029 for container identification number 12345 on the container seal identification number page
    Then I should have 29 seals container added for container identification number 12345 on the add another container seal page
    When I choose radio option Yes on the add another container seal page
    And I enter 030 for container identification number 12345 on the container seal identification number page
    Then I should have 30 seals container added for container identification number 12345 on the add another container seal page
    When I choose radio option Yes on the add another container seal page
    And I enter 031 for container identification number 12345 on the container seal identification number page
    Then I should have 31 seal container added for container identification number 12345 on the add another container seal page
    When I choose radio option Yes on the add another container seal page
    And I enter 032 for container identification number 12345 on the container seal identification number page
    Then I should have 32 seals container added for container identification number 12345 on the add another container seal page
    When I choose radio option Yes on the add another container seal page
    And I enter 033 for container identification number 12345 on the container seal identification number page
    Then I should have 33 seals container added for container identification number 12345 on the add another container seal page
    When I choose radio option Yes on the add another container seal page
    And I enter 034 for container identification number 12345 on the container seal identification number page
    Then I should have 34 seals container added for container identification number 12345 on the add another container seal page
    When I choose radio option Yes on the add another container seal page
    And I enter 035 for container identification number 12345 on the container seal identification number page
    Then I should have 35 seals container added for container identification number 12345 on the add another container seal page
    When I choose radio option Yes on the add another container seal page
    And I enter 036 for container identification number 12345 on the container seal identification number page
    Then I should have 36 seals container added for container identification number 12345 on the add another container seal page
    When I choose radio option Yes on the add another container seal page
    And I enter 037 for container identification number 12345 on the container seal identification number page
    Then I should have 37 seals container added for container identification number 12345 on the add another container seal page
    When I choose radio option Yes on the add another container seal page
    And I enter 038 for container identification number 12345 on the container seal identification number page
    Then I should have 38 seals container added for container identification number 12345 on the add another container seal page
    When I choose radio option Yes on the add another container seal page
    And I enter 039 for container identification number 12345 on the container seal identification number page
    Then I should have 39 seals container added for container identification number 12345 on the add another container seal page
    When I choose radio option Yes on the add another container seal page
    And I enter 040 for container identification number 12345 on the container seal identification number page
    Then I should have 40 seals container added for container identification number 12345 on the add another container seal page
    When I choose radio option Yes on the add another container seal page
    And I enter 041 for container identification number 12345 on the container seal identification number page
    Then I should have 41 seal container added for container identification number 12345 on the add another container seal page
    When I choose radio option Yes on the add another container seal page
    And I enter 042 for container identification number 12345 on the container seal identification number page
    Then I should have 42 seals container added for container identification number 12345 on the add another container seal page
    When I choose radio option Yes on the add another container seal page
    And I enter 043 for container identification number 12345 on the container seal identification number page
    Then I should have 43 seals container added for container identification number 12345 on the add another container seal page
    When I choose radio option Yes on the add another container seal page
    And I enter 044 for container identification number 12345 on the container seal identification number page
    Then I should have 44 seals container added for container identification number 12345 on the add another container seal page
    When I choose radio option Yes on the add another container seal page
    And I enter 045 for container identification number 12345 on the container seal identification number page
    Then I should have 45 seals container added for container identification number 12345 on the add another container seal page
    When I choose radio option Yes on the add another container seal page
    And I enter 046 for container identification number 12345 on the container seal identification number page
    Then I should have 46 seals container added for container identification number 12345 on the add another container seal page
    When I choose radio option Yes on the add another container seal page
    And I enter 047 for container identification number 12345 on the container seal identification number page
    Then I should have 47 seals container added for container identification number 12345 on the add another container seal page
    When I choose radio option Yes on the add another container seal page
    And I enter 048 for container identification number 12345 on the container seal identification number page
    Then I should have 48 seals container added for container identification number 12345 on the add another container seal page
    When I choose radio option Yes on the add another container seal page
    And I enter 049 for container identification number 12345 on the container seal identification number page
    Then I should have 49 seals container added for container identification number 12345 on the add another container seal page
    When I choose radio option Yes on the add another container seal page
    And I enter 050 for container identification number 12345 on the container seal identification number page
    Then I should have 50 seals container added for container identification number 12345 on the add another container seal page
    When I choose radio option Yes on the add another container seal page
    And I enter 051 for container identification number 12345 on the container seal identification number page
    Then I should have 51 seal container added for container identification number 12345 on the add another container seal page
    When I choose radio option Yes on the add another container seal page
    And I enter 052 for container identification number 12345 on the container seal identification number page
    Then I should have 52 seals container added for container identification number 12345 on the add another container seal page
    When I choose radio option Yes on the add another container seal page
    And I enter 053 for container identification number 12345 on the container seal identification number page
    Then I should have 53 seals container added for container identification number 12345 on the add another container seal page
    When I choose radio option Yes on the add another container seal page
    And I enter 054 for container identification number 12345 on the container seal identification number page
    Then I should have 54 seals container added for container identification number 12345 on the add another container seal page
    When I choose radio option Yes on the add another container seal page
    And I enter 055 for container identification number 12345 on the container seal identification number page
    Then I should have 55 seals container added for container identification number 12345 on the add another container seal page
    When I choose radio option Yes on the add another container seal page
    And I enter 056 for container identification number 12345 on the container seal identification number page
    Then I should have 56 seals container added for container identification number 12345 on the add another container seal page
    When I choose radio option Yes on the add another container seal page
    And I enter 057 for container identification number 12345 on the container seal identification number page
    Then I should have 57 seals container added for container identification number 12345 on the add another container seal page
    When I choose radio option Yes on the add another container seal page
    And I enter 058 for container identification number 12345 on the container seal identification number page
    Then I should have 58 seals container added for container identification number 12345 on the add another container seal page
    When I choose radio option Yes on the add another container seal page
    And I enter 059 for container identification number 12345 on the container seal identification number page
    Then I should have 59 seals container added for container identification number 12345 on the add another container seal page
    When I choose radio option Yes on the add another container seal page
    And I enter 060 for container identification number 12345 on the container seal identification number page
    Then I should have 60 seals container added for container identification number 12345 on the add another container seal page
    When I choose radio option Yes on the add another container seal page
    And I enter 061 for container identification number 12345 on the container seal identification number page
    Then I should have 61 seal container added for container identification number 12345 on the add another container seal page
    When I choose radio option Yes on the add another container seal page
    And I enter 062 for container identification number 12345 on the container seal identification number page
    Then I should have 62 seals container added for container identification number 12345 on the add another container seal page
    When I choose radio option Yes on the add another container seal page
    And I enter 063 for container identification number 12345 on the container seal identification number page
    Then I should have 63 seals container added for container identification number 12345 on the add another container seal page
    When I choose radio option Yes on the add another container seal page
    And I enter 064 for container identification number 12345 on the container seal identification number page
    Then I should have 64 seals container added for container identification number 12345 on the add another container seal page
    When I choose radio option Yes on the add another container seal page
    And I enter 065 for container identification number 12345 on the container seal identification number page
    Then I should have 65 seals container added for container identification number 12345 on the add another container seal page
    When I choose radio option Yes on the add another container seal page
    And I enter 066 for container identification number 12345 on the container seal identification number page
    Then I should have 66 seals container added for container identification number 12345 on the add another container seal page
    When I choose radio option Yes on the add another container seal page
    And I enter 067 for container identification number 12345 on the container seal identification number page
    Then I should have 67 seals container added for container identification number 12345 on the add another container seal page
    When I choose radio option Yes on the add another container seal page
    And I enter 068 for container identification number 12345 on the container seal identification number page
    Then I should have 68 seals container added for container identification number 12345 on the add another container seal page
    When I choose radio option Yes on the add another container seal page
    And I enter 069 for container identification number 12345 on the container seal identification number page
    Then I should have 69 seals container added for container identification number 12345 on the add another container seal page
    When I choose radio option Yes on the add another container seal page
    And I enter 070 for container identification number 12345 on the container seal identification number page
    Then I should have 70 seals container added for container identification number 12345 on the add another container seal page
    When I choose radio option Yes on the add another container seal page
    And I enter 071 for container identification number 12345 on the container seal identification number page
    Then I should have 71 seal container added for container identification number 12345 on the add another container seal page
    When I choose radio option Yes on the add another container seal page
    And I enter 072 for container identification number 12345 on the container seal identification number page
    Then I should have 72 seals container added for container identification number 12345 on the add another container seal page
    When I choose radio option Yes on the add another container seal page
    And I enter 073 for container identification number 12345 on the container seal identification number page
    Then I should have 73 seals container added for container identification number 12345 on the add another container seal page
    When I choose radio option Yes on the add another container seal page
    And I enter 074 for container identification number 12345 on the container seal identification number page
    Then I should have 74 seals container added for container identification number 12345 on the add another container seal page
    When I choose radio option Yes on the add another container seal page
    And I enter 075 for container identification number 12345 on the container seal identification number page
    Then I should have 75 seals container added for container identification number 12345 on the add another container seal page
    When I choose radio option Yes on the add another container seal page
    And I enter 076 for container identification number 12345 on the container seal identification number page
    Then I should have 76 seals container added for container identification number 12345 on the add another container seal page
    When I choose radio option Yes on the add another container seal page
    And I enter 077 for container identification number 12345 on the container seal identification number page
    Then I should have 77 seals container added for container identification number 12345 on the add another container seal page
    When I choose radio option Yes on the add another container seal page
    And I enter 078 for container identification number 12345 on the container seal identification number page
    Then I should have 78 seals container added for container identification number 12345 on the add another container seal page
    When I choose radio option Yes on the add another container seal page
    And I enter 079 for container identification number 12345 on the container seal identification number page
    Then I should have 79 seals container added for container identification number 12345 on the add another container seal page
    When I choose radio option Yes on the add another container seal page
    And I enter 080 for container identification number 12345 on the container seal identification number page
    Then I should have 80 seals container added for container identification number 12345 on the add another container seal page
    When I choose radio option Yes on the add another container seal page
    And I enter 081 for container identification number 12345 on the container seal identification number page
    Then I should have 81 seal container added for container identification number 12345 on the add another container seal page
    When I choose radio option Yes on the add another container seal page
    And I enter 082 for container identification number 12345 on the container seal identification number page
    Then I should have 82 seals container added for container identification number 12345 on the add another container seal page
    When I choose radio option Yes on the add another container seal page
    And I enter 083 for container identification number 12345 on the container seal identification number page
    Then I should have 83 seals container added for container identification number 12345 on the add another container seal page
    When I choose radio option Yes on the add another container seal page
    And I enter 084 for container identification number 12345 on the container seal identification number page
    Then I should have 84 seals container added for container identification number 12345 on the add another container seal page
    When I choose radio option Yes on the add another container seal page
    And I enter 085 for container identification number 12345 on the container seal identification number page
    Then I should have 85 seals container added for container identification number 12345 on the add another container seal page
    When I choose radio option Yes on the add another container seal page
    And I enter 086 for container identification number 12345 on the container seal identification number page
    Then I should have 86 seals container added for container identification number 12345 on the add another container seal page
    When I choose radio option Yes on the add another container seal page
    And I enter 087 for container identification number 12345 on the container seal identification number page
    Then I should have 87 seals container added for container identification number 12345 on the add another container seal page
    When I choose radio option Yes on the add another container seal page
    And I enter 088 for container identification number 12345 on the container seal identification number page
    Then I should have 88 seals container added for container identification number 12345 on the add another container seal page
    When I choose radio option Yes on the add another container seal page
    And I enter 089 for container identification number 12345 on the container seal identification number page
    Then I should have 89 seals container added for container identification number 12345 on the add another container seal page
    When I choose radio option Yes on the add another container seal page
    And I enter 090 for container identification number 12345 on the container seal identification number page
    Then I should have 90 seals container added for container identification number 12345 on the add another container seal page
    When I choose radio option Yes on the add another container seal page
    And I enter 091 for container identification number 12345 on the container seal identification number page
    Then I should have 91 seal container added for container identification number 12345 on the add another container seal page
    When I choose radio option Yes on the add another container seal page
    And I enter 092 for container identification number 12345 on the container seal identification number page
    Then I should have 92 seals container added for container identification number 12345 on the add another container seal page
    When I choose radio option Yes on the add another container seal page
    And I enter 093 for container identification number 12345 on the container seal identification number page
    Then I should have 93 seals container added for container identification number 12345 on the add another container seal page
    When I choose radio option Yes on the add another container seal page
    And I enter 094 for container identification number 12345 on the container seal identification number page
    Then I should have 94 seals container added for container identification number 12345 on the add another container seal page
    When I choose radio option Yes on the add another container seal page
    And I enter 095 for container identification number 12345 on the container seal identification number page
    Then I should have 95 seals container added for container identification number 12345 on the add another container seal page
    When I choose radio option Yes on the add another container seal page
    And I enter 096 for container identification number 12345 on the container seal identification number page
    Then I should have 96 seals container added for container identification number 12345 on the add another container seal page
    When I choose radio option Yes on the add another container seal page
    And I enter 097 for container identification number 12345 on the container seal identification number page
    Then I should have 97 seals container added for container identification number 12345 on the add another container seal page
    When I choose radio option Yes on the add another container seal page
    And I enter 098 for container identification number 12345 on the container seal identification number page
    Then I should have 98 seals container added for container identification number 12345 on the add another container seal page
    When I choose radio option Yes on the add another container seal page
    And I enter 099 for container identification number 12345 on the container seal identification number page
    Then I should have 99 seals container added for container identification number 12345 on the add another container seal page


  Scenario: 03 - XI - XI - Normal - Authorisation number - Incident Flag 'Yes' - Incident code (6) - Endorsement 'No'
  #Identification
    When I select XI on the arrival office of destination page
    And I enter GB123456789000 on the consignee eori tin page
    And I choose radio option Normal on the procedure type page
  #Location Of goods
    And I choose radio option Designated location on the arrival location of goods type page
    And I choose radio option Authorisation number on the arrival location of goods identification page
    And I enter 1234567890 on the arrival location of goods authorisation number page
    And I choose radio option No on the arrival location of goods add additional identifier page
    And I choose radio option No on the arrival location of goods add contact page
  #Add Incident
    And I choose radio option Yes on the add incident page
    And I select France on the incident country page
  #Incident code
    And I choose radio option 6 - The means on the incident code page
    And I enter Test Incident Happened text on the incident description page
  #Endorsement
    And I choose radio option No on the add endorsement page
  #Incident Identify Location
    And I choose radio option Coordinates on the incident identify location page
    And I enter 50.96622 and 50.96622 on the incident coordinates page
  #Container Indicator
    And I choose radio option No on the container indicator page
  #Add Transport Equipment
    And I choose radio option Yes on the add transport equipment page
  #Add Container Identification Number
    And I choose radio option Yes on the add container identification number page
    And I enter 12345 on the container identification number page
  #Add Container Seal
    And I choose radio option Yes for container identification number 12345 on the add container seal page
    And I enter 76545 for container identification number 12345 on the container seal identification number page
  #Add Another Container Seal
    Then I should have 1 seal container added for container identification number 12345 on the add another container seal page
    When I choose to click on Remove link on the add another container seal page
    And I choose radio option Yes for container identification number 76545 on the remove seal page
    And I choose radio option Yes for container identification number 12345 on the add container seal page
    And I enter 998877 for container identification number 12345 on the container seal identification number page
    Then I should have 1 seal container added for container identification number 12345 on the add another container seal page
    And I choose radio option No on the add another container seal page
    And I submit on the CYA page