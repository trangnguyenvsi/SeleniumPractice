package com.vsii.tsc.guru.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateCategoryPage {
	//WebElement of Category Name textbox
	@FindBy(id = "oe-field-input-119")
	private WebElement categoryNameTbx;
	
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
	
	//WebElement of Required field notification
	@FindBy(xpath = "//div[contains(@class,'oe_notification')]/div[@style='']/h1[text()='The following fields are invalid:']")
	private WebElement requiredNotification;
	
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