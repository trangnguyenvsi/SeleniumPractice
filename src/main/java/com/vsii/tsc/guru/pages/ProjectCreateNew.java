package com.vsii.tsc.guru.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

public class ProjectCreateNew {
	
	@FindBy(xpath ="html/body/div[1]/table/tbody/tr[2]/td/ul/li[2]/a")
	WebElement menunProject;

	public WebElement getMenuProject() {
		return menunProject;
	}

	public void setMenunProject(WebElement menunProject) {
		this.menunProject = menunProject;
	}

	public WebElement getBtnCreate() {
		return btnCreate;
	}

	public void setBtnCreate(WebElement btnCreate) {
		this.btnCreate = btnCreate;
	}

	@FindBy(xpath ="html/body/div[1]/table/tbody/tr[3]/td[2]/div/div/table/tbody/tr[2]/td[1]/div/div/button[1]")
	WebElement btnCreate;	
  
	@FindBy (xpath =".//*[@id='oe-field-input-98']")
	WebElement txtProjectName;
	
	@FindBy (xpath =".//*[@id='oe-field-input-103']")
	WebElement txtRefContract;
	
	@FindBy (xpath =".//*[@id='oe-field-input-104']")
	WebElement txtProjectCode;
	
	@FindBy (xpath =".//*[@id='oe-field-input-105']")
	WebElement dropPrivacy;
	
	@FindBy (xpath =".//*[@id='oe-field-input-106']")
	WebElement dropProjectManager;
	
	@FindBy (xpath =".//*[@id='oe-field-input-107']")
	WebElement txtApprovedEffort;
	
	@FindBy (xpath =".//*[@id='oe-field-input-108']")
	WebElement dropDepartment;
	
	@FindBy (xpath =".//*[@id='oe-field-input-109']")
	WebElement dropProjectType;
	
	@FindBy (xpath =".//*[@id='oe-field-input-110']")
	WebElement dropCommercialDetails;
	
	@FindBy (xpath =".//*[@id='oe-field-input-111']")
	WebElement chkVerifyWR;
	
	@FindBy (xpath =".//*[@id='oe-field-input-112']")
	WebElement dropCustomer;
	
	@FindBy (xpath =".//*[@class='oe_button oe_form_button_save oe_highlight']")
	WebElement btnSave;
	//Phan tu tren trang khi tao moi page thanh cong
	@FindBy (xpath= ".//*[contains(text(),'Submit to Review')]")
	WebElement btnSubmit;

	public WebElement getBtnSubmit() {
		return btnSubmit;
	}

	public void setBtnSubmit(WebElement btnSubmit) {
		this.btnSubmit = btnSubmit;
	}

	public WebElement getTxtProjectName() {
		return txtProjectName;
	}

	public void setTxtProjectName(WebElement txtProjectName) {
		this.txtProjectName = txtProjectName;
	}

	public WebElement getTxtRefContract() {
		return txtRefContract;
	}

	public void setTxtRefContract(WebElement txtRefContract) {
		this.txtRefContract = txtRefContract;
	}

	public WebElement getTxtProjectCode() {
		return txtProjectCode;
	}

	public void setTxtProjectCode(WebElement txtProjectCode) {
		this.txtProjectCode = txtProjectCode;
	}

	public WebElement getDropPrivacy() {
		return dropPrivacy;
	}

	public void setDropPrivacy(WebElement dropPrivacy) {
		this.dropPrivacy = dropPrivacy;
	}

	public WebElement getDropProjectManager() {
		return dropProjectManager;
	}

	public void setDropProjectManager(WebElement dropProjectManager) {
		this.dropProjectManager = dropProjectManager;
	}

	public WebElement getTxtApprovedEffort() {
		return txtApprovedEffort;
	}

	public void setTxtApprovedEffort(WebElement txtApprovedEffort) {
		this.txtApprovedEffort = txtApprovedEffort;
	}

	public WebElement getDropDepartment() {
		return dropDepartment;
	}

	public void setDropDepartment(WebElement dropDepartment) {
		this.dropDepartment = dropDepartment;
	}

	public WebElement getDropProjectType() {
		return dropProjectType;
	}

	public void setDropProjectType(WebElement dropProjectType) {
		this.dropProjectType = dropProjectType;
	}

	public WebElement getDropCommercialDetails() {
		return dropCommercialDetails;
	}

	public void setDropCommercialDetails(WebElement dropCommercialDetails) {
		this.dropCommercialDetails = dropCommercialDetails;
	}

	public WebElement getChkVerifyWR() {
		return chkVerifyWR;
	}

	public void setChkVerifyWR(WebElement chkVerifyWR) {
		this.chkVerifyWR = chkVerifyWR;
	}

	public WebElement getDropCustomer() {
		return dropCustomer;
	}

	public void setDropCustomer(WebElement dropCustomer) {
		this.dropCustomer = dropCustomer;
	}

	public WebElement getBtnSave() {
		return btnSave;
	}

	public void setBtnSave(WebElement btnSave) {
		this.btnSave = btnSave;
	}
	
	
}
