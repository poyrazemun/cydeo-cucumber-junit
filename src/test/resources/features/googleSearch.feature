@google @smoke
Feature: Google search functionality
  Agile story: As a user, when I am on the Google search page
  I should be able to search whatever I want and see relevant information

  Scenario: Search page title verification
    When user is on Google search page
    Then user should see title is Google


  Scenario: Search functionality result title verification
    Given user is on Google search page
    When user types apple and clicks enter
    Then user sees apple in the google title

@wip
  Scenario: Search functionality result title verification
    Given user is on Google search page
    When user types "apple" and clicks enter
    Then user sees "apple" in the google title

@wip
  Scenario: Search functionality in a Data Driven Testing Format
    Given user is on Google search page
    When user types "capital of Australia" and clicks enter
    Then user should see "Canberra" in the result

@wip
  Scenario Outline: Search functionality in a Data Driven Testing Format
    Given user is on Google search page
    When user types "capital of <country>" and clicks enter
    Then user should see "<capital>" in the result
    Examples:
      | country | capital |
      | Turkey  | Ankara  |
      | Latvia  | Riga    |
      | Germany | Berlin  |
      | UK      | London  |

