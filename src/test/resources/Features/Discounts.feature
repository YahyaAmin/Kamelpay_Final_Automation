@Discountsfeature
Feature: Discounts Tests

#User login steps in background
  Background:
    Given User is on Login Page
    And User clicks on skip button
    When User enters correct phone number
    And User enters correct password
    And User clicks on login button
    And User clicks on dont allow biometric button
    Then User should successfully login


  @Discountstest @Discountstest01
  Scenario: User clicks on Pharmacy at Centiv Card and enters six digits merchant pin

    Given User clicks on the pharmacy button at home page
    And User searches for the desired vendor "Golden Falcon Pharmacy"
    When User clicks on the desired vendor "Golden Falcon Pharmacy"
    And User clicks on the first offer available
    When User enters an invalid six digit merchant pin
    And User clicks on verify button after signup
    Then User should see error invalid merchant pin


  @Discountstest @Discountstest02
  Scenario: User clicks on Pharmacy at Payd Card and enters merchant pin with spaces

    Given User scrolls to the right
    Given User clicks on the pharmacy button at home page
    And User searches for the desired vendor "Golden Falcon Pharmacy"
    When User clicks on the desired vendor "Golden Falcon Pharmacy"
    And User clicks on the first offer available
    When User enters an invalid merchant pin with spaces
    And User clicks on verify button after signup
    Then User should see error invalid merchant pin


  @Discountstest @Discountstest03
  Scenario: User clicks on Travel Agency at Centiv Card and enters merchant pin with special characters

    Given User clicks on Travel Agency button at home page
    And User searches for the desired vendor "Flymode Travel & Tourism"
    When User clicks on the desired vendor "Flymode Travel & Tourism"
    And User clicks on the first offer available
    When User enters an invalid merchant pin with special characters
    And User clicks on verify button after signup
    Then User should see error invalid merchant pin


  @Discountstest @Discountstest04
  Scenario: User clicks on Travel Agency at PAYD Card and leaves merchant pin empty

    Given User scrolls to the right
    And User clicks on Travel Agency button at home page
    And User searches for the desired vendor "Flymode Travel & Tourism"
    When User clicks on the desired vendor "Flymode Travel & Tourism"
    And User clicks on the first offer available
    When User leaves merchant pin empty
    And User clicks on verify button after signup
    Then User should see error invalid merchant pin