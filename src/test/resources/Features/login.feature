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


      @Logintest @Logintest5
      Scenario: Login with incorrect phone number and correct password

        Given User is on Login Page
        When User enters incorrect phone number
        And User enters correct password
        And User clicks on login button
        Then User shouldn't be able to login


      @Logintest @Logintest6
      Scenario: Login with correct phone number and incorrect password

        Given User is on Login Page
        When User enters correct phone number
        And User enters incorrect password
        And User clicks on login button
        Then User shouldn't be able to login


      @Logintest @Logintest7
      Scenario: Login with incorrect pin and user is unable to login

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
        And User enters incorrect pin for login


      @Logintest @Logintest9
      Scenario: User forgets password and enters invalid phone number at forgot password

        Given User is on Login Page
        And User clicks on Forgot password
        When User enters a valid E-id
        And User enters incorrect phone number
        When User clicks on next button at forgot password page
        Then User shouldn't be able to change password


      @Logintest @Logintest10
      Scenario: User clicks on can't login button at enter pin page and then logs in with phone no. and password

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
        Then User clicks on cant login button









