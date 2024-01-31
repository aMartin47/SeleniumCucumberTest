Feature: play the Number Game

  Scenario: play one game on Number Game
    Given User navigate to the Number Game Page
    When start the game with "Demo" options
    Then try to guess the result and get the number right in x tries

