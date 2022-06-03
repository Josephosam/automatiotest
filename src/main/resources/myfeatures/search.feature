@cucumber
Feature: User search for products with Name and SKU

  Scenario: guest user could search for any product using Name
    When User enter apple in search box and hit enter
    Then User found nokia product

  Scenario: guest user could search for any product using SKU

    When User enter AP_MBP_13 in search box and hit enter
    Then User found nokia product