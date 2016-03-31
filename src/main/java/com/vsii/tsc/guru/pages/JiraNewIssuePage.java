package com.vsii.tsc.guru.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class JiraNewIssuePage {
	
	// Identify the [Create] button
	@FindBy(id="create_link")
	private WebElement createIssueBtn;
	
	@FindBy(id="issuetype-field")
	private WebElement issueTypeTxt;
	
	@FindBy(id="summary")
	private WebElement summaryTxt;
	
	@FindBy(id="create-issue-submit")
	private WebElement submitCreateBtn;

	public WebElement getCreateIssueBtn() {
		return createIssueBtn;
	}

	public void setCreateIssueBtn(WebElement createIssueBtn) {
		this.createIssueBtn = createIssueBtn;
	}

	public WebElement getIssueTypeTxt() {
		return issueTypeTxt;
	}

	public void setIssueTypeTxt(WebElement issueTypeTxt) {
		this.issueTypeTxt = issueTypeTxt;
	}

	public WebElement getSummaryTxt() {
		return summaryTxt;
	}

	public void setSummaryTxt(WebElement summaryTxt) {
		this.summaryTxt = summaryTxt;
	}

	public WebElement getSubmitCreateBtn() {
		return submitCreateBtn;
	}

	public void setSubmitCreateBtn(WebElement submitCreateBtn) {
		this.submitCreateBtn = submitCreateBtn;
	}
}
