package com.vsii.tsc.guru.pages.method;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentReports;
import com.vsii.tsc.guru.pages.LoginPage;

public class LoginPageMethod {	
	ExtentReports extent;
	
	// Create new Web Driver variable
	WebDriver driver;
	// Create new WebElementLogin object
	public LoginPage objLoginPage = new LoginPage();

	// Initialize all web element
	public LoginPageMethod(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, objLoginPage);
	}

	// Enter user name in UserID text box
	public void setUserID(String txtUsername) {		
		objLoginPage.getWebUsername().sendKeys(txtUsername);
	}

	// Enter password in password text box
	public void setPassword(String txtPassword) {		
		objLoginPage.getWebPassword().sendKeys(txtPassword);
	}

	// Click Reset button
	public void clickReset() {
		objLoginPage.getWebReset().click();
	}

	// Click Login button
	public void clickLogin() {
		objLoginPage.getWebLogin().click();
	}

	// Click mouse in UserID text box
	public void clickUserID() {
		objLoginPage.getWebUsername().click();
	}

	// Click mouse in Password text box
	public void clickPassword() {
		objLoginPage.getWebPassword().click();
	}

	// Get the title of Login page
	public String getLoginTitle() {		
		return objLoginPage.getWebTitleText().getText();
	}

	// Get the alert text when leaving User ID text box blank
	public String getUserIdAlert() {
		return objLoginPage.getWebAlertUserID().getText();
	}

	// Get the alert text when leaving Password text box blank
	public String getPasswordAlert() {
		return objLoginPage.getWebAlertPassword().getText();
	}

	// Get the prompt popup when both leaving UserID and/or Password text box
	// blank and click Submit button
	public String getPopupText() {
		Alert alert = driver.switchTo().alert();
		return alert.getText();		
	}

	// Close prompt popup
	public void closePopup() {
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}

	// Get User ID in Login page
	public String getUserID() {
		return objLoginPage.getWebUsername().getText();
	}

	// Get Password in Login page
	public String getPassword() {
		return objLoginPage.getWebPassword().getText();
	}

	// Get Manager ID in Manager page
	public String getManagerIDInManagerPage() {
		return objLoginPage.getManagerID().getText();
	}

	public void loginToManagerPage(String username, String password) {
		objLoginPage.getWebUsername().clear();
		objLoginPage.getWebUsername().sendKeys(username);
	//	ExtentReporterNG.test.log(LogStatus.INFO, "Input user name");
		objLoginPage.getWebPassword().clear();
		objLoginPage.getWebPassword().sendKeys(password);
	//	ExtentReporterNG.test.log(LogStatus.INFO, "Input password");
		
		objLoginPage.getWebLogin().click();
	//	ExtentReporterNG.test.log(LogStatus.INFO, "Click Login");
	}

	public void logout() {
		objLoginPage.getWebLogOut().click();
	}
}
