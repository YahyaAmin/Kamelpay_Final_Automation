@Loginfeature
Feature: Login Tests

  @Logintest @Logintest1
  Scenario: Login with correct username and correct password

    Given User is on Login Page
    When User enters correct phone number
    And User enters correct password
    And User clicks on login button
    And User clicks on dont allow biometric button
    Then User should successfully login


    @Logintest @Logintest2
    Scenario: Login with correct pin after setting pin

      Given User is on Login Page
      When User enters correct phone number
      And User enters correct password
      And User clicks on login button
      And User clicks on dont allow biometric button
      Then User should successfully login
      And User clicks on sidebar menu
      When User clicks on settings from sidebar menu
      And User clicks on setup pin login button
      When User enters pin to setup pin
      And User enters the same confirm pin
      When User clicks on submit button at pin setup screen
      And User clicks on back button at the top left
      And User clicks on sidebar menu
      And User clicks on logout button from settings panel
      And User enters their correct pin
