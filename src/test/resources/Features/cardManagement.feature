@CardManagementFeature
Feature: Card Management

  #User login steps in background
  Background:
    Given User is on Login Page
    And User clicks on skip button
    When User enters correct phone number
    And User enters correct password
    And User clicks on login button
    And User clicks on dont allow biometric button
    Then User should successfully login


  @CardManagement @CardManagement01
  Scenario: User checks whether back button is working on card management

    Given User clicks on card management button
    And User clicks on back button at the top left
    Then User should be redirected to home page


  @CardManagement @CardManagement02
  Scenario: User checks whether Whatsapp button is working on card management

    Given User clicks on card management button
    And User clicks on Whatsapp customer support button
    Then User should be redirected to Whatsapp customer support


  @CardManagement @CardManagement05
  Scenario: Check whether user can access card management by clicking the cards on home button

    Given User clicks on Centiv card
    And User clicks on back button at the top left
    When User scrolls to the right
    And User clicks on Payd card
    Then User should move to card management page


  @CardManagement @CardManagement07
  Scenario: User checks whether he can change pin at card management

    Given User clicks on card management button
    When User scrolls down
    And User clicks on change pin button at card management screen
    When User enters valid OTP after card management
    And User clicks on next button at OTP screen
    When User enters a new valid pin for card
    And User enters correct new confirm pin
    When User clicks on next button change pin screen
    Then Card pin should change successfully


  @CardManagement @CardManagement08
  Scenario: User checks change pin at card management but leaves OTP empty

    Given User clicks on card management button
    When User scrolls down
    And User clicks on change pin button at card management screen
    When User leaves OTP empty at card management
    And User clicks on next button at OTP screen
    Then User shouldnt be able to change pin


  @CardManagement @CardManagement09
  Scenario: User checks change pin at card management but enters OTP with less than 6 digits

    Given User clicks on card management button
    When User scrolls down
    And User clicks on change pin button at card management screen
    When User enters OTP less than six digits
    And User clicks on next button at OTP screen
    Then User shouldnt be able to change pin


  @CardManagement @CardManagement10
  Scenario: User checks change pin at card management but enters invalid 6 digit OTP

    Given User clicks on card management button
    When User scrolls down
    And User clicks on change pin button at card management screen
    When User enters invalid OTP
    And User clicks on next button at OTP screen
    Then User shouldnt be able to change pin


  @CardManagement @CardManagement11
  Scenario: User checks change pin at card management but leaves pin empty

    Given User clicks on card management button
    When User scrolls down
    And User clicks on change pin button at card management screen
    When User enters valid OTP after card management
    And User clicks on next button at OTP screen
    And User enters correct new confirm pin
    When User clicks on next button change pin screen
    Then User shouldn't be able to sign in


  @CardManagement @CardManagement12
  Scenario: User checks change pin at card management but confirm leaves pin empty

    Given User clicks on card management button
    When User scrolls down
    And User clicks on change pin button at card management screen
    When User enters valid OTP after card management
    And User clicks on next button at OTP screen
    And User enters their correct pin
    When User clicks on next button change pin screen
    Then User shouldn't be able to sign in


  @CardManagement @CardManagement14
  Scenario: User checks change card pin but pin has less than 4 digits

    Given User clicks on card management button
    When User scrolls down
    And User clicks on change pin button at card management screen
    When User enters valid OTP after card management
    And User clicks on next button at OTP screen
    And User enters their pin with less tha
    When User clicks on next button change pin screen
    Then User shouldn't be able to sign in


