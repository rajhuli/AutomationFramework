package com.pages;

import org.assertj.core.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.common.pages.BasePage;

public class AdminPage extends BasePage {
	
	public AdminPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//span[@class='oxd-topbar-header-breadcrumb']")
	public WebElement adminTitle;
	
	@FindBy(xpath = "//div[@class='oxd-input-group__label-wrapper']/label[text()='User Role']/following::*[1]")
	public WebElement userRoleDropdown;
	
	
	public void verifyAdminPageIsDisplayed() {
		String expTitle = "Admin/User Management";
		String actTitle = adminTitle.getText();
		System.out.println(actTitle);
		Assertions.assertThat(expTitle).contains(actTitle);
	}
	
	public void clickOnUserRoleDropdown(String userRole) {
//		List<WebElement> allDropdownValues = userRoleDropdown.findElements(By.tagName(""))
		String actDropdownValue = sel.getOptions();
	}
	
	
}
