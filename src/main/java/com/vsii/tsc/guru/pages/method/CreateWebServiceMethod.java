package com.vsii.tsc.guru.pages.method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import com.vsii.tsc.guru.pages.CreateWebServicePage;

public class CreateWebServiceMethod {

	// Create new Web Driver variable
	WebDriver driver;
	// Create new WebElementLogin object
	public CreateWebServicePage objCWSPage = new CreateWebServicePage();

	// Initialize all web element
	public CreateWebServiceMethod(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, objCWSPage);
	}

	// Enter Project module from home page
	public void clickProjectMenu() {
		objCWSPage.getWebProject().click();
	}

	// Click on Web service option in side bar
	public void clickWebServiceOption() {
		objCWSPage.getWebService().click();
	}

	// Click button to create web service
	/*
	 * Input xpath here without using page object
	 * Use either the existing way or the commented way (It's OK to wait or not) 
	 *  
	 */
	public void clickCreateService() {

		objCWSPage.getCreateService().click();
//		WebDriverWait wait = new WebDriverWait(TestBase.driver, 10);
//		 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='oe_list_buttons']/button[contains(text(),'Create')]")));
//		element.click();
		
	}

	// Fill in service name
	public void setServiceName(String txtServiceName) {
		objCWSPage.getServiceName().sendKeys(txtServiceName);
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
		objCWSPage.getServiceProtocol().sendKeys(protocol);
	}

	// Set service host
	public void setHost(String host) {
		objCWSPage.getServiceHost().sendKeys(host);
	}

	// Set service port
	public void setPort(String port) {
		objCWSPage.getServicePort().sendKeys(port);
	}

	// Set service path
	public void setPath(String path) {
		objCWSPage.getServicePath().sendKeys(path);
	}

	// Choose date - time format
	public void setDateTimeFormat(String datetime) {
		new Select(objCWSPage.getServiceDateTime()).selectByVisibleText(datetime);
	}

	// Set authentication method
	public void setAuthMethod(String auth) {
		new Select(objCWSPage.getServiceAuthOption()).selectByVisibleText(auth);
	}
//		Select select = new Select(driver.findElement(By.xpath("html/body/div[1]/table/tbody/tr[3]/td[2]/div/div/div/div[2]/div/div[4]/div/div/table/tbody/tr[1]/td[1]/table/tbody/tr[3]/td[2]/span/select")));
//	select.selectByVisibleText(type);
	
	
	// Set Jira username
	public void setJiraUsername(String Jusername) {
		objCWSPage.getServiceLogin().sendKeys(Jusername);
	}

	// Set Jira password
	public void setJiraPassword(String Jpass) {
		objCWSPage.getServicePassword().sendKeys(Jpass);
	}

	// Set service model name
	public void setModelName(String modelName) {
		objCWSPage.getServiceModelName().sendKeys(modelName);
	}

	// Set service Decode method name
	public void setDecodeMethod(String decodeMethodName) {
		objCWSPage.getServiceDecodeMethodName().sendKeys(decodeMethodName);
	}
	
	// Click create service
	public void clickSave(){
		objCWSPage.getServiceSave().click();
	}

	// PERFORM CREATING SERVICE
	public void createWebService(String txtServiceName, String txtType, String txtProtocol,
			String txtHost, String txtPort, String txtPath, String txtDateTime, String txtAuth, String txtJusername, String txtJPassword, String txtModelName,
			String txtDecodeMethodName) {

		clickProjectMenu();
		clickWebServiceOption();
		clickCreateService();
		setServiceName(txtServiceName);
//		setUser(txtUser);
		setType(txtType);
		setProtocol(txtProtocol);
		setHost(txtHost);
		setPort(txtPort);
		setPath(txtPath);
		setDateTimeFormat(txtDateTime) ;
		setAuthMethod(txtAuth);
		setJiraUsername(txtJusername);
		setJiraPassword(txtJPassword); 
		setModelName(txtModelName);
		setDecodeMethod(txtDecodeMethodName);
		clickSave();
		 
	}

}
