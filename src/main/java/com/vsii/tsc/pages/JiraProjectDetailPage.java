package com.vsii.tsc.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class JiraProjectDetailPage {

	//Identify Task Name
	@FindBy(xpath="//span[@class='issue-link-summary' and contains(text(),'Execute Test')]")
	private WebElement taskName;
	
	//Identify More... dropdown
	@FindBy(xpath=".//*[@id='opsbar-operations_more']/span[1]")
	private WebElement dropdownMore;
	
	//Identify Logwork function
	@FindBy(xpath=".//*[@id='log-work']/span")
	private WebElement logWork;
	
	//Identify work log text box
	@FindBy(xpath=".//*[@id='log-work-time-logged']")
	private WebElement logTime;
	
	//Identify date time picker
	@FindBy(xpath=".//*[@id='log-work-date-logged-date-picker']")
	private WebElement startTime;
	
	//Identify Logwork button
	@FindBy(xpath=".//*[@id='log-work-submit']")
	private WebElement logSubmit;
	
	// Identify worklog panel
	@FindBy(xpath=".//*[@id='worklog-tabpanel']/strong")
	private WebElement worklogTab;
	
	// Identify Edit worklog button
	@FindBy(xpath="//span[@class='icon-default aui-icon aui-icon-small aui-iconfont-edit' and contains(text(),'Edit')]")
	private WebElement editWorklogOption;
	
	//Identify Delete worklog button
	@FindBy(xpath="//span[@class='icon-default aui-icon aui-icon-small aui-iconfont-delete' and contains(text(),'Delete')]")
	private WebElement deleteWorklogOption;
	
	// Identify Delete worklog button
	@FindBy(xpath=".//*[@id='delete-log-work-submit']")
	private WebElement deleteWorklogBtn;

	public WebElement getTaskName() {
		return taskName;
	}

	public void setTaskName(WebElement taskName) {
		this.taskName = taskName;
	}

	public WebElement getDropdownMore() {
		return dropdownMore;
	}

	public void setDropdownMore(WebElement dropdownMore) {
		this.dropdownMore = dropdownMore;
	}

	public WebElement getLogWork() {
		return logWork;
	}

	public void setLogWork(WebElement logWork) {
		this.logWork = logWork;
	}

	public WebElement getLogTime() {
		return logTime;
	}

	public void setLogTime(WebElement logTime) {
		this.logTime = logTime;
	}

	public WebElement getStartTime() {
		return startTime;
	}

	public void setStartTime(WebElement startTime) {
		this.startTime = startTime;
	}

	public WebElement getLogSubmit() {
		return logSubmit;
	}

	public void setLogSubmit(WebElement logSubmit) {
		this.logSubmit = logSubmit;
	}

	public WebElement getWorklogTab() {
		return worklogTab;
	}

	public void setWorklogTab(WebElement worklogTab) {
		this.worklogTab = worklogTab;
	}

	public WebElement getEditWorklogOption() {
		return editWorklogOption;
	}

	public void setEditWorklogOption(WebElement editWorklogOption) {
		this.editWorklogOption = editWorklogOption;
	}

	public WebElement getDeleteWorklogOption() {
		return deleteWorklogOption;
	}

	public void setDeleteWorklogOption(WebElement deleteWorklogOption) {
		this.deleteWorklogOption = deleteWorklogOption;
	}

	public WebElement getDeleteWorklogBtn() {
		return deleteWorklogBtn;
	}

	public void setDeleteWorklogBtn(WebElement deleteWorklogBtn) {
		this.deleteWorklogBtn = deleteWorklogBtn;
	}
	
	
}
