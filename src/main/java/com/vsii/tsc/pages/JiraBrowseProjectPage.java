package com.vsii.tsc.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class JiraBrowseProjectPage {
	
	//Project page can be reached at https://path/to/JIRA/projects
	
	//Identify Prject Name 
	@FindBy(xpath = "//a[contains(.,'Selenium Practice')]")
	private WebElement projectName;

	

	public WebElement getProjectName() {
		return projectName;
	}

	public void setProjectName(WebElement projectName) {
		this.projectName = projectName;
	}
	
	//Identify project administration button
	public WebElement projectAdminButton;



	public WebElement getProjectAdminButton() {
		return projectAdminButton;
	}

	public void setProjectAdminButton(WebElement projectAdminButton) {
		this.projectAdminButton = projectAdminButton;
	}
	
	
}
