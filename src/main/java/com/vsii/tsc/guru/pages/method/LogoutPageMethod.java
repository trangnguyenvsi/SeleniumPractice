package com.vsii.tsc.guru.pages.method;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.vsii.tsc.guru.pages.LogoutPage;

public class LogoutPageMethod {
	// Create new Web Driver variable
	WebDriver driver;
	// Create new WebElementLogin object
	public LogoutPage objLoginPage = new LogoutPage();

	// Initialize all web element
	public LogoutPageMethod(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, objLoginPage);
	} 
	
	public void performLogout() throws InterruptedException {
		objLoginPage.getUserNametxt().click();
		objLoginPage.getLogoutButt().click();
		Thread.sleep(5000);
	}
}
