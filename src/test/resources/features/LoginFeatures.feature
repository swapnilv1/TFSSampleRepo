Feature: Login Feature

Scenario Outline: Test user Login with different credentials
    Given Open Browser and navigate to Login page
    When valid "<username>" and "<password>" is entered
    Then User should be logged in successfully
Examples:
    | username   | password |
    | rahul@gmail.com | Test@123 |
    | xyz@gmail.com| Testtest |