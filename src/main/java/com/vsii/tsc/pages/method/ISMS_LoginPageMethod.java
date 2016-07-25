package com.vsii.tsc.pages.method;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import com.relevantcodes.extentreports.ExtentReports;
import com.vsii.tsc.pages.ISMS_LoginPage;

public class ISMS_LoginPageMethod {	
	ExtentReports extent;
	
	Logger log = Logger.getLogger("trunghung");
	
	WebDriver driver;

	public ISMS_LoginPage objLoginPage = new ISMS_LoginPage();

	public ISMS_LoginPageMethod(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, objLoginPage);
		log.debug("Initiate web driver");
	}

	
	public void setUsername(String txtUsername) {	
	    objLoginPage.Username_txb.clear();
		objLoginPage.Username_txb.sendKeys(txtUsername);
		log.debug("Set username");
	}

	public void setPassword(String txtPassword) {	
	    objLoginPage.Password_txb.clear();
		objLoginPage.Password_txb.sendKeys(txtPassword);
		log.debug("Set password");
	}


	public void clickLogin() {
		objLoginPage.Login_btn.click();
		log.debug("Click Login button");
	}

	public void verifyLoginPage() {
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    String loginPageTitle = driver.getTitle();
        Assert.assertTrue(loginPageTitle.contains("OpenERP"));
        Assert.assertTrue(objLoginPage.Username_txb.getSize()!=null );
        Assert.assertTrue(objLoginPage.Password_txb.getSize()!=null );
    }
	
	public void login(String username, String password) {
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		this.setUsername(username);		
		this.setPassword(password);		
		this.clickLogin();
	}

}
