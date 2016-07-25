package com.vsii.tsc.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateSkillPage {
	//WebElement of Skill Name textbox with blank value
	@FindBy(xpath = "//div[@class='oe_form_nosheet']/span[contains(@class,'oe_form_field_char')]/input[@type='text' and not(text())]")
	private WebElement skillNameBlankTbx;
	
	//WebElement of Skill Name textbox
	@FindBy(xpath = "//div[@class='oe_form_nosheet']/span[contains(@class,'oe_form_field_char')]/input[@type='text']")
	private WebElement skillNameTbx;
	
	//WebElement of Skill Domain textbox
	@FindBy(xpath = "//div[@class='oe_form_nosheet']//input[@class='ui-autocomplete-input']")
	private WebElement skillDomainTbx;
	
	//WebElement of Save button
	@FindBy(xpath = "//span[@class='oe_form_buttons_edit']/button[text()='Save']")
	private WebElement saveBtn;

	//WebElement of Skill description textarea
	@FindBy(xpath = "//div[@class='oe_form_field oe_form_field_text']/textarea")
	private WebElement skillDescriptionTextarea;

	//WebElement of Skill description textarea with blank value
	@FindBy(xpath = "//div[@class='oe_form_field oe_form_field_text']/textarea[not(text())]")
	private WebElement skillDescriptionBlankTextarea;

	//WebElement of Required field notification
	@FindBy(xpath = "//div[contains(@class,'oe_notification')]/div[@style='']/h1[text()='The following fields are invalid:']")
	private WebElement requiredNotification;

	//WebElement of Discard button
	@FindBy(xpath = "//span[@class='oe_form_buttons_edit']/a[contains(@class,'oe_form_button_cancel')]")
	private WebElement discardBtn;

	//WebElement of Edit button
	@FindBy(xpath = "//div[@class = 'oe_form_buttons']/span[@class='oe_form_buttons_view']/div/button[text()='Edit']")
	private WebElement editBtn;
	
	//WebElement of Created Skill Name
	@FindBy(xpath = "//span[@class='oe_form_char_content']")
	private WebElement createdSkillName;

	//WebElement of Created Skill Domain
	@FindBy(xpath = "//a[@class='oe_form_uri']")
	private WebElement createdSkillDomain;
	
	//WebElement of Created Skill Description
	@FindBy(xpath = "//span[@class='oe_form_text_content']")
	private WebElement createdSkillDescription;
	
	//WebElement of Skill Domain dropdown
	@FindBy(xpath = "//div/span[@class='oe_m2o_drop_down_button']/img")
	private WebElement skillDomainDropdown;
	
	public WebElement getSkillDomainDropdown() {
		return skillDomainDropdown;
	}

	public void setSkillDomainDropdown(WebElement skillDomainDropdown) {
		this.skillDomainDropdown = skillDomainDropdown;
	}

	public WebElement getCreatedSkillName() {
		return createdSkillName;
	}

	public void setCreatedSkillName(WebElement createdSkillName) {
		this.createdSkillName = createdSkillName;
	}

	public WebElement getCreatedSkillDomain() {
		return createdSkillDomain;
	}

	public void setCreatedSkillDomain(WebElement createdSkillDomain) {
		this.createdSkillDomain = createdSkillDomain;
	}

	public WebElement getCreatedSkillDescription() {
		return createdSkillDescription;
	}

	public void setCreatedSkillDescription(WebElement createdSkillDescription) {
		this.createdSkillDescription = createdSkillDescription;
	}

	public WebElement getDiscardBtn() {
		return discardBtn;
	}

	public void setDiscardBtn(WebElement discardBtn) {
		this.discardBtn = discardBtn;
	}

	public WebElement getEditBtn() {
		return editBtn;
	}

	public void setEditBtn(WebElement editBtn) {
		this.editBtn = editBtn;
	}

	public WebElement getRequiredNotification() {
		return requiredNotification;
	}

	public void setRequiredNotification(WebElement requiredNotification) {
		this.requiredNotification = requiredNotification;
	}

	public WebElement getSkillNameBlankTbx() {
		return skillNameBlankTbx;
	}

	public void setSkillNameBlankTbx(WebElement skillNameBlankTbx) {
		this.skillNameBlankTbx = skillNameBlankTbx;
	}

	public WebElement getSkillNameTbx() {
		return skillNameTbx;
	}

	public void setSkillNameTbx(WebElement skillNameTbx) {
		this.skillNameTbx = skillNameTbx;
	}

	public WebElement getSkillDomainTbx() {
		return skillDomainTbx;
	}

	public void setSkillDomainTbx(WebElement skillDomainTbx) {
		this.skillDomainTbx = skillDomainTbx;
	}

	public WebElement getSaveBtn() {
		return saveBtn;
	}

	public void setSaveBtn(WebElement saveBtn) {
		this.saveBtn = saveBtn;
	}

	public WebElement getSkillDescriptionTextarea() {
		return skillDescriptionTextarea;
	}

	public void setSkillDescriptionTextarea(WebElement skillDescriptionTextarea) {
		this.skillDescriptionTextarea = skillDescriptionTextarea;
	}

	public WebElement getSkillDescriptionBlankTextarea() {
		return skillDescriptionBlankTextarea;
	}

	public void setSkillDescriptionBlankTextarea(
			WebElement skillDescriptionBlankTextarea) {
		this.skillDescriptionBlankTextarea = skillDescriptionBlankTextarea;
	}
}
