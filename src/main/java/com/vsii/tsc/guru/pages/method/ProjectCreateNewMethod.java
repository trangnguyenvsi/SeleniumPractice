package com.vsii.tsc.guru.pages.method;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import com.vsii.tsc.guru.pages.ProjectCreateNew;

public class ProjectCreateNewMethod {
  WebDriver driver;
  ProjectCreateNew objCreateProject = new ProjectCreateNew();
  public ProjectCreateNewMethod(WebDriver driver) {
	  
	  this.driver = driver;
	  PageFactory.initElements(driver, objCreateProject);
  }
  // 
  //Logout method
  public void logout () throws InterruptedException{
		objCreateProject.getUserLogged().click();
		objCreateProject.getLogout_btn().click();	
//		Thread.sleep(6000);
//		objCreateProject.getUserNametxt().clear();
	
	}
  
  public void clickProjectMenu (){
		objCreateProject.getMenuProject();
		objCreateProject.getMenuProject().click();		
	}
  public String getGrouplb (){
	 return objCreateProject.getLbGroup().getText();
  }
  public String getProjectName (){
	 return objCreateProject.getLbProjectName().getText();
  }
  public String getProjectManager (){
	 return objCreateProject.getLbProjectManager().getText();
  }
  public String getContact (){
	 return objCreateProject.getContact().getText();
  }
  public String getPlannedTime (){
	 return objCreateProject.getLbPlannedTime().getText();
  }
  public String getTotalTime (){
	 return objCreateProject.getLbTotalTime().getText();
  }

  public String getSpendTime (){
	 return objCreateProject.getLbTimeSpent().getText();
  }
  public String getProjectCode (){
	 return objCreateProject.getLbProjectCode().getText();
  }

  public String getProgress (){
	 return objCreateProject.getLbProgress().getText();
  }
  public String getStatuslb (){
	 return objCreateProject.getLbStatus().getText();
  }

  public WebElement getLbGroup() {
		return objCreateProject.getLbGroup();
	}
//
  public void clickDepartment(){
	objCreateProject.getLbDepartement();
	objCreateProject.getLbDepartement().click();
	
  }	
	
  public String getlbProject1(){
	return objCreateProject.getLbProject1().getText();	
  }	
	
  public String getlbProject2(){
	return objCreateProject.getLbProject2().getText();	
  }	
	
  public String getlbProject3(){
	return objCreateProject.getLbProject3().getText();	
  }	

  public String getlbProject4(){
	return objCreateProject.getLbProject4().getText();	
  }
  
  //
  
  public WebElement getNEWdefaultstt() {
		return objCreateProject.getNewDefaultStage();
		
	}
  
  public WebElement getInProgressdefaultstt() {
		return objCreateProject.getInprogressDefaulStage();
		
	}
  public WebElement getDonedefaultstt() {
		return objCreateProject.getDoneDefaultStage();
		
	}
  
  public WebElement getNEWstt() {
		return objCreateProject.getNewStt();
	}
  
  public WebElement getINPROGRESSstt(){
	 return objCreateProject.getInProgressStt();
	  }
  
  public WebElement getDONEstt(){
		return objCreateProject.getDoneStt();
	  }
  
  public WebElement getEightythProject() {
		return objCreateProject.getEightythProject();
	}
  
  public WebElement getProjectwith3stage() {
		return objCreateProject.getProjectWith3Stage();
	}
  
  // get all value of all fields:
  
  public void clickCreatebtn (){
	  objCreateProject.getBtnCreate();
	  objCreateProject.getBtnCreate().click();  
  }
  public void clickProjectmn (){
	  objCreateProject.getMenuProject();
	  objCreateProject.getMenuProject().click();  
  }
  
  public void clickProjectTSCmn (){
	  objCreateProject.getMenunProjectTSC();
	  objCreateProject.getMenunProjectTSC().click();  
  }
  
