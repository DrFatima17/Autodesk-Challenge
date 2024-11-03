Feature: Verify Calculator Tool

  Scenario: Verify the Calculator Tool shows up on Google search
    Given user is navigated successfully to Google home page
    #And user clicks on Stay Signed Out button
#    And user clicks on Seach Bar
#  When user types the term "calculator"
#    And user clicks on enter button on keyboard
    Then button 0 is displayed
    And button 1 is displayed
    And button 2 is displayed
    And button 3 is displayed
    And button 4 is displayed
    And button 5 is displayed
    And button 6 is displayed
    And button 7 is displayed
    And button 8 is displayed
    And button 9 is displayed
    And button = is displayed
    And button + is displayed
    And button - is displayed
    And button * is displayed
    And button / is displayed
    And button AC is displayed