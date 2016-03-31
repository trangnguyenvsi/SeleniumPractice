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
	
	// Identify account options link
	@FindBy(xpath="//div[1]/header/nav/div/div[2]/ul/li[3]")
	private WebElement accountOptions;
	
	// Identify Logout button
	@FindBy(xpath="//div[2]/div[3]/ul/li/a")
	private WebElement logOutBtn;
	
	// Identify Create project button
	@FindBy(linkText="Create project")
	private WebElement createProjectButton;
	
	// Identify basic software option
	@FindBy(xpath="html/body/div[2]/div[3]/div[1]/div/div[1]/div[2]/ol/li[3]/div")
	private WebElement basicSoftwareOption;
	
	// Identify [Next] button in create new project
	@FindBy(xpath="html/body/div[2]/div[3]/div[2]/button")
	private WebElement nextBtn;
	
	// Identify [Select] button in create new project
	@FindBy(xpath="html/body/div[2]/div[4]/div[2]/button[2]")
	private WebElement selectBtn;
	
	// Identify project name
	@FindBy(xpath="html/body/div[2]/div[5]/div[1]/div/div/div[1]/form/fieldset/div[1]/input")
	private WebElement projectName;
	
	// Identify project Lead textbox
	@FindBy(xpath="html/body/div[2]/div[5]/div[1]/div/div/div[1]/form/fieldset/div[2]/input")
	private WebElement projectKey;
	
	// Identify submit button
	@FindBy(xpath="html/body/div[2]/div[5]/div[2]/button[2]")
	private WebElement submitBtn;
	

	public WebElement getCreateProjectButton() {
		return createProjectButton;
	}

	public void setCreateProjectButton(WebElement createProjectButton) {
		this.createProjectButton = createProjectButton;
	}

	public WebElement getBasicSoftwareOption() {
		return basicSoftwareOption;
	}

	public void setBasicSoftwareOption(WebElement basicSoftwareOption) {
		this.basicSoftwareOption = basicSoftwareOption;
	}

	public WebElement getNextBtn() {
		return nextBtn;
	}

	public void setNextBtn(WebElement nextBtn) {
		this.nextBtn = nextBtn;
	}

	public WebElement getSelectBtn() {
		return selectBtn;
	}

	public void setSelectBtn(WebElement selectBtn) {
		this.selectBtn = selectBtn;
	}

	public WebElement getProjectName() {
		return projectName;
	}

	public void setProjectName(WebElement projectName) {
		this.projectName = projectName;
	}

	public WebElement getProjectKey() {
		return projectKey;
	}

	public void setProjectLead(WebElement projectKey) {
		this.projectKey = projectKey;
	}

	public WebElement getSubmitBtn() {
		return submitBtn;
	}

	public void setSubmitBtn(WebElement submitBtn) {
		this.submitBtn = submitBtn;
	}

	public WebElement getAccountOptions() {
		return accountOptions;
	}

	public void setAccountOptions(WebElement accountOptions) {
		this.accountOptions = accountOptions;
	}

	public WebElement getLogOutBtn() {
		return logOutBtn;
	}

	public void setLogOutBtn(WebElement logOutBtn) {
		this.logOutBtn = logOutBtn;
	}

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