  public void clickSearchAd (){
	  objCreateProject.getSearchAdtxt();
	  objCreateProject.getSearchAdtxt().click();  
  }
  
  public void clickReviewStt (){
	  objCreateProject.getReviewFilter();
	  objCreateProject.getReviewFilter().click();  
  }
 
  public void clickRemoveOpenFilter (){
	  objCreateProject.getRemoveOpenFilterbtn();
	  objCreateProject.getRemoveOpenFilterbtn().click();  
  }
  
  public void clickNewstt (){
	  objCreateProject.getNewStt();
	  objCreateProject.getNewStt().click();  
  }
  
  public void clickProjectNew (){
	  objCreateProject.getNewProjectStt();
	  objCreateProject.getNewProjectStt().click();  
  }
  
  public void clickProjectApproving (){
	  objCreateProject.getProjectApproving();
	  objCreateProject.getProjectApproving().click();  
  }
  
  public void clickProjectEditWithPS (){
	  objCreateProject.getProjectEditWithPS();
	  objCreateProject.getProjectEditWithPS().click();  
  }
  
  public void clickNewProject (){
	  objCreateProject.getNewDefaultStage();
	  objCreateProject.getNewDefaultStage().click();  
  }
  public void clickStageOfProject (){
	  objCreateProject.getProjectStage();
	  objCreateProject.getProjectStage().click();  
  }
  
  public void clickProjectwith3Stage (){
	  objCreateProject.getProjectWith3Stage();
	  objCreateProject.getProjectWith3Stage().click();  
  }
  
  public void click80thProject(){
	  objCreateProject.getEightythProject();
	  objCreateProject.getEightythProject().click();  
  }
  
  public void clickDeleteDoneStage (){
	  objCreateProject.getDeleteDoneStagebtn();
	  objCreateProject.getDeleteDoneStagebtn().click();  
  }
  
  public void clickDeleteNewStage (){
	  objCreateProject.getDeleteNewStagebtn();
	  objCreateProject.getDeleteNewStagebtn().click();  
  }
  
  public void clickNextpagebtn(){
	  objCreateProject.getNextpagebtn();
	  objCreateProject.getNextpagebtn().click();  
  }
  
  public void clickNewStage (){
	  objCreateProject.getNewStagechk();
	  objCreateProject.getNewStagechk().click();  
  }
  
  public void clickInProgressStage (){
	  objCreateProject.getInProgressStagechk();
	  objCreateProject.getInProgressStagechk().click();  
  }
  
  public void clickDoneStage (){
	  objCreateProject.getDoneStagechk();
	  objCreateProject.getDoneStagechk().click();  
  }
  
  public void clickAddStagebtn (){
	  objCreateProject.getAddStagebtn();
	  objCreateProject.getAddStagebtn().click();  
  }
  
  public void clickSelectbtn (){
	  objCreateProject.getSelectbtn();
	  objCreateProject.getSelectbtn().click();  
  }
  
  public void clickDepart (){
	  objCreateProject.getDepSDC();
	  objCreateProject.getDepSDC().click();  
  }
  
  public String getTimesheetbtn(){
	 return objCreateProject.getTimesheetbtn().getText();  
  }
  
  public String getTaskbtn(){
		 return objCreateProject.getTaskbtn().getText();  
	  }
  
  public String getWarning(){
		 return objCreateProject.getWarning().getText();  
	  }
  
  public void clickProjectDemo (){
	  objCreateProject.getProjectNametxt();
	  objCreateProject.getProjectNametxt().click();  
  }
  
  public void clickProjectDemo1 (){
	  objCreateProject.getProjectNametxt1();
	  objCreateProject.getProjectNametxt1().click();  
  }
 
  public void clickSavebtn() {
		Actions builder = new Actions(driver);
		builder.moveToElement(objCreateProject.getBtnSave()).perform();
		objCreateProject.getBtnSave();
		objCreateProject.getBtnSave().click();
	}
  
