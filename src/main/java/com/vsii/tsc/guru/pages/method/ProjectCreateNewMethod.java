package com.vsii.tsc.guru.pages.method;

import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import com.vsii.tsc.guru.pages.ProjectCreateNew;

public class ProjectCreateNewMethod {
  WebDriver driver;
  ProjectCreateNew objCreateProject = new ProjectCreateNew();
  public ProjectCreateNewMethod(WebDriver driver) {
	  
	  this.driver = driver;
	  PageFactory.initElements(driver, objCreateProject);
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
  
  public void inputProjectName(String projectName) throws InterruptedException {
		Thread.sleep(1000);
		objCreateProject.getTxtProjectName().clear();
		objCreateProject.getTxtProjectName().sendKeys(projectName);
		Thread.sleep(1000);
		objCreateProject.getTxtProjectName().sendKeys(Keys.TAB);
	}
  
  public void inputRefContract(String refContract) throws InterruptedException {
		Thread.sleep(1000);
		objCreateProject.getTxtRefContract().clear();
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
		objCreateProject.getDropPrivacy().clear();
		objCreateProject.getDropPrivacy().sendKeys(privacy);
		Thread.sleep(1000);
		objCreateProject.getDropPrivacy().sendKeys(Keys.TAB);
	}
  
  public void inputProjectManager(String projectManager) throws InterruptedException {
		Thread.sleep(1000);
		objCreateProject.getDropProjectManager().clear();
		objCreateProject.getDropProjectManager().sendKeys(projectManager);
		Thread.sleep(1000);
		objCreateProject.getDropProjectManager().sendKeys(Keys.TAB);
	}
  
  public void inputApprovedEffort(String approvedEffort) throws InterruptedException {
		Thread.sleep(1000);
		objCreateProject.getTxtApprovedEffort().clear();
		objCreateProject.getTxtApprovedEffort().sendKeys(approvedEffort);
		Thread.sleep(1000);
		objCreateProject.getTxtApprovedEffort().sendKeys(Keys.TAB);
	}
  
  public void inputDepartment(String department) throws InterruptedException {
		Thread.sleep(1000);
		objCreateProject.getDropDepartment().clear();
		objCreateProject.getDropDepartment().sendKeys(department);
		Thread.sleep(1000);
		objCreateProject.getDropDepartment().sendKeys(Keys.TAB);
	}
  
  public void inputProjectType(String projectType) throws InterruptedException {
		Thread.sleep(1000);
		objCreateProject.getDropProjectType().clear();
		objCreateProject.getDropProjectType().sendKeys(projectType);
		Thread.sleep(1000);
		objCreateProject.getDropProjectType().sendKeys(Keys.TAB);
	}
  public void inputCommerDetails(String commDetails) throws InterruptedException {
		Thread.sleep(1000);
		objCreateProject.getDropCommercialDetails().clear();
		objCreateProject.getDropCommercialDetails().sendKeys(commDetails);
		Thread.sleep(1000);
		objCreateProject.getDropCommercialDetails().sendKeys(Keys.TAB);
	}
  
  public void chkVerifyWorlLog() throws InterruptedException {
		objCreateProject.getDropProjectType().click();
	}
  
  public void inputCustomer(String customer) throws InterruptedException {
		Thread.sleep(1000);
		objCreateProject.getDropCustomer().clear();
		objCreateProject.getDropCustomer().sendKeys(customer);
		Thread.sleep(1000);
		objCreateProject.getDropCustomer().sendKeys(Keys.TAB);
	}

  public WebElement getmnProject() {
		return objCreateProject.getMenuProject();
	}
  
  public WebElement getbtnCreate() {
		return objCreateProject.getBtnCreate();
	}
  public WebElement getbtnSave(){
	  
	  return objCreateProject.getBtnSave();
  }
//  Get information in pop-up
  
  public String getPopupText() {
		Alert alert = driver.switchTo().alert();
		return alert.getText();
	}

	public void closePopup() {
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}
  // Create New Project
  
  public void createNewProject (String projectName, String refContract, String projectCode, String privacy, String projectManager, 
		  String approvedEffort, String department, String projectType, String commDetails, String customer ) throws InterruptedException{
	  
	  this.getmnProject();
	  this.getbtnCreate();
	  this.clickCreatebtn();
	  this.inputProjectName(projectName);
	  this.inputRefContract(refContract);
	  this.inputProjectCode(projectCode);
	  this.inputPrivacy(privacy);
	  this.inputProjectManager(projectManager);
	  this.inputApprovedEffort(approvedEffort);
	  this.inputDepartment(department);
	  this.inputProjectType(projectType);
	  this.inputCommerDetails(commDetails);
	  this.chkVerifyWorlLog();
	  this.inputCustomer(customer);
	  this.getbtnSave();
  }	  
  public String CreateSuccess(){
	  return  objCreateProject.getBtnSubmit().getText(); 
	    }

//  public void gotoCreateNewPage (){
//	  objCreateProject.getMenuProject();
//	  objCreateProject.getBtnCreate().click();  
//	  
//  }
}
