package com.vsii.tsc.guru.testcase;

import org.testng.Assert;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.vsii.tsc.guru.commethods.CommonMethods;
import com.vsii.tsc.guru.pages.method.LoginPageMethod;
import com.vsii.tsc.guru.pages.method.LogoutPageMethod;
import com.vsii.tsc.guru.pages.method.PMHomePageMethod;
import com.vsii.tsc.guru.pages.method.SettingsPageMethod;
import com.vsii.tsc.guru.pages.method.SkillsPageMethod;
import com.vsii.tsc.guru.testdata.TestData;
import com.vsii.tsc.utility.CommonOperations;
import com.vsii.tsc.utility.TestBase;

public class SkillsManagementHome extends TestBase{
	LoginPageMethod objLoginPage;
	PMHomePageMethod objPMHomePage;
	SettingsPageMethod objSettingsPage;
	SkillsPageMethod objSkillsPage;
	LogoutPageMethod objLogoutPage;
	
	
	@BeforeClass
	public void setupClass() {
		objLoginPage = new LoginPageMethod(driver);
		objPMHomePage = new PMHomePageMethod(driver);
		objSettingsPage = new SettingsPageMethod(driver);
		objSkillsPage = new SkillsPageMethod(driver);
		objLogoutPage = new LogoutPageMethod(driver);
		
	}
		
	@Test(priority = 1, description = "Verify OpenERP can open correctly", groups = "1")
	public void SM_01() {
		//Verify that Page Title image is displayed
		CommonMethods.waitUntil(objLoginPage.getPageTitle());
		Assert.assertTrue(objLoginPage.getPageTitle().isDisplayed());
		
		//Verify that Username textbox is displayed
		CommonMethods.waitUntil(objLoginPage.getUsernametxt());
		Assert.assertTrue(objLoginPage.getUsernametxt().isDisplayed());
		
		//Verify that Password textbox is displayed
		CommonMethods.waitUntil(objLoginPage.getPasswordtxt());
		Assert.assertTrue(objLoginPage.getPasswordtxt().isDisplayed());
	}
	
	@Test(priority = 2, description = "Verify employee can access OpenERP correctly", dataProvider = "employeeLogin", dataProviderClass = TestData.class, groups = "1")
	public void SM_03(String username, String password) {
		objLoginPage.loginToManagerPage(username, password);

		//Verify that Messaging link text is displayed with employee
		CommonMethods.waitUntil(objPMHomePage.getMessagingLink());
		Assert.assertTrue(objPMHomePage.getMessagingLink().isDisplayed());
		
		//Verify that Project link text is displayed with employee
		CommonMethods.waitUntil(objPMHomePage.getProjectLink());
		Assert.assertTrue(objPMHomePage.getProjectLink().isDisplayed());
		
		//Verify that Humman Resources link text is displayed with employee
		CommonMethods.waitUntil(objPMHomePage.getHummanResourcesLink());
		Assert.assertTrue(objPMHomePage.getHummanResourcesLink().isDisplayed());
		
		//Verify that ISMS Helpdesk link text is displayed with employee
		CommonMethods.waitUntil(objPMHomePage.getIsmsHelpdeskLink());
		Assert.assertTrue(objPMHomePage.getIsmsHelpdeskLink().isDisplayed());
	}
	
	@AfterGroups(groups = "1")
	//Close browser
	public void teardownSM_02() {
		objLogoutPage.performLogout();
	}
	
	@Test(priority = 3, description = "Verify PM can access OpenERP correctly", dataProvider = "projectManagerLogin", dataProviderClass = TestData.class)
	public void SM_02(String username, String password) {
		objLoginPage.loginToManagerPage(username, password);
		
		//Verify that Messaging link text is displayed
		CommonMethods.waitUntil(objPMHomePage.getMessagingLink());
		Assert.assertTrue(objPMHomePage.getMessagingLink().isDisplayed());
		
		//Verify that Project link text is displayed
		CommonMethods.waitUntil(objPMHomePage.getProjectLink());
		Assert.assertTrue(objPMHomePage.getProjectLink().isDisplayed());
		
		//Verify that Humman Resources link text is displayed
		CommonMethods.waitUntil(objPMHomePage.getHummanResourcesLink());
		Assert.assertTrue(objPMHomePage.getHummanResourcesLink().isDisplayed());
		
		//Verify that ISMS Helpdesk link text is displayed 
		CommonMethods.waitUntil(objPMHomePage.getIsmsHelpdeskLink());
		Assert.assertTrue(objPMHomePage.getIsmsHelpdeskLink().isDisplayed());
		
		//Verify that Invoicing link text is displayed 
		CommonMethods.waitUntil(objPMHomePage.getInvoicingLink());
		Assert.assertTrue(objPMHomePage.getInvoicingLink().isDisplayed());
		
		//Verify that Reports link text is displayed
		CommonMethods.waitUntil(objPMHomePage.getReportsLink());
		Assert.assertTrue(objPMHomePage.getReportsLink().isDisplayed());
		
		//Verify that Settings link text is displayed 
		CommonMethods.waitUntil(objPMHomePage.getSettingsLink());
		Assert.assertTrue(objPMHomePage.getSettingsLink().isDisplayed());
		
		//Verify that Account information link text is displayed correctly
		CommonMethods.waitUntil(objPMHomePage.getAccountInforLink());
		Assert.assertTrue(objPMHomePage.getAccountInforUsername().equalsIgnoreCase(username));
	}
	
