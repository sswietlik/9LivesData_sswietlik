Feature: Checking Tab in browser
  Scenario: Page tab in browser should be "Factorial"
    When Open main page
    And get actual tab title
    Then Comparison expected tab vs. actual tab.
