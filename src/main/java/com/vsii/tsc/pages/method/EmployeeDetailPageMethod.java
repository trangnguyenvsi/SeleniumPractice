package com.vsii.tsc.pages.method;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.vsii.tsc.pages.EmployeeDetailPage;

public class EmployeeDetailPageMethod {
	//Create new webdriver
	WebDriver driver;
	
	//Initilize Logger
	Logger log = Logger.getLogger("khaidq");
	
	//Create new EmployeeListPage WebElement
	public EmployeeDetailPage objEmployeeDetailPage = new EmployeeDetailPage();
	
	// Initialize all web element
	public EmployeeDetailPageMethod(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, objEmployeeDetailPage);
		log.debug("Initiate web driver of Employee Detail page");
	}
	
	//click Element Skill Information tab
	public void clickSkillInformationTab() {
		objEmployeeDetailPage.getSkillInformationTab().click();
	}
	
	//Verify Skill section should be displayed
	public boolean skillSectionShouldBeDisplayed() {
		return objEmployeeDetailPage.getSkillHeaderSection().isDisplayed();
	}
	
	//Verify Certificates section should be displayed
	public boolean certificateSectionShouldBeDisplayed() {
		return objEmployeeDetailPage.getCertificateHeaderSection().isDisplayed();
	}
	
	//Verify Skill section should be displayed
	public boolean awardSectionShouldBeDisplayed() {
		return objEmployeeDetailPage.getAwardHeaderSection().isDisplayed();
	}
	
	//Click Add Skill button
	public void clickAddSkill() {
		objEmployeeDetailPage.getAddSkillBtn().click();
	}
	
	//Get Element Skill Domain dropdownlist
	public WebElement getSkillDomainDdl() {
		return objEmployeeDetailPage.getSkillDomainDdl();
	}
	
	//Get Element Skill Domain dropdownlist
	public WebElement getSkillEmployeeDdl() {
		return objEmployeeDetailPage.getSkillEmployeeDdl();
	}
	
	//Get Element Last Used textbox
	public WebElement getLastUsedTbx() {
		return objEmployeeDetailPage.getLastUsedTbx();
	}
	
	//Get Element Competency Level
	public WebElement getCompetencyLevelDdl() {
		return objEmployeeDetailPage.getCompetencyLevelDdl();
	}
}
