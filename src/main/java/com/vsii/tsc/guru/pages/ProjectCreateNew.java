package com.vsii.tsc.guru.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

public class ProjectCreateNew {
	// Elements on Project List
	@FindBy(xpath = ".//*[@name='login']")
	public WebElement userNametxt;
	
	@FindBy(xpath = "//*[contains(text(),'Log out')]")
    private WebElement logout_btn;
	
	@FindBy(xpath = "html/body/div[1]/table/tbody/tr[2]/td/span")
    private WebElement userLogged;
	
	@FindBy (xpath= ".//*[contains(text(),'VSII / TSC')]")
	private WebElement lbDepartement;

	@FindBy (xpath= ".//*[contains(text(),'TSC_General _Non project works')]")
	private WebElement lbProject1;

	@FindBy (xpath= ".//*[contains(text(),'VIB-IP3')]")
	private WebElement lbProject3;

	@FindBy (xpath= ".//*[contains(text(),'Vpbank testing')]")
	private WebElement lbProject4;

	@FindBy (xpath= ".//*[contains(text(),'Laplink 07')]")
	private WebElement lbProject2;

	@FindBy (xpath= ".//*[contains(text(),'LIENLT')]")
	private WebElement  lbProjectMan1;

	@FindBy (xpath= ".//*[contains(text(),'Hoàng Kim Dung')]")
	private WebElement lbProjectMan2;

	@FindBy (xpath= ".//*[contains(text(),'Laplink 07')]")
	private WebElement lbLaplink;
	//------------------------------
	
	// Elements for case 31: defaul a project is created with 5 stage: New, In Progress, Pending, Done, Cancelled
	@FindBy (xpath= "(//div[@class='oe_notebook_page ui-tabs-panel ui-widget-content ui-corner-bottom']/div/div/table/tbody/tr/td[2])[1]")
	private WebElement newDefaultStage;
	
	@FindBy (xpath= "(//div[@class='oe_notebook_page ui-tabs-panel ui-widget-content ui-corner-bottom']/div/div/table/tbody/tr/td[2])[2]")
	private WebElement inprogressDefaulStage;
	
	@FindBy (xpath= "(//div[@class='oe_notebook_page ui-tabs-panel ui-widget-content ui-corner-bottom']/div/div/table/tbody/tr/td[2])[4]")
	private WebElement doneDefaultStage;
	
	// Elements on Project Groups: After delete New, Done stage change from index[3] to [2]
	@FindBy (xpath= "(//div[@class='oe_notebook_page ui-tabs-panel ui-widget-content ui-corner-bottom']/div/div/table/tbody/tr/td[4]/button)[2]")
	private WebElement deleteDoneStagebtn;
	
	@FindBy (xpath= "(//div[@class='oe_notebook_page ui-tabs-panel ui-widget-content ui-corner-bottom']/div/div/table/tbody/tr/td[4]/button)[1]")
	private WebElement deleteNewStagebtn;
		
	
	 @FindBy (xpath ="html/body/div[1]/table/tbody/tr[2]/td/ul/li[2]/a/span")
	  private WebElement menuProject;

	 public void setMenuProject(WebElement menuProject) {
		this.menuProject = menuProject;
	}

	  @FindBy (xpath = ".//*[@class='oe_list_header_columns']/th[1]")
	  private WebElement lbGroup;
	  
	  @FindBy (xpath = ".//*[@class='oe_list_header_columns']/th[4]/div")
	  private WebElement lbProjectName;
	  
	  @FindBy (xpath = ".//*[@class='oe_list_header_columns']/th[5]/div")
	  private WebElement lbProjectManager;
	  
	  @FindBy (xpath = ".//*[@class='oe_list_header_columns']/th[6]/div")
	  private WebElement Contact;
	  
	  @FindBy (xpath = ".//*[@class='oe_list_header_columns']/th[7]/div")
	  private WebElement lbPlannedTime;
	  
	  @FindBy (xpath = ".//*[@class='oe_list_header_columns']/th[8]/div")
	  private WebElement lbTotalTime;
	  
	  @FindBy (xpath = ".//*[@class='oe_list_header_columns']/th[9]/div")
	  private WebElement lbTimeSpent;
	  
	  @FindBy (xpath = ".//*[@class='oe_list_header_columns']/th[10]/div")
	  private WebElement lbProjectCode;
	  
	  @FindBy (xpath = ".//*[@class='oe_list_header_columns']/th[11]/div")
	  private WebElement lbProgress;
	  
	  @FindBy (xpath = ".//*[@class='oe_list_header_columns']/th[12]/div")
	  private WebElement lbStatus;
	  
	  @FindBy (xpath = ".//*[contains(text(),'VSII (5)')]")
	  private WebElement lbFirstGroup;
	  
	  @FindBy (xpath = ".//th[contains(text(),'VSII / TSC')]")
	  private WebElement lbSecondGroup;
	  
	  @FindBy (xpath = ".//th[contains(text(),'VSII / IPC')]")
	  private WebElement lbThirdGroup;
	  
	  @FindBy (xpath = ".//th[contains(text(),'VSII / ITD')]")
	  private WebElement lb4thGroup;
	  
