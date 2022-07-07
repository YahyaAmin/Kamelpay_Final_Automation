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
  Scenario: User successfully pays bill to Tata Power Mumbai

    Given User clicks on utility bills
    And User clicks on pay new bill button
    When User searches for country at Pay Bill
    And User clicks on the searched country at Pay Bill
    And User clicks on Utility button at bill type
    When User searches for company Tata Power
    And User clicks on the first country in the list
    And User enters their valid mobile number of Tata Power
    And User enters valid mobile number for Tata Power
    When User clicks on next button at forgot password page
    Then User should move to bill is past


  @PayBillTest @PayBillTest03
  Scenario: User successfully pays bill to Cignal TV

    Given User clicks on utility bills
    And User clicks on pay new bill button
    And User searches for Philippines
    When User clicks on Philippines
    And User clicks on Utility button at bill type
    And User searches for company Cignal TV
    And User clicks on Cignal TV
    When User enters a valid subscriber name at Cignal TV
    And User enters a valid account number at Cignal TV
    When User clicks on next button at forgot password page
    And User enters amount at Cignal TV
    When User clicks on next button at forgot password page
    And User enters agree terms and conditions
    And User clicks on pay now button
    When User enters OTP at pay bill flow
    And User clicks on next button at OTP screen
    Then User should be successfully able to pay bill


  @PayBillTest @PayBillTest04
  Scenario: User successfully pays bill to Pampanga I Electric Corp

    Given User clicks on utility bills
    And User clicks on pay new bill button
    And User searches for Philippines
    When User clicks on Philippines
    And User clicks on Utility button at bill type
    And User searches for Pampanga I
    And User clicks on Pampanga I
    When User enters a valid subscriber name at Pampanga I
    And User enters a valid account number at Pampanga I
    When User clicks on next button at forgot password page
    And User enters amount at Cignal TV
    When User clicks on next button at forgot password page
    And User enters agree terms and conditions
    And User clicks on pay now button
    When User enters OTP at pay bill flow
    And User clicks on next button at OTP screen
    Then User should be successfully able to pay bill


  @PayBillTest @PayBillTest05
  Scenario: User successfully pays bill to Avantika Gas Ltd.

    Given User clicks on utility bills
    And User clicks on pay new bill button
    When User searches for country at Pay Bill
    And User clicks on the searched country at Pay Bill
    And User clicks on Utility button at bill type
    When User searches for company Aavantika
    And User clicks on the company Aavantika
    When User enters customer number
    And User enters valid mobile number for Aavantika
    When User clicks on next button at forgot password page
    Then User should see bill is past


  @PayBillTest @PayBillTest06
  Scenario: User pays bill to Adani Gas Ltd. but bill is past

    Given User clicks on utility bills
    And User clicks on pay new bill button
    When User searches for country at Pay Bill
    And User clicks on the searched country at Pay Bill
    And User clicks on Utility button at bill type
    When User searches for company Adani Gas
    And User clicks on the company Aavantika
    When User enters customer number for Aavantika
    And User enters valid mobile number for Aavantika
    When User clicks on next button at forgot password page
    Then User should see bill is past


  @PayBillTest @PayBillTest07
  Scenario: User successfully pays bill to Gujarat Gas Ltd (India)

    Given User clicks on utility bills
    And User clicks on pay new bill button
    When User searches for country at Pay Bill
    And User clicks on the searched country at Pay Bill
    And User clicks on Utility button at bill type
    When User searches for company Gujarat Gas Ltd
    And User clicks on the company Gujarat Gas Ltd
    When User enters customer number for Gujarat LTD
    And User enters valid mobile number for Gujarat
    When User clicks on next button at forgot password page
    When User clicks on next button at Gujarat
    And User enters agree terms and conditions
    And User clicks on pay now button
    When User enters OTP at pay bill flow
    And User clicks on next button at OTP screen
    Then User should be successfully able to pay bill


  @PayBillTest @PayBillTest08
  Scenario: User successfully pays bill to PLDT (Philipines)

    Given User clicks on utility bills
    And User clicks on pay new bill button
    And User searches for Philippines
    When User clicks on Philippines
    And User clicks on Utility button at bill type
    When User searches for PLDT
    And User clicks on PLDT
    When User enters account number for PLDT
    And User enters valid telephone number for PLDT
    When User clicks on next button at forgot password page
    And User enters amount at Cignal TV
    When User clicks on next button at forgot password page
    And User enters agree terms and conditions
    And User clicks on pay now button
    When User enters OTP at pay bill flow
    And User clicks on next button at OTP screen
    Then User should be successfully able to pay bill


  @PayBillTest @PayBillTest09
  Scenario: User pays bill to LESCO but bill is past

    Given User clicks on utility bills
    And User clicks on pay new bill button
    And User searches for Pakistan
    When User clicks on Pakistan
    And User clicks on Utility button at bill type
    When User searches for LESCO
    And User clicks on LESCO
    When User enters a valid referrence number
    And User clicks on next button at forgot password page
    Then User should see bill is past


  @PayBillTest @PayBillTest10
  Scenario: User pay bill to PTCL Landline but biller is unavailable

    Given User clicks on utility bills
    And User clicks on pay new bill button
    And User searches for Pakistan
    When User clicks on Pakistan
    And User clicks on Utility button at bill type
    When User searches for PTCL Landline
    And User clicks on PTCL Landline
    When User enters a valid referrence number for PTCL
    And User clicks on next button at forgot password page
    Then User should see biller unavailable


  @PayBillTest @PayBillTest11
  Scenario: User pay bill to SSGC but request timed out

    Given User clicks on utility bills
    And User clicks on pay new bill button
    And User searches for Pakistan
    When User clicks on Pakistan
    And User clicks on Utility button at bill type
    When User searches for SSGC
    And User clicks on SSGC
    When User enters a valid referrence number for SSGC
    And User clicks on next button at forgot password page
    Then User should see request timed out


  @PayBillTest @PayBillTest12
  Scenario: User pay bill to KWSB but bill is past

    Given User clicks on utility bills
    And User clicks on pay new bill button
    And User searches for Pakistan
    When User clicks on Pakistan
    And User clicks on Utility button at bill type
    When User searches for KWSB
    And User clicks on KWSB
    When User enters a valid referrence number for KWSB
    And User clicks on next button at forgot password page
    Then User should see bill is past


  @PayBillTest @PayBillTest13
  Scenario: User pay bill to K-Electric but bill is past

    Given User clicks on utility bills
    And User clicks on pay new bill button
    And User searches for Pakistan
    When User clicks on Pakistan
    And User clicks on Utility button at bill type
    When User searches for K-Electric
    And User clicks on K-Electric
    When User enters a valid referrence number for K-Electric
    And User clicks on next button at forgot password page
    Then User should see bill is past


  @PayBillTest @PayBillTest14
  Scenario: User pays bill to SNGPL but error in processing transactions

    Given User clicks on utility bills
    And User clicks on pay new bill button
    And User searches for Pakistan
    When User clicks on Pakistan
    And User clicks on Utility button at bill type
    When User searches for SNGPL
    And User clicks on SNGPL
    When User enters a valid consumer number for SNGPL
    And User clicks on next button at forgot password page
    Then User should see bill is past


  @PayBillTest @PayBillTest15
  Scenario: User successfully pays bill to Zong Prepaid

    Given User clicks on utility bills
    And User clicks on pay new bill button
    And User searches for Pakistan
    When User clicks on Pakistan


