package com.vsii.tsc.pages.method;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.vsii.tsc.pages.PMHomePage;


public class PMHomePageMethod {
	// Create new Web Driver variable
	WebDriver driver;
	
	//Initilize Logger
	Logger log = Logger.getLogger("khaidq");
	
	// Create new WebElement PMHome object
	public PMHomePage objPMHomePage = new PMHomePage();
	
	// Initialize all web element
	public PMHomePageMethod(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, objPMHomePage);
		log.debug("Initiate web driver of PM 's Home page");
	}
	
	
	//Click Settings Link text
	public void clickSettingsLink() throws InterruptedException {
		Thread.sleep(2000);
		this.getSettingsLink().click();
		log.debug("Click Settings link text");
	}
	
	
	//Get Messaging Link text element
	public WebElement getMessagingLink() {
		return objPMHomePage.getMessagingLink();
	}
	
	//Get Project Link text element
	public WebElement getProjectLink() {
		return objPMHomePage.getProjectLink();
	}
	
	//Get Humman Resources Link text element
	public WebElement getHummanResourcesLink() {
		return objPMHomePage.getHumanResourcesLink();
	}

	//Get ISMS Helpdesk Link text element
	public WebElement getIsmsHelpdeskLink() {
		return objPMHomePage.getIsmsHelpdeskLink();
	}
	
	//Get Invoicing text element
	public WebElement getInvoicingLink() {
		return objPMHomePage.getInvoicingLink();
	}
	
	//Get Tools Link text element
	public WebElement getToolsLink() {
		return objPMHomePage.getToolsLink();
	}
	
	//Get Reports Link text element
	public WebElement getReportsLink() {
		return objPMHomePage.getReportsLink();
	}

	//Get Setting Link text element
	public WebElement getSettingsLink() {
		return objPMHomePage.getSettingsLink();
	}
	
	//Get Account Information Link text element
	public WebElement getAccountInforLink() {
		return objPMHomePage.getAccountInforLink();
	}
	
	//Get Account Information text
	public String getAccountInforUsername() {
		return objPMHomePage.getAccountInforLink().getText();
	}
	
	//Click Human Resources linktext
	public void clickHumanResourcesLink() {
		objPMHomePage.getHumanResourcesLink().click();
	}
}