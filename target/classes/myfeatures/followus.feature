@cucumber
Feature: Follow us links open the corresponding websites

  Scenario: confirm "follow us" links open the right websites

    When User click on Facebook and Twitter and Youtube and Rss
    Then Facebook page opens and Twitter page opens and Youtube page opens and RSS page opens