  public void clickApprove() {
		Actions builder = new Actions(driver);
		builder.moveToElement(objCreateProject.getApprovebtn()).perform();
		objCreateProject.getApprovebtn();
		objCreateProject.getApprovebtn().click();
	}
  
  
  public void clickRefuseApproving() {
		Actions builder = new Actions(driver);
		builder.moveToElement(objCreateProject.getRefusebtn()).perform();
		objCreateProject.getRefusebtn();
		objCreateProject.getRefusebtn().click();
	}
  
  public void inputProjectName(String projectName) throws InterruptedException {
		Thread.sleep(1000);
		objCreateProject.getTxtProjectName().sendKeys(projectName);
		Thread.sleep(1000);
		
	}
  
  public void inputRefContract(String refContract) throws InterruptedException {
	  	Thread.sleep(1000);
		objCreateProject.getTxtRefContract().sendKeys(refContract);
		Thread.sleep(1000);
		objCreateProject.getTxtRefContract().sendKeys(Keys.TAB);
	}
  
  public void inputProjectCode(String projectCode) throws InterruptedException {
		Thread.sleep(1000);
		objCreateProject.getTxtProjectCode().clear();
		objCreateProject.getTxtProjectCode().sendKeys(projectCode);
		Thread.sleep(1000);
		objCreateProject.getTxtProjectCode().sendKeys(Keys.TAB);
	}
  
  public void inputPrivacy(String privacy) throws InterruptedException {
		Thread.sleep(1000);
		objCreateProject.getDropPrivacy().sendKeys(privacy);
		Thread.sleep(1000);
		objCreateProject.getDropPrivacy().sendKeys(Keys.TAB);
	}
  
  public void inputProjectManager(String projectManager) throws InterruptedException {
		Thread.sleep(1000);
		objCreateProject.getDropProjectManager().sendKeys(projectManager);
		Thread.sleep(1000);
		objCreateProject.getDropProjectManager().sendKeys(Keys.TAB);
	}
  
  public void editProjectManager(String projectManager) throws InterruptedException {
		Thread.sleep(1000);
		objCreateProject.getDropProjectManager1().click();
		objCreateProject.getDropProjectManager1().clear();
		objCreateProject.getDropProjectManager1().sendKeys(projectManager);
		Thread.sleep(1000);
		objCreateProject.getDropProjectManager1().sendKeys(Keys.TAB);
	}
  public void inputApprovedEffort(String approvedEffort) throws InterruptedException {
		Thread.sleep(1000);
		objCreateProject.getTxtApprovedEffort().clear();
		objCreateProject.getTxtApprovedEffort().sendKeys(approvedEffort);

	}
  
  public void inputDepartment(String department) throws InterruptedException {
		Thread.sleep(1000);
		objCreateProject.getDropDepartment().sendKeys(department);
		Thread.sleep(1000);
	}
  
  public void inputDepartment2(String department2) throws InterruptedException {
		Thread.sleep(1000);
		objCreateProject.getDropDepartment2().click();
		objCreateProject.getDropDepartment2().clear();
		objCreateProject.getDropDepartment2().sendKeys(department2);
		Thread.sleep(1000);
		objCreateProject.getDropDepartment2().sendKeys(Keys.TAB);
	}
  
  public void inputProjectType(String projectType) throws InterruptedException {
		Thread.sleep(1000);
		objCreateProject.getDropProjectType().sendKeys(projectType);
		Thread.sleep(1000);
		objCreateProject.getDropProjectType().sendKeys(Keys.TAB);
	}
  
  public void inputCommerDetails(String commDetails) throws InterruptedException {
		Thread.sleep(1000);
		objCreateProject.getDropCommercialDetails().sendKeys(commDetails);
		Thread.sleep(1000);
		objCreateProject.getDropCommercialDetails().sendKeys(Keys.TAB);
	}