	  @FindBy (xpath = ".//th[contains(text(),'VSII / JPD')]")
	  private WebElement lb5thGroup;
	  
	  @FindBy (xpath = ".//th[contains(text(),'VSII / ICC')]")
	  private WebElement lb6thGroup;
	  
	  @FindBy (xpath = ".//th[contains(text(),'VSII / BSC')]")
	  private WebElement lb7thGroup;
	  
	  //------------------------------------------------------
	@FindBy(xpath =".//*[@class='oe_dialog_warning']/tbody/tr/td[2]")
	private WebElement errorMes;
	
	@FindBy(xpath =".//*[@class='oe_breadcrumb_item'][2]")
	private WebElement createSucc;
	
	@FindBy(xpath ="html/body/div[1]/table/tbody/tr[2]/td/ul/li[2]/a")
	private WebElement menunProject;
	
	//Stage of Project:	
	@FindBy(xpath ="(.//*[@class='ui-tabs-anchor'])[3]")
	private WebElement projectStagetab;
	
//	@FindBy(xpath ="(.//*[@class='oe_button oe_list_add oe_highlight'])[2]")
	@FindBy(xpath =".//*[@class='oe_notebook_page ui-tabs-panel ui-widget-content ui-corner-bottom']/div/div/table/thead/tr[1]/th/div[1]/button[1]")
	private WebElement addStagebtn;
	
	@FindBy(xpath ="(//div[2]/table/tbody/tr[3]/td/div/div/table/tbody/tr/td[2])[1]")
	private WebElement newStagechk;
	
	@FindBy(xpath ="(//div[2]/table/tbody/tr[3]/td/div/div/table/tbody/tr/td[2])[7]")
	private WebElement inProgressStagechk;
	
	@FindBy(xpath ="(//div[2]/table/tbody/tr[3]/td/div/div/table/tbody/tr/td[2])[17]")
	private WebElement doneStagechk;
		
	@FindBy(xpath ="html/body/div[3]/div[11]/button[1]")
	private WebElement selectbtn;
	
	@FindBy(xpath =".//*[@class='oe_clear ui-tabs ui-widget ui-widget-content ui-corner-all']/div")
	private WebElement stageZone;
	
	// Projectmn with role TSC's Manager
	//Element on page check status of project: Case 15
	@FindBy(xpath ="html/body/div[1]/table/tbody/tr[2]/td/ul/li[3]/a/span")
	private WebElement menunProjectTSC;
	
	@FindBy(xpath ="html/body/div/table/tbody/tr[3]/td[2]/div/div/table/tbody/tr[1]/td[2]/div/div/div[3]")
	private WebElement searchAdtxt;	
	
	@FindBy(xpath ="html/body/div[1]/table/tbody/tr[3]/td[2]/div/div/table/tbody/tr[1]/td[2]/div/div/div[4]/div[1]/div[1]/ul[2]/li[2]")
	private WebElement reviewFilter;
	
	@FindBy(xpath =".//td[contains(text(),'Check Project Status')]")
	private WebElement projectStt;
	
	@FindBy(xpath ="html/body/div[1]/table/tbody/tr[3]/td[2]/div/div/div/div[1]/div/table/tbody[2]/tr[39]/td[11]")
	private WebElement statustxt;
	
	
	public WebElement getErrorMes() {
		return errorMes;
	}

	public void setErrorMes(WebElement errorMes) {
		this.errorMes = errorMes;
	}

	public WebElement getMenuProject() {
		return menunProject;
	}

	public WebElement getCreateSucc() {
		return createSucc;
	}

