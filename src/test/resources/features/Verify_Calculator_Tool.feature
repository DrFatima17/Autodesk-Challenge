Feature: Verify Calculator Tool

  Scenario: Verify the Calculator Tool shows up on Google search
    Given user is navigated successfully to Google home page
    Then  user is able to see below calculator details:
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