  public void inputCustomer(String customer) throws InterruptedException {
		Thread.sleep(1000);
		objCreateProject.getDropCustomer().sendKeys(customer);
		Thread.sleep(1000);
		objCreateProject.getDropCustomer().sendKeys(Keys.TAB);
	}
  
  public WebElement getcreateNewSucc() {
		return objCreateProject.getCreateNewSucc();
	}
  public WebElement getmnProject() {
		return objCreateProject.getMenuProject();
	}
  public WebElement getDepart() {
		return objCreateProject.getDepSDC();
	}
  public WebElement getProjectDemo() {
		return objCreateProject.getProjectNametxt();
	}
  
  public WebElement getTimesheet() {
		return objCreateProject.getTimesheetbtn();
	}
  
  public WebElement getTask() {
		return objCreateProject.getTaskbtn();
	}
  
  public WebElement getProjectDemo1() {
		return objCreateProject.getProjectNametxt1();
	}
  
  public WebElement getbtnCreate() {
		return objCreateProject.getBtnCreate();
	}
  public void getbtnSave(){
	  
	objCreateProject.getBtnSave().click();;
  }
  
  public WebElement getEditbtn() {
		return objCreateProject.getEditbtn();
	} 
  
  public void clickEditProjbtn() {
	 objCreateProject.getEditbtn().click();;
	} 
//  Get information in pop-up
  
public String getPopupText() {
		Alert alert = driver.switchTo().alert();
		return alert.getText();
	}
    // Click on OK on pop-up
	public void closePopup() {
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}
	
	public void cickCancelOnPopup() {
		Alert alert = driver.switchTo().alert();
		alert.dismiss();;
	}
	
	// get Element on page after create new success
	public String getCreateSucc(){
		return objCreateProject.getCreateSucc().getText();
	}
	
	// Case: invalid: get error mes
	public String getErrorMes(){
		return objCreateProject.getErrorMes().getText();
	}
	// Method for Edit project Case 9:
	public void clickSaveEdbtn() {
		Actions builder = new Actions(driver);
		builder.moveToElement(objCreateProject.getSavebtn()).perform();
		objCreateProject.getSavebtn();
		objCreateProject.getSavebtn().click();
	}
	
	public void clickDiscardbtn() {
		Actions builder = new Actions(driver);
		builder.moveToElement(objCreateProject.getDiscardbtn()).perform();
		objCreateProject.getDiscardbtn();
		objCreateProject.getDiscardbtn().click();
	}
	
	public void clickEditbtn() {
		Actions builder = new Actions(driver);
		builder.moveToElement(objCreateProject.getEditbtn()).perform();
		objCreateProject.getEditbtn();
		objCreateProject.getEditbtn().click();
	}
	
	public void clickCloseProjectbtn() {
		Actions builder = new Actions(driver);
		builder.moveToElement(objCreateProject.getCloseProjectbtn()).perform();
		objCreateProject.getCloseProjectbtn();
		objCreateProject.getCloseProjectbtn().click();
	}
		
	public void clickReopenProjectbtn() {
		Actions builder = new Actions(driver);
		builder.moveToElement(objCreateProject.getReopenProjectbtn()).perform();
		objCreateProject.getReopenProjectbtn();
		objCreateProject.getReopenProjectbtn().click();
	}
	
	public void clickPendingProjbtn() {
		Actions builder = new Actions(driver);
		builder.moveToElement(objCreateProject.getPendingbtn()).perform();
		objCreateProject.getPendingbtn();
		objCreateProject.getPendingbtn().click();
	}
	
	public void clickSetAsTempbtn() {
		Actions builder = new Actions(driver);
		builder.moveToElement(objCreateProject.getSetasTemptn()).perform();
		objCreateProject.getSetasTemptn();
		objCreateProject.getSetasTemptn().click();
	}
	
