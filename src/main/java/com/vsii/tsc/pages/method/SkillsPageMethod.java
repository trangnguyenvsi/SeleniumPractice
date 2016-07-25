package com.vsii.tsc.pages.method;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.vsii.tsc.com.methods.CommonMethods;
import com.vsii.tsc.pages.SkillsPage;

public class SkillsPageMethod {
	//Create new WebDriver
	WebDriver driver;
	
	//Initilize Logger
	Logger log = Logger.getLogger("khaidq");
	
	//Create new SkillsPage WebElement
	public SkillsPage objSkillsPage = new SkillsPage ();
	
	//Intitialize all Web Element of Skills Page
	public SkillsPageMethod (WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, objSkillsPage);
		log.debug("Initiate web driver of Skills page");
	}
	
	//Get Element Check All checkbox
	public WebElement getCheckAllCbx () {
		return objSkillsPage.getCheckAllCbx();
	}
	
	//Get Elements Check rows checkbox
	public WebElement getCheckRowsCbx () {
		return objSkillsPage.getCheckRowsCbx();
	}
	
	//Get Element Name header
	public WebElement getNameHeader () {
		return objSkillsPage.getNameHeader();
	}
	
	//Get Element Name Value rows
	public WebElement getNameValueRows () {
		return objSkillsPage.getNameValueRows();
	}
	
	//Get Element Skill Domain header
	public WebElement getSkillDomainHeader () {
		return objSkillsPage.getSkillDomainHeader();
	}
	
	//Get Element Skill Domain Value rows
	public WebElement getSkillDomainValueRows () {
		return objSkillsPage.getSkillDomainValueRows();
	}

	//Get Element More button
	public WebElement getMoreBtn () {
		return objSkillsPage.getMoreBtn();
	}
	
	//Get Element Delete button
	public WebElement getDeleteBtn () {
		return objSkillsPage.getDeleteBtn();
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
	
	//Click More button
	public void clickMoreBtn () {
		objSkillsPage.getMoreBtn().click();
		log.debug("Click More button");
	}
	
	//Click Delete button
	public void clickDeleteBtn() {
		objSkillsPage.getDeleteBtn().click();
		log.debug("Click Delete button");
	}
	
	//Get WebElement of Skill to delete
	public WebElement getSkillToDeleteCbx (String skillName, String skillDomain) {
		return driver.findElement(By.xpath("//table/tbody/tr/td[@data-field ='name' and contains(text(),'" + skillName + "')]/../td[@data-field = 'domain' and contains(text(),'" + skillDomain + "')]/..//input"));
		//table/tbody/tr/td[@data-field ='name' and contains(text(),'Advanced')]/../td[@data-field = 'parent_id' and contains(text(),'Software Engineering Knowledge')]/..//input
	}
	
	//Mark Skill to delete
	public void markToDelete (String skillName, String skillDomain) {
		this.getSkillToDeleteCbx(skillName, skillDomain).click();
	}
	
	//Select Cancel button of alert
	public void cancelPopup() throws InterruptedException {
		CommonMethods.cancelPopup();
	}
	
	//Select Ok button of alert
	public void acceptPopup() throws InterruptedException {
		CommonMethods.acceptPopup();
	}
	
	//Click Create button
	public void clickCreateBtn() {
		objSkillsPage.getCreateButton().click();
	}

}
