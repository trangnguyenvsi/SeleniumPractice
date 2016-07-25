package com.vsii.tsc.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SkillsPage {
	
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
	
	//WebElement of Skill Domain header
	@FindBy(xpath = "//tr[@class='oe_list_header_columns']/th[@data-id='domain']/div")
	private WebElement skillDomainHeader;
	
	//WebElements of Skill Domain value rows
	@FindBy(xpath = "//table/tbody/tr/td[@data-field='domain']")
	private WebElement skillDomainValueRows;
	
	//WebElement of Share link text
	@FindBy(xpath = "//ul[@class='oe_dropdown_menu oe_opened']/li/a[contains(text(),'Share')]")
	private WebElement shareLink;
	
	//WebElement of Embed link text
	@FindBy(xpath = "//ul[@class='oe_dropdown_menu oe_opened']/li/a[contains(text(),'Embed')]")
	private WebElement embedLink;

	//WebElement of Export link text
	@FindBy(xpath = "//ul[@class='oe_dropdown_menu oe_opened']/li/a[contains(text(),'Export')]")
	private WebElement exportLink;

	//WebElement of Delete link text
	@FindBy(xpath = "//ul[@class='oe_dropdown_menu oe_opened']/li/a[contains(text(),'Delete')]")
	private WebElement deleteLink;

	//WebElement of More button
	@FindBy(xpath = "//div[not(@style) and @class='oe_form_dropdown_section']/button")
	private WebElement moreBtn;
	
	//WebElement of Delete button
	@FindBy(xpath = "//div[not(@style) and @class='oe_form_dropdown_section']//a[contains(text(),'Delete')]")
	private WebElement deleteBtn;
	
	//WebELement of Selected Record
	@FindBy(xpath = "//table/tbody//td[@data-field='name' and text()='Adobe Illustrator']/../th[@class='oe_list_record_selector']/input[@type='checkbox']")
	private WebElement selectedToDeleteRecord;
	
	//WebElement of Create button
	@FindBy(xpath = "//div[@class='oe_list_buttons']/button[contains(text(),'Create')]")
	private WebElement createButton;
	
	public WebElement getShareLink() {
		return shareLink;
	}

	public void setShareLink(WebElement shareLink) {
		this.shareLink = shareLink;
	}

	public WebElement getEmbedLink() {
		return embedLink;
	}

	public void setEmbedLink(WebElement embedLink) {
		this.embedLink = embedLink;
	}

	public WebElement getExportLink() {
		return exportLink;
	}

	public void setExportLink(WebElement exportLink) {
		this.exportLink = exportLink;
	}

	public WebElement getDeleteLink() {
		return deleteLink;
	}

	public void setDeleteLink(WebElement deleteLink) {
		this.deleteLink = deleteLink;
	}

	public WebElement getSelectedToDeleteRecord() {
		return selectedToDeleteRecord;
	}

	public void setSelectedToDeleteRecord(WebElement selectedToDeleteRecord) {
		this.selectedToDeleteRecord = selectedToDeleteRecord;
	}

	public WebElement getCreateButton() {
		return createButton;
	}

	public void setCreateButton(WebElement createButton) {
		this.createButton = createButton;
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

	public WebElement getSkillDomainHeader() {
		return skillDomainHeader;
	}

	public void setSkillDomainHeader(WebElement skillDomainHeader) {
		this.skillDomainHeader = skillDomainHeader;
	}

	public WebElement getSkillDomainValueRows() {
		return skillDomainValueRows;
	}

	public void setSkillDomainValueRows(WebElement skillDomainValueRows) {
		this.skillDomainValueRows = skillDomainValueRows;
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
}
