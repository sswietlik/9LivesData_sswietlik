Feature: Testing input field

  Scenario Outline: Testing unaccepted digits
    Given Opened main page
    And  Localize input field and insert incorrect "<digits>"
    And Push calculate button to verify result
    Then Check error message
    Examples:
    |digits|
    |A     |
    |Z     |
    |-0    |
    |+0    |
    |+170  |
    |-1    |
    |171   |
    |-2    |
    |172   |
    |0.0   |
    |0.1   |
    |0.8   |
    |0.9   |
    |170.0 |
    |170.1 |
    |170.8 |
    |170.9 |
    |-0.0  |
    |-0.1  |
    |-0.9  |
    |+0.0  |
    |+0.1  |
    |+0.9  |
    |+170  |
    |+170.1|
    |+170.9|









