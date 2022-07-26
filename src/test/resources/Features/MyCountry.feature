@MyCountryFeature
Feature: My Country Tests

  #User login steps in background
  Background:
    Given User is on Login Page
    And User clicks on skip button
    When User enters correct phone number
    And User enters correct password
    And User clicks on login button
    And User clicks on dont allow biometric button
    Then User should successfully login


  @MyCountryTest @MyCountryTest1
  Scenario: User successfully sends money by Bank Account through My Country
    Given User scrolls to the right
    When User clicks on MY country button
    And User clicks on the bank account button
    When User selects the first bank in the list


  @MyCountryTest @MyCountryTest2
  Scenario: User successfully sends money by Cash Pickup through My Country

    Given User scrolls to the right
    When User clicks on MY country button
    And User clicks on cash pickup button
    When User selects the first bank in the list


  @MyCountryTest @MyCountryTest3
  Scenario: User successfully sends money by Popular Banks Option at My Country

    Given User scrolls to the right
    When User clicks on MY country button
    And User clicks on JazzCash at Popular Banks
    And User clicks on next button


  @MyCountryTest @MyCountryTest4
  Scenario: User sends money by Cash Pickup at My Country module but using Centiv card

    When User clicks on MY country button
    And User clicks on cash pickup button
    Then User should see error message that this feature is only for PayD Card


  @MyCountryTest @MyCountryTest5
  Scenario: User selects popular banks in their country but tries sending money through Centiv card

    When User clicks on MY country button
    And User clicks on JazzCash at Popular Banks
    Then User should see error message that this feature is only for PayD Card


  #@MyCountryTest @MyCountryTest6
  #Scenario: User pays bill through Mobile Postpaid at Ufone but bill is past

    #When User clicks on MY country button
    #And User scrolls down at My country page


  @MyCountryTest @MyCountryTest12
  Scenario: User successfully pays Mobile Prepaid recharge

    When User clicks on MY country button
    And User scrolls down at My country page
    When User clicks on Zong Prepaid Button
    And User selects a recharge package of 2 USD
    When User clicks on next button at forgot password page
    And User enters their mobile number for Zong
    And User clicks on next button at forgot password page
    When User clicks on next button at forgot password page
    And User enters agree terms and conditions
    And User clicks on pay now button
    When User enters OTP at pay bill flow
    And User clicks on next button at OTP screen
    Then User should be successfully able to pay bill
