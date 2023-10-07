Feature: Test login functionality for Orange HRM Application

  Scenario: Verify login is successfull with valid credentials
    Given User luanches Orange HRM login page
    When User enter username and password
    And User clicks on login button
    Then User should be logged into the application