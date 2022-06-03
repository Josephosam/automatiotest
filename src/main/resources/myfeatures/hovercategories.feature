@cucumber
Feature: User select different categories and sub-category

  Scenario: guest user could hover and select different categories

    When User hover and select random category
    When User click on random sub-category
    Then User redirect to sub-category page