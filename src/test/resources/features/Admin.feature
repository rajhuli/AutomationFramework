#Author: your.email@your.domain.com
@tag
Feature: I want to test the User role dropdown from the Admin page

  @tag1
  Scenario Outline: Verify User is able to select the role dropdown values from the Admin page
    Given I want to write a step with precondition
    Given User luanches Orange HRM login page
    When User enter username and password
    And User clicks on login button
    Then User should be logged into the application
    When User clicks on Admin tab
    Then Verify Admin page is displayed
    When User clicks on "<UserRole>" dropdown
    Then Verify dropdown value "<UserRole>" is selected 
    

    Examples: 
      | UserRole |
      | Admin    |
      | ESS      |
