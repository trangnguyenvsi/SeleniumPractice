package com.vsii.tsc.testcase;

import java.io.IOException;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.vsii.tsc.com.methods.CommonMethods;
import com.vsii.tsc.pages.method.CategoriesPageMethod;
import com.vsii.tsc.pages.method.CreateCategoryPageMethod;
import com.vsii.tsc.pages.method.CreateSkillPageMethod;
import com.vsii.tsc.pages.method.EmployeeDetailPageMethod;
import com.vsii.tsc.pages.method.EmployeeListPageMethod;
import com.vsii.tsc.pages.method.LoginPageMethod;
import com.vsii.tsc.pages.method.LogoutPageMethod;
import com.vsii.tsc.pages.method.PMHomePageMethod;
import com.vsii.tsc.pages.method.SettingsPageMethod;
import com.vsii.tsc.pages.method.SkillsPageMethod;
import com.vsii.tsc.testdata.TestData;
import com.vsii.tsc.utility.CommonOperations;
import com.vsii.tsc.utility.TestBase;

public class SkillsManagement extends TestBase{
	LoginPageMethod objLoginPage;
	PMHomePageMethod objPMHomePage;
	SettingsPageMethod objSettingsPage;
	SkillsPageMethod objSkillsPage;
	LogoutPageMethod objLogoutPage;
	CategoriesPageMethod objCategoriesPage;
	CreateCategoryPageMethod objCreateCategoryPage;
	CreateSkillPageMethod objCreateSkillPage;
	EmployeeListPageMethod objEmployeeListPage;
	EmployeeDetailPageMethod objEmployeeDetailPage;
	
	
	@BeforeClass
	public void setupClass() throws IOException {
		p = CommonOperations.readConfig();
		objLoginPage = new LoginPageMethod(driver);
		objPMHomePage = new PMHomePageMethod(driver);
		objSettingsPage = new SettingsPageMethod(driver);
		objSkillsPage = new SkillsPageMethod(driver);
		objLogoutPage = new LogoutPageMethod(driver);
		objCategoriesPage = new CategoriesPageMethod(driver);
		objCreateCategoryPage = new CreateCategoryPageMethod(driver);
		objCreateSkillPage = new CreateSkillPageMethod(driver);
		objEmployeeListPage = new EmployeeListPageMethod(driver);
		objEmployeeDetailPage= new EmployeeDetailPageMethod(driver);
	}
		
