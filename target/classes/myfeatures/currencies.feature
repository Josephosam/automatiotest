@Cucumber

Feature: User switch between currencies

  Scenario:  user could switch between currencies

    When User Select Euro from currency dropdown list
    Then Currency has been changed from US to Euro