	public void clickCancelProjbtn() {
		Actions builder = new Actions(driver);
		builder.moveToElement(objCreateProject.getCancelProjectbtn()).perform();
		objCreateProject.getCancelProjectbtn();
		objCreateProject.getCancelProjectbtn().click();
	}
	
	 public void editPrivacy(String privacy) throws InterruptedException {
			Thread.sleep(1000);
			objCreateProject.getDropPrivacy().click();
			objCreateProject.getDropPrivacy().sendKeys(privacy);
			Thread.sleep(1000);
			objCreateProject.getDropPrivacy().sendKeys(Keys.TAB);
		}
	 
	 public void editApprovedEffort(String approvedEffort) throws InterruptedException {
			Thread.sleep(1000);
			objCreateProject.getTxtApprovedEffort().clear();
			objCreateProject.getTxtApprovedEffort().sendKeys(approvedEffort);

		}
	 
	 public void editDepartment(String department2) throws InterruptedException {
			Thread.sleep(1000);
			objCreateProject.getDropDepartment2().click();
			objCreateProject.getDropDepartment2().clear();
			objCreateProject.getDropDepartment2().sendKeys(department2);
			Thread.sleep(1000);
			objCreateProject.getDropDepartment2().sendKeys(Keys.TAB);
		}
	 public String getNewPrivacy(){
			return objCreateProject.getNewprivacy().getText();
		}
	 public String getNewEffort(){
			return objCreateProject.getNeweffort().getText();
		}
	 
	 // Method for case 14: Get color of element
	 
	 public void clickSubmitToReviewbtn() {
			Actions builder = new Actions(driver);
			builder.moveToElement(objCreateProject.getBtnSubmit()).perform();
			objCreateProject.getBtnSubmit();
			objCreateProject.getBtnSubmit().click();
		}
	 
	 public String getColorReviewbtn(){
			return objCreateProject.getReviewStt().getCssValue("background-color");
		}
	 
	 public String getColorNewbtn(){
			return objCreateProject.getNewStage().getCssValue("background-color");
		}
	 
	 public String getColorProgessbtn(){
			return objCreateProject.getProgressStt().getCssValue("background-color");
		}
	 
	 public String getColorClosedbtn(){
			return objCreateProject.getCloseProjectbtn().getCssValue("background-color");
		}
	 
	 public WebElement getCloseProjectbtn() {
			return objCreateProject.getCloseProjectbtn();
		}
	 
	 public WebElement getPendingProjectbtn() {
			return objCreateProject.getPendingbtn();
		}
	 
	 public WebElement getCancelProjectbtn() {
			return objCreateProject.getCancelProjectbtn();
		}
	 
	 public WebElement getTemplate1() {
			return objCreateProject.getTemplate1();
		}
	 
	 public WebElement getTemplate2() {
			return objCreateProject.getTemplate2();
		}
	 
	 public WebElement getReopenProjbtn() {
			return objCreateProject.getReopenProjectbtn();
		}
	 
	 public WebElement getSetAsTemp() {
			return objCreateProject.getSetasTemptn();
		}
	 
	 public WebElement getCloseProjbtn() {
			return objCreateProject.getCloseProjectbtn();
		}
	 // Method for case 15:
	 
	 public WebElement getmnProjectTSC() {
			return objCreateProject.getMenunProjectTSC();
		}	
	 
	 public WebElement getSearchAdtxt() {
			return objCreateProject.getSearchAdtxt();
		}
	 
	 public WebElement getSubmitAfterRef() {
			return objCreateProject.getSubmitAterRefus();
		}
	 
	 public String getProjectstt(){
			return objCreateProject.getProjectStt().getText();
		}
	 
	 public String getSubmitAfterRefus(){
			return objCreateProject.getSubmitAterRefus().getText();
		}
	 public String getStatus(){
			return objCreateProject.getStatustxt().getText();
		}
	 public void isCheckedWorklog() {
			objCreateProject.getSavebtn().click();
		}
	 
//	 public void clickDel() {
//			objCreateProject.getDeleteProjectbtn().click();
//		}
	 