	public void setCreateSucc(WebElement createSucc) {
		this.createSucc = createSucc;
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
	private WebElement btnCreate;	
  
//	@FindBy (xpath =".//*[@class='oe_form_field oe_form_field_char oe_form_required'][1]")
	@FindBy (xpath="//input[@maxlength='128']")
	private WebElement txtProjectName;
	
	@FindBy (xpath ="html/body/div[1]/table/tbody/tr[3]/td[2]/div/div/div/div[3]/div/div[4]/div/div/div[1]/div/table/tbody/tr/td[1]/table/tbody/tr[1]/td[2]/span/div/input")
	private WebElement txtRefContract;
	
	@FindBy (xpath ="html/body/div[1]/table/tbody/tr[3]/td[2]/div/div/div/div[3]/div/div[4]/div/div/div[1]/div/table/tbody/tr/td[1]/table/tbody/tr[2]/td[2]/span/input")
	private WebElement txtProjectCode;
	
	@FindBy (xpath ="html/body/div[1]/table/tbody/tr[3]/td[2]/div/div/div/div[3]/div/div[4]/div/div/div[1]/div/table/tbody/tr/td[1]/table/tbody/tr[3]/td[2]/span/select")
	private WebElement dropPrivacy;
	
	@FindBy (xpath ="html/body/div[1]/table/tbody/tr[3]/td[2]/div/div/div/div[3]/div/div[4]/div/div/div[1]/div/table/tbody/tr/td[1]/table/tbody/tr[3]/td[2]/span/select/option[2]")
	private WebElement dropPrivacy1;
	
	@FindBy (xpath ="html/body/div[1]/table/tbody/tr[3]/td[2]/div/div/div/div[3]/div/div[4]/div/div/div[1]/div/table/tbody/tr/td[1]/table/tbody/tr[4]/td[2]/span/div")
	private WebElement dropProjectManager;
	
	@FindBy (xpath ="html/body/div[1]/table/tbody/tr[3]/td[2]/div/div/div/div[3]/div/div[4]/div/div/div[1]/div/table/tbody/tr/td[1]/table/tbody/tr[4]/td[2]/span/div/input")
	private WebElement dropProjectManager1;
	
	@FindBy (xpath ="html/body/div[1]/table/tbody/tr[3]/td[2]/div/div/div/div[3]/div/div[4]/div/div/div[1]/div/table/tbody/tr/td[1]/table/tbody/tr[5]/td[2]/span/input")
	private WebElement txtApprovedEffort;
	
	@FindBy (xpath ="html/body/div[1]/table/tbody/tr[3]/td[2]/div/div/div/div[3]/div/div[4]/div/div/div[1]/div/table/tbody/tr/td[1]/table/tbody/tr[6]/td[2]/span/div")
	private WebElement dropDepartment;
	
	@FindBy (xpath ="html/body/div[1]/table/tbody/tr[3]/td[2]/div/div/div/div[3]/div/div[4]/div/div/div[1]/div/table/tbody/tr/td[1]/table/tbody/tr[6]/td[2]/span/div/input")
	private WebElement dropDepartment2;
	
	@FindBy (xpath ="html/body/div[1]/table/tbody/tr[3]/td[2]/div/div/div/div[3]/div/div[4]/div/div/div[1]/div/table/tbody/tr/td[1]/table/tbody/tr[7]/td[2]/span/div/input")
	private WebElement dropProjectType;
	
	@FindBy (xpath ="html/body/div[1]/table/tbody/tr[3]/td[2]/div/div/div/div[3]/div/div[4]/div/div/div[1]/div/table/tbody/tr/td[1]/table/tbody/tr[8]/td[2]/span/div/input")
	private WebElement dropCommercialDetails;
	
	@FindBy (xpath ="html/body/div[1]/table/tbody/tr[3]/td[2]/div/div/div/div[3]/div/div[4]/div/div/div[1]/div/table/tbody/tr/td[1]/table/tbody/tr[9]/td[2]/span")
	private WebElement chkVerifyWR;
	
	@FindBy (xpath ="html/body/div[1]/table/tbody/tr[3]/td[2]/div/div/div/div[3]/div/div[4]/div/div/div[1]/div/table/tbody/tr/td[2]/table/tbody/tr[1]/td[2]/span/div/input")
	private WebElement dropCustomer;
	
	@FindBy (xpath =".//*[@class='oe_button oe_form_button_save oe_highlight']")
	private WebElement btnSave;
	
	// Element relate to case 14:
	@FindBy (xpath= ".//*[@class='oe_form_field_status oe_form_status oe_form_required']/li[2]/span[1]")
	private WebElement reviewStt;
	
	@FindBy (xpath= ".//*[@class='oe_form_field_status oe_form_status oe_form_required']/li[1]/span[1]")
	private WebElement newStage;
	
	@FindBy (xpath= ".//*[@class='oe_form_field_status oe_form_status oe_form_required']/li[3]/span[1]")
	private WebElement progressStt;
	
	@FindBy (xpath= ".//*[@class='oe_form_field_status oe_form_status oe_form_required']/li[4]/span[1]")
	private WebElement closeStt;
	
	// tool tip
	
	@FindBy (xpath= "(html/body/div[1]/div[1]/div[1])[1]")
	private WebElement tooltip;
	//Element on page when creating new success
	
	@FindBy (xpath= ".//*[contains(text(),'Submit to Review')]")
	private WebElement btnSubmit;

	@FindBy(xpath="html/body/div[1]/table/tbody/tr[3]/td[2]/div/div/table/tbody/tr[1]/td[1]")
	private WebElement createNewSucc;
	
	// Case 21:
		
	@FindBy(xpath="//*[contains(text(),'Close Project')]")
	private WebElement closeProjectbtn;
	
	@FindBy(xpath="//*[contains(text(),'Re-open project')]")
	private WebElement reopenProjectbtn;
	
	@FindBy(xpath="//*[contains(text(),'Pending')]")
	private WebElement pendingbtn;
	
	@FindBy(xpath="//*[contains(text(),'New Project Based on Template')]")
	private WebElement template1;
	
	@FindBy(xpath="//*[contains(text(),'Reset as Project')]")
	private WebElement template2;
	
	@FindBy(xpath="//*[contains(text(),'Set as Template')]")
	private WebElement setasTemptn;
	
	@FindBy(xpath="//*[contains(text(),'Cancel Project')]")
	private WebElement cancelProjectbtn;
	
	// Elements on edit project page:
	@FindBy(xpath=".//th[contains(text(),'VSII / SDC')]")
	private WebElement depSDC;
		
//	@FindBy(xpath=".//td[contains(text(),'Demo Project 2016')]")
	@FindBy(xpath="//tr[21]/td[3]")
	private WebElement projectNametxt;
	
	@FindBy(xpath=".//td[contains(text(),'PM100')]")
	private WebElement projectNametxt1;
	
	@FindBy(xpath=".//td[contains(text(),'80th Project')]")
	private WebElement eightythProject;
	
	public WebElement getEightythProject() {
		return eightythProject;
	}

	public void setEightythProject(WebElement eightythProject) {
		this.eightythProject = eightythProject;
	}

	@FindBy(xpath=".//*[@class='oe_form_buttons']/span/div/button")
	private WebElement editbtn;
	
	@FindBy(xpath=".//*[@class='oe_button oe_form_button_save oe_highlight']")
	private WebElement savebtn;
	
	@FindBy(xpath=".//*[@class='oe_bold oe_form_button_cancel']")
	private WebElement discardbtn;
	
	
	@FindBy(xpath="//tr[5]/td[2]/span/input")
//	@FindBy(xpath="html/body/div[1]/table/tbody/tr[3]/td[2]/div/div/div/div[3]/div/div[4]/div/div/div[1]/div/table/tbody/tr/td[1]/table/tbody/tr[5]/td[2]/span/span")
	private WebElement neweffort;
	
	@FindBy(xpath="//span/select/option[2]")
//	@FindBy(xpath="html/body/div[1]/table/tbody/tr[3]/td[2]/div/div/div/div[3]/div/div[4]/div/div/div[1]/div/table/tbody/tr/td[1]/table/tbody/tr[3]/td[2]/span")
	private WebElement newprivacy;
		
	@FindBy(xpath=".//*[@class='oe_list_group_pagination']/button[2]")
	private WebElement nextpagebtn;
	
	// Elements relate to case 16:
	@FindBy(xpath=".//*[@class='oe_right oe_button_box']/button[1]/span")
	private WebElement taskbtn;
	
	@FindBy(xpath=".//*[@class='oe_right oe_button_box']/button[3]/span")
	private WebElement timesheetbtn;

	// Elements on page Add new member on project, case 20:
	
	@FindBy(xpath=".//*[@class='oe_right oe_button_box']/button[6]/span")
	private WebElement addMemberbtn;
	
	@FindBy(xpath="html/body/div[3]/div[2]/div/div/div/div/div[4]/div/div/span[2]/div/input")
	private WebElement usernameMemdrop;
	
	@FindBy(xpath="html/body/div[3]/div[11]/div/footer/button[1]")
	private WebElement saveMem;
	
	@FindBy(xpath="html/body/div[3]/div[2]/div/div/div/div/div[4]/div/div/span[3]/span/input[2]")
	private WebElement startDatepicker;
	
	@FindBy(xpath="html/body/div[3]/div[2]/div/div/div/div/div[4]/div/div/span[4]/span/input[2]")
	private WebElement endDatepicker;
	
	@FindBy(xpath="html/body/div[3]/div[2]/div/div/div/div/div[4]/div/div/span[5]/input")
	private WebElement allocatetxt;
	
	@FindBy(xpath=".//*[@class ='oe_dialog_warning']")
	private WebElement warningInvalidLocate;
	
	@FindBy(xpath=".//*[@class='oe_form_field oe_form_field_many2many']/div")
	private WebElement teamMember;
	
	@FindBy(xpath="(.//*[@class='oe_list_record_delete']/button)[1]")
	private WebElement deleteProjectbtn;
		
	public WebElement getTeamMember() {
		return teamMember;
	}

	public void setTeamMember(WebElement teamMember) {
		this.teamMember = teamMember;
	}

	@FindBy(xpath=".//*[@class='oe_facet_remove']")
	private WebElement removeOpenFilterbtn;
		
	@FindBy(xpath=".//*[@class='oe_searchview_filters oe_searchview_section']/div/ul[2]/li[1]")
	private WebElement newStt;
	
	@FindBy(xpath=".//*[@class='oe_searchview_filters oe_searchview_section']/div/ul[2]/li[2]")
	private WebElement inProgressStt;
	
	@FindBy(xpath=".//*[@class='oe_searchview_filters oe_searchview_section']/div/ul[2]/li[3]")
	private WebElement doneStt;
	
	@FindBy(xpath=".//td[contains(text(),'Project with New or Review Stt')]")
	private WebElement newProjectStt;
	
	@FindBy(xpath=".//td[contains(text(),'Project Approving')]")
	private WebElement projectApproving;
	
	@FindBy(xpath=".//td[contains(text(),'Edit an in progress project')]")
	private WebElement projectEditWithPS;
	
	@FindBy(xpath=".//td[contains(text(),'New Project')]")
	private WebElement newProjectDefaultStage;
	
	@FindBy(xpath=".//td[contains(text(),'Stage of Project')]")
	private WebElement projectStage;
	
	@FindBy(xpath=".//td[contains(text(),'Project with 3 stage')]")
	private WebElement projectWith3Stage;
	
	
	// Identify Submit to review button
	@FindBy(xpath="//div[1]/table/tbody/tr[3]/td[2]/div/div/div/div[3]/div/div[4]/div/div/header/button[1]")
	private WebElement submitToReviewBtn;
	
	// Identify user account
	@FindBy(xpath="html/body/div[1]/table/tbody/tr[2]/td/span/span")
	private WebElement currentUser;
	
	// Identify logout button
	@FindBy(xpath="html/body/div[1]/table/tbody/tr[2]/td/span/ul/li[5]/a")
	private WebElement logOutBtn;
	
	// Identify Open option in search bar
	@FindBy(xpath="html/body/div[1]/table/tbody/tr[3]/td[2]/div/div/table/tbody/tr[1]/td[2]/div/div/div[1]/div[2]/span[1]")
	private WebElement openOption;
	
	// Identify approve button
	@FindBy(xpath="html/body/div[1]/table/tbody/tr[3]/td[2]/div/div/div/div[3]/div/div[4]/div/div/header/button[2]")
	private WebElement approveBtn;
	
	
	public WebElement getApproveBtn() {
		return approveBtn;
	}

	public void setApproveBtn(WebElement approveBtn) {
		this.approveBtn = approveBtn;
	}

	public WebElement getOpenOption() {
		return openOption;
	}

	public void setOpenOption(WebElement openOption) {
		this.openOption = openOption;
	}

	public WebElement getLogOutBtn() {
		return logOutBtn;
	}

	public void setLogOutBtn(WebElement logOutBtn) {
		this.logOutBtn = logOutBtn;
	}

	public WebElement getCurrentUser() {
		return currentUser;
	}

	public void setCurrentUser(WebElement currentUser) {
		this.currentUser = currentUser;
	}

	public WebElement getSubmitToReviewBtn() {
		return submitToReviewBtn;
	}

	public void setSubmitToReviewBtn(WebElement submitToReviewBtn) {
		this.submitToReviewBtn = submitToReviewBtn;
	}

	public WebElement getProjectWith3Stage() {
		return projectWith3Stage;
	}

	public void setProjectWith3Stage(WebElement projectWith3Stage) {
		this.projectWith3Stage = projectWith3Stage;
	}

	@FindBy(xpath=".//*[@class='oe_dialog_warning']")
	private WebElement warning;
		
	@FindBy(xpath=".//*[@class='oe_button oe_form_button oe_highlight']/span")
	private WebElement approvebtn;
	
	@FindBy(xpath=".//*[contains(text(),'Refuse')]")
	private WebElement refusebtn;
		
	@FindBy(xpath=".//*[@class='oe_form']/div/header/button[1]/span")
	private WebElement submitAterRefus;
	
	public WebElement getDropPrivacy1() {
		return dropPrivacy1;
	}

	public void setDropPrivacy1(WebElement dropPrivacy1) {
		this.dropPrivacy1 = dropPrivacy1;
	}

	public WebElement getNewprivacy() {
		return newprivacy;
	}

	public void setNewprivacy(WebElement newprivacy) {
		this.newprivacy = newprivacy;
	}

	public WebElement getNeweffort() {
		return neweffort;
	}

	public void setNeweffort(WebElement neweffort) {
		this.neweffort = neweffort;
	}

	public WebElement getDepSDC() {
		return depSDC;
	}

	public void setDepSDC(WebElement depSDC) {
		this.depSDC = depSDC;
	}

	public WebElement getProjectNametxt() {
		return projectNametxt;
	}

	public void setProjectNametxt(WebElement projectNametxt) {
		this.projectNametxt = projectNametxt;
	}

	public WebElement getEditbtn() {
		return editbtn;
	}

	public void setEditbtn(WebElement editbtn) {
		this.editbtn = editbtn;
	}

	public WebElement getSavebtn() {
		return savebtn;
	}

	public void setSavebtn(WebElement savebtn) {
		this.savebtn = savebtn;
	}

	public WebElement getCreateNewSucc() {
		return createNewSucc;
	}

	public void setCreateNewSucc(WebElement createNewSucc) {
		this.createNewSucc = createNewSucc;
	}

	public WebElement getMenunProject() {
		return menunProject;
	}

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

	public WebElement getDropDepartment2() {
		return dropDepartment2;
	}

	public void setDropDepartment2(WebElement dropDepartment2) {
		this.dropDepartment2 = dropDepartment2;
	}

	public WebElement getProjectNametxt1() {
		return projectNametxt1;
	}

	public void setProjectNametxt1(WebElement projectNametxt1) {
		this.projectNametxt1 = projectNametxt1;
	}

	public WebElement getDiscardbtn() {
		return discardbtn;
	}

	public void setDiscardbtn(WebElement discardbtn) {
		this.discardbtn = discardbtn;
	}

	public WebElement getReviewStt() {
		return reviewStt;
	}

	public void setReviewStt(WebElement reviewStt) {
		this.reviewStt = reviewStt;
	}

	public WebElement getMenunProjectTSC() {
		return menunProjectTSC;
	}

	public void setMenunProjectTSC(WebElement menunProjectTSC) {
		this.menunProjectTSC = menunProjectTSC;
	}

	public WebElement getSearchAdtxt() {
		return searchAdtxt;
	}

	public void setSearchAdtxt(WebElement searchAdtxt) {
		this.searchAdtxt = searchAdtxt;
	}

	public WebElement getReviewFilter() {
		return reviewFilter;
	}

	public void setReviewFilter(WebElement reviewFilter) {
		this.reviewFilter = reviewFilter;
	}

	public WebElement getProjectStt() {
		return projectStt;
	}

	public void setProjectStt(WebElement projectStt) {
		this.projectStt = projectStt;
	}

	public WebElement getStatustxt() {
		return statustxt;
	}

	public void setStatustxt(WebElement statustxt) {
		this.statustxt = statustxt;
	}

	public WebElement getTaskbtn() {
		return taskbtn;
	}

	public void setTaskbtn(WebElement taskbtn) {
		this.taskbtn = taskbtn;
	}

	public WebElement getTimesheetbtn() {
		return timesheetbtn;
	}

	public void setTimesheetbtn(WebElement timesheetbtn) {
		this.timesheetbtn = timesheetbtn;
	}

	public WebElement getRemoveOpenFilterbtn() {
		return removeOpenFilterbtn;
	}

	public void setRemoveOpenFilterbtn(WebElement removeOpenFilterbtn) {
		this.removeOpenFilterbtn = removeOpenFilterbtn;
	}

	public WebElement getNewStt() {
		return newStt;
	}

	public void setNewStt(WebElement newStt) {
		this.newStt = newStt;
	}

	public WebElement getNewProjectStt() {
		return newProjectStt;
	}

	public void setNewProjectStt(WebElement newProjectStt) {
		this.newProjectStt = newProjectStt;
	}

	public WebElement getProjectApproving() {
		return projectApproving;
	}

	public void setProjectApproving(WebElement projectApproving) {
		this.projectApproving = projectApproving;
	}

	public WebElement getWarning() {
		return warning;
	}

	public void setWarning(WebElement warning) {
		this.warning = warning;
	}

	public WebElement getApprovebtn() {
		return approvebtn;
	}

	public void setApprovebtn(WebElement approvebtn) {
		this.approvebtn = approvebtn;
	}

	public WebElement getRefusebtn() {
		return refusebtn;
	}

	public void setRefusebtn(WebElement refusebtn) {
		this.refusebtn = refusebtn;
	}

	public WebElement getProgressStt() {
		return progressStt;
	}

	public void setProgressStt(WebElement progressStt) {
		this.progressStt = progressStt;
	}

	public WebElement getSubmitAterRefus() {
		return submitAterRefus;
	}

	public void setSubmitAterRefus(WebElement submitAterRefus) {
		this.submitAterRefus = submitAterRefus;
	}

	public WebElement getNewStage() {
		return newStage;
	}

	public void setNewStage(WebElement newStage) {
		this.newStage = newStage;
	}

	public WebElement getProjectEditWithPS() {
		return projectEditWithPS;
	}

	public void setProjectEditWithPS(WebElement projectEditWithPS) {
		this.projectEditWithPS = projectEditWithPS;
	}

	public WebElement getAddMemberbtn() {
		return addMemberbtn;
	}

	public void setAddMemberbtn(WebElement addMemberbtn) {
		this.addMemberbtn = addMemberbtn;
	}

	public WebElement getUsernameMemdrop() {
		return usernameMemdrop;
	}

	public void setUsernameMemdrop(WebElement usernameMemdrop) {
		this.usernameMemdrop = usernameMemdrop;
	}

	public WebElement getSaveMem() {
		return saveMem;
	}

	public void setSaveMem(WebElement saveMem) {
		this.saveMem = saveMem;
	}

	public WebElement getDropProjectManager1() {
		return dropProjectManager1;
	}

	public void setDropProjectManager1(WebElement dropProjectManager1) {
		this.dropProjectManager1 = dropProjectManager1;
	}

	public WebElement getCloseStt() {
		return closeStt;
	}

	public void setCloseStt(WebElement closeStt) {
		this.closeStt = closeStt;
	}

	public WebElement getCloseProjectbtn() {
		return closeProjectbtn;
	}

	public void setCloseProjectbtn(WebElement closeProjectbtn) {
		this.closeProjectbtn = closeProjectbtn;
	}

	public WebElement getReopenProjectbtn() {
		return reopenProjectbtn;
	}

	public void setReopenProjectbtn(WebElement reopenProjectbtn) {
		this.reopenProjectbtn = reopenProjectbtn;
	}

	public WebElement getPendingbtn() {
		return pendingbtn;
	}

	public void setPendingbtn(WebElement pendingbtn) {
		this.pendingbtn = pendingbtn;
	}

	public WebElement getSetasTemptn() {
		return setasTemptn;
	}

	public void setSetasTemptn(WebElement setasTemptn) {
		this.setasTemptn = setasTemptn;
	}

	public WebElement getCancelProjectbtn() {
		return cancelProjectbtn;
	}

	public void setCancelProjectbtn(WebElement cancelProjectbtn) {
		this.cancelProjectbtn = cancelProjectbtn;
	}

	public WebElement getTemplate1() {
		return template1;
	}

	public void setTemplate1(WebElement template1) {
		this.template1 = template1;
	}

	public WebElement getTemplate2() {
		return template2;
	}

	public void setTemplate2(WebElement template2) {
		this.template2 = template2;
	}
	
	public WebElement getLbDepartement() {
		return lbDepartement;
	}

	public void setLbDepartement(WebElement lbDepartement) {
		this.lbDepartement = lbDepartement;
	}

	public WebElement getLbProject1() {
		return lbProject1;
	}

	public void setLbProject1(WebElement lbProject1) {
		this.lbProject1 = lbProject1;
	}

	public WebElement getLbProject2() {
		return lbProject2;
	}

	public void setLbProject2(WebElement lbProject2) {
		this.lbProject2 = lbProject2;
	}

	public WebElement getLbProjectMan1() {
		return lbProjectMan1;
	}

	public void setLbProjectMan1(WebElement lbProjectMan1) {
		this.lbProjectMan1 = lbProjectMan1;
	}

	public WebElement getLbProjectMan2() {
		return lbProjectMan2;
	}

	public void setLbProjectMan2(WebElement lbProjectMan2) {
		this.lbProjectMan2 = lbProjectMan2;
	}

	public WebElement getLbLaplink() {
		return lbLaplink;
	}

	public void setLbLaplink(WebElement lbLaplink) {
		this.lbLaplink = lbLaplink;
	}

	public WebElement getLbProject3() {
		return lbProject3;
	}

	public void setLbProject3(WebElement lbProject3) {
		this.lbProject3 = lbProject3;
	}

	public WebElement getLbProject4() {
		return lbProject4;
	}

	public void setLbProject4(WebElement lbProject4) {
		this.lbProject4 = lbProject4;
	}


	public WebElement getLbGroup() {
		return lbGroup;
	}

	public void setLbGroup(WebElement lbGroup) {
		this.lbGroup = lbGroup;
	}

	public WebElement getLbProjectName() {
		return lbProjectName;
	}

	public void setLbProjectName(WebElement lbProjectName) {
		this.lbProjectName = lbProjectName;
	}

	public WebElement getLbProjectManager() {
		return lbProjectManager;
	}

	public void setLbProjectManager(WebElement lbProjectManager) {
		this.lbProjectManager = lbProjectManager;
	}

	public WebElement getContact() {
		return Contact;
	}

	public void setContact(WebElement contact) {
		Contact = contact;
	}

	public WebElement getLbPlannedTime() {
		return lbPlannedTime;
	}

	public void setLbPlannedTime(WebElement lbPlannedTime) {
		this.lbPlannedTime = lbPlannedTime;
	}

	public WebElement getLbTotalTime() {
		return lbTotalTime;
	}

	public void setLbTotalTime(WebElement lbTotalTime) {
		this.lbTotalTime = lbTotalTime;
	}

	public WebElement getLbTimeSpent() {
		return lbTimeSpent;
	}

	public void setLbTimeSpent(WebElement lbTimeSpent) {
		this.lbTimeSpent = lbTimeSpent;
	}

	public WebElement getLbProjectCode() {
		return lbProjectCode;
	}

	public void setLbProjectCode(WebElement lbProjectCode) {
		this.lbProjectCode = lbProjectCode;
	}

	public WebElement getLbProgress() {
		return lbProgress;
	}

	public void setLbProgress(WebElement lbProgress) {
		this.lbProgress = lbProgress;
	}

	public WebElement getLbStatus() {
		return lbStatus;
	}

	public void setLbStatus(WebElement lbStatus) {
		this.lbStatus = lbStatus;
	}

	public WebElement getLbFirstGroup() {
		return lbFirstGroup;
	}

	public void setLbFirstGroup(WebElement lbFirstGroup) {
		this.lbFirstGroup = lbFirstGroup;
	}

	public WebElement getLbSecondGroup() {
		return lbSecondGroup;
	}

	public void setLbSecondGroup(WebElement lbSecondGroup) {
		this.lbSecondGroup = lbSecondGroup;
	}

	public WebElement getLbThirdGroup() {
		return lbThirdGroup;
	}

	public void setLbThirdGroup(WebElement lbThirdGroup) {
		this.lbThirdGroup = lbThirdGroup;
	}

	public WebElement getLb4thGroup() {
		return lb4thGroup;
	}

	public void setLb4thGroup(WebElement lb4thGroup) {
		this.lb4thGroup = lb4thGroup;
	}

	public WebElement getLb5thGroup() {
		return lb5thGroup;
	}

	public void setLb5thGroup(WebElement lb5thGroup) {
		this.lb5thGroup = lb5thGroup;
	}

	public WebElement getLb6thGroup() {
		return lb6thGroup;
	}

	public void setLb6thGroup(WebElement lb6thGroup) {
		this.lb6thGroup = lb6thGroup;
	}

	public WebElement getLb7thGroup() {
		return lb7thGroup;
	}

	public void setLb7thGroup(WebElement lb7thGroup) {
		this.lb7thGroup = lb7thGroup;
	}

	public WebElement getStartDatepicker() {
		return startDatepicker;
	}

	public void setStartDatepicker(WebElement startDatepicker) {
		this.startDatepicker = startDatepicker;
	}

	public WebElement getEndDatepicker() {
		return endDatepicker;
	}

	public void setEndDatepicker(WebElement endDatepicker) {
		this.endDatepicker = endDatepicker;
	}

	public WebElement getAllocatetxt() {
		return allocatetxt;
	}

	public void setAllocatetxt(WebElement allocatetxt) {
		this.allocatetxt = allocatetxt;
	}

	public WebElement getWarningInvalidLocate() {
		return warningInvalidLocate;
	}

	public void setWarningInvalidLocate(WebElement warningInvalidLocate) {
		this.warningInvalidLocate = warningInvalidLocate;
	}

	public WebElement getDeleteProjectbtn() {
		return deleteProjectbtn;
	}

	public void setDeleteProjectbtn(WebElement deleteProjectbtn) {
		this.deleteProjectbtn = deleteProjectbtn;
	}

	public WebElement getLogout_btn() {
		return logout_btn;
	}

	public void setLogout_btn(WebElement logout_btn) {
		this.logout_btn = logout_btn;
	}

	public WebElement getUserLogged() {
		return userLogged;
	}

	public void setUserLogged(WebElement userLogged) {
		this.userLogged = userLogged;
	}

	public WebElement getProjectStagetab() {
		return projectStagetab;
	}

	public void setProjectStagetab(WebElement projectStagetab) {
		this.projectStagetab = projectStagetab;
	}

	public WebElement getAddStagebtn() {
		return addStagebtn;
	}

	public void setAddStagebtn(WebElement addStagebtn) {
		this.addStagebtn = addStagebtn;
	}

	public WebElement getNewStagechk() {
		return newStagechk;
	}

	public void setNewStagechk(WebElement newStagechk) {
		this.newStagechk = newStagechk;
	}

	public WebElement getInProgressStagechk() {
		return inProgressStagechk;
	}

	public void setInProgressStagechk(WebElement inProgressStagechk) {
		this.inProgressStagechk = inProgressStagechk;
	}

	public WebElement getDoneStagechk() {
		return doneStagechk;
	}

	public void setDoneStagechk(WebElement doneStagechk) {
		this.doneStagechk = doneStagechk;
	}

	public WebElement getSelectbtn() {
		return selectbtn;
	}

	public void setSelectbtn(WebElement selectbtn) {
		this.selectbtn = selectbtn;
	}

	public WebElement getStageZone() {
		return stageZone;
	}

	public void setStageZone(WebElement stageZone) {
		this.stageZone = stageZone;
	}

	public WebElement getUserNametxt() {
		return userNametxt;
	}

	public void setUserNametxt(WebElement userNametxt) {
		this.userNametxt = userNametxt;
	}

	public WebElement getProjectStage() {
		return projectStage;
	}

	public void setProjectStage(WebElement projectStage) {
		this.projectStage = projectStage;
	}

	public WebElement getInProgressStt() {
		return inProgressStt;
	}

	public void setInProgressStt(WebElement inProgressStt) {
		this.inProgressStt = inProgressStt;
	}

	public WebElement getDoneStt() {
		return doneStt;
	}

	public void setDoneStt(WebElement doneStt) {
		this.doneStt = doneStt;
	}

	public WebElement getNewDefaultStage() {
		return newDefaultStage;
	}

	public void setNewDefaultStage(WebElement newDefaultStage) {
		this.newDefaultStage = newDefaultStage;
	}

	public WebElement getInprogressDefaulStage() {
		return inprogressDefaulStage;
	}

	public void setInprogressDefaulStage(WebElement inprogressDefaulStage) {
		this.inprogressDefaulStage = inprogressDefaulStage;
	}

	public WebElement getDoneDefaultStage() {
		return doneDefaultStage;
	}

	public void setDoneDefaultStage(WebElement doneDefaultStage) {
		this.doneDefaultStage = doneDefaultStage;
	}

	public WebElement getNewProjectDefaultStage() {
		return newProjectDefaultStage;
	}

	public void setNewProjectDefaultStage(WebElement newProjectDefaultStage) {
		this.newProjectDefaultStage = newProjectDefaultStage;
	}

	public WebElement getDeleteDoneStagebtn() {
		return deleteDoneStagebtn;
	}

	public void setDeleteDoneStagebtn(WebElement deleteDoneStagebtn) {
		this.deleteDoneStagebtn = deleteDoneStagebtn;
	}

	public WebElement getDeleteNewStagebtn() {
		return deleteNewStagebtn;
	}

	public void setDeleteNewStagebtn(WebElement deleteNewStagebtn) {
		this.deleteNewStagebtn = deleteNewStagebtn;
	}

	public WebElement getNextpagebtn() {
		return nextpagebtn;
	}

	public void setNextpagebtn(WebElement nextpagebtn) {
		this.nextpagebtn = nextpagebtn;
	}

	public WebElement getTooltip() {
		return tooltip;
	}

	public void setTooltip(WebElement tooltip) {
		this.tooltip = tooltip;
	}
	  
	
	
}
