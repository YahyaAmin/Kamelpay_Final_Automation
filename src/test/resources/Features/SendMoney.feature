@Sendmoneyfeature
Feature: Send Money Tests

#User login steps in background
  Background:
    Given User is on Login Page
    And User clicks on skip button
    When User enters correct phone number
    And User enters correct password
    And User clicks on login button
    And User clicks on dont allow biometric button
    Then User should successfully login


  @Sendmoney @Sendmoney01
  Scenario: User successfully sends money through bank transfer

    When User scrolls to the right
    And User clicks on Send Money Button
    And User clicks on Send Money at Send Money screen
    When User searches for country
    And User clicks on country they searched for







