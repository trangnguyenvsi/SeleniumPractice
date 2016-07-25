package com.vsii.tsc.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PMHomePage {
	
	//WebElement of Messaging Linktext
	@FindBy(xpath = "//a[contains(@class,'oe_menu_toggler')]/span[contains(text(),'Messaging')]")
	private WebElement messagingLink;
	
	//WebElement of Sales Linktext
	
	@FindBy(xpath = "//a[contains(@class,'oe_menu_toggler')]/span[contains(text(),'Sales'")
	private WebElement salesLink;

	//WebElement of Project Linktext
	@FindBy(xpath = "//a[contains(@class,'oe_menu_toggler')]/span[contains(text(),'Project')]")
	private WebElement projectLink;

	//WebElement of Invoicing Linktext
	@FindBy(xpath = "//a[contains(@class,'oe_menu_toggler')]/span[contains(text(),'Invoicing')]")
	private WebElement invoicingLink;

	//WebElement of Human Resources Linktext
	@FindBy(xpath = "//a[contains(@class,'oe_menu_toggler')]/span[contains(text(),'Human Resources')]")
	private WebElement humanResourcesLink;

	//WebElement of ISMS Helpdesk
	@FindBy(xpath = "//a[contains(@class,'oe_menu_toggler')]/span[contains(text(),'ISMS Helpdesk')]")
	private WebElement ismsHelpdeskLink;

	//WebElement of Tools Linktext
	@FindBy(xpath = "//a[contains(@class,'oe_menu_toggler')]/span[contains(text(),'Tools')]")
	private WebElement toolsLink;

	//WebElement of Reports Linktext
	@FindBy(xpath = "//a[contains(@class,'oe_menu_toggler')]/span[contains(text(),'Reports')]")
	private WebElement reportsLink;

	//WebElement of Settings Linktext
	@FindBy(xpath = "//a[contains(@class,'oe_menu_toggler')]/span[contains(text(),'Settings')]/..")
	private WebElement settingsLink;

	//WebElement of Account Information Linktext
	@FindBy(xpath = "/html/body/div[1]/table/tbody/tr[2]/td/span/span")
	private WebElement accountInforLink;
	
	public WebElement getAccountInforLink() {
		return accountInforLink;
	}

	public void setAccountInforLink(WebElement accountInforLink) {
		this.accountInforLink = accountInforLink;
	}

	public WebElement getMessagingLink() {
		return messagingLink;
	}

	public void setMessagingLink(WebElement messagingLink) {
		this.messagingLink = messagingLink;
	}

	public WebElement getSalesLink() {
		return salesLink;
	}

	public void setSalesLink(WebElement salesLink) {
		this.salesLink = salesLink;
	}

	public WebElement getProjectLink() {
		return projectLink;
	}

	public void setProjectLink(WebElement projectLink) {
		this.projectLink = projectLink;
	}

	public WebElement getInvoicingLink() {
		return invoicingLink;
	}

	public void setInvoicingLink(WebElement invoicingLink) {
		this.invoicingLink = invoicingLink;
	}

	public WebElement getHumanResourcesLink() {
		return humanResourcesLink;
	}

	public void setHummanResourcesLink(WebElement hummanResourcesLink) {
		this.humanResourcesLink = hummanResourcesLink;
	}

	public WebElement getIsmsHelpdeskLink() {
		return ismsHelpdeskLink;
	}

	public void setIsmsHelpdeskLink(WebElement ismsHelpdeskLink) {
		this.ismsHelpdeskLink = ismsHelpdeskLink;
	}

	public WebElement getToolsLink() {
		return toolsLink;
	}

	public void setToolsLink(WebElement toolsLink) {
		this.toolsLink = toolsLink;
	}

	public WebElement getReportsLink() {
		return reportsLink;
	}

	public void setReportsLink(WebElement reportsLink) {
		this.reportsLink = reportsLink;
	}

	public WebElement getSettingsLink() {
		return settingsLink;
	}

	public void setSettingsLink(WebElement settingsLink) {
		this.settingsLink = settingsLink;
	}
	
	
}
