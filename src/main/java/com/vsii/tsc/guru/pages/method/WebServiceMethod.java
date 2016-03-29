package com.vsii.tsc.guru.pages.method;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.vsii.tsc.guru.pages.VSIIProjectPage;
import com.vsii.tsc.guru.pages.WebServicePage;

public class WebServiceMethod {

	// Create new Web Driver variable
	WebDriver driver;
	// Create new WebElementLogin object
	public WebServicePage objWSPage = new WebServicePage();
	public VSIIProjectPage objVsiiProjectPage  = new VSIIProjectPage(); 

	// Initialize all web element
	public WebServiceMethod(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, objWSPage);
		PageFactory.initElements(driver, objVsiiProjectPage);
	}

	// Enter Project module from home page
	public void clickProjectMenu() {
		objWSPage.getWebProject().click();
	}

	// Click on Web service option in side bar
	public void clickWebServiceOption() {
		objWSPage.getWebService().click();
	}

	// Click button to create web service
	/*
	 * Input xpath here without using page object
	 * Use either the existing way or the commented way (It's OK to wait or not) 
	 *  
	 */
	public void clickCreateService() {

		objWSPage.getCreateService().click();
//		WebDriverWait wait = new WebDriverWait(TestBase.driver, 10);
//		 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='oe_list_buttons']/button[contains(text(),'Create')]")));
//		element.click();
		
	}

	// Fill in service name
	public void setServiceName(String txtServiceName) {
		objWSPage.getServiceName().sendKeys(txtServiceName);
	}

	// Chooose user from dropdown list
	public void setUser(String username) {
		Select select = new Select(driver.findElement(By.xpath("html/body/div[1]/table/tbody/tr[3]/td[2]/div/div/div/div[2]/div/div[4]/div/div/table/tbody/tr[1]/td[1]/table/tbody/tr[2]/td[2]/span/div/input")));
		select.selectByVisibleText(username);
		
//		new Select(objCWSPage.getServiceUser()).selectByVisibleText(username);
	}

	// Set type of protocol
	public void setType(String type) {
		Select select = new Select(driver.findElement(By.xpath("html/body/div[1]/table/tbody/tr[3]/td[2]/div/div/div/div[2]/div/div[4]/div/div/table/tbody/tr[1]/td[1]/table/tbody/tr[3]/td[2]/span/select")));
		select.selectByVisibleText(type);
//		xpath="html/body/div[1]/table/tbody/tr[3]/td[2]/div/div/div/div[2]/div/div[4]/div/div/table/tbody/tr[1]/td[1]/table/tbody/tr[3]/td[2]/span/select"
//		new Select(objCWSPage.getServiceType()).selectByVisibleText(type);
	}

	// Set protocol
	public void setProtocol(String protocol) {
		objWSPage.getServiceProtocol().sendKeys(protocol);
	}

	// Set service host
	public void setHost(String host) {
		objWSPage.getServiceHost().sendKeys(host);
	}

	// Set service port
	public void setPort(String port) {
		objWSPage.getServicePort().sendKeys(port);
	}

	// Set service path
	public void setPath(String path) {
		objWSPage.getServicePath().sendKeys(path);
	}

	// Choose date - time format
	public void setDateTimeFormat(String datetime) {
		new Select(objWSPage.getServiceDateTime()).selectByVisibleText(datetime);
	}

	// Set authentication method
	public void setAuthMethod(String auth) {
		new Select(objWSPage.getServiceAuthOption()).selectByVisibleText(auth);
	}
//		Select select = new Select(driver.findElement(By.xpath("html/body/div[1]/table/tbody/tr[3]/td[2]/div/div/div/div[2]/div/div[4]/div/div/table/tbody/tr[1]/td[1]/table/tbody/tr[3]/td[2]/span/select")));
//	select.selectByVisibleText(type);
	
	
	// Set Jira username
	public void setJiraUsername(String Jusername) {
		objWSPage.getServiceLogin().sendKeys(Jusername);
	}

	// Set Jira password
	public void setJiraPassword(String Jpass) {
		objWSPage.getServicePassword().sendKeys(Jpass);
	}

	// Set service model name
	public void setModelName(String modelName) {
		objWSPage.getServiceModelName().sendKeys(modelName);
	}

	// Set service Decode method name
	public void setDecodeMethod(String decodeMethodName) {
		objWSPage.getServiceDecodeMethodName().sendKeys(decodeMethodName);
	}
	
	// Click create service
	public void clickSave(){
		objWSPage.getServiceSave().click();
	}
	
	//Click created service
	public void clickChooseService(){
		try{
		    objWSPage.getTestService1().click();
		}
		catch(org.openqa.selenium.StaleElementReferenceException ex)
		{
			objWSPage.getTestService1().click();
		}
		
		
	}
	
	//Click running web service
	public void clickRunningService(){
			objWSPage.getRunService().click();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			objWSPage.getRunService().click();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			objWSPage.getRunService().click();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	
	//Click on VSII Projects option on side bar
	public void clickVsiiProject(){
		objWSPage.getVsiiProject().click();
	}
	
	//Click imported project
	public void clickImportedProject(){
		try{
			objWSPage.getTestProject().click();
		}catch(org.openqa.selenium.StaleElementReferenceException ex){
			objWSPage.getTestProject().click();
		}
	}
	
	//Get project key
	public String getProjectKey(){
		return objWSPage.getProjectKey().getText();
	}
	
	//Get project name
	public String getProjectName(){
		return objWSPage.getProjectName().getText();
	}
	
	//Get project department
	public String getProjectDepartment(){
		return objWSPage.getProjectDepartment().getText();
	}
	
	//Get project Project field
	public String getProjectProject(){
		return objWSPage.getProjectProject().getText();
	}
	
	//Get project type field
	public String getProjectType(){
		return objWSPage.getProjectType().getText();
	}

	// Click Edit imported project
	public void clickEditImportedProject(){
		try{
			objVsiiProjectPage.getEditProjectBtn().click();
		}
		catch(org.openqa.selenium.StaleElementReferenceException ex)
		{
			objVsiiProjectPage.getEditProjectBtn().click();
		}
	}
	
	// Input Project name to "Project" dropdown
	public void setProjectName(String projectName){
		objVsiiProjectPage.getProjectDropdown().clear();
		objVsiiProjectPage.getProjectDropdown().sendKeys(projectName);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		objVsiiProjectPage.getProjectDropdown().sendKeys(Keys.TAB);
	}
	
	// Click "No verify worklog" check box if it is checked, leave it empty if it has not been checked
	public void clickNoVerifyChkbox(){
		
		WebElement checkBox = objVsiiProjectPage.getNoVerifyWorklogchkbx();
		
		if(checkBox.isSelected()){
			checkBox.click();
		}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	// Click Save project
	public void clickSaveImportedProject(){
		objVsiiProjectPage.getSaveBtn().click();
	}	
}
