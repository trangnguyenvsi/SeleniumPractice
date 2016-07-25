package com.vsii.tsc.pages.method;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.vsii.tsc.com.methods.CommonMethods;
import com.vsii.tsc.pages.CategoriesPage;

public class CategoriesPageMethod {
	
	//Create new WebDriver
	WebDriver driver;
		
	//Initilize Logger
	Logger log = Logger.getLogger("khaidq");
	
	//Create new CategoriesPage WebElement
	public CategoriesPage objCategoriesPage = new CategoriesPage ();
	
	//Intitialize all Web Element of Skills Page
	public CategoriesPageMethod (WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, objCategoriesPage);
		log.debug("Initiate web driver of Skills page");
	}
	
	//Get Element Check All checkbox
	public WebElement getCheckAllCbx () {
		return objCategoriesPage.getCheckAllCbx();
	}
	
	//Get Elements Check rows checkbox
	public WebElement getCheckRowsCbx () {
		return objCategoriesPage.getCheckRowsCbx();
	}
	
	//Get Element Name header
	public WebElement getNameHeader () {
		return objCategoriesPage.getNameHeader();
	}

	//Get Elements Name Value rows
	public WebElement getNameValueRows () {
		return objCategoriesPage.getNameValueRows();
	}

	//Get Element Type header
	public WebElement getTypeHeader () {
		return objCategoriesPage.getTypeHeader();
	}
	
	//Get Elements Type Value rows
	public WebElement getTypeValueRows () {
		return objCategoriesPage.getTypeValueRows();
	}
	
	//Get Element Parent Category header
	public WebElement getParentCategoryHeader () {
		return objCategoriesPage.getParentCategoryHeader();
	}

	//Get Elements Parent Category Value rows
	public WebElement getParentCategoryValueRows () {
		return objCategoriesPage.getParentCategoryValueRows();
	}
	
	//Click More button
	public void clickMoreBtn () {
		objCategoriesPage.getMoreBtn().click();
		log.debug("Click More button");
	}
	
	//Click Delete button
	public void clickDeleteBtn() {
		objCategoriesPage.getDeleteBtn().click();
		log.debug("Click Delete button");
	}
		
	//Get WebElement of Category to delete
	public WebElement getCategoryToDeleteCbx (String categoryName,String categoryType, String parentCategory) {
		return driver.findElement(By.xpath("//table/tbody/tr/td[@data-field ='name' and contains(text(),'" + categoryName + "')]/../td[@data-field = 'type' and contains(text(),'" + categoryType + "')]/../td[@data-field = 'parent_id' and contains(text(),'" + parentCategory + "')]/..//input"));
	}
	
	//Mark Category to delete
	public void markToDelete (String categoryName, String categoryType, String parentCategory) {
		this.getCategoryToDeleteCbx(categoryName, categoryType, parentCategory).click();
	}
	
	//Get WebElement of Category
	public WebElement getCategory (String categoryName,String categoryType, String parentCategory) {
		if (parentCategory.equals("")) {
			return driver.findElement(By.xpath("//table/tbody/tr/td[@data-field ='name' and contains(text(),'" + categoryName + "')]/../td[@data-field = 'type' and contains(text(),'" + categoryType + "')]/../td[@data-field = 'parent_id' and not(text())]"));
		} else {
			return driver.findElement(By.xpath("//table/tbody/tr/td[@data-field ='name' and contains(text(),'" + categoryName + "')]/../td[@data-field = 'type' and contains(text(),'" + categoryType + "')]/../td[@data-field = 'parent_id' and contains(text(),'" + parentCategory + "')]"));
		}
	}
	
	//Verify each row should represent a skill
	public boolean shouldEachRowEachSkill () {		
		boolean isNotDuplicate = CommonMethods.colShouldNotDuplicated(this.getNameValueRows());
		boolean isNotBlank = CommonMethods.colShouldNotBlank(this.getNameValueRows());
		
		if (!isNotDuplicate || !isNotBlank) {
			return false;
		}
		return true;
	}
	
	//Verify alert message should be correct
	public boolean alertShouldBeCorrect (String message) {
		boolean isCorrect = false;
		if(message.equals(CommonMethods.getAlertMessage())) {
			isCorrect = true;
		};
		return isCorrect;
	}
	
	//Select Cancel button of alert
	public void cancelPopup() throws InterruptedException {
		CommonMethods.cancelPopup();
	}
	
	//Select Ok button of alert
	public void acceptPopup() throws InterruptedException {
		CommonMethods.acceptPopup();
	}
	
	//Click Create categories button
	public void clickCreateBtn() {
		objCategoriesPage.getCreateButton().click();
	}
	
}
