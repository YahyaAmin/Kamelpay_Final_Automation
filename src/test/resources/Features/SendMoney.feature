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
    And User enters phone number of beneficiary for a Pakistani number
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
    And User enters phone number of beneficiary for a Pakistani number
    When User scrolls down at exchange rate page
    And User enters remittance purpose
    And User clicks on next button at forgot password page
    When User clicks I agree terms and conditions box
    And User clicks on Send Money at confirmation screen
    And User enters valid OTP at send money flow
    And User clicks on next button at OTP screen
    Then User should be able to successfully send money


  @Sendmoney @Sendmoney05
  Scenario: User sends money through mobile wallet

    When User scrolls to the right
    And User clicks on Send Money Button
    And User clicks on Send Money at Send Money screen
    When User searches for Bangladesh
    And User clicks on Bangladesh
    And User clicks on Mobile Wallet
    When User selects the first bank in the list
    And User clicks the confirm button
    When User enters the amount they want to send
    And User scrolls down at exchange rate page
    And User clicks on next button at forgot password page
    When User enters first name of beneficiary
    And User enters last name of beneficiary
    And User enters phone number of beneficiary for a Bangladeshi number
    When User scrolls down at exchange rate page
    And User enters remittance purpose
    And User clicks on next button at forgot password page
    When User clicks I agree terms and conditions box
    And User clicks on Send Money at confirmation screen
    And User enters valid OTP at send money flow
    And User clicks on next button at OTP screen
    Then User should be able to successfully send money


  @Sendmoney @Sendmoney06
  Scenario: User checks their track history

    When User scrolls to the right
    And User clicks on Send Money Button
    When User clicks on track history
    Then User should be redirected to their track history


  @Sendmoney @Sendmoney07
  Scenario: User sends money through bank transfer but leaves first name of beneficiary empty

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
    When User leaves beneficiary first name empty
    And User enters last name of beneficiary
    And User enters phone number of beneficiary for a Pakistani number
    When User scrolls down at exchange rate page
    And User enters account title
    When User enters Iban number
    And User enters remittance purpose
    And User clicks on next button at forgot password page
    When User scrolls up
    Then User shouldnt be able to send money


  @Sendmoney @Sendmoney08
  Scenario: User sends money through bank transfer but leaves last name of beneficiary empty

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
    And User enters phone number of beneficiary for a Pakistani number
    When User scrolls down at exchange rate page
    And User enters account title
    When User enters Iban number
    And User enters remittance purpose
    And User clicks on next button at forgot password page
    Then User shouldnt be able to send money


  @Sendmoney @Sendmoney09
  Scenario: User sends money through bank transfer but leaves phone number of beneficiary empty

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
    When User scrolls down at exchange rate page
    And User enters account title
    When User enters Iban number
    And User enters remittance purpose
    And User clicks on next button at forgot password page
    Then User shouldnt be able to send money


  @Sendmoney @Sendmoney10
  Scenario: User sends money through bank transfer but leaves account title empty

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
    And User enters phone number of beneficiary for a Pakistani number
    When User scrolls down at exchange rate page
    When User enters Iban number
    And User enters remittance purpose
    And User clicks on next button at forgot password page
    Then User shouldnt be able to send money


  @Sendmoney @Sendmoney11
  Scenario: User sends money through bank transfer but leaves IBAN number empty

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
    And User enters phone number of beneficiary for a Pakistani number
    When User scrolls down at exchange rate page
    And User enters account title
    And User enters remittance purpose
    And User clicks on next button at forgot password page
    Then User shouldnt be able to send money


  @Sendmoney @Sendmoney12
  Scenario: User sends money through bank transfer but leaves remittance purpose empty

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
    And User enters phone number of beneficiary for a Pakistani number
    When User scrolls down at exchange rate page
    And User enters account title
    When User enters Iban number
    And User clicks on next button at forgot password page
    Then User shouldnt be able to send money


  @Sendmoney @Sendmoney13
  Scenario: User adds new beneficiary successfully at send money

    When User scrolls to the right
    And User clicks on Send Money Button
    And User clicks on add new beneficary button
    When User searches for country
    And User clicks on country they searched for
    And User clicks on the bank account button
    When User selects the first bank in the list
    And User clicks the confirm button
    When User enters first name of beneficiary
    When User enters first name of beneficiary at add beneficiary
    And User enters phone number of beneficiary for a Pakistani number for saved beneficiary
    When User scrolls down at exchange rate page
    And User enters account title at add beneficary
    When User enters Iban number at add beneficiary
    And User enters remittance purpose
    And User clicks on save beneficiary button
    Then User enters valid OTP at send money flow
    And User clicks on next button at OTP screen
    Then User should successfully add beneficiary


  #@Sendmoney @Sendmoney14
  #Scenario: User adds new beneficiary at bank transfer but leaves beneficiary name empty

   # When User scrolls to the right
   # And User clicks on Send Money Button
    #And User clicks on add new beneficary button
    #When User searches for country
    #And User clicks on country they searched for
   # And User clicks on the bank account button
    #When User selects the first bank in the list
   # And User clicks the confirm button
    #When User enters first name of beneficiary at add beneficiary
    #And User enters last name of beneficiary at add beneficiary
    #And User enters phone number of beneficiary for a Pakistani number for saved beneficiary
    #When User scrolls down at exchange rate page
    #And User enters account title at add beneficary
    #When User enters Iban number at add beneficiary
    #And User enters remittance purpose at add beneficiary
    #And User clicks on save beneficiary button
    #Then User shouldnt be able to send money



  @Sendmoney @Sendmoney15
  Scenario: User sends money through bank transfer but sender amount is zero

    When User scrolls to the right
    And User clicks on Send Money Button
    And User clicks on Send Money at Send Money screen
    When User searches for country
    And User clicks on country they searched for
    And User clicks on the bank account button
    When User selects the first bank in the list
    And User clicks the confirm button
    When User enters the amount to zero
    And User scrolls down at exchange rate page
    And User clicks on next button at forgot password page



  @Sendmoney @Sendmoney16
  Scenario: User successfully sends money through bank transfer and enters other reason to send money

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
    And User enters phone number of beneficiary for a Pakistani number
    When User scrolls down at exchange rate page
    And User enters account title
    When User enters Iban number
    And User enters remittance purpose as other remittance purpose
    When User scrolls down at send money page again
    And User enters the reason for sending money
    And User clicks on next button at forgot password page
    When User clicks I agree terms and conditions box
    And User clicks on Send Money at confirmation screen
    And User enters valid OTP at send money flow
    And User clicks on next button at OTP screen
    Then User should be able to successfully send money