Feature: Course Search

  Scenario: Search for web dev course
    Given the user is on coursera homepage
    When the user searches for web developement courses
    And apply filter for language and level
    Then user should see courses  name, total learning hours and rating
