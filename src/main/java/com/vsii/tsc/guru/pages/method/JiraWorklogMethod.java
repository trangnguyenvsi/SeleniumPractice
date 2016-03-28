package com.vsii.tsc.guru.pages.method;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.vsii.tsc.guru.pages.JiraBrowseProjectPage;
import com.vsii.tsc.guru.pages.JiraProjectDetailPage;

public class JiraWorklogMethod {

	// Create new Web Driver variable
	WebDriver driver;
	// Create new WebElementLogin object
	public JiraBrowseProjectPage objJiraProjectPage = new JiraBrowseProjectPage();
	public JiraProjectDetailPage objJiraProjectDetailPage = new JiraProjectDetailPage();

	// Initialize all web element
	public JiraWorklogMethod(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, objJiraProjectPage);
		PageFactory.initElements(driver, objJiraProjectDetailPage);

	}

	//Click on JIRA project to view details
	public void clickProject(){
		objJiraProjectPage.getProjectName().click();
	}
	
	//Click on task
	public void clickTask(){
		objJiraProjectDetailPage.getTaskName().click();
	}
	
	//Click on "More..." tab on menu
	public void clickMore(){
		objJiraProjectDetailPage.getDropdownMore().click();
	}
	
	//Click to add worklog
	public void addWorklogOption(){
		objJiraProjectDetailPage.getLogWork().click();
	}
	
	//Set time spent
	public void setTimeSpent(String timeSpent){
		objJiraProjectDetailPage.getLogTime().sendKeys(timeSpent);
	}
	
	// Click submit log
	public void clickSubmitWorklog(){
		objJiraProjectDetailPage.getLogSubmit().click();
	}
	
	//EXECUTE ADD WORKLOG CASE
	public void addWorklog(String timeSpent){
		clickProject();
		clickTask();
		clickMore();
		addWorklogOption();
		setTimeSpent(timeSpent);
		clickSubmitWorklog();
	}
	
	//Click workog tab
	public void clickWorklogTab(){
		objJiraProjectDetailPage.getWorklogTab().click();
	}
	
	//Click edit worklog button
	public void clickEditWorklog(){
		objJiraProjectDetailPage.getEditWorklogOption().click();
	}
	
	//EXECUTE EDIT WORKLOG CASE
	public void updateWorklog(String timeSpent){
		clickWorklogTab();
		clickEditWorklog();
		setTimeSpent(timeSpent);
		clickSubmitWorklog();
	}
	
	//Click deleteWorklogOption
	public void clickDeleteWorklogOption(){
		objJiraProjectDetailPage.getDeleteWorklogOption().click();

	}
	
	//Click deleteWorklog
	public void submitDeleteWorklog(){
		objJiraProjectDetailPage.getDeleteWorklogBtn().click();
	}
	
	//EXECUTE DELETE WORKLOG CASE
	public void deleteWorklog(){
		clickWorklogTab();
		clickDeleteWorklogOption();
		submitDeleteWorklog();
	}
}
