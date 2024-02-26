Feature: Extract languages and level

  Scenario: Search for language learning
    Given the user is on coursera homepage
    When the user searches for language learning
    Then user should store contents of  levels and languages
