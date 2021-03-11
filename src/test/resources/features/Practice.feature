Feature: User Goes to practice page
  Scenario: User is able to use practice page
    Given The user goes to practice URL
    Then User clicks on practice example
    When The page opens (Verification)
    Then User adds an element
    And User deletes an element