Feature: Verify Calculator Tool
  Scenario: Verify the Calculator Tool shows up on Google search
    Given user is navigated successfully to Google home page
    And user clicks on Stay Signed Out button
    And user clicks on Seach Bar
  When user types the term "calculator"
    And user clicks on enter button on keyboard
    Then  user is able to see the calculator details:
      | button | isDisplayed |
      | 0      | true        |
      | 1      | true        |
      | 2      | true        |
      | 3      | true        |
      | 4      | true        |
      | 5      | true        |
      | 6      | true        |
      | 7      | true        |
      | 8      | true        |
      | 9      | true        |
      | =      | true        |
      | +      | true        |
      | -      | true        |
      | *      | true        |
      | /      | true        |
      | AC     | true        |