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

    Given User clicks on the discounts button at home page
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
    Given User clicks on the discounts button at home page
    Given User clicks on the pharmacy button at home page
    And User searches for the desired vendor "Golden Falcon Pharmacy"
    When User clicks on the desired vendor "Golden Falcon Pharmacy"
    And User clicks on the first offer available
    When User enters an invalid merchant pin with spaces
    And User clicks on verify button after signup
    Then User should see error invalid merchant pin


  @Discountstest @Discountstest03
  Scenario: User clicks on Travel Agency at Centiv Card and enters merchant pin with special characters

    Given User clicks on the discounts button at home page
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
    Given User clicks on the discounts button at home page
    And User clicks on Travel Agency button at home page
    And User searches for the desired vendor "Flymode Travel & Tourism"
    When User clicks on the desired vendor "Flymode Travel & Tourism"
    And User clicks on the first offer available
    When User leaves merchant pin empty
    And User clicks on verify button after signup
    Then User should see error invalid merchant pin


  @Discountstest @Discountstest05
  Scenario: User clicks on Cafeteria at Centiv card and enters six digits merchant pin

    Given User clicks on the discounts button at home page
    Given User clicks on the cafeteria button at home page
    And User searches for the desired vendor "Chaya Kada Cafeteria"
    When User clicks on the desired vendor "Chaya Kada Cafeteria"
    And User clicks on the first offer available
    When User enters an invalid six digit merchant pin
    And User clicks on verify button after signup
    Then User should see error invalid merchant pin


  @Discountstest @Discountstest06
  Scenario: User clicks on Cafeteria at Payd card and enters six digits merchant pin

    Given User scrolls to the right
    Given User clicks on the discounts button at home page
    And User clicks on the cafeteria button at home page
    And User searches for the desired vendor "Chaya Kada Cafeteria"
    When User clicks on the desired vendor "Chaya Kada Cafeteria"
    And User clicks on the first offer available
    When User enters an invalid six digit merchant pin
    And User clicks on verify button after signup
    Then User should see error invalid merchant pin


  @Discountstest @Discountstest07
  Scenario: Successful Discount Flow at UAT from Centiv Card

    Given User clicks on the discounts button at home page
    #The step below is not dynamic
    When User scrolls down to category "Personal Care"
    And User selects category "Personal Care"
    When User selects their sub-category "Gym"
    And User searches for the desired vendor "Mr & Mrs Fitness"
    When User clicks on the desired vendor "Mr & Mrs Fitness"
    And User scrolls down
    And User clicks on the desired deal
    When User enters a valid six digit merchant pin for UAT
    And User clicks on verify button after signup
    When User enters the amount they want
    And User clicks on the submit button
    And User clicks I agree terms and conditions box
    And User clicks on redeem button
    Then User should see successfully avail the offer



  @Discountstest @Discountstest08
  Scenario: Successful Discount Flow at UAT from PAYD Card

    Given User scrolls to the right
    And User clicks on the discounts button at home page
    When User scrolls down to category "Personal Care"
    And User selects category "Personal Care"
    When User selects their sub-category "Gym"
    And User searches for the desired vendor "Mr and Mrs Fitness"
    When User clicks on the desired vendor "Mr and Mrs Fitness"
    And User scrolls down
    And User clicks on the second offer available
    When User enters a valid six digit merchant pin for UAT
    And User clicks on verify button after signup
    When User enters the amount they want
    And User clicks on the submit button
    And User clicks I agree terms and conditions box
    And User clicks on redeem button
    Then User should see successfully avail the offer


