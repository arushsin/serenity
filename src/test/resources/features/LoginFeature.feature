Feature: Login to the UI
  In order to be able to login
  As a potential user
  I want to be able to enter the password and username

  Scenario: Enter the username and password
    Given I am on the homepage
    Then I should enter the username arushi
    Then I should enter the password Pass-123
    And I click the login button

