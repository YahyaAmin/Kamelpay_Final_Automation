@Settingsfeature
Feature: Login Tests

  #User login steps in background
  Background:
    Given User is on Login Page
    And User clicks on skip button
    When User enters correct phone number
    And User enters correct password
    And User clicks on login button
    And User clicks on dont allow biometric button
    Then User should successfully login


  @Settingstest @Settingstest02
  Scenario: Check if user can access settings for their profile

    Given User clicks on settings button at the bottom right
    Then User should be directed to the settings page


  @Settingstest @Settingstest03
  Scenario: Check if back button is working on settings page

    Given User clicks on settings button at the bottom right
    And User should be directed to the settings page
    When User clicks on back button at the top left
    Then User should move back to main page


  @Settingstest @Settingstest04
  Scenario: User clicks on customer support button at settings page

    Given User clicks on settings button at the bottom right
    When User clicks on Whatsapp customer support button
    Then User should be redirected to Whatsapp customer support


  @Settingstest @Settingstest05
  Scenario: Check if user can logout of the app

    Given User clicks on settings button at the bottom right
    And User clicks on logout button
    Then User should be redirected to home page


  @Settingstest @Settingstest06
  Scenario: User successfully changes their password, logs in with new password and changes back to original password

    Given User clicks on settings button at the bottom right
    And User clicks on Passwords and Biometrics Button
    When User clicks on change password button
    And User enters their old password
    And User enters their new password
    When User enters their confirm password
    And User clicks on view password button
    And User clicks on submit button at pin setup screen
    When User clicks on back button at the top left
    And User clicks on logout button
    When User enters correct phone number
    And User enters their new password after changing password
    And User clicks on login button
    And User clicks on dont allow biometric button
    Then User should successfully login
    And User resets their password to original password


  @Settingstest @Settingstest07
  Scenario: User goes to change password but leaves all passwords empty

    Given User clicks on settings button at the bottom right
    And User clicks on Passwords and Biometrics Button
    When User clicks on change password button
    And User leaves their old password empty
    And User leaves their new password empty
    When User leaves their confirm password empty
    And User clicks on view password button
    And User clicks on submit button at pin setup screen
    Then User shouldnt be able to change password


  @Settingstest @Settingstest08
  Scenario: User goes to change password but leaves password and confirm password field empty

    Given User clicks on settings button at the bottom right
    And User clicks on Passwords and Biometrics Button
    When User clicks on change password button
    And User enters their old password
    And User leaves their new password empty
    When User leaves their confirm password empty
    And User clicks on view password button
    And User clicks on submit button at pin setup screen
    Then User shouldnt be able to change password


  @Settingstest @Settingstest09
  Scenario: User goes to change password but leaves old password field empty

    Given User clicks on settings button at the bottom right
    And User clicks on Passwords and Biometrics Button
    When User clicks on change password button
    And User leaves their old password empty
    And User enters their new password
    When User enters their confirm password
    And User clicks on view password button
    And User clicks on submit button at pin setup screen
    Then User shouldnt be able to change password


  @Settingstest @Settingstest10
  Scenario: User goes to change password but user enters incorrect old password

    Given User clicks on settings button at the bottom right
    And User clicks on Passwords and Biometrics Button
    When User clicks on change password button
    And User enters an incorrect old password
    And User enters their new password
    When User enters their confirm password
    And User clicks on view password button
    And User clicks on submit button at pin setup screen
    Then User shouldnt be able to change password


  @Settingstest @Settingstest11
  Scenario: User goes to change password but user enters new password without uppercase letters

    Given User clicks on settings button at the bottom right
    And User clicks on Passwords and Biometrics Button
    When User clicks on change password button
    And User enters their old password
    And User enters their new password without uppercase letters
    When User enters their confirm password without uppercase letters
    And User clicks on view password button
    And User clicks on submit button at pin setup screen
    Then User shouldnt be able to change password


  @Settingstest @Settingstest12
  Scenario: User goes to change password but user enters new password without lowercase letters

    Given User clicks on settings button at the bottom right
    And User clicks on Passwords and Biometrics Button
    When User clicks on change password button
    And User enters their old password
    And User enters their new password without lowercase letters
    When User enters their confirm password without lowercase letters
    And User clicks on view password button
    And User clicks on submit button at pin setup screen
    Then User shouldnt be able to change password


  @Settingstest @Settingstest13
  Scenario: User goes to change password but user enters new password without a number

    Given User clicks on settings button at the bottom right
    And User clicks on Passwords and Biometrics Button
    When User clicks on change password button
    And User enters their old password
    And User enters their new password without a number
    When User enters their confirm password without a number
    And User clicks on view password button
    And User clicks on submit button at pin setup screen
    Then User shouldnt be able to change password


  @Settingstest @Settingstest14
  Scenario: User goes to change password but user enters new password without a special character

    Given User clicks on settings button at the bottom right
    And User clicks on Passwords and Biometrics Button
    When User clicks on change password button
    And User enters their old password
    And User enters their new password without a special character
    When User enters their confirm password without a special character
    And User clicks on view password button
    And User clicks on submit button at pin setup screen
    Then User shouldnt be able to change password


  @Settingstest @Settingstest15
  Scenario: User goes to change password but user enters new password with spaces

    Given User clicks on settings button at the bottom right
    And User clicks on Passwords and Biometrics Button
    When User clicks on change password button
    And User enters their old password
    And User enters their new password with spaces
    When User enters their confirm password with spaces
    And User clicks on view password button
    And User clicks on submit button at pin setup screen
    Then User shouldnt be able to change password


  @Settingstest @Settingstest16
  Scenario: User goes to change password but password and confirm password do not match

    Given User clicks on settings button at the bottom right
    And User clicks on Passwords and Biometrics Button
    When User clicks on change password button
    And User enters their old password
    And User enters their new passwords
    When User enters a different confirm passwords
    And User clicks on view password button
    And User clicks on submit button at pin setup screen
    Then User shouldnt be able to change password