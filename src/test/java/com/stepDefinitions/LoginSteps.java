package com.stepDefinitions;

import org.assertj.core.api.Assertions;

import com.common.pages.BasePage;
import com.pages.LoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps extends BasePage {
	
	LoginPage loginPage;

	@Given("User luanches Orange HRM login page")
	public void user_luanches_orange_hrm_login_page() throws Exception {
		loginPage = new LoginPage();
		waitForElement(loginPage.orangeHrmLogo);
		Assertions.assertThat(loginPage.orangeHrmLogo.isDisplayed()).isTrue();
		System.out.println("Login page is displayed");
		System.out.println("Login page is displayed");
		
	}

	@When("User enter username and password")
	public void user_enter_username_and_password() {
	    
	}

	@When("User clicks on login button")
	public void user_clicks_on_login_button() {
	    
	}

	@Then("User should be logged into the application")
	public void user_should_be_logged_into_the_application() {
	   
	}

	
}
