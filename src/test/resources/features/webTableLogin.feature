@smoke
Feature: Login Scenario

  Background: User is on cydeo web table login page
    Given User is on cydeo web table login page


  Scenario: Login Scenario For Web Table
    When User enter username "Test"
    And User enter password "Tester"
    And User click login button
    Then User sees URL ends with orders

  @demo
  Scenario: User should be able to see all 12 months in months dropdown
    When User enters below credentials
      | username | Test   |
      | password | Tester |
    Then User sees URL ends with orders


  Scenario: Login Scenario For Web Table
    When User enter username "Test" password "Tester" and clicks login
    Then User sees URL ends with orders

