Feature: Adding two numbers

  Scenario: Calculator should add two numbers
    Given n1 is 3
    And n2 is 4
    When user performs add operation
    Then the outcome result should be 7