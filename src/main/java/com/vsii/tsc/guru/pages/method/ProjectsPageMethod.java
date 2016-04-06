package com.vsii.tsc.guru.pages.method;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import com.vsii.tsc.guru.pages.ProjectsPage;

public class ProjectsPageMethod {

	// Create new Web Driver variable
	WebDriver driver;
	// Create new WebElementLogin object
	public ProjectsPage objProjectsPage = new ProjectsPage();

	// Initialize all web element
	public ProjectsPageMethod(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, objProjectsPage);
	}
	
	public void clickProjectLink() throws InterruptedException {
		objProjectsPage.getProjectLinktxt().click();
		Thread.sleep(4000);
	}
	
	public void chooseDepartment() throws InterruptedException {
		objProjectsPage.getDepartment().click();
		Thread.sleep(4000);
	}
	
	public void chooseProject() throws InterruptedException {
		objProjectsPage.getProject().click();
		Thread.sleep(4000);
	}
	
	public WebElement getProjectLinktxt() {
		return objProjectsPage.getProjectLinktxt();
	}
	
	public WebElement getDepartment() {
		return objProjectsPage.getDepartment();
	}
	
	public WebElement getProject() {
		return objProjectsPage.getProject();
	}

}
