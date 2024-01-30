Feature: use the Basic Calculator

  Scenario: makes a sum
    Given User navigate to the Basic Calculator Page
    When add the two numbers
    And select a sum operation
    Then the calculator shows the right result


