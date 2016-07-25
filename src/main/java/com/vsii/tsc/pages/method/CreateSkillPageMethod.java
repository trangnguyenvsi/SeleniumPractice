package com.vsii.tsc.pages.method;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.vsii.tsc.com.methods.CommonMethods;
import com.vsii.tsc.pages.CreateSkillPage;

public class CreateSkillPageMethod {
	//Create new WebDriver
	WebDriver driver;
		
	//Initilize Logger
	Logger log = Logger.getLogger("khaidq");
	
	//Create new CreateCategoriesPage WebElement
	public CreateSkillPage objCreateSkillPage = new CreateSkillPage ();
	
	//Intitialize all Web Element of Skills Page
	public CreateSkillPageMethod (WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, objCreateSkillPage);
		log.debug("Initiate web driver of Skills page");
	}
	
	//Click Save button
	public void clickSave() {
		objCreateSkillPage.getSaveBtn().click();
	}
	
	//Enter text to Skill Name textbox
	public void inputSkillName(String skillName) {
		objCreateSkillPage.getSkillNameTbx().clear();
		objCreateSkillPage.getSkillNameTbx().sendKeys(skillName);
	}
	
	//Input Skill Domain
	public void inputSkillDomain(String skillDomain) {
		objCreateSkillPage.getSkillDomainTbx().clear();
		
		if(!skillDomain.equals("")) {
			objCreateSkillPage.getSkillDomainTbx().sendKeys(skillDomain);
			CommonMethods.waitUntil(this.getSkillDomainOtp(skillDomain));
			this.getSkillDomainOtp(skillDomain).click();;
		}
	}
		
	//Input text to Skill Description textarea
	public void inputSkillDescription (String skillDescription) {
		objCreateSkillPage.getSkillDescriptionTextarea().clear();
		objCreateSkillPage.getSkillDescriptionTextarea().sendKeys(skillDescription);
	}
	
	//Get Element Skill domain option
	public WebElement getSkillDomainOtp(String skillDomain) {
		return driver.findElement(By.xpath("//li[@class='ui-menu-item']/a[text()='" + skillDomain + "']"));
	}
	
	//Get Element Required Field Notification
	public WebElement getRequiredNotification(String requiredField1, String requiredField2) {
		return driver.findElement(By.xpath("//div[contains(@class,'oe_notification')]/div[@style='']/h1[text()='The following fields are invalid:']/../ul/li[contains(text(),'" + requiredField1 +"')]/../li[contains(text(),'" + requiredField2 + "')]"));
	}
	
	//Get value of Created Skill Name
	public String getCreatedSkillName(String skillName) {
		return objCreateSkillPage.getCreatedSkillName().getText();
	}
	
	//Get value of Create Skill Domain
	public String getCreatedSkillDomain(String skillDomain) {
		return objCreateSkillPage.getCreatedSkillDomain().getText();
	}
	
	//Get value of Create Skill Description
	public String getCreatedSkillDescription(String skillDescription) {
		return objCreateSkillPage.getCreatedSkillDescription().getText();
	}

	//Click Edit button
	public void clickEditBtn() {
		objCreateSkillPage.getEditBtn().click();
	}
	
	//Click Discard button
	public void clickDiscardBtn() {
		objCreateSkillPage.getDiscardBtn().click();
	}
	
	//Select Cancel button of alert
	public void cancelPopup() throws InterruptedException {
		CommonMethods.cancelPopup();
	}
	
	//Select Ok button of alert
	public void acceptPopup() throws InterruptedException {
		CommonMethods.acceptPopup();
	}
	
	//Get Element Skill Name textbox with blank value
	public WebElement getSkillNameBlankTbx() {
		return objCreateSkillPage.getSkillNameBlankTbx();
	}
	
	//Get Element Skill Description with blank value
	public WebElement getSkillDescriptionBlankTextarea() {
		return objCreateSkillPage.getSkillDescriptionBlankTextarea();
	}
	
	//Get Element Edit button
	public WebElement getEditBtn() {
		return objCreateSkillPage.getEditBtn();
	}

}
