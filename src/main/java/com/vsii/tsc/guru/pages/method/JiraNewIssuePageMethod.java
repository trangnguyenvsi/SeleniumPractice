package com.vsii.tsc.guru.pages.method;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import com.vsii.tsc.guru.pages.JiraNewIssuePage;

public class JiraNewIssuePageMethod {
	// Create new Web Driver variable
	WebDriver driver;
	// Create new WebElementLogin object
	public JiraNewIssuePage objJiraNewIssuePage = new JiraNewIssuePage();
	
	// Initialize all web element
	public JiraNewIssuePageMethod(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, objJiraNewIssuePage);
	}

	// Click create item
	public void clickCreate() {
		objJiraNewIssuePage.getCreateIssueBtn().click();
	}
	
	// Set issueType
	public void setIssueType(String issueType){
		objJiraNewIssuePage.getIssueTypeTxt().sendKeys(issueType);
		objJiraNewIssuePage.getIssueTypeTxt().sendKeys(Keys.TAB);
	}
	
	// Set summary text
	public void setSummaryText(String txtSummary){
		objJiraNewIssuePage.getIssueTypeTxt().sendKeys(txtSummary);
		objJiraNewIssuePage.getIssueTypeTxt().sendKeys(Keys.TAB);
	}
	
	// Click submit create button
	public void clickSubmitCreateBtn() {
		objJiraNewIssuePage.getSubmitCreateBtn().click();
	}
	
	// Create new issue
	public void createNewIssue(String issueType, String txtSummary){
		clickCreate();
		setIssueType(issueType);
		setSummaryText(txtSummary);
		clickSubmitCreateBtn();
	}
	
}
