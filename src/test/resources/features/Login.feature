@Login
Feature: Login

#  Background:
#    Given User is on Gramedia Landing Page

  @LoginRegistrasi
  Scenario: Login with email and password
    Given User is on Gramedia Landing Page
    When User click button Masuk
    And User input email "purwoajifahmia@gmail.com"
    And User input password "paris1732011"
    And User click button submit Masuk
    Then User is on Gramedia Homepage