	@Test(priority = 1, description = "Verify OpenERP can open correctly", groups = "EmployeeHome")
	public void SM_01() {
		methodName = "SM_01";
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
	
	@Test(priority = 2, description = "Verify employee can access OpenERP correctly", dataProvider = "employeeLogin", dataProviderClass = TestData.class, groups = "EmployeeHome")
	public void SM_03(String username, String password) {
		methodName = "SM_03";
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
	
	@AfterGroups(groups = "EmployeeHome")
	//Finish Employee Home group and Intitialize Project Manager Home group
	public void finishEmployeeHome() {
		objLogoutPage.logout();
	}
	
	@Test(priority = 3, description = "Verify PM can access OpenERP correctly", dataProvider = "projectManagerLogin", dataProviderClass = TestData.class, groups = "ProjectManagerHome")
	public void SM_02(String username, String password) {
		methodName = "SM_02";
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
	
	@Test(priority = 4, description = "Verify that Settings is displayed correctly", groups = "ProjectManagerHome")
	public void SM_04() throws InterruptedException {
		methodName = "SM_04";
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
	
	@Test(priority = 5, description = "Verify that Skills List is displayed correctly", groups = "ProjectManagerHome")
	public void SM_05() {
		methodName = "SM_05";
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
	
	@Test(priority = 6, description = "Verify that the system confirm before deleting a Skill", dataProvider = "deleteSkill", dataProviderClass = TestData.class, groups = "ProjectManagerHome")
	public void SM_06(String skillName, String skillDomain) throws InterruptedException {
		methodName = "SM_06";
		objSkillsPage.markToDelete(skillName, skillDomain);
		objSkillsPage.clickMoreBtn();
		objSkillsPage.clickDeleteBtn();
		
		Thread.sleep(1000);
		Assert.assertTrue(CommonMethods.alertShouldBeCorrect("Do you really want to remove these records?"));
	}
	
	@Test(priority = 7, description = "Verify that user can postpone a request to delete a Skill ", dataProvider = "deleteSkill", dataProviderClass = TestData.class, groups = "ProjectManagerHome")
	public void SM_08 (String skillName, String skillDomain) throws InterruptedException  {
		methodName = "SM_08";
		objSkillsPage.clickMoreBtn();
		objSkillsPage.clickDeleteBtn();
		objSkillsPage.cancelPopup();
		
		//Verify that Skill is NOT deleted successfully
		Assert.assertTrue(objSkillsPage.getSkillToDeleteCbx(skillName, skillDomain).isDisplayed());
	}
	
	@Test(priority = 8, description = "Verify that user can delete a Skill from Skills List", dataProvider = "deleteSkill", dataProviderClass = TestData.class, groups = "ProjectManagerHome")
	public void SM_07 (String skillName, String skillDomain) throws InterruptedException  {
		methodName = "SM_07";
		objSkillsPage.clickMoreBtn();
		objSkillsPage.clickDeleteBtn();
		objSkillsPage.acceptPopup();
		
		//Verify that Skill is NOT deleted successfully
		Assert.assertFalse(objSkillsPage.getSkillToDeleteCbx(skillName, skillDomain).isDisplayed());
	}
	
	@AfterGroups(groups = "ProjectManagerHome")
	//Finish Project Manager Home group and Intitialize Category group
	public void finishProjectManagerHome() {
		objLogoutPage.logout();
	}
	
	@Test(priority = 9, description = "Verify that Categories List is displayed correctly", dataProvider = "projectManagerLogin", dataProviderClass = TestData.class, groups = "Category")
	public void SM_09 (String username, String password) throws InterruptedException {
		methodName = "SM_09";
		objLoginPage.loginToManagerPage(username, password);
		objPMHomePage.clickSettingsLink();
		objSettingsPage.clickCategoriesSection();
		
		CommonMethods.waitUntil(objCategoriesPage.getNameValueRows());
		Assert.assertTrue(objCategoriesPage.shouldEachRowEachSkill());
		Assert.assertTrue(objCategoriesPage.getCheckAllCbx().isDisplayed());
		Assert.assertTrue(objCategoriesPage.getNameHeader().isDisplayed());
		Assert.assertTrue(objCategoriesPage.getTypeHeader().isDisplayed());
		Assert.assertTrue(objCategoriesPage.getParentCategoryHeader().isDisplayed());
	}
	
	@Test(priority = 10, description = "Verify that the system confirm before deleting a category", dataProvider = "deleteCategory", dataProviderClass = TestData.class, groups = "Category")
	public void SM_10 (String categoryName, String categoryType, String parentCategory) throws InterruptedException {
		methodName = "SM_10";
		objCategoriesPage.markToDelete(categoryName, categoryType, parentCategory);
		objCategoriesPage.clickMoreBtn();
		objCategoriesPage.clickDeleteBtn();
		
		Thread.sleep(1000);
		Assert.assertTrue(objCategoriesPage.alertShouldBeCorrect("Do you really want to remove these records?"));
	}
	
	@Test(priority = 11, description = "Verify that user can postpone a request to delete a Category", dataProvider = "deleteCategory", dataProviderClass = TestData.class, groups = "Category")
	public void SM_12 (String categoryName, String categoryType, String parentCategory) throws InterruptedException {
		methodName = "SM_12";
		objCategoriesPage.clickMoreBtn();
		objCategoriesPage.clickDeleteBtn();
		objCategoriesPage.cancelPopup();
		Thread.sleep(500);
		Assert.assertTrue(objCategoriesPage.getCategoryToDeleteCbx(categoryName, categoryType, parentCategory).isDisplayed());
	}
	
	@Test(priority = 12, description = "Verify that user can delete a category from Categories List", dataProvider = "deleteCategory", dataProviderClass = TestData.class, groups = "Category")
	public void SM_11 (String categoryName, String categoryType, String parentCategory) throws InterruptedException {
		methodName = "SM_11";
		objCategoriesPage.clickMoreBtn();
		objCategoriesPage.clickDeleteBtn();
		objCategoriesPage.acceptPopup();
		Thread.sleep(1000);
		Assert.assertFalse(objCategoriesPage.getCategoryToDeleteCbx(categoryName, categoryType, parentCategory).isDisplayed());
	}
	
	@Test(priority = 13, description = "Verify that Create form is opened correctly")
	public void SM_13() {
		methodName = "SM_13";
		objCategoriesPage.clickCreateBtn();

		Assert.assertTrue(objCreateCategoryPage.getCategoryNameBlankTbx().isDisplayed());
		Assert.assertTrue(objCreateCategoryPage.getCategoryDescriptionBlankTextarea().isDisplayed());
	}
	
	@Test(priority = 14, description = "Verify that the fields 'Name', 'Type'  are required field", groups = "Category")
	public void SM_14() {
		methodName = "SM_14";
		objCreateCategoryPage.inputCategoryName("");
		objCreateCategoryPage.selectCategoryType("");
		objCreateCategoryPage.inputCategoryDescription("");
		objCreateCategoryPage.clickSave();
		
		Assert.assertTrue(objCreateCategoryPage.getRequiredNotification("Name", "Type").isDisplayed());
	}
	
	@Test(priority = 15, description = "Verify that user can create a new category", dataProvider = "createCategory", dataProviderClass = TestData.class, groups = "Category")
	public void SM_15(String categoryName, String categoryType, String categoryDescription) {
		methodName = "SM_15";
		CommonMethods.waitUntil(objCreateCategoryPage.getCategoryNameTbx());
		objCreateCategoryPage.inputCategoryName(categoryName);
		objCreateCategoryPage.selectCategoryType(categoryType);
		objCreateCategoryPage.inputCategoryDescription(categoryDescription);
		objCreateCategoryPage.clickSave();
		
		Assert.assertTrue(objCreateCategoryPage.getCreatedCategoryName(categoryName).equals(categoryName));
		Assert.assertTrue(objCreateCategoryPage.getCreatedCategoryType(categoryType).equals(categoryType));
		Assert.assertTrue(objCreateCategoryPage.getCreatedCategoryDescription(categoryDescription).equals(categoryDescription));
	}
	
//	@Test(priority = 16, description = "Verify that form 'Create: Parent Category' is opened correctly in Categories section", dataProvider = "createCategory", dataProviderClass = TestData.class, groups = "Category")
//	public void SM_16(String categoryName, String categoryType, String categoryDescription) {
//		objCreateCategoryPage.inputCategoryName(categoryName);
//		objCreateCategoryPage.selectCategoryType(categoryType);
//		objCreateCategoryPage.inputCategoryDescription(categoryDescription);
//		
//		Assert.fail("[Create and Edit] element is not existed");
//	}
	
	@Test(priority = 18, description = "Verify that user can modifiy the information in a category", dataProvider = "editCategory", dataProviderClass = TestData.class, groups = "Category")
	public void SM_18(String editedCategoryName, String editedCategoryType, String editedCategoryDescription) {
		methodName = "SM_18";
		CommonMethods.waitUntil(objCreateCategoryPage.getEditBtn());
		objCreateCategoryPage.clickEditBtn();
		objCreateCategoryPage.inputCategoryName(editedCategoryName);
		objCreateCategoryPage.selectCategoryType(editedCategoryType);
		objCreateCategoryPage.inputCategoryDescription(editedCategoryDescription);
		objCreateCategoryPage.clickSave();
		
		Assert.assertTrue(objCreateCategoryPage.getCreatedCategoryName(editedCategoryName).equals(editedCategoryName));
		Assert.assertTrue(objCreateCategoryPage.getCreatedCategoryType(editedCategoryType).equals(editedCategoryType));
		Assert.assertTrue(objCreateCategoryPage.getCreatedCategoryDescription(editedCategoryDescription).equals(editedCategoryDescription));
	}

	
	@Test(priority = 19, description = "Verify that the system confirm before discarding edit a category", groups = "Category")
	public void SM_19() {
		methodName = "SM_19";
		CommonMethods.waitUntil(objCreateCategoryPage.getEditBtn());
		objCreateCategoryPage.clickEditBtn();
		objCreateCategoryPage.inputCategoryName("Test123");
		objCreateCategoryPage.clickDiscardBtn();
		
		Assert.assertTrue(CommonMethods.alertShouldBeCorrect("Warning, the record has been modified, your changes will be discarded.\n\nAre you sure you want to leave this page ?"));
	}
	
//	@Test(priority = 20, description = "Verify that PM can postpone a request to discard editing a category")
	
	@Test(priority = 21, description = "Verify that PM can discard to edit a category", dataProvider = "editCategory", dataProviderClass = TestData.class, groups = "Category")
	public void SM_21(String categoryName, String categoryType, String categoryDescription) throws InterruptedException {
		methodName = "SM_21";
		objCreateCategoryPage.clickDiscardBtn();
		objCreateCategoryPage.acceptPopup();
		Thread.sleep(2000);
		Assert.assertTrue(objCreateCategoryPage.getCreatedCategoryName(categoryName).equals(categoryName));
		Assert.assertTrue(objCreateCategoryPage.getCreatedCategoryType(categoryType).equals(categoryType));
		Assert.assertTrue(objCreateCategoryPage.getCreatedCategoryDescription(categoryDescription).equals(categoryDescription));
	}

	@AfterGroups(groups = "Category")
	//Finish Category group and Intitialize Skill group
	public void finishCategory() {
		
		objLogoutPage.logout();
	}

	@Test(priority = 22, description = "Verify that form 'New' is opened correctly in Skills section", dataProvider = "projectManagerLogin", dataProviderClass = TestData.class, groups = "Skill")
	public void SM_22(String username, String password) throws InterruptedException {
		methodName = "SM_22";
		objLoginPage.loginToManagerPage(username, password);
		objPMHomePage.clickSettingsLink();
		objSkillsPage.clickCreateBtn();
		
		Assert.assertTrue(objCreateSkillPage.getSkillNameBlankTbx().isDisplayed());
		Assert.assertTrue(objCreateSkillPage.getSkillDescriptionBlankTextarea().isDisplayed());
	}

	@Test(priority = 23, description = "Verify that the fields 'Name', ' Type' are required fields", groups = "Skill")
	public void SM_23() {
		methodName = "SM_23";
		objCreateSkillPage.inputSkillName("");
		objCreateSkillPage.inputSkillDomain("");
		objCreateSkillPage.clickSave();
		
		Assert.assertTrue(objCreateCategoryPage.getRequiredNotification("Name", "Skill Domain").isDisplayed());
	}

	@Test(priority = 24, description = "Verify that user can create a new skill", dataProvider = "createSkill", dataProviderClass = TestData.class, groups = "Skill")
	public void SM_24(String skillName, String skillDomain, String skillDescription) {
		methodName = "SM_24";
		objCreateSkillPage.inputSkillName(skillName);
		objCreateSkillPage.inputSkillDomain(skillDomain);
		objCreateSkillPage.inputSkillDescription(skillDescription);
		objCreateSkillPage.clickSave();
		
		Assert.assertTrue(objCreateSkillPage.getCreatedSkillName(skillName).equals(skillName));
		Assert.assertTrue(objCreateSkillPage.getCreatedSkillDomain(skillDomain).equals(skillDomain));
		Assert.assertTrue(objCreateSkillPage.getCreatedSkillDescription(skillDescription).equals(skillDescription));
	}
	
	@Test(priority = 25, description = "Verify that user can modifiy the information in a category", dataProvider = "editSkill", dataProviderClass = TestData.class, groups = "Skill")
	public void SM_25(String editedSkillName, String editedSkillDomain, String editedSkillDescription) {
		methodName = "SM_25";
		CommonMethods.waitUntil(objCreateSkillPage.getEditBtn());
		objCreateSkillPage.clickEditBtn();
		objCreateSkillPage.inputSkillName(editedSkillName);
		objCreateSkillPage.inputSkillDomain(editedSkillDomain);
		objCreateSkillPage.inputSkillDescription(editedSkillDescription);
		objCreateSkillPage.clickSave();
		
		Assert.assertTrue(objCreateSkillPage.getCreatedSkillName(editedSkillName).equals(editedSkillName));
		Assert.assertTrue(objCreateSkillPage.getCreatedSkillDomain(editedSkillDomain).equals(editedSkillDomain));
		Assert.assertTrue(objCreateSkillPage.getCreatedSkillDescription(editedSkillDescription).equals(editedSkillDescription));
	}

	@Test(priority = 26, description = "Verify that the system confirm before discarding edit a category", groups = "Skill")
	public void SM_26() {
		methodName = "SM_26";
		CommonMethods.waitUntil(objCreateSkillPage.getEditBtn());
		objCreateSkillPage.clickEditBtn();
		objCreateSkillPage.inputSkillName("Test123");
		objCreateSkillPage.clickDiscardBtn();
		
		Assert.assertTrue(CommonMethods.alertShouldBeCorrect("Warning, the record has been modified, your changes will be discarded.\n\nAre you sure you want to leave this page ?"));
	}

//	@Test(priority = 27, description = "Verify that user can postpone a request before discarding edit a skill")

	@Test(priority = 28, description = "Verify that user can discard to edit a skill", dataProvider = "editSkill", dataProviderClass = TestData.class, groups = "Skill")
	public void SM_28(String skillName, String skillDomain, String skillDescription) throws InterruptedException {
		methodName = "SM_28";
		objCreateSkillPage.clickDiscardBtn();
		objCreateSkillPage.acceptPopup();
		
		Assert.assertTrue(objCreateSkillPage.getCreatedSkillName(skillName).equals(skillName));
		Assert.assertTrue(objCreateSkillPage.getCreatedSkillDomain(skillDomain).equals(skillDomain));
		Assert.assertTrue(objCreateSkillPage.getCreatedSkillDescription(skillDescription).equals(skillDescription));
	}

	@AfterGroups(groups = "Skill")
	//Finish Skill group and Intitialize  group
	public void finishSkill() {
		objLogoutPage.logout();
	}

	@Test(priority = 29, description = "Verify that Employee List is displayed correctly", dataProvider = "projectManagerLogin", dataProviderClass = TestData.class, groups = "EmployeeSkill")
	public void SM_29(String username, String password) throws InterruptedException {
		methodName = "SM_29";
		objLoginPage.loginToManagerPage(username, password);
		objPMHomePage.clickHumanResourcesLink();
		
		CommonMethods.waitUntil(objEmployeeListPage.getEmployeesNameValues());
		Assert.assertTrue(objEmployeeListPage.shouldEachRowEachEmployee());
		Assert.assertTrue(objEmployeeListPage.getCheckAllCbx().isDisplayed());
		Assert.assertTrue(objEmployeeListPage.getNameHeader().isDisplayed());
		Assert.assertTrue(objEmployeeListPage.getWorkPhoneHeader().isDisplayed());
		Assert.assertTrue(objEmployeeListPage.getWorkEmailHeader().isDisplayed());
		Assert.assertTrue(objEmployeeListPage.getDepartmentHeader().isDisplayed());
		Assert.assertTrue(objEmployeeListPage.getJobHeader().isDisplayed());
		Assert.assertTrue(objEmployeeListPage.getParentManagerHeader().isDisplayed());
	}
	
	@Test(priority = 30, description = "Verify that the tab 'Skill Information' is displayed correctly", dataProvider = "selectedEmployee", dataProviderClass = TestData.class, groups = "EmployeeSkill")
	public void SM_30(String employeeName) {
		methodName = "SM_30";
		objEmployeeListPage.selectEmployee(employeeName);
		objEmployeeDetailPage.clickSkillInformationTab();
		
		Assert.assertTrue(objEmployeeDetailPage.skillSectionShouldBeDisplayed());
		Assert.assertTrue(objEmployeeDetailPage.certificateSectionShouldBeDisplayed());
		Assert.assertTrue(objEmployeeDetailPage.awardSectionShouldBeDisplayed());
	}
	
	@Test(priority = 31, description = "Verify that form 'Add skills' is displayed correctly", groups = "EmployeeSkill")
	public void SM_31() {
		methodName = "SM_31";
		objEmployeeDetailPage.clickAddSkill();
		
		Assert.assertTrue(objEmployeeDetailPage.getSkillDomainDdl().isDisplayed());
		Assert.assertTrue(objEmployeeDetailPage.getSkillEmployeeDdl().isDisplayed());
		Assert.assertTrue(objEmployeeDetailPage.getLastUsedTbx().isDisplayed());
		Assert.assertTrue(objEmployeeDetailPage.getCompetencyLevelDdl().isDisplayed());
	}
	
	@AfterMethod
    public void afterMethod(ITestResult testResult) throws Exception {
		CommonOperations.getMethodTestResult(testResult);
        CommonOperations.takePicture();
    }
}
