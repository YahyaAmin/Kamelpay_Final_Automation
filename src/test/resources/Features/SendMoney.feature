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
    And User clicks on the bank account button
    When User selects the first bank in the list
    And User clicks the confirm button
    When User enters the amount they want to send
    And User scrolls down at exchange rate page
    And User clicks on next button at forgot password page
    When User enters first name of beneficiary
    And User enters last name of beneficiary
    And User enters phone number of beneficiary
    When User scrolls down at exchange rate page
    And User enters account title
    When User enters Iban number
    And User enters remittance purpose
    And User clicks on next button at forgot password page
    When User clicks I agree terms and conditions box
    And User clicks on Send Money at confirmation screen
    And User enters valid OTP at send money flow
    And User clicks on next button at OTP screen
    Then User should be able to successfully send money


  @Sendmoney @Sendmoney02
  Scenario: User successfully sends money through bank transfer to a saved beneficiary

    When User scrolls to the right
    And User clicks on Send Money Button
    When User clicks on the first saved beneficiary
    When User enters the amount they want to send
    And User scrolls down at exchange rate page
    And User clicks on next button at forgot password page
    When User clicks I agree terms and conditions box
    And User clicks on Send Money at confirmation screen
    Then User should be able to successfully send money


  @Sendmoney @Sendmoney03
  Scenario: User tries send money at Centiv card but fails to send money

    When User clicks on Send Money Button at Centiv card
    Then User shouldnt be able to send money


  @Sendmoney @Sendmoney04
  Scenario: User sends money through cash pickup successfully

    When User scrolls to the right
    And User clicks on Send Money Button
    And User clicks on Send Money at Send Money screen
    When User searches for country
    And User clicks on country they searched for
    And User clicks on cash pickup button
    When User selects the first bank in the list
    And User clicks the confirm button
    When User enters the amount they want to send
    And User scrolls down at exchange rate page
    And User clicks on next button at forgot password page
    When User enters first name of beneficiary
    And User enters last name of beneficiary
    And User enters phone number of beneficiary
    When User scrolls down at exchange rate page
    And User enters remittance purpose
    And User clicks on next button at forgot password page
    When User clicks I agree terms and conditions box
    And User clicks on Send Money at confirmation screen
    And User enters valid OTP at send money flow
    And User clicks on next button at OTP screen
    Then User should be able to successfully send money


  @Sendmoney @Sendmoney05
  Scenario: 

