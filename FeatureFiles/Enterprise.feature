Feature: Form filling

  Scenario: Filling the form with invalid email
    Given the user is on coursera homepage
    When the user clicks on For Enterprise
    Then enter the invalid credentials and click on submit
    And then capture the error message
