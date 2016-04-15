package com.vsii.tsc.guru.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class VSIIProjectPage {
	
	// Identify Edit project button
	@FindBy(xpath="html/body/div[1]/table/tbody/tr[3]/td[2]/div/div/table/tbody/tr[2]/td[1]/div/div[2]/span[1]/div/button")
	private WebElement editProjectBtn;
	
	public WebElement getEditProjectBtn() {
		return editProjectBtn;
	}

	public void setEditProjectBtn(WebElement editProjectBtn) {
		this.editProjectBtn = editProjectBtn;
	}
	
	//Identify "Project" dropdown list
	@FindBy(xpath="html/body/div/table/tbody/tr[3]/td[2]/div/div/div/div[2]/div/div[4]/div/div/table/tbody/tr[4]/td[2]/span/div/input")
	private WebElement projectDropdown;

	public WebElement getProjectDropdown() {
		return projectDropdown;
	}

	public void setProjectDropdown(WebElement projectDropdown) {
		this.projectDropdown = projectDropdown;
	}

	// Identify "No verify worklogs" check box
	@FindBy(xpath="html/body/div[1]/table/tbody/tr[3]/td[2]/div/div/div/div[2]/div/div[4]/div/div/table/tbody/tr[3]/td[4]/span/input")
	private WebElement noVerifyWorklogchkbx;

	public WebElement getNoVerifyWorklogchkbx() {
		return noVerifyWorklogchkbx;
	}

	public void setNoVerifyWorklogchkbx(WebElement noVerifyWorklogchkbx) {
		this.noVerifyWorklogchkbx = noVerifyWorklogchkbx;
	}

	// Identify Save button
	@FindBy(xpath="html/body/div[1]/table/tbody/tr[3]/td[2]/div/div/table/tbody/tr[2]/td[1]/div/div[2]/span[2]/button")
	private WebElement saveBtn;

	public WebElement getSaveBtn() {
		return saveBtn;
	}

	public void setSaveBtn(WebElement saveBtn) {
		this.saveBtn = saveBtn;
	}
	
	// Identify the first row in Task Summary table
	@FindBy(xpath="//div/div/div[1]/div[2]/div/div/div/div/table/tbody/tr[1]")
	private WebElement firstRowInTaskSummary;

	public WebElement getFirstRowInTaskSummary() {
		return firstRowInTaskSummary;
	}

	public void setFirstRowInTaskSummary(WebElement firstRowInTaskSummary) {
		this.firstRowInTaskSummary = firstRowInTaskSummary;
	}
	
	
}