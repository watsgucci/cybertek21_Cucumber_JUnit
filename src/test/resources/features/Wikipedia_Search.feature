@threads
Feature: Wikipedia Search
  As a user, I should be able to search terms and see related results

  @wiki1
  Scenario: Wikipedia search functionality title verification
    Given User is on Wiki home page
    When User types "Steve Jobs" in the wiki search box
    When User clicks Wiki search button
    Then User sees "Steve Jobs" is in the wiki title

  @wiki2
  Scenario: Wikipedia Search Functionality Header Verification
    Given User is on Wiki home page
    When User types "Steve Jobs" in the wiki search box
    When User clicks Wiki search button
    Then User sees "Steve Jobs" is in the main header

  @wikiOutline
  Scenario Outline: Wikipedia Search Functionality Header Verification
    Given User is on Wiki home page
    When User types "<searchValue>" in the wiki search box
    When User clicks Wiki search button
    Then User sees "<expectedMainHeader>" is in the main header
    Then User sees "<expectedTitle>" is in the wiki title

    Examples: search terms we are going to search in wikipedia
      | searchValue     | expectedMainHeader | expectedTitle   |
      | Steve Jobs      | Steve Jobs         | Steve Jobs      |
      | Albert Einstein | Albert Einstein    | Albert Einstein |
      | Kobe Bryant     | Kobe Bryant        | Kobe Bryant     |
      | Chuck Norris    | Chuck Norris       | Chuck Norris    |