package com.vsii.tsc.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TS_CreateTSPage {
	
	@FindBy(xpath = "//div[@class='oe_list_buttons']/button[contains(text(),'Create')]")
	private WebElement btnCreate;
	
	@FindBy(xpath = "html/body/div[1]/table/tbody/tr[3]/td[2]/div/div/div/div[2]/div/div[4]/div/div/div[1]/div/table/tbody/tr/td[1]/table/tbody/tr[1]/td[2]/div/span[1]/span/input[2]")
	private WebElement dtFrom;
	
	@FindBy(xpath = "html/body/div[1]/table/tbody/tr[3]/td[2]/div/div/div/div[2]/div/div[4]/div/div/div[1]/div/table/tbody/tr/td[1]/table/tbody/tr[1]/td[2]/div/span[2]/span/input[2]")
	private WebElement dtTo;
	
	@FindBy(className = "oe_timesheet_button_add")
	private WebElement btnAddLine;
	
	@FindBy(xpath = "/html/body/div[1]/table/tbody/tr[3]/td[2]/div/div/div/div[2]/div/div[4]/div/div/div[1]/div/div[3]/div[1]/div/div/table/tbody/tr[2]/td/span/div/span[2]/img")
	private WebElement cbbProject;
	
	@FindBy(className = "ui-autocomplete-input")
	private WebElement eleProject;
	
	@FindBy(xpath = "/html/body/div[1]/table/tbody/tr[3]/td[2]/div/div/div/div[2]/div/div[4]/div/div/div[1]/div/div[3]/div[1]/div/div/table/tbody/tr[2]/td/button")
	private WebElement btnAdd;
	
	@FindBy(xpath = "/html/body/div[1]/table/tbody/tr[3]/td[2]/div/div/table/tbody/tr[2]/td[1]/div/div[2]/span[2]/button")
	private WebElement btnSave;
	
	@FindBy(name = "date_from")
	private WebElement txtDateFrom;
	
	@FindBy(name = "date_to")
	private WebElement txtDateTo;
	
	@FindBy(className="/html/body/div[1]/table/tbody/tr[3]/td[2]/div/div/div/div[2]/div/div[4]/div/div/div[1]/div/div[3]/div[1]/div/div/table/tbody/tr[2]/td[2]/input")
	private WebElement txtInputTime;
	
	@FindBy(xpath="/html/body/div[1]/table/tbody/tr[3]/td[2]/div/div/div/div[2]/div/div[4]/div/div/header/ul/li[2]/span[1]")
	private WebElement lblStatus;

	@FindBy(className="oe_notification ui-notify")
	private WebElement lblMessage;
	
	public WebElement getLblMessage() {
		return lblMessage;
	}

	public void setLblMessage(WebElement lblMessage) {
		this.lblMessage = lblMessage;
	}

	public WebElement getLblStatus() {
		return lblStatus;
	}

	public void setLblStatus(WebElement lblStatus) {
		this.lblStatus = lblStatus;
	}

	public WebElement getTxtInputTime() {
		return txtInputTime;
	}

	public void setTxtInputTime(WebElement tblInputTime) {
		this.txtInputTime = tblInputTime;
	}

	public WebElement getEleProject() {
		return eleProject;
	}

	public void setEleProject(WebElement eleProject) {
		this.eleProject = eleProject;
	}

	public WebElement getTxtDateFrom() {
		return txtDateFrom;
	}

	public void setTxtDateFrom(WebElement txtDateFrom) {
		this.txtDateFrom = txtDateFrom;
	}

	public WebElement getTxtDateTo() {
		return txtDateTo;
	}

	public void setTxtDateTo(WebElement txtDateTo) {
		this.txtDateTo = txtDateTo;
	}

	public WebElement getBtnCreate() {
		return btnCreate;
	}

	public void setBtnCreate(WebElement btnCreate) {
		this.btnCreate = btnCreate;
	}

	public WebElement getDtFrom() {
		return dtFrom;
	}

	public void setDtFrom(WebElement dtFrom) {
		this.dtFrom = dtFrom;
	}

	public WebElement getDtTo() {
		return dtTo;
	}

	public void setDtTo(WebElement dtTo) {
		this.dtTo = dtTo;
	}

	public WebElement getBtnAddLine() {
		return btnAddLine;
	}

	public void setBtnAddLine(WebElement btnAddLine) {
		this.btnAddLine = btnAddLine;
	}

	public WebElement getCbbProject() {
		return cbbProject;
	}

	public void setCbbProject(WebElement cbbProject) {
		this.cbbProject = cbbProject;
	}

	public WebElement getBtnAdd() {
		return btnAdd;
	}

	public void setBtnAdd(WebElement btnAdd) {
		this.btnAdd = btnAdd;
	}

	public WebElement getBtnSave() {
		return btnSave;
	}

	public void setBtnSave(WebElement btnSave) {
		this.btnSave = btnSave;
	}

	
	
	
}
