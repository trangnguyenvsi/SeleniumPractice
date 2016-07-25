package com.vsii.tsc.pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class EmployeeListPage {
	//WebElement of Employees Name value
	@FindBy(xpath = "//table[@class='oe_list_content']/tbody/tr/td[@data-field='name']")
	private WebElement employeesNameValues;
	
	//WebElement of Employees Work Phone values
	@FindBy(xpath = "//table[@class='oe_list_content']/tbody/tr/td[@data-field='work_phone']")
	private WebElement employeesWorkPhoneValues;
	
	//WebElement of Employees Work Mail
	@FindBy(xpath = "//table[@class='oe_list_content']/tbody/tr/td[@data-field='work_email']")
	private WebElement employeesWorkEmail;
	
	//WebElement of Employees Department
	@FindBy(xpath = "//table[@class='oe_list_content']/tbody/tr/td[@data-field='department_id']")
	private WebElement employeesDepartmentValues;
	
	//WebElement of Employees Job
	@FindBy(xpath = "//table[@class='oe_list_content']/tbody/tr/td[@data-field='job_id']")
	private WebElement employeesJobValues;
	
	//WebElement of Parent Manager
	@FindBy(xpath = "//table[@class='oe_list_content']/tbody/tr/td[@data-field='parent_id']")
	private WebElement employeesParentManagerValues;
	
	//WebElement of Check All checkbox
	@FindBy(xpath = "//tr[@class='oe_list_header_columns']//input[@type='checkbox']")
	private WebElement checkAllCbx;
	
	//WebElement of Name header
	@FindBy(xpath = "//tr[@class='oe_list_header_columns']/th[@data-id='name']/div[contains(text(),'Name')]")
	private WebElement nameHeader;
	
	//WebElement of Work Phone header
	@FindBy(xpath = "//tr[@class='oe_list_header_columns']/th[@data-id='work_phone']/div[contains(text(),'Work Phone')]")
	private WebElement workPhoneHeader;
	
	//WebElement of Work Email header
	@FindBy(xpath = "//tr[@class='oe_list_header_columns']/th[@data-id='work_email']/div[contains(text(),'Work Email')]")
	private WebElement workEmailHeader;
	
	//WeElement of Department header
	@FindBy(xpath = "//tr[@class='oe_list_header_columns']/th[@data-id='department_id']/div[contains(text(),'Department')]")
	private WebElement departmentHeader;
	
	//WebElement of Job header
	@FindBy(xpath = "//tr[@class='oe_list_header_columns']/th[@data-id='job_id']/div[contains(text(),'Job')]")
	private WebElement jobHeader;
	
	//WebElement of Parent Manager header
	@FindBy(xpath = "//tr[@class='oe_list_header_columns']/th[@data-id='parent_id']/div[contains(text(),'Manager')]")
	private WebElement parentManagerHeader;
	
	public WebElement getEmployeesNameValues() {
		return employeesNameValues;
	}

	public void setEmployeesNameValues(WebElement employeesNameValues) {
		this.employeesNameValues = employeesNameValues;
	}

	public WebElement getEmployeesWorkPhoneValues() {
		return employeesWorkPhoneValues;
	}

	public void setEmployeesWorkPhoneValues(WebElement employeesWorkPhoneValues) {
		this.employeesWorkPhoneValues = employeesWorkPhoneValues;
	}

	public WebElement getEmployeesDepartmentValues() {
		return employeesDepartmentValues;
	}

	public void setEmployeesDepartmentValues(WebElement employeesDepartmentValues) {
		this.employeesDepartmentValues = employeesDepartmentValues;
	}

	public WebElement getEmployeesJobValues() {
		return employeesJobValues;
	}

	public void setEmployeesJobValues(WebElement employeesJobValues) {
		this.employeesJobValues = employeesJobValues;
	}

	public WebElement getEmployeesParentManagerValues() {
		return employeesParentManagerValues;
	}

	public void setEmployeesParentManagerValues(WebElement employeesParentManagerValues) {
		this.employeesParentManagerValues = employeesParentManagerValues;
	}

	public WebElement getEmployeesWorkEmail() {
		return employeesWorkEmail;
	}

	public void setEmployeesWorkEmail(WebElement employeesWorkEmail) {
		this.employeesWorkEmail = employeesWorkEmail;
	}

	public WebElement getCheckAllCbx() {
		return checkAllCbx;
	}

	public void setCheckAllCbx(WebElement checkAllCbx) {
		this.checkAllCbx = checkAllCbx;
	}

	public WebElement getNameHeader() {
		return nameHeader;
	}

	public void setNameHeader(WebElement nameHeader) {
		this.nameHeader = nameHeader;
	}

	public WebElement getWorkPhoneHeader() {
		return workPhoneHeader;
	}

	public void setWorkPhoneHeader(WebElement workPhoneHeader) {
		this.workPhoneHeader = workPhoneHeader;
	}

	public WebElement getWorkEmailHeader() {
		return workEmailHeader;
	}

	public void setWorkEmailHeader(WebElement workEmailHeader) {
		this.workEmailHeader = workEmailHeader;
	}

	public WebElement getDepartmentHeader() {
		return departmentHeader;
	}

	public void setDepartmentHeader(WebElement departmentHeader) {
		this.departmentHeader = departmentHeader;
	}

	public WebElement getJobHeader() {
		return jobHeader;
	}

	public void setJobHeader(WebElement jobHeader) {
		this.jobHeader = jobHeader;
	}

	public WebElement getParentManagerHeader() {
		return parentManagerHeader;
	}

	public void setParentManagerHeader(WebElement parentManagerHeader) {
		this.parentManagerHeader = parentManagerHeader;
	}
}
