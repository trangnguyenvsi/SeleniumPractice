package com.vsii.tsc.guru.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WebServicePage {

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
	@FindBy(xpath="//div[@class='oe_list_buttons']/button[contains(text(),'Create')]")
	private WebElement createService;
	
	public WebElement getCreateService(){
		return createService;
	}
	
	public void setCreateService(WebElement createService) {
		this.createService = createService;
	}
	
	//Identify TestService1 item on testservice table according to value in Name column
	@FindBy(xpath= "//td[@data-field='name' and contains(text(),'TestService1')]")
	private WebElement testService1;
	
	
	public WebElement getTestService1() {
		return testService1;
	}

	public void setTestService1(WebElement testService1) {
		this.testService1 = testService1;
	}

	//Elements in create service pop-up window
	@FindBy(xpath="html/body/div[1]/table/tbody/tr[3]/td[2]/div/div/div/div[2]/div/div[4]/div/div/table/tbody/tr[1]/td[1]/table/tbody/tr[1]/td[2]/span/input")
	private WebElement serviceName;
	
	public WebElement getServiceName(){
		return serviceName;
	}
	
	
	public void setServiceName(WebElement serviceName) {
		this.serviceName = serviceName;
	}
	
	@FindBy(xpath = "html/body/div[1]/table/tbody/tr[3]/td[2]/div/div/div/div[2]/div/div[4]/div/div/table/tbody/tr[1]/td[1]/table/tbody/tr[2]/td[2]/span/div/input")
	private WebElement serviceUser;
	
	public WebElement getServiceUser(){
		return serviceUser;
	}
	
	public void setServiceUser(WebElement serviceUser) {
		this.serviceUser = serviceUser;
	}
	
	@FindBy(xpath="html/body/div[1]/table/tbody/tr[3]/td[2]/div/div/div/div[2]/div/div[4]/div/div/table/tbody/tr[1]/td[1]/table/tbody/tr[3]/td[2]/span/select")
	private WebElement serviceType;
	
	public WebElement getServiceType(){
		return serviceType;
	}
	
	public void setServiceType(WebElement serviceType) {
		this.serviceType = serviceType;
	}
	
	@FindBy(xpath="html/body/div[1]/table/tbody/tr[3]/td[2]/div/div/div/div[2]/div/div[4]/div/div/table/tbody/tr[1]/td[1]/table/tbody/tr[4]/td[2]/span/input")
	private WebElement serviceProtocol;
	
	public WebElement getServiceProtocol(){
		return serviceProtocol;
	}
	
	public void setServiceProtocol(WebElement serviceProtocol) {
		this.serviceProtocol = serviceProtocol;
	}
	
	@FindBy(xpath="html/body/div[1]/table/tbody/tr[3]/td[2]/div/div/div/div[2]/div/div[4]/div/div/table/tbody/tr[1]/td[1]/table/tbody/tr[5]/td[2]/span/input")
	private WebElement serviceHost;
	
	public WebElement getServiceHost(){
		return serviceHost;
	}
	
	public void setServiceHost(WebElement serviceHost) {
		this.serviceHost = serviceHost;
	}
	
	@FindBy(xpath="html/body/div[1]/table/tbody/tr[3]/td[2]/div/div/div/div[2]/div/div[4]/div/div/table/tbody/tr[1]/td[1]/table/tbody/tr[6]/td[2]/span/input")
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
	
	@FindBy(xpath="html/body/div[1]/table/tbody/tr[3]/td[2]/div/div/div/div[2]/div/div[4]/div/div/table/tbody/tr[1]/td[1]/table/tbody/tr[10]/td[2]/span/select")
	private WebElement serviceDateTime;
	
	public WebElement getServiceDateTime(){
		return serviceDateTime;
	}
	
	public void setServiceDateTime(WebElement serviceDateTime) {
		this.serviceDateTime = serviceDateTime;
	}
	
//	@FindBy(id = "oe-field-input-80")
//	private WebElement serviceSoftLimit;
//	
//	public WebElement getServiceSoftLimit(){
//		return serviceSoftLimit;
//	}
//	
//	public void setServiceSoftLimit(WebElement serviceSoftLimit) {
//		this.serviceSoftLimit = serviceSoftLimit;
//	}
//	
//	@FindBy(id = "oe-field-input-81")
//	private WebElement serviceErrorLimit;
//	
//	public WebElement getServiceErrorLimit(){
//		return serviceErrorLimit;
//	}
//	
//	public void setServiceErrorLimit(WebElement serviceErrorLimit) {
//		this.serviceErrorLimit = serviceErrorLimit;
//	}
	
	@FindBy(xpath="html/body/div[1]/table/tbody/tr[3]/td[2]/div/div/div/div[2]/div/div[4]/div/div/table/tbody/tr[2]/td[1]/table/tbody/tr[1]/td[2]/span/select")
	private WebElement serviceAuthOption;
	
	public WebElement getServiceAuthOption(){
		return serviceAuthOption;
	}
	
	public void setServiceAuthOption(WebElement serviceAuthOption) {
		this.serviceAuthOption = serviceAuthOption;
	}
	
	@FindBy(xpath="html/body/div[1]/table/tbody/tr[3]/td[2]/div/div/div/div[2]/div/div[4]/div/div/table/tbody/tr[2]/td[1]/table/tbody/tr[2]/td[2]/span/input")
	private WebElement serviceLogin;
	
	public WebElement getServiceLogin(){
		return serviceLogin;
	}
	
	public void setServiceLogin(WebElement serviceLogin) {
		this.serviceLogin = serviceLogin;
	}

	@FindBy(xpath="html/body/div[1]/table/tbody/tr[3]/td[2]/div/div/div/div[2]/div/div[4]/div/div/table/tbody/tr[2]/td[1]/table/tbody/tr[3]/td[2]/span/input")
	private WebElement servicePassword;
	
	public WebElement getServicePassword(){
		return servicePassword;
	}
	
	public void setServicePassword(WebElement servicePassword) {
		this.servicePassword = servicePassword;
	}
	
//	@FindBy(id = "oe-field-input-83")
//	private WebElement servicePriority;
//	
//	public WebElement getServicePriority(){
//		return servicePriority;
//	}
//	
//	public void setServicePriority(WebElement servicePriority) {
//		this.servicePriority = servicePriority;
//	}
	
	@FindBy(xpath="html/body/div[1]/table/tbody/tr[3]/td[2]/div/div/div/div[2]/div/div[4]/div/div/table/tbody/tr[2]/td[2]/table/tbody/tr[1]/td[2]/span/input")
	private WebElement serviceModelName;
	
	public WebElement getServiceModelName(){
		return serviceModelName;
	}
	
	public void setServiceModelName(WebElement serviceModelName) {
		this.serviceModelName = serviceModelName;
	}
	
	@FindBy(xpath="html/body/div[1]/table/tbody/tr[3]/td[2]/div/div/div/div[2]/div/div[4]/div/div/table/tbody/tr[2]/td[2]/table/tbody/tr[5]/td[2]/span/input")
	private WebElement serviceDecodeMethodName;
	
	public WebElement getServiceDecodeMethodName(){
		return serviceDecodeMethodName;
	}
	
	public void setServiceDecodeMethodName(WebElement serviceDecodeMethodName) {
		this.serviceDecodeMethodName = serviceDecodeMethodName;
	}
	
	@FindBy(xpath = "html/body/div[1]/table/tbody/tr[3]/td[2]/div/div/table/tbody/tr[2]/td[1]/div/div[2]/span[2]/button")
//	@FindBy(xpath="//div[@class='oe_form_buttons']/span[2]/button[@accesskey='S']")
	private WebElement serviceSave;
	
	public WebElement getServiceSave(){
		return serviceSave;
	}
	
	public void setServiceSave(WebElement serviceSave) {
		this.serviceSave = serviceSave;
	}
	
	//Elements in WebService details window
	@FindBy(xpath = "html/body/div[1]/table/tbody/tr[3]/td[2]/div/div/div/div[1]/div/table/tbody/tr[2]/td[2]")
	private WebElement runService;

	public WebElement getRunService() {
		return runService;
	}

	public void setRunService(WebElement runService) {
		this.runService = runService;
	}
	
	
	@FindBy(xpath="html/body/div[1]/table/tbody/tr[3]/td[1]/div[1]/div[3]/ul[1]/li[3]/a/span")
	private WebElement vsiiProject;

	public WebElement getVsiiProject() {
		return vsiiProject;
	}

	public void setVsiiProject(WebElement vsiiProject) {
		this.vsiiProject = vsiiProject;
	}
	
	
	@FindBy(xpath="//td[@data-field='name' and contains(text(),'TestProject')]")  // Read name column in project table to find a row with project name = "TestProject" 
	private WebElement testProject;

	public WebElement getTestProject() {
		return testProject;
	}

	public void setTestProject(WebElement testProject) {
		this.testProject = testProject;
	}
	
	// Elements on imported  project details page
	@FindBy(xpath="html/body/div[1]/table/tbody/tr[3]/td[2]/div/div/div/div[2]/div/div[4]/div/div/table/tbody/tr[1]/td[4]/span/span")
	private WebElement projectKey;
	
	public WebElement getProjectKey() {
		return projectKey;
	}

	public void setProjectKey(WebElement projectKey) {
		this.projectKey = projectKey;
	}
	
	@FindBy(xpath = "html/body/div[1]/table/tbody/tr[3]/td[2]/div/div/div/div[2]/div/div[4]/div/div/table/tbody/tr[2]/td[2]/span/span")
	private WebElement projectName;
	
	public WebElement getProjectName() {
		return projectName;
	}

	public void setProjectName(WebElement projectName) {
		this.projectName = projectName;
	}
	
	@FindBy(xpath="html/body/div[1]/table/tbody/tr[3]/td[2]/div/div/div/div[2]/div/div[4]/div/div/table/tbody/tr[3]/td[2]/span/a")
	private WebElement projectDepartment;
	
	public WebElement getProjectDepartment() {
		return projectDepartment;
	}

	public void setProjectDepartment(WebElement projectDepartment) {
		this.projectDepartment = projectDepartment;
	}
	
	@FindBy(xpath="html/body/div[1]/table/tbody/tr[3]/td[2]/div/div/div/div[2]/div/div[4]/div/div/table/tbody/tr[4]/td[2]")
	private WebElement projectProject;
	
	public WebElement getProjectProject() {
		return projectProject;
	}

	public void setProjectProject(WebElement projectProject) {
		this.projectProject = projectProject;
	}
	
	@FindBy(xpath="html/body/div[1]/table/tbody/tr[3]/td[2]/div/div/div/div[2]/div/div[4]/div/div/table/tbody/tr[2]/td[4]/span/span")
	private WebElement projectType;
	public WebElement getProjectType() {
		return projectType;
	}

	public void setProjectType(WebElement projectType) {
		this.projectType = projectType;
	}
	
}
