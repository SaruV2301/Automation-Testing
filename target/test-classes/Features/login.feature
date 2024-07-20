@LoginFeature
Feature: Feature to login

  Scenario: Checking login functionality

  Scenario Outline: 
    Given user1 opens browser
    When enters userid
    And user enters password
    Then user click the login button

    Examples: 
      | userid    |  | password    |
      | sarulatha |  | Loveisgod@1 |
