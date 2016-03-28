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
	
	public void clickProjectLink() {
		objProjectsPage.getProjectLinktxt().click();
	}
	
	public void chooseDepartment() {
		objProjectsPage.getDepartment().click();
	}
	
	public void chooseProject() {
		objProjectsPage.getProject().click();
	}
	
	public void chooseTestProject(){
		objProjectsPage.getTestProject().click();
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
	
	
	// Click on Task button
	public void clickTaskBtn(){
		try{
			objProjectsPage.getBtnTasks().click();
		}catch(org.openqa.selenium.StaleElementReferenceException ex){
			objProjectsPage.getBtnTasks().click();
		}
	}
}
