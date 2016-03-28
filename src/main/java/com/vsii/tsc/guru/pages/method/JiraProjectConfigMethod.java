package com.vsii.tsc.guru.pages.method;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.vsii.tsc.guru.pages.JiraBrowseProjectPage;
import com.vsii.tsc.guru.pages.JiraProjectConfigPage;

public class JiraProjectConfigMethod {
	
	// Create new Web Driver variable
		WebDriver driver;
		// Create new WebElementLogin object
		public JiraBrowseProjectPage objJiraProjectPage = new JiraBrowseProjectPage();
		public JiraProjectConfigPage objProjectConfigPage = new JiraProjectConfigPage();
		
		// Initialize all web element
		public JiraProjectConfigMethod(WebDriver driver) {
			this.driver = driver;
			PageFactory.initElements(driver, objJiraProjectPage);

		}
	
	// Click administration menu
	public void clickAdminMenu(){
		objJiraProjectPage.getProjectAdminButton().click();
	}
	
	//Click Users and Roles option
	public void clickUserAndRole(){
		objProjectConfigPage.getUsersAndRoles().click();
	}
	
	// Click add new user option
	public void clickAddNewUserOption(){
		objProjectConfigPage.getAddNewUserOption().click();
	}
	
	// Set user to be added
	public void setUserName(String user){
		objProjectConfigPage.getUserPicker().sendKeys(user);
	}
	
	// Set user role
	public void setUserRole(String role){
		objProjectConfigPage.getRolePicker().sendKeys(role);
	}
	
	//Click add new user
	public void clickAddNewUser(){
		objProjectConfigPage.getAddUserBtn().click();
	}

	//EXECUTE ADDING NEW USER TO PROJECT
	public void addNewUserToProject(String user, String role){
		clickAdminMenu();
		clickUserAndRole();
		clickAddNewUserOption();
		setUserName(user);
		setUserRole(role);
		clickAddNewUser();
	}
	
	
}
