package com.vsii.tsc.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TS_MyTimesheetPage {

	@FindBy(xpath = "/html/body/div/table/tbody/tr[3]/td[2]/div/div/table/tbody/tr[2]/td[1]/div/div[2]/span[1]/div/button")						 
	private WebElement btnEdit;
	
	@FindBy(className = "oe_timesheet_weekly_input")						 
	private WebElement txtTime;

	@FindBy(xpath = "/html/body/div/table/tbody/tr[3]/td[2]/div/div/table/tbody/tr[2]/td[1]/div/div[2]/span[2]/button")			
	private WebElement btnSave;
	
	@FindBy(xpath = "/html/body/div/table/tbody/tr[3]/td[2]/div/div/table/tbody/tr[2]/td[1]/div/div[2]/span[2]/a")			
	private WebElement btnDiscard;
	
	@FindBy(xpath = "/html/body/div/table/tbody/tr[3]/td[2]/div/div/div/div[2]/div/div[4]/div/div/div[1]/div/div[3]/div[1]/div/div/table/tbody/tr[5]/td[9]")			
	private WebElement lblTotalTS;
	
	@FindBy(className = "oe_list_content")
	private WebElement tblMyTS;

	@FindBy(xpath = "html/body/div[1]/table/tbody/tr[3]/td[2]/div/div/div/div[2]/div/div[4]/div/div/div[1]/div/div[2]/h1/span/a")
	private WebElement empName;

	@FindBy(className = "oe_timesheet_weekly")
	private WebElement tblTSWeekly;

	@FindBy(linkText = "Details")
	private WebElement tabDetails;
	
	@FindBy(className = "oe_list_content")
	private WebElement tblDetails;
//	
//	@FindBy(xpath = "")
//	private WebElement chkboxToDel;

	public WebElement getTblDetails() {
		return tblDetails;
	}

	public void setTblDetails(WebElement tblDetails) {
		this.tblDetails = tblDetails;
	}

	public WebElement getTabDetails() {
		return tabDetails;
	}

	public void setTabDetails(WebElement tabDetails) {
		this.tabDetails = tabDetails;
	}

	public WebElement getTblTSWeekly() {
		return tblTSWeekly;
	}

	public void setTblTSWeekly(WebElement tblTSWeekly) {
		this.tblTSWeekly = tblTSWeekly;
	}

	public WebElement getEmpName() {
		return empName;
	}

	public void setEmpName(WebElement empName) {
		this.empName = empName;
	}

	public WebElement getTblMyTS() {
		return tblMyTS;
	}

	public void setTblMyTS(WebElement tblMyTS) {
		this.tblMyTS = tblMyTS;
	}
	
	public WebElement getLblTotalTS() {
		return lblTotalTS;
	}

	public void setLblTotalTS(WebElement lblTotalTS) {
		this.lblTotalTS = lblTotalTS;
	}

	public WebElement getBtnDiscard() {
		return btnDiscard;
	}

	public void setBtnDiscard(WebElement btnDiscard) {
		this.btnDiscard = btnDiscard;
	}

	public WebElement getBtnSave() {
		return btnSave;
	}

	public void setBtnSave(WebElement btnSave) {
		this.btnSave = btnSave;
	}

	public WebElement getBtnEdit() {
		return btnEdit;
	}

	public void setBtnEdit(WebElement btnEdit) {
		this.btnEdit = btnEdit;
	}

	public WebElement getTxtTime() {
		return txtTime;
	}

	public void setTxtTime(WebElement txtTime) {
		this.txtTime = txtTime;
	}
	
}
