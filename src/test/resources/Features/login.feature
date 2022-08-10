@Loginfeature
Feature: Login Tests

  @Logintest @Logintest01
  Scenario: Login with correct username and correct password

    Given User is on Login Page
    And User clicks on skip button
    When User enters correct phone number
    And User enters correct password
    And User clicks on login button
    And User clicks on dont allow biometric button
    Then User should successfully login

#@Logintest @Logintest02
    #Scenario: Login with correct pin after setting pin

     # Given User is on Login Page
      #And User clicks on skip button
    #  When User enters correct phone number
     # And User enters correct password
      #And User clicks on login button
      #And User clicks on dont allow biometric button
      #Then User should successfully login
      #And User clicks on My Profile button
      #When User clicks on Passwords and Biometrics Button
      #And User clicks on setup pin login button
      #When User enters pin to setup pin
      #And User enters the same confirm pin
      #And User clicks on submit button at pin setup screen
      #And User clicks on back button at the top left
      #And User clicks on logout button
      #When User enters their correct pin
      #Then User should successfully login


      @Logintest @Logintest04
      Scenario: User Forgot Password, Sets new password and logs in with new password

        Given User is on Login Page
        And User clicks on skip button
        And User clicks on Forgot password
        And User enters a valid phone number
        When User clicks on next button at forgot password page
        And User enters valid last four digits of their card
        And User clicks on proceed button
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
        Then User resets password to original password


      @Logintest @Logintest05
      Scenario: Login with incorrect phone number and correct password

        Given User is on Login Page
        And User clicks on skip button
        When User enters incorrect phone number
        And User enters correct password
        And User clicks on login button
        Then User shouldn't be able to login


      @Logintest @Logintest06
      Scenario: Login with correct phone number and incorrect password

        Given User is on Login Page
        And User clicks on skip button
        When User enters correct phone number
        And User enters incorrect password
        And User clicks on login button
        Then User shouldn't be able to login


      #@Logintest @Logintest07
      #Scenario: Login with incorrect pin and user is unable to login

       # Given User is on Login Page
        #And User clicks on skip button
        #When User enters correct phone number
        #And User enters correct password
        #And User clicks on login button
        #And User clicks on dont allow biometric button
        #Then User should successfully login
        #And User clicks on My Profile button
        #When User clicks on Passwords and Biometrics Button
        #And User clicks on setup pin login button
        #When User enters pin to setup pin
        #And User enters the same confirm pin
        #And User clicks on submit button at pin setup screen
        #And User clicks on back button at the top left
        #And User clicks on logout button
        #When User enters incorrect pin for login
        #Then User shouldn't be able to login


      @Logintest @Logintest09
      Scenario: User forgets password and enters invalid phone number at forgot password

        Given User is on Login Page
        And User clicks on skip button
        And User clicks on Forgot password
        And User enters incorrect phone number
        When User clicks on next button at forgot password page
        Then User shouldn't be able to change password


      #@Logintest @Logintest10
      #Scenario: User clicks on can't login button at enter pin page and then logs in with phone no. and password

        #Given User is on Login Page
        #And User clicks on skip button
        #When User enters correct phone number
        #And User enters correct password
        #And User clicks on login button
        #And User clicks on dont allow biometric button
        #Then User should successfully login
        #And User clicks on My Profile button
      #  #When User clicks on Passwords and Biometrics Button
        #And User clicks on setup pin login button
        #When User enters pin to setup pin
        #And User enters the same confirm pin
        #And User clicks on submit button at pin setup screen
        #And User clicks on back button at the top left
       # And User clicks on logout button
        #When User clicks on cant login button
        #Given User is on Login Page
        #When User enters correct phone number
        #And User enters correct password
        #And User clicks on login button
        #Then User should successfully login









