@cucumber
Feature: User register with valid data

  Scenario: guest user could register with valid data successfully

    Given Click on register tab
    When User fill personal data
    And User hit enter
    Then User registered successfully
