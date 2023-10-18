Feature: Test login functionality for Orange HRM Application

  Background: Login to the application
    Given User luanches Orange HRM login page
    When User enter username and password
    And User clicks on login button

  @Homepage
  Scenario: Verify login is successfull with valid credentials
    Then User should be logged into the application

  @Admin, @Smoke, @Regression
  Scenario Outline: Verify login is successfull with valid credentials
    Then User should be logged into the application
    When User selects "Chief Executive Officer" from the job title dropdown

    Examples: 
      | Username | Password |
      | Admin    | admin123 |
      | Admin    | admin123 |
      | Admin    | admin123 |
      | Admin    | admin123 |

  @Raj1
  Scenario: Verify login is successfull with valid credentials
    Then User should be logged into the application

  @Raj2
  Scenario: Verify login is successfull with valid credentials
    Then User should be logged into the application
