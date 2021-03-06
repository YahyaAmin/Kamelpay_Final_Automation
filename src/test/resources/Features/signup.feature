@Signupfeature
Feature: Sign Up Tests

  @Signuptest @Signuptest01
    Scenario: User signs up successfully with last four card digits

      Given User is on Login Page
      And User clicks on skip button
      And User clicks on Don't have an account? signup button
      When User enters last four digits of their card
      And User clicks on I am ready button
      And User enters their valid phone number for registration
      And User enters their valid password
      When User enters a valid confirm password
      And User clicks on I agree terms and conditions checkbox
      And User clicks on sign up button
      And User enters valid OTP at register yourself
      And User clicks on next button at OTP screen
      And User clicks on dont allow biometric button
      Then User should be able to sign up successfully


    #@Signuptest @Signuptest02
     # Scenario: User signup successfully with new card

      #Given User is on Login Page
      #And User clicks on skip button
      #And User clicks on Don't have an account? signup button
      #When User clicks Get Your New Card button
      #And User enters their valid phone number for registration
      #And User enters their valid password
      #When User enters a valid confirm password
      #And User clicks on I agree terms and conditions checkbox
      #And User clicks on sign up button
      #And User enters valid OTP at register yourself
      #And User clicks on next button at OTP screen
      #And User clicks on dont allow biometric button
      #Then User should be able to sign up successfully


    @Signuptest @Signuptest03
      Scenario: User signup but user forgets to enter phone number

      Given User is on Login Page
      And User clicks on skip button
      And User clicks on Don't have an account? signup button
      When User clicks Get Your New Card button
      And User enters their valid password
      When User enters a valid confirm password
      And User clicks on I agree terms and conditions checkbox
      And User clicks on sign up button
      Then User shouldn't be able to sign in


    @Signuptest @Signuptest04
      Scenario: User signup but user enters invalid email

      Given User is on Login Page
      And User clicks on skip button
      And User clicks on Don't have an account? signup button
      When User clicks Get Your New Card button
      And User enters their valid phone number for registration
      When User enters an invalid email
      And User enters their valid password
      When User enters a valid confirm password
      And User clicks on I agree terms and conditions checkbox
      And User clicks on sign up button
      Then User shouldn't be able to sign in


    @Signuptest @Signuptest05
      Scenario: User signup but user forgets to enter password

      Given User is on Login Page
      And User clicks on skip button
      And User clicks on Don't have an account? signup button
      When User clicks Get Your New Card button
      And User enters their valid phone number for registration
      When User enters a valid confirm password
      And User clicks on I agree terms and conditions checkbox
      And User clicks on sign up button
      Then User shouldn't be able to sign in


  @Signuptest @Signuptest06
  Scenario: User signup but user forgets to enter confirm password

    Given User is on Login Page
    And User clicks on skip button
    And User clicks on Don't have an account? signup button
    When User clicks Get Your New Card button
    And User enters their valid phone number for registration
    And User enters their valid password
    And User clicks on I agree terms and conditions checkbox
    And User clicks on sign up button
    Then User shouldn't be able to sign in


  @Signuptest @Signuptest07
  Scenario: User signup but user enters phone number with less than 9 digits

    Given User is on Login Page
    And User clicks on skip button
    And User clicks on Don't have an account? signup button
    When User clicks Get Your New Card button
    And User enters phone number with less than nine digits
    And User enters their valid password
    When User enters a valid confirm password
    And User clicks on I agree terms and conditions checkbox
    And User clicks on sign up button
    Then User shouldn't be able to sign in


  #@Signuptest @Signuptest08
  #Scenario: User signup but user enters username with special characters

    #Given User is on Login Page
    #And User clicks on Don't have an account? signup button
    #When User selects PayD card
    #And User clicks on I am ready button
    #And User enters their valid phone number for registration
    #When User enters username with special characters
    #When User enters their valid password
    #And User enters a valid confirm password
    #And User clicks on sign up button
    #Then User shouldn't be able to sign in


  @Signuptest @Signuptest09
  Scenario: User signup but user enters email with spaces

    Given User is on Login Page
    And User clicks on skip button
    And User clicks on Don't have an account? signup button
    When User clicks Get Your New Card button
    And User enters their valid phone number for registration
    When User enters email with spaces
    And User enters their valid password
    When User enters a valid confirm password
    And User clicks on I agree terms and conditions checkbox
    And User clicks on sign up button
    Then User shouldn't be able to sign in



  @Signuptest @Signuptest10
  Scenario: User signup but user enters a different confirm password

    Given User is on Login Page
    And User clicks on skip button
    And User clicks on Don't have an account? signup button
    When User clicks Get Your New Card button
    And User enters their valid phone number for registration
    And User enters their valid password
    When User enters a different confirm password
    And User clicks on I agree terms and conditions checkbox
    And User clicks on sign up button
    Then User shouldn't be able to sign in


  @Signuptest @Signuptest11
  Scenario: User sign up but password does not have uppercase letters

    Given User is on Login Page
    And User clicks on skip button
    And User clicks on Don't have an account? signup button
    When User clicks Get Your New Card button
    And User enters their valid phone number for registration
    And User enters their password without uppercase letters
    When User enters a confirm password without uppercase letters
    And User clicks on I agree terms and conditions checkbox
    And User clicks on sign up button
    Then User shouldn't be able to sign in


  @Signuptest @Signuptest12
  Scenario: User sign up but password does not have a number

    Given User is on Login Page
    And User clicks on skip button
    And User clicks on Don't have an account? signup button
    When User clicks Get Your New Card button
    And User enters their valid phone number for registration
    And User enters their password without a number
    When User enters a confirm password without a number
    And User clicks on I agree terms and conditions checkbox
    And User clicks on sign up button
    Then User shouldn't be able to sign in


  @Signuptest @Signuptest13
  Scenario: User sign up but password does not have a lowercase letter

    Given User is on Login Page
    And User clicks on skip button
    And User clicks on Don't have an account? signup button
    When User clicks Get Your New Card button
    And User enters their valid phone number for registration
    And User enters their password without a lowercase letter
    When User enters a confirm password without a lowercase letter
    And User clicks on I agree terms and conditions checkbox
    And User clicks on sign up button
    Then User shouldn't be able to sign in


  @Signuptest @Signuptest14
  Scenario: User sign up but password does not have a special character

    Given User is on Login Page
    And User clicks on skip button
    And User clicks on Don't have an account? signup button
    When User clicks Get Your New Card button
    And User enters their valid phone number for registration
    And User enters their password without a special character
    When User enters a confirm password without a special character
    And User clicks on I agree terms and conditions checkbox
    And User clicks on sign up button
    Then User shouldn't be able to sign in


  @Signuptest @Signuptest15
  Scenario: User sign up but password is too short

    Given User is on Login Page
    And User clicks on skip button
    And User clicks on Don't have an account? signup button
    When User clicks Get Your New Card button
    And User enters their valid phone number for registration
    And User enters their password but password is too short
    When User enters a confirm password but password is too short
    And User clicks on I agree terms and conditions checkbox
    And User clicks on sign up button
    Then User shouldn't be able to sign in


  @Signuptest @Signuptest16
  Scenario: User signup but user enters an invalid 6 digit OTP

    Given User is on Login Page
    And User clicks on skip button
    And User clicks on Don't have an account? signup button
    When User clicks Get Your New Card button
    And User enters their valid phone number for registration
    And User enters their valid password
    When User enters a valid confirm password
    And User clicks on I agree terms and conditions checkbox
    And User clicks on sign up button
    And User enters invalid OTP at register yourself
    When User clicks on next button at OTP screen
    Then User shouldn't be able to sign in


  @Signuptest @Signuptest17
  Scenario: User signup but user enters OTP with less than 6 digits

    Given User is on Login Page
    And User clicks on skip button
    And User clicks on Don't have an account? signup button
    When User clicks Get Your New Card button
    And User enters their valid phone number for registration
    And User enters their valid password
    When User enters a valid confirm password
    And User clicks on I agree terms and conditions checkbox
    And User clicks on sign up button
    And User enters OTP with less than six digits
    When User clicks on next button at OTP screen
    Then User shouldn't be able to sign in


  @Signuptest @Signuptest18
  Scenario: User signup but user leaves OTP empty

    Given User is on Login Page
    And User clicks on skip button
    And User clicks on Don't have an account? signup button
    When User clicks Get Your New Card button
    And User enters their valid phone number for registration
    And User enters their valid password
    When User enters a valid confirm password
    And User clicks on I agree terms and conditions checkbox
    And User clicks on sign up button
    And User enters leaves OTP empty
    When User clicks on next button at OTP screen
    Then User shouldn't be able to sign in


  @Signuptest @Signuptest19
  Scenario: User signs in and moves to scan ID to verify ID

    Given User is on Login Page
    And User clicks on skip button
    And User clicks on Don't have an account? signup button
    When User clicks Get Your New Card button
    And User enters their valid phone number for registration
    And User enters their valid password
    When User enters a valid confirm password
    And User clicks on I agree terms and conditions checkbox
    And User clicks on sign up button
    And User enters valid OTP at register yourself
    And User clicks on next button at OTP screen
    And User clicks on dont allow biometric button
    Then User should be able to sign up successfully
    And User clicks on verify button after signup
    When User enters their last four digits of card
    And User clicks on proceed button
    Then User should move to scan ID page


  @Signuptest @Signuptest20
  Scenario: User enters a card number with spaces at signup

    Given User is on Login Page
    And User clicks on skip button
    And User clicks on Don't have an account? signup button
    When User enters last four digits of their card but with spaces
    And User clicks on I am ready button
    Then User shouldn't be able to sign in












