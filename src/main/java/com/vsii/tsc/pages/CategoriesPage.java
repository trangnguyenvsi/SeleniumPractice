package com.vsii.tsc.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CategoriesPage {
	
	//WebElement of Check All checkbox
	@FindBy(xpath = "//tr[@class='oe_list_header_columns']/th[1]/input[@type='checkbox']")
	private WebElement checkAllCbx;
	
	//WebElements of Checkbox rows
	@FindBy(xpath = "//table/tbody//th[@class='oe_list_record_selector']/input[@type='checkbox']")
	private WebElement checkRowsCbx;
	
	//WebElement of Name header
	@FindBy(xpath = "//tr[@class='oe_list_header_columns']/th[@data-id='name']/div")
	private WebElement nameHeader;
	
	//WebElements of Name value rows
	@FindBy(xpath = "//table/tbody/tr/td[@data-field='name']")
	private WebElement nameValueRows;
	
	//WebElement of Type header
	@FindBy(xpath = "//tr[@class='oe_list_header_columns']/th[@data-id='type']/div")
	private WebElement typeHeader;
	
	//WebElements of Type value rows
	@FindBy(xpath = "//table/tbody/tr/td[@data-field='type']")
	private WebElement typeValueRows;
	
	//WebElement of Parent Category header
	@FindBy(xpath = "//tr[@class='oe_list_header_columns']/th[@data-id='type']/div")
	private WebElement parentCategoryHeader;
	
	//WebElements of Parent Category value rows
	@FindBy(xpath = "//table/tbody/tr/td[@data-field='type']")
	private WebElement parentCategoryValueRows;

	//WebElement of More button
	@FindBy(xpath = "//div[not(@style) and @class='oe_form_dropdown_section']/button")
	private WebElement moreBtn;
	
	//WebElement of Delete button
	@FindBy(xpath = "//div[not(@style) and @class='oe_form_dropdown_section']//a[contains(text(),'Delete')]")
	private WebElement deleteBtn;
	//WebElement of Create button
	
	@FindBy(xpath = "//div[@class='oe_list_buttons']/button[contains(text(),'Create')]")
	private WebElement createButton;
	
	public WebElement getCreateButton() {
		return createButton;
	}

	public void setCreateButton(WebElement createButton) {
		this.createButton = createButton;
	}

	public WebElement getMoreBtn() {
		return moreBtn;
	}

	public void setMoreBtn(WebElement moreBtn) {
		this.moreBtn = moreBtn;
	}

	public WebElement getDeleteBtn() {
		return deleteBtn;
	}

	public void setDeleteBtn(WebElement deleteBtn) {
		this.deleteBtn = deleteBtn;
	}

	public WebElement getCheckAllCbx() {
		return checkAllCbx;
	}

	public void setCheckAllCbx(WebElement checkAllCbx) {
		this.checkAllCbx = checkAllCbx;
	}

	public WebElement getCheckRowsCbx() {
		return checkRowsCbx;
	}

	public void setCheckRowsCbx(WebElement checkRowsCbx) {
		this.checkRowsCbx = checkRowsCbx;
	}

	public WebElement getNameHeader() {
		return nameHeader;
	}

	public void setNameHeader(WebElement nameHeader) {
		this.nameHeader = nameHeader;
	}

	public WebElement getNameValueRows() {
		return nameValueRows;
	}

	public void setNameValueRows(WebElement nameValueRows) {
		this.nameValueRows = nameValueRows;
	}

	public WebElement getTypeHeader() {
		return typeHeader;
	}

	public void setTypeHeader(WebElement typeHeader) {
		this.typeHeader = typeHeader;
	}

	public WebElement getTypeValueRows() {
		return typeValueRows;
	}

	public void setTypeValueRows(WebElement typeValueRows) {
		this.typeValueRows = typeValueRows;
	}

	public WebElement getParentCategoryHeader() {
		return parentCategoryHeader;
	}

	public void setParentCategoryHeader(WebElement parentCategoryHeader) {
		this.parentCategoryHeader = parentCategoryHeader;
	}

	public WebElement getParentCategoryValueRows() {
		return parentCategoryValueRows;
	}

	public void setParentCategoryValueRows(WebElement parentCategoryValueRows) {
		this.parentCategoryValueRows = parentCategoryValueRows;
	}

}
