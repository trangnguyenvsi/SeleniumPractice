package com.vsii.tsc.pages.method;

import org.apache.log4j.Logger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentReports;
import com.vsii.tsc.com.methods.CommonMethods;
import com.vsii.tsc.pages.LoginPage;

public class LoginPageMethod {
	Logger log = Logger.getLogger("trunghung");
	WebDriver driver;
	LoginPage objLogin = new LoginPage();

	public LoginPageMethod(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, objLogin);
		log.debug("Initiate web driver");
	}

	// Choose DB Demo
	// public void chooseDB(String txtUsername) {
	// objLogin.getDb().;
	// log.debug("Set DB Demo");
	// }

	// Get the title of Login page
	// public String getLoginTitle() {
	//// log.debug("Get web title text");
	// return objLogin.getWebTitleText().getText();
	// }

	// Log in manager page
	public void loginToManagerPage(String username, String password) {
		CommonMethods.waitUntil(objLogin.getUserNametxt());
		objLogin.getUserNametxt().clear();
		objLogin.getUserNametxt().sendKeys(username);
		objLogin.getPasswordtxt().clear();
		objLogin.getPasswordtxt().sendKeys(password);

		objLogin.getLoginbutt().click();
		log.debug("Login to Manager page");
	}

	public void clearText() {
		objLogin.getUserNametxt().clear();
		objLogin.getPasswordtxt().clear();
	}
	
	// Get Manager ID in Manager page
	// public String getManagerIDInManagerPage() {
	//// log.debug("Get Manager ID in manager page");
	// return objLogin.getManagerID().getText();
	// }
//		}
		
		// Choose DB Demo
//		public void chooseDB(String txtUsername) {
//			objLogin.getDb().;
//			log.debug("Set DB Demo");
//		}
		
		// Enter username in UserID textbox
		public void enterUserID(String txtUsername) {
			objLogin.getUserNametxt().sendKeys(txtUsername);
		}
		
		// Enter password in password textbox
		public void enterPassword(String txtPass) {
			objLogin.getPasswordtxt().sendKeys(txtPass);
		}
		
		// Click login button
		public void clickLogin() {
			objLogin.getLoginbutt().click();
		}
		
//		 Get the title of Login page
//		public String getLoginTitle() {
////			log.debug("Get web title text");
//			return objLogin.getWebTitleText().getText();
//		}

		//Get Page Title element
		public WebElement getPageTitle() {
			return objLogin.getPageTitle();
		}
		
		//Get Username textbox
		public WebElement getUsernametxt() {
			return objLogin.getUserNametxt();
		}
		
		//Get Password textbox
		public WebElement getPasswordtxt() {
			return objLogin.getPasswordtxt();
		}
						
}
