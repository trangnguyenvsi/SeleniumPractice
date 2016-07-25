package com.vsii.tsc.pages.method;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.vsii.tsc.pages.JiraBrowseProjectPage;

public class JiraBrowseProjectPageMethod {

	// Create new Web Driver variable
	WebDriver driver;
	// Create new WebElementLogin object
	public JiraBrowseProjectPage objJiraProjectPage = new JiraBrowseProjectPage();
	// Initialize all web element
	public JiraBrowseProjectPageMethod(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, objJiraProjectPage);
	}
	
	// Click administration menu
	public void clickAdminMenu(){
		objJiraProjectPage.getProjectAdminButton().click();
	}
	
	//Click on JIRA project to view details
	public void clickChooseProject(){
		objJiraProjectPage.getProjectName().click();
	}
	
	
	
}
