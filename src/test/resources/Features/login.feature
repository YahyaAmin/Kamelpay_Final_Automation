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


      @Logintest @Logintest4
      Scenario: User Forgot Password, Sets new password and logs in with new password

        Given User is on Login Page
        And User clicks on Forgot password
        When User enters a valid E-id
        And User enters a valid phone number
        When User clicks on next button at forgot password page
        And User enters valid OTP
        And User clicks on next button at OTP screen
        When User enters valid new password
        And User enters valid confirm new password
        Then User clicks on confirm button at forgot password page
        Given User is on Login Page
        When User enters correct phone number
        And User enters correct new password
        And User clicks on login button
        And User clicks on dont allow biometric button
        Then User should successfully login