	@Test(priority = 4, description = "Verify that Settings is displayed correctly")
	public void SM_04() throws InterruptedException {
		objPMHomePage.clickSettingsLink();
		
		//Verify that Skills section is displayed
		CommonMethods.waitUntil(objSettingsPage.getSkillsSection());
		Assert.assertTrue(objSettingsPage.getSkillsSection().isDisplayed());
		
		//Verify that Certificates section is displayed
		CommonMethods.waitUntil(objSettingsPage.getCertificatesSection());
		Assert.assertTrue(objSettingsPage.getAwardsSection().isDisplayed());
		
		//Verify that Categories section is displayed
		CommonMethods.waitUntil(objSettingsPage.getCategoriesSection());
		Assert.assertTrue(objSettingsPage.getCategoriesSection().isDisplayed());
		
		//Verify that Organizers section is displayed
		CommonMethods.waitUntil(objSettingsPage.getOrganizersSection());
		Assert.assertTrue(objSettingsPage.getOrganizersSection().isDisplayed());
	}
	
	@Test(priority = 5, description = "Verify that Skills List is displayed correctly")
	public void SM_05() {
		//Verify that each row should has a skill
		CommonMethods.waitUntil(objSkillsPage.getNameValueRows());
		Assert.assertTrue(objSkillsPage.shouldEachRowEachSkill());
		
		//Verify that Check All checkbox is displayed
		CommonMethods.waitUntil(objSkillsPage.getCheckAllCbx());
		Assert.assertTrue(objSkillsPage.getCheckAllCbx().isDisplayed());

		//Verify that Name header is displayed
		CommonMethods.waitUntil(objSkillsPage.getNameHeader());
		Assert.assertTrue(objSkillsPage.getNameHeader().isDisplayed());
		
		//Verify that Domain header is displayed
		CommonMethods.waitUntil(objSkillsPage.getSkillDomainHeader());
		Assert.assertTrue(objSkillsPage.getSkillDomainHeader().isDisplayed());
	}
	
	@Test(priority = 6, description = "Verify that the system confirm before deleting a Skill", dataProvider = "deleteSkill", dataProviderClass = TestData.class)
	public void SM_06(String skillName, String skillDomain) throws InterruptedException {
		objSkillsPage.markToDelete(skillName, skillDomain);
		objSkillsPage.clickMoreBtn();
		objSkillsPage.clickDeleteBtn();
		
		Thread.sleep(1000);
		Assert.assertTrue(CommonMethods.alertShouldBeCorrect("Do you really want to remove these records?"));
	}
	
	@Test(priority = 7, description = "Verify that user can postpone a request to delete a Skill ", dataProvider = "deleteSkill", dataProviderClass = TestData.class)
	public void SM_08 (String skillName, String skillDomain) throws InterruptedException  {
		objSkillsPage.clickMoreBtn();
		objSkillsPage.clickDeleteBtn();
		objSkillsPage.cancelPopup();
		
		//Verify that Skill is NOT deleted successfully
		Assert.assertTrue(objSkillsPage.getSkillToDeleteCbx(skillName, skillDomain).isDisplayed());
	}
	
	@Test(priority = 8, description = "Verify that user can delete a Skill from Skills List", dataProvider = "deleteSkill", dataProviderClass = TestData.class)
	public void SM_07 (String skillName, String skillDomain)  {
		objSkillsPage.clickMoreBtn();
		objSkillsPage.clickDeleteBtn();
		objSkillsPage.acceptPopup();
		
		//Verify that Skill is NOT deleted successfully
		Assert.assertFalse(objSkillsPage.getSkillToDeleteCbx(skillName, skillDomain).isDisplayed());
	}
	
	@AfterMethod
    public void afterMethod() throws Exception {
        CommonOperations.takePicture();
    }
}
