package com.pages;

import java.util.Iterator;
import java.util.List;

import org.assertj.core.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.common.pages.BasePage;

public class DashboardPage extends BasePage {

	@FindBy(xpath = "//h6[text()='Dashboard']")
	public WebElement dashboardTitle;
	
	@FindBy(xpath = "//span[text()='Admin']")
	public WebElement adminTabButton;
	
	public DashboardPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void verifyDashboardIsDisplayed() {
		String expTitle = "Dashboard";
		waitForElement(dashboardTitle);
		String actTitle = dashboardTitle.getText();
		Assertions.assertThat(expTitle).isEqualTo(actTitle);
		System.out.println("Assertion passed");
	}
	
	public void select_jobTitleDropddownValue(String jobTitle) {
//		Select sel = new Select(element);
//		sel.selectByValue(jobTitle);
		List<WebElement> allValues = driver.findElements(By.tagName("option"));
		for(WebElement ele: allValues) {
			if (ele.getText().contains(jobTitle)) {
				ele.click();	
			}
			
		}
	}
	
	public void clickOnAdminTab() {
		adminTabButton.click();
	}
}
