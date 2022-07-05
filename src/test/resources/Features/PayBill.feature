@PayBillFeature
Feature: Pay Bill

#User login steps in background
  Background:
    Given User is on Login Page
    And User clicks on skip button
    When User enters correct phone number
    And User enters correct password
    And User clicks on login button
    And User clicks on dont allow biometric button
    Then User should successfully login


  @PayBillTest @PayBillTest01
  Scenario: User successfully pays bill to KSEB

    Given User clicks on utility bills
    And User clicks on pay new bill button
    When User searches for country at Pay Bill
    And User clicks on the searched country at Pay Bill
    And User clicks on Utility button at bill type
    When User searches for company
    And User clicks on the first country in the list
    And User enters their valid mobile number of KSEB
    When User enters consumer number of KSEB
    And User clicks on next button at forgot password page
    Then User should move to bill is past


  @PayBillTest @PayBillTest02