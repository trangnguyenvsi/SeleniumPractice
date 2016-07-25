package com.vsii.tsc.pages.method;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.vsii.tsc.com.methods.CommonMethods;
import com.vsii.tsc.pages.EmployeeListPage;

public class EmployeeListPageMethod {
	//Create new webdriver
	WebDriver driver;
	
	//Initilize Logger
	Logger log = Logger.getLogger("khaidq");
	
	//Create new EmployeeListPage WebElement
	public EmployeeListPage objEmployeeListPage = new EmployeeListPage();
	
	// Initialize all web element
	public EmployeeListPageMethod(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, objEmployeeListPage);
		log.debug("Initiate web driver of Employee List page");
	}
		
	//Get WebElement Employees name header
	public WebElement getNameHeader() {
		return objEmployeeListPage.getNameHeader();
	}
	
	//Get WebElement Employees Check All checkbox
	public WebElement getCheckAllCbx() {
		return objEmployeeListPage.getCheckAllCbx();
	}

	//Get WebElement Employees Work Phone header
	public WebElement getWorkPhoneHeader() {
		return objEmployeeListPage.getWorkPhoneHeader();
	}

	//Get WebElement Employees Work Email header
	public WebElement getWorkEmailHeader() {
		return objEmployeeListPage.getWorkEmailHeader();
	}
	
	//Get WebElement Employees Department header
	public WebElement getDepartmentHeader() {
		return objEmployeeListPage.getDepartmentHeader();
	}

	//Get WebElement Employees Job header
	public WebElement getJobHeader() {
		return objEmployeeListPage.getJobHeader();
	}
	
	//Get WebElement Employees Parent Manger header
	public WebElement getParentManagerHeader() {
		return objEmployeeListPage.getParentManagerHeader();
	}
	
	//Verify each row should represent a Employee
	public boolean shouldEachRowEachEmployee () {		
		boolean isNotDuplicate = CommonMethods.colShouldNotDuplicated(this.getEmployeesNameValues());
		boolean isNotBlank = CommonMethods.colShouldNotBlank(this.getEmployeesNameValues());
		
		if (!isNotDuplicate || !isNotBlank) {
			return false;
		}
		return true;
	}
	
	//Get Element Employees Name values
	public WebElement getEmployeesNameValues() {
		return objEmployeeListPage.getEmployeesNameValues();
	}
	
	//Get Element Employee Name value
	public WebElement getEmloyeeNameValue(String employeeName) {
		return driver.findElement(By.xpath("//table[@class='oe_list_content']/tbody/tr/td[@data-field='name' and text()='" + employeeName + "']"));
	}
	
	//Select a Employee
	public void selectEmployee(String employeeName) {
		this.getEmloyeeNameValue(employeeName).click();
	}
}
