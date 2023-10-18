package com.stepDefinitions;

import com.common.pages.BasePage;
import com.pages.AdminPage;

import io.cucumber.java.en.*;

public class AdminSteps extends BasePage {

	AdminPage adminPage;
	
	@When("Verify Admin page is displayed")
	public void verify_admin_page_isDisplayed() {
		adminPage = new AdminPage();
		adminPage.verifyAdminPageIsDisplayed();
	}
	
	@When("User clicks on \"{}\" dropdown")
	public void click_on_userRole_dropdown(String userRole) {
		adminPage.clickOnUserRoleDropdown(userRole);
	}
	
	@Then("Verify dropdown value \"{}\" is selected")
	public void verify_dropdown_value_is_selected(String userRole) {
		
	}
}
