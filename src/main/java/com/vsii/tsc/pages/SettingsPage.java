package com.vsii.tsc.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SettingsPage {

	//WebElement of Skills Section
	@FindBy(xpath = "//a[@class='oe_menu_leaf']/span[not(contains(text(),'Employee Skills')) and contains(text(),'Skills')]")
	private WebElement skillsSection;
	
	//WebElement of Certificates Section
	@FindBy(xpath = "//a[@class='oe_menu_leaf']/span[contains(text(),'Certificates')]")
	private WebElement certificatesSection;
	
	//WebElement of Awards Section
	@FindBy(xpath = "//a[@class='oe_menu_leaf']/span[contains(text(),'Awards')]")
	private WebElement awardsSection;
	
	//WebElement of Categories Section
	@FindBy(xpath = "//a[@class='oe_menu_leaf']/span[contains(text(),'Categories')]")
	private WebElement categoriesSection;
	
	//WebElement of Organizers Section
	@FindBy(xpath = "//a[@class='oe_menu_leaf']/span[contains(text(),'Organizers')]")
	private WebElement organizersSection;
	
	//WebElement of Employee Skills Section
	@FindBy(xpath = "/html/body/div[1]/table/tbody/tr[3]/td[1]/div[1]/div[9]/ul/li[6]/a/span[contains(text(),'Employee Skills')]")
	private WebElement employeeSkillsSection;

	//WebElement of Create button
	@FindBy(xpath = "//div[@class='oe_list_buttons']/button[contains(text(),'Create')]")
	private WebElement createBtn;
	
	public WebElement getCreateBtn() {
		return createBtn;
	}

	public void setCreateBtn(WebElement createBtn) {
		this.createBtn = createBtn;
	}

	public WebElement getSkillsSection() {
		return skillsSection;
	}

	public void setSkillsSection(WebElement skillsSection) {
		this.skillsSection = skillsSection;
	}

	public WebElement getCertificatesSection() {
		return certificatesSection;
	}

	public void setCertificatesSection(WebElement certificatesSection) {
		this.certificatesSection = certificatesSection;
	}

	public WebElement getAwardsSection() {
		return awardsSection;
	}

	public void setAwardsSection(WebElement awardsSection) {
		this.awardsSection = awardsSection;
	}

	public WebElement getCategoriesSection() {
		return categoriesSection;
	}

	public void setCategoriesSection(WebElement categoriesSection) {
		this.categoriesSection = categoriesSection;
	}

	public WebElement getOrganizersSection() {
		return organizersSection;
	}

	public void setOrganizersSection(WebElement organizersSection) {
		this.organizersSection = organizersSection;
	}

	public WebElement getEmployeeSkillsSection() {
		return employeeSkillsSection;
	}

	public void setEmployeeSkillsSection(WebElement employeeSkillsSection) {
		this.employeeSkillsSection = employeeSkillsSection;
	}

}
