package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.common.pages.BasePage;

public class LoginPage extends BasePage {

	@FindBy(name="username")
	public WebElement usernameField;
	
	@FindBy(name="password")
	public WebElement passwordField;
	
	@FindBy(xpath="//button[@type='submit']")
	public WebElement loginButton;
	
	@FindBy(xpath="//*[text()='Forgot your password? ']")
	public WebElement forgotPasswordLink;
	
	@FindBy(xpath = "//div[@class='orangehrm-login-branding']")
	public WebElement orangeHrmLogo;
	
	//Initializing page objects:
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void enterUsernameAndPassword(String username, String password) {
		usernameField.sendKeys(username);
		passwordField.sendKeys(password);
	}
	
	public void clickOnLoginButton() {
		loginButton.click();
	}
}
