Feature: Test Input forms data

  Scenario: User should be able to check the ckeck box
    Given user should be at basicCheckBoxDemo page of a website
    When user enters clicks on optionone checkBox
    And User clicks on CheckAll button
   Then All the check BoxexShould be checked
    Then Close the browser1