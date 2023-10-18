package com.stepDefinitions;

import com.pages.PersonalInfoPage;

import io.cucumber.java.en.When;

public class PersonalInfoStep {

	PersonalInfoPage personalInfoPage;
	@When("User enters \"{}\" \"{}\" details in Emplyee infromation section")
	public void user_enters_data_in_emp_info_section(String empName, String empId) {
		personalInfoPage.enterEmpNameAndEmpId(empName, empId);
	}
}
