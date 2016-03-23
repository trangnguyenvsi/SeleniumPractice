package com.vsii.tsc.guru.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class JiraAllIssuesPage {
	
	//Identify "More..." drop down
	@FindBy(linkText = "More")
	private WebElement webMoreDropdown;
	
	// Identify "Log work" option
	@FindBy(linkText = "Log Work")
	private WebElement webLogWorkOption;
	
	// Identify time spent text box
	@FindBy(id="log-work-time-logged")
	private WebElement webTimeSpent;
	
	// Identify logging date time field
	@FindBy(id="log-work-date-logged-date-picker")
	private WebElement webLogDate;
	
	// Identify remaining estimate time group
	@FindBy(xpath = "html/body/div[9]/div[2]/form/div[1]/fieldset/fieldset")
	private WebElement webRemainingTime;
	
		//Identify remaining time radio 1: Automatically
		@FindBy( id="log-work-adjust-estimate-auto")
		private WebElement webRemainingRadio1;
		
		//Identify remaining time radio 2: Use existing time
		@FindBy(id="log-work-adjust-estimate-leave")
		private WebElement webRemainingRadio2;
		
		//Identify remaining time radio 3: Set to
		@FindBy(id="log-work-adjust-estimate-new")
		private WebElement webRemainingRadio3;
		
			// Identify remaining time : Set to VALUE
			@FindBy(id="log-work-adjust-estimate-new-value")
			private WebElement webRadio3Value;
			
		// Identify remaining time radio 4
		@FindBy(id="log-work-adjust-estimate-manual")
		private WebElement webRemainingRadio4;
		
			//Identify remaining time: Reduce by VALUE
			@FindBy(id="log-work-adjust-estimate-manual-value")
			private WebElement webRadio4Value;
			
	// Identify comment text area
	@FindBy(id="comment")
	private WebElement webComment;
	
	// Identify log submit button
	@FindBy(id="log-work-submit")
	private WebElement webLogSubmit;

	public WebElement getWebMoreDropdown() {
		return webMoreDropdown;
	}

	public void setWebMoreDropdown(WebElement webMoreDropdown) {
		this.webMoreDropdown = webMoreDropdown;
	}

	public WebElement getWebLogWorkOption() {
		return webLogWorkOption;
	}

	public void setWebLogWorkOption(WebElement webLogWorkOption) {
		this.webLogWorkOption = webLogWorkOption;
	}

	public WebElement getWebTimeSpent() {
		return webTimeSpent;
	}

	public void setWebTimeSpent(WebElement webTimeSpent) {
		this.webTimeSpent = webTimeSpent;
	}

	public WebElement getWebLogDate() {
		return webLogDate;
	}

	public void setWebLogDate(WebElement webLogDate) {
		this.webLogDate = webLogDate;
	}

	public WebElement getWebRemainingTime() {
		return webRemainingTime;
	}

	public void setWebRemainingTime(WebElement webRemainingTime) {
		this.webRemainingTime = webRemainingTime;
	}

	public WebElement getWebRemainingRadio1() {
		return webRemainingRadio1;
	}

	public void setWebRemainingRadio1(WebElement webRemainingRadio1) {
		this.webRemainingRadio1 = webRemainingRadio1;
	}

	public WebElement getWebRemainingRadio2() {
		return webRemainingRadio2;
	}

	public void setWebRemainingRadio2(WebElement webRemainingRadio2) {
		this.webRemainingRadio2 = webRemainingRadio2;
	}

	public WebElement getWebRemainingRadio3() {
		return webRemainingRadio3;
	}

	public void setWebRemainingRadio3(WebElement webRemainingRadio3) {
		this.webRemainingRadio3 = webRemainingRadio3;
	}

	public WebElement getWebRadio3Value() {
		return webRadio3Value;
	}

	public void setWebRadio3Value(WebElement webRadio3Value) {
		this.webRadio3Value = webRadio3Value;
	}

	public WebElement getWebRemainingRadio4() {
		return webRemainingRadio4;
	}

	public void setWebRemainingRadio4(WebElement webRemainingRadio4) {
		this.webRemainingRadio4 = webRemainingRadio4;
	}

	public WebElement getWebRadio4Value() {
		return webRadio4Value;
	}

	public void setWebRadio4Value(WebElement webRadio4Value) {
		this.webRadio4Value = webRadio4Value;
	}

	public WebElement getWebComment() {
		return webComment;
	}

	public void setWebComment(WebElement webComment) {
		this.webComment = webComment;
	}

	public WebElement getWebLogSubmit() {
		return webLogSubmit;
	}

	public void setWebLogSubmit(WebElement webLogSubmit) {
		this.webLogSubmit = webLogSubmit;
	}

}
