@login
Feature: Login

  Rule: User needs to provide valid credentials in order to login.

  Example: Verify user can login with valid credentials

    Given User is on login page
    When User enters valid credentials
    Then User should be able to see products catalog