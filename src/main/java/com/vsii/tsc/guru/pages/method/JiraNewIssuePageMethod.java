package com.vsii.tsc.guru.pages.method;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.vsii.tsc.guru.pages.JiraDashboardPage;
import com.vsii.tsc.guru.pages.JiraNewIssuePage;

public class JiraNewIssuePageMethod {
	// Create new Web Driver variable
	WebDriver driver;
	// Create new WebElementLogin object
	public JiraNewIssuePage objJiraNewIssuePage = new JiraNewIssuePage();
	public JiraDashboardPage objJiraDashboardPage = new JiraDashboardPage();
	
	// Initialize all web element
	public JiraNewIssuePageMethod(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, objJiraNewIssuePage);
	}

	// Click create item
	public void clickCreate(String txtJiraUsrName) {
		objJiraDashboardPage.getWebCreateItem().click();
	}
	
	// Choose project from list
	public void choosoProject(String project){
		new Select(objJiraNewIssuePage.getWebProjectList()).selectByVisibleText(project);
	}
	// 
	
}
