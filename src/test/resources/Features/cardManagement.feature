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
  Scenario: User checks change pin at card management but leaves confirm pin empty

    Given User clicks on card management button
    When User scrolls down
    And User clicks on change pin button at card management screen
    When User enters valid OTP after card management
    And User clicks on next button at OTP screen
    And User enters a new valid pin for card
    When User clicks on next button change pin screen
    Then User shouldn't be able to sign in


  @CardManagement @CardManagement14
  Scenario: User checks change card pin but pin has less than 4 digits

    Given User clicks on card management button
    When User scrolls down
    And User clicks on change pin button at card management screen
    When User enters valid OTP after card management
    And User clicks on next button at OTP screen
    And User enters their pin with less than four digits
    When User enters confirm pin with less than four digits
    When User clicks on next button change pin screen
    Then User shouldn't be able to sign in


  @CardManagement @CardManagement15
  Scenario: User enters a different pin and confirm pin for card

    Given User clicks on card management button
    When User scrolls down
    And User clicks on change pin button at card management screen
    When User enters valid OTP after card management
    And User clicks on next button at OTP screen
    And User enters a new valid pin for card
    When User enters a different confirm pin for card
    When User clicks on next button change pin screen
    Then User shouldn't be able to sign in


  @CardManagement @CardManagement16
  Scenario: User enters card pin but pin has spaces

    Given User clicks on card management button
    When User scrolls down
    And User clicks on change pin button at card management screen
    When User enters valid OTP after card management
    And User clicks on next button at OTP screen
    And User enters a card pin with spaces
    When User enters a confirm pin for card with spaces
    When User clicks on next button change pin screen
    Then User shouldn't be able to sign in


  @CardManagement @CardManagement17
  Scenario: User enters card pin but pin has special characters

    Given User clicks on card management button
    When User scrolls down
    And User clicks on change pin button at card management screen
    When User enters valid OTP after card management
    And User clicks on next button at OTP screen
    And User enters a card pin with special characters
    When User enters a confirm pin for card with special characters
    When User clicks on next button change pin screen
    Then User shouldn't be able to sign in


  @CardManagement @CardManagement18
  Scenario: User blocks both cards and activates both cards

    Given User clicks on Centiv card
    And User scrolls down
    When User clicks on Block-Unblock button
    And User clicks on temporary block button
    And User clicks on back button at the top left
    When User clicks on back button at the top left
    And User scrolls to the right
    When User clicks on Payd card
    And User scrolls down at Payd card
    When User clicks on Block-Unblock button
    And User clicks on temporary block button
    And User clicks on back button at the top left
    When User clicks on back button at the top left
    And User scrolls to the left
    When User clicks on Centiv card
    And User clicks on Block-Unblock button
    When user clicks unblock button
    And User clicks on back button at the top left
    When User clicks on back button at the top left
    And User scrolls to the right
    When User clicks on Payd card
    And User scrolls down at Payd card
    When User clicks on Block-Unblock button
    When user clicks unblock button
    And User clicks on back button at the top left
    When User clicks on back button at the top left
    And User scrolls to the left
    Then User should successfully unblock both cards


  @CardManagement @CardManagement20
  Scenario: User checks transaction history at card management

    Given User clicks on card management button
    And User clicks on Tap to See transaction history
    Then User should see their transaction history




