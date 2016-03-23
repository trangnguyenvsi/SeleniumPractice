package com.vsii.tsc.guru.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateWebServicePage {

	//Elements in home page
	//Project button in menu bar
	@FindBy(xpath = "html/body/div[1]/table/tbody/tr[2]/td/ul/li[3]/a/span")
	private WebElement webProject;
	
	public WebElement getWebProject(){
		return webProject;
	}
	
	public void setWebProject(WebElement webProject) {
		this.webProject = webProject;
	}
	
	// Elements in Projects page
	// Web service option in side bar
	@FindBy(linkText = "Webservices")
	private WebElement webService;
	
	public WebElement getWebService(){
		return webService;
	}
	
	public void setWebService(WebElement webService) {
		this.webService = webService;
	}
	
	//Create service button
	@FindBy(xpath="(//button[@type='button'])[3]")
	private WebElement createService;
	
	public WebElement getCreateService(){
		return createService;
	}
	
	public void setCreateService(WebElement createService) {
		this.createService = createService;
	}
	
	//Elements in create service pop-up window
	@FindBy(id = "oe-field-input-70")
	private WebElement serviceName;
	
	public WebElement getServiceName(){
		return serviceName;
	}
	
	public void setServiceName(WebElement serviceName) {
		this.serviceName = serviceName;
	}
	
	@FindBy(id = "oe-field-input-71")
	private WebElement serviceUser;
	
	public WebElement getServiceUser(){
		return serviceUser;
	}
	
	public void setServiceUser(WebElement serviceUser) {
		this.serviceUser = serviceUser;
	}
	
	@FindBy(id = "oe-field-input-72")
	private WebElement serviceType;
	
	public WebElement getServiceType(){
		return serviceType;
	}
	
	public void setServiceType(WebElement serviceType) {
		this.serviceType = serviceType;
	}
	
	@FindBy(id = "oe-field-input-73")
	private WebElement serviceProtocol;
	
	public WebElement getServiceProtocol(){
		return serviceProtocol;
	}
	
	public void setServiceProtocol(WebElement serviceProtocol) {
		this.serviceProtocol = serviceProtocol;
	}
	
	@FindBy(id = "oe-field-input-74")
	private WebElement serviceHost;
	
	public WebElement getServiceHost(){
		return serviceHost;
	}
	
	public void setServiceHost(WebElement serviceHost) {
		this.serviceHost = serviceHost;
	}
	
	@FindBy(id = "oe-field-input-75")
	private WebElement servicePort;
	
	public WebElement getServicePort(){
		return servicePort;
	}
	
	public void setServicePort(WebElement servicePort) {
		this.servicePort = servicePort;
	}
	
	@FindBy(name = "ws_path")
	private WebElement servicePath;
	
	public WebElement getServicePath(){
		return servicePath;
	}
	
	public void setServicePath(WebElement servicePath) {
		this.servicePath = servicePath;
	}
	
	@FindBy(name = "datetime_format")
	private WebElement serviceDateTime;
	
	public WebElement getServiceDateTime(){
		return serviceDateTime;
	}
	
	public void setServiceDateTime(WebElement serviceDateTime) {
		this.serviceDateTime = serviceDateTime;
	}
	
	@FindBy(id = "oe-field-input-80")
	private WebElement serviceSoftLimit;
	
	public WebElement getServiceSoftLimit(){
		return serviceSoftLimit;
	}
	
	public void setServiceSoftLimit(WebElement serviceSoftLimit) {
		this.serviceSoftLimit = serviceSoftLimit;
	}
	
	@FindBy(id = "oe-field-input-81")
	private WebElement serviceErrorLimit;
	
	public WebElement getServiceErrorLimit(){
		return serviceErrorLimit;
	}
	
	public void setServiceErrorLimit(WebElement serviceErrorLimit) {
		this.serviceErrorLimit = serviceErrorLimit;
	}
	
	@FindBy(id = "oe-field-input-90")
	private WebElement serviceAuthOption;
	
	public WebElement getServiceAuthOption(){
		return serviceAuthOption;
	}
	
	public void setServiceAuthOption(WebElement serviceAuthOption) {
		this.serviceAuthOption = serviceAuthOption;
	}
	
	@FindBy(id = "oe-field-input-91")
	private WebElement serviceLogin;
	
	public WebElement getServiceLogin(){
		return serviceLogin;
	}
	
	public void setServiceLogin(WebElement serviceLogin) {
		this.serviceLogin = serviceLogin;
	}

	@FindBy(id = "oe-field-input-92")
	private WebElement servicePassword;
	
	public WebElement getServicePassword(){
		return servicePassword;
	}
	
	public void setServicePassword(WebElement servicePassword) {
		this.servicePassword = servicePassword;
	}
	
	@FindBy(id = "oe-field-input-83")
	private WebElement servicePriority;
	
	public WebElement getServicePriority(){
		return servicePriority;
	}
	
	public void setServicePriority(WebElement servicePriority) {
		this.servicePriority = servicePriority;
	}
	
	@FindBy(id = "oe-field-input-93")
	private WebElement serviceModelName;
	
	public WebElement getServiceModelName(){
		return serviceModelName;
	}
	
	public void setServiceModelName(WebElement serviceModelName) {
		this.serviceModelName = serviceModelName;
	}
	
	@FindBy(id = "oe-field-input-97")
	private WebElement serviceDecodeMethodName;
	
	public WebElement getServiceDecodeMethodName(){
		return serviceDecodeMethodName;
	}
	
	public void setServiceDecodeMethodName(WebElement serviceDecodeMethodName) {
		this.serviceDecodeMethodName = serviceDecodeMethodName;
	}
	
	@FindBy(xpath = "html/body/div[1]/table/tbody/tr[3]/td[2]/div/div/table/tbody/tr[2]/td[1]/div/div[2]/span[2]/button")
	private WebElement serviceSave;
	
	public WebElement getServiceSave(){
		return serviceSave;
	}
	
	public void setServiceSave(WebElement serviceSave) {
		this.serviceSave = serviceSave;
	}
	
	
	
}
