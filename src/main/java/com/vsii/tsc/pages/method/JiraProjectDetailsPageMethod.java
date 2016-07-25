package com.vsii.tsc.pages.method;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.vsii.tsc.pages.JiraProjectDetailPage;

public class JiraProjectDetailsPageMethod {

	// Create new Web Driver variable
	WebDriver driver;
	// Create new WebElementLogin object
	public JiraProjectDetailPage objJiraProjectDetailPage = new JiraProjectDetailPage();
	

	// Initialize all web element
	public JiraProjectDetailsPageMethod(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, objJiraProjectDetailPage);

	}
	
	//Click on task
	public void clickChooseTask(){
		objJiraProjectDetailPage.getTaskName().click();
	}
	
	//Click on "More..." tab on menu
	public void clickOnMore(){
		try{
			objJiraProjectDetailPage.getDropdownMore().click();
		}catch(org.openqa.selenium.StaleElementReferenceException ex){
			objJiraProjectDetailPage.getDropdownMore().click();
		}
	}
	
	//Click to add worklog
	public void addWorklogOption(){
		objJiraProjectDetailPage.getLogWork().click();
	}
	
	//Set time spent
	public void setTimeSpent(String timeSpent){
		objJiraProjectDetailPage.getLogTime().sendKeys(timeSpent);
		objJiraProjectDetailPage.getLogTime().sendKeys(Keys.TAB);
	}
	
	// Set start time log
	public void setStartTime(String startTime){
		objJiraProjectDetailPage.getStartTime().sendKeys(startTime);
	}
	
	// Click submit log
	public void clickSubmitWorklog(){
		objJiraProjectDetailPage.getLogSubmit().click();
	}
	
	// CREATE NEW WORKLOG
	public void createNewWorklog(String DefLoggedHour){
		clickOnMore();
		addWorklogOption();
		setTimeSpent(DefLoggedHour);
		clickSubmitWorklog();
	}
	
	//Click workog tab
	public void clickWorklogTab(){
		try{
			objJiraProjectDetailPage.getWorklogTab().click();
		}catch(org.openqa.selenium.StaleElementReferenceException ex){
			objJiraProjectDetailPage.getWorklogTab().click();
		}
	}
	
	//Click edit worklog button
	public void clickEditWorklog(){
		objJiraProjectDetailPage.getEditWorklogOption().click();
	}
	
	//Click deleteWorklogOption
	public void clickDeleteWorklogOption(){
		objJiraProjectDetailPage.getDeleteWorklogOption().click();

	}
	
	//Click deleteWorklog
	public void submitDeleteWorklog(){
		objJiraProjectDetailPage.getDeleteWorklogBtn().click();
	}
}
