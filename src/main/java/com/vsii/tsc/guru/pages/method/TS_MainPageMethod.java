package com.vsii.tsc.guru.pages.method;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.vsii.tsc.guru.pages.TS_MainPage;

public class TS_MainPageMethod {
	WebDriver driver;
	TS_MainPage objMainPage = new TS_MainPage();	
	
	public TS_MainPageMethod(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, objMainPage);
	}
	
	public void clickHRPMO() throws InterruptedException {
		Thread.sleep(2000);
		objMainPage.getMnHRPMO().click();
	}
	
	public void clickHR() throws InterruptedException {
		Thread.sleep(5000);
		objMainPage.getMnHR().click();
	}
	
	public void clickDrpDwnMenu() {
		objMainPage.getDrpdwnMenu().click();
	}
	
	public void clickLogout() {
		objMainPage.getBtnLogout().click();
	}
}
