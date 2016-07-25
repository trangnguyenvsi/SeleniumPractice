package com.vsii.tsc.pages.method;


import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.vsii.tsc.com.methods.CommonMethods;
import com.vsii.tsc.pages.CreateCategoryPage;

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
	
	//Get Element Category Name textbox
	public WebElement getCategoryNameTbx() {
		return objCreateCategoryPage.getCategoryNameTbx();
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
		return driver.findElement(By.xpath("//div[contains(@class,'oe_notification')]/div[@style='']/h1[text()='The following fields are invalid:']/../ul/li[contains(text(),'" + requiredField1 +"')]/../li[contains(text(),'" + requiredField2 + "')]"));
	}
	
	//Get value of Created Category Name
	public String getCreatedCategoryName(String categoryName) {
		return objCreateCategoryPage.getCreatedCategoryName().getText();
	}
	
	//Get value of Create Category Type
	public String getCreatedCategoryType(String categoryType) {
		return objCreateCategoryPage.getCreatedCategoryType().getText();
	}
	
	//Get value of Create Category Description
	public String getCreatedCategoryDescription(String categoryDescription) {
		return objCreateCategoryPage.getCreatedCategoryDescription().getText();
	}

	//Click Edit button
	public void clickEditBtn() {
		objCreateCategoryPage.getEditBtn().click();
	}
	
	//Click Discard button
	public void clickDiscardBtn() {
		objCreateCategoryPage.getDiscardBtn().click();
	}
	
	//Get Element Edit button
	public WebElement getEditBtn() {
		return objCreateCategoryPage.getEditBtn();
	}
	
	//Select Cancel button of alert
	public void cancelPopup() throws InterruptedException {
		CommonMethods.cancelPopup();
	}
	
	//Select Ok button of alert
	public void acceptPopup() throws InterruptedException {
		CommonMethods.acceptPopup();
	}
	
	//Get Element Category Name textbox with blank value
	public WebElement getCategoryNameBlankTbx() {
		return objCreateCategoryPage.getCategoryNameBlankTbx();
	}
	
	//Get Element Category Description with blank value
	public WebElement getCategoryDescriptionBlankTextarea() {
		return objCreateCategoryPage.getCategoryDescriptionBlankTextarea();
	}


}
