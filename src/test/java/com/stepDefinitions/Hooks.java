package com.stepDefinitions;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.common.pages.BasePage;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks extends BasePage {

	@Before
	public void setUp() throws InterruptedException {
		BasePage.initialization();
	}
	
	@AfterStep(order=1)
	public void takeScreenshots(Scenario sc) {
		if(sc.isFailed()) {
			TakesScreenshot scrnsht = (TakesScreenshot) driver;
			byte[] screenshot = scrnsht.getScreenshotAs(OutputType.BYTES);
			sc.attach(screenshot, "img/png", "screen shots for Failed Scenarios");
		} /*
			 * else { TakesScreenshot scrnsht = (TakesScreenshot) driver; byte[] screenshot
			 * = scrnsht.getScreenshotAs(OutputType.BYTES); sc.attach(screenshot, "img/png",
			 * "screen shots for Pass Scenarios"); }
			 */
	}
	
	@After(order=0)
	public void tearDown() {
		driver.close();
	}
}
