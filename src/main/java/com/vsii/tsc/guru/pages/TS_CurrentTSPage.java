package com.vsii.tsc.guru.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TS_CurrentTSPage {

	@FindBy(xpath = "html/body/div[1]/table/tbody/tr[3]/td[1]/div[1]/div[5]/ul[3]/li[1]/a/span")
	private WebElement mnMyCurTimeSheet;

	@FindBy(className = "oe_timesheet_weekly")
	private WebElement tsTable;
	
	@FindBy(xpath = "/html/body/div/table/tbody/tr[3]/td[2]/div/div/table/tbody/tr[2]/td[1]/div/div/span[1]/div/button")						 
	private WebElement btnEdit;

	@FindBy(xpath = "/html/body/div[1]/table/tbody/tr[3]/td[2]/div/div/div/div[1]/div/div[4]/div/div/header/button[1]")						 
	private WebElement btnSubmit;
	
	@FindBy(xpath = "/html/body/div[1]/table/tbody/tr[3]/td[2]/div/div/div/div[1]/div/div[4]/div/div/header/ul/li[2]/span[1]")
	private WebElement lblStatus;
	
	public WebElement getBtnSubmit() {
		return btnSubmit;
	}

	public void setBtnSubmit(WebElement btnSubmit) {
		this.btnSubmit = btnSubmit;
	}

	public WebElement getLblStatus() {
		return lblStatus;
	}

	public void setLblStatus(WebElement lblStatus) {
		this.lblStatus = lblStatus;
	}

	public WebElement getBtnEdit() {
		return btnEdit;
	}

	public void setBtnEdit(WebElement btnEdit) {
		this.btnEdit = btnEdit;
	}

	public WebElement getTsTable() {
		return tsTable;
	}

	public void setTsTable(WebElement tsTable) {
		this.tsTable = tsTable;
	}

	public WebElement getMnMyCurTimeSheet() {
		return mnMyCurTimeSheet;
	}

	public void setMnMyCurTimeSheet(WebElement mnMyCurTimeSheet) {
		this.mnMyCurTimeSheet = mnMyCurTimeSheet;
	}

}
