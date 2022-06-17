@Signupfeature
Feature: Sign Up Tests

  @Signuptest @Signuptest01
    Scenario: User signs up successfully with Payd card

      Given User is on Login Page
      And User clicks on Don't have an account? signup button
      When User selects PayD card
      And User clicks on I am ready button
      And User enters their valid phone number for registration
      When User enters their valid username for registration
      And User enters their valid password
      When User enters a valid confirm password
      And User clicks on sign up button
      And User enters valid OTP at register yourself
      And User clicks on next button at OTP screen
      And User clicks on dont allow biometric button
      Then User should be able to sign up successfully


    @Signuptest @Signuptest02
      Scenario: User signup successfully with Centiv card

      Given User is on Login Page
      And User clicks on Don't have an account? signup button
      When User selects Centiv card
      And User clicks on I am ready button
      And User enters their valid phone number for registration
      When User enters their valid username for registration
      And User enters their valid password
      When User enters a valid confirm password
      And User clicks on sign up button
      And User enters valid OTP at register yourself
      And User clicks on next button at OTP screen
      And User clicks on dont allow biometric button
      Then User should be able to sign up successfully


    @Signuptest @Signuptest03
      Scenario: User signup but user forgets to enter phone number

      Given User is on Login Page
      And User clicks on Don't have an account? signup button
      When User selects PayD card
      And User clicks on I am ready button
      When User enters their valid username for registration
      And User enters their valid password
      When User enters a valid confirm password
      And User clicks on sign up button
      Then User shouldn't be able to sign in


    @Signuptest @Signuptest04
      Scenario: User signup but user forgets to enter username

      Given User is on Login Page
      And User clicks on Don't have an account? signup button
      When User selects PayD card
      And User clicks on I am ready button
      And User enters their valid phone number for registration
      And User enters their valid password
      When User enters a valid confirm password
      And User clicks on sign up button
      Then User shouldn't be able to sign in


    @Signuptest @Signuptest05
      Scenario: User signup but user forgets to enter password

    Given User is on Login Page
    And User clicks on Don't have an account? signup button
    When User selects PayD card
    And User clicks on I am ready button
    And User enters their valid phone number for registration
      When User enters their valid username for registration
    When User enters a valid confirm password
    And User clicks on sign up button
    Then User shouldn't be able to sign in


  @Signuptest @Signuptest06
  Scenario: User signup but user forgets to enter confirm password

    Given User is on Login Page
    And User clicks on Don't have an account? signup button
    When User selects PayD card
    And User clicks on I am ready button
    And User enters their valid phone number for registration
    When User enters their valid username for registration
    When User enters their valid password
    And User clicks on sign up button
    Then User shouldn't be able to sign in


  @Signuptest @Signuptest07
  Scenario: User signup but user enters phone number with less than 9 digits

    Given User is on Login Page
    And User clicks on Don't have an account? signup button
    When User selects PayD card
    And User clicks on I am ready button
    And User enters phone number with less than nine digits
    When User enters their valid username for registration
    When User enters their valid password
    And User enters a valid confirm password
    And User clicks on sign up button
    Then User shouldn't be able to sign in
















