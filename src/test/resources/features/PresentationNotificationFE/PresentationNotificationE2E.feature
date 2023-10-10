@presentation

Feature: End to end journey for Presentation Notification frontend

  Scenario: 01 Trader completes a departure declaration that was previously pre-lodged

    Given I login with ID 1234567890
    When I submit an IE015 Pre-lodged Departure Declaration
    Then I submit an IE928 Positive Acknowledgment
    And I refresh the page
    And I click on the View departure declarations link on the 'Manage your transit movements' page
    And I click on the Complete declaration link for LRN 38VYQTYFU3T0KUTUM3 on the 'Departure declarations' page

#    3844 Landing Page - More information needed (when required fields in IE170 are MISSING in IE015/IE013)
    And I click the Continue button on the 'More information needed to complete declaration' page

#    3929 Landing Page - More information needed (when required fields in IE170 are AVAILABLE in IE015/IE013)
    And I click the Continue button on the 'Confirmation needed to complete declaration' page

      ## Location of goods
#    3845
    And I choose radio option Approved place on the presentation 'Which type of location are the goods in?' page
#    3849
    And I enter FR123123132 on the presentation 'What is the EORI number or Trader Identification Number for the location of goods?' page
#    3848
    And I enter 1234567890 on the presentation 'What is the authorisation number for the location of goods?' page
#    3846
    And I choose radio option GPS coordinates on the presentation 'How do you want to identify the location of goods?' page
#    3847
    And I select GB on the presentation 'What is the customs office identifier for the location of goods?' page
#    3854
    And I enter 50.96622 and 1.86211 on the presentation 'What are the coordinates for the location of goods?' page
#    3855
    And I enter AEFAT on the presentation 'What is the UN LOCODE for the location of goods?' page
#    3856
    And I fill in the address on the presentation 'What is the address for the location of goods?' page
#    3857
    And I select Italy on the presentation 'In which country is the location of goods?' page
#    3858
    And I fill in the post code on the presentation 'What is the address for the location of goods?' page
#    3859
    And I choose radio option Yes on the presentation 'Do you want to add an additional identifier for the location of goods?' page
#    3860
    And I enter x9x9 on the presentation 'What is the additional identifier for the location of goods?' page
#    3861
    And I choose radio option Yes on the presentation 'Do you want to add a contact for the location of goods?' page
#    3862
    And I enter Locator Joe on the presentation 'Who is the contact for the location of goods?' page
#    3864
    And I enter +432 1212 1212 on the presentation 'What is the phone number for the location of goods’ contact?' page
#    3887
    And I choose radio option Yes on the presentation 'Do you want to add the arrival date at the office of destination?' page

