Feature: Login Functionality

  Scenario: Login with valid username and password

    Given Navigate to  basgar
    When  Enter username and password and click Login button
    Then User should login successfully