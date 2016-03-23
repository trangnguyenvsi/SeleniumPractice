package com.vsii.tsc.guru.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyTimesheetPage {
	@FindBy(xpath = "/html/body/div/table/tbody/tr[2]/td/ul/li[3]/a")
	private WebElement humanResources;
	
	@FindBy(xpath = "/html/body/div/table/tbody/tr[3]/td[1]/div[1]/div[3]/ul[2]/li[2]/a")
	private WebElement myTimesheet;
	
	@FindBy(id = "employee_id")
	private WebElement employeeId;
	
	@FindBy(id = "date_from")
	private WebElement dateFrom;
	
	@FindBy(id = "date_to")
	private WebElement dateTo;
	
	@FindBy(id = "department_id")
	private WebElement departmentId;
	
	@FindBy(id = "total_timesheet")
	private WebElement totalTimesheet;
	
	@FindBy(id = "state")
	private WebElement stateId;
	
	@FindBy(className = "oe_button oe_list_add oe_highlight")
	private WebElement btnCreate;

	@FindBy(className = "oe_bold oe_list_button_import")
	private WebElement lnkImport;

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

	public WebElement getStateId() {
		return stateId;
	}

	public void setStateId(WebElement stateId) {
		this.stateId = stateId;
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
	
	
}
