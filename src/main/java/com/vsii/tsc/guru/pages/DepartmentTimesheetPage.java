package com.vsii.tsc.guru.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DepartmentTimesheetPage {
	
	@FindBy(xpath = "/html/body/div/table/tbody/tr[3]/td[1]/div[1]/div[5]/ul[3]/li[3]/a")
	private WebElement departmentTimesheets;
	
	@FindBy(xpath = "/html/body/div/table/tbody/tr[3]/td[2]/div/div/div/div[1]/div/table/thead/tr/th[3]/div")
	private WebElement employeeD;
	
	@FindBy(xpath = "/html/body/div/table/tbody/tr[3]/td[2]/div/div/div/div[1]/div/table/thead/tr/th[4]/div")
	private WebElement dateFromD;
	
	@FindBy(xpath = "/html/body/div/table/tbody/tr[3]/td[2]/div/div/div/div[1]/div/table/thead/tr/th[5]/div")
	private WebElement dateToD;
	
	@FindBy(xpath = "/html/body/div/table/tbody/tr[3]/td[2]/div/div/div/div[1]/div/table/thead/tr/th[6]/div")
	private WebElement departmentIdD;
	
	@FindBy(xpath = "/html/body/div/table/tbody/tr[3]/td[2]/div/div/div/div[1]/div/table/thead/tr/th[7]/div")
	private WebElement totalTimesheetD;
	
	@FindBy(xpath = "/html/body/div/table/tbody/tr[3]/td[2]/div/div/div/div[1]/div/table/thead/tr/th[8]/div")
	private WebElement statusD;
	
	@FindBy(xpath = "/html/body/div/table/tbody/tr[3]/td[2]/div/div/div/div[1]/div/table/thead/tr/th[1]")
	private WebElement groupD;

	@FindBy(xpath = "/html/body/div/table/tbody/tr[3]/td[2]/div/div/div/div[1]/div/table/tbody/tr[1]/td[1]")
	private WebElement groupMonth;
	
	@FindBy(xpath = "/html/body/div/table/tbody/tr[3]/td[2]/div/div/div/div[1]/div/table/tbody[2]/tr[2]/td[7]")
	private WebElement statusDetail;
	
	public WebElement getStatusDetail() {
		return statusDetail;
	}

	public void setStatusDetail(WebElement statusDetail) {
		this.statusDetail = statusDetail;
	}

	public WebElement getDepartmentTimesheets() {
		return departmentTimesheets;
	}

	public void setDepartmentTimesheets(WebElement departmentTimesheets) {
		this.departmentTimesheets = departmentTimesheets;
	}

	public WebElement getEmployeeD() {
		return employeeD;
	}

	public void setEmployeeD(WebElement employeeD) {
		this.employeeD = employeeD;
	}

	public WebElement getDateFromD() {
		return dateFromD;
	}

	public void setDateFromD(WebElement dateFromD) {
		this.dateFromD = dateFromD;
	}

	public WebElement getDateToD() {
		return dateToD;
	}

	public void setDateToD(WebElement dateToD) {
		this.dateToD = dateToD;
	}

	public WebElement getDepartmentIdD() {
		return departmentIdD;
	}

	public void setDepartmentIdD(WebElement departmentIdD) {
		this.departmentIdD = departmentIdD;
	}

	public WebElement getTotalTimesheetD() {
		return totalTimesheetD;
	}

	public void setTotalTimesheetD(WebElement totalTimesheetD) {
		this.totalTimesheetD = totalTimesheetD;
	}

	public WebElement getStatusD() {
		return statusD;
	}

	public void setStatusD(WebElement statusD) {
		this.statusD = statusD;
	}

	public WebElement getGroupD() {
		return groupD;
	}

	public void setGroupD(WebElement groupD) {
		this.groupD = groupD;
	}

	public WebElement getGroupMonth() {
		return groupMonth;
	}

	public void setGroupMonth(WebElement groupMonth) {
		this.groupMonth = groupMonth;
	}


	
	
}
