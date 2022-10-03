@arrival @ZAP

Feature: Arrival notification feature

  Background:
    Given I login with ID 1234567
    Then I am on the Manage Transit Movements Hub service
    Given I click on the Make an arrival notification link

#[CTCP-687] : Web : Arrivals IE007 : Identification : DDNTA 5.15 V1.00
#[CTCP-697] : Web : Arrivals IE007 : Location of goods : DDNTA 5.15 V1.00
#[CTCP-698] :
  Scenario: 01
    When I enter G20GB00006010025496 on the movement reference number page
    And I enter Day Month Year on the Arrival Date page
    And I choose radio option No on the simplified Procedure page
    And I input a random number on the Identification Number page
    And I submit on the CYA page
# Location of Goods [ Type of location ]
    And I chose radio option Authorised place – the authorised consignor’s own premises on the type of location page
# Location of Goods [ Identification ]
    And I chose radio option Customs office identifier on the type of location page
# Location of Goods [ Customs office Identification]
    And I enter GB005010 on the location of goods page
    And I choose radio option No on the IncidentFlag page
    And I select United Kingdom on the country is the place of incident in page
    And I enter 1 - The carrier is obliged to deviate from the itinerary prescribed in accordance with Article 298 of UCC/IA Regulation due to circumstances beyond his control on the incident code for the place of incident page
    And I input a random text on the Description of the incident page
# Add an Endorsement
    And I choose radio option Yes on the add an endorsement page
    And I enter Day Month Year on the Endorsement Date page
    And I input a random text on the authority of endorsement page
    And I input a random text on the endorsement place page
    And I select United Kingdom on the country is the place of endorsement in page

  Scenario: 02

    And I enter G20GB00006010025496 on the MovementReferenceNumber page
    And I enter Day Month Year on the Arrival Date page
    And I choose radio option Yes on the Simplified Procedure page
    And I choose radio option Option 1 on the Authorisation Type
    And I input a random number on the Authorisation Reference Number page
    And I submit on the CYA page
    And I click on the Add or remove authorisations link
    And I choose radio option No on the Add another authorisation page
    And I submit on the CYA page
    And I click on the Add or remove authorisations link
    And I choose radio option Yes on the Add another authorisation page
    And I choose radio option Option 2 on the Authorisation Type
    And I input a random number on the Authorisation Reference Number page
    And I submit on the CYA page
    And I choose radio option No on the Add another authorisation page
    And I submit on the CYA page
    And I chose radio option Authorised place – the authorised consignor’s own premises on the type of locaiton page
    And I choose radio option Yes on the IncidentFlag page

  Scenario: 03

    And I enter G20GB00006010025496 on the MovementReferenceNumber page
    And I enter Day Month Year on the Arrival Date page
    And I choose radio option Yes on the Simplified Procedure page
    And I choose radio option Option 1 on the Authorisation Type
    And I input a random number on the Authorisation Reference Number page
    And I submit on the CYA page
    And I click on the Add or remove authorisations link
    And I choose radion option No on the Add another authorisation page
    And I submit on the CYA page
    And I click on the Add or remove authorisations link
    And I choose radio option Yes on the Add another authorisation page
    And I choose radio option Option 2 on the Authorisation Type
    And I input a random number on the Authorisation Reference Number page
    And I submit on the CYA page
    And I choose radio option No on the Add another authorisation page
    And I submit on the CYA page
    And I chose radio option Authorised place – the authorised consignor’s own premises on the type of location page
    And I choose radio option No on the IncidentFlag page

  Scenario: 04

    And I enter G20GB00006010025496 on the MovementReferenceNumber page
    And I enter Day Month Year on the Arrival Date page
    And I choose radio option Yes on the Simplified Procedure page
    And I choose radio option Option 1 on the Authorisation Type
    And I input a random number on the Authorisation Reference Number page
    And I submit on the CYA page
    And I choose radio option No on the Add another authorisation page
    And I submit on the CYA page
    And I input a random number on the Identification Number page
    And I submit on the CYA page
    And I chose radio option Authorised place – the authorised consignor’s own premises on the type of location page
    And I chose radio option Customs office identifier on the type of location page
    And I enter GB005010 on the location of goods page
    And I enter the