   // Method on case 20:
	 public void clickAddMember (){
		  objCreateProject.getAddMemberbtn();
		  objCreateProject.getAddMemberbtn().click();  
	  }
	 
	 public void clickDelMem() {
			Actions builder = new Actions(driver);
			builder.moveToElement(objCreateProject.getDeleteProjectbtn()).perform();
			objCreateProject.getDeleteProjectbtn();
			objCreateProject.getDeleteProjectbtn().click();
		}
	 
	 public void clickSaveMem() {
			Actions builder = new Actions(driver);
			builder.moveToElement(objCreateProject.getSaveMem()).perform();
			objCreateProject.getSaveMem();
			objCreateProject.getSaveMem().click();
		}
	 
	 public void inputUserNameMem(String usernameMem) throws InterruptedException {
			Thread.sleep(1000);
			objCreateProject.getUsernameMemdrop().sendKeys(usernameMem);
			Thread.sleep(1000);
			objCreateProject.getUsernameMemdrop().sendKeys(Keys.TAB);
		}
	 
	 public void inputStartDate(String startDate) throws InterruptedException {
		    objCreateProject.getStartDatepicker().clear();
			objCreateProject.getStartDatepicker().sendKeys(startDate);
		}
	 
	 public void inputEndDate(String endDate) throws InterruptedException {
		 	objCreateProject.getEndDatepicker().clear();
			objCreateProject.getEndDatepicker().sendKeys(endDate);	
		}
	 
	 public void inputAllocate(String allocate) throws InterruptedException {
		 	objCreateProject.getAllocatetxt().clear();
			objCreateProject.getAllocatetxt().sendKeys(allocate);	
		}
	 
	 public String getteamMember() {
			return objCreateProject.getTeamMember().getText();
		}
	 
	 public String getAllocate() {
			return objCreateProject.getAllocatetxt().getText();
		}
	 
	 public String getWarningInvalidAllocate() {
			return objCreateProject.getWarningInvalidLocate().getText();
		}
	 
	 public String getTextInStageZone() {
			return objCreateProject.getStageZone().getText();
		}
	 
	 public void clickStageProjectTab() {
		 	objCreateProject.getProjectStagetab().click();
		}
	 
	 public WebElement getUsername() {
			return objCreateProject.getUserNametxt();
		}
	 public WebElement getTooltip() {
			return objCreateProject.getTooltip();
		}
	 
	 public String getTooltips() {
			return objCreateProject.getTooltip().getText();
		}
	 
	 public void clickSubmitReview(){
		 objCreateProject.getSubmitToReviewBtn().click();
	 }
	 
	 public void clickCurrentUser(){
		 objCreateProject.getCurrentUser().click();
	 }
	 
	 public void clickLogout(){
		 objCreateProject.getLogOutBtn().click();
	 }
	 
	 public void closeOpenOption(){
		 objCreateProject.getOpenOption().click();
	 }
	 
	 public void clickApproveBtn(){
		 objCreateProject.getApproveBtn().click();
	 }
	 
  // Create New Project:
  
  public void createNewProject (String projectName, String refContract, String projectCode, String privacy, String projectManager, 
		  String approvedEffort, String department2, String projectType, String commDetails, String customer ) throws InterruptedException{
	  this.inputProjectName(projectName);
	  this.inputRefContract(refContract);
	  this.inputProjectCode(projectCode);
	  this.inputPrivacy(privacy);
	  this.inputProjectManager(projectManager);
	  this.inputApprovedEffort(approvedEffort);
	  this.inputDepartment(department2);
	  this.inputProjectType(projectType);
	  this.inputCommerDetails(commDetails);
	  this.inputCustomer(customer);
	  this.clickSavebtn();
  }	  
  
