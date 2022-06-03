@cucumber
Feature: User could click on homesliders

  Background: User go to homepage

  Scenario: Click on banner on slider wrapper
    When  Click on first slider
    Then  User could click on the banner and redirect to the product link