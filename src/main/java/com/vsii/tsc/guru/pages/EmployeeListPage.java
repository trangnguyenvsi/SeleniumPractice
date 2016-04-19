package com.vsii.tsc.guru.pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class EmployeeListPage {
	//WebElement of Employee name
	@FindBy(xpath = "//table[@class='oe_list_content']/tbody/tr/td[@data-field='name']")
	private WebElement employeesName;
	
}
