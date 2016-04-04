package com.vsii.tsc.guru.pages;

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
//	
//	@FindBy(xpath = "/html/body/div/table/tbody/tr[3]/td[2]/div/div/div/div[2]/div/div[4]/div/div/div[1]/div/div[2]/h1/span/a")			
//	private WebElement lblName;
//	
//	public WebElement getLblName() {
//		return lblName;
//	}
//
//	public void setLblName(WebElement lblName) {
//		this.lblName = lblName;
//	}

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
