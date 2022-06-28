@CardManagement
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