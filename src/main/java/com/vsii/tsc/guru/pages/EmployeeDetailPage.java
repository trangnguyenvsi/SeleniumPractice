package com.vsii.tsc.guru.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EmployeeDetailPage {
	//WebElement of Skill Information tab
	@FindBy(xpath = "//a[@id='ui-id-6' and contains(text(),'Skill Information')]")
	private WebElement skillInformationTab;
}
