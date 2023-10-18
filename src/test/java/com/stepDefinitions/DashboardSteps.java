package com.stepDefinitions;

import com.common.pages.BasePage;
import com.pages.DashboardPage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DashboardSteps extends BasePage {
	DashboardPage dashboardPage;
	
	@Then("User should be logged into the application")
	public void user_should_be_logged_into_the_application() {
		dashboardPage = new DashboardPage();
		dashboardPage.verifyDashboardIsDisplayed();
	}

	@When("User selects {string} from the job title dropdown")
	public void selectJobTitleDropdown(String jobTitle) {
		dashboardPage.select_jobTitleDropddownValue(jobTitle);
	}
	
	@When("User clicks on Admin tab")
	public void click_on_admin_tab() {
		dashboardPage.clickOnAdminTab();
	}
}
