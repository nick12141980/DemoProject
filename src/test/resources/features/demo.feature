Feature: Wikipedia search

Scenario: Wikipedia search test

    Given user is on the main page
    When user enters a name in the search box
    And user clicks search button
    Then user is navigated to correct page
