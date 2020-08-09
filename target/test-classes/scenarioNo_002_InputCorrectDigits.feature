Feature: Testing input field with correct digits

  Scenario: Testing correct digits
    Given Opened factorial main page
    When Localize input field and insert correct <numbers>
    Then Find submit button and click
    Then Check is it True with "getFactorial"