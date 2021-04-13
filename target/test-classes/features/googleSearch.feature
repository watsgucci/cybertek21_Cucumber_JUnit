#@regression @smoke will make WHOLE feature file run when the tags are invoked
Feature: Google search functionality
  Agile Store: As a user, when I am on the google search page, I
  should be able to search whatever I want, and see
  relevant information
 #Scenario = Test

#Steps are re-usable!!
# @regression @smoke

    #@wip = work in progress
  Scenario: Search page title verification
    Given User is on Google home page
    Then User should see title is Google


  Scenario: User search title and verification
    Given User is on Google home page
    When User searched for apple
    Then User should see apple in the title

  @wipGoogle
  Scenario: User search title and verification
    Given User is on Google home page
      #parameterization below
    When User searched for "orange"
    Then User should see "orange" in the title

    @googleDataTable
  Scenario: Google home page footer links verification
    Given User is on Google home page
    Then User should see following links
      | Advertising      |
      | Business         |
      | How Search works |
      | Privacy          |
      | Terms            |




