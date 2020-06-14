Feature: Test Input forms data

  Scenario: User should be able to enter test in text box
    Given user is at home page of a website
    When user enters text "Testing" in EnterMessage Box
    And User clicks on Show Message
    Then Entered text "Testing" Should be displayed
    Then Close the browser

  Scenario Outline: User should be able to enter test in text box
    Given user is at home page of a website
    When  user enters text "<text>" in EnterMessage Box
    And User clicks on Show Message
    Then Entered text "<text>" Should be displayed
    Then Close the browser
  Examples:
    |text|
    |Rahul1|
    |Rahul2|