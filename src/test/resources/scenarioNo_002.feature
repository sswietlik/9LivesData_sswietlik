Feature: Checking correct numbers

  Scenario Outline:
    When I open main page.
    And I fill in with "<digit>"
    And Push calculate button
    Then Check feedback information from page




    Examples:
      |digit|
      |0    |
      |3    |
      |2    |
      |99   |
      |170  |
