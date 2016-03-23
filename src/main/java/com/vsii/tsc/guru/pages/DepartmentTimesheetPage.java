package com.vsii.tsc.guru.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DepartmentTimesheetPage {
	@FindBy(className = "oe_menu_toggler")
	private WebElement humanResourcesPm;
	
	@FindBy(className = "oe_menu_leaf")
	private WebElement departmentTimesheets;
	
	@FindBy(className = "oe_list_header_many2one oe_sortable")
	private WebElement employeePm;
	
	@FindBy(className = "oe_list_header_date oe_sortable")
	private WebElement dateFromPm;
	
	@FindBy(className = "oe_list_header_date oe_sortable")
	private WebElement dateToPm;
	
	@FindBy(className = "oe_list_header_many2one oe_sortable")
	private WebElement departmentIdPm;
	
	@FindBy(className = "oe_list_header_float_time oe_sortable")
	private WebElement totalTimesheetPm;
	
	@FindBy(className = "oe_list_header_selection oe_sortable")
	private WebElement statePm;
	
	@FindBy(xpath = "/html/body/div[1]/table/tbody/tr[3]/td[2]/div/div/div/div[1]/div/table/tbody[1]/tr/th")
	private WebElement groupMonth;

	public WebElement getHumanResourcesPm() {
		return humanResourcesPm;
	}

	public void setHumanResourcesPm(WebElement humanResourcesPm) {
		this.humanResourcesPm = humanResourcesPm;
	}

	public WebElement getDepartmentTimesheets() {
		return departmentTimesheets;
	}

	public void setDepartmentTimesheets(WebElement departmentTimesheets) {
		this.departmentTimesheets = departmentTimesheets;
	}

	public WebElement getEmployeePm() {
		return employeePm;
	}

	public void setEmployeePm(WebElement employeePm) {
		this.employeePm = employeePm;
	}

	public WebElement getDateFromPm() {
		return dateFromPm;
	}

	public void setDateFromPm(WebElement dateFromPm) {
		this.dateFromPm = dateFromPm;
	}

	public WebElement getDateToPm() {
		return dateToPm;
	}

	public void setDateToPm(WebElement dateToPm) {
		this.dateToPm = dateToPm;
	}

	public WebElement getDepartmentIdPm() {
		return departmentIdPm;
	}

	public void setDepartmentIdPm(WebElement departmentIdPm) {
		this.departmentIdPm = departmentIdPm;
	}

	public WebElement getTotalTimesheetPm() {
		return totalTimesheetPm;
	}

	public void setTotalTimesheetPm(WebElement totalTimesheetPm) {
		this.totalTimesheetPm = totalTimesheetPm;
	}

	public WebElement getStatePm() {
		return statePm;
	}

	public void setStatePm(WebElement statePm) {
		this.statePm = statePm;
	}

	
	
}
