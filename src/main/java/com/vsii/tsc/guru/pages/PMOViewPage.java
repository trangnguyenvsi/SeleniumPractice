package com.vsii.tsc.guru.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PMOViewPage {
	@FindBy(className = "oe_menu_toggler")
	private WebElement humanResourcesPm;
	
	@FindBy(className = "oe_menu_leaf")
	private WebElement departmentTimesheets;
	
	@FindBy(xpath = "/html/body/div[1]/table/tbody/tr[3]/td[2]/div/div/div/div[1]/div/table/thead/tr/th[3]")
	private WebElement employeePmo;
	
	@FindBy(xpath = "/html/body/div[1]/table/tbody/tr[3]/td[2]/div/div/div/div[1]/div/table/thead/tr/th[4]")
	private WebElement dateFromPmo;
	
	@FindBy(xpath = "/html/body/div[1]/table/tbody/tr[3]/td[2]/div/div/div/div[1]/div/table/thead/tr/th[5]")
	private WebElement dateToPmo;
	
	@FindBy(xpath = "/html/body/div[1]/table/tbody/tr[3]/td[2]/div/div/div/div[1]/div/table/thead/tr/th[6]")
	private WebElement departmentIdPmo;
	
	@FindBy(xpath = "/html/body/div[1]/table/tbody/tr[3]/td[2]/div/div/div/div[1]/div/table/thead/tr/th[7]")
	private WebElement totalTimesheetPmo;
	
	@FindBy(xpath = "/html/body/div[1]/table/tbody/tr[3]/td[2]/div/div/div/div[1]/div/table/thead/tr/th[8]")
	private WebElement statePmo;
	
	@FindBy(xpath = "/html/body/div[1]/table/tbody/tr[3]/td[2]/div/div/div/div[1]/div/table/tbody[1]/tr/th")
	private WebElement groupMonthPmo;

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

	public WebElement getEmployeePmo() {
		return employeePmo;
	}

	public void setEmployeePmo(WebElement employeePmo) {
		this.employeePmo = employeePmo;
	}

	public WebElement getDateFromPmo() {
		return dateFromPmo;
	}

	public void setDateFromPmo(WebElement dateFromPmo) {
		this.dateFromPmo = dateFromPmo;
	}

	public WebElement getDateToPmo() {
		return dateToPmo;
	}

	public void setDateToPmo(WebElement dateToPmo) {
		this.dateToPmo = dateToPmo;
	}

	public WebElement getDepartmentIdPmo() {
		return departmentIdPmo;
	}

	public void setDepartmentIdPmo(WebElement departmentIdPmo) {
		this.departmentIdPmo = departmentIdPmo;
	}

	public WebElement getTotalTimesheetPmo() {
		return totalTimesheetPmo;
	}

	public void setTotalTimesheetPmo(WebElement totalTimesheetPmo) {
		this.totalTimesheetPmo = totalTimesheetPmo;
	}

	public WebElement getStatePmo() {
		return statePmo;
	}

	public void setStatePmo(WebElement statePmo) {
		this.statePmo = statePmo;
	}

	public WebElement getGroupMonthPmo() {
		return groupMonthPmo;
	}

	public void setGroupMonthPmo(WebElement groupMonthPmo) {
		this.groupMonthPmo = groupMonthPmo;
	}
	
}
