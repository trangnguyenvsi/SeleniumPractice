package com.vsii.tsc.guru.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TS_TaskPage {
	@FindBy(xpath = "html/body/div[1]/table/tbody/tr[3]/td[1]/div[1]/div[2]/ul[1]/li[3]/a/span")
	private WebElement mnTask;

	@FindBy(xpath = "html/body/div[1]/table/tbody/tr[3]/td[2]/div/div/table/tbody/tr[2]/td[1]/div/div/button[1]")
	private WebElement btnCreate;
	
	@FindBy(xpath = "html/body/div[1]/table/tbody/tr[3]/td[2]/div/div/div/div[3]/div/div[4]/div/div/div[1]/div/h1/span/input")
	private WebElement txtTaskSum;
	
	@FindBy(xpath = "html/body/div[1]/table/tbody/tr[3]/td[2]/div/div/div/div[3]/div/div[4]/div/div/div[1]/div/table/tbody/tr/td[1]/table/tbody/tr[1]/td[2]/span/div/span[2]/img")
	private WebElement drpdwnProject;
	
	@FindBy(linkText = "Add an item")
	private WebElement lnkAddItem;

	@FindBy(className = "oe_form_group ")
	private WebElement firstWorkSummary;
	
	@FindBy(xpath = "//span[contains(@data-fieldname, 'hours')]")
	private WebElement txtHour;
	
	@FindBy(xpath = "html/body/div[1]/table/tbody/tr[3]/td[2]/div/div/table/tbody/tr[2]/td[1]/div/div[2]/span[2]/button")
	private WebElement btnSave;
	
	public WebElement getBtnSave() {
		return btnSave;
	}

	public void setBtnSave(WebElement btnSave) {
		this.btnSave = btnSave;
	}

	public WebElement getTxtHour() {
		return txtHour;
	}

	public void setTxtHour(WebElement txtHour) {
		this.txtHour = txtHour;
	}

	public WebElement getFirstWorkSummary() {
		return firstWorkSummary;
	}

	public void setFirstWorkSummary(WebElement firstWorkSummary) {
		this.firstWorkSummary = firstWorkSummary;
	}

	public WebElement getLnkAddItem() {
		return lnkAddItem;
	}

	public void setLnkAddItem(WebElement lnkAddItem) {
		this.lnkAddItem = lnkAddItem;
	}

	public WebElement getDrpdwnProject() {
		return drpdwnProject;
	}

	public void setDrpdwnProject(WebElement drpdwnProject) {
		this.drpdwnProject = drpdwnProject;
	}

	public WebElement getTxtTaskSum() {
		return txtTaskSum;
	}

	public void setTxtTaskSum(WebElement txtTaskSum) {
		this.txtTaskSum = txtTaskSum;
	}

	public WebElement getBtnCreate() {
		return btnCreate;
	}

	public void setBtnCreate(WebElement btnCreate) {
		this.btnCreate = btnCreate;
	}

	public WebElement getMnTask() {
		return mnTask;
	}

	public void setMnTask(WebElement mnTask) {
		this.mnTask = mnTask;
	}
}
