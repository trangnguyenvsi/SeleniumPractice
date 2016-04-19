package com.vsii.tsc.guru.pages.method;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.vsii.tsc.guru.pages.EmployeeListPage;

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
	
	//Get WebElement Selected Employee name
	public WebElement selectedEmployeeName (String selectedEmployeeName) {
		return driver.findElement(By.xpath("//table[@class='oe_list_content']/tbody/tr/td[@data-field='name' and contains(text(),'" + selectedEmployeeName + "')]"));
	}
	
}
