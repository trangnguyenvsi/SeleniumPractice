package com.vsii.tsc.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EmployeeDetailPage {
	//WebElement of Skill Information tab
	@FindBy(xpath = "//ul[@role='tablist']/li[@role='tab']/a[contains(text(),'Skill Information')]")
	private WebElement skillInformationTab;

	//WebElement of Skill header section
	@FindBy(xpath = "//thead//th[@data-id='skill_id']/div[contains(text(),'Skills')]/../../th[@data-id='level']/div[contains(text(),'Level')]/../../th[@data-id='last_year']/div[contains(text(),'Last Used')]")
	private WebElement skillHeaderSection;
	
	//WebElement of Certificates header section
	@FindBy(xpath = "//thead//th[@data-id='cert_id']/div[contains(text(),'Certificate')]/../../th[@data-id='year']/div[contains(text(),'Last Used')]")
	private WebElement certificateHeaderSection;
	
	//WebElement of Award header section
	@FindBy(xpath = "//thead//th[@data-id='award_id']/div[contains(text(),'Award')]/../../th[@data-id='year']/div[contains(text(),'Last Used')]")
	private WebElement awardHeaderSection;

	//WebElement of Add Skill button
	@FindBy(xpath = "//div[@name='button_box']/button/span[text()='Add Skill']/..")
	private WebElement addSkillBtn;
	
	//WebElement of Skill Domain dropdownlist
	@FindBy(xpath = "//label[@title='Skill Domain' and contains(text(),'Skill Domain')]/../..//div/input")
	private WebElement skillDomainDdl;
	
	//WebElement of Skill of Employee
	@FindBy(xpath = "//label[@title='Skill of employee' and contains(text(),'Skill of employee')]/../..//div/input")
	private WebElement skillEmployeeDdl;
	
	//WebElement of Last Used textbox
	@FindBy(xpath = "//label[contains(text(),'Last Used')]/../..//span[contains(@class,'oe_form_field_char')]/input")
	private WebElement lastUsedTbx;
	
	//WebElement of Competency Level
	@FindBy(xpath = "//label[@title='How about your level on this skill?']/../..//span[contains(@class,'oe_form_field_selection')]/select")
	private WebElement competencyLevelDdl;
	
	public WebElement getSkillDomainDdl() {
		return skillDomainDdl;
	}

	public void setSkillDomainDdl(WebElement skillDomainDdl) {
		this.skillDomainDdl = skillDomainDdl;
	}

	public WebElement getSkillEmployeeDdl() {
		return skillEmployeeDdl;
	}

	public void setSkillEmployeeDdl(WebElement skillEmployeeDdl) {
		this.skillEmployeeDdl = skillEmployeeDdl;
	}

	public WebElement getLastUsedTbx() {
		return lastUsedTbx;
	}

	public void setLastUsedTbx(WebElement lastUsedTbx) {
		this.lastUsedTbx = lastUsedTbx;
	}

	public WebElement getCompetencyLevelDdl() {
		return competencyLevelDdl;
	}

	public void setCompetencyLevelDdl(WebElement competencyLevelDdl) {
		this.competencyLevelDdl = competencyLevelDdl;
	}

	public WebElement getAddSkillBtn() {
		return addSkillBtn;
	}

	public void setAddSkillBtn(WebElement addSkillBtn) {
		this.addSkillBtn = addSkillBtn;
	}

	public WebElement getSkillInformationTab() {
		return skillInformationTab;
	}
	
	public void setSkillInformationTab(WebElement skillInformationTab) {
		this.skillInformationTab = skillInformationTab;
	}

	public WebElement getSkillHeaderSection() {
		return skillHeaderSection;
	}

	public void setSkillHeaderSection(WebElement skillHeaderSection) {
		this.skillHeaderSection = skillHeaderSection;
	}

	public WebElement getCertificateHeaderSection() {
		return certificateHeaderSection;
	}

	public void setCertificateHeaderSection(WebElement certificateHeaderSection) {
		this.certificateHeaderSection = certificateHeaderSection;
	}

	public WebElement getAwardHeaderSection() {
		return awardHeaderSection;
	}

	public void setAwardHeaderSection(WebElement awardHeaderSection) {
		this.awardHeaderSection = awardHeaderSection;
	}
}
