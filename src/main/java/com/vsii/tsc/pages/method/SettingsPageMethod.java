package com.vsii.tsc.pages.method;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.vsii.tsc.pages.SettingsPage;

public class SettingsPageMethod {
	//Create new webdriver
	WebDriver driver;
	
	//Initilize Logger
	Logger log = Logger.getLogger("khaidq");
	
	//Create new PMSettings WebElement
	public SettingsPage objPMSettingsPage = new SettingsPage();
	
	// Initialize all web element
	public SettingsPageMethod(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, objPMSettingsPage);
		log.debug("Initiate web driver of Settings page");
	}
	
	//Get Element Skills section
	public WebElement getSkillsSection() {
		return objPMSettingsPage.getSkillsSection();
	}
	
	//Get Element Certificates section
	public WebElement getCertificatesSection() {
		return objPMSettingsPage.getCertificatesSection();
	}
	
	//Get Element Awards section
	public WebElement getAwardsSection() {
		return objPMSettingsPage.getAwardsSection();
	}
	
	//Get Element Categories section
	public WebElement getCategoriesSection() {
		return objPMSettingsPage.getCategoriesSection();
	}
	
	//Get Element Organizers section
	public WebElement getOrganizersSection() {
		return objPMSettingsPage.getOrganizersSection();
	}
	
	//Get Element Employee Skills section
	public WebElement getEmloyeeSkillsSection() {
		return objPMSettingsPage.getEmployeeSkillsSection();
	}
	
	//Click Categoris section
	public void clickCategoriesSection () {
		objPMSettingsPage.getCategoriesSection().click();
	}
}
