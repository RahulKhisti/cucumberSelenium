Feature: Test Input forms data

  Scenario: User should be able to enter test in text box
    Given user is at home page of a website
    When user enters text "Testing" in EnterMessage Box
    And User clicks on Show Message
    Then Entered text "Testing" Should be displayed

#  Scenario: User should be able to enter test in text box
#    Given user is at home page of a website
#    When  user enters Text in EnterMessage Box
#    |rahul|
#    |Rahul1|
#    |Rahul2|
#    And User clicks on Show Message
#    Then Entered1 text Should be displayed
#    |rahul|