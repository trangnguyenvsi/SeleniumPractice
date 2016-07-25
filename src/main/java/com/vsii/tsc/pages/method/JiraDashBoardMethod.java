package com.vsii.tsc.pages.method;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.vsii.tsc.pages.JiraDashboardPage;

public class JiraDashBoardMethod {

	// Create new Web Driver variable
	WebDriver driver;
	// Create new WebElementLogin object
	public JiraDashboardPage objJiraDashboardPage = new JiraDashboardPage();
	
	// Initialize all web element
	public JiraDashBoardMethod(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, objJiraDashboardPage);

	}

	// Click project dropdown menu
	public void clickProjectDropdownMenu(){
		objJiraDashboardPage.getWebProjectDropdown().click();
	}
	
	// Click to view all projects
	public void clickAllProjects(){
		objJiraDashboardPage.getAllProjects().click();
	}
	
	// Click account option button
	public void clickAccountOption(){
		objJiraDashboardPage.getAccountOptions().click();
	}
	
	// Click lot out button
	public void clickLogOut(){
		objJiraDashboardPage.getLogOutBtn().click();
	}
	
	// LogOut
	public void exeLogOut(){
		clickAccountOption();
		clickLogOut();
	}
	
	// Create a new project
	public void createNewProject(String projectName, String projectKey){
		objJiraDashboardPage.getCreateProjectButton().click();
		objJiraDashboardPage.getBasicSoftwareOption().click();
		objJiraDashboardPage.getNextBtn().click();
		objJiraDashboardPage.getSelectBtn().click();
		objJiraDashboardPage.getProjectName().sendKeys(projectName);
		objJiraDashboardPage.getProjectKey().sendKeys(projectKey);
		objJiraDashboardPage.getSubmitBtn().click();
	}
}
