package com.vsii.tsc.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TS_HRPage {
	@FindBy(xpath="html/body/div[1]/table/tbody/tr[3]/td[1]/div[1]/div[5]/ul[3]/li[4]/a/span")
	private WebElement mnMyTimeSheet;
	
	@FindBy(xpath="html/body/div[1]/table/tbody/tr[3]/td[2]/div/div/div/div[1]/div/table/thead/tr/th[2]/div")
	private WebElement ttlEmployee;
	
	@FindBy(xpath="html/body/div[1]/table/tbody/tr[3]/td[2]/div/div/div/div[1]/div/table/thead/tr/th[3]/div")
	private WebElement ttlDateFrom;
	
	@FindBy(xpath="html/body/div[1]/table/tbody/tr[3]/td[2]/div/div/div/div[1]/div/table/thead/tr/th[4]/div")
	private WebElement ttlDateTo;
	
	@FindBy(xpath="html/body/div[1]/table/tbody/tr[3]/td[2]/div/div/div/div[1]/div/table/thead/tr/th[5]/div")
	private WebElement ttlDepartment;
	
	@FindBy(xpath="html/body/div[1]/table/tbody/tr[3]/td[2]/div/div/div/div[1]/div/table/thead/tr/th[6]/div")
	private WebElement ttlTotalTimesheet;
	
	@FindBy(xpath="html/body/div[1]/table/tbody/tr[3]/td[2]/div/div/div/div[1]/div/table/thead/tr/th[7]/div")
	private WebElement ttlStatus;
	
	@FindBy(xpath="html/body/div[1]/table/tbody/tr[3]/td[2]/div/div/table/tbody/tr[2]/td[1]/div/div/button[1]")
	private WebElement btnCreate;
	
	@FindBy(xpath="html/body/div[1]/table/tbody/tr[3]/td[2]/div/div/table/tbody/tr[2]/td[1]/div/div/span/a[2]")
	private WebElement btnImport;
	
	@FindBy(xpath="/html/body/div/table/tbody/tr[3]/td[2]/div/div/div/div[1]/div/table/tbody/tr[1]/td[6]")
	private WebElement lblStatus;
	
	@FindBy(xpath = "html/body/div[1]/table/tbody/tr[3]/td[1]/div[1]/div[3]/ul[2]/li[2]/a/span")
	private WebElement mnMyTimeSheetEmp;
	
	public WebElement getMnMyTimeSheetEmp() {
		return mnMyTimeSheetEmp;
	}

	public void setMnMyTimeSheetEmp(WebElement mnMyTimeSheetEmp) {
		this.mnMyTimeSheetEmp = mnMyTimeSheetEmp;
	}
	
	public WebElement getLblStatus() {
		return lblStatus;
	}

	public void setLblStatus(WebElement lblStatus) {
		this.lblStatus = lblStatus;
	}

	public WebElement getTtlDateFrom() {
		return ttlDateFrom;
	}

	public void setTtlDateFrom(WebElement ttlDateFrom) {
		this.ttlDateFrom = ttlDateFrom;
	}

	public WebElement getTtlDateTo() {
		return ttlDateTo;
	}

	public void setTtlDateTo(WebElement ttlDateTo) {
		this.ttlDateTo = ttlDateTo;
	}

	public WebElement getTtlDepartment() {
		return ttlDepartment;
	}

	public void setTtlDepartment(WebElement ttlDepartment) {
		this.ttlDepartment = ttlDepartment;
	}

	public WebElement getTtlTotalTimesheet() {
		return ttlTotalTimesheet;
	}

	public void setTtlTotalTimesheet(WebElement ttlTotalTimesheet) {
		this.ttlTotalTimesheet = ttlTotalTimesheet;
	}

	public WebElement getTtlStatus() {
		return ttlStatus;
	}

	public void setTtlStatus(WebElement ttlStatus) {
		this.ttlStatus = ttlStatus;
	}

	public WebElement getBtnCreate() {
		return btnCreate;
	}

	public void setBtnCreate(WebElement btnCreate) {
		this.btnCreate = btnCreate;
	}

	public WebElement getBtnImport() {
		return btnImport;
	}

	public void setBtnImport(WebElement btnImport) {
		this.btnImport = btnImport;
	}

	public WebElement getTtlEmployee() {
		return ttlEmployee;
	}

	public void setTtlEmployee(WebElement ttlEmployee) {
		this.ttlEmployee = ttlEmployee;
	}

	public WebElement getMnMyTimeSheet() {
		return mnMyTimeSheet;
	}

	public void setMnMyTimeSheet(WebElement mnMyTimeSheet) {
		this.mnMyTimeSheet = mnMyTimeSheet;
	}
}
