package com.vsii.tsc.guru.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyTimesheetPage {
	@FindBy(xpath = "/html/body/div[1]/table/tbody/tr[2]/td/ul/li[3]/a")
	private WebElement humanResources;
	
	@FindBy(xpath = "/html/body/div/table/tbody/tr[3]/td[1]/div[1]/div[3]/ul[2]/li[2]/a")
	private WebElement myTimesheet;
	
	@FindBy(xpath = "/html/body/div/table/tbody/tr[3]/td[2]/div/div/div/div[1]/div/table/thead/tr/th[2]")
	private WebElement employeeId;
	
	@FindBy(xpath = "/html/body/div/table/tbody/tr[3]/td[2]/div/div/div/div[1]/div/table/thead/tr/th[3]")
	private WebElement dateFrom;
	
	@FindBy(xpath = "/html/body/div/table/tbody/tr[3]/td[2]/div/div/div/div[1]/div/table/thead/tr/th[4]")
	private WebElement dateTo;
	
	@FindBy(xpath = "/html/body/div/table/tbody/tr[3]/td[2]/div/div/div/div[1]/div/table/thead/tr/th[5]")
	private WebElement departmentId;
	
	@FindBy(xpath = "/html/body/div/table/tbody/tr[3]/td[2]/div/div/div/div[1]/div/table/thead/tr/th[6]")
	private WebElement totalTimesheet;
	
	@FindBy(xpath = "/html/body/div/table/tbody/tr[3]/td[2]/div/div/div/div[1]/div/table/thead/tr/th[7]")
	private WebElement status;
	
	@FindBy(xpath = "/html/body/div/table/tbody/tr[3]/td[2]/div/div/table/tbody/tr[2]/td[1]/div/div/button[1]")
	private WebElement btnCreate;

	@FindBy(xpath = "/html/body/div/table/tbody/tr[3]/td[2]/div/div/table/tbody/tr[2]/td[1]/div/div/span/a[2]")
	private WebElement lnkImport;
	
	@FindBy(xpath = "/html/body/div[1]/table/tbody/tr[2]/td/span")
	private WebElement lnkLogout;
	
	@FindBy(xpath = "/html/body/div[1]/table/tbody/tr[2]/td/span/ul/li[5]/a")
	private WebElement lnkLogoutMenu;

	public WebElement getHumanResources() {
		return humanResources;
	}

	public void setHumanResources(WebElement humanResources) {
		this.humanResources = humanResources;
	}

	public WebElement getMyTimesheet() {
		return myTimesheet;
	}

	public void setMyTimesheet(WebElement myTimesheet) {
		this.myTimesheet = myTimesheet;
	}

	public WebElement getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(WebElement employeeId) {
		this.employeeId = employeeId;
	}

	public WebElement getDateFrom() {
		return dateFrom;
	}

	public void setDateFrom(WebElement dateFrom) {
		this.dateFrom = dateFrom;
	}

	public WebElement getDateTo() {
		return dateTo;
	}

	public void setDateTo(WebElement dateTo) {
		this.dateTo = dateTo;
	}

	public WebElement getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(WebElement departmentId) {
		this.departmentId = departmentId;
	}

	public WebElement getTotalTimesheet() {
		return totalTimesheet;
	}

	public void setTotalTimesheet(WebElement totalTimesheet) {
		this.totalTimesheet = totalTimesheet;
	}

	public WebElement getStatus() {
		return status;
	}

	public void setStatus(WebElement status) {
		this.status = status;
	}

	public WebElement getBtnCreate() {
		return btnCreate;
	}

	public void setBtnCreate(WebElement btnCreate) {
		this.btnCreate = btnCreate;
	}

	public WebElement getLnkImport() {
		return lnkImport;
	}

	public void setLnkImport(WebElement lnkImport) {
		this.lnkImport = lnkImport;
	}

	public WebElement getLnkLogout() {
		return lnkLogout;
	}

	public void setLnkLogout(WebElement lnkLogout) {
		this.lnkLogout = lnkLogout;
	}

	public WebElement getLnkLogoutMenu() {
		return lnkLogoutMenu;
	}

	public void setLnkLogoutMenu(WebElement lnkLogoutMenu) {
		this.lnkLogoutMenu = lnkLogoutMenu;
	}
	
	
}
