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
    And User selects "United Arab Emirates" as their country
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
    And User selects "United Arab Emirates" as their country
    When User enters an invalid phone number at topup
    And User clicks on next button at recharge page
    Then User shouldnt be able to topup



  @MobileTopUpCase @MobileTopUpCase03
  Scenario: Mobile topUp and user clicks on save to beneficiary but forgets to enter beneficiary name

    When User clicks on Mobile Top Up button
    And User clicks on Add Topup button
    And User selects "United Arab Emirates" as their country
    When User enters a valid phone number at topup
    And User clicks on save beneficiary button at topup
    And User clicks on next button at recharge page
    Then User shouldnt be able to topup


  @MobileTopUpCase @MobileTopUpCase04
  Scenario: User checks whether they can search for countries at topup

    When User clicks on Mobile Top Up button
    And User clicks on Add Topup button
    And User selects "United Arab Emirates" as their country
    When User clicks on country code
    And User searches for first country
    When User clicks on their searched country
    Then User should see the country code and flag at phone number


  @MobileTopUpCase @MobileTopUpCase05
  Scenario: User checks if they can pay to existing beneficiary

    When User clicks on Mobile Top Up button
    And User clicks on the first existing beneficiary
    When User selects a recharge package for existing beneficiary
    And User clicks on next button at recharge page
    When User clicks on I agree terms and conditions checkbox at Mobile Top Up
    And User clicks on pay now button
    Then User should be able to topup successfully


  @MobileTopUpCase @MobileTopUpCase06
  Scenario: User checks if they can search for existing beneficiaries

    When User clicks on Mobile Top Up button
    And User searches for existing beneficiaries
    Then User should successfully be able to search beneficiaries


  @MobileTopUpCase @MobileTopUpCase07
  Scenario: User checks if they can search for service providers

    When User clicks on Mobile Top Up button
    And User clicks on Add Topup button
    And User selects "United Arab Emirates" as their country
    When User enters a valid phone number at topup
    And User clicks on next button at recharge page
    And User searches for different service providers
    Then User should successfully be able to search beneficiaries


  @MobileTopUpCase @MobileTopUpCase08
  Scenario: User goes to mobile topup but leaves phone number empty

    When User clicks on Mobile Top Up button
    And User clicks on Add Topup button
    And User selects "United Arab Emirates" as their country
    When User leaves phone number empty at topup
    And User clicks on next button at recharge page
    Then User shouldnt be able to proceed


  @MobileTopUpCase @MobileTopUpCase09
  Scenario: User clicks on Du Prepaid button at Centiv Card and topup successfully

    When User clicks on Du Prepaid button
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


  @MobileTopUpCase @MobileTopUpCase10
  Scenario: User clicks on Etisalat button at Centiv Card and topup successfully

    When User clicks on Top up Etisalat button
    When User enters a valid phone number at topup
    And User clicks on next button at recharge page
    And User selects the second service provider
    When User selects a recharge package
    And User clicks on next button at recharge page
    When User clicks on I agree terms and conditions checkbox at Mobile Top Up
    And User clicks on pay now button
    When User enters valid OTP at send money flow
    And User clicks on next button at OTP screen
    Then User should be able to topup successfully


  @MobileTopUpCase @MobileTopUpCase11
  Scenario: User clicks on Du Prepaid button at Payd Card and topup successfully

    Given User scrolls to the right
    When User clicks on Du Prepaid button
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


  @MobileTopUpCase @MobileTopUpCase12
  Scenario: User clicks on Etisalat button at PAYD card and topup successfully

    Given User scrolls to the right
    When User clicks on Top up Etisalat button
    When User enters a valid phone number at topup
    And User clicks on next button at recharge page
    And User selects the second service provider
    When User selects a recharge package
    And User clicks on next button at recharge page
    When User clicks on I agree terms and conditions checkbox at Mobile Top Up
    And User clicks on pay now button
    When User enters valid OTP at send money flow
    And User clicks on next button at OTP screen
    Then User should be able to topup successfully