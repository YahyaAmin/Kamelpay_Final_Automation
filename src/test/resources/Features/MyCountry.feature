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


  @MyCountryTest @MyCountryTest6
  Scenario: User pays bill through Mobile Postpaid at Ufone but bill is past

    When User clicks on MY country button
    And User scrolls down at My country page
    And User scrolls to the right at my country page
    When User clicks on Ufone Postpaid
    And User enters a valid phone number for Ufone
    When User clicks on next button
    Then User should see bill is past


  @MyCountryTest @MyCountryTest7
  Scenario: User does Mobile Postpaid Topup but enters mobile number less than ten digits

    When User clicks on MY country button
    And User scrolls down at My country page
    When User clicks on Mobilink Postpaid button
    And User enters a invalid phone number at Mobilink
    When User clicks on next button
    Then User should see invalid phone number error


  @MyCountryTest @MyCountryTest8
  Scenario: User does Mobile Postpaid Topup but enters mobile number more than eleven digits

    When User clicks on MY country button
    And User scrolls down at My country page
    When User clicks on Mobilink Postpaid button
    And User enters a phone number more than eleven digits
    When User clicks on next button
    Then User should see invalid phone number error


  @MyCountryTest @MyCountryTest9
  Scenario: User does Mobile Postpaid Topup but enters mobile number has special characters

    When User clicks on MY country button
    And User scrolls down at My country page
    When User clicks on Mobilink Postpaid button
    And User enters a phone number with special characters
    When User clicks on next button
    Then User should see invalid phone number error


  @MyCountryTest @MyCountryTest10
  Scenario: User does Mobile Postpaid Topup but enters mobile number with spaces

    When User clicks on MY country button
    And User scrolls down at My country page
    When User clicks on Mobilink Postpaid button
    And User enters a phone number with spaces
    When User clicks on next button
    Then User should see invalid phone number error


  @MyCountryTest @MyCountryTest11
  Scenario: User does Mobile Postpaid Topup but enters invalid eleven digit mobile number

    When User clicks on MY country button
    And User scrolls down at My country page
    When User clicks on Mobilink Postpaid button
    And User enters a phone number with random eleven digits
    When User clicks on next button
    Then User should see invalid reference



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


  @MyCountryTest @MyCountryTest13
  Scenario: User pays Mobile Prepaid recharge but enters phone number less than twelve digits

    When User clicks on MY country button
    And User scrolls down at My country page
    When User clicks on Zong Prepaid Button
    And User selects a recharge package of 2 USD
    When User clicks on next button at forgot password page
    And User enters mobile number less than twelve digits
    And User clicks on next button
    Then User should see invalid phone number error


  @MyCountryTest @MyCountryTest14
  Scenario: User pays Mobile Prepaid recharge but enters phone number more than twelve digits

    When User clicks on MY country button
    And User scrolls down at My country page
    When User clicks on Zong Prepaid Button
    And User selects a recharge package of 2 USD
    When User clicks on next button at forgot password page
    And User enters mobile number more than twelve digits
    And User clicks on next button
    Then User should see invalid phone number error


  @MyCountryTest @MyCountryTest15
  Scenario: User pays Mobile Prepaid recharge but number has spaces

    When User clicks on MY country button
    And User scrolls down at My country page
    When User clicks on Zong Prepaid Button
    And User selects a recharge package of 2 USD
    When User clicks on next button at forgot password page
    And User enters mobile number has spaces
    And User clicks on next button
    Then User should see invalid phone number error


  @MyCountryTest @MyCountryTest16
  Scenario: User pays Mobile Prepaid recharge but enters phone number with special characters

    When User clicks on MY country button
    And User scrolls down at My country page
    When User clicks on Zong Prepaid Button
    And User selects a recharge package of 2 USD
    When User clicks on next button at forgot password page
    And User enters mobile number has special characters
    And User clicks on next button
    Then User should see invalid phone number error


  @MyCountryTest @MyCountryTest17
  Scenario: User pays Mobile Prepaid recharge but OTP is empty

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
    When User leaves OTP empty
    And User clicks on next button at OTP screen
    Then User should see invalid OTP


  @MyCountryTest @MyCountryTest18
  Scenario: User pays Mobile Prepaid recharge but OTP has special characters

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
    When User enters OTP with special characters
    And User clicks on next button at OTP screen
    Then User should see invalid OTP


  @MyCountryTest @MyCountryTest19
  Scenario: User pays Mobile Prepaid recharge but OTP has spaces

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
    When User enters OTP but OTP has spaces
    And User clicks on next button at OTP screen
    Then User should see invalid OTP


  @MyCountryTest @MyCountryTest20
  Scenario: User pays Mobile Prepaid recharge but OTP is an invalid six digit OTP

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
    When User enters OTP but it is an incorrect six digit OTP
    And User clicks on next button at OTP screen
    Then User should see invalid OTP


  @MyCountryTest @MyCountryTest21
  Scenario: User pays bill at LESCO but bill is past

    When User clicks on MY country button
    And User scrolls down at My country page
    When User clicks on LESCO at MyCountry
    When User enters a valid referrence number
    And User clicks on next button
    Then User should see bill is past


  @MyCountryTest @MyCountryTest22
  Scenario: User pays bill at SNGPL but error processing transaction

    When User clicks on MY country button
    And User scrolls down at My country page
    When User clicks on SNGPL at MyCountry
    When User enters a valid consumer number for SNGPL
    And User clicks on next button
    Then User should see error processing transaction


  @MyCountryTest @MyCountryTest23
  Scenario: User pays Financial Service but invalid reference

    When User clicks on MY country button
    And User scrolls down at My country page
    When User clicks on Central Depositary Company Pakistan
    And User enters a reference number at financial services
    And User clicks on next button
    Then User should see invalid reference