  public void createNewProject2 (String projectName, String refContract, String projectCode, String privacy, String projectManager, 
		  String approvedEffort, String department2, String projectType, String commDetails, String customer ) throws InterruptedException{
	  this.inputProjectName(projectName);
	  this.inputRefContract(refContract);
	  this.inputProjectCode(projectCode);
	  this.inputPrivacy(privacy);
	  this.inputProjectManager(projectManager);
	  this.inputApprovedEffort(approvedEffort);
	  this.inputDepartment2(department2);
	  this.inputProjectType(projectType);
	  this.inputCommerDetails(commDetails);
	  this.inputCustomer(customer);
	  this.clickSavebtn();
  }	  

  public void createNewProject3 (String projectName, String refContract, String projectCode, String privacy, String projectManager, 
		  String approvedEffort, String department2, String projectType, String commDetails, String customer ) throws InterruptedException{
	  this.inputProjectName(projectName);
	  this.inputRefContract(refContract);
	  this.inputProjectCode(projectCode);
	  this.inputPrivacy(privacy);
	  this.inputProjectManager(projectManager);
	  this.inputApprovedEffort(approvedEffort);
	  this.inputDepartment2(department2);
	  this.inputProjectType(projectType);
	  this.inputCommerDetails(commDetails);
	  this.inputCustomer(customer);
	  this.clickSavebtn();
  }	  
  
  public void editProject(String privacy,String approvedEffort) throws InterruptedException{
	  this.clickEditbtn();
	  this.editPrivacy(privacy);
	  this.editApprovedEffort(approvedEffort);
//	  this.clickSaveEdbtn();
  }	
  
  public void editProject2(String department) throws InterruptedException{
	  this.clickEditbtn();
	  this.inputDepartment2(department);
//	  this.editDepartment(department);
	  this.clickSaveEdbtn();
  }	
  
  public void editProject3(String department, String projectType, String commDetails) throws InterruptedException{
	 this.clickEditbtn();
	 this.inputDepartment(department);
	 this.inputProjectType(projectType);
	 this.inputCommerDetails(commDetails);
	 this.clickSaveEdbtn();
  }	
  
  public void editProject4(String projectManager, String privacy) throws InterruptedException{
		 this.clickEditbtn();
		 this.editProjectManager(projectManager);
		 this.editPrivacy(privacy);
		 this.isCheckedWorklog();
//		 this.clickSaveEdbtn();
	  }	
  
  public void discardEditProject(String privacy,String approvedEffort) throws InterruptedException{
	  this.clickEditbtn();
	  this.inputPrivacy(privacy);
	  this.editApprovedEffort(approvedEffort);
	  this.clickDiscardbtn();
//	  this.clickSaveEdbtn();
  }
  
  public void addNewMember(String usernameMerber) throws InterruptedException{
	  
//		 this.clickEditbtn();
		 this.inputUserNameMem(usernameMerber);
		 this.clickSaveMem();
	  }	
  public void addNewMember1(String usernameMember, String startDate, String endDate, String allocate) throws InterruptedException{	  
		 this.inputUserNameMem(usernameMember);
		 this.inputStartDate(startDate);
		 this.inputEndDate(endDate);
		 this.inputAllocate(allocate);
	  
		 this.clickSaveMem();
	  }	
  
  /*
   * This section is added by QuyenTX on ProjectCreateNewMethod
   * The following methods are used in Websevice Testing module 
   */
  
  // Create project to use in webservice testing
  public void createProject(String projectName, String approvedEffort, String projectType, String commDetails ) throws InterruptedException{
//	  this.clickCreatebtn();
	  this.inputProjectName(projectName);
	  this.inputApprovedEffort(approvedEffort);
	  this.inputProjectType(projectType);
	  this.inputCommerDetails(commDetails);
	  Thread.sleep(1000);
	  this.clickSavebtn();
	  Thread.sleep(1000);
	  this.clickSubmitReview();
	  Thread.sleep(1000);
	  this.clickCurrentUser();
	  this.clickLogout();
  }
  
}
