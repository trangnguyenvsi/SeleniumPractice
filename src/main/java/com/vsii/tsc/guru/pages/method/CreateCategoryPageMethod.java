package com.vsii.tsc.guru.pages.method;


import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.vsii.tsc.guru.commethods.CommonMethods;
import com.vsii.tsc.guru.pages.CreateCategoryPage;

public class CreateCategoryPageMethod {
	//Create new WebDriver
	WebDriver driver;
		
	//Initilize Logger
	Logger log = Logger.getLogger("khaidq");
	
	//Create new CreateCategoriesPage WebElement
	public CreateCategoryPage objCreateCategoryPage = new CreateCategoryPage ();
	
	//Intitialize all Web Element of Skills Page
	public CreateCategoryPageMethod (WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, objCreateCategoryPage);
		log.debug("Initiate web driver of Skills page");
	}
	
	//Click Save button
	public void clickSave() {
		objCreateCategoryPage.getSaveBtn().click();
	}
	
	//Enter text to Category Name textbox
	public void inputCategoryName(String categoryName) {
		objCreateCategoryPage.getCategoryNameTbx().clear();
		objCreateCategoryPage.getCategoryNameTbx().sendKeys(categoryName);
	}
	
	//Get Category Type combobox
	public Select getCategoryTypeCbx() {
		Select categoryTypeCbx = new Select(objCreateCategoryPage.getCategoryTypeCbx());
		return categoryTypeCbx;
	}
	
	//Select Category Type
	public void selectCategoryType (String categoryType) {
		if(categoryType.equals("")) {
			this.getCategoryTypeCbx().selectByVisibleText(categoryType);
		} else {
			CommonMethods.selectOptionByContains(categoryType, this.getCategoryTypeCbx(), objCreateCategoryPage.getCateogriesOtp());
		}
	}
	
	//Input text to Category Description textarea
	public void inputCategoryDescription (String categoryDescription) {
		objCreateCategoryPage.getCategoryDescriptionTextarea().clear();
		objCreateCategoryPage.getCategoryDescriptionTextarea().sendKeys(categoryDescription);
	}
	
	//Get Element Required Field Notification
	public WebElement getRequiredNotification(String requiredField1, String requiredField2) {
		return objCreateCategoryPage.getRequiredNotification().findElement(By.xpath("/../ul/li[contains(text(),'" + requiredField1 +"')]/../li[contains(text(),'" + requiredField2 + "')]"));
	}
}