#Author: your.email@your.domain.com
Feature: Select all the fields from the Employee information from Personal info tab

  Scenario Outline: Verify user is able to enter all the details in Employee information section
    Given User luanches Orange HRM login page
    When User enter username and password
    And User clicks on login button
    And User clicks on PIM tab button
    Then Verify PIM page is displayed
    When User enters "<EmployeeName>" "<EmployeeId>" details in Emplyee infromation section
    And User selects "<Employementsatus>" from the Employementsatus dropdown

    Examples: 
      | EmployeeName | EmployeeId | Employementsatus |
      | Raj          |       1234 | FullTime         |
			| Kumar        |       1235 | FullTime         |