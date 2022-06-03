@cucumber
Feature: User login with valid credentials


  Scenario: guest could Login with valid credentials

    Given User navigate to website F02
    And User click on Login tab
    When User enter email and password and login
    Then User message success