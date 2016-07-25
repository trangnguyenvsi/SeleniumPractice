package com.vsii.tsc.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateCategoryPage {
	//WebElement of Category Name textbox
	@FindBy(xpath = "//div[@class='oe_form_nosheet']/span[contains(@class,'oe_form_field_char')]/input[@type='text']")
	private WebElement categoryNameTbx;
	
	//WebElement of Category Name textbox with blank value
	@FindBy(xpath = "//div[@class='oe_form_nosheet']/span[contains(@class,'oe_form_field_char')]/input[@type='text' and not(text())]")
	private WebElement categoryNameBlankTbx;
	
	//WebElement of Category Type combobox
	@FindBy(name = "type")
	private WebElement categoryTypeCbx;
	
	//WebElement of Save button
	@FindBy(xpath = "//span[@class='oe_form_buttons_edit']/button[text()='Save']")
	private WebElement saveBtn;

	//WebElements of Categories type options
	@FindBy(xpath = "//select[@name = 'type']/option")
	private List<WebElement> cateogriesOtp;
	
	//WebElement of Category description textarea
	@FindBy(xpath = "//div[@class='oe_form_field oe_form_field_text']/textarea")
	private WebElement categoryDescriptionTextarea;
	
	public WebElement getCategoryNameBlankTbx() {
		return categoryNameBlankTbx;
	}

	public void setCategoryNameBlankTbx(WebElement categoryNameBlankTbx) {
		this.categoryNameBlankTbx = categoryNameBlankTbx;
	}

	public WebElement getCategoryDescriptionBlankTextarea() {
		return categoryDescriptionBlankTextarea;
	}

	public void setCategoryDescriptionBlankTextarea(
			WebElement categoryDescriptionBlankTextarea) {
		this.categoryDescriptionBlankTextarea = categoryDescriptionBlankTextarea;
	}

	//WebElement of Category description textarea with blank value
	@FindBy(xpath = "//div[@class='oe_form_field oe_form_field_text']/textarea[not(text())]")
	private WebElement categoryDescriptionBlankTextarea;
	
	//WebElement of Required field notification
	@FindBy(xpath = "//div[contains(@class,'oe_notification')]/div[@style='']/h1[text()='The following fields are invalid:']")
	private WebElement requiredNotification;
	
	//WebElement of Created Category Name
	@FindBy(xpath = "//span[@class='oe_form_char_content']")
	private WebElement createdCategoryName;
	
	//WebElement of Created Category Type
	@FindBy(xpath = "//span[contains(@class,'oe_form_field_selection')]")
	private WebElement createdCategoryType;
	
	//WebElement of Created Category Description
	@FindBy(xpath = "//span[@class='oe_form_text_content']")
	private WebElement createdCategoryDescription;
	
	//WebElement of Discard button
	@FindBy(xpath = "//span[@class='oe_form_buttons_edit']/a[contains(@class,'oe_form_button_cancel')]")
	private WebElement discardBtn;

	//WebElement of Edit button
	@FindBy(xpath = "//div[@class = 'oe_form_buttons']/span[@class='oe_form_buttons_view']/div/button[text()='Edit']")
	private WebElement editBtn;

	public WebElement getDiscardBtn() {
		return discardBtn;
	}

	public void setDiscardBtn(WebElement discardBtn) {
		this.discardBtn = discardBtn;
	}

	public WebElement getCreatedCategoryName() {
		return createdCategoryName;
	}

	public void setCreatedCategoryName(WebElement createdCategoryName) {
		this.createdCategoryName = createdCategoryName;
	}

	public WebElement getCreatedCategoryType() {
		return createdCategoryType;
	}

	public void setCreatedCategoryType(WebElement createdCategoryType) {
		this.createdCategoryType = createdCategoryType;
	}

	public WebElement getCreatedCategoryDescription() {
		return createdCategoryDescription;
	}

	public void setCreatedCategoryDescription(WebElement createdCategoryDescription) {
		this.createdCategoryDescription = createdCategoryDescription;
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

	public List<WebElement> getCateogriesOtp() {
		return cateogriesOtp;
	}

	public void setCateogriesOtp(List<WebElement> cateogriesOtp) {
		this.cateogriesOtp = cateogriesOtp;
	}

	public WebElement getCategoryNameTbx() {
		return categoryNameTbx;
	}

	public WebElement getCategoryDescriptionTextarea() {
		return categoryDescriptionTextarea;
	}

	public void setCategoryDescriptionTextarea(WebElement categoryDescriptionTextarea) {
		this.categoryDescriptionTextarea = categoryDescriptionTextarea;
	}

	public void setCategoryNameTbx(WebElement categoryNameTbx) {
		this.categoryNameTbx = categoryNameTbx;
	}

	public WebElement getCategoryTypeCbx() {
		return categoryTypeCbx;
	}

	public void setCategoryTypeCbx(WebElement categoryTypeCbx) {
		this.categoryTypeCbx = categoryTypeCbx;
	}

	public WebElement getSaveBtn() {
		return saveBtn;
	}

	public void setSaveBtn(WebElement saveBtn) {
		this.saveBtn = saveBtn;
	}
}