package com.vsii.tsc.guru.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class JiraDashboardPage {

	// Identify [Create] button on Dashboard page
	@FindBy(id = "create_link")
	private WebElement webCreateItem;
	
	// Identify Project menu drop-down list
	@FindBy(id = "browse_link")
	private WebElement webProjectDropdown;
	
	//Identify Issue menu drop down list
	@FindBy(id = "find_link")
	private WebElement webIssueDropdown;
	
	// Identify All projects dropdown 
	@FindBy(xpath="//div[2]/div[4]/ul/li/a")
	private WebElement allProjects;

	public WebElement getWebCreateItem() {
		return webCreateItem;
	}

	public void setWebCreateItem(WebElement webCreateItem) {
		this.webCreateItem = webCreateItem;
	}

	public WebElement getWebProjectDropdown() {
		return webProjectDropdown;
	}

	public void setWebProjectDropdown(WebElement webProjectDropdown) {
		this.webProjectDropdown = webProjectDropdown;
	}
	
	public WebElement getWebIssueDropdown() {
		return webIssueDropdown;
	}

	public void setWebIssueDropdown(WebElement webIssueDropdown) {
		this.webIssueDropdown = webIssueDropdown;
	}
	
	public WebElement getAllProjects() {
		return allProjects;
	}

	public void setAllProjects(WebElement allProjects) {
		this.allProjects = allProjects;
	}
}
