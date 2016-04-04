package com.vsii.tsc.guru.pages.method;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.vsii.tsc.guru.pages.DetailProjectPage;
import com.vsii.tsc.guru.pages.ProjectsPage;

public class DetailProjectPageMethod {

	// Create new Web Driver variable
	WebDriver driver;
	// Create new WebElementLogin object
	public DetailProjectPage objDetailProjectPage = new DetailProjectPage();

	// Initialize all web element
	public DetailProjectPageMethod(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, objDetailProjectPage);
	}
	
	public void clickTasksBut() {
		objDetailProjectPage.getTasksBut().click();
	}
}
