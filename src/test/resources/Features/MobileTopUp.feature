@MobileTopUpFeature
Feature: Mobile Top Up

#User login steps in background
  Background:
    Given User is on Login Page
    And User clicks on skip button
    When User enters correct phone number
    And User enters correct password
    And User clicks on login button
    And User clicks on dont allow biometric button
    Then User should successfully login


  @MobileTopUpCase @MobileTopUpCase01
  Scenario: Successful Mobile Top Up Case

    When User clicks on Mobile Top Up button
    And User clicks on Add Topup button
    When User enters a valid phone number at topup
    And User clicks on next button at recharge page
    And User selects the first service provider
    When User selects a recharge package
    And User clicks on next button at recharge page
    When User clicks on I agree terms and conditions checkbox at Mobile Top Up
    And User clicks on pay now button
    When User enters valid OTP at send money flow
    And User clicks on next button at OTP screen
    Then User should be able to topup successfully


  @MobileTopUpCase @MobileTopUpCase02
  Scenario: Mobile topUp but user enters invalid phone number

    When User clicks on Mobile Top Up button
    And User clicks on Add Topup button
    When User enters an invalid phone number at topup
    And User clicks on next button at recharge page
    Then User shouldnt be able to topup



  @MobileTopUpCase @MobileTopUpCase03
  Scenario: Mobile topUp and user clicks on save to beneficiary but forgets to enter beneficiary name

    When User clicks on Mobile Top Up button
    And User clicks on Add Topup button
    When User enters an invalid phone number at topup
    And User clicks on next button at recharge page
    Then User shouldnt be able to topup