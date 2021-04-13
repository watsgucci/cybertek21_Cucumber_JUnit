@LibraryFeature
Feature: Library app login feature
  As a user, I should be able to login with correct credentials to
  different accounts. And dashboard should be displayed.
  Accounts are: librarian, student, admin

  #Background is like the before method
  Background: User is already in login page
    Given user is on the login page

  @Librarian
  Scenario:

    When User enters librarian username
    When User enter librarian password
    Then user should see the dashboard

 #alt+enter

  @Student
  Scenario: Login as student

    When User enters student username
    And User enter student password
    Then user should see the dashboard

  @Admin @Employee
  Scenario: Login as admin

    When User enters admin username
    And User enter admin password
    Then user should see the dashboard